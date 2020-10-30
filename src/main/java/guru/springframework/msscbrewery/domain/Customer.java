package guru.springframework.msscbrewery.domain;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Customer {
    private UUID id;
    private String name;
}
