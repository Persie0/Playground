package p000;

import android.animation.ValueAnimator;
import android.util.ArraySet;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class htb {

    /* JADX INFO: renamed from: a */
    public final Object f29485a;

    /* JADX INFO: renamed from: b */
    public Object f29486b;

    /* JADX INFO: renamed from: c */
    public Object f29487c;

    /* JADX INFO: renamed from: d */
    public Object f29488d;

    public htb(byte[] bArr) {
        this.f29485a = new ArraySet();
    }

    /* JADX INFO: renamed from: a */
    public final void m10723a(htd htdVar) {
        synchronized (this.f29485a) {
            this.f29488d = htdVar;
            if (((htd) this.f29487c).equals(htdVar)) {
                return;
            }
            ((ValueAnimator) this.f29486b).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kmd] */
    /* JADX INFO: renamed from: b */
    public final synchronized kba m10724b(hco hcoVar) {
        this.f29485a.add(hcoVar);
        ?? r0 = this.f29486b;
        if (r0 != 0) {
            hcoVar.mo10113e(r0);
        }
        return new gto(this, hcoVar, 4, null);
    }

    /* JADX INFO: renamed from: c */
    public final synchronized mrm m10725c() {
        return (mrm) this.f29488d;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized mrm m10726d() {
        return (mrm) this.f29487c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: e */
    public final synchronized void m10727e(kmd kmdVar) {
        this.f29486b = kmdVar;
        Iterator it = this.f29485a.iterator();
        while (it.hasNext()) {
            ((hco) it.next()).mo10113e(kmdVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: f */
    public final synchronized void m10728f(kpp kppVar) {
        Iterator it = this.f29485a.iterator();
        while (it.hasNext()) {
            ((hco) it.next()).mo10114f(kppVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m10729g(mrm mrmVar) {
        this.f29488d = mrmVar;
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m10730h(mrm mrmVar) {
        this.f29487c = mrmVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    /* JADX INFO: renamed from: i */
    public final synchronized void m10731i(kiq kiqVar, kgg kggVar) {
        Iterator it = this.f29485a.iterator();
        while (it.hasNext()) {
            ((hco) it.next()).mo10115g(kiqVar, kggVar);
        }
    }

    public htb() {
        this.f29487c = htd.HIDDEN;
        this.f29488d = htd.HIDDEN;
        this.f29485a = new Object();
    }
}
