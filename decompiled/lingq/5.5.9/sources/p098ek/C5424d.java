package p098ek;

import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import p470x1.C10017e;

/* JADX INFO: renamed from: ek.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C5424d {

    /* JADX INFO: renamed from: a */
    public final float f33951a = 8;

    /* JADX INFO: renamed from: b */
    public final float f33952b = 0;

    /* JADX INFO: renamed from: c */
    public final float f33953c = 2;

    /* JADX INFO: renamed from: d */
    public final float f33954d = 4;

    /* JADX INFO: renamed from: e */
    public final float f33955e = 12;

    /* JADX INFO: renamed from: f */
    public final float f33956f = 16;

    /* JADX INFO: renamed from: g */
    public final float f33957g = 24;

    /* JADX INFO: renamed from: h */
    public final float f33958h = 16;

    /* JADX INFO: renamed from: i */
    public final float f33959i = 32;

    /* JADX INFO: renamed from: j */
    public final float f33960j = 8;

    /* JADX INFO: renamed from: k */
    public final float f33961k = 16;

    /* JADX INFO: renamed from: l */
    public final float f33962l = 8;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5424d)) {
            return false;
        }
        C5424d c5424d = (C5424d) obj;
        return C10017e.m18618a(this.f33951a, c5424d.f33951a) && C10017e.m18618a(this.f33952b, c5424d.f33952b) && C10017e.m18618a(this.f33953c, c5424d.f33953c) && C10017e.m18618a(this.f33954d, c5424d.f33954d) && C10017e.m18618a(this.f33955e, c5424d.f33955e) && C10017e.m18618a(this.f33956f, c5424d.f33956f) && C10017e.m18618a(this.f33957g, c5424d.f33957g) && C10017e.m18618a(this.f33958h, c5424d.f33958h) && C10017e.m18618a(this.f33959i, c5424d.f33959i) && C10017e.m18618a(this.f33960j, c5424d.f33960j) && C10017e.m18618a(this.f33961k, c5424d.f33961k) && C10017e.m18618a(this.f33962l, c5424d.f33962l);
    }

    public final int hashCode() {
        return Float.hashCode(this.f33962l) + C0204c.m846e(this.f33961k, C0204c.m846e(this.f33960j, C0204c.m846e(this.f33959i, C0204c.m846e(this.f33958h, C0204c.m846e(this.f33957g, C0204c.m846e(this.f33956f, C0204c.m846e(this.f33955e, C0204c.m846e(this.f33954d, C0204c.m846e(this.f33953c, C0204c.m846e(this.f33952b, Float.hashCode(this.f33951a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        String strM18619f = C10017e.m18619f(this.f33951a);
        String strM18619f2 = C10017e.m18619f(this.f33952b);
        String strM18619f3 = C10017e.m18619f(this.f33953c);
        String strM18619f4 = C10017e.m18619f(this.f33954d);
        String strM18619f5 = C10017e.m18619f(this.f33955e);
        String strM18619f6 = C10017e.m18619f(this.f33956f);
        String strM18619f7 = C10017e.m18619f(this.f33957g);
        String strM18619f8 = C10017e.m18619f(this.f33958h);
        String strM18619f9 = C10017e.m18619f(this.f33959i);
        String strM18619f10 = C10017e.m18619f(this.f33960j);
        String strM18619f11 = C10017e.m18619f(this.f33961k);
        String strM18619f12 = C10017e.m18619f(this.f33962l);
        StringBuilder sbM855o = C0204c.m855o("Spacing(default=", strM18619f, ", none=", strM18619f2, ", extraSmall=");
        C0166e.m777x(sbM855o, strM18619f3, ", small=", strM18619f4, ", large=");
        C0166e.m777x(sbM855o, strM18619f5, ", extraLarge=", strM18619f6, ", superLarge=");
        C0166e.m777x(sbM855o, strM18619f7, ", screenStandardPadding=", strM18619f8, ", screenExtraPadding=");
        C0166e.m777x(sbM855o, strM18619f9, ", listVerticalPadding=", strM18619f10, ", listExtraVerticalPadding=");
        sbM855o.append(strM18619f11);
        sbM855o.append(", listHorizontalPadding=");
        sbM855o.append(strM18619f12);
        sbM855o.append(")");
        return sbM855o.toString();
    }
}
