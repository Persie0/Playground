package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.feature.collections.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e96 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f36879a;

    /* JADX INFO: renamed from: b */
    public final LqAnalyticsValues$LessonPath f36880b;

    /* JADX INFO: renamed from: c */
    public final String f36881c;

    /* JADX INFO: renamed from: d */
    public final String f36882d;

    /* JADX INFO: renamed from: e */
    public final int f36883e;

    public e96(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f36879a = i;
        this.f36880b = lqAnalyticsValues$LessonPath;
        this.f36881c = str;
        this.f36882d = str2;
        this.f36883e = R$id.actionToCollection;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("courseId", this.f36879a);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class);
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f36880b;
        if (zIsAssignableFrom) {
            bundle.putParcelable("lessonPath", lqAnalyticsValues$LessonPath);
        } else {
            if (!Serializable.class.isAssignableFrom(LqAnalyticsValues$LessonPath.class)) {
                C3386nv.m17636w(LqAnalyticsValues$LessonPath.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            bundle.putSerializable("lessonPath", (Serializable) lqAnalyticsValues$LessonPath);
        }
        bundle.putString("shelfCode", this.f36881c);
        bundle.putString("languageFromDeeplink", this.f36882d);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f36883e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e96)) {
            return false;
        }
        e96 e96Var = (e96) obj;
        return this.f36879a == e96Var.f36879a && fa4.m11650l(this.f36880b, e96Var.f36880b) && fa4.m11650l(this.f36881c, e96Var.f36881c) && fa4.m11650l(this.f36882d, e96Var.f36882d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f36879a) * 31;
        LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath = this.f36880b;
        return this.f36882d.hashCode() + ux5.m22980c((iHashCode + (lqAnalyticsValues$LessonPath == null ? 0 : lqAnalyticsValues$LessonPath.hashCode())) * 31, this.f36881c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionToCollection(courseId=");
        sb.append(this.f36879a);
        sb.append(", lessonPath=");
        sb.append(this.f36880b);
        sb.append(", shelfCode=");
        return wq1.m24125u(sb, this.f36881c, ", languageFromDeeplink=", this.f36882d, ")");
    }
}
