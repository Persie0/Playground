package p000;

/* JADX INFO: renamed from: rc */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0952rc {

    /* JADX INFO: renamed from: a */
    public final String f47535a;

    private /* synthetic */ C0952rc(String str) {
        this.f47535a = str;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C0952rc m19372a(String str) {
        return new C0952rc(str);
    }

    /* JADX INFO: renamed from: b */
    public static String m19373b(String str) {
        return "Camera ".concat(String.valueOf(str));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0952rc) && ooc.m18737c(this.f47535a, ((C0952rc) obj).f47535a);
    }

    public final int hashCode() {
        return this.f47535a.hashCode();
    }

    public final String toString() {
        return m19373b(this.f47535a);
    }
}
