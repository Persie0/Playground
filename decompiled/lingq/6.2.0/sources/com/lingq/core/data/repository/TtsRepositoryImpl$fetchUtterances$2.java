package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.domain.model.token.C1487c;
import com.lingq.core.domain.model.token.TextToSpeechAppVoice;
import com.lingq.core.domain.model.token.TextToSpeechTokenUtterance;
import com.lingq.core.network.api.result.AbstractC1737t4;
import com.lingq.core.network.api.result.ResultTtsUtterance;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cda;
import p000.cl9;
import p000.e83;
import p000.fa4;
import p000.r3a;
import p000.u91;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.xfa;
import p000.zca;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.TtsRepositoryImpl$fetchUtterances$2", m4291f = "TtsRepositoryImpl.kt", m4292l = {323, 336, 350, 357, 362, 361}, m4293m = "invokeSuspend", m4294v = 2)
final class TtsRepositoryImpl$fetchUtterances$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Locale f16242a;

    /* JADX INFO: renamed from: b */
    public List f16243b;

    /* JADX INFO: renamed from: c */
    public Set f16244c;

    /* JADX INFO: renamed from: d */
    public e83 f16245d;

    /* JADX INFO: renamed from: e */
    public int f16246e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f16247f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f16248g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1307w f16249h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Set f16250i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TextToSpeechAppVoice f16251j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchUtterances$2(String str, C1307w c1307w, Set set, TextToSpeechAppVoice textToSpeechAppVoice, Continuation continuation) {
        super(2, continuation);
        this.f16248g = str;
        this.f16249h = c1307w;
        this.f16250i = set;
        this.f16251j = textToSpeechAppVoice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TtsRepositoryImpl$fetchUtterances$2 ttsRepositoryImpl$fetchUtterances$2 = new TtsRepositoryImpl$fetchUtterances$2(this.f16248g, this.f16249h, this.f16250i, this.f16251j, continuation);
        ttsRepositoryImpl$fetchUtterances$2.f16247f = obj;
        return ttsRepositoryImpl$fetchUtterances$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TtsRepositoryImpl$fetchUtterances$2) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x0103  */
    /* JADX WARN: Code duplicated, block: B:34:0x0127 A[LOOP:3: B:29:0x00fd->B:34:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0134  */
    /* JADX WARN: Code duplicated, block: B:42:0x0153 A[LOOP:4: B:40:0x014d->B:42:0x0153, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x015d  */
    /* JADX WARN: Code duplicated, block: B:46:0x016f  */
    /* JADX WARN: Code duplicated, block: B:49:0x018f  */
    /* JADX WARN: Code duplicated, block: B:53:0x01a9 A[LOOP:1: B:51:0x01a3->B:53:0x01a9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:64:0x0205 A[LOOP:0: B:62:0x01ff->B:64:0x0205, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x0230 A[PHI: r0 r3 r9
      0x0230: PHI (r0v30 java.lang.Object) = (r0v27 java.lang.Object), (r0v36 java.lang.Object) binds: [B:66:0x022d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r3v24 ??) = (r3v20 ??), (r3v25 ??) binds: [B:66:0x022d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
      0x0230: PHI (r9v2 e83) = (r9v1 e83), (r9v3 e83) binds: [B:66:0x022d, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0244 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x012c A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24, types: [e83, java.lang.Object, java.util.List, java.util.Locale, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v25 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Locale localeForLanguageTag;
        Object objM25553y0;
        List list;
        Locale locale;
        List list2;
        Set arrayList;
        Set<String> setM22627s1;
        Object objM4550c;
        Locale locale2;
        ArrayList arrayList2;
        Iterator it;
        Iterator it2;
        Object next;
        String str;
        Iterator it3;
        List list3;
        Iterator it4;
        Object next2;
        String str2;
        ArrayList arrayList3;
        Object objM2861d;
        Set<String> set;
        ArrayList arrayList4;
        ?? r3;
        Object objM25553y1;
        TextToSpeechAppVoice textToSpeechAppVoice = this.f16251j;
        String str3 = textToSpeechAppVoice.f19563a;
        String str4 = textToSpeechAppVoice.f19564b;
        C1307w c1307w = this.f16249h;
        zca zcaVar = c1307w.f16564b;
        e83 e83Var = (e83) this.f16247f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f16246e;
        xfa xfaVar = xfa.f68157a;
        Set set2 = this.f16250i;
        String str5 = this.f16248g;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                localeForLanguageTag = Locale.forLanguageTag(str5);
                Set<String> set3 = set2;
                ArrayList arrayList5 = new ArrayList(v91.m23189q0(set3, 10));
                for (String str6 : set3) {
                    C1487c c1487c = TextToSpeechTokenUtterance.Companion;
                    localeForLanguageTag.getClass();
                    c1487c.getClass();
                    arrayList5.add(C1487c.m8136a(localeForLanguageTag, str5, str6, str4, str3));
                }
                this.f16247f = e83Var;
                this.f16242a = localeForLanguageTag;
                this.f16246e = 1;
                objM25553y0 = zcaVar.m25553y0(arrayList5, this);
                if (objM25553y0 != coroutineSingletons) {
                    list = (List) objM25553y0;
                    this.f16247f = e83Var;
                    this.f16242a = localeForLanguageTag;
                    this.f16243b = list;
                    this.f16246e = 2;
                    if (e83Var.emit(list, this) != coroutineSingletons) {
                        locale = localeForLanguageTag;
                        list2 = list;
                        if (list2.isEmpty()) {
                            arrayList = set2;
                        } else {
                            arrayList2 = new ArrayList();
                            it = set2.iterator();
                            while (it.hasNext()) {
                                next = it.next();
                                str = (String) next;
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next2 = it3.next();
                                        list3 = list2;
                                        str2 = ((TextToSpeechTokenUtterance) next2).f19568d;
                                        locale.getClass();
                                        it4 = it;
                                        if (!fa4.m11650l(str2, vk9.m23376L0(vz1.m23610P(str, locale)).toString())) {
                                            list2 = list3;
                                            it = it4;
                                        }
                                    } else {
                                        list3 = list2;
                                        it4 = it;
                                        next2 = null;
                                    }
                                }
                                if (next2 == null) {
                                    arrayList2.add(next);
                                }
                                list2 = list3;
                                it = it4;
                            }
                            arrayList = new ArrayList(v91.m23189q0(arrayList2, 10));
                            it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                arrayList.add((String) it2.next());
                            }
                        }
                        setM22627s1 = u91.m22627s1((Iterable) arrayList);
                        if (!setM22627s1.isEmpty()) {
                            cda cdaVar = c1307w.f16565c;
                            String str7 = textToSpeechAppVoice.f19564b;
                            String str8 = textToSpeechAppVoice.f19563a;
                            this.f16247f = e83Var;
                            this.f16242a = locale;
                            this.f16243b = null;
                            this.f16244c = setM22627s1;
                            this.f16246e = 3;
                            objM4550c = cdaVar.m4550c(this.f16248g, str7, str8, setM22627s1, this);
                            if (objM4550c != coroutineSingletons) {
                                locale2 = locale;
                                List<ResultTtsUtterance> list4 = (List) objM4550c;
                                arrayList3 = new ArrayList(v91.m23189q0(list4, 10));
                                for (ResultTtsUtterance resultTtsUtterance : list4) {
                                    locale2.getClass();
                                    arrayList3.add(AbstractC1737t4.m8407a(resultTtsUtterance, locale2, cl9.m4839V(resultTtsUtterance.f21627b.f21648c, "|", ""), str5));
                                }
                                this.f16247f = e83Var;
                                this.f16242a = locale2;
                                this.f16243b = null;
                                this.f16244c = setM22627s1;
                                this.f16246e = 4;
                                objM2861d = AbstractC0758a.m2861d(new r3a(8, zcaVar, arrayList3), zcaVar.f71369K, this, false, true);
                                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                    objM2861d = xfaVar;
                                }
                                if (objM2861d != coroutineSingletons) {
                                    set = setM22627s1;
                                    Set<String> set4 = set;
                                    arrayList4 = new ArrayList(v91.m23189q0(set4, 10));
                                    for (String str9 : set4) {
                                        C1487c c1487c2 = TextToSpeechTokenUtterance.Companion;
                                        locale2.getClass();
                                        c1487c2.getClass();
                                        arrayList4.add(C1487c.m8136a(locale2, str5, str9, str4, str3));
                                    }
                                    r3 = 0;
                                    this.f16247f = null;
                                    this.f16242a = null;
                                    this.f16243b = null;
                                    this.f16244c = null;
                                    this.f16245d = e83Var;
                                    this.f16246e = 5;
                                    objM25553y1 = zcaVar.m25553y0(arrayList4, this);
                                    if (objM25553y1 != coroutineSingletons) {
                                        this.f16247f = r3;
                                        this.f16242a = r3;
                                        this.f16243b = r3;
                                        this.f16244c = r3;
                                        this.f16245d = r3;
                                        this.f16246e = 6;
                                        if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 1:
                localeForLanguageTag = this.f16242a;
                AbstractC3193b.m15359b(obj);
                objM25553y0 = obj;
                list = (List) objM25553y0;
                this.f16247f = e83Var;
                this.f16242a = localeForLanguageTag;
                this.f16243b = list;
                this.f16246e = 2;
                if (e83Var.emit(list, this) != coroutineSingletons) {
                    locale = localeForLanguageTag;
                    list2 = list;
                    if (list2.isEmpty()) {
                        arrayList2 = new ArrayList();
                        it = set2.iterator();
                        while (it.hasNext()) {
                            next = it.next();
                            str = (String) next;
                            it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    next2 = it3.next();
                                    list3 = list2;
                                    str2 = ((TextToSpeechTokenUtterance) next2).f19568d;
                                    locale.getClass();
                                    it4 = it;
                                    if (!fa4.m11650l(str2, vk9.m23376L0(vz1.m23610P(str, locale)).toString())) {
                                        list2 = list3;
                                        it = it4;
                                    }
                                } else {
                                    list3 = list2;
                                    it4 = it;
                                    next2 = null;
                                }
                            }
                            if (next2 == null) {
                                arrayList2.add(next);
                            }
                            list2 = list3;
                            it = it4;
                        }
                        arrayList = new ArrayList(v91.m23189q0(arrayList2, 10));
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add((String) it2.next());
                        }
                    } else {
                        arrayList = set2;
                    }
                    setM22627s1 = u91.m22627s1((Iterable) arrayList);
                    if (!setM22627s1.isEmpty()) {
                        cda cdaVar2 = c1307w.f16565c;
                        String str10 = textToSpeechAppVoice.f19564b;
                        String str11 = textToSpeechAppVoice.f19563a;
                        this.f16247f = e83Var;
                        this.f16242a = locale;
                        this.f16243b = null;
                        this.f16244c = setM22627s1;
                        this.f16246e = 3;
                        objM4550c = cdaVar2.m4550c(this.f16248g, str10, str11, setM22627s1, this);
                        if (objM4550c != coroutineSingletons) {
                            locale2 = locale;
                            List<ResultTtsUtterance> list5 = (List) objM4550c;
                            arrayList3 = new ArrayList(v91.m23189q0(list5, 10));
                            while (r0.hasNext()) {
                                locale2.getClass();
                                arrayList3.add(AbstractC1737t4.m8407a(resultTtsUtterance, locale2, cl9.m4839V(resultTtsUtterance.f21627b.f21648c, "|", ""), str5));
                            }
                            this.f16247f = e83Var;
                            this.f16242a = locale2;
                            this.f16243b = null;
                            this.f16244c = setM22627s1;
                            this.f16246e = 4;
                            objM2861d = AbstractC0758a.m2861d(new r3a(8, zcaVar, arrayList3), zcaVar.f71369K, this, false, true);
                            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                objM2861d = xfaVar;
                            }
                            if (objM2861d != coroutineSingletons) {
                                set = setM22627s1;
                                Set<String> set5 = set;
                                arrayList4 = new ArrayList(v91.m23189q0(set5, 10));
                                while (r0.hasNext()) {
                                    C1487c c1487c3 = TextToSpeechTokenUtterance.Companion;
                                    locale2.getClass();
                                    c1487c3.getClass();
                                    arrayList4.add(C1487c.m8136a(locale2, str5, str9, str4, str3));
                                }
                                r3 = 0;
                                this.f16247f = null;
                                this.f16242a = null;
                                this.f16243b = null;
                                this.f16244c = null;
                                this.f16245d = e83Var;
                                this.f16246e = 5;
                                objM25553y1 = zcaVar.m25553y0(arrayList4, this);
                                if (objM25553y1 != coroutineSingletons) {
                                    this.f16247f = r3;
                                    this.f16242a = r3;
                                    this.f16243b = r3;
                                    this.f16244c = r3;
                                    this.f16245d = r3;
                                    this.f16246e = 6;
                                    if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                                    }
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 2:
                list2 = this.f16243b;
                Locale locale3 = this.f16242a;
                AbstractC3193b.m15359b(obj);
                locale = locale3;
                if (list2.isEmpty()) {
                    arrayList2 = new ArrayList();
                    it = set2.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        str = (String) next;
                        it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                list3 = list2;
                                str2 = ((TextToSpeechTokenUtterance) next2).f19568d;
                                locale.getClass();
                                it4 = it;
                                if (!fa4.m11650l(str2, vk9.m23376L0(vz1.m23610P(str, locale)).toString())) {
                                    list2 = list3;
                                    it = it4;
                                }
                            } else {
                                list3 = list2;
                                it4 = it;
                                next2 = null;
                            }
                        }
                        if (next2 == null) {
                            arrayList2.add(next);
                        }
                        list2 = list3;
                        it = it4;
                    }
                    arrayList = new ArrayList(v91.m23189q0(arrayList2, 10));
                    it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add((String) it2.next());
                    }
                } else {
                    arrayList = set2;
                }
                setM22627s1 = u91.m22627s1((Iterable) arrayList);
                if (!setM22627s1.isEmpty()) {
                    cda cdaVar3 = c1307w.f16565c;
                    String str12 = textToSpeechAppVoice.f19564b;
                    String str13 = textToSpeechAppVoice.f19563a;
                    this.f16247f = e83Var;
                    this.f16242a = locale;
                    this.f16243b = null;
                    this.f16244c = setM22627s1;
                    this.f16246e = 3;
                    objM4550c = cdaVar3.m4550c(this.f16248g, str12, str13, setM22627s1, this);
                    if (objM4550c != coroutineSingletons) {
                        locale2 = locale;
                        List<ResultTtsUtterance> list6 = (List) objM4550c;
                        arrayList3 = new ArrayList(v91.m23189q0(list6, 10));
                        while (r0.hasNext()) {
                            locale2.getClass();
                            arrayList3.add(AbstractC1737t4.m8407a(resultTtsUtterance, locale2, cl9.m4839V(resultTtsUtterance.f21627b.f21648c, "|", ""), str5));
                        }
                        this.f16247f = e83Var;
                        this.f16242a = locale2;
                        this.f16243b = null;
                        this.f16244c = setM22627s1;
                        this.f16246e = 4;
                        objM2861d = AbstractC0758a.m2861d(new r3a(8, zcaVar, arrayList3), zcaVar.f71369K, this, false, true);
                        if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            objM2861d = xfaVar;
                        }
                        if (objM2861d != coroutineSingletons) {
                            set = setM22627s1;
                            Set<String> set6 = set;
                            arrayList4 = new ArrayList(v91.m23189q0(set6, 10));
                            while (r0.hasNext()) {
                                C1487c c1487c4 = TextToSpeechTokenUtterance.Companion;
                                locale2.getClass();
                                c1487c4.getClass();
                                arrayList4.add(C1487c.m8136a(locale2, str5, str9, str4, str3));
                            }
                            r3 = 0;
                            this.f16247f = null;
                            this.f16242a = null;
                            this.f16243b = null;
                            this.f16244c = null;
                            this.f16245d = e83Var;
                            this.f16246e = 5;
                            objM25553y1 = zcaVar.m25553y0(arrayList4, this);
                            if (objM25553y1 != coroutineSingletons) {
                                this.f16247f = r3;
                                this.f16242a = r3;
                                this.f16243b = r3;
                                this.f16244c = r3;
                                this.f16245d = r3;
                                this.f16246e = 6;
                                if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 3:
                Set<String> set7 = this.f16244c;
                List list7 = this.f16243b;
                locale2 = this.f16242a;
                AbstractC3193b.m15359b(obj);
                setM22627s1 = set7;
                objM4550c = obj;
                List<ResultTtsUtterance> list8 = (List) objM4550c;
                arrayList3 = new ArrayList(v91.m23189q0(list8, 10));
                while (r0.hasNext()) {
                    locale2.getClass();
                    arrayList3.add(AbstractC1737t4.m8407a(resultTtsUtterance, locale2, cl9.m4839V(resultTtsUtterance.f21627b.f21648c, "|", ""), str5));
                }
                this.f16247f = e83Var;
                this.f16242a = locale2;
                this.f16243b = null;
                this.f16244c = setM22627s1;
                this.f16246e = 4;
                objM2861d = AbstractC0758a.m2861d(new r3a(8, zcaVar, arrayList3), zcaVar.f71369K, this, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d != coroutineSingletons) {
                    set = setM22627s1;
                    Set<String> set8 = set;
                    arrayList4 = new ArrayList(v91.m23189q0(set8, 10));
                    while (r0.hasNext()) {
                        C1487c c1487c5 = TextToSpeechTokenUtterance.Companion;
                        locale2.getClass();
                        c1487c5.getClass();
                        arrayList4.add(C1487c.m8136a(locale2, str5, str9, str4, str3));
                    }
                    r3 = 0;
                    this.f16247f = null;
                    this.f16242a = null;
                    this.f16243b = null;
                    this.f16244c = null;
                    this.f16245d = e83Var;
                    this.f16246e = 5;
                    objM25553y1 = zcaVar.m25553y0(arrayList4, this);
                    if (objM25553y1 != coroutineSingletons) {
                        this.f16247f = r3;
                        this.f16242a = r3;
                        this.f16243b = r3;
                        this.f16244c = r3;
                        this.f16245d = r3;
                        this.f16246e = 6;
                        if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                set = this.f16244c;
                List list9 = this.f16243b;
                locale2 = this.f16242a;
                AbstractC3193b.m15359b(obj);
                Set<String> set9 = set;
                arrayList4 = new ArrayList(v91.m23189q0(set9, 10));
                while (r0.hasNext()) {
                    C1487c c1487c6 = TextToSpeechTokenUtterance.Companion;
                    locale2.getClass();
                    c1487c6.getClass();
                    arrayList4.add(C1487c.m8136a(locale2, str5, str9, str4, str3));
                }
                r3 = 0;
                this.f16247f = null;
                this.f16242a = null;
                this.f16243b = null;
                this.f16244c = null;
                this.f16245d = e83Var;
                this.f16246e = 5;
                objM25553y1 = zcaVar.m25553y0(arrayList4, this);
                if (objM25553y1 != coroutineSingletons) {
                    this.f16247f = r3;
                    this.f16242a = r3;
                    this.f16243b = r3;
                    this.f16244c = r3;
                    this.f16245d = r3;
                    this.f16246e = 6;
                    if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 5:
                e83Var = this.f16245d;
                Set set10 = this.f16244c;
                List list10 = this.f16243b;
                AbstractC3193b.m15359b(obj);
                objM25553y1 = obj;
                r3 = 0;
                this.f16247f = r3;
                this.f16242a = r3;
                this.f16243b = r3;
                this.f16244c = r3;
                this.f16245d = r3;
                this.f16246e = 6;
                if (e83Var.emit(objM25553y1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 6:
                Set set11 = this.f16244c;
                List list11 = this.f16243b;
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
