package p000;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ep1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37655a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fp1 f37656b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Timer f37657c;

    public /* synthetic */ ep1(fp1 fp1Var, Timer timer, int i) {
        this.f37655a = i;
        this.f37656b = fp1Var;
        this.f37657c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f37655a;
        Timer timer = this.f37657c;
        fp1 fp1Var = this.f37656b;
        switch (i) {
            case 0:
                ip1 ip1VarM11985f = fp1Var.m11985f(timer);
                if (ip1VarM11985f != null) {
                    fp1Var.f39406a.add(ip1VarM11985f);
                }
                break;
            default:
                ip1 ip1VarM11985f2 = fp1Var.m11985f(timer);
                if (ip1VarM11985f2 != null) {
                    fp1Var.f39406a.add(ip1VarM11985f2);
                }
                break;
        }
    }
}
