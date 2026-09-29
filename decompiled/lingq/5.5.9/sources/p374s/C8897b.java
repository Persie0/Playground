package p374s;

import androidx.compose.animation.core.AnimationEndReason;
import dm.C5207g;
import p374s.AbstractC8911i;

/* JADX INFO: renamed from: s.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8897b<T, V extends AbstractC8911i> {

    /* JADX INFO: renamed from: a */
    public final C8903e<T, V> f46783a;

    /* JADX INFO: renamed from: b */
    public final AnimationEndReason f46784b;

    public C8897b(C8903e<T, V> c8903e, AnimationEndReason animationEndReason) {
        C5207g.m11111f(c8903e, "endState");
        C5207g.m11111f(animationEndReason, "endReason");
        this.f46783a = c8903e;
        this.f46784b = animationEndReason;
    }

    public final String toString() {
        return "AnimationResult(endReason=" + this.f46784b + ", endState=" + this.f46783a + ')';
    }
}
