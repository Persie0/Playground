package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7746d extends AbstractC7743b0.a.AbstractC10653a {

    /* JADX INFO: renamed from: a */
    public final String f42542a;

    /* JADX INFO: renamed from: b */
    public final String f42543b;

    /* JADX INFO: renamed from: c */
    public final String f42544c;

    public C7746d(String str, String str2, String str3) {
        this.f42542a = str;
        this.f42543b = str2;
        this.f42544c = str3;
    }

    @Override // ne.AbstractC7743b0.a.AbstractC10653a
    /* JADX INFO: renamed from: a */
    public final String mo15359a() {
        return this.f42542a;
    }

    @Override // ne.AbstractC7743b0.a.AbstractC10653a
    /* JADX INFO: renamed from: b */
    public final String mo15360b() {
        return this.f42544c;
    }

    @Override // ne.AbstractC7743b0.a.AbstractC10653a
    /* JADX INFO: renamed from: c */
    public final String mo15361c() {
        return this.f42543b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.a.AbstractC10653a)) {
            return false;
        }
        AbstractC7743b0.a.AbstractC10653a abstractC10653a = (AbstractC7743b0.a.AbstractC10653a) obj;
        return this.f42542a.equals(abstractC10653a.mo15359a()) && this.f42543b.equals(abstractC10653a.mo15361c()) && this.f42544c.equals(abstractC10653a.mo15360b());
    }

    public final int hashCode() {
        return ((((this.f42542a.hashCode() ^ 1000003) * 1000003) ^ this.f42543b.hashCode()) * 1000003) ^ this.f42544c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f42542a);
        sb2.append(", libraryName=");
        sb2.append(this.f42543b);
        sb2.append(", buildId=");
        return C0009a.m23l(sb2, this.f42544c, "}");
    }
}
