package androidx.wear.ambient;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CaptureRequest;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.wearable.compat.WearableActivityController;
import com.google.googlex.gcam.DirtyLensHistory;
import com.google.googlex.gcam.FloatDeque;
import com.google.googlex.gcam.GcamModuleJNI;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p000.C0012al;
import p000.C0194fs;
import p000.C0271io;
import p000.C0985si;
import p000.C0986sj;
import p000.C1045uo;
import p000.C1075vr;
import p000.C1146yh;
import p000.abx;
import p000.akq;
import p000.aks;
import p000.akv;
import p000.alq;
import p000.awu;
import p000.bko;
import p000.bzq;
import p000.cfw;
import p000.cga;
import p000.dhf;
import p000.dhv;
import p000.dhx;
import p000.dox;
import p000.ebv;
import p000.ent;
import p000.gmb;
import p000.hgv;
import p000.igy;
import p000.jpm;
import p000.jwf;
import p000.jwn;
import p000.jxa;
import p000.kap;
import p000.kba;
import p000.kfy;
import p000.kgq;
import p000.kgw;
import p000.khf;
import p000.kir;
import p000.kis;
import p000.kmg;
import p000.knt;
import p000.knv;
import p000.knw;
import p000.knx;
import p000.kqj;
import p000.lku;
import p000.lpv;
import p000.msg;
import p000.mxk;
import p000.nod;
import p000.not;
import p000.nps;
import p000.ofb;
import p000.oju;
import p000.oki;
import p000.ols;
import p000.oma;
import p000.ooc;
import p000.ook;
import p000.oqs;
import p000.ouh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class AmbientDelegate {

    /* JADX INFO: renamed from: d */
    static Integer f1684d;

    /* JADX INFO: renamed from: a */
    public Object f1685a;

    /* JADX INFO: renamed from: b */
    public final Object f1686b;

    /* JADX INFO: renamed from: c */
    public final Object f1687c;

    /* JADX INFO: compiled from: PG */
    interface AmbientCallback {
        void onAmbientOffloadInvalidated();

        void onEnterAmbient(Bundle bundle);

        void onExitAmbient();

        void onUpdateAmbient();
    }

    public AmbientDelegate() {
        this.f1687c = new msg(null, null);
        this.f1686b = new msg(null, null);
        this.f1685a = new C1146yh[32];
    }

    public AmbientDelegate(akv akvVar) {
        this.f1686b = new aks(akvVar);
        this.f1687c = new Handler();
    }

    private AmbientDelegate(Context context, TypedArray typedArray) {
        this.f1687c = context;
        this.f1686b = typedArray;
    }

    public AmbientDelegate(bko bkoVar, dhv dhvVar, byte[] bArr) {
        this.f1686b = bkoVar;
        this.f1687c = dhvVar;
    }

    public AmbientDelegate(dox doxVar, oju ojuVar) {
        this.f1685a = null;
        this.f1686b = doxVar;
        this.f1687c = ojuVar;
    }

    public AmbientDelegate(Runnable runnable, Executor executor, AmbientDelegate ambientDelegate, byte[] bArr) {
        this.f1686b = runnable;
        this.f1687c = executor;
        this.f1685a = ambientDelegate;
    }

    public AmbientDelegate(jwf jwfVar) {
        this.f1686b = new Object();
        this.f1687c = jwfVar;
    }

    public AmbientDelegate(jwn jwnVar, ebv ebvVar) {
        this.f1686b = jwnVar;
        this.f1687c = ebvVar;
    }

    public AmbientDelegate(kqj kqjVar, byte[] bArr, byte[] bArr2) {
        this.f1687c = kqjVar;
        this.f1686b = new HashMap();
    }

    public AmbientDelegate(C0986sj c0986sj, oqs oqsVar, ouh ouhVar) {
        oqsVar.getClass();
        this.f1686b = c0986sj;
        this.f1687c = new C1075vr(oqsVar, new awu(ouhVar, this, 1, null));
        ooc.m18746l(oqsVar, null, new C1045uo(this, null, null), 3);
    }

    public AmbientDelegate(boolean z, lpv lpvVar) {
        this(Boolean.valueOf(z), lpvVar);
    }

    public AmbientDelegate(byte[] bArr) {
        this.f1687c = new ent();
        this.f1686b = new ent();
        this.f1685a = new C0012al[32];
    }

    /* JADX INFO: renamed from: B */
    public static AmbientDelegate m1566B(Context context, int i, int[] iArr) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(i, iArr));
    }

    /* JADX INFO: renamed from: C */
    public static AmbientDelegate m1567C(Context context, AttributeSet attributeSet, int[] iArr) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    /* JADX INFO: renamed from: D */
    public static AmbientDelegate m1568D(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new AmbientDelegate(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    /* JADX INFO: renamed from: J */
    public static final Set m1569J(kis kisVar) {
        return mxk.m17141M(kgq.m14215e(CaptureRequest.CONTROL_MODE, kisVar.mo14094d()), kgq.m14215e(CaptureRequest.CONTROL_AF_MODE, kisVar.mo14092b()), kgq.m14215e(CaptureRequest.CONTROL_AE_MODE, kisVar.mo14091a()), kgq.m14215e(CaptureRequest.CONTROL_AWB_MODE, kisVar.mo14093c()), kgq.m14215e(CaptureRequest.FLASH_MODE, kisVar.mo14095e()), kgq.m14215e(CaptureRequest.CONTROL_AE_LOCK, kisVar.f36207b), kgq.m14215e(CaptureRequest.CONTROL_AWB_LOCK, kisVar.f36208c), kgq.m14215e(CaptureRequest.CONTROL_AF_REGIONS, kisVar.f36209d), kgq.m14215e(CaptureRequest.CONTROL_AE_REGIONS, kisVar.f36210e), kgq.m14215e(CaptureRequest.CONTROL_AWB_REGIONS, kisVar.f36211f));
    }

    /* JADX INFO: renamed from: K */
    public static final void m1570K(kgw kgwVar, kis kisVar) {
        kgwVar.mo14113e(m1569J(kisVar));
    }

    /* JADX INFO: renamed from: V */
    public static final boolean m1571V(int i, int i2) {
        return m1574af(i) && m1574af(i2);
    }

    /* JADX INFO: renamed from: ad */
    public static AmbientDelegate m1572ad(knx knxVar) {
        return new AmbientDelegate(knxVar);
    }

    /* JADX INFO: renamed from: ae */
    private final int m1573ae(int i, int i2, int i3) {
        int i4 = i2 - i3;
        if (i4 > 0) {
            return i4;
        }
        int i5 = i - i3;
        if (i5 > 0) {
            return i5;
        }
        if (((View) this.f1687c).isLayoutRequested() || i2 != -2) {
            return 0;
        }
        Context context = ((View) this.f1687c).getContext();
        if (f1684d == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            bzq.m3278r(windowManager);
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            f1684d = Integer.valueOf(Math.max(point.x, point.y));
        }
        return f1684d.intValue();
    }

    /* JADX INFO: renamed from: af */
    private static final boolean m1574af(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m1575A(int i) {
        return ((TypedArray) this.f1686b).hasValue(i);
    }

    /* JADX INFO: renamed from: E */
    public final kba m1576E() {
        ((ReentrantLock) this.f1686b).lock();
        return new kap((ReentrantLock) this.f1686b, 5);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kex] */
    /* JADX INFO: renamed from: F */
    public final kir m1577F() throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM1576E = m1576E();
        try {
            kir kirVarM14363b = kir.m14363b(this.f1685a);
            Object obj = this.f1685a;
            kirVarM14363b.f36200f = ((kis) obj).f36206a;
            kirVarM14363b.f36201g = ((kis) obj).f36207b;
            kirVarM14363b.f36202h = ((kis) obj).f36208c;
            kbaVarM1576E.close();
            return kirVarM14363b;
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final kis m1578G() throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM1576E = m1576E();
        try {
            Object obj = this.f1685a;
            kbaVarM1576E.close();
            return (kis) obj;
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m1579H(kis kisVar, boolean z) throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM1576E = m1576E();
        try {
            this.f1685a = kisVar;
            if (z) {
                ((khf) this.f1687c).m14261c(kisVar);
            }
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1580I(boolean z, boolean z2, boolean z3, boolean z4) throws IllegalAccessException, InvocationTargetException {
        kba kbaVarM1576E = m1576E();
        try {
            kir kirVarM14364c = kir.m14364c((kis) this.f1685a);
            Boolean boolValueOf = Boolean.valueOf(z);
            kirVarM14364c.f36200f = boolValueOf;
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            kirVarM14364c.f36201g = boolValueOf2;
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            kirVarM14364c.f36202h = boolValueOf3;
            this.f1685a = kirVarM14364c.m14365d();
            if (z4) {
                Object obj = this.f1687c;
                kir kirVarM14259a = ((khf) obj).m14259a();
                kirVarM14259a.f36200f = boolValueOf;
                kirVarM14259a.f36201g = boolValueOf2;
                kirVarM14259a.f36202h = boolValueOf3;
                ((khf) obj).m14261c(kirVarM14259a.m14365d());
            }
            kbaVarM1576E.close();
        } catch (Throwable th) {
            try {
                kbaVarM1576E.close();
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: L */
    public final synchronized mxk m1581L() {
        return mxk.m17134F(this.f1686b.values());
    }

    /* JADX INFO: renamed from: M */
    public final synchronized void m1582M(Runnable runnable) {
        lku.m15614I(this.f1685a == null, "Listener is already set, override not supported.");
        this.f1685a = runnable;
    }

    /* JADX INFO: renamed from: N */
    public final void m1583N(kfy kfyVar) {
        if (((kqj) this.f1687c).m14700b(kfyVar.f35858a)) {
            return;
        }
        m1584O(mxk.m17136H(kfyVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: O */
    public final void m1584O(Set set) {
        ?? r0;
        synchronized (this) {
            Iterator it = set.iterator();
            r0 = 0;
            while (it.hasNext()) {
                kfy kfyVar = (kfy) it.next();
                if (!((kqj) this.f1687c).m14700b(kfyVar.f35858a)) {
                    if (!this.f1686b.containsKey(kfyVar.f35858a) || !kfyVar.equals(this.f1686b.get(kfyVar.f35858a))) {
                        r0 = this.f1685a;
                        this.f1686b.put(kfyVar.f35858a, kfyVar);
                    }
                }
            }
        }
        if (r0 != 0) {
            r0.run();
        }
    }

    /* JADX INFO: renamed from: P */
    public final Object m1585P() {
        Object obj = this.f1687c;
        obj.getClass();
        if (((AtomicBoolean) this.f1685a).getAndSet(Boolean.TRUE.booleanValue())) {
            return ((lpv) obj).m15845e();
        }
        try {
            Trace.beginSection("Phenotype:" + ((lpv) obj).m15846f());
            return ((lpv) obj).m15845e();
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, jww] */
    /* JADX INFO: renamed from: Q */
    public final String m1586Q() {
        return (String) this.f1687c.mo3831be();
    }

    /* JADX INFO: renamed from: R */
    public final void m1587R(kmg kmgVar) {
        synchronized (this.f1686b) {
            Object obj = this.f1685a;
            if (obj != null) {
                ((kmg) obj).equals(kmgVar);
            }
            this.f1685a = kmgVar;
        }
    }

    /* JADX INFO: renamed from: S */
    public final int m1588S() {
        int paddingTop = ((View) this.f1687c).getPaddingTop() + ((View) this.f1687c).getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = ((View) this.f1687c).getLayoutParams();
        return m1573ae(((View) this.f1687c).getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
    }

    /* JADX INFO: renamed from: T */
    public final int m1589T() {
        int paddingLeft = ((View) this.f1687c).getPaddingLeft() + ((View) this.f1687c).getPaddingRight();
        ViewGroup.LayoutParams layoutParams = ((View) this.f1687c).getLayoutParams();
        return m1573ae(((View) this.f1687c).getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX INFO: renamed from: U */
    public final void m1590U() {
        ViewTreeObserver viewTreeObserver = ((View) this.f1687c).getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.f1685a);
        }
        this.f1685a = null;
        this.f1686b.clear();
    }

    /* JADX INFO: renamed from: W */
    public final long m1591W() {
        return ((knv) this.f1687c).f36654b;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, jwn] */
    /* JADX INFO: renamed from: X */
    public final synchronized jwn m1592X() {
        if (this.f1685a == null) {
            jwf jwfVar = new jwf(0L);
            gmb gmbVar = new gmb(this, jwfVar, 17, (byte[]) null, (byte[]) null);
            ((knx) this.f1687c).m14610f().mo3830a(gmbVar, not.INSTANCE);
            ((jwf) this.f1686b).mo3830a(gmbVar, not.INSTANCE);
            this.f1685a = jwfVar;
        }
        return this.f1685a;
    }

    /* JADX INFO: renamed from: Y */
    public final synchronized kba m1593Y() {
        return new igy(((jxa) this.f1686b).m13647d(), ((knx) this.f1687c).f36662f.m13647d(), 9);
    }

    /* JADX INFO: renamed from: Z */
    public final knw m1594Z(long j) {
        knt kntVarM14604a = ((knv) this.f1687c).m14604a(j);
        if (kntVarM14604a != null) {
            return new knw(this, kntVarM14604a, null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    final void m1595a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: renamed from: aa */
    public final knw m1596aa(long j) {
        knt kntVarM14605b = ((knv) this.f1687c).m14605b(j);
        if (kntVarM14605b != null) {
            return new knw(this, kntVarM14605b, null, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ab */
    public final nps m1597ab(long j) {
        byte[] bArr = null;
        return nod.m17553i(((knv) this.f1687c).m14606c(j), new hgv(this, 13, bArr, bArr), not.INSTANCE);
    }

    /* JADX INFO: renamed from: ac */
    public final void m1598ac(long j) {
        if (j != 0) {
            Object obj = this.f1686b;
            byte[] bArr = null;
            jwf jwfVar = (jwf) obj;
            jwfVar.f34941c.execute(new jpm(jwfVar, new ofb(j, bArr), 7, bArr));
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.wear.ambient.AmbientDelegate$AmbientCallback, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    final void m1599b() {
        Activity activity = (Activity) ((WeakReference) this.f1687c).get();
        if (activity != null) {
            ?? r1 = this.f1686b;
            SharedLibraryVersion.verifySharedLibraryPresent();
            WearableControllerProvider.C00411 c00411 = new WearableControllerProvider.C00411(r1);
            if (!WearableControllerProvider.f1705a) {
                try {
                    if (!".onEnterAmbient".equals("." + WearableActivityController.AmbientCallback.class.getDeclaredMethod("onEnterAmbient", Bundle.class).getName())) {
                        throw new NoSuchMethodException();
                    }
                    WearableControllerProvider.f1705a = true;
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException("Could not find a required method for ambient support, likely due to proguard optimization. Please add com.google.android.wearable:wearable jar to the list of library jars for your project");
                }
            }
            this.f1685a = new WearableActivityController("WearableControllerProvider", activity, c00411);
        }
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).onCreate();
        }
    }

    /* JADX INFO: renamed from: c */
    final void m1600c() {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).onDestroy();
        }
    }

    /* JADX INFO: renamed from: d */
    final void m1601d() {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).onPause();
        }
    }

    /* JADX INFO: renamed from: e */
    final void m1602e() {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).onResume();
        }
    }

    /* JADX INFO: renamed from: f */
    final void m1603f() {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).onStop();
        }
    }

    /* JADX INFO: renamed from: g */
    final void m1604g() {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).setAmbientEnabled();
        }
    }

    /* JADX INFO: renamed from: h */
    final boolean m1605h() {
        Object obj = this.f1685a;
        if (obj != null) {
            return ((WearableActivityController) obj).isAmbient();
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final Object m1606i(ols olsVar) {
        Object objM18775M = ook.m18775M(((C0986sj) this.f1686b).f47586b, new C0985si(null), olsVar);
        oma omaVar = oma.COROUTINE_SUSPENDED;
        if (objM18775M != omaVar) {
            objM18775M = oki.f46196a;
        }
        return objM18775M == omaVar ? objM18775M : oki.f46196a;
    }

    /* JADX INFO: renamed from: j */
    public final String m1607j() {
        return ((C0986sj) this.f1686b).f47585a;
    }

    /* JADX INFO: renamed from: k */
    public final void m1608k() {
        ((C1075vr) this.f1687c).m19509b();
        ((C0986sj) this.f1686b).m19397a();
    }

    /* JADX WARN: Type inference failed for: r9v5, types: [dhv, java.lang.Object] */
    /* JADX INFO: renamed from: l */
    public final void m1609l(cfw cfwVar) {
        this.f1685a = cfwVar;
        Object obj = this.f1686b;
        cga cgaVar = (cga) cfwVar.mo3831be();
        if (!(cgaVar instanceof cga)) {
            cga cgaVar2 = new cga();
            for (int i = 0; i < cgaVar.m3616b(); i++) {
                cgaVar2.m3617c(cgaVar.m3615a(i));
            }
            cgaVar = cgaVar2;
        }
        Object obj2 = ((bko) obj).f3652a;
        FloatDeque floatDeque = cgaVar.f5555a;
        DirtyLensHistory dirtyLensHistory = (DirtyLensHistory) obj2;
        GcamModuleJNI.DirtyLensHistory_raw_score_history__set(dirtyLensHistory.f8241a, dirtyLensHistory, floatDeque == null ? 0L : floatDeque.f8259a, floatDeque);
        ?? r9 = this.f1687c;
        dhx dhxVar = dhf.f11040a;
        r9.mo6178f();
    }

    /* JADX INFO: renamed from: m */
    public final void m1610m(akq akqVar) {
        Object obj = this.f1685a;
        if (obj != null) {
            ((alq) obj).run();
        }
        alq alqVar = new alq((aks) this.f1686b, akqVar);
        this.f1685a = alqVar;
        ((Handler) this.f1687c).postAtFrontOfQueue(alqVar);
    }

    /* JADX INFO: renamed from: n */
    public final int m1611n(int i, int i2) {
        return ((TypedArray) this.f1686b).getDimensionPixelOffset(i, i2);
    }

    /* JADX INFO: renamed from: o */
    public final int m1612o(int i, int i2) {
        return ((TypedArray) this.f1686b).getDimensionPixelSize(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public final int m1613p(int i, int i2) {
        return ((TypedArray) this.f1686b).getInt(i, i2);
    }

    /* JADX INFO: renamed from: q */
    public final int m1614q(int i, int i2) {
        return ((TypedArray) this.f1686b).getInteger(i, i2);
    }

    /* JADX INFO: renamed from: r */
    public final int m1615r(int i, int i2) {
        return ((TypedArray) this.f1686b).getLayoutDimension(i, i2);
    }

    /* JADX INFO: renamed from: s */
    public final int m1616s(int i, int i2) {
        return ((TypedArray) this.f1686b).getResourceId(i, i2);
    }

    public final void setAmbientOffloadEnabled(boolean z) {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).setAmbientOffloadEnabled(z);
        }
    }

    public final void setAutoResumeEnabled(boolean z) {
        Object obj = this.f1685a;
        if (obj != null) {
            ((WearableActivityController) obj).setAutoResumeEnabled(z);
        }
    }

    /* JADX INFO: renamed from: t */
    public final ColorStateList m1617t(int i) {
        int resourceId;
        ColorStateList colorStateListM171c;
        return (!((TypedArray) this.f1686b).hasValue(i) || (resourceId = ((TypedArray) this.f1686b).getResourceId(i, 0)) == 0 || (colorStateListM171c = abx.m171c((Context) this.f1687c, resourceId)) == null) ? ((TypedArray) this.f1686b).getColorStateList(i) : colorStateListM171c;
    }

    /* JADX INFO: renamed from: u */
    public final Drawable m1618u(int i) {
        int resourceId;
        return (!((TypedArray) this.f1686b).hasValue(i) || (resourceId = ((TypedArray) this.f1686b).getResourceId(i, 0)) == 0) ? ((TypedArray) this.f1686b).getDrawable(i) : C0194fs.m8752a((Context) this.f1687c, resourceId);
    }

    /* JADX INFO: renamed from: v */
    public final Drawable m1619v(int i) {
        int resourceId;
        if (!((TypedArray) this.f1686b).hasValue(i) || (resourceId = ((TypedArray) this.f1686b).getResourceId(i, 0)) == 0) {
            return null;
        }
        return C0271io.m11552d().m11557g((Context) this.f1687c, resourceId);
    }

    /* JADX INFO: renamed from: w */
    public final CharSequence m1620w(int i) {
        return ((TypedArray) this.f1686b).getText(i);
    }

    /* JADX INFO: renamed from: x */
    public final String m1621x(int i) {
        return ((TypedArray) this.f1686b).getString(i);
    }

    /* JADX INFO: renamed from: y */
    public final void m1622y() {
        ((TypedArray) this.f1686b).recycle();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m1623z(int i, boolean z) {
        return ((TypedArray) this.f1686b).getBoolean(i, z);
    }

    public AmbientDelegate(Object obj, lpv lpvVar) {
        this.f1685a = new AtomicBoolean(false);
        this.f1686b = obj;
        this.f1687c = lpvVar;
    }

    public AmbientDelegate(khf khfVar) {
        this.f1686b = new ReentrantLock();
        this.f1685a = khfVar.m14259a().m14365d();
        this.f1687c = khfVar;
    }

    public AmbientDelegate(Activity activity, AmbientCallback ambientCallback) {
        this.f1687c = new WeakReference(activity);
        this.f1686b = ambientCallback;
    }

    public AmbientDelegate(View view) {
        this.f1686b = new ArrayList();
        this.f1687c = view;
    }

    private AmbientDelegate(knx knxVar) {
        this.f1687c = knxVar;
        this.f1686b = new jxa(0L, knxVar.f36663g);
    }
}
