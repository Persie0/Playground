package ne;

import android.support.v4.media.session.C0166e;

/* JADX INFO: renamed from: ne.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7765v extends AbstractC7743b0.e.AbstractC10663e {

    /* JADX INFO: renamed from: a */
    public final int f42665a;

    /* JADX INFO: renamed from: b */
    public final String f42666b;

    /* JADX INFO: renamed from: c */
    public final String f42667c;

    /* JADX INFO: renamed from: d */
    public final boolean f42668d;

    /* JADX INFO: renamed from: ne.v$a */
    public static final class a extends AbstractC7743b0.e.AbstractC10663e.a {

        /* JADX INFO: renamed from: a */
        public Integer f42669a;

        /* JADX INFO: renamed from: b */
        public String f42670b;

        /* JADX INFO: renamed from: c */
        public String f42671c;

        /* JADX INFO: renamed from: d */
        public Boolean f42672d;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public final C7765v m15471a() {
            String strM765k = this.f42669a == null ? " platform" : "";
            if (this.f42670b == null) {
                strM765k = strM765k.concat(" version");
            }
            if (this.f42671c == null) {
                strM765k = C0166e.m765k(strM765k, " buildVersion");
            }
            if (this.f42672d == null) {
                strM765k = C0166e.m765k(strM765k, " jailbroken");
            }
            if (strM765k.isEmpty()) {
                return new C7765v(this.f42669a.intValue(), this.f42670b, this.f42671c, this.f42672d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strM765k));
        }
    }

    public C7765v(int i10, String str, String str2, boolean z10) {
        this.f42665a = i10;
        this.f42666b = str;
        this.f42667c = str2;
        this.f42668d = z10;
    }

    @Override // ne.AbstractC7743b0.e.AbstractC10663e
    /* JADX INFO: renamed from: a */
    public final String mo15440a() {
        return this.f42667c;
    }

    @Override // ne.AbstractC7743b0.e.AbstractC10663e
    /* JADX INFO: renamed from: b */
    public final int mo15441b() {
        return this.f42665a;
    }

    @Override // ne.AbstractC7743b0.e.AbstractC10663e
    /* JADX INFO: renamed from: c */
    public final String mo15442c() {
        return this.f42666b;
    }

    @Override // ne.AbstractC7743b0.e.AbstractC10663e
    /* JADX INFO: renamed from: d */
    public final boolean mo15443d() {
        return this.f42668d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.e.AbstractC10663e)) {
            return false;
        }
        AbstractC7743b0.e.AbstractC10663e abstractC10663e = (AbstractC7743b0.e.AbstractC10663e) obj;
        return this.f42665a == abstractC10663e.mo15441b() && this.f42666b.equals(abstractC10663e.mo15442c()) && this.f42667c.equals(abstractC10663e.mo15440a()) && this.f42668d == abstractC10663e.mo15443d();
    }

    public final int hashCode() {
        return ((((((this.f42665a ^ 1000003) * 1000003) ^ this.f42666b.hashCode()) * 1000003) ^ this.f42667c.hashCode()) * 1000003) ^ (this.f42668d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OperatingSystem{platform=");
        sb2.append(this.f42665a);
        sb2.append(", version=");
        sb2.append(this.f42666b);
        sb2.append(", buildVersion=");
        sb2.append(this.f42667c);
        sb2.append(", jailbroken=");
        return C0166e.m769p(sb2, this.f42668d, "}");
    }
}
