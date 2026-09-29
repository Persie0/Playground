package p150h9;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.source.InterfaceC2492i;

/* JADX INFO: renamed from: h9.h0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5916h0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35303a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2469s.a f35304b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f35305c;

    public /* synthetic */ RunnableC5916h0(C2469s.a aVar, Pair pair, int i10) {
        this.f35303a = i10;
        this.f35304b = aVar;
        this.f35305c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35303a;
        Pair pair = this.f35305c;
        C2469s.a aVar = this.f35304b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                aVar.f12999b.f12993h.mo6964p0(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second);
                break;
            default:
                aVar.f12999b.f12993h.mo6962k0(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second);
                break;
        }
    }
}
