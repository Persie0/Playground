package p000;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.C0656d;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.chat.ChatPhrase;
import com.lingq.core.domain.model.cup.CupPrizeSource;
import com.lingq.core.domain.model.milestones.Badge;
import com.lingq.core.domain.model.status.TokenStatus;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.challenges.ChallengeType;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.C1974a;
import com.lingq.feature.challenges.cup.C1975b;
import com.lingq.feature.challenges.cup.C1977d;
import com.lingq.feature.challenges.cup.C1980g;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.PhrasesState;
import com.lingq.feature.collections.AbstractC2030a;
import com.lingq.feature.collections.C2034d;
import com.lingq.feature.playlist.AbstractC2253c;
import com.lingq.feature.playlist.C2251a;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3539rk;
import p000.bk2;
import p000.c83;
import p000.d32;
import p000.p84;
import p000.r46;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: t4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3598t4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f61834b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f61835c;

    public /* synthetic */ C3598t4(int i, Object obj, Object obj2) {
        this.f61833a = i;
        this.f61834b = obj;
        this.f61835c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x048d  */
    /* JADX WARN: Code duplicated, block: B:114:0x04a9  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        long jM4216i;
        int i = this.f61833a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f61835c;
        Object obj4 = this.f61834b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                r0d.m20231a((e16) obj4, (AbstractC2952e5) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                zi3 zi3Var = (zi3) obj4;
                zi3 zi3Var2 = (zi3) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarMo3161g = AbstractC3584sr.m21606S(b16.f7762a, AbstractC3369ne.f52630b).mo3161g(new gv3(zi3Var == null ? nj0.f52791J : nj0.f52792K));
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    zi3Var2.invoke(tj3Var, 0);
                    tj3Var.m22139q(true);
                }
                break;
            case 2:
                final Context context = (Context) obj4;
                final C0656d c0656d = (C0656d) obj3;
                ye1 ye1Var2 = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) != 2) {
                    a02 a02VarMo1265a = yf1.f69763b.mo1265a(context);
                    a02 a02VarMo1265a2 = yf1.f69765d.mo1265a(c0656d.f5999f);
                    zf1 zf1Var = xf1.f68148a;
                    bundle = (Bundle) ((xc9) c0656d.f6004k).getValue();
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    pvc.m19508d(new a02[]{a02VarMo1265a, a02VarMo1265a2, zf1Var.mo1265a(bundle), yf1.f69764c.mo1265a(((xc9) c0656d.f6003j).getValue())}, ci8.m4703P(-1811403166, new zi3() { // from class: androidx.glance.appwidget.c
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            ye1 ye1Var3 = (ye1) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue() & 3;
                            xfa xfaVar2 = xfa.f68157a;
                            if (iIntValue2 == 2) {
                                tj3 tj3Var2 = (tj3) ye1Var3;
                                if (tj3Var2.m22086D()) {
                                    tj3Var2.m22102U();
                                    return xfaVar2;
                                }
                            }
                            tj3 tj3Var3 = (tj3) ye1Var3;
                            Object objM22097O = tj3Var3.m22097O();
                            p84 p84Var = we1.f66679a;
                            if (objM22097O == p84Var) {
                                objM22097O = AbstractC0278f.m1260j(new bk2(0L));
                                tj3Var3.m22131l0(objM22097O);
                            }
                            t66 t66Var = (t66) objM22097O;
                            Boolean bool = Boolean.FALSE;
                            C0656d c0656d2 = c0656d;
                            boolean zM22124i = tj3Var3.m22124i(c0656d2);
                            Context context2 = context;
                            boolean zM22124i2 = zM22124i | tj3Var3.m22124i(context2);
                            Object objM22097O2 = tj3Var3.m22097O();
                            xfa xfaVar3 = null;
                            if (zM22124i2 || objM22097O2 == p84Var) {
                                objM22097O2 = new AppWidgetSession$provideGlance$1$1$configIsReady$2$1(c0656d2, context2, t66Var, null);
                                tj3Var3.m22131l0(objM22097O2);
                            }
                            if (((Boolean) AbstractC0278f.m1261k(tj3Var3, (zi3) objM22097O2, bool).getValue()).booleanValue()) {
                                tj3Var3.m22111b0(-1541018146);
                                Object objM22097O3 = tj3Var3.m22097O();
                                if (objM22097O3 == p84Var) {
                                    objM22097O3 = AbstractC3224d.m15528g(new AppWidgetUtilsKt$runGlance$1(c0656d2.f5998e, context2, c0656d2.f5999f, null));
                                    tj3Var3.m22131l0(objM22097O3);
                                }
                                zi3 zi3Var3 = (zi3) AbstractC0278f.m1251a((c83) objM22097O3, null, null, tj3Var3, 48, 2).getValue();
                                if (zi3Var3 == null) {
                                    tj3Var3.m22111b0(-1540889931);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-1540889930);
                                    r46.m20378c(0, ((bk2) t66Var.getValue()).f8632a, tj3Var3, zi3Var3, c0656d2.f6001h);
                                    tj3Var3.m22139q(false);
                                    xfaVar3 = xfaVar2;
                                }
                                if (xfaVar3 == null) {
                                    tj3Var3.m22111b0(-1296630672);
                                    AbstractC0658f.m2228a(tj3Var3, 0);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-1296636252);
                                    tj3Var3.m22139q(false);
                                }
                                tj3Var3.m22139q(false);
                            } else {
                                tj3Var3.m22111b0(-1540810446);
                                AbstractC0658f.m2228a(tj3Var3, 0);
                                tj3Var3.m22139q(false);
                            }
                            boolean zM22124i3 = tj3Var3.m22124i(c0656d2);
                            Object objM22097O4 = tj3Var3.m22097O();
                            if (zM22124i3 || objM22097O4 == p84Var) {
                                objM22097O4 = new C3539rk(c0656d2, 1);
                                tj3Var3.m22131l0(objM22097O4);
                            }
                            d32.m10064x((ui3) objM22097O4, tj3Var3);
                            return xfaVar2;
                        }
                    }, ye1Var2), ye1Var2, 56);
                } else {
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (!tj3Var2.m22086D()) {
                        a02 a02VarMo1265a3 = yf1.f69763b.mo1265a(context);
                        a02 a02VarMo1265a4 = yf1.f69765d.mo1265a(c0656d.f5999f);
                        zf1 zf1Var2 = xf1.f68148a;
                        bundle = (Bundle) ((xc9) c0656d.f6004k).getValue();
                        if (bundle == null) {
                            bundle = Bundle.EMPTY;
                        }
                        pvc.m19508d(new a02[]{a02VarMo1265a3, a02VarMo1265a4, zf1Var2.mo1265a(bundle), yf1.f69764c.mo1265a(((xc9) c0656d.f6003j).getValue())}, ci8.m4703P(-1811403166, new zi3() { // from class: androidx.glance.appwidget.c
                            @Override // p000.zi3
                            public final Object invoke(Object obj5, Object obj6) {
                                ye1 ye1Var3 = (ye1) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue() & 3;
                                xfa xfaVar2 = xfa.f68157a;
                                if (iIntValue2 == 2) {
                                    tj3 tj3Var3 = (tj3) ye1Var3;
                                    if (tj3Var3.m22086D()) {
                                        tj3Var3.m22102U();
                                        return xfaVar2;
                                    }
                                }
                                tj3 tj3Var4 = (tj3) ye1Var3;
                                Object objM22097O = tj3Var4.m22097O();
                                p84 p84Var = we1.f66679a;
                                if (objM22097O == p84Var) {
                                    objM22097O = AbstractC0278f.m1260j(new bk2(0L));
                                    tj3Var4.m22131l0(objM22097O);
                                }
                                t66 t66Var = (t66) objM22097O;
                                Boolean bool = Boolean.FALSE;
                                C0656d c0656d2 = c0656d;
                                boolean zM22124i = tj3Var4.m22124i(c0656d2);
                                Context context2 = context;
                                boolean zM22124i2 = zM22124i | tj3Var4.m22124i(context2);
                                Object objM22097O2 = tj3Var4.m22097O();
                                xfa xfaVar3 = null;
                                if (zM22124i2 || objM22097O2 == p84Var) {
                                    objM22097O2 = new AppWidgetSession$provideGlance$1$1$configIsReady$2$1(c0656d2, context2, t66Var, null);
                                    tj3Var4.m22131l0(objM22097O2);
                                }
                                if (((Boolean) AbstractC0278f.m1261k(tj3Var4, (zi3) objM22097O2, bool).getValue()).booleanValue()) {
                                    tj3Var4.m22111b0(-1541018146);
                                    Object objM22097O3 = tj3Var4.m22097O();
                                    if (objM22097O3 == p84Var) {
                                        objM22097O3 = AbstractC3224d.m15528g(new AppWidgetUtilsKt$runGlance$1(c0656d2.f5998e, context2, c0656d2.f5999f, null));
                                        tj3Var4.m22131l0(objM22097O3);
                                    }
                                    zi3 zi3Var3 = (zi3) AbstractC0278f.m1251a((c83) objM22097O3, null, null, tj3Var4, 48, 2).getValue();
                                    if (zi3Var3 == null) {
                                        tj3Var4.m22111b0(-1540889931);
                                        tj3Var4.m22139q(false);
                                    } else {
                                        tj3Var4.m22111b0(-1540889930);
                                        r46.m20378c(0, ((bk2) t66Var.getValue()).f8632a, tj3Var4, zi3Var3, c0656d2.f6001h);
                                        tj3Var4.m22139q(false);
                                        xfaVar3 = xfaVar2;
                                    }
                                    if (xfaVar3 == null) {
                                        tj3Var4.m22111b0(-1296630672);
                                        AbstractC0658f.m2228a(tj3Var4, 0);
                                        tj3Var4.m22139q(false);
                                    } else {
                                        tj3Var4.m22111b0(-1296636252);
                                        tj3Var4.m22139q(false);
                                    }
                                    tj3Var4.m22139q(false);
                                } else {
                                    tj3Var4.m22111b0(-1540810446);
                                    AbstractC0658f.m2228a(tj3Var4, 0);
                                    tj3Var4.m22139q(false);
                                }
                                boolean zM22124i3 = tj3Var4.m22124i(c0656d2);
                                Object objM22097O4 = tj3Var4.m22097O();
                                if (zM22124i3 || objM22097O4 == p84Var) {
                                    objM22097O4 = new C3539rk(c0656d2, 1);
                                    tj3Var4.m22131l0(objM22097O4);
                                }
                                d32.m10064x((ui3) objM22097O4, tj3Var4);
                                return xfaVar2;
                            }
                        }, ye1Var2), ye1Var2, 56);
                    } else {
                        tj3Var2.m22102U();
                    }
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                j4d.m14286a((e16) obj4, (Badge) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                q5d.m19669c((e16) obj4, (Challenge) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                q5d.m19672f((e16) obj4, (ChallengeType) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                Context context2 = (Context) obj4;
                String str = (String) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    r46.m20381f(null, null, null, null, ci8.m4703P(-5116245, new st0(context2, str), tj3Var3), tj3Var3, 24576, 15);
                }
                break;
            case 7:
                tz0 tz0Var = (tz0) obj4;
                nz9 nz9Var = (nz9) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else if (!(tz0Var.f63115c instanceof ux0)) {
                    tj3Var4.m22111b0(268209561);
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22111b0(267467669);
                    AbstractC2005i.m8906g(tz0Var.f63116d.f63042g, d32.m10035e(Color.parseColor(nz9Var.f53461g.f65848d.f63524a.f67242a)), d32.m10035e(Color.parseColor(nz9Var.f53461g.f65847c.f69687a.f67242a)), AbstractC3584sr.m21611X(b16.f7762a, 0.0f, 0.0f, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a, 0.0f, 11), tj3Var4, 0);
                    tj3Var4.m22139q(false);
                }
                break;
            case 8:
                tz0 tz0Var2 = (tz0) obj4;
                String str2 = (String) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else if (!tz0Var2.f63116d.f63047l) {
                    tj3Var5.m22111b0(-533541817);
                    lw9.m16554b(vz1.m23620a0(tj3Var5, R$string.lingq_connect_warning), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                    tj3Var5.m22139q(false);
                } else {
                    tj3Var5.m22111b0(-533681999);
                    lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var5, 0, 0, 262142);
                    tj3Var5.m22139q(false);
                }
                break;
            case 9:
                TokenStatus tokenStatus = (TokenStatus) obj2;
                ((String) obj).getClass();
                tokenStatus.getClass();
                ((jv0) obj4).mo8896w((ChatPhrase) obj3, tokenStatus);
                break;
            case 10:
                jw0 jw0Var = (jw0) obj4;
                t66 t66Var = (t66) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (!tj3Var6.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else {
                    p04 p04VarM23404a = vkd.m23404a();
                    String strM23620a0 = vz1.m23620a0(tj3Var6, com.lingq.feature.chat.R$string.chat_view_phrases);
                    if (jw0Var.f46247h == PhrasesState.Showing) {
                        tj3Var6.m22111b0(1212517856);
                        jM4216i = ((bx2) tj3Var6.m22128k(cx2.f34676a)).m4212e();
                        tj3Var6.m22139q(false);
                    } else {
                        tj3Var6.m22111b0(1212641267);
                        if (((Boolean) t66Var.getValue()).booleanValue()) {
                            tj3Var6.m22111b0(1212694773);
                            jM4216i = ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51799a.f55875s;
                            tj3Var6.m22139q(false);
                        } else {
                            tj3Var6.m22111b0(1212821842);
                            jM4216i = ((bx2) tj3Var6.m22128k(cx2.f34676a)).m4216i();
                            tj3Var6.m22139q(false);
                        }
                        tj3Var6.m22139q(false);
                    }
                    ty3.m22351a(p04VarM23404a, strM23620a0, null, jM4216i, tj3Var6, 0, 4);
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                b7d.m3412c((oz0) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                w7d.m23808c((f71) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(49));
                break;
            case 13:
                C2034d c2034d = (C2034d) obj4;
                String str3 = (String) obj;
                str3.getClass();
                c2034d.mo8954p(c2034d.f25569b.mo4589b2(), ((t61) obj3).f61899b, str3, (String) obj2);
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC2030a.m8934a((z7d) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 15:
                C2034d c2034d2 = (C2034d) obj4;
                String str4 = (String) obj;
                str4.getClass();
                c2034d2.mo8951f0(c2034d2.f25569b.mo4589b2(), ((t81) ((v81) obj3)).f61974a.f41930a.f19426a, str4, (String) obj2);
                break;
            case 16:
                ((Integer) obj2).getClass();
                f8d.m11605a((p91) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 17:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                in1 in1Var = (in1) obj2;
                ((xfa) obj).getClass();
                in1Var.getClass();
                int i2 = ref$IntRef.f47716a;
                ref$IntRef.f47716a = i2 + 1;
                ((kn1[]) obj4)[i2] = in1Var;
                break;
            case 18:
                ((Integer) obj2).getClass();
                ((sl1) obj4).m21446a((rl1) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC2253c.m9217c((C2251a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                q9d.m19831c((CupPrizeSource) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                us1.m22895h((C1974a) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                us1.m22889b((qs1) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                u9d.m22639c((C1975b) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                u9d.m22642f((it1) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8820c((C1977d) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8824g((C1980g) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj2).getClass();
                rv1.m20863h((n56) obj3, (e16) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 28:
                Context context3 = (Context) obj4;
                wv1 wv1Var = (wv1) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    String strM17093L = AbstractC3352my.m17093L(context3, wv1Var.f67329a);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM17093L, null, ((ms5) tj3Var7.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(vh9Var)).f51800b.f71406j, tj3Var7, 0, 0, 131066);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1976c.m8834q((CupLeaderboardTab) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3598t4(Object obj, int i, int i2, Object obj2) {
        this.f61833a = i2;
        this.f61834b = obj;
        this.f61835c = obj2;
    }

    public /* synthetic */ C3598t4(Object obj, e16 e16Var, int i, int i2) {
        this.f61833a = i2;
        this.f61835c = obj;
        this.f61834b = e16Var;
    }
}
