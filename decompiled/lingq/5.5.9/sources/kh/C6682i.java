package kh;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.lingq.p055ui.info.LessonInfoParent;
import com.linguist.R;
import dm.C5207g;
import java.io.Serializable;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.i */
/* JADX INFO: loaded from: classes.dex */
public final class C6682i implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37793a;

    /* JADX INFO: renamed from: b */
    public final String f37794b;

    /* JADX INFO: renamed from: c */
    public final String f37795c;

    /* JADX INFO: renamed from: d */
    public final String f37796d;

    /* JADX INFO: renamed from: e */
    public final String f37797e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoParent f37798f;

    /* JADX INFO: renamed from: g */
    public final int f37799g = R.id.actionToLessonInfo;

    public C6682i(int i10, String str, String str2, String str3, String str4, LessonInfoParent lessonInfoParent) {
        this.f37793a = i10;
        this.f37794b = str;
        this.f37795c = str2;
        this.f37796d = str3;
        this.f37797e = str4;
        this.f37798f = lessonInfoParent;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f37793a);
        bundle.putString("title", this.f37794b);
        bundle.putString("imageURL", this.f37795c);
        bundle.putString("originalImageUrl", this.f37796d);
        bundle.putString("description", this.f37797e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonInfoParent.class);
        Serializable serializable = this.f37798f;
        if (zIsAssignableFrom) {
            C5207g.m11109d(serializable, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("from", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(LessonInfoParent.class)) {
                throw new UnsupportedOperationException(LessonInfoParent.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            C5207g.m11109d(serializable, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("from", serializable);
        }
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37799g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6682i)) {
            return false;
        }
        C6682i c6682i = (C6682i) obj;
        return this.f37793a == c6682i.f37793a && C5207g.m11106a(this.f37794b, c6682i.f37794b) && C5207g.m11106a(this.f37795c, c6682i.f37795c) && C5207g.m11106a(this.f37796d, c6682i.f37796d) && C5207g.m11106a(this.f37797e, c6682i.f37797e) && this.f37798f == c6682i.f37798f;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f37795c, C0166e.m758d(this.f37794b, Integer.hashCode(this.f37793a) * 31, 31), 31);
        String str = this.f37796d;
        return this.f37798f.hashCode() + C0166e.m758d(this.f37797e, (iM758d + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ActionToLessonInfo(lessonId=" + this.f37793a + ", title=" + this.f37794b + ", imageURL=" + this.f37795c + ", originalImageUrl=" + this.f37796d + ", description=" + this.f37797e + ", from=" + this.f37798f + ")";
    }
}
