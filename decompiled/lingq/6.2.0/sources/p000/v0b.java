package p000;

import com.lingq.core.domain.model.lesson.LessonTransliteration;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class v0b {

    /* JADX INFO: renamed from: a */
    public final int f64671a;

    /* JADX INFO: renamed from: b */
    public final String f64672b;

    /* JADX INFO: renamed from: c */
    public final int f64673c;

    /* JADX INFO: renamed from: d */
    public final boolean f64674d;

    /* JADX INFO: renamed from: e */
    public final List f64675e;

    /* JADX INFO: renamed from: f */
    public final LessonTransliteration f64676f;

    /* JADX INFO: renamed from: g */
    public final String f64677g;

    /* JADX INFO: renamed from: h */
    public final List f64678h;

    /* JADX INFO: renamed from: i */
    public final List f64679i;

    public v0b(int i, String str, int i2, boolean z, List list, LessonTransliteration lessonTransliteration, String str2, List list2, List list3) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.f64671a = i;
        this.f64672b = str;
        this.f64673c = i2;
        this.f64674d = z;
        this.f64675e = list;
        this.f64676f = lessonTransliteration;
        this.f64677g = str2;
        this.f64678h = list2;
        this.f64679i = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0b)) {
            return false;
        }
        v0b v0bVar = (v0b) obj;
        return this.f64671a == v0bVar.f64671a && fa4.m11650l(this.f64672b, v0bVar.f64672b) && this.f64673c == v0bVar.f64673c && this.f64674d == v0bVar.f64674d && fa4.m11650l(this.f64675e, v0bVar.f64675e) && fa4.m11650l(this.f64676f, v0bVar.f64676f) && fa4.m11650l(this.f64677g, v0bVar.f64677g) && fa4.m11650l(this.f64678h, v0bVar.f64678h) && fa4.m11650l(this.f64679i, v0bVar.f64679i);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(g9a.m12428e(wq1.m24106b(this.f64673c, ux5.m22980c(Integer.hashCode(this.f64671a) * 31, this.f64672b, 31), 31), 31, this.f64674d), 31, this.f64675e);
        LessonTransliteration lessonTransliteration = this.f64676f;
        int iHashCode = (iM22979b + (lessonTransliteration == null ? 0 : lessonTransliteration.hashCode())) * 31;
        String str = this.f64677g;
        return this.f64679i.hashCode() + ux5.m22979b((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f64678h);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f64671a, "VocabularyReviewCard(id=", ", term=", this.f64672b, ", status=");
        hn1.m13368r(sbM22995r, this.f64673c, ", isPhrase=", this.f64674d, ", meanings=");
        sbM22995r.append(this.f64675e);
        sbM22995r.append(", transliteration=");
        sbM22995r.append(this.f64676f);
        sbM22995r.append(", srsDueDate=");
        hn1.m13366p(this.f64677g, ", tags=", ", gTags=", sbM22995r, this.f64678h);
        return hn1.m13356f(sbM22995r, this.f64679i, ")");
    }
}
