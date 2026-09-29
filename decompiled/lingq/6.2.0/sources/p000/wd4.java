package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wd4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ yd4 f66645b;

    public /* synthetic */ wd4(yd4 yd4Var, int i) {
        this.f66644a = i;
        this.f66645b = yd4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f66644a;
        yd4 yd4Var = this.f66645b;
        switch (i) {
            case 0:
                synchronized (yd4Var.f69685e) {
                    try {
                        if (yd4Var.f69686f) {
                            synchronized (yd4Var.f69685e) {
                                try {
                                    Iterator it = yd4Var.f69684d.iterator();
                                    while (it.hasNext()) {
                                        ((mb2) it.next()).m16746g(yd4Var.f69681a);
                                    }
                                    Iterator it2 = yd4Var.f69682b.iterator();
                                    if (it2.hasNext()) {
                                        if (it2.next() != null) {
                                            throw new ClassCastException();
                                        }
                                        throw null;
                                    }
                                    Iterator it3 = yd4Var.f69683c.iterator();
                                    while (it3.hasNext()) {
                                        ((bd4) it3.next()).m3643m(yd4Var.f69681a);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            yd4Var.m25089j();
                            yd4Var.m25088i();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            default:
                synchronized (yd4Var.f69685e) {
                    try {
                        if (yd4Var.f69686f) {
                            yd4Var.m25089j();
                            yd4Var.m25088i();
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
        }
    }
}
