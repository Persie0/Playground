package p000;

import android.content.Intent;
import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class baf implements Runnable {

    /* JADX INFO: renamed from: a */
    private final bag f2855a;

    public baf(bag bagVar) {
        this.f2855a = bagVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[Catch: all -> 0x008c, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0032, B:9:0x0036, B:10:0x003e, B:11:0x003f, B:12:0x0047, B:16:0x0053, B:18:0x005b, B:19:0x0060, B:23:0x006e, B:25:0x0075, B:33:0x0087, B:29:0x007b, B:30:0x007c, B:32:0x0084, B:37:0x008b, B:20:0x0061, B:21:0x006b, B:13:0x0048, B:14:0x0050), top: B:45:0x000b, inners: #0, #1 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[Catch: all -> 0x008c, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x000f, B:8:0x0032, B:9:0x0036, B:10:0x003e, B:11:0x003f, B:12:0x0047, B:16:0x0053, B:18:0x005b, B:19:0x0060, B:23:0x006e, B:25:0x0075, B:33:0x0087, B:29:0x007b, B:30:0x007c, B:32:0x0084, B:37:0x008b, B:20:0x0061, B:21:0x006b, B:13:0x0048, B:14:0x0050), top: B:45:0x000b, inners: #0, #1 }] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        bag bagVar = this.f2855a;
        ayc.m2099a();
        bag.m2153e();
        synchronized (bagVar.f2862g) {
            if (bagVar.f2863h != null) {
                ayc.m2099a();
                StringBuilder sb = new StringBuilder();
                sb.append("Removing command ");
                sb.append(bagVar.f2863h);
                if (!((Intent) bagVar.f2862g.remove(0)).equals(bagVar.f2863h)) {
                    throw new IllegalStateException(qQLA.UXiYWt);
                }
                bagVar.f2863h = null;
            }
            Object obj = bagVar.f2865j.f47802a;
            azx azxVar = bagVar.f2861f;
            synchronized (azxVar.f2828d) {
                z = !azxVar.f2827c.isEmpty();
            }
            if (!z && bagVar.f2862g.isEmpty()) {
                synchronized (((beb) obj).f3021b) {
                    z2 = !((beb) obj).f3020a.isEmpty();
                }
                if (!z2) {
                    ayc.m2099a();
                    bae baeVar = bagVar.f2864i;
                    if (baeVar != null) {
                        baeVar.mo1712a();
                    }
                } else if (!bagVar.f2862g.isEmpty()) {
                    bagVar.m2155c();
                }
            } else if (!bagVar.f2862g.isEmpty()) {
                bagVar.m2155c();
            }
        }
    }
}
