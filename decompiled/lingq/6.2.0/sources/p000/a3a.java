package p000;

import com.lingq.core.domain.model.token.TokenRelatedPhrase;

/* JADX INFO: loaded from: classes2.dex */
public final class a3a implements j3a {

    /* JADX INFO: renamed from: a */
    public final TokenRelatedPhrase f183a;

    /* JADX INFO: renamed from: b */
    public final int f184b;

    /* JADX INFO: renamed from: c */
    public final int f185c;

    /* JADX INFO: renamed from: d */
    public final int f186d;

    /* JADX INFO: renamed from: e */
    public final int f187e;

    public a3a(TokenRelatedPhrase tokenRelatedPhrase, int i, int i2, int i3, int i4) {
        tokenRelatedPhrase.getClass();
        this.f183a = tokenRelatedPhrase;
        this.f184b = i;
        this.f185c = i2;
        this.f186d = i3;
        this.f187e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3a)) {
            return false;
        }
        a3a a3aVar = (a3a) obj;
        return fa4.m11650l(this.f183a, a3aVar.f183a) && this.f184b == a3aVar.f184b && this.f185c == a3aVar.f185c && this.f186d == a3aVar.f186d && this.f187e == a3aVar.f187e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f187e) + wq1.m24106b(this.f186d, wq1.m24106b(this.f185c, wq1.m24106b(this.f184b, this.f183a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectRelatedPhrase(phrase=");
        sb.append(this.f183a);
        sb.append(", rectTop=");
        sb.append(this.f184b);
        sb.append(", rectBottom=");
        hn1.m13360j(this.f185c, this.f186d, ", rectStart=", ", rectEnd=", sb);
        return wq1.m24123s(sb, this.f187e, ")");
    }
}
