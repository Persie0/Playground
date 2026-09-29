package p000;

import android.graphics.drawable.Drawable;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.security.Provider;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class u06 implements g94, h73, InterfaceC3624tu, InterfaceC3735wu, jl1, ns2, c94, c97, pr1, dqb, zc1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63185a;

    /* JADX INFO: renamed from: b */
    public static final u06 f63174b = new u06(1);

    /* JADX INFO: renamed from: c */
    public static final e28 f63175c = new e28(Float.NaN, Float.NaN, Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: d */
    public static final u06 f63176d = new u06(3);

    /* JADX INFO: renamed from: e */
    public static final u06 f63177e = new u06(4);

    /* JADX INFO: renamed from: f */
    public static final u06 f63178f = new u06(5);

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ u06 f63179g = new u06(19);

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ u06 f63180h = new u06(20);

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ u06 f63181i = new u06(21);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ u06 f63182j = new u06(23);

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ u06 f63183k = new u06(24);

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ u06 f63184l = new u06(25);

    /* JADX INFO: renamed from: H */
    public static final /* synthetic */ u06 f63171H = new u06(26);

    /* JADX INFO: renamed from: I */
    public static final /* synthetic */ u06 f63172I = new u06(27);

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ u06 f63173J = new u06(28);

    public /* synthetic */ u06(int i) {
        this.f63185a = i;
    }

    /* JADX INFO: renamed from: e */
    public static final c21 m22375e(u06 u06Var, String str) {
        c21 c21Var = new c21(str);
        c21.f9329d.put(str, c21Var);
        return c21Var;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: a */
    public float mo9967a() {
        return 0.0f;
    }

    @Override // p000.jl1
    /* JADX INFO: renamed from: b */
    public long mo10837b(long j, long j2) {
        if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
            int i = km8.f47515a;
            return jFloatToRawIntBits;
        }
        float fM21636n = AbstractC3584sr.m21636n(j, j2);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fM21636n)) << 32) | (((long) Float.floatToRawIntBits(fM21636n)) & 4294967295L);
        int i2 = km8.f47515a;
        return jFloatToRawIntBits2;
    }

    /* JADX INFO: renamed from: c */
    public void m22376c(Drawable drawable, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(257732500);
        int i2 = (tj3Var.m22124i(drawable) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16 e16VarM4422o = c99.m4422o(b16.f7762a, tl1.f62473e);
            boolean zM22124i = tj3Var.m22124i(drawable);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new cg7(drawable, 24);
                tj3Var.m22131l0(objM22097O);
            }
            qh0.m19963a(vz1.m23654x(e16VarM4422o, (vi3) objM22097O), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(this, i, 18, drawable);
        }
    }

    @Override // p000.ns2
    /* JADX INFO: renamed from: d */
    public Object mo10838d(String str, Provider provider) {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }

    /* JADX INFO: renamed from: f */
    public synchronized c21 m22377f(String str) {
        c21 c21Var;
        String strConcat;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = c21.f9329d;
            c21Var = (c21) linkedHashMap.get(str);
            if (c21Var == null) {
                if (cl9.m4842Y(str, "TLS_", false)) {
                    strConcat = "SSL_".concat(str.substring(4));
                } else {
                    strConcat = cl9.m4842Y(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str;
                }
                c21Var = (c21) linkedHashMap.get(strConcat);
                if (c21Var == null) {
                    c21Var = new c21(str);
                }
                linkedHashMap.put(str, c21Var);
            }
        } catch (Throwable th) {
            throw th;
        }
        return c21Var;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: g */
    public float mo13109g() {
        return 0.0f;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: h */
    public float mo13110h(float f, long j) {
        return 0.0f;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: i */
    public float mo13111i(float f, float f2, long j) {
        return 0.0f;
    }

    @Override // p000.InterfaceC3624tu
    /* JADX INFO: renamed from: j */
    public void mo9968j(fb2 fb2Var, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        if (layoutDirection == LayoutDirection.Ltr) {
            eh0.m11112I(i, iArr, iArr2, false);
        } else {
            eh0.m11112I(i, iArr, iArr2, true);
        }
    }

    @Override // p000.InterfaceC3735wu
    /* JADX INFO: renamed from: k */
    public void mo10843k(fb2 fb2Var, int i, int[] iArr, int[] iArr2) {
        eh0.m11112I(i, iArr, iArr2, false);
    }

    @Override // p000.zc1
    /* JADX INFO: renamed from: l */
    public Object mo3790l(co7 co7Var) {
        return new zu2(co7Var.mo4928c(h06.class));
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: m */
    public long mo13112m(float f) {
        return 0L;
    }

    @Override // p000.h73
    /* JADX INFO: renamed from: p */
    public float mo13113p(float f, float f2) {
        return 0.0f;
    }

    public String toString() {
        switch (this.f63185a) {
            case 7:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }

    @Override // p000.dqb
    public Object zza() {
        switch (this.f63185a) {
            case 19:
                ((pkb) okb.f54499b.f54500a.get()).getClass();
                return new Boolean(((Boolean) pkb.f56387a.get()).booleanValue());
            case 20:
                List list = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.upload.url", 78, "https://app-measurement.com/a").get();
            case 21:
                List list2 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (Long) xjb.f68306a.m19918r("measurement.sgtm.upload.min_delay_after_broadcast", 49, 1000L).get();
            case 22:
            default:
                ((ilb) hlb.f42588b.f42589a.get()).getClass();
                return new Boolean(((Boolean) ilb.f44280a.get()).booleanValue());
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                List list3 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return (String) xjb.f68306a.m19920u("measurement.config.url_authority", 7, "app-measurement.com").get();
            case 24:
                List list4 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.rb.attribution.client.min_ad_services_version", 26, 7L).get()).longValue());
            case 25:
                List list5 = z8c.f71153a;
                wjb.f66949b.get().getClass();
                return Integer.valueOf((int) ((Long) xjb.f68306a.m19918r("measurement.rb.attribution.max_retry_delay_seconds", 54, 16L).get()).longValue());
            case 26:
                List list6 = z8c.f71153a;
                return Boolean.valueOf(skb.m21439a());
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                List list7 = z8c.f71153a;
                blb.f8664b.get().getClass();
                return (Boolean) clb.f10242a.m19916p("measurement.rb.attribution.uuid_generation", 8, true).get();
        }
    }
}
