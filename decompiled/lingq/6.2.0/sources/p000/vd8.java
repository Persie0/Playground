package p000;

import com.lingq.core.token.TokenPopupData;

/* JADX INFO: loaded from: classes3.dex */
public final class vd8 extends xd8 {

    /* JADX INFO: renamed from: a */
    public final TokenPopupData f65242a;

    public vd8(TokenPopupData tokenPopupData) {
        this.f65242a = tokenPopupData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vd8) && this.f65242a.equals(((vd8) obj).f65242a);
    }

    public final int hashCode() {
        return this.f65242a.hashCode();
    }

    public final String toString() {
        return "OpenTokenPopup(tokenPopupData=" + this.f65242a + ")";
    }
}
