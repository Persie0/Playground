package p000;

import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.token.TokenPopupAnchor;

/* JADX INFO: loaded from: classes2.dex */
public final class d3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenMeaning f34970a;

    /* JADX INFO: renamed from: b */
    public final TokenPopupAnchor f34971b;

    public d3a(TokenMeaning tokenMeaning, TokenPopupAnchor tokenPopupAnchor) {
        tokenMeaning.getClass();
        tokenPopupAnchor.getClass();
        this.f34970a = tokenMeaning;
        this.f34971b = tokenPopupAnchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3a)) {
            return false;
        }
        d3a d3aVar = (d3a) obj;
        return fa4.m11650l(this.f34970a, d3aVar.f34970a) && this.f34971b == d3aVar.f34971b;
    }

    public final int hashCode() {
        return this.f34971b.hashCode() + (this.f34970a.hashCode() * 31);
    }

    public final String toString() {
        return "TapCollapsedToEdit(meaning=" + this.f34970a + ", anchor=" + this.f34971b + ")";
    }
}
