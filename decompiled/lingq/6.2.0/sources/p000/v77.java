package p000;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class v77 extends AbstractC3669v1 implements g14, Collection, tg4 {

    /* JADX INFO: renamed from: d */
    public static final v77 f64977d;

    /* JADX INFO: renamed from: a */
    public final Object f64978a;

    /* JADX INFO: renamed from: b */
    public final Object f64979b;

    /* JADX INFO: renamed from: c */
    public final m77 f64980c;

    static {
        iy5 iy5Var = iy5.f44769e;
        f64977d = new v77(iy5Var, iy5Var, m77.f50732c);
    }

    public v77(Object obj, Object obj2, m77 m77Var) {
        this.f64978a = obj;
        this.f64979b = obj2;
        this.f64980c = m77Var;
    }

    @Override // p000.AbstractC3778y, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f64980c.containsKey(obj);
    }

    @Override // p000.AbstractC3778y
    /* JADX INFO: renamed from: d */
    public final int mo3718d() {
        return this.f64980c.f50734b;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new al3(this.f64978a, this.f64980c);
    }
}
