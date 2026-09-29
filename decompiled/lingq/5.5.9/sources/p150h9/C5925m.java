package p150h9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2532v;
import p479xa.C10144m;

/* JADX INFO: renamed from: h9.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5925m implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f35344b;

    public /* synthetic */ C5925m(int i10, boolean z10) {
        this.f35343a = i10;
        this.f35344b = z10;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f35343a;
        boolean z10 = this.f35344b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC2532v.c) obj).mo7492R(z10);
                break;
            default:
                ((InterfaceC2532v.c) obj).mo7503k(z10);
                break;
        }
    }
}
