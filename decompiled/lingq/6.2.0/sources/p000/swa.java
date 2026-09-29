package p000;

import com.lingq.feature.vocabulary.data.VocabularyContentFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class swa extends fxa {

    /* JADX INFO: renamed from: a */
    public final VocabularyContentFilter f61522a;

    public swa(VocabularyContentFilter vocabularyContentFilter) {
        vocabularyContentFilter.getClass();
        this.f61522a = vocabularyContentFilter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swa) && this.f61522a == ((swa) obj).f61522a;
    }

    public final int hashCode() {
        return this.f61522a.hashCode();
    }

    public final String toString() {
        return "OnDeepLinkFilterChanged(filter=" + this.f61522a + ")";
    }
}
