package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class f35 {

    /* JADX INFO: renamed from: a */
    public final lk0 f38341a;

    /* JADX INFO: renamed from: b */
    public final gm6 f38342b;

    /* JADX INFO: renamed from: c */
    public final uk7 f38343c;

    public f35(lk0 lk0Var, gm6 gm6Var, uk7 uk7Var) {
        this.f38341a = lk0Var;
        this.f38342b = gm6Var;
        this.f38343c = uk7Var;
    }

    /* JADX INFO: renamed from: a */
    public static f35 m11518a(f35 f35Var, lk0 lk0Var, gm6 gm6Var, uk7 uk7Var, int i) {
        if ((i & 1) != 0) {
            lk0Var = f35Var.f38341a;
        }
        if ((i & 2) != 0) {
            gm6Var = f35Var.f38342b;
        }
        if ((i & 4) != 0) {
            uk7Var = f35Var.f38343c;
        }
        f35Var.getClass();
        lk0Var.getClass();
        gm6Var.getClass();
        uk7Var.getClass();
        return new f35(lk0Var, gm6Var, uk7Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f35)) {
            return false;
        }
        f35 f35Var = (f35) obj;
        return fa4.m11650l(this.f38341a, f35Var.f38341a) && fa4.m11650l(this.f38342b, f35Var.f38342b) && fa4.m11650l(this.f38343c, f35Var.f38343c);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f38343c.f64023a) + ((this.f38342b.hashCode() + (this.f38341a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LessonInfoDialogsState(buyPremiumDialog=" + this.f38341a + ", notEnoughBalanceDialog=" + this.f38342b + ", privateLessonLikeDialog=" + this.f38343c + ")";
    }
}
