package org.patterns.creational;

public class BuilderExample {
    private String name;
    private String description;
    private String date;

    public BuilderExample( String name, String description, String date ) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String description;
        private String date;

        public Builder() {
        }
    }
}
