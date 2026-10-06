package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyq implements dyl {

    /* JADX INFO: renamed from: a */
    public final dvn f12925a;

    /* JADX INFO: renamed from: b */
    public final jzk[] f12926b;

    /* JADX INFO: renamed from: c */
    private final Object f12927c;

    public dyq() {
        long jConvert = TimeUnit.SECONDS.convert(30000L, TimeUnit.MILLISECONDS) * 30;
        this.f12927c = new Object();
        int i = (int) jConvert;
        this.f12925a = new dvn(i);
        this.f12926b = new jzk[i];
    }

    @Override // p000.dyl
    /* JADX INFO: renamed from: a */
    public final jzk mo6934a(long j) {
        jzk jzkVar;
        synchronized (this.f12927c) {
            int iM6786g = this.f12925a.m6786g(j);
            jzkVar = iM6786g >= 0 ? this.f12926b[iM6786g] : null;
        }
        return jzkVar;
    }

    @Override // p000.dyl
    /* JADX INFO: renamed from: b */
    public final jzk mo6935b(long j) {
        synchronized (this.f12927c) {
            if (this.f12925a.m6784e() <= 0) {
                return null;
            }
            dvn dvnVar = this.f12925a;
            int iM6785f = dvnVar.m6785f(dvnVar.m6782c(j));
            dvn dvnVar2 = this.f12925a;
            int iM6785f2 = dvnVar2.m6785f(dvnVar2.m6783d(j));
            jzk jzkVar = iM6785f >= 0 ? this.f12926b[iM6785f] : null;
            jzk jzkVar2 = iM6785f2 >= 0 ? this.f12926b[iM6785f2] : null;
            if (jzkVar == null) {
                return jzkVar2;
            }
            if (jzkVar2 == null) {
                return jzkVar;
            }
            if (j - jzkVar.f35296a >= jzkVar2.f35296a - j) {
                jzkVar = jzkVar2;
            }
            return jzkVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m6937c(jzk jzkVar) {
        try {
            synchronized (this.f12927c) {
                this.f12926b[this.f12925a.m6781b(jzkVar.f35296a)] = jzkVar;
            }
        } catch (IllegalArgumentException e) {
        }
    }
}
