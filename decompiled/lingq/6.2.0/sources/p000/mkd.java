package p000;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import androidx.compose.material3.C0260q;
import androidx.compose.material3.internal.AbstractC0246h;
import androidx.compose.material3.internal.TextFieldType;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.runtime.internal.C0282a;
import androidx.media3.common.C0713b;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.lingq.core.data.repository.C1286b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.time.Instant;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class mkd implements o9a, p9b, b41, hy5, rt5, xoc, a58 {

    /* JADX INFO: renamed from: a */
    public static mkd f51457a;

    /* JADX INFO: renamed from: b */
    public static final mkd f51458b = new mkd();

    /* JADX INFO: renamed from: c */
    public static final mkd f51459c = new mkd();

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ mkd f51460d = new mkd();

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ mkd f51461e = new mkd();

    public mkd(C1286b c1286b) {
        c1286b.getClass();
    }

    /* JADX INFO: renamed from: d */
    public static final gv5 m16903d(JSONObject jSONObject) throws JSONException {
        String strOptString;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        byte b = 0;
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            String strOptString2 = jSONObjectOptJSONObject.optString("permission");
            strOptString2.getClass();
            if (strOptString2.length() != 0 && !strOptString2.equals("installed") && (strOptString = jSONObjectOptJSONObject.optString("status")) != null) {
                int iHashCode = strOptString.hashCode();
                if (iHashCode != -1309235419) {
                    if (iHashCode != 280295099) {
                        if (iHashCode == 568196142 && strOptString.equals("declined")) {
                            arrayList2.add(strOptString2);
                        }
                    } else if (strOptString.equals("granted")) {
                        arrayList.add(strOptString2);
                    }
                } else if (strOptString.equals("expired")) {
                    arrayList3.add(strOptString2);
                }
            }
        }
        gv5 gv5Var = new gv5(15, b);
        gv5Var.f41394d = arrayList;
        gv5Var.f41392b = arrayList2;
        gv5Var.f41393c = arrayList3;
        return gv5Var;
    }

    /* JADX INFO: renamed from: g */
    public static eu9 m16904g(ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        return m16907k(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, (mx9) tj3Var.m22128k(nx9.f53367a));
    }

    /* JADX INFO: renamed from: h */
    public static eu9 m16905h(long j, long j2, long j3, long j4, long j5, ye1 ye1Var, int i) {
        long j6 = aa1.f412k;
        tj3 tj3Var = (tj3) ye1Var;
        return m16907k(((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a, (mx9) tj3Var.m22128k(nx9.f53367a)).m11348b(j6, j6, j6, j6, (i & 16) != 0 ? j6 : j, (i & 32) != 0 ? j6 : j2, j6, j6, j6, j6, null, (i & 2048) != 0 ? j6 : j3, j4, (i & 8192) != 0 ? j6 : j5, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6, j6);
    }

    /* JADX INFO: renamed from: i */
    public static MediaCodec m16906i(a34 a34Var) throws IOException {
        String str = ((vt5) a34Var.f173a).f65881a;
        Trace.beginSection("createCodec:" + str);
        MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
        Trace.endSection();
        return mediaCodecCreateByCodecName;
    }

    /* JADX INFO: renamed from: k */
    public static eu9 m16907k(pa1 pa1Var, mx9 mx9Var) {
        eu9 eu9Var = pa1Var.f55871o0;
        if (eu9Var != null) {
            if (fa4.m11650l(eu9Var.f37900k, mx9Var)) {
                return eu9Var;
            }
            eu9 eu9VarM11348b = eu9Var.m11348b(eu9Var.f37890a, eu9Var.f37891b, eu9Var.f37892c, eu9Var.f37893d, eu9Var.f37894e, eu9Var.f37895f, eu9Var.f37896g, eu9Var.f37897h, eu9Var.f37898i, eu9Var.f37899j, mx9Var, eu9Var.f37901l, eu9Var.f37902m, eu9Var.f37903n, eu9Var.f37904o, eu9Var.f37905p, eu9Var.f37906q, eu9Var.f37907r, eu9Var.f37908s, eu9Var.f37909t, eu9Var.f37910u, eu9Var.f37911v, eu9Var.f37912w, eu9Var.f37913x, eu9Var.f37914y, eu9Var.f37915z, eu9Var.f37873A, eu9Var.f37874B, eu9Var.f37875C, eu9Var.f37876D, eu9Var.f37877E, eu9Var.f37878F, eu9Var.f37879G, eu9Var.f37880H, eu9Var.f37881I, eu9Var.f37882J, eu9Var.f37883K, eu9Var.f37884L, eu9Var.f37885M, eu9Var.f37886N, eu9Var.f37887O, eu9Var.f37888P, eu9Var.f37889Q);
            pa1Var.f55871o0 = eu9VarM11348b;
            return eu9VarM11348b;
        }
        long jM20491d = ra1.m20491d(pa1Var, c43.f9472y);
        long jM20491d2 = ra1.m20491d(pa1Var, c43.f9440D);
        ColorSchemeKeyTokens colorSchemeKeyTokens = c43.f9454g;
        long jM20491d3 = ra1.m20491d(pa1Var, colorSchemeKeyTokens);
        float f = c43.f9455h;
        long jM198b = aa1.m198b(f, jM20491d3);
        long jM20491d4 = ra1.m20491d(pa1Var, c43.f9466s);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = c43.f9450c;
        long jM20491d5 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d6 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d7 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d8 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d9 = ra1.m20491d(pa1Var, c43.f9449b);
        long jM20491d10 = ra1.m20491d(pa1Var, c43.f9465r);
        long jM20491d11 = ra1.m20491d(pa1Var, c43.f9471x);
        long jM20491d12 = ra1.m20491d(pa1Var, c43.f9448a);
        long jM198b2 = aa1.m198b(c43.f9453f, ra1.m20491d(pa1Var, c43.f9452e));
        long jM20491d13 = ra1.m20491d(pa1Var, c43.f9464q);
        long jM20491d14 = ra1.m20491d(pa1Var, c43.f9437A);
        long jM20491d15 = ra1.m20491d(pa1Var, c43.f9445I);
        long jM198b3 = aa1.m198b(c43.f9459l, ra1.m20491d(pa1Var, c43.f9458k));
        long jM20491d16 = ra1.m20491d(pa1Var, c43.f9468u);
        long jM20491d17 = ra1.m20491d(pa1Var, c43.f9439C);
        long jM20491d18 = ra1.m20491d(pa1Var, c43.f9447K);
        long jM198b4 = aa1.m198b(c43.f9463p, ra1.m20491d(pa1Var, c43.f9462o));
        long jM20491d19 = ra1.m20491d(pa1Var, c43.f9470w);
        long jM20491d20 = ra1.m20491d(pa1Var, c43.f9473z);
        long jM20491d21 = ra1.m20491d(pa1Var, c43.f9444H);
        long jM198b5 = aa1.m198b(c43.f9457j, ra1.m20491d(pa1Var, c43.f9456i));
        long jM20491d22 = ra1.m20491d(pa1Var, c43.f9467t);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = c43.f9441E;
        long jM20491d23 = ra1.m20491d(pa1Var, colorSchemeKeyTokens3);
        long jM20491d24 = ra1.m20491d(pa1Var, colorSchemeKeyTokens3);
        long jM198b6 = aa1.m198b(f, ra1.m20491d(pa1Var, colorSchemeKeyTokens));
        long jM20491d25 = ra1.m20491d(pa1Var, colorSchemeKeyTokens3);
        long jM20491d26 = ra1.m20491d(pa1Var, c43.f9438B);
        long jM20491d27 = ra1.m20491d(pa1Var, c43.f9446J);
        long jM198b7 = aa1.m198b(c43.f9461n, ra1.m20491d(pa1Var, c43.f9460m));
        long jM20491d28 = ra1.m20491d(pa1Var, c43.f9469v);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = c43.f9442F;
        long jM20491d29 = ra1.m20491d(pa1Var, colorSchemeKeyTokens4);
        long jM20491d30 = ra1.m20491d(pa1Var, colorSchemeKeyTokens4);
        long jM198b8 = aa1.m198b(f, ra1.m20491d(pa1Var, colorSchemeKeyTokens4));
        long jM20491d31 = ra1.m20491d(pa1Var, colorSchemeKeyTokens4);
        ColorSchemeKeyTokens colorSchemeKeyTokens5 = c43.f9443G;
        eu9 eu9Var2 = new eu9(jM20491d, jM20491d2, jM198b, jM20491d4, jM20491d5, jM20491d6, jM20491d7, jM20491d8, jM20491d9, jM20491d10, mx9Var, jM20491d11, jM20491d12, jM198b2, jM20491d13, jM20491d14, jM20491d15, jM198b3, jM20491d16, jM20491d17, jM20491d18, jM198b4, jM20491d19, jM20491d20, jM20491d21, jM198b5, jM20491d22, jM20491d23, jM20491d24, jM198b6, jM20491d25, jM20491d26, jM20491d27, jM198b7, jM20491d28, jM20491d29, jM20491d30, jM198b8, jM20491d31, ra1.m20491d(pa1Var, colorSchemeKeyTokens5), ra1.m20491d(pa1Var, colorSchemeKeyTokens5), aa1.m198b(f, ra1.m20491d(pa1Var, colorSchemeKeyTokens5)), ra1.m20491d(pa1Var, colorSchemeKeyTokens5));
        pa1Var.f55871o0 = eu9Var2;
        return eu9Var2;
    }

    /* JADX INFO: renamed from: m */
    public static x17 m16908m() {
        return new x17(16.0f, 4.0f, 16.0f, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public static synchronized void m16909o() {
        if (f51457a == null) {
            f51457a = new mkd();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m16910a(final boolean z, final boolean z2, v56 v56Var, final eu9 eu9Var, final o39 o39Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-818661242);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22122h(z2) ? 32 : 16) | (tj3Var.m22120g(v56Var) ? 256 : 128) | (tj3Var.m22120g(eu9Var) ? 16384 : 8192) | (tj3Var.m22120g(o39Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (38347923 & i2) != 38347922)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            boolean z3 = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = new v66(v56Var);
                tj3Var.m22131l0(objM22097O);
            }
            v66 v66Var = (v66) objM22097O;
            final l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.FastEffects, tj3Var);
            boolean zM22124i = ((i2 & 14) == 4) | ((((57344 & i2) ^ 24576) > 16384 && tj3Var.m22120g(eu9Var)) || (i2 & 24576) == 16384) | ((((i2 & 458752) ^ 196608) > 131072 && tj3Var.m22120g(o39Var)) || (i2 & 196608) == 131072) | ((i2 & 112) == 32) | tj3Var.m22124i(l43VarM21705c0);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                vl9 vl9Var = new vl9() { // from class: fu9
                    @Override // p000.vl9
                    /* JADX INFO: renamed from: a */
                    public final void mo11427a(t78 t78Var) {
                        t78Var.m21886g((byte) 53);
                        em9 em9Var = t78Var.f61945c;
                        if (em9Var != null) {
                            em9Var.f37499b |= 8;
                            em9Var.f37475E = o39Var;
                        }
                        final eu9 eu9Var2 = eu9Var;
                        final boolean z4 = z;
                        final boolean z5 = z2;
                        t78Var.m21882c(eu9Var2.m11347a(z4, z5, false));
                        final l43 l43Var = l43VarM21705c0;
                        ss5.m21725w(t78Var, new vl9() { // from class: gu9
                            @Override // p000.vl9
                            /* JADX INFO: renamed from: a */
                            public final void mo11427a(t78 t78Var2) {
                                final eu9 eu9Var3 = eu9Var2;
                                final boolean z6 = z4;
                                final boolean z7 = z5;
                                vl9 vl9Var2 = new vl9() { // from class: hu9
                                    @Override // p000.vl9
                                    /* JADX INFO: renamed from: a */
                                    public final void mo11427a(t78 t78Var3) {
                                        t78Var3.m21882c(eu9Var3.m11347a(z6, z7, true));
                                    }
                                };
                                l43 l43Var2 = l43Var;
                                t78Var2.m21881b(l43Var2, l43Var2, vl9Var2);
                            }
                        });
                    }
                };
                tj3Var.m22131l0(vl9Var);
                objM22097O2 = vl9Var;
            }
            vl9 vl9Var2 = (vl9) objM22097O2;
            qh0.m19963a((vl9Var2 == ul9.f64048a ? b16.f7762a : new xl9(v66Var, vl9Var2).mo3161g(yl9.f70033b)).mo3161g(new C0260q(z, z2, v56Var, eu9Var, o39Var)), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new o48(this, z, z2, v56Var, eu9Var, o39Var, i, 3);
        }
    }

    @Override // p000.a58
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = ltc.f50124l;
    }

    @Override // p000.o9a
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // p000.rt5
    /* JADX INFO: renamed from: b */
    public st5 mo11840b(a34 a34Var) {
        MediaCodec mediaCodecM16906i = null;
        try {
            mediaCodecM16906i = m16906i(a34Var);
            Trace.beginSection("configureCodec");
            Surface surface = (Surface) a34Var.f176d;
            mediaCodecM16906i.configure((MediaFormat) a34Var.f174b, surface, (MediaCrypto) a34Var.f177e, (surface == null && ((vt5) a34Var.f173a).f65888h && Build.VERSION.SDK_INT >= 35) ? 8 : 0);
            Trace.endSection();
            Trace.beginSection("startCodec");
            mediaCodecM16906i.start();
            Trace.endSection();
            return new p33(mediaCodecM16906i, (C3309ls) a34Var.f178f);
        } catch (IOException | RuntimeException e) {
            if (mediaCodecM16906i != null) {
                mediaCodecM16906i.release();
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16911c(final String str, final zi3 zi3Var, final boolean z, final boolean z2, final kwa kwaVar, final v56 v56Var, final boolean z3, final zi3 zi3Var2, final zi3 zi3Var3, final zi3 zi3Var4, final zi3 zi3Var5, final zi3 zi3Var6, final o39 o39Var, final eu9 eu9Var, t17 t17Var, zi3 zi3Var7, ye1 ye1Var, final int i) {
        int i2;
        boolean z4;
        v56 v56Var2;
        tj3 tj3Var;
        final t17 t17Var2;
        final zi3 zi3Var8;
        int i3;
        t17 x17Var;
        zi3 zi3VarM4703P;
        C0282a c0282a;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1806980801);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= tj3Var2.m22122h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(kwaVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            v56Var2 = v56Var;
            i2 |= tj3Var2.m22120g(v56Var2) ? 131072 : 65536;
        } else {
            v56Var2 = v56Var;
        }
        if ((i & 1572864) == 0) {
            i2 |= tj3Var2.m22122h(z3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var3) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var4) ? 536870912 : 268435456;
        }
        int i4 = 100663296 | (tj3Var2.m22124i(zi3Var5) ? 4 : 2) | (tj3Var2.m22124i(null) ? 32 : 16) | (tj3Var2.m22124i(null) ? 256 : 128) | (tj3Var2.m22124i(zi3Var6) ? 2048 : 1024) | (tj3Var2.m22120g(o39Var) ? 16384 : 8192) | (tj3Var2.m22120g(eu9Var) ? 131072 : 65536) | 13107200;
        if (tj3Var2.m22099R(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i4) == 38347922) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                i3 = i4 & (-3670017);
                x17Var = zi3Var2 == null ? new x17(16.0f, 16.0f, 16.0f, 16.0f) : new x17(16.0f, 8.0f, 16.0f, 8.0f);
                zi3VarM4703P = ci8.m4703P(417908150, new j07(z, z3, v56Var2, eu9Var, o39Var, 3), tj3Var2);
            } else {
                tj3Var2.m22102U();
                i3 = i4 & (-3670017);
                x17Var = t17Var;
                zi3VarM4703P = zi3Var7;
            }
            tj3Var2.m22140r();
            boolean z5 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
            Object objM22097O = tj3Var2.m22097O();
            if (z5 || objM22097O == we1.f66679a) {
                objM22097O = kwaVar.mo4329a(new C3419on(str));
                tj3Var2.m22131l0(objM22097O);
            }
            String str2 = ((n9a) objM22097O).f52522a.f54604b;
            TextFieldType textFieldType = TextFieldType.Filled;
            cv9 cv9Var = new cv9();
            if (zi3Var2 == null) {
                tj3Var2.m22111b0(-1353147063);
                tj3Var2.m22139q(false);
                c0282a = null;
            } else {
                tj3Var2.m22111b0(-1353147062);
                C0282a c0282aM4703P = ci8.m4703P(1110058497, new wu8(2, zi3Var2), tj3Var2);
                tj3Var2.m22139q(false);
                c0282a = c0282aM4703P;
            }
            int i5 = i2 >> 9;
            int i6 = i3 << 21;
            tj3Var = tj3Var2;
            AbstractC0246h.m1166a(textFieldType, str2, zi3Var, cv9Var, c0282a, zi3Var3, zi3Var4, zi3Var5, null, zi3Var6, z4, z, z3, v56Var, x17Var, eu9Var, zi3VarM4703P, tj3Var, ((i2 << 3) & 896) | 6 | (458752 & i5) | (i5 & 3670016) | (i6 & 29360128) | (i6 & 234881024) | (i6 & 1879048192), ((i3 << 3) & 3670016) | ((i2 >> 3) & 57344) | ((i3 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i5 & 7168) | 12582912);
            t17Var2 = x17Var;
            zi3Var8 = zi3VarM4703P;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            t17Var2 = t17Var;
            zi3Var8 = zi3Var7;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: iu9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    this.f44609a.m16911c(str, zi3Var, z, z2, kwaVar, v56Var, z3, zi3Var2, zi3Var3, zi3Var4, zi3Var5, zi3Var6, o39Var, eu9Var, t17Var2, zi3Var8, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    @Override // p000.b41
    /* JADX INFO: renamed from: e */
    public Instant mo3285e() {
        Instant instant = Instant.f47731c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = jCurrentTimeMillis / 1000;
        if ((jCurrentTimeMillis ^ 1000) < 0 && j * 1000 != jCurrentTimeMillis) {
            j--;
        }
        long j2 = jCurrentTimeMillis % 1000;
        int i = (int) ((j2 + (1000 & (((j2 ^ 1000) & ((-j2) | j2)) >> 63))) * 1000000);
        if (j < -31557014167219200L) {
            return Instant.f47731c;
        }
        return j > 31556889864403199L ? Instant.f47732d : wfb.m23920o(j, i);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0084  */
    @Override // p000.p9b
    /* JADX INFO: renamed from: f */
    public ad0 mo4915f(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) {
        int i;
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        zc0 zc0VarM11354c;
        boolean z;
        int iAbs;
        zc0 zc0VarM11353b;
        int i8;
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        EncodeHintType encodeHintType = EncodeHintType.CHARACTER_SET;
        if (enumMap.containsKey(encodeHintType)) {
            charsetForName = Charset.forName(enumMap.get(encodeHintType).toString());
        }
        EncodeHintType encodeHintType2 = EncodeHintType.ERROR_CORRECTION;
        int i9 = enumMap.containsKey(encodeHintType2) ? Integer.parseInt(enumMap.get(encodeHintType2).toString()) : 33;
        EncodeHintType encodeHintType3 = EncodeHintType.AZTEC_LAYERS;
        int i10 = enumMap.containsKey(encodeHintType3) ? Integer.parseInt(enumMap.get(encodeHintType3).toString()) : 0;
        if (barcodeFormat != BarcodeFormat.AZTEC) {
            C3386nv.m17626m("Can only encode AZTEC, but got ".concat(String.valueOf(barcodeFormat)));
            return null;
        }
        byte[] bytes = str.getBytes(charsetForName);
        List<ch9> listSingletonList = Collections.singletonList(ch9.f10094e);
        int i11 = 0;
        while (true) {
            int i12 = 4;
            boolean z2 = true;
            i = 2;
            c = '\n';
            i2 = 5;
            i3 = 3;
            i4 = 32;
            if (i11 >= bytes.length) {
                break;
            }
            int i13 = i11 + 1;
            byte b = i13 < bytes.length ? bytes[i13] : (byte) 0;
            byte b2 = bytes[i11];
            if (b2 != 13) {
                if (b2 != 44) {
                    if (b2 != 46) {
                        if (b2 != 58 || b != 32) {
                            i2 = 0;
                        }
                    } else if (b == 32) {
                        i2 = 3;
                    } else {
                        i2 = 0;
                    }
                } else if (b == 32) {
                    i2 = 4;
                } else {
                    i2 = 0;
                }
            } else if (b == 10) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                LinkedList linkedList = new LinkedList();
                for (ch9 ch9Var : listSingletonList) {
                    ch9 ch9VarM4660b = ch9Var.m4660b(i11);
                    linkedList.add(ch9VarM4660b.m4662d(4, i2));
                    if (ch9Var.f10095a != 4) {
                        linkedList.add(ch9VarM4660b.m4663e(4, i2));
                    }
                    if (i2 == 3 || i2 == 4) {
                        linkedList.add(ch9VarM4660b.m4662d(2, 16 - i2).m4662d(2, 1));
                    }
                    if (ch9Var.f10097c > 0) {
                        linkedList.add(ch9Var.m4659a(i11).m4659a(i13));
                    }
                }
                listSingletonList = us3.m22897a(linkedList);
                i11 = i13;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (ch9 ch9Var2 : listSingletonList) {
                    char c2 = (char) (bytes[i11] & 255);
                    int[][] iArr = us3.f64285c;
                    int i14 = ch9Var2.f10095a;
                    boolean z3 = iArr[i14][c2] > 0 ? z2 : false;
                    ch9 ch9VarM4660b2 = null;
                    int i15 = 0;
                    while (i15 <= i12) {
                        boolean z4 = z2;
                        int i16 = iArr[i15][c2];
                        if (i16 > 0) {
                            if (ch9VarM4660b2 == null) {
                                ch9VarM4660b2 = ch9Var2.m4660b(i11);
                            }
                            if (!z3 || i15 == i14 || i15 == 2) {
                                linkedList2.add(ch9VarM4660b2.m4662d(i15, i16));
                            }
                            if (!z3 && us3.f64286d[i14][i15] >= 0) {
                                linkedList2.add(ch9VarM4660b2.m4663e(i15, i16));
                            }
                        }
                        i15++;
                        z2 = z4;
                        i12 = 4;
                    }
                    boolean z5 = z2;
                    if (ch9Var2.f10097c > 0 || iArr[i14][c2] == 0) {
                        linkedList2.add(ch9Var2.m4659a(i11));
                    }
                    z2 = z5;
                    i12 = 4;
                }
                listSingletonList = us3.m22897a(linkedList2);
            }
            i11++;
        }
        ch9 ch9Var3 = (ch9) Collections.min(listSingletonList, new ma3(19));
        ch9Var3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (b2a b2aVar = ch9Var3.m4660b(bytes.length).f10096b; b2aVar != null; b2aVar = b2aVar.f7809a) {
            linkedList3.addFirst(b2aVar);
        }
        zc0 zc0Var = new zc0();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((b2a) it.next()).mo3196a(zc0Var, bytes);
        }
        int i17 = zc0Var.f71347b;
        int iM13352a = hn1.m13352a(i17, i9, 100, 11);
        int i18 = i17 + iM13352a;
        int[] iArr2 = euc.f37920a;
        if (i10 != 0) {
            z = i10 < 0;
            iAbs = Math.abs(i10);
            if (iAbs > (z ? 4 : 32)) {
                C3386nv.m17626m(ux5.m22989l("Illegal value ", i10, " for layers"));
                return null;
            }
            i5 = ((z ? 88 : 112) + (iAbs << 4)) * iAbs;
            i7 = iArr2[iAbs];
            int i19 = i5 - (i5 % i7);
            zc0VarM11354c = euc.m11354c(zc0Var, i7);
            int i20 = zc0VarM11354c.f71347b;
            if (iM13352a + i20 > i19) {
                C3386nv.m17626m("Data to large for user specified layer");
                return null;
            }
            if (z && i20 > (i7 << 6)) {
                C3386nv.m17626m("Data to large for user specified layer");
                return null;
            }
        } else {
            zc0 zc0VarM11354c2 = null;
            int i21 = 0;
            int i22 = 0;
            while (true) {
                if (i21 > i4) {
                    C3386nv.m17626m("Data too large for an Aztec code");
                    return null;
                }
                boolean z6 = i21 <= i3;
                int i23 = z6 ? i21 + 1 : i21;
                i5 = ((z6 ? 88 : 112) + (i23 << 4)) * i23;
                if (i18 <= i5) {
                    if (zc0VarM11354c2 == null || i22 != iArr2[i23]) {
                        i6 = iArr2[i23];
                        zc0VarM11354c2 = euc.m11354c(zc0Var, i6);
                    } else {
                        i6 = i22;
                    }
                    int i24 = i5 - (i5 % i6);
                    if ((!z6 || zc0VarM11354c2.f71347b <= (i6 << 6)) && zc0VarM11354c2.f71347b + iM13352a <= i24) {
                        i7 = i6;
                        zc0VarM11354c = zc0VarM11354c2;
                        z = z6;
                        iAbs = i23;
                        break;
                    }
                    i22 = i6;
                }
                i21++;
                i2 = i2;
                c = c;
                i = i;
                i3 = 3;
                i4 = 32;
            }
        }
        zc0 zc0VarM11353b2 = euc.m11353b(zc0VarM11354c, i5, i7);
        int i25 = zc0VarM11354c.f71347b / i7;
        zc0 zc0Var2 = new zc0();
        if (z) {
            zc0Var2.m25545b(iAbs - 1, i);
            zc0Var2.m25545b(i25 - 1, 6);
            zc0VarM11353b = euc.m11353b(zc0Var2, 28, 4);
        } else {
            zc0Var2.m25545b(iAbs - 1, i2);
            zc0Var2.m25545b(i25 - 1, 11);
            zc0VarM11353b = euc.m11353b(zc0Var2, 40, 4);
        }
        int i26 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr3 = new int[i26];
        if (z) {
            for (int i27 = 0; i27 < i26; i27++) {
                iArr3[i27] = i27;
            }
            i8 = i26;
        } else {
            int i28 = i26 / 2;
            i8 = (((i28 - 1) / 15) * i) + i26 + 1;
            int i29 = i8 / 2;
            for (int i30 = 0; i30 < i28; i30++) {
                int i31 = (i30 / 15) + i30;
                iArr3[(i28 - i30) - 1] = (i29 - i31) - 1;
                iArr3[i28 + i30] = i31 + i29 + 1;
            }
        }
        ad0 ad0Var = new ad0(i8, i8);
        int i32 = 0;
        int i33 = 0;
        while (i32 < iAbs) {
            int i34 = ((iAbs - i32) << i) + (z ? 9 : 12);
            for (int i35 = 0; i35 < i34; i35++) {
                int i36 = i35 << 1;
                int i37 = 0;
                while (i37 < i) {
                    int i38 = i;
                    if (zc0VarM11353b2.m25547d(i33 + i36 + i37)) {
                        int i39 = i32 << 1;
                        ad0Var.m273b(iArr3[i39 + i37], iArr3[i39 + i35]);
                    }
                    if (zc0VarM11353b2.m25547d((i34 << 1) + i33 + i36 + i37)) {
                        int i40 = i32 << 1;
                        ad0Var.m273b(iArr3[i40 + i35], iArr3[((i26 - 1) - i40) - i37]);
                    }
                    if (zc0VarM11353b2.m25547d((i34 << 2) + i33 + i36 + i37)) {
                        int i41 = (i26 - 1) - (i32 << 1);
                        ad0Var.m273b(iArr3[i41 - i37], iArr3[i41 - i35]);
                    }
                    if (zc0VarM11353b2.m25547d((i34 * 6) + i33 + i36 + i37)) {
                        int i42 = i32 << 1;
                        ad0Var.m273b(iArr3[((i26 - 1) - i42) - i35], iArr3[i42 + i37]);
                    }
                    i37++;
                    i = i38;
                }
            }
            i33 += i34 << 3;
            i32++;
            i = i;
        }
        int i43 = i8 / 2;
        if (z) {
            for (int i44 = 0; i44 < 7; i44++) {
                int i45 = (i43 - 3) + i44;
                if (zc0VarM11353b.m25547d(i44)) {
                    ad0Var.m273b(i45, i43 - 5);
                }
                if (zc0VarM11353b.m25547d(i44 + 7)) {
                    ad0Var.m273b(i43 + 5, i45);
                }
                if (zc0VarM11353b.m25547d(20 - i44)) {
                    ad0Var.m273b(i45, i43 + 5);
                }
                if (zc0VarM11353b.m25547d(27 - i44)) {
                    ad0Var.m273b(i43 - 5, i45);
                }
            }
        } else {
            for (int i46 = 0; i46 < 10; i46++) {
                int i47 = (i46 / 5) + (i43 - 5) + i46;
                if (zc0VarM11353b.m25547d(i46)) {
                    ad0Var.m273b(i47, i43 - 7);
                }
                if (zc0VarM11353b.m25547d(i46 + 10)) {
                    ad0Var.m273b(i43 + 7, i47);
                }
                if (zc0VarM11353b.m25547d(29 - i46)) {
                    ad0Var.m273b(i47, i43 + 7);
                }
                if (zc0VarM11353b.m25547d(39 - i46)) {
                    ad0Var.m273b(i43 - 7, i47);
                }
            }
        }
        if (z) {
            euc.m11352a(ad0Var, i43, 5);
        } else {
            euc.m11352a(ad0Var, i43, 7);
            int i48 = 0;
            int i49 = 0;
            while (i48 < (i26 / 2) - 1) {
                for (int i50 = i43 & 1; i50 < i8; i50 += 2) {
                    int i51 = i43 - i49;
                    ad0Var.m273b(i51, i50);
                    int i52 = i43 + i49;
                    ad0Var.m273b(i52, i50);
                    ad0Var.m273b(i50, i51);
                    ad0Var.m273b(i50, i52);
                }
                i48 += 15;
                i49 += 16;
            }
        }
        int i53 = ad0Var.f503a;
        int iMax = Math.max(200, i53);
        int i54 = ad0Var.f504b;
        int iMax2 = Math.max(200, i54);
        int iMin = Math.min(iMax / i53, iMax2 / i54);
        int i55 = (iMax - (i53 * iMin)) / 2;
        int i56 = (iMax2 - (i54 * iMin)) / 2;
        ad0 ad0Var2 = new ad0(iMax, iMax2);
        int i57 = 0;
        while (i57 < i54) {
            int i58 = i55;
            int i59 = 0;
            while (i59 < i53) {
                if (ad0Var.m272a(i59, i57)) {
                    ad0Var2.m274c(i58, i56, iMin, iMin);
                }
                i59++;
                i58 += iMin;
            }
            i57++;
            i56 += iMin;
        }
        return ad0Var2;
    }

    /* JADX INFO: renamed from: j */
    public h3d m16912j(C0713b c0713b) {
        String str = c0713b.f6406o;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new C3272ks(i2);
                case "application/x-icy":
                    return new vy3();
                case "application/id3":
                    return new zy3(null);
                case "application/x-emsg":
                    return new C3272ks(i);
                case "application/x-scte35":
                    return new of9();
            }
        }
        C3386nv.m17626m(AbstractC3393o1.m17734i("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    /* JADX INFO: renamed from: l */
    public int m16913l(C0713b c0713b) {
        return c0713b.f6410s != null ? 1 : 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m16914n(C0713b c0713b) {
        String str = c0713b.f6406o;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    public /* synthetic */ mkd() {
    }
}
