package p000;

import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.model.language.LanguageToLearn;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.milestones.Badge;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Map;
import kotlinx.serialization.json.AbstractC3262b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qy3 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58374a;

    public /* synthetic */ qy3(int i) {
        this.f58374a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i = this.f58374a;
        boolean z = false;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                AbstractC0426f.m1864h((tv8) obj, 0);
                return xfaVar;
            case 1:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 2:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 3:
                char cCharValue = ((Character) obj).charValue();
                return Boolean.valueOf(cCharValue == 'T' || cCharValue == 't');
            case 4:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 5:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 6:
                char cCharValue2 = ((Character) obj).charValue();
                if ('0' <= cCharValue2 && cCharValue2 < ':') {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str = (String) entry.getKey();
                AbstractC3262b abstractC3262b = (AbstractC3262b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                rk9.m20682a(str, sb);
                sb.append(':');
                sb.append(abstractC3262b);
                return sb.toString();
            case 8:
                if4 if4Var = (if4) obj;
                if4Var.getClass();
                if4Var.f44042c = true;
                if4Var.f44040a = true;
                return xfaVar;
            case 9:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT `code`, `id`, `supported`, `title`, `lastUsed`, `knownWords`, `dictionaryLocaleActive`, `scheduledForDeletion` FROM (SELECT * FROM LanguageEntity)");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e0.mo2876a0()) {
                        arrayList.add(new LanguageToLearn(ik8VarMo2873e0.mo2875L(0), ((int) ik8VarMo2873e0.getLong(2)) != 0, ik8VarMo2873e0.mo2875L(3), (int) ik8VarMo2873e0.getLong(5), (int) ik8VarMo2873e0.getLong(1), ik8VarMo2873e0.isNull(6) ? null : ik8VarMo2873e0.mo2875L(6), ik8VarMo2873e0.isNull(4) ? null : ik8VarMo2873e0.mo2875L(4), ((int) ik8VarMo2873e0.getLong(7)) != 0));
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 10:
                ((Double) obj).getClass();
                return xfaVar;
            case 11:
                ym4 ym4Var = (ym4) obj;
                ym4Var.getClass();
                if (ym4Var instanceof wm4) {
                    return ((wm4) ym4Var).f67053a.f19113a;
                }
                if (ym4Var instanceof xm4) {
                    return ux5.m22988k(((xm4) ym4Var).f68347a, "header_");
                }
                gm5.m12750e();
                return null;
            case 12:
                ((LanguageProgressMetric) obj).getClass();
                return xfaVar;
            case 13:
                ((LanguageProgressPeriod) obj).getClass();
                return xfaVar;
            case 14:
                ((LanguageProgressMetric) obj).getClass();
                return xfaVar;
            case 15:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 16:
                ((LanguageProgressPeriod) obj).getClass();
                return xfaVar;
            case 17:
                ((lc5) obj).getClass();
                return xfaVar;
            case 18:
                ((dn4) obj).getClass();
                return xfaVar;
            case 19:
                ((lc5) obj).getClass();
                return xfaVar;
            case 20:
                float fFloatValue = ((Float) obj).floatValue();
                if (fFloatValue <= 0.0f) {
                    return "0";
                }
                int i2 = (int) fFloatValue;
                if (fFloatValue == i2) {
                    return String.valueOf(i2);
                }
                String plainString = new BigDecimal(String.valueOf(fFloatValue)).stripTrailingZeros().toPlainString();
                plainString.getClass();
                return plainString;
            case 21:
                float fFloatValue2 = ((Float) obj).floatValue();
                return fFloatValue2 == 0.0f ? "0" : yhd.m25151g(fFloatValue2);
            case 22:
                ((LanguageProgressPeriod) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((LanguageProgressPeriod) obj).getClass();
                return xfaVar;
            case 24:
                ((Badge) obj).getClass();
                return xfaVar;
            case 25:
                return Boolean.valueOf(!(((nn3) obj) instanceof C3807ys));
            case 26:
                return xfaVar;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                return xfaVar;
            case 28:
                if4 if4Var2 = (if4) obj;
                if4Var2.getClass();
                if4Var2.f44042c = true;
                return xfaVar;
            default:
                LessonCard lessonCard = (LessonCard) obj;
                lessonCard.getClass();
                return lessonCard.f19178a;
        }
    }
}
