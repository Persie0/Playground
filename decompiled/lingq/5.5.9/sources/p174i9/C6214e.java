package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6214e implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36161a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36162b;

    public /* synthetic */ C6214e(InterfaceC6208b.a aVar, int i10) {
        this.f36161a = i10;
        this.f36162b = aVar;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f36161a;
        InterfaceC6208b.a aVar = this.f36162b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).mo12780O(aVar);
                break;
            default:
                ((InterfaceC6208b) obj).mo12769D(aVar);
                break;
        }
    }
}
