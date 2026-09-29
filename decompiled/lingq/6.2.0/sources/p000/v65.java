package p000;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class v65 {

    /* JADX INFO: renamed from: a */
    public final Lesson f64920a;

    /* JADX INFO: renamed from: b */
    public final String f64921b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f64922c;

    /* JADX INFO: renamed from: d */
    public final ReaderFont f64923d;

    /* JADX INFO: renamed from: e */
    public final int f64924e;

    /* JADX INFO: renamed from: f */
    public final double f64925f;

    /* JADX INFO: renamed from: g */
    public final boolean f64926g;

    /* JADX INFO: renamed from: h */
    public final boolean f64927h;

    /* JADX INFO: renamed from: i */
    public final String f64928i;

    /* JADX INFO: renamed from: j */
    public final String f64929j;

    /* JADX INFO: renamed from: k */
    public final String f64930k;

    /* JADX INFO: renamed from: l */
    public final String f64931l;

    /* JADX INFO: renamed from: m */
    public final String f64932m;

    /* JADX INFO: renamed from: n */
    public final boolean f64933n;

    /* JADX INFO: renamed from: o */
    public final ReaderPageMode f64934o;

    public v65(Lesson lesson, String str, ArrayList arrayList, ReaderFont readerFont, int i, double d, boolean z, boolean z2, String str2, String str3, String str4, String str5, String str6, boolean z3, ReaderPageMode readerPageMode) {
        readerFont.getClass();
        this.f64920a = lesson;
        this.f64921b = str;
        this.f64922c = arrayList;
        this.f64923d = readerFont;
        this.f64924e = i;
        this.f64925f = d;
        this.f64926g = z;
        this.f64927h = z2;
        this.f64928i = str2;
        this.f64929j = str3;
        this.f64930k = str4;
        this.f64931l = str5;
        this.f64932m = str6;
        this.f64933n = z3;
        this.f64934o = readerPageMode;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v65)) {
            return false;
        }
        v65 v65Var = (v65) obj;
        return this.f64920a.equals(v65Var.f64920a) && this.f64921b.equals(v65Var.f64921b) && this.f64922c.equals(v65Var.f64922c) && this.f64923d == v65Var.f64923d && this.f64924e == v65Var.f64924e && Double.compare(this.f64925f, v65Var.f64925f) == 0 && this.f64926g == v65Var.f64926g && this.f64927h == v65Var.f64927h && this.f64928i.equals(v65Var.f64928i) && this.f64929j.equals(v65Var.f64929j) && this.f64930k.equals(v65Var.f64930k) && this.f64931l.equals(v65Var.f64931l) && this.f64932m.equals(v65Var.f64932m) && this.f64933n == v65Var.f64933n && this.f64934o == v65Var.f64934o;
    }

    public final int hashCode() {
        return this.f64934o.hashCode() + g9a.m12428e(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(g9a.m12428e(g9a.m12428e(g9a.m12424a(this.f64925f, wq1.m24106b(this.f64924e, (this.f64923d.hashCode() + ((this.f64922c.hashCode() + ux5.m22980c(this.f64920a.hashCode() * 31, this.f64921b, 31)) * 31)) * 31, 31), 31), 31, this.f64926g), 31, this.f64927h), this.f64928i, 31), this.f64929j, 31), this.f64930k, 31), this.f64931l, 31), this.f64932m, 31), 31, this.f64933n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LessonToRender(lesson=");
        sb.append(this.f64920a);
        sb.append(", fullText=");
        sb.append(this.f64921b);
        sb.append(", fullTextTokens=");
        sb.append(this.f64922c);
        sb.append(", font=");
        sb.append(this.f64923d);
        sb.append(", fontSize=");
        sb.append(this.f64924e);
        sb.append(", lineSpacing=");
        sb.append(this.f64925f);
        sb.append(", showSpaces=");
        sb.append(this.f64926g);
        sb.append(", mode=");
        sb.append(this.f64927h);
        AbstractC3393o1.m17725C(sb, ", chineseScript=", this.f64928i, ", traditionalScript=", this.f64929j);
        AbstractC3393o1.m17725C(sb, ", japaneseScript=", this.f64930k, ", cantoneseScript=", this.f64931l);
        sb.append(", latinScript=");
        sb.append(this.f64932m);
        sb.append(", transliterationStatus=");
        sb.append(this.f64933n);
        sb.append(", pageMode=");
        sb.append(this.f64934o);
        sb.append(")");
        return sb.toString();
    }
}
