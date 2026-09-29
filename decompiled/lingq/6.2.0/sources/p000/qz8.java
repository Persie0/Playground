package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qz8 implements uo2 {

    /* JADX INFO: renamed from: a */
    public final C3419on f58428a;

    /* JADX INFO: renamed from: b */
    public final int f58429b;

    public qz8(String str, int i) {
        this.f58428a = new C3419on(str);
        this.f58429b = i;
    }

    @Override // p000.uo2
    /* JADX INFO: renamed from: a */
    public final void mo20a(vo2 vo2Var) {
        int i = vo2Var.f65705d;
        C3419on c3419on = this.f58428a;
        if (i != -1) {
            int i2 = vo2Var.f65706e;
            String str = c3419on.f54604b;
            String str2 = c3419on.f54604b;
            vo2Var.m23456d(i, str, i2);
            if (str2.length() > 0) {
                vo2Var.m23457e(i, str2.length() + i);
            }
        } else {
            int i3 = vo2Var.f65703b;
            int i4 = vo2Var.f65704c;
            String str3 = c3419on.f54604b;
            String str4 = c3419on.f54604b;
            vo2Var.m23456d(i3, str3, i4);
            if (str4.length() > 0) {
                vo2Var.m23457e(i3, str4.length() + i3);
            }
        }
        int i5 = vo2Var.f65703b;
        int i6 = vo2Var.f65704c;
        int i7 = i5 == i6 ? i6 : -1;
        int i8 = this.f58429b;
        int iM15945h = l70.m15945h(i8 > 0 ? (i7 + i8) - 1 : (i7 + i8) - c3419on.f54604b.length(), 0, vo2Var.f65702a.m12627f());
        vo2Var.m23458f(iM15945h, iM15945h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz8)) {
            return false;
        }
        qz8 qz8Var = (qz8) obj;
        return fa4.m11650l(this.f58428a.f54604b, qz8Var.f58428a.f54604b) && this.f58429b == qz8Var.f58429b;
    }

    public final int hashCode() {
        return (this.f58428a.f54604b.hashCode() * 31) + this.f58429b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingTextCommand(text='");
        sb.append(this.f58428a.f54604b);
        sb.append("', newCursorPosition=");
        return wq1.m24122r(sb, this.f58429b, ')');
    }
}
