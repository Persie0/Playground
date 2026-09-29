package p373rn;

import dm.C5207g;
import mn.C7645b;

/* JADX INFO: renamed from: rn.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C8874f {

    /* JADX INFO: renamed from: a */
    public final C7645b f46770a;

    /* JADX INFO: renamed from: b */
    public final int f46771b;

    public C8874f(C7645b c7645b, int i10) {
        this.f46770a = c7645b;
        this.f46771b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8874f)) {
            return false;
        }
        C8874f c8874f = (C8874f) obj;
        return C5207g.m11106a(this.f46770a, c8874f.f46770a) && this.f46771b == c8874f.f46771b;
    }

    public final int hashCode() {
        return (this.f46770a.hashCode() * 31) + this.f46771b;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            i10 = this.f46771b;
            if (i11 >= i10) {
                break;
            }
            sb2.append("kotlin/Array<");
            i11++;
        }
        sb2.append(this.f46770a);
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(">");
        }
        String string = sb2.toString();
        C5207g.m11110e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
