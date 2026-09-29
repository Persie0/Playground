package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.library.CollectionLoadingItemType;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e8d {
    /* JADX INFO: renamed from: a */
    public static final void m10942a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2111711819);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            r46.m20381f(null, null, null, null, oob.f54662b, tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 7);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m10943b(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1945593784);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            r46.m20381f(null, null, null, null, oob.f54661a, tj3Var, 24576, 15);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 8);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m10944c(CollectionLoadingItemType collectionLoadingItemType, ye1 ye1Var, int i) {
        int i2;
        collectionLoadingItemType.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1723378927);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22116e(collectionLoadingItemType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            int i4 = j81.f45176a[collectionLoadingItemType.ordinal()];
            if (i4 == 1) {
                tj3Var.m22111b0(-1690223444);
                m10943b(tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                if (i4 != 2) {
                    throw ux5.m23001x(tj3Var, -1690225162, false);
                }
                tj3Var.m22111b0(-1690221076);
                m10942a(tj3Var, 0);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zr0(collectionLoadingItemType, i, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m10945d(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(80359787);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            zf1 zf1Var = ge9.f40637a;
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52817l, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 20.0f);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            qh0.m19963a(x74.m24341H(pb1.m19045o(c99.m4414g(e16VarM4426s, 12.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e)), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 6);
        }
    }

    /* JADX INFO: renamed from: e */
    public static fs6 m10946e() {
        return l7a.f49255e;
    }
}
