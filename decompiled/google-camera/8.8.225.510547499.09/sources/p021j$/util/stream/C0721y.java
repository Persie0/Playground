package p021j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntUnaryOperator;
import p021j$.util.AbstractC0506I;

/* JADX INFO: renamed from: j$.util.stream.y */
/* JADX INFO: loaded from: classes3.dex */
final class C0721y extends AbstractC0506I {

    /* JADX INFO: renamed from: d */
    int f33527d;

    /* JADX INFO: renamed from: e */
    boolean f33528e;

    /* JADX INFO: renamed from: f */
    final /* synthetic */ IntUnaryOperator f33529f;

    /* JADX INFO: renamed from: g */
    final /* synthetic */ int f33530g;

    C0721y(IntUnaryOperator intUnaryOperator, int i) {
        this.f33529f = intUnaryOperator;
        this.f33530g = i;
    }

    @Override // p021j$.util.InterfaceC0498A
    public final /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        tryAdvance((IntConsumer) obj);
        return true;
    }

    @Override // p021j$.util.InterfaceC0728u
    public final boolean tryAdvance(IntConsumer intConsumer) {
        int iApplyAsInt;
        intConsumer.getClass();
        if (this.f33528e) {
            iApplyAsInt = this.f33529f.applyAsInt(this.f33527d);
        } else {
            this.f33528e = true;
            iApplyAsInt = this.f33530g;
        }
        this.f33527d = iApplyAsInt;
        intConsumer.accept(iApplyAsInt);
        return true;
    }
}
