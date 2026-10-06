package p000;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ilt {

    /* JADX INFO: renamed from: a */
    public final View f31460a;

    /* JADX INFO: renamed from: c */
    public int f31462c = 3;

    /* JADX INFO: renamed from: b */
    public Animator f31461b = new AnimatorSet();

    public ilt(View view) {
        this.f31460a = view;
    }

    /* JADX INFO: renamed from: a */
    public final void m11447a() {
        this.f31461b.cancel();
        lku.m15659m(this.f31462c == 3, "State should be stable with no animation", new Object[0]);
    }

    /* JADX INFO: renamed from: b */
    public final void m11448b() {
        this.f31462c = 3;
    }
}
