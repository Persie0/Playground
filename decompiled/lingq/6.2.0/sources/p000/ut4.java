package p000;

import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.lazy.layout.C0135d;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ut4 {

    /* JADX INFO: renamed from: b */
    public bk1 f64328b;

    /* JADX INFO: renamed from: c */
    public int f64329c;

    /* JADX INFO: renamed from: d */
    public int f64330d;

    /* JADX INFO: renamed from: f */
    public int f64332f;

    /* JADX INFO: renamed from: g */
    public int f64333g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0135d f64334h;

    /* JADX INFO: renamed from: a */
    public C0134c[] f64327a = vz1.f66108b;

    /* JADX INFO: renamed from: e */
    public int f64331e = 1;

    public ut4(C0135d c0135d) {
        this.f64334h = c0135d;
    }

    /* JADX INFO: renamed from: b */
    public static void m22909b(ut4 ut4Var, du4 du4Var, un1 un1Var, qp3 qp3Var, int i, int i2, boolean z) {
        ut4Var.f64334h.getClass();
        long jMo10673g = du4Var.mo10673g(0);
        ut4Var.m22910a(du4Var, un1Var, qp3Var, i, i2, (int) (!z ? jMo10673g & 4294967295L : jMo10673g >> 32));
    }

    /* JADX INFO: renamed from: a */
    public final void m22910a(du4 du4Var, un1 un1Var, qp3 qp3Var, int i, int i2, int i3) {
        C0134c[] c0134cArr;
        C0134c[] c0134cArr2 = this.f64327a;
        int length = c0134cArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.f64332f = i;
                this.f64333g = i2;
                break;
            } else {
                C0134c c0134c = c0134cArr2[i4];
                if (c0134c != null && c0134c.f2542g) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        int size = du4Var.mo10671e().size();
        int length2 = this.f64327a.length;
        while (true) {
            c0134cArr = this.f64327a;
            if (size >= length2) {
                break;
            }
            C0134c c0134c2 = c0134cArr[size];
            if (c0134c2 != null) {
                c0134c2.m1002d();
            }
            size++;
        }
        if (c0134cArr.length != du4Var.mo10671e().size()) {
            this.f64327a = (C0134c[]) Arrays.copyOf(this.f64327a, du4Var.mo10671e().size());
        }
        this.f64328b = new bk1(du4Var.mo10670d());
        this.f64329c = i3;
        this.f64330d = du4Var.mo10674h();
        this.f64331e = du4Var.mo10668b();
        int size2 = du4Var.mo10671e().size();
        for (int i5 = 0; i5 < size2; i5++) {
            Object objMo1509A = ((l87) du4Var.mo10671e().get(i5)).mo1509A();
            it4 it4Var = objMo1509A instanceof it4 ? (it4) objMo1509A : null;
            C0134c[] c0134cArr3 = this.f64327a;
            if (it4Var == null) {
                C0134c c0134c3 = c0134cArr3[i5];
                if (c0134c3 != null) {
                    c0134c3.m1002d();
                }
                this.f64327a[i5] = null;
            } else {
                C0134c c0134c4 = c0134cArr3[i5];
                if (c0134c4 == null) {
                    c0134c4 = new C0134c(un1Var, qp3Var, new C3757xf(this.f64334h, 18));
                    this.f64327a[i5] = c0134c4;
                }
                c0134c4.f2539d = it4Var.f44530J;
                c0134c4.f2540e = it4Var.f44531K;
                c0134c4.f2541f = it4Var.f44532L;
            }
        }
    }
}
