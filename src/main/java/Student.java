import lombok.Builder;
import lombok.ToString;
import lombok.With;

@Builder
@With
public record Student(
        String id,
        String name,
        String subject
) {
}
