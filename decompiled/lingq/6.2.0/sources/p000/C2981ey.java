package p000;

/* JADX INFO: renamed from: ey */
/* JADX INFO: loaded from: classes2.dex */
public final class C2981ey implements InterfaceC3055gy {

    /* JADX INFO: renamed from: a */
    public final int f38059a;

    /* JADX INFO: renamed from: b */
    public final String f38060b;

    public C2981ey(int i, String str) {
        str.getClass();
        this.f38059a = i;
        this.f38060b = str;
    }

    @Override // p000.InterfaceC3055gy
    /* JADX INFO: renamed from: a */
    public final int mo3115a() {
        return this.f38059a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2981ey)) {
            return false;
        }
        C2981ey c2981ey = (C2981ey) obj;
        return this.f38059a == c2981ey.f38059a && fa4.m11650l(this.f38060b, c2981ey.f38060b);
    }

    public final int hashCode() {
        return this.f38060b.hashCode() + (Integer.hashCode(this.f38059a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f38059a, "GeneratingAudio(lessonId=", ", language=", this.f38060b, ")");
    }
}
