package p000;

/* JADX INFO: loaded from: classes.dex */
public final class t94 implements s94 {

    /* JADX INFO: renamed from: a */
    public final s94 f62010a;

    public t94(s94 s94Var) {
        this.f62010a = s94Var;
    }

    /* JADX INFO: renamed from: a */
    public static t94 m21902a(s94 s94Var) {
        if (s94Var instanceof c22) {
            return ((c22) s94Var).f9348a;
        }
        if (s94Var instanceof t94) {
            return (t94) s94Var;
        }
        if (s94Var == null) {
            return null;
        }
        return new t94(s94Var);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t94) {
            return this.f62010a.equals(((t94) obj).f62010a);
        }
        return false;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f62010a.estimateParsedLength();
    }

    public final int hashCode() {
        return this.f62010a.hashCode();
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        return this.f62010a.parseInto(b22Var, charSequence, i);
    }
}
