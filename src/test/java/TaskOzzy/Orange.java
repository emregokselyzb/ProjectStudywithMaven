package TaskOzzy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

public class Orange {

    private int weight;
    private Color color;

    public Orange(int weight, Color color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange{" +
                "weight=" + weight +
                ", color=" + color +
                '}';
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
