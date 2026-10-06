package p021j$.util.function;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.function.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0553e implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IntConsumer f33253a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ IntConsumer f33254b;

    public /* synthetic */ C0553e(IntConsumer intConsumer, IntConsumer intConsumer2) {
        this.f33253a = intConsumer;
        this.f33254b = intConsumer2;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.f33253a.accept(i);
        this.f33254b.accept(i);
    }

    public final IntConsumer andThen(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new C0553e(this, intConsumer);
    }
}
