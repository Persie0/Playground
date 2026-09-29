package p000;

import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.feature.vocabulary.filter.C2850b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes3.dex */
public final class iza implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44814a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2850b f44815b;

    public /* synthetic */ iza(C2850b c2850b, int i) {
        this.f44814a = i;
        this.f44815b = c2850b;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        String str;
        Pair pair;
        String str2;
        Pair pair2;
        Object obj2;
        String str3;
        Pair pair3;
        String str4;
        int i = this.f44814a;
        String str5 = "";
        xfa xfaVar = xfa.f68157a;
        C2850b c2850b = this.f44815b;
        switch (i) {
            case 0:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    C3244l c3244l = c2850b.f33687l;
                    Boolean bool = Boolean.FALSE;
                    c3244l.getClass();
                    c3244l.m15572j(null, bool);
                    ArrayList<wya> arrayList = new ArrayList();
                    arrayList.addAll(list);
                    arrayList.add(0, new wya(-1, "All"));
                    C3244l c3244l2 = c2850b.f33692q;
                    c3244l2.getClass();
                    c3244l2.m15572j(null, arrayList);
                    C3244l c3244l3 = c2850b.f33689n;
                    ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                    for (wya wyaVar : arrayList) {
                        String str6 = wyaVar.f67532b;
                        String str7 = str6 == null ? "" : str6;
                        VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) c2850b.f33701z.getValue();
                        if (vocabularySearchQuery == null || (pair = vocabularySearchQuery.f19868j) == null || (str = (String) pair.f47623a) == null) {
                            str = "All";
                        }
                        boolean zM11650l = fa4.m11650l(str6, str);
                        String str8 = wyaVar.f67532b;
                        arrayList2.add(new fv8(1, null, str7, str8 == null ? "key_all" : str8, zM11650l));
                    }
                    c3244l3.getClass();
                    c3244l3.m15572j(null, arrayList2);
                }
                break;
            case 1:
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    C3244l c3244l4 = c2850b.f33687l;
                    Boolean bool2 = Boolean.FALSE;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, bool2);
                    ArrayList arrayListM22587E0 = u91.m22587E0(list2);
                    ArrayList<pya> arrayList3 = new ArrayList();
                    arrayList3.addAll(arrayListM22587E0);
                    arrayList3.add(0, new pya(-1, "All"));
                    C3244l c3244l5 = c2850b.f33691p;
                    c3244l5.getClass();
                    c3244l5.m15572j(null, arrayList3);
                    C3244l c3244l6 = c2850b.f33689n;
                    ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
                    for (pya pyaVar : arrayList3) {
                        String str9 = pyaVar.f57002b;
                        String str10 = str9 == null ? "" : str9;
                        VocabularySearchQuery vocabularySearchQuery2 = (VocabularySearchQuery) c2850b.f33701z.getValue();
                        if (vocabularySearchQuery2 == null || (pair2 = vocabularySearchQuery2.f19867i) == null || (str2 = (String) pair2.f47623a) == null) {
                            str2 = "All";
                        }
                        boolean zM11650l2 = fa4.m11650l(str9, str2);
                        String str11 = pyaVar.f57002b;
                        arrayList4.add(new fv8(1, null, str10, str11 == null ? "key_all" : str11, zM11650l2));
                    }
                    c3244l6.getClass();
                    c3244l6.m15572j(null, arrayList4);
                }
                break;
            case 2:
                kp4 kp4Var = (kp4) obj;
                if (kp4Var != null) {
                    List list3 = kp4Var.f48282b;
                    if (!list3.isEmpty()) {
                        C3244l c3244l7 = c2850b.f33687l;
                        Boolean bool3 = Boolean.FALSE;
                        c3244l7.getClass();
                        c3244l7.m15572j(null, bool3);
                        C3244l c3244l8 = c2850b.f33693r;
                        c3244l8.getClass();
                        c3244l8.m15572j(null, list3);
                        C3244l c3244l9 = c2850b.f33694s;
                        VocabularySearchQuery vocabularySearchQuery3 = (VocabularySearchQuery) c2850b.f33701z.getValue();
                        if (vocabularySearchQuery3 == null || (obj2 = vocabularySearchQuery3.f19865g) == null) {
                            obj2 = EmptyList.f47638a;
                        }
                        c3244l9.getClass();
                        c3244l9.m15572j(null, obj2);
                    }
                }
                break;
            case 3:
                List list4 = (List) obj;
                if (!list4.isEmpty()) {
                    C3244l c3244l10 = c2850b.f33687l;
                    Boolean bool4 = Boolean.FALSE;
                    c3244l10.getClass();
                    c3244l10.m15572j(null, bool4);
                    ArrayList arrayListM22587E1 = u91.m22587E0(list4);
                    ArrayList<wya> arrayList5 = new ArrayList();
                    arrayList5.addAll(arrayListM22587E1);
                    arrayList5.add(0, new wya(-1, "All"));
                    C3244l c3244l11 = c2850b.f33692q;
                    c3244l11.getClass();
                    c3244l11.m15572j(null, arrayList5);
                    C3244l c3244l12 = c2850b.f33689n;
                    ArrayList arrayList6 = new ArrayList(v91.m23189q0(arrayList5, 10));
                    for (wya wyaVar2 : arrayList5) {
                        String str12 = wyaVar2.f67532b;
                        String str13 = str12 == null ? "" : str12;
                        VocabularySearchQuery vocabularySearchQuery4 = (VocabularySearchQuery) c2850b.f33701z.getValue();
                        if (vocabularySearchQuery4 == null || (pair3 = vocabularySearchQuery4.f19868j) == null || (str3 = (String) pair3.f47623a) == null) {
                            str3 = "All";
                        }
                        boolean zM11650l3 = fa4.m11650l(str12, str3);
                        String str14 = wyaVar2.f67532b;
                        arrayList6.add(new fv8(1, null, str13, str14 == null ? "key_all" : str14, zM11650l3));
                    }
                    c3244l12.getClass();
                    c3244l12.m15572j(null, arrayList6);
                }
                break;
            default:
                Language language = (Language) obj;
                if (language != null) {
                    C3244l c3244l13 = c2850b.f33687l;
                    Boolean bool5 = Boolean.FALSE;
                    c3244l13.getClass();
                    c3244l13.m15572j(null, bool5);
                    C3244l c3244l14 = c2850b.f33696u;
                    VocabularySearchQuery vocabularySearchQuery5 = (VocabularySearchQuery) c2850b.f33701z.getValue();
                    if (vocabularySearchQuery5 != null && (str4 = vocabularySearchQuery5.f19864f) != null) {
                        str5 = str4;
                    }
                    c3244l14.getClass();
                    c3244l14.m15572j(null, str5);
                    c2850b.f33697v.m15571i(language.f19042s);
                }
                break;
        }
        return xfaVar;
    }
}
