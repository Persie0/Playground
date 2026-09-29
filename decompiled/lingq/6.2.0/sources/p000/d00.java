package p000;

import com.lingq.feature.reader.rating.p016ui.AbstractC2474a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d00 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34754a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f34755b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f34756c;

    public /* synthetic */ d00(int i, int i2, ui3 ui3Var) {
        this.f34754a = 3;
        this.f34755b = ui3Var;
        this.f34756c = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34754a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f34755b;
        int i2 = this.f34756c;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                b4d.m3296a(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            case 1:
                num.getClass();
                sfd.m21344a(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            case 2:
                num.getClass();
                kjd.m15291b(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            case 3:
                num.getClass();
                xd5.m24463b(ui3Var, ye1Var, pk9.m19383z(1), i2);
                break;
            case 4:
                num.intValue();
                AbstractC2474a.m9382a(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            case 5:
                num.getClass();
                o2d.m17771a(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            case 6:
                num.intValue();
                e3d.m10828c(pk9.m19383z(i2 | 1), ye1Var, ui3Var);
                break;
            default:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    bq1.m4039O(AbstractC3584sr.m21607T(c99.m4412e(b16.f7762a, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, null, te1.m22000n(62, 12.0f), null, ci8.m4703P(-305689210, new bs0(i2, ui3Var, 5), tj3Var), tj3Var, 196608, 20);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ d00(int i, ui3 ui3Var) {
        this.f34754a = 7;
        this.f34756c = i;
        this.f34755b = ui3Var;
    }

    public /* synthetic */ d00(ui3 ui3Var, int i, int i2, byte b) {
        this.f34754a = i2;
        this.f34755b = ui3Var;
        this.f34756c = i;
    }

    public /* synthetic */ d00(ui3 ui3Var, int i, int i2, char c) {
        this.f34754a = i2;
        this.f34755b = ui3Var;
        this.f34756c = i;
    }
}
