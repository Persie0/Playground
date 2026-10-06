package p000;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.RectEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class icc {

    /* JADX INFO: renamed from: A */
    public mrm f30298A;

    /* JADX INFO: renamed from: B */
    public ica f30299B;

    /* JADX INFO: renamed from: C */
    public dcj f30300C;

    /* JADX INFO: renamed from: D */
    public kmq f30301D;

    /* JADX INFO: renamed from: E */
    public final List f30302E;

    /* JADX INFO: renamed from: F */
    public int f30303F;

    /* JADX INFO: renamed from: H */
    private final ViewGroup f30304H;

    /* JADX INFO: renamed from: I */
    private boolean f30305I;

    /* JADX INFO: renamed from: J */
    private boolean f30306J;

    /* JADX INFO: renamed from: c */
    public final ObjectAnimator f30307c;

    /* JADX INFO: renamed from: d */
    public final ValueAnimator f30308d;

    /* JADX INFO: renamed from: e */
    public final BaseInterpolator f30309e;

    /* JADX INFO: renamed from: f */
    public AnimatorSet f30310f;

    /* JADX INFO: renamed from: g */
    public final Paint f30311g;

    /* JADX INFO: renamed from: h */
    public final Paint f30312h;

    /* JADX INFO: renamed from: i */
    public final Paint f30313i;

    /* JADX INFO: renamed from: j */
    public final Handler f30314j;

    /* JADX INFO: renamed from: k */
    public mrm f30315k;

    /* JADX INFO: renamed from: l */
    public Rect f30316l;

    /* JADX INFO: renamed from: m */
    public ibz f30317m;

    /* JADX INFO: renamed from: n */
    public int f30318n;

    /* JADX INFO: renamed from: o */
    public mrm f30319o;

    /* JADX INFO: renamed from: p */
    public float f30320p;

    /* JADX INFO: renamed from: q */
    public jwn f30321q;

    /* JADX INFO: renamed from: r */
    public int f30322r;

    /* JADX INFO: renamed from: s */
    public jww f30323s;

    /* JADX INFO: renamed from: t */
    public mrm f30324t;

    /* JADX INFO: renamed from: u */
    public ikw f30325u;

    /* JADX INFO: renamed from: v */
    public int f30326v;

    /* JADX INFO: renamed from: w */
    public View f30327w;

    /* JADX INFO: renamed from: x */
    public View f30328x;

    /* JADX INFO: renamed from: y */
    public boolean f30329y;

    /* JADX INFO: renamed from: z */
    public int f30330z;

    /* JADX INFO: renamed from: a */
    public static final nbh f30296a = nbh.m17259h("com/google/android/apps/camera/ui/modeswitch/animation/ViewfinderCoverAnimator");

    /* JADX INFO: renamed from: G */
    private static final int f30295G = Math.round(102.0f);

    /* JADX INFO: renamed from: b */
    static final int f30297b = hyn.OFF.f29942e;

    public icc(ViewGroup viewGroup) {
        mqu mquVar = mqu.f41450a;
        this.f30315k = mquVar;
        this.f30318n = 0;
        this.f30319o = mquVar;
        this.f30320p = 1.0f;
        this.f30322r = -1;
        this.f30323s = jwv.m13644a(Integer.valueOf(f30297b));
        this.f30324t = mqu.f41450a;
        this.f30303F = 1;
        this.f30325u = ikw.UNINITIALIZED;
        this.f30326v = 0;
        this.f30329y = true;
        this.f30330z = 0;
        this.f30298A = mqu.f41450a;
        this.f30299B = new ica() { // from class: ibt
            @Override // p000.ica
            /* JADX INFO: renamed from: a */
            public final boolean mo7756a() {
                nbh nbhVar = icc.f30296a;
                return false;
            }
        };
        this.f30305I = false;
        this.f30300C = new dcj() { // from class: ibu
            @Override // p000.dcj
            /* JADX INFO: renamed from: d */
            public final kmq mo5895d() {
                nbh nbhVar = icc.f30296a;
                return kmq.BACK;
            }
        };
        this.f30301D = kmq.BACK;
        this.f30302E = new ArrayList();
        this.f30306J = false;
        this.f30304H = viewGroup;
        this.f30310f = new AnimatorSet();
        this.f30309e = new AccelerateDecelerateInterpolator();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, 1.0f, 0.0f);
        this.f30307c = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.addListener(new ibx(this));
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        Paint paint = new Paint();
        this.f30311g = paint;
        paint.setFilterBitmap(true);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        Paint paint2 = new Paint();
        this.f30313i = paint2;
        paint2.setColor(-16777216);
        Paint paint3 = new Paint();
        this.f30312h = paint3;
        paint3.setAlpha(0);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, f30295G);
        this.f30308d = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new afx(this, 20));
        valueAnimatorOfInt.setDuration(250L);
        this.f30316l = new Rect(0, 0, 1, 1);
        lmv lmvVarM11034a = ibz.m11034a();
        lmvVarM11034a.m15740e(new Rect(0, 0, 1, 1));
        lmvVarM11034a.m15739d(0);
        this.f30317m = lmvVarM11034a.m15738c();
        this.f30314j = jvh.m13557e(Looper.getMainLooper());
        viewGroup.setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public static float m11043a(Rect rect) {
        if (rect.height() == 0.0f) {
            return 0.0f;
        }
        return rect.width() / rect.height();
    }

    /* JADX INFO: renamed from: b */
    public static ValueAnimator m11044b(Rect rect, Rect rect2, TimeInterpolator timeInterpolator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new RectEvaluator(new Rect()), rect, rect2);
        valueAnimatorOfObject.setInterpolator(timeInterpolator);
        valueAnimatorOfObject.addUpdateListener(animatorUpdateListener);
        return valueAnimatorOfObject;
    }

    /* JADX INFO: renamed from: c */
    public static void m11045c(Canvas canvas, Rect rect, int i, Paint paint) {
        if (i <= 0) {
            canvas.drawRect(rect, paint);
        } else {
            float f = i;
            canvas.drawRoundRect(rect.left, rect.top, rect.right, rect.bottom, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: q */
    private final int m11046q() {
        int i = this.f30326v + 1;
        this.f30326v = i;
        return i;
    }

    /* JADX INFO: renamed from: d */
    public final void m11047d() {
        int i = this.f30322r;
        if (i != -1) {
            this.f30323s.mo3415bf(Integer.valueOf(i));
            this.f30322r = -1;
        }
        this.f30303F = 5;
        this.f30307c.start();
    }

    /* JADX INFO: renamed from: e */
    public final void m11048e() {
        this.f30304H.setVisibility(8);
        this.f30303F = 1;
        m11046q();
        this.f30315k = mqu.f41450a;
        this.f30304H.setLayerType(0, null);
        if (this.f30306J && this.f30298A.mo16813g()) {
            ((ggm) this.f30298A.mo16809c()).mo9214b(icc.class);
            this.f30306J = false;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m11049f() {
        this.f30327w.setVisibility(8);
    }

    /* JADX INFO: renamed from: g */
    public final void m11050g() {
        this.f30328x.setVisibility(8);
    }

    /* JADX INFO: renamed from: h */
    public final void m11051h() {
        this.f30304H.invalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m11052i() {
        this.f30304H.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: j */
    public final void m11053j(Rect rect) {
        this.f30316l.set(rect);
        m11052i();
    }

    /* JADX INFO: renamed from: k */
    final void m11054k(Runnable runnable) {
        this.f30324t = mrm.m16829i(runnable);
    }

    /* JADX INFO: renamed from: l */
    public final void m11055l() {
        if (this.f30304H.getVisibility() != 0) {
            this.f30307c.cancel();
            this.f30304H.setVisibility(0);
        }
        this.f30304H.setAlpha(1.0f);
    }

    /* JADX INFO: renamed from: m */
    public final void m11056m() {
        this.f30327w.setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    final boolean m11057n() {
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (this.f30325u.ordinal()) {
            case 2:
            case 13:
            case 19:
                return this.f30299B.mo7756a();
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11058o() {
        return m11057n() && !this.f30305I;
    }

    /* JADX INFO: renamed from: p */
    public final void m11059p(final ikw ikwVar, final Runnable runnable, final icb icbVar, final iby ibyVar) {
        Runnable runnable2 = new Runnable() { // from class: ibv
            @Override // java.lang.Runnable
            public final void run() {
                this.f30272a.m11059p(ikwVar, runnable, icbVar, ibyVar);
            }
        };
        if (this.f30303F == 5) {
            m11054k(new hri(this.f30324t, runnable2, 8));
            return;
        }
        int iM11046q = m11046q();
        m11054k(runnable);
        if (this.f30298A.mo16813g()) {
            ((ggm) this.f30298A.mo16809c()).mo9213a(icc.class);
            this.f30306J = true;
        }
        int i = 2;
        this.f30304H.setLayerType(2, null);
        this.f30329y = icbVar.mo4496h();
        this.f30305I = m11057n();
        if (this.f30322r == -1) {
            this.f30322r = ((Integer) this.f30323s.mo3831be()).intValue();
            this.f30323s.mo3415bf(Integer.valueOf(f30297b));
        }
        mrm mrmVarMo4491c = icbVar.mo4491c();
        mrm mrmVarMo4490b = icbVar.mo4490b();
        this.f30308d.removeAllListeners();
        this.f30325u = ikwVar;
        this.f30320p = ((Float) this.f30321q.mo3831be()).floatValue();
        int i2 = this.f30303F;
        if (i2 == 5) {
            ((nbe) ((nbe) f30296a.m17251b()).mo17276G((char) 4118)).mo17290o("Somehow trying to go from FADING to WAITING_FOR_BITMAP: Illegal!");
            throw new IllegalStateException("Going from FADING to WAITING_FOR_BITMAP");
        }
        if (i2 == 1) {
            this.f30307c.cancel();
            this.f30310f.cancel();
            this.f30308d.cancel();
            this.f30315k = mrmVarMo4491c;
            if (mrmVarMo4491c.mo16813g()) {
                ((ihy) mrmVarMo4491c.mo16809c()).f31023a.prepareToDraw();
                this.f30316l = ((ihy) mrmVarMo4491c.mo16809c()).m11372a();
                mrm mrmVarMo16808b = mrmVarMo4490b.mo16808b(hnk.f28492e);
                ihy ihyVar = (ihy) mrmVarMo4491c.mo16809c();
                Rect rect = (Rect) mrmVarMo16808b.mo16811e(new Rect(0, 0, ihyVar.f31023a.getWidth() * ihyVar.f31024b, ihyVar.f31023a.getHeight() * ihyVar.f31024b));
                mrm mrmVar = ((ihy) mrmVarMo4491c.mo16809c()).f31025c;
                if (mrmVar.mo16813g()) {
                    Rect rect2 = new Rect((Rect) mrmVar.mo16809c());
                    rect2.offset(rect.left, rect.top);
                    if (rect.contains(rect2)) {
                        rect = rect2;
                    } else {
                        ((nbe) ((nbe) f30296a.m17252c()).mo17276G(4114)).mo17301z("Source %s is not contained in preview box %s", rect2, rect);
                    }
                }
                lmv lmvVarM11034a = ibz.m11034a();
                lmvVarM11034a.m15740e(rect);
                lmvVarM11034a.m15739d(((Integer) mrmVarMo4490b.mo16808b(hnk.f28493f).mo16811e(0)).intValue());
                ibz ibzVarM15738c = lmvVarM11034a.m15738c();
                this.f30317m = ibzVarM15738c;
                this.f30330z = ibzVarM15738c.f30281b;
                this.f30308d.setIntValues(0, f30295G);
                this.f30318n = 0;
                this.f30303F = 2;
                m11051h();
            } else {
                this.f30303F = 1;
            }
        } else if (mrmVarMo4491c.mo16813g()) {
            this.f30303F = 2;
            m11051h();
        } else {
            this.f30303F = 1;
        }
        icbVar.mo4492d();
        icbVar.mo4493e();
        icbVar.mo4494f(ikwVar);
        m11055l();
        this.f30314j.postDelayed(new gdi(this, iM11046q, i), 4000L);
        gli gliVar = new gli(this, iM11046q, icbVar, ikwVar, ibyVar, 2);
        if (mrmVarMo4491c.mo16813g()) {
            this.f30319o = mrm.m16829i(gliVar);
        } else {
            gliVar.run();
        }
    }
}
