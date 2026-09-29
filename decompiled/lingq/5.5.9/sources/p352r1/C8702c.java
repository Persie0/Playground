package p352r1;

import androidx.activity.result.C0204c;
import p003a2.C0009a;

/* JADX INFO: renamed from: r1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8702c implements InterfaceC8704e {

    /* JADX INFO: renamed from: a */
    public final int f46289a;

    /* JADX INFO: renamed from: b */
    public final int f46290b;

    public C8702c(int i10, int i11) {
        this.f46289a = i10;
        this.f46290b = i11;
        if (!(i10 >= 0 && i11 >= 0)) {
            throw new IllegalArgumentException(C0009a.m20h("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i10, " and ", i11, " respectively.").toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8702c)) {
            return false;
        }
        C8702c c8702c = (C8702c) obj;
        if (this.f46289a == c8702c.f46289a && this.f46290b == c8702c.f46290b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f46289a * 31) + this.f46290b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f46289a);
        sb2.append(", lengthAfterCursor=");
        return C0204c.m853l(sb2, this.f46290b, ')');
    }
}
