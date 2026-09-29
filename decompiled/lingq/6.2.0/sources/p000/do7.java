package p000;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.internal.C0282a;
import androidx.core.app.NotificationManagerCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C3211a;
import okio.ByteString;

/* JADX INFO: loaded from: classes.dex */
public abstract class do7 {

    /* JADX INFO: renamed from: a */
    public static final C0282a f35952a = new C0282a(-1571120048, false, new fj3() { // from class: md1
        @Override // p000.fj3
        /* JADX INFO: renamed from: f */
        public final Object mo1288f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, tj3 tj3Var, Integer num) {
            int i;
            String str = (String) obj;
            boolean zBooleanValue = bool.booleanValue();
            rl1 rl1Var = (rl1) obj2;
            aj3 aj3Var = (aj3) obj3;
            ui3 ui3Var = (ui3) obj4;
            int iIntValue = num.intValue();
            int i2 = iIntValue & 6;
            b16 b16Var = b16.f7762a;
            if (i2 == 0) {
                i = (tj3Var.m22120g(b16Var) ? 4 : 2) | iIntValue;
            } else {
                i = iIntValue;
            }
            if ((iIntValue & 48) == 0) {
                i |= tj3Var.m22120g(str) ? 32 : 16;
            }
            if ((iIntValue & 384) == 0) {
                i |= tj3Var.m22122h(zBooleanValue) ? 256 : 128;
            }
            if ((iIntValue & 3072) == 0) {
                i |= tj3Var.m22120g(rl1Var) ? 2048 : 1024;
            }
            if ((iIntValue & 24576) == 0) {
                i |= tj3Var.m22124i(aj3Var) ? 16384 : 8192;
            }
            if ((iIntValue & 196608) == 0) {
                i |= tj3Var.m22124i(ui3Var) ? 131072 : 65536;
            }
            if (tj3Var.m22099R(i & 1, (599187 & i) != 599186)) {
                ul1.m22787c(str, zBooleanValue, rl1Var, b16Var, aj3Var, ui3Var, tj3Var, (i & 458752) | ((i >> 3) & 1022) | ((i << 9) & 7168) | (57344 & i));
            } else {
                tj3Var.m22102U();
            }
            return xfa.f68157a;
        }
    });

    /* JADX INFO: renamed from: b */
    public static final C0282a f35953b = new C0282a(-1455401925, false, new ld1(9));

    /* JADX INFO: renamed from: c */
    public static final s53 f35954c = new s53(0);

    /* JADX INFO: renamed from: d */
    public static final Object f35955d = new Object();

    /* JADX INFO: renamed from: e */
    public static final int[] f35956e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f */
    public static final int[] f35957f = {R.attr.state_focused};

    /* JADX INFO: renamed from: g */
    public static final int[] f35958g = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: h */
    public static final int[] f35959h = {R.attr.state_selected};

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ int f35960i = 0;

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f35961j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f35962k = 0;

    /* JADX INFO: renamed from: l */
    public static final /* synthetic */ int f35963l = 0;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f35964m = 0;

    /* JADX INFO: renamed from: n */
    public static final /* synthetic */ int f35965n = 0;

    /* JADX INFO: renamed from: o */
    public static p04 f35966o;

    /* JADX INFO: renamed from: A */
    public static Intent m10514A(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        return Build.VERSION.SDK_INT >= 33 ? e9d.m10950a(context, broadcastReceiver, intentFilter) : d9d.m10170a(context, broadcastReceiver, intentFilter);
    }

    /* JADX INFO: renamed from: B */
    public static void m10515B(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (TextUtils.isEmpty(strArr[i2])) {
                C3386nv.m17626m(AbstractC3393o1.m17738m(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i2));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < strArr.length; i4++) {
                if (!hashSet.contains(Integer.valueOf(i4))) {
                    strArr2[i3] = strArr[i4];
                    i3++;
                }
            }
        }
        activity.requestPermissions(strArr, i);
    }

    /* JADX INFO: renamed from: C */
    public static ColorStateList m10516C(ColorStateList colorStateList) {
        return colorStateList != null ? colorStateList : ColorStateList.valueOf(0);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m10517D(Activity activity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i >= 32) {
            return r1d.m20251f(activity, str);
        }
        return i == 31 ? q1d.m19601b(activity, str) : activity.shouldShowRequestPermissionRationale(str);
    }

    /* JADX INFO: renamed from: E */
    public static final long m10518E(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: F */
    public static final long m10519F(float f, long j) {
        return i73.m13710a(m10544t(j) * f, m10545u(j) * f);
    }

    /* JADX INFO: renamed from: G */
    public static String m10520G(int i) {
        if (i == 0) {
            return "Clamp";
        }
        if (i == 1) {
            return "Repeated";
        }
        if (i == 2) {
            return "Mirror";
        }
        return i == 3 ? "Decal" : "Unknown";
    }

    /* JADX INFO: renamed from: H */
    public static final String m10521H(float f) {
        if (Float.isNaN(f)) {
            return "NaN";
        }
        if (Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f2 = f * fPow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / fPow;
        return iMax > 0 ? String.valueOf(f3) : String.valueOf((int) f3);
    }

    /* JADX INFO: renamed from: I */
    public static final e16 m10522I(e16 e16Var, boolean z, v56 v56Var, rh8 rh8Var, boolean z2, uh8 uh8Var, vi3 vi3Var) {
        e16 e16VarMo3161g;
        if (rh8Var != null) {
            e16VarMo3161g = new y1a(z, v56Var, rh8Var, z2, uh8Var, vi3Var);
        } else if (rh8Var == null) {
            e16VarMo3161g = new y1a(z, v56Var, null, z2, uh8Var, vi3Var);
        } else {
            b16 b16Var = b16.f7762a;
            e16VarMo3161g = v56Var != null ? s34.m21046a(b16Var, v56Var, rh8Var).mo3161g(new y1a(z, v56Var, null, z2, uh8Var, vi3Var)) : AbstractC0287b.m1320a(b16Var, new lu8(rh8Var, z, z2, uh8Var, vi3Var, 1));
        }
        return e16Var.mo3161g(e16VarMo3161g);
    }

    /* JADX INFO: renamed from: J */
    public static final long m10523J(long j, eg7 eg7Var) {
        long jMo505b = eg7Var.mo505b(m10544t(j), m10545u(j));
        return i73.m13710a(Float.intBitsToFloat((int) (jMo505b >> 32)), Float.intBitsToFloat((int) (jMo505b & 4294967295L)));
    }

    /* JADX INFO: renamed from: K */
    public static final e16 m10524K(ToggleableState toggleableState, rh8 rh8Var, boolean z, uh8 uh8Var, ui3 ui3Var) {
        if (rh8Var != null) {
            return new uba(toggleableState, null, rh8Var, z, uh8Var, ui3Var);
        }
        if (rh8Var == null) {
            return new uba(toggleableState, null, null, z, uh8Var, ui3Var);
        }
        return AbstractC0287b.m1320a(b16.f7762a, new z1a(rh8Var, toggleableState, z, uh8Var, ui3Var));
    }

    /* JADX INFO: renamed from: a */
    public static C3211a m10525a(int i, int i2, BufferOverflow bufferOverflow) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if (i == -2) {
            if (bufferOverflow != BufferOverflow.SUSPEND) {
                return new ci1(1, bufferOverflow);
            }
            cu0.f34534o.getClass();
            return new C3211a(bu0.f9017b);
        }
        if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return new ci1(1, BufferOverflow.DROP_OLDEST);
            }
            C3386nv.m17626m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new C3211a(0) : new ci1(1, bufferOverflow);
        }
        if (i != Integer.MAX_VALUE) {
            return bufferOverflow == BufferOverflow.SUSPEND ? new C3211a(i) : new ci1(i, bufferOverflow);
        }
        return new C3211a(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static final void m10526b(final ui3 ui3Var, e16 e16Var, long j, float f, float f2, long j2, ye1 ye1Var, final int i, final int i2) {
        float f3;
        float f4;
        tj3 tj3Var;
        final long j3;
        final float f5;
        final float f6;
        final e16 e16Var2;
        final long j4;
        float f7;
        float f8;
        int i3;
        e16 e16Var3;
        float f9;
        long j5;
        long j6;
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1833314067);
        int i4 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i | 176;
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f3 = f;
                int i5 = tj3Var2.m22114d(f3) ? 2048 : 1024;
                i4 |= i5;
            } else {
                f3 = f;
            }
            i4 |= i5;
        } else {
            f3 = f;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                f4 = f2;
                int i6 = tj3Var2.m22114d(f4) ? 16384 : 8192;
                i4 |= i6;
            } else {
                f4 = f2;
            }
            i4 |= i6;
        } else {
            f4 = f2;
        }
        int i7 = i4 | 65536;
        if (tj3Var2.m22099R(i7 & 1, (74899 & i7) != 74898)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                long jM4212e = ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4212e();
                int i8 = i7 & (-897);
                if ((i2 & 8) != 0) {
                    ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                    i8 = i7 & (-8065);
                    f7 = 48.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 16) != 0) {
                    ((fe9) tj3Var2.m22128k(ge9.f40637a)).getClass();
                    i8 &= -57345;
                    f8 = 6.0f;
                } else {
                    f8 = f4;
                }
                long jM198b = aa1.m198b(0.2f, jM4212e);
                i3 = i8 & (-458753);
                e16Var3 = b16.f7762a;
                f9 = f8;
                j5 = jM198b;
                j6 = jM4212e;
            } else {
                tj3Var2.m22102U();
                int i9 = i7 & (-897);
                if ((i2 & 8) != 0) {
                    i9 = i7 & (-8065);
                }
                if ((i2 & 16) != 0) {
                    i9 &= -57345;
                }
                int i10 = i9 & (-458753);
                e16Var3 = e16Var;
                j6 = j;
                j5 = j2;
                f9 = f4;
                i3 = i10;
                f7 = f3;
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            dn7.m10493b(ui3Var, c99.m4422o(e16Var3, f7), j6, f9, j5, 0, 0.0f, tj3Var, (i3 & 910) | ((i3 >> 3) & 7168), 96);
            f5 = f7;
            e16Var2 = e16Var3;
            j4 = j6;
            f6 = f9;
            j3 = j5;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            j3 = j2;
            f5 = f3;
            f6 = f4;
            e16Var2 = e16Var;
            j4 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: pm5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    do7.m10526b(ui3Var, e16Var2, j4, f5, f6, j3, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10527c(e16 e16Var, long j, float f, float f2, ye1 ye1Var, final int i, final int i2) {
        final e16 e16Var2;
        int i3;
        float f3;
        float f4;
        final float f5;
        final float f6;
        final long j2;
        e16 e16Var3;
        int i4;
        float f7;
        float f8;
        long j3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-539769886);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        }
        int i6 = i3 | 16;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                f3 = f;
                int i7 = tj3Var.m22114d(f3) ? 256 : 128;
                i6 |= i7;
            } else {
                f3 = f;
            }
            i6 |= i7;
        } else {
            f3 = f;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                f4 = f2;
                int i8 = tj3Var.m22114d(f4) ? 2048 : 1024;
                i6 |= i8;
            } else {
                f4 = f2;
            }
            i6 |= i8;
        } else {
            f4 = f2;
        }
        if (tj3Var.m22099R(i6 & 1, (i6 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                e16Var3 = i5 != 0 ? b16.f7762a : e16Var2;
                long jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                i4 = i6 & (-113);
                if ((i2 & 4) != 0) {
                    ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                    i4 = i6 & (-1009);
                    f7 = 48.0f;
                } else {
                    f7 = f3;
                }
                if ((i2 & 8) != 0) {
                    ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                    i4 &= -7169;
                    f8 = 6.0f;
                } else {
                    f8 = f4;
                }
                j3 = jM4212e;
            } else {
                tj3Var.m22102U();
                int i9 = i6 & (-113);
                if ((i2 & 4) != 0) {
                    i9 = i6 & (-1009);
                }
                if ((i2 & 8) != 0) {
                    i9 &= -7169;
                }
                e16 e16Var4 = e16Var2;
                i4 = i9;
                e16Var3 = e16Var4;
                j3 = j;
                f7 = f3;
                f8 = f4;
            }
            tj3Var.m22140r();
            dn7.m10492a(c99.m4422o(e16Var3, f7), j3, f8, 0L, 0, 0.0f, tj3Var, (i4 >> 3) & 896, 56);
            e16Var2 = e16Var3;
            f6 = f7;
            j2 = j3;
            f5 = f8;
        } else {
            tj3Var.m22102U();
            f5 = f4;
            f6 = f3;
            j2 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: om5
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    do7.m10527c(e16Var2, j2, f6, f5, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final long m10528d(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m10529e(float f) {
        return Float.isNaN(f) || Math.abs(f) < 0.5f;
    }

    /* JADX INFO: renamed from: f */
    public static void m10530f(long j, aj0 aj0Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            C3386nv.m17626m("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((ByteString) arrayList4.get(i8)).mo18078d() < i7) {
                C3386nv.m17626m("Failed requirement.");
                return;
            }
        }
        ByteString byteString = (ByteString) arrayList.get(i2);
        ByteString byteString2 = (ByteString) arrayList4.get(i3 - 1);
        if (i7 == byteString.mo18078d()) {
            int iIntValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            ByteString byteString3 = (ByteString) arrayList4.get(i9);
            i4 = i9;
            i5 = iIntValue;
            byteString = byteString3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (byteString.mo18082i(i7) == byteString2.mo18082i(i7)) {
            int iMin = Math.min(byteString.mo18078d(), byteString2.mo18078d());
            int i10 = 0;
            for (int i11 = i7; i11 < iMin && byteString.mo18082i(i11) == byteString2.mo18082i(i11); i11++) {
                i10++;
            }
            long j3 = (aj0Var.f723b / 4) + j + 2 + ((long) i10) + 1;
            aj0Var.m490n0(-i10);
            aj0Var.m490n0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                aj0Var.m490n0(byteString.mo18082i(i7) & 255);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((ByteString) arrayList4.get(i4)).mo18078d()) {
                    aj0Var.m490n0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    C3386nv.m17633t("Check failed.");
                    return;
                }
            }
            aj0 aj0Var2 = new aj0();
            aj0Var.m490n0(((int) ((aj0Var2.f723b / 4) + j3)) * (-1));
            m10530f(j3, aj0Var2, i12, arrayList4, i4, i3, arrayList5);
            aj0Var.mo456B(aj0Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((ByteString) arrayList4.get(i14 - 1)).mo18082i(i7) != ((ByteString) arrayList4.get(i14)).mo18082i(i7)) {
                i13++;
            }
        }
        long j4 = (aj0Var.f723b / 4) + j + 2 + ((long) (i13 * 2));
        aj0Var.m490n0(i13);
        aj0Var.m490n0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int iMo18082i = ((ByteString) arrayList4.get(i15)).mo18082i(i7);
            if (i15 == i4 || iMo18082i != ((ByteString) arrayList4.get(i15 - 1)).mo18082i(i7)) {
                aj0Var.m490n0(iMo18082i & 255);
            }
        }
        aj0 aj0Var3 = new aj0();
        int i16 = i4;
        while (i16 < i3) {
            byte bMo18082i = ((ByteString) arrayList4.get(i16)).mo18082i(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (bMo18082i != ((ByteString) arrayList4.get(i18)).mo18082i(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((ByteString) arrayList4.get(i16)).mo18078d()) {
                aj0Var.m490n0(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
            } else {
                aj0Var.m490n0(((int) ((aj0Var3.f723b / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i6 = i18;
                m10530f(j2, aj0Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        aj0Var.mo456B(aj0Var3);
    }

    /* JADX INFO: renamed from: g */
    public static final List m10531g(yt4 yt4Var, iu4 iu4Var, ii0 ii0Var) {
        i84 i84Var;
        x66 x66Var = ii0Var.f44131a;
        if (!(x66Var.f67832c != 0) && iu4Var.f44572a.isEmpty()) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        if (ii0Var.f44131a.f67832c != 0) {
            int i = x66Var.f67832c;
            if (i == 0) {
                uk9.m22775i("MutableVector is empty.");
                return null;
            }
            Object[] objArr = x66Var.f67830a;
            int i2 = ((jt4) objArr[0]).f46127a;
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = ((jt4) objArr[i3]).f46127a;
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i2 < 0) {
                l54.m15814a("negative minIndex");
            }
            int i5 = x66Var.f67832c;
            if (i5 == 0) {
                uk9.m22775i("MutableVector is empty.");
                return null;
            }
            Object[] objArr2 = x66Var.f67830a;
            int i6 = ((jt4) objArr2[0]).f46128b;
            for (int i7 = 0; i7 < i5; i7++) {
                int i8 = ((jt4) objArr2[i7]).f46128b;
                if (i8 > i6) {
                    i6 = i8;
                }
            }
            i84Var = new i84(i2, Math.min(i6, yt4Var.mo15745a() - 1), 1);
        } else {
            i84Var = i84.f43682d;
        }
        int size = iu4Var.f44572a.size();
        for (int i9 = 0; i9 < size; i9++) {
            hu4 hu4Var = (hu4) iu4Var.get(i9);
            int iM19375m = pk9.m19375m(hu4Var.f42943c, yt4Var, hu4Var.f42941a);
            int i10 = i84Var.f40379a;
            if ((iM19375m > i84Var.f40380b || i10 > iM19375m) && iM19375m >= 0 && iM19375m < yt4Var.mo15745a()) {
                arrayList.add(Integer.valueOf(iM19375m));
            }
        }
        u91.m22630w0(i84Var, arrayList);
        x91.m24413s0(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static int m10532h(Context context, String str) {
        if (str == null) {
            C3386nv.m17635v("permission must be non-null");
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        return NotificationManagerCompat.from(context).areNotificationsEnabled() ? 0 : -1;
    }

    /* JADX INFO: renamed from: i */
    public static final AbstractC3081hn m10533i(AbstractC3081hn abstractC3081hn) {
        AbstractC3081hn abstractC3081hnMo10485c = abstractC3081hn.mo10485c();
        int iMo10484b = abstractC3081hnMo10485c.mo10484b();
        for (int i = 0; i < iMo10484b; i++) {
            abstractC3081hnMo10485c.mo10487e(i, abstractC3081hn.mo10483a(i));
        }
        return abstractC3081hnMo10485c;
    }

    /* JADX INFO: renamed from: j */
    public static wta m10534j(Class cls) throws InvocationTargetException {
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                ho2.m13384d(cls, "Cannot create an instance of ");
                return null;
            }
            try {
                Object objNewInstance = declaredConstructor.newInstance(null);
                objNewInstance.getClass();
                return (wta) objNewInstance;
            } catch (IllegalAccessException e) {
                v63.m23137o("Cannot create an instance of ", cls, e);
                return null;
            } catch (InstantiationException e2) {
                v63.m23137o("Cannot create an instance of ", cls, e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            v63.m23137o("Cannot create an instance of ", cls, e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public static final long m10535k(float f, long j) {
        return i73.m13710a(m10544t(j) / f, m10545u(j) / f);
    }

    /* JADX INFO: renamed from: l */
    public static final float m10536l(long j, long j2) {
        return (m10545u(j2) * m10545u(j)) + (m10544t(j2) * m10544t(j));
    }

    /* JADX INFO: renamed from: m */
    public static final Object m10537m(Context context, Class cls) {
        Application application;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            Context baseContext = applicationContext;
            while (baseContext instanceof ContextWrapper) {
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext instanceof Application) {
                    application = (Application) baseContext;
                }
            }
            ij6.m13966x(applicationContext, "Could not find an Application in the given context: ");
            return null;
        }
        application = (Application) applicationContext;
        return ci8.m4741z(application, cls);
    }

    /* JADX INFO: renamed from: n */
    public static final long m10538n(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: o */
    public static int m10539o(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return ya1.m25016i(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    /* JADX INFO: renamed from: p */
    public static ColorStateList m10540p(Context context, int i) {
        ColorStateList colorStateListM23822a;
        ColorStateList colorStateList;
        d88 d88Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        e88 e88Var = new e88(resources, theme);
        synchronized (f88.f38632c) {
            try {
                SparseArray sparseArray = (SparseArray) f88.f38631b.get(e88Var);
                colorStateListM23822a = null;
                if (sparseArray == null || sparseArray.size() <= 0 || (d88Var = (d88) sparseArray.get(i)) == null) {
                    colorStateList = null;
                } else {
                    if (d88Var.f35181b.equals(resources.getConfiguration())) {
                        if (theme != null || d88Var.f35182c != 0) {
                            if (theme == null || d88Var.f35182c != theme.hashCode()) {
                            }
                        }
                        colorStateList = d88Var.f35180a;
                    }
                    sparseArray.remove(i);
                    colorStateList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (colorStateList != null) {
            return colorStateList;
        }
        ThreadLocal threadLocal = f88.f38630a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        resources.getValue(i, typedValue, true);
        int i2 = typedValue.type;
        if (i2 < 28 || i2 > 31) {
            try {
                colorStateListM23822a = wa1.m23822a(resources, resources.getXml(i), theme);
            } catch (Exception e) {
                Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateListM23822a == null) {
            return resources.getColorStateList(i, theme);
        }
        synchronized (f88.f38632c) {
            try {
                WeakHashMap weakHashMap = f88.f38631b;
                SparseArray sparseArray2 = (SparseArray) weakHashMap.get(e88Var);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    weakHashMap.put(e88Var, sparseArray2);
                }
                sparseArray2.append(i, new d88(colorStateListM23822a, e88Var.f36844a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return colorStateListM23822a;
    }

    /* JADX INFO: renamed from: q */
    public static final long m10541q(long j) {
        float fSqrt = (float) Math.sqrt((m10545u(j) * m10545u(j)) + (m10544t(j) * m10544t(j)));
        if (fSqrt > 0.0f) {
            return m10535k(fSqrt, j);
        }
        C3386nv.m17626m("Can't get the direction of a 0-length vector");
        return 0L;
    }

    /* JADX INFO: renamed from: r */
    public static final p04 m10542r() {
        p04 p04Var = f35966o;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(15.5f, 14.0f);
        f57Var.m11550e(-0.79f);
        f57Var.m11552g(-0.28f, -0.27f);
        f57Var.m11548c(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        f57Var.m11548c(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
        f57Var.m11548c(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
        f57Var.m11548c(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
        f57Var.m11548c(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
        f57Var.m11552g(0.27f, 0.28f);
        f57Var.m11557l(0.79f);
        f57Var.m11552g(4.25f, 4.25f);
        f57Var.m11548c(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, 0.0f);
        f57Var.m11548c(0.41f, -0.41f, 0.41f, -1.08f, 0.0f, -1.49f);
        f57Var.m11551f(15.5f, 14.0f);
        f57Var.m11546a();
        f57Var.m11553h(9.5f, 14.0f);
        f57Var.m11547b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        f57Var.m11554i(7.01f, 5.0f, 9.5f, 5.0f);
        f57Var.m11554i(14.0f, 7.01f, 14.0f, 9.5f);
        f57Var.m11554i(11.99f, 14.0f, 9.5f, 14.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f35966o = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: s */
    public static final ufa m10543s(ye1 ye1Var) {
        WeakHashMap weakHashMap = l6b.f49204w;
        C3578sl c3578sl = ho5.m13397r(ye1Var).f49211g;
        WeakHashMap weakHashMap2 = l6b.f49204w;
        return new ufa(c3578sl, ho5.m13397r(ye1Var).f49206b);
    }

    /* JADX INFO: renamed from: t */
    public static final float m10544t(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: u */
    public static final float m10545u(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: v */
    public static final long m10546v(long j, long j2) {
        return i73.m13710a(m10544t(j) - m10544t(j2), m10545u(j) - m10545u(j2));
    }

    /* JADX INFO: renamed from: w */
    public static rz6 m10547w(ByteString... byteStringArr) {
        if (byteStringArr.length == 0) {
            return new rz6(new ByteString[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new C3772xu(byteStringArr, false));
        x91.m24413s0(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = byteStringArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(vz1.m23633h(arrayList, byteStringArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((ByteString) arrayList.get(0)).mo18078d() <= 0) {
            C3386nv.m17626m("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            ByteString byteString = (ByteString) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                ByteString byteString2 = (ByteString) arrayList.get(i6);
                byteString2.getClass();
                byteString.getClass();
                if (!byteString2.mo18084l(0, byteString, byteString.mo18078d())) {
                    break;
                }
                if (byteString2.mo18078d() == byteString.mo18078d()) {
                    ij6.m13961s(byteString2, "duplicate option: ");
                    return null;
                }
                if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                    arrayList.remove(i6);
                    ((Number) arrayList2.remove(i6)).intValue();
                } else {
                    i6++;
                }
            }
            i4 = i5;
        }
        aj0 aj0Var = new aj0();
        m10530f(0L, aj0Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (aj0Var.f723b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = aj0Var.readInt();
        }
        return new rz6((ByteString[]) Arrays.copyOf(byteStringArr, byteStringArr.length), iArr);
    }

    /* JADX INFO: renamed from: x */
    public static final Object m10548x(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    /* JADX INFO: renamed from: y */
    public static final long m10549y(long j, long j2) {
        return i73.m13710a(m10544t(j2) + m10544t(j), m10545u(j2) + m10545u(j));
    }

    /* JADX INFO: renamed from: z */
    public static final Object m10550z(Object obj) {
        return obj instanceof dc1 ? AbstractC3193b.m15358a(((dc1) obj).f35375a) : obj;
    }
}
