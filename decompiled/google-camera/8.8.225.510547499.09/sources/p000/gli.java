package p000;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gli implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ int f25485a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f25486b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Object f25487c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ Object f25488d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ Object f25489e;

    /* JADX INFO: renamed from: f */
    private final /* synthetic */ int f25490f;

    public gli(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, int i2) {
        this.f25490f = i2;
        this.f25485a = i;
        this.f25486b = arrayList;
        this.f25489e = arrayList2;
        this.f25487c = arrayList3;
        this.f25488d = arrayList4;
    }

    public gli(glj gljVar, String str, Map map, kfk kfkVar, int i, int i2) {
        this.f25490f = i2;
        this.f25489e = gljVar;
        this.f25486b = str;
        this.f25487c = map;
        this.f25488d = kfkVar;
        this.f25485a = i;
    }

    public /* synthetic */ gli(icc iccVar, int i, icb icbVar, ikw ikwVar, iby ibyVar, int i2) {
        this.f25490f = i2;
        this.f25486b = iccVar;
        this.f25485a = i;
        this.f25488d = icbVar;
        this.f25487c = ikwVar;
        this.f25489e = ibyVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v11, types: [icb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kfk] */
    /* JADX WARN: Type inference failed for: r4v0, types: [iby, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f25490f) {
            case 0:
                try {
                    hashCode();
                    if (((String) this.f25486b).equals(((glj) this.f25489e).f25494d)) {
                        kho khoVar = (kho) this.f25487c.get(this.f25486b);
                        Collection$EL.stream(khoVar.f36067c).map(egh.f13953s).collect(muc.f41626a);
                        ((glj) this.f25489e).f25495e = this.f25488d.mo14131r(khoVar, this.f25485a);
                        ((glj) this.f25489e).f25495e.mo9413m(this.f25485a);
                        Object obj = this.f25489e;
                        ((glj) obj).f25495e.mo9411k(((glj) obj).f25498h);
                        Object obj2 = this.f25489e;
                        kfa kfaVar = ((glj) obj2).f25496f;
                        if (kfaVar != null) {
                            ((glj) obj2).f25495e.mo9414n(kfaVar);
                        }
                    } else {
                        ((nbe) ((nbe) glj.f25491a.m17252c()).mo17276G(2940)).mo17290o("Out of date task, skipping.");
                    }
                    return;
                } finally {
                    Thread.currentThread().getId();
                    ((glj) this.f25489e).f25492b.unlock();
                }
            case 1:
                for (int i = 0; i < this.f25485a; i++) {
                    afh.m484o((View) ((ArrayList) this.f25486b).get(i), (String) ((ArrayList) this.f25489e).get(i));
                    afh.m484o((View) ((ArrayList) this.f25487c).get(i), (String) ((ArrayList) this.f25488d).get(i));
                }
                return;
            default:
                Object obj3 = this.f25486b;
                int i2 = this.f25485a;
                ?? r2 = this.f25488d;
                Object obj4 = this.f25487c;
                ?? r4 = this.f25489e;
                icc iccVar = (icc) obj3;
                if (i2 != iccVar.f30326v) {
                    return;
                }
                iccVar.f30308d.start();
                r2.mo4497i();
                int i3 = iccVar.f30303F;
                if (i3 == 1 || i3 != 2) {
                    r4.mo11033a((ikw) obj4);
                    return;
                } else {
                    iccVar.f30303F = 3;
                    r4.mo11033a((ikw) obj4);
                    return;
                }
        }
    }
}
