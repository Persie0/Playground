package p021j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes3.dex */
public interface Collector<T, A, R> {

    /* JADX INFO: renamed from: j$.util.stream.Collector$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T, A, R> {
        /* JADX INFO: renamed from: of */
        public static <T, A, R> Collector<T, A, R> m12616of(Supplier<A> supplier, BiConsumer<A, T> biConsumer, BinaryOperator<A> binaryOperator, Function<A, R> function, Characteristics... characteristicsArr) {
            supplier.getClass();
            biConsumer.getClass();
            binaryOperator.getClass();
            function.getClass();
            characteristicsArr.getClass();
            Set setUnmodifiableSet = Collectors.f33296c;
            if (characteristicsArr.length > 0) {
                EnumSet enumSetNoneOf = EnumSet.noneOf(Characteristics.class);
                Collections.addAll(enumSetNoneOf, characteristicsArr);
                setUnmodifiableSet = Collections.unmodifiableSet(enumSetNoneOf);
            }
            return new C0670h(supplier, biConsumer, binaryOperator, function, setUnmodifiableSet);
        }
    }

    public enum Characteristics {
        CONCURRENT,
        UNORDERED,
        IDENTITY_FINISH
    }

    /* JADX INFO: renamed from: a */
    BiConsumer mo12612a();

    /* JADX INFO: renamed from: b */
    BinaryOperator mo12613b();

    /* JADX INFO: renamed from: c */
    Supplier mo12614c();

    Set characteristics();

    /* JADX INFO: renamed from: d */
    Function mo12615d();
}
