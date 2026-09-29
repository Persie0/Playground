package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ipa implements InterfaceC3190kn {

    /* JADX INFO: renamed from: a */
    public final String f44410a;

    public ipa(String str) {
        this.f44410a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ipa) {
            return this.f44410a.equals(((ipa) obj).f44410a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f44410a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f44410a, ')');
    }
}
