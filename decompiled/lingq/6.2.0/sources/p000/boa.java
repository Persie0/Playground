package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes.dex */
public final class boa implements e5b {

    /* JADX INFO: renamed from: a */
    public final String f8775a;

    /* JADX INFO: renamed from: b */
    public final t66 f8776b;

    public boa(v64 v64Var, String str) {
        this.f8775a = str;
        this.f8776b = AbstractC0278f.m1260j(v64Var);
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        return m4003e().f64917b;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return m4003e().f64916a;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return m4003e().f64919d;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return m4003e().f64918c;
    }

    /* JADX INFO: renamed from: e */
    public final v64 m4003e() {
        return (v64) ((xc9) this.f8776b).getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof boa) {
            return fa4.m11650l(m4003e(), ((boa) obj).m4003e());
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m4004f(v64 v64Var) {
        ((xc9) this.f8776b).setValue(v64Var);
    }

    public final int hashCode() {
        return this.f8775a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f8775a);
        sb.append("(left=");
        sb.append(m4003e().f64916a);
        sb.append(", top=");
        sb.append(m4003e().f64917b);
        sb.append(", right=");
        sb.append(m4003e().f64918c);
        sb.append(", bottom=");
        return wq1.m24122r(sb, m4003e().f64919d, ')');
    }
}
