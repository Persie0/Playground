package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.data.workers.CardDeleteWorker;
import com.lingq.core.data.workers.CardReviewWorker;
import com.lingq.core.data.workers.CardUpdateWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.AbstractC1320h;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.database.entity.LessonAndWordsFromJoin;
import com.lingq.core.database.entity.WordEntity;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.status.CardExtendedStatus;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.network.api.requests.RequestDataCard;
import com.lingq.core.network.api.requests.RequestHintUpdate;
import com.lingq.core.network.api.result.ResultCardReview;
import com.lingq.core.network.api.result.ResultExplain;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3166k;
import p000.C3386nv;
import p000.C3512qv;
import p000.C3539rk;
import p000.C3705w0;
import p000.C3741x;
import p000.ao0;
import p000.bo0;
import p000.c83;
import p000.co0;
import p000.df4;
import p000.fa4;
import p000.hi8;
import p000.hm5;
import p000.k7b;
import p000.nm7;
import p000.nn0;
import p000.o7b;
import p000.on0;
import p000.p7b;
import p000.pn0;
import p000.r34;
import p000.r3a;
import p000.si7;
import p000.t70;
import p000.t7d;
import p000.tx6;
import p000.u91;
import p000.un0;
import p000.ux6;
import p000.v91;
import p000.vz1;
import p000.wi7;
import p000.wn0;
import p000.wq1;
import p000.wv0;
import p000.x3a;
import p000.xfa;
import p000.xj1;
import p000.y02;
import p000.y15;
import p000.y7d;
import p000.zuc;

