package p352r1;

import androidx.activity.result.C0204c;
import p003a2.C0009a;

/* JADX INFO: renamed from: r1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C8703d implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final int f46291a;

    /* JADX INFO: renamed from: b */
    public final int f46292b;

    public C8703d(int i10, int i11) {
        this.f46291a = i10;
        this.f46292b = i11;
        if (!(i10 >= 0 && i11 >= 0)) {
            throw new IllegalArgumentException(C0009a.m20h("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8703d)) {
            return false;
        }
        C8703d c8703d = (C8703d) obj;
        return this.f46291a == c8703d.f46291a && this.f46292b == c8703d.f46292b;
    }

    public final int hashCode() {
        return (this.f46291a * 31) + this.f46292b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f46291a);
        sb2.append(", lengthAfterCursor=");
        return C0204c.m853l(sb2, this.f46292b, ')');
    }
}
