package p021j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.r */
/* JADX INFO: loaded from: classes3.dex */
final class C0540r extends C0533k {

    /* JADX INFO: renamed from: e */
    C0540r f33232e;

    /* JADX INFO: renamed from: f */
    C0540r f33233f;

    /* JADX INFO: renamed from: g */
    C0540r f33234g;

    /* JADX INFO: renamed from: h */
    C0540r f33235h;

    /* JADX INFO: renamed from: i */
    boolean f33236i;

    C0540r(int i, Object obj, Object obj2, C0540r c0540r, C0540r c0540r2) {
        super(i, obj, obj2, c0540r);
        this.f33232e = c0540r2;
    }

    @Override // p021j$.util.concurrent.C0533k
    /* JADX INFO: renamed from: a */
    final C0533k mo12563a(int i, Object obj) {
        return m12575b(i, obj, null);
    }

    /* JADX INFO: renamed from: b */
    final C0540r m12575b(int i, Object obj, Class cls) {
        int iM12543d;
        if (obj == null) {
            return null;
        }
        C0540r c0540r = this;
        do {
            C0540r c0540r2 = c0540r.f33233f;
            C0540r c0540r3 = c0540r.f33234g;
            int i2 = c0540r.f33211a;
            if (i2 <= i) {
                if (i2 >= i) {
                    Object obj2 = c0540r.f33212b;
                    if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                        return c0540r;
                    }
                    if (c0540r2 != null) {
                        if (c0540r3 != null) {
                            if ((cls == null && (cls = ConcurrentHashMap.m12542c(obj)) == null) || (iM12543d = ConcurrentHashMap.m12543d(cls, obj, obj2)) == 0) {
                                C0540r c0540rM12575b = c0540r3.m12575b(i, obj, cls);
                                if (c0540rM12575b != null) {
                                    return c0540rM12575b;
                                }
                            } else if (iM12543d >= 0) {
                                c0540r2 = c0540r3;
                            }
                        }
                        c0540r = c0540r2;
                    }
                }
                c0540r = c0540r3;
            } else {
                c0540r = c0540r2;
            }
        } while (c0540r != null);
        return null;
    }
}
