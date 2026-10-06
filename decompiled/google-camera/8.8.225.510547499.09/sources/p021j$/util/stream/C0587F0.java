package p021j$.util.stream;

import java.util.function.LongBinaryOperator;
import p021j$.desugar.sun.nio.p023fs.C0300n;

/* JADX INFO: renamed from: j$.util.stream.F0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0587F0 extends AbstractC0584E0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ LongBinaryOperator f33311h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0587F0(EnumC0714v1 enumC0714v1, C0300n c0300n) {
        super(enumC0714v1);
        this.f33311h = c0300n;
    }

    @Override // p021j$.util.stream.AbstractC0584E0
    /* JADX INFO: renamed from: p */
    public final InterfaceC0608M0 mo12637p() {
        return new C0605L0(this.f33311h);
    }
}
