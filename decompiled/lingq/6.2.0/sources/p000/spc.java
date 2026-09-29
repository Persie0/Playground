package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.network.api.result.ResultCard;
import com.lingq.core.network.api.result.ResultLessonTransliteration;
import com.lingq.core.network.api.result.ResultTokenMeaning;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class spc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f61213a = new C0282a(1802117975, false, new ee1(14));

    /* JADX INFO: renamed from: b */
    public static final C0282a f61214b = new C0282a(-2021563618, false, new fe1(6));

    /* JADX INFO: renamed from: c */
    public static final C0282a f61215c = new C0282a(-1546127249, false, new fe1(7));

    static {
        new C0282a(157762947, false, new fe1(8));
    }

    /* JADX INFO: renamed from: a */
    public static final CardEntity m21534a(ResultCard resultCard, String str, boolean z) {
        z88 z88Var;
        z88 z88Var2;
        int i = resultCard.f20621b;
        String str2 = resultCard.f20620a;
        String str3 = resultCard.f20629j;
        List list = resultCard.f20631l;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ouc.m18521a((ResultTokenMeaning) it.next()));
        }
        List list2 = resultCard.f20632m;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList2));
        List list3 = resultCard.f20633n;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list3, 10));
        Iterator it3 = list3.iterator();
        while (it3.hasNext()) {
            String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList3.add(lowerCase2);
        }
        List listM22622n2 = u91.m22622n1(u91.m22626r1(arrayList3));
        ResultLessonTransliteration resultLessonTransliteration = resultCard.f20635p;
        String str4 = resultLessonTransliteration != null ? resultLessonTransliteration.f21193a : null;
        String str5 = resultLessonTransliteration != null ? resultLessonTransliteration.f21194b : null;
        String str6 = resultLessonTransliteration != null ? resultLessonTransliteration.f21195c : null;
        String str7 = resultLessonTransliteration != null ? resultLessonTransliteration.f21196d : null;
        String str8 = resultLessonTransliteration != null ? resultLessonTransliteration.f21197e : null;
        String str9 = resultLessonTransliteration != null ? resultLessonTransliteration.f21198f : null;
        String str10 = (resultLessonTransliteration == null || (z88Var2 = resultLessonTransliteration.f21199g) == null) ? null : z88Var2.f71092a;
        String str11 = (resultLessonTransliteration == null || (z88Var = resultLessonTransliteration.f21199g) == null) ? null : z88Var.f71093b;
        String str12 = resultLessonTransliteration != null ? resultLessonTransliteration.f21200h : null;
        int i2 = resultCard.f20624e;
        Integer num = resultCard.f20625f;
        return new CardEntity(str2, str, i, resultCard.f20622c, resultCard.f20623d, i2, num, resultCard.f20626g, resultCard.f20627h, resultCard.f20628i, str3, resultCard.f20630k, arrayList, listM22622n1, listM22622n2, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, null, 134291456);
    }
}
