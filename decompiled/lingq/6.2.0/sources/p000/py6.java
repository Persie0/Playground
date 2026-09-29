package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class py6 extends gz6 {

    /* JADX INFO: renamed from: c */
    public static final py6 f56998c = new py6(1, 0, 2);

    @Override // p000.gz6
    /* JADX INFO: renamed from: a */
    public final void mo3126a(pj3 pj3Var, InterfaceC3510qt interfaceC3510qt, fb9 fb9Var, v48 v48Var, hz6 hz6Var) {
        int[] iArr;
        oj3 oj3Var;
        int iM11729c;
        int iM19199e = pj3Var.m19199e(0);
        if (fb9Var.f38813n != 0) {
            cf1.m4605a("Cannot move a group while inserting");
        }
        if (iM19199e < 0) {
            cf1.m4605a("Parameter offset is out of bounds");
        }
        if (iM19199e == 0) {
            return;
        }
        int i = fb9Var.f38819t;
        int i2 = fb9Var.f38821v;
        int i3 = fb9Var.f38820u;
        int i4 = i;
        while (true) {
            iArr = fb9Var.f38801b;
            if (iM19199e <= 0) {
                break;
            }
            i4 += iArr[(fb9Var.m11743r(i4) * 5) + 3];
            if (i4 > i3) {
                cf1.m4605a("Parameter offset is out of bounds");
            }
            iM19199e--;
        }
        int i5 = iArr[(fb9Var.m11743r(i4) * 5) + 3];
        int iM11733g = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(fb9Var.f38819t));
        int iM11733g2 = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(i4));
        int i6 = i4 + i5;
        int iM11733g3 = fb9Var.m11733g(fb9Var.f38801b, fb9Var.m11743r(i6));
        int i7 = iM11733g3 - iM11733g2;
        fb9Var.m11749x(i7, Math.max(fb9Var.f38819t - 1, 0));
        fb9Var.m11748w(i5);
        int[] iArr2 = fb9Var.f38801b;
        int iM11743r = fb9Var.m11743r(i6) * 5;
        AbstractC3550rv.m20825S(fb9Var.m11743r(i) * 5, iM11743r, (i5 * 5) + iM11743r, iArr2, iArr2);
        if (i7 > 0) {
            Object[] objArr = fb9Var.f38802c;
            int iM11734h = fb9Var.m11734h(iM11733g2 + i7);
            System.arraycopy(objArr, iM11734h, objArr, iM11733g, fb9Var.m11734h(iM11733g3 + i7) - iM11734h);
        }
        int i8 = iM11733g2 + i7;
        int i9 = i8 - iM11733g;
        int i10 = fb9Var.f38810k;
        int i11 = fb9Var.f38811l;
        int length = fb9Var.f38802c.length;
        int i12 = fb9Var.f38812m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iM11743r2 = fb9Var.m11743r(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iM11743r2 * 5) + 4] = fb9.m11704i(fb9.m11704i(fb9Var.m11733g(iArr2, iM11743r2) - i15, i12 < iM11743r2 ? 0 : i10, i11, length), fb9Var.f38810k, fb9Var.f38811l, fb9Var.f38802c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iM11741p = fb9Var.m11741p();
        int iM11010a = eb9.m11010a(fb9Var.f38803d, i6, iM11741p);
        ArrayList arrayList = new ArrayList();
        if (iM11010a >= 0) {
            while (iM11010a < fb9Var.f38803d.size() && (iM11729c = fb9Var.m11729c((oj3Var = (oj3) fb9Var.f38803d.get(iM11010a)))) >= i6 && iM11729c < i16) {
                arrayList.add(oj3Var);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            oj3 oj3Var2 = (oj3) arrayList.get(i18);
            int iM11729c2 = fb9Var.m11729c(oj3Var2) + i17;
            if (iM11729c2 >= fb9Var.f38806g) {
                oj3Var2.f54459a = -(iM11741p - iM11729c2);
            } else {
                oj3Var2.f54459a = iM11729c2;
            }
            fb9Var.f38803d.add(eb9.m11010a(fb9Var.f38803d, iM11729c2, iM11741p), oj3Var2);
        }
        if (fb9Var.m11714I(i6, i5)) {
            cf1.m4605a("Unexpectedly removed anchors");
        }
        fb9Var.m11738m(i2, fb9Var.f38820u, i);
        if (i7 > 0) {
            fb9Var.m11715J(i8, i7, i6 - 1);
        }
    }
}
