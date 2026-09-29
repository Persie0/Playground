package p152hb;

import android.os.Bundle;
import cc.BinderC1987y4;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.measurement.internal.zzaw;

/* JADX INFO: renamed from: hb.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC5960c2 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35431a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f35432b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35433c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f35434d;

    public /* synthetic */ RunnableC5960c2(Object obj, Object obj2, String str, int i10) {
        this.f35431a = i10;
        this.f35434d = obj;
        this.f35433c = obj2;
        this.f35432b = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i10 = this.f35431a;
        String str = this.f35432b;
        Object obj = this.f35433c;
        Object obj2 = this.f35434d;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5964d2 c5964d2 = (C5964d2) obj2;
                if (c5964d2.f35460w0 > 0) {
                    LifecycleCallback lifecycleCallback = (LifecycleCallback) obj;
                    Bundle bundle = c5964d2.f35461x0;
                    lifecycleCallback.mo7575e(bundle != null ? bundle.getBundle(str) : null);
                }
                if (c5964d2.f35460w0 >= 2) {
                    ((LifecycleCallback) obj).mo7578h();
                }
                if (c5964d2.f35460w0 >= 3) {
                    ((LifecycleCallback) obj).mo7576f();
                }
                if (c5964d2.f35460w0 >= 4) {
                    ((LifecycleCallback) obj).mo7579i();
                }
                if (c5964d2.f35460w0 >= 5) {
                    ((LifecycleCallback) obj).getClass();
                }
                break;
            default:
                BinderC1987y4 binderC1987y4 = (BinderC1987y4) obj2;
                binderC1987y4.f10411a.m5647a();
                binderC1987y4.f10411a.m5651j((zzaw) obj, str);
                break;
        }
    }
}
