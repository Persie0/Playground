package p000;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bds implements Runnable {

    /* JADX INFO: renamed from: d */
    public final ayz f3006d = new ayz();

    /* JADX INFO: renamed from: b */
    public static bds m2248b(String str, azp azpVar, boolean z) {
        return new bdr(azpVar, str, z);
    }

    /* JADX INFO: renamed from: c */
    static final void m2249c(azp azpVar, String str) {
        azs azsVar;
        azs azsVar2;
        WorkDatabase workDatabase = azpVar.f2782d;
        bcw bcwVarMo1700B = workDatabase.mo1700B();
        bbv bbvVarMo1702w = workDatabase.mo1702w();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            int iMo2239h = bcwVarMo1700B.mo2239h(str2);
            if (iMo2239h != 3 && iMo2239h != 4) {
                bcwVarMo1700B.mo2242k(6, str2);
            }
            linkedList.addAll(bbvVarMo1702w.mo2190a(str2));
        }
        azb azbVar = azpVar.f2784f;
        synchronized (azbVar.f2752f) {
            ayc.m2099a();
            azbVar.f2751e.add(str);
            azsVar = (azs) azbVar.f2748b.remove(str);
            azsVar2 = azsVar == null ? (azs) azbVar.f2749c.remove(str) : azsVar;
            if (azsVar2 != null) {
                azbVar.f2750d.remove(str);
            }
        }
        azb.m2110f(azsVar2);
        if (azsVar != null) {
            azbVar.m2114d();
        }
        Iterator it = azpVar.f2783e.iterator();
        while (it.hasNext()) {
            ((azd) it.next()).mo2117b(str);
        }
    }

    /* JADX INFO: renamed from: d */
    static final void m2250d(azp azpVar) {
        azf.m2120a(azpVar.f2781c, azpVar.f2782d, azpVar.f2783e);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2247a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            mo2247a();
            this.f3006d.m2109a(ayg.f2712a);
        } catch (Throwable th) {
            this.f3006d.m2109a(new ayd(th));
        }
    }
}
