package p000;

import com.lingq.core.domain.model.status.TokenStatus;

/* JADX INFO: loaded from: classes3.dex */
public final class lt7 extends pt7 {

    /* JADX INFO: renamed from: a */
    public final String f50115a;

    /* JADX INFO: renamed from: b */
    public final TokenStatus f50116b;

    public lt7(String str, TokenStatus tokenStatus) {
        str.getClass();
        tokenStatus.getClass();
        this.f50115a = str;
        this.f50116b = tokenStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt7)) {
            return false;
        }
        lt7 lt7Var = (lt7) obj;
        return fa4.m11650l(this.f50115a, lt7Var.f50115a) && this.f50116b == lt7Var.f50116b;
    }

    public final int hashCode() {
        return this.f50116b.hashCode() + (this.f50115a.hashCode() * 31);
    }

    public final String toString() {
        return "VocabularyStatusChange(term=" + this.f50115a + ", status=" + this.f50116b + ")";
    }
}
