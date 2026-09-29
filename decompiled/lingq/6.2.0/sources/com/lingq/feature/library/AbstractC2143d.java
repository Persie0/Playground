package com.lingq.feature.library;

import android.content.Context;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.notification.Notice;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.lessoninfo.AbstractC2131b;
import com.lingq.feature.library.C2146e;
import com.lingq.feature.library.components.dialogs.AbstractC2142b;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3584sr;
import p000.C3186kj;
import p000.C3436ou;
import p000.C3661uu;
import p000.C3794yf;
import p000.b16;
import p000.b34;
import p000.b85;
import p000.bcd;
import p000.bl2;
import p000.c7a;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.d95;
import p000.db5;
import p000.dcd;
import p000.di0;
import p000.e16;
import p000.ecd;
import p000.em6;
import p000.fa4;
import p000.fe9;
import p000.gcd;
import p000.ge9;
import p000.gm5;
import p000.gpc;
import p000.h68;
import p000.h85;
import p000.h95;
import p000.hcd;
import p000.ja5;
import p000.je2;
import p000.kv4;
import p000.la5;
import p000.lda;
import p000.lp7;
import p000.ma5;
import p000.mp7;
import p000.mv4;
import p000.n4b;
import p000.oa5;
import p000.omd;
import p000.op7;
import p000.p68;
import p000.p84;
import p000.poc;
import p000.qa5;
import p000.qoc;
import p000.ra5;
import p000.s35;
import p000.sc9;
import p000.t66;
import p000.t9a;
import p000.tj3;
import p000.u91;
import p000.ua5;
import p000.ui3;
import p000.ux5;
import p000.va5;
import p000.vi3;
import p000.wa5;
import p000.we1;
import p000.wfb;
import p000.x16;
import p000.x17;
import p000.x18;
import p000.xfa;
import p000.xgc;
import p000.xwc;
import p000.y59;
import p000.ya5;
import p000.ye1;
import p000.z25;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.library.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2143d {
    /* JADX INFO: renamed from: a */
    public static final void m9057a(List list, b85 b85Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-735211669);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i | (tj3Var.m22120g(b85Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            p84 p84Var = we1.f66679a;
            if (size == 1) {
                tj3Var.m22111b0(1642573847);
                EmbeddedMessage embeddedMessage = (EmbeddedMessage) u91.m22589G0(list);
                e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(AbstractC3184kh.m15198E(new la5(b85Var, embeddedMessage, 0)), 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38960i, 0.0f, 2);
                int i3 = db5.f35358c[gcd.m12483c(embeddedMessage.m7034a()).ordinal()];
                if (i3 == 1) {
                    tj3Var.m22111b0(1642878019);
                    boolean zM22124i = ((i2 & 112) == 32) | tj3Var.m22124i(embeddedMessage);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new la5(b85Var, embeddedMessage, 1);
                        tj3Var.m22131l0(objM22097O);
                    }
                    ecd.m11039a(embeddedMessage, (vi3) objM22097O, e16VarM21609V, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else if (i3 == 2) {
                    tj3Var.m22111b0(1643316545);
                    boolean zM22124i2 = tj3Var.m22124i(embeddedMessage) | ((i2 & 112) == 32);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new la5(b85Var, embeddedMessage, 2);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    dcd.m10287a(embeddedMessage, (vi3) objM22097O2, e16VarM21609V, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else if (i3 == 3) {
                    tj3Var.m22111b0(1643753862);
                    boolean zM22124i3 = tj3Var.m22124i(embeddedMessage) | ((i2 & 112) == 32);
                    Object objM22097O3 = tj3Var.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new la5(b85Var, embeddedMessage, 3);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    hcd.m13199a(embeddedMessage, (vi3) objM22097O3, e16VarM21609V, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else {
                    if (i3 != 4) {
                        throw ux5.m23001x(tj3Var, 2131204754, false);
                    }
                    tj3Var.m22111b0(1644194558);
                    boolean zM22124i4 = tj3Var.m22124i(embeddedMessage) | ((i2 & 112) == 32);
                    Object objM22097O4 = tj3Var.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new la5(b85Var, embeddedMessage, 4);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    bcd.m3619a(embeddedMessage, (vi3) objM22097O4, e16VarM21609V, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1644718148);
                e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
                zf1 zf1Var = ge9.f40637a;
                C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28));
                x17 x17VarM21626g = AbstractC3584sr.m21626g(((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 10);
                boolean zM22124i5 = tj3Var.m22124i(list) | ((i2 & 112) == 32);
                Object objM22097O5 = tj3Var.m22097O();
                if (zM22124i5 || objM22097O5 == p84Var) {
                    objM22097O5 = new h85(5, list, b85Var);
                    tj3Var.m22131l0(objM22097O5);
                }
                fa4.m11643d(e16VarM4412e, null, x17VarM21626g, c3661uu, null, null, false, null, (vi3) objM22097O5, tj3Var, 6, 490);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(list, i, 0, b85Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX INFO: renamed from: b */
    public static final void m9058b(C2146e c2146e, vi3 vi3Var, ye1 ye1Var, int i) {
        final C2146e c2146e2;
        vi3 vi3Var2;
        tj3 tj3Var;
        ?? r2;
        boolean z;
        Object obj;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1299907696);
        int i2 = (tj3Var2.m22124i(c2146e) ? 4 : 2) | i | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2146e.f26659H, tj3Var2);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            Object obj2 = objM22097O;
            if (objM22097O == p84Var) {
                t66 t66VarM1260j = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(t66VarM1260j);
                obj2 = t66VarM1260j;
            }
            t66 t66Var = (t66) obj2;
            Object objM22097O2 = tj3Var2.m22097O();
            Object obj3 = objM22097O2;
            if (objM22097O2 == p84Var) {
                sc9 sc9VarM1257g = AbstractC0278f.m1257g(-1);
                tj3Var2.m22131l0(sc9VarM1257g);
                obj3 = sc9VarM1257g;
            }
            sc9 sc9Var = (sc9) obj3;
            Object objM22097O3 = tj3Var2.m22097O();
            Object obj4 = objM22097O3;
            if (objM22097O3 == p84Var) {
                t66 t66VarM1260j2 = AbstractC0278f.m1260j("");
                tj3Var2.m22131l0(t66VarM1260j2);
                obj4 = t66VarM1260j2;
            }
            t66 t66Var2 = (t66) obj4;
            Object objM22097O4 = tj3Var2.m22097O();
            Object obj5 = objM22097O4;
            if (objM22097O4 == p84Var) {
                t66 t66VarM1260j3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(t66VarM1260j3);
                obj5 = t66VarM1260j3;
            }
            t66 t66Var3 = (t66) obj5;
            ja5 ja5Var = (ja5) t66VarM2513c.getValue();
            C2139c c2139c = new C2139c(vi3Var, c2146e, t66VarM2513c, sc9Var, t66Var2, t66Var3, t66Var);
            c2146e2 = c2146e;
            m9059c(ja5Var, c2139c, null, tj3Var2, 0);
            z25 z25Var = ((ja5) t66VarM2513c.getValue()).f45341f.f45462h;
            if (z25Var.f70787a) {
                tj3Var2.m22111b0(-2114009864);
                s35 s35Var = new s35(z25Var.f70788b, z25Var.f70789c, z25Var.f70790d, z25Var.f70791e, null, z25Var.f70792f, 48);
                ya5 ya5Var = new ya5(c2146e2, vi3Var, z25Var);
                boolean zM22124i = tj3Var2.m22124i(c2146e2);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22124i || objM22097O5 == p84Var) {
                    z = false;
                    final boolean z2 = false ? 1 : 0;
                    ui3 ui3Var = new ui3() { // from class: na5
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i3 = z2;
                            xfa xfaVar = xfa.f68157a;
                            C2146e c2146e3 = c2146e2;
                            switch (i3) {
                                case 0:
                                    c2146e3.mo3737M1(UpgradeReason.PLAYLISTS);
                                    break;
                                default:
                                    c2146e3.m9064V2();
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var2.m22131l0(ui3Var);
                    obj = ui3Var;
                } else {
                    z = false;
                    obj = objM22097O5;
                }
                AbstractC2131b.m9046e(s35Var, ya5Var, (ui3) obj, tj3Var2, 48);
                tj3Var2.m22139q(z);
                r2 = z;
            } else {
                r2 = 0;
                tj3Var2.m22111b0(-2110632910);
                tj3Var2.m22139q(false);
            }
            boolean z3 = true;
            d32.m10060t(((Boolean) t66Var.getValue()).booleanValue(), sc9Var.m21222h(), (String) t66Var2.getValue(), ((Boolean) t66Var3.getValue()).booleanValue(), false, new bl2(t66Var, c2146e2), null, tj3Var2, 24576, 64);
            h68 h68Var = ((ja5) t66VarM2513c.getValue()).f45341f.f45463i;
            boolean zM22124i2 = tj3Var2.m22124i(c2146e2);
            Object objM22097O6 = tj3Var2.m22097O();
            Object obj6 = objM22097O6;
            if (zM22124i2 || objM22097O6 == p84Var) {
                ui3 ui3Var2 = new ui3() { // from class: com.lingq.feature.library.a
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        Object value;
                        ja5 ja5Var2;
                        C2146e c2146e3 = c2146e2;
                        C3244l c3244l = c2146e3.f26658G;
                        h68 h68Var2 = ((ja5) c3244l.getValue()).f45341f.f45463i;
                        if (h68Var2.f41840a && !h68Var2.f41843d) {
                            do {
                                value = c3244l.getValue();
                                ja5Var2 = (ja5) value;
                            } while (!c3244l.m15570h(value, ja5.m14361a(ja5Var2, null, null, false, null, false, je2.m14414a(ja5Var2.f45341f, null, null, null, null, null, null, null, null, h68.m13100a(h68Var2, true, null), 255), null, null, false, false, false, 2015)));
                            wfb.m23926u(lda.m16103C(c2146e3), c2146e3.f26655D, null, new LibraryUpdateViewModel$repairStreak$2(c2146e3, h68Var2, null), 2);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(ui3Var2);
                obj6 = ui3Var2;
            }
            ui3 ui3Var3 = (ui3) obj6;
            boolean zM22124i3 = tj3Var2.m22124i(c2146e2);
            Object objM22097O7 = tj3Var2.m22097O();
            Object obj7 = objM22097O7;
            if (zM22124i3 || objM22097O7 == p84Var) {
                final boolean z4 = z3 ? 1 : 0;
                ui3 ui3Var4 = new ui3() { // from class: na5
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i3 = z4;
                        xfa xfaVar = xfa.f68157a;
                        C2146e c2146e3 = c2146e2;
                        switch (i3) {
                            case 0:
                                c2146e3.mo3737M1(UpgradeReason.PLAYLISTS);
                                break;
                            default:
                                c2146e3.m9064V2();
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var2.m22131l0(ui3Var4);
                obj7 = ui3Var4;
            }
            ui3 ui3Var5 = (ui3) obj7;
            ?? r4 = (i2 & 112) != 32 ? r2 : 1;
            Object objM22097O8 = tj3Var2.m22097O();
            Object obj8 = objM22097O8;
            if (r4 != 0 || objM22097O8 == p84Var) {
                oa5 oa5Var = new oa5(vi3Var, r2);
                tj3Var2.m22131l0(oa5Var);
                obj8 = oa5Var;
            }
            tj3 tj3Var3 = tj3Var2;
            vi3Var2 = vi3Var;
            omd.m18153i(h68Var, ui3Var3, ui3Var5, (ui3) obj8, tj3Var3, 0, 0);
            tj3Var = tj3Var3;
        } else {
            c2146e2 = c2146e;
            tj3 tj3Var4 = tj3Var2;
            vi3Var2 = vi3Var;
            tj3Var4.m22102U();
            tj3Var = tj3Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3794yf(c2146e2, i, 13, vi3Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r14v1, types: [tj3] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v8, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r22v2, types: [ye1] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v58 */
    /* JADX WARN: Type inference failed for: r2v60 */
    /* JADX WARN: Type inference failed for: r2v61 */
    /* JADX WARN: Type inference failed for: r2v64 */
    /* JADX WARN: Type inference failed for: r2v65 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v7, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r8v13, types: [tj3] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v3, types: [tj3] */
    /* JADX WARN: Type inference failed for: r8v4, types: [tj3, ye1] */
    /* JADX INFO: renamed from: c */
    public static final void m9059c(final ja5 ja5Var, b85 b85Var, n4b n4bVar, ye1 ye1Var, int i) {
        n4b n4bVar2;
        ?? r14;
        int i2;
        n4b n4bVarM21912b;
        Object next;
        tj3 tj3Var;
        p84 p84Var;
        boolean z;
        boolean z2;
        Object libraryUpdateScreenKt$LibraryScreen$3$1;
        em6 em6Var;
        ui3 ui3Var;
        final b85 b85Var2;
        final ?? r10;
        ?? r7;
        ?? r8;
        int i3;
        final b85 b85Var3 = b85Var;
        ja5Var.getClass();
        List list = ja5Var.f45337b;
        je2 je2Var = ja5Var.f45341f;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1651567514);
        int i4 = i | (tj3Var2.m22124i(ja5Var) ? 4 : 2) | (tj3Var2.m22120g(b85Var3) ? 32 : 16) | 128;
        if (tj3Var2.m22099R(i4 & 1, (i4 & 147) != 146)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                i2 = i4 & (-897);
                n4bVarM21912b = t9a.m21912b(tj3Var2);
            } else {
                tj3Var2.m22102U();
                i2 = i4 & (-897);
                n4bVarM21912b = n4bVar;
            }
            tj3Var2.m22140r();
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            mp7 mp7VarM16426d = lp7.m16426d(tj3Var2);
            boolean zM22120g = tj3Var2.m22120g(list);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22120g || objM22097O == p84Var2) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((h95) next) instanceof d95));
                h95 h95Var = (h95) next;
                objM22097O = h95Var != null ? h95Var.mo188a() : null;
                tj3Var2.m22131l0(objM22097O);
            }
            String str = (String) objM22097O;
            p68 p68Var = je2Var.f45456b;
            x16 x16Var = je2Var.f45460f;
            em6 em6Var2 = je2Var.f45458d;
            op7 op7Var = je2Var.f45457c;
            if (p68Var.f55660a) {
                tj3Var2.m22111b0(1298010897);
                String str2 = je2Var.f45456b.f55661b;
                int i5 = i2 & 112;
                boolean z3 = i5 == 32;
                Object objM22097O2 = tj3Var2.m22097O();
                if (z3 || objM22097O2 == p84Var2) {
                    objM22097O2 = new ma5(b85Var3, 1);
                    tj3Var2.m22131l0(objM22097O2);
                }
                ui3 ui3Var2 = (ui3) objM22097O2;
                boolean zM22124i = tj3Var2.m22124i(ja5Var) | (i5 == 32);
                Object objM22097O3 = tj3Var2.m22097O();
                if (zM22124i || objM22097O3 == p84Var2) {
                    objM22097O3 = new C3794yf(14, ja5Var, b85Var3);
                    tj3Var2.m22131l0(objM22097O3);
                }
                tj3Var = tj3Var2;
                p84Var = p84Var2;
                z2 = false;
                z = true;
                gpc.m12795a(true, str2, ui3Var2, (zi3) objM22097O3, tj3Var, 6);
                tj3Var.m22139q(false);
            } else {
                tj3Var = tj3Var2;
                p84Var = p84Var2;
                z = true;
                z2 = false;
                tj3Var.m22111b0(1298390492);
                tj3Var.m22139q(false);
            }
            C3436ou c3436ou = je2Var.f45455a;
            int i6 = i2 & 112;
            boolean z4 = i6 != 32 ? z2 : z;
            Object objM22097O4 = tj3Var.m22097O();
            if (z4 || objM22097O4 == p84Var) {
                em6Var = em6Var2;
                libraryUpdateScreenKt$LibraryScreen$3$1 = new LibraryUpdateScreenKt$LibraryScreen$3$1(0, b85Var3, b85.class, "onArchiveConfirmed", "onArchiveConfirmed()V", 0);
                tj3Var.m22131l0(libraryUpdateScreenKt$LibraryScreen$3$1);
            } else {
                em6Var = em6Var2;
                libraryUpdateScreenKt$LibraryScreen$3$1 = objM22097O4;
            }
            ui3 ui3Var3 = (ui3) ((FunctionReference) libraryUpdateScreenKt$LibraryScreen$3$1);
            boolean z5 = i6 == 32;
            Object objM22097O5 = tj3Var.m22097O();
            if (z5 || objM22097O5 == p84Var) {
                ui3Var = ui3Var3;
                LibraryUpdateScreenKt$LibraryScreen$4$1 libraryUpdateScreenKt$LibraryScreen$4$1 = new LibraryUpdateScreenKt$LibraryScreen$4$1(0, b85Var, b85.class, "onDismissArchiveDialog", "onDismissArchiveDialog()V", 0);
                b85Var2 = b85Var;
                tj3Var.m22131l0(libraryUpdateScreenKt$LibraryScreen$4$1);
                objM22097O5 = libraryUpdateScreenKt$LibraryScreen$4$1;
            } else {
                b85Var2 = b85Var;
                ui3Var = ui3Var3;
            }
            xwc.m24754a(c3436ou, ui3Var, (ui3) ((FunctionReference) objM22097O5), tj3Var, 0);
            if (op7Var.f54688a) {
                tj3Var.m22111b0(1298671662);
                int i7 = op7Var.f54689b;
                int i8 = op7Var.f54690c;
                boolean zM22124i2 = tj3Var.m22124i(ja5Var) | (i6 == 32);
                Object objM22097O6 = tj3Var.m22097O();
                if (zM22124i2 || objM22097O6 == p84Var) {
                    final int i9 = 2;
                    objM22097O6 = new ui3() { // from class: pa5
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i10 = i9;
                            xfa xfaVar = xfa.f68157a;
                            b85 b85Var4 = b85Var2;
                            ja5 ja5Var2 = ja5Var;
                            switch (i10) {
                                case 0:
                                    Integer num = ja5Var2.f45341f.f45461g.f67785b;
                                    if (num != null) {
                                        b85Var4.mo3472y(num.intValue());
                                    }
                                    break;
                                case 1:
                                    s45 s45Var = ja5Var2.f45343h;
                                    if (s45Var != null) {
                                        b85Var4.mo3452e(s45Var);
                                    }
                                    break;
                                case 2:
                                    LibraryItem libraryItem = ja5Var2.f45341f.f45457c.f54691d;
                                    if (libraryItem != null) {
                                        b85Var4.mo3445Y(libraryItem);
                                    }
                                    break;
                                default:
                                    LibraryItem libraryItem2 = ja5Var2.f45341f.f45459e.f69325b;
                                    if (libraryItem2 != null) {
                                        b85Var4.mo3453f(libraryItem2);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O6);
                }
                ui3 ui3Var4 = (ui3) objM22097O6;
                boolean z6 = i6 == 32;
                Object objM22097O7 = tj3Var.m22097O();
                if (z6 || objM22097O7 == p84Var) {
                    objM22097O7 = new ma5(b85Var2, 5);
                    tj3Var.m22131l0(objM22097O7);
                }
                ui3 ui3Var5 = (ui3) objM22097O7;
                tj3 tj3Var3 = tj3Var;
                r10 = 0;
                xgc.m24513b(true, i7, i8, ui3Var4, ui3Var5, tj3Var3, 6);
                tj3Var3.m22139q(false);
                r7 = tj3Var3;
            } else {
                r10 = 0;
                tj3 tj3Var4 = tj3Var;
                tj3Var4.m22111b0(1299146396);
                tj3Var4.m22139q(false);
                r7 = tj3Var4;
            }
            if (em6Var.f37456a) {
                r7.m22111b0(1299216766);
                int i10 = em6Var.f37457b;
                int i11 = em6Var.f37458c;
                ?? r2 = i6 != 32 ? r10 : 1;
                Object objM22097O8 = r7.m22097O();
                Object obj = objM22097O8;
                if (r2 != 0 || objM22097O8 == p84Var) {
                    ma5 ma5Var = new ma5(b85Var2, 6);
                    r7.m22131l0(ma5Var);
                    obj = ma5Var;
                }
                ui3 ui3Var6 = (ui3) obj;
                ?? r3 = i6 != 32 ? r10 : 1;
                Object objM22097O9 = r7.m22097O();
                Object obj2 = objM22097O9;
                if (r3 != 0 || objM22097O9 == p84Var) {
                    ma5 ma5Var2 = new ma5(b85Var2, 7);
                    r7.m22131l0(ma5Var2);
                    obj2 = ma5Var2;
                }
                xgc.m24512a(true, i10, i11, ui3Var6, (ui3) obj2, r7, 6);
                r7.m22139q(r10);
            } else {
                r7.m22111b0(1299553116);
                r7.m22139q(r10);
            }
            final int i12 = 3;
            if (je2Var.f45459e.f69324a) {
                r7.m22111b0(1299630554);
                int i13 = (r7.m22124i(ja5Var) ? 1 : 0) | (i6 != 32 ? r10 : 1);
                Object objM22097O10 = r7.m22097O();
                Object obj3 = objM22097O10;
                if (i13 != 0 || objM22097O10 == p84Var) {
                    ui3 ui3Var7 = new ui3() { // from class: pa5
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i14 = i12;
                            xfa xfaVar = xfa.f68157a;
                            b85 b85Var4 = b85Var2;
                            ja5 ja5Var2 = ja5Var;
                            switch (i14) {
                                case 0:
                                    Integer num = ja5Var2.f45341f.f45461g.f67785b;
                                    if (num != null) {
                                        b85Var4.mo3472y(num.intValue());
                                    }
                                    break;
                                case 1:
                                    s45 s45Var = ja5Var2.f45343h;
                                    if (s45Var != null) {
                                        b85Var4.mo3452e(s45Var);
                                    }
                                    break;
                                case 2:
                                    LibraryItem libraryItem = ja5Var2.f45341f.f45457c.f54691d;
                                    if (libraryItem != null) {
                                        b85Var4.mo3445Y(libraryItem);
                                    }
                                    break;
                                default:
                                    LibraryItem libraryItem2 = ja5Var2.f45341f.f45459e.f69325b;
                                    if (libraryItem2 != null) {
                                        b85Var4.mo3453f(libraryItem2);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    r7.m22131l0(ui3Var7);
                    obj3 = ui3Var7;
                }
                ui3 ui3Var8 = (ui3) obj3;
                ?? r4 = i6 != 32 ? r10 : 1;
                Object objM22097O11 = r7.m22097O();
                Object obj4 = objM22097O11;
                if (r4 != 0 || objM22097O11 == p84Var) {
                    ma5 ma5Var3 = new ma5(b85Var2, 8);
                    r7.m22131l0(ma5Var3);
                    obj4 = ma5Var3;
                }
                qoc.m20093a(ui3Var8, (ui3) obj4, r7, 6);
                r7.m22139q(r10);
            } else {
                r7.m22111b0(1299970748);
                r7.m22139q(r10);
            }
            if (x16Var.f67632a) {
                r7.m22111b0(1300059997);
                Notice notice = x16Var.f67633b;
                List list2 = x16Var.f67634c;
                ?? r5 = i6 != 32 ? r10 : 1;
                Object objM22097O12 = r7.m22097O();
                Object obj5 = objM22097O12;
                if (r5 != 0 || objM22097O12 == p84Var) {
                    kv4 kv4Var = new kv4(b85Var2, 6);
                    r7.m22131l0(kv4Var);
                    obj5 = kv4Var;
                }
                vi3 vi3Var = (vi3) obj5;
                ?? r6 = i6 != 32 ? r10 : 1;
                Object objM22097O13 = r7.m22097O();
                Object obj6 = objM22097O13;
                if (r6 != 0 || objM22097O13 == p84Var) {
                    ma5 ma5Var4 = new ma5(b85Var2, 9);
                    r7.m22131l0(ma5Var4);
                    obj6 = ma5Var4;
                }
                ui3 ui3Var9 = (ui3) obj6;
                ?? r9 = i6 != 32 ? r10 : 1;
                Object objM22097O14 = r7.m22097O();
                Object obj7 = objM22097O14;
                if (r9 != 0 || objM22097O14 == p84Var) {
                    ma5 ma5Var5 = new ma5(b85Var2, 2);
                    r7.m22131l0(ma5Var5);
                    obj7 = ma5Var5;
                }
                AbstractC2142b.m9056a(notice, list2, vi3Var, ui3Var9, (ui3) obj7, r7, 384);
                ?? r11 = r7;
                r11.m22139q(r10);
                r8 = r11;
            } else {
                ?? r12 = r7;
                r12.m22111b0(1300495516);
                r12.m22139q(r10);
                r8 = r12;
            }
            if (je2Var.f45461g.f67784a) {
                r8.m22111b0(1300573791);
                int i14 = (r8.m22124i(ja5Var) ? 1 : 0) | (i6 != 32 ? r10 : 1);
                Object objM22097O15 = r8.m22097O();
                Object obj8 = objM22097O15;
                if (i14 != 0 || objM22097O15 == p84Var) {
                    ui3 ui3Var10 = new ui3() { // from class: pa5
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i15 = r10;
                            xfa xfaVar = xfa.f68157a;
                            b85 b85Var4 = b85Var2;
                            ja5 ja5Var2 = ja5Var;
                            switch (i15) {
                                case 0:
                                    Integer num = ja5Var2.f45341f.f45461g.f67785b;
                                    if (num != null) {
                                        b85Var4.mo3472y(num.intValue());
                                    }
                                    break;
                                case 1:
                                    s45 s45Var = ja5Var2.f45343h;
                                    if (s45Var != null) {
                                        b85Var4.mo3452e(s45Var);
                                    }
                                    break;
                                case 2:
                                    LibraryItem libraryItem = ja5Var2.f45341f.f45457c.f54691d;
                                    if (libraryItem != null) {
                                        b85Var4.mo3445Y(libraryItem);
                                    }
                                    break;
                                default:
                                    LibraryItem libraryItem2 = ja5Var2.f45341f.f45459e.f69325b;
                                    if (libraryItem2 != null) {
                                        b85Var4.mo3453f(libraryItem2);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    r8.m22131l0(ui3Var10);
                    obj8 = ui3Var10;
                }
                ui3 ui3Var11 = (ui3) obj8;
                i3 = 32;
                ?? r13 = i6 != 32 ? r10 : 1;
                Object objM22097O16 = r8.m22097O();
                Object obj9 = objM22097O16;
                if (r13 != 0 || objM22097O16 == p84Var) {
                    ma5 ma5Var6 = new ma5(b85Var2, 3);
                    r8.m22131l0(ma5Var6);
                    obj9 = ma5Var6;
                }
                poc.m19436a(ui3Var11, (ui3) obj9, r8, 6);
                r8.m22139q(r10);
            } else {
                i3 = 32;
                r8.m22111b0(1300909180);
                r8.m22139q(r10);
            }
            e16 e16VarM4410c = c99.m4410c(b16.f7762a, 1.0f);
            C0282a c0282aM4703P = ci8.m4703P(-1665570518, new qa5(ja5Var, b85Var2, context, r10), r8);
            C0282a c0282aM4703P2 = ci8.m4703P(1179898669, new C3186kj(b85Var2, 10), r8);
            n4b n4bVar3 = n4bVarM21912b;
            ra5 ra5Var = new ra5(ja5Var, b85Var, mp7VarM16426d, n4bVar3, str, fe9Var, 0);
            b85Var3 = b85Var;
            Object obj10 = p84Var;
            ?? r25 = r10;
            ?? r22 = r8;
            int i15 = i3;
            b34.m3232b(e16VarM4410c, c0282aM4703P, null, null, c0282aM4703P2, 2, 0L, 0L, null, ci8.m4703P(-1589360651, ra5Var, r8), r22, 805330998, 460);
            ?? r15 = r22;
            c7a c7aVar = ja5Var.f45342g;
            boolean z7 = i6 != i15 ? r25 == true ? 1 : 0 : true;
            Object objM22097O17 = r15.m22097O();
            Object obj11 = objM22097O17;
            if (z7 || objM22097O17 == obj10) {
                ma5 ma5Var7 = new ma5(b85Var3, 4);
                r15.m22131l0(ma5Var7);
                obj11 = ma5Var7;
            }
            ui3 ui3Var12 = (ui3) obj11;
            boolean z8 = (r15.m22124i(ja5Var) ? 1 : 0) | (i6 != i15 ? r25 == true ? 1 : 0 : true);
            Object objM22097O18 = r15.m22097O();
            Object obj12 = objM22097O18;
            if (z8 != 0 || objM22097O18 == obj10) {
                final int i16 = 1;
                ui3 ui3Var13 = new ui3() { // from class: pa5
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i17 = i16;
                        xfa xfaVar = xfa.f68157a;
                        b85 b85Var4 = b85Var3;
                        ja5 ja5Var2 = ja5Var;
                        switch (i17) {
                            case 0:
                                Integer num = ja5Var2.f45341f.f45461g.f67785b;
                                if (num != null) {
                                    b85Var4.mo3472y(num.intValue());
                                }
                                break;
                            case 1:
                                s45 s45Var = ja5Var2.f45343h;
                                if (s45Var != null) {
                                    b85Var4.mo3452e(s45Var);
                                }
                                break;
                            case 2:
                                LibraryItem libraryItem = ja5Var2.f45341f.f45457c.f54691d;
                                if (libraryItem != null) {
                                    b85Var4.mo3445Y(libraryItem);
                                }
                                break;
                            default:
                                LibraryItem libraryItem2 = ja5Var2.f45341f.f45459e.f69325b;
                                if (libraryItem2 != null) {
                                    b85Var4.mo3453f(libraryItem2);
                                }
                                break;
                        }
                        return xfaVar;
                    }
                };
                r15.m22131l0(ui3Var13);
                obj12 = ui3Var13;
            }
            AbstractC1915b.m8789b(c7aVar, ui3Var12, (ui3) obj12, r15, r25 == true ? 1 : 0);
            n4bVar2 = n4bVar3;
            r14 = r15;
        } else {
            tj3 tj3Var5 = tj3Var2;
            tj3Var5.m22102U();
            n4bVar2 = n4bVar;
            r14 = tj3Var5;
        }
        x18 x18VarM22143u = r14.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 6, ja5Var, b85Var3, n4bVar2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9060d(e16 e16Var, y59 y59Var, b85 b85Var, boolean z, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1032570263);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22124i(y59Var) ? 32 : 16) | (tj3Var.m22120g(b85Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            e16 e16VarM15211e = AbstractC3184kh.m15211e(c99.m4429v(c99.m4412e(e16Var, 1.0f)), Orientation.Horizontal);
            zf1 zf1Var = ge9.f40637a;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38956e, true, new gm5(28));
            x17 x17VarM21626g = AbstractC3584sr.m21626g(((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 10);
            boolean zM22124i = ((i2 & 7168) == 2048) | tj3Var.m22124i(y59Var) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ua5(y59Var, z, b85Var);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11643d(e16VarM15211e, c0127bM17056a, x17VarM21626g, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 488);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new va5(e16Var, y59Var, b85Var, z, i);
        }
    }
}
