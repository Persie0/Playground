package p000;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class rw9 {

    /* JADX INFO: renamed from: a */
    public final qw9 f59975a;

    /* JADX INFO: renamed from: b */
    public final w46 f59976b;

    /* JADX INFO: renamed from: c */
    public final long f59977c;

    /* JADX INFO: renamed from: d */
    public final float f59978d;

    /* JADX INFO: renamed from: e */
    public final float f59979e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f59980f;

    public rw9(qw9 qw9Var, w46 w46Var, long j) {
        this.f59975a = qw9Var;
        this.f59976b = w46Var;
        this.f59977c = j;
        ArrayList arrayList = w46Var.f66383h;
        float fM19547d = 0.0f;
        this.f59978d = arrayList.isEmpty() ? 0.0f : ((f37) arrayList.get(0)).f38358a.f49728d.m19547d(0);
        if (!arrayList.isEmpty()) {
            f37 f37Var = (f37) u91.m22597O0(arrayList);
            pw9 pw9Var = f37Var.f38358a.f49728d;
            fM19547d = pw9Var.m19547d(pw9Var.f56920g - 1) + f37Var.f38363f;
        }
        this.f59979e = fM19547d;
        this.f59980f = w46Var.f66382g;
    }

    /* JADX INFO: renamed from: a */
    public final ResolvedTextDirection m20954a(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23749l(i);
        int length = ((C3419on) w46Var.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(i == length ? vz1.m23602H(arrayList) : ci8.m4737v(i, arrayList));
        return f37Var.f38358a.f49728d.f56919f.isRtlCharAt(f37Var.m11527d(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    /* JADX INFO: renamed from: b */
    public final e28 m20955b(int i) {
        float fM19554k;
        float fM19554k2;
        float fM19553j;
        float fM19553j2;
        w46 w46Var = this.f59976b;
        w46Var.m23748k(i);
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4737v(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int iM11527d = f37Var.m11527d(i);
        CharSequence charSequence = c3300lj.f49729e;
        if (iM11527d < 0 || iM11527d >= charSequence.length()) {
            StringBuilder sbM22998u = ux5.m22998u("offset(", iM11527d, ") is out of bounds [0,");
            sbM22998u.append(charSequence.length());
            sbM22998u.append(')');
            j54.m14288a(sbM22998u.toString());
        }
        pw9 pw9Var = c3300lj.f49728d;
        int iM19550g = pw9Var.m19550g(iM11527d);
        float fM19552i = pw9Var.m19552i(iM19550g);
        float fM19548e = pw9Var.m19548e(iM19550g);
        Layout layout = pw9Var.f56919f;
        boolean z = layout.getParagraphDirection(iM19550g) == 1;
        boolean zIsRtlCharAt = layout.isRtlCharAt(iM11527d);
        if (!z || zIsRtlCharAt) {
            if (z && zIsRtlCharAt) {
                fM19553j = pw9Var.m19554k(iM11527d, false);
                fM19553j2 = pw9Var.m19554k(iM11527d + 1, true);
            } else if (zIsRtlCharAt) {
                fM19553j = pw9Var.m19553j(iM11527d, false);
                fM19553j2 = pw9Var.m19553j(iM11527d + 1, true);
            } else {
                fM19554k = pw9Var.m19554k(iM11527d, false);
                fM19554k2 = pw9Var.m19554k(iM11527d + 1, true);
            }
            float f = fM19553j;
            fM19554k = fM19553j2;
            fM19554k2 = f;
        } else {
            fM19554k = pw9Var.m19553j(iM11527d, false);
            fM19554k2 = pw9Var.m19553j(iM11527d + 1, true);
        }
        RectF rectF = new RectF(fM19554k, fM19552i, fM19554k2, fM19548e);
        return f37Var.m11524a(new e28(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    /* JADX INFO: renamed from: c */
    public final e28 m20956c(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23749l(i);
        int length = ((C3419on) w46Var.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(i == length ? vz1.m23602H(arrayList) : ci8.m4737v(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int iM11527d = f37Var.m11527d(i);
        CharSequence charSequence = c3300lj.f49729e;
        pw9 pw9Var = c3300lj.f49728d;
        if (iM11527d < 0 || iM11527d > charSequence.length()) {
            StringBuilder sbM22998u = ux5.m22998u("offset(", iM11527d, ") is out of bounds [0,");
            sbM22998u.append(charSequence.length());
            sbM22998u.append(']');
            j54.m14288a(sbM22998u.toString());
        }
        float fM19553j = pw9Var.m19553j(iM11527d, false);
        int iM19550g = pw9Var.m19550g(iM11527d);
        return f37Var.m11524a(new e28(fM19553j, pw9Var.m19552i(iM19550g), fM19553j, pw9Var.m19548e(iM19550g)));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m20957d() {
        long j = this.f59977c;
        float f = (int) (j >> 32);
        w46 w46Var = this.f59976b;
        return f < w46Var.f66379d || w46Var.f66378c || ((float) ((int) (j & 4294967295L))) < w46Var.f66380e;
    }

    /* JADX INFO: renamed from: e */
    public final float m20958e(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23750m(i);
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int i2 = i - f37Var.f38361d;
        pw9 pw9Var = c3300lj.f49728d;
        return pw9Var.f56919f.getLineLeft(i2) + (i2 == pw9Var.f56920g + (-1) ? pw9Var.f56923j : 0.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rw9) {
            rw9 rw9Var = (rw9) obj;
            if (fa4.m11650l(this.f59975a, rw9Var.f59975a) && this.f59976b == rw9Var.f59976b && n84.m17279a(this.f59977c, rw9Var.f59977c) && this.f59978d == rw9Var.f59978d && this.f59979e == rw9Var.f59979e && fa4.m11650l(this.f59980f, rw9Var.f59980f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final float m20959f(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23750m(i);
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int i2 = i - f37Var.f38361d;
        pw9 pw9Var = c3300lj.f49728d;
        return pw9Var.f56919f.getLineRight(i2) + (i2 == pw9Var.f56920g + (-1) ? pw9Var.f56924k : 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public final int m20960g(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23750m(i);
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(ci8.m4738w(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        return c3300lj.f49728d.f56919f.getLineStart(i - f37Var.f38361d) + f37Var.f38359b;
    }

    /* JADX INFO: renamed from: h */
    public final ResolvedTextDirection m20961h(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23749l(i);
        int length = ((C3419on) w46Var.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(i == length ? vz1.m23602H(arrayList) : ci8.m4737v(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int iM11527d = f37Var.m11527d(i);
        pw9 pw9Var = c3300lj.f49728d;
        return pw9Var.f56919f.getParagraphDirection(pw9Var.m19550g(iM11527d)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final int hashCode() {
        return this.f59980f.hashCode() + wq1.m24105a(wq1.m24105a(ux5.m22981d(this.f59977c, (this.f59976b.hashCode() + (this.f59975a.hashCode() * 31)) * 31, 31), this.f59978d, 31), this.f59979e, 31);
    }

    /* JADX INFO: renamed from: i */
    public final C3500qj m20962i(int i, int i2) {
        w46 w46Var = this.f59976b;
        C3419on c3419on = (C3419on) w46Var.f66376a.f66365a;
        if (i < 0 || i > i2 || i2 > c3419on.f54604b.length()) {
            StringBuilder sbM22994q = ux5.m22994q(i, i2, "Start(", ") or End(", ") is out of range [0..");
            sbM22994q.append(c3419on.f54604b.length());
            sbM22994q.append("), or start > end!");
            j54.m14288a(sbM22994q.toString());
        }
        if (i == i2) {
            return AbstractC3650uj.m22757a();
        }
        C3500qj c3500qjM22757a = AbstractC3650uj.m22757a();
        ci8.m4740y(w46Var.f66383h, eh0.m11127g(i, i2), new s64(c3500qjM22757a, i, i2, 3));
        return c3500qjM22757a;
    }

    /* JADX INFO: renamed from: j */
    public final long m20963j(int i) {
        int iM12639r;
        int iM12634m;
        int iM12634m2;
        w46 w46Var = this.f59976b;
        w46Var.m23749l(i);
        int length = ((C3419on) w46Var.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(i == length ? vz1.m23602H(arrayList) : ci8.m4737v(i, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int iM11527d = f37Var.m11527d(i);
        gh1 gh1VarM19555l = c3300lj.f49728d.m19555l();
        if (gh1VarM19555l.m12633l(gh1VarM19555l.m12639r(iM11527d))) {
            gh1VarM19555l.m12623b(iM11527d);
            iM12639r = iM11527d;
            while (iM12639r != -1 && (!gh1VarM19555l.m12633l(iM12639r) || gh1VarM19555l.m12629h(iM12639r))) {
                iM12639r = gh1VarM19555l.m12639r(iM12639r);
            }
        } else {
            gh1VarM19555l.m12623b(iM11527d);
            if (gh1VarM19555l.m12632k(iM11527d)) {
                iM12639r = (!gh1VarM19555l.m12630i(iM11527d) || gh1VarM19555l.m12628g(iM11527d)) ? gh1VarM19555l.m12639r(iM11527d) : iM11527d;
            } else {
                iM12639r = gh1VarM19555l.m12628g(iM11527d) ? gh1VarM19555l.m12639r(iM11527d) : -1;
            }
        }
        if (iM12639r == -1) {
            iM12639r = iM11527d;
        }
        if (gh1VarM19555l.m12629h(gh1VarM19555l.m12634m(iM11527d))) {
            gh1VarM19555l.m12623b(iM11527d);
            iM12634m = iM11527d;
            while (iM12634m != -1 && (gh1VarM19555l.m12633l(iM12634m) || !gh1VarM19555l.m12629h(iM12634m))) {
                iM12634m = gh1VarM19555l.m12634m(iM12634m);
            }
        } else {
            gh1VarM19555l.m12623b(iM11527d);
            if (gh1VarM19555l.m12628g(iM11527d)) {
                if (!gh1VarM19555l.m12630i(iM11527d) || gh1VarM19555l.m12632k(iM11527d)) {
                    iM12634m2 = gh1VarM19555l.m12634m(iM11527d);
                    iM12634m = iM12634m2;
                } else {
                    iM12634m = iM11527d;
                }
            } else if (gh1VarM19555l.m12632k(iM11527d)) {
                iM12634m2 = gh1VarM19555l.m12634m(iM11527d);
                iM12634m = iM12634m2;
            } else {
                iM12634m = -1;
            }
        }
        if (iM12634m != -1) {
            iM11527d = iM12634m;
        }
        return f37Var.m11525b(eh0.m11127g(iM12639r, iM11527d), false);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m20964k(int i) {
        w46 w46Var = this.f59976b;
        w46Var.m23750m(i);
        ArrayList arrayList = w46Var.f66383h;
        Layout layout = ((f37) arrayList.get(ci8.m4738w(i, arrayList))).f38358a.f49728d.f56919f;
        ThreadLocal threadLocal = tw9.f63022a;
        return layout.getEllipsisCount(i) > 0;
    }

    public final String toString() {
        return "TextLayoutResult(layoutInput=" + this.f59975a + ", multiParagraph=" + this.f59976b + ", size=" + ((Object) n84.m17280b(this.f59977c)) + ", firstBaseline=" + this.f59978d + ", lastBaseline=" + this.f59979e + ", placeholderRects=" + this.f59980f + ')';
    }
}
