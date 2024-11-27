package org.example.common;

import java.util.Objects;
import java.util.UUID;

public class ID<T> {
    private T value;

    public ID(T value) {
        this.value = value;
    }

    public static ID toDomain(UUID uuid) {
        return new ID(uuid);
    }

    public static ID toDomain(String uuid) {
        return new ID(uuid);
    }

    public static UUID fromDomain(ID id) {
        return UUID.fromString(id.value.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        ID<?> id = (ID<?>) o;
        return Objects.equals(value.toString(), id.value.toString());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
