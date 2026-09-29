package fk;

import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenType;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: fk.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C5575q {

    /* JADX INFO: renamed from: a */
    public final TokenType f34378a;

    /* JADX INFO: renamed from: b */
    public final List<TokenMeaning> f34379b;

    /* JADX INFO: renamed from: c */
    public final List<TokenMeaning> f34380c;

    /* JADX INFO: renamed from: d */
    public final boolean f34381d;

    public C5575q(TokenType tokenType, List list, ArrayList arrayList, boolean z10) {
        C5207g.m11111f(tokenType, "tokenType");
        C5207g.m11111f(list, "savedMeanings");
        this.f34378a = tokenType;
        this.f34379b = list;
        this.f34380c = arrayList;
        this.f34381d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5575q)) {
            return false;
        }
        C5575q c5575q = (C5575q) obj;
        return this.f34378a == c5575q.f34378a && C5207g.m11106a(this.f34379b, c5575q.f34379b) && C5207g.m11106a(this.f34380c, c5575q.f34380c) && this.f34381d == c5575q.f34381d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final int hashCode() {
        int iM848g = C0204c.m848g(this.f34380c, C0204c.m848g(this.f34379b, this.f34378a.hashCode() * 31, 31), 31);
        boolean z10 = this.f34381d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iM848g + r10;
    }

    public final String toString() {
        return "TokenWithMeaningsAndLocales(tokenType=" + this.f34378a + ", savedMeanings=" + this.f34379b + ", popularMeanings=" + this.f34380c + ", showLocales=" + this.f34381d + ")";
    }
}
