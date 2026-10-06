package p000;

import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kkh implements kpg {

    /* JADX INFO: renamed from: a */
    public final mxp f36350a;

    /* JADX INFO: renamed from: b */
    public final Map f36351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ kki f36352c;

    public kkh(kki kkiVar, mxp mxpVar, Map map) {
        this.f36352c = kkiVar;
        this.f36350a = mxpVar;
        this.f36351b = map;
    }

    /* JADX INFO: renamed from: a */
    public final void m14419a(int i) {
        naz nazVarListIterator = this.f36350a.entrySet().listIterator();
        while (nazVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) nazVarListIterator.next();
            ((kfv) entry.getValue()).mo9229bv(((Long) entry.getKey()).longValue(), i);
        }
    }

    @Override // p000.kpg
    /* JADX INFO: renamed from: b */
    public final void mo14420b(kpk kpkVar, kll kllVar) {
        Long lM14421g = kki.m14421g(kpkVar);
        kbz kbzVar = this.f36352c.f36353a;
        StringBuilder sb = new StringBuilder();
        sb.append("onCaptureFailed_");
        sb.append(lM14421g);
        kbzVar.mo13961e("onCaptureFailed_".concat(lM14421g.toString()));
        kfv kfvVar = (kfv) this.f36350a.get(lM14421g);
        kfvVar.getClass();
        kfvVar.mo5455ba(kllVar);
        synchronized (this.f36352c) {
            kki kkiVar = this.f36352c;
            if (!kkiVar.f36355c) {
                kkiVar.m14431i(lM14421g.longValue());
            }
        }
        this.f36352c.f36353a.mo13962f();
    }
}
