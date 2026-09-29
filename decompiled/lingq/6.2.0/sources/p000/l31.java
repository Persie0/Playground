package p000;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.R$attr;
import com.google.android.material.R$drawable;
import com.google.android.material.R$string;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes2.dex */
public final class l31 extends js2 {

    /* JADX INFO: renamed from: e */
    public final int f48959e;

    /* JADX INFO: renamed from: f */
    public final int f48960f;

    /* JADX INFO: renamed from: g */
    public final TimeInterpolator f48961g;

    /* JADX INFO: renamed from: h */
    public final TimeInterpolator f48962h;

    /* JADX INFO: renamed from: i */
    public EditText f48963i;

    /* JADX INFO: renamed from: j */
    public final h31 f48964j;

    /* JADX INFO: renamed from: k */
    public final i31 f48965k;

    /* JADX INFO: renamed from: l */
    public AnimatorSet f48966l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f48967m;

    public l31(is2 is2Var) {
        super(is2Var);
        this.f48964j = new h31(this, 0);
        this.f48965k = new i31(this, 0);
        this.f48959e = r46.m20364G(is2Var.getContext(), R$attr.motionDurationShort3, 100);
        this.f48960f = r46.m20364G(is2Var.getContext(), R$attr.motionDurationShort3, 150);
        this.f48961g = r46.m20365H(is2Var.getContext(), R$attr.motionEasingLinearInterpolator, AbstractC0853cn.f10296a);
        this.f48962h = r46.m20365H(is2Var.getContext(), R$attr.motionEasingEmphasizedInterpolator, AbstractC0853cn.f10299d);
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: a */
    public final void mo14630a() {
        if (this.f46062b.f44485K != null) {
            return;
        }
        m15769s(m15770t());
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: c */
    public final int mo3302c() {
        return R$string.clear_text_end_icon_content_description;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: d */
    public final int mo3303d() {
        return R$drawable.mtrl_ic_cancel;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: e */
    public final View.OnFocusChangeListener mo14631e() {
        return this.f48965k;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: f */
    public final View.OnClickListener mo3304f() {
        return this.f48964j;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: g */
    public final View.OnFocusChangeListener mo14632g() {
        return this.f48965k;
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: l */
    public final void mo3307l(EditText editText) {
        this.f48963i = editText;
        this.f46061a.setEndIconVisible(m15770t());
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: o */
    public final void mo14637o(boolean z) {
        if (this.f46062b.f44485K == null) {
            return;
        }
        m15769s(z);
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: q */
    public final void mo3308q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f48962h);
        valueAnimatorOfFloat.setDuration(this.f48960f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j31

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l31 f45000b;

            {
                this.f45000b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i2 = i;
                l31 l31Var = this.f45000b;
                switch (i2) {
                    case 0:
                        l31Var.f46064d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = l31Var.f46064d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f48961g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i2 = this.f48959e;
        valueAnimatorOfFloat2.setDuration(i2);
        final int i3 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j31

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l31 f45000b;

            {
                this.f45000b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                l31 l31Var = this.f45000b;
                switch (i4) {
                    case 0:
                        l31Var.f46064d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = l31Var.f46064d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f48966l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f48966l.addListener(new k31(this, i3));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i2);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: j31

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ l31 f45000b;

            {
                this.f45000b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i4 = i3;
                l31 l31Var = this.f45000b;
                switch (i4) {
                    case 0:
                        l31Var.f46064d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = l31Var.f46064d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f48967m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new k31(this, i));
    }

    @Override // p000.js2
    /* JADX INFO: renamed from: r */
    public final void mo3309r() {
        EditText editText = this.f48963i;
        if (editText != null) {
            editText.post(new RunnableC3781y2(this, 10));
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m15769s(boolean z) {
        boolean z2 = this.f46062b.m14116d() == z;
        if (z && !this.f48966l.isRunning()) {
            this.f48967m.cancel();
            this.f48966l.start();
            if (z2) {
                this.f48966l.end();
                return;
            }
            return;
        }
        if (z) {
            return;
        }
        this.f48966l.cancel();
        this.f48967m.start();
        if (z2) {
            this.f48967m.end();
        }
    }

    /* JADX INFO: renamed from: t */
    public final boolean m15770t() {
        EditText editText = this.f48963i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f46064d.hasFocus()) && ((this.f48963i.getText().length() > 0) || (this.f46062b.f44485K != null));
    }
}
