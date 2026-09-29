package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.playlists.C1830f;
import com.lingq.core.playlists.C1832h;
import com.lingq.core.settings.AbstractC1858a;
import com.lingq.core.token.C1909e;
import com.lingq.feature.review.AbstractC2752c;
import com.lingq.feature.review.C2751b;
import com.lingq.feature.review.components.AbstractC2753a;
import com.lingq.feature.search.filter.components.AbstractC2771a;
import com.lingq.feature.search.search.AbstractC2776c;
import com.lingq.feature.widget.C2863a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lo6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f49935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f49936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f49937c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f49938d;

    public /* synthetic */ lo6(vi3 vi3Var, C2751b c2751b, C1909e c1909e, int i) {
        this.f49935a = 13;
        this.f49936b = vi3Var;
        this.f49937c = c2751b;
        this.f49938d = c1909e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x0479  */
    /* JADX WARN: Code duplicated, block: B:105:0x047b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        tj3 tj3Var;
        String str;
        int i = this.f49935a;
        b16 b16Var = b16.f7762a;
        p84 p84Var = we1.f66679a;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f49938d;
        Object obj4 = this.f49936b;
        Object obj5 = this.f49937c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wsb.m24149d((mo6) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                C3633u2 c3633u2 = (C3633u2) obj5;
                fe9 fe9Var = (fe9) obj3;
                vi3 vi3Var = (vi3) obj4;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else if (c3633u2.f63260b == null) {
                    tj3Var2.m22111b0(1481655009);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(1480891014);
                    e16 e16VarM15962y = l70.m15962y(b16Var);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM15962y);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var.f38960i, 0.0f, 2), 0.0f, fe9Var.f38960i, 1);
                    boolean zM22120g = tj3Var2.m22120g(vi3Var);
                    Object objM22097O = tj3Var2.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new q65(vi3Var, 25);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    ss5.m21710f(e16VarM21609V, null, null, true, (ui3) objM22097O, j2c.f44983c, tj3Var2, 199680, 6);
                    WeakHashMap weakHashMap = l6b.f49204w;
                    thb.m22044c(tj3Var2, pvc.m19502J(ho5.m13397r(tj3Var2).f49209e));
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(false);
                }
                break;
            case 2:
                zy1 zy1Var = (zy1) obj5;
                fe9 fe9Var2 = (fe9) obj3;
                vi3 vi3Var2 = (vi3) obj4;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var2;
                if (!tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else if (zy1Var.f72376d == null) {
                    tj3Var3.m22111b0(1391767187);
                    tj3Var3.m22139q(false);
                } else {
                    tj3Var3.m22111b0(1391003192);
                    e16 e16VarM15962y2 = l70.m15962y(b16Var);
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM15962y2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                    e16 e16VarM21609V2 = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var2.f38960i, 0.0f, 2), 0.0f, fe9Var2.f38960i, 1);
                    boolean zM22120g2 = tj3Var3.m22120g(vi3Var2);
                    Object objM22097O2 = tj3Var3.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new et6(vi3Var2, objArr == true ? 1 : 0);
                        tj3Var3.m22131l0(objM22097O2);
                    }
                    ss5.m21710f(e16VarM21609V2, null, null, true, (ui3) objM22097O2, q2c.f57176c, tj3Var3, 199680, 6);
                    WeakHashMap weakHashMap2 = l6b.f49204w;
                    thb.m22044c(tj3Var3, pvc.m19502J(ho5.m13397r(tj3Var3).f49209e));
                    tj3Var3.m22139q(true);
                    tj3Var3.m22139q(false);
                }
                break;
            case 3:
                w75 w75Var = (w75) obj5;
                fe9 fe9Var3 = (fe9) obj3;
                vi3 vi3Var3 = (vi3) obj4;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var3;
                if (!tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else if (w75Var.f66479b == null) {
                    tj3Var4.m22111b0(-414851457);
                    tj3Var4.m22139q(false);
                } else {
                    tj3Var4.m22111b0(-415615452);
                    e16 e16VarM15962y3 = l70.m15962y(b16Var);
                    bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var4, 0);
                    int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                    l77 l77VarM22132m3 = tj3Var4.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM15962y3);
                    se1.f60731q.getClass();
                    ui3 ui3Var3 = C0352b.f4299b;
                    tj3Var4.m22119f0();
                    if (tj3Var4.f62384S) {
                        tj3Var4.m22130l(ui3Var3);
                    } else {
                        tj3Var4.m22137o0();
                    }
                    oha.m18001g(tj3Var4, C0352b.f4303f, bb1VarM230a3);
                    oha.m18001g(tj3Var4, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var4, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var4, C0352b.f4305h);
                    oha.m18001g(tj3Var4, C0352b.f4301d, e16VarM1322c3);
                    e16 e16VarM21609V3 = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var3.f38960i, 0.0f, 2), 0.0f, fe9Var3.f38960i, 1);
                    boolean zM22120g3 = tj3Var4.m22120g(vi3Var3);
                    Object objM22097O3 = tj3Var4.m22097O();
                    if (zM22120g3 || objM22097O3 == p84Var) {
                        objM22097O3 = new et6(vi3Var3, 6);
                        tj3Var4.m22131l0(objM22097O3);
                    }
                    ss5.m21710f(e16VarM21609V3, null, null, true, (ui3) objM22097O3, k3c.f46670c, tj3Var4, 199680, 6);
                    WeakHashMap weakHashMap3 = l6b.f49204w;
                    thb.m22044c(tj3Var4, pvc.m19502J(ho5.m13397r(tj3Var4).f49209e));
                    tj3Var4.m22139q(true);
                    tj3Var4.m22139q(false);
                }
                break;
            case 4:
                ui3 ui3Var4 = (ui3) obj5;
                t66 t66Var = (t66) obj4;
                t66 t66Var2 = (t66) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                int i2 = 1;
                tj3 tj3Var5 = (tj3) ye1Var4;
                if (!tj3Var5.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var5.m22102U();
                } else {
                    AbstractC0218a.m1123c(q3c.f57217a, null, ci8.m4703P(216666225, new C0839c9(29, ui3Var4), tj3Var5), ci8.m4703P(-2046171480, new bt6(t66Var, t66Var2, i2), tj3Var5), 0.0f, 0.0f, null, null, null, tj3Var5, 3462, 498);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                oxb.m18566e((t66) obj5, (t66) obj4, (i48) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 6:
                w7a w7aVar = (w7a) obj5;
                fe9 fe9Var4 = (fe9) obj3;
                vi3 vi3Var4 = (vi3) obj4;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var5;
                if (!tj3Var6.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var6.m22102U();
                } else if (!w7aVar.f66493b) {
                    tj3Var6.m22111b0(-1729256011);
                    tj3Var6.m22139q(false);
                } else {
                    tj3Var6.m22111b0(-1730020006);
                    e16 e16VarM15962y4 = l70.m15962y(b16Var);
                    bb1 bb1VarM230a4 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var6, 0);
                    int iHashCode4 = Long.hashCode(tj3Var6.f62385T);
                    l77 l77VarM22132m4 = tj3Var6.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var6, e16VarM15962y4);
                    se1.f60731q.getClass();
                    ui3 ui3Var5 = C0352b.f4299b;
                    tj3Var6.m22119f0();
                    if (tj3Var6.f62384S) {
                        tj3Var6.m22130l(ui3Var5);
                    } else {
                        tj3Var6.m22137o0();
                    }
                    oha.m18001g(tj3Var6, C0352b.f4303f, bb1VarM230a4);
                    oha.m18001g(tj3Var6, C0352b.f4302e, l77VarM22132m4);
                    oha.m18001g(tj3Var6, C0352b.f4304g, Integer.valueOf(iHashCode4));
                    oha.m18000f(tj3Var6, C0352b.f4305h);
                    oha.m18001g(tj3Var6, C0352b.f4301d, e16VarM1322c4);
                    e16 e16VarM21609V4 = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), fe9Var4.f38960i, 0.0f, 2), 0.0f, fe9Var4.f38960i, 1);
                    boolean zM22120g4 = tj3Var6.m22120g(vi3Var4);
                    Object objM22097O4 = tj3Var6.m22097O();
                    if (zM22120g4 || objM22097O4 == p84Var) {
                        objM22097O4 = new et6(vi3Var4, 12);
                        tj3Var6.m22131l0(objM22097O4);
                    }
                    ss5.m21710f(e16VarM21609V4, null, null, true, (ui3) objM22097O4, dfc.f35576c, tj3Var6, 199680, 6);
                    WeakHashMap weakHashMap4 = l6b.f49204w;
                    thb.m22044c(tj3Var6, pvc.m19502J(ho5.m13397r(tj3Var6).f49209e));
                    tj3Var6.m22139q(true);
                    tj3Var6.m22139q(false);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((C2863a) obj5).m9775h((List) obj4, (Playlist) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 8:
                C1832h c1832h = (C1832h) obj5;
                oe7 oe7Var = (oe7) obj4;
                dh9 dh9Var = (dh9) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var6;
                if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    tj3Var7.m22102U();
                } else {
                    e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                    WeakHashMap weakHashMap5 = l6b.f49204w;
                    e16 e16VarM23904F = wfb.m23904F(e16VarM4411d, ho5.m13397r(tj3Var7).f49210f);
                    bb1 bb1VarM230a5 = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var7, 0);
                    int iHashCode5 = Long.hashCode(tj3Var7.f62385T);
                    l77 l77VarM22132m5 = tj3Var7.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var7, e16VarM23904F);
                    se1.f60731q.getClass();
                    ui3 ui3Var6 = C0352b.f4299b;
                    tj3Var7.m22119f0();
                    if (tj3Var7.f62384S) {
                        tj3Var7.m22130l(ui3Var6);
                    } else {
                        tj3Var7.m22137o0();
                    }
                    oha.m18001g(tj3Var7, C0352b.f4303f, bb1VarM230a5);
                    oha.m18001g(tj3Var7, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var7, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var7, C0352b.f4305h);
                    oha.m18001g(tj3Var7, C0352b.f4301d, e16VarM1322c5);
                    tf7 tf7Var = (tf7) dh9Var.getValue();
                    boolean zM22124i = tj3Var7.m22124i(c1832h) | tj3Var7.m22124i(oe7Var);
                    Object objM22097O5 = tj3Var7.m22097O();
                    if (zM22124i || objM22097O5 == p84Var) {
                        objM22097O5 = new of7(c1832h, oe7Var);
                        tj3Var7.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var5 = (vi3) objM22097O5;
                    boolean zM22124i2 = tj3Var7.m22124i(c1832h);
                    Object objM22097O6 = tj3Var7.m22097O();
                    if (zM22124i2 || objM22097O6 == p84Var) {
                        objM22097O6 = new pf7(c1832h, 0);
                        tj3Var7.m22131l0(objM22097O6);
                    }
                    vi3 vi3Var6 = (vi3) objM22097O6;
                    boolean zM22124i3 = tj3Var7.m22124i(c1832h);
                    Object objM22097O7 = tj3Var7.m22097O();
                    if (zM22124i3 || objM22097O7 == p84Var) {
                        objM22097O7 = new C1830f(c1832h, 1);
                        tj3Var7.m22131l0(objM22097O7);
                    }
                    vi3 vi3Var7 = (vi3) objM22097O7;
                    boolean zM22120g5 = tj3Var7.m22120g(dh9Var) | tj3Var7.m22124i(c1832h) | tj3Var7.m22124i(oe7Var);
                    Object objM22097O8 = tj3Var7.m22097O();
                    if (zM22120g5 || objM22097O8 == p84Var) {
                        objM22097O8 = new qf7(c1832h, oe7Var, dh9Var, objArr2 == true ? 1 : 0);
                        tj3Var7.m22131l0(objM22097O8);
                    }
                    k3c.m14790a(tf7Var, vi3Var5, vi3Var6, vi3Var7, (ui3) objM22097O8, tj3Var7, 0);
                    tj3Var7.m22139q(true);
                }
                break;
            case 9:
                fm7 fm7Var = (fm7) obj5;
                vi3 vi3Var8 = (vi3) obj4;
                Context context = (Context) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var7;
                if (!tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    tj3Var8.m22102U();
                } else {
                    bb1 bb1VarM230a6 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var8, 48);
                    int iHashCode6 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m6 = tj3Var8.m22132m();
                    e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var8, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var7 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var7);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, C0352b.f4303f, bb1VarM230a6);
                    oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m6);
                    oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode6));
                    oha.m18000f(tj3Var8, C0352b.f4305h);
                    oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c6);
                    String str2 = fm7Var.f39291e;
                    String str3 = fm7Var.f39289c;
                    String str4 = fm7Var.f39288b;
                    if (str2 == null) {
                        tj3Var8.m22111b0(-39330494);
                        tj3Var8.m22139q(false);
                        tj3Var = tj3Var8;
                    } else {
                        tj3Var8.m22111b0(-39330493);
                        ss5.m21702b(str2, null, pb1.m19045o(AbstractC3584sr.m21609V(c99.m4430w(b16Var, null, 3), 0.0f, ((fe9) tj3Var8.m22128k(ge9.f40637a)).f38956e, 1), ((ms5) tj3Var8.m22128k(ps5.f56764b)).f51801c.f64857c), null, null, tj3Var8, 48, 4088);
                        tj3Var = tj3Var8;
                        tj3Var.m22139q(false);
                    }
                    if (vk9.m23391n0(str4)) {
                        tj3Var.m22111b0(-38078589);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-38754978);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        zf1 zf1Var = ge9.f40637a;
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38962k, ((fe9) tj3Var.m22128k(zf1Var)).f38952a);
                        vh9 vh9Var = ps5.f56764b;
                        tj3 tj3Var9 = tj3Var;
                        lw9.m16554b(str4, e16VarM21608U, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var9, 0, 0, 130040);
                        tj3Var = tj3Var9;
                        tj3Var.m22139q(false);
                    }
                    if (vk9.m23391n0(str3)) {
                        tj3Var.m22111b0(-37641117);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-37972507);
                        e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                        vh9 vh9Var2 = ps5.f56764b;
                        tj3 tj3Var10 = tj3Var;
                        lw9.m16554b(str3, e16VarM4412e2, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71406j, tj3Var10, 48, 0, 131064);
                        tj3Var = tj3Var10;
                        tj3Var.m22139q(false);
                    }
                    String str5 = fm7Var.f39292f;
                    if (str5 == null || str5.length() == 0) {
                        tj3Var.m22111b0(-37032029);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-37529672);
                        e16 e16VarM21609V5 = AbstractC3584sr.m21609V(b16Var, 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f, 1);
                        boolean zM22120g6 = tj3Var.m22120g(vi3Var8) | tj3Var.m22124i(fm7Var);
                        Object objM22097O9 = tj3Var.m22097O();
                        if (zM22120g6 || objM22097O9 == p84Var) {
                            objM22097O9 = new a45(16, vi3Var8, fm7Var);
                            tj3Var.m22131l0(objM22097O9);
                        }
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O9, e16VarM21609V5, 15);
                        context.getClass();
                        String str6 = fm7Var.f39293g;
                        if (str6 != null) {
                            switch (str6) {
                                case "monthly_lingqing":
                                case "hardcore90days":
                                    str = "challenges_see_how_stacking_up";
                                    break;
                                case "monthly90days":
                                    str = "challenges_check_leaderboard";
                                    break;
                                case "monthlyLingQing":
                                    str = "challenges_see_how_stacking_up";
                                    break;
                                default:
                                    str = "challenges_go_to_challenge_page";
                                    break;
                            }
                        } else {
                            str = "challenges_go_to_challenge_page";
                        }
                        String string = context.getString(str.equals("challenges_see_how_stacking_up") ? R$string.challenges_see_how_stacking_up : str.equals("challenges_check_leaderboard") ? R$string.challenges_check_leaderboard : R$string.challenges_go_to_challenge_page);
                        string.getClass();
                        tj3 tj3Var11 = tj3Var;
                        lw9.m16554b(string, e16VarM815b, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4208a(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var11, 0, 0, 131064);
                        tj3Var = tj3Var11;
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                gjc.m12715a((j25) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8590f((sz7) obj5, (vi3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                pwc.m19556a((nd8) obj5, (vi3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(385));
                break;
            case 13:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9583f((vi3) obj4, (C2751b) obj5, (C1909e) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 14:
                ((Integer) obj2).getClass();
                AbstractC2753a.m9593g((fg8) obj5, (vi3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(385));
                break;
            case 15:
                ((Integer) obj2).getClass();
                pxc.m19566a((ug8) obj5, (vi3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                iyc.m14210b((ArrayList) obj5, (C0282a) obj4, (on3) obj3, (ye1) obj, pk9.m19383z(24625));
                break;
            case 17:
                ((Integer) obj2).getClass();
                yyc.m25385a((mo8) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                d0d.m9965a((hq8) obj5, (ui3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                h0d.m12995a((u19) obj5, (vi3) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC2771a.m9694d((e16) obj5, (y19) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                AbstractC2771a.m9691a((e16) obj5, (s19) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                m0d.m16592a((gt8) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Integer) obj2).getClass();
                AbstractC2776c.m9702b((xs8) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                r1d.m20250e((e16) obj5, (b39) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                r1d.m20248c((e16) obj5, (z29) obj3, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                b2d.m3202a((C0282a) obj5, (String) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(7));
                break;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                t66 t66Var3 = (t66) obj5;
                ServerEnvironment serverEnvironment = (ServerEnvironment) obj3;
                vi3 vi3Var9 = (vi3) obj4;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var8;
                if (!tj3Var12.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    tj3Var12.m22102U();
                } else {
                    boolean zM22120g7 = tj3Var12.m22120g(t66Var3) | tj3Var12.m22116e(serverEnvironment.ordinal()) | tj3Var12.m22120g(vi3Var9);
                    Object objM22097O10 = tj3Var12.m22097O();
                    if (zM22120g7 || objM22097O10 == p84Var) {
                        objM22097O10 = new u29((Object) serverEnvironment, (Object) vi3Var9, (Object) t66Var3, (int) (objArr3 == true ? 1 : 0));
                        tj3Var12.m22131l0(objM22097O10);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var12, (ui3) objM22097O10, goc.f41103d, null, null, null, false);
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8591g((ServerEnvironment) obj5, (ui3) obj3, (vi3) obj4, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1858a.m8599o((e16) obj5, (x19) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ lo6(int i, vi3 vi3Var, Object obj, Object obj2) {
        this.f49935a = i;
        this.f49937c = obj;
        this.f49938d = obj2;
        this.f49936b = vi3Var;
    }

    public /* synthetic */ lo6(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f49935a = i2;
        this.f49937c = obj;
        this.f49936b = obj2;
        this.f49938d = obj3;
    }

    public /* synthetic */ lo6(Object obj, Object obj2, vi3 vi3Var, int i, int i2) {
        this.f49935a = i2;
        this.f49937c = obj;
        this.f49938d = obj2;
        this.f49936b = vi3Var;
    }

    public /* synthetic */ lo6(Object obj, Object obj2, Object obj3, int i) {
        this.f49935a = i;
        this.f49937c = obj;
        this.f49936b = obj2;
        this.f49938d = obj3;
    }
}
