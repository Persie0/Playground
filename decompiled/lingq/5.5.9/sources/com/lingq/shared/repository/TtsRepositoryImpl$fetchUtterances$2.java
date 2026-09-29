package com.lingq.shared.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import bi.AbstractC1485m5;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.network.result.ResultTtsUtterance;
import com.lingq.shared.uimodel.TextToSpeechAppVoice;
import com.lingq.shared.uimodel.TextToSpeechTokenUtterance;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.InterfaceC7117d;
import mo.C7661i;
import ni.C7793a;
import p260m8.C7499b;
import p460wh.InterfaceC9949q;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import p511yh.C10367d;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/TextToSpeechTokenUtterance;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.TtsRepositoryImpl$fetchUtterances$2", m19206f = "TtsRepository.kt", m19207l = {BuildConfig.SDK_TRUNCATE_LENGTH, 141, 155, 162, 166, 166}, m19208m = "invokeSuspend")
final class TtsRepositoryImpl$fetchUtterances$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends TextToSpeechTokenUtterance>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Locale f20582e;

    /* JADX INFO: renamed from: f */
    public Collection f20583f;

    /* JADX INFO: renamed from: g */
    public int f20584g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f20585h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f20586i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ TtsRepositoryImpl f20587j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Set<String> f20588k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ TextToSpeechAppVoice f20589l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TtsRepositoryImpl$fetchUtterances$2(String str, TtsRepositoryImpl ttsRepositoryImpl, Set<String> set, TextToSpeechAppVoice textToSpeechAppVoice, InterfaceC9968c<? super TtsRepositoryImpl$fetchUtterances$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f20586i = str;
        this.f20587j = ttsRepositoryImpl;
        this.f20588k = set;
        this.f20589l = textToSpeechAppVoice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        TtsRepositoryImpl$fetchUtterances$2 ttsRepositoryImpl$fetchUtterances$2 = new TtsRepositoryImpl$fetchUtterances$2(this.f20586i, this.f20587j, this.f20588k, this.f20589l, interfaceC9968c);
        ttsRepositoryImpl$fetchUtterances$2.f20585h = obj;
        return ttsRepositoryImpl$fetchUtterances$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super List<? extends TextToSpeechTokenUtterance>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TtsRepositoryImpl$fetchUtterances$2) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00df  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:34:0x0111 A[LOOP:3: B:29:0x00ea->B:34:0x0111, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x011b  */
    /* JADX WARN: Code duplicated, block: B:38:0x011e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0141 A[LOOP:4: B:43:0x013b->B:45:0x0141, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:48:0x0157  */
    /* JADX WARN: Code duplicated, block: B:50:0x0171 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0172  */
    /* JADX WARN: Code duplicated, block: B:55:0x018d A[LOOP:1: B:53:0x0187->B:55:0x018d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d1 A[LOOP:0: B:61:0x01cb->B:63:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x01f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:69:0x0203 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:76:0x0125 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.util.Set<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.ArrayList] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7117d interfaceC7117d;
        Locale localeForLanguageTag;
        Object objMo5104n0;
        List list;
        Locale locale;
        InterfaceC7117d interfaceC7117d2;
        List list2;
        Set<String> setM13457y0;
        Object objM18529c;
        InterfaceC7117d interfaceC7117d3;
        Locale locale2;
        ArrayList arrayList;
        Iterator it;
        String str;
        Iterator it2;
        List list3;
        Object next;
        boolean z10;
        String str2;
        AbstractC1485m5 abstractC1485m5;
        ArrayList arrayList2;
        Set<String> set;
        ArrayList arrayList3;
        Object obj2;
        Object objMo5104n1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f20584g;
        String str3 = this.f20586i;
        TextToSpeechAppVoice textToSpeechAppVoice = this.f20589l;
        ?? arrayList4 = this.f20588k;
        TtsRepositoryImpl ttsRepositoryImpl = this.f20587j;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                interfaceC7117d = (InterfaceC7117d) this.f20585h;
                localeForLanguageTag = Locale.forLanguageTag(str3);
                AbstractC1485m5 abstractC1485m6 = ttsRepositoryImpl.f20565b;
                ArrayList arrayList5 = new ArrayList(C9325m.m17681z(arrayList4, 10));
                for (String str4 : arrayList4) {
                    C5207g.m11110e(localeForLanguageTag, "locale");
                    arrayList5.add(TextToSpeechTokenUtterance.C3401a.m9701a(localeForLanguageTag, str3, str4, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                }
                this.f20585h = interfaceC7117d;
                this.f20582e = localeForLanguageTag;
                this.f20584g = 1;
                objMo5104n0 = abstractC1485m6.mo5104n0(arrayList5, this);
                if (objMo5104n0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = (List) objMo5104n0;
                this.f20585h = interfaceC7117d;
                this.f20582e = localeForLanguageTag;
                this.f20583f = list;
                this.f20584g = 2;
                if (interfaceC7117d.mo1339r(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                locale = localeForLanguageTag;
                interfaceC7117d2 = interfaceC7117d;
                list2 = list;
                if (!list2.isEmpty()) {
                    arrayList = new ArrayList();
                    for (Object obj3 : arrayList4) {
                        str = (String) obj3;
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                str2 = ((TextToSpeechTokenUtterance) next).f21612d;
                                C5207g.m11110e(locale, "locale");
                                list3 = list2;
                                if (!C5207g.m11106a(str2, C7076b.m14277B3(C7793a.m15502f(str, locale)).toString())) {
                                    list2 = list3;
                                }
                            } else {
                                list3 = list2;
                                next = null;
                            }
                        }
                        if (next == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList.add(obj3);
                        }
                        list2 = list3;
                    }
                    arrayList4 = new ArrayList(C9325m.m17681z(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((String) it.next());
                    }
                }
                setM13457y0 = C6752c.m13457y0(arrayList4);
                if (!setM13457y0.isEmpty()) {
                    InterfaceC9949q interfaceC9949q = ttsRepositoryImpl.f20566c;
                    String str5 = this.f20586i;
                    String str6 = textToSpeechAppVoice.f21606b;
                    String str7 = textToSpeechAppVoice.f21605a;
                    this.f20585h = interfaceC7117d2;
                    this.f20582e = locale;
                    this.f20583f = setM13457y0;
                    this.f20584g = 3;
                    objM18529c = interfaceC9949q.m18529c(str5, str6, str7, setM13457y0, this);
                    if (objM18529c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d3 = interfaceC7117d2;
                    locale2 = locale;
                    List<ResultTtsUtterance> list4 = (List) objM18529c;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    arrayList2 = new ArrayList(C9325m.m17681z(list4, 10));
                    for (ResultTtsUtterance resultTtsUtterance : list4) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList2.add(C10367d.m19388a(resultTtsUtterance, locale2, C7661i.m15254T2(resultTtsUtterance.f19025e, "|", "")));
                    }
                    this.f20585h = interfaceC7117d3;
                    this.f20582e = locale2;
                    this.f20583f = setM13457y0;
                    this.f20584g = 4;
                    if (abstractC1485m5.mo5107q0(arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = setM13457y0;
                    AbstractC1485m5 abstractC1485m7 = ttsRepositoryImpl.f20565b;
                    arrayList3 = new ArrayList(C9325m.m17681z(set, 10));
                    for (String str8 : set) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList3.add(TextToSpeechTokenUtterance.C3401a.m9701a(locale2, str3, str8, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                    }
                    this.f20585h = interfaceC7117d3;
                    obj2 = null;
                    this.f20582e = null;
                    this.f20583f = null;
                    this.f20584g = 5;
                    objMo5104n1 = abstractC1485m7.mo5104n0(arrayList3, this);
                    if (objMo5104n1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.f20585h = obj2;
                    this.f20584g = 6;
                    if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 1:
                localeForLanguageTag = this.f20582e;
                interfaceC7117d = (InterfaceC7117d) this.f20585h;
                C7499b.m14977z0(obj);
                objMo5104n0 = obj;
                list = (List) objMo5104n0;
                this.f20585h = interfaceC7117d;
                this.f20582e = localeForLanguageTag;
                this.f20583f = list;
                this.f20584g = 2;
                if (interfaceC7117d.mo1339r(list, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                locale = localeForLanguageTag;
                interfaceC7117d2 = interfaceC7117d;
                list2 = list;
                if (!list2.isEmpty()) {
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        str = (String) obj3;
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                str2 = ((TextToSpeechTokenUtterance) next).f21612d;
                                C5207g.m11110e(locale, "locale");
                                list3 = list2;
                                if (!C5207g.m11106a(str2, C7076b.m14277B3(C7793a.m15502f(str, locale)).toString())) {
                                    list2 = list3;
                                }
                            } else {
                                list3 = list2;
                                next = null;
                            }
                        }
                        if (next == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList.add(obj3);
                        }
                        list2 = list3;
                    }
                    arrayList4 = new ArrayList(C9325m.m17681z(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((String) it.next());
                    }
                }
                setM13457y0 = C6752c.m13457y0(arrayList4);
                if (!setM13457y0.isEmpty()) {
                    InterfaceC9949q interfaceC9949q2 = ttsRepositoryImpl.f20566c;
                    String str9 = this.f20586i;
                    String str10 = textToSpeechAppVoice.f21606b;
                    String str11 = textToSpeechAppVoice.f21605a;
                    this.f20585h = interfaceC7117d2;
                    this.f20582e = locale;
                    this.f20583f = setM13457y0;
                    this.f20584g = 3;
                    objM18529c = interfaceC9949q2.m18529c(str9, str10, str11, setM13457y0, this);
                    if (objM18529c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d3 = interfaceC7117d2;
                    locale2 = locale;
                    List<ResultTtsUtterance> list5 = (List) objM18529c;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    arrayList2 = new ArrayList(C9325m.m17681z(list5, 10));
                    while (r0.hasNext()) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList2.add(C10367d.m19388a(resultTtsUtterance, locale2, C7661i.m15254T2(resultTtsUtterance.f19025e, "|", "")));
                    }
                    this.f20585h = interfaceC7117d3;
                    this.f20582e = locale2;
                    this.f20583f = setM13457y0;
                    this.f20584g = 4;
                    if (abstractC1485m5.mo5107q0(arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = setM13457y0;
                    AbstractC1485m5 abstractC1485m8 = ttsRepositoryImpl.f20565b;
                    arrayList3 = new ArrayList(C9325m.m17681z(set, 10));
                    while (r0.hasNext()) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList3.add(TextToSpeechTokenUtterance.C3401a.m9701a(locale2, str3, str8, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                    }
                    this.f20585h = interfaceC7117d3;
                    obj2 = null;
                    this.f20582e = null;
                    this.f20583f = null;
                    this.f20584g = 5;
                    objMo5104n1 = abstractC1485m8.mo5104n0(arrayList3, this);
                    if (objMo5104n1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.f20585h = obj2;
                    this.f20584g = 6;
                    if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 2:
                list2 = (List) this.f20583f;
                Locale locale3 = this.f20582e;
                InterfaceC7117d interfaceC7117d4 = (InterfaceC7117d) this.f20585h;
                C7499b.m14977z0(obj);
                locale = locale3;
                interfaceC7117d2 = interfaceC7117d4;
                if (!list2.isEmpty()) {
                    arrayList = new ArrayList();
                    while (r2.hasNext()) {
                        str = (String) obj3;
                        it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                str2 = ((TextToSpeechTokenUtterance) next).f21612d;
                                C5207g.m11110e(locale, "locale");
                                list3 = list2;
                                if (!C5207g.m11106a(str2, C7076b.m14277B3(C7793a.m15502f(str, locale)).toString())) {
                                    list2 = list3;
                                }
                            } else {
                                list3 = list2;
                                next = null;
                            }
                        }
                        if (next == null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            arrayList.add(obj3);
                        }
                        list2 = list3;
                    }
                    arrayList4 = new ArrayList(C9325m.m17681z(arrayList, 10));
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList4.add((String) it.next());
                    }
                }
                setM13457y0 = C6752c.m13457y0(arrayList4);
                if (!setM13457y0.isEmpty()) {
                    InterfaceC9949q interfaceC9949q3 = ttsRepositoryImpl.f20566c;
                    String str12 = this.f20586i;
                    String str13 = textToSpeechAppVoice.f21606b;
                    String str14 = textToSpeechAppVoice.f21605a;
                    this.f20585h = interfaceC7117d2;
                    this.f20582e = locale;
                    this.f20583f = setM13457y0;
                    this.f20584g = 3;
                    objM18529c = interfaceC9949q3.m18529c(str12, str13, str14, setM13457y0, this);
                    if (objM18529c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC7117d3 = interfaceC7117d2;
                    locale2 = locale;
                    List<ResultTtsUtterance> list6 = (List) objM18529c;
                    abstractC1485m5 = ttsRepositoryImpl.f20565b;
                    arrayList2 = new ArrayList(C9325m.m17681z(list6, 10));
                    while (r0.hasNext()) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList2.add(C10367d.m19388a(resultTtsUtterance, locale2, C7661i.m15254T2(resultTtsUtterance.f19025e, "|", "")));
                    }
                    this.f20585h = interfaceC7117d3;
                    this.f20582e = locale2;
                    this.f20583f = setM13457y0;
                    this.f20584g = 4;
                    if (abstractC1485m5.mo5107q0(arrayList2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    set = setM13457y0;
                    AbstractC1485m5 abstractC1485m9 = ttsRepositoryImpl.f20565b;
                    arrayList3 = new ArrayList(C9325m.m17681z(set, 10));
                    while (r0.hasNext()) {
                        C5207g.m11110e(locale2, "locale");
                        arrayList3.add(TextToSpeechTokenUtterance.C3401a.m9701a(locale2, str3, str8, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                    }
                    this.f20585h = interfaceC7117d3;
                    obj2 = null;
                    this.f20582e = null;
                    this.f20583f = null;
                    this.f20584g = 5;
                    objMo5104n1 = abstractC1485m9.mo5104n0(arrayList3, this);
                    if (objMo5104n1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    this.f20585h = obj2;
                    this.f20584g = 6;
                    if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 3:
                Set<String> set2 = (Set) this.f20583f;
                locale2 = this.f20582e;
                interfaceC7117d3 = (InterfaceC7117d) this.f20585h;
                C7499b.m14977z0(obj);
                setM13457y0 = set2;
                objM18529c = obj;
                List<ResultTtsUtterance> list7 = (List) objM18529c;
                abstractC1485m5 = ttsRepositoryImpl.f20565b;
                arrayList2 = new ArrayList(C9325m.m17681z(list7, 10));
                while (r0.hasNext()) {
                    C5207g.m11110e(locale2, "locale");
                    arrayList2.add(C10367d.m19388a(resultTtsUtterance, locale2, C7661i.m15254T2(resultTtsUtterance.f19025e, "|", "")));
                }
                this.f20585h = interfaceC7117d3;
                this.f20582e = locale2;
                this.f20583f = setM13457y0;
                this.f20584g = 4;
                if (abstractC1485m5.mo5107q0(arrayList2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                set = setM13457y0;
                AbstractC1485m5 abstractC1485m10 = ttsRepositoryImpl.f20565b;
                arrayList3 = new ArrayList(C9325m.m17681z(set, 10));
                while (r0.hasNext()) {
                    C5207g.m11110e(locale2, "locale");
                    arrayList3.add(TextToSpeechTokenUtterance.C3401a.m9701a(locale2, str3, str8, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                }
                this.f20585h = interfaceC7117d3;
                obj2 = null;
                this.f20582e = null;
                this.f20583f = null;
                this.f20584g = 5;
                objMo5104n1 = abstractC1485m10.mo5104n0(arrayList3, this);
                if (objMo5104n1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.f20585h = obj2;
                this.f20584g = 6;
                if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 4:
                set = (Set) this.f20583f;
                locale2 = this.f20582e;
                interfaceC7117d3 = (InterfaceC7117d) this.f20585h;
                C7499b.m14977z0(obj);
                AbstractC1485m5 abstractC1485m11 = ttsRepositoryImpl.f20565b;
                arrayList3 = new ArrayList(C9325m.m17681z(set, 10));
                while (r0.hasNext()) {
                    C5207g.m11110e(locale2, "locale");
                    arrayList3.add(TextToSpeechTokenUtterance.C3401a.m9701a(locale2, str3, str8, textToSpeechAppVoice.f21606b, textToSpeechAppVoice.f21605a));
                }
                this.f20585h = interfaceC7117d3;
                obj2 = null;
                this.f20582e = null;
                this.f20583f = null;
                this.f20584g = 5;
                objMo5104n1 = abstractC1485m11.mo5104n0(arrayList3, this);
                if (objMo5104n1 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                this.f20585h = obj2;
                this.f20584g = 6;
                if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 5:
                InterfaceC7117d interfaceC7117d5 = (InterfaceC7117d) this.f20585h;
                C7499b.m14977z0(obj);
                objMo5104n1 = obj;
                interfaceC7117d3 = interfaceC7117d5;
                obj2 = null;
                this.f20585h = obj2;
                this.f20584g = 6;
                if (interfaceC7117d3.mo1339r(objMo5104n1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
