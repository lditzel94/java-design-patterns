package org.patterns.creational;

public class BuilderPattern {
    private String name;
    private String description;
    private String date;

    public BuilderPattern( String name, String description, String date ) {
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

        Builder() {
        }

        public Builder name( String name ) {
            this.name = name;
            return this;
        }

        public Builder description( String description ) {
            this.description = description;
            return this;
        }

        public Builder date( String date ) {
            this.date = date;
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern( name, description, date );
        }
    }
}
