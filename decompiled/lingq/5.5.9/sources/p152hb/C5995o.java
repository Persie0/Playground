package p152hb;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2546a;
import com.google.android.gms.common.api.internal.BasePendingResult;
import gb.AbstractC5738b;

/* JADX INFO: renamed from: hb.o */
/* JADX INFO: loaded from: classes.dex */
public final class C5995o implements AbstractC5738b.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ BasePendingResult f35563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5998p f35564b;

    public C5995o(C5998p c5998p, AbstractC2546a abstractC2546a) {
        this.f35564b = c5998p;
        this.f35563a = abstractC2546a;
    }

    @Override // gb.AbstractC5738b.a
    /* JADX INFO: renamed from: a */
    public final void mo12094a(Status status) {
        this.f35564b.f35567a.remove(this.f35563a);
    }
}
