package p000;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlendMode;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import com.google.android.material.R$styleable;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C3229i;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class pb1 {

    /* JADX INFO: renamed from: a */
    public static final char[] f55913a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final char[] f55914b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: c */
    public static final Object f55915c = new Object();

    /* JADX INFO: renamed from: d */
    public static final ho5 f55916d = new ho5(12);

    /* JADX INFO: renamed from: e */
    public static final C0842cc f55917e = new C0842cc("NO_VALUE", 5);

    /* JADX INFO: renamed from: f */
    public static final Object f55918f = new Object();

    /* JADX INFO: renamed from: g */
    public static boolean f55919g;

    /* JADX INFO: renamed from: h */
    public static int f55920h;

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f55921i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f55922j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f55923k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f55924l = 0;

    /* JADX INFO: renamed from: A */
    public static Drawable m19013A(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable drawableM3932U;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (drawableM3932U = bna.m3932U(context, resourceId)) == null) ? typedArray.getDrawable(i) : drawableM3932U;
    }

    /* JADX INFO: renamed from: B */
    public static al7 m19014B(Context context) {
        Object next;
        String processName;
        context.getClass();
        int iMyPid = Process.myPid();
        Iterator it = m19052v(context).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((al7) next).f808b != iMyPid);
        al7 al7Var = (al7) next;
        if (al7Var != null) {
            return al7Var;
        }
        if (Build.VERSION.SDK_INT > 33) {
            processName = Process.myProcessName();
            processName.getClass();
        } else {
            processName = Application.getProcessName();
            if (processName == null) {
                if (AbstractC3423or.f54777o == null) {
                    AbstractC3423or.f54777o = Application.getProcessName();
                }
                processName = AbstractC3423or.f54777o;
                if (processName == null) {
                    processName = "";
                }
            }
        }
        return new al7(iMyPid, 0, processName, false);
    }

    /* JADX INFO: renamed from: C */
    public static int m19015C(Context context, String str, String str2) {
        String packageName;
        Resources resources = context.getResources();
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                packageName = context.getResources().getResourcePackageName(i);
                if ("android".equals(packageName)) {
                    packageName = context.getPackageName();
                }
            } catch (Resources.NotFoundException unused) {
                packageName = context.getPackageName();
            }
        } else {
            packageName = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, packageName);
    }

    /* JADX INFO: renamed from: D */
    public static int m19016D(Context context, int i) {
        if (i == 0) {
            return 0;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, R$styleable.MaterialTextAppearance);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(R$styleable.MaterialTextAppearance_lineHeight, typedValue);
        if (!value) {
            value = typedArrayObtainStyledAttributes.getValue(R$styleable.MaterialTextAppearance_android_lineHeight, typedValue);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i2 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i2) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i2, context.getResources().getDisplayMetrics());
    }

    /* JADX INFO: renamed from: E */
    public static String m19017E(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f55913a;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: F */
    public static final int m19018F(C3437ov c3437ov, Object obj, int i) {
        int i2 = c3437ov.f55023c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM18260j = AbstractC3423or.m18260j(i2, i, c3437ov.f55021a);
            if (iM18260j < 0 || fa4.m11650l(obj, c3437ov.f55022b[iM18260j])) {
                return iM18260j;
            }
            int i3 = iM18260j + 1;
            while (i3 < i2 && c3437ov.f55021a[i3] == i) {
                if (fa4.m11650l(obj, c3437ov.f55022b[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM18260j - 1; i4 >= 0 && c3437ov.f55021a[i4] == i; i4--) {
                if (fa4.m11650l(obj, c3437ov.f55022b[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            C3386nv.m17619e();
            return 0;
        }
    }

    /* JADX INFO: renamed from: G */
    public static boolean m19019G() {
        if (Build.PRODUCT.contains("sdk")) {
            return true;
        }
        String str = Build.HARDWARE;
        return str.contains("goldfish") || str.contains("ranchu");
    }

    /* JADX INFO: renamed from: H */
    public static boolean m19020H(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* JADX INFO: renamed from: I */
    public static boolean m19021I() {
        boolean zM19019G = m19019G();
        String str = Build.TAGS;
        if ((zM19019G || str == null || !str.contains("test-keys")) && !new File("/system/app/Superuser.apk").exists()) {
            return !zM19019G && new File("/system/xbin/su").exists();
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m19022J(AbstractC0150d abstractC0150d, float f) {
        boolean z = abstractC0150d.m1038m().f52226h;
        boolean z2 = (abstractC0150d.m1044s() ? -f : m19050t(abstractC0150d)) > 0.0f;
        return (z2 && z) || !(z2 || z);
    }

    /* JADX INFO: renamed from: K */
    public static void m19023K(vv9 vv9Var, ut9 ut9Var, rw9 rw9Var, aq4 aq4Var, hw9 hw9Var, boolean z, mq6 mq6Var) {
        e28 e28VarM20955b;
        if (z) {
            int iMo13411t = mq6Var.mo13411t(cx9.m9923e(vv9Var.f65991b));
            String str = ju9.f46169a;
            if (iMo13411t < rw9Var.f59975a.f58295a.f54604b.length()) {
                e28VarM20955b = rw9Var.m20955b(iMo13411t);
            } else {
                e28VarM20955b = iMo13411t != 0 ? rw9Var.m20955b(iMo13411t - 1) : new e28(0.0f, 0.0f, 1.0f, (int) (new n84(ju9.m14657a(ut9Var.f64341b, ut9Var.f64346g, ut9Var.f64347h)).f52482a & 4294967295L));
            }
            float f = e28VarM20955b.f36621b;
            float f2 = e28VarM20955b.f36620a;
            long jMo1671R = aq4Var.mo1671R((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            e28 e28VarM23907b = wfb.m23907b((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo1671R & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jMo1671R >> 32)))) << 32), (((long) Float.floatToRawIntBits(e28VarM20955b.f36622c - f2)) << 32) | (((long) Float.floatToRawIntBits(e28VarM20955b.f36623d - f)) & 4294967295L));
            if (fa4.m11650l((hw9) hw9Var.f43078a.f39815b.get(), hw9Var)) {
                hw9Var.f43079b.mo1086h(e28VarM23907b);
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static qr3 m19024L(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            C3386nv.m17626m("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr3[i2] == null) {
                C3386nv.m17626m("Headers cannot be null");
                return null;
            }
            strArr3[i2] = vk9.m23376L0(strArr2[i2]).toString();
        }
        int iM23507r = AbstractC3695vr.m23507r(0, strArr3.length - 1, 2);
        if (iM23507r >= 0) {
            while (true) {
                String str = strArr3[i];
                String str2 = strArr3[i + 1];
                oha.m17997c(str);
                oha.m17998d(str2, str);
                if (i == iM23507r) {
                    break;
                }
                i += 2;
            }
        }
        return new qr3(strArr3);
    }

    /* JADX INFO: renamed from: M */
    public static final e16 m19025M(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new hs6(vi3Var));
    }

    /* JADX INFO: renamed from: N */
    public static final byte[] m19026N(InputStream inputStream) throws IOException {
        inputStream.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m19048r(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX INFO: renamed from: O */
    public static final C0144d m19027O(ye1 ye1Var) {
        Object[] objArr = new Object[0];
        fs6 fs6Var = C0144d.f2597x;
        boolean zM22116e = ((tj3) ye1Var).m22116e(0) | ((tj3) ye1Var).m22116e(0);
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        if (zM22116e || objM22097O == we1.f66679a) {
            objM22097O = new uf4(14);
            tj3Var.m22131l0(objM22097O);
        }
        return (C0144d) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O, tj3Var, 0);
    }

    /* JADX INFO: renamed from: P */
    public static String m19028P(String str) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
            messageDigest.update(bytes);
            return m19017E(messageDigest.digest());
        } catch (NoSuchAlgorithmException e) {
            Log.e("FirebaseCrashlytics", "Could not create hashing algorithm: SHA-1, returning empty string.", e);
            return "";
        }
    }

    /* JADX INFO: renamed from: Q */
    public static String m19029Q(FileInputStream fileInputStream) {
        Scanner scannerUseDelimiter = new Scanner(fileInputStream).useDelimiter("\\A");
        try {
            String next = scannerUseDelimiter.hasNext() ? scannerUseDelimiter.next() : "";
            scannerUseDelimiter.close();
            return next;
        } catch (Throwable th) {
            if (scannerUseDelimiter != null) {
                try {
                    scannerUseDelimiter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public static final BlendMode m19030R(int i) {
        if (i == 0) {
            return BlendMode.CLEAR;
        }
        if (i == 1) {
            return BlendMode.SRC;
        }
        if (i == 2) {
            return BlendMode.DST;
        }
        if (i == 3) {
            return BlendMode.SRC_OVER;
        }
        if (i == 4) {
            return BlendMode.DST_OVER;
        }
        if (i == 5) {
            return BlendMode.SRC_IN;
        }
        if (i == 6) {
            return BlendMode.DST_IN;
        }
        if (i == 7) {
            return BlendMode.SRC_OUT;
        }
        if (i == 8) {
            return BlendMode.DST_OUT;
        }
        if (i == 9) {
            return BlendMode.SRC_ATOP;
        }
        if (i == 10) {
            return BlendMode.DST_ATOP;
        }
        if (i == 11) {
            return BlendMode.XOR;
        }
        if (i == 12) {
            return BlendMode.PLUS;
        }
        if (i == 13) {
            return BlendMode.MODULATE;
        }
        if (i == 14) {
            return BlendMode.SCREEN;
        }
        if (i == 15) {
            return BlendMode.OVERLAY;
        }
        if (i == 16) {
            return BlendMode.DARKEN;
        }
        if (i == 17) {
            return BlendMode.LIGHTEN;
        }
        if (i == 18) {
            return BlendMode.COLOR_DODGE;
        }
        if (i == 19) {
            return BlendMode.COLOR_BURN;
        }
        if (i == 20) {
            return BlendMode.HARD_LIGHT;
        }
        if (i == 21) {
            return BlendMode.SOFT_LIGHT;
        }
        if (i == 22) {
            return BlendMode.DIFFERENCE;
        }
        if (i == 23) {
            return BlendMode.EXCLUSION;
        }
        if (i == 24) {
            return BlendMode.MULTIPLY;
        }
        if (i == 25) {
            return BlendMode.HUE;
        }
        if (i == 26) {
            return BlendMode.SATURATION;
        }
        if (i == 27) {
            return BlendMode.COLOR;
        }
        return i == 28 ? BlendMode.LUMINOSITY : BlendMode.SRC_OVER;
    }

    /* JADX INFO: renamed from: a */
    public static final void m19031a(final float f, final int i, final int i2, long j, ye1 ye1Var, e16 e16Var) {
        e16 e16Var2;
        int i3;
        final long jM20492e;
        final e16 e16Var3;
        final float f2;
        final long j2;
        e16 e16Var4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(75144485);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= tj3Var.m22114d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jM20492e = j;
            i3 |= ((i2 & 4) == 0 && tj3Var.m22118f(jM20492e)) ? 256 : 128;
        } else {
            jM20492e = j;
        }
        boolean z = true;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                e16Var4 = i4 != 0 ? b16.f7762a : e16Var2;
                if (i5 != 0) {
                    f = hi2.f42392a;
                }
                if ((i2 & 4) != 0) {
                    float f3 = hi2.f42392a;
                    jM20492e = ra1.m20492e(oi2.f54366a, tj3Var);
                    i3 &= -897;
                }
            } else {
                tj3Var.m22102U();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                e16Var4 = e16Var2;
            }
            tj3Var.m22140r();
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(e16Var4, 1.0f), f);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !tj3Var.m22118f(jM20492e)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM22097O = tj3Var.m22097O();
            if (z3 || objM22097O == we1.f66679a) {
                objM22097O = new vi3() { // from class: li2
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float f4 = f;
                        float fMo912g0 = interfaceC0310a.mo912g0(f4);
                        float fMo912g1 = interfaceC0310a.mo912g0(f4) / 2.0f;
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fMo912g1)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        float fMo912g2 = interfaceC0310a.mo912g0(f4) / 2.0f;
                        interfaceC0310a.mo604w(jM20492e, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fMo912g2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), fMo912g0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4414g, (vi3) objM22097O, tj3Var, 0);
            e16Var3 = e16Var4;
            j2 = jM20492e;
            f2 = f;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            f2 = f;
            j2 = jM20492e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: mi2
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    pb1.m19031a(f2, iM19383z, i2, j2, (ye1) obj, e16Var3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19032b(e16 e16Var, String str, long j, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1761956484);
        int i2 = i | 6 | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22118f(j) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            ge9.m12515a(tj3Var2).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 20.0f);
            ge9.m12515a(tj3Var2).getClass();
            e16 e16VarM4414g = c99.m4414g(e16VarM4426s, 12.0f);
            si8 si8Var = p58.m18901i(tj3Var2).f64859e;
            long j2 = aa1.f403b;
            qh0.m19963a(d32.m10007D(vz1.m23616X(e16VarM4414g, 6.0f, si8Var, aa1.m198b(0.46f, j2), aa1.m198b(0.46f, j2), 4), j, p58.m18901i(tj3Var2).f64859e), tj3Var2, 0);
            int i3 = (i2 >> 3) & 14;
            e16Var2 = b16Var;
            lw9.m16554b(str, vz1.m23616X(AbstractC3584sr.m21611X(new opa(fc0Var), ge9.m12515a(tj3Var2).f38955d, 0.0f, 0.0f, 0.0f, 14), 6.0f, null, aa1.m198b(0.46f, j2), aa1.m198b(0.46f, j2), 6), cx2.m9917a(tj3Var2).m4217j(), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, p58.m18902j(tj3Var2).f71410n, tj3Var2, i3, 24576, 113656);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3536rh(e16Var2, str, j, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C3229i m19033c(int i, int i2, BufferOverflow bufferOverflow) {
        if (i < 0) {
            C3386nv.m17624j(ux5.m22988k(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            C3386nv.m17624j(ux5.m22988k(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && bufferOverflow != BufferOverflow.SUSPEND) {
            ij6.m13961s(bufferOverflow, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Integer.MAX_VALUE;
        }
        return new C3229i(i, i3, bufferOverflow);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C3229i m19034d(int i, BufferOverflow bufferOverflow) {
        int i2 = (i & 1) != 0 ? 0 : 1;
        int i3 = (i & 2) == 0 ? 16 : 0;
        if ((i & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        return m19033c(i2, i3, bufferOverflow);
    }

    /* JADX INFO: renamed from: e */
    public static final gk7 m19035e(String str) {
        ak7 ak7Var = ak7.f772G;
        if (vk9.m23391n0(str)) {
            C3386nv.m17626m("Blank serial names are prohibited");
            return null;
        }
        Iterator it = ((rp5) kk7.f47455a.values()).iterator();
        while (((op5) it).hasNext()) {
            KSerializer kSerializer = (KSerializer) ((op5) it).next();
            if (str.equals(kSerializer.getDescriptor().mo3694a())) {
                StringBuilder sbM17742q = AbstractC3393o1.m17742q("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", str, " there already exists ");
                sbM17742q.append(y38.m24933a(kSerializer.getClass()).m25414c());
                sbM17742q.append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                C3386nv.m17626m(wk9.m24029L(sbM17742q.toString()));
                return null;
            }
        }
        return new gk7(str, ak7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final bj8 m19036f(float[] fArr, en1 en1Var, AbstractList abstractList, float f, float f2) {
        float f3;
        long jM13710a;
        List listM23604J;
        yr1 yr1VarM3230a;
        Pair pair;
        en1 en1Var2;
        float f4 = 1.0f;
        Float fValueOf = Float.valueOf(1.0f);
        en1Var.getClass();
        bj8 bj8Var = null;
        if (fArr.length < 6) {
            C3386nv.m17626m("Polygons must have at least 3 vertices");
            return null;
        }
        int i = 2;
        int i2 = 1;
        if (fArr.length % 2 == 1) {
            C3386nv.m17626m("The vertices array should have even size");
            return null;
        }
        if (abstractList != null && abstractList.size() * 2 != fArr.length) {
            C3386nv.m17626m("perVertexRounding list should be either null or the same size as the number of vertices (vertices.size / 2)");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int length = fArr.length / 2;
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (i4 < length) {
            en1 en1Var3 = (abstractList == null || (en1Var2 = (en1) abstractList.get(i4)) == null) ? en1Var : en1Var2;
            int i5 = (((i4 + length) - 1) % length) * 2;
            int i6 = i4 + 1;
            int i7 = (i6 % length) * 2;
            int i8 = i4 * 2;
            arrayList2.add(new qi8(i73.m13710a(fArr[i5], fArr[i5 + 1]), i73.m13710a(fArr[i8], fArr[i8 + 1]), i73.m13710a(fArr[i7], fArr[i7 + 1]), en1Var3));
            i4 = i6;
            f4 = f4;
        }
        float f5 = f4;
        i84 i84VarM15922M = l70.m15922M(0, length);
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(i84VarM15922M, 10));
        Iterator it = i84VarM15922M.iterator();
        while (true) {
            f3 = 0.0f;
            if (!((h84) it).f41941c) {
                break;
            }
            int iNextInt = ((a84) it).nextInt();
            int i9 = (iNextInt + 1) % length;
            float f6 = ((qi8) arrayList2.get(iNextInt)).f57830h + ((qi8) arrayList2.get(i9)).f57830h;
            float fM19978c = ((qi8) arrayList2.get(i9)).m19978c() + ((qi8) arrayList2.get(iNextInt)).m19978c();
            int i10 = iNextInt * 2;
            float f7 = fArr[i10];
            float f8 = fArr[i10 + 1];
            int i11 = i9 * 2;
            float f9 = f7 - fArr[i11];
            float f10 = f8 - fArr[i11 + 1];
            float f11 = jna.f45883b;
            float fSqrt = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            if (f6 > fSqrt) {
                pair = new Pair(Float.valueOf(fSqrt / f6), Float.valueOf(0.0f));
            } else {
                pair = fM19978c > fSqrt ? new Pair(fValueOf, Float.valueOf((fSqrt - f6) / (fM19978c - f6))) : new Pair(fValueOf, fValueOf);
            }
            arrayList3.add(pair);
        }
        int i12 = 0;
        while (i12 < length) {
            float[] fArrCopyOf = new float[i];
            bj8 bj8Var2 = bj8Var;
            int i13 = i3;
            int i14 = i13;
            while (i14 < i) {
                int i15 = i;
                Pair pair2 = (Pair) arrayList3.get((((i12 + length) - 1) + i14) % length);
                int i16 = i3;
                float f12 = f3;
                float fM17726a = AbstractC3393o1.m17726a(((qi8) arrayList2.get(i12)).m19978c(), ((qi8) arrayList2.get(i12)).f57830h, ((Number) pair2.f47624b).floatValue(), ((qi8) arrayList2.get(i12)).f57830h * ((Number) pair2.f47623a).floatValue());
                int i17 = i13 + 1;
                if (fArrCopyOf.length < i17) {
                    fArrCopyOf = Arrays.copyOf(fArrCopyOf, Math.max(i17, (fArrCopyOf.length * 3) / 2));
                }
                fArrCopyOf[i13] = fM17726a;
                i14++;
                f3 = f12;
                i13 = i17;
                i3 = i16;
                i = i15;
            }
            int i18 = i;
            int i19 = i3;
            float f13 = f3;
            qi8 qi8Var = (qi8) arrayList2.get(i12);
            if (i13 <= 0) {
                v63.m23143u("Index must be between 0 and size");
                return bj8Var2;
            }
            float f14 = fArrCopyOf[i19];
            if (i2 >= i13) {
                v63.m23143u("Index must be between 0 and size");
                return bj8Var2;
            }
            float f15 = fArrCopyOf[i2];
            long j = qi8Var.f57827e;
            int i20 = i2;
            int i21 = length;
            long j2 = qi8Var.f57826d;
            float f16 = qi8Var.f57828f;
            ArrayList arrayList4 = arrayList;
            long j3 = qi8Var.f57824b;
            float fMin = Math.min(f14, f15);
            float f17 = qi8Var.f57830h;
            if (f17 < 1.0E-4f || fMin < 1.0E-4f || f16 < 1.0E-4f) {
                qi8Var.f57831i = j3;
                float fM10544t = do7.m10544t(j3);
                float fM10545u = do7.m10545u(j3);
                float fM10544t2 = do7.m10544t(j3);
                float fM10545u2 = do7.m10545u(j3);
                listM23604J = vz1.m23604J(b34.m3230a(fM10544t, fM10545u, jna.m14562b(fM10544t, fM10544t2, 0.33333334f), jna.m14562b(fM10545u, fM10545u2, 0.33333334f), jna.m14562b(fM10544t, fM10544t2, 0.6666667f), jna.m14562b(fM10545u, fM10545u2, 0.6666667f), fM10544t2, fM10545u2));
            } else {
                float fMin2 = Math.min(fMin, f17);
                float fM19977a = qi8Var.m19977a(f14);
                float fM19977a2 = qi8Var.m19977a(f15);
                float f18 = (f16 * fMin2) / f17;
                float f19 = jna.f45883b;
                qi8Var.f57831i = do7.m10549y(j3, do7.m10519F((float) Math.sqrt((fMin2 * fMin2) + (f18 * f18)), do7.m10541q(do7.m10535k(2.0f, do7.m10549y(j2, j)))));
                long jM10549y = do7.m10549y(j3, do7.m10519F(fMin2, j2));
                long jM10549y2 = do7.m10549y(j3, do7.m10519F(fMin2, j));
                yr1 yr1VarM19976b = qi8.m19976b(fMin2, fM19977a, qi8Var.f57824b, qi8Var.f57823a, jM10549y, jM10549y2, qi8Var.f57831i, f18);
                yr1 yr1VarM19976b2 = qi8.m19976b(fMin2, fM19977a2, qi8Var.f57824b, qi8Var.f57825c, jM10549y2, jM10549y, qi8Var.f57831i, f18);
                float fM25288a = yr1VarM19976b2.m25288a();
                float fM25289b = yr1VarM19976b2.m25289b();
                float[] fArr2 = yr1VarM19976b2.f70312a;
                yr1 yr1VarM3230a2 = b34.m3230a(fM25288a, fM25289b, fArr2[4], fArr2[5], fArr2[i18], fArr2[3], fArr2[i19], fArr2[i20]);
                float fM10544t3 = do7.m10544t(qi8Var.f57831i);
                float fM10545u3 = do7.m10545u(qi8Var.f57831i);
                float fM25288a2 = yr1VarM19976b.m25288a();
                float fM25289b2 = yr1VarM19976b.m25289b();
                float[] fArr3 = yr1VarM3230a2.f70312a;
                float f20 = fArr3[i19];
                float f21 = fArr3[i20];
                float f22 = fM25288a2 - fM10544t3;
                float f23 = fM25289b2 - fM10545u3;
                long jM14561a = jna.m14561a(f22, f23);
                float f24 = f20 - fM10544t3;
                float f25 = f21 - fM10545u3;
                long jM14561a2 = jna.m14561a(f24, f25);
                long jM13710a2 = i73.m13710a(-do7.m10545u(jM14561a), do7.m10544t(jM14561a));
                long jM13710a3 = i73.m13710a(-do7.m10545u(jM14561a2), do7.m10544t(jM14561a2));
                int i22 = (do7.m10545u(jM13710a2) * f25) + (do7.m10544t(jM13710a2) * f24) >= f13 ? i20 : i19;
                float fM10536l = do7.m10536l(jM14561a, jM14561a2);
                if (fM10536l > 0.999f) {
                    yr1VarM3230a = b34.m3230a(fM25288a2, fM25289b2, jna.m14562b(fM25288a2, f20, 0.33333334f), jna.m14562b(fM25289b2, f21, 0.33333334f), jna.m14562b(fM25288a2, f20, 0.6666667f), jna.m14562b(fM25289b2, f21, 0.6666667f), f20, f21);
                } else {
                    float f26 = f5 - fM10536l;
                    float fSqrt2 = (((((float) Math.sqrt(2.0f * f26)) - ((float) Math.sqrt(f5 - (fM10536l * fM10536l)))) * ((((float) Math.sqrt((f23 * f23) + (f22 * f22))) * 4.0f) / 3.0f)) / f26) * (i22 != 0 ? f5 : -1.0f);
                    yr1VarM3230a = b34.m3230a(fM25288a2, fM25289b2, (do7.m10544t(jM13710a2) * fSqrt2) + fM25288a2, (do7.m10545u(jM13710a2) * fSqrt2) + fM25289b2, f20 - (do7.m10544t(jM13710a3) * fSqrt2), f21 - (do7.m10545u(jM13710a3) * fSqrt2), f20, f21);
                }
                listM23604J = vz1.m23605K(yr1VarM19976b, yr1VarM3230a, yr1VarM3230a2);
            }
            arrayList4.add(listM23604J);
            i12++;
            f3 = f13;
            arrayList = arrayList4;
            bj8Var = bj8Var2;
            i3 = i19;
            i = i18;
            length = i21;
            i2 = i20;
            arrayList3 = arrayList3;
        }
        ArrayList arrayList5 = arrayList;
        int i23 = i2;
        int i24 = i3;
        float f27 = f3;
        ArrayList arrayList6 = new ArrayList();
        int i25 = i24;
        while (i25 < length) {
            int i26 = i25 + 1;
            int i27 = i26 % length;
            int i28 = i25 * 2;
            long jM13710a4 = i73.m13710a(fArr[i28], fArr[i28 + 1]);
            int i29 = (((i25 + length) - 1) % length) * 2;
            long jM13710a5 = i73.m13710a(fArr[i29], fArr[i29 + 1]);
            int i30 = i27 * 2;
            long jM13710a6 = i73.m13710a(fArr[i30], fArr[i30 + 1]);
            long jM10546v = do7.m10546v(jM13710a4, jM13710a5);
            long jM10546v2 = do7.m10546v(jM13710a6, jM13710a4);
            arrayList6.add(new g13((List) arrayList5.get(i25), jM13710a4, ((qi8) arrayList2.get(i25)).f57831i, (do7.m10545u(jM10546v2) * do7.m10544t(jM10546v)) - (do7.m10544t(jM10546v2) * do7.m10545u(jM10546v)) > f27 ? i23 : i24));
            float fM25288a3 = ((yr1) u91.m22597O0((List) arrayList5.get(i25))).m25288a();
            float fM25289b3 = ((yr1) u91.m22597O0((List) arrayList5.get(i25))).m25289b();
            float f28 = ((yr1) u91.m22589G0((List) arrayList5.get(i27))).f70312a[i24];
            float f29 = ((yr1) u91.m22589G0((List) arrayList5.get(i27))).f70312a[i23];
            arrayList6.add(new h13(vz1.m23604J(b34.m3230a(fM25288a3, fM25289b3, jna.m14562b(fM25288a3, f28, 0.33333334f), jna.m14562b(fM25289b3, f29, 0.33333334f), jna.m14562b(fM25288a3, f28, 0.6666667f), jna.m14562b(fM25289b3, f29, 0.6666667f), f28, f29))));
            i25 = i26;
        }
        if (f == Float.MIN_VALUE || f2 == Float.MIN_VALUE) {
            float f30 = f27;
            float f31 = f30;
            int i31 = i24;
            while (i31 < fArr.length) {
                int i32 = i31 + 1;
                f31 += fArr[i31];
                i31 += 2;
                f30 += fArr[i32];
            }
            jM13710a = i73.m13710a((f31 / fArr.length) / 2.0f, (f30 / fArr.length) / 2.0f);
        } else {
            jM13710a = i73.m13710a(f, f2);
        }
        return new bj8(arrayList6, Float.intBitsToFloat((int) (jM13710a >> 32)), Float.intBitsToFloat((int) (jM13710a & 4294967295L)));
    }

    /* JADX INFO: renamed from: g */
    public static final void m19037g(final float f, int i, int i2, long j, ye1 ye1Var, e16 e16Var) {
        e16 e16Var2;
        int i3;
        final long jM20492e;
        e16 e16Var3;
        float f2;
        long j2;
        e16 e16Var4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1534852205);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= tj3Var.m22114d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            jM20492e = j;
            i3 |= ((i2 & 4) == 0 && tj3Var.m22118f(jM20492e)) ? 256 : 128;
        } else {
            jM20492e = j;
        }
        boolean z = true;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                e16Var4 = i4 != 0 ? b16.f7762a : e16Var2;
                if (i5 != 0) {
                    f = hi2.f42392a;
                }
                if ((i2 & 4) != 0) {
                    float f3 = hi2.f42392a;
                    jM20492e = ra1.m20492e(oi2.f54366a, tj3Var);
                    i3 &= -897;
                }
            } else {
                tj3Var.m22102U();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                e16Var4 = e16Var2;
            }
            tj3Var.m22140r();
            e16 e16VarM4426s = c99.m4426s(c99.m4410c(e16Var4, 1.0f), f);
            boolean z2 = (i3 & 112) == 32;
            if ((((i3 & 896) ^ 384) <= 256 || !tj3Var.m22118f(jM20492e)) && (i3 & 384) != 256) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objM22097O = tj3Var.m22097O();
            if (z3 || objM22097O == we1.f66679a) {
                objM22097O = new vi3() { // from class: ji2
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float f4 = f;
                        float fMo912g0 = interfaceC0310a.mo912g0(f4);
                        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(interfaceC0310a.mo912g0(f4) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                        float fMo912g1 = interfaceC0310a.mo912g0(f4) / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                        interfaceC0310a.mo604w(jM20492e, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMo912g1)) << 32), fMo912g0, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4426s, (vi3) objM22097O, tj3Var, 0);
            e16Var3 = e16Var4;
            j2 = jM20492e;
            f2 = f;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            f2 = f;
            j2 = jM20492e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ki2(f2, i, i2, j2, e16Var3);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final ExecutorService m19038h(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new bi1(z));
        executorServiceNewFixedThreadPool.getClass();
        return executorServiceNewFixedThreadPool;
    }

    /* JADX INFO: renamed from: i */
    public static final void m19039i(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    /* JADX INFO: renamed from: j */
    public static final zx8 m19040j(String str, SerialDescriptor[] serialDescriptorArr, vi3 vi3Var) {
        if (vk9.m23391n0(str)) {
            C3386nv.m17626m("Blank serial names are prohibited");
            return null;
        }
        a31 a31Var = new a31(str);
        vi3Var.invoke(a31Var);
        return new zx8(str, hl9.f42585y, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
    }

    /* JADX INFO: renamed from: k */
    public static final zx8 m19041k(String str, AbstractC3184kh abstractC3184kh, SerialDescriptor[] serialDescriptorArr, vi3 vi3Var) {
        if (vk9.m23391n0(str)) {
            C3386nv.m17626m("Blank serial names are prohibited");
            return null;
        }
        if (abstractC3184kh.equals(hl9.f42585y)) {
            C3386nv.m17626m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a31 a31Var = new a31(str);
        vi3Var.invoke(a31Var);
        return new zx8(str, abstractC3184kh, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
    }

    /* JADX INFO: renamed from: l */
    public static zx8 m19042l(String str, AbstractC3184kh abstractC3184kh, SerialDescriptor[] serialDescriptorArr) {
        if (vk9.m23391n0(str)) {
            C3386nv.m17626m("Blank serial names are prohibited");
            return null;
        }
        if (abstractC3184kh.equals(hl9.f42585y)) {
            C3386nv.m17626m("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a31 a31Var = new a31(str);
        return new zx8(str, abstractC3184kh, a31Var.f165c.size(), AbstractC3550rv.m20852t0(serialDescriptorArr), a31Var);
    }

    /* JADX INFO: renamed from: m */
    public static synchronized long m19043m(Context context) {
        ActivityManager.MemoryInfo memoryInfo;
        memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX INFO: renamed from: n */
    public static final Pair m19044n(xv5 xv5Var) {
        Charset charset = yu0.f70463a;
        if (xv5Var != null) {
            Charset charsetM24709a = xv5.m24709a(xv5Var);
            if (charsetM24709a == null) {
                try {
                    xv5Var = AbstractC3122is.m14103q(xv5Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    xv5Var = null;
                }
            } else {
                charset = charsetM24709a;
            }
        }
        return new Pair(charset, xv5Var);
    }

    /* JADX INFO: renamed from: o */
    public static final e16 m19045o(e16 e16Var, o39 o39Var) {
        return AbstractC0309d.m1407b(e16Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, o39Var, true, 1042431);
    }

    /* JADX INFO: renamed from: p */
    public static final e16 m19046p(e16 e16Var) {
        return AbstractC0309d.m1407b(e16Var, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, true, 1044479);
    }

    /* JADX INFO: renamed from: q */
    public static void m19047q(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                Log.e("FirebaseCrashlytics", str, e);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public static final long m19048r(InputStream inputStream, OutputStream outputStream) throws IOException {
        inputStream.getClass();
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        long j = 0;
        while (i >= 0) {
            outputStream.write(bArr, 0, i);
            j += (long) i;
            i = inputStream.read(bArr);
        }
        return j;
    }

    /* JADX INFO: renamed from: s */
    public static StaticLayout m19049s(CharSequence charSequence, TextPaint textPaint, int i, int i2, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i3, TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        if (i2 < 0) {
            j54.m14288a("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            j54.m14288a("invalid end value");
        }
        if (i3 < 0) {
            j54.m14288a("invalid maxLines value");
        }
        if (i < 0) {
            j54.m14288a("invalid width value");
        }
        if (i4 < 0) {
            j54.m14288a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i3);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i4);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(z);
        builderObtain.setBreakStrategy(i6);
        builderObtain.setHyphenationFrequency(i9);
        builderObtain.setIndents(null, null);
        builderObtain.setJustificationMode(i5);
        builderObtain.setUseLineSpacingFromFallbacks(true);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            builderObtain.setLineBreakConfig(AbstractC3634u3.m22413d().setLineBreakStyle(i7).setLineBreakWordStyle(i8).build());
        }
        if (i10 >= 35) {
            builderObtain.setUseBoundsForWidth(false);
        }
        return builderObtain.build();
    }

    /* JADX INFO: renamed from: t */
    public static final float m19050t(AbstractC0150d abstractC0150d) {
        return abstractC0150d.m1038m().f52223e == Orientation.Horizontal ? Float.intBitsToFloat((int) (abstractC0150d.m1043r() >> 32)) : Float.intBitsToFloat((int) (abstractC0150d.m1043r() & 4294967295L));
    }

    /* JADX INFO: renamed from: u */
    public static final c83 m19051u(z49 z49Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return ((i == 0 || i == -3) && bufferOverflow == BufferOverflow.SUSPEND) ? z49Var : new fu0(z49Var, kn1Var, i, bufferOverflow);
    }

    /* JADX INFO: renamed from: v */
    public static ArrayList m19052v(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            runningAppProcesses = EmptyList.f47638a;
        }
        ArrayList arrayListM22587E0 = u91.m22587E0(runningAppProcesses);
        ArrayList<ActivityManager.RunningAppProcessInfo> arrayList = new ArrayList();
        for (Object obj : arrayListM22587E0) {
            if (((ActivityManager.RunningAppProcessInfo) obj).uid == i) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : arrayList) {
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new al7(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, fa4.m11650l(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: w */
    public static ColorStateList m19053w(Context context, sq5 sq5Var, int i) {
        int resourceId;
        ColorStateList colorStateListM10540p;
        TypedArray typedArray = (TypedArray) sq5Var.f61249c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM10540p = do7.m10540p(context, resourceId)) == null) ? sq5Var.m21567i(i) : colorStateListM10540p;
    }

    /* JADX INFO: renamed from: x */
    public static ColorStateList m19054x(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList colorStateListM10540p;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (colorStateListM10540p = do7.m10540p(context, resourceId)) == null) ? typedArray.getColorStateList(i) : colorStateListM10540p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: y */
    public static int m19055y() {
        boolean zM19019G = m19019G();
        ?? r0 = zM19019G;
        if (m19021I()) {
            r0 = (zM19019G ? 1 : 0) | 2;
        }
        return (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) ? r0 | 4 : r0;
    }

    /* JADX INFO: renamed from: z */
    public static int m19056z(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i2);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }
}
