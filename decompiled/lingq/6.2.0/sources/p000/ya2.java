package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ya2 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final int f69541a;

    /* JADX INFO: renamed from: b */
    public final int f69542b;

    public ya2(int i, int i2) {
        this.f69541a = i;
        this.f69542b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        j54.m14288a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        int i = vo2Var.f65704c;
        gh1 gh1Var = vo2Var.f65702a;
        int i2 = this.f69542b;
        int iM12627f = i + i2;
        if (((i ^ iM12627f) & (i2 ^ iM12627f)) < 0) {
            iM12627f = gh1Var.m12627f();
        }
        vo2Var.m23453a(vo2Var.f65704c, Math.min(iM12627f, gh1Var.m12627f()));
        int i3 = vo2Var.f65703b;
        int i4 = this.f69541a;
        int i5 = i3 - i4;
        if (((i4 ^ i3) & (i3 ^ i5)) < 0) {
            i5 = 0;
        }
        vo2Var.m23453a(Math.max(0, i5), vo2Var.f65703b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ya2)) {
            return false;
        }
        ya2 ya2Var = (ya2) obj;
        return this.f69541a == ya2Var.f69541a && this.f69542b == ya2Var.f69542b;
    }

    public final int hashCode() {
        return (this.f69541a * 31) + this.f69542b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb.append(this.f69541a);
        sb.append(", lengthAfterCursor=");
        return wq1.m24122r(sb, this.f69542b, ')');
    }
}
