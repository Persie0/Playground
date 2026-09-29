package p000;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.ViewKeys;
import com.lingq.feature.vocabulary.state.C2860b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class xza implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69032a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f69033b;

    public /* synthetic */ xza(C2860b c2860b, int i) {
        this.f69032a = i;
        this.f69033b = c2860b;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Pair pair;
        int i = this.f69032a;
        C2860b c2860b = this.f69033b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                c2860b.m9767f((List) obj);
                break;
            case 1:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList(u91.m22587E0(list));
                    arrayList.add(0, new wya(-1, "All"));
                    C3244l c3244l = c2860b.f33793v;
                    c3244l.getClass();
                    c3244l.m15572j(null, arrayList);
                    c2860b.m9767f(C2860b.m9762a(c2860b, arrayList));
                }
                break;
            case 2:
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    ArrayList<pya> arrayList2 = new ArrayList(u91.m22587E0(list2));
                    arrayList2.add(0, new pya(-1, "All"));
                    C3244l c3244l2 = c2860b.f33792u;
                    c3244l2.getClass();
                    c3244l2.m15572j(null, arrayList2);
                    ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                    for (pya pyaVar : arrayList2) {
                        String str2 = pyaVar.f57002b;
                        String str3 = str2 == null ? "" : str2;
                        VocabularySearchQuery vocabularySearchQuery = c2860b.f33784m;
                        if (vocabularySearchQuery == null || (pair = vocabularySearchQuery.f19867i) == null || (str = (String) pair.f47623a) == null) {
                            str = "All";
                        }
                        boolean zM11650l = fa4.m11650l(str2, str);
                        String str4 = pyaVar.f57002b;
                        if (str4 == null) {
                            str4 = "key_all";
                        }
                        arrayList3.add(new fv8(1, null, str3, str4, zM11650l));
                    }
                    c2860b.m9767f(arrayList3);
                }
                break;
            case 3:
                List list3 = (List) obj;
                if (!list3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList(list3);
                    arrayList4.add(0, new wya(-1, "All"));
                    C3244l c3244l3 = c2860b.f33793v;
                    c3244l3.getClass();
                    c3244l3.m15572j(null, arrayList4);
                    c2860b.m9767f(C2860b.m9762a(c2860b, arrayList4));
                }
                break;
            case 4:
                Language language = (Language) obj;
                if (language != null) {
                    List list4 = language.f19042s;
                    c2860b.f33791t.m15571i(list4);
                    List<String> list5 = list4;
                    ArrayList arrayList5 = new ArrayList(v91.m23189q0(list5, 10));
                    for (String str5 : list5) {
                        String strM24807e = y02.m24807e(str5, (3 & 1) != 0 ? "yyyy-MM-dd'T'HH:mm:ss" : "yyyy-MM-dd", (3 & 2) != 0 ? "MMM dd, yyyy" : "dd MMM, yyyy");
                        String str6 = (String) u91.m22591I0(vk9.m23365A0(str5, new String[]{"T"}, 0, 6));
                        if (str6 == null) {
                            str6 = "";
                        }
                        arrayList5.add(new fv8(1, null, strM24807e, str5, str6.equals(c2860b.f33790s.getValue())));
                    }
                    c2860b.m9767f(arrayList5);
                }
                break;
            default:
                VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) ((Map) obj).get(c2860b.f33777f.mo4589b2());
                if (vocabularySearchQuery2 != null) {
                    c2860b.f33784m = vocabularySearchQuery2;
                    List list6 = vocabularySearchQuery2.f19866h;
                    ArrayList arrayList6 = new ArrayList();
                    arrayList6.add(new d29(R$string.card_sort_status));
                    List list7 = list6;
                    ArrayList arrayList7 = new ArrayList(v91.m23189q0(list7, 10));
                    Iterator it = list7.iterator();
                    while (it.hasNext()) {
                        arrayList7.add(Integer.valueOf(AbstractC3423or.m18225J((CardStatus) it.next())));
                    }
                    arrayList6.add(new w19(arrayList7, vz1.m23605K(Integer.valueOf(com.lingq.core.settings.R$string.search_status_1), Integer.valueOf(com.lingq.core.settings.R$string.search_status_2), Integer.valueOf(com.lingq.core.settings.R$string.search_status_3), Integer.valueOf(com.lingq.core.settings.R$string.search_status_4), Integer.valueOf(com.lingq.core.settings.R$string.search_status_known)), vocabularySearchQuery2.f19859a, vocabularySearchQuery2.f19860b, ViewKeys.StatusRange, Math.max(list6.size() - 1.0f, 0.0f)));
                    arrayList6.add(new d29(com.lingq.core.settings.R$string.sort_sort_by));
                    arrayList6.add(new x19(Integer.valueOf(AbstractC3423or.m18227L(vocabularySearchQuery2.f19863e)), null, ViewKeys.SortBy, 2));
                    arrayList6.add(new d29(com.lingq.core.settings.R$string.card_search_term));
                    arrayList6.add(new x19(Integer.valueOf(AbstractC3423or.m18226K(vocabularySearchQuery2.f19861c)), null, ViewKeys.SearchTerm, 2));
                    arrayList6.add(new d29(R$string.lingq_tags));
                    arrayList6.add(new x19(null, u91.m22596N0(vocabularySearchQuery2.f19865g, ",", null, null, null, 62), ViewKeys.Tags, 1));
                    arrayList6.add(new d29(R$string.lingq_course));
                    arrayList6.add(new x19(null, (String) vocabularySearchQuery2.f19867i.f47623a, ViewKeys.Course, 1));
                    arrayList6.add(new d29(R$string.lingq_lesson));
                    arrayList6.add(new x19(null, (String) vocabularySearchQuery2.f19868j.f47623a, ViewKeys.Lesson, 1));
                    arrayList6.add(new d29(com.lingq.core.settings.R$string.card_srs_Date));
                    String strM24807e2 = y02.m24807e(vocabularySearchQuery2.f19864f, "yyyy-MM-dd", "dd MMM, yyyy");
                    if (vk9.m23391n0(strM24807e2)) {
                        strM24807e2 = vocabularySearchQuery2.f19864f;
                    }
                    arrayList6.add(new x19(null, strM24807e2, ViewKeys.VocabularySrsDate, 1));
                    C3244l c3244l4 = c2860b.f33782k;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, arrayList6);
                }
                break;
        }
        return xfaVar;
    }
}
