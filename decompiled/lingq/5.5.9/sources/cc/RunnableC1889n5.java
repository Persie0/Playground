package cc;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: cc.n5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1889n5 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10035a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f10036b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1934s5 f10037c;

    public /* synthetic */ RunnableC1889n5(C1934s5 c1934s5, AtomicReference atomicReference, int i10) {
        this.f10035a = i10;
        this.f10037c = c1934s5;
        this.f10036b = atomicReference;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.f10035a) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                synchronized (this.f10036b) {
                    try {
                        AtomicReference atomicReference = this.f10036b;
                        InterfaceC1781b5 interfaceC1781b5 = this.f10037c.f10430a;
                        atomicReference.set(Boolean.valueOf(((C1897o4) interfaceC1781b5).f10084g.m5582q(((C1897o4) interfaceC1781b5).m5785p().m5530m(), C1985y2.f10324L)));
                        this.f10036b.notify();
                    } catch (Throwable th2) {
                        this.f10036b.notify();
                        throw th2;
                    }
                }
                return;
            case 1:
                synchronized (this.f10036b) {
                    try {
                        AtomicReference atomicReference2 = this.f10036b;
                        InterfaceC1781b5 interfaceC1781b6 = this.f10037c.f10430a;
                        C1802e c1802e = ((C1897o4) interfaceC1781b6).f10084g;
                        String strM5530m = ((C1897o4) interfaceC1781b6).m5785p().m5530m();
                        C1976x2 c1976x2 = C1985y2.f10325M;
                        if (strM5530m == null) {
                            c1802e.getClass();
                            str = (String) c1976x2.m5912a(null);
                        } else {
                            str = (String) c1976x2.m5912a(c1802e.f9764c.mo5570i(strM5530m, c1976x2.f10291a));
                        }
                        atomicReference2.set(str);
                        this.f10036b.notify();
                    } catch (Throwable th3) {
                        this.f10036b.notify();
                        throw th3;
                    }
                }
                return;
            default:
                synchronized (this.f10036b) {
                    try {
                        AtomicReference atomicReference3 = this.f10036b;
                        InterfaceC1781b5 interfaceC1781b7 = this.f10037c.f10430a;
                        atomicReference3.set(Double.valueOf(((C1897o4) interfaceC1781b7).f10084g.m5575j(((C1897o4) interfaceC1781b7).m5785p().m5530m(), C1985y2.f10328P)));
                        this.f10036b.notify();
                    } catch (Throwable th4) {
                        this.f10036b.notify();
                        throw th4;
                    }
                }
                return;
        }
    }
}
