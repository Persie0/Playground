package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oxk extends oqo implements Runnable, oqy {

    /* JADX INFO: renamed from: c */
    private final oqo f46775c;

    /* JADX INFO: renamed from: d */
    private final int f46776d;
    private volatile int runningWorkers;

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ oqy f46777e = oqx.f46437a;

    /* JADX INFO: renamed from: g */
    private final liv f46779g = new liv((byte[]) null);

    /* JADX INFO: renamed from: f */
    private final Object f46778f = new Object();

    public oxk(oqo oqoVar, int i) {
        this.f46775c = oqoVar;
        this.f46776d = i;
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: a */
    public final void mo18944a(opx opxVar) {
        this.f46777e.mo18944a(opxVar);
    }

    @Override // p000.oqo
    /* JADX INFO: renamed from: d */
    public final void mo18915d(oly olyVar, Runnable runnable) {
        olyVar.getClass();
        this.f46779g.m15485h(runnable);
        if (this.runningWorkers >= this.f46776d) {
            return;
        }
        synchronized (this.f46778f) {
            if (this.runningWorkers >= this.f46776d) {
                return;
            }
            this.runningWorkers++;
            this.f46775c.mo18915d(this, this);
        }
    }

    @Override // p000.oqy
    /* JADX INFO: renamed from: f */
    public final orf mo18940f(long j, Runnable runnable, oly olyVar) {
        olyVar.getClass();
        return this.f46777e.mo18940f(j, runnable, olyVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        while (true) {
            Runnable runnable = (Runnable) this.f46779g.m15483f();
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    oqv.m18928i(olz.f46282a, th);
                }
                i++;
                if (i >= 16) {
                    this.f46775c.mo18916e(this);
                    this.f46775c.mo18915d(this, this);
                    return;
                }
            } else {
                synchronized (this.f46778f) {
                    this.runningWorkers--;
                    if (this.f46779g.m15482e() == 0) {
                        return;
                    } else {
                        this.runningWorkers++;
                    }
                }
                i = 0;
            }
        }
    }
}
