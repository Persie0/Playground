package p000;

import android.app.KeyguardManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class iac extends KeyguardManager.KeyguardDismissCallback {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Runnable f30121a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nqf f30122b;

    public iac(Runnable runnable, nqf nqfVar) {
        this.f30121a = runnable;
        this.f30122b = nqfVar;
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissCancelled() {
        this.f30122b.mo14894e(false);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissError() {
        ((nbe) ((nbe) iad.f30123a.m17251b()).mo17276G((char) 4055)).mo17290o("Error dismissing keyguard");
        this.f30122b.mo14894e(false);
    }

    @Override // android.app.KeyguardManager.KeyguardDismissCallback
    public final void onDismissSucceeded() {
        this.f30121a.run();
        this.f30122b.mo14894e(true);
    }
}
