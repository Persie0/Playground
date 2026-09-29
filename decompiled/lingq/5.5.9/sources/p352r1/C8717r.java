package p352r1;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: r1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C8717r implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final int f46308a;

    /* JADX INFO: renamed from: b */
    public final int f46309b;

    public C8717r(int i10, int i11) {
        this.f46308a = i10;
        this.f46309b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8717r)) {
            return false;
        }
        C8717r c8717r = (C8717r) obj;
        if (this.f46308a == c8717r.f46308a && this.f46309b == c8717r.f46309b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46308a * 31) + this.f46309b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingRegionCommand(start=");
        sb2.append(this.f46308a);
        sb2.append(", end=");
        return C0204c.m853l(sb2, this.f46309b, ')');
    }
}
