package p000;

/* JADX INFO: renamed from: ju */
/* JADX INFO: loaded from: classes3.dex */
public final class C3160ju implements InterfaceC3274ku {

    /* JADX INFO: renamed from: a */
    public final int f46149a;

    public C3160ju(int i) {
        this.f46149a = i;
    }

    /* JADX INFO: renamed from: a */
    public final int m14647a() {
        return this.f46149a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3160ju) && this.f46149a == ((C3160ju) obj).f46149a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f46149a);
    }

    public final String toString() {
        return ux5.m22989l("Playlist(id=", this.f46149a, ")");
    }
}
