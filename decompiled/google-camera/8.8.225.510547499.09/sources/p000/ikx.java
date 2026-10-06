package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikx extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Consumer f31415a;

    public ikx(Consumer consumer) {
        this.f31415a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f31415a.accept(animator);
    }
}
