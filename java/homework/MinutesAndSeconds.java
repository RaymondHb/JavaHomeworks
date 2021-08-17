package homework;

import java.util.Objects;

public class MinutesAndSeconds {
    float theMinutes = 0;
    float theSeconds = 0;

    @Override
    public String toString() {
        return "MinutesAndSeconds{" +
                "theMinutes=" + theMinutes +
                ", theSeconds=" + theSeconds +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinutesAndSeconds that = (MinutesAndSeconds) o;
        return Float.compare(that.theMinutes, theMinutes) == 0 &&
                Float.compare(that.theSeconds, theSeconds) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(theMinutes, theSeconds);
    }

    public MinutesAndSeconds(float theMinutes, float theSeconds) {
        this.theMinutes = theMinutes;
        this.theSeconds = theSeconds;
    }
}
