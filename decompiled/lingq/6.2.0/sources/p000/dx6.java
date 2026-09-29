package p000;

/* JADX INFO: loaded from: classes.dex */
public final class dx6 {

    /* JADX INFO: renamed from: a */
    public final ui3 f36368a;

    /* JADX INFO: renamed from: b */
    public final vi3 f36369b;

    /* JADX INFO: renamed from: c */
    public final ui3 f36370c;

    /* JADX INFO: renamed from: d */
    public final ui3 f36371d;

    /* JADX INFO: renamed from: e */
    public final vi3 f36372e;

    /* JADX INFO: renamed from: f */
    public final vi3 f36373f;

    /* JADX INFO: renamed from: g */
    public final bj3 f36374g;

    /* JADX INFO: renamed from: h */
    public final ui3 f36375h;

    /* JADX INFO: renamed from: i */
    public final ui3 f36376i;

    public dx6(ui3 ui3Var, vi3 vi3Var, ui3 ui3Var2, ui3 ui3Var3, vi3 vi3Var2, vi3 vi3Var3, bj3 bj3Var, ui3 ui3Var4, ui3 ui3Var5) {
        ui3Var.getClass();
        vi3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        bj3Var.getClass();
        ui3Var4.getClass();
        ui3Var5.getClass();
        this.f36368a = ui3Var;
        this.f36369b = vi3Var;
        this.f36370c = ui3Var2;
        this.f36371d = ui3Var3;
        this.f36372e = vi3Var2;
        this.f36373f = vi3Var3;
        this.f36374g = bj3Var;
        this.f36375h = ui3Var4;
        this.f36376i = ui3Var5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx6)) {
            return false;
        }
        dx6 dx6Var = (dx6) obj;
        return fa4.m11650l(this.f36368a, dx6Var.f36368a) && fa4.m11650l(this.f36369b, dx6Var.f36369b) && fa4.m11650l(this.f36370c, dx6Var.f36370c) && fa4.m11650l(this.f36371d, dx6Var.f36371d) && fa4.m11650l(this.f36372e, dx6Var.f36372e) && fa4.m11650l(this.f36373f, dx6Var.f36373f) && fa4.m11650l(this.f36374g, dx6Var.f36374g) && fa4.m11650l(this.f36375h, dx6Var.f36375h) && fa4.m11650l(this.f36376i, dx6Var.f36376i);
    }

    public final int hashCode() {
        return this.f36376i.hashCode() + ((this.f36375h.hashCode() + ((this.f36374g.hashCode() + ((this.f36373f.hashCode() + ((this.f36372e.hashCode() + ((this.f36371d.hashCode() + ((this.f36370c.hashCode() + ((this.f36369b.hashCode() + (this.f36368a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OnboardingV2Callbacks(onNavigateToLogin=" + this.f36368a + ", onNavigateWeb=" + this.f36369b + ", onLaunchGoogleSignIn=" + this.f36370c + ", onLaunchFacebookSignIn=" + this.f36371d + ", onValidateEmail=" + this.f36372e + ", onValidateUsername=" + this.f36373f + ", onRegister=" + this.f36374g + ", onClearError=" + this.f36375h + ", onPersonalizingComplete=" + this.f36376i + ")";
    }
}
