package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes2.dex */
public final class kd3 extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f47060a;

    /* JADX INFO: renamed from: b */
    public final View f47061b;

    /* JADX INFO: renamed from: c */
    public boolean f47062c;

    /* JADX INFO: renamed from: d */
    public boolean f47063d;

    /* JADX INFO: renamed from: e */
    public boolean f47064e;

    public kd3(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f47064e = true;
        this.f47060a = viewGroup;
        this.f47061b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f47064e = true;
        if (this.f47062c) {
            return !this.f47063d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f47062c = true;
            sx6.m21765a(this.f47060a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f47062c;
        ViewGroup viewGroup = this.f47060a;
        if (z || !this.f47064e) {
            viewGroup.endViewTransition(this.f47061b);
            this.f47063d = true;
        } else {
            this.f47064e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f47064e = true;
        if (this.f47062c) {
            return !this.f47063d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f47062c = true;
            sx6.m21765a(this.f47060a, this);
        }
        return true;
    }
}
