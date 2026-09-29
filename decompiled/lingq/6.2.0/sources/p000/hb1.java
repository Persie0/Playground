package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hb1 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final C3419on f42122a;

    /* JADX INFO: renamed from: b */
    public final int f42123b;

    public hb1(String str, int i) {
        this(new C3419on(str), i);
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        int i = vo2Var.f65705d;
        C3419on c3419on = this.f42122a;
        if (i != -1) {
            vo2Var.m23456d(i, c3419on.f54604b, vo2Var.f65706e);
        } else {
            vo2Var.m23456d(vo2Var.f65703b, c3419on.f54604b, vo2Var.f65704c);
        }
        int i2 = vo2Var.f65703b;
        int i3 = vo2Var.f65704c;
        int i4 = i2 == i3 ? i3 : -1;
        int i5 = this.f42123b;
        int iM15945h = l70.m15945h(i5 > 0 ? (i4 + i5) - 1 : (i4 + i5) - c3419on.f54604b.length(), 0, vo2Var.f65702a.m12627f());
        vo2Var.m23458f(iM15945h, iM15945h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb1)) {
            return false;
        }
        hb1 hb1Var = (hb1) obj;
        return fa4.m11650l(this.f42122a.f54604b, hb1Var.f42122a.f54604b) && this.f42123b == hb1Var.f42123b;
    }

    public final int hashCode() {
        return (this.f42122a.f54604b.hashCode() * 31) + this.f42123b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommitTextCommand(text='");
        sb.append(this.f42122a.f54604b);
        sb.append("', newCursorPosition=");
        return wq1.m24122r(sb, this.f42123b, ')');
    }

    public hb1(C3419on c3419on, int i) {
        this.f42122a = c3419on;
        this.f42123b = i;
    }
}
