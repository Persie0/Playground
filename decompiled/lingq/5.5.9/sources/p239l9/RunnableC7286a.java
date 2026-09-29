package p239l9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.drm.InterfaceC2398b;

/* JADX INFO: renamed from: l9.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC7286a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40802a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC2398b.a f40803b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2398b f40804c;

    public /* synthetic */ RunnableC7286a(InterfaceC2398b.a aVar, InterfaceC2398b interfaceC2398b, int i10) {
        this.f40802a = i10;
        this.f40803b = aVar;
        this.f40804c = interfaceC2398b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f40802a;
        InterfaceC2398b interfaceC2398b = this.f40804c;
        InterfaceC2398b.a aVar = this.f40803b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                interfaceC2398b.mo6964p0(aVar.f12200a, aVar.f12201b);
                break;
            default:
                interfaceC2398b.mo6962k0(aVar.f12200a, aVar.f12201b);
                break;
        }
    }
}
