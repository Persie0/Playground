package p000;

import com.lingq.core.settings.ViewKeys;

/* JADX INFO: loaded from: classes2.dex */
public final class b29 extends h29 {

    /* JADX INFO: renamed from: a */
    public final String f7804a;

    /* JADX INFO: renamed from: b */
    public final String f7805b;

    /* JADX INFO: renamed from: c */
    public final int f7806c;

    /* JADX INFO: renamed from: d */
    public final ViewKeys f7807d;

    public b29(String str, String str2, int i, ViewKeys viewKeys) {
        viewKeys.getClass();
        this.f7804a = str;
        this.f7805b = str2;
        this.f7806c = i;
        this.f7807d = viewKeys;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b29)) {
            return false;
        }
        b29 b29Var = (b29) obj;
        return this.f7804a.equals(b29Var.f7804a) && this.f7805b.equals(b29Var.f7805b) && this.f7806c == b29Var.f7806c && this.f7807d == b29Var.f7807d;
    }

    public final int hashCode() {
        return this.f7807d.hashCode() + wq1.m24106b(this.f7806c, ux5.m22980c(this.f7804a.hashCode() * 31, this.f7805b, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("TextIcon(title=", this.f7804a, ", value=", this.f7805b, ", icon=");
        sbM23000w.append(this.f7806c);
        sbM23000w.append(", key=");
        sbM23000w.append(this.f7807d);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
