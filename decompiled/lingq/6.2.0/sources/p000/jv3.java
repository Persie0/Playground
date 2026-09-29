package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jv3 {

    /* JADX INFO: renamed from: a */
    public final pw9 f46220a;

    /* JADX INFO: renamed from: b */
    public int f46221b = -1;

    /* JADX INFO: renamed from: c */
    public float f46222c;

    public jv3(pw9 pw9Var) {
        this.f46220a = pw9Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX INFO: renamed from: a */
    public final float m14683a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2 = 1;
        pw9 pw9Var = this.f46220a;
        if (z) {
            int iM22008v = te1.m22008v(pw9Var.f56919f, i, z);
            int lineStart = pw9Var.f56919f.getLineStart(iM22008v);
            int iM19549f = pw9Var.m19549f(iM22008v);
            if (i == lineStart || i == iM19549f) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        int i3 = i * 4;
        if (!z3) {
            i2 = z4 ? 2 : 3;
        } else if (z4) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.f46221b == i4) {
            return this.f46222c;
        }
        float fM19553j = z3 ? pw9Var.m19553j(i, z) : pw9Var.m19554k(i, z);
        if (z2) {
            this.f46221b = i4;
            this.f46222c = fM19553j;
        }
        return fM19553j;
    }
}
