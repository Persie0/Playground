package p021j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.I0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0596I0 extends AbstractC0584E0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ BiConsumer f33322h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ BiConsumer f33323i;

    /* JADX INFO: renamed from: j */
    final /* synthetic */ Supplier f33324j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0596I0(EnumC0714v1 enumC0714v1, C0652b c0652b, C0652b c0652b2, C0652b c0652b3) {
        super(enumC0714v1);
        this.f33322h = c0652b;
        this.f33323i = c0652b2;
        this.f33324j = c0652b3;
    }

    @Override // p021j$.util.stream.AbstractC0584E0
    /* JADX INFO: renamed from: p */
    public final InterfaceC0608M0 mo12637p() {
        return new C0599J0(this.f33324j, this.f33323i, this.f33322h);
    }
}
