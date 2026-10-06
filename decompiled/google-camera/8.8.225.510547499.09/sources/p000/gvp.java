package p000;

import android.app.KeyguardManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class gvp extends KeyguardManager.KeyguardDismissCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ KeyguardManager.KeyguardDismissCallback f26506a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ gvr f26507b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f26508c;

    public gvp(gvr gvrVar, int i, KeyguardManager.KeyguardDismissCallback keyguardDismissCallback) {
        this.f26507b = gvrVar;
        this.f26508c = i;
        this.f26506a = keyguardDismissCallback;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        gvn gvnVar = this.f26507b.f26515d;
        if (gvnVar != null) {
            gvnVar.mo7785z();
        }
        ((eoq) this.f26507b.f26513b.get()).m7600g(this.f26508c);
        this.f26506a.onDismissCancelled();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        gvn gvnVar = this.f26507b.f26515d;
        if (gvnVar != null) {
            gvnVar.mo7785z();
        }
        ((eoq) this.f26507b.f26513b.get()).m7600g(this.f26508c);
        this.f26506a.onDismissError();
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        ((eoq) this.f26507b.f26513b.get()).m7600g(this.f26508c);
        this.f26506a.onDismissSucceeded();
    }
}
