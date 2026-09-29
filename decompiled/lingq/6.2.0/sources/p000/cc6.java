package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.reader.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class cc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f9884a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f9885b;

    /* JADX INFO: renamed from: c */
    public final int f9886c;

    /* JADX INFO: renamed from: d */
    public final String f9887d;

    /* JADX INFO: renamed from: e */
    public final boolean f9888e;

    /* JADX INFO: renamed from: f */
    public final String f9889f;

    /* JADX INFO: renamed from: g */
    public final int f9890g = R$id.actionToReader;

    public cc6(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, int i2, String str, boolean z, String str2) {
        this.f9884a = i;
        this.f9885b = lqAnalyticsValues$LessonPath;
        this.f9886c = i2;
        this.f9887d = str;
        this.f9888e = z;
        this.f9889f = str2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f9884a);
        bundle.putInt("courseId", this.f9886c);
        bundle.putString("courseTitle", this.f9887d);
        bundle.putBoolean("isSentenceMode", this.f9888e);
        bundle.putString("lessonLanguageFromDeeplink", this.f9889f);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f9885b;
        if (zIsAssignableFrom) {
            bundle.putParcelable("lessonPath", lqAnalyticsValues$LessonPath);
            return bundle;
        }
        if (Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
            bundle.putSerializable("lessonPath", (Serializable) lqAnalyticsValues$LessonPath);
            return bundle;
        }
        C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        return null;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f9890g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cc6)) {
            return false;
        }
        cc6 cc6Var = (cc6) obj;
        return this.f9884a == cc6Var.f9884a && fa4.m11650l(this.f9885b, cc6Var.f9885b) && this.f9886c == cc6Var.f9886c && this.f9887d.equals(cc6Var.f9887d) && this.f9888e == cc6Var.f9888e && this.f9889f.equals(cc6Var.f9889f);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f9884a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f9885b;
        return this.f9889f.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f9886c, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f9887d, 31), 31, this.f9888e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToReader(lessonId=");
        sb.append(this.f9884a);
        sb.append(", lessonPath=");
        sb.append(this.f9885b);
        sb.append(", courseId=");
        hn1.m13361k(this.f9886c, ", courseTitle=", this.f9887d, ", isSentenceMode=", sb);
        sb.append(this.f9888e);
        sb.append(", lessonLanguageFromDeeplink=");
        sb.append(this.f9889f);
        sb.append(")");
        return sb.toString();
    }
}
