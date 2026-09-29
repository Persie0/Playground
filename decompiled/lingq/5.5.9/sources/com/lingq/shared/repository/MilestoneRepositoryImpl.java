package com.lingq.shared.repository;

import android.support.v4.media.AbstractC0140a;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import bi.AbstractC1469k3;
import ci.InterfaceC2016i;
import com.lingq.entity.Milestone;
import com.lingq.entity.MilestoneMet;
import com.lingq.entity.MilestoneStats;
import com.lingq.shared.network.result.ResultMilestone;
import com.lingq.shared.network.result.ResultMilestoneStats;
import com.lingq.shared.network.result.ResultMilestones;
import com.lingq.shared.network.workers.MilestoneMetWorker;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ni.C7793a;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p096ei.C5409b;
import p260m8.C7499b;
import p460wh.InterfaceC9940h;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class MilestoneRepositoryImpl implements InterfaceC2016i {

    /* JADX INFO: renamed from: a */
    public final AbstractC1469k3 f20148a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9940h f20149b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f20150c;

    public MilestoneRepositoryImpl(AbstractC1469k3 abstractC1469k3, InterfaceC9940h interfaceC9940h, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(abstractC1469k3, "milestoneDao");
        C5207g.m11111f(interfaceC9940h, "milestoneService");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f20148a = abstractC1469k3;
        this.f20149b = interfaceC9940h;
        this.f20150c = abstractC1317j;
    }

    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: a */
    public final Object mo6080a(String str, InterfaceC9968c<? super C5409b> interfaceC9968c) {
        return this.f20148a.mo5085m0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: b */
    public final Object mo6081b(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        MilestoneRepositoryImpl$meetMilestone$1 milestoneRepositoryImpl$meetMilestone$1;
        String str4;
        MilestoneRepositoryImpl milestoneRepositoryImpl;
        String str5;
        if (interfaceC9968c instanceof MilestoneRepositoryImpl$meetMilestone$1) {
            milestoneRepositoryImpl$meetMilestone$1 = (MilestoneRepositoryImpl$meetMilestone$1) interfaceC9968c;
            int i10 = milestoneRepositoryImpl$meetMilestone$1.f20156i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                milestoneRepositoryImpl$meetMilestone$1.f20156i = i10 - Integer.MIN_VALUE;
            } else {
                milestoneRepositoryImpl$meetMilestone$1 = new MilestoneRepositoryImpl$meetMilestone$1(this, interfaceC9968c);
            }
        } else {
            milestoneRepositoryImpl$meetMilestone$1 = new MilestoneRepositoryImpl$meetMilestone$1(this, interfaceC9968c);
        }
        Object obj = milestoneRepositoryImpl$meetMilestone$1.f20154g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = milestoneRepositoryImpl$meetMilestone$1.f20156i;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            MilestoneMet milestoneMet = new MilestoneMet(C7793a.m15498b(str, str2), str3);
            milestoneRepositoryImpl$meetMilestone$1.f20151d = this;
            str4 = str;
            milestoneRepositoryImpl$meetMilestone$1.f20152e = str4;
            milestoneRepositoryImpl$meetMilestone$1.f20153f = str2;
            milestoneRepositoryImpl$meetMilestone$1.f20156i = 1;
            if (this.f20148a.mo5086n0(milestoneMet, milestoneRepositoryImpl$meetMilestone$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            milestoneRepositoryImpl = this;
            str5 = str2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str5 = milestoneRepositoryImpl$meetMilestone$1.f20153f;
            str4 = milestoneRepositoryImpl$meetMilestone$1.f20152e;
            milestoneRepositoryImpl = milestoneRepositoryImpl$meetMilestone$1.f20151d;
            C7499b.m14977z0(obj);
        }
        milestoneRepositoryImpl.getClass();
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(MilestoneMetWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair pair = new Pair("language", str4);
        Pair[] pairArr = {pair, new Pair("slug", str5)};
        C1244b.a aVar2 = new C1244b.a();
        for (int i12 = 0; i12 < 2; i12++) {
            Pair pair2 = pairArr[i12];
            aVar2.m4709b(pair2.f38013b, (String) pair2.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        milestoneRepositoryImpl.f20150c.m4877b(aVar.m4879a());
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: c */
    public final Object mo6082c(int i10, String str, String str2, InterfaceC9968c interfaceC9968c) {
        return this.f20148a.mo5083k0(i10, str, str2, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:36:0x010a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0114  */
    /* JADX WARN: Code duplicated, block: B:45:0x011e  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x012e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0139  */
    /* JADX WARN: Code duplicated, block: B:58:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:0: B:43:0x0118->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: d */
    public final Object mo6083d(String str, InterfaceC9968c<? super String> interfaceC9968c) throws Throwable {
        MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1 milestoneRepositoryImpl$networkGetMilestonesForLanguage$1;
        MilestoneRepositoryImpl milestoneRepositoryImpl;
        ResultMilestones resultMilestones;
        Object obj;
        MilestoneRepositoryImpl milestoneRepositoryImpl2;
        String str2;
        ResultMilestones resultMilestones2;
        ResultMilestoneStats resultMilestoneStats;
        AbstractC1469k3 abstractC1469k3;
        MilestoneStats milestoneStats;
        List<ResultMilestone> list;
        Iterator<T> it;
        Object obj2;
        ResultMilestone resultMilestone;
        String strM9451a;
        Object next;
        boolean z10;
        String str3 = str;
        if (interfaceC9968c instanceof MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1) {
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = (MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1) interfaceC9968c;
            int i10 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i = i10 - Integer.MIN_VALUE;
            } else {
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = new MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(this, interfaceC9968c);
            }
        } else {
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1 = new MilestoneRepositoryImpl$networkGetMilestonesForLanguage$1(this, interfaceC9968c);
        }
        Object objM18487a = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20160g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i;
        if (i11 != 0) {
            if (i11 == 1) {
                str3 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e;
                milestoneRepositoryImpl = (MilestoneRepositoryImpl) milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d;
                C7499b.m14977z0(objM18487a);
            } else {
                if (i11 == 2) {
                    resultMilestones2 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20159f;
                    str2 = milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e;
                    milestoneRepositoryImpl2 = (MilestoneRepositoryImpl) milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d;
                    C7499b.m14977z0(objM18487a);
                    resultMilestoneStats = resultMilestones2.f18782a;
                    if (resultMilestoneStats != null) {
                        abstractC1469k3 = milestoneRepositoryImpl2.f20148a;
                        C5207g.m11111f(str2, "language");
                        milestoneStats = new MilestoneStats(str2, resultMilestoneStats.f18776a, resultMilestoneStats.f18777b, resultMilestoneStats.f18778c);
                        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d = resultMilestones2;
                        obj = null;
                        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e = null;
                        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20159f = null;
                        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i = 3;
                        if (abstractC1469k3.mo5087o0(milestoneStats, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    resultMilestones = resultMilestones2;
                    list = resultMilestones.f18783b;
                    if (list != null) {
                        it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = obj;
                                break;
                            }
                            next = it.next();
                            if (((ResultMilestone) next).m9451a() != null) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                obj2 = next;
                                break;
                            }
                        }
                        resultMilestone = (ResultMilestone) obj2;
                        if (resultMilestone == null && (strM9451a = resultMilestone.m9451a()) != null) {
                            return strM9451a;
                        }
                    }
                    return "";
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                resultMilestones2 = (ResultMilestones) milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d;
                C7499b.m14977z0(objM18487a);
            }
            obj = null;
            resultMilestones = resultMilestones2;
            list = resultMilestones.f18783b;
            if (list != null) {
                it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = obj;
                        break;
                    }
                    next = it.next();
                    if (((ResultMilestone) next).m9451a() != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        obj2 = next;
                        break;
                    }
                }
                resultMilestone = (ResultMilestone) obj2;
                if (resultMilestone == null) {
                }
            }
            return "";
        }
        C7499b.m14977z0(objM18487a);
        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d = this;
        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e = str3;
        milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i = 1;
        objM18487a = this.f20149b.m18487a(str3, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1);
        if (objM18487a == coroutineSingletons) {
            return coroutineSingletons;
        }
        milestoneRepositoryImpl = this;
        resultMilestones = (ResultMilestones) objM18487a;
        List<ResultMilestone> list2 = resultMilestones.f18783b;
        if (list2 != null) {
            AbstractC1469k3 abstractC1469k4 = milestoneRepositoryImpl.f20148a;
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list2, 10));
            for (ResultMilestone resultMilestone2 : list2) {
                C5207g.m11111f(resultMilestone2, "<this>");
                C5207g.m11111f(str3, "language");
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new Milestone(resultMilestone2.f18769c, C7793a.m15498b(str3, resultMilestone2.f18767a), str3, resultMilestone2.f18767a, resultMilestone2.f18768b, resultMilestone2.f18770d, resultMilestone2.m9451a()));
                abstractC1469k4 = abstractC1469k4;
                arrayList = arrayList2;
            }
            AbstractC0140a abstractC0140a = abstractC1469k4;
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d = milestoneRepositoryImpl;
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e = str3;
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20159f = resultMilestones;
            milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i = 2;
            if (abstractC0140a.mo599i0(arrayList, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            milestoneRepositoryImpl2 = milestoneRepositoryImpl;
            str2 = str3;
            resultMilestones2 = resultMilestones;
            resultMilestoneStats = resultMilestones2.f18782a;
            if (resultMilestoneStats != null) {
                abstractC1469k3 = milestoneRepositoryImpl2.f20148a;
                C5207g.m11111f(str2, "language");
                milestoneStats = new MilestoneStats(str2, resultMilestoneStats.f18776a, resultMilestoneStats.f18777b, resultMilestoneStats.f18778c);
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20157d = resultMilestones2;
                obj = null;
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20158e = null;
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20159f = null;
                milestoneRepositoryImpl$networkGetMilestonesForLanguage$1.f20162i = 3;
                if (abstractC1469k3.mo5087o0(milestoneStats, milestoneRepositoryImpl$networkGetMilestonesForLanguage$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                obj = null;
            }
            resultMilestones = resultMilestones2;
        } else {
            obj = null;
        }
        list = resultMilestones.f18783b;
        if (list != null) {
            it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = obj;
                    break;
                }
                next = it.next();
                if (((ResultMilestone) next).m9451a() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    obj2 = next;
                    break;
                }
            }
            resultMilestone = (ResultMilestone) obj2;
            if (resultMilestone == null) {
            }
        }
        return "";
    }

    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: e */
    public final Object mo6084e(int i10, String str, InterfaceC9968c interfaceC9968c) {
        return this.f20148a.mo5084l0(i10, str, interfaceC9968c);
    }

    @Override // ci.InterfaceC2016i
    /* JADX INFO: renamed from: f */
    public final Object mo6085f(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18488b = this.f20149b.m18488b(str, str2, interfaceC9968c);
        return objM18488b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18488b : C9072e.f47360a;
    }
}
