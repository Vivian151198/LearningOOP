package lesson06Exercise;

public class Animal {

    private final int speed;
    private final boolean flyAble;

    Animal (Builder builder){
        this.speed = builder.speed;
        this.flyAble = builder.flyAble;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isFlyAble() {
        return flyAble;
    }

    //Inner class
    public static class Builder {
        private int speed;

        private boolean flyAble;

        Builder() {

        }

        public Builder speed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder flyAble(boolean flyAble) {
            this.flyAble = flyAble;
            return this;
        }

    }
}
