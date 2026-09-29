package androidx.activity;

import android.window.OnBackInvokedCallback;
import cm.InterfaceC2041a;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;

/* JADX INFO: renamed from: androidx.activity.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0199r implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f503a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f504b;

    public /* synthetic */ C0199r(int i10, Object obj) {
        this.f503a = i10;
        this.f504b = obj;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.window.OnBackInvokedCallback
    public final void onBackInvoked() {
        switch (this.f503a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                InterfaceC2041a interfaceC2041a = (InterfaceC2041a) this.f504b;
                C5207g.m11111f(interfaceC2041a, "$onBackInvoked");
                interfaceC2041a.mo807E();
                break;
            default:
                ((Runnable) this.f504b).run();
                break;
        }
    }
}
