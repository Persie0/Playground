package p021j$.util.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.f1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0666f1 extends AbstractC0625S0 {

    /* JADX INFO: renamed from: m */
    private final Comparator f33415m;

    C0666f1(AbstractC0655c abstractC0655c, Comparator comparator) {
        super(abstractC0655c, EnumC0711u1.f33499p | EnumC0711u1.f33498o);
        comparator.getClass();
        this.f33415m = comparator;
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: M */
    public final InterfaceC0613O mo12686M(Spliterator spliterator, AbstractC0655c abstractC0655c, IntFunction intFunction) {
        EnumC0711u1 enumC0711u1 = EnumC0711u1.SORTED;
        abstractC0655c.mo12665x();
        enumC0711u1.getClass();
        Object[] objArrMo12601n = abstractC0655c.m12689C(spliterator, true, intFunction).mo12601n(intFunction);
        Arrays.sort(objArrMo12601n, this.f33415m);
        return new C0624S(objArrMo12601n);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: P */
    public final InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0) {
        interfaceC0646Z0.getClass();
        EnumC0711u1.SORTED.m12740e(i);
        return EnumC0711u1.SIZED.m12740e(i) ? new C0672h1(interfaceC0646Z0, this.f33415m) : new C0669g1(interfaceC0646Z0, this.f33415m);
    }
}
