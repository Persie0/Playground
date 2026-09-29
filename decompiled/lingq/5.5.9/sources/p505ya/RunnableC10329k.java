package p505ya;

import com.android.installreferrer.api.InstallReferrerClient;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ya.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10329k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52002a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC10331m.a f52003b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f52004c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f52005d;

    public /* synthetic */ RunnableC10329k(InterfaceC10331m.a aVar, int i10, long j10) {
        this.f52003b = aVar;
        this.f52004c = i10;
        this.f52005d = j10;
    }

    public /* synthetic */ RunnableC10329k(InterfaceC10331m.a aVar, long j10, int i10) {
        this.f52003b = aVar;
        this.f52005d = j10;
        this.f52004c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f52002a;
        long j10 = this.f52005d;
        int i11 = this.f52004c;
        InterfaceC10331m.a aVar = this.f52003b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                aVar.getClass();
                int i12 = C10134c0.f51354a;
                aVar.f52010b.mo7043b(i11, j10);
                break;
            default:
                aVar.getClass();
                int i13 = C10134c0.f51354a;
                aVar.f52010b.mo7046g(i11, j10);
                break;
        }
    }
}
