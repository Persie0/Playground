package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.BookChallengeLeaveWorker;
import com.lingq.core.data.workers.ChallengeSignupWorker;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.network.api.requests.RequestBookChallengeJoin;
import com.lingq.core.network.api.result.Book;
import com.lingq.core.network.api.result.BookObject;
import com.lingq.core.network.api.result.Extra;
import com.lingq.core.network.api.result.JoinedChallengeStats;
import com.lingq.core.network.api.result.Participant;
import com.lingq.core.network.api.result.ParticipantStat;
import com.lingq.core.network.api.result.ResultBookChallengeBadges;
import com.lingq.core.network.api.result.ResultChallenge;
import com.lingq.core.network.api.result.ResultChallengeRanking;
import com.lingq.core.network.api.result.ResultJoinedChallengeStat;
import com.lingq.core.network.api.result.Results;
import com.lingq.core.network.api.result.Target;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.ef0;
import p000.fa4;
import p000.gr0;
import p000.hi8;
import p000.hs0;
import p000.md0;
import p000.or0;
import p000.rp0;
import p000.s70;
import p000.sp0;
import p000.sr0;
import p000.t70;
import p000.tp0;
import p000.tx6;
import p000.u91;
import p000.ux6;
import p000.v91;
import p000.vz1;
import p000.w4d;
import p000.xfa;
import p000.xj1;
import p000.xpc;
import p000.yp0;
import p000.ypc;

