package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b5a {

    /* JADX INFO: renamed from: a */
    public final String f7976a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f7977b;

    public b5a(String str, ArrayList arrayList) {
        this.f7976a = str;
        this.f7977b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b5a)) {
            return false;
        }
        b5a b5aVar = (b5a) obj;
        return this.f7976a.equals(b5aVar.f7976a) && this.f7977b.equals(b5aVar.f7977b);
    }

    public final int hashCode() {
        return this.f7977b.hashCode() + (this.f7976a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenRelatedPhrasesEntity(termWithLanguage=" + this.f7976a + ", relatedPhrases=" + this.f7977b + ")";
    }
}
