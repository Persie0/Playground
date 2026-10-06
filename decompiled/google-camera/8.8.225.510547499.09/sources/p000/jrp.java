package p000;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrp implements jel {

    /* JADX INFO: renamed from: a */
    public final Object f34675a;

    /* JADX INFO: renamed from: b */
    public final jij f34676b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f34677c;

    public jrp(GoogleSignInAccount googleSignInAccount, Status status, int i) {
        this.f34677c = i;
        this.f34676b = googleSignInAccount;
        this.f34675a = status;
    }

    public jrp(Status status, List list, int i) {
        this.f34677c = i;
        this.f34676b = status;
        this.f34675a = list;
    }

    public jrp(Status status, jqq jqqVar, int i) {
        this.f34677c = i;
        this.f34676b = status;
        this.f34675a = jqqVar;
    }

    @Override // p000.jel
    /* JADX INFO: renamed from: a */
    public final Status mo4644a() {
        Object obj;
        switch (this.f34677c) {
            case 0:
            default:
                obj = this.f34676b;
                break;
            case 1:
                obj = this.f34675a;
                break;
        }
        return (Status) obj;
    }
}
