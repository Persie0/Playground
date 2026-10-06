package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iky extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Consumer f31416a;

    public iky(Consumer consumer) {
        this.f31416a = consumer;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f31416a.accept(animator);
    }
}