/* JADX INFO: renamed from: com.lingq.core.data.repository.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1287c implements ao0 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16452a;

    /* JADX INFO: renamed from: b */
    public final un0 f16453b;

    /* JADX INFO: renamed from: c */
    public final o7b f16454c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1320h f16455d;

    /* JADX INFO: renamed from: e */
    public final co0 f16456e;

    /* JADX INFO: renamed from: f */
    public final x3a f16457f;

    /* JADX INFO: renamed from: g */
    public final nm7 f16458g;

    /* JADX INFO: renamed from: h */
    public final si7 f16459h;

    /* JADX INFO: renamed from: i */
    public final C0773b f16460i;

    /* JADX INFO: renamed from: j */
    public final hm5 f16461j;

    /* JADX INFO: renamed from: k */
    public final y15 f16462k;

    /* JADX INFO: renamed from: l */
    public final wv0 f16463l;

    public C1287c(LingQDatabase lingQDatabase, un0 un0Var, o7b o7bVar, AbstractC1320h abstractC1320h, co0 co0Var, x3a x3aVar, nm7 nm7Var, si7 si7Var, C0773b c0773b, df4 df4Var, hm5 hm5Var, y15 y15Var, wv0 wv0Var) {
        lingQDatabase.getClass();
        un0Var.getClass();
        o7bVar.getClass();
        abstractC1320h.getClass();
        co0Var.getClass();
        x3aVar.getClass();
        nm7Var.getClass();
        si7Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        hm5Var.getClass();
        y15Var.getClass();
        wv0Var.getClass();
        this.f16452a = lingQDatabase;
        this.f16453b = un0Var;
        this.f16454c = o7bVar;
        this.f16455d = abstractC1320h;
        this.f16456e = co0Var;
        this.f16457f = x3aVar;
        this.f16458g = nm7Var;
        this.f16459h = si7Var;
        this.f16460i = c0773b;
        this.f16461j = hm5Var;
        this.f16462k = y15Var;
        this.f16463l = wv0Var;
    }

    /* JADX INFO: renamed from: c */
    public static void m7112c(C1287c c1287c, String str, String str2, Integer num) {
        String strM24804b = y02.m24804b();
        c1287c.getClass();
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(CardUpdateWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("term", str2), new Pair("lessonId", num), new Pair("creationDate", strM24804b)};
        hi8 hi8Var = new hi8(10);
        for (int i = 0; i < 4; i++) {
            Pair pair = pairArr[i];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        c1287c.f16460i.m2913b(wq1.m24119o("card_update_", str, "_", str2), ExistingWorkPolicy.REPLACE, (ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0122  */
    /* JADX WARN: Code duplicated, block: B:47:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b5 A[LOOP:0: B:49:0x01b3->B:50:0x01b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: b */
    public final Object m7113b(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$deleteCard$1 cardRepositoryImpl$deleteCard$1;
        String strM23629f;
        String str3;
        int i2;
        wn0 wn0Var;
        String str4;
        int i3;
        int i4;
        p7b p7bVar;
        int i5;
        Object objM2861d;
        wn0 wn0Var2;
        String str5;
        String str6;
        int iM24068c;
        Object objM2861d2;
        int i6;
        int i7;
        String str7;
        String str8;
        Pair[] pairArr;
        hi8 hi8Var;
        if (continuationImpl instanceof CardRepositoryImpl$deleteCard$1) {
            cardRepositoryImpl$deleteCard$1 = (CardRepositoryImpl$deleteCard$1) continuationImpl;
            int i8 = cardRepositoryImpl$deleteCard$1.f14645i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$deleteCard$1.f14645i = i8 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$deleteCard$1 = new CardRepositoryImpl$deleteCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$deleteCard$1 = new CardRepositoryImpl$deleteCard$1(this, continuationImpl);
        }
        Object obj = cardRepositoryImpl$deleteCard$1.f14643g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i9 = cardRepositoryImpl$deleteCard$1.f14645i;
        xfa xfaVar = xfa.f68157a;
        o7b o7bVar = this.f16454c;
        un0 un0Var = this.f16453b;
        int i10 = 0;
        if (i9 == 0) {
            AbstractC3193b.m15359b(obj);
            strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$deleteCard$1.f14637a = str;
            cardRepositoryImpl$deleteCard$1.f14638b = strM23629f;
            cardRepositoryImpl$deleteCard$1.f14640d = i;
            cardRepositoryImpl$deleteCard$1.f14645i = 1;
            Object objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$deleteCard$1);
            if (objM22833A0 != coroutineSingletons) {
                str3 = str;
                i2 = i;
                obj = objM22833A0;
            }
            return coroutineSingletons;
        }
        if (i9 == 1) {
            i2 = cardRepositoryImpl$deleteCard$1.f14640d;
            strM23629f = cardRepositoryImpl$deleteCard$1.f14638b;
            str3 = cardRepositoryImpl$deleteCard$1.f14637a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i9 == 2) {
                i4 = cardRepositoryImpl$deleteCard$1.f14641e;
                i3 = cardRepositoryImpl$deleteCard$1.f14640d;
                wn0Var = cardRepositoryImpl$deleteCard$1.f14639c;
                str4 = cardRepositoryImpl$deleteCard$1.f14638b;
                str3 = cardRepositoryImpl$deleteCard$1.f14637a;
                AbstractC3193b.m15359b(obj);
                p7bVar = (p7b) obj;
                if (p7bVar != null) {
                    p7bVar.m18946i(WordStatus.Ignored.getValue());
                    p7bVar.m18945h(wn0Var.m24070e());
                    cardRepositoryImpl$deleteCard$1.f14637a = str3;
                    cardRepositoryImpl$deleteCard$1.f14638b = str4;
                    cardRepositoryImpl$deleteCard$1.f14639c = wn0Var;
                    cardRepositoryImpl$deleteCard$1.f14640d = i3;
                    cardRepositoryImpl$deleteCard$1.f14641e = i4;
                    cardRepositoryImpl$deleteCard$1.f14645i = 3;
                    i5 = i4;
                    objM2861d = AbstractC0758a.m2861d(new r3a(16, o7bVar, p7bVar), o7bVar.f53957K, cardRepositoryImpl$deleteCard$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        wn0Var2 = wn0Var;
                        str5 = str3;
                        str6 = str4;
                        i4 = i5;
                        str4 = str6;
                        str3 = str5;
                        wn0Var = wn0Var2;
                        iM24068c = wn0Var.m24068c();
                        cardRepositoryImpl$deleteCard$1.f14637a = str3;
                        cardRepositoryImpl$deleteCard$1.f14638b = str4;
                        cardRepositoryImpl$deleteCard$1.f14639c = null;
                        cardRepositoryImpl$deleteCard$1.f14640d = i3;
                        cardRepositoryImpl$deleteCard$1.f14641e = i4;
                        cardRepositoryImpl$deleteCard$1.f14642f = iM24068c;
                        cardRepositoryImpl$deleteCard$1.f14645i = 4;
                        objM2861d2 = AbstractC0758a.m2861d(new t70(str4, 6), un0Var.f64101K, cardRepositoryImpl$deleteCard$1, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                            i6 = iM24068c;
                            i7 = i3;
                            str7 = str3;
                            str8 = str4;
                        }
                    }
                } else {
                    iM24068c = wn0Var.m24068c();
                    cardRepositoryImpl$deleteCard$1.f14637a = str3;
                    cardRepositoryImpl$deleteCard$1.f14638b = str4;
                    cardRepositoryImpl$deleteCard$1.f14639c = null;
                    cardRepositoryImpl$deleteCard$1.f14640d = i3;
                    cardRepositoryImpl$deleteCard$1.f14641e = i4;
                    cardRepositoryImpl$deleteCard$1.f14642f = iM24068c;
                    cardRepositoryImpl$deleteCard$1.f14645i = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new t70(str4, 6), un0Var.f64101K, cardRepositoryImpl$deleteCard$1, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        i6 = iM24068c;
                        i7 = i3;
                        str7 = str3;
                        str8 = str4;
                    }
                }
                return coroutineSingletons;
            }
            if (i9 == 3) {
                i4 = cardRepositoryImpl$deleteCard$1.f14641e;
                i3 = cardRepositoryImpl$deleteCard$1.f14640d;
                wn0Var2 = cardRepositoryImpl$deleteCard$1.f14639c;
                str6 = cardRepositoryImpl$deleteCard$1.f14638b;
                str5 = cardRepositoryImpl$deleteCard$1.f14637a;
                AbstractC3193b.m15359b(obj);
                str4 = str6;
                str3 = str5;
                wn0Var = wn0Var2;
                iM24068c = wn0Var.m24068c();
                cardRepositoryImpl$deleteCard$1.f14637a = str3;
                cardRepositoryImpl$deleteCard$1.f14638b = str4;
                cardRepositoryImpl$deleteCard$1.f14639c = null;
                cardRepositoryImpl$deleteCard$1.f14640d = i3;
                cardRepositoryImpl$deleteCard$1.f14641e = i4;
                cardRepositoryImpl$deleteCard$1.f14642f = iM24068c;
                cardRepositoryImpl$deleteCard$1.f14645i = 4;
                objM2861d2 = AbstractC0758a.m2861d(new t70(str4, 6), un0Var.f64101K, cardRepositoryImpl$deleteCard$1, false, true);
                if (objM2861d2 != coroutineSingletons) {
                    objM2861d2 = xfaVar;
                }
                if (objM2861d2 != coroutineSingletons) {
                    i6 = iM24068c;
                    i7 = i3;
                    str7 = str3;
                    str8 = str4;
                }
                return coroutineSingletons;
            }
            if (i9 != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i6 = cardRepositoryImpl$deleteCard$1.f14642f;
            i7 = cardRepositoryImpl$deleteCard$1.f14640d;
            str8 = cardRepositoryImpl$deleteCard$1.f14638b;
            str7 = cardRepositoryImpl$deleteCard$1.f14637a;
            AbstractC3193b.m15359b(obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i7);
        String[] strArr = {"const value", sb.toString()};
        C1240a c1240a = (C1240a) this.f16461j;
        c1240a.m7025f("LingQ status changed", c1240a.m7022c(strArr));
        this.f16462k.mo49u1(LessonEngagedDataType.WordsIgnored, new Integer(-1));
        int value = CardStatus.Ignored.getValue();
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(CardDeleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str7), new Pair("cardId", Integer.valueOf(i6)), new Pair("term", str8), new Pair("status", Integer.valueOf(value))};
        hi8Var = new hi8(10);
        while (i10 < 4) {
            Pair pair = pairArr[i10];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
            i10++;
        }
        this.f16460i.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfaVar;
        wn0 wn0Var3 = (wn0) obj;
        if (wn0Var3 != null) {
            cardRepositoryImpl$deleteCard$1.f14637a = str3;
            cardRepositoryImpl$deleteCard$1.f14638b = strM23629f;
            cardRepositoryImpl$deleteCard$1.f14639c = wn0Var3;
            cardRepositoryImpl$deleteCard$1.f14640d = i2;
            cardRepositoryImpl$deleteCard$1.f14641e = 0;
            cardRepositoryImpl$deleteCard$1.f14645i = 2;
            Object objM2861d3 = AbstractC0758a.m2861d(new k7b(strM23629f, o7bVar, i10), o7bVar.f53957K, cardRepositoryImpl$deleteCard$1, true, false);
            if (objM2861d3 != coroutineSingletons) {
                wn0Var = wn0Var3;
                obj = objM2861d3;
                str4 = strM23629f;
                i3 = i2;
                i4 = 0;
                p7bVar = (p7b) obj;
                if (p7bVar != null) {
                    p7bVar.m18946i(WordStatus.Ignored.getValue());
                    p7bVar.m18945h(wn0Var.m24070e());
                    cardRepositoryImpl$deleteCard$1.f14637a = str3;
                    cardRepositoryImpl$deleteCard$1.f14638b = str4;
                    cardRepositoryImpl$deleteCard$1.f14639c = wn0Var;
                    cardRepositoryImpl$deleteCard$1.f14640d = i3;
                    cardRepositoryImpl$deleteCard$1.f14641e = i4;
                    cardRepositoryImpl$deleteCard$1.f14645i = 3;
                    i5 = i4;
                    objM2861d = AbstractC0758a.m2861d(new r3a(16, o7bVar, p7bVar), o7bVar.f53957K, cardRepositoryImpl$deleteCard$1, false, true);
                    if (objM2861d != coroutineSingletons) {
                        objM2861d = xfaVar;
                    }
                    if (objM2861d != coroutineSingletons) {
                        wn0Var2 = wn0Var;
                        str5 = str3;
                        str6 = str4;
                        i4 = i5;
                        str4 = str6;
                        str3 = str5;
                        wn0Var = wn0Var2;
                        iM24068c = wn0Var.m24068c();
                        cardRepositoryImpl$deleteCard$1.f14637a = str3;
                        cardRepositoryImpl$deleteCard$1.f14638b = str4;
                        cardRepositoryImpl$deleteCard$1.f14639c = null;
                        cardRepositoryImpl$deleteCard$1.f14640d = i3;
                        cardRepositoryImpl$deleteCard$1.f14641e = i4;
                        cardRepositoryImpl$deleteCard$1.f14642f = iM24068c;
                        cardRepositoryImpl$deleteCard$1.f14645i = 4;
                        objM2861d2 = AbstractC0758a.m2861d(new t70(str4, 6), un0Var.f64101K, cardRepositoryImpl$deleteCard$1, false, true);
                        if (objM2861d2 != coroutineSingletons) {
                            objM2861d2 = xfaVar;
                        }
                        if (objM2861d2 != coroutineSingletons) {
                            i6 = iM24068c;
                            i7 = i3;
                            str7 = str3;
                            str8 = str4;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i7);
                            String[] strArr2 = {"const value", sb2.toString()};
                            C1240a c1240a2 = (C1240a) this.f16461j;
                            c1240a2.m7025f("LingQ status changed", c1240a2.m7022c(strArr2));
                            this.f16462k.mo49u1(LessonEngagedDataType.WordsIgnored, new Integer(-1));
                            int value2 = CardStatus.Ignored.getValue();
                            xj1 xj1Var2 = new xj1();
                            xj1Var2.m24558b(NetworkType.CONNECTED);
                            tx6 tx6Var2 = (tx6) ((tx6) new tx6(CardDeleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                            pairArr = new Pair[]{new Pair("language", str7), new Pair("cardId", Integer.valueOf(i6)), new Pair("term", str8), new Pair("status", Integer.valueOf(value2))};
                            hi8Var = new hi8(10);
                            while (i10 < 4) {
                                Pair pair2 = pairArr[i10];
                                hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                                i10++;
                            }
                            this.f16460i.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
                        }
                    }
                } else {
                    iM24068c = wn0Var.m24068c();
                    cardRepositoryImpl$deleteCard$1.f14637a = str3;
                    cardRepositoryImpl$deleteCard$1.f14638b = str4;
                    cardRepositoryImpl$deleteCard$1.f14639c = null;
                    cardRepositoryImpl$deleteCard$1.f14640d = i3;
                    cardRepositoryImpl$deleteCard$1.f14641e = i4;
                    cardRepositoryImpl$deleteCard$1.f14642f = iM24068c;
                    cardRepositoryImpl$deleteCard$1.f14645i = 4;
                    objM2861d2 = AbstractC0758a.m2861d(new t70(str4, 6), un0Var.f64101K, cardRepositoryImpl$deleteCard$1, false, true);
                    if (objM2861d2 != coroutineSingletons) {
                        objM2861d2 = xfaVar;
                    }
                    if (objM2861d2 != coroutineSingletons) {
                        i6 = iM24068c;
                        i7 = i3;
                        str7 = str3;
                        str8 = str4;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        String[] strArr3 = {"const value", sb3.toString()};
                        C1240a c1240a3 = (C1240a) this.f16461j;
                        c1240a3.m7025f("LingQ status changed", c1240a3.m7022c(strArr3));
                        this.f16462k.mo49u1(LessonEngagedDataType.WordsIgnored, new Integer(-1));
                        int value3 = CardStatus.Ignored.getValue();
                        xj1 xj1Var3 = new xj1();
                        xj1Var3.m24558b(NetworkType.CONNECTED);
                        tx6 tx6Var3 = (tx6) ((tx6) new tx6(CardDeleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var3.m24557a());
                        pairArr = new Pair[]{new Pair("language", str7), new Pair("cardId", Integer.valueOf(i6)), new Pair("term", str8), new Pair("status", Integer.valueOf(value3))};
                        hi8Var = new hi8(10);
                        while (i10 < 4) {
                            Pair pair3 = pairArr[i10];
                            hi8Var.m13287x(pair3.f47624b, (String) pair3.f47623a);
                            i10++;
                        }
                        this.f16460i.m2912a((ux6) ((tx6) tx6Var3.m15008g(hi8Var.m13282k())).m15004a());
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m7114d(int i, int i2, int i3, int i4, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$explain$1 cardRepositoryImpl$explain$1;
        if (continuationImpl instanceof CardRepositoryImpl$explain$1) {
            cardRepositoryImpl$explain$1 = (CardRepositoryImpl$explain$1) continuationImpl;
            int i5 = cardRepositoryImpl$explain$1.f14648c;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$explain$1.f14648c = i5 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$explain$1 = new CardRepositoryImpl$explain$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$explain$1 = new CardRepositoryImpl$explain$1(this, continuationImpl);
        }
        CardRepositoryImpl$explain$1 cardRepositoryImpl$explain$2 = cardRepositoryImpl$explain$1;
        Object objM24254a = cardRepositoryImpl$explain$2.f14646a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = cardRepositoryImpl$explain$2.f14648c;
        try {
            if (i6 == 0) {
                AbstractC3193b.m15359b(objM24254a);
                x3a x3aVar = this.f16457f;
                Integer num = new Integer(i);
                Integer num2 = new Integer(i2);
                Integer num3 = new Integer(i3);
                Integer num4 = new Integer(i4);
                cardRepositoryImpl$explain$2.f14648c = 1;
                objM24254a = x3aVar.m24254a(str, num, num2, num3, num4, str2, cardRepositoryImpl$explain$2);
                if (objM24254a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i6 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM24254a);
            }
            return ((ResultExplain) objM24254a).m8358a();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m7115e(String str, int i, int i2, int i3, int i4, int i5, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$explainInChat$1 cardRepositoryImpl$explainInChat$1;
        if (continuationImpl instanceof CardRepositoryImpl$explainInChat$1) {
            cardRepositoryImpl$explainInChat$1 = (CardRepositoryImpl$explainInChat$1) continuationImpl;
            int i6 = cardRepositoryImpl$explainInChat$1.f14651c;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$explainInChat$1.f14651c = i6 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$explainInChat$1 = new CardRepositoryImpl$explainInChat$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$explainInChat$1 = new CardRepositoryImpl$explainInChat$1(this, continuationImpl);
        }
        CardRepositoryImpl$explainInChat$1 cardRepositoryImpl$explainInChat$2 = cardRepositoryImpl$explainInChat$1;
        Object objM24261h = cardRepositoryImpl$explainInChat$2.f14649a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = cardRepositoryImpl$explainInChat$2.f14651c;
        try {
            if (i7 == 0) {
                AbstractC3193b.m15359b(objM24261h);
                x3a x3aVar = this.f16457f;
                Integer num = new Integer(i3);
                Integer num2 = new Integer(i4);
                Integer num3 = new Integer(i5);
                cardRepositoryImpl$explainInChat$2.f14651c = 1;
                objM24261h = x3aVar.m24261h(str, i, i2, num, num2, num3, str2, cardRepositoryImpl$explainInChat$2);
                if (objM24261h == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i7 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM24261h);
            }
            return ((ResultExplain) objM24261h).m8358a();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final Object m7116f(String str, String str2, ContinuationImpl continuationImpl) {
        String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
        un0 un0Var = this.f16453b;
        return AbstractC0758a.m2861d(new nn0(strM23629f, un0Var, 3), un0Var.f64101K, continuationImpl, true, false);
    }

    /* JADX INFO: renamed from: g */
    public final Object m7117g(int i, ContinuationImpl continuationImpl) {
        un0 un0Var = this.f16453b;
        return AbstractC0758a.m2861d(new on0(i, un0Var, 0), un0Var.f64101K, continuationImpl, true, true);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX INFO: renamed from: h */
    public final Object m7118h(int i, String str, String str2, TokenMeaning tokenMeaning, int i2, String str3, String str4, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$insertCard$1 cardRepositoryImpl$insertCard$1;
        String str5;
        String str6;
        String str7;
        String str8;
        TokenMeaning tokenMeaning2;
        int i3;
        boolean z2;
        String str9;
        int i4;
        if (continuationImpl instanceof CardRepositoryImpl$insertCard$1) {
            cardRepositoryImpl$insertCard$1 = (CardRepositoryImpl$insertCard$1) continuationImpl;
            int i5 = cardRepositoryImpl$insertCard$1.f14663l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertCard$1.f14663l = i5 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertCard$1 = new CardRepositoryImpl$insertCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$insertCard$1 = new CardRepositoryImpl$insertCard$1(this, continuationImpl);
        }
        CardRepositoryImpl$insertCard$1 cardRepositoryImpl$insertCard$2 = cardRepositoryImpl$insertCard$1;
        Object obj = cardRepositoryImpl$insertCard$2.f14661j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = cardRepositoryImpl$insertCard$2.f14663l;
        if (i6 != 0) {
            if (i6 == 1) {
                boolean z3 = cardRepositoryImpl$insertCard$2.f14660i;
                int i7 = cardRepositoryImpl$insertCard$2.f14653b;
                int i8 = cardRepositoryImpl$insertCard$2.f14652a;
                String str10 = cardRepositoryImpl$insertCard$2.f14659h;
                String str11 = cardRepositoryImpl$insertCard$2.f14658g;
                String str12 = cardRepositoryImpl$insertCard$2.f14657f;
                TokenMeaning tokenMeaning3 = cardRepositoryImpl$insertCard$2.f14656e;
                String str13 = cardRepositoryImpl$insertCard$2.f14655d;
                String str14 = cardRepositoryImpl$insertCard$2.f14654c;
                AbstractC3193b.m15359b(obj);
                z2 = z3;
                i4 = i7;
                tokenMeaning2 = tokenMeaning3;
                str6 = str12;
                str7 = str11;
                i3 = i8;
                str5 = str10;
                str8 = str13;
                str9 = str14;
            } else {
                if (i6 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return new Integer(-1);
        }
        AbstractC3193b.m15359b(obj);
        if (fa4.m11650l(tokenMeaning.m8133g(), "LOADING_CWT")) {
            return new Integer(-1);
        }
        String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
        wi7 wi7Var = ((C1368a) this.f16459h).f18422k1;
        cardRepositoryImpl$insertCard$2.f14654c = str;
        cardRepositoryImpl$insertCard$2.f14655d = str2;
        cardRepositoryImpl$insertCard$2.f14656e = tokenMeaning;
        cardRepositoryImpl$insertCard$2.f14657f = str3;
        cardRepositoryImpl$insertCard$2.f14658g = str4;
        cardRepositoryImpl$insertCard$2.f14659h = strM23629f;
        cardRepositoryImpl$insertCard$2.f14652a = i;
        cardRepositoryImpl$insertCard$2.f14653b = i2;
        cardRepositoryImpl$insertCard$2.f14660i = z;
        cardRepositoryImpl$insertCard$2.f14663l = 1;
        Object objM15541t = AbstractC3224d.m15541t(wi7Var, cardRepositoryImpl$insertCard$2);
        if (objM15541t == coroutineSingletons) {
            return coroutineSingletons;
        }
        str5 = strM23629f;
        obj = objM15541t;
        str6 = str3;
        str7 = str4;
        str8 = str2;
        tokenMeaning2 = tokenMeaning;
        i3 = i;
        z2 = z;
        str9 = str;
        i4 = i2;
        CardRepositoryImpl$insertCard$2 cardRepositoryImpl$insertCard$3 = new CardRepositoryImpl$insertCard$2(this, tokenMeaning2, new Ref$BooleanRef(), str5, str9, i4, str8, str6, i3, str7, ((Boolean) obj).booleanValue(), z2, null);
        cardRepositoryImpl$insertCard$2.f14654c = null;
        cardRepositoryImpl$insertCard$2.f14655d = null;
        cardRepositoryImpl$insertCard$2.f14656e = null;
        cardRepositoryImpl$insertCard$2.f14657f = null;
        cardRepositoryImpl$insertCard$2.f14658g = null;
        cardRepositoryImpl$insertCard$2.f14659h = null;
        cardRepositoryImpl$insertCard$2.f14652a = i3;
        cardRepositoryImpl$insertCard$2.f14653b = i4;
        cardRepositoryImpl$insertCard$2.f14660i = z2;
        cardRepositoryImpl$insertCard$2.f14663l = 2;
        if (AbstractC0747e.m2849b(this.f16452a, cardRepositoryImpl$insertCard$3, cardRepositoryImpl$insertCard$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return new Integer(-1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m7119i(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$insertCardTag$1 cardRepositoryImpl$insertCardTag$1;
        String str4;
        String str5;
        if (continuationImpl instanceof CardRepositoryImpl$insertCardTag$1) {
            cardRepositoryImpl$insertCardTag$1 = (CardRepositoryImpl$insertCardTag$1) continuationImpl;
            int i = cardRepositoryImpl$insertCardTag$1.f14698f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertCardTag$1.f14698f = i - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertCardTag$1 = new CardRepositoryImpl$insertCardTag$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$insertCardTag$1 = new CardRepositoryImpl$insertCardTag$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$insertCardTag$1.f14696d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardRepositoryImpl$insertCardTag$1.f14698f;
        un0 un0Var = this.f16453b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$insertCardTag$1.f14693a = str;
            cardRepositoryImpl$insertCardTag$1.f14694b = str2;
            cardRepositoryImpl$insertCardTag$1.f14695c = str3;
            cardRepositoryImpl$insertCardTag$1.f14698f = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$insertCardTag$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str3 = cardRepositoryImpl$insertCardTag$1.f14695c;
            str2 = cardRepositoryImpl$insertCardTag$1.f14694b;
            str = cardRepositoryImpl$insertCardTag$1.f14693a;
            AbstractC3193b.m15359b(objM22833A0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = cardRepositoryImpl$insertCardTag$1.f14694b;
            str4 = cardRepositoryImpl$insertCardTag$1.f14693a;
            AbstractC3193b.m15359b(objM22833A0);
        }
        m7112c(this, str4, str5, null);
        return xfa.f68157a;
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(wn0Var.m24074i());
            Iterator it = arrayList.iterator();
            do {
                if (!it.hasNext()) {
                    arrayList.add(str3);
                    break;
                }
            } while (!fa4.m11650l((String) it.next(), str3));
            wn0Var.m24081p(arrayList);
            cardRepositoryImpl$insertCardTag$1.f14693a = str;
            cardRepositoryImpl$insertCardTag$1.f14694b = str2;
            cardRepositoryImpl$insertCardTag$1.f14695c = null;
            cardRepositoryImpl$insertCardTag$1.f14698f = 2;
            if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$insertCardTag$1) != coroutineSingletons) {
                String str6 = str2;
                str4 = str;
                str5 = str6;
                m7112c(this, str4, str5, null);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0127, code lost:
    
        if (r6.m22835C0(r5, r3) == r4) goto L45;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7120j(String str, String str2, TokenMeaning tokenMeaning, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$insertHint$1 cardRepositoryImpl$insertHint$1;
        String strM23629f;
        TokenMeaning tokenMeaning2;
        Object objM22833A0;
        wn0 wn0Var;
        ArrayList arrayList;
        Object next;
        TokenMeaning tokenMeaning3;
        WordEntity wordEntity;
        int iM8134h;
        if (continuationImpl instanceof CardRepositoryImpl$insertHint$1) {
            cardRepositoryImpl$insertHint$1 = (CardRepositoryImpl$insertHint$1) continuationImpl;
            int i = cardRepositoryImpl$insertHint$1.f14705g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$insertHint$1.f14705g = i - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$insertHint$1 = new CardRepositoryImpl$insertHint$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$insertHint$1 = new CardRepositoryImpl$insertHint$1(this, continuationImpl);
        }
        Object obj = cardRepositoryImpl$insertHint$1.f14703e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardRepositoryImpl$insertHint$1.f14705g;
        un0 un0Var = this.f16453b;
        int i3 = 2;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            tokenMeaning2 = tokenMeaning;
            cardRepositoryImpl$insertHint$1.f14699a = tokenMeaning2;
            cardRepositoryImpl$insertHint$1.f14700b = strM23629f;
            cardRepositoryImpl$insertHint$1.f14705g = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$insertHint$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            strM23629f = cardRepositoryImpl$insertHint$1.f14700b;
            TokenMeaning tokenMeaning4 = cardRepositoryImpl$insertHint$1.f14699a;
            AbstractC3193b.m15359b(obj);
            objM22833A0 = obj;
            tokenMeaning2 = tokenMeaning4;
        } else if (i2 == 2) {
            ArrayList arrayList2 = cardRepositoryImpl$insertHint$1.f14702d;
            wn0Var = cardRepositoryImpl$insertHint$1.f14701c;
            TokenMeaning tokenMeaning5 = cardRepositoryImpl$insertHint$1.f14699a;
            AbstractC3193b.m15359b(obj);
            arrayList = arrayList2;
            tokenMeaning3 = tokenMeaning5;
            wordEntity = (WordEntity) obj;
            int iM8130d = tokenMeaning3.m8130d();
            String strM8131e = tokenMeaning3.m8131e();
            String strM8133g = tokenMeaning3.m8133g();
            int iM8132f = tokenMeaning3.m8132f();
            boolean zM8129c = tokenMeaning3.m8129c();
            String strM8128b = tokenMeaning3.m8128b();
            boolean zM8135i = tokenMeaning3.m8135i();
            if (wordEntity != null) {
                iM8134h = wordEntity.m7830f();
            } else {
                iM8134h = tokenMeaning3.m8134h();
            }
            arrayList.add(new TokenMeaning(iM8130d, strM8131e, strM8133g, iM8132f, zM8129c, strM8128b, zM8135i, iM8134h, 8));
            wn0Var.m24078m(arrayList);
            wn0Var.m24077l(t7d.m21899d(arrayList));
            cardRepositoryImpl$insertHint$1.f14699a = tokenMeaning3;
            cardRepositoryImpl$insertHint$1.f14700b = null;
            cardRepositoryImpl$insertHint$1.f14701c = null;
            cardRepositoryImpl$insertHint$1.f14702d = null;
            cardRepositoryImpl$insertHint$1.f14705g = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tokenMeaning3 = cardRepositoryImpl$insertHint$1.f14699a;
            AbstractC3193b.m15359b(obj);
        }
        boolean zM21898c = t7d.m21898c(tokenMeaning3);
        y15 y15Var = this.f16462k;
        if (zM21898c) {
            y15Var.mo49u1(LessonEngagedDataType.MeaningsCwtUsed, new Integer(1));
        } else {
            y15Var.mo49u1(LessonEngagedDataType.MeaningsPopularUsed, new Integer(1));
        }
        return Boolean.TRUE;
        wn0Var = (wn0) objM22833A0;
        if (wn0Var == null) {
            return Boolean.FALSE;
        }
        arrayList = new ArrayList();
        arrayList.addAll(wn0Var.m24070e());
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fa4.m11650l(((TokenMeaning) next).m8133g(), tokenMeaning2.m8133g()) && !fa4.m11650l(tokenMeaning2.m8133g(), "LOADING_CWT")) {
                break;
            }
        }
        if (((TokenMeaning) next) == null) {
            cardRepositoryImpl$insertHint$1.f14699a = tokenMeaning2;
            cardRepositoryImpl$insertHint$1.f14700b = null;
            cardRepositoryImpl$insertHint$1.f14701c = wn0Var;
            cardRepositoryImpl$insertHint$1.f14702d = arrayList;
            cardRepositoryImpl$insertHint$1.f14705g = 2;
            o7b o7bVar = this.f16454c;
            Object objM2861d = AbstractC0758a.m2861d(new k7b(strM23629f, o7bVar, i3), o7bVar.f53957K, cardRepositoryImpl$insertHint$1, true, false);
            if (objM2861d != coroutineSingletons) {
                TokenMeaning tokenMeaning6 = tokenMeaning2;
                obj = objM2861d;
                tokenMeaning3 = tokenMeaning6;
                wordEntity = (WordEntity) obj;
                int iM8130d2 = tokenMeaning3.m8130d();
                String strM8131e2 = tokenMeaning3.m8131e();
                String strM8133g2 = tokenMeaning3.m8133g();
                int iM8132f2 = tokenMeaning3.m8132f();
                boolean zM8129c2 = tokenMeaning3.m8129c();
                String strM8128b2 = tokenMeaning3.m8128b();
                boolean zM8135i2 = tokenMeaning3.m8135i();
                if (wordEntity != null) {
                    iM8134h = wordEntity.m7830f();
                } else {
                    iM8134h = tokenMeaning3.m8134h();
                }
                arrayList.add(new TokenMeaning(iM8130d2, strM8131e2, strM8133g2, iM8132f2, zM8129c2, strM8128b2, zM8135i2, iM8134h, 8));
                wn0Var.m24078m(arrayList);
                wn0Var.m24077l(t7d.m21899d(arrayList));
                cardRepositoryImpl$insertHint$1.f14699a = tokenMeaning3;
                cardRepositoryImpl$insertHint$1.f14700b = null;
                cardRepositoryImpl$insertHint$1.f14701c = null;
                cardRepositoryImpl$insertHint$1.f14702d = null;
                cardRepositoryImpl$insertHint$1.f14705g = 3;
            }
            return coroutineSingletons;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: k */
    public final c83 m7121k(String str, String str2) {
        str.getClass();
        str2.getClass();
        String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
        un0 un0Var = this.f16453b;
        un0Var.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, false, new String[]{"CardEntity"}, new nn0(strM23629f, un0Var, 2)));
    }

    /* JADX INFO: renamed from: l */
    public final c83 m7122l(String str, List list) {
        str.getClass();
        list.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (String str2 : list2) {
            localeForLanguageTag.getClass();
            arrayList.add(vz1.m23629f(str, vz1.m23610P(str2, localeForLanguageTag)));
        }
        un0 un0Var = this.f16453b;
        un0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CardEntity WHERE termWithLanguage IN (");
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity"}, new pn0(AbstractC3393o1.m17736k(")", sb, arrayList), arrayList, un0Var, 0)));
    }

    /* JADX INFO: renamed from: m */
    public final c83 m7123m(String str, List list) {
        str.getClass();
        list.getClass();
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        for (String str2 : list2) {
            localeForLanguageTag.getClass();
            arrayList.add(vz1.m23629f(str, vz1.m23610P(str2, localeForLanguageTag)));
        }
        un0 un0Var = this.f16453b;
        un0Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM CardEntity WHERE termWithLanguage IN (");
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity"}, new pn0(AbstractC3393o1.m17736k(")", sb, arrayList), arrayList, un0Var, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    /* JADX INFO: renamed from: n */
    public final Object m7124n(String str, String str2, TokenMeaning tokenMeaning, int i, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$removeCardHint$1 cardRepositoryImpl$removeCardHint$1;
        if (continuationImpl instanceof CardRepositoryImpl$removeCardHint$1) {
            cardRepositoryImpl$removeCardHint$1 = (CardRepositoryImpl$removeCardHint$1) continuationImpl;
            int i2 = cardRepositoryImpl$removeCardHint$1.f14710e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$removeCardHint$1.f14710e = i2 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$removeCardHint$1 = new CardRepositoryImpl$removeCardHint$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$removeCardHint$1 = new CardRepositoryImpl$removeCardHint$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$removeCardHint$1.f14708c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = cardRepositoryImpl$removeCardHint$1.f14710e;
        xfa xfaVar = xfa.f68157a;
        un0 un0Var = this.f16453b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$removeCardHint$1.f14706a = tokenMeaning;
            cardRepositoryImpl$removeCardHint$1.f14707b = i;
            cardRepositoryImpl$removeCardHint$1.f14710e = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$removeCardHint$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(objM22833A0);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = cardRepositoryImpl$removeCardHint$1.f14707b;
        tokenMeaning = cardRepositoryImpl$removeCardHint$1.f14706a;
        AbstractC3193b.m15359b(objM22833A0);
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(wn0Var.m24070e());
            C3741x c3741x = new C3741x(tokenMeaning, 6);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Boolean) c3741x.invoke(it.next())).booleanValue()) {
                    it.remove();
                }
            }
            wn0Var.m24078m(arrayList);
            wn0Var.m24077l(t7d.m21899d(arrayList));
            cardRepositoryImpl$removeCardHint$1.f14706a = null;
            cardRepositoryImpl$removeCardHint$1.f14707b = i;
            cardRepositoryImpl$removeCardHint$1.f14710e = 2;
            if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$removeCardHint$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m7125o(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$removeCardTag$1 cardRepositoryImpl$removeCardTag$1;
        String str4;
        String str5;
        if (continuationImpl instanceof CardRepositoryImpl$removeCardTag$1) {
            cardRepositoryImpl$removeCardTag$1 = (CardRepositoryImpl$removeCardTag$1) continuationImpl;
            int i = cardRepositoryImpl$removeCardTag$1.f14716f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$removeCardTag$1.f14716f = i - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$removeCardTag$1 = new CardRepositoryImpl$removeCardTag$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$removeCardTag$1 = new CardRepositoryImpl$removeCardTag$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$removeCardTag$1.f14714d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardRepositoryImpl$removeCardTag$1.f14716f;
        un0 un0Var = this.f16453b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$removeCardTag$1.f14711a = str;
            cardRepositoryImpl$removeCardTag$1.f14712b = str2;
            cardRepositoryImpl$removeCardTag$1.f14713c = str3;
            cardRepositoryImpl$removeCardTag$1.f14716f = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$removeCardTag$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str3 = cardRepositoryImpl$removeCardTag$1.f14713c;
            str2 = cardRepositoryImpl$removeCardTag$1.f14712b;
            str = cardRepositoryImpl$removeCardTag$1.f14711a;
            AbstractC3193b.m15359b(objM22833A0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = cardRepositoryImpl$removeCardTag$1.f14712b;
            str4 = cardRepositoryImpl$removeCardTag$1.f14711a;
            AbstractC3193b.m15359b(objM22833A0);
        }
        m7112c(this, str4, str5, null);
        return xfa.f68157a;
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(wn0Var.m24074i());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (fa4.m11650l((String) it.next(), str3)) {
                    arrayList.remove(str3);
                    break;
                }
            }
            wn0Var.m24081p(arrayList);
            cardRepositoryImpl$removeCardTag$1.f14711a = str;
            cardRepositoryImpl$removeCardTag$1.f14712b = str2;
            cardRepositoryImpl$removeCardTag$1.f14713c = null;
            cardRepositoryImpl$removeCardTag$1.f14716f = 2;
            if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$removeCardTag$1) != coroutineSingletons) {
                String str6 = str2;
                str4 = str;
                str5 = str6;
                m7112c(this, str4, str5, null);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00eb A[LOOP:0: B:30:0x00e8->B:32:0x00eb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m7126p(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$reviewCard$1 cardRepositoryImpl$reviewCard$1;
        String strM23629f;
        String str3;
        String str4;
        String str5;
        Pair[] pairArr;
        hi8 hi8Var;
        int i2;
        if (continuationImpl instanceof CardRepositoryImpl$reviewCard$1) {
            cardRepositoryImpl$reviewCard$1 = (CardRepositoryImpl$reviewCard$1) continuationImpl;
            int i3 = cardRepositoryImpl$reviewCard$1.f14722f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$reviewCard$1.f14722f = i3 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$reviewCard$1 = new CardRepositoryImpl$reviewCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$reviewCard$1 = new CardRepositoryImpl$reviewCard$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$reviewCard$1.f14720d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = cardRepositoryImpl$reviewCard$1.f14722f;
        un0 un0Var = this.f16453b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$reviewCard$1.f14717a = str;
            cardRepositoryImpl$reviewCard$1.f14718b = strM23629f;
            cardRepositoryImpl$reviewCard$1.f14719c = i;
            cardRepositoryImpl$reviewCard$1.f14722f = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$reviewCard$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = cardRepositoryImpl$reviewCard$1.f14719c;
            String str6 = cardRepositoryImpl$reviewCard$1.f14718b;
            String str7 = cardRepositoryImpl$reviewCard$1.f14717a;
            AbstractC3193b.m15359b(objM22833A0);
            strM23629f = str6;
            str = str7;
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = cardRepositoryImpl$reviewCard$1.f14719c;
            str5 = cardRepositoryImpl$reviewCard$1.f14718b;
            str4 = cardRepositoryImpl$reviewCard$1.f14717a;
            AbstractC3193b.m15359b(objM22833A0);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(CardReviewWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str4), new Pair("cardId", Integer.valueOf(i)), new Pair("term", str5)};
        hi8Var = new hi8(10);
        for (i2 = 0; i2 < 3; i2++) {
            Pair pair = pairArr[i2];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16460i.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var != null) {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.set(5, calendar.get(5) + 1);
                str3 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").format(calendar.getTime());
                str3.getClass();
            } catch (Exception unused) {
                str3 = "";
            }
            wn0Var.m24079n(str3);
            cardRepositoryImpl$reviewCard$1.f14717a = str;
            cardRepositoryImpl$reviewCard$1.f14718b = strM23629f;
            cardRepositoryImpl$reviewCard$1.f14719c = i;
            cardRepositoryImpl$reviewCard$1.f14722f = 2;
            if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$reviewCard$1) != coroutineSingletons) {
                String str8 = strM23629f;
                str4 = str;
                str5 = str8;
                xj1 xj1Var2 = new xj1();
                xj1Var2.m24558b(NetworkType.CONNECTED);
                tx6 tx6Var2 = (tx6) ((tx6) new tx6(CardReviewWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
                pairArr = new Pair[]{new Pair("language", str4), new Pair("cardId", Integer.valueOf(i)), new Pair("term", str5)};
                hi8Var = new hi8(10);
                while (i2 < 3) {
                    Pair pair2 = pairArr[i2];
                    hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
                }
                this.f16460i.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0172  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: q */
    public final Object m7127q(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$syncCreateCard$1 cardRepositoryImpl$syncCreateCard$1;
        String str3;
        int i2;
        int i3;
        ResultVocabularyCard resultVocabularyCard;
        CardEntity cardEntity;
        int iM7532m;
        if (continuationImpl instanceof CardRepositoryImpl$syncCreateCard$1) {
            cardRepositoryImpl$syncCreateCard$1 = (CardRepositoryImpl$syncCreateCard$1) continuationImpl;
            int i4 = cardRepositoryImpl$syncCreateCard$1.f14728f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$syncCreateCard$1.f14728f = i4 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$syncCreateCard$1 = new CardRepositoryImpl$syncCreateCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$syncCreateCard$1 = new CardRepositoryImpl$syncCreateCard$1(this, continuationImpl);
        }
        Object objM22837z0 = cardRepositoryImpl$syncCreateCard$1.f14726d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = cardRepositoryImpl$syncCreateCard$1.f14728f;
        xfa xfaVar = xfa.f68157a;
        un0 un0Var = this.f16453b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM22837z0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$syncCreateCard$1.f14723a = str;
            cardRepositoryImpl$syncCreateCard$1.f14725c = i;
            cardRepositoryImpl$syncCreateCard$1.f14728f = 1;
            objM22837z0 = un0Var.m22837z0(strM23629f, cardRepositoryImpl$syncCreateCard$1);
            if (objM22837z0 != coroutineSingletons) {
                str3 = str;
                i2 = i;
            }
        }
        if (i5 == 1) {
            i2 = cardRepositoryImpl$syncCreateCard$1.f14725c;
            str3 = cardRepositoryImpl$syncCreateCard$1.f14723a;
            AbstractC3193b.m15359b(objM22837z0);
        } else {
            if (i5 == 2) {
                i3 = cardRepositoryImpl$syncCreateCard$1.f14725c;
                String str4 = cardRepositoryImpl$syncCreateCard$1.f14723a;
                AbstractC3193b.m15359b(objM22837z0);
                str3 = str4;
                resultVocabularyCard = (ResultVocabularyCard) objM22837z0;
                String strM23629f2 = vz1.m23629f(str3, vz1.m23609O(resultVocabularyCard.m8398c(), str3));
                cardRepositoryImpl$syncCreateCard$1.f14723a = str3;
                cardRepositoryImpl$syncCreateCard$1.f14724b = resultVocabularyCard;
                cardRepositoryImpl$syncCreateCard$1.f14725c = i3;
                cardRepositoryImpl$syncCreateCard$1.f14728f = 3;
                objM22837z0 = un0Var.m22837z0(strM23629f2, cardRepositoryImpl$syncCreateCard$1);
                if (objM22837z0 != coroutineSingletons) {
                }
            }
            if (i5 != 3) {
                if (i5 == 4) {
                    AbstractC3193b.m15359b(objM22837z0);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = cardRepositoryImpl$syncCreateCard$1.f14725c;
            resultVocabularyCard = cardRepositoryImpl$syncCreateCard$1.f14724b;
            str3 = cardRepositoryImpl$syncCreateCard$1.f14723a;
            AbstractC3193b.m15359b(objM22837z0);
        }
        cardEntity = (CardEntity) objM22837z0;
        String strM23629f3 = vz1.m23629f(str3, vz1.m23609O(resultVocabularyCard.m8398c(), str3));
        boolean zM24985d = y7d.m24985d(resultVocabularyCard.m8398c());
        if (cardEntity != null) {
            iM7532m = cardEntity.m7532m();
        } else {
            iM7532m = 0;
        }
        CardEntity cardEntityM25805m = zuc.m25805m(resultVocabularyCard, strM23629f3, zM24985d, Math.max(iM7532m, resultVocabularyCard.m8396a()));
        cardRepositoryImpl$syncCreateCard$1.f14723a = null;
        cardRepositoryImpl$syncCreateCard$1.f14724b = null;
        cardRepositoryImpl$syncCreateCard$1.f14725c = i3;
        cardRepositoryImpl$syncCreateCard$1.f14728f = 4;
        return un0Var.mo4095v0(cardEntityM25805m, cardRepositoryImpl$syncCreateCard$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
        CardEntity cardEntity2 = (CardEntity) objM22837z0;
        if (cardEntity2 != null) {
            String strM7544y = cardEntity2.m7544y();
            String strM7524e = cardEntity2.m7524e();
            String strM7538s = cardEntity2.m7538s();
            List listM7543x = cardEntity2.m7543x();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM7543x) {
                if (((String) obj).length() != 0) {
                    arrayList.add(obj);
                }
            }
            int iM7542w = cardEntity2.m7542w();
            Integer num = i2 == -1 ? null : new Integer(i2);
            List<TokenMeaning> listM7537r = cardEntity2.m7537r();
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM7537r, 10));
            for (TokenMeaning tokenMeaning : listM7537r) {
                arrayList2.add(new RequestHintUpdate(tokenMeaning.m8131e(), tokenMeaning.m8133g(), cardEntity2.m7544y(), Boolean.valueOf(tokenMeaning.m8135i()), (Integer) null, 16));
            }
            Integer numM7523d = cardEntity2.m7523d();
            String strM7522c = cardEntity2.m7522c();
            if (strM7522c == null) {
                strM7522c = y02.m24804b();
            }
            RequestDataCard requestDataCard = new RequestDataCard(strM7544y, strM7524e, iM7542w, numM7523d, strM7538s, arrayList2, arrayList, num, strM7522c);
            cardRepositoryImpl$syncCreateCard$1.f14723a = str3;
            cardRepositoryImpl$syncCreateCard$1.f14725c = i2;
            cardRepositoryImpl$syncCreateCard$1.f14728f = 2;
            objM22837z0 = this.f16456e.m4912h(str3, requestDataCard, cardRepositoryImpl$syncCreateCard$1);
            if (objM22837z0 != coroutineSingletons) {
                i3 = i2;
                resultVocabularyCard = (ResultVocabularyCard) objM22837z0;
                String strM23629f4 = vz1.m23629f(str3, vz1.m23609O(resultVocabularyCard.m8398c(), str3));
                cardRepositoryImpl$syncCreateCard$1.f14723a = str3;
                cardRepositoryImpl$syncCreateCard$1.f14724b = resultVocabularyCard;
                cardRepositoryImpl$syncCreateCard$1.f14725c = i3;
                cardRepositoryImpl$syncCreateCard$1.f14728f = 3;
                objM22837z0 = un0Var.m22837z0(strM23629f4, cardRepositoryImpl$syncCreateCard$1);
                if (objM22837z0 != coroutineSingletons) {
                    cardEntity = (CardEntity) objM22837z0;
                    String strM23629f5 = vz1.m23629f(str3, vz1.m23609O(resultVocabularyCard.m8398c(), str3));
                    boolean zM24985d2 = y7d.m24985d(resultVocabularyCard.m8398c());
                    if (cardEntity != null) {
                        iM7532m = cardEntity.m7532m();
                    } else {
                        iM7532m = 0;
                    }
                    CardEntity cardEntityM25805m2 = zuc.m25805m(resultVocabularyCard, strM23629f5, zM24985d2, Math.max(iM7532m, resultVocabularyCard.m8396a()));
                    cardRepositoryImpl$syncCreateCard$1.f14723a = null;
                    cardRepositoryImpl$syncCreateCard$1.f14724b = null;
                    cardRepositoryImpl$syncCreateCard$1.f14725c = i3;
                    cardRepositoryImpl$syncCreateCard$1.f14728f = 4;
                    if (un0Var.mo4095v0(cardEntityM25805m2, cardRepositoryImpl$syncCreateCard$1) == coroutineSingletons) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a1, code lost:
    
        if (r3.m22835C0(r12, r0) == r1) goto L31;
     */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7128r(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$syncReviewCard$1 cardRepositoryImpl$syncReviewCard$1;
        String str3;
        int i2;
        wn0 wn0Var;
        if (continuationImpl instanceof CardRepositoryImpl$syncReviewCard$1) {
            cardRepositoryImpl$syncReviewCard$1 = (CardRepositoryImpl$syncReviewCard$1) continuationImpl;
            int i3 = cardRepositoryImpl$syncReviewCard$1.f14736h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$syncReviewCard$1.f14736h = i3 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$syncReviewCard$1 = new CardRepositoryImpl$syncReviewCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$syncReviewCard$1 = new CardRepositoryImpl$syncReviewCard$1(this, continuationImpl);
        }
        Object objM4905a = cardRepositoryImpl$syncReviewCard$1.f14734f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = cardRepositoryImpl$syncReviewCard$1.f14736h;
        un0 un0Var = this.f16453b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM4905a);
            Integer num = new Integer(i);
            cardRepositoryImpl$syncReviewCard$1.f14729a = str;
            cardRepositoryImpl$syncReviewCard$1.f14730b = str2;
            cardRepositoryImpl$syncReviewCard$1.f14732d = i;
            cardRepositoryImpl$syncReviewCard$1.f14736h = 1;
            objM4905a = this.f16456e.m4905a(str, num, cardRepositoryImpl$syncReviewCard$1);
            if (objM4905a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            i = cardRepositoryImpl$syncReviewCard$1.f14732d;
            str2 = cardRepositoryImpl$syncReviewCard$1.f14730b;
            str = cardRepositoryImpl$syncReviewCard$1.f14729a;
            AbstractC3193b.m15359b(objM4905a);
        } else if (i4 == 2) {
            i2 = cardRepositoryImpl$syncReviewCard$1.f14733e;
            i = cardRepositoryImpl$syncReviewCard$1.f14732d;
            str3 = cardRepositoryImpl$syncReviewCard$1.f14731c;
            AbstractC3193b.m15359b(objM4905a);
            wn0Var = (wn0) objM4905a;
            if (wn0Var != null) {
                wn0Var.m24079n(str3);
                cardRepositoryImpl$syncReviewCard$1.f14729a = null;
                cardRepositoryImpl$syncReviewCard$1.f14730b = null;
                cardRepositoryImpl$syncReviewCard$1.f14731c = null;
                cardRepositoryImpl$syncReviewCard$1.f14732d = i;
                cardRepositoryImpl$syncReviewCard$1.f14733e = i2;
                cardRepositoryImpl$syncReviewCard$1.f14736h = 3;
            }
        } else {
            if (i4 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM4905a);
        }
        return xfa.f68157a;
        String strM8331a = ((ResultCardReview) objM4905a).m8331a();
        if (strM8331a != null) {
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$syncReviewCard$1.f14729a = null;
            cardRepositoryImpl$syncReviewCard$1.f14730b = null;
            cardRepositoryImpl$syncReviewCard$1.f14731c = strM8331a;
            cardRepositoryImpl$syncReviewCard$1.f14732d = i;
            cardRepositoryImpl$syncReviewCard$1.f14733e = 0;
            cardRepositoryImpl$syncReviewCard$1.f14736h = 2;
            objM4905a = un0Var.m22833A0(strM23629f, cardRepositoryImpl$syncReviewCard$1);
            if (objM4905a != coroutineSingletons) {
                str3 = strM8331a;
                i2 = 0;
                wn0Var = (wn0) objM4905a;
                if (wn0Var != null) {
                    wn0Var.m24079n(str3);
                    cardRepositoryImpl$syncReviewCard$1.f14729a = null;
                    cardRepositoryImpl$syncReviewCard$1.f14730b = null;
                    cardRepositoryImpl$syncReviewCard$1.f14731c = null;
                    cardRepositoryImpl$syncReviewCard$1.f14732d = i;
                    cardRepositoryImpl$syncReviewCard$1.f14733e = i2;
                    cardRepositoryImpl$syncReviewCard$1.f14736h = 3;
                }
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x01c1 A[LOOP:0: B:60:0x01bb->B:62:0x01c1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fe A[LOOP:1: B:67:0x01f1->B:69:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x023e  */
    /* JADX WARN: Code duplicated, block: B:76:0x0274  */
    /* JADX WARN: Code duplicated, block: B:79:0x0290  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:84:0x021c A[EDGE_INSN: B:84:0x021c->B:70:0x021c BREAK  A[LOOP:1: B:67:0x01f1->B:69:0x01fe], SYNTHETIC] */
    /* JADX INFO: renamed from: s */
    public final Object m7129s(String str, String str2, Integer num, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$syncUpdateCard$1 cardRepositoryImpl$syncUpdateCard$1;
        Integer num2;
        String str4;
        String str5;
        int i;
        String str6;
        ResultVocabularyCard resultVocabularyCard;
        Object objM22833A0;
        ResultVocabularyCard resultVocabularyCard2;
        String str7;
        wn0 wn0Var;
        ArrayList arrayList;
        Iterator it;
        int iM15363P;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        C3705w0 c3705w0;
        int i2;
        Object objM22837z0;
        Object obj;
        LinkedHashMap linkedHashMap2;
        ResultVocabularyCard resultVocabularyCard3;
        CardEntity cardEntityM25805m;
        if (continuationImpl instanceof CardRepositoryImpl$syncUpdateCard$1) {
            cardRepositoryImpl$syncUpdateCard$1 = (CardRepositoryImpl$syncUpdateCard$1) continuationImpl;
            int i3 = cardRepositoryImpl$syncUpdateCard$1.f14745i;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$syncUpdateCard$1.f14745i = i3 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$syncUpdateCard$1 = new CardRepositoryImpl$syncUpdateCard$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$syncUpdateCard$1 = new CardRepositoryImpl$syncUpdateCard$1(this, continuationImpl);
        }
        Object objM22837z1 = cardRepositoryImpl$syncUpdateCard$1.f14743g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = cardRepositoryImpl$syncUpdateCard$1.f14745i;
        xfa xfaVar = xfa.f68157a;
        un0 un0Var = this.f16453b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM22837z1);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$syncUpdateCard$1.f14737a = str;
            num2 = num;
            cardRepositoryImpl$syncUpdateCard$1.f14738b = num2;
            cardRepositoryImpl$syncUpdateCard$1.f14739c = str3;
            cardRepositoryImpl$syncUpdateCard$1.f14745i = 1;
            objM22837z1 = un0Var.m22837z0(strM23629f, cardRepositoryImpl$syncUpdateCard$1);
            if (objM22837z1 != coroutineSingletons) {
                str4 = str3;
                str5 = str;
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            String str8 = cardRepositoryImpl$syncUpdateCard$1.f14739c;
            num2 = cardRepositoryImpl$syncUpdateCard$1.f14738b;
            str5 = cardRepositoryImpl$syncUpdateCard$1.f14737a;
            AbstractC3193b.m15359b(objM22837z1);
            str4 = str8;
        } else {
            if (i4 == 2) {
                i = cardRepositoryImpl$syncUpdateCard$1.f14742f;
                str6 = cardRepositoryImpl$syncUpdateCard$1.f14737a;
                AbstractC3193b.m15359b(objM22837z1);
                resultVocabularyCard = (ResultVocabularyCard) objM22837z1;
                String strM23629f2 = vz1.m23629f(str6, vz1.m23609O(resultVocabularyCard.m8398c(), str6));
                cardRepositoryImpl$syncUpdateCard$1.f14737a = str6;
                cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                cardRepositoryImpl$syncUpdateCard$1.f14740d = resultVocabularyCard;
                cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                cardRepositoryImpl$syncUpdateCard$1.f14745i = 3;
                objM22833A0 = un0Var.m22833A0(strM23629f2, cardRepositoryImpl$syncUpdateCard$1);
                if (objM22833A0 != coroutineSingletons) {
                    resultVocabularyCard2 = resultVocabularyCard;
                    objM22837z1 = objM22833A0;
                    str7 = str6;
                    wn0Var = (wn0) objM22837z1;
                    if (wn0Var != null) {
                        List listM24070e = wn0Var.m24070e();
                        arrayList = new ArrayList(v91.m23189q0(listM24070e, 10));
                        it = listM24070e.iterator();
                        while (it.hasNext()) {
                            AbstractC3393o1.m17749x(((TokenMeaning) it.next()).m8130d(), arrayList);
                        }
                        C3512qv c3512qv = new C3512qv(new C3539rk(arrayList, 7), 1);
                        iM15363P = AbstractC3194a.m15363P(v91.m23189q0(c3512qv, 10));
                        if (iM15363P < 16) {
                            iM15363P = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM15363P);
                        it2 = c3512qv.iterator();
                        while (true) {
                            c3705w0 = (C3705w0) it2;
                            if (!((Iterator) c3705w0.f66156c).hasNext()) {
                                break;
                                break;
                            }
                            r34 r34Var = (r34) c3705w0.next();
                            linkedHashMap.put(new Integer(((Number) r34Var.f58553b).intValue()), new Integer(r34Var.f58552a));
                        }
                        String strM23629f3 = vz1.m23629f(str7, vz1.m23609O(resultVocabularyCard2.m8398c(), str7));
                        cardRepositoryImpl$syncUpdateCard$1.f14737a = str7;
                        cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                        cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                        cardRepositoryImpl$syncUpdateCard$1.f14740d = resultVocabularyCard2;
                        cardRepositoryImpl$syncUpdateCard$1.f14741e = linkedHashMap;
                        cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                        i2 = 4;
                        cardRepositoryImpl$syncUpdateCard$1.f14745i = 4;
                        objM22837z0 = un0Var.m22837z0(strM23629f3, cardRepositoryImpl$syncUpdateCard$1);
                        if (objM22837z0 != coroutineSingletons) {
                            ResultVocabularyCard resultVocabularyCard4 = resultVocabularyCard2;
                            obj = objM22837z0;
                            linkedHashMap2 = linkedHashMap;
                            resultVocabularyCard3 = resultVocabularyCard4;
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            }
            if (i4 == 3) {
                i = cardRepositoryImpl$syncUpdateCard$1.f14742f;
                ResultVocabularyCard resultVocabularyCard5 = cardRepositoryImpl$syncUpdateCard$1.f14740d;
                String str9 = cardRepositoryImpl$syncUpdateCard$1.f14737a;
                AbstractC3193b.m15359b(objM22837z1);
                str7 = str9;
                resultVocabularyCard2 = resultVocabularyCard5;
                wn0Var = (wn0) objM22837z1;
                if (wn0Var != null) {
                    List listM24070e2 = wn0Var.m24070e();
                    arrayList = new ArrayList(v91.m23189q0(listM24070e2, 10));
                    it = listM24070e2.iterator();
                    while (it.hasNext()) {
                        AbstractC3393o1.m17749x(((TokenMeaning) it.next()).m8130d(), arrayList);
                    }
                    C3512qv c3512qv2 = new C3512qv(new C3539rk(arrayList, 7), 1);
                    iM15363P = AbstractC3194a.m15363P(v91.m23189q0(c3512qv2, 10));
                    if (iM15363P < 16) {
                        iM15363P = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iM15363P);
                    it2 = c3512qv2.iterator();
                    while (true) {
                        c3705w0 = (C3705w0) it2;
                        if (!((Iterator) c3705w0.f66156c).hasNext()) {
                            break;
                        }
                        r34 r34Var2 = (r34) c3705w0.next();
                        linkedHashMap.put(new Integer(((Number) r34Var2.f58553b).intValue()), new Integer(r34Var2.f58552a));
                    }
                    String strM23629f4 = vz1.m23629f(str7, vz1.m23609O(resultVocabularyCard2.m8398c(), str7));
                    cardRepositoryImpl$syncUpdateCard$1.f14737a = str7;
                    cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                    cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                    cardRepositoryImpl$syncUpdateCard$1.f14740d = resultVocabularyCard2;
                    cardRepositoryImpl$syncUpdateCard$1.f14741e = linkedHashMap;
                    cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                    i2 = 4;
                    cardRepositoryImpl$syncUpdateCard$1.f14745i = 4;
                    objM22837z0 = un0Var.m22837z0(strM23629f4, cardRepositoryImpl$syncUpdateCard$1);
                    if (objM22837z0 != coroutineSingletons) {
                        ResultVocabularyCard resultVocabularyCard6 = resultVocabularyCard2;
                        obj = objM22837z0;
                        linkedHashMap2 = linkedHashMap;
                        resultVocabularyCard3 = resultVocabularyCard6;
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            }
            if (i4 != 4) {
                if (i4 == 5) {
                    AbstractC3193b.m15359b(objM22837z1);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = cardRepositoryImpl$syncUpdateCard$1.f14742f;
            linkedHashMap2 = cardRepositoryImpl$syncUpdateCard$1.f14741e;
            ResultVocabularyCard resultVocabularyCard7 = cardRepositoryImpl$syncUpdateCard$1.f14740d;
            str7 = cardRepositoryImpl$syncUpdateCard$1.f14737a;
            AbstractC3193b.m15359b(objM22837z1);
            resultVocabularyCard3 = resultVocabularyCard7;
            obj = objM22837z1;
            i2 = 4;
        }
        CardEntity cardEntity = (CardEntity) obj;
        resultVocabularyCard3.m8399d(u91.m22614f1(resultVocabularyCard3.m8397b(), new bo0(0, new C3166k(i2), linkedHashMap2)));
        cardEntityM25805m = zuc.m25805m(resultVocabularyCard3, vz1.m23629f(str7, vz1.m23609O(resultVocabularyCard3.m8398c(), str7)), y7d.m24985d(resultVocabularyCard3.m8398c()), Math.max(cardEntity != null ? cardEntity.m7532m() : 0, resultVocabularyCard3.m8396a()));
        if (cardEntityM25805m.m7542w() != CardStatus.Ignored.getValue()) {
            cardRepositoryImpl$syncUpdateCard$1.f14737a = null;
            cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
            cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
            cardRepositoryImpl$syncUpdateCard$1.f14740d = null;
            cardRepositoryImpl$syncUpdateCard$1.f14741e = null;
            cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
            cardRepositoryImpl$syncUpdateCard$1.f14745i = 5;
            if (un0Var.mo4095v0(cardEntityM25805m, cardRepositoryImpl$syncUpdateCard$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        Integer num3 = num2;
        CardEntity cardEntity2 = (CardEntity) objM22837z1;
        if (cardEntity2 != null) {
            int iM24983b = y7d.m24983b(cardEntity2.m7542w(), cardEntity2.m7523d());
            String strM7544y = cardEntity2.m7544y();
            String strM7524e = cardEntity2.m7524e();
            String strM7538s = cardEntity2.m7538s();
            List listM7543x = cardEntity2.m7543x();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : listM7543x) {
                if (((String) obj2).length() != 0) {
                    arrayList2.add(obj2);
                }
            }
            CardStatus cardStatus = CardStatus.Known;
            int value = iM24983b == cardStatus.getValue() ? CardStatus.Learned.getValue() : iM24983b;
            int value2 = iM24983b == cardStatus.getValue() ? CardExtendedStatus.Known.getValue() : CardExtendedStatus.NotKnown.getValue();
            List<TokenMeaning> listM7537r = cardEntity2.m7537r();
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(listM7537r, 10));
            for (TokenMeaning tokenMeaning : listM7537r) {
                arrayList3.add(new RequestHintUpdate(tokenMeaning.m8131e(), tokenMeaning.m8133g(), cardEntity2.m7544y(), Boolean.valueOf(tokenMeaning.m8135i()), (Integer) null, 16));
            }
            RequestDataCard requestDataCard = new RequestDataCard(strM7544y, strM7524e, value, new Integer(value2), strM7538s, arrayList3, arrayList2, num3, str4);
            Integer num4 = new Integer(cardEntity2.m7531l());
            cardRepositoryImpl$syncUpdateCard$1.f14737a = str5;
            cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
            cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
            cardRepositoryImpl$syncUpdateCard$1.f14742f = iM24983b;
            cardRepositoryImpl$syncUpdateCard$1.f14745i = 2;
            objM22837z1 = this.f16456e.m4911g(str5, num4, requestDataCard, cardRepositoryImpl$syncUpdateCard$1);
            if (objM22837z1 != coroutineSingletons) {
                i = iM24983b;
                str6 = str5;
                resultVocabularyCard = (ResultVocabularyCard) objM22837z1;
                String strM23629f5 = vz1.m23629f(str6, vz1.m23609O(resultVocabularyCard.m8398c(), str6));
                cardRepositoryImpl$syncUpdateCard$1.f14737a = str6;
                cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                cardRepositoryImpl$syncUpdateCard$1.f14740d = resultVocabularyCard;
                cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                cardRepositoryImpl$syncUpdateCard$1.f14745i = 3;
                objM22833A0 = un0Var.m22833A0(strM23629f5, cardRepositoryImpl$syncUpdateCard$1);
                if (objM22833A0 != coroutineSingletons) {
                    resultVocabularyCard2 = resultVocabularyCard;
                    objM22837z1 = objM22833A0;
                    str7 = str6;
                    wn0Var = (wn0) objM22837z1;
                    if (wn0Var != null) {
                        List listM24070e3 = wn0Var.m24070e();
                        arrayList = new ArrayList(v91.m23189q0(listM24070e3, 10));
                        it = listM24070e3.iterator();
                        while (it.hasNext()) {
                            AbstractC3393o1.m17749x(((TokenMeaning) it.next()).m8130d(), arrayList);
                        }
                        C3512qv c3512qv3 = new C3512qv(new C3539rk(arrayList, 7), 1);
                        iM15363P = AbstractC3194a.m15363P(v91.m23189q0(c3512qv3, 10));
                        if (iM15363P < 16) {
                            iM15363P = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iM15363P);
                        it2 = c3512qv3.iterator();
                        while (true) {
                            c3705w0 = (C3705w0) it2;
                            if (!((Iterator) c3705w0.f66156c).hasNext()) {
                                break;
                                break;
                            }
                            r34 r34Var3 = (r34) c3705w0.next();
                            linkedHashMap.put(new Integer(((Number) r34Var3.f58553b).intValue()), new Integer(r34Var3.f58552a));
                        }
                        String strM23629f6 = vz1.m23629f(str7, vz1.m23609O(resultVocabularyCard2.m8398c(), str7));
                        cardRepositoryImpl$syncUpdateCard$1.f14737a = str7;
                        cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                        cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                        cardRepositoryImpl$syncUpdateCard$1.f14740d = resultVocabularyCard2;
                        cardRepositoryImpl$syncUpdateCard$1.f14741e = linkedHashMap;
                        cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                        i2 = 4;
                        cardRepositoryImpl$syncUpdateCard$1.f14745i = 4;
                        objM22837z0 = un0Var.m22837z0(strM23629f6, cardRepositoryImpl$syncUpdateCard$1);
                        if (objM22837z0 != coroutineSingletons) {
                            ResultVocabularyCard resultVocabularyCard8 = resultVocabularyCard2;
                            obj = objM22837z0;
                            linkedHashMap2 = linkedHashMap;
                            resultVocabularyCard3 = resultVocabularyCard8;
                            CardEntity cardEntity3 = (CardEntity) obj;
                            resultVocabularyCard3.m8399d(u91.m22614f1(resultVocabularyCard3.m8397b(), new bo0(0, new C3166k(i2), linkedHashMap2)));
                            cardEntityM25805m = zuc.m25805m(resultVocabularyCard3, vz1.m23629f(str7, vz1.m23609O(resultVocabularyCard3.m8398c(), str7)), y7d.m24985d(resultVocabularyCard3.m8398c()), Math.max(cardEntity3 != null ? cardEntity3.m7532m() : 0, resultVocabularyCard3.m8396a()));
                            if (cardEntityM25805m.m7542w() != CardStatus.Ignored.getValue()) {
                                cardRepositoryImpl$syncUpdateCard$1.f14737a = null;
                                cardRepositoryImpl$syncUpdateCard$1.f14738b = null;
                                cardRepositoryImpl$syncUpdateCard$1.f14739c = null;
                                cardRepositoryImpl$syncUpdateCard$1.f14740d = null;
                                cardRepositoryImpl$syncUpdateCard$1.f14741e = null;
                                cardRepositoryImpl$syncUpdateCard$1.f14742f = i;
                                cardRepositoryImpl$syncUpdateCard$1.f14745i = 5;
                                if (un0Var.mo4095v0(cardEntityM25805m, cardRepositoryImpl$syncUpdateCard$1) == coroutineSingletons) {
                                }
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    /* JADX INFO: renamed from: t */
    public final Object m7130t(String str, String str2, TokenMeaning tokenMeaning, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$updateCardHint$1 cardRepositoryImpl$updateCardHint$1;
        int i;
        int i2;
        if (continuationImpl instanceof CardRepositoryImpl$updateCardHint$1) {
            cardRepositoryImpl$updateCardHint$1 = (CardRepositoryImpl$updateCardHint$1) continuationImpl;
            int i3 = cardRepositoryImpl$updateCardHint$1.f14751f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardHint$1.f14751f = i3 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardHint$1 = new CardRepositoryImpl$updateCardHint$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$updateCardHint$1 = new CardRepositoryImpl$updateCardHint$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$updateCardHint$1.f14749d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = cardRepositoryImpl$updateCardHint$1.f14751f;
        un0 un0Var = this.f16453b;
        if (i4 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$updateCardHint$1.f14746a = tokenMeaning;
            cardRepositoryImpl$updateCardHint$1.f14747b = str3;
            cardRepositoryImpl$updateCardHint$1.f14751f = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$updateCardHint$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i4 == 1) {
            str3 = cardRepositoryImpl$updateCardHint$1.f14747b;
            tokenMeaning = cardRepositoryImpl$updateCardHint$1.f14746a;
            AbstractC3193b.m15359b(objM22833A0);
        } else {
            if (i4 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = cardRepositoryImpl$updateCardHint$1.f14748c;
            AbstractC3193b.m15359b(objM22833A0);
        }
        i = i2;
        return new Integer(i);
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var == null) {
            return new Integer(-1);
        }
        int size = wn0Var.m24070e().size();
        i = 0;
        for (int i5 = 0; i5 < size; i5++) {
            TokenMeaning tokenMeaning2 = (TokenMeaning) wn0Var.m24070e().get(i5);
            if (fa4.m11650l(tokenMeaning2.m8133g(), tokenMeaning.m8133g())) {
                TokenMeaning tokenMeaningM8127a = TokenMeaning.m8127a(tokenMeaning2, 0, null, str3, 1019);
                ArrayList arrayListM22624p1 = u91.m22624p1(wn0Var.m24070e());
                arrayListM22624p1.set(i5, tokenMeaningM8127a);
                wn0Var.m24078m(arrayListM22624p1);
                wn0Var.m24077l(t7d.m21899d(wn0Var.m24070e()));
                cardRepositoryImpl$updateCardHint$1.f14746a = null;
                cardRepositoryImpl$updateCardHint$1.f14747b = null;
                cardRepositoryImpl$updateCardHint$1.f14748c = i5;
                cardRepositoryImpl$updateCardHint$1.f14751f = 2;
                if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$updateCardHint$1) != coroutineSingletons) {
                    i2 = i5;
                    i = i2;
                    break;
                }
                return coroutineSingletons;
            }
        }
        return new Integer(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r8.m22835C0(r13, r0) == r1) goto L27;
     */
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
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7131u(String str, String str2, TokenMeaning tokenMeaning, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$updateCardHintLocale$1 cardRepositoryImpl$updateCardHintLocale$1;
        if (continuationImpl instanceof CardRepositoryImpl$updateCardHintLocale$1) {
            cardRepositoryImpl$updateCardHintLocale$1 = (CardRepositoryImpl$updateCardHintLocale$1) continuationImpl;
            int i = cardRepositoryImpl$updateCardHintLocale$1.f14756e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardHintLocale$1.f14756e = i - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardHintLocale$1 = new CardRepositoryImpl$updateCardHintLocale$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$updateCardHintLocale$1 = new CardRepositoryImpl$updateCardHintLocale$1(this, continuationImpl);
        }
        Object objM22833A0 = cardRepositoryImpl$updateCardHintLocale$1.f14754c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardRepositoryImpl$updateCardHintLocale$1.f14756e;
        un0 un0Var = this.f16453b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22833A0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$updateCardHintLocale$1.f14752a = tokenMeaning;
            cardRepositoryImpl$updateCardHintLocale$1.f14753b = str3;
            cardRepositoryImpl$updateCardHintLocale$1.f14756e = 1;
            objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$updateCardHintLocale$1);
            if (objM22833A0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str3 = cardRepositoryImpl$updateCardHintLocale$1.f14753b;
            tokenMeaning = cardRepositoryImpl$updateCardHintLocale$1.f14752a;
            AbstractC3193b.m15359b(objM22833A0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM22833A0);
        }
        return xfa.f68157a;
        wn0 wn0Var = (wn0) objM22833A0;
        if (wn0Var != null) {
            int size = wn0Var.m24070e().size();
            for (int i3 = 0; i3 < size; i3++) {
                TokenMeaning tokenMeaning2 = (TokenMeaning) wn0Var.m24070e().get(i3);
                if (fa4.m11650l(tokenMeaning2.m8133g(), tokenMeaning.m8133g())) {
                    TokenMeaning tokenMeaningM8127a = TokenMeaning.m8127a(tokenMeaning2, 0, str3, null, 1021);
                    ArrayList arrayListM22624p1 = u91.m22624p1(wn0Var.m24070e());
                    arrayListM22624p1.set(i3, tokenMeaningM8127a);
                    wn0Var.m24078m(arrayListM22624p1);
                    cardRepositoryImpl$updateCardHintLocale$1.f14752a = null;
                    cardRepositoryImpl$updateCardHintLocale$1.f14753b = null;
                    cardRepositoryImpl$updateCardHintLocale$1.f14756e = 2;
                }
            }
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: v */
    public final Object m7132v(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$updateCardNotes$1 cardRepositoryImpl$updateCardNotes$1;
        String str4;
        String str5;
        if (continuationImpl instanceof CardRepositoryImpl$updateCardNotes$1) {
            cardRepositoryImpl$updateCardNotes$1 = (CardRepositoryImpl$updateCardNotes$1) continuationImpl;
            int i = cardRepositoryImpl$updateCardNotes$1.f14762f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardNotes$1.f14762f = i - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardNotes$1 = new CardRepositoryImpl$updateCardNotes$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$updateCardNotes$1 = new CardRepositoryImpl$updateCardNotes$1(this, continuationImpl);
        }
        Object objM22837z0 = cardRepositoryImpl$updateCardNotes$1.f14760d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cardRepositoryImpl$updateCardNotes$1.f14762f;
        un0 un0Var = this.f16453b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM22837z0);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$updateCardNotes$1.f14757a = str;
            cardRepositoryImpl$updateCardNotes$1.f14758b = str2;
            cardRepositoryImpl$updateCardNotes$1.f14759c = str3;
            cardRepositoryImpl$updateCardNotes$1.f14762f = 1;
            objM22837z0 = un0Var.m22837z0(strM23629f, cardRepositoryImpl$updateCardNotes$1);
            if (objM22837z0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str3 = cardRepositoryImpl$updateCardNotes$1.f14759c;
            str2 = cardRepositoryImpl$updateCardNotes$1.f14758b;
            str = cardRepositoryImpl$updateCardNotes$1.f14757a;
            AbstractC3193b.m15359b(objM22837z0);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = cardRepositoryImpl$updateCardNotes$1.f14758b;
            str4 = cardRepositoryImpl$updateCardNotes$1.f14757a;
            AbstractC3193b.m15359b(objM22837z0);
        }
        m7112c(this, str4, str5, null);
        return xfa.f68157a;
        CardEntity cardEntity = (CardEntity) objM22837z0;
        if (cardEntity != null) {
            CardEntity cardEntityM7517a = CardEntity.m7517a(cardEntity, str3);
            cardRepositoryImpl$updateCardNotes$1.f14757a = str;
            cardRepositoryImpl$updateCardNotes$1.f14758b = str2;
            cardRepositoryImpl$updateCardNotes$1.f14759c = null;
            cardRepositoryImpl$updateCardNotes$1.f14762f = 2;
            if (un0Var.mo4095v0(cardEntityM7517a, cardRepositoryImpl$updateCardNotes$1) != coroutineSingletons) {
                String str6 = str2;
                str4 = str;
                str5 = str6;
                m7112c(this, str4, str5, null);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: w */
    public final Object m7133w(String str, String str2, int i, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        CardRepositoryImpl$updateCardStatus$1 cardRepositoryImpl$updateCardStatus$1;
        Integer num2;
        String str3;
        int i2;
        String str4;
        String str5;
        wn0 wn0Var;
        int i3;
        Integer num3;
        int i4;
        Integer num4;
        int i5;
        wn0 wn0Var2;
        String str6;
        String str7;
        if (continuationImpl instanceof CardRepositoryImpl$updateCardStatus$1) {
            cardRepositoryImpl$updateCardStatus$1 = (CardRepositoryImpl$updateCardStatus$1) continuationImpl;
            int i6 = cardRepositoryImpl$updateCardStatus$1.f14772j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                cardRepositoryImpl$updateCardStatus$1.f14772j = i6 - Integer.MIN_VALUE;
            } else {
                cardRepositoryImpl$updateCardStatus$1 = new CardRepositoryImpl$updateCardStatus$1(this, continuationImpl);
            }
        } else {
            cardRepositoryImpl$updateCardStatus$1 = new CardRepositoryImpl$updateCardStatus$1(this, continuationImpl);
        }
        Object obj = cardRepositoryImpl$updateCardStatus$1.f14770h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i7 = cardRepositoryImpl$updateCardStatus$1.f14772j;
        un0 un0Var = this.f16453b;
        if (i7 == 0) {
            AbstractC3193b.m15359b(obj);
            String strM23629f = vz1.m23629f(str, vz1.m23609O(str2, str));
            cardRepositoryImpl$updateCardStatus$1.f14763a = str;
            cardRepositoryImpl$updateCardStatus$1.f14764b = str2;
            num2 = num;
            cardRepositoryImpl$updateCardStatus$1.f14765c = num2;
            cardRepositoryImpl$updateCardStatus$1.f14766d = strM23629f;
            cardRepositoryImpl$updateCardStatus$1.f14768f = i;
            cardRepositoryImpl$updateCardStatus$1.f14772j = 1;
            Object objM22833A0 = un0Var.m22833A0(strM23629f, cardRepositoryImpl$updateCardStatus$1);
            if (objM22833A0 != coroutineSingletons) {
                str3 = str;
                i2 = i;
                str4 = str2;
                str5 = strM23629f;
                obj = objM22833A0;
            }
            return coroutineSingletons;
        }
        if (i7 == 1) {
            i2 = cardRepositoryImpl$updateCardStatus$1.f14768f;
            str5 = cardRepositoryImpl$updateCardStatus$1.f14766d;
            num2 = cardRepositoryImpl$updateCardStatus$1.f14765c;
            str4 = cardRepositoryImpl$updateCardStatus$1.f14764b;
            str3 = cardRepositoryImpl$updateCardStatus$1.f14763a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i7 == 2) {
                i5 = cardRepositoryImpl$updateCardStatus$1.f14769g;
                i4 = cardRepositoryImpl$updateCardStatus$1.f14768f;
                wn0Var2 = cardRepositoryImpl$updateCardStatus$1.f14767e;
                num4 = cardRepositoryImpl$updateCardStatus$1.f14765c;
                str4 = cardRepositoryImpl$updateCardStatus$1.f14764b;
                str3 = cardRepositoryImpl$updateCardStatus$1.f14763a;
                AbstractC3193b.m15359b(obj);
                i3 = i5;
                i2 = i4;
                wn0Var = wn0Var2;
                num3 = num4;
                cardRepositoryImpl$updateCardStatus$1.f14763a = str3;
                cardRepositoryImpl$updateCardStatus$1.f14764b = str4;
                cardRepositoryImpl$updateCardStatus$1.f14765c = num3;
                cardRepositoryImpl$updateCardStatus$1.f14766d = null;
                cardRepositoryImpl$updateCardStatus$1.f14767e = null;
                cardRepositoryImpl$updateCardStatus$1.f14768f = i2;
                cardRepositoryImpl$updateCardStatus$1.f14769g = i3;
                cardRepositoryImpl$updateCardStatus$1.f14772j = 3;
                if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$updateCardStatus$1) != coroutineSingletons) {
                    str6 = str4;
                    str7 = str3;
                }
                return coroutineSingletons;
            }
            if (i7 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = cardRepositoryImpl$updateCardStatus$1.f14768f;
            num3 = cardRepositoryImpl$updateCardStatus$1.f14765c;
            str6 = cardRepositoryImpl$updateCardStatus$1.f14764b;
            str7 = cardRepositoryImpl$updateCardStatus$1.f14763a;
            AbstractC3193b.m15359b(obj);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        String[] strArr = {"const value", sb.toString()};
        C1240a c1240a = (C1240a) this.f16461j;
        c1240a.m7025f("LingQ status changed", c1240a.m7022c(strArr));
        m7112c(this, str7, str6, num3);
        return xfa.f68157a;
        wn0Var = (wn0) obj;
        if (wn0Var != null) {
            i3 = 0;
            if (i2 == CardStatus.Known.getValue()) {
                wn0Var.m24080o(CardStatus.Learned.getValue());
                wn0Var.m24076k(new Integer(CardExtendedStatus.Known.getValue()));
                if (num2 != null) {
                    List listM23604J = vz1.m23604J(new LessonAndWordsFromJoin(num2.intValue(), str5));
                    cardRepositoryImpl$updateCardStatus$1.f14763a = str3;
                    cardRepositoryImpl$updateCardStatus$1.f14764b = str4;
                    cardRepositoryImpl$updateCardStatus$1.f14765c = num2;
                    cardRepositoryImpl$updateCardStatus$1.f14766d = null;
                    cardRepositoryImpl$updateCardStatus$1.f14767e = wn0Var;
                    cardRepositoryImpl$updateCardStatus$1.f14768f = i2;
                    cardRepositoryImpl$updateCardStatus$1.f14769g = 0;
                    cardRepositoryImpl$updateCardStatus$1.f14772j = 2;
                    if (this.f16455d.mo7495L0(listM23604J, cardRepositoryImpl$updateCardStatus$1) != coroutineSingletons) {
                        i4 = i2;
                        num4 = num2;
                        i5 = 0;
                        wn0Var2 = wn0Var;
                        i3 = i5;
                        i2 = i4;
                        wn0Var = wn0Var2;
                        num3 = num4;
                        cardRepositoryImpl$updateCardStatus$1.f14763a = str3;
                        cardRepositoryImpl$updateCardStatus$1.f14764b = str4;
                        cardRepositoryImpl$updateCardStatus$1.f14765c = num3;
                        cardRepositoryImpl$updateCardStatus$1.f14766d = null;
                        cardRepositoryImpl$updateCardStatus$1.f14767e = null;
                        cardRepositoryImpl$updateCardStatus$1.f14768f = i2;
                        cardRepositoryImpl$updateCardStatus$1.f14769g = i3;
                        cardRepositoryImpl$updateCardStatus$1.f14772j = 3;
                        if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$updateCardStatus$1) != coroutineSingletons) {
                            str6 = str4;
                            str7 = str3;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(i2);
                            String[] strArr2 = {"const value", sb2.toString()};
                            C1240a c1240a2 = (C1240a) this.f16461j;
                            c1240a2.m7025f("LingQ status changed", c1240a2.m7022c(strArr2));
                            m7112c(this, str7, str6, num3);
                        }
                    }
                }
                return coroutineSingletons;
            }
            wn0Var.m24080o(i2);
            wn0Var.m24076k(new Integer(CardExtendedStatus.NotKnown.getValue()));
            num3 = num2;
            cardRepositoryImpl$updateCardStatus$1.f14763a = str3;
            cardRepositoryImpl$updateCardStatus$1.f14764b = str4;
            cardRepositoryImpl$updateCardStatus$1.f14765c = num3;
            cardRepositoryImpl$updateCardStatus$1.f14766d = null;
            cardRepositoryImpl$updateCardStatus$1.f14767e = null;
            cardRepositoryImpl$updateCardStatus$1.f14768f = i2;
            cardRepositoryImpl$updateCardStatus$1.f14769g = i3;
            cardRepositoryImpl$updateCardStatus$1.f14772j = 3;
            if (un0Var.m22835C0(wn0Var, cardRepositoryImpl$updateCardStatus$1) != coroutineSingletons) {
                str6 = str4;
                str7 = str3;
                StringBuilder sb3 = new StringBuilder();
                sb3.append(i2);
                String[] strArr3 = {"const value", sb3.toString()};
                C1240a c1240a3 = (C1240a) this.f16461j;
                c1240a3.m7025f("LingQ status changed", c1240a3.m7022c(strArr3));
                m7112c(this, str7, str6, num3);
            }
            return coroutineSingletons;
        }
        return xfa.f68157a;
    }
}
