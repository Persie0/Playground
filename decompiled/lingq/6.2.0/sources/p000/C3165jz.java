package p000;

import android.os.Handler;

/* JADX INFO: renamed from: jz */
/* JADX INFO: loaded from: classes.dex */
public final class C3165jz {

    /* JADX INFO: renamed from: a */
    public final Handler f46413a;

    /* JADX INFO: renamed from: b */
    public final ew2 f46414b;

    public C3165jz(Handler handler, ew2 ew2Var, int i) {
        switch (i) {
            case 1:
                if (ew2Var != null) {
                    handler.getClass();
                } else {
                    handler = null;
                }
                this.f46413a = handler;
                this.f46414b = ew2Var;
                break;
            default:
                this.f46413a = handler;
                this.f46414b = ew2Var;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m14751a(l32 l32Var) {
        synchronized (l32Var) {
        }
        Handler handler = this.f46413a;
        if (handler != null) {
            handler.post(new RunnableC2945dz(this, l32Var, 0));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m14752b(lsa lsaVar) {
        Handler handler = this.f46413a;
        if (handler != null) {
            handler.post(new mv5(14, this, lsaVar));
        }
    }
}
