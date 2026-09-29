package com.lingq.shared.repository;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import bi.AbstractC1388a;
import bi.AbstractC1495o1;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Card;
import com.lingq.entity.Lesson;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.Sentence;
import com.lingq.entity.TextToken;
import com.lingq.entity.Word;
import com.lingq.shared.network.result.ResultCard;
import com.lingq.shared.network.result.ResultLesson;
import com.lingq.shared.network.result.ResultLessonBookmark;
import com.lingq.shared.network.result.ResultSentence;
import com.lingq.shared.network.result.ResultWord;
import dm.C5207g;
import dm.C5212l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import ni.C7793a;
import p096ei.C5408a;
import p260m8.C7499b;
import p349qo.C8656b;
import p367rh.C8799m;
import p367rh.C8800n;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p511yh.C10364a;
import p511yh.C10365b;
import p511yh.C10368e;
import sl.C9072e;
import tl.C9325m;
import tl.C9327o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.SearchRepositoryImpl$networkLoadLesson$2", m19206f = "SearchRepository.kt", m19207l = {145, 148, 165, 172, 180, 188, 191}, m19208m = "invokeSuspend")
final class SearchRepositoryImpl$networkLoadLesson$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Object f20527e;

    /* JADX INFO: renamed from: f */
    public Object f20528f;

    /* JADX INFO: renamed from: g */
    public int f20529g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ResultLesson f20530h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SearchRepositoryImpl f20531i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f20532j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f20533k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchRepositoryImpl$networkLoadLesson$2(ResultLesson resultLesson, SearchRepositoryImpl searchRepositoryImpl, String str, int i10, InterfaceC9968c<? super SearchRepositoryImpl$networkLoadLesson$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f20530h = resultLesson;
        this.f20531i = searchRepositoryImpl;
        this.f20532j = str;
        this.f20533k = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SearchRepositoryImpl$networkLoadLesson$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new SearchRepositoryImpl$networkLoadLesson$2(this.f20530h, this.f20531i, this.f20532j, this.f20533k, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    /* JADX WARN: Code duplicated, block: B:21:0x009c  */
    /* JADX WARN: Code duplicated, block: B:24:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:35:0x0147  */
    /* JADX WARN: Code duplicated, block: B:38:0x015b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:57:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:68:0x0202  */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:73:0x0216 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:77:0x022e A[LOOP:1: B:75:0x0228->B:77:0x022e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0254 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:84:0x026a A[LOOP:0: B:82:0x0264->B:84:0x026a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x028a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:90:0x028f  */
    /* JADX WARN: Code duplicated, block: B:92:0x029e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x02a2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [android.support.v4.media.a, bi.x5] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Ref$IntRef ref$IntRef;
        AbstractC1495o1 abstractC1495o1;
        List<C10364a> list;
        AbstractC1495o1 abstractC1495o2;
        SearchRepositoryImpl searchRepositoryImpl;
        ResultLesson resultLesson;
        int i10;
        String str;
        List<Sentence> arrayList;
        Iterator it;
        ArrayList arrayList2;
        int i11;
        int i12;
        int i13;
        Locale localeForLanguageTag;
        C10365b c10365b;
        List list2;
        SearchRepositoryImpl searchRepositoryImpl2;
        AbstractC1388a abstractC1388a;
        Locale locale;
        List list3;
        List<ResultCard> list4;
        C10368e c10368e;
        ?? arrayList3;
        Object objMo599i0;
        List<ResultWord> list5;
        String strM15498b;
        ?? r10;
        List list6;
        ArrayList arrayList4;
        Iterator it2;
        int i14;
        AbstractC1495o1 abstractC1495o3;
        ?? r11;
        ArrayList arrayList5;
        Iterator it3;
        AbstractC1495o1 abstractC1495o4;
        Object obj2;
        ResultLessonBookmark resultLessonBookmark;
        AbstractC1495o1 abstractC1495o5;
        LessonBookmark lessonBookmarkM16910r;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i15 = this.f20529g;
        int i16 = this.f20533k;
        int i17 = 10;
        String str2 = "locale";
        String str3 = this.f20532j;
        int i18 = 1;
        ResultLesson resultLesson2 = this.f20530h;
        SearchRepositoryImpl searchRepositoryImpl3 = this.f20531i;
        switch (i15) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                Lesson lessonM16902j = C8656b.m16902j(resultLesson2);
                AbstractC1495o1 abstractC1495o6 = searchRepositoryImpl3.f20480c;
                this.f20529g = 1;
                if (abstractC1495o6.mo598h0(lessonM16902j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$IntRef = new Ref$IntRef();
                abstractC1495o1 = searchRepositoryImpl3.f20480c;
                list = resultLesson2.f18558x;
                if (list != null) {
                    arrayList = new ArrayList<>();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List<ResultSentence> list7 = ((C10364a) it.next()).f52118a;
                        arrayList2 = new ArrayList(C9325m.m17681z(list7, i17));
                        i11 = 0;
                        for (Object obj3 : list7) {
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            ResultSentence resultSentence = (ResultSentence) obj3;
                            int i19 = ref$IntRef.f38125a + i18;
                            ref$IntRef.f38125a = i19;
                            if (i11 == 0) {
                                i13 = i18;
                            } else {
                                i13 = 0;
                            }
                            C5207g.m11111f(resultSentence, "<this>");
                            List<TextToken> list8 = resultSentence.f18928a;
                            String str4 = resultSentence.f18929b;
                            String str5 = resultSentence.f18930c;
                            List<Float> list9 = resultSentence.f18932e;
                            int i20 = i16;
                            int i21 = i16;
                            ArrayList arrayList6 = arrayList2;
                            arrayList6.add(new Sentence(i20, list8, str4, str5, i19, list9, i13));
                            ref$IntRef = ref$IntRef;
                            arrayList2 = arrayList6;
                            resultLesson2 = resultLesson2;
                            abstractC1495o1 = abstractC1495o1;
                            arrayList = arrayList;
                            i11 = i12;
                            i18 = 1;
                            str2 = str2;
                            searchRepositoryImpl3 = searchRepositoryImpl3;
                            i16 = i21;
                        }
                        C9327o.m17684D(arrayList2, arrayList);
                        str2 = str2;
                        i16 = i16;
                        i17 = 10;
                    }
                    abstractC1495o2 = abstractC1495o1;
                    searchRepositoryImpl = searchRepositoryImpl3;
                    resultLesson = resultLesson2;
                    i10 = i16;
                    str = str2;
                } else {
                    abstractC1495o2 = abstractC1495o1;
                    searchRepositoryImpl = searchRepositoryImpl3;
                    resultLesson = resultLesson2;
                    i10 = i16;
                    str = "locale";
                    arrayList = EmptyList.f38032a;
                }
                this.f20529g = 2;
                if (abstractC1495o2.mo5134G0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                localeForLanguageTag = Locale.forLanguageTag(str3);
                c10365b = resultLesson.f18556v;
                if (c10365b != null || (list4 = c10365b.f52119a) == null) {
                    list2 = null;
                } else {
                    ArrayList arrayList7 = new ArrayList(C9325m.m17681z(list4, 10));
                    for (ResultCard resultCard : list4) {
                        String str6 = resultCard.f18282a;
                        C5207g.m11110e(localeForLanguageTag, str);
                        arrayList7.add(C5212l.m11173p(resultCard, C7793a.m15498b(str3, C7793a.m15502f(str6, localeForLanguageTag)), C5408a.m11573f(resultCard.f18282a)));
                    }
                    list2 = arrayList7;
                }
                if (list2 == null) {
                    list2 = EmptyList.f38032a;
                }
                searchRepositoryImpl2 = searchRepositoryImpl;
                abstractC1388a = searchRepositoryImpl2.f20481d;
                this.f20527e = localeForLanguageTag;
                this.f20528f = list2;
                this.f20529g = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                List list10 = list2;
                locale = localeForLanguageTag;
                list3 = list10;
                c10368e = resultLesson.f18557w;
                if (c10368e != null || (list5 = c10368e.f52120a) == null) {
                    arrayList3 = 0;
                } else {
                    arrayList3 = new ArrayList(C9325m.m17681z(list5, 10));
                    for (ResultWord resultWord : list5) {
                        String str7 = resultWord.f19116a;
                        if (str7 != null) {
                            C5207g.m11110e(locale, str);
                            strM15498b = C7793a.m15498b(str3, C7793a.m15502f(str7, locale));
                            if (strM15498b == null) {
                                strM15498b = "";
                            }
                        } else {
                            strM15498b = "";
                        }
                        arrayList3.add(C0062b.m297P(resultWord, strM15498b));
                    }
                }
                if (arrayList3 == 0) {
                    arrayList3 = EmptyList.f38032a;
                }
                ?? r12 = searchRepositoryImpl2.f20482e;
                this.f20527e = list3;
                this.f20528f = arrayList3;
                this.f20529g = 4;
                objMo599i0 = r12.mo599i0(arrayList3, this);
                list6 = list3;
                r10 = arrayList3;
                if (objMo599i0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C8799m(((Card) it2.next()).f16855b, i10));
                }
                i14 = i10;
                abstractC1495o3 = searchRepositoryImpl2.f20480c;
                this.f20527e = r10;
                this.f20528f = null;
                this.f20529g = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                ref$IntRef = new Ref$IntRef();
                abstractC1495o1 = searchRepositoryImpl3.f20480c;
                list = resultLesson2.f18558x;
                if (list != null) {
                    arrayList = new ArrayList<>();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List<ResultSentence> list11 = ((C10364a) it.next()).f52118a;
                        arrayList2 = new ArrayList(C9325m.m17681z(list11, i17));
                        i11 = 0;
                        while (r17.hasNext()) {
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            ResultSentence resultSentence2 = (ResultSentence) obj3;
                            int i110 = ref$IntRef.f38125a + i18;
                            ref$IntRef.f38125a = i110;
                            if (i11 == 0) {
                                i13 = i18;
                            } else {
                                i13 = 0;
                            }
                            C5207g.m11111f(resultSentence2, "<this>");
                            List<TextToken> list12 = resultSentence2.f18928a;
                            String str8 = resultSentence2.f18929b;
                            String str9 = resultSentence2.f18930c;
                            List<Float> list13 = resultSentence2.f18932e;
                            int i22 = i16;
                            int i23 = i16;
                            ArrayList arrayList8 = arrayList2;
                            arrayList8.add(new Sentence(i22, list12, str8, str9, i110, list13, i13));
                            ref$IntRef = ref$IntRef;
                            arrayList2 = arrayList8;
                            resultLesson2 = resultLesson2;
                            abstractC1495o1 = abstractC1495o1;
                            arrayList = arrayList;
                            i11 = i12;
                            i18 = 1;
                            str2 = str2;
                            searchRepositoryImpl3 = searchRepositoryImpl3;
                            i16 = i23;
                        }
                        C9327o.m17684D(arrayList2, arrayList);
                        str2 = str2;
                        i16 = i16;
                        i17 = 10;
                    }
                    abstractC1495o2 = abstractC1495o1;
                    searchRepositoryImpl = searchRepositoryImpl3;
                    resultLesson = resultLesson2;
                    i10 = i16;
                    str = str2;
                } else {
                    abstractC1495o2 = abstractC1495o1;
                    searchRepositoryImpl = searchRepositoryImpl3;
                    resultLesson = resultLesson2;
                    i10 = i16;
                    str = "locale";
                    arrayList = EmptyList.f38032a;
                }
                this.f20529g = 2;
                if (abstractC1495o2.mo5134G0(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                localeForLanguageTag = Locale.forLanguageTag(str3);
                c10365b = resultLesson.f18556v;
                if (c10365b != null) {
                    list2 = null;
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.f38032a;
                }
                searchRepositoryImpl2 = searchRepositoryImpl;
                abstractC1388a = searchRepositoryImpl2.f20481d;
                this.f20527e = localeForLanguageTag;
                this.f20528f = list2;
                this.f20529g = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                List list14 = list2;
                locale = localeForLanguageTag;
                list3 = list14;
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList3 = 0;
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = EmptyList.f38032a;
                }
                ?? r13 = searchRepositoryImpl2.f20482e;
                this.f20527e = list3;
                this.f20528f = arrayList3;
                this.f20529g = 4;
                objMo599i0 = r13.mo599i0(arrayList3, this);
                list6 = list3;
                r10 = arrayList3;
                if (objMo599i0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C8799m(((Card) it2.next()).f16855b, i10));
                }
                i14 = i10;
                abstractC1495o3 = searchRepositoryImpl2.f20480c;
                this.f20527e = r10;
                this.f20528f = null;
                this.f20529g = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 2:
                C7499b.m14977z0(obj);
                searchRepositoryImpl = searchRepositoryImpl3;
                resultLesson = resultLesson2;
                i10 = i16;
                str = "locale";
                localeForLanguageTag = Locale.forLanguageTag(str3);
                c10365b = resultLesson.f18556v;
                if (c10365b != null) {
                    list2 = null;
                } else {
                    list2 = null;
                }
                if (list2 == null) {
                    list2 = EmptyList.f38032a;
                }
                searchRepositoryImpl2 = searchRepositoryImpl;
                abstractC1388a = searchRepositoryImpl2.f20481d;
                this.f20527e = localeForLanguageTag;
                this.f20528f = list2;
                this.f20529g = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                List list15 = list2;
                locale = localeForLanguageTag;
                list3 = list15;
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList3 = 0;
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = EmptyList.f38032a;
                }
                ?? r14 = searchRepositoryImpl2.f20482e;
                this.f20527e = list3;
                this.f20528f = arrayList3;
                this.f20529g = 4;
                objMo599i0 = r14.mo599i0(arrayList3, this);
                list6 = list3;
                r10 = arrayList3;
                if (objMo599i0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C8799m(((Card) it2.next()).f16855b, i10));
                }
                i14 = i10;
                abstractC1495o3 = searchRepositoryImpl2.f20480c;
                this.f20527e = r10;
                this.f20528f = null;
                this.f20529g = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 3:
                List list16 = (List) this.f20528f;
                Locale locale2 = (Locale) this.f20527e;
                C7499b.m14977z0(obj);
                locale = locale2;
                resultLesson = resultLesson2;
                i10 = i16;
                str = "locale";
                list3 = list16;
                searchRepositoryImpl2 = searchRepositoryImpl3;
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList3 = 0;
                } else {
                    arrayList3 = 0;
                }
                if (arrayList3 == 0) {
                    arrayList3 = EmptyList.f38032a;
                }
                ?? r15 = searchRepositoryImpl2.f20482e;
                this.f20527e = list3;
                this.f20528f = arrayList3;
                this.f20529g = 4;
                objMo599i0 = r15.mo599i0(arrayList3, this);
                list6 = list3;
                r10 = arrayList3;
                if (objMo599i0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C8799m(((Card) it2.next()).f16855b, i10));
                }
                i14 = i10;
                abstractC1495o3 = searchRepositoryImpl2.f20480c;
                this.f20527e = r10;
                this.f20528f = null;
                this.f20529g = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 4:
                List list17 = (List) this.f20528f;
                List list18 = (List) this.f20527e;
                C7499b.m14977z0(obj);
                r10 = list17;
                searchRepositoryImpl2 = searchRepositoryImpl3;
                resultLesson = resultLesson2;
                i10 = i16;
                list6 = list18;
                arrayList4 = new ArrayList(C9325m.m17681z(list6, 10));
                it2 = list6.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C8799m(((Card) it2.next()).f16855b, i10));
                }
                i14 = i10;
                abstractC1495o3 = searchRepositoryImpl2.f20480c;
                this.f20527e = r10;
                this.f20528f = null;
                this.f20529g = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList4, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 5:
                List list19 = (List) this.f20527e;
                C7499b.m14977z0(obj);
                r11 = list19;
                searchRepositoryImpl2 = searchRepositoryImpl3;
                resultLesson = resultLesson2;
                i14 = i16;
                arrayList5 = new ArrayList(C9325m.m17681z(r11, 10));
                it3 = r11.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8800n(((Word) it3.next()).f17576a, i14));
                }
                abstractC1495o4 = searchRepositoryImpl2.f20480c;
                obj2 = null;
                this.f20527e = null;
                this.f20529g = 6;
                if (abstractC1495o4.mo5138K0(arrayList5, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7499b.m14977z0(obj);
                searchRepositoryImpl2 = searchRepositoryImpl3;
                resultLesson = resultLesson2;
                i14 = i16;
                obj2 = null;
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark == null) {
                    return obj2;
                }
                abstractC1495o5 = searchRepositoryImpl2.f20480c;
                lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i14);
                this.f20529g = 7;
                if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
