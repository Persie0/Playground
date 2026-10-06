package p021j$.util.function;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.function.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0555g implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LongConsumer f33258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LongConsumer f33259b;

    public /* synthetic */ C0555g(LongConsumer longConsumer, LongConsumer longConsumer2) {
        this.f33258a = longConsumer;
        this.f33259b = longConsumer2;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f33258a.accept(j);
        this.f33259b.accept(j);
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }
}
