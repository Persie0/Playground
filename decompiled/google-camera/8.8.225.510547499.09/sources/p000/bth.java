package p000;

import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
abstract class bth {

    /* JADX INFO: renamed from: a */
    private final Queue f4427a = cbi.m3386g(20);

    /* JADX INFO: renamed from: a */
    public abstract bts mo3039a();

    /* JADX INFO: renamed from: b */
    final bts m3040b() {
        bts btsVar = (bts) this.f4427a.poll();
        return btsVar == null ? mo3039a() : btsVar;
    }

    /* JADX INFO: renamed from: c */
    public final void m3041c(bts btsVar) {
        if (this.f4427a.size() < 20) {
            this.f4427a.offer(btsVar);
        }
    }
}
