package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class knx extends knv {

    /* JADX INFO: renamed from: f */
    public final jxa f36662f;

    /* JADX INFO: renamed from: g */
    public final jwx f36663g;

    /* JADX INFO: renamed from: h */
    private jwn f36664h;

    public knx(long j) {
        super(j);
        jwx jwxVar = new jwx();
        this.f36663g = jwxVar;
        this.f36662f = new jxa(0L, jwxVar);
    }

    @Override // p000.knv
    /* JADX INFO: renamed from: d */
    public final void mo14607d() {
        long j;
        jxa jxaVar = this.f36662f;
        synchronized (this.f36653a) {
            if (this.f36657e) {
                j = this.f36654b;
            } else if (this.f36655c.isEmpty()) {
                j = this.f36656d;
            } else {
                Iterator it = this.f36655c.iterator();
                long j2 = 0;
                while (it.hasNext()) {
                    j2 += ((knu) it.next()).f36651b;
                }
                j = j2 + this.f36656d;
            }
        }
        jxaVar.mo3415bf(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: f */
    public final synchronized jwn m14610f() {
        if (this.f36664h == null) {
            this.f36664h = jwr.m13640j(this.f36662f, new hgv(this, 14));
        }
        return this.f36664h;
    }
}
