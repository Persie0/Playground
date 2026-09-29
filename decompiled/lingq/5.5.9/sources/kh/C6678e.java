package kh;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.shared.util.LessonPath;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6678e implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37774a;

    /* JADX INFO: renamed from: b */
    public final LessonPath f37775b;

    public C6678e(int i10, LessonPath lessonPath) {
        this.f37774a = i10;
        this.f37775b = lessonPath;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("courseId", this.f37774a);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonPath.class);
        LessonPath lessonPath = this.f37775b;
        if (zIsAssignableFrom) {
            bundle.putParcelable("lessonPath", lessonPath);
        } else if (Serializable.class.isAssignableFrom(LessonPath.class)) {
            bundle.putSerializable("lessonPath", (Serializable) lessonPath);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return R.id.actionToCourse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6678e)) {
            return false;
        }
        C6678e c6678e = (C6678e) obj;
        return this.f37774a == c6678e.f37774a && C5207g.m11106a(this.f37775b, c6678e.f37775b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f37774a) * 31;
        LessonPath lessonPath = this.f37775b;
        return iHashCode + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "ActionToCourse(courseId=" + this.f37774a + ", lessonPath=" + this.f37775b + ")";
    }
}
