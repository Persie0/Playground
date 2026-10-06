package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.function.Supplier;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class goh implements kfb, kba {

    /* JADX INFO: renamed from: a */
    public static final nbh f25861a = nbh.m17259h("com/google/android/apps/camera/pixelcamerakit/temporalbinning/PckTemporalBinningShunt");

    /* JADX INFO: renamed from: b */
    public final ecq f25862b;

    /* JADX INFO: renamed from: c */
    public final kfc f25863c;

    /* JADX INFO: renamed from: d */
    public final HashSet f25864d = new HashSet();

    /* JADX INFO: renamed from: e */
    public final jvx f25865e;

    /* JADX INFO: renamed from: f */
    public final gva f25866f;

    /* JADX INFO: renamed from: g */
    private final Supplier f25867g;

    public goh(ecq ecqVar, gva gvaVar, jvx jvxVar, Supplier supplier, kfc kfcVar, byte[] bArr) {
        this.f25862b = ecqVar;
        this.f25866f = gvaVar;
        this.f25863c = kfcVar;
        this.f25865e = jvxVar;
        this.f25867g = supplier;
    }

    @Override // p000.kfb
    /* JADX INFO: renamed from: c */
    public final void mo3625c(kiq kiqVar) {
        if (((Boolean) this.f25867g.get()).booleanValue()) {
            kfv.m14174w(kiqVar, new clf(this, 3));
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f25864d.iterator();
        while (it.hasNext()) {
            this.f25862b.mo7154u((kmg) it.next());
        }
        this.f25864d.clear();
    }
}
