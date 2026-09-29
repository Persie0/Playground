package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7748e extends AbstractC7743b0.c {

    /* JADX INFO: renamed from: a */
    public final String f42545a;

    /* JADX INFO: renamed from: b */
    public final String f42546b;

    public C7748e(String str, String str2) {
        this.f42545a = str;
        this.f42546b = str2;
    }

    @Override // ne.AbstractC7743b0.c
    /* JADX INFO: renamed from: a */
    public final String mo15362a() {
        return this.f42545a;
    }

    @Override // ne.AbstractC7743b0.c
    /* JADX INFO: renamed from: b */
    public final String mo15363b() {
        return this.f42546b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.c)) {
            return false;
        }
        AbstractC7743b0.c cVar = (AbstractC7743b0.c) obj;
        return this.f42545a.equals(cVar.mo15362a()) && this.f42546b.equals(cVar.mo15363b());
    }

    public final int hashCode() {
        return ((this.f42545a.hashCode() ^ 1000003) * 1000003) ^ this.f42546b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f42545a);
        sb2.append(", value=");
        return C0009a.m23l(sb2, this.f42546b, "}");
    }
}
