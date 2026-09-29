package p000;

import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.glance.appwidget.AbstractC0658f;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.feature.vocabulary.R$string;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class je1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45454a;

    public /* synthetic */ je1(Ref$ObjectRef ref$ObjectRef, boolean z) {
        this.f45454a = 14;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f45454a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var, R$string.export_all_lingqs), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.export_to_anki), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.export_all_lingqs_to_anki), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var3, 0, 0, 262142);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            case 3:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var4, R$string.export_to_skritter), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262142);
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
            case 4:
                ye1 ye1Var5 = (ye1) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    tj3Var5.m22102U();
                }
                return xfaVar;
            case 5:
                ye1 ye1Var6 = (ye1) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                tj3 tj3Var6 = (tj3) ye1Var6;
                if (tj3Var6.m22099R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var6, R$string.vocabulary_select_page), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var6, 0, 0, 262142);
                } else {
                    tj3Var6.m22102U();
                }
                return xfaVar;
            case 6:
                ye1 ye1Var7 = (ye1) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (tj3Var7.m22099R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var7, com.lingq.core.p012ui.R$string.share_image_permission_title), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var7, 0, 0, 262142);
                } else {
                    tj3Var7.m22102U();
                }
                return xfaVar;
            case 7:
                ye1 ye1Var8 = (ye1) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (tj3Var8.m22099R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var8, com.lingq.core.p012ui.R$string.share_image_permission_desc), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var8, 0, 0, 262142);
                } else {
                    tj3Var8.m22102U();
                }
                return xfaVar;
            case 8:
                ye1 ye1Var9 = (ye1) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (tj3Var9.m22099R(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_lesson_review, tj3Var9, 0), vz1.m23620a0(tj3Var9, R$string.lesson_review), null, 0L, tj3Var9, 8, 12);
                } else {
                    tj3Var9.m22102U();
                }
                return xfaVar;
            case 9:
                ye1 ye1Var10 = (ye1) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                tj3 tj3Var10 = (tj3) ye1Var10;
                if (tj3Var10.m22099R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var10, R$string.search_search_vocabulary), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var10, 0, 0, 262142);
                } else {
                    tj3Var10.m22102U();
                }
                return xfaVar;
            case 10:
                ye1 ye1Var11 = (ye1) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                tj3 tj3Var11 = (tj3) ye1Var11;
                if (tj3Var11.m22099R(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_search_s, tj3Var11, 0), vz1.m23620a0(tj3Var11, com.lingq.core.p012ui.R$string.search_search), null, 0L, tj3Var11, 8, 12);
                } else {
                    tj3Var11.m22102U();
                }
                return xfaVar;
            case 11:
                ye1 ye1Var12 = (ye1) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                tj3 tj3Var12 = (tj3) ye1Var12;
                if (tj3Var12.m22099R(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_audio_tts, tj3Var12, 0), vz1.m23620a0(tj3Var12, com.lingq.core.p012ui.R$string.ui_play_word_audio), c99.m4411d(b16.f7762a, 1.0f), null, null, 0.0f, new qd0(5, ((ms5) tj3Var12.m22128k(ps5.f56764b)).f51799a.f55875s), tj3Var12, 392, 56);
                } else {
                    tj3Var12.m22102U();
                }
                return xfaVar;
            case 12:
                ye1 ye1Var13 = (ye1) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                tj3 tj3Var13 = (tj3) ye1Var13;
                if (tj3Var13.m22099R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    lw9.m16554b(vz1.m23620a0(tj3Var13, com.lingq.feature.library.R$string.year_in_review), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var13, 0, 0, 262142);
                } else {
                    tj3Var13.m22102U();
                }
                return xfaVar;
            case 13:
                ye1 ye1Var14 = (ye1) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                tj3 tj3Var14 = (tj3) ye1Var14;
                if (tj3Var14.m22099R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    ty3.m22351a(AbstractC3423or.m18281u(), vz1.m23620a0(tj3Var14, com.lingq.core.p012ui.R$string.ui_back), null, 0L, tj3Var14, 0, 12);
                } else {
                    tj3Var14.m22102U();
                }
                return xfaVar;
            case 14:
                return ((kn1) obj).plus((in1) obj2);
            case 15:
                return ((kn1) obj).plus((in1) obj2);
            case 16:
                ((Integer) obj2).getClass();
                qu1.m20166c((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 17:
                ((Integer) obj2).getClass();
                v9d.m23204f((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 18:
                return (DrawerValue) ((xc9) ((C0253l) obj2).f3552b.f2239h).getValue();
            case 19:
                ((Integer) obj2).getClass();
                bdd.m3655a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 20:
                ((Integer) obj2).getClass();
                AbstractC0658f.m2228a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 21:
                ((LanguageProgressPeriod) obj).getClass();
                ((LanguageProgressMetric) obj2).getClass();
                return xfaVar;
            case 22:
                ((Double) obj2).doubleValue();
                ((LanguageProgressMetric) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((Double) obj2).doubleValue();
                ((LanguageProgressMetric) obj).getClass();
                return xfaVar;
            case 24:
                ((Boolean) obj2).booleanValue();
                ((Challenge) obj).getClass();
                return xfaVar;
            case 25:
                ((LanguageProgressPeriod) obj).getClass();
                ((LanguageProgressMetric) obj2).getClass();
                return xfaVar;
            case 26:
                ((Double) obj2).doubleValue();
                ((LanguageProgressMetric) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((Integer) obj).getClass();
                return xfaVar;
            case 28:
                ((Integer) obj2).getClass();
                cid.m4761l((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            default:
                ((aq2) obj).f7356d = (on3) obj2;
                return xfaVar;
        }
    }

    public /* synthetic */ je1(int i, int i2) {
        this.f45454a = i2;
    }

    public /* synthetic */ je1(int i) {
        this.f45454a = i;
    }
}
