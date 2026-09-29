package p000;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import com.lingq.feature.imports.UserImportAddCourseFragment;
import com.lingq.feature.imports.UserImportSelectionFragment;
import com.lingq.feature.imports.UserImportTypeFragment;
import com.lingq.feature.imports.data.UserImportDetailType;
import com.lingq.feature.imports.data.UserImportSourceType;
import com.lingq.feature.vocabulary.C2824b;
import com.lingq.feature.vocabulary.filter.VocabularyFilterFragment;
import com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionFragment;
import java.io.File;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gca implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40554b;

    public /* synthetic */ gca(C2824b c2824b, Context context, Activity activity, hp5 hp5Var, t66 t66Var, t66 t66Var2) {
        this.f40553a = 7;
        this.f40554b = c2824b;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        Object value;
        int i = this.f40553a;
        tg6 tg6Var = tg6.f62255a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f40554b;
        switch (i) {
            case 0:
                hca hcaVar = (hca) obj2;
                a31 a31Var = (a31) obj;
                a31Var.getClass();
                a31Var.m56a("first", hcaVar.f42189a.getDescriptor());
                a31Var.m56a("second", hcaVar.f42190b.getDescriptor());
                a31Var.m56a("third", hcaVar.f42191c.getDescriptor());
                return xfaVar;
            case 1:
                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                interfaceC0310a.getClass();
                InterfaceC0310a.m1418s0(interfaceC0310a, (xc5) obj2, 0L, 0L, 0.0f, null, null, 5, 62);
                return xfaVar;
            case 2:
                UserImportAddCourseFragment userImportAddCourseFragment = (UserImportAddCourseFragment) obj2;
                vg6 vg6Var = (vg6) obj;
                vg6Var.getClass();
                if (vg6Var.equals(tg6Var)) {
                    b34.m3244j(userImportAddCourseFragment).m22689f();
                } else if (vg6Var instanceof wg6) {
                    x74.m24338E(userImportAddCourseFragment, "requestKey", new Bundle());
                    b34.m3244j(userImportAddCourseFragment).m22689f();
                }
                return xfaVar;
            case 3:
                UserImportSelectionFragment userImportSelectionFragment = (UserImportSelectionFragment) obj2;
                vg6 vg6Var2 = (vg6) obj;
                vg6Var2.getClass();
                if (vg6Var2.equals(tg6Var)) {
                    b34.m3244j(userImportSelectionFragment).m22689f();
                } else if (vg6Var2 instanceof jh6) {
                    ud6 ud6VarM3244j = b34.m3244j(userImportSelectionFragment);
                    dla dlaVar = ela.Companion;
                    UserImportDetailType userImportDetailType = ((jh6) vg6Var2).f45548a;
                    dlaVar.getClass();
                    jfa.m14428k(ud6VarM3244j, new cla(userImportDetailType), null);
                }
                return xfaVar;
            case 4:
                UserImportTypeFragment userImportTypeFragment = (UserImportTypeFragment) obj2;
                UserImportSourceType userImportSourceType = (UserImportSourceType) obj;
                userImportSourceType.getClass();
                vz1.m23640l0(userImportTypeFragment);
                id6 id6VarM14401a = jd6.m14401a(kd6.Companion, userImportSourceType, "", "", "", 16);
                C3244l c3244l = ((wla) userImportTypeFragment.f26071B0.getValue()).f67023d;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, null));
                jfa.m14428k(b34.m3244j(userImportTypeFragment), id6VarM14401a, null);
                return xfaVar;
            case 5:
                VocabularyFilterFragment vocabularyFilterFragment = (VocabularyFilterFragment) obj2;
                vg6 vg6Var3 = (vg6) obj;
                vg6Var3.getClass();
                if (vg6Var3 instanceof si6) {
                    t0b t0bVar = (t0b) vocabularyFilterFragment.f33575B0.getValue();
                    t0bVar.f61727b.mo20216M(((si6) vg6Var3).f60900a);
                }
                return xfaVar;
            case 6:
                VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = (VocabularyFilterSelectionFragment) obj2;
                vg6 vg6Var4 = (vg6) obj;
                vg6Var4.getClass();
                if (vg6Var4.equals(tg6Var)) {
                    ((t0b) vocabularyFilterSelectionFragment.f33586B0.getValue()).mo20218x1();
                }
                return xfaVar;
            case 7:
                C2824b c2824b = (C2824b) obj2;
                fxa fxaVar = (fxa) obj;
                fxaVar.getClass();
                if (fxaVar instanceof vwa) {
                    vwa vwaVar = (vwa) fxaVar;
                    c2824b.m9744V2(new twa(vwaVar.f66033a, vwaVar.f66034b));
                } else {
                    c2824b.m9744V2(fxaVar);
                }
                return xfaVar;
            case 8:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, null, (jya) obj2, 1023);
            case 9:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, null, new iya((File) obj2), 1023);
            default:
                return n1b.m17171a((n1b) obj, null, null, null, null, null, false, false, false, false, null, new jya((fya) obj2), 1023);
        }
    }

    public /* synthetic */ gca(Object obj, int i) {
        this.f40553a = i;
        this.f40554b = obj;
    }
}
