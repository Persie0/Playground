package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kgw implements kfj {

    /* JADX INFO: renamed from: a */
    public final Set f35989a;

    /* JADX INFO: renamed from: b */
    private final Map f35990b;

    /* JADX INFO: renamed from: c */
    private final Set f35991c;

    public kgw(Map map, Set set, Set set2) {
        this.f35990b = map;
        this.f35991c = set;
        this.f35989a = set2;
    }

    /* JADX INFO: renamed from: g */
    public static kgw m14226g(kgw kgwVar) {
        return new kgw(new HashMap(kgwVar.f35990b), new HashSet(kgwVar.f35991c), new HashSet(kgwVar.f35989a));
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: a */
    public final kgx mo14109a() {
        return new kgx(new HashSet(this.f35990b.values()), new HashSet(this.f35991c), new HashSet(this.f35989a));
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: b */
    public final void mo14110b(kho khoVar) {
        Iterator it = this.f35989a.iterator();
        while (it.hasNext()) {
            kho khoVar2 = (kho) it.next();
            if (!kot.m14643i(khoVar, khoVar2, null)) {
                Log.w("pck", "Removing " + String.valueOf(khoVar2) + " because it conflicts with " + String.valueOf(khoVar));
                it.remove();
            }
        }
        this.f35989a.add(khoVar);
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: c */
    public final void mo14111c() {
        this.f35989a.clear();
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: d */
    public final void mo14112d(CaptureRequest.Key key, Object obj) {
        this.f35990b.put(key, kgq.m14215e(key, obj));
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: e */
    public final void mo14113e(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            kfy kfyVar = (kfy) it.next();
            this.f35990b.put(kfyVar.f35858a, kfyVar);
        }
    }

    @Override // p000.kfj
    /* JADX INFO: renamed from: f */
    public final void mo14114f(kfv kfvVar) {
        this.f35991c.add(kfvVar);
    }
}
