package p046cb;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import gb.InterfaceC5740d;

/* JADX INFO: renamed from: cb.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1760b implements InterfaceC5740d {

    /* JADX INFO: renamed from: a */
    public final Status f9660a;

    /* JADX INFO: renamed from: b */
    public final GoogleSignInAccount f9661b;

    public C1760b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f9661b = googleSignInAccount;
        this.f9660a = status;
    }

    @Override // gb.InterfaceC5740d
    /* JADX INFO: renamed from: m */
    public final Status mo5489m() {
        return this.f9660a;
    }
}
