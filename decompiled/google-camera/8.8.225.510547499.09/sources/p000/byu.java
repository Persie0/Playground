package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class byu implements byz {

    /* JADX INFO: renamed from: a */
    private final Set f4787a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    private boolean f4788b;

    /* JADX INFO: renamed from: c */
    private boolean f4789c;

    @Override // p000.byz
    /* JADX INFO: renamed from: a */
    public final void mo3200a(bza bzaVar) {
        this.f4787a.add(bzaVar);
        if (this.f4789c) {
            bzaVar.mo2867g();
        } else if (this.f4788b) {
            bzaVar.mo2868h();
        } else {
            bzaVar.mo2869i();
        }
    }

    /* JADX INFO: renamed from: b */
    final void m3201b() {
        this.f4789c = true;
        Iterator it = cbi.m3385f(this.f4787a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2867g();
        }
    }

    /* JADX INFO: renamed from: c */
    final void m3202c() {
        this.f4788b = true;
        Iterator it = cbi.m3385f(this.f4787a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2868h();
        }
    }

    /* JADX INFO: renamed from: d */
    final void m3203d() {
        this.f4788b = false;
        Iterator it = cbi.m3385f(this.f4787a).iterator();
        while (it.hasNext()) {
            ((bza) it.next()).mo2869i();
        }
    }

    @Override // p000.byz
    /* JADX INFO: renamed from: e */
    public final void mo3204e(bza bzaVar) {
        this.f4787a.remove(bzaVar);
    }
}
