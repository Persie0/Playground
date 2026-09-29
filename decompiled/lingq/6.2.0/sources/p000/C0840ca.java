package p000;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.config.internal.TinkFipsUtil$AlgorithmFipsCompatibility;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData$KeyMaterialType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ca */
/* JADX INFO: loaded from: classes.dex */
public final class C0840ca extends AbstractC3517r {

    /* JADX INFO: renamed from: e */
    public static final xj7 f9776e = new xj7(C3714w9.class, new gm5(6));

    /* JADX INFO: renamed from: f */
    public static final xj7 f9777f = new xj7(gu3.class, new v63(6));

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f9778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840ca() {
        super(fu3.class, new C0012aa(7, jo5.class));
        this.f9778d = 1;
    }

    /* JADX INFO: renamed from: s */
    public static ej4 m4434s(int i, int i2, HashType hashType, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        C3715wa c3715waM24424A = C3752xa.m24424A();
        C0841cb c0841cbM10260y = C2922db.m10260y();
        c0841cbM10260y.m22174d();
        C2922db.m10258v((C2922db) c0841cbM10260y.f62440b);
        C2922db c2922db = (C2922db) c0841cbM10260y.m22171a();
        c3715waM24424A.m22174d();
        C3752xa.m24426v((C3752xa) c3715waM24424A.f62440b, c2922db);
        c3715waM24424A.m22174d();
        C3752xa.m24427w((C3752xa) c3715waM24424A.f62440b, i);
        C3752xa c3752xa = (C3752xa) c3715waM24424A.m22171a();
        iu3 iu3VarM14649A = ju3.m14649A();
        nu3 nu3VarM18514A = ou3.m18514A();
        nu3VarM18514A.m22174d();
        ou3.m18515v((ou3) nu3VarM18514A.f62440b, hashType);
        nu3VarM18514A.m22174d();
        ou3.m18516w((ou3) nu3VarM18514A.f62440b, i2);
        ou3 ou3Var = (ou3) nu3VarM18514A.m22171a();
        iu3VarM14649A.m22174d();
        ju3.m14651v((ju3) iu3VarM14649A.f62440b, ou3Var);
        iu3VarM14649A.m22174d();
        ju3.m14652w((ju3) iu3VarM14649A.f62440b, 32);
        ju3 ju3Var = (ju3) iu3VarM14649A.m22171a();
        C3402oa c3402oaM19001z = C3453pa.m19001z();
        c3402oaM19001z.m22174d();
        C3453pa.m18999v((C3453pa) c3402oaM19001z.f62440b, c3752xa);
        c3402oaM19001z.m22174d();
        C3453pa.m19000w((C3453pa) c3402oaM19001z.f62440b, ju3Var);
        return new ej4((C3453pa) c3402oaM19001z.m22171a(), keyTemplate$OutputPrefixType);
    }

    /* JADX INFO: renamed from: t */
    public static ej4 m4435t(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        C3178kb c3178kbM16054z = C3292lb.m16054z();
        c3178kbM16054z.m22174d();
        C3292lb.m16053w((C3292lb) c3178kbM16054z.f62440b, i);
        C3491qb c3491qbM20561y = C3529rb.m20561y();
        c3491qbM20561y.m22174d();
        C3529rb.m20559v((C3529rb) c3491qbM20561y.f62440b);
        C3529rb c3529rb = (C3529rb) c3491qbM20561y.m22171a();
        c3178kbM16054z.m22174d();
        C3292lb.m16052v((C3292lb) c3178kbM16054z.f62440b, c3529rb);
        return new ej4((C3292lb) c3178kbM16054z.m22171a(), keyTemplate$OutputPrefixType);
    }

    /* JADX INFO: renamed from: u */
    public static ej4 m4436u(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        C0014ac c0014acM3602x = C0805bc.m3602x();
        c0014acM3602x.m22174d();
        C0805bc.m3601v((C0805bc) c0014acM3602x.f62440b, i);
        return new ej4((C0805bc) c0014acM3602x.m22171a(), keyTemplate$OutputPrefixType);
    }

    /* JADX INFO: renamed from: v */
    public static ej4 m4437v(int i, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        C3330mc c3330mcM17322x = C3367nc.m17322x();
        c3330mcM17322x.m22174d();
        C3367nc.m17321v((C3367nc) c3330mcM17322x.f62440b, i);
        return new ej4((C3367nc) c3330mcM17322x.m22171a(), keyTemplate$OutputPrefixType);
    }

