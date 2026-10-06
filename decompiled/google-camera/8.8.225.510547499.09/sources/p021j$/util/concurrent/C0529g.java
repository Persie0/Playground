package p021j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.g */
/* JADX INFO: loaded from: classes3.dex */
final class C0529g extends C0533k {

    /* JADX INFO: renamed from: e */
    final C0533k[] f33204e;

    C0529g(C0533k[] c0533kArr) {
        super(-1, null, null);
        this.f33204e = c0533kArr;
    }

    @Override // p021j$.util.concurrent.C0533k
    /* JADX INFO: renamed from: a */
    final C0533k mo12563a(int i, Object obj) {
        int length;
        C0533k c0533kM12547l;
        Object obj2;
        C0533k[] c0533kArr = this.f33204e;
        loop0: while (obj != null && c0533kArr != null && (length = c0533kArr.length) != 0 && (c0533kM12547l = ConcurrentHashMap.m12547l(c0533kArr, (length - 1) & i)) != null) {
            do {
                int i2 = c0533kM12547l.f33211a;
                if (i2 == i && ((obj2 = c0533kM12547l.f33212b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c0533kM12547l;
                }
                if (i2 >= 0) {
                    c0533kM12547l = c0533kM12547l.f33214d;
                } else {
                    if (!(c0533kM12547l instanceof C0529g)) {
                        return c0533kM12547l.mo12563a(i, obj);
                    }
                    c0533kArr = ((C0529g) c0533kM12547l).f33204e;
                }
            } while (c0533kM12547l != null);
        }
        return null;
    }
}
