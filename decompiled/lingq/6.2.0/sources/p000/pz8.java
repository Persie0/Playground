package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pz8 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final int f57055a;

    /* JADX INFO: renamed from: b */
    public final int f57056b;

    public pz8(int i, int i2) {
        this.f57055a = i;
        this.f57056b = i2;
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        boolean z = vo2Var.f65705d != -1;
        gh1 gh1Var = vo2Var.f65702a;
        if (z) {
            vo2Var.f65705d = -1;
            vo2Var.f65706e = -1;
        }
        int iM15945h = l70.m15945h(this.f57055a, 0, gh1Var.m12627f());
        int iM15945h2 = l70.m15945h(this.f57056b, 0, gh1Var.m12627f());
        if (iM15945h != iM15945h2) {
            if (iM15945h < iM15945h2) {
                vo2Var.m23457e(iM15945h, iM15945h2);
            } else {
                vo2Var.m23457e(iM15945h2, iM15945h);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pz8)) {
            return false;
        }
        pz8 pz8Var = (pz8) obj;
        return this.f57055a == pz8Var.f57055a && this.f57056b == pz8Var.f57056b;
    }

    public final int hashCode() {
        return (this.f57055a * 31) + this.f57056b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f57055a);
        sb.append(", end=");
        return wq1.m24122r(sb, this.f57056b, ')');
    }
}
