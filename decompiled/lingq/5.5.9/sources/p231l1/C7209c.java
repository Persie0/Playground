package p231l1;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.platform.C0708a;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: l1.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7209c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7210d f40555a;

    /* JADX INFO: renamed from: b */
    public final int f40556b;

    /* JADX INFO: renamed from: c */
    public final int f40557c;

    public C7209c(C0708a c0708a, int i10, int i11) {
        this.f40555a = c0708a;
        this.f40556b = i10;
        this.f40557c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7209c)) {
            return false;
        }
        C7209c c7209c = (C7209c) obj;
        return C5207g.m11106a(this.f40555a, c7209c.f40555a) && this.f40556b == c7209c.f40556b && this.f40557c == c7209c.f40557c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f40557c) + C0009a.m16d(this.f40556b, this.f40555a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.f40555a);
        sb2.append(", startIndex=");
        sb2.append(this.f40556b);
        sb2.append(", endIndex=");
        return C0204c.m853l(sb2, this.f40557c, ')');
    }
}
