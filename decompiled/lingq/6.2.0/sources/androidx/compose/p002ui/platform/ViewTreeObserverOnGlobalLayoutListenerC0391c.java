package androidx.compose.p002ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.os.StrictMode;
import android.os.SystemClock;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseLongArray;
import android.view.FocusFinder;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.R$id;
import androidx.compose.p002ui.contentcapture.ViewOnAttachStateChangeListenerC0291c;
import androidx.compose.p002ui.draganddrop.ViewOnDragListenerC0293a;
import androidx.compose.p002ui.focus.AbstractC0303e;
import androidx.compose.p002ui.focus.AbstractC0304f;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.focus.FocusOwner$dispatchKeyEvent$1;
import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.input.pointer.C0327a;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.layout.C0344k;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.p002ui.node.C0361k;
import androidx.compose.p002ui.node.C0364n;
import androidx.compose.p002ui.node.Invalidation;
import androidx.compose.p002ui.node.LayoutNode$UsageByParent;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.scrollcapture.C0420d;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0422b;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.C0423c;
import androidx.compose.p002ui.spatial.C0429a;
import androidx.compose.p002ui.text.input.C0439e;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.p002ui.viewinterop.AbstractC0442b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.AbstractC3193b;
import kotlin.NotImplementedError;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.AbstractC3045go;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3572sf;
import p000.AbstractC3695vr;
import p000.C0825bv;
import p000.C2928dh;
import p000.C3024g3;
import p000.C3075hh;
import p000.C3147jh;
import p000.C3148ji;
import p000.C3299li;
import p000.C3309ls;
import p000.C3386nv;
import p000.C3408og;
import p000.C3459pg;
import p000.C3464pl;
import p000.C3724wj;
import p000.C3758xg;
import p000.C3832zg;
import p000.C3839zn;
import p000.InterfaceC3483q3;
import p000.RunnableC3637u6;
import p000.RunnableC3647ug;
import p000.RunnableC3684vg;
import p000.RunnableC3795yg;
import p000.a36;
import p000.a44;
import p000.a5b;
import p000.a60;
import p000.aua;
import p000.b17;
import p000.b28;
import p000.b36;
import p000.b5b;
import p000.bk1;
import p000.bn0;
import p000.bna;
import p000.bq1;
import p000.c36;
import p000.c64;
import p000.c72;
import p000.cc4;
import p000.cgc;
import p000.cu3;
import p000.cua;
import p000.cx9;
import p000.d16;
import p000.d32;
import p000.dr3;
import p000.dt5;
import p000.dta;
import p000.dua;
import p000.e28;
import p000.e64;
import p000.e84;
import p000.ed9;
import p000.et5;
import p000.f66;
import p000.fa2;
import p000.fa4;
import p000.fb2;
import p000.fi8;
import p000.fs6;
import p000.ft5;
import p000.fw9;
import p000.g16;
import p000.gc2;
import p000.gi8;
import p000.gm5;
import p000.gw9;
import p000.h44;
import p000.h66;
import p000.ho2;
import p000.hta;
import p000.i44;
import p000.i54;
import p000.ig7;
import p000.ii7;
import p000.ip5;
import p000.ip6;
import p000.ir9;
import p000.jc9;
import p000.jg7;
import p000.k40;
import p000.k9a;
import p000.kn1;
import p000.kv8;
import p000.kz8;
import p000.l9b;
import p000.ld9;
import p000.lda;
import p000.m87;
import p000.m98;
import p000.mg7;
import p000.n66;
import p000.nc9;
import p000.nw4;
import p000.ny8;
import p000.o66;
import p000.o93;
import p000.or1;
import p000.or3;
import p000.p64;
import p000.p84;
import p000.pa2;
import p000.pa3;
import p000.pc0;
import p000.pm8;
import p000.pq2;
import p000.pvc;
import p000.q00;
import p000.q70;
import p000.q98;
import p000.qfa;
import p000.qg7;
import p000.qp3;
import p000.qq4;
import p000.r2d;
import p000.rr2;
import p000.s2d;
import p000.s46;
import p000.s93;
import p000.sad;
import p000.sd3;
import p000.sl0;
import p000.sta;
import p000.sv8;
import p000.t31;
import p000.t56;
import p000.t66;
import p000.t93;
import p000.te1;
import p000.ti5;
import p000.tk5;
import p000.tm0;
import p000.ts5;
import p000.u31;
import p000.u56;
import p000.ub5;
import p000.ui3;
import p000.uk9;
import p000.un1;
import p000.vi3;
import p000.vv9;
import p000.vz1;
import p000.w04;
import p000.w50;
import p000.wa3;
import p000.x66;
import p000.x93;
import p000.xb5;
import p000.xc9;
import p000.xfa;
import p000.xi5;
import p000.xk5;
import p000.xwc;
import p000.xx9;
import p000.y38;
import p000.yb5;
import p000.ybd;
import p000.yi5;
import p000.yz9;
import p000.z21;
import p000.z34;
import p000.z50;
import p000.zb2;
import p000.zb5;
import p000.zi3;
import p000.zi5;
import p000.zz6;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0391c extends ViewGroup implements Owner, gi8, c72, zz6, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnTouchModeChangeListener, t93 {

    /* JADX INFO: renamed from: b1 */
    public static Class f4635b1;

    /* JADX INFO: renamed from: c1 */
    public static Method f4636c1;

    /* JADX INFO: renamed from: d1 */
    public static Method f4637d1;

    /* JADX INFO: renamed from: e1 */
    public static final h66 f4638e1 = new h66();

    /* JADX INFO: renamed from: f1 */
    public static RunnableC3637u6 f4639f1;

    /* JADX INFO: renamed from: g1 */
    public static Method f4640g1;

    /* JADX INFO: renamed from: A0 */
    public pa2 f4641A0;

    /* JADX INFO: renamed from: B0 */
    public final t66 f4642B0;

    /* JADX INFO: renamed from: C0 */
    public final t66 f4643C0;

    /* JADX INFO: renamed from: D0 */
    public e64 f4644D0;

    /* JADX INFO: renamed from: E0 */
    public final g16 f4645E0;

    /* JADX INFO: renamed from: F0 */
    public final C0396h f4646F0;

    /* JADX INFO: renamed from: G0 */
    public MotionEvent f4647G0;

    /* JADX INFO: renamed from: H */
    public kn1 f4648H;

    /* JADX INFO: renamed from: H0 */
    public long f4649H0;

    /* JADX INFO: renamed from: I */
    public final ViewOnDragListenerC0293a f4650I;

    /* JADX INFO: renamed from: I0 */
    public final qfa f4651I0;

    /* JADX INFO: renamed from: J */
    public final t66 f4652J;

    /* JADX INFO: renamed from: J0 */
    public final h66 f4653J0;

    /* JADX INFO: renamed from: K */
    public final gc2 f4654K;

    /* JADX INFO: renamed from: K0 */
    public float f4655K0;

    /* JADX INFO: renamed from: L */
    public final p64 f4656L;

    /* JADX INFO: renamed from: L0 */
    public float f4657L0;

    /* JADX INFO: renamed from: M */
    public final C0357g f4658M;

    /* JADX INFO: renamed from: M0 */
    public float f4659M0;

    /* JADX INFO: renamed from: N */
    public final t56 f4660N;

    /* JADX INFO: renamed from: N0 */
    public float f4661N0;

    /* JADX INFO: renamed from: O */
    public final C0429a f4662O;

    /* JADX INFO: renamed from: O0 */
    public final RunnableC3795yg f4663O0;

    /* JADX INFO: renamed from: P */
    public final sv8 f4664P;

    /* JADX INFO: renamed from: P0 */
    public final RunnableC3647ug f4665P0;

    /* JADX INFO: renamed from: Q */
    public final ViewOnAttachStateChangeListenerC0393e f4666Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f4667Q0;

    /* JADX INFO: renamed from: R */
    public ViewOnAttachStateChangeListenerC0291c f4668R;

    /* JADX INFO: renamed from: R0 */
    public final i44 f4669R0;

    /* JADX INFO: renamed from: S */
    public final C3148ji f4670S;

    /* JADX INFO: renamed from: S0 */
    public final ui3 f4671S0;

    /* JADX INFO: renamed from: T */
    public final a60 f4672T;

    /* JADX INFO: renamed from: T0 */
    public final ui3 f4673T0;

    /* JADX INFO: renamed from: U */
    public final h66 f4674U;

    /* JADX INFO: renamed from: U0 */
    public final sl0 f4675U0;

    /* JADX INFO: renamed from: V */
    public h66 f4676V;

    /* JADX INFO: renamed from: V0 */
    public boolean f4677V0;

    /* JADX INFO: renamed from: W */
    public boolean f4678W;

    /* JADX INFO: renamed from: W0 */
    public boolean f4679W0;

    /* JADX INFO: renamed from: X0 */
    public boolean f4680X0;

    /* JADX INFO: renamed from: Y0 */
    public final C0420d f4681Y0;

    /* JADX INFO: renamed from: Z0 */
    public View f4682Z0;

    /* JADX INFO: renamed from: a */
    public final t66 f4683a;

    /* JADX INFO: renamed from: a0 */
    public boolean f4684a0;

    /* JADX INFO: renamed from: a1 */
    public final C3758xg f4685a1;

    /* JADX INFO: renamed from: b */
    public long f4686b;

    /* JADX INFO: renamed from: b0 */
    public final b36 f4687b0;

    /* JADX INFO: renamed from: c */
    public final boolean f4688c;

    /* JADX INFO: renamed from: c0 */
    public final pc0 f4689c0;

    /* JADX INFO: renamed from: d */
    public z34 f4690d;

    /* JADX INFO: renamed from: d0 */
    public final t66 f4691d0;

    /* JADX INFO: renamed from: e */
    public xb5 f4692e;

    /* JADX INFO: renamed from: e0 */
    public final gc2 f4693e0;

    /* JADX INFO: renamed from: f */
    public yb5 f4694f;

    /* JADX INFO: renamed from: f0 */
    public final C3309ls f4695f0;

    /* JADX INFO: renamed from: g */
    public m98 f4696g;

    /* JADX INFO: renamed from: g0 */
    public final C3408og f4697g0;

    /* JADX INFO: renamed from: h */
    public final C0825bv f4698h;

    /* JADX INFO: renamed from: h0 */
    public boolean f4699h0;

    /* JADX INFO: renamed from: i */
    public final RunnableC3647ug f4700i;

    /* JADX INFO: renamed from: i0 */
    public final C0364n f4701i0;

    /* JADX INFO: renamed from: j */
    public final t66 f4702j;

    /* JADX INFO: renamed from: j0 */
    public boolean f4703j0;

    /* JADX INFO: renamed from: k */
    public final View f4704k;

    /* JADX INFO: renamed from: k0 */
    public C3464pl f4705k0;

    /* JADX INFO: renamed from: l */
    public final C0301c f4706l;

    /* JADX INFO: renamed from: l0 */
    public bk1 f4707l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f4708m0;

    /* JADX INFO: renamed from: n0 */
    public final ft5 f4709n0;

    /* JADX INFO: renamed from: o0 */
    public long f4710o0;

    /* JADX INFO: renamed from: p0 */
    public final int[] f4711p0;

    /* JADX INFO: renamed from: q0 */
    public final float[] f4712q0;

    /* JADX INFO: renamed from: r0 */
    public final float[] f4713r0;

    /* JADX INFO: renamed from: s0 */
    public final float[] f4714s0;

    /* JADX INFO: renamed from: t0 */
    public long f4715t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f4716u0;

    /* JADX INFO: renamed from: v0 */
    public long f4717v0;

    /* JADX INFO: renamed from: w0 */
    public vi3 f4718w0;

    /* JADX INFO: renamed from: x0 */
    public C0439e f4719x0;

    /* JADX INFO: renamed from: y0 */
    public fw9 f4720y0;

    /* JADX INFO: renamed from: z0 */
    public final AtomicReference f4721z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ViewTreeObserverOnGlobalLayoutListenerC0391c(Context context, C0401m c0401m) {
        LayoutDirection layoutDirection;
        super(context);
        this.f4683a = AbstractC0278f.m1260j(c0401m);
        this.f4686b = 9205357640488583168L;
        int i = 1;
        this.f4688c = true;
        this.f4696g = s46.f60288c;
        this.f4698h = new C0825bv();
        Object[] objArr = 0;
        this.f4700i = new RunnableC3647ug(this, 0);
        this.f4702j = AbstractC0278f.m1259i(AbstractC3489q9.m19772b(context), s46.f60290e);
        this.f4706l = new C0301c(this, this);
        this.f4648H = c0401m.f4787b.mo1231j();
        this.f4650I = new ViewOnDragListenerC0293a();
        this.f4652J = AbstractC0278f.m1260j(Boolean.FALSE);
        this.f4654K = AbstractC0278f.m1254d(new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$derivedIsAttached$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                Boolean bool = (Boolean) ((xc9) this.f4472b.f4652J).getValue();
                bool.getClass();
                return bool;
            }
        });
        this.f4656L = new p64();
        C0357g c0357g = new C0357g(3);
        c0357g.m1594i0(C0344k.f4217b);
        c0357g.m1589f0(getDensity());
        c0357g.m1597k0(getViewConfiguration());
        c0357g.m1596j0(new C3832zg(this).mo3161g(((C0301c) getFocusOwner()).f3910e).mo3161g(m25910getDragAndDropManager().f3853c));
        this.f4658M = c0357g;
        t56 t56Var = e84.f36837a;
        this.f4660N = new t56();
        this.f4662O = new C0429a(getLayoutNodes(), this);
        this.f4664P = new sv8(getRoot(), new rr2(), getLayoutNodes());
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = new ViewOnAttachStateChangeListenerC0393e(this);
        this.f4666Q = viewOnAttachStateChangeListenerC0393e;
        this.f4668R = new ViewOnAttachStateChangeListenerC0291c(this, new AndroidComposeView$contentCaptureManager$1(0, this, AbstractC3184kh.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/contentcapture/ContentCaptureSessionWrapper;", 1));
        this.f4670S = new C3148ji(this);
        this.f4672T = new a60();
        this.f4674U = new h66();
        this.f4687b0 = new b36();
        C0357g root = getRoot();
        pc0 pc0Var = new pc0();
        pc0Var.f55938b = root;
        pc0Var.f55939c = new C0327a((C0353c) root.f4335a0.f46676d);
        pc0Var.f55940d = new or3(16);
        pc0Var.f55941e = new cu3();
        this.f4689c0 = pc0Var;
        this.f4691d0 = AbstractC0278f.m1260j(new Configuration(context.getResources().getConfiguration()));
        this.f4693e0 = AbstractC0278f.m1254d(new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$localeList$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                LocaleList locales = this.f4481b.getConfiguration().getLocales();
                yi5 yi5Var = new yi5(new zi5(locales));
                if (locales.isEmpty()) {
                    yi5Var = new yi5(new zi5(LocaleList.getDefault()));
                }
                int iM25156c = yi5Var.m25156c();
                ArrayList arrayList = new ArrayList(iM25156c);
                for (int i2 = 0; i2 < iM25156c; i2++) {
                    Locale localeM25155b = yi5Var.m25155b(i2);
                    localeM25155b.getClass();
                    arrayList.add(new ti5(localeM25155b));
                }
                return new xi5(arrayList);
            }
        });
        this.f4695f0 = new C3309ls(this, getAutofillTree());
        this.f4697g0 = new C3408og(new fs6((Object) context, (boolean) (0 == true ? 1 : 0), 7), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
        this.f4701i0 = new C0364n(new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$snapshotObserver$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ui3 ui3Var = (ui3) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4486b;
                viewTreeObserverOnGlobalLayoutListenerC0391c.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0391c.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    ui3Var.mo0a();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0391c.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC3684vg(1, ui3Var));
                    }
                }
                return xfa.f68157a;
            }
        });
        this.f4709n0 = new ft5(getRoot());
        this.f4710o0 = 9223372034707292159L;
        this.f4711p0 = new int[]{0, 0};
        this.f4712q0 = ts5.m22286a();
        this.f4713r0 = ts5.m22286a();
        this.f4714s0 = ts5.m22286a();
        this.f4715t0 = -1L;
        this.f4717v0 = 9187343241974906880L;
        this.f4721z0 = new AtomicReference(null);
        this.f4642B0 = c0401m.f4800o;
        int layoutDirection2 = context.getResources().getConfiguration().getLayoutDirection();
        int[] iArr = s93.f60554a;
        if (layoutDirection2 != 0) {
            layoutDirection = layoutDirection2 != 1 ? null : LayoutDirection.Rtl;
        } else {
            layoutDirection = LayoutDirection.Ltr;
        }
        this.f4643C0 = AbstractC0278f.m1260j(layoutDirection == null ? LayoutDirection.Ltr : layoutDirection);
        g16 g16Var = new g16();
        new x66(new q70[16]);
        new x66(new d32[16]);
        new x66(new C0357g[16]);
        new x66(new d32[16]);
        this.f4645E0 = g16Var;
        final C0396h c0396h = new C0396h();
        new p84(new ui3() { // from class: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return xfa.f68157a;
            }
        }, 17);
        TextToolbarStatus textToolbarStatus = TextToolbarStatus.Shown;
        this.f4646F0 = c0396h;
        this.f4651I0 = new qfa(5);
        this.f4653J0 = new h66();
        this.f4655K0 = Float.NaN;
        this.f4657L0 = Float.NaN;
        this.f4659M0 = Float.NaN;
        this.f4661N0 = Float.NaN;
        this.f4663O0 = new RunnableC3795yg((Object) this, (int) (objArr == true ? 1 : 0));
        this.f4665P0 = new RunnableC3647ug(this, i);
        AndroidComposeView$indirectPointerNavigationGestureDetector$1 androidComposeView$indirectPointerNavigationGestureDetector$1 = new AndroidComposeView$indirectPointerNavigationGestureDetector$1(this);
        i44 i44Var = new i44();
        i44Var.f43482c = androidComposeView$indirectPointerNavigationGestureDetector$1;
        i44Var.f43481b = 0;
        i44Var.f43483d = new GestureDetector(context, new GestureDetectorOnGestureListenerC0404p(i44Var));
        this.f4669R0 = i44Var;
        this.f4671S0 = new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventOnLayout$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4485b;
                MotionEvent motionEvent = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                if (motionEvent != null) {
                    boolean zContains = vz1.m23605K(9, 7, 8).contains(Integer.valueOf(motionEvent.getActionMasked()));
                    MotionEvent motionEvent2 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                    boolean z = false;
                    if (motionEvent2 != null && motionEvent2.getButtonState() == 0) {
                        z = true;
                    }
                    if (zContains && z) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c.f4649H0 = SystemClock.uptimeMillis();
                        viewTreeObserverOnGlobalLayoutListenerC0391c.post(viewTreeObserverOnGlobalLayoutListenerC0391c.f4663O0);
                    }
                }
                ((AndroidComposeView$layoutChildViewsIfNeeded$1) viewTreeObserverOnGlobalLayoutListenerC0391c.f4673T0).mo0a();
                return xfa.f68157a;
            }
        };
        this.f4673T0 = new AndroidComposeView$layoutChildViewsIfNeeded$1(this);
        this.f4675U0 = new sl0();
        addOnAttachStateChangeListener(this.f4668R);
        setWillNotDraw(false);
        setFocusable(true);
        C3147jh.f45538a.m14456a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        dta.m10640k(this, viewOnAttachStateChangeListenerC0393e);
        setOnDragListener(m25910getDragAndDropManager());
        C2928dh.f35639a.m10373a(this);
        if (m1724p()) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R$id.hide_in_inspector_tag, Boolean.TRUE);
            this.f4704k = view;
            addView(view, -1);
        }
        this.f4681Y0 = Build.VERSION.SDK_INT >= 31 ? new C0420d() : null;
        this.f4685a1 = new C3758xg(this);
    }

    /* JADX INFO: renamed from: d */
    public static final void m1718d(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, int i, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int iM20409d;
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = viewTreeObserverOnGlobalLayoutListenerC0391c.f4666Q;
        if (fa4.m11650l(str, viewOnAttachStateChangeListenerC0393e.f4741Y)) {
            int iM20409d2 = viewOnAttachStateChangeListenerC0393e.f4739W.m20409d(i);
            if (iM20409d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, iM20409d2);
                return;
            }
            return;
        }
        if (!fa4.m11650l(str, viewOnAttachStateChangeListenerC0393e.f4742Z) || (iM20409d = viewOnAttachStateChangeListenerC0393e.f4740X.m20409d(i)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, iM20409d);
    }

    private final bn0 getCanvasHolder() {
        return getComposeViewContext().f4805t;
    }

    private final boolean getDerivedIsAttached() {
        return ((Boolean) this.f4654K.getValue()).booleanValue();
    }

    @zb2
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui$annotations() {
    }

    private final C0439e getLegacyTextInputServiceAndroid() {
        C0439e c0439e = this.f4719x0;
        if (c0439e != null) {
            return c0439e;
        }
        C0439e c0439e2 = new C0439e(getView(), this);
        this.f4719x0 = c0439e2;
        return c0439e2;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui$annotations, reason: not valid java name */
    public static /* synthetic */ void m25907getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @zb2
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public static /* synthetic */ void getWindowInfo$annotations() {
    }

    private final C0401m get_composeViewContext() {
        return (C0401m) ((xc9) this.f4683a).getValue();
    }

    /* JADX INFO: renamed from: h */
    public static void m1721h(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0391c) {
                ((ViewTreeObserverOnGlobalLayoutListenerC0391c) childAt).m1727C();
            } else if (childAt instanceof ViewGroup) {
                m1721h((ViewGroup) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static long m1722i(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return size;
        }
        if (mode == 0) {
            return 2147483647L;
        }
        if (mode == 1073741824) {
            long j = size;
            return j | (j << 32);
        }
        uk9.m22770c();
        return 0L;
    }

    /* JADX INFO: renamed from: m */
    public static void m1723m(C0357g c0357g) {
        c0357g.m1564G();
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            m1723m((C0357g) objArr[i2]);
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m1724p() {
        return Build.VERSION.SDK_INT >= 35;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m1725s(MotionEvent motionEvent) {
        boolean z = (Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) >= 2139095040;
        if (!z) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i = 1; i < pointerCount; i++) {
                z = (Float.floatToRawIntBits(motionEvent.getX(i)) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(motionEvent.getY(i)) & Integer.MAX_VALUE) >= 2139095040 || !c36.f9413a.m4298a(motionEvent, i);
                if (z) {
                    break;
                }
            }
        }
        return z;
    }

    private final void setAttached(boolean z) {
        ((xc9) this.f4652J).setValue(Boolean.valueOf(z));
    }

    private void setDensity(fb2 fb2Var) {
        ((xc9) this.f4702j).setValue(fb2Var);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        ((xc9) this.f4643C0).setValue(layoutDirection);
    }

    private final void set_composeViewContext(C0401m c0401m) {
        ((xc9) this.f4683a).setValue(c0401m);
    }

    /* JADX INFO: renamed from: B */
    public final boolean m1726B(int i) {
        if (i != 7 && i != 8) {
            Integer numM21167c = s93.m21167c(i);
            if (numM21167c == null) {
                throw AbstractC3393o1.m17745t("Invalid focus direction");
            }
            int iIntValue = numM21167c.intValue();
            C0302d c0302dM1362h = ((C0301c) getFocusOwner()).m1362h();
            if (c0302dM1362h == null) {
                C3386nv.m17633t("findNextViewInEmbeddedView called when owner does not have anything focused.");
                return false;
            }
            Integer numM21167c2 = s93.m21167c(i);
            if (numM21167c2 == null) {
                throw AbstractC3393o1.m17745t("Invalid focus direction");
            }
            int iIntValue2 = numM21167c2.intValue();
            AbstractC0442b abstractC0442b = te1.m21979L(c0302dM1362h).f4317J;
            View interopView = abstractC0442b != null ? abstractC0442b.getInteropView() : null;
            View viewFindFocus = findFocus();
            FocusFinder focusFinder = FocusFinder.getInstance();
            View rootView = getRootView();
            rootView.getClass();
            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewFindFocus, iIntValue2);
            if (viewFindNextFocus == null || interopView == null || !AbstractC3184kh.m15208b(interopView, viewFindNextFocus)) {
                viewFindNextFocus = null;
            }
            if (viewFindNextFocus != null) {
                return s93.m21166b(viewFindNextFocus, Integer.valueOf(iIntValue), null);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: C */
    public final void m1727C() {
        if (this.f4699h0) {
            getSnapshotObserver().m1706a();
            this.f4699h0 = false;
        }
        C3464pl c3464pl = this.f4705k0;
        if (c3464pl != null) {
            m1721h(c3464pl);
        }
        C3408og c3408og = this.f4697g0;
        if (c3408og != null) {
            u56 u56Var = c3408og.f54297h;
            if (u56Var.f63439d == 0 && c3408og.f54298i) {
                c3408og.f54290a.m12115v().commit();
                c3408og.f54298i = false;
            }
            if (u56Var.f63439d != 0) {
                c3408og.f54298i = true;
            }
        }
        while (true) {
            h66 h66Var = this.f4653J0;
            if (!h66Var.m720e() || h66Var.m717b(0) == null) {
                return;
            }
            int i = h66Var.f1294b;
            for (int i2 = 0; i2 < i; i2++) {
                ui3 ui3Var = (ui3) h66Var.m717b(i2);
                h66Var.m13098o(i2, null);
                if (ui3Var != null) {
                    ui3Var.mo0a();
                }
            }
            h66Var.m13096m(0, i);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m1728D(C0357g c0357g) {
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4666Q;
        viewOnAttachStateChangeListenerC0393e.f4735S = true;
        if (viewOnAttachStateChangeListenerC0393e.m1794v()) {
            viewOnAttachStateChangeListenerC0393e.m1795w(c0357g);
        }
        ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this.f4668R;
        viewOnAttachStateChangeListenerC0291c.f3836g = true;
        if (viewOnAttachStateChangeListenerC0291c.m1329h()) {
            viewOnAttachStateChangeListenerC0291c.f3837h.mo4677k(xfa.f68157a);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1729E(C0357g c0357g, boolean z, boolean z2, boolean z3) {
        C0357g c0357gM1610w;
        C0357g c0357gM1610w2;
        ft5 ft5Var = this.f4709n0;
        if (!z) {
            if (ft5Var.m12139r(c0357g, z2) && z3) {
                m1737M(c0357g);
                return;
            }
            return;
        }
        C3309ls c3309ls = ft5Var.f39618b;
        C0357g c0357g2 = c0357g.f4348h;
        qq4 qq4Var = c0357g.f4337b0;
        if (c0357g2 == null) {
            i54.m13663b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
        }
        int i = et5.f37826a[qq4Var.f58058d.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                ft5Var.f39624h.m24305c(new dt5(c0357g, true, z2));
                return;
            }
            if (i != 5) {
                gm5.m12750e();
                return;
            }
            if (!qq4Var.f58059e || z2) {
                qq4Var.f58059e = true;
                qq4Var.f58070p.f4402Q = true;
                if (c0357g.f4357l0) {
                    return;
                }
                if ((fa4.m11650l(c0357g.m1571N(), Boolean.TRUE) || ft5.m12125i(c0357g)) && ((c0357gM1610w = c0357g.m1610w()) == null || !c0357gM1610w.f4337b0.f58059e)) {
                    c3309ls.m16504a(c0357g, Invalidation.LookaheadMeasurement);
                } else if ((c0357g.m1570M() || ft5.m12126j(c0357g)) && ((c0357gM1610w2 = c0357g.m1610w()) == null || !c0357gM1610w2.m1605r())) {
                    c3309ls.m16504a(c0357g, Invalidation.Measurement);
                }
                if (ft5Var.f39620d || !z3) {
                    return;
                }
                m1737M(c0357g);
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m1730F(C0357g c0357g, boolean z, boolean z2) {
        qq4 qq4Var = c0357g.f4337b0;
        ft5 ft5Var = this.f4709n0;
        if (!z) {
            ft5Var.getClass();
            int i = et5.f37826a[qq4Var.f58058d.ordinal()];
            if (i == 1 || i == 2 || i == 3 || i == 4) {
                return;
            }
            if (i != 5) {
                gm5.m12750e();
                return;
            }
            C0357g c0357gM1610w = c0357g.m1610w();
            boolean z3 = c0357gM1610w == null || c0357gM1610w.m1570M();
            if (!z2) {
                if (c0357g.m1605r()) {
                    return;
                }
                if (c0357g.m1604q() && c0357g.m1570M() == z3 && c0357g.m1570M() == qq4Var.f58070p.f4401P) {
                    return;
                }
            }
            C0361k c0361k = qq4Var.f58070p;
            c0361k.f4403R = true;
            c0361k.f4404S = true;
            if (!c0357g.f4357l0 && c0361k.f4401P && z3) {
                if ((c0357gM1610w == null || !c0357gM1610w.m1604q()) && (c0357gM1610w == null || !c0357gM1610w.m1605r())) {
                    ft5Var.f39618b.m16504a(c0357g, Invalidation.Placement);
                }
                if (ft5Var.f39620d) {
                    return;
                }
                m1737M(null);
                return;
            }
            return;
        }
        C3309ls c3309ls = ft5Var.f39618b;
        int i2 = et5.f37826a[qq4Var.f58058d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return;
                }
                if (i2 != 4 && i2 != 5) {
                    gm5.m12750e();
                    return;
                }
            }
            if ((qq4Var.f58059e || qq4Var.f58060f) && !z2) {
                return;
            }
            qq4Var.f58060f = true;
            qq4Var.f58061g = true;
            C0361k c0361k2 = qq4Var.f58070p;
            c0361k2.f4403R = true;
            c0361k2.f4404S = true;
            if (c0357g.f4357l0) {
                return;
            }
            C0357g c0357gM1610w2 = c0357g.m1610w();
            if (fa4.m11650l(c0357g.m1571N(), Boolean.TRUE) && ((c0357gM1610w2 == null || !c0357gM1610w2.f4337b0.f58059e) && (c0357gM1610w2 == null || !c0357gM1610w2.f4337b0.f58060f))) {
                c3309ls.m16504a(c0357g, Invalidation.LookaheadPlacement);
            } else if (c0357g.m1570M() && ((c0357gM1610w2 == null || !c0357gM1610w2.m1604q()) && (c0357gM1610w2 == null || !c0357gM1610w2.m1605r()))) {
                c3309ls.m16504a(c0357g, Invalidation.Placement);
            }
            if (ft5Var.f39620d) {
                return;
            }
            m1737M(null);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m1731G() {
        ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4666Q;
        viewOnAttachStateChangeListenerC0393e.f4735S = true;
        Handler handler = viewOnAttachStateChangeListenerC0393e.f4746d.getHandler();
        if (viewOnAttachStateChangeListenerC0393e.m1794v() && !viewOnAttachStateChangeListenerC0393e.f4747d0 && handler != null) {
            viewOnAttachStateChangeListenerC0393e.f4747d0 = true;
            handler.post(viewOnAttachStateChangeListenerC0393e.f4751f0);
        }
        ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this.f4668R;
        viewOnAttachStateChangeListenerC0291c.f3836g = true;
        Handler handler2 = viewOnAttachStateChangeListenerC0291c.f3830a.getHandler();
        if (!viewOnAttachStateChangeListenerC0291c.m1329h() || viewOnAttachStateChangeListenerC0291c.f3828H || handler2 == null) {
            return;
        }
        viewOnAttachStateChangeListenerC0291c.f3828H = true;
        handler2.post(viewOnAttachStateChangeListenerC0291c.f3829I);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX INFO: renamed from: H */
    public final void m1732H(ViewStructure viewStructure) {
        C3408og c3408og = this.f4697g0;
        if (c3408og != null) {
            C0357g c0357g = c3408og.f54291b.f61494a;
            AutofillId autofillId = c3408og.f54296g;
            String str = c3408og.f54294e;
            C0429a c0429a = c3408og.f54293d;
            cgc.m4646a(viewStructure, c0357g, autofillId, str, c0429a);
            Object[] objArr = ip6.f44399a;
            h66 h66Var = new h66(2);
            h66Var.m13090g(c0357g);
            h66Var.m13090g(viewStructure);
            while (h66Var.m720e()) {
                Object objM13095l = h66Var.m13095l(h66Var.f1294b - 1);
                objM13095l.getClass();
                ViewStructure viewStructure2 = (ViewStructure) objM13095l;
                Object objM13095l2 = h66Var.m13095l(h66Var.f1294b - 1);
                objM13095l2.getClass();
                List listM1602o = ((C0357g) objM13095l2).m1602o();
                int size = listM1602o.size();
                for (int i = 0; i < size; i++) {
                    C0357g c0357g2 = (C0357g) ((f66) listM1602o).get(i);
                    if (!c0357g2.f4357l0 && c0357g2.m1569L() && c0357g2.m1570M()) {
                        kv8 kv8VarM1613z = c0357g2.m1613z();
                        if (kv8VarM1613z != null) {
                            n66 n66Var = kv8VarM1613z.f48471a;
                            if (n66Var.m17250b(AbstractC0421a.f4951g) || n66Var.m17250b(AbstractC0421a.f4952h) || n66Var.m17250b(AbstractC0424d.f5011r) || n66Var.m17250b(AbstractC0424d.f5012s)) {
                                ViewStructure viewStructureNewChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                cgc.m4646a(viewStructureNewChild, c0357g2, autofillId, str, c0429a);
                                h66Var.m13090g(c0357g2);
                                h66Var.m13090g(viewStructureNewChild);
                            } else {
                                h66Var.m13090g(c0357g2);
                                h66Var.m13090g(viewStructure2);
                            }
                        } else {
                            h66Var.m13090g(c0357g2);
                            h66Var.m13090g(viewStructure2);
                        }
                    }
                }
            }
        }
        C3309ls c3309ls = this.f4695f0;
        if (c3309ls != null) {
            a60 a60Var = (a60) c3309ls.f50065c;
            LinkedHashMap linkedHashMap = a60Var.f275a;
            LinkedHashMap linkedHashMap2 = a60Var.f275a;
            if (linkedHashMap.isEmpty()) {
                return;
            }
            int iAddChildCount = viewStructure.addChildCount(linkedHashMap2.size());
            Iterator it = linkedHashMap2.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                int iIntValue = ((Number) entry.getKey()).intValue();
                if (entry.getValue() != null) {
                    ho2.m13383c();
                    return;
                }
                ViewStructure viewStructureNewChild2 = viewStructure.newChild(iAddChildCount);
                viewStructureNewChild2.setAutofillId((AutofillId) c3309ls.f50066d, iIntValue);
                viewStructureNewChild2.setId(iIntValue, ((ViewTreeObserverOnGlobalLayoutListenerC0391c) c3309ls.f50064b).getContext().getPackageName(), null, null);
                viewStructureNewChild2.setAutofillType(1);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m1733I() {
        if (this.f4716u0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f4715t0) {
            this.f4715t0 = jCurrentAnimationTimeMillis;
            sl0 sl0Var = this.f4675U0;
            float[] fArr = this.f4713r0;
            sl0Var.m21444a(this, fArr);
            AbstractC3695vr.m23510u(fArr, this.f4714s0);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.f4711p0;
            view.getLocationOnScreen(iArr);
            float f = iArr[0];
            float f2 = iArr[1];
            view.getLocationInWindow(iArr);
            this.f4717v0 = (((long) Float.floatToRawIntBits(f - iArr[0])) << 32) | (((long) Float.floatToRawIntBits(f2 - iArr[1])) & 4294967295L);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m1734J(MotionEvent motionEvent) {
        this.f4715t0 = AnimationUtils.currentAnimationTimeMillis();
        sl0 sl0Var = this.f4675U0;
        float[] fArr = this.f4713r0;
        sl0Var.m21444a(this, fArr);
        AbstractC3695vr.m23510u(fArr, this.f4714s0);
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        long jM22287b = ts5.m22287b(fArr, (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L));
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (jM22287b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (jM22287b & 4294967295L));
        this.f4717v0 = (((long) Float.floatToRawIntBits(rawX)) << 32) | (((long) Float.floatToRawIntBits(rawY)) & 4294967295L);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m1735K() {
        if (isFocused()) {
            return true;
        }
        return super.requestFocus(130, null);
    }

    /* JADX INFO: renamed from: L */
    public final void m1736L(ui3 ui3Var) {
        C0825bv c0825bv = this.f4698h;
        boolean zIsEmpty = c0825bv.isEmpty();
        c0825bv.addLast(ui3Var);
        if (zIsEmpty) {
            Handler handler = getHandler();
            if (handler != null) {
                handler.postAtFrontOfQueue(this.f4700i);
            } else {
                C3386nv.m17626m("schedule is called when outOfFrameExecutor is not available (view is detached)");
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m1737M(C0357g c0357g) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (c0357g != null) {
            while (c0357g != null && c0357g.m1606s() == LayoutNode$UsageByParent.InMeasureBlock) {
                if (!this.f4708m0) {
                    C0357g c0357gM1610w = c0357g.m1610w();
                    if (c0357gM1610w == null) {
                        break;
                    }
                    long j = ((C0353c) c0357gM1610w.f4335a0.f46676d).f49304d;
                    if (bk1.m3799g(j) && bk1.m3798f(j)) {
                        break;
                    }
                }
                c0357g = c0357g.m1610w();
            }
            if (c0357g == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    /* JADX INFO: renamed from: N */
    public final long m1738N(long j) {
        m1733I();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - Float.intBitsToFloat((int) (this.f4717v0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - Float.intBitsToFloat((int) (this.f4717v0 & 4294967295L));
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        return ts5.m22287b(this.f4714s0, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits << 32));
    }

    /* JADX INFO: renamed from: O */
    public final int m1739O(MotionEvent motionEvent) {
        Object obj;
        if (this.f4677V0) {
            this.f4677V0 = false;
            nw4 nw4Var = getComposeViewContext().f4804s;
            int metaState = motionEvent.getMetaState();
            nw4Var.getClass();
            ((xc9) b5b.f7978a).setValue(new qg7(metaState));
        }
        b36 b36Var = this.f4687b0;
        fs6 fs6VarM3266c = b36Var.m3266c(motionEvent, this);
        int actionMasked = motionEvent.getActionMasked();
        pc0 pc0Var = this.f4689c0;
        if (fs6VarM3266c == null) {
            if (!pc0Var.f55937a) {
                ((tk5) ((or3) pc0Var.f55940d).f54782a).m22175a();
                ((C0327a) pc0Var.f55939c).m1455c();
            }
            return 0;
        }
        List list = (List) fs6VarM3266c.f39590b;
        int size = list.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i = size - 1;
            obj = list.get(size);
            if (((mg7) obj).f51295e && (actionMasked == 0 || actionMasked == 5)) {
                break;
            }
            if (i < 0) {
                obj = null;
                break;
            }
            size = i;
        }
        mg7 mg7Var = (mg7) obj;
        if (mg7Var != null) {
            this.f4686b = mg7Var.f51294d;
        }
        int iM19062c = pc0Var.m19062c(fs6VarM3266c, this, m1750t(motionEvent));
        fs6VarM3266c.f39591c = null;
        if ((actionMasked != 0 && actionMasked != 5) || (iM19062c & 1) != 0) {
            return iM19062c;
        }
        int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
        b36Var.f7868c.delete(pointerId);
        b36Var.f7867b.delete(pointerId);
        return iM19062c;
    }

    /* JADX INFO: renamed from: P */
    public final void m1740P(MotionEvent motionEvent, int i, long j, boolean z) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i2 = 0; i2 < pointerCount; i2++) {
            pointerPropertiesArr[i2] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < pointerCount; i3++) {
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords();
        }
        int i4 = 0;
        while (i4 < pointerCount) {
            int i5 = ((actionIndex < 0 || i4 < actionIndex) ? 0 : 1) + i4;
            motionEvent.getPointerProperties(i5, pointerPropertiesArr[i4]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i4];
            motionEvent.getPointerCoords(i5, pointerCoords);
            float f = pointerCoords.x;
            long jM1753w = m1753w((((long) Float.floatToRawIntBits(pointerCoords.y)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (jM1753w >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (jM1753w & 4294967295L));
            i4++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        fs6 fs6VarM3266c = this.f4687b0.m3266c(motionEventObtain, this);
        fs6VarM3266c.getClass();
        this.f4689c0.m19062c(fs6VarM3266c, this, true);
        motionEventObtain.recycle();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: Q */
    public final CoroutineSingletons m1741Q(zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        AndroidComposeView$textInputSession$1 androidComposeView$textInputSession$1;
        if (continuationImpl instanceof AndroidComposeView$textInputSession$1) {
            androidComposeView$textInputSession$1 = (AndroidComposeView$textInputSession$1) continuationImpl;
            int i = androidComposeView$textInputSession$1.f4489c;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidComposeView$textInputSession$1.f4489c = i - Integer.MIN_VALUE;
            } else {
                androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
            }
        } else {
            androidComposeView$textInputSession$1 = new AndroidComposeView$textInputSession$1(this, continuationImpl);
        }
        Object obj = androidComposeView$textInputSession$1.f4487a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = androidComposeView$textInputSession$1.f4489c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            vi3 vi3Var = new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4490b;
                    return new C0395g(viewTreeObserverOnGlobalLayoutListenerC0391c, viewTreeObserverOnGlobalLayoutListenerC0391c.getTextInputService(), (un1) obj2);
                }
            };
            androidComposeView$textInputSession$1.f4489c = 1;
            if (AbstractC0287b.m1323d(this.f4721z0, vi3Var, zi3Var, androidComposeView$textInputSession$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17631r();
        return null;
    }

    /* JADX INFO: renamed from: R */
    public final void m1742R(Configuration configuration) {
        Configuration configuration2 = getConfiguration();
        if (fa4.m11650l(configuration2, configuration)) {
            return;
        }
        setConfiguration(new Configuration(configuration));
        if (configuration2.fontScale == configuration.fontScale && configuration2.densityDpi == configuration.densityDpi) {
            return;
        }
        setDensity(AbstractC3489q9.m19772b(getContext()));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0056  */
    /* JADX INFO: renamed from: S */
    public final void m1743S() {
        boolean z;
        int i;
        int[] iArr = this.f4711p0;
        getLocationOnScreen(iArr);
        long j = this.f4710o0;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        int i4 = iArr[0];
        if (i2 == i4 && i3 == iArr[1] && this.f4715t0 >= 0) {
            z = false;
        } else {
            this.f4710o0 = (4294967295L & ((long) iArr[1])) | (((long) i4) << 32);
            if (i2 == Integer.MAX_VALUE || i3 == Integer.MAX_VALUE) {
                z = false;
            } else {
                x66 x66VarM1559B = getRoot().m1559B();
                Object[] objArr = x66VarM1559B.f67830a;
                int i5 = x66VarM1559B.f67832c;
                for (int i6 = 0; i6 < i5; i6++) {
                    ((C0357g) objArr[i6]).f4337b0.f58070p.m1655N0();
                }
                z = true;
            }
        }
        m1733I();
        View rootView = this.f4682Z0;
        if (rootView == null) {
            rootView = getRootView();
            this.f4682Z0 = rootView;
        }
        C0429a rectManager = getRectManager();
        long j2 = this.f4710o0;
        long jM19495C = pvc.m19495C(this.f4717v0);
        int width = rootView.getWidth();
        int height = rootView.getHeight();
        rectManager.getClass();
        float[] fArr = this.f4713r0;
        if (fArr.length < 16) {
            i = 0;
        } else {
            i = ((((((((((fArr[0] == 1.0f ? 1 : 0) & (fArr[1] == 0.0f ? 1 : 0)) & (fArr[2] == 0.0f ? 1 : 0)) & (fArr[4] == 0.0f ? 1 : 0)) & (fArr[5] == 1.0f ? 1 : 0)) & (fArr[6] == 0.0f ? 1 : 0)) & (fArr[8] == 0.0f ? 1 : 0)) & (fArr[9] == 0.0f ? 1 : 0)) & (fArr[10] == 1.0f ? 1 : 0)) << 1) | ((fArr[15] == 1.0f ? 1 : 0) & (fArr[12] == 0.0f ? 1 : 0) & (fArr[13] == 0.0f ? 1 : 0) & (fArr[14] == 0.0f ? 1 : 0));
        }
        yz9 yz9Var = rectManager.f5032d;
        if ((i & 2) != 0) {
            fArr = null;
        }
        rectManager.f5035g = yz9Var.m25392c(j2, jM19495C, fArr, width, height) || rectManager.f5035g;
        this.f4709n0.m12128b(z);
        getRectManager().m1874a();
    }

    /* JADX INFO: renamed from: T */
    public final void m1744T(float f) {
        if (m1724p()) {
            if (f > 0.0f) {
                if (Float.isNaN(this.f4655K0) || f > this.f4655K0) {
                    this.f4655K0 = f;
                    return;
                }
                return;
            }
            if (f < 0.0f) {
                if (Float.isNaN(this.f4657L0) || f < this.f4657L0) {
                    this.f4657L0 = f;
                }
            }
        }
    }

    @Override // p000.t93
    /* JADX INFO: renamed from: a */
    public final void mo1745a(C0302d c0302d, C0302d c0302d2) {
        k40 k40Var;
        boolean z;
        k40 k40Var2;
        boolean z2;
        if (c0302d != null) {
            C0302d c0302d3 = c0302d;
            if (!c0302d3.f34837a.f34836I) {
                i54.m13663b("visitAncestors called on an unattached node");
            }
            d16 d16Var = c0302d3.f34837a;
            C0357g c0357gM21979L = te1.m21979L(c0302d);
            o66 o66Var = null;
            ArrayList arrayList = null;
            while (c0357gM21979L != null) {
                if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 2097152) != 0) {
                    while (d16Var != null) {
                        if ((d16Var.f34839c & 2097152) != 0) {
                            d16 d16VarM21992f = d16Var;
                            x66 x66Var = null;
                            while (d16VarM21992f != null) {
                                if (d16VarM21992f instanceof h44) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.add(d16VarM21992f);
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2 && (d16VarM21992f.f34839c & 2097152) != 0 && (d16VarM21992f instanceof fa2)) {
                                    int i = 0;
                                    for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                        if ((d16Var2.f34839c & 2097152) != 0) {
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
                        }
                        d16Var = d16Var.f34841e;
                    }
                }
                c0357gM21979L = c0357gM21979L.m1610w();
                d16Var = (c0357gM21979L == null || (k40Var2 = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var2.f46678f;
            }
            if (arrayList == null) {
                return;
            }
            if (c0302d2 != null) {
                if (!c0302d2.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var3 = c0302d2.f34837a;
                C0357g c0357gM21979L2 = te1.m21979L(c0302d2);
                o66 o66Var2 = null;
                while (c0357gM21979L2 != null) {
                    if ((((d16) c0357gM21979L2.f4335a0.f46679g).f34840d & 2097152) != 0) {
                        while (d16Var3 != null) {
                            if ((d16Var3.f34839c & 2097152) != 0) {
                                d16 d16VarM21992f2 = d16Var3;
                                x66 x66Var2 = null;
                                while (d16VarM21992f2 != null) {
                                    if (d16VarM21992f2 instanceof h44) {
                                        if (o66Var2 == null) {
                                            o66 o66Var3 = pm8.f56484a;
                                            o66Var2 = new o66();
                                        }
                                        o66Var2.m17811d(d16VarM21992f2);
                                        z = false;
                                    } else {
                                        z = true;
                                    }
                                    if (z && (d16VarM21992f2.f34839c & 2097152) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                        int i2 = 0;
                                        for (d16 d16Var4 = ((fa2) d16VarM21992f2).f38701K; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
                                            if ((d16Var4.f34839c & 2097152) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    d16VarM21992f2 = d16Var4;
                                                } else {
                                                    if (x66Var2 == null) {
                                                        x66Var2 = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f2 != null) {
                                                        x66Var2.m24305c(d16VarM21992f2);
                                                        d16VarM21992f2 = null;
                                                    }
                                                    x66Var2.m24305c(d16Var4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    d16VarM21992f2 = te1.m21992f(x66Var2);
                                }
                            }
                            d16Var3 = d16Var3.f34841e;
                        }
                    }
                    c0357gM21979L2 = c0357gM21979L2.m1610w();
                    d16Var3 = (c0357gM21979L2 == null || (k40Var = c0357gM21979L2.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                }
                o66Var = o66Var2;
            }
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                h44 h44Var = (h44) arrayList.get(i3);
                if (!(o66Var != null ? o66Var.m723a(h44Var) : false)) {
                    h44Var.mo820k0();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C0302d c0302d = ((C0301c) getFocusOwner()).f3908c;
        if (!c0302d.f34836I) {
            return;
        }
        if (!c0302d.f34837a.f34836I) {
            i54.m13663b("visitSubtreeIf called on an unattached node");
        }
        x66 x66Var = new x66(new d16[16]);
        d16 d16Var = c0302d.f34837a;
        d16 d16Var2 = d16Var.f34842f;
        if (d16Var2 == null) {
            te1.m21990d(x66Var, d16Var);
        } else {
            x66Var.m24305c(d16Var2);
        }
        while (true) {
            int i3 = x66Var.f67832c;
            if (i3 == 0) {
                return;
            }
            d16 d16Var3 = (d16) x66Var.m24314l(i3 - 1);
            if ((d16Var3.f34840d & 1024) != 0) {
                for (d16 d16Var4 = d16Var3; d16Var4 != null && d16Var4.f34836I; d16Var4 = d16Var4.f34842f) {
                    if ((d16Var4.f34839c & 1024) != 0) {
                        d16 d16VarM21992f = d16Var4;
                        x66 x66Var2 = null;
                        while (d16VarM21992f != null) {
                            int i4 = 0;
                            if (d16VarM21992f instanceof C0302d) {
                                C0302d c0302d2 = (C0302d) d16VarM21992f;
                                if (c0302d2.f34836I && c0302d2.m1370b1().f67960a) {
                                    super.addFocusables(arrayList, i, i2);
                                    C0302d c0302d3 = ((C0301c) getFocusOwner()).f3908c;
                                    if (c0302d3.f34836I) {
                                        if (!c0302d3.f34837a.f34836I) {
                                            i54.m13663b("visitSubtreeIf called on an unattached node");
                                        }
                                        x66 x66Var3 = new x66(new d16[16]);
                                        d16 d16Var5 = c0302d3.f34837a;
                                        d16 d16Var6 = d16Var5.f34842f;
                                        if (d16Var6 == null) {
                                            te1.m21990d(x66Var3, d16Var5);
                                        } else {
                                            x66Var3.m24305c(d16Var6);
                                        }
                                        while (true) {
                                            int i5 = x66Var3.f67832c;
                                            if (i5 == 0) {
                                                break;
                                            }
                                            d16 d16Var7 = (d16) x66Var3.m24314l(i5 - 1);
                                            if ((d16Var7.f34840d & 1024) != 0) {
                                                for (d16 d16Var8 = d16Var7; d16Var8 != null && d16Var8.f34836I; d16Var8 = d16Var8.f34842f) {
                                                    if ((d16Var8.f34839c & 1024) != 0) {
                                                        d16 d16VarM21992f2 = d16Var8;
                                                        x66 x66Var4 = null;
                                                        while (d16VarM21992f2 != null) {
                                                            if (d16VarM21992f2 instanceof C0302d) {
                                                                C0302d c0302d4 = (C0302d) d16VarM21992f2;
                                                                if (c0302d4.f34836I) {
                                                                    x93 x93VarM1370b1 = c0302d4.m1370b1();
                                                                    if (c0302d4.f34836I && !c0302d4.f3914J && x93VarM1370b1.f67960a) {
                                                                        return;
                                                                    }
                                                                }
                                                            } else if ((d16VarM21992f2.f34839c & 1024) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                                                int i6 = 0;
                                                                for (d16 d16Var9 = ((fa2) d16VarM21992f2).f38701K; d16Var9 != null; d16Var9 = d16Var9.f34842f) {
                                                                    if ((d16Var9.f34839c & 1024) != 0) {
                                                                        i6++;
                                                                        if (i6 == 1) {
                                                                            d16VarM21992f2 = d16Var9;
                                                                        } else {
                                                                            if (x66Var4 == null) {
                                                                                x66Var4 = new x66(new d16[16]);
                                                                            }
                                                                            if (d16VarM21992f2 != null) {
                                                                                x66Var4.m24305c(d16VarM21992f2);
                                                                                d16VarM21992f2 = null;
                                                                            }
                                                                            x66Var4.m24305c(d16Var9);
                                                                        }
                                                                    }
                                                                }
                                                                if (i6 == 1) {
                                                                }
                                                            }
                                                            d16VarM21992f2 = te1.m21992f(x66Var4);
                                                        }
                                                    }
                                                }
                                            }
                                            te1.m21990d(x66Var3, d16Var7);
                                        }
                                    }
                                    if (arrayList != null) {
                                        arrayList.remove(this);
                                        return;
                                    }
                                    return;
                                }
                            } else if ((d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                                for (d16 d16Var10 = ((fa2) d16VarM21992f).f38701K; d16Var10 != null; d16Var10 = d16Var10.f34842f) {
                                    if ((d16Var10.f34839c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            d16VarM21992f = d16Var10;
                                        } else {
                                            if (x66Var2 == null) {
                                                x66Var2 = new x66(new d16[16]);
                                            }
                                            if (d16VarM21992f != null) {
                                                x66Var2.m24305c(d16VarM21992f);
                                                d16VarM21992f = null;
                                            }
                                            x66Var2.m24305c(d16Var10);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            d16VarM21992f = te1.m21992f(x66Var2);
                        }
                    }
                }
            }
            te1.m21990d(x66Var, d16Var3);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        kv8 kv8VarM1613z;
        vi3 vi3Var;
        vi3 vi3Var2;
        C3408og c3408og = this.f4697g0;
        if (c3408og != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(iKeyAt);
                C0357g c0357g = (C0357g) c3408og.f54291b.f61496c.m10152b(iKeyAt);
                if (c0357g != null && (kv8VarM1613z = c0357g.m1613z()) != null) {
                    C3024g3 c3024g3 = (C3024g3) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0421a.f4951g);
                    if (c3024g3 != null && (vi3Var2 = (vi3) c3024g3.f40091b) != null) {
                    }
                    C3024g3 c3024g4 = (C3024g3) AbstractC0422b.m1838a(kv8VarM1613z, AbstractC0421a.f4952h);
                    if (c3024g4 != null && (vi3Var = (vi3) c3024g4.f40091b) != null) {
                    }
                }
            }
        }
        C3309ls c3309ls = this.f4695f0;
        if (c3309ls != null) {
            a60 a60Var = (a60) c3309ls.f50065c;
            if (a60Var.f275a.isEmpty()) {
                return;
            }
            int size2 = sparseArray.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int iKeyAt2 = sparseArray.keyAt(i2);
                AutofillValue autofillValue2 = (AutofillValue) sparseArray.get(iKeyAt2);
                if (autofillValue2.isText()) {
                    autofillValue2.getTextValue().toString();
                    if (a60Var.f275a.get(Integer.valueOf(iKeyAt2)) != null) {
                        ho2.m13383c();
                        return;
                    }
                } else {
                    if (autofillValue2.isDate()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillValue2.isList()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillValue2.isToggle()) {
                        throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.f4666Q.m1786m(i, this.f4686b, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.f4666Q.m1786m(i, this.f4686b, true);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        h66 h66Var = this.f4674U;
        if (!isAttachedToWindow()) {
            m1723m(getRoot());
        }
        m1754x(true);
        nc9.m17358j().mo3168m();
        this.f4678W = true;
        Trace.beginSection("AndroidOwner:draw");
        try {
            bn0 canvasHolder = getCanvasHolder();
            C3459pg c3459pg = canvasHolder.f8709a;
            Canvas canvas2 = c3459pg.f56079a;
            c3459pg.f56079a = canvas;
            getRoot().m1595j(c3459pg, null);
            canvasHolder.f8709a.f56079a = canvas2;
            if (h66Var.m720e()) {
                int i = h66Var.f1294b;
                for (int i2 = 0; i2 < i; i2++) {
                    ((C0403o) ((b17) h66Var.m717b(i2))).m1812g();
                }
            }
            int i3 = sta.f61397a;
            h66Var.m13093j();
            this.f4678W = false;
            Trace.endSection();
            h66 h66Var2 = this.f4676V;
            if (h66Var2 != null) {
                h66Var.m13091h(h66Var2);
                h66Var2.m13093j();
            }
            if (m1724p()) {
                if (Float.compare(this.f4655K0, this.f4659M0) != 0) {
                    float f = this.f4655K0;
                    this.f4659M0 = f;
                    AbstractC3045go.m12778a(this, f);
                }
                View view = this.f4704k;
                if (view != null) {
                    if (Float.compare(this.f4657L0, this.f4661N0) != 0) {
                        float f2 = this.f4657L0;
                        this.f4661N0 = f2;
                        AbstractC3045go.m12778a(view, f2);
                    }
                    if (!Float.isNaN(this.f4657L0)) {
                        view.invalidate();
                        drawChild(canvas, view, getDrawingTime());
                    }
                }
                this.f4655K0 = Float.NaN;
                this.f4657L0 = Float.NaN;
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:204:0x02be  */
    /* JADX WARN: Code duplicated, block: B:206:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:207:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:210:0x0306  */
    /* JADX WARN: Code duplicated, block: B:211:0x0309  */
    /* JADX WARN: Code duplicated, block: B:214:0x0313  */
    /* JADX WARN: Code duplicated, block: B:216:0x031c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:217:0x031e  */
    /* JADX WARN: Code duplicated, block: B:220:0x033e  */
    /* JADX WARN: Code duplicated, block: B:222:0x0349  */
    /* JADX WARN: Code duplicated, block: B:224:0x0350  */
    /* JADX WARN: Code duplicated, block: B:225:0x035b  */
    /* JADX WARN: Code duplicated, block: B:227:0x035f  */
    /* JADX WARN: Code duplicated, block: B:229:0x036e  */
    /* JADX WARN: Code duplicated, block: B:233:0x0394  */
    /* JADX WARN: Code duplicated, block: B:234:0x0399  */
    /* JADX WARN: Code duplicated, block: B:367:0x0572  */
    /* JADX WARN: Code duplicated, block: B:374:0x0581  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [d16] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37, types: [x66] */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v73 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31, types: [x66] */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        int i;
        boolean z;
        int pointerCount;
        ArrayList arrayList;
        int i2;
        z34 z34Var;
        String str;
        int iM21012b;
        C3299li c3299li;
        int pointerId;
        int iIndexOfKey;
        long jValueAt;
        long jFloatToRawIntBits;
        boolean z2;
        a36 a36Var;
        long j;
        long eventTime;
        long jM71d;
        boolean zM70c;
        h44 h44Var;
        k40 k40Var;
        boolean z3;
        ?? M21992f;
        k40 k40Var2;
        h44 h44Var2;
        boolean z4;
        int size;
        int size2;
        k40 k40Var3;
        boolean z5;
        Object obj;
        k40 k40Var4;
        int action;
        boolean z6;
        C0390b c0390b;
        int size3;
        k40 k40Var5;
        boolean z7;
        d16 d16VarM21992f;
        k40 k40Var6;
        if (this.f4667Q0) {
            RunnableC3647ug runnableC3647ug = this.f4665P0;
            removeCallbacks(runnableC3647ug);
            if (motionEvent.getActionMasked() == 8) {
                this.f4667Q0 = false;
            } else {
                runnableC3647ug.run();
            }
        }
        if (m1725s(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        String str2 = "visitAncestors called on an unattached node";
        if (motionEvent.getActionMasked() == 8) {
            if (!motionEvent.isFromSource(4194304)) {
                return (m1748l(motionEvent) & 4) != 0;
            }
            ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
            motionEvent.getAxisValue(26);
            getContext();
            sad.m21189b(viewConfiguration);
            getContext();
            sad.m21188a(viewConfiguration);
            motionEvent.getEventTime();
            motionEvent.getDeviceId();
            InterfaceC0300b focusOwner = getFocusOwner();
            ui3 ui3Var = new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$handleRotaryEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return Boolean.valueOf(super/*android.view.View*/.dispatchGenericMotionEvent(motionEvent));
                }
            };
            C0301c c0301c = (C0301c) focusOwner;
            if (c0301c.f3909d.f3905e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                return false;
            }
            C0302d c0302dM23497h = AbstractC3695vr.m23497h(c0301c.f3908c);
            if (c0302dM23497h != null) {
                if (!c0302dM23497h.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var = c0302dM23497h.f34837a;
                C0357g c0357gM21979L = te1.m21979L(c0302dM23497h);
                loop0: while (true) {
                    if (c0357gM21979L == null) {
                        d16VarM21992f = null;
                        break;
                    }
                    if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 16384) != 0) {
                        while (d16Var != null) {
                            if ((d16Var.f34839c & 16384) != 0) {
                                d16VarM21992f = d16Var;
                                x66 x66Var = null;
                                while (d16VarM21992f != null) {
                                    if (d16VarM21992f instanceof C0390b) {
                                        break loop0;
                                    }
                                    if ((d16VarM21992f.f34839c & 16384) != 0 && (d16VarM21992f instanceof fa2)) {
                                        int i3 = 0;
                                        for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                            if ((d16Var2.f34839c & 16384) != 0) {
                                                i3++;
                                                if (i3 == 1) {
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
                                        if (i3 == 1) {
                                        }
                                    }
                                    d16VarM21992f = te1.m21992f(x66Var);
                                }
                            }
                            d16Var = d16Var.f34841e;
                        }
                    }
                    c0357gM21979L = c0357gM21979L.m1610w();
                    d16Var = (c0357gM21979L == null || (k40Var6 = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var6.f46678f;
                }
                c0390b = (C0390b) d16VarM21992f;
            } else {
                c0390b = null;
            }
            if (c0390b != null) {
                C0390b c0390b2 = c0390b;
                if (!c0390b2.f34837a.f34836I) {
                    i54.m13663b("visitAncestors called on an unattached node");
                }
                d16 d16Var3 = c0390b2.f34837a.f34841e;
                C0357g c0357gM21979L2 = te1.m21979L(c0390b);
                ArrayList arrayList2 = null;
                while (c0357gM21979L2 != null) {
                    if ((((d16) c0357gM21979L2.f4335a0.f46679g).f34840d & 16384) != 0) {
                        while (d16Var3 != null) {
                            if ((d16Var3.f34839c & 16384) != 0) {
                                d16 d16VarM21992f2 = d16Var3;
                                x66 x66Var2 = null;
                                while (d16VarM21992f2 != null) {
                                    if (d16VarM21992f2 instanceof C0390b) {
                                        if (arrayList2 == null) {
                                            arrayList2 = new ArrayList();
                                        }
                                        arrayList2.add(d16VarM21992f2);
                                        z7 = false;
                                    } else {
                                        z7 = true;
                                    }
                                    if (z7 && (d16VarM21992f2.f34839c & 16384) != 0 && (d16VarM21992f2 instanceof fa2)) {
                                        int i4 = 0;
                                        for (d16 d16Var4 = ((fa2) d16VarM21992f2).f38701K; d16Var4 != null; d16Var4 = d16Var4.f34842f) {
                                            if ((d16Var4.f34839c & 16384) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    d16VarM21992f2 = d16Var4;
                                                } else {
                                                    if (x66Var2 == null) {
                                                        x66Var2 = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f2 != null) {
                                                        x66Var2.m24305c(d16VarM21992f2);
                                                        d16VarM21992f2 = null;
                                                    }
                                                    x66Var2.m24305c(d16Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    d16VarM21992f2 = te1.m21992f(x66Var2);
                                }
                            }
                            d16Var3 = d16Var3.f34841e;
                        }
                    }
                    c0357gM21979L2 = c0357gM21979L2.m1610w();
                    d16Var3 = (c0357gM21979L2 == null || (k40Var5 = c0357gM21979L2.f4335a0) == null) ? null : (ir9) k40Var5.f46678f;
                }
                if (arrayList2 != null && (size3 = arrayList2.size() - 1) >= 0) {
                    while (true) {
                        int i5 = size3 - 1;
                        ((C0390b) arrayList2.get(size3)).getClass();
                        if (i5 < 0) {
                            break;
                        }
                        size3 = i5;
                    }
                }
                d16 d16VarM21992f3 = c0390b2.f34837a;
                x66 x66Var3 = null;
                while (d16VarM21992f3 != null) {
                    if (d16VarM21992f3 instanceof C0390b) {
                    } else if ((d16VarM21992f3.f34839c & 16384) != 0 && (d16VarM21992f3 instanceof fa2)) {
                        int i6 = 0;
                        for (d16 d16Var5 = ((fa2) d16VarM21992f3).f38701K; d16Var5 != null; d16Var5 = d16Var5.f34842f) {
                            if ((d16Var5.f34839c & 16384) != 0) {
                                i6++;
                                if (i6 == 1) {
                                    d16VarM21992f3 = d16Var5;
                                } else {
                                    if (x66Var3 == null) {
                                        x66Var3 = new x66(new d16[16]);
                                    }
                                    if (d16VarM21992f3 != null) {
                                        x66Var3.m24305c(d16VarM21992f3);
                                        d16VarM21992f3 = null;
                                    }
                                    x66Var3.m24305c(d16Var5);
                                }
                            }
                        }
                        if (i6 == 1) {
                        }
                    }
                    d16VarM21992f3 = te1.m21992f(x66Var3);
                }
                if (!((Boolean) ui3Var.mo0a()).booleanValue()) {
                    d16 d16VarM21992f4 = c0390b2.f34837a;
                    x66 x66Var4 = null;
                    while (d16VarM21992f4 != null) {
                        if (d16VarM21992f4 instanceof C0390b) {
                        } else if ((d16VarM21992f4.f34839c & 16384) != 0 && (d16VarM21992f4 instanceof fa2)) {
                            int i7 = 0;
                            for (d16 d16Var6 = ((fa2) d16VarM21992f4).f38701K; d16Var6 != null; d16Var6 = d16Var6.f34842f) {
                                if ((d16Var6.f34839c & 16384) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        d16VarM21992f4 = d16Var6;
                                    } else {
                                        if (x66Var4 == null) {
                                            x66Var4 = new x66(new d16[16]);
                                        }
                                        if (d16VarM21992f4 != null) {
                                            x66Var4.m24305c(d16VarM21992f4);
                                            d16VarM21992f4 = null;
                                        }
                                        x66Var4.m24305c(d16Var6);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        d16VarM21992f4 = te1.m21992f(x66Var4);
                    }
                    if (arrayList2 != null) {
                        int size4 = arrayList2.size();
                        for (int i8 = 0; i8 < size4; i8++) {
                            ((C0390b) arrayList2.get(i8)).getClass();
                        }
                    }
                }
            }
        }
        if (!motionEvent.isFromSource(2097152)) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        z34 z34Var2 = this.f4690d;
        b36 b36Var = this.f4687b0;
        tk5 tk5Var = b36Var.f7870e;
        SparseLongArray sparseLongArray = b36Var.f7867b;
        int actionMasked = motionEvent.getActionMasked();
        b36Var.m3265b(motionEvent);
        if (actionMasked == 3) {
            sparseLongArray.clear();
            b36Var.f7868c.clear();
            i = 2097152;
            str = "visitAncestors called on an unattached node";
            c3299li = null;
        } else {
            b36Var.m3264a(motionEvent);
            int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
            if (actionMasked == 0 || actionMasked == 2) {
                i = 2097152;
            } else {
                i = 2097152;
                z = actionMasked == 5;
                pointerCount = motionEvent.getPointerCount();
                arrayList = new ArrayList(pointerCount);
                i2 = 0;
                while (i2 < pointerCount) {
                    pointerId = motionEvent.getPointerId(i2);
                    iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        jValueAt = b36Var.f7866a;
                        b36Var.f7866a = jValueAt + 1;
                        sparseLongArray.put(pointerId, jValueAt);
                    }
                    b36 b36Var2 = b36Var;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getY(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i2))) << 32);
                    if (i2 != actionIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    a36Var = (a36) tk5Var.m22176b(jValueAt);
                    if (i2 == actionIndex) {
                        tk5Var.m22181g(jValueAt);
                    } else {
                        if (z != 0) {
                            j = jValueAt;
                            tk5Var.m22180f(a36.m68a(a36.m69b(motionEvent.getEventTime(), jFloatToRawIntBits)), j);
                        }
                        long eventTime2 = motionEvent.getEventTime();
                        float pressure = motionEvent.getPressure(i2);
                        if (a36Var != null) {
                            eventTime = a36.m72e(a36Var.m73f());
                        } else {
                            eventTime = motionEvent.getEventTime();
                        }
                        long j2 = eventTime;
                        if (a36Var != null) {
                            jM71d = a36.m71d(a36Var.m73f());
                        } else {
                            jM71d = jFloatToRawIntBits;
                        }
                        if (a36Var != null) {
                            zM70c = a36.m70c(a36Var.m73f());
                        } else {
                            zM70c = false;
                        }
                        arrayList.add(new a44(j, eventTime2, jFloatToRawIntBits, z2, pressure, j2, jM71d, zM70c));
                        i2++;
                        arrayList = arrayList;
                        str2 = str2;
                        b36Var = b36Var2;
                        z34Var2 = z34Var2;
                        z = z;
                    }
                    j = jValueAt;
                    long eventTime3 = motionEvent.getEventTime();
                    float pressure2 = motionEvent.getPressure(i2);
                    if (a36Var != null) {
                        eventTime = a36.m72e(a36Var.m73f());
                    } else {
                        eventTime = motionEvent.getEventTime();
                    }
                    long j3 = eventTime;
                    if (a36Var != null) {
                        jM71d = a36.m71d(a36Var.m73f());
                    } else {
                        jM71d = jFloatToRawIntBits;
                    }
                    if (a36Var != null) {
                        zM70c = a36.m70c(a36Var.m73f());
                    } else {
                        zM70c = false;
                    }
                    arrayList.add(new a44(j, eventTime3, jFloatToRawIntBits, z2, pressure2, j3, jM71d, zM70c));
                    i2++;
                    arrayList = arrayList;
                    str2 = str2;
                    b36Var = b36Var2;
                    z34Var2 = z34Var2;
                    z = z;
                }
                z34Var = z34Var2;
                str = str2;
                ArrayList arrayList3 = arrayList;
                b36Var.m3268e(motionEvent);
                if (z34Var != null) {
                    iM21012b = z34Var.f70830a;
                } else {
                    iM21012b = s2d.m21012b(motionEvent);
                }
                c3299li = new C3299li(arrayList3, iM21012b, motionEvent);
            }
            pointerCount = motionEvent.getPointerCount();
            arrayList = new ArrayList(pointerCount);
            i2 = 0;
            while (i2 < pointerCount) {
                pointerId = motionEvent.getPointerId(i2);
                iIndexOfKey = sparseLongArray.indexOfKey(pointerId);
                if (iIndexOfKey >= 0) {
                    jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                } else {
                    jValueAt = b36Var.f7866a;
                    b36Var.f7866a = jValueAt + 1;
                    sparseLongArray.put(pointerId, jValueAt);
                }
                b36 b36Var3 = b36Var;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getY(i2))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i2))) << 32);
                if (i2 != actionIndex) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                a36Var = (a36) tk5Var.m22176b(jValueAt);
                if (i2 == actionIndex) {
                    tk5Var.m22181g(jValueAt);
                } else {
                    if (z != 0) {
                        j = jValueAt;
                        tk5Var.m22180f(a36.m68a(a36.m69b(motionEvent.getEventTime(), jFloatToRawIntBits)), j);
                    }
                    long eventTime4 = motionEvent.getEventTime();
                    float pressure3 = motionEvent.getPressure(i2);
                    if (a36Var != null) {
                        eventTime = a36.m72e(a36Var.m73f());
                    } else {
                        eventTime = motionEvent.getEventTime();
                    }
                    long j4 = eventTime;
                    if (a36Var != null) {
                        jM71d = a36.m71d(a36Var.m73f());
                    } else {
                        jM71d = jFloatToRawIntBits;
                    }
                    if (a36Var != null) {
                        zM70c = a36.m70c(a36Var.m73f());
                    } else {
                        zM70c = false;
                    }
                    arrayList.add(new a44(j, eventTime4, jFloatToRawIntBits, z2, pressure3, j4, jM71d, zM70c));
                    i2++;
                    arrayList = arrayList;
                    str2 = str2;
                    b36Var = b36Var3;
                    z34Var2 = z34Var2;
                    z = z;
                }
                j = jValueAt;
                long eventTime5 = motionEvent.getEventTime();
                float pressure4 = motionEvent.getPressure(i2);
                if (a36Var != null) {
                    eventTime = a36.m72e(a36Var.m73f());
                } else {
                    eventTime = motionEvent.getEventTime();
                }
                long j5 = eventTime;
                if (a36Var != null) {
                    jM71d = a36.m71d(a36Var.m73f());
                } else {
                    jM71d = jFloatToRawIntBits;
                }
                if (a36Var != null) {
                    zM70c = a36.m70c(a36Var.m73f());
                } else {
                    zM70c = false;
                }
                arrayList.add(new a44(j, eventTime5, jFloatToRawIntBits, z2, pressure4, j5, jM71d, zM70c));
                i2++;
                arrayList = arrayList;
                str2 = str2;
                b36Var = b36Var3;
                z34Var2 = z34Var2;
                z = z;
            }
            z34Var = z34Var2;
            str = str2;
            ArrayList arrayList4 = arrayList;
            b36Var.m3268e(motionEvent);
            if (z34Var != null) {
                iM21012b = z34Var.f70830a;
            } else {
                iM21012b = s2d.m21012b(motionEvent);
            }
            c3299li = new C3299li(arrayList4, iM21012b, motionEvent);
        }
        i44 i44Var = this.f4669R0;
        if (c3299li == null) {
            C0302d c0302dM1362h = ((C0301c) getFocusOwner()).m1362h();
            if (c0302dM1362h != null) {
                if (!c0302dM1362h.f34837a.f34836I) {
                    i54.m13663b(str);
                }
                d16 d16Var7 = c0302dM1362h.f34837a;
                C0357g c0357gM21979L3 = te1.m21979L(c0302dM1362h);
                loop26: while (true) {
                    if (c0357gM21979L3 == null) {
                        M21992f = 0;
                        break;
                    }
                    if ((((d16) c0357gM21979L3.f4335a0.f46679g).f34840d & i) != 0) {
                        while (d16Var7 != null) {
                            if ((d16Var7.f34839c & i) != 0) {
                                M21992f = d16Var7;
                                ?? r5 = 0;
                                while (M21992f != 0) {
                                    if (M21992f instanceof h44) {
                                        break loop26;
                                    }
                                    if ((M21992f.f34839c & i) != 0 && (M21992f instanceof fa2)) {
                                        d16 d16Var8 = ((fa2) M21992f).f38701K;
                                        ?? x66Var5 = r5;
                                        ?? r6 = M21992f;
                                        int i9 = 0;
                                        while (d16Var8 != null) {
                                            if ((d16Var8.f34839c & i) != 0) {
                                                i9++;
                                                if (i9 == 1) {
                                                    x66Var5 = x66Var5;
                                                    r6 = d16Var8;
                                                } else {
                                                    if (x66Var5 == 0) {
                                                        x66Var5 = new x66(new d16[16]);
                                                    }
                                                    if (r6 != 0) {
                                                        x66Var5.m24305c(r6);
                                                        r6 = 0;
                                                    }
                                                    x66Var5.m24305c(d16Var8);
                                                }
                                            }
                                            d16Var8 = d16Var8.f34842f;
                                            r6 = r6;
                                            x66Var5 = x66Var5;
                                        }
                                        if (i9 == 1) {
                                            M21992f = r6;
                                            r5 = x66Var5;
                                        } else {
                                            r5 = x66Var5;
                                        }
                                    }
                                    M21992f = te1.m21992f(r5);
                                }
                            }
                            d16Var7 = d16Var7.f34841e;
                        }
                    }
                    c0357gM21979L3 = c0357gM21979L3.m1610w();
                    d16Var7 = (c0357gM21979L3 == null || (k40Var2 = c0357gM21979L3.f4335a0) == null) ? null : (ir9) k40Var2.f46678f;
                }
                h44Var = (h44) M21992f;
            } else {
                h44Var = null;
            }
            if (h44Var != null) {
                d16 d16Var9 = (d16) h44Var;
                if (!d16Var9.f34837a.f34836I) {
                    i54.m13663b(str);
                }
                d16 d16Var10 = d16Var9.f34837a.f34841e;
                C0357g c0357gM21979L4 = te1.m21979L(h44Var);
                ArrayList arrayList5 = null;
                while (c0357gM21979L4 != null) {
                    if ((((d16) c0357gM21979L4.f4335a0.f46679g).f34840d & i) != 0) {
                        while (d16Var10 != null) {
                            if ((d16Var10.f34839c & i) != 0) {
                                d16 d16VarM21992f5 = d16Var10;
                                x66 x66Var6 = null;
                                while (d16VarM21992f5 != null) {
                                    if (d16VarM21992f5 instanceof h44) {
                                        if (arrayList5 == null) {
                                            arrayList5 = new ArrayList();
                                        }
                                        arrayList5.add(d16VarM21992f5);
                                        arrayList5 = arrayList5;
                                        z3 = false;
                                    } else {
                                        arrayList5 = arrayList5;
                                        z3 = true;
                                    }
                                    if (z3 && (d16VarM21992f5.f34839c & i) != 0 && (d16VarM21992f5 instanceof fa2)) {
                                        x66 x66Var7 = x66Var6;
                                        d16 d16Var11 = d16VarM21992f5;
                                        int i10 = 0;
                                        for (d16 d16Var12 = ((fa2) d16VarM21992f5).f38701K; d16Var12 != null; d16Var12 = d16Var12.f34842f) {
                                            if ((d16Var12.f34839c & i) != 0) {
                                                i10++;
                                                if (i10 == 1) {
                                                    d16Var11 = d16Var12;
                                                } else {
                                                    if (x66Var7 == null) {
                                                        x66Var7 = new x66(new d16[16]);
                                                    }
                                                    if (d16Var11 != null) {
                                                        x66Var7.m24305c(d16Var11);
                                                        d16Var11 = null;
                                                    }
                                                    x66Var7.m24305c(d16Var12);
                                                }
                                            }
                                        }
                                        if (i10 == 1) {
                                            d16VarM21992f5 = d16Var11;
                                            x66Var6 = x66Var7;
                                        } else {
                                            x66Var6 = x66Var7;
                                            d16VarM21992f5 = te1.m21992f(x66Var6);
                                        }
                                    } else {
                                        d16VarM21992f5 = te1.m21992f(x66Var6);
                                    }
                                }
                            }
                            d16Var10 = d16Var10.f34841e;
                        }
                    }
                    c0357gM21979L4 = c0357gM21979L4.m1610w();
                    d16Var10 = (c0357gM21979L4 == null || (k40Var = c0357gM21979L4.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                }
                h44Var.mo820k0();
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i11 = 0; i11 < size5; i11++) {
                        ((h44) arrayList5.get(i11)).mo820k0();
                    }
                }
            }
            i44Var.f43481b = 0;
            i44Var.f43480a = true;
            return true;
        }
        C0301c c0301c2 = (C0301c) getFocusOwner();
        if (!c0301c2.f3909d.f3905e) {
            C0302d c0302dM1362h2 = c0301c2.m1362h();
            if (c0302dM1362h2 != null) {
                if (!c0302dM1362h2.f34837a.f34836I) {
                    i54.m13663b(str);
                }
                d16 d16Var13 = c0302dM1362h2.f34837a;
                C0357g c0357gM21979L5 = te1.m21979L(c0302dM1362h2);
                loop14: while (true) {
                    if (c0357gM21979L5 == null) {
                        obj = null;
                        break;
                    }
                    if ((((d16) c0357gM21979L5.f4335a0.f46679g).f34840d & i) != 0) {
                        while (d16Var13 != null) {
                            if ((d16Var13.f34839c & i) != 0) {
                                d16 d16VarM21992f6 = d16Var13;
                                x66 x66Var8 = null;
                                while (d16VarM21992f6 != null) {
                                    if (d16VarM21992f6 instanceof h44) {
                                        obj = d16VarM21992f6;
                                        break loop14;
                                    }
                                    if ((d16VarM21992f6.f34839c & i) != 0 && (d16VarM21992f6 instanceof fa2)) {
                                        int i12 = 0;
                                        x66 x66Var9 = x66Var8;
                                        d16 d16Var14 = d16VarM21992f6;
                                        for (d16 d16Var15 = ((fa2) d16VarM21992f6).f38701K; d16Var15 != null; d16Var15 = d16Var15.f34842f) {
                                            if ((d16Var15.f34839c & i) != 0) {
                                                i12++;
                                                if (i12 == 1) {
                                                    d16Var14 = d16Var15;
                                                } else {
                                                    if (x66Var9 == null) {
                                                        x66Var9 = new x66(new d16[16]);
                                                    }
                                                    if (d16Var14 != null) {
                                                        x66Var9.m24305c(d16Var14);
                                                        d16Var14 = null;
                                                    }
                                                    x66Var9.m24305c(d16Var15);
                                                }
                                            }
                                        }
                                        if (i12 == 1) {
                                            d16VarM21992f6 = d16Var14;
                                            x66Var8 = x66Var9;
                                        } else {
                                            x66Var8 = x66Var9;
                                        }
                                    }
                                    d16VarM21992f6 = te1.m21992f(x66Var8);
                                }
                            }
                            d16Var13 = d16Var13.f34841e;
                        }
                    }
                    c0357gM21979L5 = c0357gM21979L5.m1610w();
                    d16Var13 = (c0357gM21979L5 == null || (k40Var4 = c0357gM21979L5.f4335a0) == null) ? null : (ir9) k40Var4.f46678f;
                }
                h44Var2 = (h44) obj;
            } else {
                h44Var2 = null;
            }
            if (h44Var2 != null) {
                d16 d16Var16 = (d16) h44Var2;
                if (!d16Var16.f34837a.f34836I) {
                    i54.m13663b(str);
                }
                d16 d16Var17 = d16Var16.f34837a.f34841e;
                C0357g c0357gM21979L6 = te1.m21979L(h44Var2);
                ArrayList arrayList6 = null;
                while (c0357gM21979L6 != null) {
                    if ((((d16) c0357gM21979L6.f4335a0.f46679g).f34840d & i) != 0) {
                        while (d16Var17 != null) {
                            if ((d16Var17.f34839c & i) != 0) {
                                d16 d16VarM21992f7 = d16Var17;
                                x66 x66Var10 = null;
                                while (d16VarM21992f7 != null) {
                                    if (d16VarM21992f7 instanceof h44) {
                                        if (arrayList6 == null) {
                                            arrayList6 = new ArrayList();
                                        }
                                        arrayList6.add(d16VarM21992f7);
                                        z5 = false;
                                    } else {
                                        z5 = true;
                                    }
                                    if (z5 && (d16VarM21992f7.f34839c & i) != 0 && (d16VarM21992f7 instanceof fa2)) {
                                        int i13 = 0;
                                        for (d16 d16Var18 = ((fa2) d16VarM21992f7).f38701K; d16Var18 != null; d16Var18 = d16Var18.f34842f) {
                                            if ((d16Var18.f34839c & i) != 0) {
                                                i13++;
                                                if (i13 == 1) {
                                                    d16VarM21992f7 = d16Var18;
                                                } else {
                                                    if (x66Var10 == null) {
                                                        x66Var10 = new x66(new d16[16]);
                                                    }
                                                    if (d16VarM21992f7 != null) {
                                                        x66Var10.m24305c(d16VarM21992f7);
                                                        d16VarM21992f7 = null;
                                                    }
                                                    x66Var10.m24305c(d16Var18);
                                                }
                                            }
                                        }
                                        if (i13 == 1) {
                                        }
                                    }
                                    d16VarM21992f7 = te1.m21992f(x66Var10);
                                }
                            }
                            d16Var17 = d16Var17.f34841e;
                        }
                    }
                    c0357gM21979L6 = c0357gM21979L6.m1610w();
                    d16Var17 = (c0357gM21979L6 == null || (k40Var3 = c0357gM21979L6.f4335a0) == null) ? null : (ir9) k40Var3.f46678f;
                }
                if (arrayList6 != null && (size2 = arrayList6.size() - 1) >= 0) {
                    while (true) {
                        int i14 = size2 - 1;
                        ((h44) arrayList6.get(size2)).mo819e0(c3299li, PointerEventPass.Initial);
                        if (i14 < 0) {
                            break;
                        }
                        size2 = i14;
                    }
                }
                h44Var2.mo819e0(c3299li, PointerEventPass.Initial);
                h44Var2.mo819e0(c3299li, PointerEventPass.Main);
                if (arrayList6 != null) {
                    int size6 = arrayList6.size();
                    for (int i15 = 0; i15 < size6; i15++) {
                        ((h44) arrayList6.get(i15)).mo819e0(c3299li, PointerEventPass.Main);
                    }
                }
                if (arrayList6 != null && (size = arrayList6.size() - 1) >= 0) {
                    while (true) {
                        int i16 = size - 1;
                        ((h44) arrayList6.get(size)).mo819e0(c3299li, PointerEventPass.Final);
                        if (i16 < 0) {
                            break;
                        }
                        size = i16;
                    }
                }
                h44Var2.mo819e0(c3299li, PointerEventPass.Final);
            }
            List listM16226d = c3299li.m16226d();
            int size7 = listM16226d.size();
            int i17 = 0;
            while (true) {
                if (i17 < size7) {
                    if (((a44) ((ArrayList) listM16226d).get(i17)).m108h()) {
                        z4 = true;
                        break;
                    }
                    i17++;
                }
            }
            i44Var.getClass();
            MotionEvent motionEventM21011a = s2d.m21011a(c3299li);
            action = motionEventM21011a.getAction();
            if (action != 0) {
                z6 = true;
                if ((action != 1 || action == 2) && z4) {
                    i44Var.f43481b = 0;
                    i44Var.f43480a = true;
                }
            } else {
                z6 = true;
                i44Var.f43481b = c3299li.m16227e();
                i44Var.f43480a = false;
            }
            ((GestureDetector) i44Var.f43483d).onTouchEvent(motionEventM21011a);
            return z6;
        }
        System.out.println((Object) "FocusRelatedWarning: Dispatching indirect pointer event while the focus system is invalidated.");
        z4 = false;
        i44Var.getClass();
        MotionEvent motionEventM21011a2 = s2d.m21011a(c3299li);
        action = motionEventM21011a2.getAction();
        if (action != 0) {
            z6 = true;
            if (action != 1) {
                i44Var.f43481b = 0;
                i44Var.f43480a = true;
            } else {
                i44Var.f43481b = 0;
                i44Var.f43480a = true;
            }
        } else {
            z6 = true;
            i44Var.f43481b = c3299li.m16227e();
            i44Var.f43480a = false;
        }
        ((GestureDetector) i44Var.f43483d).onTouchEvent(motionEventM21011a2);
        return z6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x016b, code lost:
    
        if (m1751u(r25) == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        boolean zDispatchGenericMotionEvent;
        int iM1770A;
        boolean z = this.f4667Q0;
        RunnableC3647ug runnableC3647ug = this.f4665P0;
        if (z) {
            removeCallbacks(runnableC3647ug);
            runnableC3647ug.run();
        }
        if (!m1725s(motionEvent) && isAttachedToWindow()) {
            ViewOnAttachStateChangeListenerC0393e viewOnAttachStateChangeListenerC0393e = this.f4666Q;
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = viewOnAttachStateChangeListenerC0393e.f4746d;
            AccessibilityManager accessibilityManager = viewOnAttachStateChangeListenerC0393e.f4752g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action == 7 || action == 9) {
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    viewTreeObserverOnGlobalLayoutListenerC0391c.m1754x(true);
                    cu3 cu3Var = new cu3();
                    i = 1;
                    C0357g root = viewTreeObserverOnGlobalLayoutListenerC0391c.getRoot();
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
                    k40 k40Var = root.f4335a0;
                    AbstractC0362l abstractC0362l = (AbstractC0362l) k40Var.f46677e;
                    q98 q98Var = AbstractC0362l.f4427i0;
                    ((AbstractC0362l) k40Var.f46677e).m1689k1(AbstractC0362l.f4431m0, abstractC0362l.m1679c1(jFloatToRawIntBits), cu3Var, 1, true);
                    h66 h66Var = cu3Var.f34537a;
                    int i2 = h66Var.f1294b;
                    while (true) {
                        i2--;
                        if (-1 < i2) {
                            Object objM717b = h66Var.m717b(i2);
                            objM717b.getClass();
                            C0357g c0357gM21979L = te1.m21979L((d16) objM717b);
                            if (viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(c0357gM21979L) == null) {
                                if (c0357gM21979L.f4335a0.m14799f(8)) {
                                    iM1770A = viewOnAttachStateChangeListenerC0393e.m1770A(c0357gM21979L.f4336b);
                                    C0423c c0423cM19511g = pvc.m19511g(c0357gM21979L, false);
                                    if (xwc.m24736I(c0423cM19511g)) {
                                        if (!c0423cM19511g.m1849k().f48471a.m17251c(AbstractC0424d.f4978B)) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                        iM1770A = Integer.MIN_VALUE;
                        break;
                    }
                    boolean zDispatchGenericMotionEvent2 = viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                    int i3 = viewOnAttachStateChangeListenerC0393e.f4748e;
                    if (i3 != iM1770A) {
                        viewOnAttachStateChangeListenerC0393e.f4748e = iM1770A;
                        ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, iM1770A, 128, null, 12);
                        ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i3, 256, null, 12);
                    }
                    zDispatchGenericMotionEvent = iM1770A == Integer.MIN_VALUE ? zDispatchGenericMotionEvent2 : true;
                } else {
                    if (action != 10) {
                        zDispatchGenericMotionEvent = false;
                    } else {
                        int i4 = viewOnAttachStateChangeListenerC0393e.f4748e;
                        if (i4 != Integer.MIN_VALUE) {
                            if (i4 != Integer.MIN_VALUE) {
                                viewOnAttachStateChangeListenerC0393e.f4748e = Integer.MIN_VALUE;
                                ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, Integer.MIN_VALUE, 128, null, 12);
                                ViewOnAttachStateChangeListenerC0393e.m1761E(viewOnAttachStateChangeListenerC0393e, i4, 256, null, 12);
                            }
                            zDispatchGenericMotionEvent = true;
                            i = 1;
                        } else {
                            zDispatchGenericMotionEvent = viewTreeObserverOnGlobalLayoutListenerC0391c.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                    i = 1;
                }
            } else {
                i = 1;
                zDispatchGenericMotionEvent = false;
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m1750t(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f4647G0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f4647G0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f4667Q0 = i;
                        postDelayed(runnableC3647ug, 8L);
                        return zDispatchGenericMotionEvent;
                    }
                    return zDispatchGenericMotionEvent;
                }
                if ((m1748l(motionEvent) & i) != 0 || zDispatchGenericMotionEvent) {
                    return i;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (!isFocused()) {
            return ((C0301c) getFocusOwner()).m1360f(keyEvent, new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$dispatchKeyEvent$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    return Boolean.valueOf(super/*android.view.ViewGroup*/.dispatchKeyEvent(keyEvent));
                }
            });
        }
        nw4 nw4Var = getComposeViewContext().f4804s;
        int metaState = keyEvent.getMetaState();
        nw4Var.getClass();
        ((xc9) b5b.f7978a).setValue(new qg7(metaState));
        return ((C0301c) getFocusOwner()).m1360f(keyEvent, FocusOwner$dispatchKeyEvent$1.f3877b) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        k40 k40Var;
        if (isFocused()) {
            C0301c c0301c = (C0301c) getFocusOwner();
            if (c0301c.f3909d.f3905e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C0302d c0302dM23497h = AbstractC3695vr.m23497h(c0301c.f3908c);
                if (c0302dM23497h != null) {
                    if (!c0302dM23497h.f34837a.f34836I) {
                        i54.m13663b("visitAncestors called on an unattached node");
                    }
                    d16 d16Var = c0302dM23497h.f34837a;
                    C0357g c0357gM21979L = te1.m21979L(c0302dM23497h);
                    while (c0357gM21979L != null) {
                        if ((((d16) c0357gM21979L.f4335a0.f46679g).f34840d & 131072) != 0) {
                            while (d16Var != null) {
                                if ((d16Var.f34839c & 131072) != 0) {
                                    d16 d16VarM21992f = d16Var;
                                    x66 x66Var = null;
                                    while (d16VarM21992f != null) {
                                        if ((d16VarM21992f.f34839c & 131072) != 0 && (d16VarM21992f instanceof fa2)) {
                                            int i = 0;
                                            for (d16 d16Var2 = ((fa2) d16VarM21992f).f38701K; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                                                if ((d16Var2.f34839c & 131072) != 0) {
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
                                }
                                d16Var = d16Var.f34841e;
                            }
                        }
                        c0357gM21979L = c0357gM21979L.m1610w();
                        d16Var = (c0357gM21979L == null || (k40Var = c0357gM21979L.f4335a0) == null) ? null : (ir9) k40Var.f46678f;
                    }
                }
            }
        }
        return super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        this.f4680X0 = true;
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            this.f4680X0 = false;
            m1732H(viewStructure);
        } catch (Throwable th) {
            this.f4680X0 = false;
            throw th;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) throws Throwable {
        Object objM19582a;
        C0302d c0302dM1362h;
        if (this.f4667Q0) {
            RunnableC3647ug runnableC3647ug = this.f4665P0;
            removeCallbacks(runnableC3647ug);
            MotionEvent motionEvent2 = this.f4647G0;
            motionEvent2.getClass();
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f4667Q0 = false;
            } else {
                runnableC3647ug.run();
            }
        }
        if (!m1725s(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m1751u(motionEvent))) {
            int iM1748l = m1748l(motionEvent);
            if ((iM1748l & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            boolean z = motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5;
            boolean z2 = motionEvent.isFromSource(8194) || motionEvent.isFromSource(1048584);
            if (z && z2) {
                Object parent = getParent();
                View view = parent instanceof View ? (View) parent : null;
                if (view == null || (objM19582a = view.getTag(R$id.auto_clear_focus_behavior_tag)) == null) {
                    objM19582a = q00.m19582a(1);
                }
                if (objM19582a.equals(q00.m19582a(1)) && (c0302dM1362h = ((C0301c) getFocusOwner()).m1362h()) != null) {
                    AbstractC0362l abstractC0362lM21978K = te1.m21978K(c0302dM1362h);
                    if (!bq1.m4054e0(abstractC0362lM21978K).mo1670Q(abstractC0362lM21978K, true).m10800a((((long) Float.floatToRawIntBits(motionEvent.getX())) << 32) | (((long) Float.floatToRawIntBits(motionEvent.getY())) & 4294967295L))) {
                        InterfaceC0300b.m1355a(getFocusOwner());
                    }
                }
            }
            if ((iM1748l & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: e */
    public final void mo1326e(ub5 ub5Var) {
        yb5 yb5Var = this.f4694f;
        if (yb5Var != null) {
            ip5 ip5Var = (ip5) yb5Var.f69598a.f9881a;
            if (ip5Var.f44395a && !ip5Var.f44397c) {
                tm0 tm0Var = yb5Var.f69601d;
                if (tm0Var != null) {
                    tm0Var.cancel();
                }
                yb5Var.f69601d = null;
                return;
            }
            if (ip5Var.f44396b) {
                return;
            }
            if (!ip5Var.f44397c) {
                ii7.m13939a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
            }
            if (!ip5Var.f44398d.m17257i()) {
                ii7.m13939a("Attempted to start retaining exited values with pending exited values");
            }
            ip5Var.f44397c = false;
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i) throws IllegalAccessException, InvocationTargetException {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
        } catch (NoSuchMethodException unused) {
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        e28 e28VarM21165a;
        if (view == null || this.f4709n0.f39619c) {
            return super.focusSearch(view, i);
        }
        View rootView = getRootView();
        rootView.getClass();
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup) rootView, view, i);
        if (viewFindNextFocus == null || !AbstractC3184kh.m15208b(this, viewFindNextFocus)) {
            viewFindNextFocus = null;
        }
        if (view == this) {
            C0302d c0302dM23497h = AbstractC3695vr.m23497h(((C0301c) getFocusOwner()).f3908c);
            e28VarM21165a = c0302dM23497h != null ? AbstractC3695vr.m23500k(c0302dM23497h) : null;
            if (e28VarM21165a == null) {
                e28VarM21165a = s93.m21165a(view, this);
            }
        } else {
            e28VarM21165a = s93.m21165a(view, this);
        }
        o93 o93VarM21168d = s93.m21168d(i);
        int i2 = o93VarM21168d != null ? o93VarM21168d.f54076a : 6;
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        if (((C0301c) getFocusOwner()).m1361g(i2, e28VarM21165a, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$focusSearch$searchResult$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ref$ObjectRef.f47718a = (C0302d) obj;
                return Boolean.TRUE;
            }
        }) == null) {
            return view;
        }
        Object obj = ref$ObjectRef.f47718a;
        if (obj == null) {
            if (viewFindNextFocus == null) {
                return super.focusSearch(view, i);
            }
        } else if (viewFindNextFocus == null || i2 == 1 || i2 == 2 || AbstractC0304f.m1390j(AbstractC3695vr.m23500k((C0302d) obj), s93.m21165a(viewFindNextFocus, this), e28VarM21165a, i2)) {
            return this;
        }
        return viewFindNextFocus;
    }

    public InterfaceC3483q3 getAccessibilityManager() {
        return getComposeViewContext().f4795j;
    }

    public final C3464pl getAndroidViewsHandler$ui() {
        if (this.f4705k0 == null) {
            C3464pl c3464pl = new C3464pl(getContext());
            this.f4705k0 = c3464pl;
            addView(c3464pl, -1);
            requestLayout();
        }
        C3464pl c3464pl2 = this.f4705k0;
        c3464pl2.getClass();
        return c3464pl2;
    }

    public w50 getAutofill() {
        return this.f4695f0;
    }

    public z50 getAutofillManager() {
        return this.f4697g0;
    }

    public a60 getAutofillTree() {
        return this.f4672T;
    }

    public t31 getClipboard() {
        return getComposeViewContext().f4798m;
    }

    public u31 getClipboardManager() {
        return getComposeViewContext().f4797l;
    }

    public final C0401m getComposeViewContext() {
        return get_composeViewContext();
    }

    public final boolean getComposeViewContextIncrementedDuringInit$ui() {
        return this.f4679W0;
    }

    public final Configuration getConfiguration() {
        return (Configuration) ((xc9) this.f4691d0).getValue();
    }

    public final ViewOnAttachStateChangeListenerC0291c getContentCaptureManager$ui() {
        return this.f4668R;
    }

    public kn1 getCoroutineContext() {
        return this.f4648H;
    }

    public fb2 getDensity() {
        return (fb2) ((xc9) this.f4702j).getValue();
    }

    public e28 getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C0302d c0302dM23497h = AbstractC3695vr.m23497h(((C0301c) getFocusOwner()).f3908c);
            if (c0302dM23497h != null) {
                return AbstractC3695vr.m23500k(c0302dM23497h);
            }
            return null;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus != null) {
            return s93.m21165a(viewFindFocus, this);
        }
        return null;
    }

    public InterfaceC0300b getFocusOwner() {
        return this.f4706l;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        e28 embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f36620a);
            rect.top = Math.round(embeddedViewFocusRect.f36621b);
            rect.right = Math.round(embeddedViewFocusRect.f36622c);
            rect.bottom = Math.round(embeddedViewFocusRect.f36623d);
            return;
        }
        if (fa4.m11650l(((C0301c) getFocusOwner()).m1361g(6, null, AndroidComposeView$getFocusedRect$1.f4476b), Boolean.TRUE)) {
            super.getFocusedRect(rect);
        } else {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        }
    }

    public wa3 getFontFamilyResolver() {
        return (wa3) this.f4642B0.getValue();
    }

    public pa3 getFontLoader() {
        return getComposeViewContext().f4799n;
    }

    public final xb5 getFrameEndScheduler$ui() {
        return this.f4692e;
    }

    public qp3 getGraphicsContext() {
        return this.f4670S;
    }

    public dr3 getHapticFeedBack() {
        return getComposeViewContext().f4801p;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f4709n0.f39618b.m16486D() || !this.f4698h.isEmpty();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public e64 getInputModeManager() {
        e64 e64Var = this.f4644D0;
        if (e64Var == null) {
            e64Var = new e64(isInTouchMode() ? 1 : 2);
            this.f4644D0 = e64Var;
        }
        return e64Var;
    }

    public final p64 getInsetsListener() {
        return this.f4656L;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui() {
        return this.f4715t0;
    }

    @Override // android.view.View, android.view.ViewParent
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) ((xc9) this.f4643C0).getValue();
    }

    public xi5 getLocaleList() {
        return (xi5) this.f4693e0.getValue();
    }

    public long getMeasureIteration() {
        ft5 ft5Var = this.f4709n0;
        if (!ft5Var.f39619c) {
            i54.m13662a("measureIteration should be only used during the measure/layout pass");
        }
        return ft5Var.f39623g;
    }

    public g16 getModifierLocalManager() {
        return this.f4645E0;
    }

    /* JADX INFO: renamed from: getOutOfFrameExecutor, reason: merged with bridge method [inline-methods] */
    public ViewTreeObserverOnGlobalLayoutListenerC0391c m25913getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    public AbstractC0343j getPlacementScope() {
        int i = m87.f50758b;
        return new xk5(this, 1);
    }

    public jg7 getPointerIconService() {
        return this.f4685a1;
    }

    /* JADX INFO: renamed from: getPrimaryDirectionalMotionAxisOverride-dqNNBbU$ui, reason: not valid java name */
    public final z34 m25908getPrimaryDirectionalMotionAxisOverridedqNNBbU$ui() {
        return this.f4690d;
    }

    public C0429a getRectManager() {
        return this.f4662O;
    }

    public m98 getRetainedValuesStore() {
        return this.f4696g;
    }

    public C0357g getRoot() {
        return this.f4658M;
    }

    public gi8 getRootForTest() {
        return this;
    }

    public final boolean getScrollCaptureInProgress$ui() {
        C0420d c0420d;
        if (Build.VERSION.SDK_INT < 31 || (c0420d = this.f4681Y0) == null) {
            return false;
        }
        return ((Boolean) ((xc9) c0420d.f4916a).getValue()).booleanValue();
    }

    public sv8 getSemanticsOwner() {
        return this.f4664P;
    }

    public C0358h getSharedDrawScope() {
        return getComposeViewContext().f4803r;
    }

    public boolean getShowLayoutBounds() {
        return Build.VERSION.SDK_INT >= 30 ? C3839zn.f71788a.m25702a(this) : this.f4703j0;
    }

    public C0364n getSnapshotObserver() {
        return this.f4701i0;
    }

    public ld9 getSoftwareKeyboardController() {
        pa2 pa2Var = this.f4641A0;
        if (pa2Var != null) {
            return pa2Var;
        }
        pa2 pa2Var2 = new pa2(getTextInputService());
        this.f4641A0 = pa2Var2;
        return pa2Var2;
    }

    public fw9 getTextInputService() {
        fw9 fw9Var = this.f4720y0;
        if (fw9Var != null) {
            return fw9Var;
        }
        fw9 fw9Var2 = new fw9(getLegacyTextInputServiceAndroid());
        this.f4720y0 = fw9Var2;
        return fw9Var2;
    }

    public xx9 getTextToolbar() {
        return this.f4646F0;
    }

    public final fi8 getUncaughtExceptionHandler$ui() {
        return null;
    }

    public View getView() {
        return this;
    }

    public hta getViewConfiguration() {
        return getComposeViewContext().f4802q;
    }

    public a5b getWindowInfo() {
        return getComposeViewContext().f4804s;
    }

    public final C3408og get_autofillManager$ui() {
        return this.f4697g0;
    }

    /* JADX INFO: renamed from: j */
    public final b17 m1746j(zi3 zi3Var, ui3 ui3Var, C0312a c0312a) {
        x66 x66Var;
        Reference referencePoll;
        Object obj;
        if (c0312a != null) {
            return new C0403o(c0312a, null, this, zi3Var, ui3Var);
        }
        do {
            qfa qfaVar = this.f4651I0;
            ReferenceQueue referenceQueue = (ReferenceQueue) qfaVar.f57706b;
            x66Var = (x66) qfaVar.f57705a;
            referencePoll = referenceQueue.poll();
            if (referencePoll != null) {
                x66Var.m24313k(referencePoll);
            }
        } while (referencePoll != null);
        do {
            int i = x66Var.f67832c;
            if (i == 0) {
                obj = null;
                break;
            }
            obj = ((Reference) x66Var.m24314l(i - 1)).get();
        } while (obj == null);
        b17 b17Var = (b17) obj;
        if (b17Var == null) {
            return new C0403o(getGraphicsContext().mo14487c(), getGraphicsContext(), this, zi3Var, ui3Var);
        }
        C0403o c0403o = (C0403o) b17Var;
        qp3 qp3Var = c0403o.f4844b;
        if (qp3Var == null) {
            throw AbstractC3393o1.m17745t("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!c0403o.f4843a.f3995s) {
            i54.m13662a("layer should have been released before reuse");
        }
        c0403o.f4843a = qp3Var.mo14487c();
        c0403o.f4849g = false;
        c0403o.f4846d = zi3Var;
        c0403o.f4847e = ui3Var;
        c0403o.f4838L = false;
        c0403o.f4839M = false;
        c0403o.f4840N = true;
        ts5.m22289d(c0403o.f4850h);
        float[] fArr = c0403o.f4851i;
        if (fArr != null) {
            ts5.m22289d(fArr);
        }
        c0403o.f4836J = k9a.f46915b;
        c0403o.f4841O = false;
        c0403o.f4848f = 9223372034707292159L;
        c0403o.f4837K = null;
        c0403o.f4835I = 0;
        return b17Var;
    }

    /* JADX INFO: renamed from: k */
    public final void m1747k(C0357g c0357g, boolean z) {
        this.f4709n0.m12131g(c0357g, z);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0146  */
    /* JADX WARN: Code duplicated, block: B:103:0x014b A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x015a  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:110:0x015f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0163 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0175 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0178 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0189 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #3 {all -> 0x007b, blocks: (B:14:0x0039, B:16:0x0043, B:22:0x0053, B:38:0x0082, B:40:0x0086, B:41:0x0098, B:50:0x00ab, B:52:0x00b1, B:119:0x0189, B:120:0x0195, B:25:0x005b, B:31:0x0067, B:34:0x006f), top: B:149:0x0039 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:128:0x01af A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:121:0x0199, B:124:0x01a3, B:126:0x01a7, B:128:0x01af, B:130:0x01b9, B:129:0x01b2), top: B:147:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x01b2 A[Catch: all -> 0x01ca, TryCatch #2 {all -> 0x01ca, blocks: (B:121:0x0199, B:124:0x01a3, B:126:0x01a7, B:128:0x01af, B:130:0x01b9, B:129:0x01b2), top: B:147:0x0199 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x00e1 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f2 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x0114 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:86:0x011a A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0126 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:91:0x012b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0130 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:4:0x001d, B:6:0x0026, B:54:0x00bd, B:56:0x00c4, B:64:0x00d5, B:66:0x00dd, B:68:0x00e1, B:69:0x00e4, B:71:0x00e8, B:73:0x00ee, B:75:0x00f2, B:77:0x00f8, B:80:0x0100, B:83:0x0108, B:84:0x0114, B:86:0x011a, B:88:0x0120, B:90:0x0126, B:92:0x012c, B:94:0x0130, B:95:0x0134, B:101:0x0147, B:103:0x014b, B:105:0x0152, B:112:0x0163, B:113:0x016d, B:115:0x0175, B:116:0x0178, B:117:0x017f), top: B:144:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    /* JADX INFO: renamed from: l */
    public final int m1748l(MotionEvent motionEvent) throws Throwable {
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c;
        int i;
        boolean z2;
        MotionEvent motionEvent3;
        int iM1739O;
        C0327a c0327a;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c2;
        MotionEvent motionEvent4;
        int pointerId;
        int action;
        b36 b36Var;
        MotionEvent motionEvent5;
        float x;
        float x2;
        boolean z3;
        MotionEvent motionEvent6;
        long eventTime;
        boolean z4;
        C0327a c0327a2;
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c3 = this;
        viewTreeObserverOnGlobalLayoutListenerC0391c3.removeCallbacks(viewTreeObserverOnGlobalLayoutListenerC0391c3.f4663O0);
        try {
            m1734J(motionEvent);
            viewTreeObserverOnGlobalLayoutListenerC0391c3.f4716u0 = true;
            viewTreeObserverOnGlobalLayoutListenerC0391c3.m1754x(false);
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent7 = viewTreeObserverOnGlobalLayoutListenerC0391c3.f4647G0;
                boolean z5 = motionEvent7 != null && motionEvent7.getToolType(0) == 3;
                pc0 pc0Var = viewTreeObserverOnGlobalLayoutListenerC0391c3.f4689c0;
                if (motionEvent7 == null) {
                    motionEvent2 = motionEvent7;
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = this;
                        i = 9;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = this;
                        i = 9;
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8) {
                        ref$BooleanRef.f47713a = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                    if (motionEvent3 != null) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        b36Var = viewTreeObserverOnGlobalLayoutListenerC0391c.f4687b0;
                        if (action == i) {
                            if (motionEvent.getAction() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent8 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                if (motionEvent8 != null) {
                                }
                                x2 = motionEvent.getX();
                                float y = motionEvent.getY();
                                if (x == x2) {
                                    z3 = true;
                                } else {
                                    z3 = true;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3) {
                                    if (pointerId >= 0) {
                                        b36Var.f7868c.delete(pointerId);
                                        b36Var.f7867b.delete(pointerId);
                                    }
                                    c0327a2 = (C0327a) pc0Var.f55939c;
                                    if (c0327a2.f4119d) {
                                        c0327a2.f4119d = true;
                                    } else {
                                        c0327a2.f4122g.f65569a.m24310h();
                                    }
                                } else {
                                    if (pointerId >= 0) {
                                        b36Var.f7868c.delete(pointerId);
                                        b36Var.f7867b.delete(pointerId);
                                    }
                                    c0327a2 = (C0327a) pc0Var.f55939c;
                                    if (c0327a2.f4119d) {
                                        c0327a2.f4119d = true;
                                    } else {
                                        c0327a2.f4122g.f65569a.m24310h();
                                    }
                                }
                            }
                        } else if (motionEvent.getAction() == 0) {
                            motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                            if (motionEvent5 != null) {
                                x = motionEvent5.getX();
                            } else {
                                x = Float.NaN;
                            }
                            MotionEvent motionEvent9 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                            if (motionEvent9 != null) {
                            }
                            x2 = motionEvent.getX();
                            float y2 = motionEvent.getY();
                            if (x == x2) {
                                z3 = true;
                            } else {
                                z3 = true;
                            }
                            motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                            if (motionEvent6 != null) {
                                eventTime = motionEvent6.getEventTime();
                            } else {
                                eventTime = -1;
                            }
                            if (eventTime != motionEvent.getEventTime()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z3) {
                                if (pointerId >= 0) {
                                    b36Var.f7868c.delete(pointerId);
                                    b36Var.f7867b.delete(pointerId);
                                }
                                c0327a2 = (C0327a) pc0Var.f55939c;
                                if (c0327a2.f4119d) {
                                    c0327a2.f4119d = true;
                                } else {
                                    c0327a2.f4122g.f65569a.m24310h();
                                }
                            } else {
                                if (pointerId >= 0) {
                                    b36Var.f7868c.delete(pointerId);
                                    b36Var.f7867b.delete(pointerId);
                                }
                                c0327a2 = (C0327a) pc0Var.f55939c;
                                if (c0327a2.f4119d) {
                                    c0327a2.f4119d = true;
                                } else {
                                    c0327a2.f4122g.f65569a.m24310h();
                                }
                            }
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (ref$BooleanRef.f47713a) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c.m1740P(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM1739O = m1739O(motionEvent);
                    Trace.endSection();
                    if ((iM1739O & 4) != 0) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c2 = this;
                    } else {
                        c0327a = (C0327a) pc0Var.f55939c;
                        if (c0327a.f4119d) {
                            c0327a.f4119d = true;
                        } else {
                            c0327a.f4122g.f65569a.m24310h();
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0391c2 = this;
                        viewTreeObserverOnGlobalLayoutListenerC0391c2.m1740P(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0391c2.f4716u0 = false;
                    return iM1739O;
                }
                try {
                    if (!((motionEvent7.getSource() == motionEvent.getSource() && motionEvent7.getToolType(0) == motionEvent.getToolType(0)) ? false : true)) {
                        motionEvent2 = motionEvent7;
                    } else if (motionEvent7.getButtonState() != 0 || (actionMasked = motionEvent7.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                        motionEvent2 = motionEvent7;
                        if (!pc0Var.f55937a) {
                            ((tk5) ((or3) pc0Var.f55940d).f54782a).m22175a();
                            ((C0327a) pc0Var.f55939c).m1455c();
                        }
                    } else if (motionEvent7.getActionMasked() == 10 || !z5) {
                        motionEvent2 = motionEvent7;
                    } else {
                        viewTreeObserverOnGlobalLayoutListenerC0391c3.m1740P(motionEvent7, 10, motionEvent7.getEventTime(), true);
                        motionEvent2 = motionEvent7;
                    }
                    if (motionEvent.getToolType(0) == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z5 || !z || actionMasked2 == 3 || actionMasked2 == 9 || !m1750t(motionEvent)) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c = this;
                        i = 9;
                    } else {
                        i = 9;
                        viewTreeObserverOnGlobalLayoutListenerC0391c = this;
                        viewTreeObserverOnGlobalLayoutListenerC0391c.m1740P(motionEvent, 9, motionEvent.getEventTime(), true);
                    }
                    if (motionEvent.getButtonState() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (actionMasked2 == 8 && !z2 && motionEvent2 != null && !motionEvent2.isFromSource(4098)) {
                        ref$BooleanRef.f47713a = true;
                    }
                    if (motionEvent2 != null) {
                        motionEvent2.recycle();
                    }
                    motionEvent3 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                    if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                        motionEvent4 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                        if (motionEvent4 != null) {
                            pointerId = motionEvent4.getPointerId(0);
                        } else {
                            pointerId = -1;
                        }
                        action = motionEvent.getAction();
                        b36Var = viewTreeObserverOnGlobalLayoutListenerC0391c.f4687b0;
                        if (action == i || motionEvent.getHistorySize() != 0) {
                            if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                motionEvent5 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                if (motionEvent5 != null) {
                                    x = motionEvent5.getX();
                                } else {
                                    x = Float.NaN;
                                }
                                MotionEvent motionEvent10 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                float y3 = motionEvent10 != null ? motionEvent10.getY() : Float.NaN;
                                x2 = motionEvent.getX();
                                float y4 = motionEvent.getY();
                                if (x == x2 || y3 != y4) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                motionEvent6 = viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0;
                                if (motionEvent6 != null) {
                                    eventTime = motionEvent6.getEventTime();
                                } else {
                                    eventTime = -1;
                                }
                                if (eventTime != motionEvent.getEventTime()) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z3 || z4) {
                                    if (pointerId >= 0) {
                                        b36Var.f7868c.delete(pointerId);
                                        b36Var.f7867b.delete(pointerId);
                                    }
                                    c0327a2 = (C0327a) pc0Var.f55939c;
                                    if (c0327a2.f4119d) {
                                        c0327a2.f4119d = true;
                                    } else {
                                        c0327a2.f4122g.f65569a.m24310h();
                                    }
                                }
                            }
                        } else if (pointerId >= 0) {
                            b36Var.f7868c.delete(pointerId);
                            b36Var.f7867b.delete(pointerId);
                        }
                    }
                    viewTreeObserverOnGlobalLayoutListenerC0391c.f4647G0 = MotionEvent.obtainNoHistory(motionEvent);
                    if (ref$BooleanRef.f47713a) {
                        viewTreeObserverOnGlobalLayoutListenerC0391c.m1740P(motionEvent, 10, motionEvent.getEventTime(), true);
                    }
                    iM1739O = m1739O(motionEvent);
                    try {
                        Trace.endSection();
                        if ((iM1739O & 4) != 0 && ref$BooleanRef.f47713a) {
                            c0327a = (C0327a) pc0Var.f55939c;
                            if (c0327a.f4119d) {
                                c0327a.f4119d = true;
                            } else {
                                c0327a.f4122g.f65569a.m24310h();
                            }
                            viewTreeObserverOnGlobalLayoutListenerC0391c2 = this;
                            viewTreeObserverOnGlobalLayoutListenerC0391c2.m1740P(motionEvent, 9, motionEvent.getEventTime(), true);
                        } else {
                            viewTreeObserverOnGlobalLayoutListenerC0391c2 = this;
                        }
                        viewTreeObserverOnGlobalLayoutListenerC0391c2.f4716u0 = false;
                        return iM1739O;
                    } catch (Throwable th) {
                        th = th;
                        viewTreeObserverOnGlobalLayoutListenerC0391c3 = this;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        viewTreeObserverOnGlobalLayoutListenerC0391c3.f4716u0 = false;
        throw th;
    }

    /* JADX INFO: renamed from: o */
    public final void m1749o(C0357g c0357g) {
        this.f4709n0.m12139r(c0357g, false);
        x66 x66VarM1559B = c0357g.m1559B();
        Object[] objArr = x66VarM1559B.f67830a;
        int i = x66VarM1559B.f67832c;
        for (int i2 = 0; i2 < i; i2++) {
            m1749o((C0357g) objArr[i2]);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        m98 m98Var;
        Object obj;
        super.onAttachedToWindow();
        if (!getRoot().m1569L()) {
            getRoot().m1584d(this);
        }
        setAttached(true);
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC3184kh.m15222p());
        }
        this.f4656L.onViewAttachedToWindow(this);
        if (!this.f4679W0) {
            getComposeViewContext().m1802c();
        }
        int i = 0;
        this.f4679W0 = false;
        m1749o(getRoot());
        m1723m(getRoot());
        getSnapshotObserver().f4460a.m11068d();
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391cM25913getOutOfFrameExecutor = m25913getOutOfFrameExecutor();
        if (viewTreeObserverOnGlobalLayoutListenerC0391cM25913getOutOfFrameExecutor == null) {
            C3386nv.m17633t("Expected the view to be attached to window.");
            return;
        }
        viewTreeObserverOnGlobalLayoutListenerC0391cM25913getOutOfFrameExecutor.m1736L(new ui3() { // from class: androidx.compose.ui.platform.AndroidComposeView$onAttachedToWindow$1
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                Class cls = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1;
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4482b;
                if (viewTreeObserverOnGlobalLayoutListenerC0391c.isAttachedToWindow()) {
                    if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4639f1 == null) {
                        RunnableC3637u6 runnableC3637u6 = new RunnableC3637u6(3);
                        ViewTreeObserverOnGlobalLayoutListenerC0391c.f4639f1 = runnableC3637u6;
                        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                        try {
                            if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1 == null) {
                                ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1 = Class.forName("android.os.SystemProperties");
                            }
                            if (ViewTreeObserverOnGlobalLayoutListenerC0391c.f4637d1 == null) {
                                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                                Class cls2 = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4635b1;
                                ViewTreeObserverOnGlobalLayoutListenerC0391c.f4637d1 = cls2 != null ? cls2.getDeclaredMethod("addChangeCallback", Runnable.class) : null;
                            }
                            Method method = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4637d1;
                            if (method != null) {
                                method.invoke(null, runnableC3637u6);
                            }
                        } catch (Throwable unused) {
                        }
                        StrictMode.setVmPolicy(vmPolicy);
                    }
                    h66 h66Var = ViewTreeObserverOnGlobalLayoutListenerC0391c.f4638e1;
                    synchronized (h66Var) {
                        h66Var.m13090g(viewTreeObserverOnGlobalLayoutListenerC0391c);
                    }
                }
                return xfa.f68157a;
            }
        });
        ub5 ub5Var = getComposeViewContext().f4788c;
        dua duaVar = getComposeViewContext().f4790e;
        xb5 xb5Var = this.f4692e;
        if (ub5Var == null || duaVar == null || xb5Var == null) {
            m98Var = null;
        } else {
            cua cuaVarMo2116r = duaVar.mo2116r();
            aua auaVar = new aua();
            or1 or1Var = or1.f54780b;
            cuaVarMo2116r.getClass();
            or1Var.getClass();
            ny8 ny8Var = new ny8(cuaVarMo2116r, auaVar, or1Var);
            z21 z21VarM24933a = y38.m24933a(zb5.class);
            String strM25413b = z21VarM24933a.m25413b();
            if (strM25413b == null) {
                C3386nv.m17626m("Local and anonymous classes can not be ViewModels");
                return;
            }
            zb5 zb5Var = (zb5) ny8Var.m17675B(z21VarM24933a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM25413b));
            Object parent = getParent();
            parent.getClass();
            int id = ((View) parent).getId();
            t56 t56Var = zb5Var.f71302b;
            Object objM10152b = t56Var.m10152b(id);
            if (objM10152b == null) {
                objM10152b = new h66(1);
                t56Var.m21850i(id, objM10152b);
            }
            h66 h66Var = (h66) objM10152b;
            Object[] objArr = h66Var.f1293a;
            int i2 = h66Var.f1294b;
            while (true) {
                if (i >= i2) {
                    obj = null;
                    break;
                }
                obj = objArr[i];
                if (!((yb5) obj).f69600c) {
                    break;
                } else {
                    i++;
                }
            }
            yb5 yb5Var = (yb5) obj;
            if (yb5Var == null) {
                yb5Var = new yb5();
                h66Var.m13090g(yb5Var);
            }
            yb5Var.f69600c = true;
            this.f4694f = yb5Var;
            m98Var = yb5Var.f69599b;
        }
        if (m98Var == null) {
            m98Var = s46.f60288c;
        }
        this.f4696g = m98Var;
        vi3 vi3Var = this.f4718w0;
        if (vi3Var != null) {
            vi3Var.invoke(getComposeViewContext());
            this.f4718w0 = null;
        }
        AbstractC3572sf abstractC3572sfMo256K = getComposeViewContext().f4788c.mo256K();
        abstractC3572sfMo256K.mo21323g(this);
        abstractC3572sfMo256K.mo21323g(this.f4668R);
        ((xc9) getInputModeManager().f36757a).setValue(new c64(isInTouchMode() ? 1 : 2));
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        getViewTreeObserver().addOnScrollChangedListener(this);
        getViewTreeObserver().addOnTouchModeChangeListener(this);
        if (Build.VERSION.SDK_INT >= 31) {
            C3075hh.f42342a.m13236b(this);
        }
        C3408og c3408og = this.f4697g0;
        if (c3408og != null) {
            ((C0301c) getFocusOwner()).f3912g.m13090g(c3408og);
            getSemanticsOwner().f61497d.m13090g(c3408og);
        }
        ((C0301c) getFocusOwner()).f3912g.m13090g(this);
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        kz8 kz8Var = (kz8) this.f4721z0.get();
        C0395g c0395g = (C0395g) (kz8Var != null ? kz8Var.f48820b : null);
        if (c0395g == null) {
            return getLegacyTextInputServiceAndroid().f5093d;
        }
        kz8 kz8Var2 = (kz8) c0395g.f4769d.get();
        C0405q c0405q = (C0405q) (kz8Var2 != null ? kz8Var2.f48820b : null);
        return c0405q != null && c0405q.m1814b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m1742R(configuration);
    }

    @Override // android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        kz8 kz8Var = (kz8) this.f4721z0.get();
        C0395g c0395g = (C0395g) (kz8Var != null ? kz8Var.f48820b : null);
        if (c0395g != null) {
            kz8 kz8Var2 = (kz8) c0395g.f4769d.get();
            C0405q c0405q = (C0405q) (kz8Var2 != null ? kz8Var2.f48820b : null);
            if (c0405q != null) {
                return c0405q.m1813a(editorInfo);
            }
            return null;
        }
        C0439e legacyTextInputServiceAndroid = getLegacyTextInputServiceAndroid();
        if (!legacyTextInputServiceAndroid.f5093d) {
            return null;
        }
        w04 w04Var = legacyTextInputServiceAndroid.f5097h;
        vv9 vv9Var = legacyTextInputServiceAndroid.f5096g;
        int i2 = w04Var.f66168e;
        boolean z = w04Var.f66164a;
        int i3 = 0;
        if (i2 == 1) {
            i = z ? 6 : 0;
        } else if (i2 == 0) {
            i = 1;
        } else if (i2 == 2) {
            i = 2;
        } else if (i2 == 6) {
            i = 5;
        } else if (i2 == 5) {
            i = 7;
        } else if (i2 == 3) {
            i = 3;
        } else if (i2 == 4) {
            i = 4;
        } else {
            if (i2 != 7) {
                C3386nv.m17633t("invalid ImeAction");
                return null;
            }
        }
        editorInfo.imeOptions = i;
        int i4 = w04Var.f66167d;
        if (i4 == 1) {
            editorInfo.inputType = 1;
        } else if (i4 == 2) {
            editorInfo.inputType = 1;
            editorInfo.imeOptions = Integer.MIN_VALUE | i;
        } else if (i4 == 3) {
            editorInfo.inputType = 2;
        } else if (i4 == 4) {
            editorInfo.inputType = 3;
        } else if (i4 == 5) {
            editorInfo.inputType = 17;
        } else if (i4 == 6) {
            editorInfo.inputType = 33;
        } else if (i4 == 7) {
            editorInfo.inputType = 129;
        } else if (i4 == 8) {
            editorInfo.inputType = 18;
        } else if (i4 == 9) {
            editorInfo.inputType = 8194;
        } else if (i4 == 10) {
            editorInfo.inputType = 145;
        } else if (i4 == 11) {
            editorInfo.inputType = 113;
        } else if (i4 == 12) {
            editorInfo.inputType = 97;
        } else if (i4 == 13) {
            editorInfo.inputType = 49;
        } else if (i4 == 14) {
            editorInfo.inputType = 65;
        } else if (i4 == 15) {
            editorInfo.inputType = 81;
        } else if (i4 == 16) {
            editorInfo.inputType = 177;
        } else if (i4 == 17) {
            editorInfo.inputType = 193;
        } else if (i4 == 18) {
            editorInfo.inputType = 4;
        } else if (i4 == 19) {
            editorInfo.inputType = 20;
        } else if (i4 == 20) {
            editorInfo.inputType = 36;
        } else if (i4 == 21) {
            editorInfo.inputType = 4098;
        } else if (i4 == 22) {
            editorInfo.inputType = 12290;
        } else if (i4 == 23) {
            editorInfo.inputType = 8210;
        } else if (i4 == 24) {
            editorInfo.inputType = 4114;
        } else {
            if (i4 != 25) {
                C3386nv.m17633t("Invalid Keyboard Type");
                return null;
            }
            editorInfo.inputType = 12306;
        }
        if (!z) {
            int i5 = editorInfo.inputType;
            if ((i5 & 15) == 1) {
                editorInfo.inputType = i5 | 131072;
                if (i2 == 1) {
                    editorInfo.imeOptions |= 1073741824;
                }
            }
        }
        int i6 = editorInfo.inputType;
        if ((i6 & 15) == 1) {
            int i7 = w04Var.f66165b;
            if (i7 == 1) {
                editorInfo.inputType = i6 | 4096;
            } else if (i7 == 2) {
                editorInfo.inputType = i6 | 8192;
            } else if (i7 == 3) {
                editorInfo.inputType = i6 | 16384;
            }
            if (w04Var.f66166c) {
                editorInfo.inputType |= 32768;
            }
        }
        long j = vv9Var.f65991b;
        int i8 = cx9.f34693c;
        editorInfo.initialSelStart = (int) (j >> 32);
        editorInfo.initialSelEnd = (int) (j & 4294967295L);
        ybd.m25060c(editorInfo, vv9Var.f65990a.f54604b);
        editorInfo.imeOptions |= 33554432;
        if (pq2.m19449d()) {
            pq2.m19448a().m19456i(editorInfo);
        }
        b28 b28Var = new b28(legacyTextInputServiceAndroid.f5096g, new gw9(legacyTextInputServiceAndroid, i3), legacyTextInputServiceAndroid.f5097h.f66166c);
        legacyTextInputServiceAndroid.f5098i.add(new WeakReference(b28Var));
        return b28Var;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this.f4668R;
        viewOnAttachStateChangeListenerC0291c.getClass();
        r2d.m20267g(viewOnAttachStateChangeListenerC0291c, jArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        this.f4656L.onViewDetachedFromWindow(this);
        View view = this.f4704k;
        if (m1724p() && view != null) {
            removeView(view);
        }
        h66 h66Var = f4638e1;
        synchronized (h66Var) {
            h66Var.m13094k(this);
        }
        getComposeViewContext().m1801b();
        ed9 ed9Var = getSnapshotObserver().f4460a;
        sd3 sd3Var = ed9Var.f37077h;
        if (sd3Var != null) {
            sd3Var.mo19438a();
        }
        ed9Var.m11065a();
        AbstractC3572sf abstractC3572sfMo256K = getComposeViewContext().f4788c.mo256K();
        abstractC3572sfMo256K.mo21331x(this.f4668R);
        abstractC3572sfMo256K.mo21331x(this);
        getViewTreeObserver().removeOnGlobalLayoutListener(this);
        getViewTreeObserver().removeOnScrollChangedListener(this);
        getViewTreeObserver().removeOnTouchModeChangeListener(this);
        yb5 yb5Var = this.f4694f;
        if (yb5Var != null) {
            yb5Var.f69600c = false;
        }
        this.f4694f = null;
        if (Build.VERSION.SDK_INT >= 31) {
            C3075hh.f42342a.m13235a(this);
        }
        C3408og c3408og = this.f4697g0;
        if (c3408og != null) {
            getSemanticsOwner().f61497d.m13094k(c3408og);
            ((C0301c) getFocusOwner()).f3912g.m13094k(c3408og);
        }
        C0429a rectManager = getRectManager();
        rectManager.f5035g = rectManager.f5032d.m25392c(0L, 0L, null, 0, 0);
        getRectManager().m1874a();
        C0429a rectManager2 = getRectManager();
        RunnableC3684vg runnableC3684vg = rectManager2.f5037i;
        if (runnableC3684vg != null) {
            rectManager2.f5030b.removeCallbacks(runnableC3684vg);
            rectManager2.f5037i = null;
        }
        ((C0301c) getFocusOwner()).f3912g.m13094k(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z || hasFocus()) {
            return;
        }
        C0301c c0301c = (C0301c) getFocusOwner();
        AbstractC0303e.m1380e(c0301c.f3908c, true);
        if (c0301c.m1362h() != null) {
            C0302d c0302dM1362h = c0301c.m1362h();
            c0301c.m1365k(null);
            if (c0302dM1362h != null) {
                c0302dM1362h.m1369a1(FocusStateImpl.Active, FocusStateImpl.Inactive);
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f4715t0 = 0L;
        m1743S();
        int i = Build.VERSION.SDK_INT;
        if (32 > i || i >= 34) {
            return;
        }
        m1742R(getResources().getConfiguration());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection("AndroidOwner:onLayout");
        try {
            this.f4715t0 = 0L;
            this.f4709n0.m12133l(this.f4671S0);
            this.f4707l0 = null;
            m1743S();
            if (this.f4705k0 != null) {
                Trace.beginSection("AndroidOwner:viewLayout");
                try {
                    getAndroidViewsHandler$ui().layout(0, 0, i3 - i, i4 - i2);
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ft5 ft5Var = this.f4709n0;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m1749o(getRoot());
            }
            long jM1722i = m1722i(i);
            long jM1722i2 = m1722i(i2);
            long jM18276r = AbstractC3423or.m18276r((int) (jM1722i >>> 32), (int) (jM1722i & 4294967295L), (int) (jM1722i2 >>> 32), (int) (4294967295L & jM1722i2));
            bk1 bk1Var = this.f4707l0;
            if (bk1Var == null) {
                this.f4707l0 = new bk1(jM18276r);
                this.f4708m0 = false;
            } else if (!bk1.m3795c(bk1Var.f8631a, jM18276r)) {
                this.f4708m0 = true;
            }
            ft5Var.m12140s(jM18276r);
            ft5Var.m12135n();
            setMeasuredDimension(getRoot().f4337b0.f58070p.f49301a, getRoot().f4337b0.f58070p.f49302b);
            if (this.f4705k0 != null) {
                Trace.beginSection("AndroidOwner:androidViewMeasure");
                try {
                    getAndroidViewsHandler$ui().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f4337b0.f58070p.f49301a, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f4337b0.f58070p.f49302b, 1073741824));
                    Trace.endSection();
                } finally {
                    Trace.endSection();
                }
            }
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        if (viewStructure == null || this.f4680X0) {
            return;
        }
        m1732H(viewStructure);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        ig7 ig7Var;
        int toolType = motionEvent.getToolType(i);
        if (motionEvent.isFromSource(8194) || !motionEvent.isFromSource(16386) || (!(toolType == 2 || toolType == 4) || (ig7Var = ((C3758xg) getPointerIconService()).f68160a) == null)) {
            return super.onResolvePointerIcon(motionEvent, i);
        }
        Context context = getContext();
        return ig7Var instanceof C3724wj ? PointerIcon.getSystemIcon(context, ((C3724wj) ig7Var).f66898b) : PointerIcon.getSystemIcon(context, DescriptorProtos.Edition.EDITION_2023_VALUE);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        LayoutDirection layoutDirection;
        if (this.f4688c) {
            int[] iArr = s93.f60554a;
            if (i != 0) {
                layoutDirection = i != 1 ? null : LayoutDirection.Rtl;
            } else {
                layoutDirection = LayoutDirection.Ltr;
            }
            if (layoutDirection == null) {
                layoutDirection = LayoutDirection.Ltr;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0420d c0420d;
        if (Build.VERSION.SDK_INT < 31 || (c0420d = this.f4681Y0) == null) {
            return;
        }
        c0420d.m1837a(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        m1743S();
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        ((xc9) getInputModeManager().f36757a).setValue(new c64(z ? 1 : 2));
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c = this.f4668R;
        viewOnAttachStateChangeListenerC0291c.getClass();
        r2d.m20268h(viewOnAttachStateChangeListenerC0291c, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean zM15222p;
        this.f4677V0 = true;
        super.onWindowFocusChanged(z);
        if (!z || Build.VERSION.SDK_INT >= 30 || getShowLayoutBounds() == (zM15222p = AbstractC3184kh.m15222p())) {
            return;
        }
        setShowLayoutBounds(zM15222p);
        m1723m(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (!isFocused()) {
            o93 o93VarM21168d = s93.m21168d(i);
            final int i2 = o93VarM21168d != null ? o93VarM21168d.f54076a : 7;
            Boolean boolM1361g = ((C0301c) getFocusOwner()).m1361g(i2, rect != null ? bna.m3984x0(rect) : null, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithPrevRect$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p000.vi3
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(((C0302d) obj).m1375g1(i2));
                }
            });
            Boolean bool = Boolean.TRUE;
            if (!fa4.m11650l(boolM1361g, bool)) {
                if (!fa4.m11650l(((C0301c) getFocusOwner()).m1361g(i2, null, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$requestFocusBypassUnfocusableComposeView$requestFocusWithoutPrevRect$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(((C0302d) obj).m1375g1(i2));
                    }
                }), bool)) {
                    if (!hasFocus()) {
                        return false;
                    }
                    if (i2 == 1 || i2 == 2) {
                        return ((C0301c) getFocusOwner()).m1364j(i2);
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j) {
        this.f4666Q.f4754h = j;
    }

    public final void setComposeViewContext(C0401m c0401m) {
        if (getCoroutineContext() != c0401m.f4787b.mo1231j() && !((f66) getRoot().m1602o()).isEmpty()) {
            i54.m13662a("Changing ComposeViewContext cannot change the coroutine context without disposing of the composition first.");
        }
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            C0401m c0401m2 = get_composeViewContext();
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            if (c0401m != c0401m2) {
                if (isAttachedToWindow()) {
                    c0401m2.m1801b();
                    c0401m.m1802c();
                }
                set_composeViewContext(c0401m);
                setCoroutineContext(c0401m.f4787b.mo1231j());
            }
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }

    public final void setComposeViewContextIncrementedDuringInit$ui(boolean z) {
        this.f4679W0 = z;
    }

    public final void setConfiguration(Configuration configuration) {
        ((xc9) this.f4691d0).setValue(configuration);
    }

    public final void setContentCaptureManager$ui(ViewOnAttachStateChangeListenerC0291c viewOnAttachStateChangeListenerC0291c) {
        this.f4668R = viewOnAttachStateChangeListenerC0291c;
    }

    public void setCoroutineContext(kn1 kn1Var) {
        this.f4648H = kn1Var;
    }

    public final void setFrameEndScheduler$ui(xb5 xb5Var) {
        this.f4692e = xb5Var;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui(long j) {
        this.f4715t0 = j;
    }

    public final void setOnReadyForComposition(vi3 vi3Var) {
        getDerivedIsAttached();
        if (isAttachedToWindow() || this.f4679W0) {
            vi3Var.invoke(getComposeViewContext());
        } else {
            this.f4718w0 = vi3Var;
        }
    }

    /* JADX INFO: renamed from: setPrimaryDirectionalMotionAxisOverride-r2epLt8$ui, reason: not valid java name */
    public final void m25909setPrimaryDirectionalMotionAxisOverrider2epLt8$ui(z34 z34Var) {
        this.f4690d = z34Var;
    }

    public void setShowLayoutBounds(boolean z) {
        this.f4703j0 = z;
    }

    public void setUncaughtExceptionHandler(fi8 fi8Var) {
        this.f4709n0.getClass();
    }

    public final void setUncaughtExceptionHandler$ui(fi8 fi8Var) {
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m1750t(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y && y <= ((float) getHeight());
    }

    /* JADX INFO: renamed from: u */
    public final boolean m1751u(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f4647G0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final void m1752v(float[] fArr) {
        m1733I();
        ts5.m22292g(fArr, this.f4713r0);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4717v0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f4717v0 & 4294967295L));
        float[] fArr2 = this.f4712q0;
        ts5.m22289d(fArr2);
        ts5.m22293h(fArr2, fIntBitsToFloat, fIntBitsToFloat2);
        float fM15217k = AbstractC3184kh.m15217k(0, 0, fArr2, fArr);
        float fM15217k2 = AbstractC3184kh.m15217k(0, 1, fArr2, fArr);
        float fM15217k3 = AbstractC3184kh.m15217k(0, 2, fArr2, fArr);
        float fM15217k4 = AbstractC3184kh.m15217k(0, 3, fArr2, fArr);
        float fM15217k5 = AbstractC3184kh.m15217k(1, 0, fArr2, fArr);
        float fM15217k6 = AbstractC3184kh.m15217k(1, 1, fArr2, fArr);
        float fM15217k7 = AbstractC3184kh.m15217k(1, 2, fArr2, fArr);
        float fM15217k8 = AbstractC3184kh.m15217k(1, 3, fArr2, fArr);
        float fM15217k9 = AbstractC3184kh.m15217k(2, 0, fArr2, fArr);
        float fM15217k10 = AbstractC3184kh.m15217k(2, 1, fArr2, fArr);
        float fM15217k11 = AbstractC3184kh.m15217k(2, 2, fArr2, fArr);
        float fM15217k12 = AbstractC3184kh.m15217k(2, 3, fArr2, fArr);
        float fM15217k13 = AbstractC3184kh.m15217k(3, 0, fArr2, fArr);
        float fM15217k14 = AbstractC3184kh.m15217k(3, 1, fArr2, fArr);
        float fM15217k15 = AbstractC3184kh.m15217k(3, 2, fArr2, fArr);
        float fM15217k16 = AbstractC3184kh.m15217k(3, 3, fArr2, fArr);
        fArr[0] = fM15217k;
        fArr[1] = fM15217k2;
        fArr[2] = fM15217k3;
        fArr[3] = fM15217k4;
        fArr[4] = fM15217k5;
        fArr[5] = fM15217k6;
        fArr[6] = fM15217k7;
        fArr[7] = fM15217k8;
        fArr[8] = fM15217k9;
        fArr[9] = fM15217k10;
        fArr[10] = fM15217k11;
        fArr[11] = fM15217k12;
        fArr[12] = fM15217k13;
        fArr[13] = fM15217k14;
        fArr[14] = fM15217k15;
        fArr[15] = fM15217k16;
    }

    /* JADX INFO: renamed from: w */
    public final long m1753w(long j) {
        m1733I();
        long jM22287b = ts5.m22287b(this.f4713r0, j);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.f4717v0 >> 32)) + Float.intBitsToFloat((int) (jM22287b >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.f4717v0 & 4294967295L)) + Float.intBitsToFloat((int) (jM22287b & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: x */
    public final void m1754x(boolean z) {
        ft5 ft5Var = this.f4709n0;
        if (ft5Var.f39618b.m16486D() || ((x66) ft5Var.f39621e.f39590b).f67832c != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            try {
                if (ft5Var.m12133l(z ? this.f4671S0 : this.f4673T0)) {
                    requestLayout();
                }
                ft5Var.m12128b(false);
                getRectManager().m1874a();
                if (this.f4684a0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f4684a0 = false;
                }
                Trace.endSection();
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m1755y(C0357g c0357g, long j) {
        ft5 ft5Var = this.f4709n0;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            ft5Var.m12134m(c0357g, j);
            if (!ft5Var.f39618b.m16486D()) {
                ft5Var.m12128b(false);
                getRectManager().m1874a();
                ((AndroidComposeView$layoutChildViewsIfNeeded$1) this.f4673T0).mo0a();
                if (this.f4684a0) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f4684a0 = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.c72
    /* JADX INFO: renamed from: z */
    public final void mo1756z(ub5 ub5Var) {
        tm0 tm0VarMo1240s;
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC3184kh.m15222p());
        }
        final yb5 yb5Var = this.f4694f;
        if (yb5Var != null) {
            xb5 xb5Var = this.f4692e;
            xb5Var.getClass();
            cc4 cc4Var = yb5Var.f69598a;
            ip5 ip5Var = (ip5) cc4Var.f9881a;
            if (!ip5Var.f44395a || ip5Var.f44397c) {
                return;
            }
            try {
                tm0VarMo1240s = ((l9b) xb5Var).f49350a.mo1240s(new ui3() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                    {
                        super(0);
                    }

                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        ip5 ip5Var2 = (ip5) yb5Var.f69598a.f9881a;
                        if (!ip5Var2.f44396b) {
                            if (ip5Var2.f44397c) {
                                ii7.m13939a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                            }
                            ip5Var2.m14063a();
                            ip5Var2.f44397c = true;
                        }
                        return xfa.f68157a;
                    }
                });
            } catch (CancellationException unused) {
                ip5 ip5Var2 = (ip5) cc4Var.f9881a;
                if (!ip5Var2.f44396b) {
                    if (ip5Var2.f44397c) {
                        ii7.m13939a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ip5Var2.m14063a();
                    ip5Var2.f44397c = true;
                }
                tm0VarMo1240s = null;
            }
            tm0 tm0Var = yb5Var.f69601d;
            if (tm0Var != null) {
                tm0Var.cancel();
            }
            yb5Var.f69601d = tm0VarMo1240s;
        }
    }

    /* JADX INFO: renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC0293a m25910getDragAndDropManager() {
        return this.f4650I;
    }

    public t56 getLayoutNodes() {
        return this.f4660N;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.width = i;
        layoutParamsGenerateDefaultLayoutParams.height = i2;
        addViewInLayout(view, -1, layoutParamsGenerateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
