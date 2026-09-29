package p000;

import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h5a {

    /* JADX INFO: renamed from: a */
    public final List f41816a;

    /* JADX INFO: renamed from: b */
    public final TokenMeaning f41817b;

    /* JADX INFO: renamed from: c */
    public final List f41818c;

    /* JADX INFO: renamed from: d */
    public final String f41819d;

    /* JADX INFO: renamed from: e */
    public final List f41820e;

    public h5a(List list, TokenMeaning tokenMeaning, List list2, String str, List list3) {
        list.getClass();
        list2.getClass();
        str.getClass();
        list3.getClass();
        this.f41816a = list;
        this.f41817b = tokenMeaning;
        this.f41818c = list2;
        this.f41819d = str;
        this.f41820e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5a)) {
            return false;
        }
        h5a h5aVar = (h5a) obj;
        return fa4.m11650l(this.f41816a, h5aVar.f41816a) && fa4.m11650l(this.f41817b, h5aVar.f41817b) && fa4.m11650l(this.f41818c, h5aVar.f41818c) && fa4.m11650l(this.f41819d, h5aVar.f41819d) && fa4.m11650l(this.f41820e, h5aVar.f41820e);
    }

    public final int hashCode() {
        int iHashCode = this.f41816a.hashCode() * 31;
        TokenMeaning tokenMeaning = this.f41817b;
        return this.f41820e.hashCode() + ux5.m22980c(ux5.m22979b((iHashCode + (tokenMeaning == null ? 0 : tokenMeaning.hashCode())) * 31, 31, this.f41818c), this.f41819d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiStateMeanings(wordMeanings=");
        sb.append(this.f41816a);
        sb.append(", translatedMeaning=");
        sb.append(this.f41817b);
        sb.append(", popularMeanings=");
        wq1.m24130z(", popularLocale=", this.f41819d, ", locales=", sb, this.f41818c);
        return hn1.m13356f(sb, this.f41820e, ")");
    }
}
