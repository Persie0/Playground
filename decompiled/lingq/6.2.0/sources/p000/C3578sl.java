package p000;

import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: renamed from: sl */
/* JADX INFO: loaded from: classes.dex */
public final class C3578sl implements e5b {

    /* JADX INFO: renamed from: a */
    public final int f60965a;

    /* JADX INFO: renamed from: b */
    public final String f60966b;

    /* JADX INFO: renamed from: c */
    public final t66 f60967c = AbstractC0278f.m1260j(l64.f49115e);

    /* JADX INFO: renamed from: d */
    public final t66 f60968d = AbstractC0278f.m1260j(Boolean.TRUE);

    public C3578sl(int i, String str) {
        this.f60965a = i;
        this.f60966b = str;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: a */
    public final int mo3999a(fb2 fb2Var) {
        return m21441e().f49117b;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: b */
    public final int mo4000b(fb2 fb2Var, LayoutDirection layoutDirection) {
        return m21441e().f49116a;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: c */
    public final int mo4001c(fb2 fb2Var) {
        return m21441e().f49119d;
    }

    @Override // p000.e5b
    /* JADX INFO: renamed from: d */
    public final int mo4002d(fb2 fb2Var, LayoutDirection layoutDirection) {
        return m21441e().f49118c;
    }

    /* JADX INFO: renamed from: e */
    public final l64 m21441e() {
        return (l64) ((xc9) this.f60967c).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3578sl) {
            return this.f60965a == ((C3578sl) obj).f60965a;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final void m21442f(boolean z) {
        ((xc9) this.f60968d).setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: g */
    public final void m21443g(f6b f6bVar, int i) {
        int i2 = this.f60965a;
        if (i == 0 || (i & i2) != 0) {
            ((xc9) this.f60967c).setValue(f6bVar.f38536a.mo136i(i2));
            m21442f(f6bVar.f38536a.mo139u(i2));
        }
    }

    public final int hashCode() {
        return this.f60965a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f60966b);
        sb.append('(');
        sb.append(m21441e().f49116a);
        sb.append(", ");
        sb.append(m21441e().f49117b);
        sb.append(", ");
        sb.append(m21441e().f49118c);
        sb.append(", ");
        return wq1.m24122r(sb, m21441e().f49119d, ')');
    }
}
