package p000;

import androidx.compose.material3.AbstractC0266w;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.library.LibraryFastSearch;
import com.lingq.core.domain.model.token.TokenMeaning;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ae1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f533a;

    public /* synthetic */ ae1(int i) {
        this.f533a = i;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Exception {
        int i;
        String str;
        int i2 = this.f533a;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 1:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 2:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 3:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 4:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 5:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 6:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 7:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 8:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 9:
                ((TokenMeaning) obj).getClass();
                return xfaVar;
            case 10:
                ((String) obj).getClass();
                return xfaVar;
            case 11:
                ((String) obj).getClass();
                return xfaVar;
            case 12:
                ((String) obj).getClass();
                return xfaVar;
            case 13:
                bk8 bk8Var = (bk8) obj;
                bk8Var.getClass();
                ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("DELETE FROM CupPrizeEntity");
                try {
                    ik8VarMo2873e0.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e0.close();
                }
            case 14:
                bk8 bk8Var2 = (bk8) obj;
                bk8Var2.getClass();
                ik8 ik8VarMo2873e1 = bk8Var2.mo2873e0("SELECT * FROM CupTeamEntity ORDER BY rank ASC");
                try {
                    int iM14108v = AbstractC3122is.m14108v(ik8VarMo2873e1, "teamCode");
                    int iM14108v2 = AbstractC3122is.m14108v(ik8VarMo2873e1, "name");
                    int iM14108v3 = AbstractC3122is.m14108v(ik8VarMo2873e1, "totalCoins");
                    int iM14108v4 = AbstractC3122is.m14108v(ik8VarMo2873e1, "coinsPerUser");
                    int iM14108v5 = AbstractC3122is.m14108v(ik8VarMo2873e1, "participantCount");
                    int iM14108v6 = AbstractC3122is.m14108v(ik8VarMo2873e1, "rank");
                    int iM14108v7 = AbstractC3122is.m14108v(ik8VarMo2873e1, "prevRank");
                    int iM14108v8 = AbstractC3122is.m14108v(ik8VarMo2873e1, "delta");
                    ArrayList arrayList = new ArrayList();
                    while (ik8VarMo2873e1.mo2876a0()) {
                        int i3 = iM14108v;
                        arrayList.add(new gw1(ik8VarMo2873e1.mo2875L(iM14108v), ik8VarMo2873e1.mo2875L(iM14108v2), (int) ik8VarMo2873e1.getLong(iM14108v3), ik8VarMo2873e1.getDouble(iM14108v4), (int) ik8VarMo2873e1.getLong(iM14108v5), (int) ik8VarMo2873e1.getLong(iM14108v6), ik8VarMo2873e1.isNull(iM14108v7) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v7)), ik8VarMo2873e1.isNull(iM14108v8) ? null : Integer.valueOf((int) ik8VarMo2873e1.getLong(iM14108v8))));
                        iM14108v = i3;
                        break;
                    }
                    return arrayList;
                } finally {
                    ik8VarMo2873e1.close();
                }
            case 15:
                bk8 bk8Var3 = (bk8) obj;
                bk8Var3.getClass();
                ik8 ik8VarMo2873e2 = bk8Var3.mo2873e0("DELETE FROM CupTeamEntity");
                try {
                    ik8VarMo2873e2.mo2876a0();
                    return xfaVar;
                } finally {
                    ik8VarMo2873e2.close();
                }
            case 16:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbM22999v = ux5.m22999v(str2, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sbM22999v.append(value);
                return sbM22999v.toString();
            case 17:
                DictionaryData dictionaryData = (DictionaryData) obj;
                dictionaryData.getClass();
                return Integer.valueOf(dictionaryData.f19008a);
            case 18:
                DictionaryLocale dictionaryLocale = (DictionaryLocale) obj;
                dictionaryLocale.getClass();
                return dictionaryLocale.f19021a;
            case 19:
                float fFloatValue = ((Float) obj).floatValue();
                fda fdaVar = AbstractC0266w.f3635a;
                return Float.valueOf(fFloatValue * 0.5f);
            case 20:
                e03 e03Var = (e03) obj;
                e03Var.getClass();
                if (e03Var instanceof c03) {
                    return "search";
                }
                if (e03Var instanceof a03) {
                    i = ((a03) e03Var).f17a.f19426a;
                    str = "lesson-";
                } else if (e03Var instanceof yz2) {
                    i = ((yz2) e03Var).f70666a.f19426a;
                    str = "course-";
                } else {
                    if (e03Var instanceof d03) {
                        LibraryFastSearch libraryFastSearch = ((d03) e03Var).f34774a;
                        return wq1.m24119o("selection-", libraryFastSearch.f19396c, "-", libraryFastSearch.f19394a);
                    }
                    if (e03Var instanceof zz2) {
                        return "empty-" + ((zz2) e03Var).f72420a;
                    }
                    if (!(e03Var instanceof b03)) {
                        gm5.m12750e();
                        return null;
                    }
                    i = ((b03) e03Var).f7719a;
                    str = "loading-";
                }
                return ux5.m22988k(i, str);
            case 21:
                ((Integer) obj).getClass();
                return xfaVar;
            case 22:
                ((Throwable) obj).getClass();
                return xfaVar;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                e28 e28Var = (e28) obj;
                e28Var.getClass();
                return Float.valueOf(e28Var.f36621b);
            case 24:
                e28 e28Var2 = (e28) obj;
                e28Var2.getClass();
                return Float.valueOf(e28Var2.f36620a);
            case 25:
                fw8 fw8Var = (fw8) obj;
                fw8Var.getClass();
                return Float.valueOf(fw8Var.f39812b);
            case 26:
                ((fw8) obj).getClass();
                return Float.valueOf(0.0f);
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                e28 e28Var3 = (e28) obj;
                e28Var3.getClass();
                return Float.valueOf(e28Var3.f36621b);
            case 28:
                e28 e28Var4 = (e28) obj;
                e28Var4.getClass();
                return Float.valueOf(e28Var4.f36620a);
            default:
                q98 q98Var = (q98) obj;
                q98Var.getClass();
                q98Var.m19818i(1);
                return xfaVar;
        }
    }
}
