package p000;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56310a;

    /* JADX INFO: renamed from: b */
    public int f56311b;

    /* JADX INFO: renamed from: c */
    public int f56312c;

    /* JADX INFO: renamed from: d */
    public int f56313d;

    /* JADX INFO: renamed from: e */
    public Object f56314e;

    public pj3(int i, int i2, int i3, rw9 rw9Var) {
        this.f56310a = 3;
        this.f56311b = i;
        this.f56312c = i2;
        this.f56313d = i3;
        this.f56314e = rw9Var;
    }

    /* JADX INFO: renamed from: a */
    public void m19195a(int i, int i2) {
        if (i < 0) {
            C3386nv.m17626m("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            C3386nv.m17626m("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.f56313d;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.f56314e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.f56314e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.f56314e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.f56314e;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.f56313d++;
    }

    /* JADX INFO: renamed from: b */
    public ou8 m19196b(int i) {
        return new ou8(wfb.m23923r((rw9) this.f56314e, i), i, 1L);
    }

    /* JADX INFO: renamed from: c */
    public void m19197c(RecyclerView recyclerView, boolean z) {
        this.f56313d = 0;
        int[] iArr = (int[]) this.f56314e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        y28 y28Var = recyclerView.f6613I;
        if (recyclerView.f6611H == null || y28Var == null || !y28Var.f69179i) {
            return;
        }
        if (z) {
            if (!recyclerView.f6651e.m19755x()) {
                y28Var.mo2685i(recyclerView.f6611H.mo6133a(), this);
            }
        } else if (!recyclerView.m2721P()) {
            y28Var.mo2683h(this.f56311b, this.f56312c, recyclerView.f6606C0, this);
        }
        int i = this.f56313d;
        if (i > y28Var.f69180j) {
            y28Var.f69180j = i;
            y28Var.f69181k = z;
            recyclerView.f6647c.m12342n();
        }
    }

    /* JADX INFO: renamed from: d */
    public int m19198d() {
        return this.f56313d - this.f56312c;
    }

    /* JADX INFO: renamed from: e */
    public int m19199e(int i) {
        return ((kz6) this.f56314e).f48814B[this.f56312c + i];
    }

    /* JADX INFO: renamed from: f */
    public Object m19200f(int i) {
        return ((kz6) this.f56314e).f48816D[this.f56313d + i];
    }

    public String toString() {
        switch (this.f56310a) {
            case 0:
                return "";
            case 3:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.f56311b;
                sb.append(i);
                sb.append('-');
                rw9 rw9Var = (rw9) this.f56314e;
                sb.append(wfb.m23923r(rw9Var, i));
                sb.append(',');
                int i2 = this.f56312c;
                sb.append(i2);
                sb.append('-');
                sb.append(wfb.m23923r(rw9Var, i2));
                sb.append("), prevOffset=");
                return wq1.m24122r(sb, this.f56313d, ')');
            default:
                return super.toString();
        }
    }

    public pj3(kz6 kz6Var) {
        this.f56310a = 2;
        this.f56314e = kz6Var;
    }

    public /* synthetic */ pj3(int i) {
        this.f56310a = i;
    }
}
