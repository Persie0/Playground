package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.w */
/* JADX INFO: loaded from: classes.dex */
public final class C7766w extends AbstractC7743b0.e.f {

    /* JADX INFO: renamed from: a */
    public final String f42673a;

    public C7766w(String str) {
        this.f42673a = str;
    }

    @Override // ne.AbstractC7743b0.e.f
    /* JADX INFO: renamed from: a */
    public final String mo15444a() {
        return this.f42673a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7743b0.e.f) {
            return this.f42673a.equals(((AbstractC7743b0.e.f) obj).mo15444a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f42673a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("User{identifier="), this.f42673a, "}");
    }
}
