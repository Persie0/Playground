package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.activity.result.C0204c;
import com.linguist.R;
import dm.C5212l;
import gd.C5772k;
import java.util.ArrayList;
import java.util.Iterator;
import p117fd.InterfaceC5508b;
import p177ic.C6308a;
import p177ic.C6312e;
import p177ic.C6313f;
import p177ic.C6314g;
import p260m8.C7499b;
import p378s3.C8952a;
import p481xc.C10166a;
import p481xc.C10168c;
import p481xc.ViewTreeObserverOnPreDrawListenerC10167b;
import p507yc.C10340g;
import p531zc.C10477a;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d */
/* JADX INFO: loaded from: classes.dex */
public class C3035d {

    /* JADX INFO: renamed from: a */
    public C5772k f15269a;

    /* JADX INFO: renamed from: b */
    public boolean f15270b;

    /* JADX INFO: renamed from: d */
    public float f15272d;

    /* JADX INFO: renamed from: e */
    public float f15273e;

    /* JADX INFO: renamed from: f */
    public float f15274f;

    /* JADX INFO: renamed from: g */
    public Animator f15275g;

    /* JADX INFO: renamed from: h */
    public C6314g f15276h;

    /* JADX INFO: renamed from: i */
    public C6314g f15277i;

    /* JADX INFO: renamed from: j */
    public float f15278j;

    /* JADX INFO: renamed from: l */
    public int f15280l;

    /* JADX INFO: renamed from: n */
    public ArrayList<Animator.AnimatorListener> f15282n;

    /* JADX INFO: renamed from: o */
    public ArrayList<Animator.AnimatorListener> f15283o;

    /* JADX INFO: renamed from: p */
    public ArrayList<f> f15284p;

    /* JADX INFO: renamed from: q */
    public final FloatingActionButton f15285q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC5508b f15286r;

    /* JADX INFO: renamed from: w */
    public ViewTreeObserverOnPreDrawListenerC10167b f15291w;

    /* JADX INFO: renamed from: x */
    public static final C8952a f15266x = C6308a.f36525c;

    /* JADX INFO: renamed from: y */
    public static final int f15267y = R.attr.motionDurationLong2;

    /* JADX INFO: renamed from: z */
    public static final int f15268z = R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: A */
    public static final int f15258A = R.attr.motionDurationMedium1;

