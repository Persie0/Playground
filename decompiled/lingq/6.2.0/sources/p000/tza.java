package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class tza {

    /* JADX INFO: renamed from: a */
    public final g43 f63152a;

    public tza(g43 g43Var) {
        this.f63152a = g43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tza) && fa4.m11650l(this.f63152a, ((tza) obj).f63152a);
    }

    public final int hashCode() {
        g43 g43Var = this.f63152a;
        if (g43Var == null) {
            return 0;
        }
        return g43Var.hashCode();
    }

    public final String toString() {
        return "VocabularyFilterSheetState(selectionPage=" + this.f63152a + ")";
    }
}
