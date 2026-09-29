package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7749f extends AbstractC7743b0.d {

    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.d.a> f42547a;

    /* JADX INFO: renamed from: b */
    public final String f42548b;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7749f() {
        throw null;
    }

    public C7749f(C7745c0 c7745c0, String str) {
        this.f42547a = c7745c0;
        this.f42548b = str;
    }

    @Override // ne.AbstractC7743b0.d
    /* JADX INFO: renamed from: a */
    public final C7745c0<AbstractC7743b0.d.a> mo15364a() {
        return this.f42547a;
    }

    @Override // ne.AbstractC7743b0.d
    /* JADX INFO: renamed from: b */
    public final String mo15365b() {
        return this.f42548b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC7743b0.d)) {
            return false;
        }
        AbstractC7743b0.d dVar = (AbstractC7743b0.d) obj;
        if (this.f42547a.equals(dVar.mo15364a())) {
            String str = this.f42548b;
            if (str == null) {
                if (dVar.mo15365b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.mo15365b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f42547a.hashCode() ^ 1000003) * 1000003;
        String str = this.f42548b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f42547a);
        sb2.append(", orgId=");
        return C0009a.m23l(sb2, this.f42548b, "}");
    }
}
