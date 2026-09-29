package p235l5;

import androidx.work.WorkerParameters;
import p041c5.C1699a0;
import p041c5.C1722t;

/* JADX INFO: renamed from: l5.r */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7271r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final C1699a0 f40766a;

    /* JADX INFO: renamed from: b */
    public final C1722t f40767b;

    /* JADX INFO: renamed from: c */
    public final WorkerParameters.C1242a f40768c;

    public RunnableC7271r(C1699a0 c1699a0, C1722t c1722t, WorkerParameters.C1242a c1242a) {
        this.f40766a = c1699a0;
        this.f40767b = c1722t;
        this.f40768c = c1242a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40766a.f9480f.m5458g(this.f40767b, this.f40768c);
    }
}
