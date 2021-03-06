/**
 * Copyright (c) 2013, Redsolution LTD. All rights reserved.
 * <p>
 * This file is part of Xabber project; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License, Version 3.
 * <p>
 * Xabber is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License,
 * along with this program. If not, see http://www.gnu.org/licenses/.
 */
package com.xabber.android.data.entity;

import android.database.Cursor;

/**
 * Table with entity related information.
 *
 * @author alexander.ivanov
 */
public abstract class AbstractEntityTable extends AbstractAccountTable {

    public static String getUser(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(Fields.USER));
    }

    public interface Fields extends AbstractAccountTable.Fields {

        String USER = "user";

    }

}