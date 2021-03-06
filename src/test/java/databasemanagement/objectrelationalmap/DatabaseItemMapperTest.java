package databasemanagement.objectrelationalmap;

import model.DatabaseItem;

/**
 * @author  Kyle Williams
 * @since   Version 2
 *
 * @param <T> a {@link DatabaseItem}
 */
interface DatabaseItemMapperTest<T> {

    /**
     * Checks to see that param1 and param2 have the same
     * values in all fields except the ID field
     *
     * @param   t1 a {@link DatabaseItem}
     * @param   t2 a {@link DatabaseItem}
     * @return  true if param1 and param2 are considered to be equal. Otherwise, false is returned.
     */
    boolean objectsAreEqual(T t1, T t2);
}