    /* JADX INFO: renamed from: B */
    public static final int f15259B = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* JADX INFO: renamed from: C */
    public static final int[] f15260C = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: D */
    public static final int[] f15261D = {android.R.attr.state_hovered, android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: E */
    public static final int[] f15262E = {android.R.attr.state_focused, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: F */
    public static final int[] f15263F = {android.R.attr.state_hovered, android.R.attr.state_enabled};

    /* JADX INFO: renamed from: G */
    public static final int[] f15264G = {android.R.attr.state_enabled};

    /* JADX INFO: renamed from: H */
    public static final int[] f15265H = new int[0];

    /* JADX INFO: renamed from: c */
    public boolean f15271c = true;

    /* JADX INFO: renamed from: k */
    public float f15279k = 1.0f;

    /* JADX INFO: renamed from: m */
    public int f15281m = 0;

    /* JADX INFO: renamed from: s */
    public final Rect f15287s = new Rect();

    /* JADX INFO: renamed from: t */
    public final RectF f15288t = new RectF();

    /* JADX INFO: renamed from: u */
    public final RectF f15289u = new RectF();

    /* JADX INFO: renamed from: v */
    public final Matrix f15290v = new Matrix();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$a */
    public class a extends C6313f {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f3, Matrix matrix, Matrix matrix2) {
            C3035d.this.f15279k = f3;
            float[] fArr = this.f36532a;
            matrix.getValues(fArr);
            float[] fArr2 = this.f36533b;
            matrix2.getValues(fArr2);
            for (int i10 = 0; i10 < 9; i10++) {
                float f10 = fArr2[i10];
                float f11 = fArr[i10];
                fArr2[i10] = C0204c.m845d(f10, f11, f3, f11);
            }
            Matrix matrix3 = this.f36534c;
            matrix3.setValues(fArr2);
            return matrix3;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$b */
    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f15293a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ float f15294b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ float f15295c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ float f15296d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ float f15297e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ float f15298f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ float f15299g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ Matrix f15300h;

        public b(float f3, float f10, float f11, float f12, float f13, float f14, float f15, Matrix matrix) {
            this.f15293a = f3;
            this.f15294b = f10;
            this.f15295c = f11;
            this.f15296d = f12;
            this.f15297e = f13;
            this.f15298f = f14;
            this.f15299g = f15;
            this.f15300h = matrix;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C3035d c3035d = C3035d.this;
            c3035d.f15285q.setAlpha(C6308a.m12936a(this.f15293a, this.f15294b, 0.0f, 0.2f, fFloatValue));
            FloatingActionButton floatingActionButton = c3035d.f15285q;
            float f3 = this.f15296d;
            float f10 = this.f15295c;
            floatingActionButton.setScaleX(((f3 - f10) * fFloatValue) + f10);
            FloatingActionButton floatingActionButton2 = c3035d.f15285q;
            float f11 = this.f15297e;
            floatingActionButton2.setScaleY(((f3 - f11) * fFloatValue) + f11);
            float f12 = this.f15299g;
            float f13 = this.f15298f;
            c3035d.f15279k = C0204c.m845d(f12, f13, fFloatValue, f13);
            float fM845d = C0204c.m845d(f12, f13, fFloatValue, f13);
            Matrix matrix = this.f15300h;
            c3035d.m8778a(fM845d, matrix);
            c3035d.f15285q.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$c */
    public class c extends i {
        public c(C10168c c10168c) {
            super(c10168c);
        }

        @Override // com.google.android.material.floatingactionbutton.C3035d.i
        /* JADX INFO: renamed from: a */
        public final float mo8791a() {
            return 0.0f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$d */
    public class d extends i {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3035d f15302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C10168c c10168c) {
            super(c10168c);
            this.f15302c = c10168c;
        }

        @Override // com.google.android.material.floatingactionbutton.C3035d.i
        /* JADX INFO: renamed from: a */
        public final float mo8791a() {
            C3035d c3035d = this.f15302c;
            return c3035d.f15272d + c3035d.f15273e;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$e */
    public class e extends i {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3035d f15303c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C10168c c10168c) {
            super(c10168c);
            this.f15303c = c10168c;
        }

        @Override // com.google.android.material.floatingactionbutton.C3035d.i
        /* JADX INFO: renamed from: a */
        public final float mo8791a() {
            C3035d c3035d = this.f15303c;
            return c3035d.f15272d + c3035d.f15274f;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$f */
    public interface f {
        /* JADX INFO: renamed from: a */
        void mo8775a();

        /* JADX INFO: renamed from: b */
        void mo8776b();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$g */
    public interface g {
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$h */
    public class h extends i {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C3035d f15304c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(C10168c c10168c) {
            super(c10168c);
            this.f15304c = c10168c;
        }

        @Override // com.google.android.material.floatingactionbutton.C3035d.i
        /* JADX INFO: renamed from: a */
        public final float mo8791a() {
            return this.f15304c.f15272d;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.d$i */
    public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public boolean f15305a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C3035d f15306b;

        public i(C10168c c10168c) {
            this.f15306b = c10168c;
        }

        /* JADX INFO: renamed from: a */
        public abstract float mo8791a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f15306b.getClass();
            this.f15305a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean z10 = this.f15305a;
            C3035d c3035d = this.f15306b;
            if (!z10) {
                c3035d.getClass();
                mo8791a();
                this.f15305a = true;
            }
            valueAnimator.getAnimatedFraction();
            c3035d.getClass();
        }
    }

    public C3035d(FloatingActionButton floatingActionButton, FloatingActionButton.C3030b c3030b) {
        this.f15285q = floatingActionButton;
        this.f15286r = c3030b;
        C10340g c10340g = new C10340g();
        C10168c c10168c = (C10168c) this;
        c10340g.m19351a(f15260C, m8777d(new e(c10168c)));
        c10340g.m19351a(f15261D, m8777d(new d(c10168c)));
        c10340g.m19351a(f15262E, m8777d(new d(c10168c)));
        c10340g.m19351a(f15263F, m8777d(new d(c10168c)));
        c10340g.m19351a(f15264G, m8777d(new h(c10168c)));
        c10340g.m19351a(f15265H, m8777d(new c(c10168c)));
        this.f15278j = floatingActionButton.getRotation();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static ValueAnimator m8777d(i iVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f15266x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(iVar);
        valueAnimator.addUpdateListener(iVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    /* JADX INFO: renamed from: a */
    public final void m8778a(float f3, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f15285q.getDrawable();
        if (drawable == null || this.f15280l == 0) {
            return;
        }
        RectF rectF = this.f15288t;
        RectF rectF2 = this.f15289u;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i10 = this.f15280l;
        rectF2.set(0.0f, 0.0f, i10, i10);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i11 = this.f15280l;
        matrix.postScale(f3, f3, i11 / 2.0f, i11 / 2.0f);
    }

    /* JADX INFO: renamed from: b */
    public final AnimatorSet m8779b(C6314g c6314g, float f3, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        Property property = View.ALPHA;
        float[] fArr = {f3};
        FloatingActionButton floatingActionButton = this.f15285q;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) property, fArr);
        c6314g.m12941c("opacity").m12942a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_X, f10);
        c6314g.m12941c("scale").m12942a(objectAnimatorOfFloat2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 26) {
            objectAnimatorOfFloat2.setEvaluator(new C10166a());
        }
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(floatingActionButton, (Property<FloatingActionButton, Float>) View.SCALE_Y, f10);
        c6314g.m12941c("scale").m12942a(objectAnimatorOfFloat3);
        if (i10 == 26) {
            objectAnimatorOfFloat3.setEvaluator(new C10166a());
        }
        arrayList.add(objectAnimatorOfFloat3);
        Matrix matrix = this.f15290v;
        m8778a(f11, matrix);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(floatingActionButton, new C6312e(), new a(), new Matrix(matrix));
        c6314g.m12941c("iconScale").m12942a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7499b.m14952m0(animatorSet, arrayList);
        return animatorSet;
    }

    /* JADX INFO: renamed from: c */
    public final AnimatorSet m8780c(float f3, float f10, float f11, int i10, int i11) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        FloatingActionButton floatingActionButton = this.f15285q;
        valueAnimatorOfFloat.addUpdateListener(new b(floatingActionButton.getAlpha(), f3, floatingActionButton.getScaleX(), f10, floatingActionButton.getScaleY(), this.f15279k, f11, new Matrix(this.f15290v)));
        arrayList.add(valueAnimatorOfFloat);
        C7499b.m14952m0(animatorSet, arrayList);
        animatorSet.setDuration(C10477a.m19428c(i10, floatingActionButton.getContext(), floatingActionButton.getContext().getResources().getInteger(R.integer.material_motion_duration_long_1)));
        animatorSet.setInterpolator(C10477a.m19429d(floatingActionButton.getContext(), i11, C6308a.f36524b));
        return animatorSet;
    }

    /* JADX INFO: renamed from: e */
    public float mo8781e() {
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public void mo8782f(Rect rect) {
        int sizeDimension = 0;
        if (this.f15270b) {
            sizeDimension = (0 - this.f15285q.getSizeDimension()) / 2;
        }
        float fMo8781e = this.f15271c ? mo8781e() + this.f15274f : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fMo8781e));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fMo8781e * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public void mo8783g() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public void mo8784h() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public void mo8785i(int[] iArr) {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public void mo8786j(float f3, float f10, float f11) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public final void m8787k() {
        ArrayList<f> arrayList = this.f15284p;
        if (arrayList != null) {
            Iterator<f> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo8775a();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void mo8788l() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: m */
    public void mo8789m() {
        throw null;
    }

    /* JADX INFO: renamed from: n */
    public final void m8790n() {
        mo8782f(this.f15287s);
        C5212l.m11132C(null, "Didn't initialize content background");
        throw null;
    }
}
