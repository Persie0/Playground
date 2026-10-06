package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class guk {

    /* JADX INFO: renamed from: b */
    public boolean f26434b;

    /* JADX INFO: renamed from: a */
    public boolean f26433a = false;

    /* JADX INFO: renamed from: c */
    public int f26435c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d */
    public float f26436d = Float.MIN_VALUE;

    /* JADX INFO: renamed from: e */
    public long f26437e = 0;

    /* JADX INFO: renamed from: f */
    public float f26438f = Float.MIN_VALUE;

    /* JADX INFO: renamed from: g */
    public long f26439g = 0;

    /* JADX INFO: renamed from: h */
    public final ConcurrentLinkedQueue f26440h = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: a */
    public final void m9776a(guj gujVar) {
        this.f26440h.add(gujVar);
    }

    /* JADX INFO: renamed from: b */
    public final void m9777b(guj gujVar) {
        this.f26440h.remove(gujVar);
    }

    /* JADX INFO: renamed from: c */
    public final void m9778c(boolean z) {
        this.f26433a = z;
        Iterator it = this.f26440h.iterator();
        while (it.hasNext()) {
            ((guj) it.next()).mo3462b(z);
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m9779d() {
        return System.currentTimeMillis() <= this.f26437e + 5000;
    }
}
