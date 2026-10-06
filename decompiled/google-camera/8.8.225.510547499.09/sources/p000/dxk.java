package p000;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p021j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dxk implements dxi {

    /* JADX INFO: renamed from: a */
    private static final nbh f12831a = nbh.m17259h("com/google/android/apps/camera/framestore/AudioFrameStoreImpl");

    /* JADX INFO: renamed from: b */
    private final lek f12832b;

    /* JADX INFO: renamed from: c */
    private final Map f12833c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    private final int f12834d;

    /* JADX INFO: renamed from: e */
    private final AtomicBoolean f12835e;

    /* JADX INFO: renamed from: f */
    private final ktz f12836f;

    public dxk(lek lekVar, int i, AtomicBoolean atomicBoolean, ktz ktzVar, byte[] bArr, byte[] bArr2) {
        this.f12832b = lekVar;
        this.f12834d = i;
        this.f12835e = atomicBoolean;
        this.f12836f = ktzVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, myy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, naf] */
    @Override // p000.dxi
    /* JADX INFO: renamed from: a */
    public final void mo6843a(boolean z) {
        if (this.f12835e.getAndSet(z) == z || z) {
            return;
        }
        ktz ktzVar = this.f12836f;
        synchronized (ktzVar.f37199b) {
            ArrayList arrayList = new ArrayList(((mtm) ktzVar.f37201d).f41599b);
            Iterator itM16556u = mkv.m16556u(ktzVar.f37200c);
            long j = -1;
            while (itM16556u.hasNext()) {
                long jLongValue = ((Long) itM16556u.next()).longValue();
                if (j != jLongValue) {
                    arrayList.addAll(((mty) ktzVar.f37201d).mo16885b(Long.valueOf(jLongValue)));
                    j = jLongValue;
                }
            }
            ((mty) ktzVar.f37201d).mo16906j();
            ktzVar.f37200c.clear();
        }
    }

    @Override // p000.dxn
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object mo6845b() {
        kap kapVar = (kap) this.f12836f.m14859l();
        if (kapVar == null) {
            return null;
        }
        return kapVar.f35491a;
    }

    @Override // p000.dxn
    /* JADX INFO: renamed from: c */
    public final synchronized void mo6846c() {
        lej lejVarMo15250b = this.f12832b.mo15250b(ByteBuffer.allocate(this.f12834d), this.f12834d);
        if (lejVarMo15250b == null) {
            return;
        }
        lejVarMo15250b.f38032a.limit(lejVarMo15250b.f38033b).rewind();
        if (this.f12835e.get()) {
            this.f12836f.m14861n(lejVarMo15250b.f38034c, new kap(lejVarMo15250b, 0));
            for (Map.Entry entry : this.f12833c.entrySet()) {
                ((Executor) entry.getValue()).execute((Runnable) entry.getKey());
            }
        }
    }

    @Override // p000.dxn
    /* JADX INFO: renamed from: d */
    public final void mo6847d(Runnable runnable, Executor executor) {
        if (this.f12833c.containsKey(runnable)) {
            ((nbe) ((nbe) ((nbe) f12831a.m17252c()).mo17284i(ncb.MEDIUM)).mo17276G((char) 1168)).mo17290o("Attempting to register listener twice.");
        } else {
            this.f12833c.put(runnable, executor);
        }
    }
}
