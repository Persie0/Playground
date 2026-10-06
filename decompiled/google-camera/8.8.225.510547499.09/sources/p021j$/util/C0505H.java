package p021j$.util;

import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.H */
/* JADX INFO: loaded from: classes3.dex */
final class C0505H implements IntConsumer {

    /* JADX INFO: renamed from: a */
    int f33128a;

    C0505H() {
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f33128a = i;
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }
}
