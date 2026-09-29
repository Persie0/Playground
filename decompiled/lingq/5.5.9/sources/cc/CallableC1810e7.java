package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.internal.measurement.C2591a8;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzq;
import java.util.concurrent.Callable;
import p176ib.C6272i;
import p290o6.C7968m;

/* JADX INFO: renamed from: cc.e7 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1810e7 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9785a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9787c;

    public /* synthetic */ CallableC1810e7(C1834h4 c1834h4, String str) {
        this.f9786b = c1834h4;
        this.f9787c = str;
    }

    public CallableC1810e7(C1846i7 c1846i7, zzq zzqVar) {
        this.f9787c = c1846i7;
        this.f9786b = zzqVar;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i10 = this.f9785a;
        Object obj = this.f9786b;
        Object obj2 = this.f9787c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C1846i7 c1846i7 = (C1846i7) obj2;
                zzq zzqVar = (zzq) obj;
                String str = zzqVar.f14638a;
                C6272i.m12915i(str);
                C1811f c1811fM5641K = c1846i7.m5641K(str);
                zzah zzahVar = zzah.ANALYTICS_STORAGE;
                if (c1811fM5641K.m5597f(zzahVar) && C1811f.m5593b(zzqVar.f14633Q).m5597f(zzahVar)) {
                    return c1846i7.m5639I(zzqVar).m5538F();
                }
                c1846i7.mo5517e().f9938I.m5623a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                return new C2591a8(new C7968m((C1834h4) obj, (String) obj2));
        }
    }
}
