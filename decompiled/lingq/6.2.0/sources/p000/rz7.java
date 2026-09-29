package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class rz7 {

    /* JADX INFO: renamed from: a */
    public final boolean f60087a;

    /* JADX INFO: renamed from: b */
    public final boolean f60088b;

    /* JADX INFO: renamed from: c */
    public final boolean f60089c;

    /* JADX INFO: renamed from: d */
    public final Map f60090d;

    /* JADX INFO: renamed from: e */
    public final Map f60091e;

    public rz7(boolean z, boolean z2, boolean z3, Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.f60087a = z;
        this.f60088b = z2;
        this.f60089c = z3;
        this.f60090d = map;
        this.f60091e = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz7)) {
            return false;
        }
        rz7 rz7Var = (rz7) obj;
        return this.f60087a == rz7Var.f60087a && this.f60088b == rz7Var.f60088b && this.f60089c == rz7Var.f60089c && fa4.m11650l(this.f60090d, rz7Var.f60090d) && fa4.m11650l(this.f60091e, rz7Var.f60091e);
    }

    public final int hashCode() {
        return this.f60091e.hashCode() + e65.m10869a(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f60087a) * 31, 31, this.f60088b), 31, this.f60089c), 31, this.f60090d);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("BaseTtsPrefs(autoTts=", ", stopAudio=", ", useWeb=", this.f60087a, this.f60088b);
        sbM13357g.append(this.f60089c);
        sbM13357g.append(", voiceNames=");
        sbM13357g.append(this.f60090d);
        sbM13357g.append(", localVoice=");
        sbM13357g.append(this.f60091e);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }
}
