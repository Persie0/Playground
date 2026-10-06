package p021j$.util.function;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.function.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0551c implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DoubleConsumer f33248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DoubleConsumer f33249b;

    public /* synthetic */ C0551c(DoubleConsumer doubleConsumer, DoubleConsumer doubleConsumer2) {
        this.f33248a = doubleConsumer;
        this.f33249b = doubleConsumer2;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f33248a.accept(d);
        this.f33249b.accept(d);
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0551c(this, doubleConsumer);
    }
}
