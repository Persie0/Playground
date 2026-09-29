package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class oc2 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f54168a = 0;

    static {
        int i = 5;
        Class<nc2> cls = nc2.class;
        zj7[] zj7VarArr = {new C0012aa(i, cls)};
        HashMap map = new HashMap();
        zj7 zj7Var = zj7VarArr[0];
        boolean zContainsKey = map.containsKey(zj7Var.f71654a);
        Class cls2 = zj7Var.f71654a;
        if (zContainsKey) {
            C3386nv.m17625k(cls2.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map.put(cls2, zj7Var);
        Class cls3 = zj7VarArr[0].f71654a;
        Collections.unmodifiableMap(map);
        int i2 = n48.CONFIG_NAME_FIELD_NUMBER;
        try {
            l48.m15796h(qc2.f57561b);
            if (i1a.m13628a()) {
                return;
            }
            l48.m15794f(new C0840ca(C3680vc.class, new zj7[]{new C0012aa(i, cls)}, 6), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
