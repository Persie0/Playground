package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6223m implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36186a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36187b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36188c;

    public /* synthetic */ C6223m(InterfaceC6208b.a aVar, int i10, int i11) {
        this.f36186a = i11;
        this.f36187b = aVar;
        this.f36188c = i10;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f36186a;
        int i11 = this.f36188c;
        InterfaceC6208b.a aVar = this.f36187b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).mo12767B(aVar, i11);
                break;
            default:
                ((InterfaceC6208b) obj).mo12804r(aVar, i11);
                break;
        }
    }
}
