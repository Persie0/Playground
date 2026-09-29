package p328q1;

import dm.C5207g;
import p003a2.C0009a;
import p260m8.C7499b;

/* JADX INFO: renamed from: q1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C8481r implements InterfaceC8468e {

    /* JADX INFO: renamed from: a */
    public final int f45658a;

    /* JADX INFO: renamed from: b */
    public final C8476m f45659b;

    /* JADX INFO: renamed from: c */
    public final int f45660c;

    /* JADX INFO: renamed from: d */
    public final C8475l f45661d;

    /* JADX INFO: renamed from: e */
    public final int f45662e;

    public C8481r(int i10, C8476m c8476m, int i11, C8475l c8475l, int i12) {
        this.f45658a = i10;
        this.f45659b = c8476m;
        this.f45660c = i11;
        this.f45661d = c8475l;
        this.f45662e = i12;
    }

    @Override // p328q1.InterfaceC8468e
    /* JADX INFO: renamed from: a */
    public final int mo16543a() {
        return this.f45662e;
    }

    @Override // p328q1.InterfaceC8468e
    /* JADX INFO: renamed from: b */
    public final C8476m mo16544b() {
        return this.f45659b;
    }

    @Override // p328q1.InterfaceC8468e
    /* JADX INFO: renamed from: c */
    public final int mo16545c() {
        return this.f45660c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8481r)) {
            return false;
        }
        C8481r c8481r = (C8481r) obj;
        if (this.f45658a != c8481r.f45658a) {
            return false;
        }
        if (!C5207g.m11106a(this.f45659b, c8481r.f45659b)) {
            return false;
        }
        if ((this.f45660c == c8481r.f45660c) && C5207g.m11106a(this.f45661d, c8481r.f45661d)) {
            return this.f45662e == c8481r.f45662e;
        }
        return false;
    }

    public final int hashCode() {
        return this.f45661d.hashCode() + C0009a.m16d(this.f45662e, C0009a.m16d(this.f45660c, ((this.f45658a * 31) + this.f45659b.f45655a) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.f45658a + ", weight=" + this.f45659b + ", style=" + ((Object) C8471h.m16546a(this.f45660c)) + ", loadingStrategy=" + ((Object) C7499b.m14903F0(this.f45662e)) + ')';
    }
}
