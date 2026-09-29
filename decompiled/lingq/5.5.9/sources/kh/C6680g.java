package kh;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.shared.util.LessonPath;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p003a2.C0009a;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.g */
/* JADX INFO: loaded from: classes.dex */
public final class C6680g implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37779a;

    /* JADX INFO: renamed from: b */
    public final int f37780b;

    /* JADX INFO: renamed from: c */
    public final String f37781c;

    /* JADX INFO: renamed from: d */
    public final boolean f37782d;

    /* JADX INFO: renamed from: e */
    public final String f37783e;

    /* JADX INFO: renamed from: f */
    public final LessonPath f37784f;

    /* JADX INFO: renamed from: g */
    public final int f37785g = R.id.actionToLesson;

    public C6680g(int i10, int i11, String str, boolean z10, String str2, LessonPath lessonPath) {
        this.f37779a = i10;
        this.f37780b = i11;
        this.f37781c = str;
        this.f37782d = z10;
        this.f37783e = str2;
        this.f37784f = lessonPath;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37779a);
        bundle.putInt("courseId", this.f37780b);
        bundle.putString("courseTitle", this.f37781c);
        bundle.putBoolean("isSentenceMode", this.f37782d);
        bundle.putString("lessonLanguageFromDeeplink", this.f37783e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonPath.class);
        LessonPath lessonPath = this.f37784f;
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
        return this.f37785g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6680g)) {
            return false;
        }
        C6680g c6680g = (C6680g) obj;
        if (this.f37779a == c6680g.f37779a && this.f37780b == c6680g.f37780b && C5207g.m11106a(this.f37781c, c6680g.f37781c) && this.f37782d == c6680g.f37782d && C5207g.m11106a(this.f37783e, c6680g.f37783e) && C5207g.m11106a(this.f37784f, c6680g.f37784f)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37781c, C0009a.m16d(this.f37780b, Integer.hashCode(this.f37779a) * 31, 31), 31);
        boolean z10 = this.f37782d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d2 = C0166e.m758d(this.f37783e, (iM758d + r10) * 31, 31);
        LessonPath lessonPath = this.f37784f;
        return iM758d2 + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "ActionToLesson(lessonId=" + this.f37779a + ", courseId=" + this.f37780b + ", courseTitle=" + this.f37781c + ", isSentenceMode=" + this.f37782d + ", lessonLanguageFromDeeplink=" + this.f37783e + ", lessonPath=" + this.f37784f + ")";
    }
}
