package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class pmd extends ind {

    /* JADX INFO: renamed from: c */
    public final AtomicLong f56486c = new AtomicLong(-1);

    static {
        new mmd(1);
    }

    /* JADX INFO: renamed from: b */
    public static void m19402b(vmd vmdVar) {
        if (vmdVar.mo360j(umd.f64095d) == null) {
            return;
        }
        ho2.m13383c();
    }

    @Override // p000.ind
    /* JADX INFO: renamed from: a */
    public final void mo11963a() {
        AtomicLong atomicLong = this.f56486c;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