    /* JADX INFO: renamed from: w */
    public static ej4 m4438w(int i, int i2, HashType hashType, KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType) {
        iu3 iu3VarM14649A = ju3.m14649A();
        nu3 nu3VarM18514A = ou3.m18514A();
        nu3VarM18514A.m22174d();
        ou3.m18515v((ou3) nu3VarM18514A.f62440b, hashType);
        nu3VarM18514A.m22174d();
        ou3.m18516w((ou3) nu3VarM18514A.f62440b, i2);
        ou3 ou3Var = (ou3) nu3VarM18514A.m22171a();
        iu3VarM14649A.m22174d();
        ju3.m14651v((ju3) iu3VarM14649A.f62440b, ou3Var);
        iu3VarM14649A.m22174d();
        ju3.m14652w((ju3) iu3VarM14649A.f62440b, i);
        return new ej4((ju3) iu3VarM14649A.m22171a(), keyTemplate$OutputPrefixType);
    }

    /* JADX INFO: renamed from: x */
    public static void m4439x(C3068ha c3068ha) throws GeneralSecurityException {
        if (c3068ha.m13152x() < 10) {
            v63.m23147y("tag size too short");
        } else {
            if (c3068ha.m13152x() <= 16) {
                return;
            }
            v63.m23147y("tag size too long");
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m4440y(ou3 ou3Var) throws GeneralSecurityException {
        if (ou3Var.m18519z() < 10) {
            v63.m23147y("tag size too small");
            return;
        }
        int i = ku3.f48427a[ou3Var.m18518y().ordinal()];
        if (i == 1) {
            if (ou3Var.m18519z() <= 20) {
                return;
            }
            v63.m23147y("tag size too big");
            return;
        }
        if (i == 2) {
            if (ou3Var.m18519z() <= 28) {
                return;
            }
            v63.m23147y("tag size too big");
            return;
        }
        if (i == 3) {
            if (ou3Var.m18519z() <= 32) {
                return;
            }
            v63.m23147y("tag size too big");
        } else if (i == 4) {
            if (ou3Var.m18519z() <= 48) {
                return;
            }
            v63.m23147y("tag size too big");
        } else if (i != 5) {
            v63.m23147y("unknown hash type");
        } else {
            if (ou3Var.m18519z() <= 64) {
                return;
            }
            v63.m23147y("tag size too big");
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: d */
    public TinkFipsUtil$AlgorithmFipsCompatibility mo4441d() {
        switch (this.f9778d) {
            case 1:
                return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
            case 2:
                return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
            case 3:
            default:
                return super.mo4441d();
            case 4:
                return TinkFipsUtil$AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: i */
    public final String mo225i() {
        switch (this.f9778d) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 5:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            default:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: j */
    public final AbstractC3572sf mo226j() {
        switch (this.f9778d) {
            case 0:
                return new C0803ba(C3825z9.class);
            case 1:
                return new C0803ba(this, (byte) 0, (byte) 0);
            case 2:
                return new C0803ba(this);
            case 3:
                return new C0803ba(this, (byte) 0);
            case 4:
                return new C0803ba(this, (char) 0);
            case 5:
                return new C0803ba(this, 0);
            case 6:
                return new C0803ba(this, (short) 0);
            case 7:
                return new C0803ba(this, (byte) 0, false);
            case 8:
                return new C0803ba(this, (byte) 0, (char) 0);
            case 9:
                return new C0803ba(this, (byte) 0, 0);
            default:
                return new C0803ba(this, (byte) 0, (short) 0);
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: o */
    public final KeyData$KeyMaterialType mo227o() {
        switch (this.f9778d) {
            case 0:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 1:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 2:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 3:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 4:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 5:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 6:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 7:
                return KeyData$KeyMaterialType.SYMMETRIC;
            case 8:
                return KeyData$KeyMaterialType.REMOTE;
            case 9:
                return KeyData$KeyMaterialType.REMOTE;
            default:
                return KeyData$KeyMaterialType.SYMMETRIC;
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: q */
    public final AbstractC1126a mo228q(ByteString byteString) {
        switch (this.f9778d) {
            case 0:
                return C3677v9.m23181D(byteString, ox2.m18561a());
            case 1:
                return fu3.m12143E(byteString, ox2.m18561a());
            case 2:
                return C3328ma.m16707D(byteString, ox2.m18561a());
            case 3:
                return C3069hb.m13172D(byteString, ox2.m18561a());
            case 4:
                return C3753xb.m24433A(byteString, ox2.m18561a());
            case 5:
                return C3142jc.m14383B(byteString, ox2.m18561a());
            case 6:
                return C3680vc.m23220A(byteString, ox2.m18561a());
            case 7:
                return bp0.m4020B(byteString, ox2.m18561a());
            case 8:
                return hk4.m13304B(byteString, ox2.m18561a());
            case 9:
                return ok4.m18058B(byteString, ox2.m18561a());
            default:
                return s9b.m21176B(byteString, ox2.m18561a());
        }
    }

    @Override // p000.AbstractC3517r
    /* JADX INFO: renamed from: r */
    public final void mo229r(AbstractC1126a abstractC1126a) throws GeneralSecurityException {
        switch (this.f9778d) {
            case 0:
                C3677v9 c3677v9 = (C3677v9) abstractC1126a;
                vna.m23450c(c3677v9.m23187B());
                if (c3677v9.m23188z().size() == 32) {
                    m4439x(c3677v9.m23186A());
                    return;
                } else {
                    v63.m23147y("AesCmacKey size wrong, must be 32 bytes");
                    return;
                }
            case 1:
                fu3 fu3Var = (fu3) abstractC1126a;
                vna.m23450c(fu3Var.m12151C());
                if (fu3Var.m12149A().size() >= 16) {
                    m4440y(fu3Var.m12150B());
                    return;
                } else {
                    v63.m23147y("key too short");
                    return;
                }
            case 2:
                C3328ma c3328ma = (C3328ma) abstractC1126a;
                vna.m23450c(c3328ma.m16713B());
                zj7[] zj7VarArr = {new C3789ya(C3528ra.class)};
                HashMap map = new HashMap();
                for (zj7 zj7Var : zj7VarArr) {
                    boolean zContainsKey = map.containsKey(zj7Var.f71654a);
                    Class cls = zj7Var.f71654a;
                    if (zContainsKey) {
                        C3386nv.m17625k(cls.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                        return;
                    }
                    map.put(cls, zj7Var);
                }
                if (zj7VarArr.length > 0) {
                    Class cls2 = zj7VarArr[0].f71654a;
                }
                Collections.unmodifiableMap(map);
                C0013ab.m224s(c3328ma.m16714z());
                zj7[] zj7VarArr2 = {new C0012aa(7, jo5.class)};
                HashMap map2 = new HashMap();
                zj7 zj7Var2 = zj7VarArr2[0];
                boolean zContainsKey2 = map2.containsKey(zj7Var2.f71654a);
                Class cls3 = zj7Var2.f71654a;
                if (zContainsKey2) {
                    C3386nv.m17625k(cls3.getCanonicalName(), "KeyTypeManager constructed with duplicate factories for primitive ");
                    return;
                }
                map2.put(cls3, zj7Var2);
                Class cls4 = zj7VarArr2[0].f71654a;
                Collections.unmodifiableMap(map2);
                fu3 fu3VarM16712A = c3328ma.m16712A();
                vna.m23450c(fu3VarM16712A.m12151C());
                if (fu3VarM16712A.m12149A().size() >= 16) {
                    m4440y(fu3VarM16712A.m12150B());
                    return;
                } else {
                    v63.m23147y("key too short");
                    return;
                }
            case 3:
                C3069hb c3069hb = (C3069hb) abstractC1126a;
                vna.m23450c(c3069hb.m13178B());
                vna.m23448a(c3069hb.m13179z().size());
                if (c3069hb.m13177A().m20562x() == 12 || c3069hb.m13177A().m20562x() == 16) {
                    return;
                }
                v63.m23147y("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 4:
                C3753xb c3753xb = (C3753xb) abstractC1126a;
                vna.m23450c(c3753xb.m24438y());
                vna.m23448a(c3753xb.m24437x().size());
                return;
            case 5:
                C3142jc c3142jc = (C3142jc) abstractC1126a;
                vna.m23450c(c3142jc.m14388z());
                vna.m23448a(c3142jc.m14387y().size());
                return;
            case 6:
                C3680vc c3680vc = (C3680vc) abstractC1126a;
                vna.m23450c(c3680vc.m23225y());
                if (c3680vc.m23224x().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + c3680vc.m23224x().size() + ". Valid keys must have 64 bytes.");
            case 7:
                bp0 bp0Var = (bp0) abstractC1126a;
                vna.m23450c(bp0Var.m4025z());
                if (bp0Var.m4024y().size() == 32) {
                    return;
                }
                v63.m23147y("invalid ChaCha20Poly1305Key: incorrect key length");
                return;
            case 8:
                vna.m23450c(((hk4) abstractC1126a).m13309z());
                return;
            case 9:
                vna.m23450c(((ok4) abstractC1126a).m18063z());
                return;
            default:
                s9b s9bVar = (s9b) abstractC1126a;
                vna.m23450c(s9bVar.m21181z());
                if (s9bVar.m21180y().size() == 32) {
                    return;
                }
                v63.m23147y("invalid XChaCha20Poly1305Key: incorrect key length");
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0840ca(Class cls, zj7[] zj7VarArr, int i) {
        super(cls, zj7VarArr);
        this.f9778d = i;
    }
}
