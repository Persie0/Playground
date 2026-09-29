package ne;

import p003a2.C0009a;

/* JADX INFO: renamed from: ne.u */
/* JADX INFO: loaded from: classes.dex */
public final class C7764u extends AbstractC7743b0.e.d.AbstractC10662d {

    /* JADX INFO: renamed from: a */
    public final String f42664a;

    public C7764u(String str) {
        this.f42664a = str;
    }

    @Override // ne.AbstractC7743b0.e.d.AbstractC10662d
    /* JADX INFO: renamed from: a */
    public final String mo15439a() {
        return this.f42664a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC7743b0.e.d.AbstractC10662d) {
            return this.f42664a.equals(((AbstractC7743b0.e.d.AbstractC10662d) obj).mo15439a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f42664a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0009a.m23l(new StringBuilder("Log{content="), this.f42664a, "}");
    }
}
