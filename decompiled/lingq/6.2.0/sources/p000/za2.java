package p000;

/* JADX INFO: loaded from: classes.dex */
public final class za2 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final int f71256a;

    /* JADX INFO: renamed from: b */
    public final int f71257b;

    public za2(int i, int i2) {
        this.f71256a = i;
        this.f71257b = i2;
        if (i >= 0 && i2 >= 0) {
            return;
        }
        j54.m14288a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.");
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        int i = 0;
        for (int i2 = 0; i2 < this.f71256a; i2++) {
            int i3 = i + 1;
            int i4 = vo2Var.f65703b;
            if (i4 <= i3) {
                i = i4;
                break;
            }
            i = (Character.isHighSurrogate(vo2Var.m23454b((i4 - i3) + (-1))) && Character.isLowSurrogate(vo2Var.m23454b(vo2Var.f65703b - i3))) ? i + 2 : i3;
        }
        int iM12627f = 0;
        for (int i5 = 0; i5 < this.f71257b; i5++) {
            int i6 = iM12627f + 1;
            int i7 = vo2Var.f65704c;
            gh1 gh1Var = vo2Var.f65702a;
            if (i7 + i6 >= gh1Var.m12627f()) {
                iM12627f = gh1Var.m12627f() - vo2Var.f65704c;
                break;
            }
            iM12627f = (Character.isHighSurrogate(vo2Var.m23454b((vo2Var.f65704c + i6) + (-1))) && Character.isLowSurrogate(vo2Var.m23454b(vo2Var.f65704c + i6))) ? iM12627f + 2 : i6;
        }
        int i8 = vo2Var.f65704c;
        vo2Var.m23453a(i8, iM12627f + i8);
        int i9 = vo2Var.f65703b;
        vo2Var.m23453a(i9 - i, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za2)) {
            return false;
        }
        za2 za2Var = (za2) obj;
        return this.f71256a == za2Var.f71256a && this.f71257b == za2Var.f71257b;
    }

    public final int hashCode() {
        return (this.f71256a * 31) + this.f71257b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb.append(this.f71256a);
        sb.append(", lengthAfterCursor=");
        return wq1.m24122r(sb, this.f71257b, ')');
    }
}
