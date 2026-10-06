package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: renamed from: ca */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0082ca extends AnimationSet implements Runnable {

    /* JADX INFO: renamed from: a */
    private final ViewGroup f4876a;

    /* JADX INFO: renamed from: b */
    private final View f4877b;

    /* JADX INFO: renamed from: c */
    private boolean f4878c;

    /* JADX INFO: renamed from: d */
    private boolean f4879d;

    /* JADX INFO: renamed from: e */
    private boolean f4880e;

    public RunnableC0082ca(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f4880e = true;
        this.f4876a = viewGroup;
        this.f4877b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.f4880e = true;
        if (this.f4878c) {
            return !this.f4879d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.f4878c = true;
            aex.m403b(this.f4876a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4878c || !this.f4880e) {
            this.f4876a.endViewTransition(this.f4877b);
            this.f4879d = true;
        } else {
            this.f4880e = false;
            this.f4876a.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.f4880e = true;
        if (this.f4878c) {
            return !this.f4879d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.f4878c = true;
            aex.m403b(this.f4876a, this);
        }
        return true;
    }
}
