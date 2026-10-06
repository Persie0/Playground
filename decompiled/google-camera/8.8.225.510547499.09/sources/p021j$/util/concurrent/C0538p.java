package p021j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.p */
/* JADX INFO: loaded from: classes3.dex */
class C0538p {

    /* JADX INFO: renamed from: a */
    C0533k[] f33219a;

    /* JADX INFO: renamed from: b */
    C0533k f33220b = null;

    /* JADX INFO: renamed from: c */
    C0537o f33221c;

    /* JADX INFO: renamed from: d */
    C0537o f33222d;

    /* JADX INFO: renamed from: e */
    int f33223e;

    /* JADX INFO: renamed from: f */
    int f33224f;

    /* JADX INFO: renamed from: g */
    int f33225g;

    /* JADX INFO: renamed from: h */
    final int f33226h;

    C0538p(C0533k[] c0533kArr, int i, int i2, int i3) {
        this.f33219a = c0533kArr;
        this.f33226h = i;
        this.f33223e = i2;
        this.f33224f = i2;
        this.f33225g = i3;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c A[LOOP:1: B:34:0x005f->B:38:0x006c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x005f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0082 A[EDGE_INSN: B:70:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0082 A[EDGE_INSN: B:71:0x0082->B:39:0x0082 BREAK  A[LOOP:1: B:34:0x005f->B:38:0x006c], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    final C0533k m12566a() {
        C0533k[] c0533kArr;
        int length;
        int i;
        C0537o c0537o;
        int i2;
        int i3;
        int i4;
        int i5;
        C0533k c0533k = this.f33220b;
        if (c0533k != null) {
            c0533k = c0533k.f33214d;
        }
        while (c0533k == null) {
            if (this.f33224f >= this.f33225g || (c0533kArr = this.f33219a) == null || (length = c0533kArr.length) <= (i = this.f33223e) || i < 0) {
                this.f33220b = null;
                return null;
            }
            C0533k c0533kM12547l = ConcurrentHashMap.m12547l(c0533kArr, i);
            if (c0533kM12547l == null || c0533kM12547l.f33211a >= 0) {
                c0533k = c0533kM12547l;
                if (this.f33221c != null) {
                    while (true) {
                        c0537o = this.f33221c;
                        if (c0537o != null) {
                            break;
                        }
                        int i6 = this.f33223e;
                        i3 = c0537o.f33215a;
                        i4 = i6 + i3;
                        this.f33223e = i4;
                        if (i4 >= length) {
                            break;
                        }
                        this.f33223e = c0537o.f33216b;
                        this.f33219a = c0537o.f33217c;
                        c0537o.f33217c = null;
                        C0537o c0537o2 = c0537o.f33218d;
                        c0537o.f33218d = this.f33222d;
                        this.f33221c = c0537o2;
                        this.f33222d = c0537o;
                        length = i3;
                    }
                    if (c0537o == null) {
                        i2 = this.f33223e + this.f33226h;
                        this.f33223e = i2;
                        if (i2 >= length) {
                            int i7 = this.f33224f + 1;
                            this.f33224f = i7;
                            this.f33223e = i7;
                        }
                    }
                } else {
                    i5 = i + this.f33226h;
                    this.f33223e = i5;
                    if (i5 >= length) {
                        int i8 = this.f33224f + 1;
                        this.f33224f = i8;
                        this.f33223e = i8;
                    }
                }
            } else if (c0533kM12547l instanceof C0529g) {
                this.f33219a = ((C0529g) c0533kM12547l).f33204e;
                C0537o c0537o3 = this.f33222d;
                if (c0537o3 != null) {
                    this.f33222d = c0537o3.f33218d;
                } else {
                    c0537o3 = new C0537o();
                }
                c0537o3.f33217c = c0533kArr;
                c0537o3.f33215a = length;
                c0537o3.f33216b = i;
                c0537o3.f33218d = this.f33221c;
                this.f33221c = c0537o3;
                c0533k = null;
            } else {
                c0533k = c0533kM12547l instanceof C0539q ? ((C0539q) c0533kM12547l).f33230f : null;
                if (this.f33221c != null) {
                    while (true) {
                        c0537o = this.f33221c;
                        if (c0537o != null) {
                            break;
                            break;
                        }
                        int i9 = this.f33223e;
                        i3 = c0537o.f33215a;
                        i4 = i9 + i3;
                        this.f33223e = i4;
                        if (i4 >= length) {
                            break;
                            break;
                        }
                        this.f33223e = c0537o.f33216b;
                        this.f33219a = c0537o.f33217c;
                        c0537o.f33217c = null;
                        C0537o c0537o4 = c0537o.f33218d;
                        c0537o.f33218d = this.f33222d;
                        this.f33221c = c0537o4;
                        this.f33222d = c0537o;
                        length = i3;
                    }
                    if (c0537o == null) {
                        i2 = this.f33223e + this.f33226h;
                        this.f33223e = i2;
                        if (i2 >= length) {
                            int i10 = this.f33224f + 1;
                            this.f33224f = i10;
                            this.f33223e = i10;
                        }
                    }
                } else {
                    i5 = i + this.f33226h;
                    this.f33223e = i5;
                    if (i5 >= length) {
                        int i11 = this.f33224f + 1;
                        this.f33224f = i11;
                        this.f33223e = i11;
                    }
                }
            }
        }
        this.f33220b = c0533k;
        return c0533k;
    }
}
