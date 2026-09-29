package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public final class qtb extends fdd {

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f58203b = AtomicReferenceFieldUpdater.newUpdater(ttb.class, Thread.class, "a");

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f58204c = AtomicReferenceFieldUpdater.newUpdater(ttb.class, ttb.class, "b");

    /* JADX INFO: renamed from: d */
    public static final AtomicReferenceFieldUpdater f58205d = AtomicReferenceFieldUpdater.newUpdater(ytb.class, ttb.class, "c");

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f58206e = AtomicReferenceFieldUpdater.newUpdater(ytb.class, mtb.class, "b");

    /* JADX INFO: renamed from: f */
    public static final AtomicReferenceFieldUpdater f58207f = AtomicReferenceFieldUpdater.newUpdater(ytb.class, Object.class, "a");

    @Override // p000.fdd
    /* JADX INFO: renamed from: a */
    public final mtb mo11788a(pxb pxbVar) {
        return (mtb) f58206e.getAndSet(pxbVar, mtb.f51835d);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: b */
    public final ttb mo11789b(pxb pxbVar) {
        return (ttb) f58205d.getAndSet(pxbVar, ttb.f62872c);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: c */
    public final void mo11790c(ttb ttbVar, ttb ttbVar2) {
        f58204c.lazySet(ttbVar, ttbVar2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: d */
    public final void mo11791d(ttb ttbVar, Thread thread) {
        f58203b.lazySet(ttbVar, thread);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: e */
    public final boolean mo11792e(pxb pxbVar, mtb mtbVar, mtb mtbVar2) {
        return gdd.m12506b(f58206e, pxbVar, mtbVar, mtbVar2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: f */
    public final boolean mo11793f(ytb ytbVar, Object obj, Object obj2) {
        return gdd.m12506b(f58207f, ytbVar, obj, obj2);
    }

    @Override // p000.fdd
    /* JADX INFO: renamed from: g */
    public final boolean mo11794g(ytb ytbVar, ttb ttbVar, ttb ttbVar2) {
        return gdd.m12506b(f58205d, ytbVar, ttbVar, ttbVar2);
    }
}
