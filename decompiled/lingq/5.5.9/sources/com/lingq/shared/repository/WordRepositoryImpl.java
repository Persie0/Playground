package com.lingq.shared.repository;

import ae.C0062b;
import android.os.Bundle;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1562x5;
import ci.InterfaceC2026s;
import com.lingq.entity.Word;
import com.lingq.shared.network.requests.RequestWordsUpdate;
import com.lingq.shared.network.workers.WordUpdateIgnoreStatusWorker;
import com.lingq.shared.network.workers.WordUpdateKnownStatusWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.WordStatus;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7378e;
import mo.C7661i;
import ni.C7793a;
import ni.C7796d;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p096ei.C5408a;
import p260m8.C7499b;
import p385sf.C9000b;
import p460wh.InterfaceC9950r;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class WordRepositoryImpl implements InterfaceC2026s {

    /* JADX INFO: renamed from: a */
    public final AbstractC1562x5 f20694a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9950r f20695b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f20696c;

    /* JADX INFO: renamed from: d */
    public final C7796d f20697d;

    public WordRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1562x5 abstractC1562x5, InterfaceC9950r interfaceC9950r, AbstractC1317j abstractC1317j, C7796d c7796d) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1562x5, "wordDao");
        C5207g.m11111f(interfaceC9950r, "wordService");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c7796d, "analytics");
        this.f20694a = abstractC1562x5;
        this.f20695b = interfaceC9950r;
        this.f20696c = abstractC1317j;
        this.f20697d = c7796d;
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<C7378e> mo6191a(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "term");
        return C0062b.m273H0(this.f20694a.mo5230l0(C7793a.m15498b(str, C7793a.m15501e(str2, str))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: b */
    public final Object mo6192b(String str, int i10, String str2, String str3, String str4, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        WordRepositoryImpl$updateWordStatus$1 wordRepositoryImpl$updateWordStatus$1;
        String str5;
        String str6;
        WordRepositoryImpl wordRepositoryImpl;
        String str7;
        int i11;
        Ref$IntRef ref$IntRef;
        Ref$IntRef ref$IntRef2;
        if (interfaceC9968c instanceof WordRepositoryImpl$updateWordStatus$1) {
            wordRepositoryImpl$updateWordStatus$1 = (WordRepositoryImpl$updateWordStatus$1) interfaceC9968c;
            int i12 = wordRepositoryImpl$updateWordStatus$1.f20705k;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                wordRepositoryImpl$updateWordStatus$1.f20705k = i12 - Integer.MIN_VALUE;
            } else {
                wordRepositoryImpl$updateWordStatus$1 = new WordRepositoryImpl$updateWordStatus$1(this, interfaceC9968c);
            }
        } else {
            wordRepositoryImpl$updateWordStatus$1 = new WordRepositoryImpl$updateWordStatus$1(this, interfaceC9968c);
        }
        Object objMo5235q0 = wordRepositoryImpl$updateWordStatus$1.f20703i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = wordRepositoryImpl$updateWordStatus$1.f20705k;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = wordRepositoryImpl$updateWordStatus$1.f20702h;
                String str8 = wordRepositoryImpl$updateWordStatus$1.f20701g;
                String str9 = wordRepositoryImpl$updateWordStatus$1.f20700f;
                str7 = wordRepositoryImpl$updateWordStatus$1.f20699e;
                wordRepositoryImpl = (WordRepositoryImpl) wordRepositoryImpl$updateWordStatus$1.f20698d;
                C7499b.m14977z0(objMo5235q0);
                str6 = str8;
                str5 = str9;
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$IntRef2 = (Ref$IntRef) wordRepositoryImpl$updateWordStatus$1.f20698d;
                C7499b.m14977z0(objMo5235q0);
            }
            C5206f.m11026v0(((Number) objMo5235q0).longValue());
            ref$IntRef = ref$IntRef2;
            return new Integer(ref$IntRef.f38125a);
        }
        C7499b.m14977z0(objMo5235q0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        wordRepositoryImpl$updateWordStatus$1.f20698d = this;
        wordRepositoryImpl$updateWordStatus$1.f20699e = str;
        str5 = str3;
        wordRepositoryImpl$updateWordStatus$1.f20700f = str5;
        str6 = str4;
        wordRepositoryImpl$updateWordStatus$1.f20701g = str6;
        wordRepositoryImpl$updateWordStatus$1.f20702h = i10;
        wordRepositoryImpl$updateWordStatus$1.f20705k = 1;
        objMo5235q0 = this.f20694a.mo5235q0(strM15498b, wordRepositoryImpl$updateWordStatus$1);
        if (objMo5235q0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        wordRepositoryImpl = this;
        str7 = str;
        i11 = i10;
        Word word = (Word) objMo5235q0;
        ref$IntRef = new Ref$IntRef();
        if (word != null) {
            word.f17579d = str5;
            List<LanguageLearn> list = C5408a.f33824a;
            if (C5207g.m11106a(str5, WordStatus.New.getValue()) || C5207g.m11106a(word.f17579d, WordStatus.Ignored.getValue())) {
                ref$IntRef.f38125a = 0;
            } else if (C5207g.m11106a(word.f17579d, WordStatus.Known.getValue())) {
                ref$IntRef.f38125a = 5;
            }
            boolean zM11106a = C5207g.m11106a(word.f17579d, WordStatus.Known.getValue());
            int i14 = word.f17578c;
            if (zM11106a) {
                Bundle bundle = new Bundle();
                if (true ^ C7661i.m15250P2(str6)) {
                    bundle.putString("Source", str6);
                }
                wordRepositoryImpl.f20697d.m15505b(bundle, "mark_word_known");
                wordRepositoryImpl.m9549l(i11, str7, C9000b.m17251q(new Integer(i14)));
            } else if (C5207g.m11106a(word.f17579d, WordStatus.Ignored.getValue())) {
                Bundle bundle2 = new Bundle();
                if (!C7661i.m15250P2(str6)) {
                    bundle2.putString("Source", str6);
                }
                wordRepositoryImpl.f20697d.m15505b(bundle2, "mark_word_ignore");
                List listM17251q = C9000b.m17251q(new Integer(i14));
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                NetworkType networkType2 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType2, "networkType");
                C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
                C1315h.a aVar = (C1315h.a) new C1315h.a(WordUpdateIgnoreStatusWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar.f8071c.f37533j = c1309b;
                Pair[] pairArr = {new Pair("language", str7), new Pair("lessonId", Integer.valueOf(i11)), new Pair("wordIds", C6752c.m13452t0(listM17251q))};
                C1244b.a aVar2 = new C1244b.a();
                for (int i15 = 0; i15 < 3; i15++) {
                    Pair pair = pairArr[i15];
                    aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
                }
                aVar.f8071c.f37528e = aVar2.m4708a();
                wordRepositoryImpl.f20696c.m4877b(aVar.m4879a());
            }
            AbstractC1562x5 abstractC1562x5 = wordRepositoryImpl.f20694a;
            wordRepositoryImpl$updateWordStatus$1.f20698d = ref$IntRef;
            wordRepositoryImpl$updateWordStatus$1.f20699e = null;
            wordRepositoryImpl$updateWordStatus$1.f20700f = null;
            wordRepositoryImpl$updateWordStatus$1.f20701g = null;
            wordRepositoryImpl$updateWordStatus$1.f20705k = 2;
            objMo5235q0 = abstractC1562x5.mo598h0(word, wordRepositoryImpl$updateWordStatus$1);
            if (objMo5235q0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$IntRef2 = ref$IntRef;
            C5206f.m11026v0(((Number) objMo5235q0).longValue());
            ref$IntRef = ref$IntRef2;
        }
        return new Integer(ref$IntRef.f38125a);
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c mo6193c(List list, String str) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(list, "terms");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C5207g.m11110e(localeForLanguageTag, "locale");
            arrayList.add(C7793a.m15498b(str, C7793a.m15502f(str2, localeForLanguageTag)));
        }
        return C0062b.m273H0(this.f20694a.mo5233o0(arrayList));
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: d */
    public final InterfaceC7116c<Integer> mo6194d(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "term");
        return C0062b.m273H0(this.f20694a.mo5231m0(C7793a.m15498b(str, C7793a.m15501e(str2, str))));
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: e */
    public final Object mo6195e(String str, RequestWordsUpdate requestWordsUpdate, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18531b = this.f20695b.m18531b(str, requestWordsUpdate, interfaceC9968c);
        return objM18531b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18531b : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c mo6196f(List list, String str) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(list, "terms");
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C5207g.m11110e(localeForLanguageTag, "locale");
            arrayList.add(C7793a.m15498b(str, C7793a.m15502f(str2, localeForLanguageTag)));
        }
        return C0062b.m273H0(this.f20694a.mo5229k0(arrayList));
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: g */
    public final Object mo6197g(String str, ArrayList arrayList, InterfaceC9968c interfaceC9968c) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            C5207g.m11110e(localeForLanguageTag, "locale");
            arrayList2.add(C7793a.m15498b(str, C7793a.m15502f(str2, localeForLanguageTag)));
        }
        return this.f20694a.mo5237s0(arrayList2, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0091  */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:30:0x0123  */
    /* JADX WARN: Code duplicated, block: B:32:0x0130  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d1 -> B:25:0x00dd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0130 -> B:33:0x0132). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: h */
    public final java.lang.Object mo6198h(int r18, java.lang.String r19, java.util.ArrayList r20, p464wl.InterfaceC9968c r21) {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.WordRepositoryImpl.mo6198h(int, java.lang.String, java.util.ArrayList, wl.c):java.lang.Object");
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: i */
    public final Object mo6199i(String str, RequestWordsUpdate requestWordsUpdate, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18530a = this.f20695b.m18530a(str, requestWordsUpdate, interfaceC9968c);
        return objM18530a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18530a : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: j */
    public final InterfaceC7116c<List<C7378e>> mo6200j(int i10) {
        return this.f20694a.mo5232n0(i10);
    }

    @Override // ci.InterfaceC2026s
    /* JADX INFO: renamed from: k */
    public final Object mo6201k(String str, String str2, InterfaceC9968c<? super C7378e> interfaceC9968c) {
        return this.f20694a.mo5234p0(C7793a.m15498b(str, C7793a.m15501e(str2, str)), interfaceC9968c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final void m9549l(int i10, String str, List list) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(WordUpdateKnownStatusWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str);
        Pair[] pairArr = {pair, new Pair("lessonId", Integer.valueOf(i10)), new Pair("wordIds", C6752c.m13452t0(list))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i11 = 0; i11 < 3; i11++) {
            Pair pair2 = pairArr[i11];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f20696c.m4877b(aVar.m4879a());
    }
}
