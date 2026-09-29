package p210k1;

import androidx.activity.result.C0204c;
import dm.C5207g;
import jm.C6521d;
import jm.InterfaceC6522e;

/* JADX INFO: renamed from: k1.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6568f {

    /* JADX INFO: renamed from: d */
    public static final C6568f f37364d = new C6568f(new C6521d());

    /* JADX INFO: renamed from: a */
    public final float f37365a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC6522e<Float> f37366b;

    /* JADX INFO: renamed from: c */
    public final int f37367c;

    public C6568f() {
        throw null;
    }

    public C6568f(C6521d c6521d) {
        this.f37365a = 0.0f;
        this.f37366b = c6521d;
        this.f37367c = 0;
        if (!(!Float.isNaN(0.0f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6568f)) {
            return false;
        }
        C6568f c6568f = (C6568f) obj;
        if ((this.f37365a == c6568f.f37365a) && C5207g.m11106a(this.f37366b, c6568f.f37366b) && this.f37367c == c6568f.f37367c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f37366b.hashCode() + (Float.hashCode(this.f37365a) * 31)) * 31) + this.f37367c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgressBarRangeInfo(current=");
        sb2.append(this.f37365a);
        sb2.append(", range=");
        sb2.append(this.f37366b);
        sb2.append(", steps=");
        return C0204c.m853l(sb2, this.f37367c, ')');
    }
}
