package p264mi;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import p003a2.C0009a;

/* JADX INFO: renamed from: mi.c */
/* JADX INFO: loaded from: classes.dex */
public final class C7563c {

    /* JADX INFO: renamed from: a */
    public final int f41679a;

    /* JADX INFO: renamed from: b */
    public final String f41680b;

    /* JADX INFO: renamed from: c */
    public final int f41681c;

    /* JADX INFO: renamed from: d */
    public final int f41682d;

    /* JADX INFO: renamed from: e */
    public final boolean f41683e;

    /* JADX INFO: renamed from: f */
    public final List<TokenMeaning> f41684f;

    /* JADX INFO: renamed from: g */
    public final List<String> f41685g;

    /* JADX INFO: renamed from: h */
    public final List<String> f41686h;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7563c() {
        EmptyList emptyList = EmptyList.f38032a;
        this(0, "", 0, 0, false, emptyList, emptyList, emptyList);
    }

    public C7563c(int i10, String str, int i11, int i12, boolean z10, List<TokenMeaning> list, List<String> list2, List<String> list3) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        this.f41679a = i10;
        this.f41680b = str;
        this.f41681c = i11;
        this.f41682d = i12;
        this.f41683e = z10;
        this.f41684f = list;
        this.f41685g = list2;
        this.f41686h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7563c)) {
            return false;
        }
        C7563c c7563c = (C7563c) obj;
        if (this.f41679a == c7563c.f41679a && C5207g.m11106a(this.f41680b, c7563c.f41680b) && this.f41681c == c7563c.f41681c && this.f41682d == c7563c.f41682d && this.f41683e == c7563c.f41683e && C5207g.m11106a(this.f41684f, c7563c.f41684f) && C5207g.m11106a(this.f41685g, c7563c.f41685g) && C5207g.m11106a(this.f41686h, c7563c.f41686h)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f41682d, C0009a.m16d(this.f41681c, C0166e.m758d(this.f41680b, Integer.hashCode(this.f41679a) * 31, 31), 31), 31);
        boolean z10 = this.f41683e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return this.f41686h.hashCode() + C0204c.m848g(this.f41685g, C0204c.m848g(this.f41684f, (iM16d + r10) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VocabularyCard(id=");
        sb2.append(this.f41679a);
        sb2.append(", term=");
        sb2.append(this.f41680b);
        sb2.append(", status=");
        sb2.append(this.f41681c);
        sb2.append(", extendedStatus=");
        sb2.append(this.f41682d);
        sb2.append(", isPhrase=");
        sb2.append(this.f41683e);
        sb2.append(", meanings=");
        sb2.append(this.f41684f);
        sb2.append(", tags=");
        sb2.append(this.f41685g);
        sb2.append(", gTags=");
        return C0009a.m24m(sb2, this.f41686h, ")");
    }
}
