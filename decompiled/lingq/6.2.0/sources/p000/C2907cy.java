package p000;

/* JADX INFO: renamed from: cy */
/* JADX INFO: loaded from: classes2.dex */
public final class C2907cy implements InterfaceC3055gy {

    /* JADX INFO: renamed from: a */
    public final int f34698a;

    /* JADX INFO: renamed from: b */
    public final String f34699b;

    /* JADX INFO: renamed from: c */
    public final int f34700c;

    public C2907cy(int i, String str, int i2) {
        str.getClass();
        this.f34698a = i;
        this.f34699b = str;
        this.f34700c = i2;
    }

    @Override // p000.InterfaceC3055gy
    /* JADX INFO: renamed from: a */
    public final int mo3115a() {
        return this.f34698a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2907cy)) {
            return false;
        }
        C2907cy c2907cy = (C2907cy) obj;
        return this.f34698a == c2907cy.f34698a && fa4.m11650l(this.f34699b, c2907cy.f34699b) && this.f34700c == c2907cy.f34700c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34700c) + ux5.m22980c(Integer.hashCode(this.f34698a) * 31, this.f34699b, 31);
    }

    public final String toString() {
        return wq1.m24123s(ux5.m22995r(this.f34698a, "Downloading(lessonId=", ", language=", this.f34699b, ", progress="), this.f34700c, ")");
    }
}
