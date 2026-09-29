package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6230t implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36207a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36208b;

    public /* synthetic */ C6230t(InterfaceC6208b.a aVar, int i10) {
        this.f36207a = i10;
        this.f36208b = aVar;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        switch (this.f36207a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).getClass();
                break;
            default:
                ((InterfaceC6208b) obj).mo12771F(this.f36208b);
                break;
        }
    }
}
