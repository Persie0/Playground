package p000;

import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final class pf2 {

    /* JADX INFO: renamed from: a */
    public final DictionaryData f56050a;

    /* JADX INFO: renamed from: b */
    public final boolean f56051b;

    public pf2(DictionaryData dictionaryData, boolean z) {
        dictionaryData.getClass();
        this.f56050a = dictionaryData;
        this.f56051b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf2)) {
            return false;
        }
        pf2 pf2Var = (pf2) obj;
        return fa4.m11650l(this.f56050a, pf2Var.f56050a) && this.f56051b == pf2Var.f56051b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f56051b) + (this.f56050a.hashCode() * 31);
    }

    public final String toString() {
        return "DictionaryItem(dictionaryData=" + this.f56050a + ", showLocale=" + this.f56051b + ")";
    }
}
