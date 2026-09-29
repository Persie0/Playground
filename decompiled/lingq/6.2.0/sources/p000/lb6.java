package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.library.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class lb6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final String f49405a;

    /* JADX INFO: renamed from: b */
    public final String f49406b;

    /* JADX INFO: renamed from: c */
    public final String f49407c;

    /* JADX INFO: renamed from: d */
    public final int f49408d;

    /* JADX INFO: renamed from: e */
    public final LqAnalyticsValues$LessonPath f49409e;

    /* JADX INFO: renamed from: f */
    public final boolean f49410f;

    /* JADX INFO: renamed from: g */
    public final boolean f49411g;

    /* JADX INFO: renamed from: h */
    public final int f49412h;

    /* JADX INFO: renamed from: i */
    public final int f49413i;

    public lb6(String str, String str2, String str3, int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, boolean z, boolean z2, int i2) {
        str3.getClass();
        this.f49405a = str;
        this.f49406b = str2;
        this.f49407c = str3;
        this.f49408d = i;
        this.f49409e = lqAnalyticsValues$LessonPath;
        this.f49410f = z;
        this.f49411g = z2;
        this.f49412h = i2;
        this.f49413i = R$id.actionToLessonPreview;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putString("source", this.f49405a);
        bundle.putString("url", this.f49406b);
        bundle.putString("shelfCode", this.f49407c);
        bundle.putInt("lessonId", this.f49408d);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f49409e;
        if (zIsAssignableFrom) {
            bundle.putParcelable("lessonPath", lqAnalyticsValues$LessonPath);
        } else {
            if (!Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
                C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            bundle.putSerializable("lessonPath", (Serializable) lqAnalyticsValues$LessonPath);
        }
        bundle.putBoolean("isVirtual", this.f49410f);
        bundle.putBoolean("hasAudio", this.f49411g);
        bundle.putInt("duration", this.f49412h);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f49413i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lb6)) {
            return false;
        }
        lb6 lb6Var = (lb6) obj;
        return this.f49405a.equals(lb6Var.f49405a) && this.f49406b.equals(lb6Var.f49406b) && fa4.m11650l(this.f49407c, lb6Var.f49407c) && this.f49408d == lb6Var.f49408d && this.f49409e.equals(lb6Var.f49409e) && this.f49410f == lb6Var.f49410f && this.f49411g == lb6Var.f49411g && this.f49412h == lb6Var.f49412h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f49412h) + g9a.m12428e(g9a.m12428e((this.f49409e.hashCode() + wq1.m24106b(this.f49408d, ux5.m22980c(ux5.m22980c(this.f49405a.hashCode() * 31, this.f49406b, 31), this.f49407c, 31), 31)) * 31, 31, this.f49410f), 31, this.f49411g);
    }

    public final String toString() {
        StringBuilder sbM23000w = ux5.m23000w("ActionToLessonPreview(source=", this.f49405a, ", url=", this.f49406b, ", shelfCode=");
        AbstractC3393o1.m17748w(this.f49408d, this.f49407c, ", lessonId=", ", lessonPath=", sbM23000w);
        sbM23000w.append(this.f49409e);
        sbM23000w.append(", isVirtual=");
        sbM23000w.append(this.f49410f);
        sbM23000w.append(", hasAudio=");
        sbM23000w.append(this.f49411g);
        sbM23000w.append(", duration=");
        sbM23000w.append(this.f49412h);
        sbM23000w.append(")");
        return sbM23000w.toString();
    }
}
