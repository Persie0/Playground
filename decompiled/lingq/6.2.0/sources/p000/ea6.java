package p000;

import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ea6 extends tqb {

    /* JADX INFO: renamed from: b */
    public final String f36926b;

    /* JADX INFO: renamed from: c */
    public final String f36927c;

    /* JADX INFO: renamed from: d */
    public final int f36928d;

    /* JADX INFO: renamed from: e */
    public final LqAnalyticsValues$LessonPath f36929e;

    /* JADX INFO: renamed from: f */
    public final String f36930f;

    /* JADX INFO: renamed from: g */
    public final String f36931g;

    /* JADX INFO: renamed from: h */
    public final List f36932h;

    /* JADX INFO: renamed from: i */
    public final boolean f36933i;

    /* JADX INFO: renamed from: j */
    public final boolean f36934j;

    /* JADX INFO: renamed from: k */
    public final int f36935k;

    public ea6(String str, String str2, int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str3, String str4, List list, boolean z, boolean z2, int i2) {
        str3.getClass();
        this.f36926b = str;
        this.f36927c = str2;
        this.f36928d = i;
        this.f36929e = lqAnalyticsValues$LessonPath;
        this.f36930f = str3;
        this.f36931g = str4;
        this.f36932h = list;
        this.f36933i = z;
        this.f36934j = z2;
        this.f36935k = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea6)) {
            return false;
        }
        ea6 ea6Var = (ea6) obj;
        return this.f36926b.equals(ea6Var.f36926b) && this.f36927c.equals(ea6Var.f36927c) && this.f36928d == ea6Var.f36928d && this.f36929e.equals(ea6Var.f36929e) && fa4.m11650l(this.f36930f, ea6Var.f36930f) && this.f36931g.equals(ea6Var.f36931g) && this.f36932h.equals(ea6Var.f36932h) && this.f36933i == ea6Var.f36933i && this.f36934j == ea6Var.f36934j && this.f36935k == ea6Var.f36935k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f36935k) + g9a.m12428e(g9a.m12428e(ux5.m22979b(ux5.m22980c(ux5.m22980c((this.f36929e.hashCode() + wq1.m24106b(this.f36928d, ux5.m22980c(this.f36926b.hashCode() * 31, this.f36927c, 31), 31)) * 31, this.f36930f, 31), this.f36931g, 31), 31, this.f36932h), 31, this.f36933i), 31, this.f36934j);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("LessonPreview(source=", this.f36926b, ", url=", this.f36927c, ", lessonId=");
        sbM23000w.append(this.f36928d);
        sbM23000w.append(", lessonPath=");
        sbM23000w.append(this.f36929e);
        sbM23000w.append(", shelfCode=");
        AbstractC3393o1.m17725C(sbM23000w, this.f36930f, ", sharedBy=", this.f36931g, ", tags=");
        sbM23000w.append(this.f36932h);
        sbM23000w.append(", isVirtual=");
        sbM23000w.append(this.f36933i);
        sbM23000w.append(", hasAudio=");
        sbM23000w.append(this.f36934j);
        sbM23000w.append(", duration=");
        sbM23000w.append(this.f36935k);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
