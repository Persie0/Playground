package p000;

import androidx.compose.animation.core.AnimationEndReason;

/* JADX INFO: renamed from: ym */
/* JADX INFO: loaded from: classes.dex */
public final class C3801ym {

    /* JADX INFO: renamed from: a */
    public final C0817bn f70047a;

    /* JADX INFO: renamed from: b */
    public final AnimationEndReason f70048b;

    public C3801ym(C0817bn c0817bn, AnimationEndReason animationEndReason) {
        this.f70047a = c0817bn;
        this.f70048b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f70048b + ", endState=" + this.f70047a + ')';
    }
}
