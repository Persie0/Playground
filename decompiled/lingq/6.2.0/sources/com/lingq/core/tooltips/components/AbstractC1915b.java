package com.lingq.core.tooltips.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.onboarding.HighlightType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.C3304ln;
import p000.C3419on;
import p000.aa1;
import p000.b16;
import p000.baa;
import p000.bc3;
import p000.bx2;
import p000.c7a;
import p000.c99;
import p000.ci8;
import p000.cx2;
import p000.d32;
import p000.d8d;
import p000.dh9;
import p000.di0;
import p000.e16;
import p000.e28;
import p000.eh0;
import p000.f84;
import p000.faa;
import p000.fb2;
import p000.fda;
import p000.fj8;
import p000.fn8;
import p000.fv0;
import p000.h39;
import p000.he9;
import p000.ie1;
import p000.io2;
import p000.jc9;
import p000.jda;
import p000.kaa;
import p000.kb0;
import p000.kl3;
import p000.l43;
import p000.l44;
import p000.l6a;
import p000.lda;
import p000.lw9;
import p000.m6a;
import p000.mo9;
import p000.ms5;
import p000.n6a;
import p000.nj0;
import p000.o6a;
import p000.p6a;
import p000.p84;
import p000.pk9;
import p000.ps5;
import p000.pvc;
import p000.qh0;
import p000.sc9;
import p000.ss5;
import p000.sw5;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vk9;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.wq1;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.xj2;
import p000.xwc;
import p000.xy0;
import p000.ye1;
import p000.z9a;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.tooltips.components.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1915b {
    /* JADX INFO: renamed from: a */
    public static final void m8788a(String str, List list, e16 e16Var, vx9 vx9Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        list.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2117357050);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22124i(list) ? 32 : 16) | (tj3Var2.m22120g(vx9Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            sb.append(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                int length = 0;
                while (length >= 0) {
                    int iM23386i0 = vk9.m23386i0(str, str2, length, true);
                    if (iM23386i0 < 0) {
                        break;
                    }
                    arrayList.add(new C3304ln(new he9(0L, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531), iM23386i0, str2.length() + iM23386i0, 8));
                    length = iM23386i0 + str2.length();
                }
            }
            String string = sb.toString();
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList2.add(((C3304ln) arrayList.get(i3)).m16392a(sb.length()));
            }
            tj3Var = tj3Var2;
            lw9.m16555c(new C3419on(string, arrayList2), e16Var, 0L, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, vx9Var, tj3Var, 48, (i2 << 15) & 234881024, 262140);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(str, list, e16Var, vx9Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8789b(c7a c7aVar, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        boolean z;
        Object objM24111g;
        c7a c7aVar2;
        int i2;
        t66 t66Var;
        p84 p84Var;
        boolean z2;
        tj3 tj3Var;
        ui3 ui3Var3;
        fb2 fb2Var;
        boolean z3;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1372261624);
        int i3 = i | (tj3Var2.m22120g(c7aVar) ? 4 : 2) | (tj3Var2.m22124i(ui3Var) ? 32 : 16) | (tj3Var2.m22124i(ui3Var2) ? 256 : 128);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z4 || objM22097O2 == p84Var2) {
                objM22097O2 = new TooltipHostKt$TooltipManager$1$1(c7aVar, t66Var2, null);
                tj3Var2.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O2, c7aVar);
            faa faaVarM15046h = kaa.m15046h((c7aVar == null || ((Boolean) t66Var2.getValue()).booleanValue()) ? TooltipAnimationState.Hidden : TooltipAnimationState.Shown, "TooltipTransition", tj3Var2, 48, 0);
            Object objM11669c = faaVarM15046h.m11669c();
            Object value = ((xc9) faaVarM15046h.f38738d).getValue();
            boolean zM22120g = tj3Var2.m22120g(faaVarM15046h) | ((i3 & 112) == 32);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var2) {
                objM22097O3 = new TooltipHostKt$TooltipManager$2$1(faaVarM15046h, ui3Var, t66Var2, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10049l(objM11669c, value, (zi3) objM22097O3, tj3Var2);
            if (c7aVar != null) {
                e28 e28Var = c7aVar.f9665b;
                boolean z5 = c7aVar.f9666c;
                tj3Var2.m22111b0(1548270973);
                fb2 fb2Var2 = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
                p6a p6aVarM10163c = d8d.m10163c(c7aVar.f9664a, (Context) tj3Var2.m22128k(AbstractC0394f.f4761b), 0);
                boolean z6 = p6aVarM10163c.m18929c().length() > 0 && !p6aVarM10163c.m18930d();
                jda jdaVar = pk9.f56363h;
                if (faaVarM15046h.m11673g()) {
                    z = false;
                    objM24111g = wq1.m24111g(tj3Var2, 1666827533, false, faaVarM15046h);
                } else {
                    tj3Var2.m22111b0(1666573488);
                    boolean zM22120g2 = tj3Var2.m22120g(faaVarM15046h);
                    objM24111g = tj3Var2.m22097O();
                    if (zM22120g2 || objM24111g == p84Var2) {
                        jc9 jc9VarM16139y = lda.m16139y();
                        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c2 = faaVarM15046h.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var2.m22131l0(objM11669c2);
                            objM24111g = objM11669c2;
                            z = false;
                        } catch (Throwable th) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th;
                        }
                    } else {
                        z = false;
                    }
                    tj3Var2.m22139q(z);
                }
                TooltipAnimationState tooltipAnimationState = (TooltipAnimationState) objM24111g;
                tj3Var2.m22111b0(580006974);
                TooltipAnimationState tooltipAnimationState2 = TooltipAnimationState.Shown;
                float f = tooltipAnimationState == tooltipAnimationState2 ? 1.0f : 0.0f;
                tj3Var2.m22139q(z);
                Float fValueOf = Float.valueOf(f);
                boolean zM22120g3 = tj3Var2.m22120g(faaVarM15046h);
                Object objM22097O4 = tj3Var2.m22097O();
                if (zM22120g3 || objM22097O4 == p84Var2) {
                    objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 12));
                    tj3Var2.m22131l0(objM22097O4);
                }
                TooltipAnimationState tooltipAnimationState3 = (TooltipAnimationState) ((dh9) objM22097O4).getValue();
                tj3Var2.m22111b0(580006974);
                float f2 = tooltipAnimationState3 == tooltipAnimationState2 ? 1.0f : 0.0f;
                tj3Var2.m22139q(false);
                Float fValueOf2 = Float.valueOf(f2);
                boolean zM22120g4 = tj3Var2.m22120g(faaVarM15046h);
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22120g4 || objM22097O5 == p84Var2) {
                    objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVarM15046h, 13));
                    tj3Var2.m22131l0(objM22097O5);
                }
                ((z9a) ((dh9) objM22097O5).getValue()).getClass();
                tj3Var2.m22111b0(2030475947);
                fda fdaVarM21703b0 = ss5.m21703b0(300, 0, null, 6);
                tj3Var2.m22139q(false);
                baa baaVarM15041c = kaa.m15041c(faaVarM15046h, fValueOf, fValueOf2, fdaVarM21703b0, jdaVar, tj3Var2, 196608);
                b16 b16Var = b16.f7762a;
                if (z5) {
                    tj3Var2.m22111b0(1548664239);
                    Object objM22097O6 = tj3Var2.m22097O();
                    if (objM22097O6 == p84Var2) {
                        objM22097O6 = new kb0(14, t66Var2);
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    z2 = z5;
                    c7aVar2 = c7aVar;
                    p84Var = p84Var2;
                    tj3Var = tj3Var2;
                    fb2Var = fb2Var2;
                    t66Var = t66Var2;
                    i2 = i4;
                    ui3Var3 = ui3Var2;
                    m8790c(c7aVar2, ui3Var3, (ui3) objM22097O6, ((Number) baaVarM15041c.getValue()).floatValue(), tj3Var, i4 | 384 | ((i3 >> 3) & 112));
                    tj3Var.m22139q(false);
                } else {
                    c7aVar2 = c7aVar;
                    i2 = i4;
                    t66Var = t66Var2;
                    p84Var = p84Var2;
                    z2 = z5;
                    tj3Var = tj3Var2;
                    ui3Var3 = ui3Var2;
                    fb2Var = fb2Var2;
                    if (z6 && c7aVar2.f9667d) {
                        tj3Var.m22111b0(1548943704);
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        boolean z7 = i2 == 4;
                        Object objM22097O7 = tj3Var.m22097O();
                        if (z7 || objM22097O7 == p84Var) {
                            objM22097O7 = new m6a(c7aVar2, t66Var);
                            tj3Var.m22131l0(objM22097O7);
                        }
                        qh0.m19963a(mo9.m16957a(e16VarM4411d, xfa.f68157a, (PointerInputEventHandler) objM22097O7), tj3Var, 0);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1549545290);
                        tj3Var.m22139q(false);
                    }
                }
                if (p6aVarM10163c.m18928b() != HighlightType.Nothing) {
                    tj3Var.m22111b0(1549608716);
                    AbstractC1914a.m8787f(p6aVarM10163c.m18928b(), e28Var, tj3Var, 0);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1549760554);
                    tj3Var.m22139q(false);
                }
                if (z2) {
                    tj3Var.m22111b0(1550664266);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1549935828);
                    float f3 = c7aVar2.f9668e;
                    float f4 = e28Var.f36620a - f3;
                    float f5 = e28Var.f36621b - f3;
                    float f6 = e28Var.f36622c + f3;
                    float f7 = e28Var.f36623d + f3;
                    e28 e28Var2 = new e28(f4, f5, f6, f7);
                    boolean zM22120g5 = tj3Var.m22120g(e28Var2);
                    Object objM22097O8 = tj3Var.m22097O();
                    if (zM22120g5 || objM22097O8 == p84Var) {
                        objM22097O8 = new l6a(e28Var2, 0);
                        tj3Var.m22131l0(objM22097O8);
                    }
                    e16 e16VarM4423p = c99.m4423p(pvc.m19527w(b16Var, (vi3) objM22097O8), fb2Var.mo906W(f6 - f4), fb2Var.mo906W(f7 - f5));
                    boolean z8 = (i3 & 896) == 256;
                    Object objM22097O9 = tj3Var.m22097O();
                    if (z8 || objM22097O9 == p84Var) {
                        objM22097O9 = new fn8(1, ui3Var3);
                        tj3Var.m22131l0(objM22097O9);
                    }
                    qh0.m19963a(mo9.m16957a(e16VarM4423p, c7aVar2, (PointerInputEventHandler) objM22097O9), tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                if (z6) {
                    tj3Var.m22111b0(1550698273);
                    String strM18929c = p6aVarM10163c.m18929c();
                    List listM18927a = p6aVarM10163c.m18927a();
                    Object objM22097O10 = tj3Var.m22097O();
                    if (objM22097O10 == p84Var) {
                        objM22097O10 = new kb0(15, t66Var);
                        tj3Var.m22131l0(objM22097O10);
                    }
                    tj3 tj3Var3 = tj3Var;
                    m8791d(c7aVar2, strM18929c, listM18927a, faaVarM15046h, (ui3) objM22097O10, tj3Var3, i2 | 24576);
                    tj3Var2 = tj3Var3;
                    z3 = false;
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2 = tj3Var;
                    z3 = false;
                    tj3Var2.m22111b0(1550983690);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(z3);
            } else {
                tj3Var2.m22111b0(1550989642);
                tj3Var2.m22139q(false);
            }
        } else {
            tj3Var2.m22102U();
        }
        x18 x18VarM22143u = tj3Var2.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 10, c7aVar, ui3Var, ui3Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8790c(c7a c7aVar, ui3 ui3Var, ui3 ui3Var2, float f, ye1 ye1Var, int i) {
        ui3 ui3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1539113019);
        int i2 = i | (tj3Var.m22120g(c7aVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i3 = i2 | (tj3Var.m22114d(f) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
            float f2 = 0.5f * f;
            long jM198b = aa1.m198b(f2, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4211d());
            boolean z = (i3 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = vz1.m23605K(new aa1(aa1.m198b(0.0f, j)), new aa1(aa1.m198b(f2, j)), new aa1(aa1.m198b(f, j)), new aa1(aa1.m198b(f, j)), new aa1(aa1.m198b(f2, j)), new aa1(aa1.m198b(0.0f, j)));
                tj3Var.m22131l0(objM22097O);
            }
            List list = (List) objM22097O;
            e28 e28Var = c7aVar.f9665b;
            float f3 = c7aVar.f9668e;
            boolean zM22120g = tj3Var.m22120g(e28Var) | tj3Var.m22114d(f3);
            Object objM22097O2 = tj3Var.m22097O();
            Object obj = objM22097O2;
            if (zM22120g || objM22097O2 == p84Var) {
                e28 e28Var2 = c7aVar.f9665b;
                e28 e28Var3 = e28Var2;
                if (f3 > 0.0f) {
                    e28Var3 = new e28(e28Var2.f36620a - f3, e28Var2.f36621b - f3, e28Var2.f36622c + f3, e28Var2.f36623d + f3);
                }
                tj3Var.m22131l0(e28Var3);
                obj = e28Var3;
            }
            e28 e28Var4 = (e28) obj;
            o6a o6aVarM8792e = m8792e(list, e28Var4.m10803d(), tj3Var);
            e16 e16VarM1407b = AbstractC0309d.m1407b(c99.m4411d(b16.f7762a, 1.0f), 0.0f, 0.0f, 0.99f, 0.0f, 0.0f, 0L, null, false, 1048571);
            boolean zM22120g2 = tj3Var.m22120g(e28Var4) | ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O3 == p84Var) {
                ui3Var3 = ui3Var2;
                objM22097O3 = new n6a(e28Var4, ui3Var, c7aVar, ui3Var3);
                tj3Var.m22131l0(objM22097O3);
            } else {
                ui3Var3 = ui3Var2;
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM1407b, c7aVar, (PointerInputEventHandler) objM22097O3);
            boolean zM22118f = tj3Var.m22118f(jM198b) | tj3Var.m22120g(e28Var4) | tj3Var.m22120g(o6aVarM8792e);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22118f || objM22097O4 == p84Var) {
                objM22097O4 = new fv0(jM198b, e28Var4, o6aVarM8792e);
                tj3Var.m22131l0(objM22097O4);
            }
            eh0.m11124d(e16VarM16957a, (vi3) objM22097O4, tj3Var, 0);
        } else {
            ui3Var3 = ui3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fj8(c7aVar, ui3Var, ui3Var3, f, i, 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:105:0x0216  */
    /* JADX WARN: Code duplicated, block: B:106:0x0219  */
    /* JADX WARN: Code duplicated, block: B:108:0x021d  */
    /* JADX WARN: Code duplicated, block: B:109:0x0220  */
    /* JADX WARN: Code duplicated, block: B:112:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0256  */
    /* JADX WARN: Code duplicated, block: B:128:0x025c  */
    /* JADX WARN: Code duplicated, block: B:130:0x0263  */
    /* JADX WARN: Code duplicated, block: B:138:0x0281  */
    /* JADX WARN: Code duplicated, block: B:141:0x0295  */
    /* JADX WARN: Code duplicated, block: B:142:0x0298  */
    /* JADX WARN: Code duplicated, block: B:154:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:157:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:159:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:171:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:174:0x032a  */
    /* JADX WARN: Code duplicated, block: B:188:0x034d  */
    /* JADX WARN: Code duplicated, block: B:190:0x0353  */
    /* JADX WARN: Code duplicated, block: B:191:0x0358  */
    /* JADX WARN: Code duplicated, block: B:199:0x0375  */
    /* JADX WARN: Code duplicated, block: B:202:0x038b  */
    /* JADX WARN: Code duplicated, block: B:203:0x038e  */
    /* JADX WARN: Code duplicated, block: B:215:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:218:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:220:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:232:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:235:0x0425  */
    /* JADX WARN: Code duplicated, block: B:249:0x0448  */
    /* JADX WARN: Code duplicated, block: B:251:0x044e  */
    /* JADX WARN: Code duplicated, block: B:259:0x046f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0483  */
    /* JADX WARN: Code duplicated, block: B:263:0x0486  */
    /* JADX WARN: Code duplicated, block: B:275:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:279:0x04c4  */
    /* JADX WARN: Code duplicated, block: B:291:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:294:0x054e  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c7  */
    /* JADX INFO: renamed from: d */
    public static final void m8791d(final c7a c7aVar, final String str, final List list, faa faaVar, final ui3 ui3Var, ye1 ye1Var, int i) {
        Object f84Var;
        boolean z;
        Object objM24111g;
        long j;
        boolean z2;
        Object objM22097O;
        boolean z3;
        Object objM22097O2;
        boolean z4;
        float f;
        float f2;
        boolean z5;
        Object objM24111g2;
        TooltipAnimationState tooltipAnimationState;
        float f3;
        boolean z6;
        Object objM22097O3;
        TooltipAnimationState tooltipAnimationState2;
        float f4;
        boolean z7;
        Object objM22097O4;
        baa baaVarM15041c;
        boolean z8;
        Object objM24111g3;
        TooltipAnimationState tooltipAnimationState3;
        float f5;
        boolean z9;
        Object objM22097O5;
        TooltipAnimationState tooltipAnimationState4;
        float f6;
        boolean z10;
        Object objM22097O6;
        baa baaVarM15041c2;
        boolean z11;
        Object objM24111g4;
        TooltipAnimationState tooltipAnimationState5;
        float f7;
        boolean z12;
        Object objM22097O7;
        boolean z13;
        Object objM22097O8;
        boolean z14;
        jc9 jc9VarM16139y;
        vi3 vi3VarMo3163e;
        jc9 jc9VarM16106F;
        boolean z15;
        jc9 jc9VarM16139y2;
        vi3 vi3VarMo3163e2;
        jc9 jc9VarM16106F2;
        boolean z16;
        jc9 jc9VarM16139y3;
        vi3 vi3VarMo3163e3;
        jc9 jc9VarM16106F3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-429104725);
        int i2 = i | (tj3Var.m22120g(c7aVar) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128) | (tj3Var.m22120g(faaVar) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            float fMo912g0 = fb2Var.mo912g0(((Configuration) tj3Var.m22128k(AbstractC0394f.f4760a)).screenHeightDp);
            e28 e28Var = c7aVar.f9665b;
            boolean z17 = Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)) > fMo912g0 / 2.0f;
            Object objM22097O9 = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O9 == p84Var) {
                objM22097O9 = AbstractC0278f.m1257g(0);
                tj3Var.m22131l0(objM22097O9);
            }
            final sc9 sc9Var = (sc9) objM22097O9;
            boolean zM22120g = tj3Var.m22120g(e28Var) | tj3Var.m22122h(z17) | tj3Var.m22116e(sc9Var.m21222h());
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22120g || objM22097O10 == p84Var) {
                f84Var = new f84((((long) ((!z17 || sc9Var.m21222h() <= 0) ? ss5.m21693T(e28Var.f36623d) : ss5.m21693T((e28Var.f36621b - sc9Var.m21222h()) - fb2Var.mo912g0(8.0f)))) & 4294967295L) | (((long) ss5.m21693T(e28Var.f36620a)) << 32));
                tj3Var.m22131l0(f84Var);
            } else {
                f84Var = objM22097O10;
            }
            long j2 = ((f84) f84Var).f38612a;
            ie1 ie1Var = new ie1(11);
            jda jdaVar = pk9.f56363h;
            int i3 = ((((i2 >> 9) & 14) | 384) & 14) | 3072;
            if (faaVar.m11673g()) {
                z = false;
                objM24111g = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
            } else {
                tj3Var.m22111b0(1666573488);
                boolean z18 = (((i3 & 14) ^ 6) > 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM24111g = tj3Var.m22097O();
                if (z18 || objM24111g == p84Var) {
                    jc9 jc9VarM16139y4 = lda.m16139y();
                    vi3 vi3VarMo3163e4 = jc9VarM16139y4 != null ? jc9VarM16139y4.mo3163e() : null;
                    jc9 jc9VarM16106F4 = lda.m16106F(jc9VarM16139y4);
                    try {
                        Object objM11669c = faaVar.m11669c();
                        lda.m16110J(jc9VarM16139y4, jc9VarM16106F4, vi3VarMo3163e4);
                        tj3Var.m22131l0(objM11669c);
                        objM24111g = objM11669c;
                    } catch (Throwable th) {
                        lda.m16110J(jc9VarM16139y4, jc9VarM16106F4, vi3VarMo3163e4);
                        throw th;
                    }
                }
                z = false;
                tj3Var.m22139q(false);
            }
            TooltipAnimationState tooltipAnimationState6 = (TooltipAnimationState) objM24111g;
            tj3Var.m22111b0(21321996);
            TooltipAnimationState tooltipAnimationState7 = TooltipAnimationState.Shown;
            float f8 = tooltipAnimationState6 == tooltipAnimationState7 ? 1.0f : 0.8f;
            tj3Var.m22139q(z);
            Float fValueOf = Float.valueOf(f8);
            int i4 = i3 & 14;
            int i5 = i4 ^ 6;
            if (i5 <= 4 || !tj3Var.m22120g(faaVar)) {
                j = j2;
                if ((i3 & 6) != 4) {
                    z2 = false;
                }
                objM22097O = tj3Var.m22097O();
                if (z2 || objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 18));
                    tj3Var.m22131l0(objM22097O);
                }
                TooltipAnimationState tooltipAnimationState8 = (TooltipAnimationState) ((dh9) objM22097O).getValue();
                tj3Var.m22111b0(21321996);
                float f9 = tooltipAnimationState8 == tooltipAnimationState7 ? 1.0f : 0.8f;
                tj3Var.m22139q(false);
                Float fValueOf2 = Float.valueOf(f9);
                z3 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O2 = tj3Var.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVar, 19));
                    tj3Var.m22131l0(objM22097O2);
                }
                l43 l43Var = (l43) ie1Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0);
                int i6 = i4 | 196608;
                z4 = z17;
                final baa baaVarM15041c3 = kaa.m15041c(faaVar, fValueOf, fValueOf2, l43Var, jdaVar, tj3Var, i6);
                if (z4) {
                    f = -8.0f;
                } else {
                    f = 8.0f;
                }
                if (z4) {
                    f2 = 16.0f;
                } else {
                    f2 = -16.0f;
                }
                ie1 ie1Var2 = new ie1(12);
                jda jdaVar2 = pk9.f56365j;
                if (faaVar.m11673g()) {
                    f2 = f2;
                    f = f;
                    z5 = false;
                    objM24111g2 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
                } else {
                    tj3Var.m22111b0(1666573488);
                    z16 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                    objM24111g2 = tj3Var.m22097O();
                    if (z16 || objM24111g2 == p84Var) {
                        jc9VarM16139y3 = lda.m16139y();
                        if (jc9VarM16139y3 != null) {
                            vi3VarMo3163e3 = jc9VarM16139y3.mo3163e();
                        } else {
                            vi3VarMo3163e3 = null;
                        }
                        jc9VarM16106F3 = lda.m16106F(jc9VarM16139y3);
                        try {
                            Object objM11669c2 = faaVar.m11669c();
                            lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                            tj3Var.m22131l0(objM11669c2);
                            objM24111g2 = objM11669c2;
                        } catch (Throwable th2) {
                            lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                            throw th2;
                        }
                    }
                    z5 = false;
                    tj3Var.m22139q(false);
                }
                tooltipAnimationState = (TooltipAnimationState) objM24111g2;
                tj3Var.m22111b0(2092763322);
                if (tooltipAnimationState == tooltipAnimationState7) {
                    f3 = f;
                } else {
                    f3 = f2;
                }
                tj3Var.m22139q(z5);
                xj2 xj2Var = new xj2(f3);
                z6 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O3 = tj3Var.m22097O();
                if (z6 || objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVar, 14));
                    tj3Var.m22131l0(objM22097O3);
                }
                tooltipAnimationState2 = (TooltipAnimationState) ((dh9) objM22097O3).getValue();
                tj3Var.m22111b0(2092763322);
                if (tooltipAnimationState2 == tooltipAnimationState7) {
                    f4 = f;
                } else {
                    f4 = f2;
                }
                tj3Var.m22139q(false);
                xj2 xj2Var2 = new xj2(f4);
                z7 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O4 = tj3Var.m22097O();
                if (z7 || objM22097O4 == p84Var) {
                    objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVar, 15));
                    tj3Var.m22131l0(objM22097O4);
                }
                baaVarM15041c = kaa.m15041c(faaVar, xj2Var, xj2Var2, (l43) ie1Var2.invoke(((dh9) objM22097O4).getValue(), tj3Var, 0), jdaVar2, tj3Var, i6);
                ie1 ie1Var3 = new ie1(13);
                if (faaVar.m11673g()) {
                    baaVarM15041c = baaVarM15041c;
                    z8 = false;
                    objM24111g3 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
                } else {
                    tj3Var.m22111b0(1666573488);
                    z15 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                    objM24111g3 = tj3Var.m22097O();
                    if (z15 || objM24111g3 == p84Var) {
                        jc9VarM16139y2 = lda.m16139y();
                        if (jc9VarM16139y2 != null) {
                            vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                        } else {
                            vi3VarMo3163e2 = null;
                        }
                        jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                        try {
                            Object objM11669c3 = faaVar.m11669c();
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            tj3Var.m22131l0(objM11669c3);
                            objM24111g3 = objM11669c3;
                        } catch (Throwable th3) {
                            lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                            throw th3;
                        }
                    }
                    z8 = false;
                    tj3Var.m22139q(false);
                }
                tooltipAnimationState3 = (TooltipAnimationState) objM24111g3;
                tj3Var.m22111b0(-1045505167);
                if (tooltipAnimationState3 == tooltipAnimationState7) {
                    f5 = 8.0f;
                } else {
                    f5 = 0.0f;
                }
                tj3Var.m22139q(z8);
                xj2 xj2Var3 = new xj2(f5);
                z9 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O5 = tj3Var.m22097O();
                if (z9 || objM22097O5 == p84Var) {
                    objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVar, 16));
                    tj3Var.m22131l0(objM22097O5);
                }
                tooltipAnimationState4 = (TooltipAnimationState) ((dh9) objM22097O5).getValue();
                tj3Var.m22111b0(-1045505167);
                if (tooltipAnimationState4 == tooltipAnimationState7) {
                    f6 = 8.0f;
                } else {
                    f6 = 0.0f;
                }
                tj3Var.m22139q(false);
                xj2 xj2Var4 = new xj2(f6);
                z10 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O6 = tj3Var.m22097O();
                if (z10 || objM22097O6 == p84Var) {
                    objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVar, 17));
                    tj3Var.m22131l0(objM22097O6);
                }
                baaVarM15041c2 = kaa.m15041c(faaVar, xj2Var3, xj2Var4, (l43) ie1Var3.invoke(((dh9) objM22097O6).getValue(), tj3Var, 0), jdaVar2, tj3Var, i6);
                ie1 ie1Var4 = new ie1(14);
                if (faaVar.m11673g()) {
                    baaVarM15041c2 = baaVarM15041c2;
                    z11 = false;
                    objM24111g4 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
                } else {
                    tj3Var.m22111b0(1666573488);
                    z14 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                    objM24111g4 = tj3Var.m22097O();
                    if (z14 || objM24111g4 == p84Var) {
                        jc9VarM16139y = lda.m16139y();
                        vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                        jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                        try {
                            Object objM11669c4 = faaVar.m11669c();
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            tj3Var.m22131l0(objM11669c4);
                            objM24111g4 = objM11669c4;
                        } catch (Throwable th4) {
                            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                            throw th4;
                        }
                    }
                    z11 = false;
                    tj3Var.m22139q(false);
                }
                tooltipAnimationState5 = (TooltipAnimationState) objM24111g4;
                tj3Var.m22111b0(1777514528);
                if (tooltipAnimationState5 == tooltipAnimationState7) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                tj3Var.m22139q(z11);
                Float fValueOf3 = Float.valueOf(f7);
                z12 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O7 = tj3Var.m22097O();
                if (z12 || objM22097O7 == p84Var) {
                    objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVar, 20));
                    tj3Var.m22131l0(objM22097O7);
                }
                TooltipAnimationState tooltipAnimationState9 = (TooltipAnimationState) ((dh9) objM22097O7).getValue();
                tj3Var.m22111b0(1777514528);
                float f10 = tooltipAnimationState9 != tooltipAnimationState7 ? 0.0f : 1.0f;
                tj3Var.m22139q(false);
                Float fValueOf4 = Float.valueOf(f10);
                z13 = (i5 <= 4 && tj3Var.m22120g(faaVar)) || (i3 & 6) == 4;
                objM22097O8 = tj3Var.m22097O();
                if (z13 || objM22097O8 == p84Var) {
                    objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVar, 21));
                    tj3Var.m22131l0(objM22097O8);
                }
                final baa baaVarM15041c4 = kaa.m15041c(faaVar, fValueOf3, fValueOf4, (l43) ie1Var4.invoke(((dh9) objM22097O8).getValue(), tj3Var, 0), jdaVar, tj3Var, i6);
                final float f11 = ((xj2) baaVarM15041c.getValue()).f68285a + (faaVar.m11669c() == tooltipAnimationState7 ? ((xj2) ss5.m21714j(ss5.m21691R("FloatingTooltip", tj3Var, 0), new xj2(-4.0f), new xj2(4.0f), jdaVar2, ss5.m21687N(ss5.m21703b0(2000, 0, io2.f44349a, 2), RepeatMode.Reverse, 0L, 4), "FloatingOffsetY", tj3Var, 229816).getValue()).f68285a : 0.0f);
                final baa baaVar = baaVarM15041c2;
                AbstractC0456d.m1898b(nj0.f52808c, j, null, null, ci8.m4703P(1124066638, new zi3() { // from class: k6a
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var2 = (tj3) ye1Var2;
                        if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4428u(b16.f7762a, 0.0f, 300.0f, 1), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                            Object objM22097O11 = tj3Var2.m22097O();
                            if (objM22097O11 == we1.f66679a) {
                                objM22097O11 = new xe2(sc9Var, 3);
                                tj3Var2.m22131l0(objM22097O11);
                            }
                            e16 e16VarM19529y = pvc.m19529y(xwc.m24741N(e16VarM21611X, (vi3) objM22097O11), 0.0f, f11, 1);
                            dh9 dh9Var = baaVarM15041c3;
                            bq1.m4039O(AbstractC0309d.m1407b(e16VarM19529y, ((Number) dh9Var.getValue()).floatValue(), ((Number) dh9Var.getValue()).floatValue(), ((Number) baaVarM15041c4.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 1048568), null, null, te1.m22000n(62, ((xj2) baaVar.getValue()).f68285a), null, ci8.m4703P(-964445888, new a05(c7aVar, str, list, ui3Var), tj3Var2), tj3Var2, 196608, 22);
                        } else {
                            tj3Var2.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var), tj3Var, 24582, 12);
                tj3Var = tj3Var;
            } else {
                j = j2;
            }
            z2 = true;
            objM22097O = tj3Var.m22097O();
            if (z2) {
                objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 18));
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = AbstractC0278f.m1254d(new sw5(faaVar, 18));
                tj3Var.m22131l0(objM22097O);
            }
            TooltipAnimationState tooltipAnimationState10 = (TooltipAnimationState) ((dh9) objM22097O).getValue();
            tj3Var.m22111b0(21321996);
            if (tooltipAnimationState10 == tooltipAnimationState7) {
            }
            tj3Var.m22139q(false);
            Float fValueOf5 = Float.valueOf(f9);
            if (i5 <= 4) {
            }
            objM22097O2 = tj3Var.m22097O();
            if (z3) {
                objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVar, 19));
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = AbstractC0278f.m1254d(new sw5(faaVar, 19));
                tj3Var.m22131l0(objM22097O2);
            }
            l43 l43Var2 = (l43) ie1Var.invoke(((dh9) objM22097O2).getValue(), tj3Var, 0);
            int i7 = i4 | 196608;
            z4 = z17;
            final baa baaVarM15041c5 = kaa.m15041c(faaVar, fValueOf, fValueOf5, l43Var2, jdaVar, tj3Var, i7);
            if (z4) {
                f = -8.0f;
            } else {
                f = 8.0f;
            }
            if (z4) {
                f2 = 16.0f;
            } else {
                f2 = -16.0f;
            }
            ie1 ie1Var5 = new ie1(12);
            jda jdaVar3 = pk9.f56365j;
            if (faaVar.m11673g()) {
                tj3Var.m22111b0(1666573488);
                if (i5 <= 4) {
                }
                objM24111g2 = tj3Var.m22097O();
                if (z16) {
                    jc9VarM16139y3 = lda.m16139y();
                    if (jc9VarM16139y3 != null) {
                        vi3VarMo3163e3 = jc9VarM16139y3.mo3163e();
                    } else {
                        vi3VarMo3163e3 = null;
                    }
                    jc9VarM16106F3 = lda.m16106F(jc9VarM16139y3);
                    Object objM11669c5 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                    tj3Var.m22131l0(objM11669c5);
                    objM24111g2 = objM11669c5;
                } else {
                    jc9VarM16139y3 = lda.m16139y();
                    if (jc9VarM16139y3 != null) {
                        vi3VarMo3163e3 = jc9VarM16139y3.mo3163e();
                    } else {
                        vi3VarMo3163e3 = null;
                    }
                    jc9VarM16106F3 = lda.m16106F(jc9VarM16139y3);
                    Object objM11669c6 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y3, jc9VarM16106F3, vi3VarMo3163e3);
                    tj3Var.m22131l0(objM11669c6);
                    objM24111g2 = objM11669c6;
                }
                z5 = false;
                tj3Var.m22139q(false);
            } else {
                f2 = f2;
                f = f;
                z5 = false;
                objM24111g2 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
            }
            tooltipAnimationState = (TooltipAnimationState) objM24111g2;
            tj3Var.m22111b0(2092763322);
            if (tooltipAnimationState == tooltipAnimationState7) {
                f3 = f;
            } else {
                f3 = f2;
            }
            tj3Var.m22139q(z5);
            xj2 xj2Var5 = new xj2(f3);
            if (i5 <= 4) {
            }
            objM22097O3 = tj3Var.m22097O();
            if (z6) {
                objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVar, 14));
                tj3Var.m22131l0(objM22097O3);
            } else {
                objM22097O3 = AbstractC0278f.m1254d(new sw5(faaVar, 14));
                tj3Var.m22131l0(objM22097O3);
            }
            tooltipAnimationState2 = (TooltipAnimationState) ((dh9) objM22097O3).getValue();
            tj3Var.m22111b0(2092763322);
            if (tooltipAnimationState2 == tooltipAnimationState7) {
                f4 = f;
            } else {
                f4 = f2;
            }
            tj3Var.m22139q(false);
            xj2 xj2Var6 = new xj2(f4);
            if (i5 <= 4) {
            }
            objM22097O4 = tj3Var.m22097O();
            if (z7) {
                objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVar, 15));
                tj3Var.m22131l0(objM22097O4);
            } else {
                objM22097O4 = AbstractC0278f.m1254d(new sw5(faaVar, 15));
                tj3Var.m22131l0(objM22097O4);
            }
            baaVarM15041c = kaa.m15041c(faaVar, xj2Var5, xj2Var6, (l43) ie1Var5.invoke(((dh9) objM22097O4).getValue(), tj3Var, 0), jdaVar3, tj3Var, i7);
            ie1 ie1Var6 = new ie1(13);
            if (faaVar.m11673g()) {
                tj3Var.m22111b0(1666573488);
                if (i5 <= 4) {
                }
                objM24111g3 = tj3Var.m22097O();
                if (z15) {
                    jc9VarM16139y2 = lda.m16139y();
                    if (jc9VarM16139y2 != null) {
                        vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                    } else {
                        vi3VarMo3163e2 = null;
                    }
                    jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    Object objM11669c7 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                    tj3Var.m22131l0(objM11669c7);
                    objM24111g3 = objM11669c7;
                } else {
                    jc9VarM16139y2 = lda.m16139y();
                    if (jc9VarM16139y2 != null) {
                        vi3VarMo3163e2 = jc9VarM16139y2.mo3163e();
                    } else {
                        vi3VarMo3163e2 = null;
                    }
                    jc9VarM16106F2 = lda.m16106F(jc9VarM16139y2);
                    Object objM11669c8 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y2, jc9VarM16106F2, vi3VarMo3163e2);
                    tj3Var.m22131l0(objM11669c8);
                    objM24111g3 = objM11669c8;
                }
                z8 = false;
                tj3Var.m22139q(false);
            } else {
                baaVarM15041c = baaVarM15041c;
                z8 = false;
                objM24111g3 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
            }
            tooltipAnimationState3 = (TooltipAnimationState) objM24111g3;
            tj3Var.m22111b0(-1045505167);
            if (tooltipAnimationState3 == tooltipAnimationState7) {
                f5 = 8.0f;
            } else {
                f5 = 0.0f;
            }
            tj3Var.m22139q(z8);
            xj2 xj2Var7 = new xj2(f5);
            if (i5 <= 4) {
            }
            objM22097O5 = tj3Var.m22097O();
            if (z9) {
                objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVar, 16));
                tj3Var.m22131l0(objM22097O5);
            } else {
                objM22097O5 = AbstractC0278f.m1254d(new sw5(faaVar, 16));
                tj3Var.m22131l0(objM22097O5);
            }
            tooltipAnimationState4 = (TooltipAnimationState) ((dh9) objM22097O5).getValue();
            tj3Var.m22111b0(-1045505167);
            if (tooltipAnimationState4 == tooltipAnimationState7) {
                f6 = 8.0f;
            } else {
                f6 = 0.0f;
            }
            tj3Var.m22139q(false);
            xj2 xj2Var8 = new xj2(f6);
            if (i5 <= 4) {
            }
            objM22097O6 = tj3Var.m22097O();
            if (z10) {
                objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVar, 17));
                tj3Var.m22131l0(objM22097O6);
            } else {
                objM22097O6 = AbstractC0278f.m1254d(new sw5(faaVar, 17));
                tj3Var.m22131l0(objM22097O6);
            }
            baaVarM15041c2 = kaa.m15041c(faaVar, xj2Var7, xj2Var8, (l43) ie1Var6.invoke(((dh9) objM22097O6).getValue(), tj3Var, 0), jdaVar3, tj3Var, i7);
            ie1 ie1Var7 = new ie1(14);
            if (faaVar.m11673g()) {
                tj3Var.m22111b0(1666573488);
                if (i5 <= 4) {
                }
                objM24111g4 = tj3Var.m22097O();
                if (z14) {
                    jc9VarM16139y = lda.m16139y();
                    vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c9 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var.m22131l0(objM11669c9);
                    objM24111g4 = objM11669c9;
                } else {
                    jc9VarM16139y = lda.m16139y();
                    vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
                    jc9VarM16106F = lda.m16106F(jc9VarM16139y);
                    Object objM11669c10 = faaVar.m11669c();
                    lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                    tj3Var.m22131l0(objM11669c10);
                    objM24111g4 = objM11669c10;
                }
                z11 = false;
                tj3Var.m22139q(false);
            } else {
                baaVarM15041c2 = baaVarM15041c2;
                z11 = false;
                objM24111g4 = wq1.m24111g(tj3Var, 1666827533, false, faaVar);
            }
            tooltipAnimationState5 = (TooltipAnimationState) objM24111g4;
            tj3Var.m22111b0(1777514528);
            if (tooltipAnimationState5 == tooltipAnimationState7) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            tj3Var.m22139q(z11);
            Float fValueOf6 = Float.valueOf(f7);
            if (i5 <= 4) {
            }
            objM22097O7 = tj3Var.m22097O();
            if (z12) {
                objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVar, 20));
                tj3Var.m22131l0(objM22097O7);
            } else {
                objM22097O7 = AbstractC0278f.m1254d(new sw5(faaVar, 20));
                tj3Var.m22131l0(objM22097O7);
            }
            TooltipAnimationState tooltipAnimationState11 = (TooltipAnimationState) ((dh9) objM22097O7).getValue();
            tj3Var.m22111b0(1777514528);
            if (tooltipAnimationState11 != tooltipAnimationState7) {
            }
            tj3Var.m22139q(false);
            Float fValueOf7 = Float.valueOf(f10);
            if (i5 <= 4) {
            }
            objM22097O8 = tj3Var.m22097O();
            if (z13) {
                objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVar, 21));
                tj3Var.m22131l0(objM22097O8);
            } else {
                objM22097O8 = AbstractC0278f.m1254d(new sw5(faaVar, 21));
                tj3Var.m22131l0(objM22097O8);
            }
            final baa baaVarM15041c6 = kaa.m15041c(faaVar, fValueOf6, fValueOf7, (l43) ie1Var7.invoke(((dh9) objM22097O8).getValue(), tj3Var, 0), jdaVar, tj3Var, i7);
            final float f12 = ((xj2) baaVarM15041c.getValue()).f68285a + (faaVar.m11669c() == tooltipAnimationState7 ? ((xj2) ss5.m21714j(ss5.m21691R("FloatingTooltip", tj3Var, 0), new xj2(-4.0f), new xj2(4.0f), jdaVar3, ss5.m21687N(ss5.m21703b0(2000, 0, io2.f44349a, 2), RepeatMode.Reverse, 0L, 4), "FloatingOffsetY", tj3Var, 229816).getValue()).f68285a : 0.0f);
            final baa baaVar2 = baaVarM15041c2;
            AbstractC0456d.m1898b(nj0.f52808c, j, null, null, ci8.m4703P(1124066638, new zi3() { // from class: k6a
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4428u(b16.f7762a, 0.0f, 300.0f, 1), 0.0f, 0.0f, 16.0f, 0.0f, 11);
                        Object objM22097O11 = tj3Var2.m22097O();
                        if (objM22097O11 == we1.f66679a) {
                            objM22097O11 = new xe2(sc9Var, 3);
                            tj3Var2.m22131l0(objM22097O11);
                        }
                        e16 e16VarM19529y = pvc.m19529y(xwc.m24741N(e16VarM21611X, (vi3) objM22097O11), 0.0f, f12, 1);
                        dh9 dh9Var = baaVarM15041c5;
                        bq1.m4039O(AbstractC0309d.m1407b(e16VarM19529y, ((Number) dh9Var.getValue()).floatValue(), ((Number) dh9Var.getValue()).floatValue(), ((Number) baaVarM15041c6.getValue()).floatValue(), 0.0f, 0.0f, 0L, null, false, 1048568), null, null, te1.m22000n(62, ((xj2) baaVar2.getValue()).f68285a), null, ci8.m4703P(-964445888, new a05(c7aVar, str, list, ui3Var), tj3Var2), tj3Var2, 196608, 22);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 24582, 12);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(c7aVar, str, list, faaVar, ui3Var, i, 16);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final o6a m8792e(List list, long j, ye1 ye1Var) {
        list.getClass();
        l44 l44VarM21713i = ss5.m21713i(ss5.m21691R("GradientRotation", ye1Var, 0), 0.0f, 360.0f, ss5.m21687N(ss5.m21703b0(2000, 0, io2.f44352d, 2), RepeatMode.Restart, 0L, 4), "BorderRotation", ye1Var, 29112, 0);
        tj3 tj3Var = (tj3) ye1Var;
        boolean zM22114d = tj3Var.m22114d(((Number) l44VarM21713i.getValue()).floatValue());
        Object objM22097O = tj3Var.m22097O();
        if (zM22114d || objM22097O == we1.f66679a) {
            objM22097O = new o6a(j, list, l44VarM21713i);
            tj3Var.m22131l0(objM22097O);
        }
        return (o6a) objM22097O;
    }

    /* JADX INFO: renamed from: f */
    public static final e16 m8793f(e16 e16Var, vi3 vi3Var) {
        e16Var.getClass();
        vi3Var.getClass();
        return xwc.m24741N(e16Var, new kl3(vi3Var, 10));
    }
}
