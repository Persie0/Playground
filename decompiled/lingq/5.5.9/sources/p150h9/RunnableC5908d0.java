package p150h9;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import ga.C5725h;
import ga.C5726i;

/* JADX INFO: renamed from: h9.d0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5908d0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2469s.a f35276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Pair f35277c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C5725h f35278d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C5726i f35279e;

    public /* synthetic */ RunnableC5908d0(C2469s.a aVar, Pair pair, C5725h c5725h, C5726i c5726i, int i10) {
        this.f35275a = i10;
        this.f35276b = aVar;
        this.f35277c = pair;
        this.f35278d = c5725h;
        this.f35279e = c5726i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35275a;
        C5726i c5726i = this.f35279e;
        C5725h c5725h = this.f35278d;
        Pair pair = this.f35277c;
        C2469s.a aVar = this.f35276b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                aVar.f12999b.f12993h.mo7237G(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, c5725h, c5726i);
                break;
            default:
                aVar.f12999b.f12993h.mo7238N(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, c5725h, c5726i);
                break;
        }
    }
}
