package li;

import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.List;

/* JADX INFO: renamed from: li.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7374a implements InterfaceC7379f {

    /* JADX INFO: renamed from: a */
    public final String f41142a;

    /* JADX INFO: renamed from: b */
    public final List<String> f41143b;

    /* JADX INFO: renamed from: c */
    public final List<String> f41144c;

    /* JADX INFO: renamed from: d */
    public final boolean f41145d;

    /* JADX INFO: renamed from: e */
    public final List<TokenMeaning> f41146e;

    /* JADX INFO: renamed from: f */
    public final int f41147f;

    /* JADX INFO: renamed from: g */
    public final String f41148g;

    /* JADX INFO: renamed from: h */
    public final int f41149h;

    /* JADX INFO: renamed from: i */
    public final int f41150i;

    /* JADX INFO: renamed from: j */
    public final Integer f41151j;

    /* JADX INFO: renamed from: k */
    public final String f41152k;

    /* JADX INFO: renamed from: l */
    public final String f41153l;

    /* JADX INFO: renamed from: m */
    public final List<String> f41154m;

    /* JADX INFO: renamed from: n */
    public final LessonStudyTransliteration f41155n;

    public C7374a(String str, List<String> list, List<String> list2, boolean z10, List<TokenMeaning> list3, int i10, String str2, int i11, int i12, Integer num, String str3, String str4, List<String> list4, LessonStudyTransliteration lessonStudyTransliteration) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list, "tags");
        C5207g.m11111f(list2, "gTags");
        C5207g.m11111f(str2, "fragment");
        C5207g.m11111f(list4, "words");
        this.f41142a = str;
        this.f41143b = list;
        this.f41144c = list2;
        this.f41145d = z10;
        this.f41146e = list3;
        this.f41147f = i10;
        this.f41148g = str2;
        this.f41149h = i11;
        this.f41150i = i12;
        this.f41151j = num;
        this.f41152k = str3;
        this.f41153l = str4;
        this.f41154m = list4;
        this.f41155n = lessonStudyTransliteration;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> mo14772a() {
        return this.f41146e;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: b */
    public final List<String> mo14773b() {
        return this.f41143b;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: c */
    public final String mo14774c() {
        return this.f41142a;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: d */
    public final List<String> mo14775d() {
        return this.f41144c;
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: e */
    public final boolean mo14776e() {
        return this.f41145d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C7374a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.shared.uimodel.token.TokenCard");
        C7374a c7374a = (C7374a) obj;
        return C5207g.m11106a(this.f41143b, c7374a.f41143b) && C5207g.m11106a(this.f41144c, c7374a.f41144c) && C5207g.m11106a(this.f41146e, c7374a.f41146e) && this.f41150i == c7374a.f41150i && C5207g.m11106a(this.f41151j, c7374a.f41151j) && C5207g.m11106a(this.f41152k, c7374a.f41152k) && C5207g.m11106a(this.f41153l, c7374a.f41153l);
    }

    @Override // li.InterfaceC7379f
    /* JADX INFO: renamed from: f */
    public final int mo14777f() {
        return this.f41147f;
    }

    public final int hashCode() {
        int iM848g = (C0204c.m848g(this.f41146e, C0204c.m848g(this.f41144c, this.f41143b.hashCode() * 31, 31), 31) + this.f41150i) * 31;
        Integer num = this.f41151j;
        int iIntValue = (iM848g + (num != null ? num.intValue() : 0)) * 31;
        String str = this.f41152k;
        int iHashCode = (iIntValue + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41153l;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "TokenCard(term=" + this.f41142a + ", tags=" + this.f41143b + ", gTags=" + this.f41144c + ", isPhrase=" + this.f41145d + ", meanings=" + this.f41146e + ", importance=" + this.f41147f + ", fragment=" + this.f41148g + ", id=" + this.f41149h + ", status=" + this.f41150i + ", extendedStatus=" + this.f41151j + ", srsDueDate=" + this.f41152k + ", notes=" + this.f41153l + ", words=" + this.f41154m + ", transliteration=" + this.f41155n + ")";
    }
}
