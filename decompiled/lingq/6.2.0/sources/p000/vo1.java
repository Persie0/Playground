package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* JADX INFO: loaded from: classes3.dex */
public final class vo1 implements wo1 {

    /* JADX INFO: renamed from: a */
    public final boolean f65690a;

    /* JADX INFO: renamed from: b */
    public final int f65691b;

    /* JADX INFO: renamed from: c */
    public final boolean f65692c;

    /* JADX INFO: renamed from: d */
    public final boolean f65693d;

    /* JADX INFO: renamed from: e */
    public final String f65694e;

    /* JADX INFO: renamed from: f */
    public final boolean f65695f;

    /* JADX INFO: renamed from: g */
    public final String f65696g;

    /* JADX INFO: renamed from: h */
    public final Triple f65697h;

    /* JADX INFO: renamed from: i */
    public final Pair f65698i;

    /* JADX INFO: renamed from: j */
    public final hc7 f65699j;

    /* JADX INFO: renamed from: k */
    public final List f65700k;

    /* JADX INFO: renamed from: l */
    public final y25 f65701l;

    public vo1(boolean z, int i, boolean z2, boolean z3, String str, boolean z4, String str2, Triple triple, Pair pair, hc7 hc7Var, List list, y25 y25Var) {
        this.f65690a = z;
        this.f65691b = i;
        this.f65692c = z2;
        this.f65693d = z3;
        this.f65694e = str;
        this.f65695f = z4;
        this.f65696g = str2;
        this.f65697h = triple;
        this.f65698i = pair;
        this.f65699j = hc7Var;
        this.f65700k = list;
        this.f65701l = y25Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo1)) {
            return false;
        }
        vo1 vo1Var = (vo1) obj;
        return this.f65690a == vo1Var.f65690a && this.f65691b == vo1Var.f65691b && this.f65692c == vo1Var.f65692c && this.f65693d == vo1Var.f65693d && fa4.m11650l(this.f65694e, vo1Var.f65694e) && this.f65695f == vo1Var.f65695f && fa4.m11650l(this.f65696g, vo1Var.f65696g) && fa4.m11650l(this.f65697h, vo1Var.f65697h) && fa4.m11650l(this.f65698i, vo1Var.f65698i) && this.f65699j.equals(vo1Var.f65699j) && this.f65700k.equals(vo1Var.f65700k) && this.f65701l.equals(vo1Var.f65701l);
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f65691b, Boolean.hashCode(this.f65690a) * 31, 31), 31, this.f65692c), 31, this.f65693d);
        String str = this.f65694e;
        int iM12428e2 = g9a.m12428e((iM12428e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f65695f);
        String str2 = this.f65696g;
        int iHashCode = (iM12428e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Triple triple = this.f65697h;
        int iHashCode2 = (iHashCode + (triple == null ? 0 : triple.hashCode())) * 31;
        Pair pair = this.f65698i;
        return this.f65701l.hashCode() + ux5.m22979b((this.f65699j.hashCode() + ((iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31)) * 31, 31, this.f65700k);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(isPlaying=");
        sb.append(this.f65690a);
        sb.append(", showGenerateAudioDialogForLesson=");
        sb.append(this.f65691b);
        sb.append(", showPlayer=");
        wq1.m24101A(sb, this.f65692c, ", showTTSUnavailable=", this.f65693d, ", videoUrl=");
        ux5.m22976C(this.f65694e, ", autoPlay=", ", language=", sb, this.f65695f);
        sb.append(this.f65696g);
        sb.append(", showBuyPremiumLesson=");
        sb.append(this.f65697h);
        sb.append(", showNotEnoughBalance=");
        sb.append(this.f65698i);
        sb.append(", playerState=");
        sb.append(this.f65699j);
        sb.append(", playlistLessons=");
        sb.append(this.f65700k);
        sb.append(", lessonInfoBottomSheet=");
        sb.append(this.f65701l);
        sb.append(")");
        return sb.toString();
    }
}
