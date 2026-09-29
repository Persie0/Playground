package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: cc.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1951u4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10234a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zzq f10235b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC1987y4 f10236c;

    public /* synthetic */ RunnableC1951u4(BinderC1987y4 binderC1987y4, zzq zzqVar, int i10) {
        this.f10234a = i10;
        this.f10236c = binderC1987y4;
        this.f10235b = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f10234a;
        zzq zzqVar = this.f10235b;
        BinderC1987y4 binderC1987y4 = this.f10236c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                binderC1987y4.f10411a.m5647a();
                binderC1987y4.f10411a.m5657p(zzqVar);
                break;
            default:
                binderC1987y4.f10411a.m5647a();
                binderC1987y4.f10411a.m5654m(zzqVar);
                break;
        }
    }
}
