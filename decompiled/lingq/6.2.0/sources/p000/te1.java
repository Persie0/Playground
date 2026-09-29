package p000;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.material3.C0233h;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002ui.graphics.colorspace.C0308a;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.spatial.C0429a;
import androidx.compose.p002ui.unit.LayoutDirection;
import com.iterable.iterableapi.IterableActionSource;
import com.lingq.core.p012ui.R$string;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C3209b;
import kotlinx.serialization.KSerializer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class te1 {

    /* JADX INFO: renamed from: a */
    public static final Class[] f62177a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    /* JADX INFO: renamed from: b */
    public static final KSerializer[] f62178b = new KSerializer[0];

    /* JADX INFO: renamed from: c */
    public static final wx8 f62179c = new wx8(5);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f62180d = 0;

    /* JADX INFO: renamed from: e */
    public static C3329mb f62181e;

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ int f62182f = 0;

    /* JADX INFO: renamed from: g */
    public static final /* synthetic */ int f62183g = 0;

    /* JADX INFO: renamed from: h */
    public static final /* synthetic */ int f62184h = 0;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f62185i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f62186j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f62187k = 0;

    /* JADX INFO: renamed from: A */
    public static final e16 m21968A(e16 e16Var, aj3 aj3Var) {
        return e16Var.mo3161g(new bq4(aj3Var));
    }

    /* JADX INFO: renamed from: B */
    public static final l39 m21969B(l39 l39Var, l39 l39Var2, float f) {
        return new l39(d32.m10026X(l39Var.f48993a, l39Var2.f48993a, f), ss5.m21688O(l39Var.f48994b, l39Var2.f48994b, f), AbstractC3423or.m18232Q(l39Var.f48995c, l39Var2.f48995c, f));
    }

    /* JADX INFO: renamed from: C */
    public static final kn1 m21970C(un1 un1Var, kn1 kn1Var) {
        kn1 kn1VarM22004r = m22004r(un1Var.mo1309x(), kn1Var, true);
        v72 v72Var = ph2.f56212a;
        return (kn1VarM22004r == v72Var || kn1VarM22004r.get(jj5.f45612c) != null) ? kn1VarM22004r : kn1VarM22004r.plus(v72Var);
    }

    /* JADX INFO: renamed from: D */
    public static vf0 m21971D(boolean z, ye1 ye1Var, int i) {
        long jM10012J;
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(2106917102);
            jM10012J = ra1.m20492e(e07.m10782d(), tj3Var);
            tj3Var.m22139q(false);
        } else {
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(2106996493);
            jM10012J = d32.m10012J(aa1.m198b(0.12f, ra1.m20492e(e07.m10780b(), tj3Var2)), ra1.m20492e(zo2.m25717a(), tj3Var2));
            tj3Var2.m22139q(false);
        }
        tj3 tj3Var3 = (tj3) ye1Var;
        boolean zM22118f = tj3Var3.m22118f(jM10012J);
        Object objM22097O = tj3Var3.m22097O();
        if (zM22118f || objM22097O == we1.f66679a) {
            objM22097O = ci8.m4714a(e07.m10783e(), jM10012J);
            tj3Var3.m22131l0(objM22097O);
        }
        return (vf0) objM22097O;
    }

    /* JADX INFO: renamed from: E */
    public static mn0 m21972E(long j, ye1 ye1Var) {
        mn0 mn0Var;
        long jM20489b = ra1.m20489b(j, ye1Var);
        long j2 = aa1.f412k;
        long jM198b = aa1.m198b(0.38f, ra1.m20489b(j, ye1Var));
        pa1 pa1Var = ((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a;
        mn0 mn0Var2 = pa1Var.f55843a0;
        if (mn0Var2 == null) {
            mn0 mn0Var3 = new mn0(ra1.m20491d(pa1Var, e07.m10779a()), ra1.m20488a(pa1Var, ra1.m20491d(pa1Var, e07.m10779a())), ra1.m20491d(pa1Var, e07.m10779a()), aa1.m198b(0.38f, ra1.m20488a(pa1Var, ra1.m20491d(pa1Var, e07.m10779a()))));
            pa1Var.f55843a0 = mn0Var3;
            mn0Var = mn0Var3;
            jM20489b = jM20489b;
        } else {
            mn0Var = mn0Var2;
        }
        return mn0Var.m16934a(j, jM20489b, j2, jM198b);
    }

    /* JADX INFO: renamed from: F */
    public static boolean m21973F(Context context) {
        C3329mb c3329mb = f62181e;
        if (c3329mb == null) {
            return false;
        }
        fb4 fb4Var = fb4.f38769t;
        Intent intent = (Intent) c3329mb.f50860b;
        fb4Var.getClass();
        Bundle extras = intent.getExtras();
        if (extras != null && extras.containsKey("itbl")) {
            qgd.m19958e(extras);
        }
        fb4 fb4Var2 = fb4.f38769t;
        mc4 mc4Var = (mc4) c3329mb.f50861c;
        fb4Var2.getClass();
        C3354n c3354n = new C3354n(mc4Var.m16762b(), mc4Var.m16764d(), mc4Var.m16765e());
        Context context2 = fb4Var2.f38770a;
        if (context2 == null) {
            eh0.m11135p("IterableApi", "setAttributionInfo: Iterable SDK is not initialized with a context.");
        } else {
            SharedPreferences sharedPreferences = context2.getSharedPreferences("com.iterable.iterableapi", 0);
            String string = c3354n.m17163a().toString();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("itbl_attribution_info_object", string);
            editorEdit.putLong("itbl_attribution_info_expiration", System.currentTimeMillis() + 86400000);
            editorEdit.apply();
        }
        final fb4 fb4Var3 = fb4.f38769t;
        final int iM16762b = ((mc4) c3329mb.f50861c).m16762b();
        final int iM16765e = ((mc4) c3329mb.f50861c).m16765e();
        final String strM16764d = ((mc4) c3329mb.f50861c).m16764d();
        final JSONObject jSONObject = (JSONObject) c3329mb.f50863e;
        fb4Var3.getClass();
        Runnable runnable = new Runnable() { // from class: cb4
            @Override // java.lang.Runnable
            public final void run() {
                int i = iM16762b;
                int i2 = iM16765e;
                JSONObject jSONObject2 = jSONObject;
                fb4 fb4Var4 = fb4Var3;
                String str = strM16764d;
                if (str == null) {
                    fb4Var4.getClass();
                    eh0.m11135p("IterableApi", "messageId is null");
                    return;
                }
                bl2 bl2Var = fb4Var4.f38780k;
                JSONObject jSONObject3 = new JSONObject();
                try {
                    bl2Var.m3855l(jSONObject3);
                    jSONObject3.put("campaignId", i);
                    jSONObject3.put("templateId", i2);
                    jSONObject3.put("messageId", str);
                    jSONObject3.putOpt("dataFields", jSONObject2);
                    bl2Var.m3835P("events/trackPushOpen", jSONObject3);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        };
        fb4.m11689k(strM16764d);
        gc4 gc4Var = jb4.f45378a;
        runnable.run();
        ck6 ck6Var = (ck6) c3329mb.f50862d;
        IterableActionSource iterableActionSource = IterableActionSource.PUSH;
        boolean zM15193a = kgd.m15193a(context, ck6Var);
        if (zM15193a) {
            f62181e = null;
        }
        return zM15193a;
    }

    /* JADX INFO: renamed from: G */
    public static String m21974G(String str, pj5 pj5Var) {
        try {
            ClassLoader classLoader = te1.class.getClassLoader();
            InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str) : null;
            if (resourceAsStream == null) {
                return null;
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, yu0.f70463a), 8192);
            try {
                String line = bufferedReader.readLine();
                String string = line != null ? vk9.m23376L0(line).toString() : null;
                bufferedReader.close();
                return string;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            if (pj5Var != null) {
                pj5Var.mo16256b("Failed to read version from " + str + ": " + e);
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m21975H(ea2 ea2Var) {
        C3408og c3408og;
        C0357g c0357gM21979L = m21979L(ea2Var);
        if (c0357gM21979L.f4322O || (c3408og = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357gM21979L)).f4697g0) == null) {
            return;
        }
        Rect rect = c3408og.f54295f;
        C0429a c0429a = c3408og.f54293d;
        C0357g c0357g = (C0357g) c0429a.f5029a.m10152b(c0357gM21979L.f4336b);
        if (c0357g == null || c0357g.f4346g == -4) {
            return;
        }
        C3047gq c3047gq = c0429a.f5031c;
        int iM1876e = c0429a.m1876e(c0357g);
        long[] jArr = (long[]) c3047gq.f41172c;
        long j = jArr[iM1876e];
        long j2 = jArr[iM1876e + 1];
        rect.set((int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        c3408og.f54290a.m12115v().requestAutofill(c3408og.f54292c, c0357gM21979L.f4336b, rect);
    }

    /* JADX INFO: renamed from: I */
    public static final AbstractC0362l m21976I(ea2 ea2Var, int i) {
        AbstractC0362l abstractC0362l = ((d16) ea2Var).f34837a.f34844h;
        abstractC0362l.getClass();
        if (abstractC0362l.mo1543f1() != ea2Var || !tl6.m22199g(i)) {
            return abstractC0362l;
        }
        AbstractC0362l abstractC0362l2 = abstractC0362l.f4433K;
        abstractC0362l2.getClass();
        return abstractC0362l2;
    }

    /* JADX INFO: renamed from: J */
    public static final qp3 m21977J(ea2 ea2Var) {
        return ((ViewTreeObserverOnGlobalLayoutListenerC0391c) m21980M(ea2Var)).getGraphicsContext();
    }

    /* JADX INFO: renamed from: K */
    public static final AbstractC0362l m21978K(ea2 ea2Var) {
        if (!((d16) ea2Var).f34837a.f34836I) {
            i54.m13663b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        AbstractC0362l abstractC0362lM21976I = m21976I(ea2Var, 2);
        if (!abstractC0362lM21976I.mo1543f1().f34836I) {
            i54.m13663b("LayoutCoordinates is not attached.");
        }
        return abstractC0362lM21976I;
    }

    /* JADX INFO: renamed from: L */
    public static final C0357g m21979L(ea2 ea2Var) {
        AbstractC0362l abstractC0362l = ((d16) ea2Var).f34837a.f34844h;
        if (abstractC0362l != null) {
            return abstractC0362l.f4432J;
        }
        throw AbstractC3393o1.m17745t("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    /* JADX INFO: renamed from: M */
    public static final Owner m21980M(ea2 ea2Var) {
        Owner owner = m21979L(ea2Var).f4316I;
        if (owner != null) {
            return owner;
        }
        throw AbstractC3393o1.m17745t("This node does not have an owner.");
    }

    /* JADX INFO: renamed from: N */
    public static final Typeface m21981N(Typeface typeface, zb3 zb3Var, Context context) {
        String strM13229a;
        List list = zb3Var.f71299a;
        ThreadLocal threadLocal = pda.f55990a;
        if (typeface == null) {
            return null;
        }
        if (list.isEmpty()) {
            return typeface;
        }
        ThreadLocal threadLocal2 = pda.f55990a;
        Paint paint = (Paint) threadLocal2.get();
        if (paint == null) {
            paint = new Paint();
            threadLocal2.set(paint);
        }
        paint.setFontVariationSettings(null);
        paint.setTypeface(typeface);
        jb2 jb2VarM19772b = AbstractC3489q9.m19772b(context);
        int i = (Build.VERSION.SDK_INT < 31 || context.getResources().getConfiguration().fontWeightAdjustment == Integer.MAX_VALUE) ? 0 : context.getResources().getConfiguration().fontWeightAdjustment;
        if (i == 0) {
            strM13229a = hg5.m13229a(list, null, new lz5(jb2VarM19772b), 31);
        } else {
            if (list.size() > 0) {
                g9a.m12435l(list.get(0));
                throw null;
            }
            float fM15944g = l70.m15944g(i + 400.0f, 1.0f, 1000.0f);
            strM13229a = (list.isEmpty() ? "" : "".concat(",")) + "'wght' " + fM15944g;
        }
        paint.setFontVariationSettings(strM13229a);
        return paint.getTypeface();
    }

    /* JADX INFO: renamed from: O */
    public static int m21982O(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    /* JADX INFO: renamed from: P */
    public static final String m21983P(byte b) {
        char[] cArr = pb1.f55914b;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* JADX INFO: renamed from: Q */
    public static final String m21984Q(int i) {
        if (i == 0) {
            return "0";
        }
        char[] cArr = pb1.f55914b;
        int i2 = 0;
        char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
        while (i2 < 8 && cArr2[i2] == '0') {
            i2++;
        }
        if (i2 < 0) {
            v63.m23143u(ux5.m22989l("startIndex: ", i2, ", endIndex: 8, size: 8"));
            return null;
        }
        if (i2 <= 8) {
            return new String(cArr2, i2, 8 - i2);
        }
        C3386nv.m17626m(ux5.m22989l("startIndex: ", i2, " > endIndex: 8"));
        return null;
    }

    /* JADX INFO: renamed from: R */
    public static final long m21985R(long j, long j2) {
        int iM9922d;
        int iM9924f = cx9.m9924f(j);
        int iM9923e = cx9.m9923e(j);
        if ((cx9.m9924f(j2) < cx9.m9923e(j)) && (cx9.m9924f(j) < cx9.m9923e(j2))) {
            if ((cx9.m9924f(j2) <= cx9.m9924f(j)) && (cx9.m9923e(j) <= cx9.m9923e(j2))) {
                iM9924f = cx9.m9924f(j2);
                iM9923e = iM9924f;
            } else {
                if ((cx9.m9924f(j) <= cx9.m9924f(j2)) && (cx9.m9923e(j2) <= cx9.m9923e(j))) {
                    iM9922d = cx9.m9922d(j2);
                } else {
                    int iM9924f2 = cx9.m9924f(j2);
                    if (iM9924f >= cx9.m9923e(j2) || iM9924f2 > iM9924f) {
                        iM9923e = cx9.m9924f(j2);
                    } else {
                        iM9924f = cx9.m9924f(j2);
                        iM9922d = cx9.m9922d(j2);
                    }
                }
                iM9923e -= iM9922d;
            }
        } else if (iM9923e > cx9.m9924f(j2)) {
            iM9924f -= cx9.m9922d(j2);
            iM9922d = cx9.m9922d(j2);
            iM9923e -= iM9922d;
        }
        return eh0.m11127g(iM9924f, iM9923e);
    }

    /* JADX INFO: renamed from: S */
    public static final ofa m21986S(Continuation continuation, kn1 kn1Var, Object obj) {
        ofa ofaVar = null;
        if ((continuation instanceof vn1) && kn1Var.get(wm0.f67043d) != null) {
            vn1 callerFrame = (vn1) continuation;
            while (!(callerFrame instanceof C3209b) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof ofa) {
                    ofaVar = (ofa) callerFrame;
                    break;
                }
            }
            if (ofaVar != null) {
                ofaVar.m17965t0(kn1Var, obj);
            }
        }
        return ofaVar;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x012f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x019c  */
    /* JADX INFO: renamed from: a */
    public static C3185ki m21987a(int i, int i2, int i3) {
        ColorSpace rgb;
        String str;
        float[] fArrM13658a;
        ColorSpace.Rgb.TransferParameters transferParameters;
        float[] fArr;
        final int i4;
        ColorSpace.Rgb rgb2;
        ColorSpace colorSpace;
        ColorSpace colorSpace2;
        C0308a c0308a = va1.f65100e;
        AbstractC3122is.m14084C(i3);
        Bitmap.Config configM14084C = AbstractC3122is.m14084C(i3);
        if (fa4.m11650l(c0308a, c0308a)) {
            rgb = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (fa4.m11650l(c0308a, va1.f65112q)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (fa4.m11650l(c0308a, va1.f65113r)) {
            rgb = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (fa4.m11650l(c0308a, va1.f65110o)) {
            rgb = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (fa4.m11650l(c0308a, va1.f65105j)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (fa4.m11650l(c0308a, va1.f65104i)) {
            rgb = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (fa4.m11650l(c0308a, va1.f65115t)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (fa4.m11650l(c0308a, va1.f65114s)) {
            rgb = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (fa4.m11650l(c0308a, va1.f65106k)) {
            rgb = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (fa4.m11650l(c0308a, va1.f65107l)) {
            rgb = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (fa4.m11650l(c0308a, va1.f65102g)) {
            rgb = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (fa4.m11650l(c0308a, va1.f65103h)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (fa4.m11650l(c0308a, va1.f65101f)) {
            rgb = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (fa4.m11650l(c0308a, va1.f65108m)) {
            rgb = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (fa4.m11650l(c0308a, va1.f65111p)) {
            rgb = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else {
            if (!fa4.m11650l(c0308a, va1.f65109n)) {
                if (Build.VERSION.SDK_INT >= 34) {
                    if (fa4.m11650l(c0308a, va1.f65117v)) {
                        colorSpace2 = ColorSpace.get(ColorSpace.Named.BT2020_HLG);
                    } else {
                        colorSpace2 = fa4.m11650l(c0308a, va1.f65118w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                    }
                    if (colorSpace2 != null) {
                        colorSpace = colorSpace2;
                    } else if (c0308a != null) {
                        str = c0308a.f60574a;
                        fArrM13658a = c0308a.f3941d.m13658a();
                        h9a h9aVar = c0308a.f3944g;
                        if (h9aVar != null) {
                        }
                        fArr = c0308a.f3946i;
                        i4 = 0;
                        if (transferParameters != null) {
                            rgb2 = new ColorSpace.Rgb(str, c0308a.f3945h, fArrM13658a, transferParameters);
                            if (!Float.isNaN(fArr[0])) {
                                rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                            }
                        } else {
                            float[] fArr2 = c0308a.f3945h;
                            final vi3 vi3Var = c0308a.f3949l;
                            DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ta1
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    int i5 = i4;
                                    vi3 vi3Var2 = vi3Var;
                                    switch (i5) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) vi3Var2.invoke(Double.valueOf(d))).doubleValue();
                                }
                            };
                            final vi3 vi3Var2 = c0308a.f3952o;
                            final int i5 = 1;
                            rgb2 = new ColorSpace.Rgb(str, fArr2, fArrM13658a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ta1
                                @Override // java.util.function.DoubleUnaryOperator
                                public final double applyAsDouble(double d) {
                                    int i6 = i5;
                                    vi3 vi3Var3 = vi3Var2;
                                    switch (i6) {
                                        case 0:
                                            break;
                                    }
                                    return ((Number) vi3Var3.invoke(Double.valueOf(d))).doubleValue();
                                }
                            }, c0308a.f3942e, c0308a.f3943f);
                        }
                        colorSpace = rgb2;
                    } else {
                        rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                    }
                } else if (c0308a != null) {
                    str = c0308a.f60574a;
                    fArrM13658a = c0308a.f3941d.m13658a();
                    h9a h9aVar2 = c0308a.f3944g;
                    transferParameters = h9aVar2 != null ? new ColorSpace.Rgb.TransferParameters(h9aVar2.f42054b, h9aVar2.f42055c, h9aVar2.f42056d, h9aVar2.f42057e, h9aVar2.f42058f, h9aVar2.f42059g, h9aVar2.f42053a) : null;
                    fArr = c0308a.f3946i;
                    i4 = 0;
                    if (transferParameters != null) {
                        rgb2 = new ColorSpace.Rgb(str, c0308a.f3945h, fArrM13658a, transferParameters);
                        if (!Float.isNaN(fArr[0]) && !Arrays.equals(rgb2.getTransform(), fArr)) {
                            rgb = new ColorSpace.Rgb(str, fArr, transferParameters);
                        }
                    } else {
                        float[] fArr3 = c0308a.f3945h;
                        final vi3 vi3Var3 = c0308a.f3949l;
                        DoubleUnaryOperator doubleUnaryOperator2 = new DoubleUnaryOperator() { // from class: ta1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i6 = i4;
                                vi3 vi3Var4 = vi3Var3;
                                switch (i6) {
                                    case 0:
                                        break;
                                }
                                return ((Number) vi3Var4.invoke(Double.valueOf(d))).doubleValue();
                            }
                        };
                        final vi3 vi3Var4 = c0308a.f3952o;
                        final int i6 = 1;
                        rgb2 = new ColorSpace.Rgb(str, fArr3, fArrM13658a, doubleUnaryOperator2, new DoubleUnaryOperator() { // from class: ta1
                            @Override // java.util.function.DoubleUnaryOperator
                            public final double applyAsDouble(double d) {
                                int i7 = i6;
                                vi3 vi3Var5 = vi3Var4;
                                switch (i7) {
                                    case 0:
                                        break;
                                }
                                return ((Number) vi3Var5.invoke(Double.valueOf(d))).doubleValue();
                            }
                        }, c0308a.f3942e, c0308a.f3943f);
                    }
                    colorSpace = rgb2;
                } else {
                    rgb = ColorSpace.get(ColorSpace.Named.SRGB);
                }
                return new C3185ki(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM14084C, true, colorSpace));
            }
            rgb = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        colorSpace = rgb;
        return new C3185ki(Bitmap.createBitmap((DisplayMetrics) null, i, i2, configM14084C, true, colorSpace));
    }

    /* JADX INFO: renamed from: b */
    public static final C3488q8 m21988b(df4 df4Var, String str) {
        df4Var.getClass();
        str.getClass();
        return new C3488q8(str, df4Var.f35560a);
    }

    /* JADX INFO: renamed from: c */
    public static final void m21989c(e16 e16Var, final ui3 ui3Var, final ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        boolean z;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(201248980);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 256 : 128;
        }
        final int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            String string = context.getString(R$string.welcome_by_using_lingq);
            string.getClass();
            tj3Var2.m22111b0(126751217);
            C3341mn c3341mn = new C3341mn();
            String string2 = context.getString(R$string.welcome_by_using_lingq_substring_terms_of_service);
            string2.getClass();
            int iM23389l0 = vk9.m23389l0(string, string2, 0, false, 6);
            int length = context.getString(R$string.welcome_by_using_lingq_substring_terms_of_service).length() + iM23389l0;
            String string3 = context.getString(R$string.welcome_by_using_lingq_substring_privacy_policy);
            string3.getClass();
            int iM23389l1 = vk9.m23389l0(string, string3, 0, false, 6);
            int length2 = context.getString(R$string.welcome_by_using_lingq_substring_privacy_policy).length() + iM23389l1;
            c3341mn.m16929d(string);
            p84 p84Var = we1.f66679a;
            if (iM23389l0 < 0 || length > string.length()) {
                tj3Var2.m22111b0(-1519473045);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1519952584);
                boolean z2 = (i2 & 112) == 32;
                Object objM22097O = tj3Var2.m22097O();
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new ge5() { // from class: px9
                        @Override // p000.ge5
                        /* JADX INFO: renamed from: a */
                        public final void mo11967a(fe5 fe5Var) {
                            int i4 = i3;
                            ui3 ui3Var3 = ui3Var;
                            switch (i4) {
                                case 0:
                                    fe5Var.getClass();
                                    ui3Var3.mo0a();
                                    break;
                                default:
                                    fe5Var.getClass();
                                    ui3Var3.mo0a();
                                    break;
                            }
                        }
                    };
                    tj3Var2.m22131l0(objM22097O);
                }
                c3341mn.m16926a(new de5("Terms", null, (ge5) objM22097O), iM23389l0, length);
                c3341mn.m16927b(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23389l0, length);
                tj3Var2.m22139q(false);
            }
            if (iM23389l1 < 0 || length2 > string.length()) {
                z = false;
                tj3Var2.m22111b0(-1518894709);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1519386741);
                boolean z3 = (i2 & 896) == 256;
                Object objM22097O2 = tj3Var2.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    final int i4 = 1;
                    objM22097O2 = new ge5() { // from class: px9
                        @Override // p000.ge5
                        /* JADX INFO: renamed from: a */
                        public final void mo11967a(fe5 fe5Var) {
                            int i5 = i4;
                            ui3 ui3Var3 = ui3Var2;
                            switch (i5) {
                                case 0:
                                    fe5Var.getClass();
                                    ui3Var3.mo0a();
                                    break;
                                default:
                                    fe5Var.getClass();
                                    ui3Var3.mo0a();
                                    break;
                            }
                        }
                    };
                    tj3Var2.m22131l0(objM22097O2);
                }
                c3341mn.m16926a(new de5("Privacy", null, (ge5) objM22097O2), iM23389l1, length2);
                c3341mn.m16927b(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23389l1, length2);
                z = false;
                tj3Var2.m22139q(false);
            }
            C3419on c3419onM16933h = c3341mn.m16933h();
            tj3Var2.m22139q(z);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16555c(c3419onM16933h, e16Var, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55858i, null, 0L, null, null, 0L, new ks9(3), 0L, 0, false, 0, 0, null, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71407k, tj3Var, (i2 << 3) & 112, 0, 261112);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gd1(i, 7, e16Var, ui3Var, ui3Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m21990d(x66 x66Var, d16 d16Var) {
        x66 x66VarM1559B = m21979L(d16Var).m1559B();
        int i = x66VarM1559B.f67832c - 1;
        Object[] objArr = x66VarM1559B.f67830a;
        if (i < objArr.length) {
            while (i >= 0) {
                x66Var.m24305c((d16) ((C0357g) objArr[i]).f4335a0.f46679g);
                i--;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m21991e(vx9 vx9Var) {
        a97 a97Var;
        i97 i97Var = vx9Var.f66067c;
        dr2 dr2Var = (i97Var == null || (a97Var = i97Var.f43743b) == null) ? null : new dr2(a97Var.f383b);
        boolean z = false;
        if (dr2Var != null && dr2Var.f36076a == 1) {
            z = true;
        }
        return !z;
    }

    /* JADX INFO: renamed from: f */
    public static final d16 m21992f(x66 x66Var) {
        int i;
        if (x66Var == null || (i = x66Var.f67832c) == 0) {
            return null;
        }
        return (d16) x66Var.m24314l(i - 1);
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m21993g(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        bArr.getClass();
        bArr2.getClass();
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static final InterfaceC0354d m21994h(d16 d16Var) {
        if ((d16Var.f34839c & 2) != 0) {
            if (d16Var instanceof InterfaceC0354d) {
                return (InterfaceC0354d) d16Var;
            }
            if (d16Var instanceof fa2) {
                d16 d16Var2 = ((fa2) d16Var).f38701K;
                while (d16Var2 != 0) {
                    if (d16Var2 instanceof InterfaceC0354d) {
                        return (InterfaceC0354d) d16Var2;
                    }
                    d16Var2 = (!(d16Var2 instanceof fa2) || (d16Var2.f34839c & 2) == 0) ? d16Var2.f34842f : ((fa2) d16Var2).f38701K;
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static final e16 m21995i(float f, e16 e16Var, boolean z) {
        return e16Var.mo3161g(new C3662uv(f, z, AbstractC0406r.m1816b()));
    }

    /* JADX INFO: renamed from: j */
    public static on3 m21996j(on3 on3Var, C0850ck c0850ck, ea1 ea1Var, int i) {
        if ((i & 4) != 0) {
            ea1Var = null;
        }
        return on3Var.mo16935d(new n70(c0850ck, ea1Var));
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m21997k(Object obj) {
        if (obj instanceof vc9) {
            vc9 vc9Var = (vc9) obj;
            if (vc9Var.mo19860b() == s46.f60289d || vc9Var.mo19860b() == tr3.f62761g || vc9Var.mo19860b() == s46.f60290e) {
                Object value = vc9Var.getValue();
                if (value == null) {
                    return true;
                }
                return m21997k(value);
            }
        } else if (!(obj instanceof xi3) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (f62177a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static mn0 m21998l(ye1 ye1Var) {
        return m22006t(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a);
    }

    /* JADX INFO: renamed from: m */
    public static mn0 m21999m(int i, int i2, long j, long j2, ye1 ye1Var) {
        if ((i2 & 2) != 0) {
            j2 = ra1.m20489b(j, ye1Var);
        }
        long j3 = j2;
        return m22006t(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a).m16934a(j, j3, aa1.f412k, aa1.m198b(0.38f, j3));
    }

    /* JADX INFO: renamed from: n */
    public static C0233h m22000n(int i, float f) {
        if ((i & 1) != 0) {
            ColorSchemeKeyTokens colorSchemeKeyTokens = b43.f7909a;
            f = 0.0f;
        }
        return new C0233h(f, 0.0f, 0.0f, b43.f7914f, b43.f7913e, 0.0f);
    }

    /* JADX INFO: renamed from: o */
    public static final void m22001o(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbM22996s = ux5.m22996s(j, "size=", " offset=");
            sbM22996s.append(j2);
            sbM22996s.append(" byteCount=");
            sbM22996s.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbM22996s.toString());
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m22002p(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            } catch (SecurityException e) {
                eh0.m11121R("IterablePushNotificationUtil", e.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public static C0233h m22003q(int i, float f) {
        if ((i & 1) != 0) {
            f = zo2.m25718b();
        }
        return new C0233h(f, zo2.m25723g(), zo2.m25721e(), zo2.m25722f(), zo2.m25720d(), zo2.m25719c());
    }

    /* JADX INFO: renamed from: r */
    public static final kn1 m22004r(kn1 kn1Var, kn1 kn1Var2, boolean z) {
        Boolean bool = Boolean.FALSE;
        int i = 0;
        boolean zBooleanValue = ((Boolean) kn1Var.fold(bool, new ln1(i))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) kn1Var2.fold(bool, new ln1(i))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return kn1Var.plus(kn1Var2);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f47718a = kn1Var2;
        je1 je1Var = new je1(ref$ObjectRef, z);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f47685a;
        kn1 kn1Var3 = (kn1) kn1Var.fold(emptyCoroutineContext, je1Var);
        if (zBooleanValue2) {
            ref$ObjectRef.f47718a = ((kn1) ref$ObjectRef.f47718a).fold(emptyCoroutineContext, new je1(15));
        }
        return kn1Var3.plus((kn1) ref$ObjectRef.f47718a);
    }

    /* JADX INFO: renamed from: s */
    public static fz5 m22005s(fz5 fz5Var, LayoutDirection layoutDirection, vx9 vx9Var, fb2 fb2Var, wa3 wa3Var) {
        if (fz5Var != null && layoutDirection == fz5Var.f39955a && vz1.m23615W(vx9Var, layoutDirection).equals(fz5Var.f39956b) && fb2Var.mo594a() == fz5Var.f39957c.f43885a && wa3Var == fz5Var.f39958d) {
            return fz5Var;
        }
        fz5 fz5Var2 = fz5.f39954h;
        if (fz5Var2 != null && layoutDirection == fz5Var2.f39955a && vz1.m23615W(vx9Var, layoutDirection).equals(fz5Var2.f39956b) && fb2Var.mo594a() == fz5Var2.f39957c.f43885a && wa3Var == fz5Var2.f39958d) {
            return fz5Var2;
        }
        fz5 fz5Var3 = new fz5(layoutDirection, vz1.m23615W(vx9Var, layoutDirection), new ib2(fb2Var.mo594a(), fb2Var.mo597d0()), wa3Var);
        fz5.f39954h = fz5Var3;
        return fz5Var3;
    }

    /* JADX INFO: renamed from: t */
    public static mn0 m22006t(pa1 pa1Var) {
        mn0 mn0Var = pa1Var.f55841Z;
        if (mn0Var != null) {
            return mn0Var;
        }
        ColorSchemeKeyTokens colorSchemeKeyTokens = b43.f7909a;
        mn0 mn0Var2 = new mn0(ra1.m20491d(pa1Var, colorSchemeKeyTokens), ra1.m20488a(pa1Var, ra1.m20491d(pa1Var, colorSchemeKeyTokens)), d32.m10012J(aa1.m198b(b43.f7912d, ra1.m20491d(pa1Var, b43.f7911c)), ra1.m20491d(pa1Var, colorSchemeKeyTokens)), aa1.m198b(0.38f, ra1.m20488a(pa1Var, ra1.m20491d(pa1Var, colorSchemeKeyTokens))));
        pa1Var.f55841Z = mn0Var2;
        return mn0Var2;
    }

    /* JADX INFO: renamed from: u */
    public static final int m22007u(String str, Bundle bundle) {
        int i = bundle.getInt(str, Integer.MIN_VALUE);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        syc.m21782a(str);
        throw null;
    }

    /* JADX INFO: renamed from: v */
    public static final int m22008v(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX INFO: renamed from: w */
    public static final ArrayList m22009w(String str, Bundle bundle) {
        Class cls = y38.m24933a(Bundle.class).f70781a;
        cls.getClass();
        ArrayList arrayListM19997c = Build.VERSION.SDK_INT >= 34 ? qj0.m19997c(bundle, str, cls) : bundle.getParcelableArrayList(str);
        if (arrayListM19997c != null) {
            return arrayListM19997c;
        }
        syc.m21782a(str);
        throw null;
    }

    /* JADX INFO: renamed from: x */
    public static void m22010x(Context context, Intent intent) {
        Bundle bundleM14300a;
        String string;
        if (intent.getExtras() == null) {
            eh0.m11135p("IterablePushNotificationUtil", "handlePushAction: extras == null, can't handle push action");
            return;
        }
        if (fb4.f38769t.f38770a == null) {
            fb4.f38769t.f38770a = context.getApplicationContext();
            eh0.m11133m("IterableApi", "initializeForPush: Application context set for background push handling");
        }
        mc4 mc4Var = new mc4(intent.getExtras());
        String stringExtra = intent.getStringExtra("actionIdentifier");
        JSONObject jSONObject = new JSONObject();
        ck6 ck6VarM4789o = null;
        boolean z = true;
        if (stringExtra != null) {
            try {
                if (stringExtra.equals("default")) {
                    jSONObject.put("actionIdentifier", "default");
                    ck6 ck6VarM16763c = mc4Var.m16763c();
                    if (ck6VarM16763c == null) {
                        try {
                            Bundle extras = intent.getExtras();
                            try {
                                if (extras.containsKey("uri")) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("type", "openUrl");
                                    jSONObject2.put("data", extras.getString("uri"));
                                    ck6VarM4789o = ck6.m4789o(jSONObject2);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            ck6VarM4789o = ck6VarM16763c;
                            eh0.m11136q("IterablePushNotificationUtil", "Encountered an exception while trying to handle the push action", e);
                        }
                    } else {
                        ck6VarM4789o = ck6VarM16763c;
                    }
                } else {
                    jSONObject.put("actionIdentifier", stringExtra);
                    lc4 lc4VarM16761a = mc4Var.m16761a(stringExtra);
                    ck6VarM4789o = lc4VarM16761a.f49471f;
                    z = lc4VarM16761a.f49469d;
                    if (lc4VarM16761a.f49468c.equals("textInput") && (bundleM14300a = j58.m14300a(intent)) != null && (string = bundleM14300a.getString("userInput")) != null) {
                        jSONObject.putOpt("userText", string);
                        ck6VarM4789o.getClass();
                    }
                }
            } catch (JSONException e3) {
                e = e3;
            }
        }
        boolean z2 = z;
        f62181e = new C3329mb(intent, mc4Var, ck6VarM4789o, jSONObject, 8);
        boolean zM21973F = fb4.f38769t.f38770a != null ? m21973F(context) : false;
        if (!z2 || zM21973F) {
            return;
        }
        Intent intentM19955b = qgd.m19955b(context);
        intentM19955b.putExtras(intent.getExtras());
        intentM19955b.setFlags(872415232);
        if (intentM19955b.resolveActivity(context.getPackageManager()) != null) {
            context.startActivity(intentM19955b);
        }
    }

    /* JADX INFO: renamed from: y */
    public static final boolean m22011y(String str, Bundle bundle) {
        str.getClass();
        return bundle.containsKey(str) && bundle.get(str) == null;
    }

    /* JADX INFO: renamed from: z */
    public static final boolean m22012z(long j, int i, int i2) {
        int iM3803k = bk1.m3803k(j);
        if (i > bk1.m3801i(j) || iM3803k > i) {
            return false;
        }
        return i2 <= bk1.m3800h(j) && bk1.m3802j(j) <= i2;
    }
}
