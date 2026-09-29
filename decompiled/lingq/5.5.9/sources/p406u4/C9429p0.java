package p406u4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.animation.BaseInterpolator;
import com.linguist.R;

/* JADX INFO: renamed from: u4.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9429p0 {

    /* JADX INFO: renamed from: u4.p0$a */
    public static class a extends AnimatorListenerAdapter implements AbstractC9409f0.e {

        /* JADX INFO: renamed from: a */
        public final View f48383a;

        /* JADX INFO: renamed from: b */
        public final View f48384b;

        /* JADX INFO: renamed from: c */
        public final int f48385c;

        /* JADX INFO: renamed from: d */
        public final int f48386d;

        /* JADX INFO: renamed from: e */
        public int[] f48387e;

        /* JADX INFO: renamed from: f */
        public float f48388f;

        /* JADX INFO: renamed from: g */
        public float f48389g;

        /* JADX INFO: renamed from: h */
        public final float f48390h;

        /* JADX INFO: renamed from: i */
        public final float f48391i;

        public a(View view, View view2, int i10, int i11, float f3, float f10) {
            this.f48384b = view;
            this.f48383a = view2;
            this.f48385c = i10 - Math.round(view.getTranslationX());
            this.f48386d = i11 - Math.round(view.getTranslationY());
            this.f48390h = f3;
            this.f48391i = f10;
            int[] iArr = (int[]) view2.getTag(R.id.transition_position);
            this.f48387e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transition_position, null);
            }
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: a */
        public final void mo17765a() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: b */
        public final void mo17810b(AbstractC9409f0 abstractC9409f0) {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: c */
        public final void mo17766c() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: d */
        public final void mo17767d() {
        }

        @Override // p406u4.AbstractC9409f0.e
        /* JADX INFO: renamed from: e */
        public final void mo17768e(AbstractC9409f0 abstractC9409f0) {
            View view = this.f48384b;
            view.setTranslationX(this.f48390h);
            view.setTranslationY(this.f48391i);
            abstractC9409f0.mo17779F(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            if (this.f48387e == null) {
                this.f48387e = new int[2];
            }
            int[] iArr = this.f48387e;
            float f3 = this.f48385c;
            View view = this.f48384b;
            iArr[0] = Math.round(view.getTranslationX() + f3);
            this.f48387e[1] = Math.round(view.getTranslationY() + this.f48386d);
            this.f48383a.setTag(R.id.transition_position, this.f48387e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationPause(Animator animator) {
            View view = this.f48384b;
            this.f48388f = view.getTranslationX();
            this.f48389g = view.getTranslationY();
            view.setTranslationX(this.f48390h);
            view.setTranslationY(this.f48391i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public final void onAnimationResume(Animator animator) {
            float f3 = this.f48388f;
            View view = this.f48384b;
            view.setTranslationX(f3);
            view.setTranslationY(this.f48389g);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ObjectAnimator m17828a(View view, C9425n0 c9425n0, int i10, int i11, float f3, float f10, float f11, float f12, BaseInterpolator baseInterpolator, AbstractC9409f0 abstractC9409f0) {
        float f13;
        float f14;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) c9425n0.f48373b.getTag(R.id.transition_position);
        if (iArr != null) {
            f13 = (iArr[0] - i10) + translationX;
            f14 = (iArr[1] - i11) + translationY;
        } else {
            f13 = f3;
            f14 = f10;
        }
        int iRound = Math.round(f13 - translationX) + i10;
        int iRound2 = Math.round(f14 - translationY) + i11;
        view.setTranslationX(f13);
        view.setTranslationY(f14);
        if (f13 == f11 && f14 == f12) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f13, f11), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f14, f12));
        a aVar = new a(view, c9425n0.f48373b, iRound, iRound2, translationX, translationY);
        abstractC9409f0.mo17791b(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.addPauseListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(baseInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
