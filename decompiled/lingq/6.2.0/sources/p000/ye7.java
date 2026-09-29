package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.Triple;

/* JADX INFO: loaded from: classes3.dex */
public final class ye7 implements ze7 {

    /* JADX INFO: renamed from: a */
    public final boolean f69730a;

    /* JADX INFO: renamed from: b */
    public final boolean f69731b;

    /* JADX INFO: renamed from: c */
    public final boolean f69732c;

    /* JADX INFO: renamed from: d */
    public final boolean f69733d;

    /* JADX INFO: renamed from: e */
    public final int f69734e;

    /* JADX INFO: renamed from: f */
    public final boolean f69735f;

    /* JADX INFO: renamed from: g */
    public final boolean f69736g;

    /* JADX INFO: renamed from: h */
    public final String f69737h;

    /* JADX INFO: renamed from: i */
    public final boolean f69738i;

    /* JADX INFO: renamed from: j */
    public final String f69739j;

    /* JADX INFO: renamed from: k */
    public final Triple f69740k;

    /* JADX INFO: renamed from: l */
    public final Pair f69741l;

    /* JADX INFO: renamed from: m */
    public final hc7 f69742m;

    /* JADX INFO: renamed from: n */
    public final List f69743n;

    /* JADX INFO: renamed from: o */
    public final y25 f69744o;

    /* JADX INFO: renamed from: p */
    public final boolean f69745p;

    /* JADX INFO: renamed from: q */
    public final boolean f69746q;

    /* JADX INFO: renamed from: r */
    public final boolean f69747r;

    public ye7(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, boolean z6, String str, boolean z7, String str2, Triple triple, Pair pair, hc7 hc7Var, List list, y25 y25Var, boolean z8, boolean z9, boolean z10) {
        this.f69730a = z;
        this.f69731b = z2;
        this.f69732c = z3;
        this.f69733d = z4;
        this.f69734e = i;
        this.f69735f = z5;
        this.f69736g = z6;
        this.f69737h = str;
        this.f69738i = z7;
        this.f69739j = str2;
        this.f69740k = triple;
        this.f69741l = pair;
        this.f69742m = hc7Var;
        this.f69743n = list;
        this.f69744o = y25Var;
        this.f69745p = z8;
        this.f69746q = z9;
        this.f69747r = z10;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: a */
    public final boolean mo23857a() {
        return this.f69745p;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: b */
    public final boolean mo23858b() {
        return this.f69747r;
    }

    @Override // p000.ze7
    /* JADX INFO: renamed from: c */
    public final boolean mo23859c() {
        return this.f69746q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye7)) {
            return false;
        }
        ye7 ye7Var = (ye7) obj;
        return this.f69730a == ye7Var.f69730a && this.f69731b == ye7Var.f69731b && this.f69732c == ye7Var.f69732c && this.f69733d == ye7Var.f69733d && this.f69734e == ye7Var.f69734e && this.f69735f == ye7Var.f69735f && this.f69736g == ye7Var.f69736g && fa4.m11650l(this.f69737h, ye7Var.f69737h) && this.f69738i == ye7Var.f69738i && fa4.m11650l(this.f69739j, ye7Var.f69739j) && fa4.m11650l(this.f69740k, ye7Var.f69740k) && fa4.m11650l(this.f69741l, ye7Var.f69741l) && fa4.m11650l(this.f69742m, ye7Var.f69742m) && fa4.m11650l(this.f69743n, ye7Var.f69743n) && fa4.m11650l(this.f69744o, ye7Var.f69744o) && this.f69745p == ye7Var.f69745p && this.f69746q == ye7Var.f69746q && this.f69747r == ye7Var.f69747r;
    }

    public final int hashCode() {
        int iM12428e = g9a.m12428e(g9a.m12428e(wq1.m24106b(this.f69734e, g9a.m12428e(g9a.m12428e(g9a.m12428e(Boolean.hashCode(this.f69730a) * 31, 31, this.f69731b), 31, this.f69732c), 31, this.f69733d), 31), 31, this.f69735f), 31, this.f69736g);
        String str = this.f69737h;
        int iM12428e2 = g9a.m12428e((iM12428e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f69738i);
        String str2 = this.f69739j;
        int iHashCode = (iM12428e2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Triple triple = this.f69740k;
        int iHashCode2 = (iHashCode + (triple == null ? 0 : triple.hashCode())) * 31;
        Pair pair = this.f69741l;
        return Boolean.hashCode(this.f69747r) + g9a.m12428e(g9a.m12428e((this.f69744o.hashCode() + ux5.m22979b((this.f69742m.hashCode() + ((iHashCode2 + (pair != null ? pair.hashCode() : 0)) * 31)) * 31, 31, this.f69743n)) * 31, 31, this.f69745p), 31, this.f69746q);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("Success(isPlaying=", ", isEditing=", ", shouldDisableDownloads=", this.f69730a, this.f69731b);
        wq1.m24101A(sbM13357g, this.f69732c, ", deleteFiles=", this.f69733d, ", showGenerateAudioDialogForLesson=");
        hn1.m13368r(sbM13357g, this.f69734e, ", showTTSUnavailable=", this.f69735f, ", showPlayer=");
        hn1.m13367q(", videoUrl=", this.f69737h, ", autoPlay=", sbM13357g, this.f69736g);
        hn1.m13367q(", language=", this.f69739j, ", showBuyPremiumLesson=", sbM13357g, this.f69738i);
        sbM13357g.append(this.f69740k);
        sbM13357g.append(", showNotEnoughBalance=");
        sbM13357g.append(this.f69741l);
        sbM13357g.append(", playerState=");
        sbM13357g.append(this.f69742m);
        sbM13357g.append(", playlistLessons=");
        sbM13357g.append(this.f69743n);
        sbM13357g.append(", lessonInfoBottomSheet=");
        sbM13357g.append(this.f69744o);
        sbM13357g.append(", showArchiveConfirmation=");
        sbM13357g.append(this.f69745p);
        sbM13357g.append(", canArchivePlaylist=");
        return e65.m10875g(sbM13357g, this.f69746q, ", showArchiveError=", this.f69747r, ")");
    }
}
