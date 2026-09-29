package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p218k9.C6635e;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6234x implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36213a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36214b;

    public /* synthetic */ C6234x(int i10, InterfaceC6208b.a aVar, C6635e c6635e) {
        this.f36213a = i10;
        this.f36214b = aVar;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f36213a;
        InterfaceC6208b.a aVar = this.f36214b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).mo12783R(aVar);
                break;
            default:
                ((InterfaceC6208b) obj).mo12785T(aVar);
                break;
        }
    }
}
