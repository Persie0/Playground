package ne;

import ie.C6323d;

/* JADX INFO: renamed from: ne.y */
/* JADX INFO: loaded from: classes.dex */
public final class C7768y extends AbstractC7747d0.a {

    /* JADX INFO: renamed from: a */
    public final String f42677a;

    /* JADX INFO: renamed from: b */
    public final String f42678b;

    /* JADX INFO: renamed from: c */
    public final String f42679c;

    /* JADX INFO: renamed from: d */
    public final String f42680d;

    /* JADX INFO: renamed from: e */
    public final int f42681e;

    /* JADX INFO: renamed from: f */
    public final C6323d f42682f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7768y(String str, String str2, String str3, String str4, int i10, C6323d c6323d) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f42677a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f42678b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f42679c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f42680d = str4;
        this.f42681e = i10;
        if (c6323d == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f42682f = c6323d;
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: a */
    public final String mo15449a() {
        return this.f42677a;
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: b */
    public final int mo15450b() {
        return this.f42681e;
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: c */
    public final C6323d mo15451c() {
        return this.f42682f;
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: d */
    public final String mo15452d() {
        return this.f42680d;
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: e */
    public final String mo15453e() {
        return this.f42678b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7747d0.a)) {
            return false;
        }
        AbstractC7747d0.a aVar = (AbstractC7747d0.a) obj;
        return this.f42677a.equals(aVar.mo15449a()) && this.f42678b.equals(aVar.mo15453e()) && this.f42679c.equals(aVar.mo15454f()) && this.f42680d.equals(aVar.mo15452d()) && this.f42681e == aVar.mo15450b() && this.f42682f.equals(aVar.mo15451c());
    }

    @Override // ne.AbstractC7747d0.a
    /* JADX INFO: renamed from: f */
    public final String mo15454f() {
        return this.f42679c;
    }

    public final int hashCode() {
        return ((((((((((this.f42677a.hashCode() ^ 1000003) * 1000003) ^ this.f42678b.hashCode()) * 1000003) ^ this.f42679c.hashCode()) * 1000003) ^ this.f42680d.hashCode()) * 1000003) ^ this.f42681e) * 1000003) ^ this.f42682f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f42677a + ", versionCode=" + this.f42678b + ", versionName=" + this.f42679c + ", installUuid=" + this.f42680d + ", deliveryMechanism=" + this.f42681e + ", developmentPlatformProvider=" + this.f42682f + "}";
    }
}
