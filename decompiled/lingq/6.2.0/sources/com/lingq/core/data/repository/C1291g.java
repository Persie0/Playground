package com.lingq.core.data.repository;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.database.dao.C1317e;
import com.lingq.core.domain.model.cup.CupBadge$Champion;
import com.lingq.core.domain.model.cup.CupBadge$Participation;
import com.lingq.core.domain.model.cup.CupBadge$Streak;
import com.lingq.core.domain.model.cup.CupBadge$Unknown;
import com.lingq.core.domain.model.cup.CupChampion;
import com.lingq.core.domain.model.cup.CupClaim;
import com.lingq.core.domain.model.cup.CupMyStats;
import com.lingq.core.domain.model.cup.CupPrize;
import com.lingq.core.domain.model.cup.CupTeam;
import com.lingq.core.domain.model.cup.CupTeamEntry;
import com.lingq.core.domain.model.cup.CupToday;
import com.lingq.core.network.adapters.NetworkResponse;
import com.lingq.core.network.api.result.worldcup.ResultCupBadge;
import com.lingq.core.network.api.result.worldcup.ResultCupChampion;
import com.lingq.core.network.api.result.worldcup.ResultCupClaim;
import com.lingq.core.network.api.result.worldcup.ResultCupClaimState;
import com.lingq.core.network.api.result.worldcup.ResultCupJoin;
import com.lingq.core.network.api.result.worldcup.ResultCupJoinRequest;
import com.lingq.core.network.api.result.worldcup.ResultCupJoinTeam;
import com.lingq.core.network.api.result.worldcup.ResultCupMy;
import com.lingq.core.network.api.result.worldcup.ResultCupPrize;
import com.lingq.core.network.api.result.worldcup.ResultCupPrizes;
import com.lingq.core.network.api.result.worldcup.ResultCupSummary;
import com.lingq.core.network.api.result.worldcup.ResultCupTeam;
import com.lingq.core.network.api.result.worldcup.ResultCupTeamEntry;
import com.lingq.core.network.api.result.worldcup.ResultCupToday;
import com.lingq.core.network.api.result.worldcup.ResultCupTopContributors;
import com.lingq.core.network.api.result.worldcup.ResultCupTopTeams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.C3228h;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.C3704w;
import p000.drc;
import p000.dt1;
import p000.i88;
import p000.i93;
import p000.i9b;
import p000.mqc;
import p000.mu1;
import p000.s21;
import p000.t21;
import p000.t70;
import p000.u21;
import p000.uqc;
import p000.v21;
import p000.v91;
import p000.ve4;
import p000.vqc;
import p000.we4;
import p000.xe4;
import p000.xfa;
import p000.xt1;
import p000.ye4;
import p000.zqc;

