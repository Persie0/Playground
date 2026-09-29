package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class mw0 {

    /* JADX INFO: renamed from: a */
    public final int f51906a;

    /* JADX INFO: renamed from: b */
    public final int f51907b;

    public mw0(int i, int i2) {
        this.f51906a = i;
        this.f51907b = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m17061a() {
        return this.f51906a;
    }

    /* JADX INFO: renamed from: b */
    public final int m17062b() {
        return this.f51907b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw0)) {
            return false;
        }
        mw0 mw0Var = (mw0) obj;
        return this.f51906a == mw0Var.f51906a && this.f51907b == mw0Var.f51907b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f51907b) + (Integer.hashCode(this.f51906a) * 31);
    }

    public final String toString() {
        return ux5.m22987j(this.f51906a, this.f51907b, "ChatLessonJoin(chatId=", ", lessonId=", ")");
    }
}
