package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class frq implements fha {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ frx f23344a;

    public frq(frx frxVar) {
        this.f23344a = frxVar;
    }

    @Override // p000.fha
    /* JADX INFO: renamed from: a */
    public final boolean mo8406a(mzj mzjVar) {
        if (this.f23344a.f23380d.isEmpty()) {
            return mzj.m17173c(Long.valueOf(this.f23344a.f23377a.m8535a() - 1500000000)).m17185n(mzjVar);
        }
        Iterator it = this.f23344a.f23380d.iterator();
        while (it.hasNext()) {
            if (((frt) it.next()).f23351c.m17185n(mzjVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.fha
    /* JADX INFO: renamed from: b */
    public final boolean mo8407b(mzj mzjVar) {
        Iterator it = this.f23344a.f23381e.iterator();
        while (it.hasNext()) {
            if (((frs) it.next()).mo8722c().m17185n(mzjVar)) {
                return true;
            }
        }
        return false;
    }
}
