package jm;

/* JADX INFO: renamed from: jm.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C6526i extends C6524g implements InterfaceC6523f<Integer> {

    /* JADX INFO: renamed from: d */
    public static final C6526i f37170d = new C6526i(1, 0);

    public C6526i(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r6.f37164b == r7.f37164b) goto L12;
     */
    @Override // jm.C6524g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj instanceof C6526i) {
            if (!isEmpty() || !((C6526i) obj).isEmpty()) {
                C6526i c6526i = (C6526i) obj;
                if (this.f37163a == c6526i.f37163a) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // jm.C6524g
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f37163a * 31) + this.f37164b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m13106i(int i10) {
        return this.f37163a <= i10 && i10 <= this.f37164b;
    }

    @Override // jm.C6524g
    public final boolean isEmpty() {
        return this.f37163a > this.f37164b;
    }

    @Override // jm.C6524g
    public final String toString() {
        return this.f37163a + ".." + this.f37164b;
    }
}
