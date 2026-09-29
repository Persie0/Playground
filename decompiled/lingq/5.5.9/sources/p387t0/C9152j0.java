package p387t0;

import android.support.v4.media.C0141b;
import androidx.activity.result.C0204c;
import p338qd.C8584v;
import p375s0.C8941c;

/* JADX INFO: renamed from: t0.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9152j0 {

    /* JADX INFO: renamed from: d */
    public static final C9152j0 f47679d = new C9152j0(C8584v.m16784i(4278190080L), C8941c.f46888b, 0.0f);

    /* JADX INFO: renamed from: a */
    public final long f47680a;

    /* JADX INFO: renamed from: b */
    public final long f47681b;

    /* JADX INFO: renamed from: c */
    public final float f47682c;

    public C9152j0(long j10, long j11, float f3) {
        this.f47680a = j10;
        this.f47681b = j11;
        this.f47682c = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9152j0)) {
            return false;
        }
        C9152j0 c9152j0 = (C9152j0) obj;
        if (C9169u.m17497c(this.f47680a, c9152j0.f47680a) && C8941c.m17162a(this.f47681b, c9152j0.f47681b)) {
            return (this.f47682c > c9152j0.f47682c ? 1 : (this.f47682c == c9152j0.f47682c ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = C9169u.f47704g;
        return Float.hashCode(this.f47682c) + C0204c.m847f(this.f47681b, Long.hashCode(this.f47680a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Shadow(color=");
        sb2.append((Object) C9169u.m17503i(this.f47680a));
        sb2.append(", offset=");
        sb2.append((Object) C8941c.m17169h(this.f47681b));
        sb2.append(", blurRadius=");
        return C0141b.m612h(sb2, this.f47682c, ')');
    }
}
