package p000;

import androidx.compose.foundation.lazy.C0127b;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.player.data.PlayerType;
import com.lingq.feature.playlist.AbstractC2253c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lo1 implements aj3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ t66 f49907H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Object f49908I;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49909a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fe9 f49910b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0127b f49911c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CoursePlaylistSort f49912d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f49913e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ wo1 f49914f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ tb7 f49915g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f49916h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ fb2 f49917i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ vi3 f49918j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ t66 f49919k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t66 f49920l;

    public /* synthetic */ lo1(vi3 vi3Var, t66 t66Var, fe9 fe9Var, C0127b c0127b, CoursePlaylistSort coursePlaylistSort, vi3 vi3Var2, wo1 wo1Var, tb7 tb7Var, fb2 fb2Var, vi3 vi3Var3, t66 t66Var2, t66 t66Var3, t66 t66Var4) {
        this.f49913e = vi3Var;
        this.f49919k = t66Var;
        this.f49910b = fe9Var;
        this.f49911c = c0127b;
        this.f49912d = coursePlaylistSort;
        this.f49916h = vi3Var2;
        this.f49914f = wo1Var;
        this.f49915g = tb7Var;
        this.f49917i = fb2Var;
        this.f49918j = vi3Var3;
        this.f49920l = t66Var2;
        this.f49907H = t66Var3;
        this.f49908I = t66Var4;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        wo1 wo1Var;
        t66 t66Var;
        int i = this.f49909a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        Object obj4 = this.f49908I;
        switch (i) {
            case 0:
                t66 t66Var2 = (t66) obj4;
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p, ss5.f61356d);
                    gc0 gc0Var = nj0.f52815j;
                    t66 t66Var3 = this.f49919k;
                    boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
                    vi3 vi3Var = this.f49913e;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new az0(vi3Var, t66Var3, 1);
                        tj3Var.m22131l0(objM22097O);
                    }
                    lp7.m16424b(zBooleanValue, (ui3) objM22097O, e16VarM10007D, null, gc0Var, null, false, 0.0f, ci8.m4703P(1602562215, new lo1(this.f49910b, t17Var, this.f49911c, this.f49912d, this.f49916h, this.f49914f, this.f49915g, vi3Var, this.f49917i, this.f49918j, this.f49920l, this.f49907H, t66Var2), tj3Var), tj3Var, 100687872, 232);
                }
                break;
            default:
                t17 t17Var2 = (t17) obj4;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((bi0) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4411d, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, 0.0f, 10);
                    ec0 ec0Var = nj0.f52792K;
                    C3661uu c3661uu = new C3661uu(this.f49910b.f38964m, true, new gm5(28));
                    x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, t17Var2.mo14021d(), 0.0f, t17Var2.mo14018a(), 5);
                    CoursePlaylistSort coursePlaylistSort = this.f49912d;
                    boolean zM22116e = tj3Var2.m22116e(coursePlaylistSort.ordinal());
                    vi3 vi3Var2 = this.f49913e;
                    boolean zM22120g2 = zM22116e | tj3Var2.m22120g(vi3Var2);
                    wo1 wo1Var2 = this.f49914f;
                    boolean zM22124i = zM22120g2 | tj3Var2.m22124i(wo1Var2);
                    tb7 tb7Var = this.f49915g;
                    boolean zM22124i2 = zM22124i | tj3Var2.m22124i(tb7Var);
                    vi3 vi3Var3 = this.f49916h;
                    boolean zM22120g3 = zM22124i2 | tj3Var2.m22120g(vi3Var3);
                    Object objM22097O2 = tj3Var2.m22097O();
                    t66 t66Var4 = this.f49920l;
                    if (zM22120g3 || objM22097O2 == p84Var) {
                        objM22097O2 = new dy0(wo1Var2, this.f49919k, coursePlaylistSort, vi3Var2, tb7Var, vi3Var3, t66Var4);
                        wo1Var = wo1Var2;
                        t66Var = t66Var4;
                        tj3Var2.m22131l0(objM22097O2);
                    } else {
                        t66Var = t66Var4;
                        wo1Var = wo1Var2;
                    }
                    fa4.m11642c(e16VarM21611X, this.f49911c, x17VarM21626g, c3661uu, ec0Var, null, false, null, (vi3) objM22097O2, tj3Var2, 196608, 456);
                    if (wo1Var instanceof vo1) {
                        vo1 vo1Var = (vo1) wo1Var;
                        if (vo1Var.f65692c) {
                            tj3Var2.m22111b0(-919821003);
                            e16 e16VarM21608U = AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e);
                            fb2 fb2Var = this.f49917i;
                            boolean zM22120g4 = tj3Var2.m22120g(fb2Var);
                            Object objM22097O3 = tj3Var2.m22097O();
                            if (zM22120g4 || objM22097O3 == p84Var) {
                                objM22097O3 = new no1(fb2Var, t66Var, 0);
                                tj3Var2.m22131l0(objM22097O3);
                            }
                            e16 e16VarM24741N = xwc.m24741N(e16VarM21608U, (vi3) objM22097O3);
                            hc7 hc7Var = vo1Var.f65699j;
                            int i2 = hc7Var.f42177e;
                            int i3 = (int) hc7Var.f42176d;
                            boolean z = vo1Var.f65690a;
                            ac7 ac7Var = hc7Var.f42181i;
                            PlayerType playerType = hc7Var.f42173a;
                            t66 t66Var5 = this.f49907H;
                            pbb pbbVar = (pbb) t66Var5.getValue();
                            String str = vo1Var.f65694e;
                            String strM17131l0 = str != null ? AbstractC3352my.m17131l0(str) : null;
                            boolean z2 = vo1Var.f65695f;
                            String str2 = vo1Var.f65696g;
                            Object objM22097O4 = tj3Var2.m22097O();
                            if (objM22097O4 == p84Var) {
                                objM22097O4 = new C0023al(8, t66Var5);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            AbstractC2253c.m9221g(e16VarM24741N, i2, i3, z, z2, ac7Var, playerType, pbbVar, (vi3) objM22097O4, strM17131l0, str2, this.f49918j, tj3Var2, 100663296, 0, 0);
                            tj3Var2.m22139q(false);
                        }
                    }
                    tj3Var2.m22111b0(-918755781);
                    tj3Var2.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ lo1(fe9 fe9Var, t17 t17Var, C0127b c0127b, CoursePlaylistSort coursePlaylistSort, vi3 vi3Var, wo1 wo1Var, tb7 tb7Var, vi3 vi3Var2, fb2 fb2Var, vi3 vi3Var3, t66 t66Var, t66 t66Var2, t66 t66Var3) {
        this.f49910b = fe9Var;
        this.f49908I = t17Var;
        this.f49911c = c0127b;
        this.f49912d = coursePlaylistSort;
        this.f49913e = vi3Var;
        this.f49914f = wo1Var;
        this.f49915g = tb7Var;
        this.f49916h = vi3Var2;
        this.f49917i = fb2Var;
        this.f49918j = vi3Var3;
        this.f49919k = t66Var;
        this.f49920l = t66Var2;
        this.f49907H = t66Var3;
    }
}
