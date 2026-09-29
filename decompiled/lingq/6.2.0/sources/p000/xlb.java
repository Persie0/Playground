package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public interface xlb {
    /* JADX INFO: renamed from: h */
    static kmb m24611h(xlb xlbVar, xmb xmbVar, C3329mb c3329mb, ArrayList arrayList) {
        String str = xmbVar.f68360a;
        if (xlbVar.mo3882j(str)) {
            kmb kmbVarMo3880f = xlbVar.mo3880f(str);
            if (kmbVarMo3880f instanceof vkb) {
                return ((vkb) kmbVarMo3880f).mo12757a(c3329mb, arrayList);
            }
            C3386nv.m17626m(ux5.m22990m(str, " is not a function"));
            return null;
        }
        if ("hasOwnProperty".equals(str)) {
            qdd.m19875b(1, "hasOwnProperty", arrayList);
            return xlbVar.mo3882j(((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0)).mo3809c()) ? kmb.f47520D : kmb.f47521E;
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("Object has no function ", str));
        return null;
    }

    /* JADX INFO: renamed from: f */
    kmb mo3880f(String str);

    /* JADX INFO: renamed from: i */
    void mo3881i(String str, kmb kmbVar);

    /* JADX INFO: renamed from: j */
    boolean mo3882j(String str);
}
