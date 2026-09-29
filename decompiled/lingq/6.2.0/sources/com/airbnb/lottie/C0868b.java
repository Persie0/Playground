package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.airbnb.lottie.model.content.LBlendMode;
import com.airbnb.lottie.model.layer.Layer$LayerType;
import com.airbnb.lottie.model.layer.Layer$MatteType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.C0852cm;
import p000.C3386nv;
import p000.RunnableC3781y2;
import p000.ba0;
import p000.ca1;
import p000.cm5;
import p000.dm5;
import p000.f06;
import p000.fna;
import p000.gl5;
import p000.gq5;
import p000.gv5;
import p000.mi4;
import p000.mp2;
import p000.ni4;
import p000.ol5;
import p000.p33;
import p000.pl5;
import p000.rf1;
import p000.rl5;
import p000.sl5;
import p000.tj5;
import p000.tl5;
import p000.tp4;
import p000.ul5;
import p000.vqb;
import p000.wk4;
import p000.wp4;
import p000.wq1;
import p000.yk4;
import p000.yl5;

/* JADX INFO: renamed from: com.airbnb.lottie.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C0868b extends Drawable implements Drawable.Callback, Animatable {

    /* JADX INFO: renamed from: l0 */
    public static final List f10599l0 = Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");

    /* JADX INFO: renamed from: m0 */
    public static final ThreadPoolExecutor f10600m0 = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new cm5());

    /* JADX INFO: renamed from: H */
    public final vqb f10601H;

    /* JADX INFO: renamed from: I */
    public boolean f10602I;

    /* JADX INFO: renamed from: J */
    public boolean f10603J;

    /* JADX INFO: renamed from: K */
    public rf1 f10604K;

    /* JADX INFO: renamed from: L */
    public int f10605L;

    /* JADX INFO: renamed from: M */
    public boolean f10606M;

    /* JADX INFO: renamed from: N */
    public boolean f10607N;

    /* JADX INFO: renamed from: O */
    public boolean f10608O;

    /* JADX INFO: renamed from: P */
    public boolean f10609P;

    /* JADX INFO: renamed from: Q */
    public boolean f10610Q;

    /* JADX INFO: renamed from: R */
    public RenderMode f10611R;

    /* JADX INFO: renamed from: S */
    public boolean f10612S;

    /* JADX INFO: renamed from: T */
    public final Matrix f10613T;

    /* JADX INFO: renamed from: U */
    public Bitmap f10614U;

    /* JADX INFO: renamed from: V */
    public Canvas f10615V;

    /* JADX INFO: renamed from: W */
    public Rect f10616W;

    /* JADX INFO: renamed from: X */
    public RectF f10617X;

    /* JADX INFO: renamed from: Y */
    public yk4 f10618Y;

    /* JADX INFO: renamed from: Z */
    public Rect f10619Z;

    /* JADX INFO: renamed from: a */
    public gl5 f10620a;

    /* JADX INFO: renamed from: a0 */
    public Rect f10621a0;

    /* JADX INFO: renamed from: b */
    public final dm5 f10622b;

    /* JADX INFO: renamed from: b0 */
    public RectF f10623b0;

    /* JADX INFO: renamed from: c */
    public final boolean f10624c;

    /* JADX INFO: renamed from: c0 */
    public RectF f10625c0;

    /* JADX INFO: renamed from: d */
    public boolean f10626d;

    /* JADX INFO: renamed from: d0 */
    public Matrix f10627d0;

    /* JADX INFO: renamed from: e */
    public boolean f10628e;

    /* JADX INFO: renamed from: e0 */
    public final float[] f10629e0;

    /* JADX INFO: renamed from: f */
    public LottieDrawable$OnVisibleAction f10630f;

    /* JADX INFO: renamed from: f0 */
    public Matrix f10631f0;

    /* JADX INFO: renamed from: g */
    public final ArrayList f10632g;

    /* JADX INFO: renamed from: g0 */
    public boolean f10633g0;

    /* JADX INFO: renamed from: h */
    public gv5 f10634h;

    /* JADX INFO: renamed from: h0 */
    public AsyncUpdates f10635h0;

    /* JADX INFO: renamed from: i */
    public String f10636i;

    /* JADX INFO: renamed from: i0 */
    public final Semaphore f10637i0;

    /* JADX INFO: renamed from: j */
    public ca1 f10638j;

    /* JADX INFO: renamed from: j0 */
    public final RunnableC3781y2 f10639j0;

    /* JADX INFO: renamed from: k */
    public Map f10640k;

    /* JADX INFO: renamed from: k0 */
    public float f10641k0;

    /* JADX INFO: renamed from: l */
    public String f10642l;

    public C0868b() {
        dm5 dm5Var = new dm5();
        this.f10622b = dm5Var;
        this.f10624c = true;
        this.f10626d = false;
        this.f10628e = false;
        this.f10630f = LottieDrawable$OnVisibleAction.NONE;
        this.f10632g = new ArrayList();
        this.f10601H = new vqb(19);
        this.f10602I = false;
        this.f10603J = true;
        this.f10605L = 255;
        this.f10610Q = false;
        this.f10611R = RenderMode.AUTOMATIC;
        this.f10612S = false;
        this.f10613T = new Matrix();
        this.f10629e0 = new float[9];
        this.f10633g0 = false;
        ba0 ba0Var = new ba0(this, 4);
        this.f10637i0 = new Semaphore(1);
        this.f10639j0 = new RunnableC3781y2(this, 26);
        this.f10641k0 = -3.4028235E38f;
        dm5Var.addUpdateListener(ba0Var);
    }

    /* JADX INFO: renamed from: f */
    public static void m4985f(Rect rect, RectF rectF) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    /* JADX INFO: renamed from: m */
    public static boolean m4986m(float f) {
        return (Float.isNaN(f) || Float.isInfinite(f)) ? false : true;
    }

    /* JADX INFO: renamed from: A */
    public final void m4987A(int i) {
        if (this.f10620a == null) {
            this.f10632g.add(new pl5(this, i, 0));
        } else {
            dm5 dm5Var = this.f10622b;
            dm5Var.m10481i(dm5Var.f35835j, i + 0.99f);
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m4988B(String str) {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            this.f10632g.add(new ol5(this, str, 1));
            return;
        }
        gq5 gq5VarM12733g = gl5Var.m12733g(str);
        if (gq5VarM12733g != null) {
            m4987A((int) (gq5VarM12733g.f41187b + gq5VarM12733g.f41188c));
        } else {
            C3386nv.m17626m(wq1.m24118n("Cannot find marker with name ", str, "."));
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m4989C(String str) {
        gl5 gl5Var = this.f10620a;
        ArrayList arrayList = this.f10632g;
        if (gl5Var == null) {
            arrayList.add(new ol5(this, str, 0));
            return;
        }
        gq5 gq5VarM12733g = gl5Var.m12733g(str);
        if (gq5VarM12733g == null) {
            C3386nv.m17626m(wq1.m24118n("Cannot find marker with name ", str, "."));
            return;
        }
        int i = (int) gq5VarM12733g.f41187b;
        int i2 = ((int) gq5VarM12733g.f41188c) + i;
        if (this.f10620a == null) {
            arrayList.add(new sl5(this, i, i2));
        } else {
            this.f10622b.m10481i(i, i2 + 0.99f);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4990D(int i) {
        if (this.f10620a == null) {
            this.f10632g.add(new pl5(this, i, 1));
        } else {
            dm5 dm5Var = this.f10622b;
            dm5Var.m10481i(i, (int) dm5Var.f35836k);
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4991E(String str) {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            this.f10632g.add(new ol5(this, str, 2));
            return;
        }
        gq5 gq5VarM12733g = gl5Var.m12733g(str);
        if (gq5VarM12733g != null) {
            m4990D((int) gq5VarM12733g.f41187b);
        } else {
            C3386nv.m17626m(wq1.m24118n("Cannot find marker with name ", str, "."));
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4992F(boolean z) {
        if (this.f10607N == z) {
            return;
        }
        this.f10607N = z;
        rf1 rf1Var = this.f10604K;
        if (rf1Var != null) {
            rf1Var.mo17868p(z);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4993G(float f) {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            this.f10632g.add(new rl5(this, f, 2));
        } else {
            AsyncUpdates asyncUpdates = wk4.f66962a;
            this.f10622b.m10480h(f06.m11425f(gl5Var.f40968l, gl5Var.f40969m, f));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4994H(RenderMode renderMode) {
        this.f10611R = renderMode;
        m5001e();
    }

    /* JADX INFO: renamed from: I */
    public final void m4995I() {
        this.f10628e = false;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m4996J() {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            return false;
        }
        float f = this.f10641k0;
        float fM10473a = this.f10622b.m10473a();
        this.f10641k0 = fM10473a;
        return Math.abs(fM10473a - f) * gl5Var.m12729c() >= 50.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m4997a(final mi4 mi4Var, final Object obj, final p33 p33Var) {
        rf1 rf1Var = this.f10604K;
        if (rf1Var == null) {
            this.f10632g.add(new ul5() { // from class: ql5
                @Override // p000.ul5
                public final void run() {
                    this.f57900a.m4997a(mi4Var, obj, p33Var);
                }
            });
            return;
        }
        boolean zIsEmpty = true;
        if (mi4Var == mi4.f51356c) {
            rf1Var.mo9830f(p33Var, obj);
        } else {
            ni4 ni4Var = mi4Var.f51358b;
            if (ni4Var != null) {
                ni4Var.mo9830f(p33Var, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f10604K.mo9829c(mi4Var, 0, arrayList, new mi4(new String[0]));
                for (int i = 0; i < arrayList.size(); i++) {
                    ((mi4) arrayList.get(i)).f51358b.mo9830f(p33Var, obj);
                }
                zIsEmpty = true ^ arrayList.isEmpty();
            }
        }
        if (zIsEmpty) {
            invalidateSelf();
            if (obj == yl5.f69993C) {
                m4993G(this.f10622b.m10473a());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m4998b(Context context) {
        if (this.f10626d) {
            return true;
        }
        if (!this.f10624c) {
            return false;
        }
        wk4.f66965d.getClass();
        return ((context == null || (fna.m11958d(context) > 0.0f ? 1 : (fna.m11958d(context) == 0.0f ? 0 : -1)) != 0) ? ReducedMotionMode.STANDARD_MOTION : ReducedMotionMode.REDUCED_MOTION) == ReducedMotionMode.STANDARD_MOTION;
    }

    /* JADX INFO: renamed from: c */
    public final void m4999c() {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            return;
        }
        p33 p33Var = wp4.f67151a;
        Rect rect = gl5Var.f40967k;
        List list = Collections.EMPTY_LIST;
        rf1 rf1Var = new rf1(this, new tp4(list, gl5Var, "__container", -1L, Layer$LayerType.PRE_COMP, -1L, null, list, new C0852cm(), 0, 0, 0, 0.0f, 0.0f, rect.width(), rect.height(), null, null, list, Layer$MatteType.NONE, null, false, null, null, LBlendMode.NORMAL), gl5Var.f40966j, gl5Var);
        this.f10604K = rf1Var;
        if (this.f10607N) {
            rf1Var.mo17868p(true);
        }
        this.f10604K.f59189K = this.f10603J;
    }

    /* JADX INFO: renamed from: d */
    public final void m5000d() {
        dm5 dm5Var = this.f10622b;
        if (dm5Var.f35824H) {
            dm5Var.cancel();
            if (!isVisible()) {
                this.f10630f = LottieDrawable$OnVisibleAction.NONE;
            }
        }
        this.f10620a = null;
        this.f10604K = null;
        this.f10634h = null;
        this.f10641k0 = -3.4028235E38f;
        dm5Var.f35837l = null;
        dm5Var.f35835j = -2.1474836E9f;
        dm5Var.f35836k = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        rf1 rf1Var = this.f10604K;
        if (rf1Var == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.f10635h0;
        if (asyncUpdates == null) {
            asyncUpdates = wk4.f66962a;
        }
        boolean z = asyncUpdates == AsyncUpdates.ENABLED;
        RunnableC3781y2 runnableC3781y2 = this.f10639j0;
        ThreadPoolExecutor threadPoolExecutor = f10600m0;
        dm5 dm5Var = this.f10622b;
        Semaphore semaphore = this.f10637i0;
        if (z) {
            try {
                semaphore.acquire();
            } catch (InterruptedException unused) {
                AsyncUpdates asyncUpdates2 = wk4.f66962a;
                if (!z) {
                    return;
                }
                semaphore.release();
                if (rf1Var.f59188J == dm5Var.m10473a()) {
                    return;
                }
            } catch (Throwable th) {
                AsyncUpdates asyncUpdates3 = wk4.f66962a;
                if (z) {
                    semaphore.release();
                    if (rf1Var.f59188J != dm5Var.m10473a()) {
                        threadPoolExecutor.execute(runnableC3781y2);
                    }
                }
                throw th;
            }
        }
        AsyncUpdates asyncUpdates4 = wk4.f66962a;
        if (z && m4996J()) {
            m4993G(dm5Var.m10473a());
        }
        boolean z2 = this.f10628e;
        boolean z3 = this.f10612S;
        if (z2) {
            try {
                if (z3) {
                    m5010p(canvas, rf1Var);
                } else {
                    m5003h(canvas);
                }
            } catch (Throwable unused2) {
                tj5.m22150b();
            }
        } else if (z3) {
            m5010p(canvas, rf1Var);
        } else {
            m5003h(canvas);
        }
        this.f10633g0 = false;
        AsyncUpdates asyncUpdates5 = wk4.f66962a;
        if (z) {
            semaphore.release();
            if (rf1Var.f59188J == dm5Var.m10473a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC3781y2);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5001e() {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            return;
        }
        this.f10612S = this.f10611R.useSoftwareRendering(Build.VERSION.SDK_INT, gl5Var.f40971o, gl5Var.f40972p);
    }

    /* JADX INFO: renamed from: g */
    public final void m5002g(Canvas canvas, Matrix matrix) {
        rf1 rf1Var = this.f10604K;
        gl5 gl5Var = this.f10620a;
        if (rf1Var == null || gl5Var == null) {
            return;
        }
        AsyncUpdates asyncUpdates = this.f10635h0;
        if (asyncUpdates == null) {
            asyncUpdates = wk4.f66962a;
        }
        boolean z = asyncUpdates == AsyncUpdates.ENABLED;
        RunnableC3781y2 runnableC3781y2 = this.f10639j0;
        ThreadPoolExecutor threadPoolExecutor = f10600m0;
        dm5 dm5Var = this.f10622b;
        Semaphore semaphore = this.f10637i0;
        if (z) {
            try {
                semaphore.acquire();
                if (m4996J()) {
                    m4993G(dm5Var.m10473a());
                }
            } catch (InterruptedException unused) {
                if (!z) {
                    return;
                }
                semaphore.release();
                if (rf1Var.f59188J == dm5Var.m10473a()) {
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    semaphore.release();
                    if (rf1Var.f59188J != dm5Var.m10473a()) {
                        threadPoolExecutor.execute(runnableC3781y2);
                    }
                }
                throw th;
            }
        }
        boolean z2 = this.f10628e;
        int i = this.f10605L;
        boolean z3 = this.f10612S;
        if (z2) {
            try {
                if (z3) {
                    canvas.save();
                    canvas.concat(matrix);
                    m5010p(canvas, rf1Var);
                    canvas.restore();
                } else {
                    rf1Var.mo556h(canvas, matrix, i, null);
                }
            } catch (Throwable unused2) {
                tj5.m22150b();
            }
        } else if (z3) {
            canvas.save();
            canvas.concat(matrix);
            m5010p(canvas, rf1Var);
            canvas.restore();
        } else {
            rf1Var.mo556h(canvas, matrix, i, null);
        }
        this.f10633g0 = false;
        if (z) {
            semaphore.release();
            if (rf1Var.f59188J == dm5Var.m10473a()) {
                return;
            }
            threadPoolExecutor.execute(runnableC3781y2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f10605L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            return -1;
        }
        return gl5Var.f40967k.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        gl5 gl5Var = this.f10620a;
        if (gl5Var == null) {
            return -1;
        }
        return gl5Var.f40967k.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* JADX INFO: renamed from: h */
    public final void m5003h(Canvas canvas) {
        rf1 rf1Var = this.f10604K;
        gl5 gl5Var = this.f10620a;
        if (rf1Var == null || gl5Var == null) {
            return;
        }
        Matrix matrix = this.f10613T;
        matrix.reset();
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            float fWidth = bounds.width() / gl5Var.f40967k.width();
            float fHeight = bounds.height() / gl5Var.f40967k.height();
            matrix.preTranslate(bounds.left, bounds.top);
            matrix.preScale(fWidth, fHeight);
        }
        rf1Var.mo556h(canvas, matrix, this.f10605L, null);
    }

    /* JADX INFO: renamed from: i */
    public final void m5004i(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        boolean zRemove;
        HashSet hashSet = (HashSet) this.f10601H.f65802b;
        if (!z) {
            zRemove = hashSet.remove(lottieFeatureFlag);
        } else if (Build.VERSION.SDK_INT < lottieFeatureFlag.minRequiredSdkVersion) {
            tj5.m22151c(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
            zRemove = false;
        } else {
            zRemove = hashSet.add(lottieFeatureFlag);
        }
        if (this.f10620a == null || !zRemove) {
            return;
        }
        m4999c();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.f10633g0) {
            return;
        }
        this.f10633g0 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        dm5 dm5Var = this.f10622b;
        if (dm5Var == null) {
            return false;
        }
        return dm5Var.f35824H;
    }

    /* JADX INFO: renamed from: j */
    public final Context m5005j() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final ca1 m5006k() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f10638j == null) {
            Drawable.Callback callback = getCallback();
            ca1 ca1Var = new ca1();
            ca1Var.f9781a = new mp2();
            ca1Var.f9782b = new HashMap();
            ca1Var.f9783c = new HashMap();
            ca1Var.f9785e = ".ttf";
            if (callback instanceof View) {
                ca1Var.f9784d = ((View) callback).getContext().getAssets();
            } else {
                tj5.m22151c("LottieDrawable must be inside of a view for images to work.");
                ca1Var.f9784d = null;
            }
            this.f10638j = ca1Var;
            String str = this.f10642l;
            if (str != null) {
                ca1Var.f9785e = str;
            }
        }
        return this.f10638j;
    }

    /* JADX INFO: renamed from: l */
    public final gq5 m5007l() {
        Iterator it = f10599l0.iterator();
        gq5 gq5VarM12733g = null;
        while (it.hasNext()) {
            gq5VarM12733g = this.f10620a.m12733g((String) it.next());
            if (gq5VarM12733g != null) {
                break;
            }
        }
        return gq5VarM12733g;
    }

    /* JADX INFO: renamed from: n */
    public final void m5008n() {
        this.f10632g.clear();
        dm5 dm5Var = this.f10622b;
        dm5Var.m10479g(true);
        Iterator it = dm5Var.f35828c.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorPauseListener) it.next()).onAnimationPause(dm5Var);
        }
        if (isVisible()) {
            return;
        }
        this.f10630f = LottieDrawable$OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: o */
    public final void m5009o() {
        if (this.f10604K == null) {
            this.f10632g.add(new tl5(this, 1));
            return;
        }
        m5001e();
        boolean zM4998b = m4998b(m5005j());
        dm5 dm5Var = this.f10622b;
        if (zM4998b || dm5Var.getRepeatCount() == 0) {
            if (isVisible()) {
                dm5Var.f35824H = true;
                boolean zM10476d = dm5Var.m10476d();
                Iterator it = dm5Var.f35827b.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorListener) it.next()).onAnimationStart(dm5Var, zM10476d);
                }
                dm5Var.m10480h((int) (dm5Var.m10476d() ? dm5Var.m10474b() : dm5Var.m10475c()));
                dm5Var.f35831f = 0L;
                dm5Var.f35834i = 0;
                if (dm5Var.f35824H) {
                    dm5Var.m10479g(false);
                    Choreographer.getInstance().postFrameCallback(dm5Var);
                }
                this.f10630f = LottieDrawable$OnVisibleAction.NONE;
            } else {
                this.f10630f = LottieDrawable$OnVisibleAction.PLAY;
            }
        }
        if (m4998b(m5005j())) {
            return;
        }
        gq5 gq5VarM5007l = m5007l();
        if (gq5VarM5007l != null) {
            m5019y((int) gq5VarM5007l.f41187b);
        } else {
            m5019y((int) (dm5Var.f35829d < 0.0f ? dm5Var.m10475c() : dm5Var.m10474b()));
        }
        dm5Var.m10479g(true);
        dm5Var.m10477e(dm5Var.m10476d());
        if (isVisible()) {
            return;
        }
        this.f10630f = LottieDrawable$OnVisibleAction.NONE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00d3  */
    /* JADX INFO: renamed from: p */
    public final void m5010p(Canvas canvas, rf1 rf1Var) {
        boolean z;
        if (this.f10620a == null || rf1Var == null) {
            return;
        }
        if (this.f10615V == null) {
            this.f10615V = new Canvas();
            this.f10625c0 = new RectF();
            this.f10627d0 = new Matrix();
            this.f10631f0 = new Matrix();
            this.f10616W = new Rect();
            this.f10617X = new RectF();
            this.f10618Y = new yk4();
            this.f10619Z = new Rect();
            this.f10621a0 = new Rect();
            this.f10623b0 = new RectF();
        }
        canvas.getMatrix(this.f10627d0);
        canvas.getClipBounds(this.f10616W);
        Rect rect = this.f10616W;
        this.f10617X.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f10627d0.mapRect(this.f10617X);
        m4985f(this.f10616W, this.f10617X);
        boolean z2 = this.f10603J;
        RectF rectF = this.f10625c0;
        if (z2) {
            rectF.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            rf1Var.mo555d(rectF, null, false);
        }
        this.f10627d0.mapRect(this.f10625c0);
        Rect bounds = getBounds();
        float fWidth = bounds.width() / getIntrinsicWidth();
        float fHeight = bounds.height() / getIntrinsicHeight();
        RectF rectF2 = this.f10625c0;
        rectF2.set(rectF2.left * fWidth, rectF2.top * fHeight, rectF2.right * fWidth, rectF2.bottom * fHeight);
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            ViewParent parent = ((View) callback).getParent();
            if (parent instanceof ViewGroup) {
                z = !((ViewGroup) parent).getClipChildren();
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (!z) {
            RectF rectF3 = this.f10625c0;
            Rect rect2 = this.f10616W;
            rectF3.intersect(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        RectF rectF4 = this.f10625c0;
        if (!m4986m(rectF4.left) || !m4986m(rectF4.top) || !m4986m(rectF4.right) || !m4986m(rectF4.bottom)) {
            tj5.m22151c("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int iCeil = (int) Math.ceil(this.f10625c0.width());
        int iCeil2 = (int) Math.ceil(this.f10625c0.height());
        if (iCeil <= 0 || iCeil2 <= 0) {
            tj5.m22151c("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ((long) iCeil) * ((long) iCeil2);
        if (j > 50000000) {
            tj5.m22151c("Skipping software rendering: bitmap request exceeds safe pixel count (" + j + ")");
            return;
        }
        Bitmap bitmap = this.f10614U;
        if (bitmap == null || bitmap.getWidth() < iCeil || this.f10614U.getHeight() < iCeil2) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil2, Bitmap.Config.ARGB_8888);
            this.f10614U = bitmapCreateBitmap;
            this.f10615V.setBitmap(bitmapCreateBitmap);
            this.f10633g0 = true;
        } else if (this.f10614U.getWidth() > iCeil || this.f10614U.getHeight() > iCeil2) {
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f10614U, 0, 0, iCeil, iCeil2);
            this.f10614U = bitmapCreateBitmap2;
            this.f10615V.setBitmap(bitmapCreateBitmap2);
            this.f10633g0 = true;
        }
        if (this.f10633g0) {
            Matrix matrix = this.f10627d0;
            float[] fArr = this.f10629e0;
            matrix.getValues(fArr);
            float f = fArr[0];
            float f2 = fArr[4];
            Matrix matrix2 = this.f10627d0;
            Matrix matrix3 = this.f10613T;
            matrix3.set(matrix2);
            matrix3.preScale(fWidth, fHeight);
            RectF rectF5 = this.f10625c0;
            matrix3.postTranslate(-rectF5.left, -rectF5.top);
            matrix3.postScale(1.0f / f, 1.0f / f2);
            this.f10614U.eraseColor(0);
            this.f10615V.setMatrix(fna.f39347a);
            this.f10615V.scale(f, f2);
            rf1Var.mo556h(this.f10615V, matrix3, this.f10605L, null);
            this.f10627d0.invert(this.f10631f0);
            this.f10631f0.mapRect(this.f10623b0, this.f10625c0);
            m4985f(this.f10621a0, this.f10623b0);
        }
        this.f10619Z.set(0, 0, iCeil, iCeil2);
        canvas.drawBitmap(this.f10614U, this.f10619Z, this.f10621a0, this.f10618Y);
    }

    /* JADX INFO: renamed from: q */
    public final void m5011q() {
        if (this.f10604K == null) {
            this.f10632g.add(new tl5(this, 0));
            return;
        }
        m5001e();
        boolean zM4998b = m4998b(m5005j());
        dm5 dm5Var = this.f10622b;
        if (zM4998b || dm5Var.getRepeatCount() == 0) {
            if (isVisible()) {
                dm5Var.f35824H = true;
                dm5Var.m10479g(false);
                Choreographer.getInstance().postFrameCallback(dm5Var);
                dm5Var.f35831f = 0L;
                if (dm5Var.m10476d() && dm5Var.f35833h == dm5Var.m10475c()) {
                    dm5Var.m10480h(dm5Var.m10474b());
                } else if (!dm5Var.m10476d() && dm5Var.f35833h == dm5Var.m10474b()) {
                    dm5Var.m10480h(dm5Var.m10475c());
                }
                Iterator it = dm5Var.f35828c.iterator();
                while (it.hasNext()) {
                    ((Animator.AnimatorPauseListener) it.next()).onAnimationResume(dm5Var);
                }
                this.f10630f = LottieDrawable$OnVisibleAction.NONE;
            } else {
                this.f10630f = LottieDrawable$OnVisibleAction.RESUME;
            }
        }
        if (m4998b(m5005j())) {
            return;
        }
        m5019y((int) (dm5Var.f35829d < 0.0f ? dm5Var.m10475c() : dm5Var.m10474b()));
        dm5Var.m10479g(true);
        dm5Var.m10477e(dm5Var.m10476d());
        if (isVisible()) {
            return;
        }
        this.f10630f = LottieDrawable$OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: r */
    public final void m5012r() {
        this.f10608O = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m5013s() {
        this.f10609P = true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f10605L = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        tj5.m22151c("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean zIsVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            LottieDrawable$OnVisibleAction lottieDrawable$OnVisibleAction = this.f10630f;
            if (lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.PLAY) {
                m5009o();
                return visible;
            }
            if (lottieDrawable$OnVisibleAction == LottieDrawable$OnVisibleAction.RESUME) {
                m5011q();
                return visible;
            }
        } else {
            if (this.f10622b.f35824H) {
                m5008n();
                this.f10630f = LottieDrawable$OnVisibleAction.RESUME;
                return visible;
            }
            if (zIsVisible) {
                this.f10630f = LottieDrawable$OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        m5009o();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f10632g.clear();
        dm5 dm5Var = this.f10622b;
        dm5Var.m10479g(true);
        dm5Var.m10477e(dm5Var.m10476d());
        if (isVisible()) {
            return;
        }
        this.f10630f = LottieDrawable$OnVisibleAction.NONE;
    }

    /* JADX INFO: renamed from: t */
    public final void m5014t(AsyncUpdates asyncUpdates) {
        this.f10635h0 = asyncUpdates;
    }

    /* JADX INFO: renamed from: u */
    public final void m5015u(boolean z) {
        if (z != this.f10610Q) {
            this.f10610Q = z;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    /* JADX INFO: renamed from: v */
    public final void m5016v(boolean z) {
        if (z != this.f10603J) {
            this.f10603J = z;
            rf1 rf1Var = this.f10604K;
            if (rf1Var != null) {
                rf1Var.f59189K = z;
            }
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: w */
    public final boolean m5017w(gl5 gl5Var) {
        if (this.f10620a == gl5Var) {
            return false;
        }
        this.f10633g0 = true;
        m5000d();
        this.f10620a = gl5Var;
        m4999c();
        dm5 dm5Var = this.f10622b;
        boolean z = dm5Var.f35837l == null;
        dm5Var.f35837l = gl5Var;
        if (z) {
            dm5Var.m10481i(Math.max(dm5Var.f35835j, gl5Var.f40968l), Math.min(dm5Var.f35836k, gl5Var.f40969m));
        } else {
            dm5Var.m10481i((int) gl5Var.f40968l, (int) gl5Var.f40969m);
        }
        float f = dm5Var.f35833h;
        dm5Var.f35833h = 0.0f;
        dm5Var.f35832g = 0.0f;
        dm5Var.m10480h((int) f);
        dm5Var.m10478f();
        m4993G(dm5Var.getAnimatedFraction());
        ArrayList arrayList = this.f10632g;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            ul5 ul5Var = (ul5) it.next();
            if (ul5Var != null) {
                ul5Var.run();
            }
            it.remove();
        }
        arrayList.clear();
        gl5Var.f40957a.f35087a = this.f10606M;
        m5001e();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: x */
    public final void m5018x(Map map) {
        if (map == this.f10640k) {
            return;
        }
        this.f10640k = map;
        invalidateSelf();
    }

    /* JADX INFO: renamed from: y */
    public final void m5019y(int i) {
        if (this.f10620a != null) {
            this.f10622b.m10480h(i);
        } else {
            this.f10632g.add(new pl5(this, i, 2));
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5020z() {
        this.f10602I = false;
    }
}
