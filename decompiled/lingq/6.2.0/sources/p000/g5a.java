package p000;

import com.lingq.core.token.TokenPopupData;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g5a {

    /* JADX INFO: renamed from: a */
    public final String f40250a;

    /* JADX INFO: renamed from: b */
    public final List f40251b;

    /* JADX INFO: renamed from: c */
    public final TokenPopupData f40252c;

    /* JADX INFO: renamed from: d */
    public final String f40253d;

    public g5a(String str, List list, TokenPopupData tokenPopupData, String str2) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.f40250a = str;
        this.f40251b = list;
        this.f40252c = tokenPopupData;
        this.f40253d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5a)) {
            return false;
        }
        g5a g5aVar = (g5a) obj;
        return fa4.m11650l(this.f40250a, g5aVar.f40250a) && fa4.m11650l(this.f40251b, g5aVar.f40251b) && fa4.m11650l(this.f40252c, g5aVar.f40252c) && fa4.m11650l(this.f40253d, g5aVar.f40253d);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(this.f40250a.hashCode() * 31, 31, this.f40251b);
        TokenPopupData tokenPopupData = this.f40252c;
        return this.f40253d.hashCode() + ((iM22979b + (tokenPopupData == null ? 0 : tokenPopupData.hashCode())) * 31);
    }

    public final String toString() {
        return "UiStateToken(language=" + this.f40250a + ", locales=" + this.f40251b + ", data=" + this.f40252c + ", popularLocale=" + this.f40253d + ")";
    }
}
