package p000;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bzo implements bza {

    /* JADX INFO: renamed from: a */
    public final Set f4825a = Collections.newSetFromMap(new WeakHashMap());

    @Override // p000.bza
    /* JADX INFO: renamed from: g */
    public final void mo2867g() {
        Iterator it = cbi.m3385f(this.f4825a).iterator();
        while (it.hasNext()) {
            ((cal) it.next()).mo2867g();
        }
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: h */
    public final void mo2868h() {
        Iterator it = cbi.m3385f(this.f4825a).iterator();
        while (it.hasNext()) {
            ((cal) it.next()).mo2868h();
        }
    }

    @Override // p000.bza
    /* JADX INFO: renamed from: i */
    public final void mo2869i() {
        Iterator it = cbi.m3385f(this.f4825a).iterator();
        while (it.hasNext()) {
            ((cal) it.next()).mo2869i();
        }
    }
}
