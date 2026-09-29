package ge;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.InterfaceC2532v;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessagingRegistrar;
import p118fe.C5528t;
import p118fe.InterfaceC5514f;
import p479xa.C10144m;

/* JADX INFO: renamed from: ge.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5787k implements InterfaceC5514f, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34988a;

    public /* synthetic */ C5787k(int i10) {
        this.f34988a = i10;
    }

    @Override // p118fe.InterfaceC5514f
    /* JADX INFO: renamed from: k */
    public Object mo35k(C5528t c5528t) {
        switch (this.f34988a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return ExecutorsRegistrar.f16187a.get();
            default:
                return FirebaseMessagingRegistrar.lambda$getComponents$0(c5528t);
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public void mo780n(Object obj) {
        ((InterfaceC2532v.c) obj).mo7498c0(this.f34988a);
    }
}
