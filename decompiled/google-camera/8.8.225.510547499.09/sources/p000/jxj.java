package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jxj {

    /* JADX INFO: renamed from: a */
    public final jyx f35020a;

    /* JADX INFO: renamed from: b */
    public final Executor f35021b;

    /* JADX INFO: renamed from: f */
    public jyt f35025f;

    /* JADX INFO: renamed from: d */
    public final Object f35023d = new Object();

    /* JADX INFO: renamed from: c */
    public final ConcurrentLinkedQueue f35022c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e */
    public jxi f35024e = jxi.READY;

    public jxj(jyx jyxVar, Executor executor, mrm mrmVar) {
        this.f35025f = new jxf(this, 0);
        this.f35020a = jyxVar;
        this.f35021b = executor;
        if (mrmVar.mo16813g()) {
            this.f35025f = (jyt) mrmVar.mo16809c();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m13650a() {
        synchronized (this.f35023d) {
            lku.m15617L(this.f35024e == jxi.STARTED, "%s is expected but we get %s", jxi.STARTED, this.f35024e);
            this.f35024e = jxi.PAUSED;
            kxk.m14975U(this.f35020a.mo13748g(), new djq(this, 18), this.f35021b);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m13651b() {
        synchronized (this.f35023d) {
            boolean z = true;
            if (this.f35024e != jxi.STARTED && this.f35024e != jxi.PAUSED) {
                z = false;
            }
            lku.m15618M(z, "%s or %s is expected but we get %s", jxi.STARTED, jxi.PAUSED, this.f35024e);
            this.f35024e = jxi.f35018d;
            kxk.m14975U(this.f35020a.mo13752k(), new jwq(this, 3), this.f35021b);
        }
    }
}
