package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.os.Trace;
import android.text.Spanned;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.C0077c;
import androidx.compose.foundation.gestures.C0100h;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.staggeredgrid.AbstractC0141a;
import androidx.compose.foundation.lazy.staggeredgrid.C0144d;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.semantics.C0427g;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import androidx.room.C0738c;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.common.base.Optional;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.feature.library.R$drawable;
import com.lingq.feature.library.R$string;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.sequences.AbstractC3204c;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes.dex */
public abstract class xwc {

    /* JADX INFO: renamed from: a */
    public static volatile Optional f68911a;

    /* JADX INFO: renamed from: b */
    public static final C0282a f68912b = new C0282a(-1548712596, false, new C2914d4(13));

    /* JADX INFO: renamed from: c */
    public static final e28 f68913c = new e28(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX INFO: renamed from: d */
    public static final char[] f68914d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f68915e = 0;

    /* JADX INFO: renamed from: A */
    public static C3073hf m24728A(String str) {
        C3073hf c3073hf;
        str.getClass();
        synchronized (C3073hf.f42287c) {
            try {
                LinkedHashMap linkedHashMap = C3073hf.f42288d;
                Object c3073hf2 = linkedHashMap.get(str);
                if (c3073hf2 == null) {
                    c3073hf2 = new C3073hf();
                    linkedHashMap.put(str, c3073hf2);
                }
                c3073hf = (C3073hf) c3073hf2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3073hf;
    }

    /* JADX INFO: renamed from: B */
    public static final int m24729B(w46 w46Var, long j, hta htaVar) {
        float fMo13461g = htaVar != null ? htaVar.mo13461g() : 0.0f;
        int i = (int) (4294967295L & j);
        int iM23744e = w46Var.m23744e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < w46Var.m23745f(iM23744e) - fMo13461g || Float.intBitsToFloat(i) > w46Var.m23741b(iM23744e) + fMo13461g) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-fMo13461g) || Float.intBitsToFloat(i2) > w46Var.f66379d + fMo13461g) {
            return -1;
        }
        return iM23744e;
    }

