package p000;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.wear.ambient.AmbientMode;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class min {

    /* JADX INFO: renamed from: a */
    static final TimeInterpolator f40599a = mfs.f40385c;

    /* JADX INFO: renamed from: b */
    public static final int f40600b = C0100R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: c */
    public static final int f40601c = C0100R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: d */
    public static final int f40602d = C0100R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: e */
    public static final int f40603e = C0100R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: f */
    static final int[] f40604f = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: g */
    static final int[] f40605g = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: h */
    static final int[] f40606h = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: i */
    static final int[] f40607i = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: j */
    static final int[] f40608j = {R.attr.state_enabled};

    /* JADX INFO: renamed from: k */
    static final int[] f40609k = new int[0];

    /* JADX INFO: renamed from: B */
    public final FloatingActionButton f40611B;

    /* JADX INFO: renamed from: C */
    public ViewTreeObserver.OnPreDrawListener f40612C;

    /* JADX INFO: renamed from: D */
    final AmbientMode.AmbientController f40613D;

    /* JADX INFO: renamed from: I */
    private final mbb f40618I;

    /* JADX INFO: renamed from: l */
    public mlc f40619l;

    /* JADX INFO: renamed from: m */
    public mkx f40620m;

    /* JADX INFO: renamed from: n */
    public Drawable f40621n;

    /* JADX INFO: renamed from: o */
    public mhy f40622o;

    /* JADX INFO: renamed from: p */
    public Drawable f40623p;

    /* JADX INFO: renamed from: q */
    public boolean f40624q;

    /* JADX INFO: renamed from: r */
    public float f40625r;

    /* JADX INFO: renamed from: s */
    public float f40626s;

    /* JADX INFO: renamed from: t */
    public float f40627t;

    /* JADX INFO: renamed from: u */
    public int f40628u;

    /* JADX INFO: renamed from: v */
    public Animator f40629v;

    /* JADX INFO: renamed from: w */
    public mfv f40630w;

    /* JADX INFO: renamed from: x */
    public mfv f40631x;

    /* JADX INFO: renamed from: z */
    public int f40633z;

    /* JADX INFO: renamed from: y */
    public float f40632y = 1.0f;

    /* JADX INFO: renamed from: A */
    public int f40610A = 0;

    /* JADX INFO: renamed from: E */
    private final Rect f40614E = new Rect();

    /* JADX INFO: renamed from: F */
    private final RectF f40615F = new RectF();

    /* JADX INFO: renamed from: G */
    private final RectF f40616G = new RectF();

    /* JADX INFO: renamed from: H */
    private final Matrix f40617H = new Matrix();

    public min(FloatingActionButton floatingActionButton, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2) {
        this.f40611B = floatingActionButton;
        this.f40613D = ambientController;
        mbb mbbVar = new mbb();
        this.f40618I = mbbVar;
        mbbVar.m16293b(m16401o(new mik(this)));
        mbbVar.m16293b(m16401o(new mij(this)));
        mbbVar.m16293b(m16401o(new mij(this)));
        mbbVar.m16293b(m16401o(new mij(this)));
        mbbVar.m16293b(m16401o(new mil(this)));
        mbbVar.m16293b(m16401o(new mii(this)));
        floatingActionButton.getRotation();
    }

    /* JADX INFO: renamed from: o */
    private static final ValueAnimator m16401o(mim mimVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f40599a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(mimVar);
        valueAnimator.addUpdateListener(mimVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: a */
    public float mo16402a() {
        return this.f40625r;
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m16403b(mfv mfvVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f40611B, (Property<FloatingActionButton, Float>) View.ALPHA, f);
        mfvVar.m16345b("opacity").m16347b(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f40611B, (Property<FloatingActionButton, Float>) View.SCALE_X, f2);
        mfvVar.m16345b("scale").m16347b(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f40611B, (Property<FloatingActionButton, Float>) View.SCALE_Y, f2);
        mfvVar.m16345b("scale").m16347b(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        m16405d(f3, this.f40617H);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.f40611B, new mft(), new mig(this), new Matrix(this.f40617H));
        mfvVar.m16345b("iconScale").m16347b(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        kxk.m15029v(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final AnimatorSet m16404c(float f, float f2, float f3, int i, int i2) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new mih(this, this.f40611B.getAlpha(), f, this.f40611B.getScaleX(), f2, this.f40611B.getScaleY(), this.f40632y, f3, new Matrix(this.f40617H)));
        arrayList.add(valueAnimatorOfFloat);
        kxk.m15029v(animatorSet, arrayList);
        animatorSet.setDuration(lij.m15393A(this.f40611B.getContext(), i, this.f40611B.getContext().getResources().getInteger(C0100R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(lij.m15398F(this.f40611B.getContext(), i2, mfs.f40384b));
        return animatorSet;
    }

    /* JADX INFO: renamed from: d */
    public final void m16405d(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f40611B.getDrawable();
        if (drawable == null || this.f40633z == 0) {
            return;
        }
        RectF rectF = this.f40615F;
        RectF rectF2 = this.f40616G;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f2 = this.f40633z;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.f40633z / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    /* JADX INFO: renamed from: e */
    public void mo16406e(Rect rect) {
        int iM4838b = this.f40624q ? (this.f40628u - this.f40611B.m4838b()) / 2 : 0;
        float fMo16402a = mo16402a() + this.f40627t;
        int iMax = Math.max(iM4838b, (int) Math.ceil(fMo16402a));
        int iMax2 = Math.max(iM4838b, (int) Math.ceil(fMo16402a * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX INFO: renamed from: f */
    public void mo16407f(float f, float f2, float f3) {
        throw null;
    }

    /* JADX INFO: renamed from: g */
    public final void m16408g(float f) {
        this.f40632y = f;
        Matrix matrix = this.f40617H;
        m16405d(f, matrix);
        this.f40611B.setImageMatrix(matrix);
    }

    /* JADX INFO: renamed from: h */
    public final void m16409h(mlc mlcVar) {
        this.f40619l = mlcVar;
        mkx mkxVar = this.f40620m;
        if (mkxVar != null) {
            mkxVar.mo4827c(mlcVar);
        }
        mhy mhyVar = this.f40622o;
        if (mhyVar != null) {
            mhyVar.f40562h = mlcVar;
            mhyVar.invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m16410i() {
        m16408g(this.f40632y);
    }

    /* JADX INFO: renamed from: j */
    public final void m16411j() {
        Rect rect = this.f40614E;
        mo16406e(rect);
        abf.m91d(this.f40623p, "Didn't initialize content background");
        if (mo16413l()) {
            this.f40613D.m1644q(new InsetDrawable(this.f40623p, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.f40613D.m1644q(this.f40623p);
        }
        AmbientMode.AmbientController ambientController = this.f40613D;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        ((FloatingActionButton) ambientController.f1697a).f8150c.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = (FloatingActionButton) ambientController.f1697a;
        int i5 = floatingActionButton.f8148a;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    /* JADX INFO: renamed from: k */
    public final void m16412k(float f) {
        mkx mkxVar = this.f40620m;
        if (mkxVar != null) {
            mkxVar.m16578h(f);
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean mo16413l() {
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m16414m() {
        return afe.m462f(this.f40611B) && !this.f40611B.isInEditMode();
    }

    /* JADX INFO: renamed from: n */
    final boolean m16415n() {
        return !this.f40624q || this.f40611B.m4838b() >= this.f40628u;
    }
}
