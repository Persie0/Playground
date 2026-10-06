package p000;

import android.hardware.camera2.CameraAccessException;
import androidx.wear.ambient.AmbientDelegate;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kil {

    /* JADX INFO: renamed from: a */
    private final kfn f36176a;

    /* JADX INFO: renamed from: b */
    private final khu f36177b;

    /* JADX INFO: renamed from: c */
    private final kiv f36178c;

    /* JADX INFO: renamed from: d */
    private final Set f36179d;

    /* JADX INFO: renamed from: e */
    private final mxk f36180e;

    /* JADX INFO: renamed from: f */
    private final Set f36181f;

    /* JADX INFO: renamed from: g */
    private final kfv f36182g;

    /* JADX INFO: renamed from: h */
    private final AmbientDelegate f36183h;

    /* JADX INFO: renamed from: i */
    private final ktz f36184i;

    public kil(kfn kfnVar, khu khuVar, ktz ktzVar, AmbientDelegate ambientDelegate, kgt kgtVar, kfv kfvVar, kiv kivVar, AmbientDelegate ambientDelegate2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f36176a = kfnVar;
        this.f36177b = khuVar;
        this.f36184i = ktzVar;
        this.f36178c = kivVar;
        this.f36183h = ambientDelegate2;
        mxi mxiVar = new mxi();
        synchronized (kgtVar) {
            Iterator it = kgtVar.f35965a.iterator();
            while (it.hasNext()) {
                mxiVar.mo17072d(((kgs) it.next()).f35958h);
            }
        }
        this.f36179d = mxiVar.mo17127f();
        this.f36180e = ambientDelegate.m1581L();
        this.f36182g = kfvVar;
        this.f36181f = new HashSet();
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, oju] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, oju] */
    /* JADX INFO: renamed from: i */
    private final kiz m14342i(kgb kgbVar, Set set, Set set2, Set set3, Set set4) throws IllegalAccessException, InvocationTargetException {
        Iterator it = set4.iterator();
        while (it.hasNext()) {
            lku.m15669w(set3.contains(((khq) it.next()).f36079c));
        }
        mxi mxiVar = new mxi();
        Iterator it2 = set3.iterator();
        while (it2.hasNext()) {
            mxiVar.m17129h(((kho) it2.next()).f36067c);
        }
        HashMap map = new HashMap();
        naz nazVarListIterator = this.f36176a.f35844h.listIterator();
        while (nazVarListIterator.hasNext()) {
            kfy kfyVar = (kfy) nazVarListIterator.next();
            map.put(kfyVar.f35858a, kfyVar);
        }
        Iterator it3 = set3.iterator();
        while (it3.hasNext()) {
            for (kfy kfyVar2 : ((kho) it3.next()).f36068d) {
                if (map.containsKey(kfyVar2.f35858a)) {
                    kfy kfyVar3 = (kfy) map.get(kfyVar2.f35858a);
                    kfyVar3.getClass();
                    if (!kfyVar2.equals(kfyVar3)) {
                        throw new IllegalStateException("Conflicting parameter value for " + kfyVar2.f35858a.toString() + ": " + kfyVar2.f35859b.toString() + " and " + kfyVar3.f35859b.toString() + " do not match.");
                    }
                } else {
                    map.put(kfyVar2.f35858a, kfyVar2);
                }
            }
        }
        Iterator it4 = set.iterator();
        while (it4.hasNext()) {
            kfy kfyVar4 = (kfy) it4.next();
            if (!map.containsKey(kfyVar4.f35858a)) {
                map.put(kfyVar4.f35858a, kfyVar4);
            }
        }
        mws mwsVar = kgbVar.f35864b;
        int size = mwsVar.size();
        for (int i = 0; i < size; i++) {
            kfy kfyVar5 = (kfy) mwsVar.get(i);
            if (!map.containsKey(kfyVar5.f35858a)) {
                map.put(kfyVar5.f35858a, kfyVar5);
            }
        }
        AmbientDelegate ambientDelegate = this.f36183h;
        kba kbaVarM1576E = ambientDelegate.m1576E();
        try {
            Set<kfy> setM1569J = AmbientDelegate.m1569J((kis) ambientDelegate.f1685a);
            kbaVarM1576E.close();
            for (kfy kfyVar6 : setM1569J) {
                if (!map.containsKey(kfyVar6.f35858a)) {
                    map.put(kfyVar6.f35858a, kfyVar6);
                }
            }
            mxi mxiVar2 = new mxi();
            mxiVar2.m17129h(set2);
            ktz ktzVar = this.f36184i;
            djm djmVar = (djm) ktzVar.f37201d.get();
            djmVar.getClass();
            kgt kgtVar = (kgt) ktzVar.f37198a.get();
            kgtVar.getClass();
            khu khuVar = (khu) ktzVar.f37200c.get();
            khuVar.getClass();
            mxk mxkVar = (mxk) ktzVar.f37199b.get();
            mxkVar.getClass();
            set4.getClass();
            mxiVar2.mo17072d(new kgu(djmVar, kgtVar, khuVar, mxkVar, set3, set4, null));
            mxiVar2.mo17072d(this.f36177b);
            return new kiz(kgbVar.f35863a, mxk.m17134F(map.values()), mxiVar2.mo17127f(), mxiVar.mo17127f());
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    private final kiz m14343j(Set set, Set set2, Set set3, Set set4) {
        return m14342i(m14347n(set3) ? this.f36176a.f35842f : this.f36176a.f35841e, set, set2, set3, set4);
    }

    /* JADX INFO: renamed from: k */
    private final synchronized void m14344k() {
        Iterator it = this.f36181f.iterator();
        while (it.hasNext()) {
            khq khqVar = (khq) it.next();
            if (khqVar.m14287k()) {
                it.remove();
                khqVar.m14283g();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private final synchronized void m14345l() {
        m14344k();
        for (khq khqVar : this.f36181f) {
            khqVar.m14282f();
            khqVar.m14283g();
        }
        this.f36181f.clear();
    }

    /* JADX INFO: renamed from: m */
    private final synchronized void m14346m(Set set) {
        m14344k();
        this.f36181f.addAll(set);
    }

    /* JADX INFO: renamed from: n */
    private static final boolean m14347n(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((kho) it.next()).f36067c.iterator();
            while (it2.hasNext()) {
                if (((kgg) it2.next()).mo14195e()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized kgw m14348a() {
        kgw kgwVar;
        mzx mzxVar = mzx.f41874a;
        kgwVar = new kgw(new HashMap(), new HashSet(mzxVar), new HashSet(mzxVar));
        kgwVar.f35989a.addAll(this.f36179d);
        kgwVar.mo14113e(this.f36180e);
        kgwVar.mo14114f(this.f36182g);
        return kgwVar;
    }

    /* JADX INFO: renamed from: b */
    public final kiz m14349b(Set set, Set set2, Set set3, Set set4) {
        return m14342i(m14347n(set3) ? this.f36176a.f35840d : this.f36176a.f35839c, set, set2, set3, set4);
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m14351d() {
        this.f36178c.mo14368c();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m14352e(List list, List list2) {
        boolean z = true;
        lku.m15669w(!list.isEmpty());
        if (list.size() != list2.size()) {
            z = false;
        }
        lku.m15669w(z);
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            kgx kgxVar = (kgx) list.get(i);
            Set set = (Set) list2.get(i);
            arrayList.add(m14349b(kgxVar.f35992a, kgxVar.f35993b, kgxVar.f35994c, set));
            m14346m(set);
        }
        this.f36178c.mo14370e(arrayList);
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m14353f(kgx kgxVar) {
        this.f36178c.mo14367b(m14343j(kgxVar.f35992a, kgxVar.f35993b, kgxVar.f35994c, mzx.f41874a));
    }

    /* JADX INFO: renamed from: g */
    public final synchronized void m14354g(kgx kgxVar, Set set) {
        kiz kizVarM14349b = m14349b(kgxVar.f35992a, kgxVar.f35993b, kgxVar.f35994c, set);
        m14346m(set);
        this.f36178c.mo14369d(kizVarM14349b);
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m14355h(kgx kgxVar) {
        this.f36178c.mo14369d(m14343j(kgxVar.f35992a, kgxVar.f35993b, kgxVar.f35994c, mzx.f41874a));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m14350c() {
        try {
            this.f36178c.mo14366a();
            m14345l();
        } catch (CameraAccessException | kpf e) {
            throw new kec(e);
        }
    }
}
