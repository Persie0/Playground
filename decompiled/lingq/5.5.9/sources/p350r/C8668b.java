package p350r;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import p338qd.C8573r0;
import p470x1.C10022j;

/* JADX INFO: renamed from: r.b */
/* JADX INFO: loaded from: classes.dex */
public final class C8668b implements AnimatedVisibilityScope {

    /* JADX INFO: renamed from: a */
    public final Transition<EnterExitState> f46249a;

    /* JADX INFO: renamed from: b */
    public final ParcelableSnapshotMutableState f46250b = C8573r0.m16684L0(new C10022j(0));

    public C8668b(Transition<EnterExitState> transition) {
        this.f46249a = transition;
    }

    @Override // androidx.compose.animation.AnimatedVisibilityScope
    /* JADX INFO: renamed from: c */
    public final Transition<EnterExitState> mo1342c() {
        return this.f46249a;
    }
}
