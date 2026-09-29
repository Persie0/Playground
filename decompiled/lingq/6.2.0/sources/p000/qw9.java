package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qw9 {

    /* JADX INFO: renamed from: a */
    public final C3419on f58295a;

    /* JADX INFO: renamed from: b */
    public final vx9 f58296b;

    /* JADX INFO: renamed from: c */
    public final List f58297c;

    /* JADX INFO: renamed from: d */
    public final int f58298d;

    /* JADX INFO: renamed from: e */
    public final boolean f58299e;

    /* JADX INFO: renamed from: f */
    public final int f58300f;

    /* JADX INFO: renamed from: g */
    public final fb2 f58301g;

    /* JADX INFO: renamed from: h */
    public final LayoutDirection f58302h;

    /* JADX INFO: renamed from: i */
    public final wa3 f58303i;

    /* JADX INFO: renamed from: j */
    public final long f58304j;

    public qw9(C3419on c3419on, vx9 vx9Var, List list, int i, boolean z, int i2, fb2 fb2Var, LayoutDirection layoutDirection, wa3 wa3Var, long j) {
        this.f58295a = c3419on;
        this.f58296b = vx9Var;
        this.f58297c = list;
        this.f58298d = i;
        this.f58299e = z;
        this.f58300f = i2;
        this.f58301g = fb2Var;
        this.f58302h = layoutDirection;
        this.f58303i = wa3Var;
        this.f58304j = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw9)) {
            return false;
        }
        qw9 qw9Var = (qw9) obj;
        return fa4.m11650l(this.f58295a, qw9Var.f58295a) && fa4.m11650l(this.f58296b, qw9Var.f58296b) && fa4.m11650l(this.f58297c, qw9Var.f58297c) && this.f58298d == qw9Var.f58298d && this.f58299e == qw9Var.f58299e && this.f58300f == qw9Var.f58300f && fa4.m11650l(this.f58301g, qw9Var.f58301g) && this.f58302h == qw9Var.f58302h && fa4.m11650l(this.f58303i, qw9Var.f58303i) && bk1.m3795c(this.f58304j, qw9Var.f58304j);
    }

    public final int hashCode() {
        return Long.hashCode(this.f58304j) + ((this.f58303i.hashCode() + ((this.f58302h.hashCode() + ((this.f58301g.hashCode() + wq1.m24106b(this.f58300f, g9a.m12428e((ux5.m22979b(ux5.m22982e(this.f58296b, this.f58295a.hashCode() * 31, 31), 31, this.f58297c) + this.f58298d) * 31, 31, this.f58299e), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f58295a) + ", style=" + this.f58296b + ", placeholders=" + this.f58297c + ", maxLines=" + this.f58298d + ", softWrap=" + this.f58299e + ", overflow=" + ((Object) l70.m15920K(this.f58300f)) + ", density=" + this.f58301g + ", layoutDirection=" + this.f58302h + ", fontFamilyResolver=" + this.f58303i + ", constraints=" + ((Object) bk1.m3804l(this.f58304j)) + ')';
    }
}
