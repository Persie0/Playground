package p000;

import com.lingq.core.domain.model.token.TokenRelatedPhrase;

/* JADX INFO: loaded from: classes3.dex */
public final class bs7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final TokenRelatedPhrase f8947a;

    /* JADX INFO: renamed from: b */
    public final boolean f8948b;

    public bs7(TokenRelatedPhrase tokenRelatedPhrase, boolean z) {
        tokenRelatedPhrase.getClass();
        this.f8947a = tokenRelatedPhrase;
        this.f8948b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs7)) {
            return false;
        }
        bs7 bs7Var = (bs7) obj;
        return fa4.m11650l(this.f8947a, bs7Var.f8947a) && this.f8948b == bs7Var.f8948b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8948b) + (this.f8947a.hashCode() * 31);
    }

    public final String toString() {
        return "HighlightRelatedPhrase(phrase=" + this.f8947a + ", isSelected=" + this.f8948b + ")";
    }
}
