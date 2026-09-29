package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wn2 implements aoa {

    /* JADX INFO: renamed from: a */
    public final t66 f67091a;

    public wn2(t66 t66Var) {
        this.f67091a = t66Var;
    }

    @Override // p000.aoa
    /* JADX INFO: renamed from: a */
    public final Object mo367a(l77 l77Var) {
        return ((xc9) this.f67091a).getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn2) && this.f67091a == ((wn2) obj).f67091a;
    }

    public final int hashCode() {
        return this.f67091a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f67091a + ')';
    }
}
