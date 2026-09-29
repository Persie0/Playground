package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class po1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56580a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f56581b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f56582c;

    public /* synthetic */ po1(vi3 vi3Var, t66 t66Var, int i) {
        this.f56580a = i;
        this.f56581b = vi3Var;
        this.f56582c = t66Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f56580a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        float f = 1.0f;
        b16 b16Var = b16.f7762a;
        final t66 t66Var = this.f56582c;
        final vi3 vi3Var = this.f56581b;
        final int i2 = 1;
        final int i3 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    for (CoursePlaylistSort coursePlaylistSort : CoursePlaylistSort.getEntries()) {
                        String strM23620a0 = vz1.m23620a0(tj3Var, AbstractC3423or.m18222G(coursePlaylistSort));
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22120g = tj3Var.m22120g(vi3Var) | tj3Var.m22116e(coursePlaylistSort.ordinal());
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = new zg0(vi3Var, coursePlaylistSort, t66Var, 6);
                            tj3Var.m22131l0(objM22097O);
                        }
                        lw9.m16554b(strM23620a0, AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM21607T, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262140);
                    }
                } else {
                    tj3Var.m22102U();
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (final LanguageProgressPeriod languageProgressPeriod : LanguageProgressPeriod.getEntries()) {
                        String strM23620a1 = vz1.m23620a0(tj3Var2, AbstractC3423or.m18224I(languageProgressPeriod));
                        e16 e16VarM21607T2 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22120g2 = tj3Var2.m22120g(vi3Var) | tj3Var2.m22116e(languageProgressPeriod.ordinal());
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = new ui3() { // from class: ln4
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i4 = i3;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var2 = t66Var;
                                    LanguageProgressPeriod languageProgressPeriod2 = languageProgressPeriod;
                                    vi3 vi3Var2 = vi3Var;
                                    switch (i4) {
                                        case 0:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(languageProgressPeriod2);
                                            break;
                                        default:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(languageProgressPeriod2);
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        lw9.m16554b(strM23620a1, AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM21607T2, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262140);
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    ys2 entries = LanguageProgressPeriod.getEntries();
                    ArrayList<LanguageProgressPeriod> arrayList = new ArrayList();
                    for (Object obj4 : entries) {
                        if (((LanguageProgressPeriod) obj4) != LanguageProgressPeriod.Today) {
                            arrayList.add(obj4);
                        }
                    }
                    for (final LanguageProgressPeriod languageProgressPeriod2 : arrayList) {
                        String strM23620a2 = vz1.m23620a0(tj3Var3, AbstractC3423or.m18224I(languageProgressPeriod2));
                        e16 e16VarM21607T3 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, f), ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22116e = tj3Var3.m22116e(languageProgressPeriod2.ordinal()) | tj3Var3.m22120g(vi3Var);
                        Object objM22097O3 = tj3Var3.m22097O();
                        if (zM22116e || objM22097O3 == p84Var) {
                            objM22097O3 = new ui3() { // from class: ln4
                                @Override // p000.ui3
                                /* JADX INFO: renamed from: a */
                                public final Object mo0a() {
                                    int i4 = i2;
                                    xfa xfaVar2 = xfa.f68157a;
                                    t66 t66Var2 = t66Var;
                                    LanguageProgressPeriod languageProgressPeriod3 = languageProgressPeriod2;
                                    vi3 vi3Var2 = vi3Var;
                                    switch (i4) {
                                        case 0:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(languageProgressPeriod3);
                                            break;
                                        default:
                                            t66Var2.setValue(Boolean.FALSE);
                                            vi3Var2.invoke(languageProgressPeriod3);
                                            break;
                                    }
                                    return xfaVar2;
                                }
                            };
                            tj3Var3.m22131l0(objM22097O3);
                        }
                        lw9.m16554b(strM23620a2, AbstractC0080f.m815b(null, false, (ui3) objM22097O3, e16VarM21607T3, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262140);
                        f = 1.0f;
                    }
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
                    for (LanguageProgressMetric languageProgressMetric : LanguageProgressMetric.getEntries()) {
                        String strM23620a3 = vz1.m23620a0(tj3Var4, AbstractC3423or.m18223H(languageProgressMetric));
                        e16 e16VarM21607T4 = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var4.m22128k(ge9.f40637a)).f38952a);
                        boolean zM22120g3 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22116e(languageProgressMetric.ordinal());
                        Object objM22097O4 = tj3Var4.m22097O();
                        if (zM22120g3 || objM22097O4 == p84Var) {
                            objM22097O4 = new zg0(vi3Var, languageProgressMetric, t66Var, 14);
                            tj3Var4.m22131l0(objM22097O4);
                        }
                        lw9.m16554b(strM23620a3, AbstractC0080f.m815b(null, false, (ui3) objM22097O4, e16VarM21607T4, 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262140);
                    }
                } else {
                    tj3Var4.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
