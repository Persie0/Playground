package p000;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class sld extends vkb {

    /* JADX INFO: renamed from: c */
    public final jh9 f61008c;

    /* JADX INFO: renamed from: d */
    public final HashMap f61009d;

    public sld(jh9 jh9Var) {
        super("require");
        this.f61009d = new HashMap();
        this.f61008c = jh9Var;
    }

    @Override // p000.vkb
    /* JADX INFO: renamed from: a */
    public final kmb mo12757a(C3329mb c3329mb, List list) {
        kmb kmbVar;
        qdd.m19875b(1, "require", list);
        String strMo3809c = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) list.get(0)).mo3809c();
        HashMap map = this.f61009d;
        if (map.containsKey(strMo3809c)) {
            return (kmb) map.get(strMo3809c);
        }
        HashMap map2 = (HashMap) this.f61008c.f45552b;
        if (map2.containsKey(strMo3809c)) {
            try {
                kmbVar = (kmb) ((Callable) map2.get(strMo3809c)).call();
            } catch (Exception unused) {
                C3386nv.m17633t("Failed to create API implementation: ".concat(String.valueOf(strMo3809c)));
                return null;
            }
        } else {
            kmbVar = kmb.f47523y;
        }
        if (kmbVar instanceof vkb) {
            map.put(strMo3809c, (vkb) kmbVar);
        }
        return kmbVar;
    }
}
