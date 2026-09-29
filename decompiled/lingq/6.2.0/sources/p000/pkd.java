package p000;

import com.google.common.util.concurrent.AbstractC1118h;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pkd implements InterfaceC3053gw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f56390b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56391c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f56392d;

    public /* synthetic */ pkd(Object obj, Object obj2, Object obj3, int i) {
        this.f56389a = i;
        this.f56390b = obj;
        this.f56391c = obj2;
        this.f56392d = obj3;
    }

    @Override // p000.InterfaceC3053gw
    public final ListenableFuture apply(Object obj) {
        switch (this.f56389a) {
            case 0:
                rkd rkdVar = (rkd) this.f56390b;
                C3780y1 c3780y1 = (C3780y1) this.f56391c;
                C3780y1 c3780y2 = (C3780y1) this.f56392d;
                if (AbstractC1118h.m6398b(c3780y1).equals(AbstractC1118h.m6398b(c3780y2))) {
                    return AbstractC1118h.m6399c(obj);
                }
                ubd ubdVar = new ubd(2, rkdVar, c3780y2);
                int i = jmd.f45851a;
                C3780y1 c3780y1M6403g = AbstractC1118h.m6403g(c3780y2, new ubd(3, qld.m20020a(), ubdVar), rkdVar.f59455d);
                synchronized (rkdVar.f59459h) {
                    break;
                }
                return c3780y1M6403g;
            case 1:
                ckd ckdVar = (ckd) this.f56390b;
                return ckdVar.f10202c.m20684a((ubd) this.f56391c, (Executor) this.f56392d);
            default:
                return ((xkd) this.f56390b).f68323a.f10202c.m20684a((ubd) this.f56391c, (Executor) this.f56392d);
        }
    }
}
