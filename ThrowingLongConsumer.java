
@FunctionalInterface
public interface ThrowingLongConsumer extends LongConsumer {

    void acceptThrows(long elem) throws Exception;

    @Override
    default void accept(final long elem) {
        try {
            acceptThrows(elem);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }
}
