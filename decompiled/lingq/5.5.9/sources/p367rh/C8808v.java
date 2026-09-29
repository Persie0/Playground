package p367rh;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.entity.Meaning;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: rh.v */
/* JADX INFO: loaded from: classes.dex */
public final class C8808v {

    /* JADX INFO: renamed from: a */
    public final String f46683a;

    /* JADX INFO: renamed from: b */
    public final int f46684b;

    /* JADX INFO: renamed from: c */
    public final int f46685c;

    /* JADX INFO: renamed from: d */
    public String f46686d;

    /* JADX INFO: renamed from: e */
    public final List<String> f46687e;

    /* JADX INFO: renamed from: f */
    public List<Meaning> f46688f;

    public C8808v(String str, int i10, int i11, String str2, List<String> list, List<Meaning> list2) {
        C5207g.m11111f(str, "termWithLanguage");
        C5207g.m11111f(str2, "status");
        C5207g.m11111f(list, "tags");
        this.f46683a = str;
        this.f46684b = i10;
        this.f46685c = i11;
        this.f46686d = str2;
        this.f46687e = list;
        this.f46688f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8808v)) {
            return false;
        }
        C8808v c8808v = (C8808v) obj;
        return C5207g.m11106a(this.f46683a, c8808v.f46683a) && this.f46684b == c8808v.f46684b && this.f46685c == c8808v.f46685c && C5207g.m11106a(this.f46686d, c8808v.f46686d) && C5207g.m11106a(this.f46687e, c8808v.f46687e) && C5207g.m11106a(this.f46688f, c8808v.f46688f);
    }

    public final int hashCode() {
        return this.f46688f.hashCode() + C0204c.m848g(this.f46687e, C0166e.m758d(this.f46686d, C0009a.m16d(this.f46685c, C0009a.m16d(this.f46684b, this.f46683a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        return "UpdateWord(termWithLanguage=" + this.f46683a + ", id=" + this.f46684b + ", importance=" + this.f46685c + ", status=" + this.f46686d + ", tags=" + this.f46687e + ", meanings=" + this.f46688f + ")";
    }
}
