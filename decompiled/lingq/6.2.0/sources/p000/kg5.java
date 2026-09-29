package p000;

import androidx.concurrent.futures.C0464b;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class kg5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicBoolean f47171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0464b f47172c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f47173d;

    public /* synthetic */ kg5(AtomicBoolean atomicBoolean, C0464b c0464b, ui3 ui3Var, int i) {
        this.f47170a = i;
        this.f47171b = atomicBoolean;
        this.f47172c = c0464b;
        this.f47173d = ui3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f47170a;
        ui3 ui3Var = this.f47173d;
        C0464b c0464b = this.f47172c;
        AtomicBoolean atomicBoolean = this.f47171b;
        switch (i) {
            case 0:
                if (!atomicBoolean.get()) {
                    try {
                        c0464b.m1908a(ui3Var.mo0a());
                    } catch (Throwable th) {
                        c0464b.m1909b(th);
                        return;
                    }
                    break;
                }
                break;
            default:
                if (!atomicBoolean.get()) {
                    try {
                        c0464b.m1908a(ui3Var.mo0a());
                    } catch (Throwable th2) {
                        c0464b.m1909b(th2);
                    }
                    break;
                }
                break;
        }
    }
}
