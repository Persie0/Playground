package p021j$.util.stream;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import p021j$.util.Optional;

/* JADX INFO: loaded from: classes3.dex */
public interface Stream<T> extends BaseStream<T, Stream<T>> {

    /* JADX INFO: renamed from: j$.util.stream.Stream$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static <T> Stream<T> concat(Stream<? extends T> stream, Stream<? extends T> stream2) {
            stream.getClass();
            stream2.getClass();
            return StreamSupport.stream(new C0638W1(stream.spliterator(), stream2.spliterator()), stream.mo12606a() || stream2.mo12606a()).onClose(new RunnableC0635V1(1, stream, stream2));
        }
    }

    boolean allMatch(Predicate<? super T> predicate);

    boolean anyMatch(Predicate<? super T> predicate);

    <R, A> R collect(Collector<? super T, A, R> collector);

    long count();

    Stream<T> distinct();

    Stream<T> filter(Predicate<? super T> predicate);

    Optional<T> findFirst();

    void forEach(Consumer<? super T> consumer);

    void forEachOrdered(Consumer<? super T> consumer);

    Stream<T> limit(long j);

    <R> Stream<R> map(Function<? super T, ? extends R> function);

    LongStream mapToLong(ToLongFunction<? super T> toLongFunction);

    boolean noneMatch(Predicate<? super T> predicate);

    Stream<T> sorted(Comparator<? super T> comparator);

    <A> A[] toArray(IntFunction<A[]> intFunction);
}
