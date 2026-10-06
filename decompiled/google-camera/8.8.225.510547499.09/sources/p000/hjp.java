package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjp {

    /* JADX INFO: renamed from: a */
    int f28055a = 1;

    /* JADX INFO: renamed from: b */
    private final hjr f28056b;

    /* JADX INFO: renamed from: c */
    private hjr f28057c;

    /* JADX INFO: renamed from: d */
    private final boolean f28058d;

    public hjp(hjr hjrVar, boolean z) {
        this.f28057c = hjrVar;
        this.f28056b = hjrVar;
        this.f28058d = z;
    }

    /* JADX INFO: renamed from: a */
    public final hjr m10386a() {
        if (this.f28055a != 2) {
            return null;
        }
        return this.f28057c;
    }

    /* JADX INFO: renamed from: b */
    public final void m10387b() {
        lku.m15613H(this.f28055a == 3);
        this.f28057c = this.f28056b;
    }

    /* JADX INFO: renamed from: c */
    public final void m10388c() {
        if (this.f28055a == 3) {
            if (!this.f28058d) {
                this.f28057c = this.f28056b;
            }
            hjr hjrVar = this.f28057c;
            lku.m15662p(hjrVar);
            hjrVar.mo5711f();
            this.f28055a = 2;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m10389d() {
        if (this.f28055a == 2) {
            hjr hjrVar = this.f28057c;
            lku.m15662p(hjrVar);
            hjrVar.mo5712g();
            this.f28055a = 3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m10390e() {
        hjr hjrVar = this.f28057c;
        hjrVar.getClass();
        hjrVar.mo5712g();
        this.f28057c = null;
    }

    /* JADX INFO: renamed from: f */
    public final void m10391f() {
        this.f28055a = 3;
    }

    /* JADX INFO: renamed from: g */
    public final void m10392g(hjr hjrVar) {
        hjrVar.getClass();
        lku.m15614I(this.f28057c == null, "Setting new state without first exiting current state");
        if (this.f28055a == 1) {
            this.f28055a = 2;
        }
        this.f28057c = hjrVar;
        hjrVar.mo5711f();
    }
}
