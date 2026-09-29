package p304ok;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.Iterator;
import pk.InterfaceC8403d;

/* JADX INFO: renamed from: ok.c */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8067c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43765a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8069e f43766b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f43767c;

    public /* synthetic */ RunnableC8067c(C8069e c8069e, float f3, int i10) {
        this.f43765a = i10;
        this.f43766b = c8069e;
        this.f43767c = f3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f43765a;
        float f3 = this.f43767c;
        C8069e c8069e = this.f43766b;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5207g.m11111f(c8069e, "this$0");
                C8069e.a aVar = c8069e.f43770a;
                Iterator<T> it = aVar.getListeners().iterator();
                while (it.hasNext()) {
                    ((InterfaceC8403d) it.next()).mo16423b(aVar.getInstance());
                }
                break;
            case 1:
                C5207g.m11111f(c8069e, "this$0");
                C8069e.a aVar2 = c8069e.f43770a;
                Iterator<T> it2 = aVar2.getListeners().iterator();
                while (it2.hasNext()) {
                    ((InterfaceC8403d) it2.next()).mo9988d(aVar2.getInstance(), f3);
                }
                break;
            default:
                C5207g.m11111f(c8069e, "this$0");
                C8069e.a aVar3 = c8069e.f43770a;
                Iterator<T> it3 = aVar3.getListeners().iterator();
                while (it3.hasNext()) {
                    ((InterfaceC8403d) it3.next()).mo9989e(aVar3.getInstance(), f3);
                }
                break;
        }
    }
}
