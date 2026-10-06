package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mop {

    /* JADX INFO: renamed from: a */
    public final int[] f41207a;

    /* JADX INFO: renamed from: b */
    public final mon f41208b;

    /* JADX INFO: renamed from: c */
    public mon f41209c;

    /* JADX INFO: renamed from: d */
    public int f41210d;

    /* JADX INFO: renamed from: e */
    public int f41211e;

    /* JADX INFO: renamed from: f */
    public int f41212f;

    public mop(int[] iArr) {
        this.f41207a = iArr;
        mon monVar = new mon(-1, -1);
        this.f41208b = monVar;
        this.f41209c = monVar;
    }

    /* JADX INFO: renamed from: d */
    private final void m16711d(mon monVar, StringBuilder sb) {
        for (mon monVar2 : monVar.f41203d.values()) {
            sb.append("  ");
            sb.append(monVar);
            sb.append(" -> ");
            sb.append(monVar2);
            sb.append(" [label=\"");
            int[] iArr = this.f41207a;
            sb.append(Arrays.toString(Arrays.copyOfRange(iArr, monVar2.f41200a, Math.min(iArr.length, monVar2.f41201b + 1))));
            sb.append("\"]\n");
            m16711d(monVar2, sb);
        }
    }

    /* JADX INFO: renamed from: a */
    final void m16712a() {
        mon monVar = this.f41209c.f41202c;
        if (monVar != null) {
            this.f41209c = monVar;
        } else {
            this.f41209c = this.f41208b;
            int i = this.f41211e;
            if (i > 0) {
                this.f41211e = i - 1;
            }
            if (this.f41212f > 0) {
                this.f41210d++;
            }
        }
        m16713b();
    }

    /* JADX INFO: renamed from: b */
    final void m16713b() {
        if (this.f41211e == 0) {
            return;
        }
        mon monVar = (mon) this.f41209c.f41203d.get(Integer.valueOf(this.f41207a[this.f41210d]));
        while (true) {
            int i = (monVar.f41201b - monVar.f41200a) + 1;
            int i2 = this.f41211e;
            if (i > i2) {
                return;
            }
            int i3 = this.f41210d + i;
            this.f41210d = i3;
            this.f41209c = monVar;
            int i4 = i2 - i;
            this.f41211e = i4;
            if (i4 > 0) {
                monVar = (mon) monVar.f41203d.get(Integer.valueOf(this.f41207a[i3]));
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m16714c(int i, int i2, int i3, int i4) {
        if (i < 0 || i3 < 0) {
            return false;
        }
        int iMin = Math.min(this.f41207a.length, i2);
        if (iMin - i != Math.min(this.f41207a.length, i4) - i3) {
            return false;
        }
        for (int i5 = i; i5 <= iMin; i5++) {
            int[] iArr = this.f41207a;
            if (iArr[i5] != iArr[(i3 + i5) - i]) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("digraph {\n");
        m16711d(this.f41208b, sb);
        sb.append("}");
        return sb.toString();
    }
}
