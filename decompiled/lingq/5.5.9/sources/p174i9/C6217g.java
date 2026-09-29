package p174i9;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10144m;

/* JADX INFO: renamed from: i9.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6217g implements C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36169a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC6208b.a f36170b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Exception f36171c;

    public /* synthetic */ C6217g(InterfaceC6208b.a aVar, Exception exc, int i10) {
        this.f36169a = i10;
        this.f36170b = aVar;
        this.f36171c = exc;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        switch (this.f36169a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                ((InterfaceC6208b) obj).getClass();
                break;
            default:
                ((InterfaceC6208b) obj).mo12787a(this.f36170b, this.f36171c);
                break;
        }
    }
}
