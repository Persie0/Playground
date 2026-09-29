package p000;

import android.os.Bundle;
import android.os.Parcelable;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.feature.lessoninfo.R$id;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ib6 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f43896a;

    /* JADX INFO: renamed from: b */
    public final String f43897b;

    /* JADX INFO: renamed from: c */
    public final String f43898c;

    /* JADX INFO: renamed from: d */
    public final String f43899d;

    /* JADX INFO: renamed from: e */
    public final String f43900e;

    /* JADX INFO: renamed from: f */
    public final LessonInfoSource f43901f;

    /* JADX INFO: renamed from: g */
    public final String f43902g;

    /* JADX INFO: renamed from: h */
    public final int f43903h;

    public ib6(int i, String str, String str2, String str3, String str4, LessonInfoSource lessonInfoSource, String str5) {
        str.getClass();
        str2.getClass();
        str4.getClass();
        lessonInfoSource.getClass();
        str5.getClass();
        this.f43896a = i;
        this.f43897b = str;
        this.f43898c = str2;
        this.f43899d = str3;
        this.f43900e = str4;
        this.f43901f = lessonInfoSource;
        this.f43902g = str5;
        this.f43903h = R$id.actionToLessonInfo;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("lessonId", this.f43896a);
        bundle.putString("title", this.f43897b);
        bundle.putString("imageURL", this.f43898c);
        bundle.putString("originalImageUrl", this.f43899d);
        bundle.putString("description", this.f43900e);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(LessonInfoSource.class);
        Serializable serializable = this.f43901f;
        if (zIsAssignableFrom) {
            serializable.getClass();
            bundle.putParcelable("from", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(LessonInfoSource.class)) {
                C3386nv.m17636w(LessonInfoSource.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
            serializable.getClass();
            bundle.putSerializable("from", serializable);
        }
        bundle.putString("shelfCode", this.f43902g);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f43903h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ib6)) {
            return false;
        }
        ib6 ib6Var = (ib6) obj;
        return this.f43896a == ib6Var.f43896a && fa4.m11650l(this.f43897b, ib6Var.f43897b) && fa4.m11650l(this.f43898c, ib6Var.f43898c) && fa4.m11650l(this.f43899d, ib6Var.f43899d) && fa4.m11650l(this.f43900e, ib6Var.f43900e) && this.f43901f == ib6Var.f43901f && fa4.m11650l(this.f43902g, ib6Var.f43902g);
    }

    public final int hashCode() {
        int iM22980c = ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f43896a) * 31, this.f43897b, 31), this.f43898c, 31);
        String str = this.f43899d;
        return this.f43902g.hashCode() + ((this.f43901f.hashCode() + ux5.m22980c((iM22980c + (str == null ? 0 : str.hashCode())) * 31, this.f43900e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f43896a, "ActionToLessonInfo(lessonId=", ", title=", this.f43897b, ", imageURL=");
        AbstractC3393o1.m17725C(sbM22995r, this.f43898c, ", originalImageUrl=", this.f43899d, ", description=");
        sbM22995r.append(this.f43900e);
        sbM22995r.append(", from=");
        sbM22995r.append(this.f43901f);
        sbM22995r.append(", shelfCode=");
        return AbstractC3393o1.m17738m(sbM22995r, this.f43902g, ")");
    }
}
