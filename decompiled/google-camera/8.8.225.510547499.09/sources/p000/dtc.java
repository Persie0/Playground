package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dtc {

    /* JADX INFO: renamed from: a */
    public static final nbh f12543a = nbh.m17259h("com/google/android/apps/camera/featurecentral/camera/FeatureCentralFrameConsumer");

    /* JADX INFO: renamed from: b */
    public final List f12544b;

    /* JADX INFO: renamed from: c */
    public final mrm f12545c;

    /* JADX INFO: renamed from: d */
    public final jvx f12546d;

    /* JADX INFO: renamed from: e */
    private final mrm f12547e;

    /* JADX INFO: renamed from: f */
    private final kth f12548f;

    public dtc(Executor executor, mrm mrmVar, mrm mrmVar2, Set set, kth kthVar, byte[] bArr) {
        this.f12546d = jzn.m13820h(executor);
        this.f12547e = mrmVar;
        this.f12545c = mrmVar2;
        List listM6755a = duh.m6755a(set);
        this.f12544b = listM6755a;
        listM6755a.addAll(set);
        this.f12548f = kthVar;
    }

    /* JADX INFO: renamed from: a */
    final synchronized void m6716a(kmd kmdVar, cem cemVar) {
        lku.m15613H(this.f12545c.mo16813g());
        lku.m15613H(this.f12547e.mo16813g());
        duh.m6757c("frame", this.f12544b);
        this.f12548f.f37160a = kmdVar;
        Iterator it = this.f12544b.iterator();
        while (it.hasNext()) {
            ((dug) it.next()).mo6720d(kmdVar, cemVar);
        }
        ((kfc) this.f12547e.mo16809c()).mo9411k(new dtb(this, 0));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m6717b() {
        Iterator it = this.f12544b.iterator();
        while (it.hasNext()) {
            ((dug) it.next()).mo6718a();
        }
    }
}
