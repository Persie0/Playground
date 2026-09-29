package com.lingq.shared.repository;

import ae.C0062b;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1486n;
import ci.InterfaceC2009b;
import com.lingq.entity.ChallengeRanking;
import com.lingq.entity.ChallengeResultStats;
import com.lingq.shared.network.result.ResultChallenge;
import com.lingq.shared.network.result.ResultChallengeDetailsStats;
import com.lingq.shared.network.result.ResultChallengeJoinedStats;
import com.lingq.shared.network.result.ResultChallengeRanking;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.network.workers.ChallengeSignupWorker;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import com.lingq.shared.uimodel.challenge.ChallengeUserRanking;
import dm.C5207g;
import fi.C5537a;
import fi.C5538b;
import fi.C5539c;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.InterfaceC7116c;
import mo.C7660h;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p260m8.C7499b;
import p349qo.C8656b;
import p367rh.C8788b;
import p367rh.C8789c;
import p367rh.C8790d;
import p385sf.C9000b;
import p460wh.InterfaceC9934b;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class ChallengeRepositoryImpl implements InterfaceC2009b {

    /* JADX INFO: renamed from: a */
    public final AbstractC1486n f19525a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9934b f19526b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f19527c;

    public ChallengeRepositoryImpl(AbstractC1486n abstractC1486n, InterfaceC9934b interfaceC9934b, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(abstractC1486n, "challengeDao");
        C5207g.m11111f(interfaceC9934b, "challengeService");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f19525a = abstractC1486n;
        this.f19526b = interfaceC9934b;
        this.f19527c = abstractC1317j;
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<List<ChallengeUserRanking>> mo5974a(String str, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "challengeCode");
        C5207g.m11111f(str3, "metric");
        return C0062b.m273H0(this.f19525a.mo5119r0(str, str2, str3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: b */
    public final Object mo5975b(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetActiveChallenges$1 challengeRepositoryImpl$networkGetActiveChallenges$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetActiveChallenges$1) {
            challengeRepositoryImpl$networkGetActiveChallenges$1 = (ChallengeRepositoryImpl$networkGetActiveChallenges$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetActiveChallenges$1.f19547h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetActiveChallenges$1.f19547h = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetActiveChallenges$1 = new ChallengeRepositoryImpl$networkGetActiveChallenges$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetActiveChallenges$1 = new ChallengeRepositoryImpl$networkGetActiveChallenges$1(this, interfaceC9968c);
        }
        Object objM18428f = challengeRepositoryImpl$networkGetActiveChallenges$1.f19545f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetActiveChallenges$1.f19547h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = challengeRepositoryImpl$networkGetActiveChallenges$1.f19544e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetActiveChallenges$1.f19543d;
                C7499b.m14977z0(objM18428f);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18428f);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18428f);
        challengeRepositoryImpl$networkGetActiveChallenges$1.f19543d = this;
        challengeRepositoryImpl$networkGetActiveChallenges$1.f19544e = str;
        challengeRepositoryImpl$networkGetActiveChallenges$1.f19547h = 1;
        objM18428f = this.f19526b.m18428f(str, true, challengeRepositoryImpl$networkGetActiveChallenges$1);
        if (objM18428f == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        Collection collection = ((Results) objM18428f).f19136d;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
            int i12 = 0;
            for (Object obj : collection) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                arrayList.add(C8656b.m16903k((ResultChallenge) obj, str, false, i12));
                i12 = i13;
            }
            AbstractC1486n abstractC1486n = challengeRepositoryImpl.f19525a;
            challengeRepositoryImpl$networkGetActiveChallenges$1.f19543d = null;
            challengeRepositoryImpl$networkGetActiveChallenges$1.f19544e = null;
            challengeRepositoryImpl$networkGetActiveChallenges$1.f19547h = 2;
            objM18428f = abstractC1486n.mo599i0(arrayList, challengeRepositoryImpl$networkGetActiveChallenges$1);
            if (objM18428f == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: c */
    public final Object mo5976c(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetChallengeDetailStats$1 challengeRepositoryImpl$networkGetChallengeDetailStats$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetChallengeDetailStats$1) {
            challengeRepositoryImpl$networkGetChallengeDetailStats$1 = (ChallengeRepositoryImpl$networkGetChallengeDetailStats$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19560i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19560i = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetChallengeDetailStats$1 = new ChallengeRepositoryImpl$networkGetChallengeDetailStats$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetChallengeDetailStats$1 = new ChallengeRepositoryImpl$networkGetChallengeDetailStats$1(this, interfaceC9968c);
        }
        Object objM18431i = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19558g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19560i;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19557f;
                str = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19556e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19555d;
                C7499b.m14977z0(objM18431i);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18431i);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18431i);
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19555d = this;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19556e = str;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19557f = str2;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19560i = 1;
        objM18431i = this.f19526b.m18431i(str2, challengeRepositoryImpl$networkGetChallengeDetailStats$1);
        if (objM18431i == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        List<ResultChallengeDetailsStats> list = (List) objM18431i;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (ResultChallengeDetailsStats resultChallengeDetailsStats : list) {
            C5207g.m11111f(resultChallengeDetailsStats, "<this>");
            C5207g.m11111f(str, "language");
            C5207g.m11111f(str2, "challengeCode");
            String str3 = resultChallengeDetailsStats.f18333a;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = str;
            String str5 = str2;
            arrayList.add(new C8789c(resultChallengeDetailsStats.f18334b, str4, str5, str3, resultChallengeDetailsStats.f18335c));
        }
        AbstractC1486n abstractC1486n = challengeRepositoryImpl.f19525a;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19555d = null;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19556e = null;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19557f = null;
        challengeRepositoryImpl$networkGetChallengeDetailStats$1.f19560i = 2;
        if (abstractC1486n.mo5124w0(arrayList, challengeRepositoryImpl$networkGetChallengeDetailStats$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: d */
    public final Object mo5977d(String str, String str2, boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetChallenge$1 challengeRepositoryImpl$networkGetChallenge$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        String str3;
        boolean z11;
        ResultChallenge resultChallenge;
        Integer num;
        int iIntValue;
        AbstractC1486n abstractC1486n;
        C8788b c8788bM16903k;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetChallenge$1) {
            challengeRepositoryImpl$networkGetChallenge$1 = (ChallengeRepositoryImpl$networkGetChallenge$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetChallenge$1.f19554j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetChallenge$1.f19554j = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetChallenge$1 = new ChallengeRepositoryImpl$networkGetChallenge$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetChallenge$1 = new ChallengeRepositoryImpl$networkGetChallenge$1(this, interfaceC9968c);
        }
        Object objM18425c = challengeRepositoryImpl$networkGetChallenge$1.f19552h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetChallenge$1.f19554j;
        if (i11 != 0) {
            if (i11 == 1) {
                z10 = challengeRepositoryImpl$networkGetChallenge$1.f19551g;
                str2 = (String) challengeRepositoryImpl$networkGetChallenge$1.f19550f;
                str = challengeRepositoryImpl$networkGetChallenge$1.f19549e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallenge$1.f19548d;
                C7499b.m14977z0(objM18425c);
            } else if (i11 == 2) {
                z11 = challengeRepositoryImpl$networkGetChallenge$1.f19551g;
                resultChallenge = (ResultChallenge) challengeRepositoryImpl$networkGetChallenge$1.f19550f;
                str3 = challengeRepositoryImpl$networkGetChallenge$1.f19549e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallenge$1.f19548d;
                C7499b.m14977z0(objM18425c);
                num = (Integer) objM18425c;
                if (num != null) {
                    AbstractC1486n abstractC1486n2 = challengeRepositoryImpl.f19525a;
                    challengeRepositoryImpl$networkGetChallenge$1.f19548d = challengeRepositoryImpl;
                    challengeRepositoryImpl$networkGetChallenge$1.f19549e = str3;
                    challengeRepositoryImpl$networkGetChallenge$1.f19550f = resultChallenge;
                    challengeRepositoryImpl$networkGetChallenge$1.f19551g = z11;
                    challengeRepositoryImpl$networkGetChallenge$1.f19554j = 3;
                    objM18425c = abstractC1486n2.mo5122u0(str3, challengeRepositoryImpl$networkGetChallenge$1);
                    if (objM18425c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    num = (Integer) objM18425c;
                    if (num != null) {
                        iIntValue = 0;
                    }
                    abstractC1486n = challengeRepositoryImpl.f19525a;
                    c8788bM16903k = C8656b.m16903k(resultChallenge, str3, z11, iIntValue);
                    challengeRepositoryImpl$networkGetChallenge$1.f19548d = null;
                    challengeRepositoryImpl$networkGetChallenge$1.f19549e = null;
                    challengeRepositoryImpl$networkGetChallenge$1.f19550f = null;
                    challengeRepositoryImpl$networkGetChallenge$1.f19554j = 4;
                    if (abstractC1486n.mo598h0(c8788bM16903k, challengeRepositoryImpl$networkGetChallenge$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                iIntValue = num.intValue();
                abstractC1486n = challengeRepositoryImpl.f19525a;
                c8788bM16903k = C8656b.m16903k(resultChallenge, str3, z11, iIntValue);
                challengeRepositoryImpl$networkGetChallenge$1.f19548d = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19549e = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19550f = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19554j = 4;
                if (abstractC1486n.mo598h0(c8788bM16903k, challengeRepositoryImpl$networkGetChallenge$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 3) {
                z11 = challengeRepositoryImpl$networkGetChallenge$1.f19551g;
                resultChallenge = (ResultChallenge) challengeRepositoryImpl$networkGetChallenge$1.f19550f;
                str3 = challengeRepositoryImpl$networkGetChallenge$1.f19549e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallenge$1.f19548d;
                C7499b.m14977z0(objM18425c);
                num = (Integer) objM18425c;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                abstractC1486n = challengeRepositoryImpl.f19525a;
                c8788bM16903k = C8656b.m16903k(resultChallenge, str3, z11, iIntValue);
                challengeRepositoryImpl$networkGetChallenge$1.f19548d = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19549e = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19550f = null;
                challengeRepositoryImpl$networkGetChallenge$1.f19554j = 4;
                if (abstractC1486n.mo598h0(c8788bM16903k, challengeRepositoryImpl$networkGetChallenge$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18425c);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18425c);
        challengeRepositoryImpl$networkGetChallenge$1.f19548d = this;
        challengeRepositoryImpl$networkGetChallenge$1.f19549e = str;
        challengeRepositoryImpl$networkGetChallenge$1.f19550f = str2;
        challengeRepositoryImpl$networkGetChallenge$1.f19551g = z10;
        challengeRepositoryImpl$networkGetChallenge$1.f19554j = 1;
        objM18425c = this.f19526b.m18425c(str2, challengeRepositoryImpl$networkGetChallenge$1);
        if (objM18425c == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        ResultChallenge resultChallenge2 = (ResultChallenge) objM18425c;
        AbstractC1486n abstractC1486n3 = challengeRepositoryImpl.f19525a;
        challengeRepositoryImpl$networkGetChallenge$1.f19548d = challengeRepositoryImpl;
        challengeRepositoryImpl$networkGetChallenge$1.f19549e = str;
        challengeRepositoryImpl$networkGetChallenge$1.f19550f = resultChallenge2;
        challengeRepositoryImpl$networkGetChallenge$1.f19551g = z10;
        challengeRepositoryImpl$networkGetChallenge$1.f19554j = 2;
        Object objMo5121t0 = abstractC1486n3.mo5121t0(str, str2, challengeRepositoryImpl$networkGetChallenge$1);
        if (objMo5121t0 == coroutineSingletons) {
            return coroutineSingletons;
        }
        boolean z12 = z10;
        str3 = str;
        z11 = z12;
        objM18425c = objMo5121t0;
        resultChallenge = resultChallenge2;
        num = (Integer) objM18425c;
        if (num != null) {
            AbstractC1486n abstractC1486n4 = challengeRepositoryImpl.f19525a;
            challengeRepositoryImpl$networkGetChallenge$1.f19548d = challengeRepositoryImpl;
            challengeRepositoryImpl$networkGetChallenge$1.f19549e = str3;
            challengeRepositoryImpl$networkGetChallenge$1.f19550f = resultChallenge;
            challengeRepositoryImpl$networkGetChallenge$1.f19551g = z11;
            challengeRepositoryImpl$networkGetChallenge$1.f19554j = 3;
            objM18425c = abstractC1486n4.mo5122u0(str3, challengeRepositoryImpl$networkGetChallenge$1);
            if (objM18425c == coroutineSingletons) {
                return coroutineSingletons;
            }
            num = (Integer) objM18425c;
            if (num != null) {
                iIntValue = 0;
            }
            abstractC1486n = challengeRepositoryImpl.f19525a;
            c8788bM16903k = C8656b.m16903k(resultChallenge, str3, z11, iIntValue);
            challengeRepositoryImpl$networkGetChallenge$1.f19548d = null;
            challengeRepositoryImpl$networkGetChallenge$1.f19549e = null;
            challengeRepositoryImpl$networkGetChallenge$1.f19550f = null;
            challengeRepositoryImpl$networkGetChallenge$1.f19554j = 4;
            if (abstractC1486n.mo598h0(c8788bM16903k, challengeRepositoryImpl$networkGetChallenge$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
        iIntValue = num.intValue();
        abstractC1486n = challengeRepositoryImpl.f19525a;
        c8788bM16903k = C8656b.m16903k(resultChallenge, str3, z11, iIntValue);
        challengeRepositoryImpl$networkGetChallenge$1.f19548d = null;
        challengeRepositoryImpl$networkGetChallenge$1.f19549e = null;
        challengeRepositoryImpl$networkGetChallenge$1.f19550f = null;
        challengeRepositoryImpl$networkGetChallenge$1.f19554j = 4;
        if (abstractC1486n.mo598h0(c8788bM16903k, challengeRepositoryImpl$networkGetChallenge$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: e */
    public final Object mo5978e(String str, String str2, String str3, String str4, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$joinChallenge$1 challengeRepositoryImpl$joinChallenge$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        String str5 = str;
        String str6 = str2;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$joinChallenge$1) {
            challengeRepositoryImpl$joinChallenge$1 = (ChallengeRepositoryImpl$joinChallenge$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$joinChallenge$1.f19533i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$joinChallenge$1.f19533i = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$joinChallenge$1 = new ChallengeRepositoryImpl$joinChallenge$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$joinChallenge$1 = new ChallengeRepositoryImpl$joinChallenge$1(this, interfaceC9968c);
        }
        Object obj = challengeRepositoryImpl$joinChallenge$1.f19531g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$joinChallenge$1.f19533i;
        if (i11 != 0) {
            if (i11 == 1) {
                String str7 = challengeRepositoryImpl$joinChallenge$1.f19530f;
                String str8 = challengeRepositoryImpl$joinChallenge$1.f19529e;
                challengeRepositoryImpl = challengeRepositoryImpl$joinChallenge$1.f19528d;
                C7499b.m14977z0(obj);
                str6 = str7;
                str5 = str8;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(ChallengeSignupWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str5), new Pair("challengeCode", str6), new Pair("challengeType", str3), new Pair("metric", str4)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i12 = 0; i12 < 4; i12++) {
            Pair pair = pairArr[i12];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19527c.m4877b(aVar.m4879a());
        challengeRepositoryImpl$joinChallenge$1.f19528d = this;
        challengeRepositoryImpl$joinChallenge$1.f19529e = str5;
        challengeRepositoryImpl$joinChallenge$1.f19530f = str6;
        challengeRepositoryImpl$joinChallenge$1.f19533i = 1;
        if (this.f19525a.mo5108A0(str5, str6, challengeRepositoryImpl$joinChallenge$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        ChallengeDetail challengeDetailMo5120s0 = challengeRepositoryImpl.f19525a.mo5120s0(str5, str6);
        if (challengeDetailMo5120s0 != null) {
            int i13 = challengeDetailMo5120s0.f21640h + 1;
            challengeRepositoryImpl$joinChallenge$1.f19528d = null;
            challengeRepositoryImpl$joinChallenge$1.f19529e = null;
            challengeRepositoryImpl$joinChallenge$1.f19530f = null;
            challengeRepositoryImpl$joinChallenge$1.f19533i = 2;
            if (challengeRepositoryImpl.f19525a.mo5111D0(i13, str5, str6, challengeRepositoryImpl$joinChallenge$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.lingq.shared.repository.ChallengeRepositoryImpl, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: f */
    public final Object mo5979f(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetJoinedChallengeStats$1 challengeRepositoryImpl$networkGetJoinedChallengeStats$1;
        String str4;
        Object objM18426d;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        String str5;
        ?? r10;
        Double dM15245K2;
        Double dM15245K3;
        Double dM15245K4;
        String str6 = str2;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetJoinedChallengeStats$1) {
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1 = (ChallengeRepositoryImpl$networkGetJoinedChallengeStats$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1 = new ChallengeRepositoryImpl$networkGetJoinedChallengeStats$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1 = new ChallengeRepositoryImpl$networkGetJoinedChallengeStats$1(this, interfaceC9968c);
        }
        Object obj = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19572h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d = this;
            str4 = str;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e = str4;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f = str6;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g = str3;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = 1;
            objM18426d = this.f19526b.m18426d(str6, challengeRepositoryImpl$networkGetJoinedChallengeStats$1);
            if (objM18426d == coroutineSingletons) {
                return coroutineSingletons;
            }
            challengeRepositoryImpl = this;
            str5 = str3;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                }
                if (i11 == 3) {
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                }
                if (i11 == 4) {
                    C7499b.m14977z0(obj);
                    return C9072e.f47360a;
                }
                if (i11 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            }
            String str7 = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g;
            String str8 = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f;
            String str9 = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e;
            challengeRepositoryImpl = challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d;
            C7499b.m14977z0(obj);
            str5 = str7;
            str6 = str8;
            objM18426d = obj;
            str4 = str9;
        }
        ResultChallengeJoinedStats resultChallengeJoinedStats = (ResultChallengeJoinedStats) objM18426d;
        int iHashCode = str5.hashCode();
        if (iHashCode == -2134887928) {
            r10 = 0;
            if (str5.equals("thousand_words")) {
                AbstractC1486n abstractC1486n = challengeRepositoryImpl.f19525a;
                C8790d c8790d = new C8790d(str4, str6, str5, "Known Words", resultChallengeJoinedStats.f18351l);
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = 4;
                if (abstractC1486n.mo5126y0(c8790d, challengeRepositoryImpl$networkGetJoinedChallengeStats$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
        } else if (iHashCode == -709944647) {
            r10 = 0;
            if (str5.equals("monthly_lingqing")) {
                AbstractC1486n abstractC1486n2 = challengeRepositoryImpl.f19525a;
                C8790d c8790d2 = new C8790d(str4, str6, str5, "LingQs", resultChallengeJoinedStats.f18352m);
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = 2;
                if (abstractC1486n2.mo5126y0(c8790d2, challengeRepositoryImpl$networkGetJoinedChallengeStats$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
        } else {
            if (iHashCode == 1569740920 && str5.equals("streak_days")) {
                AbstractC1486n abstractC1486n3 = challengeRepositoryImpl.f19525a;
                C8790d c8790d3 = new C8790d(str4, str6, str5, "Streak", resultChallengeJoinedStats.f18353n);
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g = null;
                challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = 3;
                if (abstractC1486n3.mo5126y0(c8790d3, challengeRepositoryImpl$networkGetJoinedChallengeStats$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
            r10 = 0;
        }
        List<ChallengeResultStats> list = resultChallengeJoinedStats.f18355p;
        if (list != null) {
            AbstractC1486n abstractC1486n4 = challengeRepositoryImpl.f19525a;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (ChallengeResultStats challengeResultStats : list) {
                C5207g.m11111f(challengeResultStats, "<this>");
                C5207g.m11111f(str4, "language");
                C5207g.m11111f(str6, "challengeCode");
                String str10 = challengeResultStats.f16932a;
                String str11 = str10 == null ? "" : str10;
                String str12 = challengeResultStats.f16933b;
                String str13 = str12 == null ? "" : str12;
                String str14 = challengeResultStats.f16934c;
                double dDoubleValue = (str14 == null || (dM15245K4 = C7660h.m15245K2(str14)) == null) ? 0.0d : dM15245K4.doubleValue();
                String str15 = challengeResultStats.f16935d;
                double dDoubleValue2 = (str15 == null || (dM15245K3 = C7660h.m15245K2(str15)) == null) ? 0.0d : dM15245K3.doubleValue();
                String str16 = challengeResultStats.f16936e;
                arrayList.add(new C8790d(str4, str6, str11, str13, dDoubleValue, dDoubleValue2, (str16 == null || (dM15245K2 = C7660h.m15245K2(str16)) == null) ? 0.0d : dM15245K2.doubleValue()));
            }
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19568d = r10;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19569e = r10;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19570f = r10;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19571g = r10;
            challengeRepositoryImpl$networkGetJoinedChallengeStats$1.f19574j = 5;
            if (abstractC1486n4.mo5127z0(arrayList, challengeRepositoryImpl$networkGetJoinedChallengeStats$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<List<C5538b>> mo5980g(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "challengeCode");
        return C0062b.m273H0(this.f19525a.mo5115n0(str, str2));
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7116c<ChallengeDetail> mo5981h(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "challengeCode");
        return C0062b.m273H0(this.f19525a.mo5114m0(str, str2));
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: i */
    public final Object mo5982i(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18423a = this.f19526b.m18423a(str, interfaceC9968c);
        return objM18423a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18423a : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0153  */
    /* JADX WARN: Code duplicated, block: B:48:0x016d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x016e  */
    /* JADX WARN: Code duplicated, block: B:52:0x018a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x018b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x018b -> B:44:0x014d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: j */
    public final java.lang.Object mo5983j(int r24, java.lang.String r25, java.lang.String r26, p464wl.InterfaceC9968c r27) {
        /*
            Method dump skipped, instruction units count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.shared.repository.ChallengeRepositoryImpl.mo5983j(int, java.lang.String, java.lang.String, wl.c):java.lang.Object");
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: k */
    public final InterfaceC7116c<List<C5537a>> mo5984k(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19525a.mo5118q0(str));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d8 A[LOOP:0: B:36:0x00d2->B:38:0x00d8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: l */
    public final Object mo5985l(String str, String str2, String str3, String str4, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetChallengeRanking$1 challengeRepositoryImpl$networkGetChallengeRanking$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        String str5;
        String str6;
        String str7;
        Results results;
        Collection<ResultChallengeRanking> collection;
        ArrayList arrayList;
        AbstractC1486n abstractC1486n;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetChallengeRanking$1) {
            challengeRepositoryImpl$networkGetChallengeRanking$1 = (ChallengeRepositoryImpl$networkGetChallengeRanking$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetChallengeRanking$1.f19567j;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetChallengeRanking$1.f19567j = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetChallengeRanking$1 = new ChallengeRepositoryImpl$networkGetChallengeRanking$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetChallengeRanking$1 = new ChallengeRepositoryImpl$networkGetChallengeRanking$1(this, interfaceC9968c);
        }
        ChallengeRepositoryImpl$networkGetChallengeRanking$1 challengeRepositoryImpl$networkGetChallengeRanking$2 = challengeRepositoryImpl$networkGetChallengeRanking$1;
        Object objM18429g = challengeRepositoryImpl$networkGetChallengeRanking$2.f19565h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j;
        if (i11 == 0) {
            C7499b.m14977z0(objM18429g);
            if (C5207g.m11106a(str2, "streak_days") || C5207g.m11106a(str2, "monthly_lingqing")) {
                InterfaceC9934b interfaceC9934b = this.f19526b;
                Integer num = new Integer(1);
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = this;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = str;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = str3;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = str4;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 1;
                objM18429g = interfaceC9934b.m18429g(str3, str4, null, num, challengeRepositoryImpl$networkGetChallengeRanking$2);
                if (objM18429g == coroutineSingletons) {
                    return coroutineSingletons;
                }
                challengeRepositoryImpl = this;
                str5 = str;
                str6 = str3;
                str7 = str4;
                results = (Results) objM18429g;
                collection = results.f19136d;
                if (collection != null) {
                    arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                    for (ResultChallengeRanking resultChallengeRanking : collection) {
                        C5207g.m11111f(resultChallengeRanking, "<this>");
                        C5207g.m11111f(str5, "language");
                        C5207g.m11111f(str6, "challengeCode");
                        C5207g.m11111f(str7, "metric");
                        String str8 = str6;
                        String str9 = str7;
                        String str10 = str5;
                        arrayList.add(new ChallengeRanking(str8, str9, resultChallengeRanking.f18372b, str10, resultChallengeRanking.f18371a, resultChallengeRanking.f18373c, resultChallengeRanking.f18374d, resultChallengeRanking.f18375e));
                    }
                    abstractC1486n = challengeRepositoryImpl.f19525a;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 3;
                    if (abstractC1486n.mo5125x0(arrayList, challengeRepositoryImpl$networkGetChallengeRanking$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                InterfaceC9934b interfaceC9934b2 = this.f19526b;
                Integer num2 = new Integer(1);
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = this;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = str;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = str3;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = str4;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 2;
                objM18429g = interfaceC9934b2.m18429g(str3, str4, str, num2, challengeRepositoryImpl$networkGetChallengeRanking$2);
                if (objM18429g == coroutineSingletons) {
                    return coroutineSingletons;
                }
                challengeRepositoryImpl = this;
                str5 = str;
                str6 = str3;
                str7 = str4;
                results = (Results) objM18429g;
                collection = results.f19136d;
                if (collection != null) {
                    arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                    while (r2.hasNext()) {
                        C5207g.m11111f(resultChallengeRanking, "<this>");
                        C5207g.m11111f(str5, "language");
                        C5207g.m11111f(str6, "challengeCode");
                        C5207g.m11111f(str7, "metric");
                        String str11 = str6;
                        String str12 = str7;
                        String str13 = str5;
                        arrayList.add(new ChallengeRanking(str11, str12, resultChallengeRanking.f18372b, str13, resultChallengeRanking.f18371a, resultChallengeRanking.f18373c, resultChallengeRanking.f18374d, resultChallengeRanking.f18375e));
                    }
                    abstractC1486n = challengeRepositoryImpl.f19525a;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = null;
                    challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 3;
                    if (abstractC1486n.mo5125x0(arrayList, challengeRepositoryImpl$networkGetChallengeRanking$2) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else if (i11 == 1) {
            str7 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g;
            str6 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f;
            str5 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e;
            challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d;
            C7499b.m14977z0(objM18429g);
            results = (Results) objM18429g;
            collection = results.f19136d;
            if (collection != null) {
                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                while (r2.hasNext()) {
                    C5207g.m11111f(resultChallengeRanking, "<this>");
                    C5207g.m11111f(str5, "language");
                    C5207g.m11111f(str6, "challengeCode");
                    C5207g.m11111f(str7, "metric");
                    String str14 = str6;
                    String str15 = str7;
                    String str16 = str5;
                    arrayList.add(new ChallengeRanking(str14, str15, resultChallengeRanking.f18372b, str16, resultChallengeRanking.f18371a, resultChallengeRanking.f18373c, resultChallengeRanking.f18374d, resultChallengeRanking.f18375e));
                }
                abstractC1486n = challengeRepositoryImpl.f19525a;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 3;
                if (abstractC1486n.mo5125x0(arrayList, challengeRepositoryImpl$networkGetChallengeRanking$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i11 == 2) {
            str7 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g;
            str6 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f;
            str5 = challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e;
            challengeRepositoryImpl = challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d;
            C7499b.m14977z0(objM18429g);
            results = (Results) objM18429g;
            collection = results.f19136d;
            if (collection != null) {
                arrayList = new ArrayList(C9325m.m17681z(collection, 10));
                while (r2.hasNext()) {
                    C5207g.m11111f(resultChallengeRanking, "<this>");
                    C5207g.m11111f(str5, "language");
                    C5207g.m11111f(str6, "challengeCode");
                    C5207g.m11111f(str7, "metric");
                    String str17 = str6;
                    String str18 = str7;
                    String str19 = str5;
                    arrayList.add(new ChallengeRanking(str17, str18, resultChallengeRanking.f18372b, str19, resultChallengeRanking.f18371a, resultChallengeRanking.f18373c, resultChallengeRanking.f18374d, resultChallengeRanking.f18375e));
                }
                abstractC1486n = challengeRepositoryImpl.f19525a;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19561d = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19562e = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19563f = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19564g = null;
                challengeRepositoryImpl$networkGetChallengeRanking$2.f19567j = 3;
                if (abstractC1486n.mo5125x0(arrayList, challengeRepositoryImpl$networkGetChallengeRanking$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(objM18429g);
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: m */
    public final Object mo5986m(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkGetPastChallenges$1 challengeRepositoryImpl$networkGetPastChallenges$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkGetPastChallenges$1) {
            challengeRepositoryImpl$networkGetPastChallenges$1 = (ChallengeRepositoryImpl$networkGetPastChallenges$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkGetPastChallenges$1.f19579h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkGetPastChallenges$1.f19579h = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkGetPastChallenges$1 = new ChallengeRepositoryImpl$networkGetPastChallenges$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkGetPastChallenges$1 = new ChallengeRepositoryImpl$networkGetPastChallenges$1(this, interfaceC9968c);
        }
        Object objM18424b = challengeRepositoryImpl$networkGetPastChallenges$1.f19577f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkGetPastChallenges$1.f19579h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = challengeRepositoryImpl$networkGetPastChallenges$1.f19576e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkGetPastChallenges$1.f19575d;
                C7499b.m14977z0(objM18424b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18424b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18424b);
        Integer num = new Integer(20);
        Boolean bool = Boolean.TRUE;
        challengeRepositoryImpl$networkGetPastChallenges$1.f19575d = this;
        challengeRepositoryImpl$networkGetPastChallenges$1.f19576e = str;
        challengeRepositoryImpl$networkGetPastChallenges$1.f19579h = 1;
        objM18424b = this.f19526b.m18424b(str, num, bool, challengeRepositoryImpl$networkGetPastChallenges$1);
        if (objM18424b == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        Collection collection = ((Results) objM18424b).f19136d;
        if (collection != null) {
            ArrayList arrayList = new ArrayList(C9325m.m17681z(collection, 10));
            int i12 = 0;
            for (Object obj : collection) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C9000b.m17257w();
                    throw null;
                }
                arrayList.add(C8656b.m16903k((ResultChallenge) obj, str, true, i12));
                i12 = i13;
            }
            AbstractC1486n abstractC1486n = challengeRepositoryImpl.f19525a;
            challengeRepositoryImpl$networkGetPastChallenges$1.f19575d = null;
            challengeRepositoryImpl$networkGetPastChallenges$1.f19576e = null;
            challengeRepositoryImpl$networkGetPastChallenges$1.f19579h = 2;
            objM18424b = abstractC1486n.mo599i0(arrayList, challengeRepositoryImpl$networkGetPastChallenges$1);
            if (objM18424b == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00db  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: n */
    public final Object mo5987n(String str, String str2, String str3, String str4, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkSignupForChallenge$1 challengeRepositoryImpl$networkSignupForChallenge$1;
        ChallengeRepositoryImpl challengeRepositoryImpl;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkSignupForChallenge$1) {
            challengeRepositoryImpl$networkSignupForChallenge$1 = (ChallengeRepositoryImpl$networkSignupForChallenge$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkSignupForChallenge$1.f19590k;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkSignupForChallenge$1.f19590k = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkSignupForChallenge$1 = new ChallengeRepositoryImpl$networkSignupForChallenge$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkSignupForChallenge$1 = new ChallengeRepositoryImpl$networkSignupForChallenge$1(this, interfaceC9968c);
        }
        ChallengeRepositoryImpl$networkSignupForChallenge$1 challengeRepositoryImpl$networkSignupForChallenge$2 = challengeRepositoryImpl$networkSignupForChallenge$1;
        Object obj = challengeRepositoryImpl$networkSignupForChallenge$2.f19588i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkSignupForChallenge$2.f19590k;
        if (i11 != 0) {
            if (i11 == 1) {
                str4 = challengeRepositoryImpl$networkSignupForChallenge$2.f19587h;
                str3 = challengeRepositoryImpl$networkSignupForChallenge$2.f19586g;
                str2 = challengeRepositoryImpl$networkSignupForChallenge$2.f19585f;
                str = challengeRepositoryImpl$networkSignupForChallenge$2.f19584e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkSignupForChallenge$2.f19583d;
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                str6 = challengeRepositoryImpl$networkSignupForChallenge$2.f19587h;
                str8 = challengeRepositoryImpl$networkSignupForChallenge$2.f19586g;
                str7 = challengeRepositoryImpl$networkSignupForChallenge$2.f19585f;
                str5 = challengeRepositoryImpl$networkSignupForChallenge$2.f19584e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkSignupForChallenge$2.f19583d;
                C7499b.m14977z0(obj);
                challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = challengeRepositoryImpl;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = str5;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = str7;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = str8;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = str6;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 3;
                if (challengeRepositoryImpl.mo5979f(str5, str7, str8, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                str9 = str8;
                str10 = str7;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 4;
                if (challengeRepositoryImpl.mo5985l(str5, str9, str10, str6, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 3) {
                str6 = challengeRepositoryImpl$networkSignupForChallenge$2.f19587h;
                str8 = challengeRepositoryImpl$networkSignupForChallenge$2.f19586g;
                str7 = challengeRepositoryImpl$networkSignupForChallenge$2.f19585f;
                str5 = challengeRepositoryImpl$networkSignupForChallenge$2.f19584e;
                challengeRepositoryImpl = challengeRepositoryImpl$networkSignupForChallenge$2.f19583d;
                C7499b.m14977z0(obj);
                str9 = str8;
                str10 = str7;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = null;
                challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 4;
                if (challengeRepositoryImpl.mo5985l(str5, str9, str10, str6, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = this;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = str;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = str2;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = str3;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = str4;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 1;
        if (this.f19526b.m18430h(str2, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        challengeRepositoryImpl = this;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = challengeRepositoryImpl;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = str;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = str2;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = str3;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = str4;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 2;
        if (challengeRepositoryImpl.mo5977d(str, str2, false, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        String str11 = str4;
        str5 = str;
        str6 = str11;
        String str12 = str3;
        str7 = str2;
        str8 = str12;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = challengeRepositoryImpl;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = str5;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = str7;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = str8;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = str6;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 3;
        if (challengeRepositoryImpl.mo5979f(str5, str7, str8, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str9 = str8;
        str10 = str7;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19583d = null;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19584e = null;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19585f = null;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19586g = null;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19587h = null;
        challengeRepositoryImpl$networkSignupForChallenge$2.f19590k = 4;
        if (challengeRepositoryImpl.mo5985l(str5, str9, str10, str6, challengeRepositoryImpl$networkSignupForChallenge$2) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.io.Serializable, java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.io.Serializable, java.lang.Object[]] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: o */
    public final Serializable mo5988o(String str, String str2, InterfaceC9968c interfaceC9968c) throws Throwable {
        ChallengeRepositoryImpl$networkMonthlyChallenge$1 challengeRepositoryImpl$networkMonthlyChallenge$1;
        long seconds;
        if (interfaceC9968c instanceof ChallengeRepositoryImpl$networkMonthlyChallenge$1) {
            challengeRepositoryImpl$networkMonthlyChallenge$1 = (ChallengeRepositoryImpl$networkMonthlyChallenge$1) interfaceC9968c;
            int i10 = challengeRepositoryImpl$networkMonthlyChallenge$1.f19582f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                challengeRepositoryImpl$networkMonthlyChallenge$1.f19582f = i10 - Integer.MIN_VALUE;
            } else {
                challengeRepositoryImpl$networkMonthlyChallenge$1 = new ChallengeRepositoryImpl$networkMonthlyChallenge$1(this, interfaceC9968c);
            }
        } else {
            challengeRepositoryImpl$networkMonthlyChallenge$1 = new ChallengeRepositoryImpl$networkMonthlyChallenge$1(this, interfaceC9968c);
        }
        ChallengeRepositoryImpl$networkMonthlyChallenge$1 challengeRepositoryImpl$networkMonthlyChallenge$2 = challengeRepositoryImpl$networkMonthlyChallenge$1;
        Object objM18427e = challengeRepositoryImpl$networkMonthlyChallenge$2.f19580d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = challengeRepositoryImpl$networkMonthlyChallenge$2.f19582f;
        if (i11 == 0) {
            C7499b.m14977z0(objM18427e);
            InterfaceC9934b interfaceC9934b = this.f19526b;
            C5207g.m11111f(str2, "date");
            try {
                Date date = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(str2);
                seconds = TimeUnit.MILLISECONDS.toSeconds(date != null ? date.getTime() : 0L);
            } catch (Exception unused) {
                seconds = 0;
            }
            challengeRepositoryImpl$networkMonthlyChallenge$2.f19582f = 1;
            objM18427e = interfaceC9934b.m18427e(str, 1, 3, true, "oldest", seconds, challengeRepositoryImpl$networkMonthlyChallenge$2);
            if (objM18427e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(objM18427e);
        }
        Collection collection = ((Results) objM18427e).f19136d;
        if (collection == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str3 = ((ResultChallenge) it.next()).f18326p;
            if (str3 != null) {
                arrayList.add(str3);
            }
        }
        return arrayList.toArray(new String[0]);
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<List<C5539c>> mo5989p(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "challengeCode");
        return C0062b.m273H0(this.f19525a.mo5116o0(str, str2));
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: q */
    public final InterfaceC7116c<List<ChallengeDetail>> mo5990q(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19525a.mo5117p0(str, 4));
    }

    @Override // ci.InterfaceC2009b
    /* JADX INFO: renamed from: r */
    public final InterfaceC7116c<List<C5537a>> mo5991r(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19525a.mo5113l0(str));
    }
}
