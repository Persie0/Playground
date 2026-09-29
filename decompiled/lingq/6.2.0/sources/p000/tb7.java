package p000;

import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayingSource;

/* JADX INFO: loaded from: classes3.dex */
@ey8
public final class tb7 {

    /* JADX INFO: renamed from: a */
    public final int f62101a;

    /* JADX INFO: renamed from: b */
    public final String f62102b;

    /* JADX INFO: renamed from: c */
    public final String f62103c;

    /* JADX INFO: renamed from: d */
    public final String f62104d;

    /* JADX INFO: renamed from: e */
    public final String f62105e;

    /* JADX INFO: renamed from: f */
    public final int f62106f;

    /* JADX INFO: renamed from: g */
    public final String f62107g;

    /* JADX INFO: renamed from: h */
    public final boolean f62108h;

    /* JADX INFO: renamed from: i */
    public final int f62109i;

    /* JADX INFO: renamed from: j */
    public final String f62110j;

    /* JADX INFO: renamed from: k */
    public final PlayingSource f62111k;

    /* JADX INFO: renamed from: l */
    public final PlayerType f62112l;

    /* JADX INFO: renamed from: m */
    public final Double f62113m;

    /* JADX INFO: renamed from: n */
    public final Double f62114n;

    public tb7(int i, String str, String str2, String str3, String str4, int i2, String str5, boolean z, int i3, String str6, PlayingSource playingSource, PlayerType playerType, Double d, Double d2) {
        str2.getClass();
        str6.getClass();
        playingSource.getClass();
        playerType.getClass();
        this.f62101a = i;
        this.f62102b = str;
        this.f62103c = str2;
        this.f62104d = str3;
        this.f62105e = str4;
        this.f62106f = i2;
        this.f62107g = str5;
        this.f62108h = z;
        this.f62109i = i3;
        this.f62110j = str6;
        this.f62111k = playingSource;
        this.f62112l = playerType;
        this.f62113m = d;
        this.f62114n = d2;
    }

    /* JADX INFO: renamed from: a */
    public final String m21933a() {
        return this.f62102b;
    }

    /* JADX INFO: renamed from: b */
    public final int m21934b() {
        return this.f62109i;
    }

    /* JADX INFO: renamed from: c */
    public final String m21935c() {
        return this.f62105e;
    }

    /* JADX INFO: renamed from: d */
    public final int m21936d() {
        return this.f62106f;
    }

    /* JADX INFO: renamed from: e */
    public final PlayerType m21937e() {
        return this.f62112l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb7)) {
            return false;
        }
        tb7 tb7Var = (tb7) obj;
        return this.f62101a == tb7Var.f62101a && fa4.m11650l(this.f62102b, tb7Var.f62102b) && fa4.m11650l(this.f62103c, tb7Var.f62103c) && fa4.m11650l(this.f62104d, tb7Var.f62104d) && fa4.m11650l(this.f62105e, tb7Var.f62105e) && this.f62106f == tb7Var.f62106f && fa4.m11650l(this.f62107g, tb7Var.f62107g) && this.f62108h == tb7Var.f62108h && this.f62109i == tb7Var.f62109i && fa4.m11650l(this.f62110j, tb7Var.f62110j) && this.f62111k == tb7Var.f62111k && this.f62112l == tb7Var.f62112l && fa4.m11650l(this.f62113m, tb7Var.f62113m) && fa4.m11650l(this.f62114n, tb7Var.f62114n);
    }

    /* JADX INFO: renamed from: f */
    public final String m21938f() {
        return this.f62110j;
    }

    /* JADX INFO: renamed from: g */
    public final int m21939g() {
        return this.f62101a;
    }

    /* JADX INFO: renamed from: h */
    public final String m21940h() {
        return this.f62104d;
    }

    public final int hashCode() {
        int iHashCode = (this.f62112l.hashCode() + ((this.f62111k.hashCode() + ux5.m22980c(wq1.m24106b(this.f62109i, g9a.m12428e(ux5.m22980c(wq1.m24106b(this.f62106f, ux5.m22980c(ux5.m22980c(ux5.m22980c(ux5.m22980c(Integer.hashCode(this.f62101a) * 31, this.f62102b, 31), this.f62103c, 31), this.f62104d, 31), this.f62105e, 31), 31), this.f62107g, 31), 31, this.f62108h), 31), this.f62110j, 31)) * 31)) * 31;
        Double d = this.f62113m;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f62114n;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final String m21941i() {
        return this.f62103c;
    }

    /* JADX INFO: renamed from: j */
    public final PlayingSource m21942j() {
        return this.f62111k;
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f62101a, "PlayerContentItem(lessonId=", ", audio=", this.f62102b, ", lessonTitle=");
        AbstractC3393o1.m17725C(sbM22995r, this.f62103c, ", lessonLevel=", this.f62104d, ", courseTitle=");
        AbstractC3393o1.m17748w(this.f62106f, this.f62105e, ", duration=", ", imageUrl=", sbM22995r);
        ux5.m22976C(this.f62107g, ", isDownloaded=", ", courseId=", sbM22995r, this.f62108h);
        hn1.m13361k(this.f62109i, ", language=", this.f62110j, ", source=", sbM22995r);
        sbM22995r.append(this.f62111k);
        sbM22995r.append(", inPlaylistType=");
        sbM22995r.append(this.f62112l);
        sbM22995r.append(", audioStart=");
        sbM22995r.append(this.f62113m);
        sbM22995r.append(", audioEnd=");
        sbM22995r.append(this.f62114n);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }

    public /* synthetic */ tb7(int i, String str, String str2, String str3, String str4, int i2, String str5, boolean z, int i3, String str6, PlayingSource playingSource, PlayerType playerType, int i4) {
        this(i, str, str2, str3, str4, i2, str5, z, i3, str6, playingSource, (i4 & 2048) != 0 ? PlayerType.Undefined : playerType, null, null);
    }
}
