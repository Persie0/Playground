package p000;

import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.feature.reader.R$drawable;
import com.lingq.feature.reader.R$string;
import kotlin.Triple;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hjd {
    /* JADX INFO: renamed from: a */
    public static final void m13302a(LessonProcessingStatus lessonProcessingStatus, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        Triple triple;
        lessonProcessingStatus.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1727626600);
        int i2 = (tj3Var2.m22116e(lessonProcessingStatus.ordinal()) ? 4 : 2) | i | (tj3Var2.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 19) != 18)) {
            switch (u55.f63435a[lessonProcessingStatus.ordinal()]) {
                case 1:
                    triple = new Triple(Integer.valueOf(R$string.lesson_simplify), Integer.valueOf(R$string.lesson_simplify_not_simplified), Integer.valueOf(R$drawable.ic_lesson_generating));
                    break;
                case 2:
                    triple = new Triple(Integer.valueOf(R$string.lesson_generating), Integer.valueOf(R$string.lesson_generating_message), Integer.valueOf(R$drawable.ic_lesson_generating));
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    triple = new Triple(Integer.valueOf(R$string.lesson_import_progress), Integer.valueOf(R$string.lesson_import_progress_desc), Integer.valueOf(R$drawable.ic_lesson_generating));
                    break;
                case 10:
                    triple = new Triple(Integer.valueOf(R$string.lesson_import_error), Integer.valueOf(R$string.lesson_import_error), Integer.valueOf(com.lingq.core.p012ui.R$drawable.ic_error));
                    break;
                case 11:
                    triple = new Triple(Integer.valueOf(R$string.lesson_import_error), Integer.valueOf(R$string.lesson_import_error_desc), Integer.valueOf(com.lingq.core.p012ui.R$drawable.ic_error));
                    break;
                default:
                    gm5.m12750e();
                    return;
            }
            int iIntValue = ((Number) triple.f47633a).intValue();
            int iIntValue2 = ((Number) triple.f47634b).intValue();
            int iIntValue3 = ((Number) triple.f47635c).intValue();
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new C3288l7(7);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            q2d.m19625a((ui3) objM22097O, ci8.m4703P(72289200, new C0839c9(22, ui3Var), tj3Var2), null, null, ci8.m4703P(-2116874317, new ex0(iIntValue3, 10), tj3Var2), ci8.m4703P(-1414939724, new ex0(iIntValue, 11), tj3Var2), ci8.m4703P(-713005131, new ex0(iIntValue2, 12), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1794102, 16268);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(lessonProcessingStatus, i, 28, ui3Var);
        }
    }
}
