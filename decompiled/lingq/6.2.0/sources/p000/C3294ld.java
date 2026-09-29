package p000;

import com.lingq.core.premium.upgrade.AiVoiceSampleState;
import com.lingq.feature.reader.vocabulary.C2610a;

/* JADX INFO: renamed from: ld */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3294ld implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f49486b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xi3 f49487c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xi3 f49488d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f49489e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f49490f;

    public /* synthetic */ C3294ld(boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, int i) {
        this.f49485a = 2;
        this.f49486b = z;
        this.f49487c = ui3Var;
        this.f49488d = ui3Var2;
        this.f49490f = ui3Var3;
        this.f49489e = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f49485a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f49489e;
        xi3 xi3Var = this.f49488d;
        xi3 xi3Var2 = this.f49487c;
        Object obj3 = this.f49490f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC3607td.m21958b(this.f49486b, (AiVoiceSampleState) obj3, (ui3) xi3Var2, (ui3) xi3Var, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                b5d.m3323a(this.f49486b, (yx4) obj3, (ui3) xi3Var2, (ui3) xi3Var, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                eed.m11083a(this.f49486b, (ui3) xi3Var2, (ui3) xi3Var, (ui3) obj3, (ye1) obj, iM19383z3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                ojd.m18053a(this.f49486b, (C2610a) obj3, (ui3) xi3Var2, (vi3) xi3Var, (ye1) obj, iM19383z4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iM19383z5 = pk9.m19383z(i2 | 1);
                ujd.m22760a((String) obj3, this.f49486b, (ui3) xi3Var2, (ui3) xi3Var, (ye1) obj, iM19383z5);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iM19383z6 = pk9.m19383z(i2 | 1);
                gpc.m12795a(this.f49486b, (String) obj3, (ui3) xi3Var2, (zi3) xi3Var, (ye1) obj, iM19383z6);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM19383z7 = pk9.m19383z(i2 | 1);
                o4d.m17800a((vs3) obj3, this.f49486b, (vi3) xi3Var2, (vi3) xi3Var, (ye1) obj, iM19383z7);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3294ld(Object obj, boolean z, xi3 xi3Var, xi3 xi3Var2, int i, int i2) {
        this.f49485a = i2;
        this.f49490f = obj;
        this.f49486b = z;
        this.f49487c = xi3Var;
        this.f49488d = xi3Var2;
        this.f49489e = i;
    }

    public /* synthetic */ C3294ld(boolean z, AiVoiceSampleState aiVoiceSampleState, ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f49485a = 0;
        this.f49486b = z;
        this.f49490f = aiVoiceSampleState;
        this.f49487c = ui3Var;
        this.f49488d = ui3Var2;
        this.f49489e = i;
    }

    public /* synthetic */ C3294ld(boolean z, Object obj, ui3 ui3Var, xi3 xi3Var, int i, int i2) {
        this.f49485a = i2;
        this.f49486b = z;
        this.f49490f = obj;
        this.f49487c = ui3Var;
        this.f49488d = xi3Var;
        this.f49489e = i;
    }
}
