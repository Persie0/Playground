package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.reader.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class dc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f35391a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f35392b;

    /* JADX INFO: renamed from: c */
    public final int f35393c;

    /* JADX INFO: renamed from: d */
    public final String f35394d;

    /* JADX INFO: renamed from: e */
    public final String f35395e;

    /* JADX INFO: renamed from: f */
    public final int f35396f = R$id.actionToReaderCompose;

    public dc6(int i, int i2, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        this.f35391a = i;
        this.f35392b = lqAnalyticsValues$LessonPath;
        this.f35393c = i2;
        this.f35394d = str;
        this.f35395e = str2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f35391a);
        bundle.putInt("courseId", this.f35393c);
        bundle.putString("courseTitle", this.f35394d);
        bundle.putBoolean("isSentenceMode", false);
        bundle.putString("lessonLanguageFromDeeplink", this.f35395e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f35392b;
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
        return this.f35396f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dc6)) {
            return false;
        }
        dc6 dc6Var = (dc6) obj;
        return this.f35391a == dc6Var.f35391a && fa4.m11650l(this.f35392b, dc6Var.f35392b) && this.f35393c == dc6Var.f35393c && this.f35394d.equals(dc6Var.f35394d) && this.f35395e.equals(dc6Var.f35395e);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f35391a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f35392b;
        return this.f35395e.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f35393c, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f35394d, 31), 31, false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToReaderCompose(lessonId=");
        sb.append(this.f35391a);
        sb.append(", lessonPath=");
        sb.append(this.f35392b);
        sb.append(", courseId=");
        hn1.m13361k(this.f35393c, ", courseTitle=", this.f35394d, ", isSentenceMode=false, lessonLanguageFromDeeplink=", sb);
        return AbstractC3393o1.m17738m(sb, this.f35395e, ")");
    }
}
