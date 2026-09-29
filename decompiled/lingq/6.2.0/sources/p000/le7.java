package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.premium.upgrade.UpgradeBadgeTier;
import com.lingq.feature.playlist.AbstractC2253c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class le7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49547a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f49548b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f49549c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f49550d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f49551e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f49552f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f49553g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f49554h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f49555i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ xi3 f49556j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f49557k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ zi3 f49558l;

    public /* synthetic */ le7(e16 e16Var, vs3 vs3Var, w65 w65Var, boolean z, boolean z2, zi3 zi3Var, vi3 vi3Var, zi3 zi3Var2, vi3 vi3Var2, int i, int i2) {
        this.f49548b = e16Var;
        this.f49553g = vs3Var;
        this.f49554h = w65Var;
        this.f49549c = z;
        this.f49550d = z2;
        this.f49557k = zi3Var;
        this.f49555i = vi3Var;
        this.f49558l = zi3Var2;
        this.f49556j = vi3Var2;
        this.f49551e = i;
        this.f49552f = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f49547a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f49551e;
        xi3 xi3Var = this.f49556j;
        Object obj3 = this.f49555i;
        Object obj4 = this.f49557k;
        Object obj5 = this.f49554h;
        Object obj6 = this.f49553g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2253c.m9228n(this.f49548b, (td7) obj6, (Integer) obj5, this.f49549c, this.f49550d, (vi3) obj3, (vi3) xi3Var, (zi3) obj4, this.f49558l, (ye1) obj, iM19383z, this.f49552f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                s9d.m21184c((UpgradeBadgeTier) obj6, (String) obj5, (String) obj3, (ui3) xi3Var, this.f49548b, (String) obj4, this.f49549c, this.f49550d, (C0282a) this.f49558l, (ye1) obj, iM19383z2, this.f49552f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                ibd.m13755a(this.f49548b, (vs3) obj6, (w65) obj5, this.f49549c, this.f49550d, (zi3) obj4, (vi3) obj3, this.f49558l, (vi3) xi3Var, (ye1) obj, iM19383z3, this.f49552f);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ le7(e16 e16Var, td7 td7Var, Integer num, boolean z, boolean z2, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, zi3 zi3Var2, int i, int i2) {
        this.f49548b = e16Var;
        this.f49553g = td7Var;
        this.f49554h = num;
        this.f49549c = z;
        this.f49550d = z2;
        this.f49555i = vi3Var;
        this.f49556j = vi3Var2;
        this.f49557k = zi3Var;
        this.f49558l = zi3Var2;
        this.f49551e = i;
        this.f49552f = i2;
    }

    public /* synthetic */ le7(UpgradeBadgeTier upgradeBadgeTier, String str, String str2, ui3 ui3Var, e16 e16Var, String str3, boolean z, boolean z2, C0282a c0282a, int i, int i2) {
        this.f49553g = upgradeBadgeTier;
        this.f49554h = str;
        this.f49555i = str2;
        this.f49556j = ui3Var;
        this.f49548b = e16Var;
        this.f49557k = str3;
        this.f49549c = z;
        this.f49550d = z2;
        this.f49558l = c0282a;
        this.f49551e = i;
        this.f49552f = i2;
    }
}
