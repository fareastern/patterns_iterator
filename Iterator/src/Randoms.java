import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            // Всегда возвращает true, так как последовательность чисел бесконечна
            @Override
            public boolean hasNext() {
                return true;
            }

            // Возвращаем следующее случайное число в заданном диапазоне
            @Override
            public Integer next() {
                return random.nextInt(max - min + 1) + min; // +1, так как у нас должно быть 11 чисел от 90 (включительно) до 100
            }
        };
    }
}