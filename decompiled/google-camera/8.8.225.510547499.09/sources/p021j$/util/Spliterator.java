package p021j$.util;

import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public interface Spliterator<T> {

    /* JADX INFO: renamed from: j$.util.Spliterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T> {
        public static void $default$forEachRemaining(Spliterator spliterator, Consumer consumer) {
            while (spliterator.tryAdvance(consumer)) {
            }
        }

        public static Comparator $default$getComparator(Spliterator spliterator) {
            throw new IllegalStateException();
        }

        public static long $default$getExactSizeIfKnown(Spliterator spliterator) {
            if ((spliterator.characteristics() & 64) == 0) {
                return -1L;
            }
            return spliterator.estimateSize();
        }

        public static boolean $default$hasCharacteristics(Spliterator spliterator, int i) {
            return (spliterator.characteristics() & i) == i;
        }
    }

    int characteristics();

    long estimateSize();

    void forEachRemaining(Consumer consumer);

    Comparator getComparator();

    long getExactSizeIfKnown();

    boolean hasCharacteristics(int i);

    boolean tryAdvance(Consumer<? super T> consumer);

    Spliterator trySplit();
}
