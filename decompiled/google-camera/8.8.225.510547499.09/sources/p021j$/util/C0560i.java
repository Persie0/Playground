package p021j$.util;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p021j$.util.function.C0551c;

/* JADX INFO: renamed from: j$.util.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0560i implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f33271a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.f33271a.accept(Double.valueOf(d));
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0551c(this, doubleConsumer);
    }
}
