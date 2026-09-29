package jm;

/* JADX INFO: renamed from: jm.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C6521d implements InterfaceC6522e<Float> {

    /* JADX INFO: renamed from: a */
    public final float f37161a = 0.0f;

    /* JADX INFO: renamed from: b */
    public final float f37162b = 0.0f;

    @Override // jm.InterfaceC6523f
    /* JADX INFO: renamed from: a */
    public final Float mo13102a() {
        return Float.valueOf(this.f37162b);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public final boolean equals(Object obj) {
        C6521d c6521d;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (obj instanceof C6521d) {
            float f3 = this.f37161a;
            float f10 = this.f37162b;
            if (f3 > f10) {
                C6521d c6521d2 = (C6521d) obj;
                if (c6521d2.f37161a > c6521d2.f37162b) {
                    z12 = true;
                } else {
                    c6521d = (C6521d) obj;
                    if (f3 == c6521d.f37161a) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        if (f10 == c6521d.f37162b) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            z12 = true;
                        }
                    }
                }
            } else {
                c6521d = (C6521d) obj;
                if (f3 == c6521d.f37161a) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (f10 == c6521d.f37162b) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                    }
                }
            }
        }
        return z12;
    }

    @Override // jm.InterfaceC6523f
    /* JADX INFO: renamed from: f */
    public final Float mo13103f() {
        return Float.valueOf(this.f37161a);
    }

    public final int hashCode() {
        float f3 = this.f37161a;
        float f10 = this.f37162b;
        if (f3 > f10) {
            return -1;
        }
        return (Float.hashCode(f3) * 31) + Float.hashCode(f10);
    }

    public final String toString() {
        return this.f37161a + ".." + this.f37162b;
    }
}
