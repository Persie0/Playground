package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;
import java.util.Iterator;

/* JADX INFO: renamed from: bj */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0812bj implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f8574b;

    public /* synthetic */ C0812bj(int i, t66 t66Var) {
        this.f8573a = i;
        this.f8574b = t66Var;
    }

    /* JADX WARN: Code duplicated, block: B:199:0x081a  */
    /* JADX WARN: Code duplicated, block: B:207:0x083d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        float fMin;
        float fMin2;
        long jM4216i;
        long jM4216i2;
        String strM23620a0;
        int i = this.f8573a;
        int i2 = 28;
        Object obj3 = we1.f66679a;
        float f = 1.0f;
        b16 b16Var = b16.f7762a;
        int i3 = 0;
        boolean z = true;
        xfa xfaVar = xfa.f68157a;
        t66 t66Var = this.f8574b;
        switch (i) {
            case 0:
                j84 j84Var = (j84) obj;
                j84 j84Var2 = (j84) obj2;
                float f2 = tw5.f63010a;
                int i4 = j84Var2.f45185a;
                int i5 = j84Var2.f45188d;
                int i6 = j84Var2.f45187c;
                int i7 = j84Var2.f45186b;
                int i8 = j84Var.f45187c;
                int i9 = j84Var.f45186b;
                int i10 = j84Var.f45188d;
                int i11 = j84Var.f45185a;
                if (i4 >= i8) {
                    fMin = 0.0f;
                } else if (i6 <= i11) {
                    fMin = 1.0f;
                } else if (j84Var2.m14324d() == 0) {
                    fMin = 0.0f;
                } else {
                    fMin = (((Math.min(j84Var.f45187c, i6) + Math.max(i11, i4)) / 2) - i4) / j84Var2.m14324d();
                }
                if (i7 >= i10) {
                    fMin2 = 0.0f;
                } else if (i5 <= i9) {
                    fMin2 = 1.0f;
                } else if (j84Var2.m14322b() == 0) {
                    fMin2 = 0.0f;
                } else {
                    fMin2 = (((Math.min(i10, i5) + Math.max(i9, i7)) / 2) - i7) / j84Var2.m14322b();
                }
                t66Var.setValue(new k9a(omd.m18157m(fMin, fMin2)));
                return xfaVar;
            case 1:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_audio_m, tj3Var, 0);
                    String strM23620a1 = vz1.m23620a0(tj3Var, R$string.ui_play_audio);
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var.m22111b0(1986378153);
                        jM4216i = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55875s;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1986497286);
                        jM4216i = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4216i();
                        tj3Var.m22139q(false);
                    }
                    ty3.m22352b(y27VarM18236U, strM23620a1, null, jM4216i, tj3Var, 8, 4);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p04 p04VarM22577a = u8d.m22577a();
                    String strM23620a2 = vz1.m23620a0(tj3Var2, R$string.ui_copy_text);
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var2.m22111b0(-548361354);
                        jM4216i2 = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55875s;
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-548250157);
                        jM4216i2 = ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4216i();
                        tj3Var2.m22139q(false);
                    }
                    ty3.m22351a(p04VarM22577a, strM23620a2, null, jM4216i2, tj3Var2, 0, 4);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                    String str = (String) t66Var.getValue();
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    hj4 hj4Var = new hj4(1, 0, new xi5("es"), 59);
                    Object objM22097O = tj3Var3.m22097O();
                    if (objM22097O == obj3) {
                        objM22097O = new C0023al(7, t66Var);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    q6d.m19686c(str, (vi3) objM22097O, e16VarM4412e2, true, null, snb.f61074c, null, null, null, null, false, null, hj4Var, null, false, 0, 0, null, null, tj3Var3, 1576368, 196608, 8355760);
                    tj3Var3.m22139q(true);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 4:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    if (((Boolean) t66Var.getValue()).booleanValue()) {
                        tj3Var4.m22111b0(-1599200566);
                        strM23620a0 = vz1.m23620a0(tj3Var4, com.lingq.core.data.R$string.register_email_invalid);
                        tj3Var4.m22139q(false);
                    } else {
                        tj3Var4.m22111b0(-1599082053);
                        tj3Var4.m22139q(false);
                        strM23620a0 = "";
                    }
                    String str2 = strM23620a0;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str2, null, ((ms5) tj3Var4.m22128k(vh9Var)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(vh9Var)).f51800b.f71408l, tj3Var4, 0, 0, 131066);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 5:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objM22097O2 = tj3Var5.m22097O();
                    if (objM22097O2 == obj3) {
                        objM22097O2 = new lz5(4);
                        tj3Var5.m22131l0(objM22097O2);
                    }
                    e16 e16VarM17643c = nv8.m17643c(b16Var, false, (vi3) objM22097O2);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode2 = Long.hashCode(tj3Var5.f62385T);
                    l77 l77VarM22132m2 = tj3Var5.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var5, e16VarM17643c);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var5.m22119f0();
                    if (tj3Var5.f62384S) {
                        tj3Var5.m22130l(ui3Var2);
                    } else {
                        tj3Var5.m22137o0();
                    }
                    oha.m18001g(tj3Var5, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var5, C0352b.f4305h);
                    oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c2);
                    ((zi3) t66Var.getValue()).invoke(tj3Var5, 0);
                    tj3Var5.m22139q(true);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 6:
                ((Integer) obj2).getClass();
                oxb.m18567f(t66Var, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 7:
                ((Integer) obj2).getClass();
                oxb.m18563b(t66Var, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 8:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p04 p04VarM3600c = ((Boolean) t66Var.getValue()).booleanValue() ? bbd.m3600c() : hka.m13318a();
                    String str3 = ((Boolean) t66Var.getValue()).booleanValue() ? "Hide password" : "Show password";
                    boolean zM22120g = tj3Var6.m22120g(t66Var);
                    Object objM22097O3 = tj3Var6.m22097O();
                    if (zM22120g || objM22097O3 == obj3) {
                        objM22097O3 = new do4(17, t66Var);
                        tj3Var6.m22131l0(objM22097O3);
                    }
                    omd.m18141c((ui3) objM22097O3, null, false, null, null, ci8.m4703P(-1908240420, new mw6(p04VarM3600c, str3, 0), tj3Var6), tj3Var6, 1572864, 62);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lw9.m16554b(AbstractC3393o1.m17732g(((String) t66Var.getValue()).length(), " / 120"), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, null, tj3Var7, 48, 0, 261116);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 10:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    si8 si8Var = ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51801c.f64856b;
                    String str4 = (String) t66Var.getValue();
                    hj4 hj4Var2 = new hj4(3, 0, null, 123);
                    Object objM22097O4 = tj3Var8.m22097O();
                    if (objM22097O4 == obj3) {
                        objM22097O4 = new dt6(11, t66Var);
                        tj3Var8.m22131l0(objM22097O4);
                    }
                    bna.m3942c(str4, (vi3) objM22097O4, e16VarM4412e3, false, null, null, null, null, null, null, null, false, null, hj4Var2, null, false, 1, 0, si8Var, null, tj3Var8, 432, 100859904, 5996536);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 11:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    ty3.m22351a(((Boolean) t66Var.getValue()).booleanValue() ? r7d.m20438b() : h2d.m13016b(), ((Boolean) t66Var.getValue()).booleanValue() ? "Collapse" : "More actions", c99.m4422o(b16Var, 20.0f), 0L, tj3Var9, 384, 8);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ec0 ec0Var = nj0.f52791J;
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    tj3Var10.m22102U();
                    return xfaVar;
                }
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var10.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), ec0Var, tj3Var10, 0);
                int iHashCode3 = Long.hashCode(tj3Var10.f62385T);
                l77 l77VarM22132m3 = tj3Var10.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var10, b16Var);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                tj3Var10.m22119f0();
                if (tj3Var10.f62384S) {
                    tj3Var10.m22130l(ui3Var3);
                } else {
                    tj3Var10.m22137o0();
                }
                oha.m18001g(tj3Var10, C0352b.f4303f, bb1VarM230a2);
                oha.m18001g(tj3Var10, C0352b.f4302e, l77VarM22132m3);
                oha.m18001g(tj3Var10, C0352b.f4304g, Integer.valueOf(iHashCode3));
                oha.m18000f(tj3Var10, C0352b.f4305h);
                oha.m18001g(tj3Var10, C0352b.f4301d, e16VarM1322c3);
                lw9.m16554b(vz1.m23620a0(tj3Var10, com.lingq.core.settings.R$string.dev_options_server_switch_message), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                tj3Var10.m22111b0(-833767301);
                Iterator it = ServerEnvironment.getEntries().iterator();
                tj3 tj3Var11 = tj3Var10;
                while (it.hasNext()) {
                    ServerEnvironment serverEnvironment = (ServerEnvironment) it.next();
                    e16 e16VarM4412e4 = c99.m4412e(b16Var, f);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var11.m22128k(ge9.f40637a)).f38952a, z, new gm5(i2)), nj0.f52817l, tj3Var11, i3);
                    int iHashCode4 = Long.hashCode(tj3Var11.f62385T);
                    l77 l77VarM22132m4 = tj3Var11.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var11, e16VarM4412e4);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var11.m22119f0();
                    if (tj3Var11.f62384S) {
                        tj3Var11.m22130l(ui3Var4);
                    } else {
                        tj3Var11.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var11, zi3Var, sj8VarM20003a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var11, zi3Var2, l77VarM22132m4);
                    Integer numValueOf = Integer.valueOf(iHashCode4);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var11, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var11, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var11, zi3Var4, e16VarM1322c4);
                    boolean zM11650l = fa4.m11650l((String) t66Var.getValue(), serverEnvironment.name());
                    Iterator it2 = it;
                    boolean zM22116e = tj3Var11.m22116e(serverEnvironment.ordinal()) | tj3Var11.m22120g(t66Var);
                    Object objM22097O5 = tj3Var11.m22097O();
                    if (zM22116e || objM22097O5 == obj3) {
                        objM22097O5 = new a45(25, serverEnvironment, t66Var);
                        tj3Var11.m22131l0(objM22097O5);
                    }
                    tj3 tj3Var12 = tj3Var11;
                    kic.m15264a(zM11650l, (ui3) objM22097O5, null, false, null, tj3Var12, 0);
                    bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, ec0Var, tj3Var12, 0);
                    int iHashCode5 = Long.hashCode(tj3Var12.f62385T);
                    l77 l77VarM22132m5 = tj3Var12.m22132m();
                    xfa xfaVar2 = xfaVar;
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var12, b16Var);
                    tj3Var12.m22119f0();
                    if (tj3Var12.f62384S) {
                        tj3Var12.m22130l(ui3Var4);
                    } else {
                        tj3Var12.m22137o0();
                    }
                    oha.m18001g(tj3Var12, zi3Var, bb1VarM230a3);
                    oha.m18001g(tj3Var12, zi3Var2, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var12, zi3Var3, tj3Var12, vi3Var);
                    oha.m18001g(tj3Var12, zi3Var4, e16VarM1322c5);
                    lw9.m16554b(serverEnvironment.getDisplayName(), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var12, 0, 0, 262142);
                    tj3 tj3Var13 = tj3Var12;
                    lw9.m16554b(serverEnvironment.getBaseUrl(), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var13.m22128k(ps5.f56764b)).f51800b.f71408l, tj3Var12, 0, 0, 131070);
                    tj3Var13.m22139q(true);
                    tj3Var13.m22139q(true);
                    it = it2;
                    z = true;
                    xfaVar = xfaVar2;
                    i2 = 28;
                    f = 1.0f;
                    i3 = 0;
                    tj3Var11 = tj3Var13;
                }
                xfa xfaVar3 = xfaVar;
                tj3Var11.m22139q(i3);
                tj3Var11.m22139q(z);
                return xfaVar3;
            default:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var11;
                if (tj3Var14.m22099R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(((fe9) tj3Var14.m22128k(ge9.f40637a)).f38957f, true, new gm5(28)), nj0.f52791J, tj3Var14, 0);
                    int iHashCode6 = Long.hashCode(tj3Var14.f62385T);
                    l77 l77VarM22132m6 = tj3Var14.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var14, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var14.m22119f0();
                    if (tj3Var14.f62384S) {
                        tj3Var14.m22130l(ui3Var5);
                    } else {
                        tj3Var14.m22137o0();
                    }
                    oha.m18001g(tj3Var14, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var14, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var14, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var14, C0352b.f4305h);
                    oha.m18001g(tj3Var14, C0352b.f4301d, e16VarM1322c6);
                    lw9.m16554b(vz1.m23620a0(tj3Var14, com.lingq.core.settings.R$string.settings_delete_account_message), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var14, 0, 0, 262142);
                    String str5 = (String) t66Var.getValue();
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    boolean zM22120g2 = tj3Var14.m22120g(t66Var);
                    Object objM22097O6 = tj3Var14.m22097O();
                    if (zM22120g2 || objM22097O6 == obj3) {
                        objM22097O6 = new dt6(13, t66Var);
                        tj3Var14.m22131l0(objM22097O6);
                    }
                    bna.m3942c(str5, (vi3) objM22097O6, e16VarM4412e5, false, null, null, null, null, null, null, null, false, null, null, null, true, 0, 0, null, null, tj3Var14, 384, 12582912, 8257528);
                    tj3Var14.m22139q(true);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ C0812bj(t66 t66Var, int i, int i2) {
        this.f8573a = i2;
        this.f8574b = t66Var;
    }
}
