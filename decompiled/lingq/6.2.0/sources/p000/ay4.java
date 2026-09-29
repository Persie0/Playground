package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ay4 {

    /* JADX INFO: renamed from: a */
    public final int f7662a;

    /* JADX INFO: renamed from: b */
    public final int f7663b;

    /* JADX INFO: renamed from: c */
    public final int f7664c;

    /* JADX INFO: renamed from: d */
    public final String f7665d;

    public ay4(int i, int i2, int i3, String str) {
        str.getClass();
        this.f7662a = i;
        this.f7663b = i2;
        this.f7664c = i3;
        this.f7665d = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m3116a() {
        return this.f7663b;
    }

    /* JADX INFO: renamed from: b */
    public final int m3117b() {
        return this.f7662a;
    }

    /* JADX INFO: renamed from: c */
    public final String m3118c() {
        return this.f7665d;
    }

    /* JADX INFO: renamed from: d */
    public final int m3119d() {
        return this.f7664c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay4)) {
            return false;
        }
        ay4 ay4Var = (ay4) obj;
        return this.f7662a == ay4Var.f7662a && this.f7663b == ay4Var.f7663b && this.f7664c == ay4Var.f7664c && fa4.m11650l(this.f7665d, ay4Var.f7665d);
    }

    public final int hashCode() {
        return this.f7665d.hashCode() + wq1.m24106b(this.f7664c, wq1.m24106b(this.f7663b, Integer.hashCode(this.f7662a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM22994q = ux5.m22994q(this.f7662a, this.f7663b, "LessonCoachChatEntity(lessonId=", ", chatId=", ", messageIndex=");
        sbM22994q.append(this.f7664c);
        sbM22994q.append(", message=");
        sbM22994q.append(this.f7665d);
        sbM22994q.append(")");
        return sbM22994q.toString();
    }
}
