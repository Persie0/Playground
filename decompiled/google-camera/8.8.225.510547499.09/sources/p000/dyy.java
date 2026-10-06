package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dyy {

    /* JADX INFO: renamed from: a */
    private static final nbh f12944a = nbh.m17259h("com/google/android/apps/camera/gallery/processing/ProcessingMediaManagerImpl");

    /* JADX INFO: renamed from: b */
    private final Map f12945b = new HashMap();

    /* JADX INFO: renamed from: f */
    private final synchronized dyw m6951f(long j) {
        for (dyw dywVar : this.f12945b.values()) {
            if (dywVar.f12937a.f26865a == j) {
                return dywVar;
            }
        }
        ((nbe) ((nbe) f12944a.m17251b()).mo17276G(1195)).mo17292q("Mediastore record not found for %s", j);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final mrm m6952a(long j) {
        return mrm.m16828h(m6951f(j));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized mrm m6953b(gyu gyuVar) {
        return mrm.m16828h((dyw) this.f12945b.get(gyuVar));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized List m6954c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (dyw dywVar : this.f12945b.values()) {
            if (dywVar.m6949f()) {
                arrayList.add(dywVar);
            }
        }
        arrayList.size();
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized dyw m6955d(gyu gyuVar) {
        dyw dywVar;
        lku.m15607B(this.f12945b.containsKey(gyuVar), "No session associated with session: %s", gyuVar);
        dywVar = (dyw) this.f12945b.remove(gyuVar);
        dywVar.getClass();
        return dywVar;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m6956e(gyu gyuVar, dyw dywVar) {
        lku.m15611F(!this.f12945b.containsKey(gyuVar), "Already contain pending ProcessingMedia <%s> for session <%s>. Now attempting to associate ProcessingMedia <%s> with same session.", this.f12945b.get(gyuVar), gyuVar, dywVar);
        this.f12945b.put(gyuVar, dywVar);
    }
}
