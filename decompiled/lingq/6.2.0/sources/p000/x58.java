package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x58 {

    /* JADX INFO: renamed from: a */
    public final boolean f67784a;

    /* JADX INFO: renamed from: b */
    public final Integer f67785b;

    public x58(boolean z, Integer num) {
        this.f67784a = z;
        this.f67785b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        x58 x58Var = (x58) obj;
        return this.f67784a == x58Var.f67784a && fa4.m11650l(this.f67785b, x58Var.f67785b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f67784a) * 31;
        Integer num = this.f67785b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "RemoveLessonWarningDialogState(show=" + this.f67784a + ", lessonId=" + this.f67785b + ")";
    }

    public /* synthetic */ x58(int i) {
        this(false, null);
    }
}
