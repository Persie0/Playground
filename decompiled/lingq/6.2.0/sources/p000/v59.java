package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final boolean f64895a;

    /* JADX INFO: renamed from: b */
    public final String f64896b;

    public v59(boolean z, String str) {
        this.f64895a = z;
        this.f64896b = str;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f64896b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v59)) {
            return false;
        }
        v59 v59Var = (v59) obj;
        return this.f64895a == v59Var.f64895a && this.f64896b.equals(v59Var.f64896b);
    }

    public final int hashCode() {
        return this.f64896b.hashCode() + (Boolean.hashCode(this.f64895a) * 31);
    }

    public final String toString() {
        return "Loading(isLesson=" + this.f64895a + ", key=" + this.f64896b + ")";
    }
}
