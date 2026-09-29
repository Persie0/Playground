package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e1b {

    /* JADX INFO: renamed from: a */
    public final List f36582a;

    /* JADX INFO: renamed from: b */
    public final vs3 f36583b;

    public e1b(List list, vs3 vs3Var) {
        list.getClass();
        vs3Var.getClass();
        this.f36582a = list;
        this.f36583b = vs3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1b)) {
            return false;
        }
        e1b e1bVar = (e1b) obj;
        return fa4.m11650l(this.f36582a, e1bVar.f36582a) && fa4.m11650l(this.f36583b, e1bVar.f36583b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f36583b.hashCode() + (this.f36582a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VocabularyScreenState(tokens=" + this.f36582a + ", colorScheme=" + this.f36583b + ", showContinue=true)";
    }
}
