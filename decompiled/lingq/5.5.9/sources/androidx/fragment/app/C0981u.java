package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import p471x2.ViewTreeObserverOnPreDrawListenerC10066u;

/* JADX INFO: renamed from: androidx.fragment.app.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0981u {

    /* JADX INFO: renamed from: androidx.fragment.app.u$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final Animation f6417a;

        /* JADX INFO: renamed from: b */
        public final Animator f6418b;

        public a(Animator animator) {
            this.f6417a = null;
            this.f6418b = animator;
        }

        public a(Animation animation) {
            this.f6417a = animation;
            this.f6418b = null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.u$b */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f6419a;

        /* JADX INFO: renamed from: b */
        public final View f6420b;

        /* JADX INFO: renamed from: c */
        public boolean f6421c;

        /* JADX INFO: renamed from: d */
        public boolean f6422d;

        /* JADX INFO: renamed from: e */
        public boolean f6423e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f6423e = true;
            this.f6419a = viewGroup;
            this.f6420b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation) {
            this.f6423e = true;
            if (this.f6421c) {
                return !this.f6422d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f6421c = true;
                ViewTreeObserverOnPreDrawListenerC10066u.m18905a(this.f6419a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public final boolean getTransformation(long j10, Transformation transformation, float f3) {
            this.f6423e = true;
            if (this.f6421c) {
                return !this.f6422d;
            }
            if (!super.getTransformation(j10, transformation, f3)) {
                this.f6421c = true;
                ViewTreeObserverOnPreDrawListenerC10066u.m18905a(this.f6419a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10 = this.f6421c;
            ViewGroup viewGroup = this.f6419a;
            if (z10 || !this.f6423e) {
                viewGroup.endViewTransition(this.f6420b);
                this.f6422d = true;
            } else {
                this.f6423e = false;
                viewGroup.post(this);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m3814a(int i10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }
}
