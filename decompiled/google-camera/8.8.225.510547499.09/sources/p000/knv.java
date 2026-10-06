package p000;

import java.util.ArrayList;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class knv implements kba {

    /* JADX INFO: renamed from: b */
    public final long f36654b;

    /* JADX INFO: renamed from: d */
    public long f36656d = 0;

    /* JADX INFO: renamed from: e */
    public boolean f36657e = false;

    /* JADX INFO: renamed from: a */
    public final Object f36653a = new Object();

    /* JADX INFO: renamed from: c */
    public final LinkedList f36655c = new LinkedList();

    public knv(long j) {
        this.f36654b = j;
    }

    /* JADX INFO: renamed from: f */
    private final knt m14603f(long j) {
        this.f36656d += j;
        mo14607d();
        return new knt(this, j);
    }

    /* JADX INFO: renamed from: a */
    public final knt m14604a(long j) {
        knt kntVarM14603f;
        lku.m15609D(j > 0 && j <= this.f36654b, "%s is an illegal block size (Must be > 0 and <= %s", j, this.f36654b);
        synchronized (this.f36653a) {
            kntVarM14603f = !this.f36657e ? m14603f(j) : null;
        }
        return kntVarM14603f;
    }

    /* JADX INFO: renamed from: b */
    public final knt m14605b(long j) {
        knt kntVarM14603f;
        lku.m15609D(j > 0 && j <= this.f36654b, "%s is an illegal block size (Must be > 0 and <= %s", j, this.f36654b);
        synchronized (this.f36653a) {
            kntVarM14603f = null;
            if (!this.f36657e && this.f36655c.isEmpty() && j > 0 && this.f36656d + j <= this.f36654b) {
                kntVarM14603f = m14603f(j);
            }
        }
        return kntVarM14603f;
    }

    /* JADX INFO: renamed from: c */
    public final nps m14606c(long j) {
        lku.m15609D(j > 0 && j <= this.f36654b, "%s is an illegal block size (Must be > 0 and <= %s", j, this.f36654b);
        synchronized (this.f36653a) {
            if (this.f36657e) {
                return kxk.m14964J(new kec());
            }
            if (this.f36655c.isEmpty() && this.f36656d + j <= this.f36654b) {
                return kxk.m14965K(m14603f(j));
            }
            knu knuVar = new knu(this, j);
            this.f36655c.add(knuVar);
            mo14607d();
            m14608e();
            return knuVar.f36650a;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f36653a) {
            if (this.f36657e) {
                return;
            }
            this.f36657e = true;
            arrayList.addAll(this.f36655c);
            this.f36655c.clear();
            mo14607d();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((knu) arrayList.get(i)).m14602a(null);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo14607d() {
    }

    /* JADX INFO: renamed from: e */
    public final void m14608e() {
        while (true) {
            synchronized (this.f36653a) {
                knu knuVar = (knu) this.f36655c.peekFirst();
                if (knuVar != null) {
                    knt kntVarM14603f = null;
                    if (this.f36657e) {
                        this.f36655c.removeFirst();
                    } else {
                        long j = this.f36656d;
                        long j2 = knuVar.f36651b;
                        if (j + j2 <= this.f36654b) {
                            kntVarM14603f = m14603f(j2);
                            this.f36655c.removeFirst();
                        } else {
                            knuVar = null;
                        }
                    }
                    if (knuVar == null) {
                        break;
                    } else {
                        knuVar.m14602a(kntVarM14603f);
                    }
                } else {
                    break;
                }
            }
        }
        synchronized (this.f36653a) {
            mo14607d();
        }
    }
}
