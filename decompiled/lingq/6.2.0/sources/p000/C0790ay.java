package p000;

/* JADX INFO: renamed from: ay */
/* JADX INFO: loaded from: classes3.dex */
public final class C0790ay implements InterfaceC3055gy {

    /* JADX INFO: renamed from: a */
    public final int f7656a;

    /* JADX INFO: renamed from: b */
    public final String f7657b;

    public C0790ay(int i, String str) {
        str.getClass();
        this.f7656a = i;
        this.f7657b = str;
    }

    @Override // p000.InterfaceC3055gy
    /* JADX INFO: renamed from: a */
    public final int mo3115a() {
        return this.f7656a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0790ay)) {
            return false;
        }
        C0790ay c0790ay = (C0790ay) obj;
        return this.f7656a == c0790ay.f7656a && fa4.m11650l(this.f7657b, c0790ay.f7657b);
    }

    public final int hashCode() {
        return this.f7657b.hashCode() + (Integer.hashCode(this.f7656a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f7656a, "Completed(lessonId=", ", language=", this.f7657b, ")");
    }
}
