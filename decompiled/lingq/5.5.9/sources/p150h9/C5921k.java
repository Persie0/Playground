package p150h9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2466p;
import com.google.android.exoplayer2.InterfaceC2532v;
import p174i9.InterfaceC6208b;
import p479xa.C10144m;

/* JADX INFO: renamed from: h9.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5921k implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35331a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f35332b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35333c;

    public /* synthetic */ C5921k(int i10, int i11, Object obj) {
        this.f35331a = i11;
        this.f35333c = obj;
        this.f35332b = i10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f35331a;
        int i11 = this.f35332b;
        Object obj2 = this.f35333c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC2532v.c) obj).mo7489I(i11, (C2466p) obj2);
                break;
            default:
                InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
                interfaceC6208b.getClass();
                interfaceC6208b.mo12789c((InterfaceC6208b.a) obj2, i11);
                break;
        }
    }
}
