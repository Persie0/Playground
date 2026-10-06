package p021j$.util;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p021j$.util.function.C0553e;

/* JADX INFO: renamed from: j$.util.k */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0562k implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f33272a;

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f33272a.accept(Integer.valueOf(i));
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }
}
