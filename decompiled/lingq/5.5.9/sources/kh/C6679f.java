package kh;

import android.os.Bundle;
import com.linguist.R;
import dm.C5207g;
import p040c4.InterfaceC1687l;

/* JADX INFO: renamed from: kh.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6679f implements InterfaceC1687l {

    /* JADX INFO: renamed from: a */
    public final int f37776a;

    /* JADX INFO: renamed from: b */
    public final String f37777b;

    /* JADX INFO: renamed from: c */
    public final int f37778c = R.id.actionToCoursePlaylist;

    public C6679f(String str, int i10) {
        this.f37776a = i10;
        this.f37777b = str;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: d */
    public final Bundle mo482d() {
        Bundle bundle = new Bundle();
        bundle.putInt("courseId", this.f37776a);
        bundle.putString("courseTitle", this.f37777b);
        return bundle;
    }

    @Override // p040c4.InterfaceC1687l
    /* JADX INFO: renamed from: e */
    public final int mo483e() {
        return this.f37778c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6679f)) {
            return false;
        }
        C6679f c6679f = (C6679f) obj;
        return this.f37776a == c6679f.f37776a && C5207g.m11106a(this.f37777b, c6679f.f37777b);
    }

    public final int hashCode() {
        return this.f37777b.hashCode() + (Integer.hashCode(this.f37776a) * 31);
    }

    public final String toString() {
        return "ActionToCoursePlaylist(courseId=" + this.f37776a + ", courseTitle=" + this.f37777b + ")";
    }
}
