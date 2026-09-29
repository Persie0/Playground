package ga;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.source.InterfaceC2493j;

/* JADX INFO: renamed from: ga.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5728k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2493j.a f34763b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2493j f34764c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5725h f34765d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5726i f34766e;

    public /* synthetic */ RunnableC5728k(InterfaceC2493j.a aVar, InterfaceC2493j interfaceC2493j, C5725h c5725h, C5726i c5726i, int i10) {
        this.f34762a = i10;
        this.f34763b = aVar;
        this.f34764c = interfaceC2493j;
        this.f34765d = c5725h;
        this.f34766e = c5726i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f34762a;
        C5726i c5726i = this.f34766e;
        C5725h c5725h = this.f34765d;
        InterfaceC2493j interfaceC2493j = this.f34764c;
        InterfaceC2493j.a aVar = this.f34763b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                interfaceC2493j.mo7237G(aVar.f13289a, aVar.f13290b, c5725h, c5726i);
                break;
            default:
                interfaceC2493j.mo7243x(aVar.f13289a, aVar.f13290b, c5725h, c5726i);
                break;
        }
    }
}