    /* JADX INFO: renamed from: C */
    public static Object m24730C(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return qj0.m19996b(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* JADX INFO: renamed from: D */
    public static final long m24731D(yw4 yw4Var, e28 e28Var, int i) {
        fg2 fg2Var = s46.f60292g;
        sw9 sw9VarM25363d = yw4Var.m25363d();
        w46 w46Var = sw9VarM25363d != null ? sw9VarM25363d.f61519a.f59976b : null;
        aq4 aq4VarM25362c = yw4Var.m25362c();
        return (w46Var == null || aq4VarM25362c == null) ? cx9.f34692b : w46Var.m23747h(e28Var.m10810k(aq4VarM25362c.mo1668L(0L)), i, fg2Var);
    }

    /* JADX INFO: renamed from: E */
    public static final rw9 m24732E(kv8 kv8Var) {
        vi3 vi3Var;
        ArrayList arrayList = new ArrayList();
        C3024g3 c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4945a);
        if (c3024g3 == null || (vi3Var = (vi3) c3024g3.f40091b) == null || !((Boolean) vi3Var.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (rw9) arrayList.get(0);
    }

    /* JADX INFO: renamed from: F */
    public static final boolean m24733F(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    /* JADX INFO: renamed from: G */
    public static e16 m24734G(e16 e16Var, v56 v56Var) {
        return e16Var.mo3161g(new tv3(v56Var));
    }

    /* JADX INFO: renamed from: H */
    public static final boolean m24735H(C0423c c0423c) {
        AbstractC0362l abstractC0362lM1843d = c0423c.m1843d();
        n66 n66Var = c0423c.f4974d.f48471a;
        return (abstractC0362lM1843d != null ? abstractC0362lM1843d.m1692n1() : false) || n66Var.m17251c(AbstractC0424d.f5010q) || n66Var.m17251c(AbstractC0424d.f5009p);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    /* JADX INFO: renamed from: I */
    public static final boolean m24736I(C0423c c0423c) {
        if (!m24735H(c0423c)) {
            kv8 kv8Var = c0423c.f4974d;
            if (kv8Var.f48473c) {
                return true;
            }
            n66 n66Var = kv8Var.f48471a;
            Object[] objArr = n66Var.f52400b;
            Object[] objArr2 = n66Var.f52401c;
            long[] jArr = n66Var.f52399a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((C0427g) obj).f5025c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public static final boolean m24737J(int i, String str, int i2) {
        str.getClass();
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && icb.m13777m(str.charAt(i + 1)) != -1 && icb.m13777m(str.charAt(i3)) != -1;
    }

    /* JADX INFO: renamed from: K */
    public static final boolean m24738K(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    /* JADX INFO: renamed from: L */
    public static final boolean m24739L(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    /* JADX INFO: renamed from: M */
    public static final boolean m24740M(int i) {
        int type;
        return (!m24739L(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }

    /* JADX INFO: renamed from: N */
    public static final e16 m24741N(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new zr6(vi3Var));
    }

    /* JADX INFO: renamed from: O */
    public static String m24742O(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        str.getClass();
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                aj0 aj0Var = new aj0();
                aj0Var.m493p0(i, str, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iM13777m = icb.m13777m(str.charAt(iCharCount + 1));
                        int iM13777m2 = icb.m13777m(str.charAt(i4));
                        if (iM13777m == -1 || iM13777m2 == -1) {
                            aj0Var.m496r0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            aj0Var.m487k0((iM13777m << 4) + iM13777m2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        aj0Var.m487k0(32);
                        iCharCount++;
                    } else {
                        aj0Var.m496r0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return aj0Var.m472Y();
            }
            iCharCount++;
        }
        return str.substring(i, i2);
    }

    /* JADX INFO: renamed from: P */
    public static final Object m24743P(l77 l77Var, AbstractC0279g abstractC0279g) {
        abstractC0279g.getClass();
        Object objMo1266b = l77Var.get(abstractC0279g);
        if (objMo1266b == null) {
            objMo1266b = abstractC0279g.mo1266b();
        }
        return ((aoa) objMo1266b).mo367a(l77Var);
    }

    /* JADX INFO: renamed from: Q */
    public static final t66 m24744Q(Object[] objArr, ui3 ui3Var, ye1 ye1Var, int i) {
        return (t66) m24746S(Arrays.copyOf(objArr, objArr.length), new fs6(19, new ln1(16), new vp6(22)), ui3Var, ye1Var, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: R */
    public static final Object m24745R(Object[] objArr, ui3 ui3Var, ye1 ye1Var, int i) {
        return m24746S(Arrays.copyOf(objArr, objArr.length), pk9.f56362g, ui3Var, ye1Var, ((i << 6) & 7168) | 384);
    }

    /* JADX INFO: renamed from: S */
    public static final Object m24746S(Object[] objArr, yl8 yl8Var, ui3 ui3Var, ye1 ye1Var, int i) {
        Object[] objArr2;
        yl8 yl8Var2;
        final Object obj;
        Object objMo10402e;
        tj3 tj3Var = (tj3) ye1Var;
        long j = tj3Var.f62385T;
        ci8.m4727l(36);
        final String string = Long.toString(j, 36);
        string.getClass();
        yl8Var.getClass();
        final il8 il8Var = (il8) tj3Var.m22128k(kl8.f47496a);
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            Object objMo4857c = (il8Var == null || (objMo10402e = il8Var.mo10402e(string)) == null) ? null : yl8Var.mo4857c(objMo10402e);
            if (objMo4857c == null) {
                objMo4857c = ui3Var.mo0a();
            }
            objArr2 = objArr;
            yl8Var2 = yl8Var;
            el8 el8Var = new el8(yl8Var2, il8Var, string, objMo4857c, objArr2);
            tj3Var.m22131l0(el8Var);
            objM22097O = el8Var;
        } else {
            objArr2 = objArr;
            yl8Var2 = yl8Var;
        }
        final el8 el8Var2 = (el8) objM22097O;
        Object objMo0a = Arrays.equals(objArr2, el8Var2.f37445e) ? el8Var2.f37444d : null;
        if (objMo0a == null) {
            objMo0a = ui3Var.mo0a();
        }
        boolean zM22124i = tj3Var.m22124i(el8Var2) | ((((i & 112) ^ 48) > 32 && tj3Var.m22124i(yl8Var2)) || (i & 48) == 32) | tj3Var.m22124i(il8Var) | tj3Var.m22120g(string) | tj3Var.m22124i(objMo0a) | tj3Var.m22124i(objArr2);
        Object objM22097O2 = tj3Var.m22097O();
        if (zM22124i || objM22097O2 == p84Var) {
            final Object[] objArr3 = objArr2;
            obj = objMo0a;
            final yl8 yl8Var3 = yl8Var2;
            ui3 ui3Var2 = new ui3() { // from class: y48
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() throws NoSuchMethodException, ClassNotFoundException, IOException {
                    boolean z;
                    el8 el8Var3 = el8Var2;
                    il8 il8Var2 = el8Var3.f37442b;
                    il8 il8Var3 = il8Var;
                    boolean z2 = true;
                    if (il8Var2 != il8Var3) {
                        el8Var3.f37442b = il8Var3;
                        z = true;
                    } else {
                        z = false;
                    }
                    String str = el8Var3.f37443c;
                    String str2 = string;
                    if (fa4.m11650l(str, str2)) {
                        z2 = z;
                    } else {
                        el8Var3.f37443c = str2;
                    }
                    el8Var3.f37441a = yl8Var3;
                    el8Var3.f37444d = obj;
                    el8Var3.f37445e = objArr3;
                    hl8 hl8Var = el8Var3.f37446f;
                    if (hl8Var != null && z2) {
                        ((sq5) hl8Var).m21556E();
                        el8Var3.f37446f = null;
                        el8Var3.m11216a();
                    }
                    return xfa.f68157a;
                }
            };
            tj3Var.m22131l0(ui3Var2);
            objM22097O2 = ui3Var2;
        } else {
            obj = objMo0a;
        }
        d32.m10064x((ui3) objM22097O2, tj3Var);
        return obj;
    }

    /* JADX INFO: renamed from: T */
    public static final Object m24747T(Object[] objArr, yl8 yl8Var, ui3 ui3Var, ye1 ye1Var, int i) {
        return m24746S(Arrays.copyOf(objArr, objArr.length), yl8Var, ui3Var, ye1Var, ((i << 3) & 7168) | 384);
    }

    /* JADX INFO: renamed from: U */
    public static TypedValue m24748U(Resources.Theme theme, int i) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: V */
    public static boolean m24749V(Resources.Theme theme, int i, boolean z) {
        TypedValue typedValueM24748U = m24748U(theme, i);
        if (typedValueM24748U == null || typedValueM24748U.type != 18) {
            return z;
        }
        return typedValueM24748U.data != 0;
    }

    /* JADX INFO: renamed from: W */
    public static int m24750W(Context context) {
        int i = R$attr.minTouchTargetSize;
        int i2 = R$dimen.mtrl_min_touch_target_size;
        Resources.Theme theme = context.getTheme();
        TypedValue typedValueM24748U = m24748U(theme, i);
        float dimension = (typedValueM24748U == null || typedValueM24748U.type != 5) ? Float.NaN : typedValueM24748U.getDimension(theme.getResources().getDisplayMetrics());
        return Float.isNaN(dimension) ? (int) context.getResources().getDimension(i2) : (int) dimension;
    }

    /* JADX INFO: renamed from: X */
    public static TypedValue m24751X(int i, Context context, String str) {
        TypedValue typedValueM24748U = m24748U(context.getTheme(), i);
        if (typedValueM24748U != null) {
            return typedValueM24748U;
        }
        uk9.m22783r("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
        return null;
    }

    /* JADX INFO: renamed from: Y */
    public static TypedValue m24752Y(View view, int i) {
        return m24751X(i, view.getContext(), view.getClass().getCanonicalName());
    }

    /* JADX INFO: renamed from: Z */
    public static final void m24753Z(sm0 sm0Var, Continuation continuation, boolean z) {
        Object objM21467t = sm0Var.m21467t();
        Throwable thMo16218e = sm0Var.mo16218e(objM21467t);
        Object failure = thMo16218e != null ? new Result.Failure(thMo16218e) : sm0Var.mo16219f(objM21467t);
        if (!z) {
            continuation.resumeWith(failure);
            return;
        }
        continuation.getClass();
        kh2 kh2Var = (kh2) continuation;
        ContinuationImpl continuationImpl = kh2Var.f47290e;
        Object obj = kh2Var.f47292g;
        kn1 context = continuationImpl.getContext();
        Object objM20372O = r46.m20372O(context, obj);
        ofa ofaVarM21986S = objM20372O != r46.f58686p ? te1.m21986S(continuationImpl, context, objM20372O) : null;
        try {
            continuationImpl.resumeWith(failure);
        } finally {
            if (ofaVarM21986S == null || ofaVarM21986S.m17963r0()) {
                r46.m20367J(context, objM20372O);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m24754a(final C3436ou c3436ou, final ui3 ui3Var, final ui3 ui3Var2, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        x18 x18VarM22143u;
        zi3 zi3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2080503388);
        int i2 = i | (tj3Var2.m22124i(c3436ou) ? 4 : 2) | (tj3Var2.m22124i(ui3Var) ? 32 : 16) | (tj3Var2.m22124i(ui3Var2) ? 256 : 128);
        int i3 = 0;
        int i4 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            if (c3436ou.f54986a) {
                LibraryItem libraryItem = c3436ou.f54987b;
                final int i5 = fa4.m11650l(libraryItem != null ? libraryItem.f19428b : null, LibraryItemType.Collection.getValue()) ? R$string.archive_course_confirmation : R$string.archive_lesson_confirmation;
                tj3Var = tj3Var2;
                q2d.m19625a(ui3Var2, ci8.m4703P(2133768868, new C3348mu(i3, ui3Var), tj3Var2), null, ci8.m4703P(-1258277850, new C3348mu(i4, ui3Var2), tj3Var2), null, smb.f61030c, ci8.m4703P(-2051380631, new zi3() { // from class: nu
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            lw9.m16554b(vz1.m23620a0(tj3Var3, i5), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, ((i2 >> 6) & 14) | 1772592, 16276);
            } else {
                x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i6 = 0;
                zi3Var = new zi3(c3436ou, ui3Var, ui3Var2, i, i6) { // from class: lu

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f50125a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ C3436ou f50126b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ ui3 f50127c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ ui3 f50128d;

                    {
                        this.f50125a = i6;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i7 = this.f50125a;
                        xfa xfaVar = xfa.f68157a;
                        ui3 ui3Var3 = this.f50128d;
                        ui3 ui3Var4 = this.f50127c;
                        C3436ou c3436ou2 = this.f50126b;
                        ye1 ye1Var2 = (ye1) obj;
                        ((Integer) obj2).getClass();
                        switch (i7) {
                            case 0:
                                xwc.m24754a(c3436ou2, ui3Var4, ui3Var3, ye1Var2, pk9.m19383z(1));
                                break;
                            default:
                                xwc.m24754a(c3436ou2, ui3Var4, ui3Var3, ye1Var2, pk9.m19383z(1));
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        tj3Var = tj3Var2;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i7 = 1;
            zi3Var = new zi3(c3436ou, ui3Var, ui3Var2, i, i7) { // from class: lu

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f50125a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C3436ou f50126b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ui3 f50127c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ui3 f50128d;

                {
                    this.f50125a = i7;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i8 = this.f50125a;
                    xfa xfaVar = xfa.f68157a;
                    ui3 ui3Var3 = this.f50128d;
                    ui3 ui3Var4 = this.f50127c;
                    C3436ou c3436ou2 = this.f50126b;
                    ye1 ye1Var2 = (ye1) obj;
                    ((Integer) obj2).getClass();
                    switch (i8) {
                        case 0:
                            xwc.m24754a(c3436ou2, ui3Var4, ui3Var3, ye1Var2, pk9.m19383z(1));
                            break;
                        default:
                            xwc.m24754a(c3436ou2, ui3Var4, ui3Var3, ye1Var2, pk9.m19383z(1));
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final j84 m24755a0(e28 e28Var) {
        return new j84(Math.round(e28Var.f36620a), Math.round(e28Var.f36621b), Math.round(e28Var.f36622c), Math.round(e28Var.f36623d));
    }

    /* JADX INFO: renamed from: b */
    public static final j84 m24756b(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new j84(i, i2, ((int) (j2 >> 32)) + i, ((int) (j2 & 4294967295L)) + i2);
    }

    /* JADX INFO: renamed from: b0 */
    public static long m24757b0(long j, long j2) {
        long j3 = j + j2;
        if ((j ^ j3) >= 0 || (j ^ j2) < 0) {
            return j3;
        }
        StringBuilder sbM22996s = ux5.m22996s(j, "The calculation caused an overflow: ", " + ");
        sbM22996s.append(j2);
        throw new ArithmeticException(sbM22996s.toString());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0138  */
    /* JADX WARN: Code duplicated, block: B:101:0x013f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x014d  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0162  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:127:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:143:0x01e6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:146:0x023b  */
    /* JADX WARN: Code duplicated, block: B:149:0x024e  */
    /* JADX WARN: Code duplicated, block: B:151:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00da  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:87:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0134  */
    /* JADX INFO: renamed from: c */
    public static final void m24758c(final kg9 kg9Var, final e16 e16Var, C0144d c0144d, t17 t17Var, float f, final InterfaceC3624tu interfaceC3624tu, x63 x63Var, boolean z, C0077c c0077c, final vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        e16 e16Var2;
        C0144d c0144d2;
        t17 t17Var2;
        int i4;
        int i5;
        float f2;
        int i6;
        x63 x63Var2;
        int i7;
        int i8;
        int i9;
        boolean z2;
        tj3 tj3Var;
        final float f3;
        final C0144d c0144d3;
        final x63 x63Var3;
        final t17 t17Var3;
        final boolean z3;
        final C0077c c0077c2;
        x18 x18VarM22143u;
        int i10;
        C0144d c0144dM19027O;
        t17 x17Var;
        C0144d c0144d4;
        int i11;
        x63 x63Var4;
        boolean z4;
        C0077c c0077cM24823b;
        float f4;
        f32 f32VarM21341a;
        boolean zM22120g;
        Object objM22097O;
        boolean z5;
        Object objM22097O2;
        int i12;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-578931208);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22120g(kg9Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            e16Var2 = e16Var;
            i3 |= tj3Var2.m22120g(e16Var2) ? 32 : 16;
        } else {
            e16Var2 = e16Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c0144d2 = c0144d;
                int i13 = tj3Var2.m22120g(c0144d2) ? 256 : 128;
                i3 |= i13;
            } else {
                c0144d2 = c0144d;
            }
            i3 |= i13;
        } else {
            c0144d2 = c0144d;
        }
        int i14 = i2 & 8;
        if (i14 == 0) {
            if ((i & 3072) == 0) {
                t17Var2 = t17Var;
                i3 |= tj3Var2.m22120g(t17Var2) ? 2048 : 1024;
            }
            i4 = i3 | 24576;
            i5 = i2 & 32;
            if (i5 != 0) {
                if ((196608 & i) == 0) {
                    f2 = f;
                    if (tj3Var2.m22114d(f2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                if ((i & 1572864) == 0) {
                    if (tj3Var2.m22120g(interfaceC3624tu)) {
                        i12 = 1048576;
                    } else {
                        i12 = 524288;
                    }
                    i4 |= i12;
                }
                if ((i & 12582912) == 0) {
                    if ((i2 & 128) == 0) {
                        x63Var2 = x63Var;
                        int i15 = tj3Var2.m22120g(x63Var2) ? 8388608 : 4194304;
                        i4 |= i15;
                    } else {
                        x63Var2 = x63Var;
                    }
                    i4 |= i15;
                } else {
                    x63Var2 = x63Var;
                }
                i7 = i4 | 100663296;
                if ((i & 805306368) == 0) {
                    i7 = i4 | 369098752;
                }
                i8 = i7;
                if (tj3Var2.m22124i(vi3Var)) {
                    i9 = 4;
                } else {
                    i9 = 2;
                }
                if ((i8 & 306783379) == 306783378 || (i9 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i8 & 1, z2)) {
                    tj3Var2.m22104W();
                    i10 = i & 1;
                    p84 p84Var = we1.f66679a;
                    if (i10 != 0 || tj3Var2.m22084B()) {
                        if ((i2 & 4) != 0) {
                            c0144dM19027O = pb1.m19027O(tj3Var2);
                            i8 &= -897;
                        } else {
                            c0144dM19027O = c0144d2;
                        }
                        if (i14 != 0) {
                            x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                        } else {
                            x17Var = t17Var2;
                        }
                        float f5 = i5 == 0 ? f2 : 0.0f;
                        if ((i2 & 128) != 0) {
                            f32VarM21341a = sf9.m21341a(tj3Var2);
                            zM22120g = tj3Var2.m22120g(f32VarM21341a);
                            objM22097O = tj3Var2.m22097O();
                            if (zM22120g || objM22097O == p84Var) {
                                objM22097O = new C0100h(f32VarM21341a);
                                tj3Var2.m22131l0(objM22097O);
                            }
                            i8 &= -29360129;
                            x63Var2 = (C0100h) objM22097O;
                        }
                        c0144d4 = c0144dM19027O;
                        i11 = i8 & (-1879048193);
                        x63Var4 = x63Var2;
                        z4 = true;
                        c0077cM24823b = y07.m24823b(tj3Var2);
                        f4 = f5;
                    } else {
                        tj3Var2.m22102U();
                        if ((i2 & 4) != 0) {
                            i8 &= -897;
                        }
                        if ((i2 & 128) != 0) {
                            i8 &= -29360129;
                        }
                        i11 = i8 & (-1879048193);
                        z4 = z;
                        x63Var4 = x63Var2;
                        x17Var = t17Var2;
                        f4 = f2;
                        c0144d4 = c0144d2;
                        c0077cM24823b = c0077c;
                    }
                    tj3Var2.m22140r();
                    Orientation orientation = Orientation.Vertical;
                    float fMo9967a = interfaceC3624tu.mo9967a();
                    int i16 = i11 >> 3;
                    int i17 = (i16 & 896) | (i11 & 14) | ((i11 >> 15) & 112);
                    z5 = ((((i17 & 112) ^ 48) <= 32 && tj3Var2.m22120g(interfaceC3624tu)) || (i17 & 48) == 32) | ((((i17 & 14) ^ 6) <= 4 && tj3Var2.m22120g(kg9Var)) || (i17 & 6) == 4) | ((((i17 & 896) ^ 384) <= 256 && tj3Var2.m22120g(x17Var)) || (i17 & 384) == 256);
                    objM22097O2 = tj3Var2.m22097O();
                    if (z5 || objM22097O2 == p84Var) {
                        objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    int i18 = i11 << 3;
                    int i19 = (i9 << 3) & 112;
                    tj3Var = tj3Var2;
                    t17 t17Var4 = x17Var;
                    AbstractC0141a.m1020a(c0144d4, orientation, (gw4) objM22097O2, e16Var2, t17Var4, x63Var4, z4, c0077cM24823b, f4, fMo9967a, vi3Var, tj3Var, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (57344 & i18) | (i18 & 458752) | (i16 & 3670016) | (i16 & 29360128) | ((i11 << 12) & 1879048192), i19);
                    c0144d3 = c0144d4;
                    t17Var3 = t17Var4;
                    x63Var3 = x63Var4;
                    z3 = z4;
                    c0077c2 = c0077cM24823b;
                    f3 = f4;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    f3 = f2;
                    c0144d3 = c0144d2;
                    x63Var3 = x63Var2;
                    t17Var3 = t17Var2;
                    z3 = z;
                    c0077c2 = c0077c;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: rv4
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            xwc.m24758c(kg9Var, e16Var, c0144d3, t17Var3, f3, interfaceC3624tu, x63Var3, z3, c0077c2, vi3Var, (ye1) obj, pk9.m19383z(i | 1), i2);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i4 = 221184 | i3;
            f2 = f;
            if ((i & 1572864) == 0) {
                if (tj3Var2.m22120g(interfaceC3624tu)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    x63Var2 = x63Var;
                    if (tj3Var2.m22120g(x63Var2)) {
                    }
                    i4 |= i15;
                } else {
                    x63Var2 = x63Var;
                }
                i4 |= i15;
            } else {
                x63Var2 = x63Var;
            }
            i7 = i4 | 100663296;
            if ((i & 805306368) == 0) {
                i7 = i4 | 369098752;
            }
            i8 = i7;
            if (tj3Var2.m22124i(vi3Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z2)) {
                tj3Var2.m22104W();
                i10 = i & 1;
                p84 p84Var2 = we1.f66679a;
                if (i10 != 0) {
                    if ((i2 & 4) != 0) {
                        c0144dM19027O = pb1.m19027O(tj3Var2);
                        i8 &= -897;
                    } else {
                        c0144dM19027O = c0144d2;
                    }
                    if (i14 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        x17Var = t17Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 128) != 0) {
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        i8 &= -29360129;
                        x63Var2 = (C0100h) objM22097O;
                    }
                    c0144d4 = c0144dM19027O;
                    i11 = i8 & (-1879048193);
                    x63Var4 = x63Var2;
                    z4 = true;
                    c0077cM24823b = y07.m24823b(tj3Var2);
                    f4 = f5;
                } else {
                    if ((i2 & 4) != 0) {
                        c0144dM19027O = pb1.m19027O(tj3Var2);
                        i8 &= -897;
                    } else {
                        c0144dM19027O = c0144d2;
                    }
                    if (i14 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        x17Var = t17Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 128) != 0) {
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        i8 &= -29360129;
                        x63Var2 = (C0100h) objM22097O;
                    }
                    c0144d4 = c0144dM19027O;
                    i11 = i8 & (-1879048193);
                    x63Var4 = x63Var2;
                    z4 = true;
                    c0077cM24823b = y07.m24823b(tj3Var2);
                    f4 = f5;
                }
                tj3Var2.m22140r();
                Orientation orientation2 = Orientation.Vertical;
                float fMo9967a2 = interfaceC3624tu.mo9967a();
                int i110 = i11 >> 3;
                int i111 = (i110 & 896) | (i11 & 14) | ((i11 >> 15) & 112);
                if (((i111 & 14) ^ 6) <= 4) {
                }
                z5 = ((((i111 & 112) ^ 48) <= 32 && tj3Var2.m22120g(interfaceC3624tu)) || (i111 & 48) == 32) | ((((i111 & 14) ^ 6) <= 4 && tj3Var2.m22120g(kg9Var)) || (i111 & 6) == 4) | ((((i111 & 896) ^ 384) <= 256 && tj3Var2.m22120g(x17Var)) || (i111 & 384) == 256);
                objM22097O2 = tj3Var2.m22097O();
                if (z5) {
                    objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                    tj3Var2.m22131l0(objM22097O2);
                }
                int i112 = i11 << 3;
                int i113 = (i9 << 3) & 112;
                tj3Var = tj3Var2;
                t17 t17Var5 = x17Var;
                AbstractC0141a.m1020a(c0144d4, orientation2, (gw4) objM22097O2, e16Var2, t17Var5, x63Var4, z4, c0077cM24823b, f4, fMo9967a2, vi3Var, tj3Var, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (57344 & i112) | (i112 & 458752) | (i110 & 3670016) | (i110 & 29360128) | ((i11 << 12) & 1879048192), i113);
                c0144d3 = c0144d4;
                t17Var3 = t17Var5;
                x63Var3 = x63Var4;
                z3 = z4;
                c0077c2 = c0077cM24823b;
                f3 = f4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                f3 = f2;
                c0144d3 = c0144d2;
                x63Var3 = x63Var2;
                t17Var3 = t17Var2;
                z3 = z;
                c0077c2 = c0077c;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: rv4
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xwc.m24758c(kg9Var, e16Var, c0144d3, t17Var3, f3, interfaceC3624tu, x63Var3, z3, c0077c2, vi3Var, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 3072;
        t17Var2 = t17Var;
        i4 = i3 | 24576;
        i5 = i2 & 32;
        if (i5 != 0) {
            if ((196608 & i) == 0) {
                f2 = f;
                if (tj3Var2.m22114d(f2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            if ((i & 1572864) == 0) {
                if (tj3Var2.m22120g(interfaceC3624tu)) {
                    i12 = 1048576;
                } else {
                    i12 = 524288;
                }
                i4 |= i12;
            }
            if ((i & 12582912) == 0) {
                if ((i2 & 128) == 0) {
                    x63Var2 = x63Var;
                    if (tj3Var2.m22120g(x63Var2)) {
                    }
                    i4 |= i15;
                } else {
                    x63Var2 = x63Var;
                }
                i4 |= i15;
            } else {
                x63Var2 = x63Var;
            }
            i7 = i4 | 100663296;
            if ((i & 805306368) == 0) {
                i7 = i4 | 369098752;
            }
            i8 = i7;
            if (tj3Var2.m22124i(vi3Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            if ((i8 & 306783379) == 306783378) {
                z2 = true;
            } else {
                z2 = true;
            }
            if (tj3Var2.m22099R(i8 & 1, z2)) {
                tj3Var2.m22104W();
                i10 = i & 1;
                p84 p84Var3 = we1.f66679a;
                if (i10 != 0) {
                    if ((i2 & 4) != 0) {
                        c0144dM19027O = pb1.m19027O(tj3Var2);
                        i8 &= -897;
                    } else {
                        c0144dM19027O = c0144d2;
                    }
                    if (i14 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        x17Var = t17Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 128) != 0) {
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        i8 &= -29360129;
                        x63Var2 = (C0100h) objM22097O;
                    }
                    c0144d4 = c0144dM19027O;
                    i11 = i8 & (-1879048193);
                    x63Var4 = x63Var2;
                    z4 = true;
                    c0077cM24823b = y07.m24823b(tj3Var2);
                    f4 = f5;
                } else {
                    if ((i2 & 4) != 0) {
                        c0144dM19027O = pb1.m19027O(tj3Var2);
                        i8 &= -897;
                    } else {
                        c0144dM19027O = c0144d2;
                    }
                    if (i14 != 0) {
                        x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                    } else {
                        x17Var = t17Var2;
                    }
                    if (i5 == 0) {
                    }
                    if ((i2 & 128) != 0) {
                        f32VarM21341a = sf9.m21341a(tj3Var2);
                        zM22120g = tj3Var2.m22120g(f32VarM21341a);
                        objM22097O = tj3Var2.m22097O();
                        if (zM22120g) {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        } else {
                            objM22097O = new C0100h(f32VarM21341a);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        i8 &= -29360129;
                        x63Var2 = (C0100h) objM22097O;
                    }
                    c0144d4 = c0144dM19027O;
                    i11 = i8 & (-1879048193);
                    x63Var4 = x63Var2;
                    z4 = true;
                    c0077cM24823b = y07.m24823b(tj3Var2);
                    f4 = f5;
                }
                tj3Var2.m22140r();
                Orientation orientation3 = Orientation.Vertical;
                float fMo9967a3 = interfaceC3624tu.mo9967a();
                int i114 = i11 >> 3;
                int i115 = (i114 & 896) | (i11 & 14) | ((i11 >> 15) & 112);
                if (((i115 & 14) ^ 6) <= 4) {
                }
                z5 = ((((i115 & 112) ^ 48) <= 32 && tj3Var2.m22120g(interfaceC3624tu)) || (i115 & 48) == 32) | ((((i115 & 14) ^ 6) <= 4 && tj3Var2.m22120g(kg9Var)) || (i115 & 6) == 4) | ((((i115 & 896) ^ 384) <= 256 && tj3Var2.m22120g(x17Var)) || (i115 & 384) == 256);
                objM22097O2 = tj3Var2.m22097O();
                if (z5) {
                    objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                    tj3Var2.m22131l0(objM22097O2);
                } else {
                    objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                    tj3Var2.m22131l0(objM22097O2);
                }
                int i116 = i11 << 3;
                int i117 = (i9 << 3) & 112;
                tj3Var = tj3Var2;
                t17 t17Var6 = x17Var;
                AbstractC0141a.m1020a(c0144d4, orientation3, (gw4) objM22097O2, e16Var2, t17Var6, x63Var4, z4, c0077cM24823b, f4, fMo9967a3, vi3Var, tj3Var, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (57344 & i116) | (i116 & 458752) | (i114 & 3670016) | (i114 & 29360128) | ((i11 << 12) & 1879048192), i117);
                c0144d3 = c0144d4;
                t17Var3 = t17Var6;
                x63Var3 = x63Var4;
                z3 = z4;
                c0077c2 = c0077cM24823b;
                f3 = f4;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                f3 = f2;
                c0144d3 = c0144d2;
                x63Var3 = x63Var2;
                t17Var3 = t17Var2;
                z3 = z;
                c0077c2 = c0077c;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: rv4
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        xwc.m24758c(kg9Var, e16Var, c0144d3, t17Var3, f3, interfaceC3624tu, x63Var3, z3, c0077c2, vi3Var, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 = 221184 | i3;
        f2 = f;
        if ((i & 1572864) == 0) {
            if (tj3Var2.m22120g(interfaceC3624tu)) {
                i12 = 1048576;
            } else {
                i12 = 524288;
            }
            i4 |= i12;
        }
        if ((i & 12582912) == 0) {
            if ((i2 & 128) == 0) {
                x63Var2 = x63Var;
                if (tj3Var2.m22120g(x63Var2)) {
                }
                i4 |= i15;
            } else {
                x63Var2 = x63Var;
            }
            i4 |= i15;
        } else {
            x63Var2 = x63Var;
        }
        i7 = i4 | 100663296;
        if ((i & 805306368) == 0) {
            i7 = i4 | 369098752;
        }
        i8 = i7;
        if (tj3Var2.m22124i(vi3Var)) {
            i9 = 4;
        } else {
            i9 = 2;
        }
        if ((i8 & 306783379) == 306783378) {
            z2 = true;
        } else {
            z2 = true;
        }
        if (tj3Var2.m22099R(i8 & 1, z2)) {
            tj3Var2.m22104W();
            i10 = i & 1;
            p84 p84Var4 = we1.f66679a;
            if (i10 != 0) {
                if ((i2 & 4) != 0) {
                    c0144dM19027O = pb1.m19027O(tj3Var2);
                    i8 &= -897;
                } else {
                    c0144dM19027O = c0144d2;
                }
                if (i14 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    x17Var = t17Var2;
                }
                if (i5 == 0) {
                }
                if ((i2 & 128) != 0) {
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    i8 &= -29360129;
                    x63Var2 = (C0100h) objM22097O;
                }
                c0144d4 = c0144dM19027O;
                i11 = i8 & (-1879048193);
                x63Var4 = x63Var2;
                z4 = true;
                c0077cM24823b = y07.m24823b(tj3Var2);
                f4 = f5;
            } else {
                if ((i2 & 4) != 0) {
                    c0144dM19027O = pb1.m19027O(tj3Var2);
                    i8 &= -897;
                } else {
                    c0144dM19027O = c0144d2;
                }
                if (i14 != 0) {
                    x17Var = new x17(0.0f, 0.0f, 0.0f, 0.0f);
                } else {
                    x17Var = t17Var2;
                }
                if (i5 == 0) {
                }
                if ((i2 & 128) != 0) {
                    f32VarM21341a = sf9.m21341a(tj3Var2);
                    zM22120g = tj3Var2.m22120g(f32VarM21341a);
                    objM22097O = tj3Var2.m22097O();
                    if (zM22120g) {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        objM22097O = new C0100h(f32VarM21341a);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    i8 &= -29360129;
                    x63Var2 = (C0100h) objM22097O;
                }
                c0144d4 = c0144dM19027O;
                i11 = i8 & (-1879048193);
                x63Var4 = x63Var2;
                z4 = true;
                c0077cM24823b = y07.m24823b(tj3Var2);
                f4 = f5;
            }
            tj3Var2.m22140r();
            Orientation orientation4 = Orientation.Vertical;
            float fMo9967a4 = interfaceC3624tu.mo9967a();
            int i118 = i11 >> 3;
            int i119 = (i118 & 896) | (i11 & 14) | ((i11 >> 15) & 112);
            if (((i119 & 14) ^ 6) <= 4) {
            }
            z5 = ((((i119 & 112) ^ 48) <= 32 && tj3Var2.m22120g(interfaceC3624tu)) || (i119 & 48) == 32) | ((((i119 & 14) ^ 6) <= 4 && tj3Var2.m22120g(kg9Var)) || (i119 & 6) == 4) | ((((i119 & 896) ^ 384) <= 256 && tj3Var2.m22120g(x17Var)) || (i119 & 384) == 256);
            objM22097O2 = tj3Var2.m22097O();
            if (z5) {
                objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                tj3Var2.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new gw4(new di0(x17Var, kg9Var, interfaceC3624tu, 5));
                tj3Var2.m22131l0(objM22097O2);
            }
            int i1110 = i11 << 3;
            int i1111 = (i9 << 3) & 112;
            tj3Var = tj3Var2;
            t17 t17Var7 = x17Var;
            AbstractC0141a.m1020a(c0144d4, orientation4, (gw4) objM22097O2, e16Var2, t17Var7, x63Var4, z4, c0077cM24823b, f4, fMo9967a4, vi3Var, tj3Var, ((i11 >> 6) & 14) | 48 | ((i11 << 6) & 7168) | (57344 & i1110) | (i1110 & 458752) | (i118 & 3670016) | (i118 & 29360128) | ((i11 << 12) & 1879048192), i1111);
            c0144d3 = c0144d4;
            t17Var3 = t17Var7;
            x63Var3 = x63Var4;
            z3 = z4;
            c0077c2 = c0077cM24823b;
            f3 = f4;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            f3 = f2;
            c0144d3 = c0144d2;
            x63Var3 = x63Var2;
            t17Var3 = t17Var2;
            z3 = z;
            c0077c2 = c0077c;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: rv4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xwc.m24758c(kg9Var, e16Var, c0144d3, t17Var3, f3, interfaceC3624tu, x63Var3, z3, c0077c2, vi3Var, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c0 */
    public static int m24759c0(long j) {
        if (-2147483648L > j || j > 2147483647L) {
            throw new ArithmeticException(wq1.m24116l("Value cannot fit in an int: ", j));
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0212  */
    /* JADX WARN: Code duplicated, block: B:68:0x0215  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX INFO: renamed from: d */
    public static final void m24760d(final x85 x85Var, vi3 vi3Var, final vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i, int i2) {
        vi3 vi3Var4;
        int i3;
        vi3 vi3Var5;
        tj3 tj3Var;
        vi3 vi3Var6;
        b16 b16Var;
        Object obj;
        boolean z;
        tj3 tj3Var2;
        boolean z2;
        ?? r10;
        Object obj2;
        int i4;
        Object obj3;
        ec0 ec0Var = nj0.f52791J;
        C3587su c3587su = eh0.f37238d;
        LibraryShelf libraryShelf = x85Var.f67932b;
        List<Object> list = libraryShelf.f19495c;
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(52348807);
        int i5 = (tj3Var3.m22124i(x85Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= tj3Var3.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i5 |= tj3Var3.m22124i(vi3Var2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            vi3Var4 = vi3Var3;
        } else {
            vi3Var4 = vi3Var3;
            i3 = i5 | (tj3Var3.m22124i(vi3Var4) ? 2048 : 1024);
        }
        if (tj3Var3.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            Object obj4 = we1.f66679a;
            if (i6 != 0) {
                Object objM22097O = tj3Var3.m22097O();
                if (objM22097O == obj4) {
                    obj3 = objM22097O;
                    Object tf4Var = new tf4(11);
                    tj3Var3.m22131l0(tf4Var);
                    obj3 = tf4Var;
                }
                obj3 = objM22097O;
                vi3Var6 = (vi3) obj3;
            } else {
                vi3Var6 = vi3Var4;
            }
            boolean zM11650l = fa4.m11650l(AbstractC3423or.m18268n(libraryShelf).f19502b, LibraryContentType.Playlists.getValue());
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var3, 0);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var2);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var3, numValueOf);
            vi3 vi3Var7 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var7);
            ec0 ec0Var2 = ec0Var;
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
            int i7 = i3;
            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
            fc0 fc0Var = nj0.f52789H;
            C3549ru c3549ru = eh0.f37236b;
            C3587su c3587su2 = c3587su;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var3, 48);
            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m2 = tj3Var3.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
            tj3Var3.m22119f0();
            final vi3 vi3Var8 = vi3Var6;
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var7);
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
            lw9.m16554b(x85Var.f67931a, AbstractC3584sr.m21611X(b16Var2, ge9.m12515a(tj3Var3).f38960i, 0.0f, 0.0f, 0.0f, 14), p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 0, 0, 131064);
            tj3 tj3Var4 = tj3Var3;
            if (libraryShelf.f19494b || fa4.m11650l(libraryShelf.f19496d, LibraryShelfType.Archive.getValue())) {
                b16Var = b16Var2;
                obj = obj4;
                z = false;
                tj3Var4.m22111b0(1178231861);
                tj3Var4.m22139q(false);
                tj3Var2 = tj3Var4;
            } else {
                tj3Var4.m22111b0(1177565454);
                b16Var = b16Var2;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var4).f38955d, 0.0f, 0.0f, 0.0f, 14);
                boolean zM22124i = tj3Var4.m22124i(x85Var) | ((i7 & 7168) == 2048);
                Object objM22097O2 = tj3Var4.m22097O();
                if (zM22124i) {
                    obj = obj4;
                } else {
                    obj = obj4;
                    if (objM22097O2 != obj) {
                        r10 = 0;
                        obj2 = objM22097O2;
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, r10, (ui3) obj2, e16VarM21611X, 15);
                    if (libraryShelf.f19493a) {
                        i4 = R$drawable.ic_pin;
                    } else {
                        i4 = R$drawable.ic_unpin;
                    }
                    boolean z3 = r10;
                    ty3.m22352b(AbstractC3423or.m18236U(i4, tj3Var4, r10), vz1.m23620a0(tj3Var4, R$string.library_pinned), e16VarM815b, p58.m18900f(tj3Var4).f55873q, tj3Var4, 8, 0);
                    tj3 tj3Var5 = tj3Var4;
                    tj3Var5.m22139q(z3);
                    z = z3;
                    tj3Var2 = tj3Var5;
                }
                r10 = 0;
                final boolean z4 = false ? 1 : 0;
                Object obj5 = new ui3() { // from class: w85
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i8 = z4;
                        xfa xfaVar = xfa.f68157a;
                        x85 x85Var2 = x85Var;
                        vi3 vi3Var9 = vi3Var8;
                        switch (i8) {
                            case 0:
                                vi3Var9.invoke(x85Var2.f67932b);
                                break;
                            case 1:
                                vi3Var9.invoke(x85Var2.f67932b);
                                break;
                            default:
                                vi3Var9.invoke(x85Var2.f67932b);
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var4.m22131l0(obj5);
                obj2 = obj5;
                e16 e16VarM815b2 = AbstractC0080f.m815b(null, r10, (ui3) obj2, e16VarM21611X, 15);
                if (libraryShelf.f19493a) {
                    i4 = R$drawable.ic_pin;
                } else {
                    i4 = R$drawable.ic_unpin;
                }
                boolean z5 = r10;
                ty3.m22352b(AbstractC3423or.m18236U(i4, tj3Var4, r10), vz1.m23620a0(tj3Var4, R$string.library_pinned), e16VarM815b2, p58.m18900f(tj3Var4).f55873q, tj3Var4, 8, 0);
                tj3 tj3Var6 = tj3Var4;
                tj3Var6.m22139q(z5);
                z = z5;
                tj3Var2 = tj3Var6;
            }
            if (list.size() != 1 || zM11650l) {
                tj3Var2.m22111b0(1179165333);
                tj3Var2.m22139q(z);
            } else {
                tj3Var2.m22111b0(1178322536);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                thb.m22044c(tj3Var2, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var2).f38952a, 0.0f, 0.0f, 0.0f, 14);
                int i8 = (tj3Var2.m22124i(x85Var) ? 1 : 0) | ((i7 & 896) == 256 ? 1 : z);
                Object objM22097O3 = tj3Var2.m22097O();
                Object obj6 = objM22097O3;
                if (i8 != 0 || objM22097O3 == obj) {
                    final int i9 = 1;
                    Object obj7 = new ui3() { // from class: w85
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i10 = i9;
                            xfa xfaVar = xfa.f68157a;
                            x85 x85Var2 = x85Var;
                            vi3 vi3Var9 = vi3Var2;
                            switch (i10) {
                                case 0:
                                    vi3Var9.invoke(x85Var2.f67932b);
                                    break;
                                case 1:
                                    vi3Var9.invoke(x85Var2.f67932b);
                                    break;
                                default:
                                    vi3Var9.invoke(x85Var2.f67932b);
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(obj7);
                    obj6 = obj7;
                }
                AbstractC0231g.m1153f(805306368, 508, null, tj3Var2, (ui3) obj6, lda.f49508a, e16VarM21611X2, null, null, false);
                tj3Var2.m22139q(z);
            }
            boolean z6 = true;
            tj3Var2.m22139q(true);
            if (list.size() > 1) {
                tj3Var2.m22111b0(1526756585);
                b16 b16Var3 = b16Var;
                e16 e16VarM4412e2 = c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var2).f38955d, 0.0f, 0.0f, 0.0f, 14), 1.0f);
                sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var2, 54);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var7);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                e16 e16VarM3974s0 = bna.m3974s0(b16Var3, bna.m3972r0(tj3Var2), true, z);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarMo3161g = e16VarM3974s0.mo3161g(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m4 = tj3Var2.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarMo3161g);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a3);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var7);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
                tj3Var2.m22111b0(1409517442);
                for (Object obj8 : list) {
                    ec0 ec0Var3 = ec0Var2;
                    C3587su c3587su3 = c3587su2;
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su3, ec0Var3, tj3Var2, 0);
                    int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m5 = tj3Var2.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, b16Var3);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c5);
                    boolean zM22124i2 = tj3Var2.m22124i(obj8) | ((i7 & 112) == 32);
                    Object objM22097O4 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O4 == obj) {
                        objM22097O4 = new C3006fm(18, vi3Var, obj8);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O4, ci8.m4703P(-2033268472, new rm0(obj8, 6), tj3Var2), null, null, null, false);
                    tj3Var2.m22139q(true);
                    ec0Var2 = ec0Var3;
                    c3587su2 = c3587su3;
                    b16Var3 = b16Var3;
                }
                b16 b16Var4 = b16Var3;
                tj3Var2.m22139q(false);
                tj3Var2.m22139q(true);
                if (zM11650l) {
                    z2 = false;
                    tj3Var2.m22111b0(-486260752);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-487091614);
                    e16 e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var4, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14);
                    boolean zM22124i3 = tj3Var2.m22124i(x85Var) | ((i7 & 896) == 256);
                    Object objM22097O5 = tj3Var2.m22097O();
                    Object obj9 = objM22097O5;
                    if (zM22124i3 || objM22097O5 == obj) {
                        final int i10 = 2;
                        Object obj10 = new ui3() { // from class: w85
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i11 = i10;
                                xfa xfaVar = xfa.f68157a;
                                x85 x85Var2 = x85Var;
                                vi3 vi3Var9 = vi3Var2;
                                switch (i11) {
                                    case 0:
                                        vi3Var9.invoke(x85Var2.f67932b);
                                        break;
                                    case 1:
                                        vi3Var9.invoke(x85Var2.f67932b);
                                        break;
                                    default:
                                        vi3Var9.invoke(x85Var2.f67932b);
                                        break;
                                }
                                return xfaVar;
                            }
                        };
                        tj3Var2.m22131l0(obj10);
                        obj9 = obj10;
                    }
                    AbstractC0231g.m1153f(805306368, 508, null, tj3Var2, (ui3) obj9, lda.f49509b, e16VarM21611X3, null, null, false);
                    z2 = false;
                    tj3Var2.m22139q(false);
                }
                z6 = true;
                tj3Var2.m22139q(true);
                tj3Var2.m22139q(z2);
            } else {
                tj3Var2.m22111b0(1529162929);
                tj3Var2.m22139q(z);
            }
            tj3Var2.m22139q(z6);
            vi3Var5 = vi3Var8;
            tj3Var = tj3Var2;
        } else {
            tj3Var3.m22102U();
            vi3Var5 = vi3Var4;
            tj3Var = tj3Var3;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tz3(x85Var, vi3Var, vi3Var2, vi3Var5, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public static final AbstractC0442b m24761d0(C3464pl c3464pl, int i) {
        Object next;
        Iterator<T> it = c3464pl.getLayoutNodeToHolder().entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C0357g) ((Map.Entry) next).getKey()).f4336b != i);
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (AbstractC0442b) entry.getValue();
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static final int m24762e(yw4 yw4Var, long j, hta htaVar) {
        long jMo1668L;
        int iM24729B;
        sw9 sw9VarM25363d = yw4Var.m25363d();
        if (sw9VarM25363d != null) {
            w46 w46Var = sw9VarM25363d.f61519a.f59976b;
            aq4 aq4VarM25362c = yw4Var.m25362c();
            if (aq4VarM25362c != null && (iM24729B = m24729B(w46Var, (jMo1668L = aq4VarM25362c.mo1668L(j)), htaVar)) != -1) {
                return w46Var.m23746g(gq6.m12820a(jMo1668L, (w46Var.m23741b(iM24729B) + w46Var.m23745f(iM24729B)) / 2.0f, 1));
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: e0 */
    public static final String m24763e0(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static final long m24764f(yw4 yw4Var, e28 e28Var, e28 e28Var2, int i) {
        long jM24731D = m24731D(yw4Var, e28Var, i);
        if (cx9.m9921c(jM24731D)) {
            return cx9.f34692b;
        }
        long jM24731D2 = m24731D(yw4Var, e28Var2, i);
        if (cx9.m9921c(jM24731D2)) {
            return cx9.f34692b;
        }
        int i2 = (int) (jM24731D >> 32);
        int i3 = (int) (jM24731D2 & 4294967295L);
        return eh0.m11127g(Math.min(i2, i2), Math.max(i3, i3));
    }

    /* JADX INFO: renamed from: f0 */
    public static String m24765f0(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Characters";
        }
        if (i == 2) {
            return "Words";
        }
        return i == 3 ? "Sentences" : "Invalid";
    }

    /* JADX INFO: renamed from: g */
    public static final boolean m24766g(rw9 rw9Var, int i) {
        w46 w46Var = rw9Var.f59976b;
        int iM23743d = w46Var.m23743d(i);
        return i == rw9Var.m20960g(iM23743d) || i == w46Var.m23742c(iM23743d, false) ? rw9Var.m20961h(i) != rw9Var.m20954a(i) : rw9Var.m20954a(i) != rw9Var.m20954a(i - 1);
    }

    /* JADX INFO: renamed from: g0 */
    public static final l77 m24767g0(a02[] a02VarArr, l77 l77Var, l77 l77Var2) {
        l77 l77Var3 = l77.f49251d;
        k77 k77Var = new k77(l77Var3);
        k77Var.f46817g = l77Var3;
        for (a02 a02Var : a02VarArr) {
            AbstractC0279g abstractC0279g = (AbstractC0279g) a02Var.f14d;
            if (a02Var.f13c || !l77Var.containsKey(abstractC0279g)) {
                k77Var.put(abstractC0279g, abstractC0279g.m1267c(a02Var, (aoa) l77Var2.get(abstractC0279g)));
            }
        }
        return k77Var.mo14937a();
    }

    /* JADX INFO: renamed from: h */
    public static final long m24768h(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m24769h0(f12 f12Var, int i, int i2, int i3) {
        if (i < i2 || i > i3) {
            throw new IllegalFieldValueException(f12Var.mo11491r(), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
        }
    }

    /* JADX INFO: renamed from: i */
    public static String m24770i(String str, int i, String str2, int i2, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z = (i3 & 8) == 0;
        boolean z2 = (i3 & 16) == 0;
        boolean z3 = (i3 & 32) == 0;
        boolean z4 = (i3 & 64) == 0;
        str.getClass();
        return m24772j(str, i4, i5, str2, z, z2, z3, z4, 128);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:75:0x017c, B:15:0x0025, B:17:0x002d, B:21:0x003c, B:23:0x0042, B:25:0x004a, B:74:0x0179, B:76:0x017f, B:77:0x0182, B:78:0x0183, B:26:0x004e, B:28:0x0052, B:29:0x005f, B:31:0x0065, B:37:0x007e, B:39:0x0084, B:40:0x0090, B:61:0x015c, B:62:0x015f, B:70:0x016e, B:69:0x016b, B:71:0x016f, B:72:0x0174, B:73:0x0175, B:34:0x006d, B:36:0x0073), top: B:83:0x0007, inners: #5 }] */
    /* JADX INFO: renamed from: i0 */
    public static Optional m24771i0(Context context) {
        Optional optionalM6262a;
        Optional optionalM6262a2;
        char c;
        Optional optional = f68911a;
        if (optional != null) {
            return optional;
        }
        synchronized (xwc.class) {
            try {
                optionalM6262a = f68911a;
                if (optionalM6262a == null) {
                    String str = Build.TYPE;
                    String str2 = Build.TAGS;
                    C3275kv c3275kv = bxc.f9152a;
                    if (!str.equals("eng") && !str.equals("userdebug")) {
                        optionalM6262a = Optional.m6262a();
                    } else if (str2.contains("dev-keys") || str2.contains("test-keys")) {
                        Context contextCreateDeviceProtectedStorageContext = !context.isDeviceProtectedStorage() ? context.createDeviceProtectedStorageContext() : context;
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            StrictMode.allowThreadDiskWrites();
                            char c2 = 0;
                            try {
                                File file = new File(contextCreateDeviceProtectedStorageContext.getDir("phenotype_hermetic", 0), "overrides.txt");
                                optionalM6262a2 = file.exists() ? Optional.m6263d(file) : Optional.m6262a();
                            } catch (RuntimeException e) {
                                Log.e("HermeticFileOverrides", "no data dir", e);
                                optionalM6262a2 = Optional.m6262a();
                            }
                            if (optionalM6262a2.mo6259c()) {
                                File file2 = (File) optionalM6262a2.mo6258b();
                                try {
                                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                                    try {
                                        l79 l79Var = new l79(0);
                                        HashMap map = new HashMap();
                                        while (true) {
                                            String line = bufferedReader.readLine();
                                            if (line == null) {
                                                break;
                                            }
                                            String[] strArrSplit = line.split(" ", 3);
                                            if (strArrSplit.length != 3) {
                                                StringBuilder sb = new StringBuilder(line.length() + 9);
                                                sb.append("Invalid: ");
                                                sb.append(line);
                                                Log.e("HermeticFileOverrides", sb.toString());
                                            } else {
                                                String str3 = new String(strArrSplit[c2]);
                                                String strDecode = Uri.decode(new String(strArrSplit[1]));
                                                String strDecode2 = (String) map.get(strArrSplit[2]);
                                                if (strDecode2 == null) {
                                                    String str4 = new String(strArrSplit[2]);
                                                    strDecode2 = Uri.decode(str4);
                                                    if (strDecode2.length() < 1024 || strDecode2 == str4) {
                                                        map.put(str4, strDecode2);
                                                    }
                                                }
                                                l79 l79Var2 = (l79) l79Var.get(str3);
                                                if (l79Var2 == null) {
                                                    c = 0;
                                                    l79Var2 = new l79(0);
                                                    l79Var.put(str3, l79Var2);
                                                } else {
                                                    c = 0;
                                                }
                                                l79Var2.put(strDecode, strDecode2);
                                                c2 = c;
                                            }
                                        }
                                        String string = file2.toString();
                                        String packageName = contextCreateDeviceProtectedStorageContext.getPackageName();
                                        StringBuilder sb2 = new StringBuilder(string.length() + 28 + String.valueOf(packageName).length());
                                        sb2.append("Parsed ");
                                        sb2.append(string);
                                        sb2.append(" for Android package ");
                                        sb2.append(packageName);
                                        Log.w("HermeticFileOverrides", sb2.toString());
                                        twc twcVar = new twc(l79Var);
                                        bufferedReader.close();
                                        optionalM6262a = Optional.m6263d(twcVar);
                                    } catch (Throwable th) {
                                        try {
                                            bufferedReader.close();
                                            throw th;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                            throw th;
                                        }
                                    }
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            } else {
                                optionalM6262a = Optional.m6262a();
                            }
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        } catch (Throwable th3) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th3;
                        }
                    } else {
                        optionalM6262a = Optional.m6262a();
                    }
                    f68911a = optionalM6262a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return optionalM6262a;
    }

    /* JADX INFO: renamed from: j */
    public static String m24772j(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        str.getClass();
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || vk9.m23381d0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !m24737J(iCharCount, str, length)))) || (iCodePointAt == 43 && z3)))) {
                aj0 aj0Var = new aj0();
                aj0Var.m493p0(i4, str, iCharCount);
                aj0 aj0Var2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            aj0Var.m495q0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            aj0Var.m495q0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || vk9.m23381d0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !m24737J(iCharCount, str, length)))))) {
                            if (aj0Var2 == null) {
                                aj0Var2 = new aj0();
                            }
                            aj0Var2.m496r0(iCodePointAt2);
                            while (!aj0Var2.m492p()) {
                                byte b = aj0Var2.readByte();
                                aj0Var.m487k0(37);
                                char[] cArr = f68914d;
                                aj0Var.m487k0(cArr[((b & 255) >> 4) & 15]);
                                aj0Var.m487k0(cArr[b & 15]);
                            }
                        } else {
                            aj0Var.m496r0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return aj0Var.m472Y();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.substring(i4, length);
    }

    /* JADX INFO: renamed from: k */
    public static final int m24773k(float f) {
        return Math.round((float) Math.ceil(f));
    }

    /* JADX INFO: renamed from: l */
    public static void m24774l(String str, boolean z) {
        if (z) {
            return;
        }
        C3386nv.m17626m(str);
    }

    /* JADX INFO: renamed from: m */
    public static void m24775m(int i) {
        if (i >= 0) {
            return;
        }
        ij6.m13959q();
    }

    /* JADX INFO: renamed from: n */
    public static void m24776n(Object obj, String str) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v(str);
    }

    /* JADX INFO: renamed from: o */
    public static e16 m24777o(e16 e16Var) {
        return e16Var.mo3161g(new v01(new vp6(4)));
    }

    /* JADX INFO: renamed from: p */
    public static final boolean m24778p(e28 e28Var, float f, float f2) {
        float f3 = e28Var.f36620a;
        if (f > e28Var.f36622c || f3 > f) {
            return false;
        }
        return f2 <= e28Var.f36623d && e28Var.f36621b <= f2;
    }

    /* JADX INFO: renamed from: q */
    public static final C0738c m24779q(Context context, Class cls, String str) {
        if (vk9.m23391n0(str)) {
            C3386nv.m17626m("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new C0738c(context, cls, str);
        }
        C3386nv.m17626m("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    /* JADX INFO: renamed from: r */
    public static final Object m24780r(ch7 ch7Var, String str, ContinuationImpl continuationImpl) {
        Object objMo2817d = ch7Var.mo2817d(str, new wx8(18), continuationImpl);
        return objMo2817d == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo2817d : xfa.f68157a;
    }

    /* JADX INFO: renamed from: s */
    public static final vn8 m24781s(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((vn8) arrayList.get(i2)).m23442d() == i) {
                return (vn8) arrayList.get(i2);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public static final ud6 m24782t(View view) {
        view.getClass();
        ud6 ud6Var = (ud6) AbstractC3204c.m15415k0(AbstractC3204c.m15420p0(AbstractC3204c.m15418n0(view, new tf4(26)), new tf4(27)));
        if (ud6Var != null) {
            return ud6Var;
        }
        v63.m23148z("View ", view, " does not have a NavController set");
        return null;
    }

    /* JADX INFO: renamed from: u */
    public static final String m24783u(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: v */
    public static final t56 m24784v(sv8 sv8Var, vi3 vi3Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C0423c c0423cM21750a = sv8Var.m21750a();
            C0357g c0357g = c0423cM21750a.f4973c;
            if (c0357g.m1570M() && c0357g.m1569L()) {
                e28 e28VarM1846g = c0423cM21750a.m1846g();
                t56 t56Var = new t56(48);
                cc4 cc4Var = new cc4(23);
                cc4Var.m4505B(m24755a0(e28VarM1846g));
                m24787y(vi3Var, new cc4(23), cc4Var, t56Var, c0423cM21750a, c0423cM21750a);
                return t56Var;
            }
            t56 t56Var2 = e84.f36837a;
            t56Var2.getClass();
            return t56Var2;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m24785w(vi3 vi3Var, cc4 cc4Var, cc4 cc4Var2, t56 t56Var, C0423c c0423c, C0423c c0423c2) {
        cc4 cc4Var3 = cc4Var;
        Region region = (Region) cc4Var3.f9881a;
        cc4 cc4Var4 = cc4Var2;
        Region region2 = (Region) cc4Var4.f9881a;
        C0357g c0357g = c0423c2.f4973c;
        C0357g c0357g2 = c0423c2.f4973c;
        if (!c0357g.m1570M() || !c0357g2.m1569L() || region2.isEmpty()) {
            if (c0423c2.m1852n()) {
                m24786x(t56Var, c0423c, c0423c2);
                return;
            }
            return;
        }
        e28 e28VarM1851m = c0423c2.m1851m();
        if (e28VarM1851m.m10807h()) {
            ea2 ea2VarM1845f = c0423c2.m1845f();
            if (ea2VarM1845f == null) {
                C0353c c0353c = (C0353c) c0357g2.f4335a0.f46676d;
                e28VarM1851m = bq1.m4054e0(c0353c).mo1670Q(c0353c, false);
            } else {
                e28VarM1851m = thb.m22052k(((d16) ea2VarM1845f).f34837a, AbstractC0422b.m1838a(c0423c2.f4974d, AbstractC0421a.f4946b) != null, false);
            }
        }
        j84 j84VarM24755a0 = m24755a0(e28VarM1851m);
        cc4Var3.m4505B(j84VarM24755a0);
        if (region.op(region2, Region.Op.INTERSECT)) {
            int i = c0423c2.f4976f;
            C0423c c0423c3 = c0423c;
            if (i == c0423c3.f4976f) {
                i = -1;
            }
            Rect bounds = region.getBounds();
            rv8 rv8Var = new rv8(c0423c2, new j84(bounds.left, bounds.top, bounds.right, bounds.bottom));
            t56 t56Var2 = t56Var;
            t56Var2.m21850i(i, rv8Var);
            List listM1839j = C0423c.m1839j(4, c0423c2);
            int size = listM1839j.size() - 1;
            while (-1 < size) {
                if (!((Boolean) vi3Var.invoke(listM1839j.get(size))).booleanValue()) {
                    m24785w(vi3Var, cc4Var3, cc4Var4, t56Var2, c0423c3, (C0423c) listM1839j.get(size));
                }
                size--;
                cc4Var3 = cc4Var;
                cc4Var4 = cc4Var2;
                t56Var2 = t56Var;
                c0423c3 = c0423c;
            }
            if (m24736I(c0423c2)) {
                region2.op(j84VarM24755a0.f45185a, j84VarM24755a0.f45186b, j84VarM24755a0.f45187c, j84VarM24755a0.f45188d, Region.Op.DIFFERENCE);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static final void m24786x(t56 t56Var, C0423c c0423c, C0423c c0423c2) {
        C0357g c0357g;
        C0423c c0423cM1850l = c0423c2.m1850l();
        e28 e28VarM1846g = (c0423cM1850l == null || (c0357g = c0423cM1850l.f4973c) == null || !c0357g.m1570M()) ? f68913c : c0423cM1850l.m1846g();
        int i = c0423c2.f4976f;
        if (i == c0423c.f4976f) {
            i = -1;
        }
        t56Var.m21850i(i, new rv8(c0423c2, m24755a0(e28VarM1846g)));
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x016d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0170  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public static final void m24787y(vi3 vi3Var, cc4 cc4Var, cc4 cc4Var2, t56 t56Var, C0423c c0423c, C0423c c0423c2) {
        int size;
        AbstractC0362l abstractC0362l;
        boolean z;
        e28 e28VarM22052k;
        vi3 vi3Var2 = vi3Var;
        t56 t56Var2 = t56Var;
        C0423c c0423c3 = c0423c;
        int i = c0423c3.f4976f;
        Region region = (Region) cc4Var.f9881a;
        cc4 cc4Var3 = cc4Var2;
        Region region2 = (Region) cc4Var3.f9881a;
        C0357g c0357g = c0423c2.f4973c;
        kv8 kv8Var = c0423c2.f4974d;
        C0357g c0357g2 = c0423c2.f4973c;
        int i2 = c0423c2.f4976f;
        boolean z2 = (c0357g.m1570M() && c0357g2.m1569L()) ? false : true;
        if (!region2.isEmpty() || i2 == i) {
            if (!z2 || c0423c2.m1852n()) {
                j84 j84VarM24755a0 = m24755a0(c0423c2.m1851m());
                cc4Var.m4505B(j84VarM24755a0);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!region.op(region2, Region.Op.INTERSECT)) {
                    if (c0423c2.m1852n()) {
                        m24786x(t56Var, c0423c, c0423c2);
                        return;
                    } else {
                        if (i2 == -1) {
                            Rect bounds = region.getBounds();
                            t56Var2.m21850i(i2, new rv8(c0423c2, new j84(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                            return;
                        }
                        return;
                    }
                }
                Rect bounds2 = region.getBounds();
                t56Var2.m21850i(i2, new rv8(c0423c2, new j84(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                List listM1839j = C0423c.m1839j(4, c0423c2);
                if (kv8Var.f48473c) {
                    C0423c c0423cM1850l = c0423c2.m1850l();
                    while (true) {
                        abstractC0362l = null;
                        abstractC0362l = null;
                        if (c0423cM1850l == null) {
                            c0423cM1850l = null;
                            break;
                        }
                        n66 n66Var = c0423cM1850l.f4974d.f48471a;
                        if (n66Var.m17251c(AbstractC0424d.f5016w) || n66Var.m17251c(AbstractC0424d.f5015v)) {
                            break;
                        } else {
                            c0423cM1850l = c0423cM1850l.m1850l();
                        }
                    }
                    if (c0423cM1850l == null) {
                        z = false;
                    } else {
                        AbstractC0362l abstractC0362lM1843d = c0423c2.m1843d();
                        if (abstractC0362lM1843d == null) {
                            abstractC0362lM1843d = null;
                        } else {
                            if (!abstractC0362lM1843d.mo1543f1().f34836I) {
                                abstractC0362lM1843d = null;
                            }
                            if (abstractC0362lM1843d == null) {
                                abstractC0362lM1843d = null;
                            }
                        }
                        AbstractC0362l abstractC0362lM1843d2 = c0423cM1850l.m1843d();
                        if (abstractC0362lM1843d2 != null) {
                            if (!abstractC0362lM1843d2.mo1543f1().f34836I) {
                                abstractC0362lM1843d2 = null;
                            }
                            if (abstractC0362lM1843d2 != null) {
                                abstractC0362l = abstractC0362lM1843d2;
                            }
                        }
                        if (abstractC0362lM1843d == null || abstractC0362l == null) {
                            z = false;
                        } else {
                            e28 e28VarMo1670Q = abstractC0362l.mo1670Q(abstractC0362lM1843d, false);
                            z = !e28VarMo1670Q.equals(e28VarMo1670Q.m10806g(wfb.m23907b(0L, omd.m18152h0(abstractC0362l.f49303c))));
                        }
                    }
                    if (z) {
                        cc4 cc4Var4 = new cc4(23);
                        ov8 ov8VarM1845f = c0423c2.m1845f();
                        if (ov8VarM1845f == null) {
                            C0353c c0353c = (C0353c) c0357g2.f4335a0.f46676d;
                            e28VarM22052k = bq1.m4054e0(c0353c).mo1670Q(c0353c, false);
                        } else {
                            e28VarM22052k = thb.m22052k(((d16) ov8VarM1845f).f34837a, AbstractC0422b.m1838a(kv8Var, AbstractC0421a.f4946b) != null, false);
                        }
                        cc4Var4.m4505B(m24755a0(e28VarM22052k));
                        int size2 = listM1839j.size() - 1;
                        while (-1 < size2) {
                            if (!((Boolean) vi3Var2.invoke(listM1839j.get(size2))).booleanValue()) {
                                m24785w(vi3Var2, new cc4(23), cc4Var4, t56Var2, c0423c3, (C0423c) listM1839j.get(size2));
                            }
                            size2--;
                            t56Var2 = t56Var;
                            c0423c3 = c0423c;
                        }
                    } else {
                        size = listM1839j.size() - 1;
                        while (-1 < size) {
                            if (((Boolean) vi3Var2.invoke(listM1839j.get(size))).booleanValue()) {
                                m24787y(vi3Var2, cc4Var, cc4Var3, t56Var, c0423c, (C0423c) listM1839j.get(size));
                            }
                            size--;
                            vi3Var2 = vi3Var;
                            cc4Var3 = cc4Var2;
                        }
                    }
                } else {
                    size = listM1839j.size() - 1;
                    while (-1 < size) {
                        if (((Boolean) vi3Var2.invoke(listM1839j.get(size))).booleanValue()) {
                            m24787y(vi3Var2, cc4Var, cc4Var3, t56Var, c0423c, (C0423c) listM1839j.get(size));
                        }
                        size--;
                        vi3Var2 = vi3Var;
                        cc4Var3 = cc4Var2;
                    }
                }
                if (m24736I(c0423c2)) {
                    region2.op(j84VarM24755a0.f45185a, j84VarM24755a0.f45186b, j84VarM24755a0.f45187c, j84VarM24755a0.f45188d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public static final lt5 m24788z(cu4 cu4Var, int i, long j, l27 l27Var, long j2, Orientation orientation, fc0 fc0Var, LayoutDirection layoutDirection, boolean z, int i2, t56 t56Var) {
        List list;
        Object objMo15747c = l27Var.mo15747c(i);
        List list2 = (List) t56Var.m10152b(i);
        if (list2 != null) {
            list = list2;
        } else {
            List listM9896b = cu4Var.m9896b(i);
            int size = listM9896b.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(((ct5) listM9896b.get(i3)).mo1514r(j));
            }
            t56Var.m21850i(i, arrayList);
            list = arrayList;
        }
        return new lt5(i, i2, list, j2, objMo15747c, orientation, fc0Var, layoutDirection, z);
    }
}
