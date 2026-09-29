package p000;

import com.lingq.core.domain.model.playlist.Playlist;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class lf7 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f49602a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f49603b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f49604c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f49605d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f49606e;

    public lf7(List list, boolean z, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3) {
        this.f49602a = list;
        this.f49603b = z;
        this.f49604c = vi3Var;
        this.f49605d = vi3Var2;
        this.f49606e = vi3Var3;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        ft4 ft4Var = (ft4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (((tj3) ye1Var).m22120g(ft4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        tj3 tj3Var = (tj3) ye1Var;
        if (tj3Var.m22099R(i & 1, (i & 147) != 146)) {
            Playlist playlist = (Playlist) this.f49602a.get(iIntValue);
            tj3Var.m22111b0(1438572613);
            vi3 vi3Var = this.f49604c;
            boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22124i(playlist);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                objM22097O = new kf7(vi3Var, playlist, 0);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var = (ui3) objM22097O;
            vi3 vi3Var2 = this.f49605d;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var2) | tj3Var.m22124i(playlist);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O2 == p84Var) {
                objM22097O2 = new kf7(vi3Var2, playlist, 1);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var2 = (ui3) objM22097O2;
            vi3 vi3Var3 = this.f49606e;
            boolean zM22120g3 = tj3Var.m22120g(vi3Var3) | tj3Var.m22124i(playlist);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O3 == p84Var) {
                objM22097O3 = new kf7(vi3Var3, playlist, 2);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10056p(playlist, this.f49603b, ui3Var, ui3Var2, (ui3) objM22097O3, tj3Var, 0);
            pb1.m19031a(0.0f, 0, 6, 0L, tj3Var, AbstractC3584sr.m21609V(b16.f7762a, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2));
            tj3Var.m22139q(false);
        } else {
            tj3Var.m22102U();
        }
        return xfa.f68157a;
    }
}
