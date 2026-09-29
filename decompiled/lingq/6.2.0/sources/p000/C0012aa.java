package p000;

import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: aa */
/* JADX INFO: loaded from: classes.dex */
public final class C0012aa extends zj7 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f401b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0012aa(int i, Class cls) {
        super(cls);
        this.f401b = i;
    }

    @Override // p000.zj7
    /* JADX INFO: renamed from: a */
    public final Object mo196a(AbstractC1126a abstractC1126a) throws GeneralSecurityException {
        switch (this.f401b) {
            case 0:
                C3677v9 c3677v9 = (C3677v9) abstractC1126a;
                return new sj7(new pj7(c3677v9.m23188z().m6412j()), c3677v9.m23186A().m13152x());
            case 1:
                C3328ma c3328ma = (C3328ma) abstractC1126a;
                zj7[] zj7VarArr = {new C3789ya(C3528ra.class)};
                HashMap map = new HashMap();
                for (zj7 zj7Var : zj7VarArr) {
                    boolean zContainsKey = map.containsKey(zj7Var.f71654a);
                    Class cls = zj7Var.f71654a;
                    if (zContainsKey) {
                        C3386nv.m17625k(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                        return null;
                    }
                    map.put(cls, zj7Var);
                }
                if (zj7VarArr.length > 0) {
                    Class cls2 = zj7VarArr[0].f71654a;
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                C3641ua c3641uaM16714z = c3328ma.m16714z();
                zj7 zj7Var2 = (zj7) mapUnmodifiableMap.get(C3528ra.class);
                if (zj7Var2 == null) {
                    v63.m23144v("Requested primitive class ", C3528ra.class.getCanonicalName(), " not supported.");
                    return null;
                }
                C3528ra c3528ra = (C3528ra) zj7Var2.mo196a(c3641uaM16714z);
                zj7[] zj7VarArr2 = {new C0012aa(7, jo5.class)};
                HashMap map2 = new HashMap();
                for (zj7 zj7Var3 : zj7VarArr2) {
                    boolean zContainsKey2 = map2.containsKey(zj7Var3.f71654a);
                    Class cls3 = zj7Var3.f71654a;
                    if (zContainsKey2) {
                        C3386nv.m17625k(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                        return null;
                    }
                    map2.put(cls3, zj7Var3);
                }
                if (zj7VarArr2.length > 0) {
                    Class cls4 = zj7VarArr2[0].f71654a;
                }
                Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
                fu3 fu3VarM16712A = c3328ma.m16712A();
                zj7 zj7Var4 = (zj7) mapUnmodifiableMap2.get(jo5.class);
                if (zj7Var4 != null) {
                    return new cs2(c3528ra, (jo5) zj7Var4.mo196a(fu3VarM16712A), c3328ma.m16712A().m12150B().m18519z());
                }
                v63.m23144v("Requested primitive class ", jo5.class.getCanonicalName(), " not supported.");
                return null;
            case 2:
                C3069hb c3069hb = (C3069hb) abstractC1126a;
                return new C2958eb(c3069hb.m13177A().m20562x(), c3069hb.m13179z().m6412j());
            case 3:
                return new C3642ub(((C3753xb) abstractC1126a).m24437x().m6412j());
            case 4:
                return new C3033gc(((C3142jc) abstractC1126a).m14387y().m6412j());
            case 5:
                return new C3569sc(((C3680vc) abstractC1126a).m23224x().m6412j());
            case 6:
                return new yo0(0, ((bp0) abstractC1126a).m4024y().m6412j());
            case 7:
                fu3 fu3Var = (fu3) abstractC1126a;
                HashType hashTypeM18518y = fu3Var.m12150B().m18518y();
                SecretKeySpec secretKeySpec = new SecretKeySpec(fu3Var.m12149A().m6412j(), "HMAC");
                int iM18519z = fu3Var.m12150B().m18519z();
                int i = ku3.f48427a[hashTypeM18518y.ordinal()];
                if (i == 1) {
                    return new sj7(new rj7("HMACSHA1", secretKeySpec), iM18519z);
                }
                if (i == 2) {
                    return new sj7(new rj7("HMACSHA224", secretKeySpec), iM18519z);
                }
                if (i == 3) {
                    return new sj7(new rj7("HMACSHA256", secretKeySpec), iM18519z);
                }
                if (i == 4) {
                    return new sj7(new rj7("HMACSHA384", secretKeySpec), iM18519z);
                }
                if (i == 5) {
                    return new sj7(new rj7("HMACSHA512", secretKeySpec), iM18519z);
                }
                v63.m23147y("unknown hash");
                return null;
            case 8:
                String strM14526x = ((hk4) abstractC1126a).m13308y().m14526x();
                return kk4.m15292a(strM14526x).m18031c(strM14526x);
            case 9:
                ok4 ok4Var = (ok4) abstractC1126a;
                String strM20017y = ok4Var.m18062y().m20017y();
                return new lk4(ok4Var.m18062y().m20016x(), kk4.m15292a(strM20017y).m18031c(strM20017y));
            default:
                return new yo0(1, ((s9b) abstractC1126a).m21180y().m6412j());
        }
    }
}
