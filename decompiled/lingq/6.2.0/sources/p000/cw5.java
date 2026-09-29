package p000;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cw5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dw5 f34633b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Timer f34634c;

    public /* synthetic */ cw5(dw5 dw5Var, Timer timer, int i) {
        this.f34632a = i;
        this.f34633b = dw5Var;
        this.f34634c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34632a;
        Timer timer = this.f34634c;
        dw5 dw5Var = this.f34633b;
        switch (i) {
            case 0:
                C0021aj c0021ajM10698f = dw5Var.m10698f(timer);
                if (c0021ajM10698f != null) {
                    dw5Var.f36318b.add(c0021ajM10698f);
                }
                break;
            default:
                C0021aj c0021ajM10698f2 = dw5Var.m10698f(timer);
                if (c0021ajM10698f2 != null) {
                    dw5Var.f36318b.add(c0021ajM10698f2);
                }
                break;
        }
    }
}
