package p000;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.UpgradeTestFragment;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenPopupHostFragment;
import com.lingq.feature.imports.AbstractC2105b;
import com.lingq.feature.imports.R$string;
import com.lingq.feature.imports.UserImportAddCourseFragment;
import com.lingq.feature.imports.UserImportFragment;
import com.lingq.feature.imports.UserImportTypeFragment;
import com.lingq.feature.imports.data.UserImportSourceType;
import com.lingq.feature.library.yir.YearInReviewFragment;
import com.lingq.feature.vocabulary.AbstractC2823a;
import com.lingq.feature.vocabulary.VocabularyFragment;
import com.lingq.feature.vocabulary.filter.AbstractC2849a;
import com.lingq.feature.vocabulary.filter.VocabularyFilterFragment;
import com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionFragment;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dl9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35796a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35797b;

    public /* synthetic */ dl9(Object obj, int i) {
        this.f35796a = i;
        this.f35797b = obj;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35796a;
        p84 p84Var = we1.f66679a;
        int i2 = 2;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        Object obj3 = this.f35797b;
        switch (i) {
            case 0:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                charSequence.getClass();
                int iM23390m0 = vk9.m23390m0(charSequence, (char[]) obj3, iIntValue, false);
                if (iM23390m0 < 0) {
                    return null;
                }
                return new Pair(Integer.valueOf(iM23390m0), 1);
            case 1:
                ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ((ye1) obj);
                tj3Var.m22111b0(950061013);
                String strValueOf = String.valueOf(((TextClassification) obj3).getLabel());
                tj3Var.m22139q(false);
                return strValueOf;
            case 2:
                ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ((ye1) obj);
                tj3Var2.m22111b0(-1376593684);
                String string = ((RemoteAction) obj3).getTitle().toString();
                tj3Var2.m22139q(false);
                return string;
            case 3:
                ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var;
                if (tj3Var3.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, themeSettingsTab.getTitleRes()), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC1899b.m8701j((C1909e) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 5:
                TokenPopupHostFragment tokenPopupHostFragment = (TokenPopupHostFragment) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var2;
                if (tj3Var4.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC1899b.m8701j(tokenPopupHostFragment.m8689c0(), tj3Var4, 0);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 6:
                UpgradeTestFragment upgradeTestFragment = (UpgradeTestFragment) obj3;
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var3;
                if (tj3Var5.m22099R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    ud6 ud6VarM3244j = b34.m3244j(upgradeTestFragment);
                    boolean zM22124i = tj3Var5.m22124i(upgradeTestFragment);
                    Object objM22097O = tj3Var5.m22097O();
                    if (zM22124i || objM22097O == p84Var) {
                        objM22097O = new br8(upgradeTestFragment, 8);
                        tj3Var5.m22131l0(objM22097O);
                    }
                    AbstractC1839a.m8515A(ud6VarM3244j, null, (ui3) objM22097O, tj3Var5, 0);
                } else {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 7:
                UserImportAddCourseFragment userImportAddCourseFragment = (UserImportAddCourseFragment) obj3;
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var4;
                if (tj3Var6.m22099R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    boolean zM22124i2 = tj3Var6.m22124i(userImportAddCourseFragment);
                    Object objM22097O2 = tj3Var6.m22097O();
                    if (zM22124i2 || objM22097O2 == p84Var) {
                        objM22097O2 = new gca(userImportAddCourseFragment, i2);
                        tj3Var6.m22131l0(objM22097O2);
                    }
                    AbstractC2105b.m9004b(null, (vi3) objM22097O2, tj3Var6, 0);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 8:
                UserImportFragment userImportFragment = (UserImportFragment) obj3;
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var5;
                if (tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zM22124i3 = tj3Var7.m22124i(userImportFragment);
                    Object objM22097O3 = tj3Var7.m22097O();
                    if (zM22124i3 || objM22097O3 == p84Var) {
                        objM22097O3 = new nka(userImportFragment, i3);
                        tj3Var7.m22131l0(objM22097O3);
                    }
                    AbstractC2105b.m9006d(null, (vi3) objM22097O3, tj3Var7, 0);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 9:
                et2 et2Var = (et2) obj3;
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var6;
                if (tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    dt2 dt2Var = (dt2) et2Var;
                    lw9.m16554b(vz1.m23618Z(R$string.import_transcription_error, new Object[]{Integer.valueOf(dt2Var.f36193a), dt2Var.f36194b}, tj3Var8), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 10:
                UserImportSourceType userImportSourceType = (UserImportSourceType) obj3;
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var7;
                if (tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var9, z9d.m25518g(userImportSourceType)), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var9, 0, 0, 262142);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 11:
                UserImportTypeFragment userImportTypeFragment = (UserImportTypeFragment) obj3;
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var8;
                if (tj3Var10.m22099R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    boolean zM22124i4 = tj3Var10.m22124i(userImportTypeFragment);
                    Object objM22097O4 = tj3Var10.m22097O();
                    if (zM22124i4 || objM22097O4 == p84Var) {
                        objM22097O4 = new br8(userImportTypeFragment, 9);
                        tj3Var10.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var = (ui3) objM22097O4;
                    boolean zM22124i5 = tj3Var10.m22124i(userImportTypeFragment);
                    Object objM22097O5 = tj3Var10.m22097O();
                    if (zM22124i5 || objM22097O5 == p84Var) {
                        objM22097O5 = new gca(userImportTypeFragment, 4);
                        tj3Var10.m22131l0(objM22097O5);
                    }
                    bad.m3546a(ui3Var, (vi3) objM22097O5, tj3Var10, 0, 0);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 12:
                VocabularyFilterFragment vocabularyFilterFragment = (VocabularyFilterFragment) obj3;
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var9;
                if (tj3Var11.m22099R(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    boolean zM22124i6 = tj3Var11.m22124i(vocabularyFilterFragment);
                    Object objM22097O6 = tj3Var11.m22097O();
                    if (zM22124i6 || objM22097O6 == p84Var) {
                        objM22097O6 = new gca(vocabularyFilterFragment, 5);
                        tj3Var11.m22131l0(objM22097O6);
                    }
                    AbstractC2849a.m9756b(null, (vi3) objM22097O6, tj3Var11, 0);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 13:
                VocabularyFilterSelectionFragment vocabularyFilterSelectionFragment = (VocabularyFilterSelectionFragment) obj3;
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var10;
                if (tj3Var12.m22099R(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    boolean zM22124i7 = tj3Var12.m22124i(vocabularyFilterSelectionFragment);
                    Object objM22097O7 = tj3Var12.m22097O();
                    if (zM22124i7 || objM22097O7 == p84Var) {
                        objM22097O7 = new gca(vocabularyFilterSelectionFragment, 6);
                        tj3Var12.m22131l0(objM22097O7);
                    }
                    AbstractC2849a.m9758d(null, (vi3) objM22097O7, tj3Var12, 0);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 14:
                VocabularyFragment vocabularyFragment = (VocabularyFragment) obj3;
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var11;
                if (tj3Var13.m22099R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    w41 w41Var = vocabularyFragment.f33483C0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    og8 og8Var = vocabularyFragment.f33482B0;
                    if (og8Var == null) {
                        fa4.m11636J("reviewTermsStore");
                        throw null;
                    }
                    bia biaVar = vocabularyFragment.f33484D0;
                    if (biaVar == null) {
                        fa4.m11636J("upgradePopupDelegate");
                        throw null;
                    }
                    AbstractC2823a.m9739f(w41Var, og8Var, biaVar, null, null, tj3Var13, 0);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 15:
                ((Integer) obj2).getClass();
                fbd.m11752b((vxa) obj3, (ye1) obj, pk9.m19383z(1));
                return xfaVar;
            default:
                YearInReviewFragment yearInReviewFragment = (YearInReviewFragment) obj3;
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var12;
                if (tj3Var14.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    String str = ((fab) yearInReviewFragment.f26782R0.getValue()).f38746a;
                    boolean zM22124i8 = tj3Var14.m22124i(yearInReviewFragment);
                    Object objM22097O8 = tj3Var14.m22097O();
                    if (zM22124i8 || objM22097O8 == p84Var) {
                        objM22097O8 = new br8(yearInReviewFragment, 21);
                        tj3Var14.m22131l0(objM22097O8);
                    }
                    ecd.m11040b(str, (ui3) objM22097O8, tj3Var14, 0);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
        }
    }

    public /* synthetic */ dl9(Object obj, int i, int i2) {
        this.f35796a = i2;
        this.f35797b = obj;
    }
}
