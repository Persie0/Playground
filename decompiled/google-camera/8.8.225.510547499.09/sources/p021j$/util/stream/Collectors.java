package p021j$.util.stream;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import p021j$.util.StringJoiner;

/* JADX INFO: loaded from: classes3.dex */
public final class Collectors {

    /* JADX INFO: renamed from: a */
    static final Set f33294a;

    /* JADX INFO: renamed from: b */
    static final Set f33295b;

    /* JADX INFO: renamed from: c */
    static final Set f33296c;

    static {
        Collector.Characteristics characteristics = Collector.Characteristics.CONCURRENT;
        Collector.Characteristics characteristics2 = Collector.Characteristics.UNORDERED;
        Collector.Characteristics characteristics3 = Collector.Characteristics.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2, characteristics3));
        Collections.unmodifiableSet(EnumSet.of(characteristics, characteristics2));
        f33294a = Collections.unmodifiableSet(EnumSet.of(characteristics3));
        f33295b = Collections.unmodifiableSet(EnumSet.of(characteristics2, characteristics3));
        f33296c = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(characteristics2));
    }

    /* JADX INFO: renamed from: a */
    public static Collector m12617a() {
        return new C0670h(new C0652b(23), new C0652b(24), new C0652b(4), new C0652b(5), f33296c);
    }

    public static Collector<CharSequence, ?, String> joining(final CharSequence charSequence) {
        return new C0670h(new Supplier() { // from class: j$.util.stream.g

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ CharSequence f33417b = "";

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ CharSequence f33418c = "";

            @Override // java.util.function.Supplier
            public final Object get() {
                Set set = Collectors.f33294a;
                return new StringJoiner(charSequence, this.f33417b, this.f33418c);
            }
        }, new C0652b(20), new C0652b(21), new C0652b(22), f33296c);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0670h(supplier, new C0652b(17), new C0652b(2), f33294a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0670h(new C0652b(23), new C0652b(24), new C0652b(3), f33294a);
    }

    public static <T> Collector<T, ?, Set<T>> toSet() {
        return new C0670h(new C0652b(18), new C0652b(19), new C0652b(6), f33295b);
    }
}
