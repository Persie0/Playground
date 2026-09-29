package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class a44 {

    /* JADX INFO: renamed from: a */
    public final long f208a;

    /* JADX INFO: renamed from: b */
    public final long f209b;

    /* JADX INFO: renamed from: c */
    public final long f210c;

    /* JADX INFO: renamed from: d */
    public final boolean f211d;

    /* JADX INFO: renamed from: e */
    public final float f212e;

    /* JADX INFO: renamed from: f */
    public final long f213f;

    /* JADX INFO: renamed from: g */
    public final long f214g;

    /* JADX INFO: renamed from: h */
    public final boolean f215h;

    /* JADX INFO: renamed from: i */
    public boolean f216i;

    public a44(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2) {
        this.f208a = j;
        this.f209b = j2;
        this.f210c = j3;
        this.f211d = z;
        this.f212e = f;
        this.f213f = j4;
        this.f214g = j5;
        this.f215h = z2;
    }

    /* JADX INFO: renamed from: a */
    public final void m101a() {
        this.f216i = true;
    }

    /* JADX INFO: renamed from: b */
    public final long m102b() {
        return this.f208a;
    }

    /* JADX INFO: renamed from: c */
    public final long m103c() {
        return this.f210c;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m104d() {
        return this.f211d;
    }

    /* JADX INFO: renamed from: e */
    public final long m105e() {
        return this.f214g;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m106f() {
        return this.f215h;
    }

    /* JADX INFO: renamed from: g */
    public final long m107g() {
        return this.f209b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m108h() {
        return this.f216i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndirectPointerInputChange(id=");
        sb.append((Object) pk9.m19382y(this.f208a));
        sb.append(", uptimeMillis=");
        sb.append(this.f209b);
        sb.append(", position=");
        sb.append((Object) gq6.m12827h(this.f210c));
        sb.append(", pressed=");
        sb.append(this.f211d);
        sb.append(", pressure=");
        sb.append(this.f212e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f213f);
        sb.append(", previousPosition=");
        sb.append((Object) gq6.m12827h(this.f214g));
        sb.append(", previousPressed=");
        sb.append(this.f215h);
        sb.append(", isConsumed=");
        return ux5.m22993p(sb, this.f216i, ')');
    }
}
