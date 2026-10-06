package p021j$.util.stream;

import java.util.function.DoubleConsumer;
import p021j$.util.function.C0551c;

/* JADX INFO: renamed from: j$.util.stream.H1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0594H1 implements DoubleConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33321a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
    }

    public final DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f33321a) {
            case 0:
                doubleConsumer.getClass();
                break;
            default:
                doubleConsumer.getClass();
                break;
        }
        return new C0551c(this, doubleConsumer);
    }
}
