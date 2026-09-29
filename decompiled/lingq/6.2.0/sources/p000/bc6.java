package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.reader.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class bc6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f8331a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f8332b;

    /* JADX INFO: renamed from: c */
    public final String f8333c;

    /* JADX INFO: renamed from: d */
    public final String f8334d;

    /* JADX INFO: renamed from: e */
    public final int f8335e = R$id.actionToLessonSentence;

    public bc6(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        this.f8331a = i;
        this.f8332b = lqAnalyticsValues$LessonPath;
        this.f8333c = str;
        this.f8334d = str2;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f8331a);
        bundle.putInt("courseId", -1);
        bundle.putString("courseTitle", this.f8333c);
        bundle.putBoolean("isSentenceMode", true);
        bundle.putString("lessonLanguageFromDeeplink", this.f8334d);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f8332b;
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
        return this.f8335e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc6)) {
            return false;
        }
        bc6 bc6Var = (bc6) obj;
        return this.f8331a == bc6Var.f8331a && fa4.m11650l(this.f8332b, bc6Var.f8332b) && this.f8333c.equals(bc6Var.f8333c) && this.f8334d.equals(bc6Var.f8334d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f8331a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f8332b;
        return this.f8334d.hashCode() + g9a.m12428e(ux5.m22980c(wq1.m24106b(-1, (iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, 31), this.f8333c, 31), 31, true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToLessonSentence(lessonId=");
        sb.append(this.f8331a);
        sb.append(", lessonPath=");
        sb.append(this.f8332b);
        sb.append(", courseId=-1, courseTitle=");
        return wq1.m24125u(sb, this.f8333c, ", isSentenceMode=true, lessonLanguageFromDeeplink=", this.f8334d, ")");
    }
}
