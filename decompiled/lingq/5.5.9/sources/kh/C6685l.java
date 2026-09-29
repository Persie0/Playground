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

/* JADX INFO: renamed from: kh.l */
/* JADX INFO: loaded from: classes.dex */
public final class C6685l implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final String f37808a;

    /* JADX INFO: renamed from: b */
    public final String f37809b;

    /* JADX INFO: renamed from: c */
    public final int f37810c;

    /* JADX INFO: renamed from: d */
    public final LessonPath f37811d;

    /* JADX INFO: renamed from: e */
    public final int f37812e = R.id.actionToLessonPreview;

    public C6685l(int i10, LessonPath lessonPath, String str, String str2) {
        this.f37808a = str;
        this.f37809b = str2;
        this.f37810c = i10;
        this.f37811d = lessonPath;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putString("source", this.f37808a);
        bundle.putString("url", this.f37809b);
        bundle.putInt("lessonId", this.f37810c);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonPath.class);
        LessonPath lessonPath = this.f37811d;
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
        return this.f37812e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6685l)) {
            return false;
        }
        C6685l c6685l = (C6685l) obj;
        return C5207g.m11106a(this.f37808a, c6685l.f37808a) && C5207g.m11106a(this.f37809b, c6685l.f37809b) && this.f37810c == c6685l.f37810c && C5207g.m11106a(this.f37811d, c6685l.f37811d);
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f37810c, C0166e.m758d(this.f37809b, this.f37808a.hashCode() * 31, 31), 31);
        LessonPath lessonPath = this.f37811d;
        return iM16d + (lessonPath == null ? 0 : lessonPath.hashCode());
    }

    public final String toString() {
        return "ActionToLessonPreview(source=" + this.f37808a + ", url=" + this.f37809b + ", lessonId=" + this.f37810c + ", lessonPath=" + this.f37811d + ")";
    }
}
