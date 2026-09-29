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

/* JADX INFO: renamed from: kh.h */
/* JADX INFO: loaded from: classes.dex */
public final class C6681h implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37786a;

    /* JADX INFO: renamed from: b */
    public final int f37787b;

    /* JADX INFO: renamed from: c */
    public final String f37788c;

    /* JADX INFO: renamed from: d */
    public final boolean f37789d;

    /* JADX INFO: renamed from: e */
    public final String f37790e;

    /* JADX INFO: renamed from: f */
    public final LessonPath f37791f;

    /* JADX INFO: renamed from: g */
    public final int f37792g = R.id.actionToLessonSentence;

    public C6681h(int i10, int i11, String str, boolean z10, String str2, LessonPath lessonPath) {
        this.f37786a = i10;
        this.f37787b = i11;
        this.f37788c = str;
        this.f37789d = z10;
        this.f37790e = str2;
        this.f37791f = lessonPath;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37786a);
        bundle.putInt("courseId", this.f37787b);
        bundle.putString("courseTitle", this.f37788c);
        bundle.putBoolean("isSentenceMode", this.f37789d);
        bundle.putString("lessonLanguageFromDeeplink", this.f37790e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonPath.class);
        LessonPath lessonPath = this.f37791f;
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
        return this.f37792g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6681h)) {
            return false;
        }
        C6681h c6681h = (C6681h) obj;
        return this.f37786a == c6681h.f37786a && this.f37787b == c6681h.f37787b && C5207g.m11106a(this.f37788c, c6681h.f37788c) && this.f37789d == c6681h.f37789d && C5207g.m11106a(this.f37790e, c6681h.f37790e) && C5207g.m11106a(this.f37791f, c6681h.f37791f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37788c, C0009a.m16d(this.f37787b, Integer.hashCode(this.f37786a) * 31, 31), 31);
        boolean z10 = this.f37789d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM758d2 = C0166e.m758d(this.f37790e, (iM758d + r10) * 31, 31);
        LessonPath lessonPath = this.f37791f;
        return iM758d2 + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "ActionToLessonSentence(lessonId=" + this.f37786a + ", courseId=" + this.f37787b + ", courseTitle=" + this.f37788c + ", isSentenceMode=" + this.f37789d + ", lessonLanguageFromDeeplink=" + this.f37790e + ", lessonPath=" + this.f37791f + ")";
    }
}
