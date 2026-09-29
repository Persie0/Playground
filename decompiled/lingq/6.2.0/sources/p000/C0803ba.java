package p000;

import com.google.crypto.tink.KeyTemplate$OutputPrefixType;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.shaded.protobuf.AbstractC1126a;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0803ba extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8200b = 1;

    public C0803ba(C0840ca c0840ca, byte b, char c) {
        super(jk4.class);
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: m */
    public final AbstractC1126a mo3497m(AbstractC1126a abstractC1126a) {
        switch (this.f8200b) {
            case 0:
                C3825z9 c3825z9 = (C3825z9) abstractC1126a;
                C3640u9 c3640u9M23180C = C3677v9.m23180C();
                c3640u9M23180C.m22581h();
                byte[] bArrM15648a = kq7.m15648a(c3825z9.m25509x());
                c3640u9M23180C.m22579f(ByteString.m6408g(bArrM15648a, 0, bArrM15648a.length));
                c3640u9M23180C.m22580g(c3825z9.m25510y());
                return (C3677v9) c3640u9M23180C.m22171a();
            case 1:
                C3453pa c3453pa = (C3453pa) abstractC1126a;
                C3641ua c3641ua = (C3641ua) new C0013ab().mo226j().mo3497m(c3453pa.m19002x());
                zj7[] zj7VarArr = {new C0012aa(7, jo5.class)};
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
                Collections.unmodifiableMap(map);
                ju3 ju3VarM19003y = c3453pa.m19003y();
                eu3 eu3VarM12142D = fu3.m12142D();
                eu3VarM12142D.m11341h();
                eu3VarM12142D.m11340g(ju3VarM19003y.m14655z());
                byte[] bArrM15648a2 = kq7.m15648a(ju3VarM19003y.m14654y());
                eu3VarM12142D.m11339f(ByteString.m6408g(bArrM15648a2, 0, bArrM15648a2.length));
                fu3 fu3Var = (fu3) eu3VarM12142D.m22171a();
                C3291la c3291laM16706C = C3328ma.m16706C();
                c3291laM16706C.m16035f(c3641ua);
                c3291laM16706C.m16036g(fu3Var);
                c3291laM16706C.m16037h();
                return (C3328ma) c3291laM16706C.m22171a();
            case 2:
                C3292lb c3292lb = (C3292lb) abstractC1126a;
                C3032gb c3032gbM13171C = C3069hb.m13171C();
                byte[] bArrM15648a3 = kq7.m15648a(c3292lb.m16055x());
                c3032gbM13171C.m12456f(ByteString.m6408g(bArrM15648a3, 0, bArrM15648a3.length));
                c3032gbM13171C.m12457g(c3292lb.m16056y());
                c3032gbM13171C.m12458h();
                return (C3069hb) c3032gbM13171C.m22171a();
            case 3:
                C3716wb c3716wbM24436z = C3753xb.m24436z();
                byte[] bArrM15648a4 = kq7.m15648a(((C0805bc) abstractC1126a).m3604w());
                ByteString byteStringM6408g = ByteString.m6408g(bArrM15648a4, 0, bArrM15648a4.length);
                c3716wbM24436z.m22174d();
                C3753xb.m24435w((C3753xb) c3716wbM24436z.f62440b, byteStringM6408g);
                c3716wbM24436z.m22174d();
                C3753xb.m24434v((C3753xb) c3716wbM24436z.f62440b);
                return (C3753xb) c3716wbM24436z.m22171a();
            case 4:
                C3107ic c3107icM14382A = C3142jc.m14382A();
                byte[] bArrM15648a5 = kq7.m15648a(((C3367nc) abstractC1126a).m17324w());
                c3107icM14382A.m13757f(ByteString.m6408g(bArrM15648a5, 0, bArrM15648a5.length));
                c3107icM14382A.m13758g();
                return (C3142jc) c3107icM14382A.m22171a();
            case 5:
                C3643uc c3643ucM23223z = C3680vc.m23223z();
                byte[] bArrM15648a6 = kq7.m15648a(((C3791yc) abstractC1126a).m25066w());
                ByteString byteStringM6408g2 = ByteString.m6408g(bArrM15648a6, 0, bArrM15648a6.length);
                c3643ucM23223z.m22174d();
                C3680vc.m23222w((C3680vc) c3643ucM23223z.f62440b, byteStringM6408g2);
                c3643ucM23223z.m22174d();
                C3680vc.m23221v((C3680vc) c3643ucM23223z.f62440b);
                return (C3680vc) c3643ucM23223z.m22171a();
            case 6:
                ap0 ap0VarM4019A = bp0.m4019A();
                ap0VarM4019A.m2964g();
                byte[] bArrM15648a7 = kq7.m15648a(32);
                ap0VarM4019A.m2963f(ByteString.m6408g(bArrM15648a7, 0, bArrM15648a7.length));
                return (bp0) ap0VarM4019A.m22171a();
            case 7:
                ju3 ju3Var = (ju3) abstractC1126a;
                eu3 eu3VarM12142D2 = fu3.m12142D();
                eu3VarM12142D2.m11341h();
                eu3VarM12142D2.m11340g(ju3Var.m14655z());
                byte[] bArrM15648a8 = kq7.m15648a(ju3Var.m14654y());
                eu3VarM12142D2.m11339f(ByteString.m6408g(bArrM15648a8, 0, bArrM15648a8.length));
                return (fu3) eu3VarM12142D2.m22171a();
            case 8:
                gk4 gk4VarM13303A = hk4.m13303A();
                gk4VarM13303A.m12719f((jk4) abstractC1126a);
                gk4VarM13303A.m12720g();
                return (hk4) gk4VarM13303A.m22171a();
            case 9:
                nk4 nk4VarM18057A = ok4.m18057A();
                nk4VarM18057A.m17479f((qk4) abstractC1126a);
                nk4VarM18057A.m17480g();
                return (ok4) nk4VarM18057A.m22171a();
            default:
                r9b r9bVarM21175A = s9b.m21175A();
                r9bVarM21175A.m20478g();
                byte[] bArrM15648a9 = kq7.m15648a(32);
                r9bVarM21175A.m20477f(ByteString.m6408g(bArrM15648a9, 0, bArrM15648a9.length));
                return (s9b) r9bVarM21175A.m22171a();
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: t */
    public Map mo3498t() {
        switch (this.f8200b) {
            case 0:
                HashMap map = new HashMap();
                C3788y9 c3788y9M25508z = C3825z9.m25508z();
                c3788y9M25508z.m22174d();
                C3825z9.m25506v((C3825z9) c3788y9M25508z.f62440b);
                C3031ga c3031gaM13151y = C3068ha.m13151y();
                c3031gaM13151y.m22174d();
                C3068ha.m13149v((C3068ha) c3031gaM13151y.f62440b);
                C3068ha c3068ha = (C3068ha) c3031gaM13151y.m22171a();
                c3788y9M25508z.m22174d();
                C3825z9.m25507w((C3825z9) c3788y9M25508z.f62440b, c3068ha);
                C3825z9 c3825z9 = (C3825z9) c3788y9M25508z.m22171a();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType = KeyTemplate$OutputPrefixType.TINK;
                map.put("AES_CMAC", new ej4(c3825z9, keyTemplate$OutputPrefixType));
                C3788y9 c3788y9M25508z2 = C3825z9.m25508z();
                c3788y9M25508z2.m22174d();
                C3825z9.m25506v((C3825z9) c3788y9M25508z2.f62440b);
                C3031ga c3031gaM13151y2 = C3068ha.m13151y();
                c3031gaM13151y2.m22174d();
                C3068ha.m13149v((C3068ha) c3031gaM13151y2.f62440b);
                C3068ha c3068ha2 = (C3068ha) c3031gaM13151y2.m22171a();
                c3788y9M25508z2.m22174d();
                C3825z9.m25507w((C3825z9) c3788y9M25508z2.f62440b, c3068ha2);
                map.put("AES256_CMAC", new ej4((C3825z9) c3788y9M25508z2.m22171a(), keyTemplate$OutputPrefixType));
                C3788y9 c3788y9M25508z3 = C3825z9.m25508z();
                c3788y9M25508z3.m22174d();
                C3825z9.m25506v((C3825z9) c3788y9M25508z3.f62440b);
                C3031ga c3031gaM13151y3 = C3068ha.m13151y();
                c3031gaM13151y3.m22174d();
                C3068ha.m13149v((C3068ha) c3031gaM13151y3.f62440b);
                C3068ha c3068ha3 = (C3068ha) c3031gaM13151y3.m22171a();
                c3788y9M25508z3.m22174d();
                C3825z9.m25507w((C3825z9) c3788y9M25508z3.f62440b, c3068ha3);
                map.put("AES256_CMAC_RAW", new ej4((C3825z9) c3788y9M25508z3.m22171a(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                HashType hashType = HashType.SHA256;
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType2 = KeyTemplate$OutputPrefixType.TINK;
                map2.put("AES128_CTR_HMAC_SHA256", C0840ca.m4434s(16, 16, hashType, keyTemplate$OutputPrefixType2));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType3 = KeyTemplate$OutputPrefixType.RAW;
                map2.put("AES128_CTR_HMAC_SHA256_RAW", C0840ca.m4434s(16, 16, hashType, keyTemplate$OutputPrefixType3));
                map2.put("AES256_CTR_HMAC_SHA256", C0840ca.m4434s(32, 32, hashType, keyTemplate$OutputPrefixType2));
                map2.put("AES256_CTR_HMAC_SHA256_RAW", C0840ca.m4434s(32, 32, hashType, keyTemplate$OutputPrefixType3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType4 = KeyTemplate$OutputPrefixType.TINK;
                map3.put("AES128_EAX", C0840ca.m4435t(16, keyTemplate$OutputPrefixType4));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType5 = KeyTemplate$OutputPrefixType.RAW;
                map3.put("AES128_EAX_RAW", C0840ca.m4435t(16, keyTemplate$OutputPrefixType5));
                map3.put("AES256_EAX", C0840ca.m4435t(32, keyTemplate$OutputPrefixType4));
                map3.put("AES256_EAX_RAW", C0840ca.m4435t(32, keyTemplate$OutputPrefixType5));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType6 = KeyTemplate$OutputPrefixType.TINK;
                map4.put("AES128_GCM", C0840ca.m4436u(16, keyTemplate$OutputPrefixType6));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType7 = KeyTemplate$OutputPrefixType.RAW;
                map4.put("AES128_GCM_RAW", C0840ca.m4436u(16, keyTemplate$OutputPrefixType7));
                map4.put("AES256_GCM", C0840ca.m4436u(32, keyTemplate$OutputPrefixType6));
                map4.put("AES256_GCM_RAW", C0840ca.m4436u(32, keyTemplate$OutputPrefixType7));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType8 = KeyTemplate$OutputPrefixType.TINK;
                map5.put("AES128_GCM_SIV", C0840ca.m4437v(16, keyTemplate$OutputPrefixType8));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType9 = KeyTemplate$OutputPrefixType.RAW;
                map5.put("AES128_GCM_SIV_RAW", C0840ca.m4437v(16, keyTemplate$OutputPrefixType9));
                map5.put("AES256_GCM_SIV", C0840ca.m4437v(32, keyTemplate$OutputPrefixType8));
                map5.put("AES256_GCM_SIV_RAW", C0840ca.m4437v(32, keyTemplate$OutputPrefixType9));
                return Collections.unmodifiableMap(map5);
            case 5:
                HashMap map6 = new HashMap();
                C3754xc c3754xcM25064x = C3791yc.m25064x();
                c3754xcM25064x.m22174d();
                C3791yc.m25063v((C3791yc) c3754xcM25064x.f62440b);
                map6.put("AES256_SIV", new ej4((C3791yc) c3754xcM25064x.m22171a(), KeyTemplate$OutputPrefixType.TINK));
                C3754xc c3754xcM25064x2 = C3791yc.m25064x();
                c3754xcM25064x2.m22174d();
                C3791yc.m25063v((C3791yc) c3754xcM25064x2.f62440b);
                map6.put("AES256_SIV_RAW", new ej4((C3791yc) c3754xcM25064x2.m22171a(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(map6);
            case 6:
                HashMap map7 = new HashMap();
                map7.put("CHACHA20_POLY1305", new ej4(fp0.m11978w(), KeyTemplate$OutputPrefixType.TINK));
                map7.put("CHACHA20_POLY1305_RAW", new ej4(fp0.m11978w(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(map7);
            case 7:
                HashMap map8 = new HashMap();
                HashType hashType2 = HashType.SHA256;
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType10 = KeyTemplate$OutputPrefixType.TINK;
                map8.put("HMAC_SHA256_128BITTAG", C0840ca.m4438w(32, 16, hashType2, keyTemplate$OutputPrefixType10));
                KeyTemplate$OutputPrefixType keyTemplate$OutputPrefixType11 = KeyTemplate$OutputPrefixType.RAW;
                map8.put("HMAC_SHA256_128BITTAG_RAW", C0840ca.m4438w(32, 16, hashType2, keyTemplate$OutputPrefixType11));
                map8.put("HMAC_SHA256_256BITTAG", C0840ca.m4438w(32, 32, hashType2, keyTemplate$OutputPrefixType10));
                map8.put("HMAC_SHA256_256BITTAG_RAW", C0840ca.m4438w(32, 32, hashType2, keyTemplate$OutputPrefixType11));
                HashType hashType3 = HashType.SHA512;
                map8.put("HMAC_SHA512_128BITTAG", C0840ca.m4438w(64, 16, hashType3, keyTemplate$OutputPrefixType10));
                map8.put("HMAC_SHA512_128BITTAG_RAW", C0840ca.m4438w(64, 16, hashType3, keyTemplate$OutputPrefixType11));
                map8.put("HMAC_SHA512_256BITTAG", C0840ca.m4438w(64, 32, hashType3, keyTemplate$OutputPrefixType10));
                map8.put("HMAC_SHA512_256BITTAG_RAW", C0840ca.m4438w(64, 32, hashType3, keyTemplate$OutputPrefixType11));
                map8.put("HMAC_SHA512_512BITTAG", C0840ca.m4438w(64, 64, hashType3, keyTemplate$OutputPrefixType10));
                map8.put("HMAC_SHA512_512BITTAG_RAW", C0840ca.m4438w(64, 64, hashType3, keyTemplate$OutputPrefixType11));
                return Collections.unmodifiableMap(map8);
            case 8:
            case 9:
            default:
                return super.mo3498t();
            case 10:
                HashMap map9 = new HashMap();
                map9.put("XCHACHA20_POLY1305", new ej4(v9b.m23195w(), KeyTemplate$OutputPrefixType.TINK));
                map9.put("XCHACHA20_POLY1305_RAW", new ej4(v9b.m23195w(), KeyTemplate$OutputPrefixType.RAW));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: u */
    public final AbstractC1126a mo3499u(ByteString byteString) {
        switch (this.f8200b) {
            case 0:
                return C3825z9.m25505A(byteString, ox2.m18561a());
            case 1:
                return C3453pa.m18998A(byteString, ox2.m18561a());
            case 2:
                return C3292lb.m16051A(byteString, ox2.m18561a());
            case 3:
                return C0805bc.m3603y(byteString, ox2.m18561a());
            case 4:
                return C3367nc.m17323y(byteString, ox2.m18561a());
            case 5:
                return C3791yc.m25065y(byteString, ox2.m18561a());
            case 6:
                return fp0.m11979x(byteString, ox2.m18561a());
            case 7:
                return ju3.m14650B(byteString, ox2.m18561a());
            case 8:
                return jk4.m14525y(byteString, ox2.m18561a());
            case 9:
                return qk4.m20013A(byteString, ox2.m18561a());
            default:
                return v9b.m23196x(byteString, ox2.m18561a());
        }
    }

    @Override // p000.AbstractC3572sf
    /* JADX INFO: renamed from: z */
    public final void mo3500z(AbstractC1126a abstractC1126a) throws GeneralSecurityException {
        switch (this.f8200b) {
            case 0:
                C3825z9 c3825z9 = (C3825z9) abstractC1126a;
                C0840ca.m4439x(c3825z9.m25510y());
                if (c3825z9.m25509x() == 32) {
                    return;
                }
                v63.m23147y("AesCmacKey size wrong, must be 32 bytes");
                return;
            case 1:
                C3453pa c3453pa = (C3453pa) abstractC1126a;
                new C0013ab().mo226j().mo3500z(c3453pa.m19002x());
                zj7[] zj7VarArr = {new C0012aa(7, jo5.class)};
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
                ju3 ju3VarM19003y = c3453pa.m19003y();
                if (ju3VarM19003y.m14654y() < 16) {
                    v63.m23147y("key too short");
                    return;
                } else {
                    C0840ca.m4440y(ju3VarM19003y.m14655z());
                    vna.m23448a(c3453pa.m19002x().m24429y());
                    return;
                }
            case 2:
                C3292lb c3292lb = (C3292lb) abstractC1126a;
                vna.m23448a(c3292lb.m16055x());
                if (c3292lb.m16056y().m20562x() == 12 || c3292lb.m16056y().m20562x() == 16) {
                    return;
                }
                v63.m23147y("invalid IV size; acceptable values have 12 or 16 bytes");
                return;
            case 3:
                vna.m23448a(((C0805bc) abstractC1126a).m3604w());
                return;
            case 4:
                vna.m23448a(((C3367nc) abstractC1126a).m17324w());
                return;
            case 5:
                C3791yc c3791yc = (C3791yc) abstractC1126a;
                if (c3791yc.m25066w() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + c3791yc.m25066w() + ". Valid keys must have 64 bytes.");
            case 6:
                return;
            case 7:
                ju3 ju3Var = (ju3) abstractC1126a;
                if (ju3Var.m14654y() >= 16) {
                    C0840ca.m4440y(ju3Var.m14655z());
                    return;
                } else {
                    v63.m23147y("key too short");
                    return;
                }
            case 8:
                return;
            case 9:
                qk4 qk4Var = (qk4) abstractC1126a;
                if (qk4Var.m20017y().isEmpty() || !qk4Var.m20018z()) {
                    v63.m23147y("invalid key format: missing KEK URI or DEK template");
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ C0803ba(Class cls) {
        super(cls);
    }

    public C0803ba(C0840ca c0840ca, byte b, int i) {
        super(qk4.class);
    }

    public C0803ba(C0840ca c0840ca, char c) {
        super(C0805bc.class);
    }

    public C0803ba(C0840ca c0840ca, byte b) {
        super(C3292lb.class);
    }

    public C0803ba(C0840ca c0840ca, byte b, boolean z) {
        super(fp0.class);
    }

    public C0803ba(C0840ca c0840ca, int i) {
        super(C3367nc.class);
    }

    public C0803ba(C0840ca c0840ca, byte b, short s) {
        super(v9b.class);
    }

    public C0803ba(C0840ca c0840ca, short s) {
        super(C3791yc.class);
    }

    public C0803ba(C0840ca c0840ca) {
        super(C3453pa.class);
    }

    public C0803ba(C0840ca c0840ca, byte b, byte b2) {
        super(ju3.class);
    }
}
