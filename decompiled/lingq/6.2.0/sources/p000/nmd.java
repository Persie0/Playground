package p000;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class nmd extends ind {

    /* JADX INFO: renamed from: d */
    public static final mmd f52977d = new mmd(0);

    /* JADX INFO: renamed from: c */
    public final AtomicLong f52978c = new AtomicLong(2147483647L);

    /* JADX INFO: renamed from: b */
    public static ind m17500b(vmd vmdVar, cnd cndVar) {
        Integer num = (Integer) vmdVar.mo360j(umd.f64093b);
        if (num == null) {
            return null;
        }
        nmd nmdVar = (nmd) f52977d.m19759h(cndVar, vmdVar);
        return nmdVar.f52978c.incrementAndGet() >= ((long) num.intValue()) ? nmdVar : ind.f44335a;
    }

    @Override // p000.ind
    /* JADX INFO: renamed from: a */
    public final void mo11963a() {
        this.f52978c.set(0L);
    }
}
