package p021j$.util.stream;

import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import p021j$.util.Spliterator;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: renamed from: j$.util.stream.a */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0648a implements Supplier, LongFunction, Consumer, BooleanSupplier {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33371a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33372b;

    public /* synthetic */ C0648a(int i, Object obj) {
        this.f33371a = i;
        this.f33372b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f33371a;
        Object obj2 = this.f33372b;
        switch (i) {
            case 3:
                ((InterfaceC0646Z0) obj2).accept(obj);
                break;
            default:
                ((List) obj2).add(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f33371a) {
            case 3:
                break;
            default:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public final Object apply(long j) {
        IntFunction intFunction = (IntFunction) this.f33372b;
        int i = C0630U.f33358k;
        return AbstractC0584E0.m12628g(j, intFunction);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.f33371a;
        Object obj = this.f33372b;
        switch (i) {
            case 0:
                return (Spliterator) obj;
            default:
                return ((AbstractC0655c) obj).m12694K();
        }
    }

    @Override // java.util.function.BooleanSupplier
    public final boolean getAsBoolean() {
        int i = this.f33371a;
        Object obj = this.f33372b;
        switch (i) {
            case 4:
                C0585E1 c0585e1 = (C0585E1) obj;
                return c0585e1.f33518d.tryAdvance(c0585e1.f33519e);
            case 5:
                C0591G1 c0591g1 = (C0591G1) obj;
                return c0591g1.f33518d.tryAdvance(c0591g1.f33519e);
            default:
                C0632U1 c0632u1 = (C0632U1) obj;
                return c0632u1.f33518d.tryAdvance(c0632u1.f33519e);
        }
    }
}
