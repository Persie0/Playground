package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.premium.upgrade.AiVoiceSampleState;

/* JADX INFO: renamed from: md */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3331md implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51093a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AiVoiceSampleState f51094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f51095c;

    public /* synthetic */ C3331md(ui3 ui3Var, AiVoiceSampleState aiVoiceSampleState) {
        this.f51095c = ui3Var;
        this.f51094b = aiVoiceSampleState;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51093a;
        xfa xfaVar = xfa.f68157a;
        AiVoiceSampleState aiVoiceSampleState = this.f51094b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    zf1 zf1Var = ge9.f40637a;
                    float f = ((fe9) tj3Var.m22128k(zf1Var)).f38956e;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
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
                    ho9.m13415b(this.f51095c, c99.m4422o(b16Var, 48.0f), false, ui8.m22753b(((fe9) tj3Var.m22128k(zf1Var)).f38952a), ((aa1) ((xc9) ((bx2) tj3Var.m22128k(cx2.f34676a)).f9128p).getValue()).f414a, 0L, 0.0f, 0.0f, null, null, ci8.m4703P(-959381540, new C3368nd(aiVoiceSampleState, 0), tj3Var), tj3Var, 48, 996);
                    AbstractC3607td.m21960d(c99.m4414g(new as4(1.0f, true), 40.0f), tj3Var, 0);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC3607td.m21959c(aiVoiceSampleState, this.f51095c, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3331md(AiVoiceSampleState aiVoiceSampleState, ui3 ui3Var, int i) {
        this.f51094b = aiVoiceSampleState;
        this.f51095c = ui3Var;
    }
}
