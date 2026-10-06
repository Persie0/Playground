package p000;

/* JADX INFO: renamed from: sc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0979sc {

    /* JADX INFO: renamed from: a */
    public final int f47572a;

    private /* synthetic */ C0979sc(int i) {
        this.f47572a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C0979sc m19386a(int i) {
        return new C0979sc(i);
    }

    /* JADX INFO: renamed from: b */
    public static String m19387b(int i) {
        return "Stream-" + i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0979sc) && this.f47572a == ((C0979sc) obj).f47572a;
    }

    public final int hashCode() {
        return this.f47572a;
    }

    public final String toString() {
        return m19387b(this.f47572a);
    }
}
