package p150h9;

import android.util.Pair;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.exoplayer2.C2469s;
import com.google.android.exoplayer2.source.InterfaceC2492i;
import com.google.android.exoplayer2.source.InterfaceC2493j;
import ga.C5725h;
import ga.C5726i;

/* JADX INFO: renamed from: h9.f0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5912f0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35290a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5725h f35291b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C5726i f35292c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35293d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f35294e;

    public /* synthetic */ RunnableC5912f0(Object obj, Object obj2, C5725h c5725h, C5726i c5726i, int i10) {
        this.f35290a = i10;
        this.f35293d = obj;
        this.f35294e = obj2;
        this.f35291b = c5725h;
        this.f35292c = c5726i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f35290a;
        C5726i c5726i = this.f35292c;
        C5725h c5725h = this.f35291b;
        Object obj = this.f35294e;
        Object obj2 = this.f35293d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Pair pair = (Pair) obj;
                ((C2469s.a) obj2).f12999b.f12993h.mo7243x(((Integer) pair.first).intValue(), (InterfaceC2492i.b) pair.second, c5725h, c5726i);
                break;
            default:
                InterfaceC2493j.a aVar = (InterfaceC2493j.a) obj2;
                ((InterfaceC2493j) obj).mo7238N(aVar.f13289a, aVar.f13290b, c5725h, c5726i);
                break;
        }
    }
}
