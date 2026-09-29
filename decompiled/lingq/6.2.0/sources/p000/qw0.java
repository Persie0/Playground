package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class qw0 {

    /* JADX INFO: renamed from: a */
    public final int f58262a;

    /* JADX INFO: renamed from: b */
    public final int f58263b;

    /* JADX INFO: renamed from: c */
    public final String f58264c;

    public qw0(int i, String str, int i2) {
        str.getClass();
        this.f58262a = i;
        this.f58263b = i2;
        this.f58264c = str;
    }

    /* JADX INFO: renamed from: a */
    public final int m20184a() {
        return this.f58262a;
    }

    /* JADX INFO: renamed from: b */
    public final int m20185b() {
        return this.f58263b;
    }

    /* JADX INFO: renamed from: c */
    public final String m20186c() {
        return this.f58264c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw0)) {
            return false;
        }
        qw0 qw0Var = (qw0) obj;
        return this.f58262a == qw0Var.f58262a && this.f58263b == qw0Var.f58263b && fa4.m11650l(this.f58264c, qw0Var.f58264c);
    }

    public final int hashCode() {
        return this.f58264c.hashCode() + wq1.m24106b(this.f58263b, Integer.hashCode(this.f58262a) * 31, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22994q(this.f58262a, this.f58263b, "ChatMessageTranslationEntity(chatId=", ", messageIndex=", ", translation="), this.f58264c, ")");
    }
}
