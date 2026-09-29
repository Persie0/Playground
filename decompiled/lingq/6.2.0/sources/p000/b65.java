package p000;

import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.feature.reader.shared.p018ui.components.AbstractC2508a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b65 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8008a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f8009b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f8010c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8011d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8012e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f8013f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f8014g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8015h;

    public /* synthetic */ b65(e16 e16Var, TokenStatus tokenStatus, yd5 yd5Var, boolean z, ui3 ui3Var, int i, int i2) {
        this.f8013f = e16Var;
        this.f8014g = tokenStatus;
        this.f8015h = yd5Var;
        this.f8009b = z;
        this.f8010c = ui3Var;
        this.f8011d = i;
        this.f8012e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8008a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f8015h;
        Object obj4 = this.f8014g;
        Object obj5 = this.f8013f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f8012e | 1);
                AbstractC2508a.m9431a(b16.f7762a, (du7) obj5, this.f8009b, this.f8011d, (vi3) obj4, (vi3) obj3, this.f8010c, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(this.f8011d | 1);
                l4d.m15802b((e16) obj5, (TokenStatus) obj4, (yd5) obj3, this.f8009b, this.f8010c, (ye1) obj, iM19383z2, this.f8012e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ b65(du7 du7Var, boolean z, int i, vi3 vi3Var, vi3 vi3Var2, ui3 ui3Var, int i2) {
        this.f8013f = du7Var;
        this.f8009b = z;
        this.f8011d = i;
        this.f8014g = vi3Var;
        this.f8015h = vi3Var2;
        this.f8010c = ui3Var;
        this.f8012e = i2;
    }
}
