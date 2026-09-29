package p000;

import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final class re2 extends ue2 {

    /* JADX INFO: renamed from: a */
    public final DictionaryData f59155a;

    public re2(DictionaryData dictionaryData) {
        dictionaryData.getClass();
        this.f59155a = dictionaryData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re2) && fa4.m11650l(this.f59155a, ((re2) obj).f59155a);
    }

    public final int hashCode() {
        return this.f59155a.hashCode();
    }

    public final String toString() {
        return "ActiveDictionary(dictionary=" + this.f59155a + ")";
    }
}
