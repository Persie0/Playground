package p000;

import android.os.Bundle;
import com.lingq.feature.playlist.R$id;

/* JADX INFO: loaded from: classes3.dex */
public final class h96 implements t86 {

    /* JADX INFO: renamed from: a */
    public final int f42039a;

    /* JADX INFO: renamed from: b */
    public final String f42040b;

    /* JADX INFO: renamed from: c */
    public final String f42041c;

    /* JADX INFO: renamed from: d */
    public final int f42042d;

    public h96(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.f42039a = i;
        this.f42040b = str;
        this.f42041c = str2;
        this.f42042d = R$id.actionToCollectionPlaylist;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: a */
    public final Bundle mo233a() {
        Bundle bundle = new Bundle();
        bundle.putInt("courseId", this.f42039a);
        bundle.putString("courseTitle", this.f42040b);
        bundle.putString("shelfCode", this.f42041c);
        return bundle;
    }

    @Override // p000.t86
    /* JADX INFO: renamed from: b */
    public final int mo234b() {
        return this.f42042d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h96)) {
            return false;
        }
        h96 h96Var = (h96) obj;
        return this.f42039a == h96Var.f42039a && fa4.m11650l(this.f42040b, h96Var.f42040b) && fa4.m11650l(this.f42041c, h96Var.f42041c);
    }

    public final int hashCode() {
        return this.f42041c.hashCode() + ux5.m22980c(Integer.hashCode(this.f42039a) * 31, this.f42040b, 31);
    }

    public final String toString() {
        return AbstractC3393o1.m17738m(ux5.m22995r(this.f42039a, "ActionToCollectionPlaylist(courseId=", ", courseTitle=", this.f42040b, ", shelfCode="), this.f42041c, ")");
    }
}
