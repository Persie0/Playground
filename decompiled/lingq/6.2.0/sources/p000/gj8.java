package p000;

import android.content.Context;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.LearningLevel;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class gj8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f40878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f40879c;

    public /* synthetic */ gj8(int i, Object obj, Object obj2) {
        this.f40877a = i;
        this.f40878b = obj;
        this.f40879c = obj2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        LearningLevel learningLevel;
        LearningLevel learningLevel2;
        String strM18230O;
        LearningLevel learningLevel3;
        int i = this.f40877a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f40879c;
        Object obj4 = this.f40878b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Number) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    ((C0282a) obj4).invoke(obj3, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                Context context = (Context) obj3;
                v19 v19Var = (v19) obj4;
                float f = v19Var.f64708c;
                float f2 = v19Var.f64707b;
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                if (f == f2) {
                    Iterator<E> it = LearningLevel.getEntries().iterator();
                    do {
                        if (!it.hasNext()) {
                            uk9.m22775i("Collection contains no element matching the predicate.");
                            return null;
                        }
                        learningLevel3 = (LearningLevel) it.next();
                    } while (learningLevel3.ordinal() != ((int) f2));
                    strM18230O = AbstractC3423or.m18230O(learningLevel3, context);
                    lw9.m16554b(strM18230O, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                    return xfaVar;
                }
                Iterator<E> it2 = LearningLevel.getEntries().iterator();
                do {
                    if (it2.hasNext()) {
                        learningLevel = (LearningLevel) it2.next();
                    } else {
                        uk9.m22775i("Collection contains no element matching the predicate.");
                    }
                    return null;
                } while (learningLevel.ordinal() != ((int) f2));
                String strM18230O2 = AbstractC3423or.m18230O(learningLevel, context);
                Iterator<E> it3 = LearningLevel.getEntries().iterator();
                do {
                    if (!it3.hasNext()) {
                        uk9.m22775i("Collection contains no element matching the predicate.");
                        return null;
                    }
                    learningLevel2 = (LearningLevel) it3.next();
                } while (learningLevel2.ordinal() != ((int) f));
                strM18230O = String.format("%s - %s", Arrays.copyOf(new Object[]{strM18230O2, AbstractC3423or.m18230O(learningLevel2, context)}, 2));
                lw9.m16554b(strM18230O, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                return xfaVar;
            default:
                ((vi3) obj4).invoke(new x09(((w19) obj3).f66230e, ((Number) obj).intValue(), ((Number) obj2).intValue()));
                return xfaVar;
        }
    }
}
