package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xc0 extends b2a {

    /* JADX INFO: renamed from: c */
    public final short f68049c;

    /* JADX INFO: renamed from: d */
    public final short f68050d;

    public xc0(b2a b2aVar, int i, int i2) {
        super(b2aVar);
        this.f68049c = (short) i;
        this.f68050d = (short) i2;
    }

    @Override // p000.b2a
    /* JADX INFO: renamed from: a */
    public final void mo3196a(zc0 zc0Var, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f68050d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                zc0Var.m25545b(31, 5);
                if (s > 62) {
                    zc0Var.m25545b(s - 31, 16);
                } else if (i == 0) {
                    zc0Var.m25545b(Math.min((int) s, 31), 5);
                } else {
                    zc0Var.m25545b(s - 31, 5);
                }
            }
            zc0Var.m25545b(bArr[this.f68049c + i], 8);
            i++;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        short s = this.f68049c;
        sb.append((int) s);
        sb.append("::");
        sb.append((s + this.f68050d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
