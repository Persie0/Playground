package p000;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Shader;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.relocation.C0154a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.colorspace.C0308a;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.runtime.internal.C0282a;
import androidx.fragment.app.AbstractC0638f;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$State;
import com.facebook.AccessToken;
import com.facebook.AccessTokenSource;
import com.facebook.FacebookException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class x74 {

    /* JADX INFO: renamed from: a */
    public static final g9c f67878a = new g9c(10);

    /* JADX INFO: renamed from: b */
    public static final bg9 f67879b = new bg9(1.0f, 50.0f, Float.valueOf(0.001f));

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f67880c = 0;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f67881d = 0;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f67882e = 0;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f67883f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f67884g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f67885h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f67886i = 0;

    /* JADX INFO: renamed from: A */
    public static final long m24334A(a44 a44Var, Orientation orientation, z34 z34Var, boolean z) {
        long jM105e;
        float fIntBitsToFloat;
        if (orientation == null) {
            jM105e = a44Var.m105e();
        } else {
            int i = z34Var.f70830a;
            if (i == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (a44Var.m105e() >> 32));
            } else if (i == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (a44Var.m105e() & 4294967295L));
            } else {
                jM105e = a44Var.m105e();
            }
            if (orientation == Orientation.Horizontal) {
                jM105e = (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
            } else {
                jM105e = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            }
        }
        long jM12824e = gq6.m12824e(m24336C(a44Var, orientation, z34Var), jM105e);
        if (z || !a44Var.m108h()) {
            return jM12824e;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: B */
    public static final void m24335B(fb9 fb9Var, InterfaceC3510qt interfaceC3510qt, int i) {
        while (true) {
            int i2 = fb9Var.f38821v;
            if (i > i2 && i < fb9Var.f38820u) {
                return;
            }
            if (i2 == 0 && i == 0) {
                return;
            }
            fb9Var.m11718M();
            if (fb9Var.m11750y(fb9Var.f38821v)) {
                interfaceC3510qt.mo1305k();
            }
            fb9Var.m11735j();
        }
    }

    /* JADX INFO: renamed from: C */
    public static final long m24336C(a44 a44Var, Orientation orientation, z34 z34Var) {
        float fIntBitsToFloat;
        long jFloatToRawIntBits;
        long j;
        if (orientation == null) {
            return a44Var.m103c();
        }
        int i = z34Var.f70830a;
        if (i == 1) {
            fIntBitsToFloat = Float.intBitsToFloat((int) (a44Var.m103c() >> 32));
        } else {
            if (i != 2) {
                return a44Var.m103c();
            }
            fIntBitsToFloat = Float.intBitsToFloat((int) (a44Var.m103c() & 4294967295L));
        }
        if (orientation == Orientation.Horizontal) {
            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat);
            jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = jFloatToRawIntBits2 << 32;
        } else {
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
            j = jFloatToRawIntBits3 << 32;
        }
        return j | (4294967295L & jFloatToRawIntBits);
    }

    /* JADX INFO: renamed from: D */
    public static void m24337D(AccessToken accessToken) {
        w41.f66361h.m22270m().m23714H(accessToken, true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0022  */
    /* JADX INFO: renamed from: E */
    public static final void m24338E(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str, Bundle bundle) {
        AbstractC0638f abstractC0638fM2109k = abstractComponentCallbacksC0635c.m2109k();
        he3 he3Var = (he3) abstractC0638fM2109k.f5753n.get(str);
        if (he3Var != null) {
            if (he3Var.f42251a.mo21327q().isAtLeast(Lifecycle$State.STARTED)) {
                he3Var.f42252b.m21250b(str, bundle);
            } else {
                abstractC0638fM2109k.f5752m.put(str, bundle);
            }
        } else {
            abstractC0638fM2109k.f5752m.put(str, bundle);
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Setting fragment result with key " + str + " and result " + bundle);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m24339F(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, String str, zi3 zi3Var) {
        AbstractC0638f abstractC0638fM2109k = abstractComponentCallbacksC0635c.m2109k();
        sd3 sd3Var = new sd3(zi3Var);
        wb5 wb5Var = abstractComponentCallbacksC0635c.f5709m0;
        if (wb5Var.f66586d == Lifecycle$State.DESTROYED) {
            return;
        }
        ee3 ee3Var = new ee3(abstractC0638fM2109k, str, sd3Var, wb5Var);
        he3 he3Var = (he3) abstractC0638fM2109k.f5753n.put(str, new he3(wb5Var, sd3Var, ee3Var));
        if (he3Var != null) {
            he3Var.f42251a.mo21331x(he3Var.f42253c);
        }
        if (AbstractC0638f.m2128L(2)) {
            Log.v("FragmentManager", "Setting FragmentResultListener with key " + str + " lifecycleOwner " + wb5Var + " and listener " + sd3Var);
        }
        wb5Var.mo21323g(ee3Var);
    }

    /* JADX INFO: renamed from: G */
    public static void m24340G(TextView textView, int i) {
        xwc.m24775m(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final e16 m24341H(e16 e16Var) {
        e16Var.getClass();
        return AbstractC0287b.m1320a(e16Var, new C2914d4(16));
    }

    /* JADX INFO: renamed from: I */
    public static final long m24342I(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: J */
    public static final Shader.TileMode m24343J(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i == 2) {
            return Shader.TileMode.MIRROR;
        }
        if (i == 3 && Build.VERSION.SDK_INT >= 31) {
            return Shader.TileMode.DECAL;
        }
        return Shader.TileMode.CLAMP;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0081  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0090  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0098, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m24344a(final int i, Integer num, final int i2, final int i3, boolean z, final tg9 tg9Var, final tg9 tg9Var2, ye1 ye1Var, final int i4, final int i5) {
        final Integer num2;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        final boolean z4;
        x18 x18VarM22143u;
        boolean z5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(160973095);
        int i10 = (tj3Var.m22116e(i) ? 4 : 2) | i4;
        int i11 = i5 & 2;
        if (i11 != 0) {
            i6 = i10 | 48;
            num2 = num;
        } else {
            num2 = num;
            i6 = i10 | (tj3Var.m22120g(num2) ? 32 : 16);
        }
        int i12 = i6 | (tj3Var.m22116e(i2) ? 256 : 128) | (tj3Var.m22116e(i3) ? 2048 : 1024);
        int i13 = i5 & 16;
        if (i13 == 0) {
            if ((i4 & 24576) == 0) {
                z2 = z;
                i12 |= tj3Var.m22122h(z2) ? 16384 : 8192;
            }
            if (tj3Var.m22124i(tg9Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            int i14 = i12 | i7;
            if (tj3Var.m22124i(tg9Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i14 | i8;
            if ((599187 & i9) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var.m22099R(i9 & 1, z3)) {
                if (i11 != 0) {
                    num2 = null;
                }
                if (i13 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                Context context = (Context) tj3Var.m22128k(yf1.f69763b);
                Integer num3 = num2;
                d32.m10063w(wfb.m23931z(mn3.f51554a, 0.0f, 5), z5 ? new C0282a(-9740708, true, new C3794yf(6, context, tg9Var2)) : null, ((vn2) tj3Var.m22128k(yf1.f69766e)).f65631A, 0.0f, ci8.m4703P(-1110960210, new pr2(context, i, i2, num3, i3, tg9Var), tj3Var), tj3Var, 24576);
                num2 = num3;
                z4 = z5;
            } else {
                tj3Var.m22102U();
                z4 = z2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: qr2
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        x74.m24344a(i, num2, i2, i3, z4, tg9Var, tg9Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i12 |= 24576;
        z2 = z;
        if (tj3Var.m22124i(tg9Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i15 = i12 | i7;
        if (tj3Var.m22124i(tg9Var2)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        i9 = i15 | i8;
        if ((599187 & i9) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var.m22099R(i9 & 1, z3)) {
            if (i11 != 0) {
                num2 = null;
            }
            if (i13 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            Context context2 = (Context) tj3Var.m22128k(yf1.f69763b);
            Integer num4 = num2;
            d32.m10063w(wfb.m23931z(mn3.f51554a, 0.0f, 5), z5 ? new C0282a(-9740708, true, new C3794yf(6, context2, tg9Var2)) : null, ((vn2) tj3Var.m22128k(yf1.f69766e)).f65631A, 0.0f, ci8.m4703P(-1110960210, new pr2(context2, i, i2, num4, i3, tg9Var), tj3Var), tj3Var, 24576);
            num2 = num4;
            z4 = z5;
        } else {
            tj3Var.m22102U();
            z4 = z2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: qr2
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x74.m24344a(i, num2, i2, i3, z4, tg9Var, tg9Var2, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m24345b(a44 a44Var) {
        return a44Var.m106f() && !a44Var.m104d();
    }

    /* JADX INFO: renamed from: c */
    public static final void m24346c(Encoder encoder) {
        encoder.getClass();
        if ((encoder instanceof mk9 ? (mk9) encoder : null) != null) {
            return;
        }
        v63.m23127A(y38.m24933a(encoder.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    /* JADX INFO: renamed from: d */
    public static sa1 m24347d(sa1 sa1Var) {
        i4b i4bVar = AbstractC3184kh.f47266h;
        if (b34.m3243i(sa1Var.f60575b, 12884901888L)) {
            C0308a c0308a = (C0308a) sa1Var;
            i4b i4bVar2 = c0308a.f3941d;
            if (!m24354k(i4bVar2, i4bVar)) {
                return new C0308a(c0308a.f60574a, c0308a.f3945h, i4bVar, m24368y(m24353j(C3400o8.f53963c.f53965b, i4bVar2.m13658a(), i4bVar.m13658a()), c0308a.f3946i), c0308a.f3948k, c0308a.f3951n, c0308a.f3942e, c0308a.f3943f, c0308a.f3944g, -1);
            }
        }
        return sa1Var;
    }

    /* JADX INFO: renamed from: e */
    public static final e16 m24348e(e16 e16Var, eq8 eq8Var) {
        return e16Var.mo3161g(new C3824z8(eq8Var));
    }

    /* JADX INFO: renamed from: f */
    public static void m24349f(StringBuilder sb, Object obj, vi3 vi3Var) {
        if (vi3Var != null) {
            sb.append((CharSequence) vi3Var.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    /* JADX INFO: renamed from: g */
    public static final pf4 m24350g(Decoder decoder) {
        decoder.getClass();
        pf4 pf4Var = decoder instanceof pf4 ? (pf4) decoder : null;
        if (pf4Var != null) {
            return pf4Var;
        }
        v63.m23127A(y38.m24933a(decoder.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static final e16 m24351h(e16 e16Var, C0154a c0154a) {
        return e16Var.mo3161g(new ji0(c0154a));
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m24352i(a44 a44Var) {
        return !a44Var.m106f() && a44Var.m104d();
    }

    /* JADX INFO: renamed from: j */
    public static final float[] m24353j(float[] fArr, float[] fArr2, float[] fArr3) {
        m24369z(fArr, fArr2);
        m24369z(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] fArrM24365v = m24365v(fArr);
        float f = fArr4[0];
        float f2 = fArr[0] * f;
        float f3 = fArr4[1];
        float f4 = fArr[1] * f3;
        float f5 = fArr4[2];
        return m24368y(fArrM24365v, new float[]{f2, f4, fArr[2] * f5, fArr[3] * f, fArr[4] * f3, fArr[5] * f5, f * fArr[6], f3 * fArr[7], f5 * fArr[8]});
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m24354k(i4b i4bVar, i4b i4bVar2) {
        if (i4bVar == i4bVar2) {
            return true;
        }
        return Math.abs(i4bVar.f43526a - i4bVar2.f43526a) < 0.001f && Math.abs(i4bVar.f43527b - i4bVar2.f43527b) < 0.001f;
    }

    /* JADX INFO: renamed from: l */
    public static final ri1 m24355l(sa1 sa1Var, sa1 sa1Var2) {
        if (sa1Var == sa1Var2) {
            return new pi1(sa1Var, sa1Var, 1);
        }
        return (b34.m3243i(sa1Var.f60575b, 12884901888L) && b34.m3243i(sa1Var2.f60575b, 12884901888L)) ? new qi1((C0308a) sa1Var, (C0308a) sa1Var2) : new ri1(sa1Var, sa1Var2, 0);
    }

    /* JADX INFO: renamed from: m */
    public static AccessToken m24356m(JSONObject jSONObject) throws JSONException {
        if (jSONObject.getInt("version") > 1) {
            throw new FacebookException("Unknown AccessToken serialization format.");
        }
        String string = jSONObject.getString("token");
        Date date = new Date(jSONObject.getLong("expires_at"));
        JSONArray jSONArray = jSONObject.getJSONArray("permissions");
        JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("expired_permissions");
        Date date2 = new Date(jSONObject.getLong("last_refresh"));
        String string2 = jSONObject.getString("source");
        string2.getClass();
        AccessTokenSource accessTokenSourceValueOf = AccessTokenSource.valueOf(string2);
        String string3 = jSONObject.getString("application_id");
        String string4 = jSONObject.getString("user_id");
        Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
        String strOptString = jSONObject.optString("graph_domain", null);
        string.getClass();
        string3.getClass();
        string4.getClass();
        jSONArray.getClass();
        ArrayList arrayListM3949f0 = bna.m3949f0(jSONArray);
        jSONArray2.getClass();
        return new AccessToken(string, string3, string4, arrayListM3949f0, bna.m3949f0(jSONArray2), jSONArrayOptJSONArray == null ? new ArrayList() : bna.m3949f0(jSONArrayOptJSONArray), accessTokenSourceValueOf, date, date2, date3, strOptString);
    }

    /* JADX INFO: renamed from: n */
    public static void m24357n(String str, String str2, Object obj) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 3)) {
            Log.d(strConcat, String.format(str2, obj));
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m24358o(InterfaceC0310a interfaceC0310a, int i, long j, float f, float f2) {
        if (i == 1) {
            float f3 = f / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) - f3) - f2;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) / 2.0f;
            InterfaceC0310a.m1417c0(interfaceC0310a, j, f3, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))), 0.0f, null, 120);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) - f) - f2;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - f) / 2.0f;
        InterfaceC0310a.m1414L0(interfaceC0310a, j, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f))), 0.0f, null, 0, 120);
    }

    /* JADX INFO: renamed from: p */
    public static void m24359p(String str, String str2, Exception exc) {
        String strConcat = "TRuntime.".concat(str);
        if (Log.isLoggable(strConcat, 6)) {
            Log.e(strConcat, str2, exc);
        }
    }

    /* JADX INFO: renamed from: q */
    public static boolean m24360q(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: r */
    public static final long m24361r(long j, boolean z, int i, float f) {
        int iM3801i = ((z || i == 2 || i == 4 || i == 5) && bk1.m3797e(j)) ? bk1.m3801i(j) : Integer.MAX_VALUE;
        if (bk1.m3803k(j) != iM3801i) {
            iM3801i = l70.m15945h(xwc.m24773k(f), bk1.m3803k(j), iM3801i);
        }
        return AbstractC3423or.m18278s(0, iM3801i, 0, bk1.m3800h(j));
    }

    /* JADX INFO: renamed from: s */
    public static ConnectivityManager m24362s(Context context) {
        if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            C3386nv.m17636w("Missing permission ACCESS_NETWORK_STATE");
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager;
        }
        C3386nv.m17636w("Unable to get ConnectivityManager");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static AccessToken m24363t() {
        return (AccessToken) w41.f66361h.m22270m().f66367c;
    }

    /* JADX INFO: renamed from: u */
    public static void m24364u(Context context) {
        context.getClass();
        if (ce0.m4568a() != null) {
            ce0.m4568a();
            return;
        }
        ce0 ce0Var = new ce0(context);
        Set set = lp1.f49971a;
        if (!set.contains(ce0.class)) {
            try {
                if (!set.contains(ce0Var)) {
                    try {
                        w41 w41VarM23706r = w41.m23706r((Context) ce0Var.f9962b);
                        w41VarM23706r.getClass();
                        w41VarM23706r.m23709C(ce0Var, new IntentFilter("com.parse.bolts.measurement_event"));
                    } catch (Throwable th) {
                        lp1.m16420a(ce0Var, th);
                    }
                }
            } catch (Throwable th2) {
                lp1.m16420a(ce0.class, th2);
            }
        }
        if (!lp1.f49971a.contains(ce0.class)) {
            try {
                ce0.f9960c = ce0Var;
            } catch (Throwable th3) {
                lp1.m16420a(ce0.class, th3);
            }
        }
        ce0.m4568a();
    }

    /* JADX INFO: renamed from: v */
    public static final float[] m24365v(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float f10 = (f5 * f9) - (f6 * f8);
        float f11 = (f6 * f7) - (f4 * f9);
        float f12 = (f4 * f8) - (f5 * f7);
        float f13 = (f3 * f12) + (f2 * f11) + (f * f10);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f10 / f13;
        fArr2[1] = f11 / f13;
        fArr2[2] = f12 / f13;
        fArr2[3] = ((f3 * f8) - (f2 * f9)) / f13;
        fArr2[4] = ((f9 * f) - (f3 * f7)) / f13;
        fArr2[5] = ((f7 * f2) - (f8 * f)) / f13;
        fArr2[6] = ((f2 * f6) - (f3 * f5)) / f13;
        fArr2[7] = ((f3 * f4) - (f6 * f)) / f13;
        fArr2[8] = ((f * f5) - (f2 * f4)) / f13;
        return fArr2;
    }

    /* JADX INFO: renamed from: w */
    public static boolean m24366w() {
        AccessToken accessToken = (AccessToken) w41.f66361h.m22270m().f66367c;
        return (accessToken == null || new Date().after(accessToken.f11307a)) ? false : true;
    }

    /* JADX INFO: renamed from: x */
    public static final e16 m24367x(e16 e16Var, zg4 zg4Var, nu4 nu4Var, Orientation orientation, boolean z, boolean z2) {
        return e16Var.mo3161g(new qu4(zg4Var, nu4Var, orientation, z, z2));
    }

    /* JADX INFO: renamed from: y */
    public static final float[] m24368y(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f = fArr[0] * fArr2[0];
        float f2 = fArr[3];
        float f3 = fArr2[1];
        float f4 = fArr[6];
        float f5 = fArr2[2];
        fArr3[0] = (f4 * f5) + (f2 * f3) + f;
        float f6 = fArr[1];
        float f7 = fArr2[0];
        float f8 = fArr[4];
        float f9 = fArr[7];
        float f10 = f9 * f5;
        fArr3[1] = f10 + (f3 * f8) + (f6 * f7);
        float f11 = fArr[2] * f7;
        float f12 = fArr[5];
        float f13 = (fArr2[1] * f12) + f11;
        float f14 = fArr[8];
        fArr3[2] = (f5 * f14) + f13;
        float f15 = fArr[0];
        float f16 = fArr2[3] * f15;
        float f17 = fArr2[4];
        float f18 = (f2 * f17) + f16;
        float f19 = fArr2[5];
        fArr3[3] = (f4 * f19) + f18;
        float f20 = fArr[1];
        float f21 = fArr2[3];
        float f22 = f8 * f17;
        fArr3[4] = (f9 * f19) + f22 + (f20 * f21);
        float f23 = fArr[2];
        float f24 = f19 * f14;
        fArr3[5] = f24 + (f12 * fArr2[4]) + (f21 * f23);
        float f25 = f15 * fArr2[6];
        float f26 = fArr[3];
        float f27 = fArr2[7];
        float f28 = (f26 * f27) + f25;
        float f29 = fArr2[8];
        fArr3[6] = (f4 * f29) + f28;
        float f30 = fArr2[6];
        float f31 = f9 * f29;
        fArr3[7] = f31 + (fArr[4] * f27) + (f20 * f30);
        float f32 = f14 * f29;
        fArr3[8] = f32 + (fArr[5] * fArr2[7]) + (f23 * f30);
        return fArr3;
    }

    /* JADX INFO: renamed from: z */
    public static final float[] m24369z(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f = fArr2[0];
        float f2 = fArr2[1];
        float f3 = fArr2[2];
        fArr2[0] = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        fArr2[1] = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        fArr2[2] = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        return fArr2;
    }
}
