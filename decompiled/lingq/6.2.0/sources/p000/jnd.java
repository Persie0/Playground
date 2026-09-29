package p000;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class jnd extends ind {

    /* JADX INFO: renamed from: d */
    public static final mmd f45890d = new mmd(3);

    /* JADX INFO: renamed from: e */
    public static final C3490qa f45891e = new C3490qa(9);

    /* JADX INFO: renamed from: c */
    public final AtomicInteger f45892c = new AtomicInteger();

    /* JADX INFO: renamed from: b */
    public static ind m14565b(vmd vmdVar, cnd cndVar) {
        Integer num = (Integer) vmdVar.mo360j(umd.f64094c);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        jnd jndVar = (jnd) f45890d.m19759h(cndVar, vmdVar);
        int iNextInt = ((Random) f45891e.get()).nextInt(num.intValue());
        AtomicInteger atomicInteger = jndVar.f45892c;
        return (iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) > 0 ? jndVar : ind.f44335a;
    }

    @Override // p000.ind
    /* JADX INFO: renamed from: a */
    public final void mo11963a() {
        this.f45892c.decrementAndGet();
    }
}
