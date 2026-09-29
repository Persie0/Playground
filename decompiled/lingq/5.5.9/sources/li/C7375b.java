package li;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p003a2.C0009a;

/* JADX INFO: renamed from: li.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7375b implements InterfaceC7379f {

    /* JADX INFO: renamed from: a */
    public final String f41156a;

    /* JADX INFO: renamed from: b */
    public final List<TokenMeaning> f41157b;

    /* JADX INFO: renamed from: c */
    public final List<String> f41158c;

    /* JADX INFO: renamed from: d */
    public final List<String> f41159d;

    /* JADX INFO: renamed from: e */
    public final boolean f41160e;

    /* JADX INFO: renamed from: f */
    public final int f41161f;

    /* JADX INFO: renamed from: g */
    public final String f41162g;

    /* JADX INFO: renamed from: h */
    public final String f41163h;

    /* JADX INFO: renamed from: i */
    public final List<String> f41164i;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7375b() {
        throw null;
    }

    public C7375b(String str, List list, String str2, ArrayList arrayList) {
        EmptyList emptyList = EmptyList.f38032a;
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(emptyList, "tags");
        C5207g.m11111f(emptyList, "gTags");
        C5207g.m11111f(str2, "status");
        this.f41156a = str;
        this.f41157b = list;
        this.f41158c = emptyList;
        this.f41159d = emptyList;
        this.f41160e = true;
        this.f41161f = 0;
        this.f41162g = "";
        this.f41163h = str2;
        this.f41164i = arrayList;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> mo14772a() {
        return this.f41157b;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: b */
    public final List<String> mo14773b() {
        return this.f41158c;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: c */
    public final String mo14774c() {
        return this.f41156a;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: d */
    public final List<String> mo14775d() {
        return this.f41159d;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: e */
    public final boolean mo14776e() {
        return this.f41160e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7375b)) {
            return false;
        }
        C7375b c7375b = (C7375b) obj;
        return C5207g.m11106a(this.f41156a, c7375b.f41156a) && C5207g.m11106a(this.f41157b, c7375b.f41157b) && C5207g.m11106a(this.f41158c, c7375b.f41158c) && C5207g.m11106a(this.f41159d, c7375b.f41159d) && this.f41160e == c7375b.f41160e && this.f41161f == c7375b.f41161f && C5207g.m11106a(this.f41162g, c7375b.f41162g) && C5207g.m11106a(this.f41163h, c7375b.f41163h) && C5207g.m11106a(this.f41164i, c7375b.f41164i);
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: f */
    public final int mo14777f() {
        return this.f41161f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f41159d, C0204c.m848g(this.f41158c, C0204c.m848g(this.f41157b, this.f41156a.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.f41160e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f41164i.hashCode() + C0166e.m758d(this.f41163h, C0166e.m758d(this.f41162g, C0009a.m16d(this.f41161f, (iM848g + r10) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TokenCreatedPhrase(term=");
        sb2.append(this.f41156a);
        sb2.append(", meanings=");
        sb2.append(this.f41157b);
        sb2.append(", tags=");
        sb2.append(this.f41158c);
        sb2.append(", gTags=");
        sb2.append(this.f41159d);
        sb2.append(", isPhrase=");
        sb2.append(this.f41160e);
        sb2.append(", importance=");
        sb2.append(this.f41161f);
        sb2.append(", fragment=");
        sb2.append(this.f41162g);
        sb2.append(", status=");
        sb2.append(this.f41163h);
        sb2.append(", words=");
        return C0009a.m24m(sb2, this.f41164i, ")");
    }
}