/* JADX INFO: renamed from: com.lingq.core.data.repository.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1291g implements mu1 {

    /* JADX INFO: renamed from: a */
    public final i9b f16480a;

    /* JADX INFO: renamed from: b */
    public final C1317e f16481b;

    public C1291g(i9b i9bVar, C1317e c1317e) {
        i9bVar.getClass();
        c1317e.getClass();
        this.f16480a = i9bVar;
        this.f16481b = c1317e;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7188a(ContinuationImpl continuationImpl) throws Throwable {
        CupRepositoryImpl$claimTodayPrize$1 cupRepositoryImpl$claimTodayPrize$1;
        i88 i88Var;
        if (continuationImpl instanceof CupRepositoryImpl$claimTodayPrize$1) {
            cupRepositoryImpl$claimTodayPrize$1 = (CupRepositoryImpl$claimTodayPrize$1) continuationImpl;
            int i = cupRepositoryImpl$claimTodayPrize$1.f15078d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$claimTodayPrize$1.f15078d = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$claimTodayPrize$1 = new CupRepositoryImpl$claimTodayPrize$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$claimTodayPrize$1 = new CupRepositoryImpl$claimTodayPrize$1(this, continuationImpl);
        }
        Object objM13737a = cupRepositoryImpl$claimTodayPrize$1.f15076b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$claimTodayPrize$1.f15078d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM13737a);
                i9b i9bVar = this.f16480a;
                cupRepositoryImpl$claimTodayPrize$1.f15078d = 1;
                objM13737a = i9bVar.m13737a(cupRepositoryImpl$claimTodayPrize$1);
                if (objM13737a == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                AbstractC3193b.m15359b(objM13737a);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i88Var = cupRepositoryImpl$claimTodayPrize$1.f15075a;
                AbstractC3193b.m15359b(objM13737a);
            }
            boolean z = i88Var.f43689a.f45204d == 201;
            ResultCupClaim resultCupClaim = (ResultCupClaim) i88Var.f43690b;
            return new s21(z, resultCupClaim != null ? mqc.m17008a(resultCupClaim) : null);
            i88 i88Var2 = (i88) objM13737a;
            int i3 = i88Var2.f43689a.f45204d;
            if (i3 != 200 && i3 != 201) {
                if (i3 == 400) {
                    return v21.f64719a;
                }
                if (i3 == 404) {
                    return u21.f63263a;
                }
                return t21.f61762a;
            }
            cupRepositoryImpl$claimTodayPrize$1.f15075a = i88Var2;
            cupRepositoryImpl$claimTodayPrize$1.f15078d = 2;
            if (m7190c(cupRepositoryImpl$claimTodayPrize$1) != obj) {
                i88Var = i88Var2;
                if (i88Var.f43689a.f45204d == 201) {
                }
                ResultCupClaim resultCupClaim2 = (ResultCupClaim) i88Var.f43690b;
                return new s21(z, resultCupClaim2 != null ? mqc.m17008a(resultCupClaim2) : null);
            }
            return obj;
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7189b(ContinuationImpl continuationImpl) throws Throwable {
        CupRepositoryImpl$fetchCupPrizes$1 cupRepositoryImpl$fetchCupPrizes$1;
        if (continuationImpl instanceof CupRepositoryImpl$fetchCupPrizes$1) {
            cupRepositoryImpl$fetchCupPrizes$1 = (CupRepositoryImpl$fetchCupPrizes$1) continuationImpl;
            int i = cupRepositoryImpl$fetchCupPrizes$1.f15081c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$fetchCupPrizes$1.f15081c = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$fetchCupPrizes$1 = new CupRepositoryImpl$fetchCupPrizes$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$fetchCupPrizes$1 = new CupRepositoryImpl$fetchCupPrizes$1(this, continuationImpl);
        }
        Object objM13743g = cupRepositoryImpl$fetchCupPrizes$1.f15079a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$fetchCupPrizes$1.f15081c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM13743g);
            cupRepositoryImpl$fetchCupPrizes$1.f15081c = 1;
            objM13743g = this.f16480a.m13743g(cupRepositoryImpl$fetchCupPrizes$1);
            if (objM13743g != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM13743g);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM13743g);
        NetworkResponse networkResponse = (NetworkResponse) objM13743g;
        if (networkResponse instanceof NetworkResponse.Success) {
            ArrayList arrayListM22872a = uqc.m22872a((ResultCupPrizes) ((NetworkResponse.Success) networkResponse).getData());
            cupRepositoryImpl$fetchCupPrizes$1.f15081c = 2;
            if (this.f16481b.m7471c(arrayListM22872a, cupRepositoryImpl$fetchCupPrizes$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public final Object m7190c(ContinuationImpl continuationImpl) {
        CupRepositoryImpl$fetchCupSummary$1 cupRepositoryImpl$fetchCupSummary$1;
        CupMyStats cupMyStats;
        CupToday cupToday;
        Object cupBadge$Streak;
        if (continuationImpl instanceof CupRepositoryImpl$fetchCupSummary$1) {
            cupRepositoryImpl$fetchCupSummary$1 = (CupRepositoryImpl$fetchCupSummary$1) continuationImpl;
            int i = cupRepositoryImpl$fetchCupSummary$1.f15084c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$fetchCupSummary$1.f15084c = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$fetchCupSummary$1 = new CupRepositoryImpl$fetchCupSummary$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$fetchCupSummary$1 = new CupRepositoryImpl$fetchCupSummary$1(this, continuationImpl);
        }
        Object objM13742f = cupRepositoryImpl$fetchCupSummary$1.f15082a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$fetchCupSummary$1.f15084c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM13742f);
            cupRepositoryImpl$fetchCupSummary$1.f15084c = 1;
            objM13742f = this.f16480a.m13742f(cupRepositoryImpl$fetchCupSummary$1);
            if (objM13742f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM13742f);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM13742f);
        NetworkResponse networkResponse = (NetworkResponse) objM13742f;
        if (networkResponse instanceof NetworkResponse.Success) {
            ResultCupSummary resultCupSummary = (ResultCupSummary) ((NetworkResponse.Success) networkResponse).getData();
            resultCupSummary.getClass();
            boolean z = resultCupSummary.f21800a;
            boolean z2 = resultCupSummary.f21801b;
            String str = resultCupSummary.f21802c;
            String str2 = resultCupSummary.f21803d;
            ResultCupChampion resultCupChampion = resultCupSummary.f21804e;
            CupChampion cupChampion = resultCupChampion != null ? new CupChampion(resultCupChampion.f21752a, resultCupChampion.f21753b, resultCupChampion.f21754c) : null;
            boolean z3 = resultCupSummary.f21805f;
            ResultCupTeam resultCupTeam = resultCupSummary.f21806g;
            CupTeam cupTeam = resultCupTeam != null ? new CupTeam(resultCupTeam.m8431a(), resultCupTeam.m8432b(), resultCupTeam.m8433c()) : null;
            ResultCupMy resultCupMy = resultCupSummary.f21807h;
            if (resultCupMy != null) {
                int iM8423e = resultCupMy.m8423e();
                Integer numM8422d = resultCupMy.m8422d();
                Integer numM8426h = resultCupMy.m8426h();
                Integer numM8428j = resultCupMy.m8428j();
                Integer numM8427i = resultCupMy.m8427i();
                int iM8424f = resultCupMy.m8424f();
                int iM8421c = resultCupMy.m8421c();
                int iM8425g = resultCupMy.m8425g();
                int iM8420b = resultCupMy.m8420b();
                List<ResultCupBadge> listM8419a = resultCupMy.m8419a();
                ArrayList arrayList = new ArrayList(v91.m23189q0(listM8419a, 10));
                for (ResultCupBadge resultCupBadge : listM8419a) {
                    resultCupBadge.getClass();
                    String strM8410a = resultCupBadge.m8409b().m8410a();
                    int iHashCode = strM8410a.hashCode();
                    if (iHashCode != 443967647) {
                        if (iHashCode != 547953920) {
                            if (iHashCode == 1091983690 && strM8410a.equals("cup_champion")) {
                                String strM8411b = resultCupBadge.m8409b().m8411b();
                                if (strM8411b == null) {
                                    strM8411b = "";
                                }
                                cupBadge$Streak = new CupBadge$Champion(strM8411b, resultCupBadge.m8408a());
                            } else {
                                cupBadge$Streak = new CupBadge$Unknown(resultCupBadge.m8409b().m8410a(), resultCupBadge.m8408a());
                            }
                        } else if (strM8410a.equals("cup_participation")) {
                            cupBadge$Streak = new CupBadge$Participation(resultCupBadge.m8408a());
                        } else {
                            cupBadge$Streak = new CupBadge$Unknown(resultCupBadge.m8409b().m8410a(), resultCupBadge.m8408a());
                        }
                    } else if (strM8410a.equals("cup_streak")) {
                        Integer numM8412c = resultCupBadge.m8409b().m8412c();
                        cupBadge$Streak = new CupBadge$Streak(numM8412c != null ? numM8412c.intValue() : 0, resultCupBadge.m8408a());
                    } else {
                        cupBadge$Streak = new CupBadge$Unknown(resultCupBadge.m8409b().m8410a(), resultCupBadge.m8408a());
                    }
                    arrayList.add(cupBadge$Streak);
                }
                cupMyStats = new CupMyStats(iM8423e, numM8422d, numM8426h, numM8428j, numM8427i, iM8424f, iM8421c, iM8425g, iM8420b, arrayList);
            } else {
                cupMyStats = null;
            }
            ResultCupToday resultCupToday = resultCupSummary.f21808i;
            if (resultCupToday != null) {
                String str3 = resultCupToday.f21826a;
                ResultCupPrize resultCupPrize = resultCupToday.f21827b;
                CupPrize cupPrizeM23482a = resultCupPrize != null ? vqc.m23482a(resultCupPrize) : null;
                ResultCupClaimState resultCupClaimState = resultCupToday.f21828c;
                cupToday = new CupToday(str3, cupPrizeM23482a, resultCupClaimState != null ? new CupClaim(resultCupClaimState.m8414a(), resultCupClaimState.m8415b()) : null);
            } else {
                cupToday = null;
            }
            List<ResultCupTeamEntry> list = resultCupSummary.f21809j;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(list, 10));
            for (ResultCupTeamEntry resultCupTeamEntry : list) {
                arrayList2.add(new CupTeamEntry(resultCupTeamEntry.f21814a, resultCupTeamEntry.f21816c, resultCupTeamEntry.f21817d));
            }
            xt1 xt1Var = new xt1(0, z, z2, str, str2, z3, cupChampion, cupTeam, cupMyStats, cupToday, arrayList2);
            cupRepositoryImpl$fetchCupSummary$1.f15084c = 2;
            C1317e c1317e = this.f16481b;
            Object objM2861d = AbstractC0758a.m2861d(new C3704w(11, c1317e, xt1Var), c1317e.f17014a, cupRepositoryImpl$fetchCupSummary$1, false, true);
            if (objM2861d != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM2861d = xfaVar;
            }
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7191d(String str, ContinuationImpl continuationImpl) {
        CupRepositoryImpl$fetchTopContributors$1 cupRepositoryImpl$fetchTopContributors$1;
        NetworkResponse networkResponse;
        ArrayList arrayListM25748a;
        dt1 dt1VarM25749b;
        if (continuationImpl instanceof CupRepositoryImpl$fetchTopContributors$1) {
            cupRepositoryImpl$fetchTopContributors$1 = (CupRepositoryImpl$fetchTopContributors$1) continuationImpl;
            int i = cupRepositoryImpl$fetchTopContributors$1.f15088d;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$fetchTopContributors$1.f15088d = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$fetchTopContributors$1 = new CupRepositoryImpl$fetchTopContributors$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$fetchTopContributors$1 = new CupRepositoryImpl$fetchTopContributors$1(this, continuationImpl);
        }
        Object objM13740d = cupRepositoryImpl$fetchTopContributors$1.f15086b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$fetchTopContributors$1.f15088d;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                str = cupRepositoryImpl$fetchTopContributors$1.f15085a;
                AbstractC3193b.m15359b(objM13740d);
                networkResponse = (NetworkResponse) objM13740d;
                if (networkResponse instanceof NetworkResponse.Success) {
                    if (str == null) {
                        str = "global";
                    }
                    NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
                    arrayListM25748a = zqc.m25748a((ResultCupTopContributors) success.getData(), str);
                    dt1VarM25749b = zqc.m25749b((ResultCupTopContributors) success.getData(), str);
                    cupRepositoryImpl$fetchTopContributors$1.f15085a = null;
                    cupRepositoryImpl$fetchTopContributors$1.f15088d = 3;
                    if (this.f16481b.m7470a(str, arrayListM25748a, dt1VarM25749b, cupRepositoryImpl$fetchTopContributors$1) == coroutineSingletons) {
                    }
                }
                return xfaVar;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    AbstractC3193b.m15359b(objM13740d);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = cupRepositoryImpl$fetchTopContributors$1.f15085a;
            AbstractC3193b.m15359b(objM13740d);
            networkResponse = (NetworkResponse) objM13740d;
            if (networkResponse instanceof NetworkResponse.Success) {
                if (str == null) {
                    str = "global";
                }
                NetworkResponse.Success success2 = (NetworkResponse.Success) networkResponse;
                arrayListM25748a = zqc.m25748a((ResultCupTopContributors) success2.getData(), str);
                dt1VarM25749b = zqc.m25749b((ResultCupTopContributors) success2.getData(), str);
                cupRepositoryImpl$fetchTopContributors$1.f15085a = null;
                cupRepositoryImpl$fetchTopContributors$1.f15088d = 3;
                if (this.f16481b.m7470a(str, arrayListM25748a, dt1VarM25749b, cupRepositoryImpl$fetchTopContributors$1) == coroutineSingletons) {
                }
            }
            return xfaVar;
        }
        AbstractC3193b.m15359b(objM13740d);
        i9b i9bVar = this.f16480a;
        if (str == null) {
            cupRepositoryImpl$fetchTopContributors$1.f15085a = str;
            cupRepositoryImpl$fetchTopContributors$1.f15088d = 1;
            objM13740d = i9bVar.m13738b(cupRepositoryImpl$fetchTopContributors$1);
        } else {
            cupRepositoryImpl$fetchTopContributors$1.f15085a = str;
            cupRepositoryImpl$fetchTopContributors$1.f15088d = 2;
            objM13740d = i9bVar.m13740d(str, cupRepositoryImpl$fetchTopContributors$1);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m7192e(ContinuationImpl continuationImpl) throws Throwable {
        CupRepositoryImpl$fetchTopTeams$1 cupRepositoryImpl$fetchTopTeams$1;
        if (continuationImpl instanceof CupRepositoryImpl$fetchTopTeams$1) {
            cupRepositoryImpl$fetchTopTeams$1 = (CupRepositoryImpl$fetchTopTeams$1) continuationImpl;
            int i = cupRepositoryImpl$fetchTopTeams$1.f15091c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$fetchTopTeams$1.f15091c = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$fetchTopTeams$1 = new CupRepositoryImpl$fetchTopTeams$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$fetchTopTeams$1 = new CupRepositoryImpl$fetchTopTeams$1(this, continuationImpl);
        }
        Object objM13741e = cupRepositoryImpl$fetchTopTeams$1.f15089a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$fetchTopTeams$1.f15091c;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM13741e);
            cupRepositoryImpl$fetchTopTeams$1.f15091c = 1;
            objM13741e = this.f16480a.m13741e(cupRepositoryImpl$fetchTopTeams$1);
            if (objM13741e != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM13741e);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(objM13741e);
        NetworkResponse networkResponse = (NetworkResponse) objM13741e;
        if (networkResponse instanceof NetworkResponse.Success) {
            ArrayList arrayListM10614a = drc.m10614a((ResultCupTopTeams) ((NetworkResponse.Success) networkResponse).getData());
            cupRepositoryImpl$fetchTopTeams$1.f15091c = 2;
            if (this.f16481b.m7472e(arrayListM10614a, cupRepositoryImpl$fetchTopTeams$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m7193f(String str, boolean z, ContinuationImpl continuationImpl) {
        CupRepositoryImpl$joinCup$1 cupRepositoryImpl$joinCup$1;
        ResultCupJoin resultCupJoin;
        ResultCupJoinTeam resultCupJoinTeamM8417b;
        if (continuationImpl instanceof CupRepositoryImpl$joinCup$1) {
            cupRepositoryImpl$joinCup$1 = (CupRepositoryImpl$joinCup$1) continuationImpl;
            int i = cupRepositoryImpl$joinCup$1.f15096e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cupRepositoryImpl$joinCup$1.f15096e = i - Integer.MIN_VALUE;
            } else {
                cupRepositoryImpl$joinCup$1 = new CupRepositoryImpl$joinCup$1(this, continuationImpl);
            }
        } else {
            cupRepositoryImpl$joinCup$1 = new CupRepositoryImpl$joinCup$1(this, continuationImpl);
        }
        Object objM13739c = cupRepositoryImpl$joinCup$1.f15094c;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = cupRepositoryImpl$joinCup$1.f15096e;
        String strM8418a = null;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM13739c);
                i9b i9bVar = this.f16480a;
                ResultCupJoinRequest resultCupJoinRequest = new ResultCupJoinRequest(str, z);
                cupRepositoryImpl$joinCup$1.f15093b = z;
                cupRepositoryImpl$joinCup$1.f15096e = 1;
                objM13739c = i9bVar.m13739c(resultCupJoinRequest, cupRepositoryImpl$joinCup$1);
                if (objM13739c == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                z = cupRepositoryImpl$joinCup$1.f15093b;
                AbstractC3193b.m15359b(objM13739c);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                resultCupJoin = cupRepositoryImpl$joinCup$1.f15092a;
                AbstractC3193b.m15359b(objM13739c);
            }
            if (resultCupJoin == null && resultCupJoin.m8416a()) {
                ResultCupJoinTeam resultCupJoinTeamM8417b2 = resultCupJoin.m8417b();
                return new xe4(resultCupJoinTeamM8417b2 != null ? resultCupJoinTeamM8417b2.m8418a() : null);
            }
            if (resultCupJoin != null && (resultCupJoinTeamM8417b = resultCupJoin.m8417b()) != null) {
                strM8418a = resultCupJoinTeamM8417b.m8418a();
            }
            return new ve4(strM8418a);
            i88 i88Var = (i88) objM13739c;
            int i3 = i88Var.f43689a.f45204d;
            if (i3 != 200 && i3 != 201) {
                if (i3 == 405) {
                    return ye4.f69728a;
                }
                return we4.f66721a;
            }
            ResultCupJoin resultCupJoin2 = (ResultCupJoin) i88Var.f43690b;
            cupRepositoryImpl$joinCup$1.f15092a = resultCupJoin2;
            cupRepositoryImpl$joinCup$1.f15093b = z;
            cupRepositoryImpl$joinCup$1.f15096e = 2;
            if (m7190c(cupRepositoryImpl$joinCup$1) != obj) {
                resultCupJoin = resultCupJoin2;
                if (resultCupJoin == null) {
                }
                if (resultCupJoin != null) {
                    strM8418a = resultCupJoinTeamM8417b.m8418a();
                }
                return new ve4(strM8418a);
            }
            return obj;
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: g */
    public final C3228h m7194g(String str) {
        if (str == null) {
            str = "global";
        }
        C1317e c1317e = this.f16481b;
        c1317e.getClass();
        i93 i93VarM21590A = AbstractC3584sr.m21590A(c1317e.f17014a, false, new String[]{"CupContributorEntity"}, new t70(str, 17));
        c1317e.getClass();
        return new C3228h(i93VarM21590A, AbstractC3584sr.m21590A(c1317e.f17014a, false, new String[]{"CupContributorMeEntity"}, new t70(str, 15)), new CupRepositoryImpl$observeTopContributors$1());
    }
}
