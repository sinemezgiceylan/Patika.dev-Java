public class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight)
                && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if(this.f1.health == 0) {
            System.out.println(this.f2.name + " is win!");
            return true;
        }
        if(this.f2.health == 0) {
            System.out.println(this.f1.name + " is win!");
            return true;
        }

        return false;
    }

    public boolean firstRound() {
        double randomNumber1 = Math.random() * 100;
        double randomNumber2 = Math.random() * 100;
        if (randomNumber1 * this.f1.round <  randomNumber2 * this.f2.round) {
            System.out.println(this.f1.name + " starts the round!");
            this.f2.health = this.f1.hit(this.f2);


        } else {
            System.out.println(this.f2.name + " starts the round");
            this.f1.health = this.f2.hit(this.f1);

        }
        return false;
    }

    public void run() {
        if(isCheck()) {
            firstRound();
            while (this.f1.health > 0 && this.f2.health > 0) {
                System.out.println("-------------------");
                this.f2.health = this.f1.hit(this.f2);
                if (isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                if (isWin()) {
                    break;
                }
                System.out.println(this.f1.name + " health: " + this.f1.health);
                System.out.println(this.f2.name + " health: " + this.f2.health);
            }
        } else {
            System.out.println("Athletes weights do not match");
        }
    }


}
