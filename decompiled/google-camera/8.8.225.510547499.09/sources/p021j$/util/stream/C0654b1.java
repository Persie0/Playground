package p021j$.util.stream;

import java.util.function.IntFunction;
import p021j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.b1 */
/* JADX INFO: loaded from: classes3.dex */
final class C0654b1 extends AbstractC0625S0 {

    /* JADX INFO: renamed from: m */
    final /* synthetic */ long f33380m = 0;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ long f33381n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0654b1(AbstractC0655c abstractC0655c, int i, long j) {
        super(abstractC0655c, i);
        this.f33381n = j;
    }

    /* JADX INFO: renamed from: U */
    static Spliterator m12685U(Spliterator spliterator, long j, long j2, long j3) {
        long j4;
        long jMin;
        if (j <= j3) {
            long j5 = j3 - j;
            jMin = j2 >= 0 ? Math.min(j2, j5) : j5;
            j4 = 0;
        } else {
            j4 = j;
            jMin = j2;
        }
        return new C0621Q1(spliterator, j4, jMin);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: M */
    final InterfaceC0613O mo12686M(Spliterator spliterator, AbstractC0655c abstractC0655c, IntFunction intFunction) {
        long jMo12664w = abstractC0655c.mo12664w(spliterator);
        if (jMo12664w <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !EnumC0711u1.ORDERED.m12740e(abstractC0655c.mo12665x()) ? AbstractC0584E0.m12629h(this, m12685U(abstractC0655c.m12696T(spliterator), this.f33380m, this.f33381n, jMo12664w), true, intFunction) : (InterfaceC0613O) new C0660d1(this, abstractC0655c, spliterator, intFunction, this.f33380m, this.f33381n).invoke();
        }
        return AbstractC0584E0.m12629h(abstractC0655c, AbstractC0586F.m12658t(abstractC0655c.m12692I(), spliterator, this.f33380m, this.f33381n), true, intFunction);
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: N */
    final Spliterator mo12687N(AbstractC0655c abstractC0655c, Spliterator spliterator) {
        long jMo12664w = abstractC0655c.mo12664w(spliterator);
        if (jMo12664w <= 0 || !spliterator.hasCharacteristics(16384)) {
            return !EnumC0711u1.ORDERED.m12740e(abstractC0655c.mo12665x()) ? m12685U(abstractC0655c.m12696T(spliterator), this.f33380m, this.f33381n, jMo12664w) : ((InterfaceC0613O) new C0660d1(this, abstractC0655c, spliterator, new C0652b(9), this.f33380m, this.f33381n).invoke()).spliterator();
        }
        Spliterator spliteratorM12696T = abstractC0655c.m12696T(spliterator);
        long j = this.f33380m;
        return new C0615O1(spliteratorM12696T, j, AbstractC0586F.m12657s(j, this.f33381n));
    }

    @Override // p021j$.util.stream.AbstractC0655c
    /* JADX INFO: renamed from: P */
    final InterfaceC0646Z0 mo12675P(int i, InterfaceC0646Z0 interfaceC0646Z0) {
        return new C0650a1(this, interfaceC0646Z0);
    }
}
