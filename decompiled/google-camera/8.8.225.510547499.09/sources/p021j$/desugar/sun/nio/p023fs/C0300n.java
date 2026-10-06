package p021j$.desugar.sun.nio.p023fs;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.LongBinaryOperator;
import java.util.function.Predicate;
import p021j$.util.function.Consumer$CC;
import p021j$.util.function.Function$CC;
import p021j$.util.function.Predicate$CC;

/* JADX INFO: renamed from: j$.desugar.sun.nio.fs.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0300n implements Predicate, Function, LongBinaryOperator, Consumer {
    @Override // java.util.function.Consumer
    public void accept(Object obj) {
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return obj;
    }

    public long applyAsLong(long j, long j2) {
        return Math.max(j, j2);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    /* JADX INFO: renamed from: or */
    public /* synthetic */ Predicate m12026or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((String) obj).isEmpty();
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }
}
