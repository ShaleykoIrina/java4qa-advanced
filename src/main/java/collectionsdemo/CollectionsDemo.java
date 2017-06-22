package collectionsdemo;

import org.hamcrest.Matchers;

import java.util.*;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //region Sets
        /**
         * - No ordering: no sorting, no get(index).
         * - No elements duplication.
         */
        Set<Cat> set;

        //region HashSet
        /**
         * - Entry[] table ("buckets")
         * - size = number of entries, N
         * - capacity = table.length
         *
         * - Using hashCode() for "buckets": indexFor(hash(e.hashCode()))
         * - hash(e.hc()): limits collisions ≲ 8 with default loadFactor
         * - Using equals() within bucket
         *
         * - collision: table[x].length > 1
         * - Entry: LinkedList<E>
         *
         * - size rehashing threshold = capacity * loadFactor
         * Performance for add() corner case:
         * - s.add() x 1_000_000? Rehashing time = O(N ^ const) http://it-channel.ru/wp-content/uploads/2015/07/gLOb9z91.png
         * - new HashSet(initialCapacity) //not size!
         *
         * Performance for add(), remove(), get() corner cases:
         * - O(1) for no collisions - O(log(N)) - O(N)
         * - O(N)??? ORLY? Security bug! Rehashing doesn't count collisions _distribution_
         * - TREEIFY_THRESHOLD for rescue. (since 1.7?) Make HashSet -great again- a TreeSet!
         * - Rehashing and treefying can conflict.
         * - MIN_TREEIFY_CAPACITY for rescue
         *
         * Volume issue:
         * - after remove() table.length = const
         * - new HashSet(oldHashSet)
         *
         * https://habrahabr.ru/post/128017/
         * http://it-channel.ru/2015/07/23/questions-hashmap-1/
         */
        set = new HashSet<>();
        //endregion

        //region Mutability hell
        Cat murik = new Cat("Murik");
        Cat chineeseMurik = new Cat("Murik");

        assertThat(set.add(murik), is(true));
        assertThat(set, hasSize(1));
        assertThat(set, hasItem(murik));

        assertThat(set.add(chineeseMurik), is(false));
        assertThat(set, hasSize(1));
        assertThat(set, hasItem(murik));

        murik.setName("Super-Murik");
        assertThat(set.add(chineeseMurik), is(true));
        assertThat(set, hasSize(2));
        assertThat(set, hasItem(murik));
        assertThat(set, hasItem(chineeseMurik));

        murik.setName("Murik");
        assertThat(set, hasSize(2));
        assertThat(set, hasItem(murik));
        assertThat(set, hasItem(chineeseMurik));
        //endregion

        //region LinkedHashSet
        /**
         * Preserves order of addition with internal LinkedList
         */
        //endregion

        //region TreeSet
        assertThat(new TreeSet(), isA(SortedSet.class));
        assertThat(new TreeSet(), isA(NavigableSet.class));

        //region Ordering set up with comparator
        TreeSet<Cat> cats = new TreeSet<>(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        //TODO convert anonymous class to lambda
        //TODO convert lambda to utility Comparator method

        cats.add(new Cat("Murzik")); //Objects sorted ASC while adding
        cats.add(new Cat("Murik"));
        cats.add(new Cat("Murk"));
        assertThat(cats.first(), is(new Cat("Murk")));
        assertThat(cats.last(), is(new Cat("Murzik")));
        //endregion

        /**
         * Red-Black-Tree: kind of balanced binary tree
         * - height(tree) = log(N)
         * - add(), remove(), get() = O(log(N))
         *
         * https://people.ksp.sk/~kuko/gnarley-trees/
         */
        //endregion
        //endregion

    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        return name != null ? name.equals(cat.name) : cat.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