/* JADX INFO: renamed from: com.lingq.core.data.repository.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1288d implements or0 {

    /* JADX INFO: renamed from: a */
    public final yp0 f16464a;

    /* JADX INFO: renamed from: b */
    public final sr0 f16465b;

    /* JADX INFO: renamed from: c */
    public final C0773b f16466c;

    public C1288d(yp0 yp0Var, sr0 sr0Var, C0773b c0773b) {
        yp0Var.getClass();
        sr0Var.getClass();
        c0773b.getClass();
        this.f16464a = yp0Var;
        this.f16465b = sr0Var;
        this.f16466c = c0773b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:114:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:116:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01da  */
    /* JADX WARN: Code duplicated, block: B:127:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:137:0x021c  */
    /* JADX WARN: Code duplicated, block: B:138:0x021f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0223  */
    /* JADX WARN: Code duplicated, block: B:144:0x0231  */
    /* JADX WARN: Code duplicated, block: B:146:0x0237  */
    /* JADX WARN: Code duplicated, block: B:153:0x024c  */
    /* JADX WARN: Code duplicated, block: B:157:0x025a  */
    /* JADX WARN: Code duplicated, block: B:159:0x0260  */
    /* JADX WARN: Code duplicated, block: B:167:0x028e  */
    /* JADX WARN: Code duplicated, block: B:168:0x0291  */
    /* JADX WARN: Code duplicated, block: B:170:0x0295  */
    /* JADX WARN: Code duplicated, block: B:174:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:183:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:189:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:198:0x0316  */
    /* JADX WARN: Code duplicated, block: B:226:0x036b  */
    /* JADX WARN: Code duplicated, block: B:228:0x0371  */
    /* JADX WARN: Code duplicated, block: B:236:0x039f  */
    /* JADX WARN: Code duplicated, block: B:237:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:239:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:241:0x03ac A[PHI: r4
      0x03ac: PHI (r4v22 java.lang.Double) = (r4v9 java.lang.Double), (r4v24 java.lang.Double) binds: [B:248:0x03c5, B:240:0x03aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:242:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:244:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:247:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:250:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:252:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:254:0x03d2 A[PHI: r4
      0x03d2: PHI (r4v19 java.lang.Double) = (r4v14 java.lang.Double), (r4v21 java.lang.Double) binds: [B:261:0x03eb, B:253:0x03d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:255:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:257:0x03df  */
    /* JADX WARN: Code duplicated, block: B:260:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:263:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:266:0x040b  */
    /* JADX WARN: Code duplicated, block: B:267:0x040e  */
    /* JADX WARN: Code duplicated, block: B:269:0x0412  */
    /* JADX WARN: Code duplicated, block: B:273:0x0420  */
    /* JADX WARN: Code duplicated, block: B:275:0x0426  */
    /* JADX WARN: Code duplicated, block: B:282:0x043b  */
    /* JADX WARN: Code duplicated, block: B:286:0x0449  */
    /* JADX WARN: Code duplicated, block: B:288:0x044f  */
    /* JADX WARN: Code duplicated, block: B:296:0x047d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0480  */
    /* JADX WARN: Code duplicated, block: B:299:0x0484  */
    /* JADX WARN: Code duplicated, block: B:303:0x0492  */
    /* JADX WARN: Code duplicated, block: B:305:0x0498  */
    /* JADX WARN: Code duplicated, block: B:312:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:316:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:318:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:326:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:327:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:329:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:333:0x0504  */
    /* JADX WARN: Code duplicated, block: B:335:0x050a  */
    /* JADX WARN: Code duplicated, block: B:342:0x051f  */
    /* JADX WARN: Code duplicated, block: B:346:0x052d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0533  */
    /* JADX WARN: Code duplicated, block: B:357:0x0577  */
    /* JADX WARN: Code duplicated, block: B:389:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:391:0x05dd  */
    /* JADX WARN: Code duplicated, block: B:414:0x0639 A[PHI: r1
      0x0639: PHI (r1v39 java.lang.Double) = (r1v8 java.lang.Double), (r1v40 java.lang.Double) binds: [B:421:0x0652, B:413:0x0637] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:427:0x065f A[PHI: r1
      0x065f: PHI (r1v37 java.lang.Double) = (r1v13 java.lang.Double), (r1v38 java.lang.Double) binds: [B:434:0x0678, B:426:0x065d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:489:0x0726 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:491:0x0726 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:71:0x0122 A[LOOP:0: B:41:0x00a1->B:71:0x0122, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:97:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x017c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public final Object m7134a(String str, ResultChallenge resultChallenge, JoinedChallengeStats joinedChallengeStats, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$insertChallengeStat$1 challengeRepositoryImpl$insertChallengeStat$1;
        int iIntValue;
        Double dM8322o;
        double dDoubleValue;
        ParticipantStat participantStatM8307b;
        Double dM8323p;
        double dDoubleValue2;
        ParticipantStat participantStatM8307b2;
        Extra extraM8306a;
        Book bookM8283a;
        BookObject bookObjectM8275a;
        String strM8278c;
        Extra extraM8306a2;
        Book bookM8283a2;
        BookObject bookObjectM8275a2;
        Integer numM8276a;
        Extra extraM8306a3;
        Book bookM8283a3;
        BookObject bookObjectM8275a3;
        String strM8277b;
        Extra extraM8306a4;
        Book bookM8283a4;
        BookObject bookObjectM8275a4;
        String strM8279d;
        hs0 hs0Var;
        double d;
        ParticipantStat participantStatM8307b3;
        Integer numM8314g;
        int iIntValue2;
        Participant participantM8336d;
        double d2;
        ParticipantStat participantStatM8307b4;
        Integer numM8315h;
        int iIntValue3;
        Integer numM8291h;
        Integer numM8290g;
        double d3;
        ParticipantStat participantStatM8307b5;
        Integer numM8324q;
        int iIntValue4;
        Participant participantM8336d2;
        double d4;
        ParticipantStat participantStatM8307b6;
        Integer numM8325r;
        int iIntValue5;
        String strM8334b;
        String str2;
        Participant participantM8336d3;
        Double dM8318k;
        double dDoubleValue3;
        ParticipantStat participantStatM8307b7;
        Participant participantM8336d4;
        Double dM8319l;
        double dDoubleValue4;
        ParticipantStat participantStatM8307b8;
        String strM8334b2;
        String str3;
        Participant participantM8336d5;
        double d5;
        ParticipantStat participantStatM8307b9;
        Integer numM8308a;
        int iIntValue6;
        Participant participantM8336d6;
        double d6;
        ParticipantStat participantStatM8307b10;
        Integer numM8309b;
        int iIntValue7;
        String strM8334b3;
        String str4;
        Participant participantM8336d7;
        double d7;
        ParticipantStat participantStatM8307b11;
        Integer numM8310c;
        int iIntValue8;
        Participant participantM8336d8;
        double d8;
        ParticipantStat participantStatM8307b12;
        Integer numM8311d;
        int iIntValue9;
        String strM8334b4;
        String str5;
        Participant participantM8336d9;
        double d9;
        ParticipantStat participantStatM8307b13;
        Integer numM8314g2;
        int iIntValue10;
        Participant participantM8336d10;
        double d10;
        ParticipantStat participantStatM8307b14;
        Integer numM8315h2;
        int iIntValue11;
        Object objM2861d;
        Integer numM8291h2;
        Integer numM8290g2;
        Integer numM8287d;
        Integer numM8286c;
        Integer numM8285b;
        Integer numM8284a;
        Integer numM8301r;
        Integer numM8300q;
        double d11;
        ParticipantStat participantStatM8307b15;
        Integer numM8327t;
        int iIntValue12;
        Participant participantM8336d11;
        double d12;
        ParticipantStat participantStatM8307b16;
        Integer numM8328u;
        int iIntValue13;
        String strM8334b5;
        String str6;
        Participant participantM8336d12;
        double d13;
        ParticipantStat participantStatM8307b17;
        Integer numM8320m;
        int iIntValue14;
        Participant participantM8336d13;
        double d14;
        ParticipantStat participantStatM8307b18;
        Integer numM8321n;
        int iIntValue15;
        String strM8334b6;
        String str7;
        Participant participantM8336d14;
        double d15;
        ParticipantStat participantStatM8307b19;
        Integer numM8316i;
        int iIntValue16;
        Participant participantM8336d15;
        double d16;
        ParticipantStat participantStatM8307b20;
        Integer numM8317j;
        int iIntValue17;
        String strM8334b7;
        String str8;
        Participant participantM8336d16;
        double d17;
        ParticipantStat participantStatM8307b21;
        Integer numM8312e;
        int iIntValue18;
        Participant participantM8336d17;
        double d18;
        ParticipantStat participantStatM8307b22;
        Integer numM8313f;
        int iIntValue19;
        Object objM2861d2;
        Integer numM8289f;
        Integer numM8288e;
        Integer numM8293j;
        Integer numM8292i;
        Integer numM8297n;
        Integer numM8296m;
        Integer numM8303t;
        Integer numM8302s;
        Participant participantM8336d18;
        ParticipantStat participantStatM8307b23;
        List listM8326s;
        String str9;
        Iterator it;
        ResultChallenge resultChallenge2;
        JoinedChallengeStats joinedChallengeStats2;
        hs0 hs0Var2;
        double d19;
        ParticipantStat participantStatM8307b24;
        Integer numM8308a2;
        int iIntValue20;
        Double dM8405b;
        double dDoubleValue5;
        String str10;
        Integer numM8284a2;
        if (continuationImpl instanceof ChallengeRepositoryImpl$insertChallengeStat$1) {
            challengeRepositoryImpl$insertChallengeStat$1 = (ChallengeRepositoryImpl$insertChallengeStat$1) continuationImpl;
            int i = challengeRepositoryImpl$insertChallengeStat$1.f14780h;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$insertChallengeStat$1.f14780h = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$insertChallengeStat$1 = new ChallengeRepositoryImpl$insertChallengeStat$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$insertChallengeStat$1 = new ChallengeRepositoryImpl$insertChallengeStat$1(this, continuationImpl);
        }
        Object obj = challengeRepositoryImpl$insertChallengeStat$1.f14778f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$insertChallengeStat$1.f14780h;
        int i3 = 1;
        xfa xfaVar = xfa.f68157a;
        yp0 yp0Var = this.f16464a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            String strM8333a = resultChallenge.m8333a();
            if (strM8333a != null) {
                iIntValue = 0;
                switch (strM8333a.hashCode()) {
                    case -1362385769:
                        if (strM8333a.equals("bookJourney")) {
                            String strM8334b8 = resultChallenge.m8334b();
                            String str11 = strM8334b8 == null ? "" : strM8334b8;
                            String strM8334b9 = resultChallenge.m8334b();
                            String str12 = strM8334b9 == null ? "" : strM8334b9;
                            if (joinedChallengeStats == null || (dM8322o = joinedChallengeStats.m8298o()) == null) {
                                Participant participantM8336d19 = resultChallenge.m8336d();
                                dM8322o = (participantM8336d19 == null || (participantStatM8307b = participantM8336d19.m8307b()) == null) ? null : participantStatM8307b.m8322o();
                                if (dM8322o != null) {
                                    dDoubleValue = dM8322o.doubleValue();
                                } else {
                                    dDoubleValue = 0.0d;
                                }
                            } else {
                                dDoubleValue = dM8322o.doubleValue();
                            }
                            if (joinedChallengeStats == null || (dM8323p = joinedChallengeStats.m8299p()) == null) {
                                Participant participantM8336d20 = resultChallenge.m8336d();
                                dM8323p = (participantM8336d20 == null || (participantStatM8307b2 = participantM8336d20.m8307b()) == null) ? null : participantStatM8307b2.m8323p();
                                if (dM8323p != null) {
                                    dDoubleValue2 = dM8323p.doubleValue();
                                } else {
                                    dDoubleValue2 = 0.0d;
                                }
                            } else {
                                dDoubleValue2 = dM8323p.doubleValue();
                            }
                            Participant participantM8336d21 = resultChallenge.m8336d();
                            String str13 = (participantM8336d21 == null || (extraM8306a4 = participantM8336d21.m8306a()) == null || (bookM8283a4 = extraM8306a4.m8283a()) == null || (bookObjectM8275a4 = bookM8283a4.m8275a()) == null || (strM8279d = bookObjectM8275a4.m8279d()) == null) ? "" : strM8279d;
                            Participant participantM8336d22 = resultChallenge.m8336d();
                            String str14 = (participantM8336d22 == null || (extraM8306a3 = participantM8336d22.m8306a()) == null || (bookM8283a3 = extraM8306a3.m8283a()) == null || (bookObjectM8275a3 = bookM8283a3.m8275a()) == null || (strM8277b = bookObjectM8275a3.m8277b()) == null) ? "" : strM8277b;
                            Participant participantM8336d23 = resultChallenge.m8336d();
                            if (participantM8336d23 != null && (extraM8306a2 = participantM8336d23.m8306a()) != null && (bookM8283a2 = extraM8306a2.m8283a()) != null && (bookObjectM8275a2 = bookM8283a2.m8275a()) != null && (numM8276a = bookObjectM8275a2.m8276a()) != null) {
                                iIntValue = numM8276a.intValue();
                            }
                            int i4 = iIntValue;
                            Participant participantM8336d24 = resultChallenge.m8336d();
                            hs0 hs0Var3 = new hs0(str, str11, str12, str13, dDoubleValue, dDoubleValue2, i4, str14, (participantM8336d24 == null || (extraM8306a = participantM8336d24.m8306a()) == null || (bookM8283a = extraM8306a.m8283a()) == null || (bookObjectM8275a = bookM8283a.m8275a()) == null || (strM8278c = bookObjectM8275a.m8278c()) == null) ? "" : strM8278c, 32);
                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 1;
                            if (yp0Var.m25241y0(hs0Var3, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        break;
                    case -907775381:
                        if (strM8333a.equals("thousandWords")) {
                            String strM8334b10 = resultChallenge.m8334b();
                            String str15 = strM8334b10 == null ? "" : strM8334b10;
                            String strM8334b11 = resultChallenge.m8334b();
                            String str16 = strM8334b11 == null ? "" : strM8334b11;
                            if (joinedChallengeStats == null || (numM8290g = joinedChallengeStats.m8290g()) == null) {
                                Participant participantM8336d25 = resultChallenge.m8336d();
                                if (participantM8336d25 == null || (participantStatM8307b3 = participantM8336d25.m8307b()) == null || (numM8314g = participantStatM8307b3.m8314g()) == null) {
                                    d = 0.0d;
                                } else {
                                    iIntValue2 = numM8314g.intValue();
                                }
                                if (joinedChallengeStats != null || (numM8291h = joinedChallengeStats.m8291h()) == null) {
                                    participantM8336d = resultChallenge.m8336d();
                                    if (participantM8336d != null || (participantStatM8307b4 = participantM8336d.m8307b()) == null || (numM8315h = participantStatM8307b4.m8315h()) == null) {
                                        d2 = 0.0d;
                                    } else {
                                        iIntValue3 = numM8315h.intValue();
                                    }
                                    hs0Var = new hs0(str, str15, str16, null, d, d2, 0, null, null, 936);
                                    challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14780h = 5;
                                    if (yp0Var.m25241y0(hs0Var, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    iIntValue3 = numM8291h.intValue();
                                }
                                d2 = iIntValue3;
                                hs0Var = new hs0(str, str15, str16, null, d, d2, 0, null, null, 936);
                                challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 5;
                                if (yp0Var.m25241y0(hs0Var, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                iIntValue2 = numM8290g.intValue();
                            }
                            d = iIntValue2;
                            if (joinedChallengeStats != null) {
                                participantM8336d = resultChallenge.m8336d();
                                if (participantM8336d != null) {
                                }
                                d2 = 0.0d;
                            } else {
                                participantM8336d = resultChallenge.m8336d();
                                if (participantM8336d != null) {
                                }
                                d2 = 0.0d;
                            }
                            hs0Var = new hs0(str, str15, str16, null, d, d2, 0, null, null, 936);
                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 5;
                            if (yp0Var.m25241y0(hs0Var, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        break;
                    case -9001096:
                        if (strM8333a.equals("hardcore90days")) {
                            String strM8334b12 = resultChallenge.m8334b();
                            String str17 = strM8334b12 == null ? "" : strM8334b12;
                            if (joinedChallengeStats == null || (numM8300q = joinedChallengeStats.m8300q()) == null) {
                                Participant participantM8336d26 = resultChallenge.m8336d();
                                if (participantM8336d26 == null || (participantStatM8307b5 = participantM8336d26.m8307b()) == null || (numM8324q = participantStatM8307b5.m8324q()) == null) {
                                    d3 = 0.0d;
                                } else {
                                    iIntValue4 = numM8324q.intValue();
                                }
                                if (joinedChallengeStats != null || (numM8301r = joinedChallengeStats.m8301r()) == null) {
                                    participantM8336d2 = resultChallenge.m8336d();
                                    if (participantM8336d2 != null || (participantStatM8307b6 = participantM8336d2.m8307b()) == null || (numM8325r = participantStatM8307b6.m8325r()) == null) {
                                        d4 = 0.0d;
                                    } else {
                                        iIntValue5 = numM8325r.intValue();
                                    }
                                    hs0 hs0Var4 = new hs0(str, str17, "readWords", null, d3, d4, 0, null, null, 936);
                                    strM8334b = resultChallenge.m8334b();
                                    if (strM8334b == null) {
                                        str2 = "";
                                    } else {
                                        str2 = strM8334b;
                                    }
                                    if (joinedChallengeStats != null || (dM8318k = joinedChallengeStats.m8294k()) == null) {
                                        participantM8336d3 = resultChallenge.m8336d();
                                        if (participantM8336d3 != null || (participantStatM8307b7 = participantM8336d3.m8307b()) == null) {
                                            dM8318k = null;
                                        } else {
                                            dM8318k = participantStatM8307b7.m8318k();
                                        }
                                        if (dM8318k != null) {
                                            dDoubleValue3 = dM8318k.doubleValue();
                                        } else {
                                            dDoubleValue3 = 0.0d;
                                        }
                                    } else {
                                        dDoubleValue3 = dM8318k.doubleValue();
                                    }
                                    if (joinedChallengeStats != null || (dM8319l = joinedChallengeStats.m8295l()) == null) {
                                        participantM8336d4 = resultChallenge.m8336d();
                                        if (participantM8336d4 != null || (participantStatM8307b8 = participantM8336d4.m8307b()) == null) {
                                            dM8319l = null;
                                        } else {
                                            dM8319l = participantStatM8307b8.m8319l();
                                        }
                                        if (dM8319l != null) {
                                            dDoubleValue4 = dM8319l.doubleValue();
                                        } else {
                                            dDoubleValue4 = 0.0d;
                                        }
                                    } else {
                                        dDoubleValue4 = dM8319l.doubleValue();
                                    }
                                    hs0 hs0Var5 = new hs0(str, str2, "hoursListening", null, dDoubleValue3, dDoubleValue4, 0, null, null, 936);
                                    strM8334b2 = resultChallenge.m8334b();
                                    if (strM8334b2 == null) {
                                        str3 = "";
                                    } else {
                                        str3 = strM8334b2;
                                    }
                                    if (joinedChallengeStats != null || (numM8284a = joinedChallengeStats.m8284a()) == null) {
                                        participantM8336d5 = resultChallenge.m8336d();
                                        if (participantM8336d5 != null || (participantStatM8307b9 = participantM8336d5.m8307b()) == null || (numM8308a = participantStatM8307b9.m8308a()) == null) {
                                            d5 = 0.0d;
                                        } else {
                                            iIntValue6 = numM8308a.intValue();
                                        }
                                        if (joinedChallengeStats != null || (numM8285b = joinedChallengeStats.m8285b()) == null) {
                                            participantM8336d6 = resultChallenge.m8336d();
                                            if (participantM8336d6 != null || (participantStatM8307b10 = participantM8336d6.m8307b()) == null || (numM8309b = participantStatM8307b10.m8309b()) == null) {
                                                d6 = 0.0d;
                                            } else {
                                                iIntValue7 = numM8309b.intValue();
                                            }
                                            hs0 hs0Var6 = new hs0(str, str3, "lingqsCreated", null, d5, d6, 0, null, null, 936);
                                            strM8334b3 = resultChallenge.m8334b();
                                            if (strM8334b3 == null) {
                                                str4 = "";
                                            } else {
                                                str4 = strM8334b3;
                                            }
                                            if (joinedChallengeStats != null || (numM8286c = joinedChallengeStats.m8286c()) == null) {
                                                participantM8336d7 = resultChallenge.m8336d();
                                                if (participantM8336d7 != null || (participantStatM8307b11 = participantM8336d7.m8307b()) == null || (numM8310c = participantStatM8307b11.m8310c()) == null) {
                                                    d7 = 0.0d;
                                                } else {
                                                    iIntValue8 = numM8310c.intValue();
                                                }
                                                if (joinedChallengeStats != null || (numM8287d = joinedChallengeStats.m8287d()) == null) {
                                                    participantM8336d8 = resultChallenge.m8336d();
                                                    if (participantM8336d8 != null || (participantStatM8307b12 = participantM8336d8.m8307b()) == null || (numM8311d = participantStatM8307b12.m8311d()) == null) {
                                                        d8 = 0.0d;
                                                    } else {
                                                        iIntValue9 = numM8311d.intValue();
                                                    }
                                                    hs0 hs0Var7 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                                    strM8334b4 = resultChallenge.m8334b();
                                                    if (strM8334b4 == null) {
                                                        str5 = "";
                                                    } else {
                                                        str5 = strM8334b4;
                                                    }
                                                    if (joinedChallengeStats != null || (numM8290g2 = joinedChallengeStats.m8290g()) == null) {
                                                        participantM8336d9 = resultChallenge.m8336d();
                                                        if (participantM8336d9 != null || (participantStatM8307b13 = participantM8336d9.m8307b()) == null || (numM8314g2 = participantStatM8307b13.m8314g()) == null) {
                                                            d9 = 0.0d;
                                                        } else {
                                                            iIntValue10 = numM8314g2.intValue();
                                                        }
                                                        if (joinedChallengeStats != null || (numM8291h2 = joinedChallengeStats.m8291h()) == null) {
                                                            participantM8336d10 = resultChallenge.m8336d();
                                                            if (participantM8336d10 != null || (participantStatM8307b14 = participantM8336d10.m8307b()) == null || (numM8315h2 = participantStatM8307b14.m8315h()) == null) {
                                                                d10 = 0.0d;
                                                            } else {
                                                                iIntValue11 = numM8315h2.intValue();
                                                            }
                                                            List listM23605K = vz1.m23605K(hs0Var4, hs0Var5, hs0Var6, hs0Var7, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                                            objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                            if (objM2861d != coroutineSingletons) {
                                                                objM2861d = xfaVar;
                                                            }
                                                            if (objM2861d == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else {
                                                            iIntValue11 = numM8291h2.intValue();
                                                        }
                                                        d10 = iIntValue11;
                                                        List listM23605K2 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var6, hs0Var7, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                                        objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K2, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                        if (objM2861d != coroutineSingletons) {
                                                            objM2861d = xfaVar;
                                                        }
                                                        if (objM2861d == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                    } else {
                                                        iIntValue10 = numM8290g2.intValue();
                                                    }
                                                    d9 = iIntValue10;
                                                    if (joinedChallengeStats != null) {
                                                        participantM8336d10 = resultChallenge.m8336d();
                                                        if (participantM8336d10 != null) {
                                                        }
                                                        d10 = 0.0d;
                                                    } else {
                                                        participantM8336d10 = resultChallenge.m8336d();
                                                        if (participantM8336d10 != null) {
                                                        }
                                                        d10 = 0.0d;
                                                    }
                                                    List listM23605K3 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var6, hs0Var7, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                                    objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K3, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                    if (objM2861d != coroutineSingletons) {
                                                        objM2861d = xfaVar;
                                                    }
                                                    if (objM2861d == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                } else {
                                                    iIntValue9 = numM8287d.intValue();
                                                }
                                                d8 = iIntValue9;
                                                hs0 hs0Var8 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                                strM8334b4 = resultChallenge.m8334b();
                                                if (strM8334b4 == null) {
                                                    str5 = "";
                                                } else {
                                                    str5 = strM8334b4;
                                                }
                                                if (joinedChallengeStats != null) {
                                                    participantM8336d9 = resultChallenge.m8336d();
                                                    if (participantM8336d9 != null) {
                                                    }
                                                    d9 = 0.0d;
                                                } else {
                                                    participantM8336d9 = resultChallenge.m8336d();
                                                    if (participantM8336d9 != null) {
                                                    }
                                                    d9 = 0.0d;
                                                }
                                                if (joinedChallengeStats != null) {
                                                    participantM8336d10 = resultChallenge.m8336d();
                                                    if (participantM8336d10 != null) {
                                                    }
                                                    d10 = 0.0d;
                                                } else {
                                                    participantM8336d10 = resultChallenge.m8336d();
                                                    if (participantM8336d10 != null) {
                                                    }
                                                    d10 = 0.0d;
                                                }
                                                List listM23605K4 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var6, hs0Var8, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                                challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                                objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K4, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                if (objM2861d != coroutineSingletons) {
                                                    objM2861d = xfaVar;
                                                }
                                                if (objM2861d == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                iIntValue8 = numM8286c.intValue();
                                            }
                                            d7 = iIntValue8;
                                            if (joinedChallengeStats != null) {
                                                participantM8336d8 = resultChallenge.m8336d();
                                                if (participantM8336d8 != null) {
                                                }
                                                d8 = 0.0d;
                                            } else {
                                                participantM8336d8 = resultChallenge.m8336d();
                                                if (participantM8336d8 != null) {
                                                }
                                                d8 = 0.0d;
                                            }
                                            hs0 hs0Var9 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                            strM8334b4 = resultChallenge.m8334b();
                                            if (strM8334b4 == null) {
                                                str5 = "";
                                            } else {
                                                str5 = strM8334b4;
                                            }
                                            if (joinedChallengeStats != null) {
                                                participantM8336d9 = resultChallenge.m8336d();
                                                if (participantM8336d9 != null) {
                                                }
                                                d9 = 0.0d;
                                            } else {
                                                participantM8336d9 = resultChallenge.m8336d();
                                                if (participantM8336d9 != null) {
                                                }
                                                d9 = 0.0d;
                                            }
                                            if (joinedChallengeStats != null) {
                                                participantM8336d10 = resultChallenge.m8336d();
                                                if (participantM8336d10 != null) {
                                                }
                                                d10 = 0.0d;
                                            } else {
                                                participantM8336d10 = resultChallenge.m8336d();
                                                if (participantM8336d10 != null) {
                                                }
                                                d10 = 0.0d;
                                            }
                                            List listM23605K5 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var6, hs0Var9, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                            objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K5, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                            if (objM2861d != coroutineSingletons) {
                                                objM2861d = xfaVar;
                                            }
                                            if (objM2861d == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            iIntValue7 = numM8285b.intValue();
                                        }
                                        d6 = iIntValue7;
                                        hs0 hs0Var10 = new hs0(str, str3, "lingqsCreated", null, d5, d6, 0, null, null, 936);
                                        strM8334b3 = resultChallenge.m8334b();
                                        if (strM8334b3 == null) {
                                            str4 = "";
                                        } else {
                                            str4 = strM8334b3;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d7 = resultChallenge.m8336d();
                                            if (participantM8336d7 != null) {
                                            }
                                            d7 = 0.0d;
                                        } else {
                                            participantM8336d7 = resultChallenge.m8336d();
                                            if (participantM8336d7 != null) {
                                            }
                                            d7 = 0.0d;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d8 = resultChallenge.m8336d();
                                            if (participantM8336d8 != null) {
                                            }
                                            d8 = 0.0d;
                                        } else {
                                            participantM8336d8 = resultChallenge.m8336d();
                                            if (participantM8336d8 != null) {
                                            }
                                            d8 = 0.0d;
                                        }
                                        hs0 hs0Var11 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                        strM8334b4 = resultChallenge.m8334b();
                                        if (strM8334b4 == null) {
                                            str5 = "";
                                        } else {
                                            str5 = strM8334b4;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d9 = resultChallenge.m8336d();
                                            if (participantM8336d9 != null) {
                                            }
                                            d9 = 0.0d;
                                        } else {
                                            participantM8336d9 = resultChallenge.m8336d();
                                            if (participantM8336d9 != null) {
                                            }
                                            d9 = 0.0d;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d10 = resultChallenge.m8336d();
                                            if (participantM8336d10 != null) {
                                            }
                                            d10 = 0.0d;
                                        } else {
                                            participantM8336d10 = resultChallenge.m8336d();
                                            if (participantM8336d10 != null) {
                                            }
                                            d10 = 0.0d;
                                        }
                                        List listM23605K6 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var10, hs0Var11, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                        challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                        objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K6, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                        if (objM2861d != coroutineSingletons) {
                                            objM2861d = xfaVar;
                                        }
                                        if (objM2861d == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        iIntValue6 = numM8284a.intValue();
                                    }
                                    d5 = iIntValue6;
                                    if (joinedChallengeStats != null) {
                                        participantM8336d6 = resultChallenge.m8336d();
                                        if (participantM8336d6 != null) {
                                        }
                                        d6 = 0.0d;
                                    } else {
                                        participantM8336d6 = resultChallenge.m8336d();
                                        if (participantM8336d6 != null) {
                                        }
                                        d6 = 0.0d;
                                    }
                                    hs0 hs0Var12 = new hs0(str, str3, "lingqsCreated", null, d5, d6, 0, null, null, 936);
                                    strM8334b3 = resultChallenge.m8334b();
                                    if (strM8334b3 == null) {
                                        str4 = "";
                                    } else {
                                        str4 = strM8334b3;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d7 = resultChallenge.m8336d();
                                        if (participantM8336d7 != null) {
                                        }
                                        d7 = 0.0d;
                                    } else {
                                        participantM8336d7 = resultChallenge.m8336d();
                                        if (participantM8336d7 != null) {
                                        }
                                        d7 = 0.0d;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d8 = resultChallenge.m8336d();
                                        if (participantM8336d8 != null) {
                                        }
                                        d8 = 0.0d;
                                    } else {
                                        participantM8336d8 = resultChallenge.m8336d();
                                        if (participantM8336d8 != null) {
                                        }
                                        d8 = 0.0d;
                                    }
                                    hs0 hs0Var13 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                    strM8334b4 = resultChallenge.m8334b();
                                    if (strM8334b4 == null) {
                                        str5 = "";
                                    } else {
                                        str5 = strM8334b4;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d9 = resultChallenge.m8336d();
                                        if (participantM8336d9 != null) {
                                        }
                                        d9 = 0.0d;
                                    } else {
                                        participantM8336d9 = resultChallenge.m8336d();
                                        if (participantM8336d9 != null) {
                                        }
                                        d9 = 0.0d;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d10 = resultChallenge.m8336d();
                                        if (participantM8336d10 != null) {
                                        }
                                        d10 = 0.0d;
                                    } else {
                                        participantM8336d10 = resultChallenge.m8336d();
                                        if (participantM8336d10 != null) {
                                        }
                                        d10 = 0.0d;
                                    }
                                    List listM23605K7 = vz1.m23605K(hs0Var4, hs0Var5, hs0Var12, hs0Var13, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                    challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                    objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K7, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                    if (objM2861d != coroutineSingletons) {
                                        objM2861d = xfaVar;
                                    }
                                    if (objM2861d == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    iIntValue5 = numM8301r.intValue();
                                }
                                d4 = iIntValue5;
                                hs0 hs0Var14 = new hs0(str, str17, "readWords", null, d3, d4, 0, null, null, 936);
                                strM8334b = resultChallenge.m8334b();
                                if (strM8334b == null) {
                                    str2 = "";
                                } else {
                                    str2 = strM8334b;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d3 = resultChallenge.m8336d();
                                    if (participantM8336d3 != null) {
                                        dM8318k = null;
                                    } else {
                                        dM8318k = null;
                                    }
                                    if (dM8318k != null) {
                                        dDoubleValue3 = dM8318k.doubleValue();
                                    } else {
                                        dDoubleValue3 = 0.0d;
                                    }
                                } else {
                                    participantM8336d3 = resultChallenge.m8336d();
                                    if (participantM8336d3 != null) {
                                        dM8318k = null;
                                    } else {
                                        dM8318k = null;
                                    }
                                    if (dM8318k != null) {
                                        dDoubleValue3 = dM8318k.doubleValue();
                                    } else {
                                        dDoubleValue3 = 0.0d;
                                    }
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d4 = resultChallenge.m8336d();
                                    if (participantM8336d4 != null) {
                                        dM8319l = null;
                                    } else {
                                        dM8319l = null;
                                    }
                                    if (dM8319l != null) {
                                        dDoubleValue4 = dM8319l.doubleValue();
                                    } else {
                                        dDoubleValue4 = 0.0d;
                                    }
                                } else {
                                    participantM8336d4 = resultChallenge.m8336d();
                                    if (participantM8336d4 != null) {
                                        dM8319l = null;
                                    } else {
                                        dM8319l = null;
                                    }
                                    if (dM8319l != null) {
                                        dDoubleValue4 = dM8319l.doubleValue();
                                    } else {
                                        dDoubleValue4 = 0.0d;
                                    }
                                }
                                hs0 hs0Var15 = new hs0(str, str2, "hoursListening", null, dDoubleValue3, dDoubleValue4, 0, null, null, 936);
                                strM8334b2 = resultChallenge.m8334b();
                                if (strM8334b2 == null) {
                                    str3 = "";
                                } else {
                                    str3 = strM8334b2;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d5 = resultChallenge.m8336d();
                                    if (participantM8336d5 != null) {
                                    }
                                    d5 = 0.0d;
                                } else {
                                    participantM8336d5 = resultChallenge.m8336d();
                                    if (participantM8336d5 != null) {
                                    }
                                    d5 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d6 = resultChallenge.m8336d();
                                    if (participantM8336d6 != null) {
                                    }
                                    d6 = 0.0d;
                                } else {
                                    participantM8336d6 = resultChallenge.m8336d();
                                    if (participantM8336d6 != null) {
                                    }
                                    d6 = 0.0d;
                                }
                                hs0 hs0Var16 = new hs0(str, str3, "lingqsCreated", null, d5, d6, 0, null, null, 936);
                                strM8334b3 = resultChallenge.m8334b();
                                if (strM8334b3 == null) {
                                    str4 = "";
                                } else {
                                    str4 = strM8334b3;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d7 = resultChallenge.m8336d();
                                    if (participantM8336d7 != null) {
                                    }
                                    d7 = 0.0d;
                                } else {
                                    participantM8336d7 = resultChallenge.m8336d();
                                    if (participantM8336d7 != null) {
                                    }
                                    d7 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d8 = resultChallenge.m8336d();
                                    if (participantM8336d8 != null) {
                                    }
                                    d8 = 0.0d;
                                } else {
                                    participantM8336d8 = resultChallenge.m8336d();
                                    if (participantM8336d8 != null) {
                                    }
                                    d8 = 0.0d;
                                }
                                hs0 hs0Var17 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                                strM8334b4 = resultChallenge.m8334b();
                                if (strM8334b4 == null) {
                                    str5 = "";
                                } else {
                                    str5 = strM8334b4;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d9 = resultChallenge.m8336d();
                                    if (participantM8336d9 != null) {
                                    }
                                    d9 = 0.0d;
                                } else {
                                    participantM8336d9 = resultChallenge.m8336d();
                                    if (participantM8336d9 != null) {
                                    }
                                    d9 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d10 = resultChallenge.m8336d();
                                    if (participantM8336d10 != null) {
                                    }
                                    d10 = 0.0d;
                                } else {
                                    participantM8336d10 = resultChallenge.m8336d();
                                    if (participantM8336d10 != null) {
                                    }
                                    d10 = 0.0d;
                                }
                                List listM23605K8 = vz1.m23605K(hs0Var14, hs0Var15, hs0Var16, hs0Var17, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                                challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                                objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K8, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                if (objM2861d != coroutineSingletons) {
                                    objM2861d = xfaVar;
                                }
                                if (objM2861d == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                iIntValue4 = numM8300q.intValue();
                            }
                            d3 = iIntValue4;
                            if (joinedChallengeStats != null) {
                                participantM8336d2 = resultChallenge.m8336d();
                                if (participantM8336d2 != null) {
                                }
                                d4 = 0.0d;
                            } else {
                                participantM8336d2 = resultChallenge.m8336d();
                                if (participantM8336d2 != null) {
                                }
                                d4 = 0.0d;
                            }
                            hs0 hs0Var18 = new hs0(str, str17, "readWords", null, d3, d4, 0, null, null, 936);
                            strM8334b = resultChallenge.m8334b();
                            if (strM8334b == null) {
                                str2 = "";
                            } else {
                                str2 = strM8334b;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d3 = resultChallenge.m8336d();
                                if (participantM8336d3 != null) {
                                    dM8318k = null;
                                } else {
                                    dM8318k = null;
                                }
                                if (dM8318k != null) {
                                    dDoubleValue3 = dM8318k.doubleValue();
                                } else {
                                    dDoubleValue3 = 0.0d;
                                }
                            } else {
                                participantM8336d3 = resultChallenge.m8336d();
                                if (participantM8336d3 != null) {
                                    dM8318k = null;
                                } else {
                                    dM8318k = null;
                                }
                                if (dM8318k != null) {
                                    dDoubleValue3 = dM8318k.doubleValue();
                                } else {
                                    dDoubleValue3 = 0.0d;
                                }
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d4 = resultChallenge.m8336d();
                                if (participantM8336d4 != null) {
                                    dM8319l = null;
                                } else {
                                    dM8319l = null;
                                }
                                if (dM8319l != null) {
                                    dDoubleValue4 = dM8319l.doubleValue();
                                } else {
                                    dDoubleValue4 = 0.0d;
                                }
                            } else {
                                participantM8336d4 = resultChallenge.m8336d();
                                if (participantM8336d4 != null) {
                                    dM8319l = null;
                                } else {
                                    dM8319l = null;
                                }
                                if (dM8319l != null) {
                                    dDoubleValue4 = dM8319l.doubleValue();
                                } else {
                                    dDoubleValue4 = 0.0d;
                                }
                            }
                            hs0 hs0Var19 = new hs0(str, str2, "hoursListening", null, dDoubleValue3, dDoubleValue4, 0, null, null, 936);
                            strM8334b2 = resultChallenge.m8334b();
                            if (strM8334b2 == null) {
                                str3 = "";
                            } else {
                                str3 = strM8334b2;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d5 = resultChallenge.m8336d();
                                if (participantM8336d5 != null) {
                                }
                                d5 = 0.0d;
                            } else {
                                participantM8336d5 = resultChallenge.m8336d();
                                if (participantM8336d5 != null) {
                                }
                                d5 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d6 = resultChallenge.m8336d();
                                if (participantM8336d6 != null) {
                                }
                                d6 = 0.0d;
                            } else {
                                participantM8336d6 = resultChallenge.m8336d();
                                if (participantM8336d6 != null) {
                                }
                                d6 = 0.0d;
                            }
                            hs0 hs0Var110 = new hs0(str, str3, "lingqsCreated", null, d5, d6, 0, null, null, 936);
                            strM8334b3 = resultChallenge.m8334b();
                            if (strM8334b3 == null) {
                                str4 = "";
                            } else {
                                str4 = strM8334b3;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d7 = resultChallenge.m8336d();
                                if (participantM8336d7 != null) {
                                }
                                d7 = 0.0d;
                            } else {
                                participantM8336d7 = resultChallenge.m8336d();
                                if (participantM8336d7 != null) {
                                }
                                d7 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d8 = resultChallenge.m8336d();
                                if (participantM8336d8 != null) {
                                }
                                d8 = 0.0d;
                            } else {
                                participantM8336d8 = resultChallenge.m8336d();
                                if (participantM8336d8 != null) {
                                }
                                d8 = 0.0d;
                            }
                            hs0 hs0Var111 = new hs0(str, str4, "lingqsLearned", null, d7, d8, 0, null, null, 936);
                            strM8334b4 = resultChallenge.m8334b();
                            if (strM8334b4 == null) {
                                str5 = "";
                            } else {
                                str5 = strM8334b4;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d9 = resultChallenge.m8336d();
                                if (participantM8336d9 != null) {
                                }
                                d9 = 0.0d;
                            } else {
                                participantM8336d9 = resultChallenge.m8336d();
                                if (participantM8336d9 != null) {
                                }
                                d9 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d10 = resultChallenge.m8336d();
                                if (participantM8336d10 != null) {
                                }
                                d10 = 0.0d;
                            } else {
                                participantM8336d10 = resultChallenge.m8336d();
                                if (participantM8336d10 != null) {
                                }
                                d10 = 0.0d;
                            }
                            List listM23605K9 = vz1.m23605K(hs0Var18, hs0Var19, hs0Var110, hs0Var111, new hs0(str, str5, "knownWords", null, d9, d10, 0, null, null, 936));
                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 2;
                            objM2861d = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K9, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                            if (objM2861d != coroutineSingletons) {
                                objM2861d = xfaVar;
                            }
                            if (objM2861d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        break;
                    case 50567771:
                        if (strM8333a.equals("monthly90Days")) {
                            String strM8334b13 = resultChallenge.m8334b();
                            String str18 = strM8334b13 == null ? "" : strM8334b13;
                            if (joinedChallengeStats == null || (numM8302s = joinedChallengeStats.m8302s()) == null) {
                                Participant participantM8336d27 = resultChallenge.m8336d();
                                if (participantM8336d27 == null || (participantStatM8307b15 = participantM8336d27.m8307b()) == null || (numM8327t = participantStatM8307b15.m8327t()) == null) {
                                    d11 = 0.0d;
                                } else {
                                    iIntValue12 = numM8327t.intValue();
                                }
                                if (joinedChallengeStats != null || (numM8303t = joinedChallengeStats.m8303t()) == null) {
                                    participantM8336d11 = resultChallenge.m8336d();
                                    if (participantM8336d11 != null || (participantStatM8307b16 = participantM8336d11.m8307b()) == null || (numM8328u = participantStatM8307b16.m8328u()) == null) {
                                        d12 = 0.0d;
                                    } else {
                                        iIntValue13 = numM8328u.intValue();
                                    }
                                    hs0 hs0Var20 = new hs0(str, str18, "lingqs", null, d11, d12, 0, null, null, 936);
                                    strM8334b5 = resultChallenge.m8334b();
                                    if (strM8334b5 == null) {
                                        str6 = "";
                                    } else {
                                        str6 = strM8334b5;
                                    }
                                    if (joinedChallengeStats != null || (numM8296m = joinedChallengeStats.m8296m()) == null) {
                                        participantM8336d12 = resultChallenge.m8336d();
                                        if (participantM8336d12 != null || (participantStatM8307b17 = participantM8336d12.m8307b()) == null || (numM8320m = participantStatM8307b17.m8320m()) == null) {
                                            d13 = 0.0d;
                                        } else {
                                            iIntValue14 = numM8320m.intValue();
                                        }
                                        if (joinedChallengeStats != null || (numM8297n = joinedChallengeStats.m8297n()) == null) {
                                            participantM8336d13 = resultChallenge.m8336d();
                                            if (participantM8336d13 != null || (participantStatM8307b18 = participantM8336d13.m8307b()) == null || (numM8321n = participantStatM8307b18.m8321n()) == null) {
                                                d14 = 0.0d;
                                            } else {
                                                iIntValue15 = numM8321n.intValue();
                                            }
                                            hs0 hs0Var21 = new hs0(str, str6, "reading", null, d13, d14, 0, null, null, 936);
                                            strM8334b6 = resultChallenge.m8334b();
                                            if (strM8334b6 == null) {
                                                str7 = "";
                                            } else {
                                                str7 = strM8334b6;
                                            }
                                            if (joinedChallengeStats != null || (numM8292i = joinedChallengeStats.m8292i()) == null) {
                                                participantM8336d14 = resultChallenge.m8336d();
                                                if (participantM8336d14 != null || (participantStatM8307b19 = participantM8336d14.m8307b()) == null || (numM8316i = participantStatM8307b19.m8316i()) == null) {
                                                    d15 = 0.0d;
                                                } else {
                                                    iIntValue16 = numM8316i.intValue();
                                                }
                                                if (joinedChallengeStats != null || (numM8293j = joinedChallengeStats.m8293j()) == null) {
                                                    participantM8336d15 = resultChallenge.m8336d();
                                                    if (participantM8336d15 != null || (participantStatM8307b20 = participantM8336d15.m8307b()) == null || (numM8317j = participantStatM8307b20.m8317j()) == null) {
                                                        d16 = 0.0d;
                                                    } else {
                                                        iIntValue17 = numM8317j.intValue();
                                                    }
                                                    hs0 hs0Var22 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                                    strM8334b7 = resultChallenge.m8334b();
                                                    if (strM8334b7 == null) {
                                                        str8 = "";
                                                    } else {
                                                        str8 = strM8334b7;
                                                    }
                                                    if (joinedChallengeStats != null || (numM8288e = joinedChallengeStats.m8288e()) == null) {
                                                        participantM8336d16 = resultChallenge.m8336d();
                                                        if (participantM8336d16 != null || (participantStatM8307b21 = participantM8336d16.m8307b()) == null || (numM8312e = participantStatM8307b21.m8312e()) == null) {
                                                            d17 = 0.0d;
                                                        } else {
                                                            iIntValue18 = numM8312e.intValue();
                                                        }
                                                        if (joinedChallengeStats != null || (numM8289f = joinedChallengeStats.m8289f()) == null) {
                                                            participantM8336d17 = resultChallenge.m8336d();
                                                            if (participantM8336d17 != null || (participantStatM8307b22 = participantM8336d17.m8307b()) == null || (numM8313f = participantStatM8307b22.m8313f()) == null) {
                                                                d18 = 0.0d;
                                                            } else {
                                                                iIntValue19 = numM8313f.intValue();
                                                            }
                                                            List listM23605K10 = vz1.m23605K(hs0Var20, hs0Var21, hs0Var22, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                                            objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K10, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                            if (objM2861d2 != coroutineSingletons) {
                                                                objM2861d2 = xfaVar;
                                                            }
                                                            if (objM2861d2 == coroutineSingletons) {
                                                                return coroutineSingletons;
                                                            }
                                                        } else {
                                                            iIntValue19 = numM8289f.intValue();
                                                        }
                                                        d18 = iIntValue19;
                                                        List listM23605K11 = vz1.m23605K(hs0Var20, hs0Var21, hs0Var22, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                        challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                                        objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K11, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                        if (objM2861d2 != coroutineSingletons) {
                                                            objM2861d2 = xfaVar;
                                                        }
                                                        if (objM2861d2 == coroutineSingletons) {
                                                            return coroutineSingletons;
                                                        }
                                                    } else {
                                                        iIntValue18 = numM8288e.intValue();
                                                    }
                                                    d17 = iIntValue18;
                                                    if (joinedChallengeStats != null) {
                                                        participantM8336d17 = resultChallenge.m8336d();
                                                        if (participantM8336d17 != null) {
                                                        }
                                                        d18 = 0.0d;
                                                    } else {
                                                        participantM8336d17 = resultChallenge.m8336d();
                                                        if (participantM8336d17 != null) {
                                                        }
                                                        d18 = 0.0d;
                                                    }
                                                    List listM23605K12 = vz1.m23605K(hs0Var20, hs0Var21, hs0Var22, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                    challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                                    objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K12, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                    if (objM2861d2 != coroutineSingletons) {
                                                        objM2861d2 = xfaVar;
                                                    }
                                                    if (objM2861d2 == coroutineSingletons) {
                                                        return coroutineSingletons;
                                                    }
                                                } else {
                                                    iIntValue17 = numM8293j.intValue();
                                                }
                                                d16 = iIntValue17;
                                                hs0 hs0Var23 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                                strM8334b7 = resultChallenge.m8334b();
                                                if (strM8334b7 == null) {
                                                    str8 = "";
                                                } else {
                                                    str8 = strM8334b7;
                                                }
                                                if (joinedChallengeStats != null) {
                                                    participantM8336d16 = resultChallenge.m8336d();
                                                    if (participantM8336d16 != null) {
                                                    }
                                                    d17 = 0.0d;
                                                } else {
                                                    participantM8336d16 = resultChallenge.m8336d();
                                                    if (participantM8336d16 != null) {
                                                    }
                                                    d17 = 0.0d;
                                                }
                                                if (joinedChallengeStats != null) {
                                                    participantM8336d17 = resultChallenge.m8336d();
                                                    if (participantM8336d17 != null) {
                                                    }
                                                    d18 = 0.0d;
                                                } else {
                                                    participantM8336d17 = resultChallenge.m8336d();
                                                    if (participantM8336d17 != null) {
                                                    }
                                                    d18 = 0.0d;
                                                }
                                                List listM23605K13 = vz1.m23605K(hs0Var20, hs0Var21, hs0Var23, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                                challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                                objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K13, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                                if (objM2861d2 != coroutineSingletons) {
                                                    objM2861d2 = xfaVar;
                                                }
                                                if (objM2861d2 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            } else {
                                                iIntValue16 = numM8292i.intValue();
                                            }
                                            d15 = iIntValue16;
                                            if (joinedChallengeStats != null) {
                                                participantM8336d15 = resultChallenge.m8336d();
                                                if (participantM8336d15 != null) {
                                                }
                                                d16 = 0.0d;
                                            } else {
                                                participantM8336d15 = resultChallenge.m8336d();
                                                if (participantM8336d15 != null) {
                                                }
                                                d16 = 0.0d;
                                            }
                                            hs0 hs0Var24 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                            strM8334b7 = resultChallenge.m8334b();
                                            if (strM8334b7 == null) {
                                                str8 = "";
                                            } else {
                                                str8 = strM8334b7;
                                            }
                                            if (joinedChallengeStats != null) {
                                                participantM8336d16 = resultChallenge.m8336d();
                                                if (participantM8336d16 != null) {
                                                }
                                                d17 = 0.0d;
                                            } else {
                                                participantM8336d16 = resultChallenge.m8336d();
                                                if (participantM8336d16 != null) {
                                                }
                                                d17 = 0.0d;
                                            }
                                            if (joinedChallengeStats != null) {
                                                participantM8336d17 = resultChallenge.m8336d();
                                                if (participantM8336d17 != null) {
                                                }
                                                d18 = 0.0d;
                                            } else {
                                                participantM8336d17 = resultChallenge.m8336d();
                                                if (participantM8336d17 != null) {
                                                }
                                                d18 = 0.0d;
                                            }
                                            List listM23605K14 = vz1.m23605K(hs0Var20, hs0Var21, hs0Var24, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                            objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K14, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                            if (objM2861d2 != coroutineSingletons) {
                                                objM2861d2 = xfaVar;
                                            }
                                            if (objM2861d2 == coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                        } else {
                                            iIntValue15 = numM8297n.intValue();
                                        }
                                        d14 = iIntValue15;
                                        hs0 hs0Var25 = new hs0(str, str6, "reading", null, d13, d14, 0, null, null, 936);
                                        strM8334b6 = resultChallenge.m8334b();
                                        if (strM8334b6 == null) {
                                            str7 = "";
                                        } else {
                                            str7 = strM8334b6;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d14 = resultChallenge.m8336d();
                                            if (participantM8336d14 != null) {
                                            }
                                            d15 = 0.0d;
                                        } else {
                                            participantM8336d14 = resultChallenge.m8336d();
                                            if (participantM8336d14 != null) {
                                            }
                                            d15 = 0.0d;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d15 = resultChallenge.m8336d();
                                            if (participantM8336d15 != null) {
                                            }
                                            d16 = 0.0d;
                                        } else {
                                            participantM8336d15 = resultChallenge.m8336d();
                                            if (participantM8336d15 != null) {
                                            }
                                            d16 = 0.0d;
                                        }
                                        hs0 hs0Var26 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                        strM8334b7 = resultChallenge.m8334b();
                                        if (strM8334b7 == null) {
                                            str8 = "";
                                        } else {
                                            str8 = strM8334b7;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d16 = resultChallenge.m8336d();
                                            if (participantM8336d16 != null) {
                                            }
                                            d17 = 0.0d;
                                        } else {
                                            participantM8336d16 = resultChallenge.m8336d();
                                            if (participantM8336d16 != null) {
                                            }
                                            d17 = 0.0d;
                                        }
                                        if (joinedChallengeStats != null) {
                                            participantM8336d17 = resultChallenge.m8336d();
                                            if (participantM8336d17 != null) {
                                            }
                                            d18 = 0.0d;
                                        } else {
                                            participantM8336d17 = resultChallenge.m8336d();
                                            if (participantM8336d17 != null) {
                                            }
                                            d18 = 0.0d;
                                        }
                                        List listM23605K15 = vz1.m23605K(hs0Var20, hs0Var25, hs0Var26, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                        challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                        challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                        objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K15, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                        if (objM2861d2 != coroutineSingletons) {
                                            objM2861d2 = xfaVar;
                                        }
                                        if (objM2861d2 == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                    } else {
                                        iIntValue14 = numM8296m.intValue();
                                    }
                                    d13 = iIntValue14;
                                    if (joinedChallengeStats != null) {
                                        participantM8336d13 = resultChallenge.m8336d();
                                        if (participantM8336d13 != null) {
                                        }
                                        d14 = 0.0d;
                                    } else {
                                        participantM8336d13 = resultChallenge.m8336d();
                                        if (participantM8336d13 != null) {
                                        }
                                        d14 = 0.0d;
                                    }
                                    hs0 hs0Var27 = new hs0(str, str6, "reading", null, d13, d14, 0, null, null, 936);
                                    strM8334b6 = resultChallenge.m8334b();
                                    if (strM8334b6 == null) {
                                        str7 = "";
                                    } else {
                                        str7 = strM8334b6;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d14 = resultChallenge.m8336d();
                                        if (participantM8336d14 != null) {
                                        }
                                        d15 = 0.0d;
                                    } else {
                                        participantM8336d14 = resultChallenge.m8336d();
                                        if (participantM8336d14 != null) {
                                        }
                                        d15 = 0.0d;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d15 = resultChallenge.m8336d();
                                        if (participantM8336d15 != null) {
                                        }
                                        d16 = 0.0d;
                                    } else {
                                        participantM8336d15 = resultChallenge.m8336d();
                                        if (participantM8336d15 != null) {
                                        }
                                        d16 = 0.0d;
                                    }
                                    hs0 hs0Var28 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                    strM8334b7 = resultChallenge.m8334b();
                                    if (strM8334b7 == null) {
                                        str8 = "";
                                    } else {
                                        str8 = strM8334b7;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d16 = resultChallenge.m8336d();
                                        if (participantM8336d16 != null) {
                                        }
                                        d17 = 0.0d;
                                    } else {
                                        participantM8336d16 = resultChallenge.m8336d();
                                        if (participantM8336d16 != null) {
                                        }
                                        d17 = 0.0d;
                                    }
                                    if (joinedChallengeStats != null) {
                                        participantM8336d17 = resultChallenge.m8336d();
                                        if (participantM8336d17 != null) {
                                        }
                                        d18 = 0.0d;
                                    } else {
                                        participantM8336d17 = resultChallenge.m8336d();
                                        if (participantM8336d17 != null) {
                                        }
                                        d18 = 0.0d;
                                    }
                                    List listM23605K16 = vz1.m23605K(hs0Var20, hs0Var27, hs0Var28, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                    challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                    challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                    objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K16, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                    if (objM2861d2 != coroutineSingletons) {
                                        objM2861d2 = xfaVar;
                                    }
                                    if (objM2861d2 == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                } else {
                                    iIntValue13 = numM8303t.intValue();
                                }
                                d12 = iIntValue13;
                                hs0 hs0Var29 = new hs0(str, str18, "lingqs", null, d11, d12, 0, null, null, 936);
                                strM8334b5 = resultChallenge.m8334b();
                                if (strM8334b5 == null) {
                                    str6 = "";
                                } else {
                                    str6 = strM8334b5;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d12 = resultChallenge.m8336d();
                                    if (participantM8336d12 != null) {
                                    }
                                    d13 = 0.0d;
                                } else {
                                    participantM8336d12 = resultChallenge.m8336d();
                                    if (participantM8336d12 != null) {
                                    }
                                    d13 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d13 = resultChallenge.m8336d();
                                    if (participantM8336d13 != null) {
                                    }
                                    d14 = 0.0d;
                                } else {
                                    participantM8336d13 = resultChallenge.m8336d();
                                    if (participantM8336d13 != null) {
                                    }
                                    d14 = 0.0d;
                                }
                                hs0 hs0Var210 = new hs0(str, str6, "reading", null, d13, d14, 0, null, null, 936);
                                strM8334b6 = resultChallenge.m8334b();
                                if (strM8334b6 == null) {
                                    str7 = "";
                                } else {
                                    str7 = strM8334b6;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d14 = resultChallenge.m8336d();
                                    if (participantM8336d14 != null) {
                                    }
                                    d15 = 0.0d;
                                } else {
                                    participantM8336d14 = resultChallenge.m8336d();
                                    if (participantM8336d14 != null) {
                                    }
                                    d15 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d15 = resultChallenge.m8336d();
                                    if (participantM8336d15 != null) {
                                    }
                                    d16 = 0.0d;
                                } else {
                                    participantM8336d15 = resultChallenge.m8336d();
                                    if (participantM8336d15 != null) {
                                    }
                                    d16 = 0.0d;
                                }
                                hs0 hs0Var211 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                                strM8334b7 = resultChallenge.m8334b();
                                if (strM8334b7 == null) {
                                    str8 = "";
                                } else {
                                    str8 = strM8334b7;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d16 = resultChallenge.m8336d();
                                    if (participantM8336d16 != null) {
                                    }
                                    d17 = 0.0d;
                                } else {
                                    participantM8336d16 = resultChallenge.m8336d();
                                    if (participantM8336d16 != null) {
                                    }
                                    d17 = 0.0d;
                                }
                                if (joinedChallengeStats != null) {
                                    participantM8336d17 = resultChallenge.m8336d();
                                    if (participantM8336d17 != null) {
                                    }
                                    d18 = 0.0d;
                                } else {
                                    participantM8336d17 = resultChallenge.m8336d();
                                    if (participantM8336d17 != null) {
                                    }
                                    d18 = 0.0d;
                                }
                                List listM23605K17 = vz1.m23605K(hs0Var29, hs0Var210, hs0Var211, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                                challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                                objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K17, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                                if (objM2861d2 != coroutineSingletons) {
                                    objM2861d2 = xfaVar;
                                }
                                if (objM2861d2 == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            } else {
                                iIntValue12 = numM8302s.intValue();
                            }
                            d11 = iIntValue12;
                            if (joinedChallengeStats != null) {
                                participantM8336d11 = resultChallenge.m8336d();
                                if (participantM8336d11 != null) {
                                }
                                d12 = 0.0d;
                            } else {
                                participantM8336d11 = resultChallenge.m8336d();
                                if (participantM8336d11 != null) {
                                }
                                d12 = 0.0d;
                            }
                            hs0 hs0Var212 = new hs0(str, str18, "lingqs", null, d11, d12, 0, null, null, 936);
                            strM8334b5 = resultChallenge.m8334b();
                            if (strM8334b5 == null) {
                                str6 = "";
                            } else {
                                str6 = strM8334b5;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d12 = resultChallenge.m8336d();
                                if (participantM8336d12 != null) {
                                }
                                d13 = 0.0d;
                            } else {
                                participantM8336d12 = resultChallenge.m8336d();
                                if (participantM8336d12 != null) {
                                }
                                d13 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d13 = resultChallenge.m8336d();
                                if (participantM8336d13 != null) {
                                }
                                d14 = 0.0d;
                            } else {
                                participantM8336d13 = resultChallenge.m8336d();
                                if (participantM8336d13 != null) {
                                }
                                d14 = 0.0d;
                            }
                            hs0 hs0Var213 = new hs0(str, str6, "reading", null, d13, d14, 0, null, null, 936);
                            strM8334b6 = resultChallenge.m8334b();
                            if (strM8334b6 == null) {
                                str7 = "";
                            } else {
                                str7 = strM8334b6;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d14 = resultChallenge.m8336d();
                                if (participantM8336d14 != null) {
                                }
                                d15 = 0.0d;
                            } else {
                                participantM8336d14 = resultChallenge.m8336d();
                                if (participantM8336d14 != null) {
                                }
                                d15 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d15 = resultChallenge.m8336d();
                                if (participantM8336d15 != null) {
                                }
                                d16 = 0.0d;
                            } else {
                                participantM8336d15 = resultChallenge.m8336d();
                                if (participantM8336d15 != null) {
                                }
                                d16 = 0.0d;
                            }
                            hs0 hs0Var214 = new hs0(str, str7, "listening", null, d15, d16, 0, null, null, 936);
                            strM8334b7 = resultChallenge.m8334b();
                            if (strM8334b7 == null) {
                                str8 = "";
                            } else {
                                str8 = strM8334b7;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d16 = resultChallenge.m8336d();
                                if (participantM8336d16 != null) {
                                }
                                d17 = 0.0d;
                            } else {
                                participantM8336d16 = resultChallenge.m8336d();
                                if (participantM8336d16 != null) {
                                }
                                d17 = 0.0d;
                            }
                            if (joinedChallengeStats != null) {
                                participantM8336d17 = resultChallenge.m8336d();
                                if (participantM8336d17 != null) {
                                }
                                d18 = 0.0d;
                            } else {
                                participantM8336d17 = resultChallenge.m8336d();
                                if (participantM8336d17 != null) {
                                }
                                d18 = 0.0d;
                            }
                            List listM23605K18 = vz1.m23605K(hs0Var212, hs0Var213, hs0Var214, new hs0(str, str8, "earnedCoins", null, d17, d18, 0, null, null, 936));
                            challengeRepositoryImpl$insertChallengeStat$1.f14773a = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14774b = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14775c = null;
                            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 3;
                            objM2861d2 = AbstractC0758a.m2861d(new tp0(yp0Var, listM23605K18, i3), yp0Var.f70233K, challengeRepositoryImpl$insertChallengeStat$1, false, true);
                            if (objM2861d2 != coroutineSingletons) {
                                objM2861d2 = xfaVar;
                            }
                            if (objM2861d2 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        break;
                    case 359515668:
                        if (strM8333a.equals("monthlyLingQing") && (participantM8336d18 = resultChallenge.m8336d()) != null && (participantStatM8307b23 = participantM8336d18.m8307b()) != null && (listM8326s = participantStatM8307b23.m8326s()) != null) {
                            str9 = str;
                            it = listM8326s.iterator();
                            resultChallenge2 = resultChallenge;
                            joinedChallengeStats2 = joinedChallengeStats;
                        }
                        break;
                }
            }
            return xfaVar;
        }
        if (i2 == 1) {
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        if (i2 == 2) {
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        if (i2 == 3) {
            AbstractC3193b.m15359b(obj);
            return xfaVar;
        }
        if (i2 != 4) {
            if (i2 == 5) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i5 = challengeRepositoryImpl$insertChallengeStat$1.f14777e;
        it = challengeRepositoryImpl$insertChallengeStat$1.f14776d;
        JoinedChallengeStats joinedChallengeStats3 = challengeRepositoryImpl$insertChallengeStat$1.f14775c;
        ResultChallenge resultChallenge3 = challengeRepositoryImpl$insertChallengeStat$1.f14774b;
        String str19 = challengeRepositoryImpl$insertChallengeStat$1.f14773a;
        AbstractC3193b.m15359b(obj);
        iIntValue = i5;
        resultChallenge2 = resultChallenge3;
        str9 = str19;
        joinedChallengeStats2 = joinedChallengeStats3;
        while (it.hasNext()) {
            Target target = (Target) it.next();
            String strM8334b14 = resultChallenge2.m8334b();
            String str20 = strM8334b14 == null ? "" : strM8334b14;
            String strM8404a = target.m8404a();
            String str21 = strM8404a == null ? "" : strM8404a;
            if (joinedChallengeStats2 == null || (numM8284a2 = joinedChallengeStats2.m8284a()) == null) {
                Participant participantM8336d28 = resultChallenge2.m8336d();
                if (participantM8336d28 == null || (participantStatM8307b24 = participantM8336d28.m8307b()) == null || (numM8308a2 = participantStatM8307b24.m8308a()) == null) {
                    d19 = 0.0d;
                } else {
                    iIntValue20 = numM8308a2.intValue();
                }
                dM8405b = target.m8405b();
                if (dM8405b != null) {
                    dDoubleValue5 = dM8405b.doubleValue();
                } else {
                    dDoubleValue5 = 0.0d;
                }
                hs0Var2 = new hs0(str9, str20, str21, null, d19, dDoubleValue5, 0, null, null, 936);
                str10 = str9;
                challengeRepositoryImpl$insertChallengeStat$1.f14773a = str10;
                challengeRepositoryImpl$insertChallengeStat$1.f14774b = resultChallenge2;
                challengeRepositoryImpl$insertChallengeStat$1.f14775c = joinedChallengeStats2;
                challengeRepositoryImpl$insertChallengeStat$1.f14776d = it;
                challengeRepositoryImpl$insertChallengeStat$1.f14777e = iIntValue;
                challengeRepositoryImpl$insertChallengeStat$1.f14780h = 4;
                if (yp0Var.m25241y0(hs0Var2, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str10;
            } else {
                iIntValue20 = numM8284a2.intValue();
            }
            d19 = iIntValue20;
            dM8405b = target.m8405b();
            if (dM8405b != null) {
                dDoubleValue5 = dM8405b.doubleValue();
            } else {
                dDoubleValue5 = 0.0d;
            }
            hs0Var2 = new hs0(str9, str20, str21, null, d19, dDoubleValue5, 0, null, null, 936);
            str10 = str9;
            challengeRepositoryImpl$insertChallengeStat$1.f14773a = str10;
            challengeRepositoryImpl$insertChallengeStat$1.f14774b = resultChallenge2;
            challengeRepositoryImpl$insertChallengeStat$1.f14775c = joinedChallengeStats2;
            challengeRepositoryImpl$insertChallengeStat$1.f14776d = it;
            challengeRepositoryImpl$insertChallengeStat$1.f14777e = iIntValue;
            challengeRepositoryImpl$insertChallengeStat$1.f14780h = 4;
            if (yp0Var.m25241y0(hs0Var2, challengeRepositoryImpl$insertChallengeStat$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            str9 = str10;
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:38:0x0120  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    public final Object m7135b(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$joinChallenge$1 challengeRepositoryImpl$joinChallenge$1;
        String str5;
        Challenge challenge;
        Object objM2861d;
        String str6 = str;
        if (continuationImpl instanceof ChallengeRepositoryImpl$joinChallenge$1) {
            challengeRepositoryImpl$joinChallenge$1 = (ChallengeRepositoryImpl$joinChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$joinChallenge$1.f14785e;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$joinChallenge$1.f14785e = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$joinChallenge$1 = new ChallengeRepositoryImpl$joinChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$joinChallenge$1 = new ChallengeRepositoryImpl$joinChallenge$1(this, continuationImpl);
        }
        Object objM2861d2 = challengeRepositoryImpl$joinChallenge$1.f14783c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$joinChallenge$1.f14785e;
        xfa xfaVar = xfa.f68157a;
        yp0 yp0Var = this.f16464a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM2861d2);
            xj1 xj1Var = new xj1();
            xj1Var.m24558b(NetworkType.CONNECTED);
            tx6 tx6Var = (tx6) ((tx6) new tx6(ChallengeSignupWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
            Pair[] pairArr = {new Pair("language", str6), new Pair("challengeCode", str2), new Pair("challengeType", str3), new Pair("metric", str4)};
            hi8 hi8Var = new hi8(10);
            for (int i4 = 0; i4 < 4; i4++) {
                Pair pair = pairArr[i4];
                hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
            }
            this.f16466c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
            challengeRepositoryImpl$joinChallenge$1.f14781a = str6;
            challengeRepositoryImpl$joinChallenge$1.f14782b = str2;
            challengeRepositoryImpl$joinChallenge$1.f14785e = 1;
            Object objM2861d3 = AbstractC0758a.m2861d(new md0(str6, i3, str2), yp0Var.f70233K, challengeRepositoryImpl$joinChallenge$1, false, true);
            if (objM2861d3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d3 = xfaVar;
            }
            if (objM2861d3 != coroutineSingletons) {
                str5 = str2;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str5 = challengeRepositoryImpl$joinChallenge$1.f14782b;
            str6 = challengeRepositoryImpl$joinChallenge$1.f14781a;
            AbstractC3193b.m15359b(objM2861d2);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM2861d2);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str5 = challengeRepositoryImpl$joinChallenge$1.f14782b;
            str6 = challengeRepositoryImpl$joinChallenge$1.f14781a;
            AbstractC3193b.m15359b(objM2861d2);
        }
        challenge = (Challenge) objM2861d2;
        if (challenge != null) {
            int iM8011a = challenge.m8011a() + 1;
            challengeRepositoryImpl$joinChallenge$1.f14781a = null;
            challengeRepositoryImpl$joinChallenge$1.f14782b = null;
            challengeRepositoryImpl$joinChallenge$1.f14785e = 3;
            objM2861d = AbstractC0758a.m2861d(new sp0(str6, iM8011a, 0, str5), yp0Var.f70233K, challengeRepositoryImpl$joinChallenge$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
        challengeRepositoryImpl$joinChallenge$1.f14781a = str6;
        challengeRepositoryImpl$joinChallenge$1.f14782b = str5;
        challengeRepositoryImpl$joinChallenge$1.f14785e = 2;
        objM2861d2 = AbstractC0758a.m2861d(new md0(str6, 2, str5), yp0Var.f70233K, challengeRepositoryImpl$joinChallenge$1, true, false);
        if (objM2861d2 != coroutineSingletons) {
            challenge = (Challenge) objM2861d2;
            if (challenge != null) {
                int iM8011a2 = challenge.m8011a() + 1;
                challengeRepositoryImpl$joinChallenge$1.f14781a = null;
                challengeRepositoryImpl$joinChallenge$1.f14782b = null;
                challengeRepositoryImpl$joinChallenge$1.f14785e = 3;
                objM2861d = AbstractC0758a.m2861d(new sp0(str6, iM8011a2, 0, str5), yp0Var.f70233K, challengeRepositoryImpl$joinChallenge$1, false, true);
                if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objM2861d = xfaVar;
                }
                if (objM2861d == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[LOOP:0: B:30:0x00b9->B:31:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m7136c(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$leaveBookChallenge$1 challengeRepositoryImpl$leaveBookChallenge$1;
        String str3;
        String str4;
        Pair[] pairArr;
        hi8 hi8Var;
        if (continuationImpl instanceof ChallengeRepositoryImpl$leaveBookChallenge$1) {
            challengeRepositoryImpl$leaveBookChallenge$1 = (ChallengeRepositoryImpl$leaveBookChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$leaveBookChallenge$1.f14790e;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$leaveBookChallenge$1.f14790e = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$leaveBookChallenge$1 = new ChallengeRepositoryImpl$leaveBookChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$leaveBookChallenge$1 = new ChallengeRepositoryImpl$leaveBookChallenge$1(this, continuationImpl);
        }
        Object obj = challengeRepositoryImpl$leaveBookChallenge$1.f14788c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$leaveBookChallenge$1.f14790e;
        xfa xfaVar = xfa.f68157a;
        yp0 yp0Var = this.f16464a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            challengeRepositoryImpl$leaveBookChallenge$1.f14786a = str;
            challengeRepositoryImpl$leaveBookChallenge$1.f14787b = str2;
            challengeRepositoryImpl$leaveBookChallenge$1.f14790e = 1;
            Object objM2861d = AbstractC0758a.m2861d(new md0(str, 3, str2), yp0Var.f70233K, challengeRepositoryImpl$leaveBookChallenge$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = challengeRepositoryImpl$leaveBookChallenge$1.f14787b;
            str = challengeRepositoryImpl$leaveBookChallenge$1.f14786a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str4 = challengeRepositoryImpl$leaveBookChallenge$1.f14787b;
            str3 = challengeRepositoryImpl$leaveBookChallenge$1.f14786a;
            AbstractC3193b.m15359b(obj);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(BookChallengeLeaveWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        pairArr = new Pair[]{new Pair("language", str3), new Pair("challengeCode", str4)};
        hi8Var = new hi8(10);
        for (int i3 = 0; i3 < 2; i3++) {
            Pair pair = pairArr[i3];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16466c.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfaVar;
        challengeRepositoryImpl$leaveBookChallenge$1.f14786a = str;
        challengeRepositoryImpl$leaveBookChallenge$1.f14787b = str2;
        challengeRepositoryImpl$leaveBookChallenge$1.f14790e = 2;
        Object objM2861d2 = AbstractC0758a.m2861d(new rp0(str, 0, str2, str2), yp0Var.f70233K, challengeRepositoryImpl$leaveBookChallenge$1, false, true);
        if (objM2861d2 != coroutineSingletons) {
            objM2861d2 = xfaVar;
        }
        if (objM2861d2 != coroutineSingletons) {
            String str5 = str2;
            str3 = str;
            str4 = str5;
            xj1 xj1Var2 = new xj1();
            xj1Var2.m24558b(NetworkType.CONNECTED);
            tx6 tx6Var2 = (tx6) ((tx6) new tx6(BookChallengeLeaveWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var2.m24557a());
            pairArr = new Pair[]{new Pair("language", str3), new Pair("challengeCode", str4)};
            hi8Var = new hi8(10);
            while (i3 < 2) {
                Pair pair2 = pairArr[i3];
                hi8Var.m13287x(pair2.f47624b, (String) pair2.f47623a);
            }
            this.f16466c.m2912a((ux6) ((tx6) tx6Var2.m15008g(hi8Var.m13282k())).m15004a());
            return xfaVar;
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:56:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:63:0x021a  */
    /* JADX WARN: Code duplicated, block: B:66:0x021e  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x021e -> B:51:0x01c1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: d */
    public final java.lang.Object m7137d(int r19, java.lang.String r20, java.lang.String r21, kotlin.coroutines.jvm.internal.ContinuationImpl r22) {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1288d.m7137d(int, java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Serializable m7138e(ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkBookChallengeBadges$1 challengeRepositoryImpl$networkBookChallengeBadges$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkBookChallengeBadges$1) {
            challengeRepositoryImpl$networkBookChallengeBadges$1 = (ChallengeRepositoryImpl$networkBookChallengeBadges$1) continuationImpl;
            int i = challengeRepositoryImpl$networkBookChallengeBadges$1.f14803c;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkBookChallengeBadges$1.f14803c = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkBookChallengeBadges$1 = new ChallengeRepositoryImpl$networkBookChallengeBadges$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkBookChallengeBadges$1 = new ChallengeRepositoryImpl$networkBookChallengeBadges$1(this, continuationImpl);
        }
        Object objM21658e = challengeRepositoryImpl$networkBookChallengeBadges$1.f14801a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkBookChallengeBadges$1.f14803c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21658e);
            challengeRepositoryImpl$networkBookChallengeBadges$1.f14803c = 1;
            objM21658e = this.f16465b.m21658e(1, 100, "recent", challengeRepositoryImpl$networkBookChallengeBadges$1);
            if (objM21658e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM21658e);
        }
        List list = ((Results) objM21658e).f21739d;
        if (list == null) {
            return EmptyList.f47638a;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String strM8329a = ((ResultBookChallengeBadges) it.next()).m8329a();
            if (strM8329a == null) {
                strM8329a = "";
            }
            arrayList.add(strM8329a);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0101  */
    /* JADX WARN: Code duplicated, block: B:40:0x0109  */
    /* JADX WARN: Code duplicated, block: B:43:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0135 -> B:44:0x013b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: f */
    public final java.lang.Object m7139f(java.lang.String r18, java.lang.String r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1288d.m7139f(java.lang.String, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m7140g(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkGetChallenge$1 challengeRepositoryImpl$networkGetChallenge$1;
        ResultChallenge resultChallenge;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkGetChallenge$1) {
            challengeRepositoryImpl$networkGetChallenge$1 = (ChallengeRepositoryImpl$networkGetChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$networkGetChallenge$1.f14825f;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetChallenge$1.f14825f = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetChallenge$1 = new ChallengeRepositoryImpl$networkGetChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkGetChallenge$1 = new ChallengeRepositoryImpl$networkGetChallenge$1(this, continuationImpl);
        }
        Object objM21662j = challengeRepositoryImpl$networkGetChallenge$1.f14823d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkGetChallenge$1.f14825f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21662j);
            challengeRepositoryImpl$networkGetChallenge$1.f14820a = str;
            challengeRepositoryImpl$networkGetChallenge$1.f14821b = str2;
            challengeRepositoryImpl$networkGetChallenge$1.f14825f = 1;
            objM21662j = this.f16465b.m21662j(str2, challengeRepositoryImpl$networkGetChallenge$1);
            if (objM21662j != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            str2 = challengeRepositoryImpl$networkGetChallenge$1.f14821b;
            str = challengeRepositoryImpl$networkGetChallenge$1.f14820a;
            AbstractC3193b.m15359b(objM21662j);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            resultChallenge = challengeRepositoryImpl$networkGetChallenge$1.f14822c;
            AbstractC3193b.m15359b(objM21662j);
        }
        return w4d.m23759b(resultChallenge);
        ResultChallenge resultChallenge2 = (ResultChallenge) objM21662j;
        challengeRepositoryImpl$networkGetChallenge$1.f14820a = null;
        challengeRepositoryImpl$networkGetChallenge$1.f14821b = null;
        challengeRepositoryImpl$networkGetChallenge$1.f14822c = resultChallenge2;
        challengeRepositoryImpl$networkGetChallenge$1.f14825f = 2;
        if (m7148o(str, str2, resultChallenge2, challengeRepositoryImpl$networkGetChallenge$1) != obj) {
            resultChallenge = resultChallenge2;
            return w4d.m23759b(resultChallenge);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x0100 A[LOOP:0: B:40:0x00fa->B:42:0x0100, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0133  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: h */
    public final Object m7141h(String str, String str2, String str3, String str4, String str5, Set set, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkGetChallengeRanking$1 challengeRepositoryImpl$networkGetChallengeRanking$1;
        String str6;
        String str7;
        String str8;
        String str9;
        Set set2;
        List listM23604J;
        String str10;
        String str11;
        String str12;
        Results results;
        List list;
        ArrayList arrayList;
        Iterator it;
        Object objM2861d;
        Results results2;
        String str13 = str3;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkGetChallengeRanking$1) {
            challengeRepositoryImpl$networkGetChallengeRanking$1 = (ChallengeRepositoryImpl$networkGetChallengeRanking$1) continuationImpl;
            int i = challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetChallengeRanking$1 = new ChallengeRepositoryImpl$networkGetChallengeRanking$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkGetChallengeRanking$1 = new ChallengeRepositoryImpl$networkGetChallengeRanking$1(this, continuationImpl);
        }
        Object objM21656a = challengeRepositoryImpl$networkGetChallengeRanking$1.f14833h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j;
        Object obj = xfa.f68157a;
        yp0 yp0Var = this.f16464a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21656a);
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a = str;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b = str2;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c = str13;
            str6 = str4;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14829d = str6;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14830e = str5;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f = set;
            challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j = 1;
            Object objM2861d2 = AbstractC0758a.m2861d(new rp0(str, 1, str13, str2), yp0Var.f70233K, challengeRepositoryImpl$networkGetChallengeRanking$1, false, true);
            if (objM2861d2 != coroutineSingletons) {
                objM2861d2 = obj;
            }
            if (objM2861d2 != coroutineSingletons) {
                str7 = str;
                str8 = str2;
                str9 = str5;
                set2 = set;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            set2 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f;
            str9 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14830e;
            String str14 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14829d;
            String str15 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c;
            str8 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b;
            str7 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a;
            AbstractC3193b.m15359b(objM21656a);
            str6 = str14;
            str13 = str15;
        } else {
            if (i2 == 2) {
                Set set3 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f;
                str11 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c;
                str10 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b;
                str12 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a;
                AbstractC3193b.m15359b(objM21656a);
                results = (Results) objM21656a;
                list = results.f21739d;
                if (list != null) {
                    List list2 = list;
                    arrayList = new ArrayList(v91.m23189q0(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ypc.m25272a((ResultChallengeRanking) it.next(), str12, str10, str11));
                    }
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14829d = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14830e = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14832g = results;
                    challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j = 3;
                    objM2861d = AbstractC0758a.m2861d(new s70(7, yp0Var, arrayList), yp0Var.f70233K, challengeRepositoryImpl$networkGetChallengeRanking$1, false, true);
                    if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        obj = objM2861d;
                    }
                    if (obj != coroutineSingletons) {
                        results2 = results;
                    }
                    return coroutineSingletons;
                }
                return new Integer(results.f21736a);
            }
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            results2 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14832g;
            Set set4 = challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f;
            AbstractC3193b.m15359b(objM21656a);
        }
        results = results2;
        return new Integer(results.f21736a);
        if (set2 == null) {
            listM23604J = vz1.m23604J(str7);
        } else {
            if (set2.isEmpty()) {
                set2 = null;
            }
            if (set2 != null) {
                listM23604J = u91.m22622n1(set2);
            } else {
                listM23604J = vz1.m23604J(str7);
            }
        }
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a = str7;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b = str8;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c = str13;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14829d = null;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14830e = null;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f = null;
        challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j = 2;
        String str16 = str13;
        String str17 = str8;
        objM21656a = this.f16465b.m21656a(str17, listM23604J, 1, 100, str16, str6, str9, challengeRepositoryImpl$networkGetChallengeRanking$1);
        str10 = str17;
        str11 = str16;
        if (objM21656a != coroutineSingletons) {
            str12 = str7;
            results = (Results) objM21656a;
            list = results.f21739d;
            if (list != null) {
                List list3 = list;
                arrayList = new ArrayList(v91.m23189q0(list3, 10));
                it = list3.iterator();
                while (it.hasNext()) {
                    arrayList.add(ypc.m25272a((ResultChallengeRanking) it.next(), str12, str10, str11));
                }
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14826a = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14827b = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14828c = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14829d = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14830e = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14831f = null;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14832g = results;
                challengeRepositoryImpl$networkGetChallengeRanking$1.f14835j = 3;
                objM2861d = AbstractC0758a.m2861d(new s70(7, yp0Var, arrayList), yp0Var.f70233K, challengeRepositoryImpl$networkGetChallengeRanking$1, false, true);
                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objM2861d;
                }
                if (obj != coroutineSingletons) {
                    results2 = results;
                    results = results2;
                }
            }
            return new Integer(results.f21736a);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (m7140g(r8, r9, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7142i(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkJoinBookChallenge$1 challengeRepositoryImpl$networkJoinBookChallenge$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkJoinBookChallenge$1) {
            challengeRepositoryImpl$networkJoinBookChallenge$1 = (ChallengeRepositoryImpl$networkJoinBookChallenge$1) continuationImpl;
            int i2 = challengeRepositoryImpl$networkJoinBookChallenge$1.f14841f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkJoinBookChallenge$1.f14841f = i2 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkJoinBookChallenge$1 = new ChallengeRepositoryImpl$networkJoinBookChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkJoinBookChallenge$1 = new ChallengeRepositoryImpl$networkJoinBookChallenge$1(this, continuationImpl);
        }
        Object obj = challengeRepositoryImpl$networkJoinBookChallenge$1.f14839d;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = challengeRepositoryImpl$networkJoinBookChallenge$1.f14841f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            RequestBookChallengeJoin requestBookChallengeJoin = new RequestBookChallengeJoin(i);
            challengeRepositoryImpl$networkJoinBookChallenge$1.f14836a = str;
            challengeRepositoryImpl$networkJoinBookChallenge$1.f14837b = str2;
            challengeRepositoryImpl$networkJoinBookChallenge$1.f14838c = i;
            challengeRepositoryImpl$networkJoinBookChallenge$1.f14841f = 1;
            if (this.f16465b.m21660h(requestBookChallengeJoin, challengeRepositoryImpl$networkJoinBookChallenge$1) != obj2) {
            }
            return obj2;
        }
        if (i3 == 1) {
            i = challengeRepositoryImpl$networkJoinBookChallenge$1.f14838c;
            str2 = challengeRepositoryImpl$networkJoinBookChallenge$1.f14837b;
            str = challengeRepositoryImpl$networkJoinBookChallenge$1.f14836a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        challengeRepositoryImpl$networkJoinBookChallenge$1.f14836a = null;
        challengeRepositoryImpl$networkJoinBookChallenge$1.f14837b = null;
        challengeRepositoryImpl$networkJoinBookChallenge$1.f14838c = i;
        challengeRepositoryImpl$networkJoinBookChallenge$1.f14841f = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (m7140g(r7, r8, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7143j(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkJoinChallenge$1 challengeRepositoryImpl$networkJoinChallenge$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkJoinChallenge$1) {
            challengeRepositoryImpl$networkJoinChallenge$1 = (ChallengeRepositoryImpl$networkJoinChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$networkJoinChallenge$1.f14846e;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkJoinChallenge$1.f14846e = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkJoinChallenge$1 = new ChallengeRepositoryImpl$networkJoinChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkJoinChallenge$1 = new ChallengeRepositoryImpl$networkJoinChallenge$1(this, continuationImpl);
        }
        Object obj = challengeRepositoryImpl$networkJoinChallenge$1.f14844c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkJoinChallenge$1.f14846e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            challengeRepositoryImpl$networkJoinChallenge$1.f14842a = str;
            challengeRepositoryImpl$networkJoinChallenge$1.f14843b = str2;
            challengeRepositoryImpl$networkJoinChallenge$1.f14846e = 1;
            if (this.f16465b.m21667q(str2, challengeRepositoryImpl$networkJoinChallenge$1) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            str2 = challengeRepositoryImpl$networkJoinChallenge$1.f14843b;
            str = challengeRepositoryImpl$networkJoinChallenge$1.f14842a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        challengeRepositoryImpl$networkJoinChallenge$1.f14842a = null;
        challengeRepositoryImpl$networkJoinChallenge$1.f14843b = null;
        challengeRepositoryImpl$networkJoinChallenge$1.f14846e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (m7140g(r7, r8, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7144k(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkLeaveBookChallenge$1 challengeRepositoryImpl$networkLeaveBookChallenge$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkLeaveBookChallenge$1) {
            challengeRepositoryImpl$networkLeaveBookChallenge$1 = (ChallengeRepositoryImpl$networkLeaveBookChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$networkLeaveBookChallenge$1.f14851e;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkLeaveBookChallenge$1.f14851e = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkLeaveBookChallenge$1 = new ChallengeRepositoryImpl$networkLeaveBookChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkLeaveBookChallenge$1 = new ChallengeRepositoryImpl$networkLeaveBookChallenge$1(this, continuationImpl);
        }
        Object obj = challengeRepositoryImpl$networkLeaveBookChallenge$1.f14849c;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkLeaveBookChallenge$1.f14851e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            challengeRepositoryImpl$networkLeaveBookChallenge$1.f14847a = str;
            challengeRepositoryImpl$networkLeaveBookChallenge$1.f14848b = str2;
            challengeRepositoryImpl$networkLeaveBookChallenge$1.f14851e = 1;
            if (this.f16465b.m21663k(challengeRepositoryImpl$networkLeaveBookChallenge$1) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            str2 = challengeRepositoryImpl$networkLeaveBookChallenge$1.f14848b;
            str = challengeRepositoryImpl$networkLeaveBookChallenge$1.f14847a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        challengeRepositoryImpl$networkLeaveBookChallenge$1.f14847a = null;
        challengeRepositoryImpl$networkLeaveBookChallenge$1.f14848b = null;
        challengeRepositoryImpl$networkLeaveBookChallenge$1.f14851e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m7145l(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$networkMonthlyChallenge$1 challengeRepositoryImpl$networkMonthlyChallenge$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$networkMonthlyChallenge$1) {
            challengeRepositoryImpl$networkMonthlyChallenge$1 = (ChallengeRepositoryImpl$networkMonthlyChallenge$1) continuationImpl;
            int i = challengeRepositoryImpl$networkMonthlyChallenge$1.f14854c;
            if ((i & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkMonthlyChallenge$1.f14854c = i - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkMonthlyChallenge$1 = new ChallengeRepositoryImpl$networkMonthlyChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$networkMonthlyChallenge$1 = new ChallengeRepositoryImpl$networkMonthlyChallenge$1(this, continuationImpl);
        }
        Object objM21661i = challengeRepositoryImpl$networkMonthlyChallenge$1.f14852a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = challengeRepositoryImpl$networkMonthlyChallenge$1.f14854c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM21661i);
            challengeRepositoryImpl$networkMonthlyChallenge$1.f14854c = 1;
            objM21661i = this.f16465b.m21661i(str, false, 1, 10, "recommended", "active", "eligible", str2, challengeRepositoryImpl$networkMonthlyChallenge$1);
            if (objM21661i == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM21661i);
        }
        List list = ((Results) objM21661i).f21739d;
        if (list == null) {
            return EmptyList.f47638a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String strM8335c = ((ResultChallenge) it.next()).m8335c();
            if (strM8335c != null) {
                arrayList.add(strM8335c);
            }
        }
        return AbstractC3550rv.m20852t0(arrayList.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: m */
    public final c83 m7146m(String str, String str2) {
        str.getClass();
        yp0 yp0Var = this.f16464a;
        yp0Var.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(yp0Var.f70233K, false, new String[]{"ChallengeEntity"}, new md0(str, 5, str2)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r10 == r1) goto L21;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7147n(int i, String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$removeBookChallengeBook$1 challengeRepositoryImpl$removeBookChallengeBook$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$removeBookChallengeBook$1) {
            challengeRepositoryImpl$removeBookChallengeBook$1 = (ChallengeRepositoryImpl$removeBookChallengeBook$1) continuationImpl;
            int i2 = challengeRepositoryImpl$removeBookChallengeBook$1.f14860f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$removeBookChallengeBook$1.f14860f = i2 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$removeBookChallengeBook$1 = new ChallengeRepositoryImpl$removeBookChallengeBook$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$removeBookChallengeBook$1 = new ChallengeRepositoryImpl$removeBookChallengeBook$1(this, continuationImpl);
        }
        Object objM7140g = challengeRepositoryImpl$removeBookChallengeBook$1.f14858d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = challengeRepositoryImpl$removeBookChallengeBook$1.f14860f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7140g);
            RequestBookChallengeJoin requestBookChallengeJoin = new RequestBookChallengeJoin(i);
            challengeRepositoryImpl$removeBookChallengeBook$1.f14855a = str;
            challengeRepositoryImpl$removeBookChallengeBook$1.f14856b = str2;
            challengeRepositoryImpl$removeBookChallengeBook$1.f14857c = i;
            challengeRepositoryImpl$removeBookChallengeBook$1.f14860f = 1;
            if (this.f16465b.m21665o(requestBookChallengeJoin, challengeRepositoryImpl$removeBookChallengeBook$1) != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            i = challengeRepositoryImpl$removeBookChallengeBook$1.f14857c;
            str2 = challengeRepositoryImpl$removeBookChallengeBook$1.f14856b;
            str = challengeRepositoryImpl$removeBookChallengeBook$1.f14855a;
            AbstractC3193b.m15359b(objM7140g);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7140g);
        }
        ef0 ef0Var = (ef0) objM7140g;
        return ef0Var == null ? new ef0() : ef0Var;
        challengeRepositoryImpl$removeBookChallengeBook$1.f14855a = null;
        challengeRepositoryImpl$removeBookChallengeBook$1.f14856b = null;
        challengeRepositoryImpl$removeBookChallengeBook$1.f14857c = i;
        challengeRepositoryImpl$removeBookChallengeBook$1.f14860f = 2;
        objM7140g = m7140g(str, str2, challengeRepositoryImpl$removeBookChallengeBook$1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0081  */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:53:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: o */
    public final Object m7148o(String str, String str2, ResultChallenge resultChallenge, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$saveChallenge$1 challengeRepositoryImpl$saveChallenge$1;
        Integer num;
        String str3;
        ResultChallenge resultChallenge2;
        int iIntValue;
        gr0 gr0VarM24637a;
        String str4;
        ResultChallenge resultChallenge3;
        String str5;
        int i;
        Integer num2;
        Object objM2861d;
        String str6;
        ResultJoinedChallengeStat resultJoinedChallengeStat;
        JoinedChallengeStats joinedChallengeStatsM8362a;
        if (continuationImpl instanceof ChallengeRepositoryImpl$saveChallenge$1) {
            challengeRepositoryImpl$saveChallenge$1 = (ChallengeRepositoryImpl$saveChallenge$1) continuationImpl;
            int i2 = challengeRepositoryImpl$saveChallenge$1.f14867g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$saveChallenge$1.f14867g = i2 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$saveChallenge$1 = new ChallengeRepositoryImpl$saveChallenge$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$saveChallenge$1 = new ChallengeRepositoryImpl$saveChallenge$1(this, continuationImpl);
        }
        Object objM2861d2 = challengeRepositoryImpl$saveChallenge$1.f14865e;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = challengeRepositoryImpl$saveChallenge$1.f14867g;
        int i4 = 4;
        Object obj2 = xfa.f68157a;
        yp0 yp0Var = this.f16464a;
        switch (i3) {
            case 0:
                AbstractC3193b.m15359b(objM2861d2);
                challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                challengeRepositoryImpl$saveChallenge$1.f14867g = 1;
                objM2861d2 = AbstractC0758a.m2861d(new md0(str, i4, str2), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, true, false);
                if (objM2861d2 != obj) {
                    num = (Integer) objM2861d2;
                    if (num != null) {
                        iIntValue = num.intValue();
                        gr0VarM24637a = xpc.m24637a(resultChallenge, str, iIntValue);
                        challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                        challengeRepositoryImpl$saveChallenge$1.f14864d = iIntValue;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 3;
                        if (yp0Var.mo4095v0(gr0VarM24637a, challengeRepositoryImpl$saveChallenge$1) != obj) {
                            ResultChallenge resultChallenge4 = resultChallenge;
                            str4 = str2;
                            resultChallenge3 = resultChallenge4;
                            str5 = str;
                            i = iIntValue;
                            if (resultChallenge3.m8336d() != null) {
                                if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                                    challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                    challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                                    objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                                    if (objM2861d != obj) {
                                        objM2861d = obj2;
                                    }
                                    if (objM2861d == obj) {
                                    }
                                }
                                return obj2;
                            }
                            challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                            challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                            challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                            challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                            challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                            objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                            if (objM2861d2 != obj) {
                                str6 = str5;
                                resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                                if (resultJoinedChallengeStat != null) {
                                    joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                                } else {
                                    joinedChallengeStatsM8362a = null;
                                }
                                challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                                if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                                    return obj2;
                                }
                            }
                        }
                    } else {
                        challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 2;
                        objM2861d2 = AbstractC0758a.m2861d(new t70(str, 8), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, true, false);
                        if (objM2861d2 != obj) {
                            ResultChallenge resultChallenge5 = resultChallenge;
                            str3 = str;
                            resultChallenge2 = resultChallenge5;
                            num2 = (Integer) objM2861d2;
                            if (num2 != null) {
                                iIntValue = num2.intValue();
                                String str7 = str3;
                                resultChallenge = resultChallenge2;
                                str = str7;
                            } else {
                                String str8 = str3;
                                resultChallenge = resultChallenge2;
                                str = str8;
                                iIntValue = 0;
                            }
                            gr0VarM24637a = xpc.m24637a(resultChallenge, str, iIntValue);
                            challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                            challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                            challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                            challengeRepositoryImpl$saveChallenge$1.f14864d = iIntValue;
                            challengeRepositoryImpl$saveChallenge$1.f14867g = 3;
                            if (yp0Var.mo4095v0(gr0VarM24637a, challengeRepositoryImpl$saveChallenge$1) != obj) {
                                ResultChallenge resultChallenge6 = resultChallenge;
                                str4 = str2;
                                resultChallenge3 = resultChallenge6;
                                str5 = str;
                                i = iIntValue;
                                if (resultChallenge3.m8336d() != null) {
                                    if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                                        challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                        challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                        challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                        challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                        challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                                        objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                                        if (objM2861d != obj) {
                                            objM2861d = obj2;
                                        }
                                        if (objM2861d == obj) {
                                        }
                                    }
                                    return obj2;
                                }
                                challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                                objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                                if (objM2861d2 != obj) {
                                    str6 = str5;
                                    resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                                    if (resultJoinedChallengeStat != null) {
                                        joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                                    } else {
                                        joinedChallengeStatsM8362a = null;
                                    }
                                    challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                    challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                                    if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                                        return obj2;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj;
            case 1:
                resultChallenge = challengeRepositoryImpl$saveChallenge$1.f14863c;
                str2 = challengeRepositoryImpl$saveChallenge$1.f14862b;
                str = challengeRepositoryImpl$saveChallenge$1.f14861a;
                AbstractC3193b.m15359b(objM2861d2);
                num = (Integer) objM2861d2;
                if (num != null) {
                    iIntValue = num.intValue();
                    gr0VarM24637a = xpc.m24637a(resultChallenge, str, iIntValue);
                    challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                    challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                    challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                    challengeRepositoryImpl$saveChallenge$1.f14864d = iIntValue;
                    challengeRepositoryImpl$saveChallenge$1.f14867g = 3;
                    if (yp0Var.mo4095v0(gr0VarM24637a, challengeRepositoryImpl$saveChallenge$1) != obj) {
                        ResultChallenge resultChallenge7 = resultChallenge;
                        str4 = str2;
                        resultChallenge3 = resultChallenge7;
                        str5 = str;
                        i = iIntValue;
                        if (resultChallenge3.m8336d() != null) {
                            if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                                challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                                objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                                if (objM2861d != obj) {
                                    objM2861d = obj2;
                                }
                                if (objM2861d == obj) {
                                }
                            }
                            return obj2;
                        }
                        challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                        challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                        objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                        if (objM2861d2 != obj) {
                            str6 = str5;
                            resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                            if (resultJoinedChallengeStat != null) {
                                joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                            } else {
                                joinedChallengeStatsM8362a = null;
                            }
                            challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                            challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                            challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                            challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                            challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                            if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                                return obj2;
                            }
                        }
                    }
                } else {
                    challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                    challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                    challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                    challengeRepositoryImpl$saveChallenge$1.f14867g = 2;
                    objM2861d2 = AbstractC0758a.m2861d(new t70(str, 8), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, true, false);
                    if (objM2861d2 != obj) {
                        ResultChallenge resultChallenge8 = resultChallenge;
                        str3 = str;
                        resultChallenge2 = resultChallenge8;
                        num2 = (Integer) objM2861d2;
                        if (num2 != null) {
                            iIntValue = num2.intValue();
                            String str9 = str3;
                            resultChallenge = resultChallenge2;
                            str = str9;
                        } else {
                            String str10 = str3;
                            resultChallenge = resultChallenge2;
                            str = str10;
                            iIntValue = 0;
                        }
                        gr0VarM24637a = xpc.m24637a(resultChallenge, str, iIntValue);
                        challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                        challengeRepositoryImpl$saveChallenge$1.f14864d = iIntValue;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 3;
                        if (yp0Var.mo4095v0(gr0VarM24637a, challengeRepositoryImpl$saveChallenge$1) != obj) {
                            ResultChallenge resultChallenge9 = resultChallenge;
                            str4 = str2;
                            resultChallenge3 = resultChallenge9;
                            str5 = str;
                            i = iIntValue;
                            if (resultChallenge3.m8336d() != null) {
                                if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                                    challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                    challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                    challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                                    objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                                    if (objM2861d != obj) {
                                        objM2861d = obj2;
                                    }
                                    if (objM2861d == obj) {
                                    }
                                }
                                return obj2;
                            }
                            challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                            challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                            challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                            challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                            challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                            objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                            if (objM2861d2 != obj) {
                                str6 = str5;
                                resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                                if (resultJoinedChallengeStat != null) {
                                    joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                                } else {
                                    joinedChallengeStatsM8362a = null;
                                }
                                challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                                challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                                challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                                if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                                    return obj2;
                                }
                            }
                        }
                    }
                }
                return obj;
            case 2:
                resultChallenge2 = challengeRepositoryImpl$saveChallenge$1.f14863c;
                str2 = challengeRepositoryImpl$saveChallenge$1.f14862b;
                str3 = challengeRepositoryImpl$saveChallenge$1.f14861a;
                AbstractC3193b.m15359b(objM2861d2);
                num2 = (Integer) objM2861d2;
                if (num2 != null) {
                    iIntValue = num2.intValue();
                    String str11 = str3;
                    resultChallenge = resultChallenge2;
                    str = str11;
                } else {
                    String str12 = str3;
                    resultChallenge = resultChallenge2;
                    str = str12;
                    iIntValue = 0;
                }
                gr0VarM24637a = xpc.m24637a(resultChallenge, str, iIntValue);
                challengeRepositoryImpl$saveChallenge$1.f14861a = str;
                challengeRepositoryImpl$saveChallenge$1.f14862b = str2;
                challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge;
                challengeRepositoryImpl$saveChallenge$1.f14864d = iIntValue;
                challengeRepositoryImpl$saveChallenge$1.f14867g = 3;
                if (yp0Var.mo4095v0(gr0VarM24637a, challengeRepositoryImpl$saveChallenge$1) != obj) {
                    ResultChallenge resultChallenge10 = resultChallenge;
                    str4 = str2;
                    resultChallenge3 = resultChallenge10;
                    str5 = str;
                    i = iIntValue;
                    if (resultChallenge3.m8336d() != null) {
                        if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                            challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                            challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                            challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                            challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                            challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                            objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                            if (objM2861d != obj) {
                                objM2861d = obj2;
                            }
                            if (objM2861d == obj) {
                            }
                        }
                        return obj2;
                    }
                    challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                    challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                    challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                    challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                    challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                    objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                    if (objM2861d2 != obj) {
                        str6 = str5;
                        resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                        if (resultJoinedChallengeStat != null) {
                            joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                        } else {
                            joinedChallengeStatsM8362a = null;
                        }
                        challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                        challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                        if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                            return obj2;
                        }
                    }
                }
                return obj;
            case 3:
                i = challengeRepositoryImpl$saveChallenge$1.f14864d;
                resultChallenge3 = challengeRepositoryImpl$saveChallenge$1.f14863c;
                str4 = challengeRepositoryImpl$saveChallenge$1.f14862b;
                str5 = challengeRepositoryImpl$saveChallenge$1.f14861a;
                AbstractC3193b.m15359b(objM2861d2);
                if (resultChallenge3.m8336d() != null) {
                    if (fa4.m11650l(resultChallenge3.m8333a(), "bookJourney")) {
                        challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                        challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                        challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                        challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                        challengeRepositoryImpl$saveChallenge$1.f14867g = 6;
                        objM2861d = AbstractC0758a.m2861d(new rp0(str5, 0, str4, str4), yp0Var.f70233K, challengeRepositoryImpl$saveChallenge$1, false, true);
                        if (objM2861d != obj) {
                            objM2861d = obj2;
                        }
                        if (objM2861d == obj) {
                        }
                    }
                    return obj2;
                }
                challengeRepositoryImpl$saveChallenge$1.f14861a = str5;
                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                challengeRepositoryImpl$saveChallenge$1.f14863c = resultChallenge3;
                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                challengeRepositoryImpl$saveChallenge$1.f14867g = 4;
                objM2861d2 = this.f16465b.m21659g(str4, true, challengeRepositoryImpl$saveChallenge$1);
                if (objM2861d2 != obj) {
                    str6 = str5;
                    resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                    if (resultJoinedChallengeStat != null) {
                        joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                    } else {
                        joinedChallengeStatsM8362a = null;
                    }
                    challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                    challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                    challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                    challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                    challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                    if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                        return obj2;
                    }
                }
                return obj;
            case 4:
                i = challengeRepositoryImpl$saveChallenge$1.f14864d;
                resultChallenge3 = challengeRepositoryImpl$saveChallenge$1.f14863c;
                str6 = challengeRepositoryImpl$saveChallenge$1.f14861a;
                AbstractC3193b.m15359b(objM2861d2);
                resultJoinedChallengeStat = (ResultJoinedChallengeStat) objM2861d2;
                if (resultJoinedChallengeStat != null) {
                    joinedChallengeStatsM8362a = resultJoinedChallengeStat.m8362a();
                } else {
                    joinedChallengeStatsM8362a = null;
                }
                challengeRepositoryImpl$saveChallenge$1.f14861a = null;
                challengeRepositoryImpl$saveChallenge$1.f14862b = null;
                challengeRepositoryImpl$saveChallenge$1.f14863c = null;
                challengeRepositoryImpl$saveChallenge$1.f14864d = i;
                challengeRepositoryImpl$saveChallenge$1.f14867g = 5;
                if (m7134a(str6, resultChallenge3, joinedChallengeStatsM8362a, challengeRepositoryImpl$saveChallenge$1) == obj) {
                    return obj;
                }
                return obj2;
            case 5:
                AbstractC3193b.m15359b(objM2861d2);
                return obj2;
            case 6:
                AbstractC3193b.m15359b(objM2861d2);
                return obj2;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r11 == r1) goto L21;
     */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7149p(String str, String str2, int i, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        ChallengeRepositoryImpl$updateBookChallengeBook$1 challengeRepositoryImpl$updateBookChallengeBook$1;
        if (continuationImpl instanceof ChallengeRepositoryImpl$updateBookChallengeBook$1) {
            challengeRepositoryImpl$updateBookChallengeBook$1 = (ChallengeRepositoryImpl$updateBookChallengeBook$1) continuationImpl;
            int i2 = challengeRepositoryImpl$updateBookChallengeBook$1.f14873f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$updateBookChallengeBook$1.f14873f = i2 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$updateBookChallengeBook$1 = new ChallengeRepositoryImpl$updateBookChallengeBook$1(this, continuationImpl);
            }
        } else {
            challengeRepositoryImpl$updateBookChallengeBook$1 = new ChallengeRepositoryImpl$updateBookChallengeBook$1(this, continuationImpl);
        }
        Object objM7140g = challengeRepositoryImpl$updateBookChallengeBook$1.f14871d;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = challengeRepositoryImpl$updateBookChallengeBook$1.f14873f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7140g);
            RequestBookChallengeJoin requestBookChallengeJoin = new RequestBookChallengeJoin(i, num);
            challengeRepositoryImpl$updateBookChallengeBook$1.f14868a = str;
            challengeRepositoryImpl$updateBookChallengeBook$1.f14869b = str2;
            challengeRepositoryImpl$updateBookChallengeBook$1.f14870c = i;
            challengeRepositoryImpl$updateBookChallengeBook$1.f14873f = 1;
            if (this.f16465b.m21666p(requestBookChallengeJoin, challengeRepositoryImpl$updateBookChallengeBook$1) != obj) {
            }
            return obj;
        }
        if (i3 == 1) {
            i = challengeRepositoryImpl$updateBookChallengeBook$1.f14870c;
            str2 = challengeRepositoryImpl$updateBookChallengeBook$1.f14869b;
            str = challengeRepositoryImpl$updateBookChallengeBook$1.f14868a;
            AbstractC3193b.m15359b(objM7140g);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7140g);
        }
        ef0 ef0Var = (ef0) objM7140g;
        return ef0Var == null ? new ef0() : ef0Var;
        challengeRepositoryImpl$updateBookChallengeBook$1.f14868a = null;
        challengeRepositoryImpl$updateBookChallengeBook$1.f14869b = null;
        challengeRepositoryImpl$updateBookChallengeBook$1.f14870c = i;
        challengeRepositoryImpl$updateBookChallengeBook$1.f14873f = 2;
        objM7140g = m7140g(str, str2, challengeRepositoryImpl$updateBookChallengeBook$1);
    }
}
