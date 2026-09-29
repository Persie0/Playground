package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class by4 {

    /* JADX INFO: renamed from: a */
    public final ay4 f9172a;

    /* JADX INFO: renamed from: b */
    public final String f9173b;

    public by4(ay4 ay4Var, String str) {
        this.f9172a = ay4Var;
        this.f9173b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by4)) {
            return false;
        }
        by4 by4Var = (by4) obj;
        return this.f9172a.equals(by4Var.f9172a) && fa4.m11650l(this.f9173b, by4Var.f9173b);
    }

    public final int hashCode() {
        int iHashCode = this.f9172a.hashCode() * 31;
        String str = this.f9173b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "LessonCoachChatWithTranslation(coach=" + this.f9172a + ", translation=" + this.f9173b + ")";
    }
}
