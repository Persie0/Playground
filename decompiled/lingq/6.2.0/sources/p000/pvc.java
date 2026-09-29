package p000;

import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.Trace;
import android.os.UserManager;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.view.inputmethod.HandwritingGesture;
import androidx.compose.animation.AbstractC0072k;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.platform.AbstractC0406r;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.state.ToggleableState;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.AbstractC0279g;
import androidx.compose.runtime.internal.C0282a;
import com.google.common.util.concurrent.AbstractC1112b;
import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.AbstractC1120j;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$plurals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class pvc {

    /* JADX INFO: renamed from: a */
    public static UserManager f56870a = null;

    /* JADX INFO: renamed from: b */
    public static volatile boolean f56871b = false;

    /* JADX INFO: renamed from: c */
    public static final C0282a f56872c = new C0282a(-39202156, false, new oh0(25));

    /* JADX INFO: renamed from: d */
    public static final C0282a f56873d = new C0282a(1582488484, false, new oh0(26));

    /* JADX INFO: renamed from: e */
    public static final C0282a f56874e = new C0282a(414328099, false, new oh0(27));

    /* JADX INFO: renamed from: f */
    public static final C0282a f56875f = new C0282a(-1514016380, false, new oh0(28));

    /* JADX INFO: renamed from: g */
    public static final char[] f56876g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: h */
    public static final char[] f56877h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: i */
    public static final uk9 f56878i = new uk9(21);

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f56879j = 0;

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f56880k = 0;

    /* JADX INFO: renamed from: l */
    public static p04 f56881l;

    /* JADX INFO: renamed from: m */
    public static final /* synthetic */ int f56882m = 0;

    /* JADX INFO: renamed from: A */
    public static final long m19493A(long j, long j2) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L)))) & 4294967295L);
    }

    /* JADX INFO: renamed from: B */
    public static final float m19494B(long j, float f, fb2 fb2Var) {
        float fM25848c;
        long jM25847b = zx9.m25847b(j);
        if (ay9.m3127a(jM25847b, 4294967296L)) {
            if (fb2Var.mo597d0() <= 1.05d) {
                return fb2Var.mo903F0(j);
            }
            fM25848c = zx9.m25848c(j) / zx9.m25848c(fb2Var.mo904N(f));
        } else {
            if (!ay9.m3127a(jM25847b, 8589934592L)) {
                return Float.NaN;
            }
            fM25848c = zx9.m25848c(j);
        }
        return fM25848c * f;
    }

    /* JADX INFO: renamed from: C */
    public static final long m19495C(long j) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX INFO: renamed from: D */
    public static final e16 m19496D(e16 e16Var, boolean z, v56 v56Var, w34 w34Var, boolean z2, uh8 uh8Var, ui3 ui3Var) {
        e16 e16VarMo3161g;
        if (w34Var instanceof w34) {
            e16VarMo3161g = new ku8(z, v56Var, w34Var, z2, uh8Var, ui3Var);
        } else if (w34Var == null) {
            e16VarMo3161g = new ku8(z, v56Var, null, z2, uh8Var, ui3Var);
        } else {
            b16 b16Var = b16.f7762a;
            e16VarMo3161g = v56Var != null ? s34.m21046a(b16Var, v56Var, w34Var).mo3161g(new ku8(z, v56Var, null, z2, uh8Var, ui3Var)) : AbstractC0287b.m1320a(b16Var, new lu8(w34Var, z, z2, uh8Var, ui3Var, 0));
        }
        return e16Var.mo3161g(e16VarMo3161g);
    }

    /* JADX INFO: renamed from: E */
    public static void m19497E(PendingIntent pendingIntent) throws PendingIntent.CanceledException {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            pendingIntent.send();
            return;
        }
        try {
            ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
            if (i >= 36) {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(4);
            } else {
                activityOptionsMakeBasic.setPendingIntentBackgroundActivityStartMode(1);
            }
            pendingIntent.send(activityOptionsMakeBasic.toBundle());
        } catch (PendingIntent.CanceledException e) {
            Log.e("TextClassification", "error sending pendingIntent: " + pendingIntent + " error: " + e);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final void m19498F(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(d32.m10042h0(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: G */
    public static final void m19499G(Spannable spannable, long j, fb2 fb2Var, int i, int i2) {
        long jM25847b = zx9.m25847b(j);
        if (ay9.m3127a(jM25847b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(ss5.m21693T(fb2Var.mo903F0(j)), false), i, i2, 33);
        } else if (ay9.m3127a(jM25847b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(zx9.m25848c(j)), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: H */
    public static final void m19500H(Spannable spannable, xi5 xi5Var, int i, int i2) {
        if (xi5Var != null) {
            ArrayList arrayList = new ArrayList(v91.m23189q0(xi5Var, 10));
            Iterator it = xi5Var.f68251a.iterator();
            while (it.hasNext()) {
                arrayList.add(((ti5) it.next()).f62341a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX INFO: renamed from: I */
    public static final boolean m19501I(String str, ui3 ui3Var) {
        try {
            boolean zBooleanValue = ((Boolean) ui3Var.mo0a()).booleanValue();
            if (!zBooleanValue) {
                Log.e("ReflectionGuard", str);
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            Log.e("ReflectionGuard", "ClassNotFound: ".concat(str));
            return false;
        } catch (NoSuchFieldException unused2) {
            Log.e("ReflectionGuard", "NoSuchField: ".concat(str));
            return false;
        } catch (NoSuchMethodException unused3) {
            Log.e("ReflectionGuard", "NoSuchMethod: ".concat(str));
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    public static final e16 m19502J(C3578sl c3578sl) {
        return new bc2(c3578sl, AbstractC0406r.m1816b());
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC1112b m19503K(Context context, Callable callable, Executor executor) {
        jh9 jh9Var = new jh9(callable, 9);
        if (m19504L(context)) {
            return AbstractC1118h.m6401e(jh9Var, executor);
        }
        f09 f09VarM11429r = f09.m11429r();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        dvc dvcVar = new dvc(atomicBoolean, context, f09VarM11429r, jh9Var, executor);
        context.registerReceiver(dvcVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        if (!m19504L(context) || !atomicBoolean.compareAndSet(false, true)) {
            f09VarM11429r.mo52a(new jo0(f09VarM11429r, atomicBoolean, context, dvcVar, 5, false), AbstractC1120j.m6404a());
            return f09VarM11429r;
        }
        try {
            context.unregisterReceiver(dvcVar);
        } catch (IllegalArgumentException e) {
            Log.w("DirectBootUtils", "Failed to unregister receiver", e);
        }
        f09VarM11429r.m6387o(AbstractC1118h.m6401e(jh9Var, executor));
        return f09VarM11429r;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
    /* JADX INFO: renamed from: L */
    public static boolean m19504L(Context context) {
        if (f56871b) {
            return true;
        }
        synchronized (pvc.class) {
            try {
                if (f56871b) {
                    return true;
                }
                int i = 1;
                while (true) {
                    boolean z = false;
                    if (i <= 2) {
                        if (f56870a == null) {
                            f56870a = (UserManager) context.getSystemService(UserManager.class);
                        }
                        UserManager userManager = f56870a;
                        if (userManager == null) {
                            z = true;
                        } else {
                            try {
                                if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
                                    z = true;
                                }
                            } catch (NullPointerException e) {
                                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                                f56870a = null;
                                i++;
                            }
                        }
                        if (z) {
                            f56871b = true;
                        }
                        return z;
                    }
                    if (z) {
                        f56870a = null;
                    }
                    if (z) {
                        f56871b = true;
                    }
                    return z;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0083  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:85:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m19505a(final boolean z, final vi3 vi3Var, e16 e16Var, boolean z2, h01 h01Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        boolean z3;
        h01 h01VarM14319a;
        int i4;
        int i5;
        boolean z4;
        final e16 e16Var2;
        final boolean z5;
        final h01 h01Var2;
        x18 x18VarM22143u;
        e16 e16Var3;
        boolean z6;
        boolean z7;
        ToggleableState toggleableState;
        ui3 ui3Var;
        boolean z8;
        boolean z9;
        Object objM22097O;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1406741137);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i6 = i3 | 384;
        int i7 = i2 & 8;
        if (i7 == 0) {
            if ((i & 3072) == 0) {
                z3 = z2;
                i6 |= tj3Var.m22122h(z3) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                if ((i2 & 16) == 0) {
                    h01VarM14319a = h01Var;
                    int i8 = tj3Var.m22120g(h01VarM14319a) ? 16384 : 8192;
                    i6 |= i8;
                } else {
                    h01VarM14319a = h01Var;
                }
                i6 |= i8;
            } else {
                h01VarM14319a = h01Var;
            }
            i4 = i6 | 196608;
            i5 = 0;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i4 & 1, z4)) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    if (i7 != 0) {
                        z3 = true;
                    }
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                        h01VarM14319a = j7d.m14319a(tj3Var);
                    }
                    e16Var3 = b16.f7762a;
                    z6 = z3;
                    z7 = true;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 16) != 0) {
                        i4 &= -57345;
                    }
                    z6 = z3;
                    z7 = true;
                    e16Var3 = e16Var;
                }
                h01 h01Var3 = h01VarM14319a;
                tj3Var.m22140r();
                float fFloor = (float) Math.floor(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(2.0f));
                if (z) {
                    toggleableState = ToggleableState.On;
                } else {
                    toggleableState = ToggleableState.Off;
                }
                if (vi3Var != null) {
                    tj3Var.m22111b0(2066141046);
                    if ((i4 & 112) == 32) {
                        z8 = z7;
                    } else {
                        z8 = false;
                    }
                    if ((i4 & 14) != 4) {
                        z7 = false;
                    }
                    z9 = z7 | z8;
                    objM22097O = tj3Var.m22097O();
                    if (z9 || objM22097O == we1.f66679a) {
                        objM22097O = new i01(i5, vi3Var, z);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ui3Var = (ui3) objM22097O;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(2066206735);
                    tj3Var.m22139q(false);
                    ui3Var = null;
                }
                e16 e16Var4 = e16Var3;
                int i9 = i4 << 6;
                m19512h(toggleableState, ui3Var, new el9(fFloor, 0.0f, 2, 0, 26), new el9(fFloor, 0.0f, 0, 0, 30), e16Var4, z6, h01Var3, tj3Var, (57344 & i9) | 4608 | (458752 & i9) | (3670016 & i9) | (i9 & 29360128));
                e16Var2 = e16Var4;
                z5 = z6;
                h01Var2 = h01Var3;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                z5 = z3;
                h01Var2 = h01VarM14319a;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: j01
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        pvc.m19505a(z, vi3Var, e16Var2, z5, h01Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 = i3 | 3456;
        z3 = z2;
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                h01VarM14319a = h01Var;
                if (tj3Var.m22120g(h01VarM14319a)) {
                }
                i6 |= i8;
            } else {
                h01VarM14319a = h01Var;
            }
            i6 |= i8;
        } else {
            h01VarM14319a = h01Var;
        }
        i4 = i6 | 196608;
        i5 = 0;
        if ((74899 & i4) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var.m22099R(i4 & 1, z4)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    h01VarM14319a = j7d.m14319a(tj3Var);
                }
                e16Var3 = b16.f7762a;
                z6 = z3;
                z7 = true;
            } else {
                if (i7 != 0) {
                    z3 = true;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                    h01VarM14319a = j7d.m14319a(tj3Var);
                }
                e16Var3 = b16.f7762a;
                z6 = z3;
                z7 = true;
            }
            h01 h01Var4 = h01VarM14319a;
            tj3Var.m22140r();
            float fFloor2 = (float) Math.floor(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(2.0f));
            if (z) {
                toggleableState = ToggleableState.On;
            } else {
                toggleableState = ToggleableState.Off;
            }
            if (vi3Var != null) {
                tj3Var.m22111b0(2066141046);
                if ((i4 & 112) == 32) {
                    z8 = z7;
                } else {
                    z8 = false;
                }
                if ((i4 & 14) != 4) {
                    z7 = false;
                }
                z9 = z7 | z8;
                objM22097O = tj3Var.m22097O();
                if (z9) {
                    objM22097O = new i01(i5, vi3Var, z);
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new i01(i5, vi3Var, z);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var = (ui3) objM22097O;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2066206735);
                tj3Var.m22139q(false);
                ui3Var = null;
            }
            e16 e16Var5 = e16Var3;
            int i10 = i4 << 6;
            m19512h(toggleableState, ui3Var, new el9(fFloor2, 0.0f, 2, 0, 26), new el9(fFloor2, 0.0f, 0, 0, 30), e16Var5, z6, h01Var4, tj3Var, (57344 & i10) | 4608 | (458752 & i10) | (3670016 & i10) | (i10 & 29360128));
            e16Var2 = e16Var5;
            z5 = z6;
            h01Var2 = h01Var4;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z5 = z3;
            h01Var2 = h01VarM14319a;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: j01
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pvc.m19505a(z, vi3Var, e16Var2, z5, h01Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x018d  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:124:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:125:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0218  */
    /* JADX WARN: Code duplicated, block: B:144:0x023f  */
    /* JADX WARN: Code duplicated, block: B:150:0x0259  */
    /* JADX WARN: Code duplicated, block: B:156:0x027f  */
    /* JADX WARN: Code duplicated, block: B:158:0x0283  */
    /* JADX WARN: Code duplicated, block: B:163:0x029a  */
    /* JADX WARN: Code duplicated, block: B:166:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:170:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:173:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:176:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:177:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:180:0x031a  */
    /* JADX WARN: Code duplicated, block: B:189:0x0332  */
    /* JADX WARN: Code duplicated, block: B:190:0x0335  */
    /* JADX WARN: Code duplicated, block: B:192:0x0340  */
    /* JADX WARN: Code duplicated, block: B:194:0x0343  */
    /* JADX WARN: Code duplicated, block: B:196:0x0346  */
    /* JADX WARN: Code duplicated, block: B:197:0x0349  */
    /* JADX WARN: Code duplicated, block: B:199:0x034d  */
    /* JADX WARN: Code duplicated, block: B:200:0x0350  */
    /* JADX WARN: Code duplicated, block: B:202:0x0354  */
    /* JADX WARN: Code duplicated, block: B:203:0x0378  */
    /* JADX WARN: Code duplicated, block: B:205:0x038f  */
    /* JADX WARN: Code duplicated, block: B:214:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:215:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:217:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:219:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:222:0x03be  */
    /* JADX WARN: Code duplicated, block: B:224:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:225:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:227:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:228:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x0433  */
    /* JADX WARN: Code duplicated, block: B:246:0x045b  */
    /* JADX WARN: Code duplicated, block: B:250:0x0466  */
    /* JADX INFO: renamed from: b */
    public static final void m19506b(boolean z, ToggleableState toggleableState, e16 e16Var, h01 h01Var, final el9 el9Var, final el9 el9Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        Object objM24111g;
        float f;
        float f2;
        boolean zM22120g;
        Object objM1254d;
        Object objMo217a;
        ToggleableState toggleableState2;
        l43 ic9Var;
        final baa baaVarM15041c;
        Object objM24111g2;
        int i3;
        float f3;
        boolean zM22120g2;
        int i4;
        Object objM1254d2;
        int i5;
        boolean zM22120g3;
        Object objM22097O;
        z9a z9aVar;
        final baa baaVarM15041c2;
        Object objM22097O2;
        final zz0 zz0Var;
        long j;
        final dh9 dh9VarM785b;
        tj3 tj3Var2;
        int i6;
        long j2;
        dh9 dh9VarM1263m;
        int i7;
        long j3;
        boolean z2;
        dh9 dh9VarM1263m2;
        final dh9 dh9Var;
        boolean z3;
        boolean z4;
        boolean z5;
        Object objM22097O3;
        int i8;
        int i9;
        int i10;
        boolean zM22120g4;
        jc9 jc9VarM16139y;
        vi3 vi3VarMo3163e;
        jc9 jc9VarM16106F;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-891330208);
        if ((i & 6) == 0) {
            i2 = (tj3Var3.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var3.m22116e(toggleableState.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var3.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var3.m22120g(h01Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? tj3Var3.m22120g(el9Var) : tj3Var3.m22124i(el9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= (i & 262144) == 0 ? tj3Var3.m22120g(el9Var2) : tj3Var3.m22124i(el9Var2) ? 131072 : 65536;
        }
        if (tj3Var3.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            faa faaVarM15046h = kaa.m15046h(toggleableState, null, tj3Var3, (i2 >> 3) & 14, 2);
            l43 l43VarM21705c0 = ss5.m21705c0(MotionSchemeKeyTokens.DefaultSpatial, tj3Var3);
            jda jdaVar = pk9.f56363h;
            boolean zM11673g = faaVarM15046h.m11673g();
            p84 p84Var = we1.f66679a;
            if (zM11673g) {
                objM24111g = wq1.m24111g(tj3Var3, 1666827533, false, faaVarM15046h);
            } else {
                tj3Var3.m22111b0(1666573488);
                boolean zM22120g5 = tj3Var3.m22120g(faaVarM15046h);
                objM24111g = tj3Var3.m22097O();
                if (zM22120g5 || objM24111g == p84Var) {
                    jc9 jc9VarM16139y2 = lda.m16139y();
                    vi3 vi3VarMo3163e2 = jc9VarM16139y2 != null ? jc9VarM16139y2.mo3163e() : null;
                    jc9 jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    try {
                        Object objM11669c = faaVarM15046h.m11669c();
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        tj3Var3.m22131l0(objM11669c);
                        objM24111g = objM11669c;
                    } catch (Throwable th) {
                        lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                        throw th;
                    }
                }
                tj3Var3.m22139q(false);
            }
            tj3Var3.m22111b0(-768316570);
            int[] iArr = n01.f52105a;
            int i11 = iArr[((ToggleableState) objM24111g).ordinal()];
            float f4 = 0.0f;
            if (i11 == 1) {
                f = 1.0f;
            } else if (i11 != 2) {
                if (i11 != 3) {
                    gm5.m12750e();
                    return;
                }
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            int i12 = 0;
            tj3Var3.m22139q(false);
            Float fValueOf = Float.valueOf(f);
            boolean zM22120g6 = tj3Var3.m22120g(faaVarM15046h);
            Object objM22097O4 = tj3Var3.m22097O();
            if (zM22120g6 || objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1254d(new m01(faaVarM15046h, i12));
                tj3Var3.m22131l0(objM22097O4);
            }
            ToggleableState toggleableState3 = (ToggleableState) ((dh9) objM22097O4).getValue();
            tj3Var3.m22111b0(-768316570);
            int i13 = iArr[toggleableState3.ordinal()];
            if (i13 != 1) {
                if (i13 == 2) {
                    f2 = 0.0f;
                } else if (i13 != 3) {
                    gm5.m12750e();
                    return;
                }
                tj3Var3.m22139q(false);
                Float fValueOf2 = Float.valueOf(f2);
                zM22120g = tj3Var3.m22120g(faaVarM15046h);
                Object objM22097O5 = tj3Var3.m22097O();
                if (!zM22120g || objM22097O5 == p84Var) {
                    objM1254d = AbstractC0278f.m1254d(new m01(faaVarM15046h, 1));
                    tj3Var3.m22131l0(objM1254d);
                } else {
                    objM1254d = objM22097O5;
                }
                z9a z9aVar2 = (z9a) ((dh9) objM1254d).getValue();
                tj3Var3.m22111b0(1780794470);
                objMo217a = z9aVar2.mo217a();
                toggleableState2 = ToggleableState.Off;
                if (objMo217a == toggleableState2 && z9aVar2.mo218c() == toggleableState2) {
                    ic9Var = new ic9(100);
                } else {
                    ic9Var = l43VarM21705c0;
                }
                tj3Var3.m22139q(false);
                baaVarM15041c = kaa.m15041c(faaVarM15046h, fValueOf, fValueOf2, ic9Var, jdaVar, tj3Var3, 0);
                if (faaVarM15046h.m11673g()) {
                    objM24111g2 = wq1.m24111g(tj3Var3, 1666827533, false, faaVarM15046h);
                } else {
                    tj3Var3.m22111b0(1666573488);
                    zM22120g4 = tj3Var3.m22120g(faaVarM15046h);
                    objM24111g2 = tj3Var3.m22097O();
                    if (zM22120g4 || objM24111g2 == p84Var) {
                        jc9VarM16139y = lda.m16139y();
                        if (jc9VarM16139y != null) {
                            vi3VarMo3163e = jc9VarM16139y.mo3163e();
                        } else {
                            vi3VarMo3163e = null;
                        }
                        jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c2 = faaVarM15046h.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var3.m22131l0(objM11669c2);
                            objM24111g2 = objM11669c2;
                        } catch (Throwable th2) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th2;
                        }
                    }
                    tj3Var3.m22139q(false);
                }
                tj3Var3.m22111b0(1840054703);
                i3 = iArr[((ToggleableState) objM24111g2).ordinal()];
                if (i3 != 1 || i3 == 2) {
                    f3 = 0.0f;
                } else {
                    if (i3 != 3) {
                        gm5.m12750e();
                        return;
                    }
                    f3 = 1.0f;
                }
                tj3Var3.m22139q(false);
                Float fValueOf3 = Float.valueOf(f3);
                zM22120g2 = tj3Var3.m22120g(faaVarM15046h);
                Object objM22097O6 = tj3Var3.m22097O();
                if (!zM22120g2 || objM22097O6 == p84Var) {
                    i4 = 2;
                    objM1254d2 = AbstractC0278f.m1254d(new m01(faaVarM15046h, i4));
                    tj3Var3.m22131l0(objM1254d2);
                } else {
                    objM1254d2 = objM22097O6;
                    i4 = 2;
                }
                ToggleableState toggleableState4 = (ToggleableState) ((dh9) objM1254d2).getValue();
                tj3Var3.m22111b0(1840054703);
                i5 = iArr[toggleableState4.ordinal()];
                if (i5 != 1 && i5 != i4) {
                    if (i5 == 3) {
                        gm5.m12750e();
                        return;
                    }
                    f4 = 1.0f;
                }
                tj3Var3.m22139q(false);
                Float fValueOf4 = Float.valueOf(f4);
                zM22120g3 = tj3Var3.m22120g(faaVarM15046h);
                objM22097O = tj3Var3.m22097O();
                if (zM22120g3 || objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1254d(new m01(faaVarM15046h, 3));
                    tj3Var3.m22131l0(objM22097O);
                }
                z9aVar = (z9a) ((dh9) objM22097O).getValue();
                tj3Var3.m22111b0(630790831);
                if (z9aVar.mo217a() == toggleableState2) {
                    l43VarM21705c0 = ss5.m21697X();
                } else if (z9aVar.mo218c() == toggleableState2) {
                    l43VarM21705c0 = new ic9(100);
                }
                l43 l43Var = l43VarM21705c0;
                tj3Var3.m22139q(false);
                baaVarM15041c2 = kaa.m15041c(faaVarM15046h, fValueOf3, fValueOf4, l43Var, jdaVar, tj3Var3, 0);
                objM22097O2 = tj3Var3.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new zz0();
                    tj3Var3.m22131l0(objM22097O2);
                }
                zz0Var = (zz0) objM22097O2;
                tj3Var3.m22111b0(-2128520210);
                h01Var.getClass();
                if (toggleableState == toggleableState2) {
                    j = h01Var.f41591b;
                } else {
                    j = h01Var.f41590a;
                }
                dh9VarM785b = AbstractC0072k.m785b(j, h01.m12991a(toggleableState, tj3Var3), null, tj3Var3, 0, 12);
                tj3Var2 = tj3Var3;
                tj3Var2.m22139q(false);
                if (z) {
                    i10 = g01.f39993a[toggleableState.ordinal()];
                    if (i10 != 1 || i10 == 2) {
                        j2 = h01Var.f41592c;
                    } else {
                        if (i10 != 3) {
                            gm5.m12750e();
                            return;
                        }
                        j2 = h01Var.f41593d;
                    }
                } else {
                    i6 = g01.f39993a[toggleableState.ordinal()];
                    if (i6 != 1) {
                        j2 = h01Var.f41594e;
                    } else if (i6 != 2) {
                        j2 = h01Var.f41596g;
                    } else {
                        if (i6 == 3) {
                            gm5.m12750e();
                            return;
                        }
                        j2 = h01Var.f41595f;
                    }
                }
                if (z) {
                    tj3Var2.m22111b0(496026915);
                    dh9VarM1263m = AbstractC0072k.m785b(j2, h01.m12991a(toggleableState, tj3Var2), null, tj3Var2, 0, 12);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(496117125);
                    dh9VarM1263m = AbstractC0278f.m1263m(new aa1(j2), tj3Var2);
                    tj3Var2.m22139q(false);
                }
                if (z) {
                    i9 = g01.f39993a[toggleableState.ordinal()];
                    if (i9 != 1 || i9 == 2) {
                        tj3Var2 = tj3Var2;
                        tj3Var2 = tj3Var2;
                        j3 = h01Var.f41597h;
                    } else {
                        if (i9 != 3) {
                            tj3Var2 = tj3Var2;
                            gm5.m12750e();
                            return;
                        }
                        j3 = h01Var.f41598i;
                    }
                } else {
                    i7 = g01.f39993a[toggleableState.ordinal()];
                    if (i7 != 1) {
                        j3 = h01Var.f41599j;
                    } else if (i7 != 2) {
                        j3 = h01Var.f41601l;
                    } else {
                        if (i7 == 3) {
                            tj3Var2 = tj3Var2;
                            gm5.m12750e();
                            return;
                        }
                        j3 = h01Var.f41600k;
                    }
                }
                if (z) {
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    tj3Var2.m22111b0(633206758);
                    z2 = true;
                    tj3 tj3Var4 = tj3Var2;
                    dh9VarM1263m2 = AbstractC0072k.m785b(j3, h01.m12991a(toggleableState, tj3Var2), null, tj3Var4, 0, 12);
                    tj3Var = tj3Var4;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    long j4 = j3;
                    z2 = true;
                    tj3Var = tj3Var2;
                    tj3Var.m22111b0(633296968);
                    dh9VarM1263m2 = AbstractC0278f.m1263m(new aa1(j4), tj3Var);
                    tj3Var.m22139q(false);
                }
                e16 e16VarM4419l = c99.m4419l(c99.m4430w(e16Var, nj0.f52812g, 2), 20.0f);
                boolean zM22120g7 = tj3Var.m22120g(dh9VarM1263m) | tj3Var.m22120g(dh9VarM1263m2);
                dh9Var = dh9VarM1263m;
                if ((i2 & 458752) != 131072 || ((i2 & 262144) != 0 && tj3Var.m22124i(el9Var2))) {
                    z3 = z2;
                } else {
                    z3 = false;
                }
                boolean zM22120g8 = zM22120g7 | z3 | tj3Var.m22120g(dh9VarM785b) | tj3Var.m22120g(baaVarM15041c) | tj3Var.m22120g(baaVarM15041c2);
                if ((57344 & i2) != 16384 || ((i2 & 32768) != 0 && tj3Var.m22124i(el9Var))) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                z5 = zM22120g8 | z4;
                objM22097O3 = tj3Var.m22097O();
                if (!z5 || objM22097O3 == p84Var) {
                    final dh9 dh9Var2 = dh9VarM1263m2;
                    i8 = 0;
                    vi3 vi3Var = new vi3() { // from class: l01
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            float f5;
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            long j5 = ((aa1) dh9Var.getValue()).f414a;
                            long j6 = ((aa1) dh9Var2.getValue()).f414a;
                            float fMo912g0 = interfaceC0310a.mo912g0(2.0f);
                            el9 el9Var3 = el9Var2;
                            float f6 = el9Var3.f37448a;
                            float f7 = f6 / 2.0f;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                            boolean zM199c = aa1.m199c(j5, j6);
                            w33 w33Var = w33.f66328a;
                            if (zM199c) {
                                f5 = 0.0f;
                                interfaceC0310a.mo598h0(j5, (240 & 2) != 0 ? 0L : 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo912g0)) << 32) | (((long) Float.floatToRawIntBits(fMo912g0)) & 4294967295L), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                            } else {
                                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
                                float f8 = fIntBitsToFloat - (f6 * 2.0f);
                                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(f8)) << 32);
                                float fMax = Math.max(0.0f, fMo912g0 - f6);
                                interfaceC0310a = interfaceC0310a;
                                f5 = 0.0f;
                                interfaceC0310a.mo598h0(j5, (240 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                                float f9 = fIntBitsToFloat - f6;
                                float f10 = fMo912g0 - f7;
                                interfaceC0310a.mo598h0(j6, (240 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (((long) Float.floatToRawIntBits(f9)) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), (240 & 16) != 0 ? w33.f66328a : el9Var3, (240 & 128) != 0 ? 3 : 0);
                            }
                            long j7 = ((aa1) dh9VarM785b.getValue()).f414a;
                            float fFloatValue = ((Number) baaVarM15041c.getValue()).floatValue();
                            float fFloatValue2 = ((Number) baaVarM15041c2.getValue()).floatValue();
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                            float fM18232Q = AbstractC3423or.m18232Q(0.4f, 0.5f, fFloatValue2);
                            float fM18232Q2 = AbstractC3423or.m18232Q(0.7f, 0.5f, fFloatValue2);
                            float fM18232Q3 = AbstractC3423or.m18232Q(0.5f, 0.5f, fFloatValue2);
                            float fM18232Q4 = AbstractC3423or.m18232Q(0.3f, 0.5f, fFloatValue2);
                            zz0 zz0Var2 = zz0Var;
                            zz0Var2.f72417a.m19992i();
                            C3500qj c3500qj = zz0Var2.f72417a;
                            c3500qj.m19989f(0.2f * fIntBitsToFloat2, fM18232Q3 * fIntBitsToFloat2);
                            c3500qj.m19988e(fM18232Q * fIntBitsToFloat2, fM18232Q2 * fIntBitsToFloat2);
                            c3500qj.m19988e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fM18232Q4);
                            C3576sj c3576sj = zz0Var2.f72418b;
                            c3576sj.f60911a.setPath(c3500qj != null ? c3500qj.f57839a : null, false);
                            C3500qj c3500qj2 = zz0Var2.f72419c;
                            c3500qj2.m19992i();
                            c3576sj.m21398a(f5, c3576sj.f60911a.getLength() * fFloatValue, c3500qj2);
                            InterfaceC0310a.m1408A0(interfaceC0310a, zz0Var2.f72419c, j7, 0.0f, el9Var, 52);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(vi3Var);
                    objM22097O3 = vi3Var;
                } else {
                    i8 = 0;
                }
                eh0.m11124d(e16VarM4419l, (vi3) objM22097O3, tj3Var, i8);
            }
            f2 = 1.0f;
            tj3Var3.m22139q(false);
            Float fValueOf5 = Float.valueOf(f2);
            zM22120g = tj3Var3.m22120g(faaVarM15046h);
            Object objM22097O7 = tj3Var3.m22097O();
            if (zM22120g) {
                objM1254d = AbstractC0278f.m1254d(new m01(faaVarM15046h, 1));
                tj3Var3.m22131l0(objM1254d);
            } else {
                objM1254d = AbstractC0278f.m1254d(new m01(faaVarM15046h, 1));
                tj3Var3.m22131l0(objM1254d);
            }
            z9a z9aVar3 = (z9a) ((dh9) objM1254d).getValue();
            tj3Var3.m22111b0(1780794470);
            objMo217a = z9aVar3.mo217a();
            toggleableState2 = ToggleableState.Off;
            if (objMo217a == toggleableState2) {
                ic9Var = l43VarM21705c0;
            } else {
                ic9Var = new ic9(100);
            }
            tj3Var3.m22139q(false);
            baaVarM15041c = kaa.m15041c(faaVarM15046h, fValueOf, fValueOf5, ic9Var, jdaVar, tj3Var3, 0);
            if (faaVarM15046h.m11673g()) {
                tj3Var3.m22111b0(1666573488);
                zM22120g4 = tj3Var3.m22120g(faaVarM15046h);
                objM24111g2 = tj3Var3.m22097O();
                if (zM22120g4) {
                    jc9VarM16139y = lda.m16139y();
                    if (jc9VarM16139y != null) {
                        vi3VarMo3163e = jc9VarM16139y.mo3163e();
                    } else {
                        vi3VarMo3163e = null;
                    }
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c3 = faaVarM15046h.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var3.m22131l0(objM11669c3);
                    objM24111g2 = objM11669c3;
                } else {
                    jc9VarM16139y = lda.m16139y();
                    if (jc9VarM16139y != null) {
                        vi3VarMo3163e = jc9VarM16139y.mo3163e();
                    } else {
                        vi3VarMo3163e = null;
                    }
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c4 = faaVarM15046h.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var3.m22131l0(objM11669c4);
                    objM24111g2 = objM11669c4;
                }
                tj3Var3.m22139q(false);
            } else {
                objM24111g2 = wq1.m24111g(tj3Var3, 1666827533, false, faaVarM15046h);
            }
            tj3Var3.m22111b0(1840054703);
            i3 = iArr[((ToggleableState) objM24111g2).ordinal()];
            if (i3 != 1) {
                f3 = 0.0f;
            } else {
                f3 = 0.0f;
            }
            tj3Var3.m22139q(false);
            Float fValueOf6 = Float.valueOf(f3);
            zM22120g2 = tj3Var3.m22120g(faaVarM15046h);
            Object objM22097O8 = tj3Var3.m22097O();
            if (zM22120g2) {
                i4 = 2;
                objM1254d2 = AbstractC0278f.m1254d(new m01(faaVarM15046h, i4));
                tj3Var3.m22131l0(objM1254d2);
            } else {
                i4 = 2;
                objM1254d2 = AbstractC0278f.m1254d(new m01(faaVarM15046h, i4));
                tj3Var3.m22131l0(objM1254d2);
            }
            ToggleableState toggleableState5 = (ToggleableState) ((dh9) objM1254d2).getValue();
            tj3Var3.m22111b0(1840054703);
            i5 = iArr[toggleableState5.ordinal()];
            if (i5 != 1) {
                if (i5 == 3) {
                    gm5.m12750e();
                    return;
                }
                f4 = 1.0f;
            }
            tj3Var3.m22139q(false);
            Float fValueOf7 = Float.valueOf(f4);
            zM22120g3 = tj3Var3.m22120g(faaVarM15046h);
            objM22097O = tj3Var3.m22097O();
            if (zM22120g3) {
                objM22097O = AbstractC0278f.m1254d(new m01(faaVarM15046h, 3));
                tj3Var3.m22131l0(objM22097O);
            } else {
                objM22097O = AbstractC0278f.m1254d(new m01(faaVarM15046h, 3));
                tj3Var3.m22131l0(objM22097O);
            }
            z9aVar = (z9a) ((dh9) objM22097O).getValue();
            tj3Var3.m22111b0(630790831);
            if (z9aVar.mo217a() == toggleableState2) {
                l43VarM21705c0 = ss5.m21697X();
            } else if (z9aVar.mo218c() == toggleableState2) {
                l43VarM21705c0 = new ic9(100);
            }
            l43 l43Var2 = l43VarM21705c0;
            tj3Var3.m22139q(false);
            baaVarM15041c2 = kaa.m15041c(faaVarM15046h, fValueOf6, fValueOf7, l43Var2, jdaVar, tj3Var3, 0);
            objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new zz0();
                tj3Var3.m22131l0(objM22097O2);
            }
            zz0Var = (zz0) objM22097O2;
            tj3Var3.m22111b0(-2128520210);
            h01Var.getClass();
            if (toggleableState == toggleableState2) {
                j = h01Var.f41591b;
            } else {
                j = h01Var.f41590a;
            }
            dh9VarM785b = AbstractC0072k.m785b(j, h01.m12991a(toggleableState, tj3Var3), null, tj3Var3, 0, 12);
            tj3Var2 = tj3Var3;
            tj3Var2.m22139q(false);
            if (z) {
                i10 = g01.f39993a[toggleableState.ordinal()];
                if (i10 != 1) {
                    j2 = h01Var.f41592c;
                } else {
                    j2 = h01Var.f41592c;
                }
            } else {
                i6 = g01.f39993a[toggleableState.ordinal()];
                if (i6 != 1) {
                    j2 = h01Var.f41594e;
                } else if (i6 != 2) {
                    j2 = h01Var.f41596g;
                } else {
                    if (i6 == 3) {
                        gm5.m12750e();
                        return;
                    }
                    j2 = h01Var.f41595f;
                }
            }
            if (z) {
                tj3Var2.m22111b0(496026915);
                dh9VarM1263m = AbstractC0072k.m785b(j2, h01.m12991a(toggleableState, tj3Var2), null, tj3Var2, 0, 12);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(496117125);
                dh9VarM1263m = AbstractC0278f.m1263m(new aa1(j2), tj3Var2);
                tj3Var2.m22139q(false);
            }
            if (z) {
                i9 = g01.f39993a[toggleableState.ordinal()];
                if (i9 != 1) {
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    j3 = h01Var.f41597h;
                } else {
                    tj3Var2 = tj3Var2;
                    tj3Var2 = tj3Var2;
                    j3 = h01Var.f41597h;
                }
            } else {
                i7 = g01.f39993a[toggleableState.ordinal()];
                if (i7 != 1) {
                    j3 = h01Var.f41599j;
                } else if (i7 != 2) {
                    j3 = h01Var.f41601l;
                } else {
                    if (i7 == 3) {
                        tj3Var2 = tj3Var2;
                        gm5.m12750e();
                        return;
                    }
                    j3 = h01Var.f41600k;
                }
            }
            if (z) {
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                tj3Var2.m22111b0(633206758);
                z2 = true;
                tj3 tj3Var5 = tj3Var2;
                dh9VarM1263m2 = AbstractC0072k.m785b(j3, h01.m12991a(toggleableState, tj3Var2), null, tj3Var5, 0, 12);
                tj3Var = tj3Var5;
                tj3Var.m22139q(false);
            } else {
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                tj3Var2 = tj3Var2;
                long j5 = j3;
                z2 = true;
                tj3Var = tj3Var2;
                tj3Var.m22111b0(633296968);
                dh9VarM1263m2 = AbstractC0278f.m1263m(new aa1(j5), tj3Var);
                tj3Var.m22139q(false);
            }
            e16 e16VarM4419l2 = c99.m4419l(c99.m4430w(e16Var, nj0.f52812g, 2), 20.0f);
            boolean zM22120g9 = tj3Var.m22120g(dh9VarM1263m) | tj3Var.m22120g(dh9VarM1263m2);
            dh9Var = dh9VarM1263m;
            if ((i2 & 458752) != 131072) {
                z3 = z2;
            } else {
                z3 = z2;
            }
            boolean zM22120g10 = zM22120g9 | z3 | tj3Var.m22120g(dh9VarM785b) | tj3Var.m22120g(baaVarM15041c) | tj3Var.m22120g(baaVarM15041c2);
            if ((57344 & i2) != 16384) {
                z4 = z2;
            } else {
                z4 = z2;
            }
            z5 = zM22120g10 | z4;
            objM22097O3 = tj3Var.m22097O();
            if (z5) {
                final dh9 dh9Var3 = dh9VarM1263m2;
                i8 = 0;
                vi3 vi3Var2 = new vi3() { // from class: l01
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        float f5;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        long j6 = ((aa1) dh9Var.getValue()).f414a;
                        long j7 = ((aa1) dh9Var3.getValue()).f414a;
                        float fMo912g0 = interfaceC0310a.mo912g0(2.0f);
                        el9 el9Var3 = el9Var2;
                        float f6 = el9Var3.f37448a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        boolean zM199c = aa1.m199c(j6, j7);
                        w33 w33Var = w33.f66328a;
                        if (zM199c) {
                            f5 = 0.0f;
                            interfaceC0310a.mo598h0(j6, (240 & 2) != 0 ? 0L : 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo912g0)) << 32) | (((long) Float.floatToRawIntBits(fMo912g0)) & 4294967295L), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
                            float f8 = fIntBitsToFloat - (f6 * 2.0f);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(f8)) << 32);
                            float fMax = Math.max(0.0f, fMo912g0 - f6);
                            interfaceC0310a = interfaceC0310a;
                            f5 = 0.0f;
                            interfaceC0310a.mo598h0(j6, (240 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fMo912g0 - f7;
                            interfaceC0310a.mo598h0(j7, (240 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (((long) Float.floatToRawIntBits(f9)) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), (240 & 16) != 0 ? w33.f66328a : el9Var3, (240 & 128) != 0 ? 3 : 0);
                        }
                        long j8 = ((aa1) dh9VarM785b.getValue()).f414a;
                        float fFloatValue = ((Number) baaVarM15041c.getValue()).floatValue();
                        float fFloatValue2 = ((Number) baaVarM15041c2.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        float fM18232Q = AbstractC3423or.m18232Q(0.4f, 0.5f, fFloatValue2);
                        float fM18232Q2 = AbstractC3423or.m18232Q(0.7f, 0.5f, fFloatValue2);
                        float fM18232Q3 = AbstractC3423or.m18232Q(0.5f, 0.5f, fFloatValue2);
                        float fM18232Q4 = AbstractC3423or.m18232Q(0.3f, 0.5f, fFloatValue2);
                        zz0 zz0Var2 = zz0Var;
                        zz0Var2.f72417a.m19992i();
                        C3500qj c3500qj = zz0Var2.f72417a;
                        c3500qj.m19989f(0.2f * fIntBitsToFloat2, fM18232Q3 * fIntBitsToFloat2);
                        c3500qj.m19988e(fM18232Q * fIntBitsToFloat2, fM18232Q2 * fIntBitsToFloat2);
                        c3500qj.m19988e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fM18232Q4);
                        C3576sj c3576sj = zz0Var2.f72418b;
                        c3576sj.f60911a.setPath(c3500qj != null ? c3500qj.f57839a : null, false);
                        C3500qj c3500qj2 = zz0Var2.f72419c;
                        c3500qj2.m19992i();
                        c3576sj.m21398a(f5, c3576sj.f60911a.getLength() * fFloatValue, c3500qj2);
                        InterfaceC0310a.m1408A0(interfaceC0310a, zz0Var2.f72419c, j8, 0.0f, el9Var, 52);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var2);
                objM22097O3 = vi3Var2;
            } else {
                final dh9 dh9Var4 = dh9VarM1263m2;
                i8 = 0;
                vi3 vi3Var3 = new vi3() { // from class: l01
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        float f5;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        long j6 = ((aa1) dh9Var.getValue()).f414a;
                        long j7 = ((aa1) dh9Var4.getValue()).f414a;
                        float fMo912g0 = interfaceC0310a.mo912g0(2.0f);
                        el9 el9Var3 = el9Var2;
                        float f6 = el9Var3.f37448a;
                        float f7 = f6 / 2.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        boolean zM199c = aa1.m199c(j6, j7);
                        w33 w33Var = w33.f66328a;
                        if (zM199c) {
                            f5 = 0.0f;
                            interfaceC0310a.mo598h0(j6, (240 & 2) != 0 ? 0L : 0L, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), (((long) Float.floatToRawIntBits(fMo912g0)) << 32) | (((long) Float.floatToRawIntBits(fMo912g0)) & 4294967295L), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f6)) & 4294967295L) | (((long) Float.floatToRawIntBits(f6)) << 32);
                            float f8 = fIntBitsToFloat - (f6 * 2.0f);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f8)) & 4294967295L) | (((long) Float.floatToRawIntBits(f8)) << 32);
                            float fMax = Math.max(0.0f, fMo912g0 - f6);
                            interfaceC0310a = interfaceC0310a;
                            f5 = 0.0f;
                            interfaceC0310a.mo598h0(j6, (240 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(fMax)) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32), (240 & 16) != 0 ? w33.f66328a : w33Var, (240 & 128) != 0 ? 3 : 0);
                            float f9 = fIntBitsToFloat - f6;
                            float f10 = fMo912g0 - f7;
                            interfaceC0310a.mo598h0(j7, (240 & 2) != 0 ? 0L : (((long) Float.floatToRawIntBits(f7)) & 4294967295L) | (((long) Float.floatToRawIntBits(f7)) << 32), (((long) Float.floatToRawIntBits(f9)) & 4294967295L) | (((long) Float.floatToRawIntBits(f9)) << 32), (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), (240 & 16) != 0 ? w33.f66328a : el9Var3, (240 & 128) != 0 ? 3 : 0);
                        }
                        long j8 = ((aa1) dh9VarM785b.getValue()).f414a;
                        float fFloatValue = ((Number) baaVarM15041c.getValue()).floatValue();
                        float fFloatValue2 = ((Number) baaVarM15041c2.getValue()).floatValue();
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
                        float fM18232Q = AbstractC3423or.m18232Q(0.4f, 0.5f, fFloatValue2);
                        float fM18232Q2 = AbstractC3423or.m18232Q(0.7f, 0.5f, fFloatValue2);
                        float fM18232Q3 = AbstractC3423or.m18232Q(0.5f, 0.5f, fFloatValue2);
                        float fM18232Q4 = AbstractC3423or.m18232Q(0.3f, 0.5f, fFloatValue2);
                        zz0 zz0Var2 = zz0Var;
                        zz0Var2.f72417a.m19992i();
                        C3500qj c3500qj = zz0Var2.f72417a;
                        c3500qj.m19989f(0.2f * fIntBitsToFloat2, fM18232Q3 * fIntBitsToFloat2);
                        c3500qj.m19988e(fM18232Q * fIntBitsToFloat2, fM18232Q2 * fIntBitsToFloat2);
                        c3500qj.m19988e(0.8f * fIntBitsToFloat2, fIntBitsToFloat2 * fM18232Q4);
                        C3576sj c3576sj = zz0Var2.f72418b;
                        c3576sj.f60911a.setPath(c3500qj != null ? c3500qj.f57839a : null, false);
                        C3500qj c3500qj2 = zz0Var2.f72419c;
                        c3500qj2.m19992i();
                        c3576sj.m21398a(f5, c3576sj.f60911a.getLength() * fFloatValue, c3500qj2);
                        InterfaceC0310a.m1408A0(interfaceC0310a, zz0Var2.f72419c, j8, 0.0f, el9Var, 52);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var3);
                objM22097O3 = vi3Var3;
            }
            eh0.m11124d(e16VarM4419l2, (vi3) objM22097O3, tj3Var, i8);
        } else {
            tj3Var = tj3Var3;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gk0(z, toggleableState, e16Var, h01Var, el9Var, el9Var2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c */
    public static final void m19507c(a02 a02Var, zi3 zi3Var, ye1 ye1Var, int i) {
        aoa aoaVar;
        boolean z;
        x18 x18VarM22143u;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-149765515);
        o84 o84Var = tj3Var.f62410x;
        l77 l77VarM22132m = tj3Var.m22132m();
        tj3Var.m22105X(201, cf1.f9994b);
        Object objM22097O = tj3Var.m22097O();
        if (fa4.m11650l(objM22097O, we1.f66679a)) {
            aoaVar = null;
        } else {
            objM22097O.getClass();
            aoaVar = (aoa) objM22097O;
        }
        AbstractC0279g abstractC0279g = (AbstractC0279g) a02Var.f14d;
        aoa aoaVarM1267c = abstractC0279g.m1267c(a02Var, aoaVar);
        boolean zEquals = aoaVarM1267c.equals(aoaVar);
        if (!zEquals) {
            tj3Var.m22131l0(aoaVarM1267c);
        }
        if (!tj3Var.f62384S) {
            bb9 bb9Var = tj3Var.f62372G;
            Object objM3558b = bb9Var.m3558b(bb9Var.f8283b, bb9Var.f8288g);
            objM3558b.getClass();
            l77 l77Var = (l77) objM3558b;
            if (!(tj3Var.m22086D() && zEquals) && (a02Var.f13c || !l77VarM22132m.containsKey(abstractC0279g))) {
                l77VarM22132m = l77VarM22132m.m15968d(abstractC0279g, aoaVarM1267c);
            } else if ((zEquals && !tj3Var.f62409w) || !tj3Var.f62409w) {
                l77VarM22132m = l77Var;
            }
            if (tj3Var.f62411y || l77Var != l77VarM22132m) {
                z = true;
            }
            if (z && !tj3Var.f62384S) {
                tj3Var.m22095M(l77VarM22132m);
            }
            o84Var.m17840c(tj3Var.f62409w ? 1 : 0);
            tj3Var.f62409w = z;
            tj3Var.f62376K = l77VarM22132m;
            tj3Var.m22103V(cf1.f9995c, 202, 0, l77VarM22132m);
            zi3Var.invoke(tj3Var, Integer.valueOf((i >> 3) & 14));
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
            tj3Var.f62409w = o84Var.m17839b() != 0;
            tj3Var.f62376K = null;
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3504qn(a02Var, i, 4, zi3Var);
            }
        }
        if (a02Var.f13c || !l77VarM22132m.containsKey(abstractC0279g)) {
            l77VarM22132m = l77VarM22132m.m15968d(abstractC0279g, aoaVarM1267c);
        }
        tj3Var.f62375J = true;
        z = false;
        if (z) {
            tj3Var.m22095M(l77VarM22132m);
        }
        o84Var.m17840c(tj3Var.f62409w ? 1 : 0);
        tj3Var.f62409w = z;
        tj3Var.f62376K = l77VarM22132m;
        tj3Var.m22103V(cf1.f9995c, 202, 0, l77VarM22132m);
        zi3Var.invoke(tj3Var, Integer.valueOf((i >> 3) & 14));
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
        tj3Var.f62409w = o84Var.m17839b() != 0;
        tj3Var.f62376K = null;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(a02Var, i, 4, zi3Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final void m19508d(a02[] a02VarArr, zi3 zi3Var, ye1 ye1Var, int i) {
        l77 l77VarM14939d;
        boolean z;
        x18 x18VarM22143u;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(415205898);
        o84 o84Var = tj3Var.f62410x;
        l77 l77VarM22132m = tj3Var.m22132m();
        tj3Var.m22105X(201, cf1.f9994b);
        boolean z2 = tj3Var.f62384S;
        wx6 wx6Var = cf1.f9996d;
        if (z2) {
            l77 l77VarM24767g0 = xwc.m24767g0(a02VarArr, l77VarM22132m, l77.f49251d);
            l77VarM22132m.getClass();
            k77 k77Var = new k77(l77VarM22132m);
            k77Var.f46817g = l77VarM22132m;
            k77Var.putAll(l77VarM24767g0);
            l77VarM14939d = k77Var.mo14937a();
            tj3Var.m22105X(204, wx6Var);
            tj3Var.m22089G();
            tj3Var.m22133m0(l77VarM14939d);
            tj3Var.m22089G();
            tj3Var.m22133m0(l77VarM24767g0);
            tj3Var.m22139q(false);
            tj3Var.f62375J = true;
        } else {
            bb9 bb9Var = tj3Var.f62372G;
            Object objM3564h = bb9Var.m3564h(bb9Var.f8288g, 0);
            objM3564h.getClass();
            l77 l77Var = (l77) objM3564h;
            bb9 bb9Var2 = tj3Var.f62372G;
            Object objM3564h2 = bb9Var2.m3564h(bb9Var2.f8288g, 1);
            objM3564h2.getClass();
            l77 l77Var2 = (l77) objM3564h2;
            l77 l77VarM24767g1 = xwc.m24767g0(a02VarArr, l77VarM22132m, l77Var2);
            if (!tj3Var.m22086D() || tj3Var.f62411y || !l77Var2.equals(l77VarM24767g1)) {
                l77VarM22132m.getClass();
                k77 k77Var2 = new k77(l77VarM22132m);
                k77Var2.f46817g = l77VarM22132m;
                k77Var2.putAll(l77VarM24767g1);
                l77VarM14939d = k77Var2.mo14937a();
                tj3Var.m22105X(204, wx6Var);
                tj3Var.m22089G();
                tj3Var.m22133m0(l77VarM14939d);
                tj3Var.m22089G();
                tj3Var.m22133m0(l77VarM24767g1);
                tj3Var.m22139q(false);
                if (tj3Var.f62411y || !fa4.m11650l(l77VarM14939d, l77Var)) {
                    z = true;
                }
                if (z && !tj3Var.f62384S) {
                    tj3Var.m22095M(l77VarM14939d);
                }
                o84Var.m17840c(tj3Var.f62409w ? 1 : 0);
                tj3Var.f62409w = z;
                tj3Var.f62376K = l77VarM14939d;
                tj3Var.m22103V(cf1.f9995c, 202, 0, l77VarM14939d);
                zi3Var.invoke(tj3Var, Integer.valueOf((i >> 3) & 14));
                tj3Var.m22139q(false);
                tj3Var.m22139q(false);
                tj3Var.f62409w = o84Var.m17839b() != 0;
                tj3Var.f62376K = null;
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C3504qn(a02VarArr, i, 5, zi3Var);
                }
            }
            tj3Var.f62398l = tj3Var.f62372G.m3575s() + tj3Var.f62398l;
            l77VarM14939d = l77Var;
        }
        z = false;
        if (z) {
            tj3Var.m22095M(l77VarM14939d);
        }
        o84Var.m17840c(tj3Var.f62409w ? 1 : 0);
        tj3Var.f62409w = z;
        tj3Var.f62376K = l77VarM14939d;
        tj3Var.m22103V(cf1.f9995c, 202, 0, l77VarM14939d);
        zi3Var.invoke(tj3Var, Integer.valueOf((i >> 3) & 14));
        tj3Var.m22139q(false);
        tj3Var.m22139q(false);
        tj3Var.f62409w = o84Var.m17839b() != 0;
        tj3Var.f62376K = null;
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(a02VarArr, i, 5, zi3Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m19509e(C0282a c0282a, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-709502251);
        if (tj3Var.m22099R(i & 1, (i & 3) != 2)) {
            vh9 vh9Var = kl8.f47496a;
            il8 il8Var = (il8) tj3Var.m22128k(vh9Var);
            tj3Var.m22111b0(1967007413);
            Object[] objArr = new Object[0];
            Object objM22097O = tj3Var.m22097O();
            int i2 = 12;
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new b98(i2);
                tj3Var.m22131l0(objM22097O);
            }
            gl8 gl8Var = (gl8) xwc.m24747T(objArr, gl8.f40973e, (ui3) objM22097O, tj3Var, 384);
            gl8Var.f40976c = (il8) tj3Var.m22128k(vh9Var);
            tj3Var.m22139q(false);
            Object[] objArr2 = {il8Var};
            fs6 fs6Var = new fs6(19, new ln1(i2), new C3704w(25, il8Var, gl8Var));
            boolean zM22124i = tj3Var.m22124i(il8Var) | tj3Var.m22124i(gl8Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new C3006fm(16, il8Var, gl8Var);
                tj3Var.m22131l0(objM22097O2);
            }
            ov4 ov4Var = (ov4) xwc.m24747T(objArr2, fs6Var, (ui3) objM22097O2, tj3Var, 0);
            m19507c(vh9Var.mo1265a(ov4Var), ci8.m4703P(-412824043, new C3794yf(i2, c0282a, ov4Var), tj3Var), tj3Var, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zn0(c0282a, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final void m19510f(e16 e16Var, d85 d85Var, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        vi3 vi3Var2;
        int i4;
        ui3 ui3Var2;
        int i5;
        vi3 vi3Var3;
        ui3 ui3Var3;
        vi3 vi3Var4;
        ui3 ui3Var4;
        t66 t66Var;
        vi3 vi3Var5;
        d85 d85Var2;
        t66 t66Var2;
        boolean z;
        d85Var.getClass();
        String str = d85Var.f35153f;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-977127491);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = i | (tj3Var.m22120g(e16Var2) ? 4 : 2);
        }
        int i7 = i3 | (tj3Var.m22120g(d85Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            vi3Var2 = vi3Var;
        } else {
            vi3Var2 = vi3Var;
            i4 = i7 | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            i5 = i4 | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024);
        }
        int i10 = i5;
        if (tj3Var.m22099R(i10 & 1, (i10 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            if (i6 != 0) {
                e16Var2 = b16Var;
            }
            p84 p84Var = we1.f66679a;
            if (i8 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new tf4(10);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var4 = (vi3) objM22097O;
            } else {
                vi3Var4 = vi3Var2;
            }
            int i11 = 7;
            if (i9 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new C3288l7(i11);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3Var4 = (ui3) objM22097O2;
            } else {
                ui3Var4 = ui3Var2;
            }
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var4, pb1.m19045o(c99.m4430w(e16Var2, null, 3).mo3161g(b16Var), p58.m18901i(tj3Var).f64858d), 15);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
            se1.f60731q.getClass();
            ui3 ui3Var5 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var6 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var6);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            ge9.m12515a(tj3Var).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 227.0f);
            ge9.m12515a(tj3Var).getClass();
            e16 e16Var3 = e16Var2;
            ui3 ui3Var6 = ui3Var4;
            vi3 vi3Var7 = vi3Var4;
            bq1.m4039O(m19529y(c99.m4414g(e16VarM4426s, 136.0f), 0.0f, 2.0f, 1), p58.m18901i(tj3Var).f64858d, null, te1.m22000n(62, 0.0f), ci8.m4714a(1.0f, p58.m18900f(tj3Var).f55816A), pk9.f56356a, tj3Var, 196608, 4);
            ge9.m12515a(tj3Var).getClass();
            e16 e16VarM4426s2 = c99.m4426s(b16Var, 225.0f);
            ge9.m12515a(tj3Var).getClass();
            bq1.m4039O(m19529y(c99.m4414g(e16VarM4426s2, 138.0f), 0.0f, 1.0f, 1), p58.m18901i(tj3Var).f64858d, null, te1.m22000n(62, 0.0f), ci8.m4714a(1.0f, p58.m18900f(tj3Var).f55816A), pk9.f56357b, tj3Var, 196608, 4);
            ge9.m12515a(tj3Var).getClass();
            e16 e16VarM4426s3 = c99.m4426s(b16Var, 223.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4426s3);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            ge9.m12515a(tj3Var).getClass();
            bq1.m4039O(c99.m4414g(e16VarM4412e, 140.0f).mo3161g(new gv3(nj0.f52792K)), p58.m18901i(tj3Var).f64858d, null, te1.m22000n(62, 0.0f), null, ci8.m4703P(1818682539, new rm0(d85Var, 5), tj3Var), tj3Var, 196608, 20);
            e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38955d, tj3Var, b16Var, 1.0f);
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var, 54);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM22984g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            lw9.m16554b(str, AbstractC3584sr.m21611X(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 11), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 24960, 110588);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                t66Var = t66Var3;
                objM22097O4 = new kb0(6, t66Var);
                tj3Var.m22131l0(objM22097O4);
            } else {
                t66Var = t66Var3;
            }
            vf0 vf0VarM4714a = ci8.m4714a(1.0f, p58.m18900f(tj3Var).f55816A);
            t66 t66Var4 = t66Var;
            omd.m18141c((ui3) objM22097O4, c99.m4422o(r46.m20388n(b16Var, vf0VarM4714a.f65300a, vf0VarM4714a.f65301b, ui8.f63972a), 24.0f), false, null, null, pk9.f56358c, tj3Var, 1572870, 60);
            if (((Boolean) t66Var4.getValue()).booleanValue()) {
                tj3Var.m22111b0(-1462845471);
                Object objM22097O5 = tj3Var.m22097O();
                if (objM22097O5 == p84Var) {
                    t66Var2 = t66Var4;
                    objM22097O5 = new kb0(7, t66Var2);
                    tj3Var.m22131l0(objM22097O5);
                } else {
                    t66Var2 = t66Var4;
                }
                ui3 ui3Var7 = (ui3) objM22097O5;
                d85Var2 = d85Var;
                do1 do1Var = new do1(d85Var2.f35158k, d85Var2.f35159l, !d85Var2.f35157j, d85Var2.f35160m, d85Var2.f35161n, d85Var2.f35162o, d85Var2.f35163p);
                boolean z2 = (i10 & 896) == 256;
                Object objM22097O6 = tj3Var.m22097O();
                if (z2 || objM22097O6 == p84Var) {
                    vi3Var5 = vi3Var7;
                    z = false;
                    objM22097O6 = new c85(vi3Var5, t66Var2, 0 == true ? 1 : 0);
                    tj3Var.m22131l0(objM22097O6);
                } else {
                    z = false;
                    vi3Var5 = vi3Var7;
                }
                m9d.m16704a(str, ui3Var7, do1Var, (vi3) objM22097O6, tj3Var, 48);
                tj3Var.m22139q(z);
            } else {
                vi3Var5 = vi3Var7;
                d85Var2 = d85Var;
                tj3Var.m22111b0(-1461986337);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38954c));
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var5);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var6);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
            ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_collection_course_s, tj3Var, 0), null, AbstractC3584sr.m21611X(wq1.m24108d(tj3Var, b16Var, 16.0f), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38954c, 0.0f, 11), p58.m18900f(tj3Var).f55873q, tj3Var, 56, 0);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            int i12 = R$plurals.lingq_lessons_count_Lessons;
            int i13 = d85Var2.f35156i;
            lw9.m16554b(vz1.m23612R(i12, i13, new Object[]{Integer.valueOf(i13)}, tj3Var), as4Var, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            vi3Var3 = vi3Var5;
            e16Var2 = e16Var3;
            ui3Var3 = ui3Var6;
        } else {
            tj3Var.m22102U();
            vi3Var3 = vi3Var2;
            ui3Var3 = ui3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new hd1(e16Var2, d85Var, vi3Var3, ui3Var3, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0063 A[LOOP:0: B:4:0x000d->B:35:0x0063, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0066 A[EDGE_INSN: B:43:0x0066->B:36:0x0066 BREAK  A[LOOP:0: B:4:0x000d->B:35:0x0063], SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final C0423c m19511g(C0357g c0357g, boolean z) {
        d16 d16Var = (d16) c0357g.f4335a0.f46679g;
        ea2 ea2Var = null;
        if ((d16Var.f34840d & 8) != 0) {
            loop0: while (d16Var != null) {
                if ((d16Var.f34839c & 8) == 0) {
                    if ((d16Var.f34840d & 8) != 0) {
                        break;
                        break;
                    }
                    d16Var = d16Var.f34842f;
                } else {
                    d16 d16VarM21992f = d16Var;
                    x66 x66Var = null;
                    while (d16VarM21992f != null) {
                        if (d16VarM21992f instanceof ov8) {
                            ea2Var = d16VarM21992f;
                            break loop0;
                        }
                        if ((d16VarM21992f.f34839c & 8) != 0 && (d16VarM21992f instanceof fa2)) {
                            int i = 0;
                            for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                if ((d16Var2.f34839c & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        d16VarM21992f = d16Var2;
                                    } else {
                                        if (x66Var == null) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (d16VarM21992f != null) {
                                            x66Var.m24305c(d16VarM21992f);
                                            d16VarM21992f = null;
                                        }
                                        x66Var.m24305c(d16Var2);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        d16VarM21992f = te1.m21992f(x66Var);
                    }
                    if ((d16Var.f34840d & 8) != 0) {
                        break;
                    }
                    d16Var = d16Var.f34842f;
                }
            }
        }
        ea2Var.getClass();
        d16 d16Var3 = ((d16) ((ov8) ea2Var)).f34837a;
        kv8 kv8VarM1613z = c0357g.m1613z();
        if (kv8VarM1613z == null) {
            kv8VarM1613z = new kv8();
        }
        return new C0423c(d16Var3, z, c0357g, kv8VarM1613z);
    }

    /* JADX INFO: renamed from: h */
    public static final void m19512h(final ToggleableState toggleableState, final ui3 ui3Var, final el9 el9Var, final el9 el9Var2, final e16 e16Var, final boolean z, final h01 h01Var, ye1 ye1Var, final int i) {
        int i2;
        ToggleableState toggleableState2;
        e16 e16VarM10524K;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-406243761);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22116e(toggleableState.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? tj3Var.m22120g(el9Var) : tj3Var.m22124i(el9Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? tj3Var.m22120g(el9Var2) : tj3Var.m22124i(el9Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22122h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22120g(h01Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var.m22120g(null) ? 8388608 : 4194304;
        }
        if (tj3Var.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            rh8 rh8VarM12656a = gh8.m12656a(false, o01.m17718a() / 2.0f, aa1.f412k, ui8.m22752a(25), 240);
            b16 b16Var = b16.f7762a;
            if (ui3Var != null) {
                toggleableState2 = toggleableState;
                e16VarM10524K = do7.m10524K(toggleableState2, rh8VarM12656a, z, new uh8(1), ui3Var);
            } else {
                toggleableState2 = toggleableState;
                e16VarM10524K = b16Var;
            }
            if (ui3Var != null) {
                iv3 iv3Var = AbstractC0262s.f3627a;
                e16Var2 = c06.f9271b;
            } else {
                e16Var2 = b16Var;
            }
            int i3 = ((i2 >> 15) & 14) | ((i2 << 3) & 112) | ((i2 >> 9) & 7168) | 32768;
            int i4 = i2 << 6;
            m19506b(z, toggleableState2, e16Var.mo3161g(e16Var2).mo3161g(e16VarM10524K).mo3161g(AbstractC3584sr.m21607T(b16Var, 2.0f)), h01Var, el9Var, el9Var2, tj3Var, i3 | (57344 & i4) | 262144 | (i4 & 458752));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: k01
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pvc.m19512h(toggleableState, ui3Var, el9Var, el9Var2, e16Var, z, h01Var, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final e16 m19513i(vi3 vi3Var) {
        return new pq6(vi3Var, new kl3(vi3Var, 1), false);
    }

    /* JADX INFO: renamed from: j */
    public static final e16 m19514j(e16 e16Var, float f) {
        return f == 1.0f ? e16Var : AbstractC0309d.m1407b(e16Var, 0.0f, 0.0f, f, 0.0f, 0.0f, 0L, null, true, 1044475);
    }

    /* JADX INFO: renamed from: k */
    public static final Object m19515k(String str, Bundle bundle) {
        Object obj = bundle.get(str);
        if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Boolean)) {
            return obj;
        }
        if (obj instanceof CharSequence) {
            return obj.toString();
        }
        if (obj instanceof Object[]) {
            return AbstractC3550rv.m20852t0((Object[]) obj);
        }
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static float m19516l(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    /* JADX INFO: renamed from: m */
    public static final void m19517m(String str) {
        String strSubstring = str.length() <= 127 ? str : null;
        if (strSubstring == null) {
            strSubstring = str.substring(0, 127);
        }
        Trace.beginSection(strSubstring);
    }

    /* JADX INFO: renamed from: n */
    public static String m19518n(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            int i2 = (bArr[i] & 240) >>> 4;
            char[] cArr = f56876g;
            sb.append(cArr[i2]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: o */
    public static void m19519o(Object obj) {
        if (obj != null) {
            return;
        }
        C3386nv.m17635v("Cannot return null from a non-@Nullable @Provides method");
    }

    /* JADX INFO: renamed from: p */
    public static int m19520p(HandwritingGesture handwritingGesture, cg7 cg7Var) {
        String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        cg7Var.invoke(new hb1(fallbackText, 1));
        return 5;
    }

    /* JADX INFO: renamed from: q */
    public static final p04 m19521q() {
        p04 p04Var = f56881l;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(8.12f, 9.29f);
        f57Var.m11551f(12.0f, 13.17f);
        f57Var.m11552g(3.88f, -3.88f);
        f57Var.m11548c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        f57Var.m11548c(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        f57Var.m11552g(-4.59f, 4.59f);
        f57Var.m11548c(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        f57Var.m11551f(6.7f, 10.7f);
        f57Var.m11548c(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        f57Var.m11548c(0.39f, -0.38f, 1.03f, -0.39f, 1.42f, 0.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f56881l = p04VarM17721b;
        return p04VarM17721b;
    }

    /* JADX INFO: renamed from: r */
    public static final int m19522r(n27 n27Var) {
        return (int) (n27Var.f52223e == Orientation.Vertical ? n27Var.m17188g() & 4294967295L : n27Var.m17188g() >> 32);
    }

    /* JADX INFO: renamed from: s */
    public static Intent m19523s(AbstractActivityC2935dp abstractActivityC2935dp) {
        Intent parentActivityIntent = abstractActivityC2935dp.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String strM19525u = m19525u(abstractActivityC2935dp, abstractActivityC2935dp.getComponentName());
            if (strM19525u == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(abstractActivityC2935dp, strM19525u);
            try {
                return m19525u(abstractActivityC2935dp, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + strM19525u + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: renamed from: t */
    public static Intent m19524t(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String strM19525u = m19525u(context, componentName);
        if (strM19525u == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), strM19525u);
        return m19525u(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    /* JADX INFO: renamed from: u */
    public static String m19525u(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    /* JADX INFO: renamed from: v */
    public static String m19526v(Context context) {
        try {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                return context.getPackageName();
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo != null && runningAppProcessInfo.pid == iMyPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            for (ActivityManager.RunningServiceInfo runningServiceInfo : activityManager.getRunningServices(Integer.MAX_VALUE)) {
                if (runningServiceInfo != null && runningServiceInfo.pid == iMyPid) {
                    return runningServiceInfo.process;
                }
            }
            return context.getPackageName();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: w */
    public static final e16 m19527w(e16 e16Var, vi3 vi3Var) {
        return e16Var.mo3161g(new pq6(vi3Var, new kl3(vi3Var, 2), true));
    }

    /* JADX INFO: renamed from: x */
    public static final e16 m19528x(e16 e16Var, float f, float f2) {
        return e16Var.mo3161g(new jq6(f, f2, new kq6(f, f2, 0)));
    }

    /* JADX INFO: renamed from: y */
    public static e16 m19529y(e16 e16Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return m19528x(e16Var, f, f2);
    }

    /* JADX INFO: renamed from: z */
    public static void m19530z(long j, C3419on c3419on, boolean z, cg7 cg7Var) {
        if (z) {
            int i = cx9.f34693c;
            int iCharCount = (int) (j >> 32);
            int iCharCount2 = (int) (j & 4294967295L);
            int iCodePointBefore = iCharCount > 0 ? Character.codePointBefore(c3419on, iCharCount) : 10;
            int iCodePointAt = iCharCount2 < c3419on.f54604b.length() ? Character.codePointAt(c3419on, iCharCount2) : 10;
            if (xwc.m24740M(iCodePointBefore) && (xwc.m24739L(iCodePointAt) || xwc.m24738K(iCodePointAt))) {
                do {
                    iCharCount -= Character.charCount(iCodePointBefore);
                    if (iCharCount == 0) {
                        break;
                    } else {
                        iCodePointBefore = Character.codePointBefore(c3419on, iCharCount);
                    }
                } while (xwc.m24740M(iCodePointBefore));
                j = eh0.m11127g(iCharCount, iCharCount2);
            } else if (xwc.m24740M(iCodePointAt) && (xwc.m24739L(iCodePointBefore) || xwc.m24738K(iCodePointBefore))) {
                do {
                    iCharCount2 += Character.charCount(iCodePointAt);
                    if (iCharCount2 == c3419on.f54604b.length()) {
                        break;
                    } else {
                        iCodePointAt = Character.codePointAt(c3419on, iCharCount2);
                    }
                } while (xwc.m24740M(iCodePointAt));
                j = eh0.m11127g(iCharCount, iCharCount2);
            }
        }
        int i2 = (int) (4294967295L & j);
        cg7Var.invoke(new cr3(new uo2[]{new a09(i2, i2), new ya2(cx9.m9922d(j), 0)}));
    }
}
