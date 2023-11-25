/*
 * This file is part of Craftconomy3.
 *
 * Copyright (c) 2011-2016, Greatman <http://github.com/greatman/>
 * Copyright (c) 2016-2017, Aztorius <http://github.com/Aztorius/>
 * Copyright (c) 2018-2019, Pavog <http://github.com/pavog/>
 *
 * Craftconomy3 is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Craftconomy3 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Craftconomy3. If not, see <http://www.gnu.org/licenses/>.
 */
package com.greatmancode.craftconomy3.tools.commands;


import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.UUID;

public class ConsoleCommandSender<T> implements CommandSender<T> {

    @NonNull
    private final String name;
    private final UUID uuid = UUID.fromString("ffffffff-ffff-ffff-fff1-ffffffff");
    @NonNull
    private T sender;

    public ConsoleCommandSender(@NonNull final String name, @NonNull final T sender) {
        this.name = name;
        this.sender = sender;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public T getServerSender() {
        return sender;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    @NonNull
    public T getSender() {
        return this.sender;
    }

    public void setSender(@NonNull final T sender) {
        this.sender = sender;
    }
}
