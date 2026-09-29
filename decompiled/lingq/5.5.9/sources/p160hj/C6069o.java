package p160hj;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;
import p265mj.C7570d;

/* JADX INFO: renamed from: hj.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C6069o {

    /* JADX INFO: renamed from: a */
    public final LessonStudy f35783a;

    /* JADX INFO: renamed from: b */
    public final String f35784b;

    /* JADX INFO: renamed from: c */
    public final List<C7570d> f35785c;

    /* JADX INFO: renamed from: d */
    public final LessonFont f35786d;

    /* JADX INFO: renamed from: e */
    public final int f35787e;

    /* JADX INFO: renamed from: f */
    public final double f35788f;

    /* JADX INFO: renamed from: g */
    public final boolean f35789g;

    /* JADX INFO: renamed from: h */
    public final boolean f35790h;

    /* JADX INFO: renamed from: i */
    public final String f35791i;

    /* JADX INFO: renamed from: j */
    public final String f35792j;

    /* JADX INFO: renamed from: k */
    public final String f35793k;

    /* JADX INFO: renamed from: l */
    public final String f35794l;

    public C6069o(LessonStudy lessonStudy, String str, List<C7570d> list, LessonFont lessonFont, int i10, double d10, boolean z10, boolean z11, String str2, String str3, String str4, String str5) {
        C5207g.m11111f(lessonFont, "font");
        this.f35783a = lessonStudy;
        this.f35784b = str;
        this.f35785c = list;
        this.f35786d = lessonFont;
        this.f35787e = i10;
        this.f35788f = d10;
        this.f35789g = z10;
        this.f35790h = z11;
        this.f35791i = str2;
        this.f35792j = str3;
        this.f35793k = str4;
        this.f35794l = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6069o)) {
            return false;
        }
        C6069o c6069o = (C6069o) obj;
        return C5207g.m11106a(this.f35783a, c6069o.f35783a) && C5207g.m11106a(this.f35784b, c6069o.f35784b) && C5207g.m11106a(this.f35785c, c6069o.f35785c) && C5207g.m11106a(this.f35786d, c6069o.f35786d) && this.f35787e == c6069o.f35787e && Double.compare(this.f35788f, c6069o.f35788f) == 0 && this.f35789g == c6069o.f35789g && this.f35790h == c6069o.f35790h && C5207g.m11106a(this.f35791i, c6069o.f35791i) && C5207g.m11106a(this.f35792j, c6069o.f35792j) && C5207g.m11106a(this.f35793k, c6069o.f35793k) && C5207g.m11106a(this.f35794l, c6069o.f35794l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final int hashCode() {
        int iM609e = C0141b.m609e(this.f35788f, C0009a.m16d(this.f35787e, (this.f35786d.hashCode() + C0204c.m848g(this.f35785c, C0166e.m758d(this.f35784b, this.f35783a.hashCode() * 31, 31), 31)) * 31, 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f35789g;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i10 = (iM609e + r11) * 31;
        boolean z11 = this.f35790h;
        if (!z11) {
            r10 = z11;
        }
        return this.f35794l.hashCode() + C0166e.m758d(this.f35793k, C0166e.m758d(this.f35792j, C0166e.m758d(this.f35791i, (i10 + r10) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LessonToRender(lesson=");
        sb2.append(this.f35783a);
        sb2.append(", fullText=");
        sb2.append(this.f35784b);
        sb2.append(", fullTextTokens=");
        sb2.append(this.f35785c);
        sb2.append(", font=");
        sb2.append(this.f35786d);
        sb2.append(", fontSize=");
        sb2.append(this.f35787e);
        sb2.append(", lineSpacing=");
        sb2.append(this.f35788f);
        sb2.append(", showSpaces=");
        sb2.append(this.f35789g);
        sb2.append(", mode=");
        sb2.append(this.f35790h);
        sb2.append(", chineseScript=");
        sb2.append(this.f35791i);
        sb2.append(", traditionalScript=");
        sb2.append(this.f35792j);
        sb2.append(", japaneseScript=");
        sb2.append(this.f35793k);
        sb2.append(", cantoneseScript=");
        return C0009a.m23l(sb2, this.f35794l, ")");
    }
}
