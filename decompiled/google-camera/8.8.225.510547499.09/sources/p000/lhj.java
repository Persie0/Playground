package p000;

import android.content.SharedPreferences;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lhj implements log {

    /* JADX INFO: renamed from: a */
    private final oju f38266a;

    /* JADX INFO: renamed from: b */
    private final oju f38267b;

    /* JADX INFO: renamed from: c */
    private final Set f38268c;

    public lhj(oju ojuVar, oju ojuVar2, Set set) {
        this.f38266a = ojuVar;
        this.f38267b = ojuVar2;
        this.f38268c = set;
    }

    /* JADX INFO: renamed from: c */
    private final String m15344c(String str) {
        return ((SharedPreferences) this.f38267b.get()).getString(m15345d(str), null);
    }

    /* JADX INFO: renamed from: d */
    private static final String m15345d(String str) {
        return "federatedLearningLastScheduledSession_".concat(str);
    }

    @Override // p000.log
    /* JADX INFO: renamed from: a */
    public final nps mo15346a(pat patVar) {
        lhg lhgVar = (lhg) this.f38266a.get();
        for (lhf lhfVar : this.f38268c) {
            if (!((oho) lhfVar.f38256c.get()).f46026d) {
                mrm mrmVar = lhfVar.f38255b;
                if (mrmVar.mo16813g() ? ((lhe) ((ohb) mrmVar.mo16809c()).get()).m15333a() : ((oho) lhfVar.f38256c.get()).f46023a) {
                    mxk mxkVarMo15334a = lhfVar.mo15334a(patVar);
                    if (!mxkVarMo15334a.isEmpty()) {
                        List listM16504L = mkv.m16504L(mxkVarMo15334a.mo17025v(), hnk.f28504q);
                        String strReplace = ((oho) lhfVar.f38256c.get()).f46024b.replace("%PACKAGE_NAME%", lhfVar.f38257d.getPackageName()).replace("%METRIC_NAME%", lhfVar.f38254a);
                        String str = ((oho) lhfVar.f38256c.get()).f46025c;
                        String str2 = lhfVar.f38254a;
                        lhgVar.mo15335a(str, listM16504L);
                        lhgVar.mo15337c(strReplace);
                        String strM15344c = m15344c(str2);
                        if (strM15344c != null && !strReplace.equals(strM15344c)) {
                            lhgVar.mo15336b(strM15344c);
                            ((SharedPreferences) this.f38267b.get()).edit().putString(m15345d(str2), strReplace).commit();
                        }
                    }
                }
            }
            String strM15344c2 = m15344c(lhfVar.f38254a);
            if (strM15344c2 != null) {
                lhgVar.mo15336b(strM15344c2);
            }
        }
        return npp.f44031a;
    }

    @Override // p000.log
    /* JADX INFO: renamed from: b */
    public final oyo mo15347b() {
        return new oyo(-10);
    }
}
