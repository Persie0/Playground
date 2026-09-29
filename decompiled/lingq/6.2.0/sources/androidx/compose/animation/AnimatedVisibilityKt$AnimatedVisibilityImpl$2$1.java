package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1 f1398b = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        EnterExitState enterExitState = (EnterExitState) obj2;
        return Boolean.valueOf(((EnterExitState) obj) == enterExitState && enterExitState == EnterExitState.PostExit);
    }
}
