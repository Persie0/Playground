package p265mj;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.storage.LessonFont;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: mj.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7567a {

    /* JADX INFO: renamed from: a */
    public final boolean f41701a;

    /* JADX INFO: renamed from: b */
    public final String f41702b;

    /* JADX INFO: renamed from: c */
    public final List<C7570d> f41703c;

    /* JADX INFO: renamed from: d */
    public final boolean f41704d;

    /* JADX INFO: renamed from: e */
    public final LessonFont f41705e;

    /* JADX INFO: renamed from: f */
    public final double f41706f;

    /* JADX INFO: renamed from: g */
    public final int f41707g;

    /* JADX INFO: renamed from: h */
    public final boolean f41708h;

    /* JADX INFO: renamed from: i */
    public final String f41709i;

    public C7567a(boolean z10, String str, ArrayList arrayList, boolean z11, LessonFont lessonFont, double d10, int i10, boolean z12, String str2) {
        C5207g.m11111f(lessonFont, "lessonFont");
        C5207g.m11111f(str2, "scriptType");
        this.f41701a = z10;
        this.f41702b = str;
        this.f41703c = arrayList;
        this.f41704d = z11;
        this.f41705e = lessonFont;
        this.f41706f = d10;
        this.f41707g = i10;
        this.f41708h = z12;
        this.f41709i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7567a)) {
            return false;
        }
        C7567a c7567a = (C7567a) obj;
        if (this.f41701a == c7567a.f41701a && C5207g.m11106a(this.f41702b, c7567a.f41702b) && C5207g.m11106a(this.f41703c, c7567a.f41703c) && this.f41704d == c7567a.f41704d && C5207g.m11106a(this.f41705e, c7567a.f41705e) && Double.compare(this.f41706f, c7567a.f41706f) == 0 && this.f41707g == c7567a.f41707g && this.f41708h == c7567a.f41708h && C5207g.m11106a(this.f41709i, c7567a.f41709i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    public final int hashCode() {
        ?? r10 = 1;
        boolean z10 = this.f41701a;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM848g = C0204c.m848g(this.f41703c, C0166e.m758d(this.f41702b, r11 * 31, 31), 31);
        boolean z11 = this.f41704d;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int iM16d = C0009a.m16d(this.f41707g, C0141b.m609e(this.f41706f, (this.f41705e.hashCode() + ((iM848g + r12) * 31)) * 31, 31), 31);
        boolean z12 = this.f41708h;
        if (!z12) {
            r10 = z12;
        }
        return this.f41709i.hashCode() + ((iM16d + r10) * 31);
    }

    public final String toString() {
        return "LessonPage(isFirstPage=" + this.f41701a + ", pageText=" + this.f41702b + ", textTokens=" + this.f41703c + ", isLastPage=" + this.f41704d + ", lessonFont=" + this.f41705e + ", lineSpacing=" + this.f41706f + ", fontSize=" + this.f41707g + ", withSpaces=" + this.f41708h + ", scriptType=" + this.f41709i + ")";
    }
}
