package p199jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: jd.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6456a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f37026a;

    public C6456a(BaseTransientBottomBar baseTransientBottomBar, int i10) {
        this.f37026a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f37026a.m8835c();
    }
}
