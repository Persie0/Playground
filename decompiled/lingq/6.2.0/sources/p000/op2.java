package p000;

import android.graphics.Color;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageButton;
import com.lingq.core.analytics.embedded.EmbeddedMessageElements;
import com.lingq.core.analytics.embedded.EmbeddedMessagePayload;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class op2 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EmbeddedMessage f54673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f54674c;

    public /* synthetic */ op2(EmbeddedMessage embeddedMessage, vi3 vi3Var, int i) {
        this.f54672a = i;
        this.f54673b = embeddedMessage;
        this.f54674c = vi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0977  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        long jM10035e;
        p84 p84Var;
        final vi3 vi3Var;
        final int i;
        p84 p84Var2;
        final vi3 vi3Var2;
        p84 p84Var3;
        int i2 = this.f54672a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var4 = we1.f66679a;
        final vi3 vi3Var3 = this.f54674c;
        EmbeddedMessage embeddedMessage = this.f54673b;
        b16 b16Var = b16.f7762a;
        switch (i2) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                    break;
                } else {
                    e16 e16VarM4414g = c99.m4414g(c99.m4412e(b16Var, 1.0f), 200.0f);
                    boolean zM22124i = tj3Var.m22124i(embeddedMessage) | tj3Var.m22120g(vi3Var3);
                    Object objM22097O = tj3Var.m22097O();
                    int i3 = 15;
                    if (zM22124i || objM22097O == p84Var4) {
                        objM22097O = new C3577sk(i3, embeddedMessage, vi3Var3);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4414g, 15);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
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
                    EmbeddedMessageElements embeddedMessageElements = embeddedMessage.f14318b;
                    if (cl9.m4842Y(embeddedMessageElements.f14327c, "https://www.youtube.com/", false)) {
                        tj3Var.m22111b0(-616443166);
                        String str = (String) vk9.m23365A0(embeddedMessageElements.f14327c, new String[]{"v="}, 0, 6).get(1);
                        boolean zM22120g = tj3Var.m22120g(str);
                        Object objM22097O2 = tj3Var.m22097O();
                        if (zM22120g || objM22097O2 == p84Var4) {
                            objM22097O2 = new t70(str, 26);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        AbstractC0443c.m1891b((vi3) objM22097O2, c99.m4410c(c99.m4412e(b16Var, 1.0f), 1.0f), null, tj3Var, 48, 4);
                        z = false;
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-615498937);
                        ss5.m21702b(embeddedMessageElements.f14327c, embeddedMessageElements.f14328d, c99.m4410c(c99.m4412e(b16Var, 1.0f), 1.0f), null, hl1.f42564a, tj3Var, 1573248, 4024);
                        z = false;
                        tj3Var.m22139q(false);
                    }
                    EmbeddedMessagePayload embeddedMessagePayload = embeddedMessageElements.f14332h;
                    if (embeddedMessagePayload.f14340d.length() > 0) {
                        String str2 = embeddedMessagePayload.f14340d;
                        if (cl9.m4842Y(str2, "#", z) && str2.length() == 7) {
                            tj3Var.m22111b0(-614839350);
                            tj3Var.m22139q(z);
                            jM10035e = d32.m10035e(Color.parseColor(str2));
                        } else {
                            tj3Var.m22111b0(-614711909);
                            jM10035e = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                            tj3Var.m22139q(false);
                        }
                    } else {
                        tj3Var.m22111b0(-614711909);
                        jM10035e = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22111b0(-574014129);
                    Iterator it = embeddedMessageElements.f14330f.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        ci0 ci0Var = ci0.f10109a;
                        if (!zHasNext) {
                            tj3Var.m22139q(false);
                            e16 e16VarMo3727a = ci0Var.mo3727a(c99.m4412e(b16Var, 1.0f), nj0.f52812g);
                            bb1 bb1VarM230a = ab1.m230a(eh0.f37240f, nj0.f52792K, tj3Var, 54);
                            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                            l77 l77VarM22132m2 = tj3Var.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarMo3727a);
                            se1.f60731q.getClass();
                            ui3 ui3Var2 = C0352b.f4299b;
                            tj3Var.m22119f0();
                            if (tj3Var.f62384S) {
                                tj3Var.m22130l(ui3Var2);
                            } else {
                                tj3Var.m22137o0();
                            }
                            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
                            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
                            oha.m18000f(tj3Var, C0352b.f4305h);
                            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
                            String str3 = embeddedMessageElements.f14325a;
                            vh9 vh9Var = ps5.f56764b;
                            vx9 vx9VarM23584b = vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71400d, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211);
                            zf1 zf1Var = ge9.f40637a;
                            long j = jM10035e;
                            lw9.m16554b(str3, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 2), 1.0f), j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var, 0, 0, 130040);
                            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                            lw9.m16554b(embeddedMessageElements.f14326b, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 2), 1.0f), j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71401e, tj3Var, 0, 0, 130040);
                            tj3Var.m22139q(true);
                            tj3Var.m22139q(true);
                            break;
                        } else {
                            final EmbeddedMessageButton embeddedMessageButton = (EmbeddedMessageButton) it.next();
                            if (fa4.m11650l(embeddedMessageButton.f14322b.f14319a, "action://disable_message/")) {
                                tj3Var.m22111b0(-1521104060);
                                boolean zM22120g2 = tj3Var.m22120g(vi3Var3) | tj3Var.m22124i(embeddedMessageButton);
                                Object objM22097O3 = tj3Var.m22097O();
                                if (zM22120g2 || objM22097O3 == p84Var4) {
                                    final int i4 = 0;
                                    objM22097O3 = new ui3() { // from class: qp2
                                        @Override // p000.ui3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo0a() {
                                            int i5 = i4;
                                            xfa xfaVar2 = xfa.f68157a;
                                            EmbeddedMessageButton embeddedMessageButton2 = embeddedMessageButton;
                                            vi3 vi3Var4 = vi3Var3;
                                            switch (i5) {
                                                case 0:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                case 1:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                case 2:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                case 3:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                case 4:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                case 5:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                                default:
                                                    vi3Var4.invoke(embeddedMessageButton2);
                                                    break;
                                            }
                                            return xfaVar2;
                                        }
                                    };
                                    tj3Var.m22131l0(objM22097O3);
                                }
                                omd.m18141c((ui3) objM22097O3, AbstractC3584sr.m21607T(ci0Var.mo3727a(b16Var, nj0.f52810e), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a), false, null, null, ci8.m4703P(-1761163859, new rp2(0, jM10035e), tj3Var), tj3Var, 1572864, 60);
                                tj3Var.m22139q(false);
                            } else {
                                tj3Var.m22111b0(-1520448658);
                                tj3Var.m22139q(false);
                            }
                        }
                    }
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    e16 e16VarM4429v = c99.m4429v(c99.m4412e(b16Var, 1.0f));
                    C3587su c3587su = eh0.f37238d;
                    ec0 ec0Var = nj0.f52791J;
                    bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var2, 0);
                    int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m3 = tj3Var2.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var3);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a2);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                    vi3 vi3Var4 = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var4);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                    e16 e16VarM22984g = ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38957f, tj3Var2, b16Var, 1.0f);
                    fc0 fc0Var = nj0.f52789H;
                    p84 p84Var5 = p84Var4;
                    vi3 vi3Var5 = vi3Var3;
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var2, 54);
                    int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m4 = tj3Var2.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM22984g);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var3);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var4);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
                    e16 e16VarM4429v2 = c99.m4429v(new as4(1.0f, true));
                    bb1 bb1VarM230a3 = ab1.m230a(c3587su, ec0Var, tj3Var2, 48);
                    int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m5 = tj3Var2.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM4429v2);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var3);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, bb1VarM230a3);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m5);
                    AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var3, tj3Var2, vi3Var4);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c5);
                    EmbeddedMessageElements embeddedMessageElements2 = embeddedMessage.f14318b;
                    lw9.m16554b(embeddedMessageElements2.f14325a, c99.m4430w(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38956e, 0.0f, 2), null, 3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71404h, tj3Var2, 0, 0, 131068);
                    thb.m22044c(tj3Var2, c99.m4414g(b16Var, ge9.m12515a(tj3Var2).f38952a));
                    lw9.m16554b(embeddedMessageElements2.f14326b, c99.m4430w(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38956e, 0.0f, 2), null, 3), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71406j, tj3Var2, 0, 0, 131068);
                    tj3Var2.m22139q(true);
                    ss5.m21702b(embeddedMessageElements2.f14327c, embeddedMessageElements2.f14328d, te1.m21995i(1.0f, c99.m4422o(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var2).f38956e, 0.0f, 2), 48.0f), false).mo3161g(new opa(fc0Var)), null, hl1.f42564a, tj3Var2, 1769472, 3992);
                    tj3Var2.m22139q(true);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var2).f38957f, tj3Var2, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var2).f38957f, 7);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var2, 0);
                    int iHashCode6 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m6 = tj3Var2.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var3);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a2);
                    oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m6);
                    AbstractC3393o1.m17747v(iHashCode6, tj3Var2, zi3Var3, tj3Var2, vi3Var4);
                    oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c6);
                    tj3Var2.m22111b0(1952620644);
                    for (final EmbeddedMessageButton embeddedMessageButton2 : embeddedMessageElements2.f14330f) {
                        if (fa4.m11650l(embeddedMessageButton2.f14322b.f14319a, "action://disable_message/")) {
                            tj3Var2.m22111b0(-2086761909);
                            vi3Var = vi3Var5;
                            boolean zM22120g3 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(embeddedMessageButton2);
                            Object objM22097O4 = tj3Var2.m22097O();
                            p84Var = p84Var5;
                            if (zM22120g3 || objM22097O4 == p84Var) {
                                final int i5 = 1;
                                objM22097O4 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i6 = i5;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton3 = embeddedMessageButton2;
                                        vi3 vi3Var6 = vi3Var;
                                        switch (i6) {
                                            case 0:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 1:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 2:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 3:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 4:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 5:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            default:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            final int i6 = 0;
                            AbstractC0231g.m1151d((ui3) objM22097O4, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e, 0.0f, 2), false, null, null, null, null, ci8.m4703P(-853648114, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i7 = i6;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton3 = embeddedMessageButton2;
                                    switch (i7) {
                                        case 0:
                                            ye1 ye1Var3 = (ye1) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var3, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var2), tj3Var2, 805306368, 508);
                            tj3Var2.m22139q(false);
                        } else {
                            p84Var = p84Var5;
                            vi3Var = vi3Var5;
                            tj3Var2.m22111b0(-2086385197);
                            boolean zM22120g4 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22124i(embeddedMessageButton2);
                            Object objM22097O5 = tj3Var2.m22097O();
                            if (zM22120g4 || objM22097O5 == p84Var) {
                                i = 2;
                                objM22097O5 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i7 = i;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton3 = embeddedMessageButton2;
                                        vi3 vi3Var6 = vi3Var;
                                        switch (i7) {
                                            case 0:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 1:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 2:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 3:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 4:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            case 5:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                            default:
                                                vi3Var6.invoke(embeddedMessageButton3);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var2.m22131l0(objM22097O5);
                            } else {
                                i = 2;
                            }
                            final int i7 = 1;
                            AbstractC0231g.m1148a((ui3) objM22097O5, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38956e, 0.0f, i), false, null, null, null, null, null, ci8.m4703P(-767910379, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i8 = i7;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton3 = embeddedMessageButton2;
                                    switch (i8) {
                                        case 0:
                                            ye1 ye1Var3 = (ye1) obj5;
                                            int iIntValue3 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var3 = (tj3) ye1Var3;
                                            if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                                tj3Var3.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var3, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton3.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var2), tj3Var2, 805306368, 508);
                            tj3Var2.m22139q(false);
                        }
                        vi3Var5 = vi3Var;
                        p84Var5 = p84Var;
                    }
                    AbstractC3393o1.m17723A(tj3Var2, false, true, true);
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ec0 ec0Var2 = nj0.f52792K;
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    e16 e16VarM4429v3 = c99.m4429v(c99.m4412e(b16Var, 1.0f));
                    bb1 bb1VarM230a4 = ab1.m230a(eh0.f37242h, nj0.f52791J, tj3Var3, 6);
                    int iHashCode7 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m7 = tj3Var3.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var3, e16VarM4429v3);
                    se1.f60731q.getClass();
                    ui3 ui3Var4 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var3, zi3Var5, bb1VarM230a4);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m7);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var3, zi3Var7, numValueOf2);
                    vi3 vi3Var6 = C0352b.f4305h;
                    oha.m18000f(tj3Var3, vi3Var6);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c7);
                    EmbeddedMessageElements embeddedMessageElements3 = embeddedMessage.f14318b;
                    if (cl9.m4842Y(embeddedMessageElements3.f14327c, "https://www.youtube.com/", false)) {
                        tj3Var3.m22111b0(-404841937);
                        String str4 = (String) vk9.m23365A0(embeddedMessageElements3.f14327c, new String[]{"v="}, 0, 6).get(1);
                        boolean zM22120g5 = tj3Var3.m22120g(str4);
                        Object objM22097O6 = tj3Var3.m22097O();
                        if (zM22120g5 || objM22097O6 == p84Var4) {
                            objM22097O6 = new t70(str4, 27);
                            tj3Var3.m22131l0(objM22097O6);
                        }
                        AbstractC0443c.m1891b((vi3) objM22097O6, c99.m4429v(c99.m4412e(b16Var, 1.0f)).mo3161g(new gv3(ec0Var2)), null, tj3Var3, 0, 4);
                        tj3Var3.m22139q(false);
                    } else {
                        tj3Var3.m22111b0(-403833383);
                        ss5.m21702b(embeddedMessageElements3.f14327c, embeddedMessageElements3.f14328d, c99.m4414g(c99.m4412e(b16Var, 1.0f), 175.0f).mo3161g(new gv3(ec0Var2)), null, hl1.f42564a, tj3Var3, 1572864, 4024);
                        tj3Var3.m22139q(false);
                    }
                    thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38957f));
                    lw9.m16554b(embeddedMessageElements3.f14325a, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var3).f38956e, 0.0f, 2), 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 0, 0, 131068);
                    thb.m22044c(tj3Var3, c99.m4414g(b16Var, ge9.m12515a(tj3Var3).f38952a));
                    lw9.m16554b(embeddedMessageElements3.f14326b, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var3).f38956e, 0.0f, 2), 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 131068);
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var3).f38957f, tj3Var3, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38957f, 7);
                    sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var3, 0);
                    p84 p84Var6 = p84Var4;
                    int iHashCode8 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m8 = tj3Var3.m22132m();
                    e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X2);
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var4);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, zi3Var5, sj8VarM20003a3);
                    oha.m18001g(tj3Var3, zi3Var6, l77VarM22132m8);
                    AbstractC3393o1.m17747v(iHashCode8, tj3Var3, zi3Var7, tj3Var3, vi3Var6);
                    oha.m18001g(tj3Var3, zi3Var8, e16VarM1322c8);
                    tj3Var3.m22111b0(-1656468019);
                    for (final EmbeddedMessageButton embeddedMessageButton3 : embeddedMessageElements3.f14330f) {
                        if (fa4.m11650l(embeddedMessageButton3.f14322b.f14319a, "action://disable_message/")) {
                            tj3Var3.m22111b0(-1236092926);
                            vi3Var2 = vi3Var3;
                            boolean zM22120g6 = tj3Var3.m22120g(vi3Var2) | tj3Var3.m22124i(embeddedMessageButton3);
                            Object objM22097O7 = tj3Var3.m22097O();
                            p84Var2 = p84Var6;
                            if (zM22120g6 || objM22097O7 == p84Var2) {
                                final int i8 = 3;
                                objM22097O7 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i9 = i8;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton4 = embeddedMessageButton3;
                                        vi3 vi3Var7 = vi3Var2;
                                        switch (i9) {
                                            case 0:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 1:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 2:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 3:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 4:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 5:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            default:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O7);
                            }
                            final int i9 = 2;
                            AbstractC0231g.m1151d((ui3) objM22097O7, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e, 0.0f, 2), false, null, null, null, null, ci8.m4703P(-997552009, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i10 = i9;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton4 = embeddedMessageButton3;
                                    switch (i10) {
                                        case 0:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var9 = (ye1) obj5;
                                            int iIntValue9 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var9 = (tj3) ye1Var9;
                                            if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                                tj3Var9.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var9, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var3), tj3Var3, 805306368, 508);
                            tj3Var3.m22139q(false);
                        } else {
                            p84Var2 = p84Var6;
                            vi3Var2 = vi3Var3;
                            tj3Var3.m22111b0(-1235716214);
                            boolean zM22120g7 = tj3Var3.m22120g(vi3Var2) | tj3Var3.m22124i(embeddedMessageButton3);
                            Object objM22097O8 = tj3Var3.m22097O();
                            if (zM22120g7 || objM22097O8 == p84Var2) {
                                final int i10 = 4;
                                objM22097O8 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i11 = i10;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton4 = embeddedMessageButton3;
                                        vi3 vi3Var7 = vi3Var2;
                                        switch (i11) {
                                            case 0:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 1:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 2:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 3:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 4:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            case 5:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                            default:
                                                vi3Var7.invoke(embeddedMessageButton4);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var3.m22131l0(objM22097O8);
                            }
                            final int i11 = 3;
                            AbstractC0231g.m1148a((ui3) objM22097O8, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38956e, 0.0f, 2), false, null, null, null, null, null, ci8.m4703P(1611784894, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i12 = i11;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton4 = embeddedMessageButton3;
                                    switch (i12) {
                                        case 0:
                                            ye1 ye1Var4 = (ye1) obj5;
                                            int iIntValue4 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var4 = (tj3) ye1Var4;
                                            if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                tj3Var4.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var4, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var9 = (ye1) obj5;
                                            int iIntValue9 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var9 = (tj3) ye1Var9;
                                            if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                                tj3Var9.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton4.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var9, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var3), tj3Var3, 805306368, 508);
                            tj3Var3.m22139q(false);
                        }
                        vi3Var3 = vi3Var2;
                        p84Var6 = p84Var2;
                    }
                    AbstractC3393o1.m17723A(tj3Var3, false, true, true);
                } else {
                    tj3Var3.m22102U();
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    e16 e16VarM4429v4 = c99.m4429v(c99.m4412e(b16Var, 1.0f));
                    bb1 bb1VarM230a5 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                    int iHashCode9 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m9 = tj3Var4.m22132m();
                    e16 e16VarM1322c9 = AbstractC0287b.m1322c(tj3Var4, e16VarM4429v4);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var5);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    zi3 zi3Var9 = C0352b.f4303f;
                    oha.m18001g(tj3Var4, zi3Var9, bb1VarM230a5);
                    zi3 zi3Var10 = C0352b.f4302e;
                    oha.m18001g(tj3Var4, zi3Var10, l77VarM22132m9);
                    Integer numValueOf3 = Integer.valueOf(iHashCode9);
                    zi3 zi3Var11 = C0352b.f4304g;
                    oha.m18001g(tj3Var4, zi3Var11, numValueOf3);
                    vi3 vi3Var7 = C0352b.f4305h;
                    oha.m18000f(tj3Var4, vi3Var7);
                    zi3 zi3Var12 = C0352b.f4301d;
                    oha.m18001g(tj3Var4, zi3Var12, e16VarM1322c9);
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var, ge9.m12515a(tj3Var4).f38957f));
                    EmbeddedMessageElements embeddedMessageElements4 = embeddedMessage.f14318b;
                    lw9.m16554b(embeddedMessageElements4.f14325a, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var4).f38956e, 0.0f, 2), 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71404h, tj3Var4, 0, 0, 131068);
                    thb.m22044c(tj3Var4, c99.m4414g(b16Var, ge9.m12515a(tj3Var4).f38952a));
                    lw9.m16554b(embeddedMessageElements4.f14326b, c99.m4412e(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var4).f38956e, 0.0f, 2), 1.0f), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var4).f71406j, tj3Var4, 0, 0, 131068);
                    e16 e16VarM21611X3 = AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var4).f38957f, tj3Var4, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var4).f38957f, 7);
                    sj8 sj8VarM20003a4 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var4, 0);
                    int iHashCode10 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m10 = tj3Var4.m22132m();
                    e16 e16VarM1322c10 = AbstractC0287b.m1322c(tj3Var4, e16VarM21611X3);
                    tj3Var4.m22119f0();
                    p84 p84Var7 = p84Var4;
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var5);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, zi3Var9, sj8VarM20003a4);
                    oha.m18001g(tj3Var4, zi3Var10, l77VarM22132m10);
                    AbstractC3393o1.m17747v(iHashCode10, tj3Var4, zi3Var11, tj3Var4, vi3Var7);
                    oha.m18001g(tj3Var4, zi3Var12, e16VarM1322c10);
                    tj3Var4.m22111b0(-147024631);
                    for (final EmbeddedMessageButton embeddedMessageButton4 : embeddedMessageElements4.f14330f) {
                        final int i12 = 5;
                        if (fa4.m11650l(embeddedMessageButton4.f14322b.f14319a, "action://disable_message/")) {
                            tj3Var4.m22111b0(972949062);
                            boolean zM22120g8 = tj3Var4.m22120g(vi3Var3) | tj3Var4.m22124i(embeddedMessageButton4);
                            Object objM22097O9 = tj3Var4.m22097O();
                            p84Var3 = p84Var7;
                            if (zM22120g8 || objM22097O9 == p84Var3) {
                                objM22097O9 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i13 = i12;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton5 = embeddedMessageButton4;
                                        vi3 vi3Var8 = vi3Var3;
                                        switch (i13) {
                                            case 0:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 1:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 2:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 3:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 4:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 5:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            default:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var4.m22131l0(objM22097O9);
                            }
                            final int i13 = 4;
                            AbstractC0231g.m1151d((ui3) objM22097O9, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38956e, 0.0f, 2), false, null, null, null, null, ci8.m4703P(-1231387021, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i14 = i13;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton5 = embeddedMessageButton4;
                                    switch (i14) {
                                        case 0:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var9 = (ye1) obj5;
                                            int iIntValue9 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var9 = (tj3) ye1Var9;
                                            if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                                tj3Var9.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var9, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var10 = (ye1) obj5;
                                            int iIntValue10 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var10 = (tj3) ye1Var10;
                                            if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                                tj3Var10.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var10, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var4), tj3Var4, 805306368, 508);
                            tj3Var4.m22139q(false);
                        } else {
                            p84Var3 = p84Var7;
                            tj3Var4.m22111b0(973325774);
                            boolean zM22120g9 = tj3Var4.m22120g(vi3Var3) | tj3Var4.m22124i(embeddedMessageButton4);
                            Object objM22097O10 = tj3Var4.m22097O();
                            if (zM22120g9 || objM22097O10 == p84Var3) {
                                final int i14 = 6;
                                objM22097O10 = new ui3() { // from class: qp2
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        int i15 = i14;
                                        xfa xfaVar2 = xfa.f68157a;
                                        EmbeddedMessageButton embeddedMessageButton5 = embeddedMessageButton4;
                                        vi3 vi3Var8 = vi3Var3;
                                        switch (i15) {
                                            case 0:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 1:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 2:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 3:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 4:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            case 5:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                            default:
                                                vi3Var8.invoke(embeddedMessageButton5);
                                                break;
                                        }
                                        return xfaVar2;
                                    }
                                };
                                tj3Var4.m22131l0(objM22097O10);
                            }
                            AbstractC0231g.m1148a((ui3) objM22097O10, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38956e, 0.0f, 2), false, null, null, null, null, null, ci8.m4703P(-1786586630, new aj3() { // from class: tp2
                                @Override // p000.aj3
                                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                    int i15 = i12;
                                    xfa xfaVar2 = xfa.f68157a;
                                    EmbeddedMessageButton embeddedMessageButton5 = embeddedMessageButton4;
                                    switch (i15) {
                                        case 0:
                                            ye1 ye1Var5 = (ye1) obj5;
                                            int iIntValue5 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var5 = (tj3) ye1Var5;
                                            if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                                tj3Var5.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var5, 0, 0, 131070);
                                            }
                                            break;
                                        case 1:
                                            ye1 ye1Var6 = (ye1) obj5;
                                            int iIntValue6 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var6 = (tj3) ye1Var6;
                                            if (!tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                                                tj3Var6.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var6.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var6, 0, 0, 131070);
                                            }
                                            break;
                                        case 2:
                                            ye1 ye1Var7 = (ye1) obj5;
                                            int iIntValue7 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var7 = (tj3) ye1Var7;
                                            if (!tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                                                tj3Var7.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var7.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var7, 0, 0, 131070);
                                            }
                                            break;
                                        case 3:
                                            ye1 ye1Var8 = (ye1) obj5;
                                            int iIntValue8 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var8 = (tj3) ye1Var8;
                                            if (!tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                                                tj3Var8.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var8, 0, 0, 131070);
                                            }
                                            break;
                                        case 4:
                                            ye1 ye1Var9 = (ye1) obj5;
                                            int iIntValue9 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var9 = (tj3) ye1Var9;
                                            if (!tj3Var9.m22099R(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                                                tj3Var9.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var9, 0, 0, 131070);
                                            }
                                            break;
                                        default:
                                            ye1 ye1Var10 = (ye1) obj5;
                                            int iIntValue10 = ((Integer) obj6).intValue();
                                            ((tj8) obj4).getClass();
                                            tj3 tj3Var10 = (tj3) ye1Var10;
                                            if (!tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 17) != 16)) {
                                                tj3Var10.m22102U();
                                            } else {
                                                lw9.m16554b(embeddedMessageButton5.f14321a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var10.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var10, 0, 0, 131070);
                                            }
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            }, tj3Var4), tj3Var4, 805306368, 508);
                            tj3Var4.m22139q(false);
                        }
                        p84Var7 = p84Var3;
                    }
                    AbstractC3393o1.m17723A(tj3Var4, false, true, true);
                } else {
                    tj3Var4.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
