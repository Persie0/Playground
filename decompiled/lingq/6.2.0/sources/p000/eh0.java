package p000;

import android.graphics.Paint;
import android.graphics.SweepGradient;
import android.os.Build;
import android.util.Log;
import android.widget.EdgeEffect;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import com.lingq.core.network.api.result.ResultTtsVoice;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class eh0 {

    /* JADX INFO: renamed from: J */
    public static final /* synthetic */ int f37230J = 0;

    /* JADX INFO: renamed from: K */
    public static final /* synthetic */ int f37231K = 0;

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f37232L = 0;

    /* JADX INFO: renamed from: M */
    public static final /* synthetic */ int f37233M = 0;

    /* JADX INFO: renamed from: N */
    public static final /* synthetic */ int f37234N = 0;

    /* JADX INFO: renamed from: O */
    public static final /* synthetic */ int f37235O = 0;

    /* JADX INFO: renamed from: f */
    public static final e41 f37240f;

    /* JADX INFO: renamed from: g */
    public static final u06 f37241g;

    /* JADX INFO: renamed from: h */
    public static final jj5 f37242h;

    /* JADX INFO: renamed from: i */
    public static final tr3 f37243i;

    /* JADX INFO: renamed from: j */
    public static final C0842cc f37244j;

    /* JADX INFO: renamed from: k */
    public static final C0842cc f37245k;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37247a = 14;

    /* JADX INFO: renamed from: b */
    public static final C3549ru f37236b = new C3549ru(4);

    /* JADX INFO: renamed from: c */
    public static final C3549ru f37237c = new C3549ru(3);

    /* JADX INFO: renamed from: d */
    public static final C3587su f37238d = new C3587su(1);

    /* JADX INFO: renamed from: e */
    public static final C3587su f37239e = new C3587su(0);

    /* JADX INFO: renamed from: l */
    public static final C3835zj f37246l = new C3835zj(7);

    /* JADX INFO: renamed from: H */
    public static final SerialDescriptor[] f37228H = new SerialDescriptor[0];

    /* JADX INFO: renamed from: I */
    public static final StackTraceElement[] f37229I = new StackTraceElement[0];

    static {
        int i = 7;
        f37240f = new e41(i);
        f37241g = new u06(i);
        f37242h = new jj5(i);
        f37243i = new tr3(i);
        int i2 = 5;
        f37244j = new C0842cc("UNDEFINED", i2);
        f37245k = new C0842cc("REUSABLE_CLAIMED", i2);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m11104A(double d, String str) {
        int i;
        int iRotateLeft;
        str.getClass();
        byte[] bytes = str.getBytes(yu0.f70463a);
        bytes.getClass();
        int length = bytes.length;
        if (length >= 16) {
            int iM14442b = 606290984;
            int iM14442b2 = 1640531535;
            i = 0;
            int iM14442b3 = 0;
            int iM14442b4 = -2048144777;
            while (i <= length - 16) {
                iM14442b = jga.m14442b(iM14442b, jga.m14441a(i, bytes));
                iM14442b4 = jga.m14442b(iM14442b4, jga.m14441a(i + 4, bytes));
                iM14442b3 = jga.m14442b(iM14442b3, jga.m14441a(i + 8, bytes));
                iM14442b2 = jga.m14442b(iM14442b2, jga.m14441a(i + 12, bytes));
                i += 16;
            }
            iRotateLeft = Integer.rotateLeft(iM14442b2, 18) + Integer.rotateLeft(iM14442b3, 12) + Integer.rotateLeft(iM14442b4, 7) + Integer.rotateLeft(iM14442b, 1);
        } else {
            i = 0;
            iRotateLeft = 374761393;
        }
        int iRotateLeft2 = iRotateLeft + length;
        while (i <= length - 4) {
            iRotateLeft2 = 668265263 * Integer.rotateLeft((jga.m14441a(i, bytes) * (-1028477379)) + iRotateLeft2, 17);
            i += 4;
        }
        while (i < length) {
            iRotateLeft2 = (-1640531535) * Integer.rotateLeft(((bytes[i] & 255) * 374761393) + iRotateLeft2, 11);
            i++;
        }
        int i2 = ((iRotateLeft2 >>> 15) ^ iRotateLeft2) * (-2048144777);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477379);
        return dha.m10392d(Long.remainderUnsigned((((long) (i3 ^ (i3 >>> 16))) & 4294967295L) * 31, 1000000L)) / 1000000.0d < d;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m11105B(int i) {
        if (fb4.f38769t != null && fb4.f38769t.f38771b != null) {
            fb4.f38769t.getClass();
            lb4 lb4Var = fb4.f38769t.f38771b;
        }
        return i >= 6;
    }

    /* JADX INFO: renamed from: C */
    public static List m11106C(Object... objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? Collections.unmodifiableList(Arrays.asList(objArr)) : Collections.singletonList(objArr[0]);
        }
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: D */
    public static kn1 m11107D(in1 in1Var, jn1 jn1Var) {
        jn1Var.getClass();
        return fa4.m11650l(in1Var.getKey(), jn1Var) ? EmptyCoroutineContext.f47685a : in1Var;
    }

    /* JADX INFO: renamed from: E */
    public static final String m11108E(z21 z21Var) {
        z21Var.getClass();
        String strM25414c = z21Var.m25414c();
        if (strM25414c == null) {
            strM25414c = "<local class name not available>";
        }
        return wq1.m24118n("Serializer for class '", strM25414c, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    /* JADX INFO: renamed from: F */
    public static void m11109F(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float f = (i - i3) / 2.0f;
        if (!z) {
            int length = iArr.length;
            int i5 = 0;
            while (i2 < length) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6;
                i2++;
                i5++;
            }
            return;
        }
        int length2 = iArr.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i7 = iArr[length2];
            iArr2[length2] = Math.round(f);
            f += i7;
        }
    }

    /* JADX INFO: renamed from: G */
    public static void m11110G(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = iArr.length == 0 ? 0.0f : (i - i3) / iArr.length;
        float f = length / 2.0f;
        if (!z) {
            int length2 = iArr.length;
            int i5 = 0;
            while (i2 < length2) {
                int i6 = iArr[i2];
                iArr2[i5] = Math.round(f);
                f += i6 + length;
                i2++;
                i5++;
            }
            return;
        }
        int length3 = iArr.length;
        while (true) {
            length3--;
            if (-1 >= length3) {
                return;
            }
            int i7 = iArr[length3];
            iArr2[length3] = Math.round(f);
            f += i7 + length;
        }
    }

    /* JADX INFO: renamed from: H */
    public static void m11111H(int i, int[] iArr, int[] iArr2, boolean z) {
        if (iArr.length == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float fMax = (i - i3) / Math.max(iArr.length - 1, 1);
        float f = (z && iArr.length == 1) ? fMax : 0.0f;
        if (z) {
            for (int length = iArr.length - 1; -1 < length; length--) {
                int i5 = iArr[length];
                iArr2[length] = Math.round(f);
                f += i5 + fMax;
            }
            return;
        }
        int length2 = iArr.length;
        int i6 = 0;
        while (i2 < length2) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f);
            f += i7 + fMax;
            i2++;
            i6++;
        }
    }

    /* JADX INFO: renamed from: I */
    public static void m11112I(int i, int[] iArr, int[] iArr2, boolean z) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        float length = (i - i3) / (iArr.length + 1);
        if (z) {
            float f = length;
            for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                int i5 = iArr[length2];
                iArr2[length2] = Math.round(f);
                f += i5 + length;
            }
            return;
        }
        int length3 = iArr.length;
        float f2 = length;
        int i6 = 0;
        while (i2 < length3) {
            int i7 = iArr[i2];
            iArr2[i6] = Math.round(f2);
            f2 += i7 + length;
            i2++;
            i6++;
        }
    }

    /* JADX INFO: renamed from: J */
    public static kn1 m11113J(in1 in1Var, kn1 kn1Var) {
        kn1Var.getClass();
        return kn1Var == EmptyCoroutineContext.f47685a ? in1Var : (kn1) kn1Var.fold(in1Var, new oh0(29));
    }

    /* JADX INFO: renamed from: K */
    public static void m11114K() {
        try {
            m11120Q("Iterable Call", Thread.currentThread().getStackTrace()[3].getFileName() + " => " + Thread.currentThread().getStackTrace()[3].getClassName() + " => " + Thread.currentThread().getStackTrace()[3].getMethodName() + " => Line #" + Thread.currentThread().getStackTrace()[3].getLineNumber());
        } catch (Exception unused) {
            m11135p("Iterable Call", "Couldn't print info");
        }
    }

    /* JADX INFO: renamed from: L */
    public static final int m11115L(int i, String str) {
        char cCharAt = str.charAt(i);
        return (cCharAt << 7) + str.charAt(i + 1);
    }

    /* JADX INFO: renamed from: M */
    public static final void m11116M(Object obj, Continuation continuation) throws DispatchException {
        if (!(continuation instanceof kh2)) {
            continuation.resumeWith(obj);
            return;
        }
        kh2 kh2Var = (kh2) continuation;
        nn1 nn1Var = kh2Var.f47289d;
        ContinuationImpl continuationImpl = kh2Var.f47290e;
        Throwable thM15355a = Result.m15355a(obj);
        Object dc1Var = thM15355a == null ? obj : new dc1(thM15355a, false);
        if (m11118O(nn1Var, continuationImpl.getContext())) {
            kh2Var.f47291f = dc1Var;
            kh2Var.f49653c = 1;
            m11117N(nn1Var, continuationImpl.getContext(), kh2Var);
            return;
        }
        yt2 yt2VarM20221a = qz9.m20221a();
        if (yt2VarM20221a.f70439c >= 4294967296L) {
            kh2Var.f47291f = dc1Var;
            kh2Var.f49653c = 1;
            yt2VarM20221a.m25312h0(kh2Var);
            return;
        }
        yt2VarM20221a.m25313i0(true);
        try {
            cd4 cd4Var = (cd4) continuationImpl.getContext().get(nj0.f52795N);
            if (cd4Var == null || cd4Var.mo4538b()) {
                Object obj2 = kh2Var.f47292g;
                kn1 context = continuationImpl.getContext();
                Object objM20372O = r46.m20372O(context, obj2);
                ofa ofaVarM21986S = objM20372O != r46.f58686p ? te1.m21986S(continuationImpl, context, objM20372O) : null;
                try {
                    continuationImpl.resumeWith(obj);
                    if (ofaVarM21986S == null || ofaVarM21986S.m17963r0()) {
                        r46.m20367J(context, objM20372O);
                    }
                } catch (Throwable th) {
                    if (ofaVarM21986S == null || ofaVarM21986S.m17963r0()) {
                        r46.m20367J(context, objM20372O);
                    }
                    throw th;
                }
            } else {
                kh2Var.resumeWith(AbstractC3193b.m15358a(cd4Var.mo4541u()));
            }
            while (yt2VarM20221a.m25314k0()) {
            }
        } catch (Throwable th2) {
            try {
                kh2Var.m16220g(th2);
            } finally {
                yt2VarM20221a.m25311g0(true);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static final void m11117N(nn1 nn1Var, kn1 kn1Var, Runnable runnable) throws DispatchException {
        try {
            nn1Var.mo385T(kn1Var, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, nn1Var, kn1Var);
        }
    }

    /* JADX INFO: renamed from: O */
    public static final boolean m11118O(nn1 nn1Var, kn1 kn1Var) throws DispatchException {
        try {
            return nn1Var.mo17503Y(kn1Var);
        } catch (Throwable th) {
            throw new DispatchException(th, nn1Var, kn1Var);
        }
    }

    /* JADX INFO: renamed from: P */
    public static final dda m11119P(ResultTtsVoice resultTtsVoice) {
        resultTtsVoice.getClass();
        String str = resultTtsVoice.f21651a;
        String str2 = resultTtsVoice.f21652b;
        List list = resultTtsVoice.f21653c;
        Boolean bool = resultTtsVoice.f21654d;
        boolean z = resultTtsVoice.f21655e;
        boolean z2 = resultTtsVoice.f21656f;
        List list2 = resultTtsVoice.f21657g;
        return new dda(bool, str, str2, resultTtsVoice.f21658h, list, list2, resultTtsVoice.f21660j, z, z2, resultTtsVoice.f21659i);
    }

    /* JADX INFO: renamed from: Q */
    public static void m11120Q(String str, String str2) {
        if (m11105B(2)) {
            Log.v(str, " 💛 " + str2);
        }
    }

    /* JADX INFO: renamed from: R */
    public static void m11121R(String str, String str2) {
        if (m11105B(5)) {
            Log.w(str, " 🧡️ " + str2);
        }
    }

    /* JADX INFO: renamed from: S */
    public static void m11122S(String str, String str2, Throwable th) {
        if (m11105B(5)) {
            Log.w(str, " 🧡 ".concat(str2), th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m11123c(int i, int i2, ye1 ye1Var, ui3 ui3Var, boolean z) {
        boolean z2;
        int i3;
        Object obj;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (tj3Var.m22122h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i5 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            final boolean z3 = i4 != 0 ? true : z2;
            Object objM13277a = hi5.m13277a(tj3Var);
            if (objM13277a == null) {
                tj3Var.m22111b0(535274673);
                objM13277a = ii5.m13938a(tj3Var);
            } else {
                tj3Var.m22111b0(535271790);
            }
            tj3Var.m22139q(false);
            if (objM13277a == null) {
                C3386nv.m17633t("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zM22120g = tj3Var.m22120g(objM13277a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                obj = objM22097O;
                aj6 aj6Var = objM13277a instanceof aj6 ? (aj6) objM13277a : null;
                ny8 ny8VarMo504a = aj6Var != null ? aj6Var.mo504a() : null;
                rr6 rr6Var = objM13277a instanceof rr6 ? (rr6) objM13277a : null;
                y60 y60Var = new y60(ny8VarMo504a, rr6Var != null ? rr6Var.mo13202c() : null);
                tj3Var.m22131l0(y60Var);
                obj = y60Var;
            }
            y60 y60Var2 = (y60) obj;
            long j = tj3Var.f62385T;
            boolean zM22120g2 = tj3Var.m22120g(y60Var2) | tj3Var.m22118f(j);
            Object objM22097O2 = tj3Var.m22097O();
            Object obj2 = objM22097O2;
            if (zM22120g2 || objM22097O2 == p84Var) {
                ke1 ke1Var = new ke1(new z60(objM13277a, j));
                ke1Var.f47086c = new C3288l7(7);
                tj3Var.m22131l0(ke1Var);
                obj2 = ke1Var;
            }
            final ke1 ke1Var2 = (ke1) obj2;
            tj3Var.m22111b0(-585307852);
            boolean zM22124i = tj3Var.m22124i(ke1Var2) | ((i3 & 112) == 32);
            Object objM22097O3 = tj3Var.m22097O();
            Object obj3 = objM22097O3;
            if (zM22124i || objM22097O3 == p84Var) {
                C3006fm c3006fm = new C3006fm(i5, ke1Var2, ui3Var);
                tj3Var.m22131l0(c3006fm);
                obj3 = c3006fm;
            }
            d32.m10064x((ui3) obj3, tj3Var);
            Boolean boolValueOf = Boolean.valueOf(z3);
            int i6 = i3 & 14;
            int i7 = (tj3Var.m22124i(ke1Var2) ? 1 : 0) | (i6 != 4 ? 0 : 1);
            Object objM22097O4 = tj3Var.m22097O();
            Object obj4 = objM22097O4;
            if (i7 != 0 || objM22097O4 == p84Var) {
                vi3 vi3Var = new vi3() { // from class: a70
                    @Override // p000.vi3
                    public final Object invoke(Object obj5) {
                        ke1 ke1Var3 = ke1Var2;
                        w60 w60Var = (w60) ke1Var3.f67808a;
                        boolean z4 = z3;
                        w60Var.m15659f(z4);
                        ((v60) ke1Var3.f67809b).m3785f(z4);
                        return new c70((ac5) obj5, ke1Var3);
                    }
                };
                tj3Var.m22131l0(vi3Var);
                obj4 = vi3Var;
            }
            AbstractC3352my.m17110b(boolValueOf, ke1Var2, null, (vi3) obj4, tj3Var, i6);
            boolean zM22124i2 = tj3Var.m22124i(y60Var2) | tj3Var.m22124i(ke1Var2);
            Object objM22097O5 = tj3Var.m22097O();
            Object obj5 = objM22097O5;
            if (zM22124i2 || objM22097O5 == p84Var) {
                C3704w c3704w = new C3704w(3, y60Var2, ke1Var2);
                tj3Var.m22131l0(c3704w);
                obj5 = c3704w;
            }
            d32.m10043i(y60Var2, ke1Var2, (vi3) obj5, tj3Var);
            tj3Var.m22139q(false);
            z2 = z3;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new b70(z2, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m11124d(e16 e16Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-932836462);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            thb.m22044c(tj3Var, vz1.m23654x(e16Var, vi3Var));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(e16Var, i, i3, vi3Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final u8a m11125e() {
        return new u8a(new Paint(7));
    }

    /* JADX INFO: renamed from: f */
    public static final SweepGradient m11126f(long j, List list, List list2) {
        vz1.m23645o0(list, list2);
        return new SweepGradient(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), vz1.m23606L(list), vz1.m23607M(list2, list));
    }

    /* JADX INFO: renamed from: g */
    public static final long m11127g(int i, int i2) {
        if (i < 0 || i2 < 0) {
            j54.m14288a("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = cx9.f34693c;
        return j;
    }

    /* JADX INFO: renamed from: h */
    public static float m11128h(EdgeEffect edgeEffect, float f, float f2, fb2 fb2Var) {
        float f3 = ko2.f47599a;
        double dMo594a = fb2Var.mo594a() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) ko2.f47599a) * dMo594a;
        float fExp = (float) (Math.exp((ko2.f47600b / ko2.f47601c) * Math.log(dAbs / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (fExp > (i >= 31 ? AbstractC0818bo.m3991b(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int iM21693T = ss5.m21693T(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(iM21693T);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(iM21693T);
        }
        return f;
    }

    /* JADX INFO: renamed from: i */
    public static final Set m11129i(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (serialDescriptor instanceof rl0) {
            return ((rl0) serialDescriptor).mo3695b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo3697e());
        int iMo3697e = serialDescriptor.mo3697e();
        for (int i = 0; i < iMo3697e; i++) {
            hashSet.add(serialDescriptor.mo3698f(i));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: j */
    public static final long m11130j(int i, long j) {
        int i2 = cx9.f34693c;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : m11127g(i4, i);
    }

    /* JADX INFO: renamed from: k */
    public static final SerialDescriptor[] m11131k(List list) {
        SerialDescriptor[] serialDescriptorArr;
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? f37228H : serialDescriptorArr;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b2  */
    /* JADX INFO: renamed from: l */
    public static final KSerializer m11132l(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Field field;
        Object obj2;
        KSerializer kSerializerM11145z;
        Field field2;
        ey8 ey8Var;
        cls.getClass();
        if (cls.isEnum() && cls.getAnnotation(ey8.class) == null && cls.getAnnotation(sg7.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new zs2(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer kSerializerM11145z2 = obj == null ? null : m11145z(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (kSerializerM11145z2 != null) {
            return kSerializerM11145z2;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 == null || cl9.m4842Y(canonicalName2, "java.", false) || cl9.m4842Y(canonicalName2, "kotlin.", false)) {
            kSerializer = null;
        } else {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length = declaredFields.length;
            Field field3 = null;
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= length) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Field field4 = declaredFields[i];
                if (fa4.m11650l(field4.getName(), "INSTANCE") && fa4.m11650l(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                    if (!z) {
                        z = true;
                        field3 = field4;
                    }
                }
                i++;
                field3 = null;
                break;
            }
            if (field3 == null) {
                kSerializer = null;
            } else {
                Object obj3 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length2 = methods.length;
                Method method = null;
                int i2 = 0;
                boolean z2 = false;
                while (true) {
                    if (i2 >= length2) {
                        if (!z2) {
                            break;
                        }
                        break;
                    }
                    Method method2 = methods[i2];
                    if (fa4.m11650l(method2.getName(), "serializer")) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0 && fa4.m11650l(method2.getReturnType(), KSerializer.class)) {
                            if (!z2) {
                                z2 = true;
                                method = method2;
                            }
                        }
                    }
                    i2++;
                    method = null;
                    break;
                }
                if (method == null) {
                    kSerializer = null;
                } else {
                    Object objInvoke = method.invoke(obj3, null);
                    if (objInvoke instanceof KSerializer) {
                        kSerializer = (KSerializer) objInvoke;
                    } else {
                        kSerializer = null;
                    }
                }
            }
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        Field[] declaredFields2 = cls.getDeclaredFields();
        declaredFields2.getClass();
        int length3 = declaredFields2.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length3) {
                field = null;
                break;
            }
            field = declaredFields2[i3];
            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(n76.class) != null) {
                break;
            }
            i3++;
        }
        if (field == null) {
            obj2 = null;
        } else {
            try {
                field.setAccessible(true);
                obj2 = field.get(null);
            } catch (Throwable unused2) {
                obj2 = null;
            }
        }
        if (obj2 == null || (kSerializerM11145z = m11145z(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
            try {
                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                declaredClasses.getClass();
                int length4 = declaredClasses.length;
                Class<?> cls2 = null;
                int i4 = 0;
                boolean z3 = false;
                while (true) {
                    if (i4 < length4) {
                        Class<?> cls3 = declaredClasses[i4];
                        if (cls3.getSimpleName().equals("$serializer")) {
                            if (!z3) {
                                z3 = true;
                                cls2 = cls3;
                            }
                        }
                        i4++;
                    } else if (!z3) {
                    }
                    cls2 = null;
                    break;
                }
                Object obj4 = (cls2 == null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                kSerializerM11145z = obj4 instanceof KSerializer ? (KSerializer) obj4 : null;
            } catch (NoSuchFieldException unused3) {
            }
        }
        if (kSerializerM11145z != null) {
            return kSerializerM11145z;
        }
        if (cls.getAnnotation(sg7.class) == null && ((ey8Var = (ey8) cls.getAnnotation(ey8.class)) == null || !y38.m24933a(ey8Var.with()).equals(y38.m24933a(xg7.class)))) {
            return null;
        }
        return new xg7(y38.m24933a(cls));
    }

    /* JADX INFO: renamed from: m */
    public static void m11133m(String str, String str2) {
        if (m11105B(3)) {
            Log.d(str, " 💚 ".concat(str2));
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m11134o(d57 d57Var, u33 u33Var) throws IOException {
        try {
            IOException iOException = null;
            for (d57 d57Var2 : u33Var.mo266r(d57Var)) {
                try {
                    if (u33Var.m22435u(d57Var2).f60613c) {
                        m11134o(d57Var2, u33Var);
                    }
                    u33Var.mo265n(d57Var2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m11135p(String str, String str2) {
        if (m11105B(6)) {
            Log.e(str, " ❤️ " + str2);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m11136q(String str, String str2, Exception exc) {
        if (m11105B(6)) {
            Log.e(str, " ❤️ " + str2, exc);
        }
    }

    /* JADX INFO: renamed from: r */
    public static final int m11137r(int i, String str) {
        pq2 pq2VarM11142w = m11142w();
        Integer num = null;
        if (pq2VarM11142w != null) {
            if (!(pq2VarM11142w.m19451c() == 1)) {
                C3386nv.m17633t("Not initialized yet");
                return 0;
            }
            xwc.m24776n(str, "charSequence cannot be null");
            int iM12872A = ((gv5) pq2VarM11142w.f56652e.f52662a).m12872A(i, str);
            Integer numValueOf = Integer.valueOf(iM12872A);
            if (iM12872A != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.following(i);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0020  */
    /* JADX WARN: Code duplicated, block: B:19:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x002e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:45:0x008e A[EDGE_INSN: B:45:0x008e->B:41:0x008e BREAK  A[LOOP:0: B:11:0x0014->B:49:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x006f A[SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public static final List m11138s(d54 d54Var, int i, int i2) {
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        Pair pair;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        d54Var.getClass();
        if (i == i2) {
            return EmptyList.f47638a;
        }
        boolean z2 = i2 > i;
        ArrayList arrayList = new ArrayList();
        do {
            if (!z2) {
                if (i <= i2) {
                    return arrayList;
                }
                linkedHashMap = d54Var.f35011a;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap, treeMap.keySet());
                    }
                }
                if (pair == null) {
                    Map map = (Map) pair.f47623a;
                    it = ((Iterable) pair.f47624b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i + 1 <= iIntValue) {
                                continue;
                            }
                        } else if (i2 <= iIntValue) {
                            continue;
                        }
                    }
                } else {
                    break;
                    break;
                }
            } else {
                if (i >= i2) {
                    return arrayList;
                }
                linkedHashMap = d54Var.f35011a;
                if (z2) {
                    treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap2 == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                    }
                } else {
                    treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i));
                    if (treeMap == null) {
                        pair = null;
                    } else {
                        pair = new Pair(treeMap, treeMap.keySet());
                    }
                }
                if (pair == null) {
                    Map map2 = (Map) pair.f47623a;
                    it = ((Iterable) pair.f47624b).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            z = false;
                            break;
                        }
                        iIntValue = ((Number) it.next()).intValue();
                        if (!z2) {
                            if (i2 <= iIntValue && iIntValue < i) {
                                Object obj = map2.get(Integer.valueOf(iIntValue));
                                obj.getClass();
                                arrayList.add(obj);
                                z = true;
                                i = iIntValue;
                                break;
                                break;
                            }
                        } else if (i + 1 <= iIntValue && iIntValue <= i2) {
                            Object obj2 = map2.get(Integer.valueOf(iIntValue));
                            obj2.getClass();
                            arrayList.add(obj2);
                            z = true;
                            i = iIntValue;
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        } while (z);
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final int m11139t(int i, String str) {
        pq2 pq2VarM11142w = m11142w();
        Integer num = null;
        if (pq2VarM11142w != null) {
            Integer numValueOf = Integer.valueOf(pq2VarM11142w.m19450b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    /* JADX INFO: renamed from: u */
    public static Object m11140u(in1 in1Var, Object obj, zi3 zi3Var) {
        zi3Var.getClass();
        return zi3Var.invoke(obj, in1Var);
    }

    /* JADX INFO: renamed from: v */
    public static in1 m11141v(in1 in1Var, jn1 jn1Var) {
        jn1Var.getClass();
        if (fa4.m11650l(in1Var.getKey(), jn1Var)) {
            return in1Var;
        }
        return null;
    }

    /* JADX INFO: renamed from: w */
    public static final pq2 m11142w() {
        if (!pq2.m19449d()) {
            return null;
        }
        pq2 pq2VarM19448a = pq2.m19448a();
        if (pq2VarM19448a.m19451c() == 1) {
            return pq2VarM19448a;
        }
        return null;
    }

    /* JADX INFO: renamed from: x */
    public static nt3 m11143x(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c, zta ztaVar) {
        cy1 cy1Var = ((fy1) ((t92) ci8.m4741z(abstractComponentCallbacksC0635c, t92.class))).f39920c;
        es4 es4VarM9932a = cy1Var.m9932a();
        b64 b64Var = new b64(cy1Var.f34704a, cy1Var.f34705b);
        ztaVar.getClass();
        return new nt3(es4VarM9932a, ztaVar, b64Var);
    }

    /* JADX INFO: renamed from: y */
    public static final Paint m11144y(u8a u8aVar) {
        if (u8aVar == null) {
            h54.m13056a("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + y38.m24933a(u8aVar.getClass()).m25413b());
        }
        return (Paint) u8aVar.f63594c;
    }

    /* JADX INFO: renamed from: z */
    public static final KSerializer m11145z(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    /* JADX INFO: renamed from: n */
    public abstract Object mo53n();

    public String toString() {
        switch (this.f37247a) {
            case 14:
                return mo53n().toString();
            default:
                return super.toString();
        }
    }
}
