package p152hb;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AbstractC2544c;

/* JADX INFO: renamed from: hb.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C6000p1 implements AbstractC2544c.b {

    /* JADX INFO: renamed from: a */
    public final int f35571a;

    /* JADX INFO: renamed from: b */
    public final AbstractC2544c f35572b;

    /* JADX INFO: renamed from: c */
    public final AbstractC2544c.b f35573c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C6003q1 f35574d;

    public C6000p1(C6003q1 c6003q1, int i10, C5978i0 c5978i0, AbstractC2544c.b bVar) {
        this.f35574d = c6003q1;
        this.f35571a = i10;
        this.f35572b = c5978i0;
        this.f35573c = bVar;
    }

    @Override // p152hb.InterfaceC5980j
    /* JADX INFO: renamed from: j */
    public final void mo494j(ConnectionResult connectionResult) {
        Log.d("AutoManageHelper", "beginFailureResolution for ".concat(String.valueOf(connectionResult)));
        this.f35574d.m12470m(connectionResult, this.f35571a);
    }
}
