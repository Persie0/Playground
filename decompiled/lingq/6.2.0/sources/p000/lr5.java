package p000;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: loaded from: classes2.dex */
public final class lr5 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jr5 f50041a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mr5 f50042b;

    public lr5(mr5 mr5Var, jr5 jr5Var) {
        this.f50042b = mr5Var;
        this.f50041a = jr5Var;
    }

    public final void onBackCancelled() {
        if (this.f50042b.f48363a != null) {
            this.f50041a.mo6043d();
        }
    }

    public final void onBackInvoked() {
        this.f50041a.mo6040a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.f50042b.f48363a != null) {
            this.f50041a.mo6041b(new u60(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.f50042b.f48363a != null) {
            this.f50041a.mo6042c(new u60(backEvent));
        }
    }
}
