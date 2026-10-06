package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class etv implements nom {

    /* JADX INFO: renamed from: i */
    private final /* synthetic */ int f19884i;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ etv f19883h = new etv(9);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ etv f19882g = new etv(8);

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ etv f19881f = new etv(7);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ etv f19880e = new etv(6);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ etv f19879d = new etv(4);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ etv f19878c = new etv(2);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ etv f19877b = new etv(1);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ etv f19876a = new etv(0);

    public /* synthetic */ etv(int i) {
        this.f19884i = i;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, nps] */
    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        switch (this.f19884i) {
            case 0:
                return ((fuc) obj).mo8575i().f39914b;
            case 1:
                return kxk.m14964J((Throwable) obj);
            case 2:
                fbz fbzVar = (fbz) obj;
                return fbzVar != null ? fbzVar.mo8111a() : kxk.m14965K(null);
            case 3:
                grm grmVar = (grm) obj;
                drn drnVar = grmVar.f26163l;
                kpw kpwVar = grmVar.f26152a;
                return kxk.m14965K(grmVar);
            case 4:
                throw new IllegalStateException("Error updating preview surfaceview", (Throwable) obj);
            case 5:
                List list = (List) obj;
                list.getClass();
                return kxk.m14965K(null);
            case 6:
                List<kfd> list2 = (List) obj;
                if (list2 == null || list2.isEmpty()) {
                    return kxk.m14964J(new IllegalStateException("Null or empty frame results for keys."));
                }
                kfd kfdVar = (kfd) list2.get(0);
                for (kfd kfdVar2 : list2) {
                    if (kfdVar2.f35812c > -1) {
                        kfdVar = kfdVar2;
                    }
                }
                return kxk.m14965K(kfdVar);
            case 7:
                List list3 = (List) obj;
                if (list3 == null) {
                    return kxk.m14964J(new IllegalStateException());
                }
                kfd kfdVar3 = (kfd) list3.get(0);
                kfd kfdVar4 = (kfd) list3.get(1);
                return kfdVar3.f35812c > kfdVar4.f35812c ? kxk.m14965K(kfdVar3) : kxk.m14965K(kfdVar4);
            case 8:
                jdv jdvVar = (jdv) obj;
                throw new lqa(jdvVar.m12951a(), jdvVar.getMessage(), jdvVar);
            default:
                return kxk.m14965K(HRLmc.ewPeumuc);
        }
    }
}
