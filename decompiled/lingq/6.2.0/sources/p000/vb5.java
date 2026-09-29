package p000;

import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle$State;

/* JADX INFO: loaded from: classes.dex */
public final class vb5 {

    /* JADX INFO: renamed from: a */
    public Lifecycle$State f65165a;

    /* JADX INFO: renamed from: b */
    public rb5 f65166b;

    /* JADX INFO: renamed from: a */
    public final void m23216a(ub5 ub5Var, Lifecycle$Event lifecycle$Event) {
        Lifecycle$State targetState = lifecycle$Event.getTargetState();
        Lifecycle$State lifecycle$State = this.f65165a;
        lifecycle$State.getClass();
        if (targetState != null && targetState.compareTo(lifecycle$State) < 0) {
            lifecycle$State = targetState;
        }
        this.f65165a = lifecycle$State;
        this.f65166b.mo399c(ub5Var, lifecycle$Event);
        this.f65165a = targetState;
    }
}
