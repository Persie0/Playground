package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: o7 */
/* JADX INFO: loaded from: classes.dex */
public final class C3399o7 extends AbstractC3102i7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53919a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ sc1 f53920b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f53921c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pk9 f53922d;

    public /* synthetic */ C3399o7(sc1 sc1Var, String str, pk9 pk9Var, int i) {
        this.f53919a = i;
        this.f53920b = sc1Var;
        this.f53921c = str;
        this.f53922d = pk9Var;
    }

    @Override // p000.AbstractC3102i7
    /* JADX INFO: renamed from: a */
    public final void mo276a(Object obj) {
        int i = this.f53919a;
        pk9 pk9Var = this.f53922d;
        String str = this.f53921c;
        sc1 sc1Var = this.f53920b;
        switch (i) {
            case 0:
                ArrayList arrayList = sc1Var.f60660d;
                Object obj2 = sc1Var.f60658b.get(str);
                if (obj2 == null) {
                    v63.m23145w("Attempting to launch an unregistered ActivityResultLauncher with contract ", pk9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    sc1Var.m21215b(iIntValue, pk9Var, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = sc1Var.f60660d;
                Object obj3 = sc1Var.f60658b.get(str);
                if (obj3 == null) {
                    v63.m23145w("Attempting to launch an unregistered ActivityResultLauncher with contract ", pk9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    sc1Var.m21215b(iIntValue2, pk9Var, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m17829b() {
        this.f53920b.m21219f(this.f53921c);
    }
}
