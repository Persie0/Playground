package p000;

import java.util.function.Consumer;
import p021j$.util.function.Consumer$CC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hhf implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f27801a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f27802b;

    public /* synthetic */ hhf(boolean z, int i) {
        this.f27802b = i;
        this.f27801a = z;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f27802b) {
            case 0:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f27802b) {
            case 0:
                ((hhe) obj).setEnabled(this.f27801a);
                break;
            default:
                boolean z = this.f27801a;
                fbp fbpVar = (fbp) obj;
                int i = fan.f21134e;
                if (fbpVar instanceof fae) {
                    ((fae) fbpVar).mo7779B(z);
                }
                break;
        }
    }
}
