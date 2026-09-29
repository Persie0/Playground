package cc;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: renamed from: cc.k5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1862k5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f9954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f9955c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f9956d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f9957e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC1914q3 f9958f;

    public /* synthetic */ RunnableC1862k5(AbstractC1914q3 abstractC1914q3, Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f9953a = i10;
        this.f9958f = abstractC1914q3;
        this.f9955c = obj;
        this.f9956d = obj2;
        this.f9957e = obj3;
        this.f9954b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f9953a;
        Object obj = this.f9956d;
        Object obj2 = this.f9955c;
        AbstractC1914q3 abstractC1914q3 = this.f9958f;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                Object obj3 = this.f9957e;
                ((C1934s5) abstractC1914q3).m5880x(this.f9954b, obj3, (String) obj2, (String) obj);
                break;
            default:
                C1782b6 c1782b6 = (C1782b6) abstractC1914q3;
                Bundle bundle = (Bundle) obj2;
                C1988y5 c1988y5 = (C1988y5) this.f9957e;
                long j10 = this.f9954b;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C1900o7 c1900o7 = ((C1897o4) c1782b6.f10430a).f10089l;
                C1897o4.m5774i(c1900o7);
                c1782b6.m5520l((C1988y5) obj, c1988y5, j10, true, c1900o7.m5839o0("screen_view", bundle, null, false));
                break;
        }
    }
}
