package p000;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class loo {

    /* JADX INFO: renamed from: a */
    public final String f38823a;

    /* JADX INFO: renamed from: b */
    public final String f38824b;

    /* JADX INFO: renamed from: c */
    public final boolean f38825c;

    /* JADX INFO: renamed from: d */
    public final boolean f38826d;

    /* JADX INFO: renamed from: e */
    private final loa f38827e;

    /* JADX INFO: renamed from: f */
    private final lod f38828f;

    /* JADX INFO: renamed from: g */
    private final loj f38829g;

    public loo(Context context, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, mrm mrmVar5) {
        String packageName = context.getPackageName();
        loa loaVar = (loa) mrmVar.mo16811e(loa.f38793b);
        lod lodVar = (lod) mrmVar2.mo16811e(lod.f38796b);
        loj lojVar = (loj) mrmVar3.mo16811e(loj.f38803b);
        boolean zBooleanValue = ((Boolean) mrmVar4.mo16811e(false)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) mrmVar5.mo16811e(false)).booleanValue();
        this.f38824b = "CAMERA_ANDROID_PRIMES";
        this.f38827e = loaVar;
        this.f38828f = lodVar;
        this.f38829g = lojVar;
        this.f38825c = zBooleanValue;
        this.f38826d = zBooleanValue2;
        this.f38823a = "com.google.android.libraries.performance.primes#".concat(String.valueOf(packageName));
    }

    /* JADX INFO: renamed from: a */
    public final nps m15783a() {
        final nps npsVarMo15780a = this.f38827e.mo15780a();
        final nps npsVarMo15781a = this.f38828f.mo15781a();
        final nps npsVarMo15782a = this.f38829g.mo15782a();
        return kxk.m14959E(npsVarMo15780a, npsVarMo15781a, npsVarMo15782a).m17605a(new Callable() { // from class: lon
            @Override // java.util.concurrent.Callable
            public final Object call() {
                loo looVar = this.f38819a;
                nps npsVar = npsVarMo15780a;
                nps npsVar2 = npsVarMo15781a;
                nps npsVar3 = npsVarMo15782a;
                nxl nxlVarM18137O = lom.f38808i.m18137O();
                String str = looVar.f38824b;
                if (!nxlVarM18137O.f44974b.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar = nxlVarM18137O.f44974b;
                lom lomVar = (lom) nxqVar;
                lomVar.f38811a |= 1;
                lomVar.f38812b = str;
                String str2 = looVar.f38823a;
                if (!nxqVar.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar2 = nxlVarM18137O.f44974b;
                lom lomVar2 = (lom) nxqVar2;
                lomVar2.f38811a |= 2;
                lomVar2.f38813c = str2;
                boolean z = looVar.f38825c;
                if (!nxqVar2.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                nxq nxqVar3 = nxlVarM18137O.f44974b;
                lom lomVar3 = (lom) nxqVar3;
                lomVar3.f38811a |= 4;
                lomVar3.f38814d = z;
                boolean z2 = looVar.f38826d;
                if (!nxqVar3.m18142ac()) {
                    nxlVarM18137O.mo18106p();
                }
                lom lomVar4 = (lom) nxlVarM18137O.f44974b;
                lomVar4.f38811a |= 32;
                lomVar4.f38818h = z2;
                try {
                    mrm mrmVar = (mrm) kxk.m14973S(npsVar);
                    if (mrmVar.mo16813g()) {
                        String str3 = (String) mrmVar.mo16809c();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        lom lomVar5 = (lom) nxlVarM18137O.f44974b;
                        lomVar5.f38811a |= 16;
                        lomVar5.f38816f = str3;
                    }
                } catch (Exception e) {
                }
                try {
                    List list = (List) kxk.m14973S(npsVar2);
                    if (!nxlVarM18137O.f44974b.m18142ac()) {
                        nxlVarM18137O.mo18106p();
                    }
                    lom lomVar6 = (lom) nxlVarM18137O.f44974b;
                    nxw nxwVar = lomVar6.f38817g;
                    if (!nxwVar.mo17770c()) {
                        lomVar6.f38817g = nxq.m18125S(nxwVar);
                    }
                    nwb.m17749e(list, lomVar6.f38817g);
                } catch (Exception e2) {
                }
                try {
                    mrm mrmVar2 = (mrm) kxk.m14973S(npsVar3);
                    if (mrmVar2.mo16813g()) {
                        String str4 = (String) mrmVar2.mo16809c();
                        if (!nxlVarM18137O.f44974b.m18142ac()) {
                            nxlVarM18137O.mo18106p();
                        }
                        lom lomVar7 = (lom) nxlVarM18137O.f44974b;
                        lomVar7.f38811a |= 8;
                        lomVar7.f38815e = str4;
                    }
                } catch (Exception e3) {
                }
                nxn nxnVar = (nxn) loe.f38797c.m18137O();
                nxnVar.m18119aJ(lom.f38809j, (lom) nxlVarM18137O.mo18103l());
                return (loe) nxnVar.mo18103l();
            }
        }, not.INSTANCE);
    }
}
