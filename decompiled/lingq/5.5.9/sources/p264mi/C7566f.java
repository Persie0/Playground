package p264mi;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.entity.LessonTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import p003a2.C0009a;

/* JADX INFO: renamed from: mi.f */
/* JADX INFO: loaded from: classes.dex */
public final class C7566f {

    /* JADX INFO: renamed from: a */
    public final int f41691a;

    /* JADX INFO: renamed from: b */
    public final String f41692b;

    /* JADX INFO: renamed from: c */
    public final int f41693c;

    /* JADX INFO: renamed from: d */
    public final int f41694d;

    /* JADX INFO: renamed from: e */
    public final boolean f41695e;

    /* JADX INFO: renamed from: f */
    public final List<TokenMeaning> f41696f;

    /* JADX INFO: renamed from: g */
    public final LessonTransliteration f41697g;

    /* JADX INFO: renamed from: h */
    public final String f41698h;

    /* JADX INFO: renamed from: i */
    public final List<String> f41699i;

    /* JADX INFO: renamed from: j */
    public final List<String> f41700j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7566f() {
        EmptyList emptyList = EmptyList.f38032a;
        this(0, "", 0, 0, false, emptyList, null, "", emptyList, emptyList);
    }

    public C7566f(int i10, String str, int i11, int i12, boolean z10, List<TokenMeaning> list, LessonTransliteration lessonTransliteration, String str2, List<String> list2, List<String> list3) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "meanings");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        this.f41691a = i10;
        this.f41692b = str;
        this.f41693c = i11;
        this.f41694d = i12;
        this.f41695e = z10;
        this.f41696f = list;
        this.f41697g = lessonTransliteration;
        this.f41698h = str2;
        this.f41699i = list2;
        this.f41700j = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7566f)) {
            return false;
        }
        C7566f c7566f = (C7566f) obj;
        return this.f41691a == c7566f.f41691a && C5207g.m11106a(this.f41692b, c7566f.f41692b) && this.f41693c == c7566f.f41693c && this.f41694d == c7566f.f41694d && this.f41695e == c7566f.f41695e && C5207g.m11106a(this.f41696f, c7566f.f41696f) && C5207g.m11106a(this.f41697g, c7566f.f41697g) && C5207g.m11106a(this.f41698h, c7566f.f41698h) && C5207g.m11106a(this.f41699i, c7566f.f41699i) && C5207g.m11106a(this.f41700j, c7566f.f41700j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f41694d, C0009a.m16d(this.f41693c, C0166e.m758d(this.f41692b, Integer.hashCode(this.f41691a) * 31, 31), 31), 31);
        boolean z10 = this.f41695e;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM848g = C0204c.m848g(this.f41696f, (iM16d + r10) * 31, 31);
        LessonTransliteration lessonTransliteration = this.f41697g;
        int iHashCode = (iM848g + (lessonTransliteration == null ? 0 : lessonTransliteration.hashCode())) * 31;
        String str = this.f41698h;
        return this.f41700j.hashCode() + C0204c.m848g(this.f41699i, (iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VocabularyReviewCard(id=");
        sb2.append(this.f41691a);
        sb2.append(", term=");
        sb2.append(this.f41692b);
        sb2.append(", status=");
        sb2.append(this.f41693c);
        sb2.append(", extendedStatus=");
        sb2.append(this.f41694d);
        sb2.append(", isPhrase=");
        sb2.append(this.f41695e);
        sb2.append(", meanings=");
        sb2.append(this.f41696f);
        sb2.append(", transliteration=");
        sb2.append(this.f41697g);
        sb2.append(", srsDueDate=");
        sb2.append(this.f41698h);
        sb2.append(", tags=");
        sb2.append(this.f41699i);
        sb2.append(", gTags=");
        return C0009a.m24m(sb2, this.f41700j, ")");
    }
}
