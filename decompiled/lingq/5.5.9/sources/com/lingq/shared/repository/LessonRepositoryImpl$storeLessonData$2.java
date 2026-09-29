package com.lingq.shared.repository;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import bi.AbstractC1388a;
import bi.AbstractC1454i2;
import bi.AbstractC1495o1;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Card;
import com.lingq.entity.Lesson;
import com.lingq.entity.LessonBookmark;
import com.lingq.entity.Sentence;
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
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.LessonRepositoryImpl$storeLessonData$2", m19206f = "LessonRepository.kt", m19207l = {375, 378, 395, 403, 411, 419, 422, 425, 427, 436}, m19208m = "invokeSuspend")
final class LessonRepositoryImpl$storeLessonData$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Locale f19939e;

    /* JADX INFO: renamed from: f */
    public List f19940f;

    /* JADX INFO: renamed from: g */
    public List f19941g;

    /* JADX INFO: renamed from: h */
    public int f19942h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ResultLesson f19943i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ LessonRepositoryImpl f19944j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f19945k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f19946l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonRepositoryImpl$storeLessonData$2(int i10, ResultLesson resultLesson, LessonRepositoryImpl lessonRepositoryImpl, String str, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19943i = resultLesson;
        this.f19944j = lessonRepositoryImpl;
        this.f19945k = str;
        this.f19946l = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonRepositoryImpl$storeLessonData$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonRepositoryImpl$storeLessonData$2(this.f19946l, this.f19943i, this.f19944j, this.f19945k, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0327 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:105:0x0339  */
    /* JADX WARN: Code duplicated, block: B:108:0x034a  */
    /* JADX WARN: Code duplicated, block: B:113:0x036b  */
    /* JADX WARN: Code duplicated, block: B:114:0x036e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0384  */
    /* JADX WARN: Code duplicated, block: B:122:0x038f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0392  */
    /* JADX WARN: Code duplicated, block: B:128:0x03ab A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:131:0x0371 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:0x0396 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:24:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:27:0x0108  */
    /* JADX WARN: Code duplicated, block: B:29:0x0110  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:32:0x011e  */
    /* JADX WARN: Code duplicated, block: B:38:0x019f  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0205  */
    /* JADX WARN: Code duplicated, block: B:54:0x0208  */
    /* JADX WARN: Code duplicated, block: B:57:0x0218 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x021d  */
    /* JADX WARN: Code duplicated, block: B:69:0x024d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0257  */
    /* JADX WARN: Code duplicated, block: B:73:0x025a  */
    /* JADX WARN: Code duplicated, block: B:76:0x026d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:80:0x0285 A[LOOP:4: B:78:0x027f->B:80:0x0285, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x02ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x02c4 A[LOOP:3: B:85:0x02be->B:87:0x02c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:90:0x02e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:93:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:95:0x0301 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:98:0x0314 A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.support.v4.media.a, bi.x5] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
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
        CoroutineSingletons coroutineSingletons;
        AbstractC1495o1 abstractC1495o2;
        LessonRepositoryImpl lessonRepositoryImpl;
        ResultLesson resultLesson;
        String str;
        int i10;
        String str2;
        List<Sentence> arrayList;
        CoroutineSingletons coroutineSingletons2;
        Iterator it;
        ArrayList arrayList2;
        Iterator it2;
        int i11;
        Object next;
        int i12;
        int i13;
        Locale localeForLanguageTag;
        C10365b c10365b;
        ArrayList arrayList3;
        List list2;
        AbstractC1388a abstractC1388a;
        List<ResultCard> list3;
        C10368e c10368e;
        ?? arrayList4;
        Object objMo599i0;
        List<ResultWord> list4;
        String strM15498b;
        ?? r10;
        ArrayList arrayList5;
        Iterator it3;
        AbstractC1495o1 abstractC1495o3;
        ?? r11;
        ArrayList arrayList6;
        Iterator it4;
        AbstractC1495o1 abstractC1495o4;
        ResultLessonBookmark resultLessonBookmark;
        AbstractC1495o1 abstractC1495o5;
        LessonBookmark lessonBookmarkM16910r;
        AbstractC1454i2 abstractC1454i2;
        Object objMo4982u0;
        ArrayList arrayList7;
        ArrayList arrayList8;
        AbstractC1388a abstractC1388a2;
        boolean z10;
        Card card;
        Iterator it5;
        Object next2;
        boolean z11;
        String str3;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = this.f19942h;
        int i15 = this.f19946l;
        int i16 = 10;
        String str4 = "locale";
        String str5 = this.f19945k;
        ResultLesson resultLesson2 = this.f19943i;
        int i17 = 1;
        LessonRepositoryImpl lessonRepositoryImpl2 = this.f19944j;
        switch (i14) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                Lesson lessonM16902j = C8656b.m16902j(resultLesson2);
                AbstractC1495o1 abstractC1495o6 = lessonRepositoryImpl2.f19828b;
                this.f19942h = 1;
                if (abstractC1495o6.mo598h0(lessonM16902j, this) == coroutineSingletons3) {
                    return coroutineSingletons3;
                }
                ref$IntRef = new Ref$IntRef();
                abstractC1495o1 = lessonRepositoryImpl2.f19828b;
                list = resultLesson2.f18558x;
                if (list != null) {
                    arrayList = new ArrayList<>();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List<ResultSentence> list5 = ((C10364a) it.next()).f52118a;
                        arrayList2 = new ArrayList(C9325m.m17681z(list5, i16));
                        it2 = list5.iterator();
                        i11 = 0;
                        while (it2.hasNext()) {
                            next = it2.next();
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            ResultSentence resultSentence = (ResultSentence) next;
                            int i18 = ref$IntRef.f38125a + i17;
                            ref$IntRef.f38125a = i18;
                            if (i11 == 0) {
                                i13 = i17;
                            } else {
                                i13 = 0;
                            }
                            C5207g.m11111f(resultSentence, "<this>");
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            String str6 = str4;
                            ArrayList arrayList9 = arrayList2;
                            arrayList9.add(new Sentence(i15, resultSentence.f18928a, resultSentence.f18929b, resultSentence.f18930c, i18, resultSentence.f18932e, i13));
                            abstractC1495o1 = abstractC1495o1;
                            lessonRepositoryImpl2 = lessonRepositoryImpl2;
                            arrayList = arrayList;
                            resultLesson2 = resultLesson2;
                            str5 = str5;
                            arrayList2 = arrayList9;
                            i11 = i12;
                            it2 = it2;
                            coroutineSingletons3 = coroutineSingletons3;
                            str4 = str6;
                            i15 = i15;
                            i17 = 1;
                            ref$IntRef = ref$IntRef2;
                        }
                        C9327o.m17684D(arrayList2, arrayList);
                        coroutineSingletons3 = coroutineSingletons3;
                        str4 = str4;
                        i15 = i15;
                        i17 = 1;
                        i16 = 10;
                        ref$IntRef = ref$IntRef;
                    }
                    coroutineSingletons = coroutineSingletons3;
                    abstractC1495o2 = abstractC1495o1;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    resultLesson = resultLesson2;
                    str = str5;
                    i10 = i15;
                    str2 = str4;
                } else {
                    coroutineSingletons = coroutineSingletons3;
                    abstractC1495o2 = abstractC1495o1;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    resultLesson = resultLesson2;
                    str = str5;
                    i10 = i15;
                    str2 = "locale";
                    arrayList = EmptyList.f38032a;
                }
                this.f19942h = 2;
                coroutineSingletons2 = coroutineSingletons;
                if (abstractC1495o2.mo5134G0(arrayList, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                localeForLanguageTag = Locale.forLanguageTag(str);
                c10365b = resultLesson.f18556v;
                if (c10365b != null || (list3 = c10365b.f52119a) == null) {
                    arrayList3 = null;
                } else {
                    arrayList3 = new ArrayList(C9325m.m17681z(list3, 10));
                    for (ResultCard resultCard : list3) {
                        String str7 = resultCard.f18282a;
                        C5207g.m11110e(localeForLanguageTag, str2);
                        arrayList3.add(C5212l.m11173p(resultCard, C7793a.m15498b(str, C7793a.m15502f(str7, localeForLanguageTag)), C5408a.m11573f(resultCard.f18282a)));
                    }
                }
                if (arrayList3 == null) {
                    list2 = EmptyList.f38032a;
                } else {
                    list2 = arrayList3;
                }
                abstractC1388a = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                c10368e = resultLesson.f18557w;
                if (c10368e != null || (list4 = c10368e.f52120a) == null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = new ArrayList(C9325m.m17681z(list4, 10));
                    for (ResultWord resultWord : list4) {
                        String str8 = resultWord.f19116a;
                        if (str8 != null) {
                            C5207g.m11110e(localeForLanguageTag, str2);
                            strM15498b = C7793a.m15498b(str, C7793a.m15502f(str8, localeForLanguageTag));
                            if (strM15498b == null) {
                                strM15498b = "";
                            }
                        } else {
                            strM15498b = "";
                        }
                        arrayList4.add(C0062b.m297P(resultWord, strM15498b));
                    }
                }
                if (arrayList4 == 0) {
                    arrayList4 = EmptyList.f38032a;
                }
                ?? r12 = lessonRepositoryImpl.f19830d;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = arrayList4;
                this.f19942h = 4;
                objMo599i0 = r12.mo599i0(arrayList4, this);
                r10 = arrayList4;
                if (objMo599i0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8799m(((Card) it3.next()).f16855b, i10));
                }
                i15 = i10;
                abstractC1495o3 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = r10;
                this.f19942h = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList5, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a3 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a3.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                for (Object obj2 : (List) objMo4982u0) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                for (Object obj3 : arrayList7) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                ref$IntRef = new Ref$IntRef();
                abstractC1495o1 = lessonRepositoryImpl2.f19828b;
                list = resultLesson2.f18558x;
                if (list != null) {
                    arrayList = new ArrayList<>();
                    it = list.iterator();
                    while (it.hasNext()) {
                        List<ResultSentence> list6 = ((C10364a) it.next()).f52118a;
                        arrayList2 = new ArrayList(C9325m.m17681z(list6, i16));
                        it2 = list6.iterator();
                        i11 = 0;
                        while (it2.hasNext()) {
                            next = it2.next();
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                C9000b.m17257w();
                                throw null;
                            }
                            ResultSentence resultSentence2 = (ResultSentence) next;
                            int i19 = ref$IntRef.f38125a + i17;
                            ref$IntRef.f38125a = i19;
                            if (i11 == 0) {
                                i13 = i17;
                            } else {
                                i13 = 0;
                            }
                            C5207g.m11111f(resultSentence2, "<this>");
                            Ref$IntRef ref$IntRef3 = ref$IntRef;
                            String str9 = str4;
                            ArrayList arrayList10 = arrayList2;
                            arrayList10.add(new Sentence(i15, resultSentence2.f18928a, resultSentence2.f18929b, resultSentence2.f18930c, i19, resultSentence2.f18932e, i13));
                            abstractC1495o1 = abstractC1495o1;
                            lessonRepositoryImpl2 = lessonRepositoryImpl2;
                            arrayList = arrayList;
                            resultLesson2 = resultLesson2;
                            str5 = str5;
                            arrayList2 = arrayList10;
                            i11 = i12;
                            it2 = it2;
                            coroutineSingletons3 = coroutineSingletons3;
                            str4 = str9;
                            i15 = i15;
                            i17 = 1;
                            ref$IntRef = ref$IntRef3;
                        }
                        C9327o.m17684D(arrayList2, arrayList);
                        coroutineSingletons3 = coroutineSingletons3;
                        str4 = str4;
                        i15 = i15;
                        i17 = 1;
                        i16 = 10;
                        ref$IntRef = ref$IntRef;
                    }
                    coroutineSingletons = coroutineSingletons3;
                    abstractC1495o2 = abstractC1495o1;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    resultLesson = resultLesson2;
                    str = str5;
                    i10 = i15;
                    str2 = str4;
                } else {
                    coroutineSingletons = coroutineSingletons3;
                    abstractC1495o2 = abstractC1495o1;
                    lessonRepositoryImpl = lessonRepositoryImpl2;
                    resultLesson = resultLesson2;
                    str = str5;
                    i10 = i15;
                    str2 = "locale";
                    arrayList = EmptyList.f38032a;
                }
                this.f19942h = 2;
                coroutineSingletons2 = coroutineSingletons;
                if (abstractC1495o2.mo5134G0(arrayList, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                localeForLanguageTag = Locale.forLanguageTag(str);
                c10365b = resultLesson.f18556v;
                if (c10365b != null) {
                    arrayList3 = null;
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 == null) {
                    list2 = EmptyList.f38032a;
                } else {
                    list2 = arrayList3;
                }
                abstractC1388a = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = EmptyList.f38032a;
                }
                ?? r13 = lessonRepositoryImpl.f19830d;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = arrayList4;
                this.f19942h = 4;
                objMo599i0 = r13.mo599i0(arrayList4, this);
                r10 = arrayList4;
                if (objMo599i0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8799m(((Card) it3.next()).f16855b, i10));
                }
                i15 = i10;
                abstractC1495o3 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = r10;
                this.f19942h = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList5, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a4 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a4.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 2:
                C7499b.m14977z0(obj);
                coroutineSingletons2 = coroutineSingletons3;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                resultLesson = resultLesson2;
                str = str5;
                i10 = i15;
                str2 = "locale";
                localeForLanguageTag = Locale.forLanguageTag(str);
                c10365b = resultLesson.f18556v;
                if (c10365b != null) {
                    arrayList3 = null;
                } else {
                    arrayList3 = null;
                }
                if (arrayList3 == null) {
                    list2 = EmptyList.f38032a;
                } else {
                    list2 = arrayList3;
                }
                abstractC1388a = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 3;
                if (abstractC1388a.mo599i0(list2, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = EmptyList.f38032a;
                }
                ?? r14 = lessonRepositoryImpl.f19830d;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = arrayList4;
                this.f19942h = 4;
                objMo599i0 = r14.mo599i0(arrayList4, this);
                r10 = arrayList4;
                if (objMo599i0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8799m(((Card) it3.next()).f16855b, i10));
                }
                i15 = i10;
                abstractC1495o3 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = r10;
                this.f19942h = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList5, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a5 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a5.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 3:
                List list7 = this.f19940f;
                Locale locale = this.f19939e;
                C7499b.m14977z0(obj);
                list2 = list7;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                resultLesson = resultLesson2;
                str = str5;
                i10 = i15;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale;
                c10368e = resultLesson.f18557w;
                if (c10368e != null) {
                    arrayList4 = 0;
                } else {
                    arrayList4 = 0;
                }
                if (arrayList4 == 0) {
                    arrayList4 = EmptyList.f38032a;
                }
                ?? r15 = lessonRepositoryImpl.f19830d;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = arrayList4;
                this.f19942h = 4;
                objMo599i0 = r15.mo599i0(arrayList4, this);
                r10 = arrayList4;
                if (objMo599i0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8799m(((Card) it3.next()).f16855b, i10));
                }
                i15 = i10;
                abstractC1495o3 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = r10;
                this.f19942h = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList5, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a6 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a6.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 4:
                List list8 = this.f19941g;
                List list9 = this.f19940f;
                Locale locale2 = this.f19939e;
                C7499b.m14977z0(obj);
                r10 = list8;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                resultLesson = resultLesson2;
                i10 = i15;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale2;
                list2 = list9;
                arrayList5 = new ArrayList(C9325m.m17681z(list2, 10));
                it3 = list2.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(new C8799m(((Card) it3.next()).f16855b, i10));
                }
                i15 = i10;
                abstractC1495o3 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = r10;
                this.f19942h = 5;
                r11 = r10;
                if (abstractC1495o3.mo5136I0(arrayList5, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a7 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a7.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 5:
                List list10 = this.f19941g;
                List list11 = this.f19940f;
                Locale locale3 = this.f19939e;
                C7499b.m14977z0(obj);
                r11 = list10;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                resultLesson = resultLesson2;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale3;
                list2 = list11;
                arrayList6 = new ArrayList(C9325m.m17681z(r11, 10));
                it4 = r11.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(new C8800n(((Word) it4.next()).f17576a, i15));
                }
                abstractC1495o4 = lessonRepositoryImpl.f19828b;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19941g = null;
                this.f19942h = 6;
                if (abstractC1495o4.mo5138K0(arrayList6, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a8 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a8.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                List list12 = this.f19940f;
                Locale locale4 = this.f19939e;
                C7499b.m14977z0(obj);
                list2 = list12;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                resultLesson = resultLesson2;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale4;
                resultLessonBookmark = resultLesson.f18559y;
                if (resultLessonBookmark != null) {
                    abstractC1495o5 = lessonRepositoryImpl.f19828b;
                    lessonBookmarkM16910r = C8656b.m16910r(resultLessonBookmark, i15);
                    this.f19939e = localeForLanguageTag;
                    this.f19940f = list2;
                    this.f19942h = 7;
                    if (abstractC1495o5.mo5131D0(lessonBookmarkM16910r, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                }
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a9 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a9.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                List list13 = this.f19940f;
                Locale locale5 = this.f19939e;
                C7499b.m14977z0(obj);
                list2 = list13;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale5;
                abstractC1454i2 = lessonRepositoryImpl.f19831e;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 8;
                if (abstractC1454i2.mo5067R0(i15, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                AbstractC1388a abstractC1388a10 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a10.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 8:
                List list14 = this.f19940f;
                Locale locale6 = this.f19939e;
                C7499b.m14977z0(obj);
                list2 = list14;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale6;
                AbstractC1388a abstractC1388a11 = lessonRepositoryImpl.f19829c;
                this.f19939e = localeForLanguageTag;
                this.f19940f = list2;
                this.f19942h = 9;
                objMo4982u0 = abstractC1388a11.mo4982u0(i15, this);
                if (objMo4982u0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 9:
                List list15 = this.f19940f;
                Locale locale7 = this.f19939e;
                C7499b.m14977z0(obj);
                objMo4982u0 = obj;
                list2 = list15;
                lessonRepositoryImpl = lessonRepositoryImpl2;
                str2 = "locale";
                coroutineSingletons2 = coroutineSingletons3;
                localeForLanguageTag = locale7;
                arrayList7 = new ArrayList();
                while (r5.hasNext()) {
                    card = (Card) obj2;
                    it5 = list2.iterator();
                    do {
                        if (it5.hasNext()) {
                            next2 = it5.next();
                            str3 = ((Card) next2).f16854a;
                            C5207g.m11110e(localeForLanguageTag, str2);
                        } else {
                            next2 = null;
                        }
                        if (next2 == null) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            arrayList7.add(obj2);
                        }
                    } while (!C5207g.m11106a(C7793a.m15502f(str3, localeForLanguageTag), C7793a.m15502f(card.f16854a, localeForLanguageTag)));
                    if (next2 == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        arrayList7.add(obj2);
                    }
                }
                arrayList8 = new ArrayList();
                while (r4.hasNext()) {
                    if (((Card) obj3).f16856c != 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        arrayList8.add(obj3);
                    }
                }
                abstractC1388a2 = lessonRepositoryImpl.f19829c;
                this.f19939e = null;
                this.f19940f = null;
                this.f19942h = 10;
                if (abstractC1388a2.mo604s(arrayList8, this) == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                return C9072e.f47360a;
            case 10:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
