package li;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: li.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7378e implements InterfaceC7379f {

    /* JADX INFO: renamed from: a */
    public final String f41167a;

    /* JADX INFO: renamed from: b */
    public final boolean f41168b;

    /* JADX INFO: renamed from: c */
    public final List<String> f41169c;

    /* JADX INFO: renamed from: d */
    public final List<String> f41170d;

    /* JADX INFO: renamed from: e */
    public final List<TokenMeaning> f41171e;

    /* JADX INFO: renamed from: f */
    public final int f41172f;

    /* JADX INFO: renamed from: g */
    public final int f41173g;

    /* JADX INFO: renamed from: h */
    public final String f41174h;

    /* JADX INFO: renamed from: i */
    public final TokenReadings f41175i;

    public C7378e(String str, boolean z10, List<String> list, List<String> list2, List<TokenMeaning> list3, int i10, int i11, String str2, TokenReadings tokenReadings) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(list2, "gTags");
        C5207g.m11111f(str2, "status");
        this.f41167a = str;
        this.f41168b = z10;
        this.f41169c = list;
        this.f41170d = list2;
        this.f41171e = list3;
        this.f41172f = i10;
        this.f41173g = i11;
        this.f41174h = str2;
        this.f41175i = tokenReadings;
    }

    /* JADX INFO: renamed from: g */
    public static C7378e m14778g(C7378e c7378e, List list) {
        boolean z10 = c7378e.f41168b;
        int i10 = c7378e.f41172f;
        int i11 = c7378e.f41173g;
        TokenReadings tokenReadings = c7378e.f41175i;
        String str = c7378e.f41167a;
        C5207g.m11111f(str, "term");
        List<String> list2 = c7378e.f41169c;
        C5207g.m11111f(list2, "tags");
        List<String> list3 = c7378e.f41170d;
        C5207g.m11111f(list3, "gTags");
        String str2 = c7378e.f41174h;
        C5207g.m11111f(str2, "status");
        return new C7378e(str, z10, list2, list3, list, i10, i11, str2, tokenReadings);
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> mo14772a() {
        return this.f41171e;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: b */
    public final List<String> mo14773b() {
        return this.f41169c;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: c */
    public final String mo14774c() {
        return this.f41167a;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: d */
    public final List<String> mo14775d() {
        return this.f41170d;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: e */
    public final boolean mo14776e() {
        return this.f41168b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7378e)) {
            return false;
        }
        C7378e c7378e = (C7378e) obj;
        return C5207g.m11106a(this.f41167a, c7378e.f41167a) && this.f41168b == c7378e.f41168b && C5207g.m11106a(this.f41169c, c7378e.f41169c) && C5207g.m11106a(this.f41170d, c7378e.f41170d) && C5207g.m11106a(this.f41171e, c7378e.f41171e) && this.f41172f == c7378e.f41172f && this.f41173g == c7378e.f41173g && C5207g.m11106a(this.f41174h, c7378e.f41174h) && C5207g.m11106a(this.f41175i, c7378e.f41175i);
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: f */
    public final int mo14777f() {
        return this.f41172f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    public final int hashCode() {
        int iHashCode = this.f41167a.hashCode() * 31;
        boolean z10 = this.f41168b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d = C0166e.m758d(this.f41174h, C0009a.m16d(this.f41173g, C0009a.m16d(this.f41172f, C0204c.m848g(this.f41171e, C0204c.m848g(this.f41170d, C0204c.m848g(this.f41169c, (iHashCode + r10) * 31, 31), 31), 31), 31), 31), 31);
        TokenReadings tokenReadings = this.f41175i;
        return iM758d + (tokenReadings == null ? 0 : tokenReadings.hashCode());
    }

    public final String toString() {
        return "TokenWord(term=" + this.f41167a + ", isPhrase=" + this.f41168b + ", tags=" + this.f41169c + ", gTags=" + this.f41170d + ", meanings=" + this.f41171e + ", importance=" + this.f41172f + ", id=" + this.f41173g + ", status=" + this.f41174h + ", readings=" + this.f41175i + ")";
    }
}
