package p000;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.compose.p002ui.platform.ViewOnAttachStateChangeListenerC0393e;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$Event;
import com.amplitude.android.internal.gestures.C0888c;
import com.android.installreferrer.api.C0918b;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.appevents.FlushReason;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.material.button.MaterialButton;
import com.kochava.core.job.job.internal.JobState;
import com.kochava.tracker.store.google.referrer.internal.GoogleReferrerStatus;
import com.lingq.core.player.C1808b;
import com.lingq.p020ui.MainActivity;
import curtains.AbstractC2898a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: a0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0002a0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3b;

    public /* synthetic */ RunnableC0002a0(Object obj, int i) {
        this.f2a = i;
        this.f3b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:168:0x0436  */
    /* JADX WARN: Code duplicated, block: B:177:0x0459  */
    /* JADX WARN: Code duplicated, block: B:178:0x0461  */
    /* JADX WARN: Code duplicated, block: B:180:0x0470  */
    /* JADX WARN: Code duplicated, block: B:182:0x0476  */
    /* JADX WARN: Code duplicated, block: B:185:0x0483  */
    /* JADX WARN: Code duplicated, block: B:187:0x0487  */
    /* JADX WARN: Code duplicated, block: B:188:0x0491  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:193:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:194:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:203:0x054c  */
    /* JADX WARN: Code duplicated, block: B:205:0x0562  */
    /* JADX WARN: Code duplicated, block: B:207:0x056c  */
    /* JADX WARN: Code duplicated, block: B:211:0x057a  */
    /* JADX WARN: Code duplicated, block: B:213:0x0580  */
    /* JADX WARN: Code duplicated, block: B:217:0x0596  */
    /* JADX WARN: Code duplicated, block: B:219:0x059c  */
    /* JADX WARN: Code duplicated, block: B:221:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:292:0x058b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01f0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException {
        long j;
        long j2;
        float f;
        long j3;
        long j4;
        boolean z;
        float f2;
        zf9 zf9Var;
        float f3;
        float f4;
        float f5;
        zf9 zf9Var2;
        boolean z2;
        Object[] objArr;
        ArrayList arrayList;
        C3727wm c3727wmM25116b;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        int size;
        uo3 uo3VarM22843a;
        C0918b c0918b;
        Boolean boolValueOf;
        Long lValueOf;
        Long lValueOf2;
        Boolean bool;
        Long l;
        uo3 uo3Var;
        Map mapUnmodifiableMap;
        int i2 = this.f2a;
        boolean z3 = false;
        Object[] objArr2 = 0;
        Object[] objArr3 = null;
        String installVersion = null;
        Map map = null;
        String str = null;
        Object obj = this.f3b;
        switch (i2) {
            case 0:
                ((AbstractC0389a) obj).m1708b();
                return;
            case 1:
                ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = (ViewOnAttachStateChangeListenerC0393e) obj;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC0393e.f4746d.m1754x(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC0393e.m1787n();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC0393e.f4747d0 = false;
                        return;
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            case 2:
                C3727wm c3727wm = (C3727wm) ((C3727wm) obj).f67035c.f57974a;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = c3727wm.f67034b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    yf9 yf9Var = (yf9) arrayList3.get(i3);
                    if (yf9Var == null) {
                        objArr = objArr3;
                        jUptimeMillis = jUptimeMillis;
                    } else {
                        l79 l79Var = c3727wm.f67033a;
                        Long l2 = (Long) l79Var.get(yf9Var);
                        if (l2 == null) {
                            j = yf9Var.f69791i;
                            if (j == 0) {
                                yf9Var.f69791i = jUptimeMillis;
                                yf9Var.m25119d(yf9Var.f69784b);
                                objArr = objArr3;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                yf9Var.f69791i = jUptimeMillis;
                                f = yf9.m25116b().f67039g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = yf9Var.f69797o;
                                f2 = yf9Var.f69796n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        yf9Var.f69795m.f71503i = f2;
                                        yf9Var.f69796n = Float.MAX_VALUE;
                                    }
                                    yf9Var.f69784b = (float) yf9Var.f69795m.f71503i;
                                    yf9Var.f69783a = 0.0f;
                                    yf9Var.f69797o = z3;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    zf9Var = yf9Var.f69795m;
                                    f3 = yf9Var.f69784b;
                                    f4 = yf9Var.f69783a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j5 = j4 / 2;
                                        C3588sv c3588svM25595c = zf9Var.m25595c(f3, f4, j5);
                                        zf9 zf9Var3 = yf9Var.f69795m;
                                        zf9Var3.f71503i = yf9Var.f69796n;
                                        yf9Var.f69796n = Float.MAX_VALUE;
                                        C3588sv c3588svM25595c2 = zf9Var3.m25595c(c3588svM25595c.f61450a, c3588svM25595c.f61451b, j5);
                                        yf9Var.f69784b = c3588svM25595c2.f61450a;
                                        yf9Var.f69783a = c3588svM25595c2.f61451b;
                                    } else {
                                        C3588sv c3588svM25595c3 = zf9Var.m25595c(f3, f4, j4);
                                        yf9Var.f69784b = c3588svM25595c3.f61450a;
                                        yf9Var.f69783a = c3588svM25595c3.f61451b;
                                    }
                                    float fMax = Math.max(yf9Var.f69784b, yf9Var.f69790h);
                                    yf9Var.f69784b = fMax;
                                    float fMin = Math.min(fMax, yf9Var.f69789g);
                                    yf9Var.f69784b = fMin;
                                    f5 = yf9Var.f69783a;
                                    zf9Var2 = yf9Var.f69795m;
                                    zf9Var2.getClass();
                                    if (Math.abs(f5) < zf9Var2.f71499e) {
                                    }
                                    z2 = false;
                                    float fMin2 = Math.min(yf9Var.f69784b, yf9Var.f69789g);
                                    yf9Var.f69784b = fMin2;
                                    float fMax2 = Math.max(fMin2, yf9Var.f69790h);
                                    yf9Var.f69784b = fMax2;
                                    yf9Var.m25119d(fMax2);
                                    if (z2) {
                                        arrayList = yf9Var.f69793k;
                                        yf9Var.f69788f = false;
                                        c3727wmM25116b = yf9.m25116b();
                                        c3727wmM25116b.f67033a.remove(yf9Var);
                                        arrayList2 = c3727wmM25116b.f67034b;
                                        iIndexOf = arrayList2.indexOf(yf9Var);
                                        if (iIndexOf >= 0) {
                                            objArr = null;
                                            arrayList2.set(iIndexOf, null);
                                            c3727wmM25116b.f67038f = true;
                                        } else {
                                            objArr = null;
                                        }
                                        yf9Var.f69791i = 0L;
                                        yf9Var.f69785c = false;
                                        for (i = 0; i < arrayList.size(); i++) {
                                            if (arrayList.get(i) != null) {
                                                ((un2) arrayList.get(i)).mo22582a(yf9Var.f69784b);
                                            }
                                        }
                                        for (size = arrayList.size() - 1; size >= 0; size--) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        objArr = null;
                                    }
                                }
                                z2 = true;
                                float fMin3 = Math.min(yf9Var.f69784b, yf9Var.f69789g);
                                yf9Var.f69784b = fMin3;
                                float fMax3 = Math.max(fMin3, yf9Var.f69790h);
                                yf9Var.f69784b = fMax3;
                                yf9Var.m25119d(fMax3);
                                if (z2) {
                                    arrayList = yf9Var.f69793k;
                                    yf9Var.f69788f = false;
                                    c3727wmM25116b = yf9.m25116b();
                                    c3727wmM25116b.f67033a.remove(yf9Var);
                                    arrayList2 = c3727wmM25116b.f67034b;
                                    iIndexOf = arrayList2.indexOf(yf9Var);
                                    if (iIndexOf >= 0) {
                                        objArr = null;
                                        arrayList2.set(iIndexOf, null);
                                        c3727wmM25116b.f67038f = true;
                                    } else {
                                        objArr = null;
                                    }
                                    yf9Var.f69791i = 0L;
                                    yf9Var.f69785c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            ((un2) arrayList.get(i)).mo22582a(yf9Var.f69784b);
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    objArr = null;
                                }
                            }
                        } else if (l2.longValue() < jUptimeMillis2) {
                            l79Var.remove(yf9Var);
                            j = yf9Var.f69791i;
                            if (j == 0) {
                                yf9Var.f69791i = jUptimeMillis;
                                yf9Var.m25119d(yf9Var.f69784b);
                                objArr = objArr3;
                                jUptimeMillis = jUptimeMillis;
                            } else {
                                j2 = jUptimeMillis - j;
                                yf9Var.f69791i = jUptimeMillis;
                                f = yf9.m25116b().f67039g;
                                if (f == 0.0f) {
                                    j3 = 2147483647L;
                                } else {
                                    j3 = (long) (j2 / f);
                                }
                                j4 = j3;
                                z = yf9Var.f69797o;
                                f2 = yf9Var.f69796n;
                                if (z) {
                                    if (f2 != Float.MAX_VALUE) {
                                        yf9Var.f69795m.f71503i = f2;
                                        yf9Var.f69796n = Float.MAX_VALUE;
                                    }
                                    yf9Var.f69784b = (float) yf9Var.f69795m.f71503i;
                                    yf9Var.f69783a = 0.0f;
                                    yf9Var.f69797o = z3;
                                } else {
                                    jUptimeMillis = jUptimeMillis;
                                    zf9Var = yf9Var.f69795m;
                                    f3 = yf9Var.f69784b;
                                    f4 = yf9Var.f69783a;
                                    if (f2 != Float.MAX_VALUE) {
                                        long j6 = j4 / 2;
                                        C3588sv c3588svM25595c4 = zf9Var.m25595c(f3, f4, j6);
                                        zf9 zf9Var4 = yf9Var.f69795m;
                                        zf9Var4.f71503i = yf9Var.f69796n;
                                        yf9Var.f69796n = Float.MAX_VALUE;
                                        C3588sv c3588svM25595c5 = zf9Var4.m25595c(c3588svM25595c4.f61450a, c3588svM25595c4.f61451b, j6);
                                        yf9Var.f69784b = c3588svM25595c5.f61450a;
                                        yf9Var.f69783a = c3588svM25595c5.f61451b;
                                    } else {
                                        C3588sv c3588svM25595c6 = zf9Var.m25595c(f3, f4, j4);
                                        yf9Var.f69784b = c3588svM25595c6.f61450a;
                                        yf9Var.f69783a = c3588svM25595c6.f61451b;
                                    }
                                    float fMax4 = Math.max(yf9Var.f69784b, yf9Var.f69790h);
                                    yf9Var.f69784b = fMax4;
                                    float fMin4 = Math.min(fMax4, yf9Var.f69789g);
                                    yf9Var.f69784b = fMin4;
                                    f5 = yf9Var.f69783a;
                                    zf9Var2 = yf9Var.f69795m;
                                    zf9Var2.getClass();
                                    if (Math.abs(f5) < zf9Var2.f71499e || Math.abs(fMin4 - ((float) zf9Var2.f71503i)) >= zf9Var2.f71498d) {
                                        z2 = false;
                                    } else {
                                        yf9Var.f69784b = (float) yf9Var.f69795m.f71503i;
                                        yf9Var.f69783a = 0.0f;
                                    }
                                    float fMin5 = Math.min(yf9Var.f69784b, yf9Var.f69789g);
                                    yf9Var.f69784b = fMin5;
                                    float fMax5 = Math.max(fMin5, yf9Var.f69790h);
                                    yf9Var.f69784b = fMax5;
                                    yf9Var.m25119d(fMax5);
                                    if (z2) {
                                        arrayList = yf9Var.f69793k;
                                        yf9Var.f69788f = false;
                                        c3727wmM25116b = yf9.m25116b();
                                        c3727wmM25116b.f67033a.remove(yf9Var);
                                        arrayList2 = c3727wmM25116b.f67034b;
                                        iIndexOf = arrayList2.indexOf(yf9Var);
                                        if (iIndexOf >= 0) {
                                            objArr = null;
                                            arrayList2.set(iIndexOf, null);
                                            c3727wmM25116b.f67038f = true;
                                        } else {
                                            objArr = null;
                                        }
                                        yf9Var.f69791i = 0L;
                                        yf9Var.f69785c = false;
                                        while (i < arrayList.size()) {
                                            if (arrayList.get(i) != null) {
                                                ((un2) arrayList.get(i)).mo22582a(yf9Var.f69784b);
                                            }
                                        }
                                        while (size >= 0) {
                                            if (arrayList.get(size) == null) {
                                                arrayList.remove(size);
                                            }
                                        }
                                    } else {
                                        objArr = null;
                                    }
                                }
                                z2 = true;
                                float fMin6 = Math.min(yf9Var.f69784b, yf9Var.f69789g);
                                yf9Var.f69784b = fMin6;
                                float fMax6 = Math.max(fMin6, yf9Var.f69790h);
                                yf9Var.f69784b = fMax6;
                                yf9Var.m25119d(fMax6);
                                if (z2) {
                                    arrayList = yf9Var.f69793k;
                                    yf9Var.f69788f = false;
                                    c3727wmM25116b = yf9.m25116b();
                                    c3727wmM25116b.f67033a.remove(yf9Var);
                                    arrayList2 = c3727wmM25116b.f67034b;
                                    iIndexOf = arrayList2.indexOf(yf9Var);
                                    if (iIndexOf >= 0) {
                                        objArr = null;
                                        arrayList2.set(iIndexOf, null);
                                        c3727wmM25116b.f67038f = true;
                                    } else {
                                        objArr = null;
                                    }
                                    yf9Var.f69791i = 0L;
                                    yf9Var.f69785c = false;
                                    while (i < arrayList.size()) {
                                        if (arrayList.get(i) != null) {
                                            ((un2) arrayList.get(i)).mo22582a(yf9Var.f69784b);
                                        }
                                    }
                                    while (size >= 0) {
                                        if (arrayList.get(size) == null) {
                                            arrayList.remove(size);
                                        }
                                    }
                                } else {
                                    objArr = null;
                                }
                            }
                        } else {
                            objArr = objArr3;
                            jUptimeMillis = jUptimeMillis;
                        }
                    }
                    i3++;
                    objArr3 = objArr;
                    jUptimeMillis = jUptimeMillis;
                    z3 = false;
                }
                if (c3727wm.f67038f) {
                    for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                        if (arrayList3.get(size2) == null) {
                            arrayList3.remove(size2);
                        }
                    }
                    if (arrayList3.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        c3727wm.f67040h.m14607U();
                    }
                    c3727wm.f67038f = false;
                }
                if (arrayList3.size() > 0) {
                    ((Choreographer) c3727wm.f67037e.f8006a).postFrameCallback(new ChoreographerFrameCallbackC3690vm(c3727wm.f67036d));
                    return;
                }
                return;
            case 3:
                FlushReason flushReason = (FlushReason) obj;
                if (lp1.f49971a.contains(AbstractC3546rr.class)) {
                    return;
                }
                try {
                    flushReason.getClass();
                    AbstractC3546rr.m20755d(flushReason);
                    return;
                } catch (Throwable th3) {
                    lp1.m16420a(AbstractC3546rr.class, th3);
                    return;
                }
            case 4:
                C3552rx c3552rx = (C3552rx) obj;
                ((Context) c3552rx.f59987b).unregisterReceiver((C3514qx) c3552rx.f59988c);
                return;
            case 5:
                pc0 pc0Var = (pc0) obj;
                cc4 cc4Var = (cc4) pc0Var.f55939c;
                or3 or3Var = new or3();
                sc2 sc2Var = new sc2();
                MainActivity mainActivity = (MainActivity) cc4Var.f9881a;
                int i4 = MainActivity.f33994m0;
                sc2Var.f60665a = mainActivity.m9802q().f34201c.mo8551H1();
                sc2Var.f60666b = "subs";
                vp7 vp7VarM21220a = sc2Var.m21220a();
                sc2 sc2Var2 = new sc2();
                sc2Var2.f60665a = mainActivity.m9802q().f34201c.mo8568f1();
                sc2Var2.f60666b = "subs";
                vp7 vp7VarM21220a2 = sc2Var2.m21220a();
                sc2 sc2Var3 = new sc2();
                sc2Var3.f60665a = mainActivity.m9802q().f34201c.mo8555K0();
                sc2Var3.f60666b = "subs";
                vp7 vp7VarM21220a3 = sc2Var3.m21220a();
                sc2 sc2Var4 = new sc2();
                sc2Var4.f60665a = mainActivity.m9802q().f34201c.mo8561S0();
                sc2Var4.f60666b = "subs";
                vp7 vp7VarM21220a4 = sc2Var4.m21220a();
                sc2 sc2Var5 = new sc2();
                sc2Var5.f60665a = mainActivity.m9802q().f34201c.mo8574o0();
                sc2Var5.f60666b = "subs";
                List<vp7> listM23605K = vz1.m23605K(vp7VarM21220a, vp7VarM21220a2, vp7VarM21220a3, vp7VarM21220a4, sc2Var5.m21220a());
                if (listM23605K.isEmpty()) {
                    C3386nv.m17626m("Product list cannot be empty.");
                    return;
                }
                HashSet hashSet = new HashSet();
                for (vp7 vp7Var : listM23605K) {
                    if (!"play_pass_subs".equals(vp7Var.f65766b)) {
                        hashSet.add(vp7Var.f65766b);
                    }
                }
                if (hashSet.size() > 1) {
                    C3386nv.m17626m("All products should be of the same product type.");
                    return;
                }
                zzbw zzbwVarM5668m = zzbw.m5668m(listM23605K);
                or3Var.f54782a = zzbwVarM5668m;
                if (zzbwVarM5668m == null) {
                    C3386nv.m17626m("Product list must be set to a non empty list.");
                    return;
                }
                cc4 cc4Var2 = new cc4();
                cc4Var2.f9881a = (zzbw) or3Var.f54782a;
                pc0 pc0Var2 = mainActivity.f34000b0;
                if (pc0Var2 == null) {
                    fa4.m11636J("billingManager");
                    throw null;
                }
                int i5 = 8;
                RunnableC3725wk runnableC3725wk = new RunnableC3725wk(pc0Var2, cc4Var2, new fy4(mainActivity, i5), 3);
                if (pc0Var2.f55937a) {
                    runnableC3725wk.run();
                } else {
                    ((kc0) pc0Var2.f55941e).mo13517e(new b64(pc0Var2, runnableC3725wk));
                }
                RunnableC3781y2 runnableC3781y2 = new RunnableC3781y2(pc0Var, i5);
                if (pc0Var.f55937a) {
                    runnableC3781y2.run();
                    return;
                } else {
                    ((kc0) pc0Var.f55941e).mo13517e(new b64(pc0Var, runnableC3781y2));
                    return;
                }
            case 6:
                w41 w41Var = (w41) obj;
                if (lp1.f49971a.contains(w41.class)) {
                    return;
                }
                try {
                    w41Var.m23735x();
                    return;
                } catch (Throwable th4) {
                    lp1.m16420a(w41.class, th4);
                    return;
                }
            case 7:
                ui3 ui3Var = (ui3) ((Ref$ObjectRef) obj).f47718a;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                    return;
                }
                return;
            case 8:
                ((i92) obj).m13733h();
                return;
            case 9:
                jw2 jw2Var = (jw2) obj;
                C3488q8 c3488q8 = jw2Var.f46254A;
                Context context = jw2Var.f46287e;
                String str2 = uma.f64080a;
                int iGenerateAudioSessionId = AbstractC3352my.m17083B(context).generateAudioSessionId();
                Integer numValueOf = Integer.valueOf(iGenerateAudioSessionId != -1 ? iGenerateAudioSessionId : 0);
                c3488q8.f57373g = numValueOf;
                RunnableC3470pr runnableC3470pr = new RunnableC3470pr(4, c3488q8, numValueOf);
                qp9 qp9Var = (qp9) c3488q8.f57370d;
                if (qp9Var.f58033a.getLooper().getThread().isAlive()) {
                    qp9Var.m20098c(runnableC3470pr);
                    return;
                }
                return;
            case 10:
                o13 o13Var = (o13) obj;
                o13Var.f53584a.mo12756f(p13.m18852b(o13Var.f53585b));
                return;
            case 11:
                AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = (AbstractComponentCallbacksC0635c) obj;
                abstractComponentCallbacksC0635c.f5710n0.f49627f.m12091F(abstractComponentCallbacksC0635c.f5691d);
                abstractComponentCallbacksC0635c.f5691d = null;
                return;
            case 12:
                bl2 bl2Var = (bl2) obj;
                id4 id4Var = (id4) bl2Var.f8656b;
                try {
                    synchronized (id4.f43966u) {
                        c0918b = id4Var.f43968r;
                        break;
                    }
                    if (c0918b == null) {
                        uo3VarM22843a = uo3.m22843a(id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.MissingDependency);
                    } else {
                        ReferrerDetails installReferrer = c0918b.getInstallReferrer();
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        long installBeginTimestampSeconds = installReferrer.getInstallBeginTimestampSeconds();
                        long referrerClickTimestampSeconds = installReferrer.getReferrerClickTimestampSeconds();
                        try {
                            installReferrer.getClass().getMethod("getGooglePlayInstantParam", null);
                            boolValueOf = Boolean.valueOf(installReferrer.getGooglePlayInstantParam());
                            try {
                                installReferrer.getClass().getMethod("getInstallBeginTimestampServerSeconds", null);
                                lValueOf = Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds());
                                try {
                                    installReferrer.getClass().getMethod("getReferrerClickTimestampServerSeconds", null);
                                    lValueOf2 = Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds());
                                    try {
                                        installReferrer.getClass().getMethod("getInstallVersion", null);
                                        installVersion = installReferrer.getInstallVersion();
                                    } catch (Throwable unused) {
                                        id4.f43965t.m21555D("Old version of the Google Install Referrer library detected, upgrade to version 2.1 or newer for full functionality");
                                    }
                                } catch (Throwable unused2) {
                                    lValueOf2 = null;
                                }
                            } catch (Throwable unused3) {
                                lValueOf = null;
                                lValueOf2 = lValueOf;
                                id4.f43965t.m21555D("Old version of the Google Install Referrer library detected, upgrade to version 2.1 or newer for full functionality");
                                String str3 = installVersion;
                                bool = boolValueOf;
                                l = lValueOf;
                                Long l3 = lValueOf2;
                                if (bool == null) {
                                    uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), null, Long.valueOf(referrerClickTimestampSeconds), null, null, null);
                                } else if (l != null) {
                                    uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), null, Long.valueOf(referrerClickTimestampSeconds), null, bool, null);
                                } else {
                                    uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), null, Long.valueOf(referrerClickTimestampSeconds), null, bool, null);
                                }
                                uo3VarM22843a = uo3Var;
                                ((id4) bl2Var.f8656b).m13794r();
                                ((id4) bl2Var.f8656b).m3640f(ie4.m13808b(uo3VarM22843a), JobState.RunningAsync);
                                return;
                            }
                        } catch (Throwable unused4) {
                            boolValueOf = null;
                            lValueOf = null;
                        }
                        String str4 = installVersion;
                        bool = boolValueOf;
                        l = lValueOf;
                        Long l4 = lValueOf2;
                        if (bool == null) {
                            uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), null, Long.valueOf(referrerClickTimestampSeconds), null, null, null);
                        } else if (l != null || l4 == null || str4 == null) {
                            uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), null, Long.valueOf(referrerClickTimestampSeconds), null, bool, null);
                        } else {
                            uo3Var = new uo3(System.currentTimeMillis(), id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.Ok, installReferrer2, Long.valueOf(installBeginTimestampSeconds), l, Long.valueOf(referrerClickTimestampSeconds), l4, bool, str4);
                        }
                        uo3VarM22843a = uo3Var;
                    }
                    break;
                } catch (Throwable th5) {
                    id4.f43965t.m21555D("Unable to parse referrer. ".concat(r46.m20395v(th5)));
                    uo3VarM22843a = uo3.m22843a(id4Var.f43967q, ci8.m4710W(id4Var.f8377j), GoogleReferrerStatus.NoData);
                }
                ((id4) bl2Var.f8656b).m13794r();
                ((id4) bl2Var.f8656b).m3640f(ie4.m13808b(uo3VarM22843a), JobState.RunningAsync);
                return;
            case 13:
                MaterialButton.m6051a((MaterialButton) obj);
                return;
            case 14:
                ((C1808b) obj).m8451P();
                return;
            case 15:
                cl7 cl7Var = (cl7) obj;
                wb5 wb5Var = cl7Var.f10237f;
                if (cl7Var.f10233b == 0) {
                    cl7Var.f10234c = true;
                    wb5Var.m23833G(Lifecycle$Event.ON_PAUSE);
                }
                if (cl7Var.f10232a == 0 && cl7Var.f10234c) {
                    wb5Var.m23833G(Lifecycle$Event.ON_STOP);
                    cl7Var.f10235d = true;
                    return;
                }
                return;
            case 16:
                eh8.setRippleState$lambda$1((eh8) obj);
                return;
            case 17:
                ((Toolbar) obj).m692m();
                return;
            case 18:
                t33 t33Var = (t33) obj;
                synchronized (((AtomicMarkableReference) t33Var.f61792g)) {
                    try {
                        if (((AtomicMarkableReference) t33Var.f61792g).isMarked()) {
                            str = (String) ((AtomicMarkableReference) t33Var.f61792g).getReference();
                            ((AtomicMarkableReference) t33Var.f61792g).set(str, false);
                            objArr2 = 1;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                    break;
                }
                if (objArr2 != 0) {
                    ((zx5) t33Var.f61787b).m25845j(t33Var.f61786a, str);
                    return;
                }
                return;
            case 19:
                C3552rx c3552rx2 = (C3552rx) obj;
                ((AtomicReference) c3552rx2.f59988c).set(null);
                synchronized (c3552rx2) {
                    if (((AtomicMarkableReference) c3552rx2.f59987b).isMarked()) {
                        sj4 sj4Var = (sj4) ((AtomicMarkableReference) c3552rx2.f59987b).getReference();
                        synchronized (sj4Var) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(sj4Var.f60926a));
                        }
                        AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c3552rx2.f59987b;
                        atomicMarkableReference.set((sj4) atomicMarkableReference.getReference(), false);
                        map = mapUnmodifiableMap;
                    }
                }
                if (map != null) {
                    t33 t33Var2 = (t33) c3552rx2.f59989d;
                    ((zx5) t33Var2.f61787b).m25843h(t33Var2.f61786a, map, c3552rx2.f59986a);
                    return;
                }
                return;
            case 20:
                C0888c c0888c = (C0888c) obj;
                c0888c.f10856f = true;
                cs4 cs4Var = AbstractC2898a.f34565a;
                ((ii8) cs4Var.getValue()).f44147a.add(c0888c.f10858h);
                Iterator it = u91.m22622n1(((ii8) cs4Var.getValue()).f44148b).iterator();
                while (it.hasNext()) {
                    c0888c.m5074a((View) it.next());
                }
                return;
            default:
                ny8 ny8Var = (ny8) obj;
                ((hk8) ny8Var.f53417e).m13317p(new dw6(ny8Var, 25));
                return;
        }
    }
}
