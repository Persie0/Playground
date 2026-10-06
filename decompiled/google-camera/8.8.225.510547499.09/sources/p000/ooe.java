package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ooe implements onx {

    /* JADX INFO: renamed from: a */
    private final Class f46348a;

    public ooe(Class cls) {
        this.f46348a = cls;
    }

    @Override // p000.onx
    /* JADX INFO: renamed from: a */
    public final Class mo18730a() {
        return this.f46348a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ooe) && ooc.m18737c(this.f46348a, ((ooe) obj).f46348a);
    }

    public final int hashCode() {
        return this.f46348a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.f46348a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
