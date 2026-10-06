package p000;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jbu implements amc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ SignInHubActivity f33675a;

    public jbu(SignInHubActivity signInHubActivity) {
        this.f33675a = signInHubActivity;
    }

    @Override // p000.amc
    /* JADX INFO: renamed from: a */
    public final amk mo933a() {
        return new jbf(this.f33675a, jec.m12966a());
    }

    @Override // p000.amc
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo934b(Object obj) {
        SignInHubActivity signInHubActivity = this.f33675a;
        signInHubActivity.setResult(signInHubActivity.f7593q, signInHubActivity.f7594r);
        this.f33675a.finish();
    }

    @Override // p000.amc
    /* JADX INFO: renamed from: c */
    public final void mo935c() {
    }
}
