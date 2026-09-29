package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6235y implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36216b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f36217c;

    public /* synthetic */ C6235y(int i10, InterfaceC6208b.a aVar, boolean z10) {
        this.f36215a = i10;
        this.f36216b = aVar;
        this.f36217c = z10;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        int i10 = this.f36215a;
        boolean z10 = this.f36217c;
        InterfaceC6208b.a aVar = this.f36216b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).mo12772G(aVar, z10);
                break;
            default:
                InterfaceC6208b interfaceC6208b = (InterfaceC6208b) obj;
                interfaceC6208b.getClass();
                interfaceC6208b.mo12775J(aVar, z10);
                break;
        }
    }
}
