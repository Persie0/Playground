package p304ok;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Iterator;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: ok.d */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8068d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43768a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8069e f43769b;

    public /* synthetic */ RunnableC8068d(C8069e c8069e, int i10) {
        this.f43768a = i10;
        this.f43769b = c8069e;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43768a;
        C8069e c8069e = this.f43769b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(c8069e, "this$0");
                C8069e.a aVar = c8069e.f43770a;
                Iterator<T> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((InterfaceC8403d) it.next()).mo10114h(aVar.getInstance());
                }
                break;
            default:
                C5207g.m11111f(c8069e, "this$0");
                c8069e.f43770a.mo15936a();
                break;
        }
    }
}
