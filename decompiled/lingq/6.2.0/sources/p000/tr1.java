package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class tr1 extends d32 {

    /* JADX INFO: renamed from: h */
    public final fc0 f62749h;

    public tr1(fc0 fc0Var) {
        this.f62749h = fc0Var;
    }

    @Override // p000.d32
    /* JADX INFO: renamed from: A */
    public final int mo10067A(int i, int i2, LayoutDirection layoutDirection, l87 l87Var, int i3) {
        return this.f62749h.m11762a(i2, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tr1) && fa4.m11650l(this.f62749h, ((tr1) obj).f62749h);
    }

    public final int hashCode() {
        return Float.hashCode(this.f62749h.f38829a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.f62749h + ')';
    }
}
