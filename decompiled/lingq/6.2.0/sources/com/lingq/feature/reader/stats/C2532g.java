package com.lingq.feature.reader.stats;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.reader.R$string;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.ab1;
import p000.aj3;
import p000.b16;
import p000.bb1;
import p000.c99;
import p000.cy4;
import p000.dtb;
import p000.e16;
import p000.eh0;
import p000.fe9;
import p000.ge9;
import p000.l77;
import p000.lw9;
import p000.ms5;
import p000.nj0;
import p000.oha;
import p000.p84;
import p000.ps5;
import p000.se1;
import p000.ss5;
import p000.thb;
import p000.tj3;
import p000.tj8;
import p000.ui3;
import p000.vh9;
import p000.vv4;
import p000.vz1;
import p000.we1;
import p000.xfa;
import p000.ye1;
import p000.zf1;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C2532g implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30784a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cy4 f30785b;

    public /* synthetic */ C2532g(cy4 cy4Var, int i) {
        this.f30784a = i;
        this.f30785b = cy4Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f30784a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((vv4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e, 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 7);
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.complete_looking_for_something_else);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 131066);
                    thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e));
                    cy4 cy4Var = this.f30785b;
                    boolean zM22124i = tj3Var.m22124i(cy4Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        LessonCompleteScreenKt$ScrollableContent$1$1$10$1$1$1 lessonCompleteScreenKt$ScrollableContent$1$1$10$1$1$1 = new LessonCompleteScreenKt$ScrollableContent$1$1$10$1$1$1(0, cy4Var, cy4.class, "onLessonsForYouClicked", "onLessonsForYouClicked()V", 0);
                        tj3Var.m22131l0(lessonCompleteScreenKt$ScrollableContent$1$1$10$1$1$1);
                        objM22097O = lessonCompleteScreenKt$ScrollableContent$1$1$10$1$1$1;
                    }
                    ss5.m21711g(null, false, null, 0L, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c, null, (ui3) ((FunctionReference) objM22097O), dtb.f36225e, tj3Var, 12582912, 47);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    cy4 cy4Var2 = this.f30785b;
                    boolean zM22124i2 = tj3Var2.m22124i(cy4Var2);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        LessonCompleteScreenKt$LessonCompleteScreen$1$2$1$1 lessonCompleteScreenKt$LessonCompleteScreen$1$2$1$1 = new LessonCompleteScreenKt$LessonCompleteScreen$1$2$1$1(0, cy4Var2, cy4.class, "onBackToLibrary", "onBackToLibrary()V", 0);
                        tj3Var2.m22131l0(lessonCompleteScreenKt$LessonCompleteScreen$1$2$1$1);
                        objM22097O2 = lessonCompleteScreenKt$LessonCompleteScreen$1$2$1$1;
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) ((FunctionReference) objM22097O2), dtb.f36223c, null, null, null, false);
                }
                break;
        }
        return xfaVar;
    }
}
