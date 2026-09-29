package p000;

import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final class se2 extends ue2 {

    /* JADX INFO: renamed from: a */
    public final DictionaryData f60732a;

    public se2(DictionaryData dictionaryData) {
        dictionaryData.getClass();
        this.f60732a = dictionaryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se2) && fa4.m11650l(this.f60732a, ((se2) obj).f60732a);
    }

    public final int hashCode() {
        return this.f60732a.hashCode();
    }

    public final String toString() {
        return "AvailableDictionary(dictionary=" + this.f60732a + ")";
    }
}
