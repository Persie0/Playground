package p159hi;

import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: hi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6052c implements InterfaceC6053d {

    /* JADX INFO: renamed from: a */
    public final String f35735a;

    /* JADX INFO: renamed from: b */
    public final List<TokenMeaning> f35736b;

    /* JADX INFO: renamed from: c */
    public final List<String> f35737c;

    /* JADX INFO: renamed from: d */
    public final List<String> f35738d;

    /* JADX INFO: renamed from: e */
    public final boolean f35739e;

    /* JADX INFO: renamed from: f */
    public final int f35740f;

    /* JADX INFO: renamed from: g */
    public final Integer f35741g;

    /* JADX INFO: renamed from: h */
    public final String f35742h;

    public C6052c(String str, List<TokenMeaning> list, List<String> list2, List<String> list3, boolean z10, int i10, Integer num, String str2) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        this.f35735a = str;
        this.f35736b = list;
        this.f35737c = list2;
        this.f35738d = list3;
        this.f35739e = z10;
        this.f35740f = i10;
        this.f35741g = num;
        this.f35742h = str2;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> mo12496a() {
        return this.f35736b;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: b */
    public final List<String> mo12497b() {
        return this.f35737c;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: c */
    public final String mo12498c() {
        return this.f35735a;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: d */
    public final List<String> mo12499d() {
        return this.f35738d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6052c)) {
            return false;
        }
        C6052c c6052c = (C6052c) obj;
        return C5207g.m11106a(this.f35735a, c6052c.f35735a) && C5207g.m11106a(this.f35736b, c6052c.f35736b) && C5207g.m11106a(this.f35737c, c6052c.f35737c) && C5207g.m11106a(this.f35738d, c6052c.f35738d) && this.f35739e == c6052c.f35739e && this.f35740f == c6052c.f35740f && C5207g.m11106a(this.f35741g, c6052c.f35741g) && C5207g.m11106a(this.f35742h, c6052c.f35742h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f35738d, C0204c.m848g(this.f35737c, C0204c.m848g(this.f35736b, this.f35735a.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.f35739e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d = C0009a.m16d(this.f35740f, (iM848g + r10) * 31, 31);
        int iHashCode = 0;
        Integer num = this.f35741g;
        int iHashCode2 = (iM16d + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f35742h;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "LessonTextCard(term=" + this.f35735a + ", meanings=" + this.f35736b + ", tags=" + this.f35737c + ", gTags=" + this.f35738d + ", isPhrase=" + this.f35739e + ", status=" + this.f35740f + ", extendedStatus=" + this.f35741g + ", srsDueDate=" + this.f35742h + ")";
    }
}
