package ki;

import android.support.v4.media.session.C0166e;
import dm.C5207g;

/* JADX INFO: renamed from: ki.c */
/* JADX INFO: loaded from: classes.dex */
public final class C6697c {

    /* JADX INFO: renamed from: a */
    public final int f37856a;

    /* JADX INFO: renamed from: b */
    public final String f37857b;

    /* JADX INFO: renamed from: c */
    public final String f37858c;

    /* JADX INFO: renamed from: d */
    public final int f37859d;

    /* JADX INFO: renamed from: e */
    public final String f37860e;

    /* JADX INFO: renamed from: f */
    public final String f37861f;

    /* JADX INFO: renamed from: g */
    public final String f37862g;

    /* JADX INFO: renamed from: h */
    public final String f37863h;

    /* JADX INFO: renamed from: i */
    public final String f37864i;

    /* JADX INFO: renamed from: j */
    public final int f37865j;

    /* JADX INFO: renamed from: k */
    public final Double f37866k;

    /* JADX INFO: renamed from: l */
    public final Integer f37867l;

    /* JADX INFO: renamed from: m */
    public final int f37868m;

    /* JADX INFO: renamed from: n */
    public final String f37869n;

    /* JADX INFO: renamed from: o */
    public final String f37870o;

    /* JADX INFO: renamed from: p */
    public final Integer f37871p;

    /* JADX INFO: renamed from: q */
    public final boolean f37872q;

    /* JADX INFO: renamed from: r */
    public final boolean f37873r;

    /* JADX INFO: renamed from: s */
    public final int f37874s;

    public C6697c(int i10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, int i12, Double d10, Integer num, int i13, String str8, String str9, Integer num2, boolean z10, boolean z11, int i14) {
        C5207g.m11111f(str6, "title");
        this.f37856a = i10;
        this.f37857b = str;
        this.f37858c = str2;
        this.f37859d = i11;
        this.f37860e = str3;
        this.f37861f = str4;
        this.f37862g = str5;
        this.f37863h = str6;
        this.f37864i = str7;
        this.f37865j = i12;
        this.f37866k = d10;
        this.f37867l = num;
        this.f37868m = i13;
        this.f37869n = str8;
        this.f37870o = str9;
        this.f37871p = num2;
        this.f37872q = z10;
        this.f37873r = z11;
        this.f37874s = i14;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    public final boolean equals(Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (!C5207g.m11106a(C6697c.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C5207g.m11109d(obj, "null cannot be cast to non-null type com.lingq.shared.uimodel.playlist.PlaylistLesson");
        C6697c c6697c = (C6697c) obj;
        if (this.f37856a == c6697c.f37856a && C5207g.m11106a(this.f37857b, c6697c.f37857b)) {
            Double d10 = this.f37866k;
            Double d11 = c6697c.f37866k;
            if (d10 == null) {
                if (d11 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else if (d11 == null || d10.doubleValue() != d11.doubleValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
            return z10 && C5207g.m11106a(this.f37871p, c6697c.f37871p) && C5207g.m11106a(this.f37867l, c6697c.f37867l);
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f37856a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaylistLesson(id=");
        sb2.append(this.f37856a);
        sb2.append(", url=");
        sb2.append(this.f37857b);
        sb2.append(", description=");
        sb2.append(this.f37858c);
        sb2.append(", pos=");
        sb2.append(this.f37859d);
        sb2.append(", originalImageUrl=");
        sb2.append(this.f37860e);
        sb2.append(", imageUrl=");
        sb2.append(this.f37861f);
        sb2.append(", language=");
        sb2.append(this.f37862g);
        sb2.append(", title=");
        sb2.append(this.f37863h);
        sb2.append(", collectionTitle=");
        sb2.append(this.f37864i);
        sb2.append(", collectionId=");
        sb2.append(this.f37865j);
        sb2.append(", listenTimes=");
        sb2.append(this.f37866k);
        sb2.append(", progressDownloaded=");
        sb2.append(this.f37867l);
        sb2.append(", duration=");
        sb2.append(this.f37868m);
        sb2.append(", audioUrl=");
        sb2.append(this.f37869n);
        sb2.append(", videoUrl=");
        sb2.append(this.f37870o);
        sb2.append(", playlistLessonOrder=");
        sb2.append(this.f37871p);
        sb2.append(", isCourse=");
        sb2.append(this.f37872q);
        sb2.append(", isCourseLesson=");
        sb2.append(this.f37873r);
        sb2.append(", price=");
        return C0166e.m768o(sb2, this.f37874s, ")");
    }
}
