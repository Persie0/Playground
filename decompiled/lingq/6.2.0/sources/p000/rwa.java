package p000;

import com.lingq.feature.vocabulary.data.VocabularyContentFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class rwa extends fxa {

    /* JADX INFO: renamed from: a */
    public final VocabularyContentFilter f59981a;

    public rwa(VocabularyContentFilter vocabularyContentFilter) {
        vocabularyContentFilter.getClass();
        this.f59981a = vocabularyContentFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rwa) && this.f59981a == ((rwa) obj).f59981a;
    }

    public final int hashCode() {
        return this.f59981a.hashCode();
    }

    public final String toString() {
        return "OnContentFilterChanged(filter=" + this.f59981a + ")";
    }
}
