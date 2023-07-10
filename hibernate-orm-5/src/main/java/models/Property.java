package models;

public interface Property<T> {
    Long getId();

    String getName();

    T getValue();

    PropertyHolder getPropertyHolder();
}