package p000;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ko5 {
    static {
        zj7[] zj7VarArr = {new C0012aa(7, jo5.class)};
        HashMap map = new HashMap();
        zj7 zj7Var = zj7VarArr[0];
        boolean zContainsKey = map.containsKey(zj7Var.f71654a);
        Class cls = zj7Var.f71654a;
        if (zContainsKey) {
            C3386nv.m17625k(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map.put(cls, zj7Var);
        Class cls2 = zj7VarArr[0].f71654a;
        Collections.unmodifiableMap(map);
        int i = n48.CONFIG_NAME_FIELD_NUMBER;
        try {
            m15342a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m15342a() {
        l48.m15796h(no5.f53059c);
        l48.m15796h(b21.f7780a);
        l48.m15794f(new C0840ca(), true);
        b47 b47Var = qu3.f58212a;
        p66 p66Var = p66.f55658b;
        p66Var.m18926e(qu3.f58212a);
        p66Var.m18925d(qu3.f58213b);
        p66Var.m18924c(qu3.f58214c);
        p66Var.m18923b(qu3.f58215d);
        l66 l66Var = l66.f49184b;
        l66Var.m15897a(C0840ca.f9777f);
        if (i1a.m13628a()) {
            return;
        }
        l48.m15794f(new C0840ca(C3677v9.class, new zj7[]{new C0012aa(0, jo5.class)}, 0), true);
        p66Var.m18926e(AbstractC3140ja.f45275a);
        p66Var.m18925d(AbstractC3140ja.f45276b);
        p66Var.m18924c(AbstractC3140ja.f45277c);
        p66Var.m18923b(AbstractC3140ja.f45278d);
        l66Var.m15897a(C0840ca.f9776e);
    }
}
