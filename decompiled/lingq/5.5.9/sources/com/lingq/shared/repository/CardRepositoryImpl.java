package com.lingq.shared.repository;

import ae.C0062b;
import androidx.room.RoomDatabaseKt;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1388a;
import bi.AbstractC1495o1;
import bi.AbstractC1562x5;
import ci.InterfaceC2008a;
import cm.InterfaceC2052l;
import com.lingq.entity.Card;
import com.lingq.entity.Meaning;
import com.lingq.entity.MeaningKt;
import com.lingq.entity.Word;
import com.lingq.shared.network.requests.RequestDataCard;
import com.lingq.shared.network.requests.RequestHintUpdate;
import com.lingq.shared.network.result.ResultCardReview;
import com.lingq.shared.network.result.ResultVocabularyCard;
import com.lingq.shared.network.workers.CardDeleteWorker;
import com.lingq.shared.network.workers.CardReviewWorker;
import com.lingq.shared.network.workers.CardUpdateWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import dm.C5212l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7374a;
import ni.C7793a;
import ni.C7796d;
import p003a2.C0009a;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p076di.InterfaceC5180b;
import p096ei.C5408a;
import p159hi.C6052c;
import p260m8.C7499b;
import p367rh.C8787a;
import p367rh.C8808v;
import p440vl.C9757a;
import p460wh.InterfaceC9933a;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;
import tl.C9331s;
import tl.C9332t;
import tl.C9333u;

/* JADX INFO: loaded from: classes.dex */
public final class CardRepositoryImpl implements InterfaceC2008a {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f19389a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1388a f19390b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1562x5 f19391c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1495o1 f19392d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC9933a f19393e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC5180b f19394f;

    /* JADX INFO: renamed from: g */
    public final AbstractC1317j f19395g;

    /* JADX INFO: renamed from: h */
    public final C4955q f19396h;

    /* JADX INFO: renamed from: i */
    public final C7796d f19397i;

    /* JADX INFO: renamed from: com.lingq.shared.repository.CardRepositoryImpl$a */
    public static final class C3316a<T> implements Comparator {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Comparator f19398a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f19399b;

        public C3316a(C9757a c9757a, LinkedHashMap linkedHashMap) {
            this.f19398a = c9757a;
            this.f19399b = linkedHashMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            Integer numValueOf = Integer.valueOf(((Meaning) t10).f17276a);
            Map map = this.f19399b;
            return this.f19398a.compare((Integer) map.get(numValueOf), (Integer) map.get(Integer.valueOf(((Meaning) t11).f17276a)));
        }
    }

