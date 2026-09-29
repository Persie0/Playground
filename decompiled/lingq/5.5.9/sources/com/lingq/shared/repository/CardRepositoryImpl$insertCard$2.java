package com.lingq.shared.repository;

import android.os.Bundle;
import android.support.v4.media.C0141b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1388a;
import bi.AbstractC1495o1;
import bi.AbstractC1562x5;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.Card;
import com.lingq.entity.Lesson;
import com.lingq.entity.Meaning;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.network.requests.RequestDataCard;
import com.lingq.shared.network.requests.RequestHintUpdate;
import com.lingq.shared.network.workers.CardCreateWorker;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2;
import com.lingq.shared.uimodel.CardExtendedStatus;
import com.lingq.shared.uimodel.CardStatus;
import com.lingq.shared.uimodel.WordStatus;
import com.lingq.shared.uimodel.token.TokenMeaning;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.text.C7076b;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import mo.C7661i;
import ni.C7796d;
import p026b5.C1309b;
import p026b5.C1315h;
import p076di.InterfaceC5180b;
import p096ei.C5408a;
import p260m8.C7499b;
import p367rh.C8799m;
import p367rh.C8808v;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.shared.repository.CardRepositoryImpl$insertCard$2", m19206f = "CardRepository.kt", m19207l = {253, 259, 287, 320, 322, 324, 328, 331, 332}, m19208m = "invokeSuspend")
public final class CardRepositoryImpl$insertCard$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public int f19420H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ CardRepositoryImpl f19421I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ TokenMeaning f19422J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Ref$BooleanRef f19423K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ String f19424L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ String f19425M;

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ int f19426N;

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ String f19427O;

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ String f19428P;

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ int f19429Q;

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ String f19430R;

    /* JADX INFO: renamed from: e */
    public Object f19431e;

    /* JADX INFO: renamed from: f */
    public Object f19432f;

    /* JADX INFO: renamed from: g */
    public Cloneable f19433g;

    /* JADX INFO: renamed from: h */
    public Object f19434h;

    /* JADX INFO: renamed from: i */
    public Object f19435i;

    /* JADX INFO: renamed from: j */
    public String f19436j;

    /* JADX INFO: renamed from: k */
    public String f19437k;

    /* JADX INFO: renamed from: l */
    public int f19438l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRepositoryImpl$insertCard$2(CardRepositoryImpl cardRepositoryImpl, TokenMeaning tokenMeaning, Ref$BooleanRef ref$BooleanRef, String str, String str2, int i10, String str3, String str4, int i11, String str5, InterfaceC9968c<? super CardRepositoryImpl$insertCard$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f19421I = cardRepositoryImpl;
        this.f19422J = tokenMeaning;
        this.f19423K = ref$BooleanRef;
        this.f19424L = str;
        this.f19425M = str2;
        this.f19426N = i10;
        this.f19427O = str3;
        this.f19428P = str4;
        this.f19429Q = i11;
        this.f19430R = str5;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CardRepositoryImpl$insertCard$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CardRepositoryImpl$insertCard$2(this.f19421I, this.f19422J, this.f19423K, this.f19424L, this.f19425M, this.f19426N, this.f19427O, this.f19428P, this.f19429Q, this.f19430R, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0468  */
    /* JADX WARN: Code duplicated, block: B:105:0x0487  */
    /* JADX WARN: Code duplicated, block: B:106:0x048e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0124  */
    /* JADX WARN: Code duplicated, block: B:24:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0138  */
    /* JADX WARN: Code duplicated, block: B:28:0x0167  */
    /* JADX WARN: Code duplicated, block: B:29:0x016a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0194  */
    /* JADX WARN: Code duplicated, block: B:34:0x01bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:41:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x0249 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x024a  */
    /* JADX WARN: Code duplicated, block: B:49:0x025d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x0276 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0277  */
    /* JADX WARN: Code duplicated, block: B:56:0x0291 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0296  */
    /* JADX WARN: Code duplicated, block: B:61:0x02be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:65:0x02eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x030d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0319  */
    /* JADX WARN: Code duplicated, block: B:74:0x0335  */
    /* JADX WARN: Code duplicated, block: B:77:0x0348 A[LOOP:0: B:75:0x0340->B:77:0x0348, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:80:0x0380  */
    /* JADX WARN: Code duplicated, block: B:82:0x038c  */
    /* JADX WARN: Code duplicated, block: B:83:0x038e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0391  */
    /* JADX WARN: Code duplicated, block: B:87:0x0396  */
    /* JADX WARN: Code duplicated, block: B:89:0x039e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0420 A[LOOP:1: B:91:0x041e->B:92:0x0420, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x044d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0455  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM14360a;
        String str;
        String str2;
        String str3;
        Object objMo5236r0;
        String str4;
        String str5;
        C8808v c8808v;
        String strM611g;
        Ref$IntRef ref$IntRef;
        ArrayList arrayList;
        ArrayList arrayList2;
        Ref$BooleanRef ref$BooleanRef;
        String str6;
        String str7;
        int i10;
        int i11;
        String str8;
        CoroutineSingletons coroutineSingletons;
        List list;
        List list2;
        AbstractC1562x5 abstractC1562x5;
        List list3;
        Ref$IntRef ref$IntRef2;
        List list4;
        int value;
        int i12;
        int i13;
        int value2;
        Card card;
        AbstractC1388a abstractC1388a;
        Card card2;
        Object objM14360a2;
        ProfileAccount profileAccount;
        InterfaceC5180b interfaceC5180b;
        ProfileAccount profileAccount2;
        Card card3;
        Bundle bundle;
        int i14;
        Object objMo5149o0;
        Lesson lesson;
        String str9;
        AbstractC1495o1 abstractC1495o1;
        String str10;
        Bundle bundle2;
        ProfileAccount profileAccount3;
        String str11;
        CardRepositoryImpl cardRepositoryImpl;
        AbstractC1495o1 abstractC1495o2;
        List<C8799m> listM17251q;
        Lesson lesson2;
        int i15;
        String str12;
        RequestDataCard requestDataCard;
        RequestDataCard requestDataCard2;
        C9072e c9072e;
        Pair[] pairArr;
        C1244b.a aVar;
        int i16;
        String str13;
        boolean zM14278X2;
        C7796d c7796d;
        Integer num;
        ArrayList arrayList3;
        Iterator<Meaning> it;
        boolean zHasNext;
        String str14;
        List<String> list5;
        boolean z10;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i17 = this.f19420H;
        Ref$BooleanRef ref$BooleanRef2 = this.f19423K;
        String str15 = this.f19424L;
        int i18 = this.f19429Q;
        String str16 = this.f19425M;
        TokenMeaning tokenMeaning = this.f19422J;
        String str17 = this.f19427O;
        CardRepositoryImpl cardRepositoryImpl2 = this.f19421I;
        switch (i17) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = cardRepositoryImpl2.f19394f.mo9619h();
                this.f19420H = 1;
                objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, this);
                if (objM14360a == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str = ((Profile) objM14360a).f17796p;
                str2 = tokenMeaning.f22090c;
                str3 = tokenMeaning.f22089b;
                if (!C7661i.m15250P2(str3)) {
                    str = str3;
                }
                ref$BooleanRef2.f38122a = tokenMeaning.f22094g;
                AbstractC1562x5 abstractC1562x6 = cardRepositoryImpl2.f19391c;
                this.f19431e = str2;
                this.f19432f = str;
                this.f19420H = 2;
                objMo5236r0 = abstractC1562x6.mo5236r0(str15, this);
                if (objMo5236r0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str4 = str;
                str5 = str2;
                c8808v = (C8808v) objMo5236r0;
                strM611g = C0141b.m611g("/", str16, "/");
                ref$IntRef = new Ref$IntRef();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                int i19 = tokenMeaning.f22088a;
                ref$BooleanRef = ref$BooleanRef2;
                int i20 = tokenMeaning.f22091d;
                str6 = str16;
                boolean z11 = tokenMeaning.f22092e;
                str7 = str15;
                String str18 = tokenMeaning.f22093f;
                i10 = i18;
                boolean z12 = tokenMeaning.f22094g;
                if (c8808v != null) {
                    i11 = c8808v.f46684b;
                } else {
                    i11 = tokenMeaning.f22095h;
                }
                str8 = str17;
                arrayList2.add(new Meaning(i19, str4, str5, 0, i20, z11, str18, null, z12, i11, 8, null));
                if (c8808v != null) {
                    String value3 = WordStatus.Card.getValue();
                    C5207g.m11111f(value3, "<set-?>");
                    c8808v.f46686d = value3;
                    ref$IntRef.f38125a = c8808v.f46685c;
                    arrayList.addAll(c8808v.f46687e);
                    abstractC1562x5 = cardRepositoryImpl2.f19391c;
                    this.f19431e = strM611g;
                    this.f19432f = ref$IntRef;
                    this.f19433g = arrayList;
                    this.f19434h = arrayList2;
                    this.f19420H = 3;
                    coroutineSingletons = coroutineSingletons2;
                    if (abstractC1562x5.mo5238t0(c8808v, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList;
                    ref$IntRef2 = ref$IntRef;
                    list4 = arrayList2;
                    list2 = list4;
                    list = list3;
                    ref$IntRef = ref$IntRef2;
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    list = arrayList;
                    list2 = arrayList2;
                }
                String str19 = strM611g;
                value = CardStatus.Known.getValue();
                i12 = this.f19426N;
                if (i12 == value) {
                    int value4 = CardStatus.Learned.getValue();
                    value2 = CardExtendedStatus.Known.getValue();
                    i13 = value4;
                } else {
                    i13 = i12;
                    value2 = CardExtendedStatus.NotKnown.getValue();
                }
                card = new Card(this.f19427O, this.f19424L, 0, str19, this.f19428P, i13, new Integer(value2), null, null, null, null, ref$IntRef.f38125a, list2, null, list, null, EmptyList.f38032a, null, C5408a.m11573f(str8), 40960, null);
                abstractC1388a = cardRepositoryImpl2.f19390b;
                this.f19431e = card;
                this.f19432f = null;
                this.f19433g = null;
                this.f19434h = null;
                this.f19420H = 4;
                if (abstractC1388a.mo598h0(card, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                card2 = card;
                ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m = cardRepositoryImpl2.f19394f.mo9624m();
                this.f19431e = card2;
                this.f19420H = 5;
                objM14360a2 = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o3 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o3.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next = it.next();
                            RequestHintUpdate requestHintUpdate = new RequestHintUpdate();
                            requestHintUpdate.f18072c = str14;
                            requestHintUpdate.f18070a = next.f17277b;
                            requestHintUpdate.f18071b = next.f17278c;
                            requestHintUpdate.f18073d = next.f17284i;
                            arrayList3.add(requestHintUpdate);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                NetworkType networkType2 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType2, "networkType");
                C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
                C1315h.a aVar2 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar2.f8071c.f37533j = c1309b;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                for (i16 = 0; i16 < 2; i16++) {
                    Pair pair = pairArr[i16];
                    aVar.m4709b(pair.f38013b, (String) pair.f38012a);
                }
                aVar2.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar2.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2 || C7076b.m14278X2(str13, "-", false)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle3, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null && profileAccount2.f17809i >= num.intValue()) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putString("Client", "android");
                    c7796d.m15505b(bundle4, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                objM14360a = obj;
                str = ((Profile) objM14360a).f17796p;
                str2 = tokenMeaning.f22090c;
                str3 = tokenMeaning.f22089b;
                if (!C7661i.m15250P2(str3)) {
                    str = str3;
                }
                ref$BooleanRef2.f38122a = tokenMeaning.f22094g;
                AbstractC1562x5 abstractC1562x7 = cardRepositoryImpl2.f19391c;
                this.f19431e = str2;
                this.f19432f = str;
                this.f19420H = 2;
                objMo5236r0 = abstractC1562x7.mo5236r0(str15, this);
                if (objMo5236r0 == coroutineSingletons2) {
                    return coroutineSingletons2;
                }
                str4 = str;
                str5 = str2;
                c8808v = (C8808v) objMo5236r0;
                strM611g = C0141b.m611g("/", str16, "/");
                ref$IntRef = new Ref$IntRef();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                int i110 = tokenMeaning.f22088a;
                ref$BooleanRef = ref$BooleanRef2;
                int i21 = tokenMeaning.f22091d;
                str6 = str16;
                boolean z13 = tokenMeaning.f22092e;
                str7 = str15;
                String str110 = tokenMeaning.f22093f;
                i10 = i18;
                boolean z14 = tokenMeaning.f22094g;
                if (c8808v != null) {
                    i11 = c8808v.f46684b;
                } else {
                    i11 = tokenMeaning.f22095h;
                }
                str8 = str17;
                arrayList2.add(new Meaning(i110, str4, str5, 0, i21, z13, str110, null, z14, i11, 8, null));
                if (c8808v != null) {
                    String value5 = WordStatus.Card.getValue();
                    C5207g.m11111f(value5, "<set-?>");
                    c8808v.f46686d = value5;
                    ref$IntRef.f38125a = c8808v.f46685c;
                    arrayList.addAll(c8808v.f46687e);
                    abstractC1562x5 = cardRepositoryImpl2.f19391c;
                    this.f19431e = strM611g;
                    this.f19432f = ref$IntRef;
                    this.f19433g = arrayList;
                    this.f19434h = arrayList2;
                    this.f19420H = 3;
                    coroutineSingletons = coroutineSingletons2;
                    if (abstractC1562x5.mo5238t0(c8808v, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList;
                    ref$IntRef2 = ref$IntRef;
                    list4 = arrayList2;
                    list2 = list4;
                    list = list3;
                    ref$IntRef = ref$IntRef2;
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    list = arrayList;
                    list2 = arrayList2;
                }
                String str111 = strM611g;
                value = CardStatus.Known.getValue();
                i12 = this.f19426N;
                if (i12 == value) {
                    int value6 = CardStatus.Learned.getValue();
                    value2 = CardExtendedStatus.Known.getValue();
                    i13 = value6;
                } else {
                    i13 = i12;
                    value2 = CardExtendedStatus.NotKnown.getValue();
                }
                card = new Card(this.f19427O, this.f19424L, 0, str111, this.f19428P, i13, new Integer(value2), null, null, null, null, ref$IntRef.f38125a, list2, null, list, null, EmptyList.f38032a, null, C5408a.m11573f(str8), 40960, null);
                abstractC1388a = cardRepositoryImpl2.f19390b;
                this.f19431e = card;
                this.f19432f = null;
                this.f19433g = null;
                this.f19434h = null;
                this.f19420H = 4;
                if (abstractC1388a.mo598h0(card, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                card2 = card;
                ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m2 = cardRepositoryImpl2.f19394f.mo9624m();
                this.f19431e = card2;
                this.f19420H = 5;
                objM14360a2 = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m2, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o4 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o4.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next2 = it.next();
                            RequestHintUpdate requestHintUpdate2 = new RequestHintUpdate();
                            requestHintUpdate2.f18072c = str14;
                            requestHintUpdate2.f18070a = next2.f17277b;
                            requestHintUpdate2.f18071b = next2.f17278c;
                            requestHintUpdate2.f18073d = next2.f17284i;
                            arrayList3.add(requestHintUpdate2);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType3 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                NetworkType networkType4 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType4, "networkType");
                C1309b c1309b2 = new C1309b(networkType4, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet2));
                C1315h.a aVar3 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar3.f8071c.f37533j = c1309b2;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair2 = pairArr[i16];
                    aVar.m4709b(pair2.f38013b, (String) pair2.f38012a);
                }
                aVar3.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar3.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle5 = new Bundle();
                    bundle5.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle5, "create_phrase");
                } else {
                    Bundle bundle6 = new Bundle();
                    bundle6.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle6, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle7 = new Bundle();
                    bundle7.putString("Client", "android");
                    c7796d.m15505b(bundle7, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 2:
                String str20 = (String) this.f19432f;
                String str21 = (String) this.f19431e;
                C7499b.m14977z0(obj);
                str4 = str20;
                str5 = str21;
                objMo5236r0 = obj;
                c8808v = (C8808v) objMo5236r0;
                strM611g = C0141b.m611g("/", str16, "/");
                ref$IntRef = new Ref$IntRef();
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                int i111 = tokenMeaning.f22088a;
                ref$BooleanRef = ref$BooleanRef2;
                int i22 = tokenMeaning.f22091d;
                str6 = str16;
                boolean z15 = tokenMeaning.f22092e;
                str7 = str15;
                String str112 = tokenMeaning.f22093f;
                i10 = i18;
                boolean z16 = tokenMeaning.f22094g;
                if (c8808v != null) {
                    i11 = c8808v.f46684b;
                } else {
                    i11 = tokenMeaning.f22095h;
                }
                str8 = str17;
                arrayList2.add(new Meaning(i111, str4, str5, 0, i22, z15, str112, null, z16, i11, 8, null));
                if (c8808v != null) {
                    String value7 = WordStatus.Card.getValue();
                    C5207g.m11111f(value7, "<set-?>");
                    c8808v.f46686d = value7;
                    ref$IntRef.f38125a = c8808v.f46685c;
                    arrayList.addAll(c8808v.f46687e);
                    abstractC1562x5 = cardRepositoryImpl2.f19391c;
                    this.f19431e = strM611g;
                    this.f19432f = ref$IntRef;
                    this.f19433g = arrayList;
                    this.f19434h = arrayList2;
                    this.f19420H = 3;
                    coroutineSingletons = coroutineSingletons2;
                    if (abstractC1562x5.mo5238t0(c8808v, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list3 = arrayList;
                    ref$IntRef2 = ref$IntRef;
                    list4 = arrayList2;
                    list2 = list4;
                    list = list3;
                    ref$IntRef = ref$IntRef2;
                } else {
                    coroutineSingletons = coroutineSingletons2;
                    list = arrayList;
                    list2 = arrayList2;
                }
                String str113 = strM611g;
                value = CardStatus.Known.getValue();
                i12 = this.f19426N;
                if (i12 == value) {
                    int value8 = CardStatus.Learned.getValue();
                    value2 = CardExtendedStatus.Known.getValue();
                    i13 = value8;
                } else {
                    i13 = i12;
                    value2 = CardExtendedStatus.NotKnown.getValue();
                }
                card = new Card(this.f19427O, this.f19424L, 0, str113, this.f19428P, i13, new Integer(value2), null, null, null, null, ref$IntRef.f38125a, list2, null, list, null, EmptyList.f38032a, null, C5408a.m11573f(str8), 40960, null);
                abstractC1388a = cardRepositoryImpl2.f19390b;
                this.f19431e = card;
                this.f19432f = null;
                this.f19433g = null;
                this.f19434h = null;
                this.f19420H = 4;
                if (abstractC1388a.mo598h0(card, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                card2 = card;
                ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m3 = cardRepositoryImpl2.f19394f.mo9624m();
                this.f19431e = card2;
                this.f19420H = 5;
                objM14360a2 = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m3, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o5 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o5.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next3 = it.next();
                            RequestHintUpdate requestHintUpdate3 = new RequestHintUpdate();
                            requestHintUpdate3.f18072c = str14;
                            requestHintUpdate3.f18070a = next3.f17277b;
                            requestHintUpdate3.f18071b = next3.f17278c;
                            requestHintUpdate3.f18073d = next3.f17284i;
                            arrayList3.add(requestHintUpdate3);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType5 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                NetworkType networkType6 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType6, "networkType");
                C1309b c1309b3 = new C1309b(networkType6, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet3));
                C1315h.a aVar4 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar4.f8071c.f37533j = c1309b3;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair3 = pairArr[i16];
                    aVar.m4709b(pair3.f38013b, (String) pair3.f38012a);
                }
                aVar4.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar4.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle8 = new Bundle();
                    bundle8.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle8, "create_phrase");
                } else {
                    Bundle bundle9 = new Bundle();
                    bundle9.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle9, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle10 = new Bundle();
                    bundle10.putString("Client", "android");
                    c7796d.m15505b(bundle10, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 3:
                list4 = (List) this.f19434h;
                list3 = (List) this.f19433g;
                ref$IntRef2 = (Ref$IntRef) this.f19432f;
                strM611g = (String) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str7 = str15;
                i10 = i18;
                str6 = str16;
                str8 = str17;
                coroutineSingletons = coroutineSingletons2;
                list2 = list4;
                list = list3;
                ref$IntRef = ref$IntRef2;
                String str114 = strM611g;
                value = CardStatus.Known.getValue();
                i12 = this.f19426N;
                if (i12 == value) {
                    int value9 = CardStatus.Learned.getValue();
                    value2 = CardExtendedStatus.Known.getValue();
                    i13 = value9;
                } else {
                    i13 = i12;
                    value2 = CardExtendedStatus.NotKnown.getValue();
                }
                card = new Card(this.f19427O, this.f19424L, 0, str114, this.f19428P, i13, new Integer(value2), null, null, null, null, ref$IntRef.f38125a, list2, null, list, null, EmptyList.f38032a, null, C5408a.m11573f(str8), 40960, null);
                abstractC1388a = cardRepositoryImpl2.f19390b;
                this.f19431e = card;
                this.f19432f = null;
                this.f19433g = null;
                this.f19434h = null;
                this.f19420H = 4;
                if (abstractC1388a.mo598h0(card, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                card2 = card;
                ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m4 = cardRepositoryImpl2.f19394f.mo9624m();
                this.f19431e = card2;
                this.f19420H = 5;
                objM14360a2 = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m4, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o6 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o6.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next4 = it.next();
                            RequestHintUpdate requestHintUpdate4 = new RequestHintUpdate();
                            requestHintUpdate4.f18072c = str14;
                            requestHintUpdate4.f18070a = next4.f17277b;
                            requestHintUpdate4.f18071b = next4.f17278c;
                            requestHintUpdate4.f18073d = next4.f17284i;
                            arrayList3.add(requestHintUpdate4);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType7 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                NetworkType networkType8 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType8, "networkType");
                C1309b c1309b4 = new C1309b(networkType8, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet4));
                C1315h.a aVar5 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar5.f8071c.f37533j = c1309b4;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair4 = pairArr[i16];
                    aVar.m4709b(pair4.f38013b, (String) pair4.f38012a);
                }
                aVar5.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar5.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle11 = new Bundle();
                    bundle11.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle11, "create_phrase");
                } else {
                    Bundle bundle12 = new Bundle();
                    bundle12.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle12, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle13 = new Bundle();
                    bundle13.putString("Client", "android");
                    c7796d.m15505b(bundle13, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 4:
                card2 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str7 = str15;
                i10 = i18;
                str6 = str16;
                str8 = str17;
                coroutineSingletons = coroutineSingletons2;
                ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m5 = cardRepositoryImpl2.f19394f.mo9624m();
                this.f19431e = card2;
                this.f19420H = 5;
                objM14360a2 = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m5, this);
                if (objM14360a2 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o7 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o7.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next5 = it.next();
                            RequestHintUpdate requestHintUpdate5 = new RequestHintUpdate();
                            requestHintUpdate5.f18072c = str14;
                            requestHintUpdate5.f18070a = next5.f17277b;
                            requestHintUpdate5.f18071b = next5.f17278c;
                            requestHintUpdate5.f18073d = next5.f17284i;
                            arrayList3.add(requestHintUpdate5);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType9 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                NetworkType networkType10 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType10, "networkType");
                C1309b c1309b5 = new C1309b(networkType10, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet5));
                C1315h.a aVar6 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar6.f8071c.f37533j = c1309b5;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair5 = pairArr[i16];
                    aVar.m4709b(pair5.f38013b, (String) pair5.f38012a);
                }
                aVar6.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar6.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle14 = new Bundle();
                    bundle14.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle14, "create_phrase");
                } else {
                    Bundle bundle15 = new Bundle();
                    bundle15.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle15, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle16 = new Bundle();
                    bundle16.putString("Client", "android");
                    c7796d.m15505b(bundle16, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 5:
                card2 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str7 = str15;
                i10 = i18;
                str6 = str16;
                str8 = str17;
                coroutineSingletons = coroutineSingletons2;
                objM14360a2 = obj;
                profileAccount = (ProfileAccount) objM14360a2;
                profileAccount.f17809i++;
                interfaceC5180b = cardRepositoryImpl2.f19394f;
                this.f19431e = card2;
                this.f19432f = profileAccount;
                this.f19420H = 6;
                if (interfaceC5180b.mo9615d(profileAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileAccount2 = profileAccount;
                card3 = card2;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o8 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o8.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next6 = it.next();
                            RequestHintUpdate requestHintUpdate6 = new RequestHintUpdate();
                            requestHintUpdate6.f18072c = str14;
                            requestHintUpdate6.f18070a = next6.f17277b;
                            requestHintUpdate6.f18071b = next6.f17278c;
                            requestHintUpdate6.f18073d = next6.f17284i;
                            arrayList3.add(requestHintUpdate6);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType11 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet6 = new LinkedHashSet();
                NetworkType networkType12 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType12, "networkType");
                C1309b c1309b6 = new C1309b(networkType12, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet6));
                C1315h.a aVar7 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar7.f8071c.f37533j = c1309b6;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair6 = pairArr[i16];
                    aVar.m4709b(pair6.f38013b, (String) pair6.f38012a);
                }
                aVar7.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar7.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle17 = new Bundle();
                    bundle17.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle17, "create_phrase");
                } else {
                    Bundle bundle18 = new Bundle();
                    bundle18.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle18, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle19 = new Bundle();
                    bundle19.putString("Client", "android");
                    c7796d.m15505b(bundle19, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                ProfileAccount profileAccount4 = (ProfileAccount) this.f19432f;
                Card card4 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str7 = str15;
                i10 = i18;
                str6 = str16;
                card3 = card4;
                str8 = str17;
                coroutineSingletons = coroutineSingletons2;
                profileAccount2 = profileAccount4;
                bundle = new Bundle();
                AbstractC1495o1 abstractC1495o9 = cardRepositoryImpl2.f19392d;
                this.f19431e = card3;
                this.f19432f = profileAccount2;
                this.f19433g = bundle;
                this.f19420H = 7;
                i14 = i10;
                objMo5149o0 = abstractC1495o9.mo5149o0(i14, this);
                if (objMo5149o0 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next7 = it.next();
                            RequestHintUpdate requestHintUpdate7 = new RequestHintUpdate();
                            requestHintUpdate7.f18072c = str14;
                            requestHintUpdate7.f18070a = next7.f17277b;
                            requestHintUpdate7.f18071b = next7.f17278c;
                            requestHintUpdate7.f18073d = next7.f17284i;
                            arrayList3.add(requestHintUpdate7);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType13 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet7 = new LinkedHashSet();
                NetworkType networkType14 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType14, "networkType");
                C1309b c1309b7 = new C1309b(networkType14, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet7));
                C1315h.a aVar8 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar8.f8071c.f37533j = c1309b7;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair7 = pairArr[i16];
                    aVar.m4709b(pair7.f38013b, (String) pair7.f38012a);
                }
                aVar8.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar8.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle110 = new Bundle();
                    bundle110.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle110, "create_phrase");
                } else {
                    Bundle bundle111 = new Bundle();
                    bundle111.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle111, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle112 = new Bundle();
                    bundle112.putString("Client", "android");
                    c7796d.m15505b(bundle112, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                bundle = (Bundle) this.f19433g;
                profileAccount2 = (ProfileAccount) this.f19432f;
                card3 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str7 = str15;
                i14 = i18;
                str6 = str16;
                str8 = str17;
                coroutineSingletons = coroutineSingletons2;
                objMo5149o0 = obj;
                lesson = (Lesson) objMo5149o0;
                if (lesson != null) {
                    lesson.f17074H++;
                    abstractC1495o1 = cardRepositoryImpl2.f19392d;
                    this.f19431e = card3;
                    this.f19432f = profileAccount2;
                    this.f19433g = bundle;
                    this.f19434h = lesson;
                    this.f19435i = cardRepositoryImpl2;
                    str10 = str7;
                    this.f19436j = str10;
                    str9 = str6;
                    this.f19437k = str9;
                    this.f19438l = i14;
                    this.f19420H = 8;
                    if (abstractC1495o1.mo598h0(lesson, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    bundle2 = bundle;
                    profileAccount3 = profileAccount2;
                    str11 = str9;
                    cardRepositoryImpl = cardRepositoryImpl2;
                    abstractC1495o2 = cardRepositoryImpl.f19392d;
                    listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                    this.f19431e = card3;
                    this.f19432f = profileAccount3;
                    this.f19433g = bundle2;
                    this.f19434h = lesson;
                    this.f19435i = str11;
                    this.f19436j = null;
                    this.f19437k = null;
                    this.f19438l = i14;
                    this.f19420H = 9;
                    if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lesson2 = lesson;
                    i15 = i14;
                    profileAccount2 = profileAccount3;
                    bundle2.putString("Lesson ID", String.valueOf(i15));
                    bundle2.putString("Lesson name", lesson2.f17101e);
                    bundle2.putString("Lesson language", str11);
                    bundle2.putString("Lesson level", lesson2.f17112j0);
                    bundle = bundle2;
                } else {
                    str9 = str6;
                }
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next8 = it.next();
                            RequestHintUpdate requestHintUpdate8 = new RequestHintUpdate();
                            requestHintUpdate8.f18072c = str14;
                            requestHintUpdate8.f18070a = next8.f17277b;
                            requestHintUpdate8.f18071b = next8.f17278c;
                            requestHintUpdate8.f18073d = next8.f17284i;
                            arrayList3.add(requestHintUpdate8);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType15 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet8 = new LinkedHashSet();
                NetworkType networkType16 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType16, "networkType");
                C1309b c1309b8 = new C1309b(networkType16, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet8));
                C1315h.a aVar9 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar9.f8071c.f37533j = c1309b8;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair8 = pairArr[i16];
                    aVar.m4709b(pair8.f38013b, (String) pair8.f38012a);
                }
                aVar9.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar9.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle113 = new Bundle();
                    bundle113.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle113, "create_phrase");
                } else {
                    Bundle bundle114 = new Bundle();
                    bundle114.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle114, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle115 = new Bundle();
                    bundle115.putString("Client", "android");
                    c7796d.m15505b(bundle115, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 8:
                int i23 = this.f19438l;
                str11 = this.f19437k;
                String str22 = this.f19436j;
                cardRepositoryImpl = (CardRepositoryImpl) this.f19435i;
                Lesson lesson3 = (Lesson) this.f19434h;
                Bundle bundle20 = (Bundle) this.f19433g;
                profileAccount3 = (ProfileAccount) this.f19432f;
                Card card5 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                i14 = i23;
                str8 = str17;
                bundle2 = bundle20;
                str9 = str16;
                str10 = str22;
                coroutineSingletons = coroutineSingletons2;
                lesson = lesson3;
                card3 = card5;
                abstractC1495o2 = cardRepositoryImpl.f19392d;
                listM17251q = C9000b.m17251q(new C8799m(str10, lesson.f17093a));
                this.f19431e = card3;
                this.f19432f = profileAccount3;
                this.f19433g = bundle2;
                this.f19434h = lesson;
                this.f19435i = str11;
                this.f19436j = null;
                this.f19437k = null;
                this.f19438l = i14;
                this.f19420H = 9;
                if (abstractC1495o2.mo5136I0(listM17251q, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lesson2 = lesson;
                i15 = i14;
                profileAccount2 = profileAccount3;
                bundle2.putString("Lesson ID", String.valueOf(i15));
                bundle2.putString("Lesson name", lesson2.f17101e);
                bundle2.putString("Lesson language", str11);
                bundle2.putString("Lesson level", lesson2.f17112j0);
                bundle = bundle2;
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next9 = it.next();
                            RequestHintUpdate requestHintUpdate9 = new RequestHintUpdate();
                            requestHintUpdate9.f18072c = str14;
                            requestHintUpdate9.f18070a = next9.f17277b;
                            requestHintUpdate9.f18071b = next9.f17278c;
                            requestHintUpdate9.f18073d = next9.f17284i;
                            arrayList3.add(requestHintUpdate9);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType17 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet9 = new LinkedHashSet();
                NetworkType networkType18 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType18, "networkType");
                C1309b c1309b9 = new C1309b(networkType18, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet9));
                C1315h.a aVar10 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar10.f8071c.f37533j = c1309b9;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair9 = pairArr[i16];
                    aVar.m4709b(pair9.f38013b, (String) pair9.f38012a);
                }
                aVar10.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar10.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle116 = new Bundle();
                    bundle116.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle116, "create_phrase");
                } else {
                    Bundle bundle117 = new Bundle();
                    bundle117.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle117, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle118 = new Bundle();
                    bundle118.putString("Client", "android");
                    c7796d.m15505b(bundle118, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            case 9:
                i15 = this.f19438l;
                str11 = (String) this.f19435i;
                lesson2 = (Lesson) this.f19434h;
                bundle2 = (Bundle) this.f19433g;
                profileAccount2 = (ProfileAccount) this.f19432f;
                card3 = (Card) this.f19431e;
                C7499b.m14977z0(obj);
                ref$BooleanRef = ref$BooleanRef2;
                str8 = str17;
                str9 = str16;
                bundle2.putString("Lesson ID", String.valueOf(i15));
                bundle2.putString("Lesson name", lesson2.f17101e);
                bundle2.putString("Lesson language", str11);
                bundle2.putString("Lesson level", lesson2.f17112j0);
                bundle = bundle2;
                str12 = this.f19430R;
                if (!C7661i.m15250P2(str12)) {
                    bundle.putString("Source", str12);
                }
                bundle.putInt("Total LingQs Created", profileAccount2.f17809i);
                cardRepositoryImpl2.f19397i.m15505b(bundle, "create_lingq");
                requestDataCard = new RequestDataCard();
                if (card3 != null) {
                    arrayList3 = new ArrayList();
                    it = card3.f16866m.iterator();
                    while (true) {
                        zHasNext = it.hasNext();
                        str14 = card3.f16854a;
                        if (zHasNext) {
                            Meaning next10 = it.next();
                            RequestHintUpdate requestHintUpdate10 = new RequestHintUpdate();
                            requestHintUpdate10.f18072c = str14;
                            requestHintUpdate10.f18070a = next10.f17277b;
                            requestHintUpdate10.f18071b = next10.f17278c;
                            requestHintUpdate10.f18073d = next10.f17284i;
                            arrayList3.add(requestHintUpdate10);
                        } else {
                            requestDataCard2 = new RequestDataCard();
                            requestDataCard2.f18049c = card3.f16859f;
                            requestDataCard2.f18047a = str14;
                            requestDataCard2.f18048b = card3.f16858e;
                            requestDataCard2.f18052f = arrayList3;
                            list5 = card3.f16868o;
                            if (!list5.isEmpty()) {
                                if (((CharSequence) C6752c.m13423Q(list5)).length() > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    requestDataCard2.f18053g = list5;
                                }
                            }
                            c9072e = C9072e.f47360a;
                        }
                    }
                } else {
                    requestDataCard2 = requestDataCard;
                    c9072e = null;
                }
                if (c9072e == null) {
                    requestDataCard2 = new RequestDataCard();
                    requestDataCard2.f18049c = CardStatus.New.getValue();
                    requestDataCard2.f18047a = null;
                    requestDataCard2.f18048b = "";
                    requestDataCard2.f18052f = new ArrayList();
                }
                NetworkType networkType19 = NetworkType.NOT_REQUIRED;
                LinkedHashSet linkedHashSet10 = new LinkedHashSet();
                NetworkType networkType110 = NetworkType.CONNECTED;
                C5207g.m11111f(networkType110, "networkType");
                C1309b c1309b10 = new C1309b(networkType110, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet10));
                C1315h.a aVar11 = (C1315h.a) new C1315h.a(CardCreateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
                aVar11.f8071c.f37533j = c1309b10;
                pairArr = new Pair[]{new Pair("language", str9), new Pair("data", cardRepositoryImpl2.f19396h.m10563a(RequestDataCard.class).m10535e(requestDataCard2))};
                aVar = new C1244b.a();
                while (i16 < 2) {
                    Pair pair10 = pairArr[i16];
                    aVar.m4709b(pair10.f38013b, (String) pair10.f38012a);
                }
                aVar11.f8071c.f37528e = aVar.m4708a();
                cardRepositoryImpl2.f19395g.m4877b(aVar11.m4879a());
                str13 = str8;
                zM14278X2 = C7076b.m14278X2(str13, " ", false);
                c7796d = cardRepositoryImpl2.f19397i;
                if (zM14278X2) {
                    Bundle bundle119 = new Bundle();
                    bundle119.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle119, "create_phrase");
                } else {
                    Bundle bundle1110 = new Bundle();
                    bundle1110.putString("LingQed Phrase", str13);
                    c7796d.m15505b(bundle1110, "create_phrase");
                }
                num = profileAccount2.f17808h;
                if (num != null) {
                    Bundle bundle1111 = new Bundle();
                    bundle1111.putString("Client", "android");
                    c7796d.m15505b(bundle1111, "hit_lingq_limit");
                }
                if (ref$BooleanRef.f38122a) {
                    c7796d.m15505b(null, "select_google_hint");
                } else {
                    c7796d.m15505b(null, "select_hint");
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
