package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkk {

    /* JADX INFO: renamed from: c */
    public final kbo f36372c;

    /* JADX INFO: renamed from: d */
    public kjo f36373d;

    /* JADX INFO: renamed from: e */
    private final kkz f36374e;

    /* JADX INFO: renamed from: f */
    private final Set f36375f;

    /* JADX INFO: renamed from: g */
    private final Map f36376g;

    /* JADX INFO: renamed from: h */
    private final Map f36377h;

    /* JADX INFO: renamed from: i */
    private final kbz f36378i;

    /* JADX INFO: renamed from: j */
    private boolean f36379j = false;

    /* JADX INFO: renamed from: b */
    public final List f36371b = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final Set f36370a = new HashSet();

    public kkk(kkz kkzVar, jvb jvbVar, Executor executor, kbo kboVar, kbz kbzVar) {
        this.f36374e = kkzVar;
        this.f36378i = kbzVar;
        this.f36375f = new HashSet(kkzVar.f36448a.size());
        this.f36376g = new HashMap(kkzVar.f36448a.size());
        this.f36377h = new HashMap(kkzVar.f36448a.size());
        this.f36372c = kboVar.mo6314a("SurfaceMap");
        for (kkr kkrVar : kkzVar.f36450c) {
            jvbVar.m13537d(kkrVar.f36403a.mo3830a(new kkj(this, kkrVar, 0), executor));
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m14432a(kjo kjoVar, Collection collection) {
        synchronized (this) {
            boolean zAddAll = false;
            lku.m15659m(this.f36373d != null, "setActiveCaptureSession must be invoked first.", new Object[0]);
            if (kjoVar != this.f36373d) {
                return;
            }
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zAddAll |= this.f36370a.addAll(((kpr) it.next()).mo14526a());
            }
            if (zAddAll) {
                m14434c();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m14433b(Runnable runnable) {
        synchronized (this.f36371b) {
            this.f36371b.add(runnable);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m14434c() {
        this.f36378i.mo13961e("SurfaceMap#invokeCallbacks");
        int i = mws.f41739d;
        List arrayList = mzr.f41857a;
        synchronized (this.f36371b) {
            if (!this.f36371b.isEmpty()) {
                arrayList = new ArrayList(this.f36371b);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f36378i.mo13962f();
    }

    /* JADX INFO: renamed from: d */
    public final void m14435d(kjo kjoVar) {
        boolean z;
        synchronized (this) {
            kjo kjoVar2 = this.f36373d;
            z = false;
            if (kjoVar2 == null || kjoVar2 != kjoVar) {
                this.f36370a.clear();
                this.f36373d = kjoVar;
                this.f36379j = false;
                z = true;
            }
        }
        if (z) {
            m14436e();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14436e() {
        boolean z;
        boolean z2;
        Surface surface;
        synchronized (this) {
            z = false;
            for (kky kkyVar : this.f36374e.f36448a) {
                Surface surfaceMo14452g = kkyVar.mo14452g();
                if (surfaceMo14452g == null || !surfaceMo14452g.isValid()) {
                    if (this.f36376g.containsKey(kkyVar) && (surface = (Surface) this.f36376g.get(kkyVar)) != surfaceMo14452g) {
                        this.f36375f.remove(surface);
                        this.f36376g.remove(kkyVar);
                        this.f36377h.put(kkyVar, surface);
                        z = true;
                    }
                } else if (this.f36376g.containsKey(kkyVar)) {
                    Surface surface2 = (Surface) this.f36376g.get(kkyVar);
                    if (surface2 != surfaceMo14452g) {
                        this.f36379j = true;
                        this.f36375f.remove(surface2);
                        this.f36375f.add(surfaceMo14452g);
                        this.f36376g.put(kkyVar, surfaceMo14452g);
                    }
                } else {
                    this.f36375f.add(surfaceMo14452g);
                    this.f36376g.put(kkyVar, surfaceMo14452g);
                    Surface surface3 = (Surface) this.f36377h.remove(kkyVar);
                    if (surface3 != surfaceMo14452g && surface3 != null) {
                        this.f36379j = true;
                    }
                    z = true;
                }
            }
            z2 = this.f36379j;
        }
        if (z2 || z) {
            m14434c();
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized boolean m14437f(Surface surface) {
        boolean zContains = this.f36375f.contains(surface);
        boolean zContains2 = this.f36370a.contains(surface);
        if (zContains && !zContains2) {
            this.f36372c.mo13947i(String.valueOf(surface) + " is valid but deferred streams are not yet available for " + String.valueOf(this.f36373d));
        }
        return zContains && zContains2;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m14438g() {
        return this.f36379j;
    }
}
