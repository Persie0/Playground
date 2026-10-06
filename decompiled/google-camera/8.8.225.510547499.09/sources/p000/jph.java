package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jph implements jpq {

    /* JADX INFO: renamed from: a */
    public final Object f34550a;

    /* JADX INFO: renamed from: b */
    public final Object f34551b;

    /* JADX INFO: renamed from: c */
    private final Executor f34552c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ int f34553d;

    public jph(Executor executor, jpf jpfVar, jpt jptVar, int i) {
        this.f34553d = i;
        this.f34552c = executor;
        this.f34551b = jpfVar;
        this.f34550a = jptVar;
    }

    public jph(Executor executor, jpi jpiVar, int i) {
        this.f34553d = i;
        this.f34550a = new Object();
        this.f34552c = executor;
        this.f34551b = jpiVar;
    }

    public jph(Executor executor, jpj jpjVar, int i) {
        this.f34553d = i;
        this.f34550a = new Object();
        this.f34552c = executor;
        this.f34551b = jpjVar;
    }

    public jph(Executor executor, jpk jpkVar, int i) {
        this.f34553d = i;
        this.f34550a = new Object();
        this.f34552c = executor;
        this.f34551b = jpkVar;
    }

    public jph(Executor executor, jpl jplVar, int i) {
        this.f34553d = i;
        this.f34550a = new Object();
        this.f34552c = executor;
        this.f34551b = jplVar;
    }

    @Override // p000.jpq
    /* JADX INFO: renamed from: a */
    public final void mo13446a(jpp jppVar) {
        switch (this.f34553d) {
            case 0:
                if (((jpt) jppVar).f34565c) {
                    synchronized (this.f34550a) {
                        if (this.f34551b == null) {
                            return;
                        }
                        this.f34552c.execute(new ith(this, 18));
                        return;
                    }
                }
                return;
            case 1:
                this.f34552c.execute(new ipe(this, jppVar, 18, (byte[]) null));
                return;
            case 2:
                synchronized (this.f34550a) {
                    if (this.f34551b == null) {
                        return;
                    }
                    this.f34552c.execute(new ipe(this, jppVar, 19, (char[]) null));
                    return;
                }
            case 3:
                if (jppVar.mo13452e() || ((jpt) jppVar).f34565c) {
                    return;
                }
                synchronized (this.f34550a) {
                    if (this.f34551b == null) {
                        return;
                    }
                    this.f34552c.execute(new ipe(this, jppVar, 20, (short[]) null));
                    return;
                }
            default:
                if (jppVar.mo13452e()) {
                    synchronized (this.f34550a) {
                        if (this.f34551b == null) {
                            return;
                        }
                        this.f34552c.execute(new jpm(this, jppVar, 1, (byte[]) null));
                        return;
                    }
                }
                return;
        }
    }
}
