package p000;

import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.stats.p019ui.all.LessonCompleteAllWordsFragment;
import java.util.List;
import p000.bh4;
import p000.lda;
import p000.w65;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dy4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36422a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonCompleteAllWordsFragment f36423b;

    public /* synthetic */ dy4(LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment, int i) {
        this.f36422a = i;
        this.f36423b = lessonCompleteAllWordsFragment;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36422a;
        xfa xfaVar = xfa.f68157a;
        final LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment = this.f36423b;
        final int i2 = 2;
        final int i3 = 0;
        final int i4 = 1;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                bh4[] bh4VarArr = LessonCompleteAllWordsFragment.f30861F0;
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(1833564440, new dy4(lessonCompleteAllWordsFragment, i4), tj3Var), tj3Var, 384);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                bh4[] bh4VarArr2 = LessonCompleteAllWordsFragment.f30861F0;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    t66 t66VarM2513c = AbstractC0711a.m2513c(lessonCompleteAllWordsFragment.m9466R0().f30971s, tj3Var2);
                    t66 t66VarM2513c2 = AbstractC0711a.m2513c(lessonCompleteAllWordsFragment.m9466R0().f30973u, tj3Var2);
                    t66 t66VarM2513c3 = AbstractC0711a.m2513c(lessonCompleteAllWordsFragment.m9466R0().f30953B, tj3Var2);
                    int i5 = R$string.complete_lesson_complete;
                    vs3 vs3Var = (vs3) t66VarM2513c3.getValue();
                    List list = (List) t66VarM2513c.getValue();
                    List list2 = (List) t66VarM2513c2.getValue();
                    boolean zM22124i = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O = tj3Var2.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new ui3() { // from class: ey4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i3;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment2 = lessonCompleteAllWordsFragment;
                                switch (i6) {
                                    case 0:
                                        bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                        b34.m3244j(lessonCompleteAllWordsFragment2).m22689f();
                                        break;
                                    case 1:
                                        bh4[] bh4VarArr4 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var = my4.Companion;
                                        int i7 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var.getClass();
                                        jfa.m14428k(ud6VarM3244j, new jy4(i7), null);
                                        break;
                                    case 2:
                                        bh4[] bh4VarArr5 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j2 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var2 = my4.Companion;
                                        int i8 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var2.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new ky4(i8), null);
                                        break;
                                    default:
                                        bh4[] bh4VarArr6 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j3 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var3 = my4.Companion;
                                        int i9 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var3.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new iy4(i9), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O);
                    }
                    ui3 ui3Var = (ui3) objM22097O;
                    boolean zM22124i2 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new ui3() { // from class: ey4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i4;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment2 = lessonCompleteAllWordsFragment;
                                switch (i6) {
                                    case 0:
                                        bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                        b34.m3244j(lessonCompleteAllWordsFragment2).m22689f();
                                        break;
                                    case 1:
                                        bh4[] bh4VarArr4 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var = my4.Companion;
                                        int i7 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var.getClass();
                                        jfa.m14428k(ud6VarM3244j, new jy4(i7), null);
                                        break;
                                    case 2:
                                        bh4[] bh4VarArr5 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j2 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var2 = my4.Companion;
                                        int i8 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var2.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new ky4(i8), null);
                                        break;
                                    default:
                                        bh4[] bh4VarArr6 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j3 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var3 = my4.Companion;
                                        int i9 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var3.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new iy4(i9), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    ui3 ui3Var2 = (ui3) objM22097O2;
                    boolean zM22124i3 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O3 = tj3Var2.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new fy4(lessonCompleteAllWordsFragment, i3);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    vi3 vi3Var = (vi3) objM22097O3;
                    boolean zM22124i4 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O4 = tj3Var2.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new zi3() { // from class: com.lingq.feature.reader.stats.ui.all.a
                            @Override // p000.zi3
                            public final Object invoke(Object obj3, Object obj4) {
                                String str = (String) obj3;
                                int iIntValue3 = ((Integer) obj4).intValue();
                                bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                str.getClass();
                                C2556c c2556cM9466R0 = lessonCompleteAllWordsFragment.m9466R0();
                                wfb.m23926u(lda.m16103C(c2556cM9466R0), null, null, new LessonCompleteAllWordsViewModel$updateStatus$1(c2556cM9466R0, str, iIntValue3, null), 3);
                                return xfa.f68157a;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    zi3 zi3Var = (zi3) objM22097O4;
                    boolean zM22124i5 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O5 = tj3Var2.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new vi3() { // from class: com.lingq.feature.reader.stats.ui.all.b
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                w65 w65Var = (w65) obj3;
                                bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                w65Var.getClass();
                                C2556c c2556cM9466R0 = lessonCompleteAllWordsFragment.m9466R0();
                                wfb.m23926u(lda.m16103C(c2556cM9466R0), null, null, new LessonCompleteAllWordsViewModel$onTtsClicked$1(c2556cM9466R0, w65Var, null), 3);
                                return xfa.f68157a;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O5);
                    }
                    vi3 vi3Var2 = (vi3) objM22097O5;
                    boolean zM22124i6 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O6 = tj3Var2.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new ui3() { // from class: ey4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i6 = i2;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment2 = lessonCompleteAllWordsFragment;
                                switch (i6) {
                                    case 0:
                                        bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                        b34.m3244j(lessonCompleteAllWordsFragment2).m22689f();
                                        break;
                                    case 1:
                                        bh4[] bh4VarArr4 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var = my4.Companion;
                                        int i7 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var.getClass();
                                        jfa.m14428k(ud6VarM3244j, new jy4(i7), null);
                                        break;
                                    case 2:
                                        bh4[] bh4VarArr5 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j2 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var2 = my4.Companion;
                                        int i8 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var2.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new ky4(i8), null);
                                        break;
                                    default:
                                        bh4[] bh4VarArr6 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j3 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var3 = my4.Companion;
                                        int i9 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var3.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new iy4(i9), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O6);
                    }
                    ui3 ui3Var3 = (ui3) objM22097O6;
                    boolean zM22124i7 = tj3Var2.m22124i(lessonCompleteAllWordsFragment);
                    Object objM22097O7 = tj3Var2.m22097O();
                    if (zM22124i7 || objM22097O7 == p84Var) {
                        final int i6 = 3;
                        objM22097O7 = new ui3() { // from class: ey4
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                int i7 = i6;
                                xfa xfaVar2 = xfa.f68157a;
                                LessonCompleteAllWordsFragment lessonCompleteAllWordsFragment2 = lessonCompleteAllWordsFragment;
                                switch (i7) {
                                    case 0:
                                        bh4[] bh4VarArr3 = LessonCompleteAllWordsFragment.f30861F0;
                                        b34.m3244j(lessonCompleteAllWordsFragment2).m22689f();
                                        break;
                                    case 1:
                                        bh4[] bh4VarArr4 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var = my4.Companion;
                                        int i8 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var.getClass();
                                        jfa.m14428k(ud6VarM3244j, new jy4(i8), null);
                                        break;
                                    case 2:
                                        bh4[] bh4VarArr5 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j2 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var2 = my4.Companion;
                                        int i9 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var2.getClass();
                                        jfa.m14428k(ud6VarM3244j2, new ky4(i9), null);
                                        break;
                                    default:
                                        bh4[] bh4VarArr6 = LessonCompleteAllWordsFragment.f30861F0;
                                        ud6 ud6VarM3244j3 = b34.m3244j(lessonCompleteAllWordsFragment2);
                                        ly4 ly4Var3 = my4.Companion;
                                        int i10 = ((hy4) lessonCompleteAllWordsFragment2.f30864E0.getValue()).f43203a;
                                        ly4Var3.getClass();
                                        jfa.m14428k(ud6VarM3244j3, new iy4(i10), null);
                                        break;
                                }
                                return xfaVar2;
                            }
                        };
                        tj3Var2.m22131l0(objM22097O7);
                    }
                    pid.m19190a(i5, 0, vs3Var, list, list2, ui3Var, ui3Var2, vi3Var, zi3Var, vi3Var2, ui3Var3, (ui3) objM22097O7, tj3Var2, 0, 2);
                }
                break;
        }
        return xfaVar;
    }
}
