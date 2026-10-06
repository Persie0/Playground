package p000;

import java.util.Queue;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bvk {

    /* JADX INFO: renamed from: a */
    private static final Queue f4535a = cbi.m3386g(0);

    /* JADX INFO: renamed from: b */
    private int f4536b;

    /* JADX INFO: renamed from: c */
    private int f4537c;

    /* JADX INFO: renamed from: d */
    private Object f4538d;

    private bvk() {
    }

    /* JADX INFO: renamed from: b */
    public static bvk m3096b(Object obj) {
        bvk bvkVar;
        Queue queue = f4535a;
        synchronized (queue) {
            bvkVar = (bvk) queue.poll();
        }
        if (bvkVar == null) {
            bvkVar = new bvk();
        }
        bvkVar.f4538d = obj;
        bvkVar.f4537c = 0;
        bvkVar.f4536b = 0;
        return bvkVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m3097a() {
        Queue queue = f4535a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bvk) {
            bvk bvkVar = (bvk) obj;
            int i = bvkVar.f4537c;
            int i2 = bvkVar.f4536b;
            if (this.f4538d.equals(bvkVar.f4538d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4538d.hashCode();
    }
}
