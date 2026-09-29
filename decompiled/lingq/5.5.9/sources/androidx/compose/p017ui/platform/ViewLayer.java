package androidx.compose.p017ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p166i1.InterfaceC6140d0;
import p260m8.C7499b;
import p338qd.C8584v;
import p375s0.C8940b;
import p375s0.C8941c;
import p375s0.C8944f;
import p387t0.C9139d;
import p387t0.C9144f0;
import p387t0.C9162o0;
import p387t0.C9166r;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9154k0;
import p387t0.InterfaceC9165q;
import p470x1.C10020h;
import p470x1.C10022j;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ViewLayer extends View implements InterfaceC6140d0 {

    /* JADX INFO: renamed from: J */
    public static final InterfaceC2056p<View, Matrix, C9072e> f4213J = new InterfaceC2056p<View, Matrix, C9072e>() { // from class: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1
        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final C9072e mo1337m0(View view, Matrix matrix) {
            View view2 = view;
            Matrix matrix2 = matrix;
            C5207g.m11111f(view2, "view");
            C5207g.m11111f(matrix2, "matrix");
            matrix2.set(view2.getMatrix());
            return C9072e.f47360a;
        }
    };

    /* JADX INFO: renamed from: K */
    public static final C0593a f4214K = new C0593a();

    /* JADX INFO: renamed from: L */
    public static Method f4215L;

    /* JADX INFO: renamed from: M */
    public static Field f4216M;

    /* JADX INFO: renamed from: N */
    public static boolean f4217N;

    /* JADX INFO: renamed from: O */
    public static boolean f4218O;

    /* JADX INFO: renamed from: H */
    public boolean f4219H;

    /* JADX INFO: renamed from: I */
    public final long f4220I;

    /* JADX INFO: renamed from: a */
    public final AndroidComposeView f4221a;

    /* JADX INFO: renamed from: b */
    public final C0649o0 f4222b;

    /* JADX INFO: renamed from: c */
    public InterfaceC2052l<? super InterfaceC9165q, C9072e> f4223c;

    /* JADX INFO: renamed from: d */
    public InterfaceC2041a<C9072e> f4224d;

    /* JADX INFO: renamed from: e */
    public final C0673w0 f4225e;

    /* JADX INFO: renamed from: f */
    public boolean f4226f;

    /* JADX INFO: renamed from: g */
    public Rect f4227g;

    /* JADX INFO: renamed from: h */
    public boolean f4228h;

    /* JADX INFO: renamed from: i */
    public boolean f4229i;

    /* JADX INFO: renamed from: j */
    public final C9166r f4230j;

    /* JADX INFO: renamed from: k */
    public final C0667u0<View> f4231k;

    /* JADX INFO: renamed from: l */
    public long f4232l;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$a */
    public static final class C0593a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            C5207g.m11111f(view, "view");
            C5207g.m11111f(outline, "outline");
            Outline outlineM2498b = ((ViewLayer) view).f4225e.m2498b();
            C5207g.m11108c(outlineM2498b);
            outline.set(outlineM2498b);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$b */
    public static final class C0594b {
        @SuppressLint({"BanUncheckedReflection"})
        /* JADX INFO: renamed from: a */
        public static void m2324a(View view) {
            C5207g.m11111f(view, "view");
            try {
                if (!ViewLayer.f4217N) {
                    ViewLayer.f4217N = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.f4215L = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f4216M = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        ViewLayer.f4215L = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.f4216M = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = ViewLayer.f4215L;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = ViewLayer.f4216M;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = ViewLayer.f4216M;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = ViewLayer.f4215L;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.f4218O = true;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.platform.ViewLayer$c */
    public static final class C0595c {
        /* JADX INFO: renamed from: a */
        public static final long m2325a(View view) {
            C5207g.m11111f(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, C0649o0 c0649o0, InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l, InterfaceC2041a<C9072e> interfaceC2041a) {
        super(androidComposeView.getContext());
        C5207g.m11111f(androidComposeView, "ownerView");
        C5207g.m11111f(interfaceC2052l, "drawBlock");
        C5207g.m11111f(interfaceC2041a, "invalidateParentLayer");
        this.f4221a = androidComposeView;
        this.f4222b = c0649o0;
        this.f4223c = interfaceC2052l;
        this.f4224d = interfaceC2041a;
        this.f4225e = new C0673w0(androidComposeView.getDensity());
        this.f4230j = new C9166r(0);
        this.f4231k = new C0667u0<>(f4213J);
        this.f4232l = C9162o0.f47689b;
        this.f4219H = true;
        setWillNotDraw(false);
        c0649o0.addView(this);
        this.f4220I = View.generateViewId();
    }

    private final InterfaceC9138c0 getManualClipPath() {
        if (getClipToOutline()) {
            C0673w0 c0673w0 = this.f4225e;
            if (!(!c0673w0.f4369i)) {
                c0673w0.m2501e();
                return c0673w0.f4367g;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z10) {
        if (z10 != this.f4228h) {
            this.f4228h = z10;
            this.f4221a.m2254C(this, z10);
        }
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: a */
    public final void mo2311a(InterfaceC2041a interfaceC2041a, InterfaceC2052l interfaceC2052l) {
        C5207g.m11111f(interfaceC2052l, "drawBlock");
        C5207g.m11111f(interfaceC2041a, "invalidateParentLayer");
        this.f4222b.addView(this);
        this.f4226f = false;
        this.f4229i = false;
        int i10 = C9162o0.f47690c;
        this.f4232l = C9162o0.f47689b;
        this.f4223c = interfaceC2052l;
        this.f4224d = interfaceC2041a;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: b */
    public final void mo2312b(C8940b c8940b, boolean z10) {
        C0667u0<View> c0667u0 = this.f4231k;
        if (!z10) {
            C7499b.m14939f0(c0667u0.m2492b(this), c8940b);
            return;
        }
        float[] fArrM2491a = c0667u0.m2491a(this);
        if (fArrM2491a != null) {
            C7499b.m14939f0(fArrM2491a, c8940b);
            return;
        }
        c8940b.f46884a = 0.0f;
        c8940b.f46885b = 0.0f;
        c8940b.f46886c = 0.0f;
        c8940b.f46887d = 0.0f;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: c */
    public final void mo2313c() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.f4221a;
        androidComposeView.f3958P = true;
        this.f4223c = null;
        this.f4224d = null;
        androidComposeView.m2256E(this);
        this.f4222b.removeViewInLayout(this);
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: d */
    public final void mo2314d(InterfaceC9165q interfaceC9165q) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        boolean z10 = getElevation() > 0.0f;
        this.f4229i = z10;
        if (z10) {
            interfaceC9165q.mo17430q();
        }
        this.f4222b.m2426a(interfaceC9165q, this, getDrawingTime());
        if (this.f4229i) {
            interfaceC9165q.mo17421f();
        }
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C5207g.m11111f(canvas, "canvas");
        boolean z10 = false;
        setInvalidated(false);
        C9166r c9166r = this.f4230j;
        Object obj = c9166r.f47694a;
        Canvas canvas2 = ((C9139d) obj).f47644a;
        C9139d c9139d = (C9139d) obj;
        c9139d.getClass();
        c9139d.f47644a = canvas;
        C9139d c9139d2 = (C9139d) c9166r.f47694a;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            c9139d2.mo17420d();
            this.f4225e.m2497a(c9139d2);
            z10 = true;
        }
        InterfaceC2052l<? super InterfaceC9165q, C9072e> interfaceC2052l = this.f4223c;
        if (interfaceC2052l != null) {
            interfaceC2052l.mo528n(c9139d2);
        }
        if (z10) {
            c9139d2.mo17428o();
        }
        ((C9139d) c9166r.f47694a).m17433t(canvas2);
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: e */
    public final boolean mo2315e(long j10) {
        float fM17164c = C8941c.m17164c(j10);
        float fM17165d = C8941c.m17165d(j10);
        if (this.f4226f) {
            return 0.0f <= fM17164c && fM17164c < ((float) getWidth()) && 0.0f <= fM17165d && fM17165d < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f4225e.m2499c(j10);
        }
        return true;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: f */
    public final void mo2316f(float f3, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, long j10, InterfaceC9154k0 interfaceC9154k0, boolean z10, long j11, long j12, int i10, LayoutDirection layoutDirection, InterfaceC10015c interfaceC10015c) {
        InterfaceC2041a<C9072e> interfaceC2041a;
        C5207g.m11111f(interfaceC9154k0, "shape");
        C5207g.m11111f(layoutDirection, "layoutDirection");
        C5207g.m11111f(interfaceC10015c, "density");
        this.f4232l = j10;
        setScaleX(f3);
        setScaleY(f10);
        setAlpha(f11);
        setTranslationX(f12);
        setTranslationY(f13);
        setElevation(f14);
        setRotation(f17);
        setRotationX(f15);
        setRotationY(f16);
        long j13 = this.f4232l;
        int i11 = C9162o0.f47690c;
        setPivotX(Float.intBitsToFloat((int) (j13 >> 32)) * getWidth());
        setPivotY(C9162o0.m17480a(this.f4232l) * getHeight());
        setCameraDistancePx(f18);
        C9144f0.a aVar = C9144f0.f47650a;
        boolean z11 = true;
        this.f4226f = z10 && interfaceC9154k0 == aVar;
        m2323k();
        boolean z12 = getManualClipPath() != null;
        setClipToOutline(z10 && interfaceC9154k0 != aVar);
        boolean zM2500d = this.f4225e.m2500d(interfaceC9154k0, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, interfaceC10015c);
        setOutlineProvider(this.f4225e.m2498b() != null ? f4214K : null);
        boolean z13 = getManualClipPath() != null;
        if (z12 != z13 || (z13 && zM2500d)) {
            invalidate();
        }
        if (!this.f4229i && getElevation() > 0.0f && (interfaceC2041a = this.f4224d) != null) {
            interfaceC2041a.mo807E();
        }
        this.f4231k.m2493c();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 28) {
            C0656q1 c0656q1 = C0656q1.f4336a;
            c0656q1.m2454a(this, C8584v.m16780C(j11));
            c0656q1.m2455b(this, C8584v.m16780C(j12));
        }
        if (i12 >= 31) {
            C0662s1.f4342a.m2482a(this, null);
        }
        if (i10 == 1) {
            setLayerType(2, null);
        } else {
            if (i10 == 2) {
                setLayerType(0, null);
                z11 = false;
            } else {
                setLayerType(0, null);
            }
        }
        this.f4219H = z11;
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: g */
    public final void mo2317g(long j10) {
        int i10 = (int) (j10 >> 32);
        int iM18628b = C10022j.m18628b(j10);
        if (i10 == getWidth() && iM18628b == getHeight()) {
            return;
        }
        long j11 = this.f4232l;
        int i11 = C9162o0.f47690c;
        float f3 = i10;
        setPivotX(Float.intBitsToFloat((int) (j11 >> 32)) * f3);
        float f10 = iM18628b;
        setPivotY(C9162o0.m17480a(this.f4232l) * f10);
        long jM16788m = C8584v.m16788m(f3, f10);
        C0673w0 c0673w0 = this.f4225e;
        if (!C8944f.m17174a(c0673w0.f4364d, jM16788m)) {
            c0673w0.f4364d = jM16788m;
            c0673w0.f4368h = true;
        }
        setOutlineProvider(c0673w0.m2498b() != null ? f4214K : null);
        layout(getLeft(), getTop(), getLeft() + i10, getTop() + iM18628b);
        m2323k();
        this.f4231k.m2493c();
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C0649o0 getContainer() {
        return this.f4222b;
    }

    public long getLayerId() {
        return this.f4220I;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f4221a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0595c.m2325a(this.f4221a);
        }
        return -1L;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: h */
    public final void mo2318h(long j10) {
        int i10 = C10020h.f50974c;
        int i11 = (int) (j10 >> 32);
        int left = getLeft();
        C0667u0<View> c0667u0 = this.f4231k;
        if (i11 != left) {
            offsetLeftAndRight(i11 - getLeft());
            c0667u0.m2493c();
        }
        int iM18625a = C10020h.m18625a(j10);
        if (iM18625a != getTop()) {
            offsetTopAndBottom(iM18625a - getTop());
            c0667u0.m2493c();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f4219H;
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: i */
    public final void mo2319i() {
        if (!this.f4228h || f4218O) {
            return;
        }
        setInvalidated(false);
        C0594b.m2324a(this);
    }

    @Override // android.view.View, p166i1.InterfaceC6140d0
    public final void invalidate() {
        if (this.f4228h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f4221a.invalidate();
    }

    @Override // p166i1.InterfaceC6140d0
    /* JADX INFO: renamed from: j */
    public final long mo2320j(boolean z10, long j10) {
        C0667u0<View> c0667u0 = this.f4231k;
        if (!z10) {
            return C7499b.m14937e0(j10, c0667u0.m2492b(this));
        }
        float[] fArrM2491a = c0667u0.m2491a(this);
        if (fArrM2491a != null) {
            return C7499b.m14937e0(j10, fArrM2491a);
        }
        int i10 = C8941c.f46891e;
        return C8941c.f46889c;
    }

    /* JADX INFO: renamed from: k */
    public final void m2323k() {
        Rect rect;
        if (this.f4226f) {
            Rect rect2 = this.f4227g;
            if (rect2 == null) {
                this.f4227g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C5207g.m11108c(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f4227g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void setCameraDistancePx(float f3) {
        setCameraDistance(f3 * getResources().getDisplayMetrics().densityDpi);
    }
}
