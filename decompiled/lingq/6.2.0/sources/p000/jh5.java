package p000;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* JADX INFO: loaded from: classes2.dex */
public final class jh5 implements op6 {

    /* JADX INFO: renamed from: a */
    public final jh9 f45546a;

    /* JADX INFO: renamed from: b */
    public boolean f45547b = false;

    public jh5(leb lebVar, jh9 jh9Var) {
        this.f45546a = jh9Var;
    }

    @Override // p000.op6
    /* JADX INFO: renamed from: a */
    public final void mo14457a(Object obj) {
        this.f45547b = true;
        SignInHubActivity signInHubActivity = (SignInHubActivity) this.f45546a.f45552b;
        signInHubActivity.setResult(signInHubActivity.f11619Y, signInHubActivity.f11620Z);
        signInHubActivity.finish();
    }

    public final String toString() {
        return this.f45546a.toString();
    }
}
