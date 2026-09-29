package p352r1;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: r1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C8719t implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final int f46312a;

    /* JADX INFO: renamed from: b */
    public final int f46313b;

    public C8719t(int i10, int i11) {
        this.f46312a = i10;
        this.f46313b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8719t)) {
            return false;
        }
        C8719t c8719t = (C8719t) obj;
        return this.f46312a == c8719t.f46312a && this.f46313b == c8719t.f46313b;
    }

    public final int hashCode() {
        return (this.f46312a * 31) + this.f46313b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetSelectionCommand(start=");
        sb2.append(this.f46312a);
        sb2.append(", end=");
        return C0204c.m853l(sb2, this.f46313b, ')');
    }
}
