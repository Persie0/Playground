package p000;

import android.content.Context;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.domain.model.offer.OfferType;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class py4 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56984a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f56985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f56986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f56987d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f56988e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f56989f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f56990g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f56991h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f56992i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xi3 f56993j;

    public /* synthetic */ py4(int i, ui3 ui3Var, ui3 ui3Var2, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, vs3 vs3Var, List list, List list2) {
        this.f56987d = list;
        this.f56990g = list2;
        this.f56988e = i;
        this.f56989f = vi3Var;
        this.f56992i = vs3Var;
        this.f56993j = zi3Var;
        this.f56991h = vi3Var2;
        this.f56985b = ui3Var;
        this.f56986c = ui3Var2;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        vi3 vi3Var;
        String str;
        OfferBanner offerBannerM22853a;
        String str2;
        int i;
        OfferBanner offerBannerM22853a2;
        int i2 = this.f56984a;
        xfa xfaVar = xfa.f68157a;
        int i3 = 17;
        xi3 xi3Var = this.f56993j;
        Object obj2 = this.f56992i;
        int i4 = this.f56988e;
        List list = this.f56987d;
        ui3 ui3Var = this.f56986c;
        ui3 ui3Var2 = this.f56985b;
        Object obj3 = this.f56991h;
        Object obj4 = this.f56990g;
        int i5 = 1;
        switch (i2) {
            case 0:
                List list2 = (List) obj4;
                vs3 vs3Var = (vs3) obj2;
                zi3 zi3Var = (zi3) xi3Var;
                vi3 vi3Var2 = (vi3) obj3;
                vu4 vu4Var = (vu4) obj;
                vu4Var.getClass();
                int i6 = 3;
                vu4.m23545g(vu4Var, null, new C0282a(-975994653, true, new pe0(i4, 2)), 3);
                boolean zIsEmpty = list.isEmpty();
                int i7 = 4;
                vi3 vi3Var3 = this.f56989f;
                if (zIsEmpty) {
                    vi3Var = vi3Var3;
                } else {
                    vu4.m23545g(vu4Var, null, new C0282a(-459641048, true, new eq0(i6, list)), 3);
                    List listM22615g1 = u91.m22615g1(list, 3);
                    vi3Var = vi3Var3;
                    vu4Var.m23547h(listM22615g1.size(), new ue0(10, new qy3(29), listM22615g1), new C3520r2(16, listM22615g1), new C0282a(802480018, true, new vy4(listM22615g1, vi3Var, vs3Var, zi3Var, vi3Var2, 0)));
                    if (list.size() > 3) {
                        vu4.m23545g(vu4Var, null, new C0282a(-2085352659, true, new ze2(i7, ui3Var2)), 3);
                    }
                }
                if (!list2.isEmpty()) {
                    vu4.m23545g(vu4Var, null, new C0282a(454326993, true, new eq0(i7, list2)), 3);
                    List listM22615g2 = u91.m22615g1(list2, 3);
                    vu4Var.m23547h(listM22615g2.size(), new ue0(11, new ry4(0), listM22615g2), new C3520r2(17, listM22615g2), new C0282a(802480018, true, new vy4(listM22615g2, vi3Var, vs3Var, zi3Var, vi3Var2, 1)));
                    if (list2.size() > 3) {
                        vu4.m23545g(vu4Var, null, new C0282a(1513564566, true, new ze2(5, ui3Var)), 3);
                    }
                }
                break;
            default:
                wia wiaVar = (wia) obj4;
                Context context = (Context) obj3;
                ui3 ui3Var3 = (ui3) obj2;
                ui3 ui3Var4 = (ui3) xi3Var;
                vu4 vu4Var2 = (vu4) obj;
                vu4Var2.getClass();
                up6 up6Var = wiaVar.f66894s;
                if (up6Var == null || (offerBannerM22853a2 = up6Var.m22853a(BannerType.UPGRADE, wiaVar.f66877b)) == null || (str = offerBannerM22853a2.f19546b) == null) {
                    str = (up6Var == null || (offerBannerM22853a = up6Var.m22853a(BannerType.UPGRADE, "en")) == null) ? null : offerBannerM22853a.f19546b;
                }
                if (str != null) {
                    str2 = null;
                    i = 3;
                    vu4.m23545g(vu4Var2, null, new C0282a(-22961436, true, new iq0(str, i3)), 3);
                } else {
                    str2 = null;
                    i = 3;
                }
                if (wiaVar.f66895t) {
                    vu4.m23545g(vu4Var2, str2, drc.f36132l, i);
                } else if (up6Var != null && up6Var.f64176d == OfferType.EXTENDED_SALE) {
                    vu4.m23545g(vu4Var2, str2, drc.f36133m, i);
                } else if (str == null) {
                    vu4.m23545g(vu4Var2, str2, new C0282a(1835622371, true, new qia(wiaVar, 0)), i);
                }
                vu4.m23545g(vu4Var2, str2, new C0282a(-2088552695, true, new iz4(26, context, wiaVar)), i);
                vu4.m23545g(vu4Var2, str2, new C0282a(1570052800, true, new a05(wiaVar, ui3Var2, ui3Var, 21)), i);
                vu4.m23545g(vu4Var2, str2, new C0282a(-1171827135, true, new m65(list, i4, this.f56989f, wiaVar)), i);
                vu4.m23545g(vu4Var2, str2, new C0282a(381260226, true, new qia(wiaVar, i5)), i);
                vu4.m23545g(vu4Var2, str2, drc.f36134n, i);
                vu4.m23545g(vu4Var2, str2, drc.f36135o, i);
                vu4.m23545g(vu4Var2, str2, drc.f36136p, i);
                vu4.m23545g(vu4Var2, str2, drc.f36137q, i);
                vu4.m23545g(vu4Var2, str2, new C0282a(-443237561, true, new bw0(ui3Var3, ui3Var4, i5)), i);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ py4(wia wiaVar, Context context, ui3 ui3Var, ui3 ui3Var2, List list, int i, vi3 vi3Var, ui3 ui3Var3, ui3 ui3Var4) {
        this.f56990g = wiaVar;
        this.f56991h = context;
        this.f56985b = ui3Var;
        this.f56986c = ui3Var2;
        this.f56987d = list;
        this.f56988e = i;
        this.f56989f = vi3Var;
        this.f56992i = ui3Var3;
        this.f56993j = ui3Var4;
    }
}
