package p021j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.h */
/* JADX INFO: loaded from: classes3.dex */
final class C0670h implements Collector {

    /* JADX INFO: renamed from: a */
    private final Supplier f33420a;

    /* JADX INFO: renamed from: b */
    private final BiConsumer f33421b;

    /* JADX INFO: renamed from: c */
    private final BinaryOperator f33422c;

    /* JADX INFO: renamed from: d */
    private final Function f33423d;

    /* JADX INFO: renamed from: e */
    private final Set f33424e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    C0670h(Supplier supplier, C0652b c0652b, C0652b c0652b2, Set set) {
        this(supplier, c0652b, c0652b2, new C0652b(1), set);
        Set set2 = Collectors.f33294a;
    }

    @Override // p021j$.util.stream.Collector
    /* JADX INFO: renamed from: a */
    public final BiConsumer mo12612a() {
        return this.f33421b;
    }

    @Override // p021j$.util.stream.Collector
    /* JADX INFO: renamed from: b */
    public final BinaryOperator mo12613b() {
        return this.f33422c;
    }

    @Override // p021j$.util.stream.Collector
    /* JADX INFO: renamed from: c */
    public final Supplier mo12614c() {
        return this.f33420a;
    }

    @Override // p021j$.util.stream.Collector
    public final Set characteristics() {
        return this.f33424e;
    }

    @Override // p021j$.util.stream.Collector
    /* JADX INFO: renamed from: d */
    public final Function mo12615d() {
        return this.f33423d;
    }

    C0670h(Supplier supplier, BiConsumer biConsumer, BinaryOperator binaryOperator, Function function, Set set) {
        this.f33420a = supplier;
        this.f33421b = biConsumer;
        this.f33422c = binaryOperator;
        this.f33423d = function;
        this.f33424e = set;
    }
}
