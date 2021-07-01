package model.open;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author mawei
 * @date 12/3/20
 */
@AllArgsConstructor
@Data
public class MacComputer implements Computer {
    private double price;
    private String color;
    private int memory;
    private float size;


    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getMemory() {
        return this.memory;
    }

    @Override
    public float getSize() {
        return this.size;
    }
}
