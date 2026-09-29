package p000;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* JADX INFO: renamed from: o9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3401o9 {
    static {
        Class<InterfaceC3364n9> cls = InterfaceC3364n9.class;
        zj7[] zj7VarArr = {new C0012aa(1, cls)};
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
        zj7[] zj7VarArr2 = {new C0012aa(3, cls)};
        HashMap map2 = new HashMap();
        zj7 zj7Var2 = zj7VarArr2[0];
        boolean zContainsKey2 = map2.containsKey(zj7Var2.f71654a);
        Class cls4 = zj7Var2.f71654a;
        if (zContainsKey2) {
            C3386nv.m17625k(cls4.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map2.put(cls4, zj7Var2);
        Class cls5 = zj7VarArr2[0].f71654a;
        Collections.unmodifiableMap(map2);
        zj7[] zj7VarArr3 = {new C0012aa(4, cls)};
        HashMap map3 = new HashMap();
        zj7 zj7Var3 = zj7VarArr3[0];
        boolean zContainsKey3 = map3.containsKey(zj7Var3.f71654a);
        Class cls6 = zj7Var3.f71654a;
        if (zContainsKey3) {
            C3386nv.m17625k(cls6.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map3.put(cls6, zj7Var3);
        Class cls7 = zj7VarArr3[0].f71654a;
        Collections.unmodifiableMap(map3);
        zj7[] zj7VarArr4 = {new C0012aa(2, cls)};
        HashMap map4 = new HashMap();
        zj7 zj7Var4 = zj7VarArr4[0];
        boolean zContainsKey4 = map4.containsKey(zj7Var4.f71654a);
        Class cls8 = zj7Var4.f71654a;
        if (zContainsKey4) {
            C3386nv.m17625k(cls8.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map4.put(cls8, zj7Var4);
        Class cls9 = zj7VarArr4[0].f71654a;
        Collections.unmodifiableMap(map4);
        zj7[] zj7VarArr5 = {new C0012aa(8, cls)};
        HashMap map5 = new HashMap();
        zj7 zj7Var5 = zj7VarArr5[0];
        boolean zContainsKey5 = map5.containsKey(zj7Var5.f71654a);
        Class cls10 = zj7Var5.f71654a;
        if (zContainsKey5) {
            C3386nv.m17625k(cls10.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map5.put(cls10, zj7Var5);
        Class cls11 = zj7VarArr5[0].f71654a;
        Collections.unmodifiableMap(map5);
        zj7[] zj7VarArr6 = {new C0012aa(9, cls)};
        HashMap map6 = new HashMap();
        zj7 zj7Var6 = zj7VarArr6[0];
        boolean zContainsKey6 = map6.containsKey(zj7Var6.f71654a);
        Class cls12 = zj7Var6.f71654a;
        if (zContainsKey6) {
            C3386nv.m17625k(cls12.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map6.put(cls12, zj7Var6);
        Class cls13 = zj7VarArr6[0].f71654a;
        Collections.unmodifiableMap(map6);
        zj7[] zj7VarArr7 = {new C0012aa(6, cls)};
        HashMap map7 = new HashMap();
        zj7 zj7Var7 = zj7VarArr7[0];
        boolean zContainsKey7 = map7.containsKey(zj7Var7.f71654a);
        Class cls14 = zj7Var7.f71654a;
        if (zContainsKey7) {
            C3386nv.m17625k(cls14.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map7.put(cls14, zj7Var7);
        Class cls15 = zj7VarArr7[0].f71654a;
        Collections.unmodifiableMap(map7);
        zj7[] zj7VarArr8 = {new C0012aa(10, cls)};
        HashMap map8 = new HashMap();
        zj7 zj7Var8 = zj7VarArr8[0];
        boolean zContainsKey8 = map8.containsKey(zj7Var8.f71654a);
        Class cls16 = zj7Var8.f71654a;
        if (zContainsKey8) {
            C3386nv.m17625k(cls16.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
            return;
        }
        map8.put(cls16, zj7Var8);
        Class cls17 = zj7VarArr8[0].f71654a;
        Collections.unmodifiableMap(map8);
        int i = n48.CONFIG_NAME_FIELD_NUMBER;
        try {
            m17862a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m17862a() {
        l48.m15796h(C3566s9.f60545b);
        ko5.m15342a();
        Class<InterfaceC3364n9> cls = InterfaceC3364n9.class;
        int i = 2;
        l48.m15794f(new C0840ca(C3328ma.class, new zj7[]{new C0012aa(1, cls)}, i), true);
        int i2 = 3;
        int i3 = 4;
        l48.m15794f(new C0840ca(C3753xb.class, new zj7[]{new C0012aa(i2, cls)}, i3), true);
        b47 b47Var = AbstractC2996fc.f38825a;
        p66 p66Var = p66.f55658b;
        p66Var.m18926e(AbstractC2996fc.f38825a);
        p66Var.m18925d(AbstractC2996fc.f38826b);
        p66Var.m18924c(AbstractC2996fc.f38827c);
        p66Var.m18923b(AbstractC2996fc.f38828d);
        if (i1a.m13628a()) {
            return;
        }
        l48.m15794f(new C0840ca(C3069hb.class, new zj7[]{new C0012aa(i, cls)}, i2), true);
        p66Var.m18926e(AbstractC3605tb.f62085a);
        p66Var.m18925d(AbstractC3605tb.f62086b);
        p66Var.m18924c(AbstractC3605tb.f62087c);
        p66Var.m18923b(AbstractC3605tb.f62088d);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            l48.m15794f(new C0840ca(C3142jc.class, new zj7[]{new C0012aa(i3, cls)}, 5), true);
            p66Var.m18926e(AbstractC3530rc.f59052a);
            p66Var.m18925d(AbstractC3530rc.f59053b);
            p66Var.m18924c(AbstractC3530rc.f59054c);
            p66Var.m18923b(AbstractC3530rc.f59055d);
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        l48.m15794f(new C0840ca(bp0.class, new zj7[]{new C0012aa(6, cls)}, 7), true);
        b47 b47Var2 = jp0.f45946a;
        p66 p66Var2 = p66.f55658b;
        p66Var2.m18926e(jp0.f45946a);
        p66Var2.m18925d(jp0.f45947b);
        p66Var2.m18924c(jp0.f45948c);
        p66Var2.m18923b(jp0.f45949d);
        int i4 = 8;
        l48.m15794f(new C0840ca(hk4.class, new zj7[]{new C0012aa(i4, cls)}, i4), true);
        int i5 = 9;
        l48.m15794f(new C0840ca(ok4.class, new zj7[]{new C0012aa(i5, cls)}, i5), true);
        int i6 = 10;
        l48.m15794f(new C0840ca(s9b.class, new zj7[]{new C0012aa(i6, cls)}, i6), true);
        p66Var2.m18926e(y9b.f69523a);
        p66Var2.m18925d(y9b.f69524b);
        p66Var2.m18924c(y9b.f69525c);
        p66Var2.m18923b(y9b.f69526d);
    }
}
