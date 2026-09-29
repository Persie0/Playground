package p000;

/* JADX INFO: loaded from: classes.dex */
public final class a09 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final int f35a;

    /* JADX INFO: renamed from: b */
    public final int f36b;

    public a09(int i, int i2) {
        this.f35a = i;
        this.f36b = i2;
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        int iM15945h = l70.m15945h(this.f35a, 0, vo2Var.f65702a.m12627f());
        int iM15945h2 = l70.m15945h(this.f36b, 0, vo2Var.f65702a.m12627f());
        if (iM15945h < iM15945h2) {
            vo2Var.m23458f(iM15945h, iM15945h2);
        } else {
            vo2Var.m23458f(iM15945h2, iM15945h);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a09)) {
            return false;
        }
        a09 a09Var = (a09) obj;
        return this.f35a == a09Var.f35a && this.f36b == a09Var.f36b;
    }

    public final int hashCode() {
        return (this.f35a * 31) + this.f36b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetSelectionCommand(start=");
        sb.append(this.f35a);
        sb.append(", end=");
        return wq1.m24122r(sb, this.f36b, ')');
    }
}
