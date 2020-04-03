package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieCounterDto implements Serializable {
    private Long counter;

    public MovieCounterDto() {
        counter = 0L;
    }

    public Long getCounter() {
        return counter;
    }

    public MovieCounterDto(Long counter) {
        this.counter = counter;
    }

    // TODO: W razie potrzeby prosze dokonczyc implementacje...
}
