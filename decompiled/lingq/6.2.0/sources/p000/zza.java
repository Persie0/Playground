package p000;

import com.lingq.feature.vocabulary.data.VocabularyContentFilter;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class zza {

    /* JADX INFO: renamed from: a */
    public final VocabularyContentFilter f72434a;

    /* JADX INFO: renamed from: b */
    public final Pair f72435b;

    /* JADX INFO: renamed from: c */
    public final int f72436c;

    public zza(VocabularyContentFilter vocabularyContentFilter, Pair pair, int i) {
        vocabularyContentFilter.getClass();
        this.f72434a = vocabularyContentFilter;
        this.f72435b = pair;
        this.f72436c = i;
    }

    /* JADX INFO: renamed from: a */
    public static zza m25902a(zza zzaVar, VocabularyContentFilter vocabularyContentFilter, Pair pair, int i, int i2) {
        if ((i2 & 1) != 0) {
            vocabularyContentFilter = zzaVar.f72434a;
        }
        if ((i2 & 2) != 0) {
            pair = zzaVar.f72435b;
        }
        if ((i2 & 4) != 0) {
            i = zzaVar.f72436c;
        }
        zzaVar.getClass();
        vocabularyContentFilter.getClass();
        return new zza(vocabularyContentFilter, pair, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza zzaVar = (zza) obj;
        return this.f72434a == zzaVar.f72434a && this.f72435b.equals(zzaVar.f72435b) && this.f72436c == zzaVar.f72436c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72436c) + ((this.f72435b.hashCode() + (this.f72434a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VocabularyFilterState(selectedContent=");
        sb.append(this.f72434a);
        sb.append(", statuses=");
        sb.append(this.f72435b);
        sb.append(", numberOfCards=");
        return wq1.m24123s(sb, this.f72436c, ")");
    }
}
