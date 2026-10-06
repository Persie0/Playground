package p021j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.G0 */
/* JADX INFO: loaded from: classes3.dex */
final class C0590G0 extends AbstractC0584E0 {

    /* JADX INFO: renamed from: h */
    final /* synthetic */ BinaryOperator f33314h;

    /* JADX INFO: renamed from: i */
    final /* synthetic */ BiConsumer f33315i;

    /* JADX INFO: renamed from: j */
    final /* synthetic */ Supplier f33316j;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Collector f33317k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0590G0(EnumC0714v1 enumC0714v1, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        super(enumC0714v1);
        this.f33314h = binaryOperator;
        this.f33315i = biConsumer;
        this.f33316j = supplier;
        this.f33317k = collector;
    }

    @Override // p021j$.util.stream.AbstractC0584E0, p021j$.util.stream.InterfaceC0641X1
    /* JADX INFO: renamed from: b */
    public final int mo12618b() {
        if (this.f33317k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC0711u1.f33500q;
        }
        return 0;
    }

    @Override // p021j$.util.stream.AbstractC0584E0
    /* JADX INFO: renamed from: p */
    public final InterfaceC0608M0 mo12637p() {
        return new C0593H0(this.f33316j, this.f33315i, this.f33314h);
    }
}
