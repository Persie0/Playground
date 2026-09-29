package p199jd;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* JADX INFO: renamed from: jd.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6462g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BaseTransientBottomBar f37032a;

    public C6462g(BaseTransientBottomBar baseTransientBottomBar) {
        this.f37032a = baseTransientBottomBar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f37032a.m8836d();
    }
}
