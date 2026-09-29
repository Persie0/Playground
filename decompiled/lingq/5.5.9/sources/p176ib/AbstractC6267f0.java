package p176ib;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: renamed from: ib.f0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6267f0 extends AbstractC6287p0 {

    /* JADX INFO: renamed from: d */
    public final int f36462d;

    /* JADX INFO: renamed from: e */
    public final Bundle f36463e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC6251a f36464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC6267f0(AbstractC6251a abstractC6251a, int i10, Bundle bundle) {
        super(abstractC6251a, Boolean.TRUE);
        this.f36464f = abstractC6251a;
        this.f36462d = i10;
        this.f36463e = bundle;
    }

    @Override // p176ib.AbstractC6287p0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo12901a() {
        AbstractC6251a abstractC6251a = this.f36464f;
        int i10 = this.f36462d;
        if (i10 != 0) {
            abstractC6251a.m12874I(1, null);
            Bundle bundle = this.f36463e;
            mo12903c(new ConnectionResult(i10, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null));
        } else {
            if (mo12904d()) {
                return;
            }
            abstractC6251a.m12874I(1, null);
            mo12903c(new ConnectionResult(8, null));
        }
    }

    @Override // p176ib.AbstractC6287p0
    /* JADX INFO: renamed from: b */
    public final void mo12902b() {
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo12903c(ConnectionResult connectionResult);

    /* JADX INFO: renamed from: d */
    public abstract boolean mo12904d();
}
