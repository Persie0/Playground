package p328q1;

import androidx.compose.p017ui.text.font.AbstractC0696b;
import dm.C5207g;
import p003a2.C0009a;

/* JADX INFO: renamed from: q1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C8486w {

    /* JADX INFO: renamed from: a */
    public final AbstractC0696b f45666a;

    /* JADX INFO: renamed from: b */
    public final C8476m f45667b;

    /* JADX INFO: renamed from: c */
    public final int f45668c;

    /* JADX INFO: renamed from: d */
    public final int f45669d;

    /* JADX INFO: renamed from: e */
    public final Object f45670e;

    public C8486w(AbstractC0696b abstractC0696b, C8476m c8476m, int i10, int i11, Object obj) {
        this.f45666a = abstractC0696b;
        this.f45667b = c8476m;
        this.f45668c = i10;
        this.f45669d = i11;
        this.f45670e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8486w)) {
            return false;
        }
        C8486w c8486w = (C8486w) obj;
        if (!C5207g.m11106a(this.f45666a, c8486w.f45666a) || !C5207g.m11106a(this.f45667b, c8486w.f45667b)) {
            return false;
        }
        if (!(this.f45668c == c8486w.f45668c)) {
            return false;
        }
        if ((this.f45669d == c8486w.f45669d) && C5207g.m11106a(this.f45670e, c8486w.f45670e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        AbstractC0696b abstractC0696b = this.f45666a;
        int iM16d = C0009a.m16d(this.f45669d, C0009a.m16d(this.f45668c, (((abstractC0696b == null ? 0 : abstractC0696b.hashCode()) * 31) + this.f45667b.f45655a) * 31, 31), 31);
        Object obj = this.f45670e;
        return iM16d + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.f45666a + ", fontWeight=" + this.f45667b + ", fontStyle=" + ((Object) C8471h.m16546a(this.f45668c)) + ", fontSynthesis=" + ((Object) C8472i.m16547a(this.f45669d)) + ", resourceLoaderCacheKey=" + this.f45670e + ')';
    }
}
