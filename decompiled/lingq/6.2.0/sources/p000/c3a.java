package p000;

import com.lingq.core.token.TokenPopupData;

/* JADX INFO: loaded from: classes2.dex */
public final class c3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenPopupData f9427a;

    /* JADX INFO: renamed from: b */
    public final boolean f9428b;

    public c3a(TokenPopupData tokenPopupData, boolean z) {
        this.f9427a = tokenPopupData;
        this.f9428b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3a)) {
            return false;
        }
        c3a c3aVar = (c3a) obj;
        return fa4.m11650l(this.f9427a, c3aVar.f9427a) && this.f9428b == c3aVar.f9428b;
    }

    public final int hashCode() {
        TokenPopupData tokenPopupData = this.f9427a;
        return Boolean.hashCode(this.f9428b) + ((tokenPopupData == null ? 0 : tokenPopupData.hashCode()) * 31);
    }

    public final String toString() {
        return "SetTokenData(tokenPopupData=" + this.f9427a + ", fromChat=" + this.f9428b + ")";
    }
}