    public CardRepositoryImpl(LingQDatabase lingQDatabase, AbstractC1388a abstractC1388a, AbstractC1562x5 abstractC1562x5, AbstractC1495o1 abstractC1495o1, InterfaceC9933a interfaceC9933a, InterfaceC5180b interfaceC5180b, AbstractC1317j abstractC1317j, C4955q c4955q, C7796d c7796d) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(abstractC1388a, "cardDao");
        C5207g.m11111f(abstractC1562x5, "wordDao");
        C5207g.m11111f(abstractC1495o1, "lessonDao");
        C5207g.m11111f(interfaceC9933a, "cardService");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(c7796d, "analytics");
        this.f19389a = lingQDatabase;
        this.f19390b = abstractC1388a;
        this.f19391c = abstractC1562x5;
        this.f19392d = abstractC1495o1;
        this.f19393e = interfaceC9933a;
        this.f19394f = interfaceC5180b;
        this.f19395g = abstractC1317j;
        this.f19396h = c4955q;
        this.f19397i = c7796d;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: a */
    public final Object mo5949a(int i10, InterfaceC9968c<? super List<C7374a>> interfaceC9968c) {
        return this.f19390b.mo4981t0(i10, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x01ad A[LOOP:0: B:40:0x01ab->B:41:0x01ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: b */
    public final Object mo5950b(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        CardRepositoryImpl$deleteCard$1 cardRepositoryImpl$deleteCard$1;
        CardRepositoryImpl cardRepositoryImpl;
        String str3;
        int i11;
        String str4;
        C8787a c8787a;
        String str5;
        String str6;
        C8808v c8808v;
        AbstractC1562x5 abstractC1562x5;
        int i12;
        AbstractC1388a abstractC1388a;
        int i13;
        int i14;
        String str7;
        String str8;
        CardRepositoryImpl cardRepositoryImpl2;
        int i15;
        Pair[] pairArr;
        C1244b.a aVar;
        if (interfaceC9968c instanceof CardRepositoryImpl$deleteCard$1) {
            cardRepositoryImpl$deleteCard$1 = (CardRepositoryImpl$deleteCard$1) interfaceC9968c;
            int i16 = cardRepositoryImpl$deleteCard$1.f19408l;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$deleteCard$1.f19408l = i16 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$deleteCard$1 = new CardRepositoryImpl$deleteCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$deleteCard$1 = new CardRepositoryImpl$deleteCard$1(this, interfaceC9968c);
        }
        Object obj = cardRepositoryImpl$deleteCard$1.f19406j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = cardRepositoryImpl$deleteCard$1.f19408l;
        if (i17 != 0) {
            if (i17 == 1) {
                i11 = cardRepositoryImpl$deleteCard$1.f19404h;
                str4 = cardRepositoryImpl$deleteCard$1.f19402f;
                str3 = cardRepositoryImpl$deleteCard$1.f19401e;
                CardRepositoryImpl cardRepositoryImpl3 = cardRepositoryImpl$deleteCard$1.f19400d;
                C7499b.m14977z0(obj);
                cardRepositoryImpl = cardRepositoryImpl3;
            } else if (i17 == 2) {
                i11 = cardRepositoryImpl$deleteCard$1.f19404h;
                c8787a = cardRepositoryImpl$deleteCard$1.f19403g;
                str6 = cardRepositoryImpl$deleteCard$1.f19402f;
                str5 = cardRepositoryImpl$deleteCard$1.f19401e;
                cardRepositoryImpl = cardRepositoryImpl$deleteCard$1.f19400d;
                C7499b.m14977z0(obj);
                c8808v = (C8808v) obj;
                if (c8808v != null) {
                    String value = WordStatus.Ignored.getValue();
                    C5207g.m11111f(value, "<set-?>");
                    c8808v.f46686d = value;
                    List<Meaning> list = c8787a.f46594h;
                    C5207g.m11111f(list, "<set-?>");
                    c8808v.f46688f = list;
                    abstractC1562x5 = cardRepositoryImpl.f19391c;
                    cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
                    cardRepositoryImpl$deleteCard$1.f19401e = str5;
                    cardRepositoryImpl$deleteCard$1.f19402f = str6;
                    cardRepositoryImpl$deleteCard$1.f19403g = c8787a;
                    cardRepositoryImpl$deleteCard$1.f19404h = i11;
                    cardRepositoryImpl$deleteCard$1.f19408l = 3;
                    if (abstractC1562x5.mo5238t0(c8808v, cardRepositoryImpl$deleteCard$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                i12 = c8787a.f46587a;
                abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
                cardRepositoryImpl$deleteCard$1.f19401e = str5;
                cardRepositoryImpl$deleteCard$1.f19402f = str6;
                cardRepositoryImpl$deleteCard$1.f19403g = null;
                cardRepositoryImpl$deleteCard$1.f19404h = i11;
                cardRepositoryImpl$deleteCard$1.f19405i = i12;
                cardRepositoryImpl$deleteCard$1.f19408l = 4;
                if (abstractC1388a.mo4972k0(str6, cardRepositoryImpl$deleteCard$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i13 = i11;
                i14 = i12;
                str7 = str6;
                str8 = str5;
                cardRepositoryImpl2 = cardRepositoryImpl;
            } else if (i17 == 3) {
                i11 = cardRepositoryImpl$deleteCard$1.f19404h;
                c8787a = cardRepositoryImpl$deleteCard$1.f19403g;
                str6 = cardRepositoryImpl$deleteCard$1.f19402f;
                str5 = cardRepositoryImpl$deleteCard$1.f19401e;
                cardRepositoryImpl = cardRepositoryImpl$deleteCard$1.f19400d;
                C7499b.m14977z0(obj);
                i12 = c8787a.f46587a;
                abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
                cardRepositoryImpl$deleteCard$1.f19401e = str5;
                cardRepositoryImpl$deleteCard$1.f19402f = str6;
                cardRepositoryImpl$deleteCard$1.f19403g = null;
                cardRepositoryImpl$deleteCard$1.f19404h = i11;
                cardRepositoryImpl$deleteCard$1.f19405i = i12;
                cardRepositoryImpl$deleteCard$1.f19408l = 4;
                if (abstractC1388a.mo4972k0(str6, cardRepositoryImpl$deleteCard$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i13 = i11;
                i14 = i12;
                str7 = str6;
                str8 = str5;
                cardRepositoryImpl2 = cardRepositoryImpl;
            } else {
                if (i17 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i14 = cardRepositoryImpl$deleteCard$1.f19405i;
                i13 = cardRepositoryImpl$deleteCard$1.f19404h;
                str7 = cardRepositoryImpl$deleteCard$1.f19402f;
                str8 = cardRepositoryImpl$deleteCard$1.f19401e;
                cardRepositoryImpl2 = cardRepositoryImpl$deleteCard$1.f19400d;
                C7499b.m14977z0(obj);
            }
            C7796d c7796d = cardRepositoryImpl2.f19397i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13);
            String[] strArr = {"const value", sb2.toString()};
            c7796d.getClass();
            c7796d.m15505b(C7796d.m15504a(strArr), "change_card_status");
            int value2 = CardStatus.Ignored.getValue();
            RequestDataCard requestDataCard = new RequestDataCard();
            requestDataCard.f18049c = value2;
            requestDataCard.f18047a = str7;
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(CardDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            pairArr = new Pair[]{new Pair("language", str8), new Pair("cardId", Integer.valueOf(i14)), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard))};
            aVar = new C1244b.a();
            for (i15 = 0; i15 < 3; i15++) {
                Pair pair = pairArr[i15];
                aVar.m4709b(pair.f38013b, (String) pair.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            cardRepositoryImpl2.f19395g.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$deleteCard$1.f19400d = this;
        cardRepositoryImpl$deleteCard$1.f19401e = str;
        cardRepositoryImpl$deleteCard$1.f19402f = strM15498b;
        cardRepositoryImpl$deleteCard$1.f19404h = i10;
        cardRepositoryImpl$deleteCard$1.f19408l = 1;
        Object objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$deleteCard$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        str3 = str;
        i11 = i10;
        str4 = strM15498b;
        obj = objMo4980s0;
        C8787a c8787a2 = (C8787a) obj;
        if (c8787a2 != null) {
            AbstractC1562x5 abstractC1562x6 = cardRepositoryImpl.f19391c;
            cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
            cardRepositoryImpl$deleteCard$1.f19401e = str3;
            cardRepositoryImpl$deleteCard$1.f19402f = str4;
            cardRepositoryImpl$deleteCard$1.f19403g = c8787a2;
            cardRepositoryImpl$deleteCard$1.f19404h = i11;
            cardRepositoryImpl$deleteCard$1.f19408l = 2;
            Object objMo5236r0 = abstractC1562x6.mo5236r0(str4, cardRepositoryImpl$deleteCard$1);
            if (objMo5236r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str9 = str4;
            c8787a = c8787a2;
            obj = objMo5236r0;
            str5 = str3;
            str6 = str9;
            c8808v = (C8808v) obj;
            if (c8808v != null) {
                String value3 = WordStatus.Ignored.getValue();
                C5207g.m11111f(value3, "<set-?>");
                c8808v.f46686d = value3;
                List<Meaning> list2 = c8787a.f46594h;
                C5207g.m11111f(list2, "<set-?>");
                c8808v.f46688f = list2;
                abstractC1562x5 = cardRepositoryImpl.f19391c;
                cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
                cardRepositoryImpl$deleteCard$1.f19401e = str5;
                cardRepositoryImpl$deleteCard$1.f19402f = str6;
                cardRepositoryImpl$deleteCard$1.f19403g = c8787a;
                cardRepositoryImpl$deleteCard$1.f19404h = i11;
                cardRepositoryImpl$deleteCard$1.f19408l = 3;
                if (abstractC1562x5.mo5238t0(c8808v, cardRepositoryImpl$deleteCard$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            i12 = c8787a.f46587a;
            abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$deleteCard$1.f19400d = cardRepositoryImpl;
            cardRepositoryImpl$deleteCard$1.f19401e = str5;
            cardRepositoryImpl$deleteCard$1.f19402f = str6;
            cardRepositoryImpl$deleteCard$1.f19403g = null;
            cardRepositoryImpl$deleteCard$1.f19404h = i11;
            cardRepositoryImpl$deleteCard$1.f19405i = i12;
            cardRepositoryImpl$deleteCard$1.f19408l = 4;
            if (abstractC1388a.mo4972k0(str6, cardRepositoryImpl$deleteCard$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i13 = i11;
            i14 = i12;
            str7 = str6;
            str8 = str5;
            cardRepositoryImpl2 = cardRepositoryImpl;
            C7796d c7796d2 = cardRepositoryImpl2.f19397i;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i13);
            String[] strArr2 = {"const value", sb3.toString()};
            c7796d2.getClass();
            c7796d2.m15505b(C7796d.m15504a(strArr2), "change_card_status");
            int value4 = CardStatus.Ignored.getValue();
            RequestDataCard requestDataCard2 = new RequestDataCard();
            requestDataCard2.f18049c = value4;
            requestDataCard2.f18047a = str7;
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(CardDeleteWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            pairArr = new Pair[]{new Pair("language", str8), new Pair("cardId", Integer.valueOf(i14)), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
            aVar = new C1244b.a();
            while (i15 < 3) {
                Pair pair2 = pairArr[i15];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            cardRepositoryImpl2.f19395g.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: c */
    public final InterfaceC7116c mo5951c(List list, String str) {
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
        return C0062b.m273H0(this.f19390b.mo4977p0(arrayList));
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: d */
    public final Object mo5952d(String str, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        return this.f19392d.mo5148n0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: e */
    public final Object mo5953e(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$updateCardNotes$1 cardRepositoryImpl$updateCardNotes$1;
        CardRepositoryImpl cardRepositoryImpl;
        CardRepositoryImpl cardRepositoryImpl2;
        String str4;
        String str5;
        if (interfaceC9968c instanceof CardRepositoryImpl$updateCardNotes$1) {
            cardRepositoryImpl$updateCardNotes$1 = (CardRepositoryImpl$updateCardNotes$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$updateCardNotes$1.f19517j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardNotes$1.f19517j = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardNotes$1 = new CardRepositoryImpl$updateCardNotes$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$updateCardNotes$1 = new CardRepositoryImpl$updateCardNotes$1(this, interfaceC9968c);
        }
        Object objMo4979r0 = cardRepositoryImpl$updateCardNotes$1.f19515h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$updateCardNotes$1.f19517j;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = cardRepositoryImpl$updateCardNotes$1.f19514g;
                str2 = cardRepositoryImpl$updateCardNotes$1.f19513f;
                str = cardRepositoryImpl$updateCardNotes$1.f19512e;
                cardRepositoryImpl = cardRepositoryImpl$updateCardNotes$1.f19511d;
                C7499b.m14977z0(objMo4979r0);
            } else if (i11 == 2) {
                str5 = cardRepositoryImpl$updateCardNotes$1.f19513f;
                str4 = cardRepositoryImpl$updateCardNotes$1.f19512e;
                cardRepositoryImpl2 = cardRepositoryImpl$updateCardNotes$1.f19511d;
                C7499b.m14977z0(objMo4979r0);
                cardRepositoryImpl$updateCardNotes$1.f19511d = null;
                cardRepositoryImpl$updateCardNotes$1.f19512e = null;
                cardRepositoryImpl$updateCardNotes$1.f19513f = null;
                cardRepositoryImpl$updateCardNotes$1.f19517j = 3;
                if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$updateCardNotes$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4979r0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4979r0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$updateCardNotes$1.f19511d = this;
        cardRepositoryImpl$updateCardNotes$1.f19512e = str;
        cardRepositoryImpl$updateCardNotes$1.f19513f = str2;
        cardRepositoryImpl$updateCardNotes$1.f19514g = str3;
        cardRepositoryImpl$updateCardNotes$1.f19517j = 1;
        objMo4979r0 = this.f19390b.mo4979r0(strM15498b, cardRepositoryImpl$updateCardNotes$1);
        if (objMo4979r0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        Card card = (Card) objMo4979r0;
        if (card != null) {
            card.f16863j = str3;
            AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$updateCardNotes$1.f19511d = cardRepositoryImpl;
            cardRepositoryImpl$updateCardNotes$1.f19512e = str;
            cardRepositoryImpl$updateCardNotes$1.f19513f = str2;
            cardRepositoryImpl$updateCardNotes$1.f19514g = null;
            cardRepositoryImpl$updateCardNotes$1.f19517j = 2;
            if (abstractC1388a.mo598h0(card, cardRepositoryImpl$updateCardNotes$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardRepositoryImpl2 = cardRepositoryImpl;
            String str6 = str2;
            str4 = str;
            str5 = str6;
            cardRepositoryImpl$updateCardNotes$1.f19511d = null;
            cardRepositoryImpl$updateCardNotes$1.f19512e = null;
            cardRepositoryImpl$updateCardNotes$1.f19513f = null;
            cardRepositoryImpl$updateCardNotes$1.f19517j = 3;
            if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$updateCardNotes$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<List<C6052c>> mo5954f(int i10) {
        return C0062b.m273H0(this.f19390b.mo4974m0(i10));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ef A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: g */
    public final Object mo5955g(String str, String str2, final TokenMeaning tokenMeaning, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$removeCardHint$1 cardRepositoryImpl$removeCardHint$1;
        CardRepositoryImpl cardRepositoryImpl;
        CardRepositoryImpl cardRepositoryImpl2;
        String str3;
        String str4;
        if (interfaceC9968c instanceof CardRepositoryImpl$removeCardHint$1) {
            cardRepositoryImpl$removeCardHint$1 = (CardRepositoryImpl$removeCardHint$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$removeCardHint$1.f19478j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$removeCardHint$1.f19478j = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$removeCardHint$1 = new CardRepositoryImpl$removeCardHint$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$removeCardHint$1 = new CardRepositoryImpl$removeCardHint$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$removeCardHint$1.f19476h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$removeCardHint$1.f19478j;
        if (i11 != 0) {
            if (i11 == 1) {
                tokenMeaning = cardRepositoryImpl$removeCardHint$1.f19475g;
                str2 = cardRepositoryImpl$removeCardHint$1.f19474f;
                str = cardRepositoryImpl$removeCardHint$1.f19473e;
                cardRepositoryImpl = cardRepositoryImpl$removeCardHint$1.f19472d;
                C7499b.m14977z0(objMo4980s0);
            } else if (i11 == 2) {
                str4 = cardRepositoryImpl$removeCardHint$1.f19474f;
                str3 = cardRepositoryImpl$removeCardHint$1.f19473e;
                cardRepositoryImpl2 = cardRepositoryImpl$removeCardHint$1.f19472d;
                C7499b.m14977z0(objMo4980s0);
                cardRepositoryImpl$removeCardHint$1.f19472d = null;
                cardRepositoryImpl$removeCardHint$1.f19473e = null;
                cardRepositoryImpl$removeCardHint$1.f19474f = null;
                cardRepositoryImpl$removeCardHint$1.f19478j = 3;
                if (cardRepositoryImpl2.m9475y(str3, str4, cardRepositoryImpl$removeCardHint$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4980s0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$removeCardHint$1.f19472d = this;
        cardRepositoryImpl$removeCardHint$1.f19473e = str;
        cardRepositoryImpl$removeCardHint$1.f19474f = str2;
        cardRepositoryImpl$removeCardHint$1.f19475g = tokenMeaning;
        cardRepositoryImpl$removeCardHint$1.f19478j = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$removeCardHint$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a == null) {
            return C9072e.f47360a;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c8787a.f46594h);
        InterfaceC2052l<Meaning, Boolean> interfaceC2052l = new InterfaceC2052l<Meaning, Boolean>() { // from class: com.lingq.shared.repository.CardRepositoryImpl$removeCardHint$2
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final Boolean mo528n(Meaning meaning) {
                Meaning meaning2 = meaning;
                C5207g.m11111f(meaning2, "it");
                return Boolean.valueOf(C5207g.m11106a(meaning2.f17278c, tokenMeaning.f22090c));
            }
        };
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Boolean) interfaceC2052l.mo528n(it.next())).booleanValue()) {
                it.remove();
            }
        }
        c8787a.f46594h = arrayList;
        c8787a.f46595i = MeaningKt.m9387a(arrayList);
        AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
        cardRepositoryImpl$removeCardHint$1.f19472d = cardRepositoryImpl;
        cardRepositoryImpl$removeCardHint$1.f19473e = str;
        cardRepositoryImpl$removeCardHint$1.f19474f = str2;
        cardRepositoryImpl$removeCardHint$1.f19475g = null;
        cardRepositoryImpl$removeCardHint$1.f19478j = 2;
        if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$removeCardHint$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl2 = cardRepositoryImpl;
        String str5 = str2;
        str3 = str;
        str4 = str5;
        cardRepositoryImpl$removeCardHint$1.f19472d = null;
        cardRepositoryImpl$removeCardHint$1.f19473e = null;
        cardRepositoryImpl$removeCardHint$1.f19474f = null;
        cardRepositoryImpl$removeCardHint$1.f19478j = 3;
        if (cardRepositoryImpl2.m9475y(str3, str4, cardRepositoryImpl$removeCardHint$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: h */
    public final Object mo5956h(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$removeCardTag$1 cardRepositoryImpl$removeCardTag$1;
        CardRepositoryImpl cardRepositoryImpl;
        CardRepositoryImpl cardRepositoryImpl2;
        String str4;
        String str5;
        if (interfaceC9968c instanceof CardRepositoryImpl$removeCardTag$1) {
            cardRepositoryImpl$removeCardTag$1 = (CardRepositoryImpl$removeCardTag$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$removeCardTag$1.f19486j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$removeCardTag$1.f19486j = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$removeCardTag$1 = new CardRepositoryImpl$removeCardTag$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$removeCardTag$1 = new CardRepositoryImpl$removeCardTag$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$removeCardTag$1.f19484h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$removeCardTag$1.f19486j;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = cardRepositoryImpl$removeCardTag$1.f19483g;
                str2 = cardRepositoryImpl$removeCardTag$1.f19482f;
                str = cardRepositoryImpl$removeCardTag$1.f19481e;
                cardRepositoryImpl = cardRepositoryImpl$removeCardTag$1.f19480d;
                C7499b.m14977z0(objMo4980s0);
            } else if (i11 == 2) {
                str5 = cardRepositoryImpl$removeCardTag$1.f19482f;
                str4 = cardRepositoryImpl$removeCardTag$1.f19481e;
                cardRepositoryImpl2 = cardRepositoryImpl$removeCardTag$1.f19480d;
                C7499b.m14977z0(objMo4980s0);
                cardRepositoryImpl$removeCardTag$1.f19480d = null;
                cardRepositoryImpl$removeCardTag$1.f19481e = null;
                cardRepositoryImpl$removeCardTag$1.f19482f = null;
                cardRepositoryImpl$removeCardTag$1.f19486j = 3;
                if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$removeCardTag$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4980s0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$removeCardTag$1.f19480d = this;
        cardRepositoryImpl$removeCardTag$1.f19481e = str;
        cardRepositoryImpl$removeCardTag$1.f19482f = str2;
        cardRepositoryImpl$removeCardTag$1.f19483g = str3;
        cardRepositoryImpl$removeCardTag$1.f19486j = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$removeCardTag$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c8787a.f46591e);
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!C5207g.m11106a((String) it.next(), str3));
            if (z10) {
                arrayList.remove(str3);
            }
            c8787a.f46591e = arrayList;
            AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$removeCardTag$1.f19480d = cardRepositoryImpl;
            cardRepositoryImpl$removeCardTag$1.f19481e = str;
            cardRepositoryImpl$removeCardTag$1.f19482f = str2;
            cardRepositoryImpl$removeCardTag$1.f19483g = null;
            cardRepositoryImpl$removeCardTag$1.f19486j = 2;
            if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$removeCardTag$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardRepositoryImpl2 = cardRepositoryImpl;
            String str6 = str2;
            str4 = str;
            str5 = str6;
            cardRepositoryImpl$removeCardTag$1.f19480d = null;
            cardRepositoryImpl$removeCardTag$1.f19481e = null;
            cardRepositoryImpl$removeCardTag$1.f19482f = null;
            cardRepositoryImpl$removeCardTag$1.f19486j = 3;
            if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$removeCardTag$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0118 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: i */
    public final Object mo5957i(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        CardRepositoryImpl$updateCardStatus$1 cardRepositoryImpl$updateCardStatus$1;
        CardRepositoryImpl cardRepositoryImpl;
        String str3;
        String str4;
        if (interfaceC9968c instanceof CardRepositoryImpl$updateCardStatus$1) {
            cardRepositoryImpl$updateCardStatus$1 = (CardRepositoryImpl$updateCardStatus$1) interfaceC9968c;
            int i11 = cardRepositoryImpl$updateCardStatus$1.f19524j;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardStatus$1.f19524j = i11 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardStatus$1 = new CardRepositoryImpl$updateCardStatus$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$updateCardStatus$1 = new CardRepositoryImpl$updateCardStatus$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$updateCardStatus$1.f19522h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardRepositoryImpl$updateCardStatus$1.f19524j;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = cardRepositoryImpl$updateCardStatus$1.f19521g;
                str2 = cardRepositoryImpl$updateCardStatus$1.f19520f;
                str = cardRepositoryImpl$updateCardStatus$1.f19519e;
                cardRepositoryImpl = cardRepositoryImpl$updateCardStatus$1.f19518d;
                C7499b.m14977z0(objMo4980s0);
            } else if (i12 == 2) {
                i10 = cardRepositoryImpl$updateCardStatus$1.f19521g;
                str4 = cardRepositoryImpl$updateCardStatus$1.f19520f;
                str3 = cardRepositoryImpl$updateCardStatus$1.f19519e;
                cardRepositoryImpl = cardRepositoryImpl$updateCardStatus$1.f19518d;
                C7499b.m14977z0(objMo4980s0);
                C7796d c7796d = cardRepositoryImpl.f19397i;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i10);
                String[] strArr = {"const value", sb2.toString()};
                c7796d.getClass();
                c7796d.m15505b(C7796d.m15504a(strArr), "change_card_status");
                cardRepositoryImpl$updateCardStatus$1.f19518d = null;
                cardRepositoryImpl$updateCardStatus$1.f19519e = null;
                cardRepositoryImpl$updateCardStatus$1.f19520f = null;
                cardRepositoryImpl$updateCardStatus$1.f19524j = 3;
                if (cardRepositoryImpl.m9475y(str3, str4, cardRepositoryImpl$updateCardStatus$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4980s0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$updateCardStatus$1.f19518d = this;
        cardRepositoryImpl$updateCardStatus$1.f19519e = str;
        cardRepositoryImpl$updateCardStatus$1.f19520f = str2;
        cardRepositoryImpl$updateCardStatus$1.f19521g = i10;
        cardRepositoryImpl$updateCardStatus$1.f19524j = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$updateCardStatus$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a != null) {
            if (i10 == CardStatus.Known.getValue()) {
                c8787a.f46589c = CardStatus.Learned.getValue();
                c8787a.f46590d = new Integer(CardExtendedStatus.Known.getValue());
            } else {
                c8787a.f46589c = i10;
                c8787a.f46590d = new Integer(CardExtendedStatus.NotKnown.getValue());
            }
            AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$updateCardStatus$1.f19518d = cardRepositoryImpl;
            cardRepositoryImpl$updateCardStatus$1.f19519e = str;
            cardRepositoryImpl$updateCardStatus$1.f19520f = str2;
            cardRepositoryImpl$updateCardStatus$1.f19521g = i10;
            cardRepositoryImpl$updateCardStatus$1.f19524j = 2;
            if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$updateCardStatus$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            String str5 = str2;
            str3 = str;
            str4 = str5;
            C7796d c7796d2 = cardRepositoryImpl.f19397i;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(i10);
            String[] strArr2 = {"const value", sb3.toString()};
            c7796d2.getClass();
            c7796d2.m15505b(C7796d.m15504a(strArr2), "change_card_status");
            cardRepositoryImpl$updateCardStatus$1.f19518d = null;
            cardRepositoryImpl$updateCardStatus$1.f19519e = null;
            cardRepositoryImpl$updateCardStatus$1.f19520f = null;
            cardRepositoryImpl$updateCardStatus$1.f19524j = 3;
            if (cardRepositoryImpl.m9475y(str3, str4, cardRepositoryImpl$updateCardStatus$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x011d A[LOOP:0: B:31:0x011b->B:32:0x011d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: j */
    public final Object mo5958j(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        CardRepositoryImpl$reviewCard$1 cardRepositoryImpl$reviewCard$1;
        CardRepositoryImpl cardRepositoryImpl;
        String str3;
        int i11;
        String str4;
        String str5;
        String str6;
        String str7;
        CardRepositoryImpl cardRepositoryImpl2;
        Pair[] pairArr;
        int i12;
        C1244b.a aVar;
        if (interfaceC9968c instanceof CardRepositoryImpl$reviewCard$1) {
            cardRepositoryImpl$reviewCard$1 = (CardRepositoryImpl$reviewCard$1) interfaceC9968c;
            int i13 = cardRepositoryImpl$reviewCard$1.f19493j;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$reviewCard$1.f19493j = i13 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$reviewCard$1 = new CardRepositoryImpl$reviewCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$reviewCard$1 = new CardRepositoryImpl$reviewCard$1(this, interfaceC9968c);
        }
        Object obj = cardRepositoryImpl$reviewCard$1.f19491h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i14 = cardRepositoryImpl$reviewCard$1.f19493j;
        if (i14 != 0) {
            if (i14 == 1) {
                i11 = cardRepositoryImpl$reviewCard$1.f19490g;
                str4 = cardRepositoryImpl$reviewCard$1.f19489f;
                str3 = cardRepositoryImpl$reviewCard$1.f19488e;
                cardRepositoryImpl = cardRepositoryImpl$reviewCard$1.f19487d;
                C7499b.m14977z0(obj);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = cardRepositoryImpl$reviewCard$1.f19490g;
                str6 = cardRepositoryImpl$reviewCard$1.f19489f;
                str7 = cardRepositoryImpl$reviewCard$1.f19488e;
                cardRepositoryImpl2 = cardRepositoryImpl$reviewCard$1.f19487d;
                C7499b.m14977z0(obj);
            }
            cardRepositoryImpl2.getClass();
            NetworkType networkType = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            NetworkType networkType2 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType2, "networkType");
            C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
            C1315h.a aVar2 = (C1315h.a) new C1315h.a(CardReviewWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar2.f8071c.f37533j = c1309b;
            Pair pair = new Pair("language", str7);
            pairArr = new Pair[]{pair, new Pair("cardId", Integer.valueOf(i11)), new Pair("term", str6)};
            aVar = new C1244b.a();
            for (i12 = 0; i12 < 3; i12++) {
                Pair pair2 = pairArr[i12];
                aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
            }
            aVar2.f8071c.f37528e = aVar.m4708a();
            cardRepositoryImpl2.f19395g.m4877b(aVar2.m4879a());
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$reviewCard$1.f19487d = this;
        cardRepositoryImpl$reviewCard$1.f19488e = str;
        cardRepositoryImpl$reviewCard$1.f19489f = strM15498b;
        cardRepositoryImpl$reviewCard$1.f19490g = i10;
        cardRepositoryImpl$reviewCard$1.f19493j = 1;
        Object objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$reviewCard$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        str3 = str;
        i11 = i10;
        str4 = strM15498b;
        obj = objMo4980s0;
        C8787a c8787a = (C8787a) obj;
        if (c8787a != null) {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.set(5, calendar.get(5) + 1);
                str5 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(calendar.getTime());
                C5207g.m11110e(str5, "{\n        val calendar =…rmat(calendar.time)\n    }");
            } catch (Exception unused) {
                str5 = "";
            }
            c8787a.f46596j = str5;
            AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$reviewCard$1.f19487d = cardRepositoryImpl;
            cardRepositoryImpl$reviewCard$1.f19488e = str3;
            cardRepositoryImpl$reviewCard$1.f19489f = str4;
            cardRepositoryImpl$reviewCard$1.f19490g = i11;
            cardRepositoryImpl$reviewCard$1.f19493j = 2;
            if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$reviewCard$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str6 = str4;
            str7 = str3;
            cardRepositoryImpl2 = cardRepositoryImpl;
            cardRepositoryImpl2.getClass();
            NetworkType networkType3 = NetworkType.NOT_REQUIRED;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            NetworkType networkType4 = NetworkType.CONNECTED;
            C5207g.m11111f(networkType4, "networkType");
            C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
            C1315h.a aVar3 = (C1315h.a) new C1315h.a(CardReviewWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
            aVar3.f8071c.f37533j = c1309b2;
            Pair pair3 = new Pair("language", str7);
            pairArr = new Pair[]{pair3, new Pair("cardId", Integer.valueOf(i11)), new Pair("term", str6)};
            aVar = new C1244b.a();
            while (i12 < 3) {
                Pair pair4 = pairArr[i12];
                aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
            }
            aVar3.f8071c.f37528e = aVar.m4708a();
            cardRepositoryImpl2.f19395g.m4877b(aVar3.m4879a());
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: k */
    public final InterfaceC7116c<C7374a> mo5959k(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "term");
        return C0062b.m273H0(this.f19390b.mo4973l0(C7793a.m15498b(str, C7793a.m15501e(str2, str))));
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: l */
    public final Object mo5960l(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        CardRepositoryImpl$networkReviewCard$1 cardRepositoryImpl$networkReviewCard$1;
        String str3;
        CardRepositoryImpl cardRepositoryImpl;
        String str4;
        C8787a c8787a;
        AbstractC1388a abstractC1388a;
        if (interfaceC9968c instanceof CardRepositoryImpl$networkReviewCard$1) {
            cardRepositoryImpl$networkReviewCard$1 = (CardRepositoryImpl$networkReviewCard$1) interfaceC9968c;
            int i11 = cardRepositoryImpl$networkReviewCard$1.f19465i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$networkReviewCard$1.f19465i = i11 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$networkReviewCard$1 = new CardRepositoryImpl$networkReviewCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$networkReviewCard$1 = new CardRepositoryImpl$networkReviewCard$1(this, interfaceC9968c);
        }
        Object objM18417b = cardRepositoryImpl$networkReviewCard$1.f19463g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardRepositoryImpl$networkReviewCard$1.f19465i;
        if (i12 != 0) {
            if (i12 == 1) {
                str2 = cardRepositoryImpl$networkReviewCard$1.f19462f;
                String str5 = cardRepositoryImpl$networkReviewCard$1.f19461e;
                CardRepositoryImpl cardRepositoryImpl2 = cardRepositoryImpl$networkReviewCard$1.f19460d;
                C7499b.m14977z0(objM18417b);
                cardRepositoryImpl = cardRepositoryImpl2;
                str3 = str5;
            } else if (i12 == 2) {
                str4 = cardRepositoryImpl$networkReviewCard$1.f19461e;
                cardRepositoryImpl = cardRepositoryImpl$networkReviewCard$1.f19460d;
                C7499b.m14977z0(objM18417b);
                c8787a = (C8787a) objM18417b;
                if (c8787a != null) {
                    c8787a.f46596j = str4;
                    abstractC1388a = cardRepositoryImpl.f19390b;
                    cardRepositoryImpl$networkReviewCard$1.f19460d = null;
                    cardRepositoryImpl$networkReviewCard$1.f19461e = null;
                    cardRepositoryImpl$networkReviewCard$1.f19465i = 3;
                    if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$networkReviewCard$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18417b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18417b);
        Integer num = new Integer(i10);
        cardRepositoryImpl$networkReviewCard$1.f19460d = this;
        cardRepositoryImpl$networkReviewCard$1.f19461e = str;
        cardRepositoryImpl$networkReviewCard$1.f19462f = str2;
        cardRepositoryImpl$networkReviewCard$1.f19465i = 1;
        objM18417b = this.f19393e.m18417b(str, num, cardRepositoryImpl$networkReviewCard$1);
        if (objM18417b == coroutineSingletons) {
            return coroutineSingletons;
        }
        str3 = str;
        cardRepositoryImpl = this;
        String str6 = ((ResultCardReview) objM18417b).f18307a;
        if (str6 != null) {
            AbstractC1388a abstractC1388a2 = cardRepositoryImpl.f19390b;
            String strM15498b = C7793a.m15498b(str3, C7793a.m15501e(str2, str3));
            cardRepositoryImpl$networkReviewCard$1.f19460d = cardRepositoryImpl;
            cardRepositoryImpl$networkReviewCard$1.f19461e = str6;
            cardRepositoryImpl$networkReviewCard$1.f19462f = null;
            cardRepositoryImpl$networkReviewCard$1.f19465i = 2;
            Object objMo4980s0 = abstractC1388a2.mo4980s0(strM15498b, cardRepositoryImpl$networkReviewCard$1);
            if (objMo4980s0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            objM18417b = objMo4980s0;
            str4 = str6;
            c8787a = (C8787a) objM18417b;
            if (c8787a != null) {
                c8787a.f46596j = str4;
                abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$networkReviewCard$1.f19460d = null;
                cardRepositoryImpl$networkReviewCard$1.f19461e = null;
                cardRepositoryImpl$networkReviewCard$1.f19465i = 3;
                if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$networkReviewCard$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: m */
    public final InterfaceC7116c mo5961m(List list, String str) {
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
        return C0062b.m273H0(this.f19390b.mo4978q0(arrayList));
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: n */
    public final InterfaceC7116c<List<C7374a>> mo5962n(int i10) {
        return C0062b.m273H0(this.f19390b.mo4975n0(i10));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: o */
    public final Object mo5963o(String str, String str2, TokenMeaning tokenMeaning, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$updateCardHintLocale$1 cardRepositoryImpl$updateCardHintLocale$1;
        TokenMeaning tokenMeaning2;
        String str4;
        CardRepositoryImpl cardRepositoryImpl;
        CardRepositoryImpl cardRepositoryImpl2;
        String str5;
        String str6;
        String str7 = str;
        String str8 = str2;
        if (interfaceC9968c instanceof CardRepositoryImpl$updateCardHintLocale$1) {
            cardRepositoryImpl$updateCardHintLocale$1 = (CardRepositoryImpl$updateCardHintLocale$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$updateCardHintLocale$1.f19510k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardHintLocale$1.f19510k = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardHintLocale$1 = new CardRepositoryImpl$updateCardHintLocale$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$updateCardHintLocale$1 = new CardRepositoryImpl$updateCardHintLocale$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$updateCardHintLocale$1.f19508i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$updateCardHintLocale$1.f19510k;
        if (i11 != 0) {
            if (i11 == 1) {
                String str9 = cardRepositoryImpl$updateCardHintLocale$1.f19507h;
                TokenMeaning tokenMeaning3 = cardRepositoryImpl$updateCardHintLocale$1.f19506g;
                String str10 = cardRepositoryImpl$updateCardHintLocale$1.f19505f;
                String str11 = cardRepositoryImpl$updateCardHintLocale$1.f19504e;
                CardRepositoryImpl cardRepositoryImpl3 = cardRepositoryImpl$updateCardHintLocale$1.f19503d;
                C7499b.m14977z0(objMo4980s0);
                str4 = str9;
                str7 = str11;
                cardRepositoryImpl = cardRepositoryImpl3;
                tokenMeaning2 = tokenMeaning3;
                str8 = str10;
            } else if (i11 == 2) {
                str6 = cardRepositoryImpl$updateCardHintLocale$1.f19505f;
                str5 = cardRepositoryImpl$updateCardHintLocale$1.f19504e;
                cardRepositoryImpl2 = cardRepositoryImpl$updateCardHintLocale$1.f19503d;
                C7499b.m14977z0(objMo4980s0);
                cardRepositoryImpl = cardRepositoryImpl2;
                String str12 = str5;
                str8 = str6;
                str7 = str12;
                cardRepositoryImpl$updateCardHintLocale$1.f19503d = null;
                cardRepositoryImpl$updateCardHintLocale$1.f19504e = null;
                cardRepositoryImpl$updateCardHintLocale$1.f19505f = null;
                cardRepositoryImpl$updateCardHintLocale$1.f19506g = null;
                cardRepositoryImpl$updateCardHintLocale$1.f19507h = null;
                cardRepositoryImpl$updateCardHintLocale$1.f19510k = 3;
                if (cardRepositoryImpl.m9475y(str7, str8, cardRepositoryImpl$updateCardHintLocale$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4980s0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str7, C7793a.m15501e(str8, str7));
        cardRepositoryImpl$updateCardHintLocale$1.f19503d = this;
        cardRepositoryImpl$updateCardHintLocale$1.f19504e = str7;
        cardRepositoryImpl$updateCardHintLocale$1.f19505f = str8;
        tokenMeaning2 = tokenMeaning;
        cardRepositoryImpl$updateCardHintLocale$1.f19506g = tokenMeaning2;
        str4 = str3;
        cardRepositoryImpl$updateCardHintLocale$1.f19507h = str4;
        cardRepositoryImpl$updateCardHintLocale$1.f19510k = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$updateCardHintLocale$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a != null) {
            int size = c8787a.f46594h.size();
            for (int i12 = 0; i12 < size; i12++) {
                Meaning meaning = c8787a.f46594h.get(i12);
                if (C5207g.m11106a(meaning.f17278c, tokenMeaning2.f22090c)) {
                    meaning.f17277b = str4;
                    c8787a.f46595i = MeaningKt.m9387a(c8787a.f46594h);
                    AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
                    cardRepositoryImpl$updateCardHintLocale$1.f19503d = cardRepositoryImpl;
                    cardRepositoryImpl$updateCardHintLocale$1.f19504e = str7;
                    cardRepositoryImpl$updateCardHintLocale$1.f19505f = str8;
                    cardRepositoryImpl$updateCardHintLocale$1.f19506g = null;
                    cardRepositoryImpl$updateCardHintLocale$1.f19507h = null;
                    cardRepositoryImpl$updateCardHintLocale$1.f19510k = 2;
                    if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$updateCardHintLocale$1) != coroutineSingletons) {
                        cardRepositoryImpl2 = cardRepositoryImpl;
                        String str13 = str8;
                        str5 = str7;
                        str6 = str13;
                        cardRepositoryImpl = cardRepositoryImpl2;
                        String str14 = str5;
                        str8 = str6;
                        str7 = str14;
                        break;
                    }
                    return coroutineSingletons;
                }
            }
        }
        cardRepositoryImpl$updateCardHintLocale$1.f19503d = null;
        cardRepositoryImpl$updateCardHintLocale$1.f19504e = null;
        cardRepositoryImpl$updateCardHintLocale$1.f19505f = null;
        cardRepositoryImpl$updateCardHintLocale$1.f19506g = null;
        cardRepositoryImpl$updateCardHintLocale$1.f19507h = null;
        cardRepositoryImpl$updateCardHintLocale$1.f19510k = 3;
        if (cardRepositoryImpl.m9475y(str7, str8, cardRepositoryImpl$updateCardHintLocale$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: p */
    public final Object mo5964p(int i10, String str, InterfaceC9968c<? super LessonStudySentence> interfaceC9968c) {
        return this.f19392d.mo5147m0(i10, str, interfaceC9968c);
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: q */
    public final Object mo5965q(String str, String str2, InterfaceC9968c<? super C7374a> interfaceC9968c) {
        return this.f19390b.mo4983v0(C7793a.m15498b(str, C7793a.m15501e(str2, str)), interfaceC9968c);
    }

    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: r */
    public final InterfaceC7116c mo5966r(List list, String str) {
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
        return C0062b.m273H0(this.f19390b.mo4976o0(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: s */
    public final Object mo5967s(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$insertCardTag$1 cardRepositoryImpl$insertCardTag$1;
        CardRepositoryImpl cardRepositoryImpl;
        CardRepositoryImpl cardRepositoryImpl2;
        String str4;
        String str5;
        if (interfaceC9968c instanceof CardRepositoryImpl$insertCardTag$1) {
            cardRepositoryImpl$insertCardTag$1 = (CardRepositoryImpl$insertCardTag$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$insertCardTag$1.f19445j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertCardTag$1.f19445j = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertCardTag$1 = new CardRepositoryImpl$insertCardTag$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$insertCardTag$1 = new CardRepositoryImpl$insertCardTag$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$insertCardTag$1.f19443h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$insertCardTag$1.f19445j;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = cardRepositoryImpl$insertCardTag$1.f19442g;
                str2 = cardRepositoryImpl$insertCardTag$1.f19441f;
                str = cardRepositoryImpl$insertCardTag$1.f19440e;
                cardRepositoryImpl = cardRepositoryImpl$insertCardTag$1.f19439d;
                C7499b.m14977z0(objMo4980s0);
            } else if (i11 == 2) {
                str5 = cardRepositoryImpl$insertCardTag$1.f19441f;
                str4 = cardRepositoryImpl$insertCardTag$1.f19440e;
                cardRepositoryImpl2 = cardRepositoryImpl$insertCardTag$1.f19439d;
                C7499b.m14977z0(objMo4980s0);
                cardRepositoryImpl$insertCardTag$1.f19439d = null;
                cardRepositoryImpl$insertCardTag$1.f19440e = null;
                cardRepositoryImpl$insertCardTag$1.f19441f = null;
                cardRepositoryImpl$insertCardTag$1.f19445j = 3;
                if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$insertCardTag$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo4980s0);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str2, str));
        cardRepositoryImpl$insertCardTag$1.f19439d = this;
        cardRepositoryImpl$insertCardTag$1.f19440e = str;
        cardRepositoryImpl$insertCardTag$1.f19441f = str2;
        cardRepositoryImpl$insertCardTag$1.f19442g = str3;
        cardRepositoryImpl$insertCardTag$1.f19445j = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$insertCardTag$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(c8787a.f46591e);
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
            } while (!C5207g.m11106a((String) it.next(), str3));
            if (!z10) {
                arrayList.add(str3);
            }
            c8787a.f46591e = arrayList;
            AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$insertCardTag$1.f19439d = cardRepositoryImpl;
            cardRepositoryImpl$insertCardTag$1.f19440e = str;
            cardRepositoryImpl$insertCardTag$1.f19441f = str2;
            cardRepositoryImpl$insertCardTag$1.f19442g = null;
            cardRepositoryImpl$insertCardTag$1.f19445j = 2;
            if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$insertCardTag$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardRepositoryImpl2 = cardRepositoryImpl;
            String str6 = str2;
            str4 = str;
            str5 = str6;
            cardRepositoryImpl$insertCardTag$1.f19439d = null;
            cardRepositoryImpl$insertCardTag$1.f19440e = null;
            cardRepositoryImpl$insertCardTag$1.f19441f = null;
            cardRepositoryImpl$insertCardTag$1.f19445j = 3;
            if (cardRepositoryImpl2.m9475y(str4, str5, cardRepositoryImpl$insertCardTag$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be A[LOOP:0: B:32:0x00b8->B:34:0x00be, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f3 A[LOOP:1: B:39:0x00ea->B:41:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x015a  */
    /* JADX WARN: Code duplicated, block: B:46:0x016f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0170  */
    /* JADX WARN: Code duplicated, block: B:53:0x0118 A[EDGE_INSN: B:53:0x0118->B:42:0x0118 BREAK  A[LOOP:1: B:39:0x00ea->B:41:0x00f3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [vl.a] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: t */
    public final Object mo5968t(String str, int i10, RequestDataCard requestDataCard, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$networkUpdateCard$1 cardRepositoryImpl$networkUpdateCard$1;
        CardRepositoryImpl cardRepositoryImpl;
        String str2;
        ResultVocabularyCard resultVocabularyCard;
        C8787a c8787a;
        ArrayList arrayList;
        Iterator<T> it;
        int iM14941g0;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        C9333u c9333u;
        Card cardM11175r;
        AbstractC1388a abstractC1388a;
        if (interfaceC9968c instanceof CardRepositoryImpl$networkUpdateCard$1) {
            cardRepositoryImpl$networkUpdateCard$1 = (CardRepositoryImpl$networkUpdateCard$1) interfaceC9968c;
            int i11 = cardRepositoryImpl$networkUpdateCard$1.f19471i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$networkUpdateCard$1.f19471i = i11 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$networkUpdateCard$1 = new CardRepositoryImpl$networkUpdateCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$networkUpdateCard$1 = new CardRepositoryImpl$networkUpdateCard$1(this, interfaceC9968c);
        }
        Object objM18422g = cardRepositoryImpl$networkUpdateCard$1.f19469g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardRepositoryImpl$networkUpdateCard$1.f19471i;
        if (i12 != 0) {
            if (i12 == 1) {
                str = cardRepositoryImpl$networkUpdateCard$1.f19467e;
                CardRepositoryImpl cardRepositoryImpl2 = cardRepositoryImpl$networkUpdateCard$1.f19466d;
                C7499b.m14977z0(objM18422g);
                cardRepositoryImpl = cardRepositoryImpl2;
            } else {
                if (i12 == 2) {
                    resultVocabularyCard = cardRepositoryImpl$networkUpdateCard$1.f19468f;
                    str2 = cardRepositoryImpl$networkUpdateCard$1.f19467e;
                    cardRepositoryImpl = cardRepositoryImpl$networkUpdateCard$1.f19466d;
                    C7499b.m14977z0(objM18422g);
                    c8787a = (C8787a) objM18422g;
                    if (c8787a != null) {
                        List<Meaning> list = c8787a.f46594h;
                        arrayList = new ArrayList(C9325m.m17681z(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            C0009a.m30s(((Meaning) it.next()).f17276a, arrayList);
                        }
                        C9332t c9332tM13458z0 = C6752c.m13458z0(arrayList);
                        iM14941g0 = C7499b.m14941g0(C9325m.m17681z(c9332tM13458z0, 10));
                        if (iM14941g0 < 16) {
                            iM14941g0 = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM14941g0);
                        it2 = c9332tM13458z0.iterator();
                        while (true) {
                            c9333u = (C9333u) it2;
                            if (c9333u.hasNext()) {
                                break;
                            }
                            C9331s c9331s = (C9331s) c9333u.next();
                            linkedHashMap.put(new Integer(((Number) c9331s.f48067b).intValue()), new Integer(c9331s.f48066a));
                        }
                        List<Meaning> listM13447o0 = C6752c.m13447o0(resultVocabularyCard.f19061l, new C3316a(new Comparator() { // from class: vl.a

                            /* JADX INFO: renamed from: a */
                            public final /* synthetic */ Comparator f49822a = C9758b.f49823a;

                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                Comparator comparator = this.f49822a;
                                C5207g.m11111f(comparator, "$comparator");
                                if (obj == obj2) {
                                    return 0;
                                }
                                if (obj == null) {
                                    return 1;
                                }
                                if (obj2 == null) {
                                    return -1;
                                }
                                return comparator.compare(obj, obj2);
                            }
                        }, linkedHashMap));
                        C5207g.m11111f(listM13447o0, "<set-?>");
                        resultVocabularyCard.f19061l = listM13447o0;
                        String str3 = resultVocabularyCard.f19050a;
                        cardM11175r = C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(str2, C7793a.m15501e(str3, str2)), C5408a.m11573f(str3));
                        if (cardM11175r.f16859f != CardStatus.Ignored.getValue()) {
                            abstractC1388a = cardRepositoryImpl.f19390b;
                            cardRepositoryImpl$networkUpdateCard$1.f19466d = null;
                            cardRepositoryImpl$networkUpdateCard$1.f19467e = null;
                            cardRepositoryImpl$networkUpdateCard$1.f19468f = null;
                            cardRepositoryImpl$networkUpdateCard$1.f19471i = 3;
                            if (abstractC1388a.mo598h0(cardM11175r, cardRepositoryImpl$networkUpdateCard$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18422g);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18422g);
        Integer num = new Integer(i10);
        cardRepositoryImpl$networkUpdateCard$1.f19466d = this;
        cardRepositoryImpl$networkUpdateCard$1.f19467e = str;
        cardRepositoryImpl$networkUpdateCard$1.f19471i = 1;
        objM18422g = this.f19393e.m18422g(str, num, requestDataCard, cardRepositoryImpl$networkUpdateCard$1);
        if (objM18422g == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        ResultVocabularyCard resultVocabularyCard2 = (ResultVocabularyCard) objM18422g;
        AbstractC1388a abstractC1388a2 = cardRepositoryImpl.f19390b;
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(resultVocabularyCard2.f19050a, str));
        cardRepositoryImpl$networkUpdateCard$1.f19466d = cardRepositoryImpl;
        cardRepositoryImpl$networkUpdateCard$1.f19467e = str;
        cardRepositoryImpl$networkUpdateCard$1.f19468f = resultVocabularyCard2;
        cardRepositoryImpl$networkUpdateCard$1.f19471i = 2;
        objM18422g = abstractC1388a2.mo4980s0(strM15498b, cardRepositoryImpl$networkUpdateCard$1);
        if (objM18422g == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        resultVocabularyCard = resultVocabularyCard2;
        c8787a = (C8787a) objM18422g;
        if (c8787a != null) {
            List<Meaning> list2 = c8787a.f46594h;
            arrayList = new ArrayList(C9325m.m17681z(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                C0009a.m30s(((Meaning) it.next()).f17276a, arrayList);
            }
            C9332t c9332tM13458z1 = C6752c.m13458z0(arrayList);
            iM14941g0 = C7499b.m14941g0(C9325m.m17681z(c9332tM13458z1, 10));
            if (iM14941g0 < 16) {
                iM14941g0 = 16;
            }
            linkedHashMap = new LinkedHashMap(iM14941g0);
            it2 = c9332tM13458z1.iterator();
            while (true) {
                c9333u = (C9333u) it2;
                if (c9333u.hasNext()) {
                    break;
                    break;
                }
                C9331s c9331s2 = (C9331s) c9333u.next();
                linkedHashMap.put(new Integer(((Number) c9331s2.f48067b).intValue()), new Integer(c9331s2.f48066a));
            }
            List<Meaning> listM13447o1 = C6752c.m13447o0(resultVocabularyCard.f19061l, new C3316a(new Comparator() { // from class: vl.a

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ Comparator f49822a = C9758b.f49823a;

                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Comparator comparator = this.f49822a;
                    C5207g.m11111f(comparator, "$comparator");
                    if (obj == obj2) {
                        return 0;
                    }
                    if (obj == null) {
                        return 1;
                    }
                    if (obj2 == null) {
                        return -1;
                    }
                    return comparator.compare(obj, obj2);
                }
            }, linkedHashMap));
            C5207g.m11111f(listM13447o1, "<set-?>");
            resultVocabularyCard.f19061l = listM13447o1;
            String str4 = resultVocabularyCard.f19050a;
            cardM11175r = C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(str2, C7793a.m15501e(str4, str2)), C5408a.m11573f(str4));
            if (cardM11175r.f16859f != CardStatus.Ignored.getValue()) {
                abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$networkUpdateCard$1.f19466d = null;
                cardRepositoryImpl$networkUpdateCard$1.f19467e = null;
                cardRepositoryImpl$networkUpdateCard$1.f19468f = null;
                cardRepositoryImpl$networkUpdateCard$1.f19471i = 3;
                if (abstractC1388a.mo598h0(cardM11175r, cardRepositoryImpl$networkUpdateCard$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: u */
    public final Object mo5969u(int i10, String str, String str2, TokenMeaning tokenMeaning, int i11, String str3, String str4, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$insertCard$1 cardRepositoryImpl$insertCard$1;
        if (interfaceC9968c instanceof CardRepositoryImpl$insertCard$1) {
            cardRepositoryImpl$insertCard$1 = (CardRepositoryImpl$insertCard$1) interfaceC9968c;
            int i12 = cardRepositoryImpl$insertCard$1.f19419f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertCard$1.f19419f = i12 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertCard$1 = new CardRepositoryImpl$insertCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$insertCard$1 = new CardRepositoryImpl$insertCard$1(this, interfaceC9968c);
        }
        CardRepositoryImpl$insertCard$1 cardRepositoryImpl$insertCard$2 = cardRepositoryImpl$insertCard$1;
        Object obj = cardRepositoryImpl$insertCard$2.f19417d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i13 = cardRepositoryImpl$insertCard$2.f19419f;
        if (i13 == 0) {
            C7499b.m14977z0(obj);
            CardRepositoryImpl$insertCard$2 cardRepositoryImpl$insertCard$3 = new CardRepositoryImpl$insertCard$2(this, tokenMeaning, new Ref$BooleanRef(), C7793a.m15498b(str, C7793a.m15501e(str2, str)), str, i11, str2, str3, i10, str4, null);
            cardRepositoryImpl$insertCard$2.f19419f = 1;
            if (RoomDatabaseKt.m4573a(this.f19389a, cardRepositoryImpl$insertCard$3, cardRepositoryImpl$insertCard$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return new Integer(-1);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    /* JADX WARN: Code duplicated, block: B:46:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x0154  */
    /* JADX WARN: Code duplicated, block: B:50:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.lingq.shared.repository.CardRepositoryImpl, java.lang.String] */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: v */
    public final Object mo5970v(String str, String str2, TokenMeaning tokenMeaning, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$insertHint$1 cardRepositoryImpl$insertHint$1;
        TokenMeaning tokenMeaning2;
        CardRepositoryImpl cardRepositoryImpl;
        String str3;
        String str4;
        C8787a c8787a;
        Object next;
        TokenMeaning tokenMeaning3;
        Object obj;
        ArrayList arrayList;
        Word word;
        int i10;
        AbstractC1388a abstractC1388a;
        ?? r10;
        CardRepositoryImpl cardRepositoryImpl2;
        String str5 = str2;
        if (interfaceC9968c instanceof CardRepositoryImpl$insertHint$1) {
            cardRepositoryImpl$insertHint$1 = (CardRepositoryImpl$insertHint$1) interfaceC9968c;
            int i11 = cardRepositoryImpl$insertHint$1.f19454l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertHint$1.f19454l = i11 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertHint$1 = new CardRepositoryImpl$insertHint$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$insertHint$1 = new CardRepositoryImpl$insertHint$1(this, interfaceC9968c);
        }
        Object obj2 = cardRepositoryImpl$insertHint$1.f19452j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardRepositoryImpl$insertHint$1.f19454l;
        if (i12 != 0) {
            if (i12 == 1) {
                str4 = (String) cardRepositoryImpl$insertHint$1.f19450h;
                TokenMeaning tokenMeaning4 = cardRepositoryImpl$insertHint$1.f19449g;
                String str6 = cardRepositoryImpl$insertHint$1.f19448f;
                str3 = cardRepositoryImpl$insertHint$1.f19447e;
                cardRepositoryImpl = cardRepositoryImpl$insertHint$1.f19446d;
                C7499b.m14977z0(obj2);
                tokenMeaning2 = tokenMeaning4;
                str5 = str6;
            } else if (i12 == 2) {
                arrayList = cardRepositoryImpl$insertHint$1.f19451i;
                C8787a c8787a2 = (C8787a) cardRepositoryImpl$insertHint$1.f19450h;
                TokenMeaning tokenMeaning5 = cardRepositoryImpl$insertHint$1.f19449g;
                String str7 = cardRepositoryImpl$insertHint$1.f19448f;
                str3 = cardRepositoryImpl$insertHint$1.f19447e;
                cardRepositoryImpl = cardRepositoryImpl$insertHint$1.f19446d;
                C7499b.m14977z0(obj2);
                tokenMeaning3 = tokenMeaning5;
                obj = obj2;
                c8787a = c8787a2;
                str5 = str7;
                word = (Word) obj;
                int i13 = tokenMeaning3.f22088a;
                String str8 = tokenMeaning3.f22089b;
                String str9 = tokenMeaning3.f22090c;
                int i14 = tokenMeaning3.f22091d;
                boolean z10 = tokenMeaning3.f22092e;
                String str10 = tokenMeaning3.f22093f;
                boolean z11 = tokenMeaning3.f22094g;
                if (word != null) {
                    i10 = word.f17578c;
                } else {
                    i10 = tokenMeaning3.f22095h;
                }
                arrayList.add(new Meaning(i13, str8, str9, 0, i14, z10, str10, null, z11, i10, 8, null));
                c8787a.getClass();
                c8787a.f46594h = arrayList;
                c8787a.f46595i = MeaningKt.m9387a(arrayList);
                abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$insertHint$1.f19446d = cardRepositoryImpl;
                cardRepositoryImpl$insertHint$1.f19447e = str3;
                cardRepositoryImpl$insertHint$1.f19448f = str5;
                r10 = 0;
                cardRepositoryImpl$insertHint$1.f19449g = null;
                cardRepositoryImpl$insertHint$1.f19450h = null;
                cardRepositoryImpl$insertHint$1.f19451i = null;
                cardRepositoryImpl$insertHint$1.f19454l = 3;
                if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$insertHint$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cardRepositoryImpl2 = cardRepositoryImpl;
                cardRepositoryImpl$insertHint$1.f19446d = r10;
                cardRepositoryImpl$insertHint$1.f19447e = r10;
                cardRepositoryImpl$insertHint$1.f19448f = r10;
                cardRepositoryImpl$insertHint$1.f19454l = 4;
                if (cardRepositoryImpl2.m9475y(str3, str5, cardRepositoryImpl$insertHint$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i12 == 3) {
                String str11 = cardRepositoryImpl$insertHint$1.f19448f;
                String str12 = cardRepositoryImpl$insertHint$1.f19447e;
                cardRepositoryImpl2 = cardRepositoryImpl$insertHint$1.f19446d;
                C7499b.m14977z0(obj2);
                str3 = str12;
                str5 = str11;
                r10 = 0;
                cardRepositoryImpl$insertHint$1.f19446d = r10;
                cardRepositoryImpl$insertHint$1.f19447e = r10;
                cardRepositoryImpl$insertHint$1.f19448f = r10;
                cardRepositoryImpl$insertHint$1.f19454l = 4;
                if (cardRepositoryImpl2.m9475y(str3, str5, cardRepositoryImpl$insertHint$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj2);
            }
            return Boolean.TRUE;
        }
        C7499b.m14977z0(obj2);
        String strM15498b = C7793a.m15498b(str, C7793a.m15501e(str5, str));
        cardRepositoryImpl$insertHint$1.f19446d = this;
        cardRepositoryImpl$insertHint$1.f19447e = str;
        cardRepositoryImpl$insertHint$1.f19448f = str5;
        tokenMeaning2 = tokenMeaning;
        cardRepositoryImpl$insertHint$1.f19449g = tokenMeaning2;
        cardRepositoryImpl$insertHint$1.f19450h = strM15498b;
        cardRepositoryImpl$insertHint$1.f19454l = 1;
        Object objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$insertHint$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        str3 = str;
        str4 = strM15498b;
        obj2 = objMo4980s0;
        c8787a = (C8787a) obj2;
        if (c8787a == null) {
            return Boolean.FALSE;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(c8787a.f46594h);
        Iterator it = arrayList2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C5207g.m11106a(((Meaning) next).f17278c, tokenMeaning2.f22090c));
        if (((Meaning) next) == null) {
            AbstractC1562x5 abstractC1562x5 = cardRepositoryImpl.f19391c;
            cardRepositoryImpl$insertHint$1.f19446d = cardRepositoryImpl;
            cardRepositoryImpl$insertHint$1.f19447e = str3;
            cardRepositoryImpl$insertHint$1.f19448f = str5;
            cardRepositoryImpl$insertHint$1.f19449g = tokenMeaning2;
            cardRepositoryImpl$insertHint$1.f19450h = c8787a;
            cardRepositoryImpl$insertHint$1.f19451i = arrayList2;
            cardRepositoryImpl$insertHint$1.f19454l = 2;
            Object objMo5235q0 = abstractC1562x5.mo5235q0(str4, cardRepositoryImpl$insertHint$1);
            if (objMo5235q0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            tokenMeaning3 = tokenMeaning2;
            obj = objMo5235q0;
            arrayList = arrayList2;
            word = (Word) obj;
            int i15 = tokenMeaning3.f22088a;
            String str13 = tokenMeaning3.f22089b;
            String str14 = tokenMeaning3.f22090c;
            int i16 = tokenMeaning3.f22091d;
            boolean z12 = tokenMeaning3.f22092e;
            String str15 = tokenMeaning3.f22093f;
            boolean z13 = tokenMeaning3.f22094g;
            if (word != null) {
                i10 = word.f17578c;
            } else {
                i10 = tokenMeaning3.f22095h;
            }
            arrayList.add(new Meaning(i15, str13, str14, 0, i16, z12, str15, null, z13, i10, 8, null));
            c8787a.getClass();
            c8787a.f46594h = arrayList;
            c8787a.f46595i = MeaningKt.m9387a(arrayList);
            abstractC1388a = cardRepositoryImpl.f19390b;
            cardRepositoryImpl$insertHint$1.f19446d = cardRepositoryImpl;
            cardRepositoryImpl$insertHint$1.f19447e = str3;
            cardRepositoryImpl$insertHint$1.f19448f = str5;
            r10 = 0;
            cardRepositoryImpl$insertHint$1.f19449g = null;
            cardRepositoryImpl$insertHint$1.f19450h = null;
            cardRepositoryImpl$insertHint$1.f19451i = null;
            cardRepositoryImpl$insertHint$1.f19454l = 3;
            if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$insertHint$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardRepositoryImpl2 = cardRepositoryImpl;
            cardRepositoryImpl$insertHint$1.f19446d = r10;
            cardRepositoryImpl$insertHint$1.f19447e = r10;
            cardRepositoryImpl$insertHint$1.f19448f = r10;
            cardRepositoryImpl$insertHint$1.f19454l = 4;
            if (cardRepositoryImpl2.m9475y(str3, str5, cardRepositoryImpl$insertHint$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: w */
    public final Object mo5971w(String str, String str2, TokenMeaning tokenMeaning, String str3, InterfaceC9968c<? super Integer> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$updateCardHint$1 cardRepositoryImpl$updateCardHint$1;
        TokenMeaning tokenMeaning2;
        String str4;
        CardRepositoryImpl cardRepositoryImpl;
        String str5;
        int i10;
        String str6 = str;
        String str7 = str2;
        if (interfaceC9968c instanceof CardRepositoryImpl$updateCardHint$1) {
            cardRepositoryImpl$updateCardHint$1 = (CardRepositoryImpl$updateCardHint$1) interfaceC9968c;
            int i11 = cardRepositoryImpl$updateCardHint$1.f19502l;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardHint$1.f19502l = i11 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardHint$1 = new CardRepositoryImpl$updateCardHint$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$updateCardHint$1 = new CardRepositoryImpl$updateCardHint$1(this, interfaceC9968c);
        }
        Object objMo4980s0 = cardRepositoryImpl$updateCardHint$1.f19500j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = cardRepositoryImpl$updateCardHint$1.f19502l;
        if (i12 != 0) {
            if (i12 == 1) {
                String str8 = cardRepositoryImpl$updateCardHint$1.f19498h;
                TokenMeaning tokenMeaning3 = cardRepositoryImpl$updateCardHint$1.f19497g;
                String str9 = cardRepositoryImpl$updateCardHint$1.f19496f;
                String str10 = cardRepositoryImpl$updateCardHint$1.f19495e;
                CardRepositoryImpl cardRepositoryImpl2 = cardRepositoryImpl$updateCardHint$1.f19494d;
                C7499b.m14977z0(objMo4980s0);
                str4 = str8;
                str6 = str10;
                cardRepositoryImpl = cardRepositoryImpl2;
                tokenMeaning2 = tokenMeaning3;
                str7 = str9;
            } else if (i12 == 2) {
                i10 = cardRepositoryImpl$updateCardHint$1.f19499i;
                str7 = cardRepositoryImpl$updateCardHint$1.f19496f;
                str5 = cardRepositoryImpl$updateCardHint$1.f19495e;
                cardRepositoryImpl = cardRepositoryImpl$updateCardHint$1.f19494d;
                C7499b.m14977z0(objMo4980s0);
                cardRepositoryImpl.f19397i.m15505b(null, "create_new_hint");
                cardRepositoryImpl$updateCardHint$1.f19494d = null;
                cardRepositoryImpl$updateCardHint$1.f19495e = null;
                cardRepositoryImpl$updateCardHint$1.f19496f = null;
                cardRepositoryImpl$updateCardHint$1.f19497g = null;
                cardRepositoryImpl$updateCardHint$1.f19498h = null;
                cardRepositoryImpl$updateCardHint$1.f19499i = i10;
                cardRepositoryImpl$updateCardHint$1.f19502l = 3;
                if (cardRepositoryImpl.m9475y(str5, str7, cardRepositoryImpl$updateCardHint$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = cardRepositoryImpl$updateCardHint$1.f19499i;
                C7499b.m14977z0(objMo4980s0);
            }
            return new Integer(i10);
        }
        C7499b.m14977z0(objMo4980s0);
        String strM15498b = C7793a.m15498b(str6, C7793a.m15501e(str7, str6));
        cardRepositoryImpl$updateCardHint$1.f19494d = this;
        cardRepositoryImpl$updateCardHint$1.f19495e = str6;
        cardRepositoryImpl$updateCardHint$1.f19496f = str7;
        tokenMeaning2 = tokenMeaning;
        cardRepositoryImpl$updateCardHint$1.f19497g = tokenMeaning2;
        str4 = str3;
        cardRepositoryImpl$updateCardHint$1.f19498h = str4;
        cardRepositoryImpl$updateCardHint$1.f19502l = 1;
        objMo4980s0 = this.f19390b.mo4980s0(strM15498b, cardRepositoryImpl$updateCardHint$1);
        if (objMo4980s0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        C8787a c8787a = (C8787a) objMo4980s0;
        if (c8787a == null) {
            return new Integer(-1);
        }
        int size = c8787a.f46594h.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                str5 = str6;
                i10 = 0;
                break;
            }
            Meaning meaning = c8787a.f46594h.get(i13);
            if (C5207g.m11106a(meaning.f17278c, tokenMeaning2.f22090c)) {
                meaning.f17278c = str4;
                c8787a.f46595i = MeaningKt.m9387a(c8787a.f46594h);
                AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
                cardRepositoryImpl$updateCardHint$1.f19494d = cardRepositoryImpl;
                cardRepositoryImpl$updateCardHint$1.f19495e = str6;
                cardRepositoryImpl$updateCardHint$1.f19496f = str7;
                cardRepositoryImpl$updateCardHint$1.f19497g = null;
                cardRepositoryImpl$updateCardHint$1.f19498h = null;
                cardRepositoryImpl$updateCardHint$1.f19499i = i13;
                cardRepositoryImpl$updateCardHint$1.f19502l = 2;
                if (abstractC1388a.mo4984w0(c8787a, cardRepositoryImpl$updateCardHint$1) != coroutineSingletons) {
                    str5 = str6;
                    i10 = i13;
                    cardRepositoryImpl.f19397i.m15505b(null, "create_new_hint");
                    break;
                }
                return coroutineSingletons;
            }
            i13++;
        }
        cardRepositoryImpl$updateCardHint$1.f19494d = null;
        cardRepositoryImpl$updateCardHint$1.f19495e = null;
        cardRepositoryImpl$updateCardHint$1.f19496f = null;
        cardRepositoryImpl$updateCardHint$1.f19497g = null;
        cardRepositoryImpl$updateCardHint$1.f19498h = null;
        cardRepositoryImpl$updateCardHint$1.f19499i = i10;
        cardRepositoryImpl$updateCardHint$1.f19502l = 3;
        if (cardRepositoryImpl.m9475y(str5, str7, cardRepositoryImpl$updateCardHint$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new Integer(i10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2008a
    /* JADX INFO: renamed from: x */
    public final Object mo5972x(String str, RequestDataCard requestDataCard, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$networkCreateCard$1 cardRepositoryImpl$networkCreateCard$1;
        CardRepositoryImpl cardRepositoryImpl;
        if (interfaceC9968c instanceof CardRepositoryImpl$networkCreateCard$1) {
            cardRepositoryImpl$networkCreateCard$1 = (CardRepositoryImpl$networkCreateCard$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$networkCreateCard$1.f19459h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$networkCreateCard$1.f19459h = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$networkCreateCard$1 = new CardRepositoryImpl$networkCreateCard$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$networkCreateCard$1 = new CardRepositoryImpl$networkCreateCard$1(this, interfaceC9968c);
        }
        Object objM18416a = cardRepositoryImpl$networkCreateCard$1.f19457f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$networkCreateCard$1.f19459h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = cardRepositoryImpl$networkCreateCard$1.f19456e;
                cardRepositoryImpl = cardRepositoryImpl$networkCreateCard$1.f19455d;
                C7499b.m14977z0(objM18416a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18416a);
            }
        }
        C7499b.m14977z0(objM18416a);
        cardRepositoryImpl$networkCreateCard$1.f19455d = this;
        cardRepositoryImpl$networkCreateCard$1.f19456e = str;
        cardRepositoryImpl$networkCreateCard$1.f19459h = 1;
        objM18416a = this.f19393e.m18416a(str, requestDataCard, cardRepositoryImpl$networkCreateCard$1);
        if (objM18416a == coroutineSingletons) {
            return coroutineSingletons;
        }
        cardRepositoryImpl = this;
        ResultVocabularyCard resultVocabularyCard = (ResultVocabularyCard) objM18416a;
        Card cardM11175r = C5212l.m11175r(resultVocabularyCard, C7793a.m15498b(str, C7793a.m15501e(resultVocabularyCard.f19050a, str)), C5408a.m11573f(resultVocabularyCard.f19050a));
        AbstractC1388a abstractC1388a = cardRepositoryImpl.f19390b;
        cardRepositoryImpl$networkCreateCard$1.f19455d = null;
        cardRepositoryImpl$networkCreateCard$1.f19456e = null;
        cardRepositoryImpl$networkCreateCard$1.f19459h = 2;
        return abstractC1388a.mo598h0(cardM11175r, cardRepositoryImpl$networkCreateCard$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final Object m9475y(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        CardRepositoryImpl$dispatchCardUpdateWorker$1 cardRepositoryImpl$dispatchCardUpdateWorker$1;
        Ref$IntRef ref$IntRef;
        RequestDataCard requestDataCard;
        Object objMo4979r0;
        CardRepositoryImpl cardRepositoryImpl;
        String str3;
        String str4 = str;
        String str5 = str2;
        if (interfaceC9968c instanceof CardRepositoryImpl$dispatchCardUpdateWorker$1) {
            cardRepositoryImpl$dispatchCardUpdateWorker$1 = (CardRepositoryImpl$dispatchCardUpdateWorker$1) interfaceC9968c;
            int i10 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19416k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$dispatchCardUpdateWorker$1.f19416k = i10 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$dispatchCardUpdateWorker$1 = new CardRepositoryImpl$dispatchCardUpdateWorker$1(this, interfaceC9968c);
            }
        } else {
            cardRepositoryImpl$dispatchCardUpdateWorker$1 = new CardRepositoryImpl$dispatchCardUpdateWorker$1(this, interfaceC9968c);
        }
        Object obj = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19414i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19416k;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            ref$IntRef = new Ref$IntRef();
            ref$IntRef.f38125a = CardStatus.Ignored.getValue();
            requestDataCard = new RequestDataCard();
            String strM15498b = C7793a.m15498b(str4, C7793a.m15501e(str5, str4));
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19409d = this;
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19410e = str4;
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19411f = str5;
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19412g = ref$IntRef;
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19413h = requestDataCard;
            cardRepositoryImpl$dispatchCardUpdateWorker$1.f19416k = 1;
            objMo4979r0 = this.f19390b.mo4979r0(strM15498b, cardRepositoryImpl$dispatchCardUpdateWorker$1);
            if (objMo4979r0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            cardRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            RequestDataCard requestDataCard2 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19413h;
            Ref$IntRef ref$IntRef2 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19412g;
            String str6 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19411f;
            String str7 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19410e;
            CardRepositoryImpl cardRepositoryImpl2 = cardRepositoryImpl$dispatchCardUpdateWorker$1.f19409d;
            C7499b.m14977z0(obj);
            requestDataCard = requestDataCard2;
            str4 = str7;
            ref$IntRef = ref$IntRef2;
            str5 = str6;
            cardRepositoryImpl = cardRepositoryImpl2;
            objMo4979r0 = obj;
        }
        Card card = (Card) objMo4979r0;
        if (card != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Meaning> it = card.f16866m.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                str3 = card.f16854a;
                if (!zHasNext) {
                    break;
                }
                Meaning next = it.next();
                RequestHintUpdate requestHintUpdate = new RequestHintUpdate();
                requestHintUpdate.f18072c = str3;
                requestHintUpdate.f18070a = next.f17277b;
                requestHintUpdate.f18071b = next.f17278c;
                requestHintUpdate.f18073d = next.f17284i;
                arrayList.add(requestHintUpdate);
            }
            ref$IntRef.f38125a = C5408a.m11568a(card.f16859f, card.f16860g);
            requestDataCard.f18047a = str3;
            requestDataCard.f18048b = card.f16858e;
            requestDataCard.f18051e = card.f16863j;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : card.f16868o) {
                if (!(((String) obj2).length() == 0)) {
                    arrayList2.add(obj2);
                }
            }
            requestDataCard.f18053g = arrayList2;
            requestDataCard.f18052f = arrayList;
        }
        if (ref$IntRef.f38125a == CardStatus.Known.getValue()) {
            requestDataCard.f18049c = CardStatus.Learned.getValue();
            requestDataCard.f18050d = new Integer(CardExtendedStatus.Known.getValue());
        } else {
            requestDataCard.f18049c = ref$IntRef.f38125a;
            requestDataCard.f18050d = new Integer(CardExtendedStatus.NotKnown.getValue());
        }
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(CardUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str4), new Pair("cardTerm", str5), new Pair("data", cardRepositoryImpl.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i12 = 0; i12 < 3; i12++) {
            Pair pair = pairArr[i12];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        cardRepositoryImpl.f19395g.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }
}
