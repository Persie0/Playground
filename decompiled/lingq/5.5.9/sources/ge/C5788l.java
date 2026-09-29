package ge;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.datatransport.TransportRegistrar;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p174i9.InterfaceC6208b;
import p479xa.C10144m;

/* JADX INFO: renamed from: ge.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5788l implements InterfaceC5514f, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34989a;

    public /* synthetic */ C5788l(int i10) {
        this.f34989a = i10;
    }

    public /* synthetic */ C5788l(InterfaceC6208b.a aVar, int i10) {
        this.f34989a = i10;
    }

    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        switch (this.f34989a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ExecutorsRegistrar.f16189c.get();
            default:
                return TransportRegistrar.lambda$getComponents$0(c5528t);
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        switch (this.f34989a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).getClass();
                break;
            default:
                ((InterfaceC6208b) obj).getClass();
                break;
        }
    }
}
