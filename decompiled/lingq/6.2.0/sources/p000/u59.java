package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class u59 extends x59 {

    /* JADX INFO: renamed from: a */
    public final String f63451a;

    /* JADX INFO: renamed from: b */
    public final String f63452b;

    public u59(String str, String str2) {
        this.f63451a = str;
        this.f63452b = str2;
    }

    @Override // p000.x59
    /* JADX INFO: renamed from: a */
    public final String mo19662a() {
        return this.f63452b;
    }

    /* JADX INFO: renamed from: b */
    public final String m22482b() {
        return this.f63451a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u59)) {
            return false;
        }
        u59 u59Var = (u59) obj;
        return this.f63451a.equals(u59Var.f63451a) && this.f63452b.equals(u59Var.f63452b);
    }

    public final int hashCode() {
        return this.f63452b.hashCode() + (this.f63451a.hashCode() * 31);
    }

    public final String toString() {
        return ux5.m22991n("LessonBlacklist(sourceName=", this.f63451a, ", key=", this.f63452b, ")");
    }
}
