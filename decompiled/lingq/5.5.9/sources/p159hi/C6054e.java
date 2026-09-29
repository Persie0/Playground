package p159hi;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import dm.C5207g;
import java.util.List;
import p003a2.C0009a;

/* JADX INFO: renamed from: hi.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6054e implements InterfaceC6053d {

    /* JADX INFO: renamed from: a */
    public final String f35743a;

    /* JADX INFO: renamed from: b */
    public final List<TokenMeaning> f35744b;

    /* JADX INFO: renamed from: c */
    public final List<String> f35745c;

    /* JADX INFO: renamed from: d */
    public final List<String> f35746d;

    /* JADX INFO: renamed from: e */
    public final int f35747e;

    /* JADX INFO: renamed from: f */
    public final String f35748f;

    /* JADX INFO: renamed from: g */
    public final TokenReadings f35749g;

    public C6054e(String str, List list, List list2, List list3, int i10, String str2) {
        C5207g.m11111f(str, "term");
        C5207g.m11111f(list2, "tags");
        C5207g.m11111f(list3, "gTags");
        C5207g.m11111f(str2, "status");
        this.f35743a = str;
        this.f35744b = list;
        this.f35745c = list2;
        this.f35746d = list3;
        this.f35747e = i10;
        this.f35748f = str2;
        this.f35749g = null;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: a */
    public final List<TokenMeaning> mo12496a() {
        return this.f35744b;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: b */
    public final List<String> mo12497b() {
        return this.f35745c;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: c */
    public final String mo12498c() {
        return this.f35743a;
    }

    @Override // p159hi.InterfaceC6053d
    /* JADX INFO: renamed from: d */
    public final List<String> mo12499d() {
        return this.f35746d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6054e)) {
            return false;
        }
        C6054e c6054e = (C6054e) obj;
        if (C5207g.m11106a(this.f35743a, c6054e.f35743a) && C5207g.m11106a(this.f35744b, c6054e.f35744b) && C5207g.m11106a(this.f35745c, c6054e.f35745c) && C5207g.m11106a(this.f35746d, c6054e.f35746d) && this.f35747e == c6054e.f35747e && C5207g.m11106a(this.f35748f, c6054e.f35748f) && C5207g.m11106a(this.f35749g, c6054e.f35749g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f35748f, C0009a.m16d(this.f35747e, C0204c.m848g(this.f35746d, C0204c.m848g(this.f35745c, C0204c.m848g(this.f35744b, this.f35743a.hashCode() * 31, 31), 31), 31), 31), 31);
        TokenReadings tokenReadings = this.f35749g;
        return iM758d + (tokenReadings == null ? 0 : tokenReadings.hashCode());
    }

    public final String toString() {
        return "LessonTextWord(term=" + this.f35743a + ", meanings=" + this.f35744b + ", tags=" + this.f35745c + ", gTags=" + this.f35746d + ", id=" + this.f35747e + ", status=" + this.f35748f + ", readings=" + this.f35749g + ")";
    }
}
