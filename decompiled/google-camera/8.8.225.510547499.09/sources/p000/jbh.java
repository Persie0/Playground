package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class jbh extends jbr {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ jbi f33661a;

    public jbh(jbi jbiVar) {
        this.f33661a = jbiVar;
    }

    @Override // p000.jbr
    /* JADX INFO: renamed from: b */
    public final void mo12837b(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            jbq.m12843c(this.f33661a.f33662a).m12848e(this.f33661a.f33663b, googleSignInAccount);
        }
        this.f33661a.m4649i(new jrp(googleSignInAccount, status, 1));
    }
}
