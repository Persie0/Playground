package p000;

/* JADX INFO: renamed from: fy */
/* JADX INFO: loaded from: classes3.dex */
public final class C3018fy implements InterfaceC3055gy {

    /* JADX INFO: renamed from: a */
    public final int f39908a;

    /* JADX INFO: renamed from: b */
    public final String f39909b;

    public C3018fy(int i, String str) {
        str.getClass();
        this.f39908a = i;
        this.f39909b = str;
    }

    @Override // p000.InterfaceC3055gy
    /* JADX INFO: renamed from: a */
    public final int mo3115a() {
        return this.f39908a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3018fy)) {
            return false;
        }
        C3018fy c3018fy = (C3018fy) obj;
        return this.f39908a == c3018fy.f39908a && fa4.m11650l(this.f39909b, c3018fy.f39909b);
    }

    public final int hashCode() {
        return this.f39909b.hashCode() + (Integer.hashCode(this.f39908a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f39908a, "Idle(lessonId=", ", language=", this.f39909b, ")");
    }
}
