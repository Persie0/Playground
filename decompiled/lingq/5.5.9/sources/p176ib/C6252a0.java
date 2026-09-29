package p176ib;

import ae.C0062b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import gb.AbstractC5738b;
import java.util.concurrent.TimeUnit;
import p136gc.C5752h;

/* JADX INFO: renamed from: ib.a0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6252a0 implements AbstractC5738b.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC5738b f36429a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C5752h f36430b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC6270h f36431c;

    public C6252a0(BasePendingResult basePendingResult, C5752h c5752h, C0062b c0062b) {
        this.f36429a = basePendingResult;
        this.f36430b = c5752h;
        this.f36431c = c0062b;
    }

    @Override // gb.AbstractC5738b.a
    /* JADX INFO: renamed from: a */
    public final void mo12094a(Status status) {
        if (!status.m7534q()) {
            this.f36430b.m12113a(C0062b.m316V0(status));
            return;
        }
        AbstractC5738b abstractC5738b = this.f36429a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        BasePendingResult basePendingResult = (BasePendingResult) abstractC5738b;
        C6272i.m12917k("Result has already been consumed.", !basePendingResult.f13909h);
        try {
            if (!basePendingResult.f13904c.await(0L, timeUnit)) {
                basePendingResult.m7565d(Status.f13876i);
            }
        } catch (InterruptedException unused) {
            basePendingResult.m7565d(Status.f13874g);
        }
        C6272i.m12917k("Result is not ready.", basePendingResult.m7566e());
        this.f36430b.m12114b(this.f36431c.mo424a(basePendingResult.m7568g()));
    }
}
