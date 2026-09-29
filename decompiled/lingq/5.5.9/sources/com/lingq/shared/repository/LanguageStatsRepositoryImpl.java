package com.lingq.shared.repository;

import ae.C0062b;
import androidx.work.BackoffPolicy;
import androidx.work.C1244b;
import androidx.work.NetworkType;
import ci.InterfaceC2013f;
import com.lingq.entity.ActivityLevel;
import com.lingq.entity.LanguageProgress;
import com.lingq.entity.LanguageProgressChartEntry;
import com.lingq.entity.Streak;
import com.lingq.entity.StudyStats;
import com.lingq.entity.StudyStatsScores;
import com.lingq.shared.network.requests.RequestAppUsageStat;
import com.lingq.shared.network.requests.RequestLanguageProgress;
import com.lingq.shared.network.result.ResultLanguageProgress;
import com.lingq.shared.network.result.ResultLanguageProgressChartEntry;
import com.lingq.shared.network.result.ResultStreak;
import com.lingq.shared.network.result.ResultStudyStats;
import com.lingq.shared.network.workers.AppUsageUpdateWorker;
import com.lingq.shared.network.workers.LanguageProgressUpdateWorker;
import com.lingq.shared.persistent.LingQDatabase;
import com.lingq.shared.persistent.dao.LanguageStatsDao;
import com.lingq.shared.uimodel.language.AppUsageType;
import com.lingq.shared.uimodel.language.LanguageProgressUpdate;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import dm.C5207g;
import gi.C5804b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import mo.C7661i;
import p026b5.AbstractC1317j;
import p026b5.C1309b;
import p026b5.C1315h;
import p260m8.C7499b;
import p385sf.C9000b;
import p460wh.InterfaceC9937e;
import p464wl.InterfaceC9968c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes.dex */
public final class LanguageStatsRepositoryImpl implements InterfaceC2013f {

    /* JADX INFO: renamed from: a */
    public final LanguageStatsDao f19793a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC9937e f19794b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1317j f19795c;

    public LanguageStatsRepositoryImpl(LingQDatabase lingQDatabase, LanguageStatsDao languageStatsDao, InterfaceC9937e interfaceC9937e, AbstractC1317j abstractC1317j) {
        C5207g.m11111f(lingQDatabase, "db");
        C5207g.m11111f(languageStatsDao, "languageStatsDao");
        C5207g.m11111f(interfaceC9937e, "languageService");
        C5207g.m11111f(abstractC1317j, "workManager");
        this.f19793a = languageStatsDao;
        this.f19794b = interfaceC9937e;
        this.f19795c = abstractC1317j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m9477a(String str, String str2, double d10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(AppUsageUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("stat", str2), new Pair("value", Double.valueOf(d10))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i10 = 0; i10 < 3; i10++) {
            Pair pair = pairArr[i10];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19795c.m4877b(aVar.m4879a());
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: b */
    public final Object mo6041b(String str, InterfaceC9968c<? super UserLanguageStudyStats> interfaceC9968c) {
        return this.f19793a.mo5029p0(str, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0107 A[LOOP:0: B:33:0x0101->B:35:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: c */
    public final Object mo6042c(String str, String str2, String str3, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        C3317x1c753bf c3317x1c753bf;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl;
        String str4;
        List list;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl2;
        String str5;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        if (interfaceC9968c instanceof C3317x1c753bf) {
            c3317x1c753bf = (C3317x1c753bf) interfaceC9968c;
            int i10 = c3317x1c753bf.f19810l;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c3317x1c753bf.f19810l = i10 - Integer.MIN_VALUE;
            } else {
                c3317x1c753bf = new C3317x1c753bf(this, interfaceC9968c);
            }
        } else {
            c3317x1c753bf = new C3317x1c753bf(this, interfaceC9968c);
        }
        Object objM18452k = c3317x1c753bf.f19808j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = c3317x1c753bf.f19810l;
        if (i11 != 0) {
            if (i11 == 1) {
                String str9 = c3317x1c753bf.f19805g;
                str7 = c3317x1c753bf.f19804f;
                String str10 = c3317x1c753bf.f19803e;
                languageStatsRepositoryImpl = c3317x1c753bf.f19802d;
                C7499b.m14977z0(objM18452k);
                str8 = str9;
                str6 = str10;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = c3317x1c753bf.f19807i;
                list = c3317x1c753bf.f19806h;
                str8 = c3317x1c753bf.f19805g;
                str4 = c3317x1c753bf.f19804f;
                str5 = c3317x1c753bf.f19803e;
                languageStatsRepositoryImpl2 = c3317x1c753bf.f19802d;
                C7499b.m14977z0(objM18452k);
            }
            LanguageStatsDao languageStatsDao = languageStatsRepositoryImpl2.f19793a;
            arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
            it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((LanguageProgressChartEntry) it.next()).f17053d);
            }
            languageStatsDao.mo5024k0(str5, str4, str8, arrayList2);
            return Boolean.valueOf(list.isEmpty());
        }
        C7499b.m14977z0(objM18452k);
        c3317x1c753bf.f19802d = this;
        c3317x1c753bf.f19803e = str6;
        c3317x1c753bf.f19804f = str7;
        c3317x1c753bf.f19805g = str8;
        c3317x1c753bf.f19810l = 1;
        objM18452k = this.f19794b.m18452k(str6, str8, str7, c3317x1c753bf);
        if (objM18452k == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageStatsRepositoryImpl = this;
        List list2 = (List) objM18452k;
        ArrayList arrayList3 = new ArrayList(C9325m.m17681z(list2, 10));
        int i12 = 0;
        for (Object obj : list2) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C9000b.m17257w();
                throw null;
            }
            ResultLanguageProgressChartEntry resultLanguageProgressChartEntry = (ResultLanguageProgressChartEntry) obj;
            C5207g.m11111f(resultLanguageProgressChartEntry, "<this>");
            C5207g.m11111f(str7, "metric");
            C5207g.m11111f(str8, "period");
            C5207g.m11111f(str6, "languageCode");
            arrayList3.add(new LanguageProgressChartEntry(str7, str6, str8, resultLanguageProgressChartEntry.f18483a, resultLanguageProgressChartEntry.f18484b, resultLanguageProgressChartEntry.f18485c, i12));
            i12 = i13;
        }
        LanguageStatsDao languageStatsDao2 = languageStatsRepositoryImpl.f19793a;
        c3317x1c753bf.f19802d = languageStatsRepositoryImpl;
        c3317x1c753bf.f19803e = str6;
        c3317x1c753bf.f19804f = str7;
        c3317x1c753bf.f19805g = str8;
        c3317x1c753bf.f19806h = list2;
        c3317x1c753bf.f19807i = arrayList3;
        c3317x1c753bf.f19810l = 2;
        if (languageStatsDao2.mo5030q0(arrayList3, c3317x1c753bf) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str4 = str7;
        list = list2;
        languageStatsRepositoryImpl2 = languageStatsRepositoryImpl;
        str5 = str6;
        arrayList = arrayList3;
        LanguageStatsDao languageStatsDao3 = languageStatsRepositoryImpl2.f19793a;
        arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
        it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((LanguageProgressChartEntry) it.next()).f17053d);
        }
        languageStatsDao3.mo5024k0(str5, str4, str8, arrayList2);
        return Boolean.valueOf(list.isEmpty());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: d */
    public final Object mo6043d(String str, String str2, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageStatsRepositoryImpl$networkLanguageProgress$1 languageStatsRepositoryImpl$networkLanguageProgress$1;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl;
        String str3;
        String str4;
        if (interfaceC9968c instanceof LanguageStatsRepositoryImpl$networkLanguageProgress$1) {
            languageStatsRepositoryImpl$networkLanguageProgress$1 = (LanguageStatsRepositoryImpl$networkLanguageProgress$1) interfaceC9968c;
            int i10 = languageStatsRepositoryImpl$networkLanguageProgress$1.f19801i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$networkLanguageProgress$1.f19801i = i10 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$networkLanguageProgress$1 = new LanguageStatsRepositoryImpl$networkLanguageProgress$1(this, interfaceC9968c);
            }
        } else {
            languageStatsRepositoryImpl$networkLanguageProgress$1 = new LanguageStatsRepositoryImpl$networkLanguageProgress$1(this, interfaceC9968c);
        }
        Object objM18458q = languageStatsRepositoryImpl$networkLanguageProgress$1.f19799g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageStatsRepositoryImpl$networkLanguageProgress$1.f19801i;
        if (i11 != 0) {
            if (i11 == 1) {
                String str5 = languageStatsRepositoryImpl$networkLanguageProgress$1.f19798f;
                String str6 = languageStatsRepositoryImpl$networkLanguageProgress$1.f19797e;
                languageStatsRepositoryImpl = languageStatsRepositoryImpl$networkLanguageProgress$1.f19796d;
                C7499b.m14977z0(objM18458q);
                str4 = str5;
                str3 = str6;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18458q);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18458q);
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19796d = this;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19797e = str;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19798f = str2;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19801i = 1;
        objM18458q = this.f19794b.m18458q(str, str2, languageStatsRepositoryImpl$networkLanguageProgress$1);
        if (objM18458q == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageStatsRepositoryImpl = this;
        str3 = str;
        str4 = str2;
        ResultLanguageProgress resultLanguageProgress = (ResultLanguageProgress) objM18458q;
        C5207g.m11111f(resultLanguageProgress, "<this>");
        C5207g.m11111f(str4, "interval");
        C5207g.m11111f(str3, "languageCode");
        LanguageProgress languageProgress = new LanguageProgress(str4, str3, resultLanguageProgress.f18465a, resultLanguageProgress.f18466b, resultLanguageProgress.f18467c, resultLanguageProgress.f18468d, resultLanguageProgress.f18469e, resultLanguageProgress.f18470f, resultLanguageProgress.f18471g, resultLanguageProgress.f18472h, resultLanguageProgress.f18473i, resultLanguageProgress.f18474j, resultLanguageProgress.f18475k, resultLanguageProgress.f18476l, resultLanguageProgress.f18477m, resultLanguageProgress.f18478n, resultLanguageProgress.f18479o, resultLanguageProgress.f18480p, resultLanguageProgress.f18481q, resultLanguageProgress.f18482r);
        LanguageStatsDao languageStatsDao = languageStatsRepositoryImpl.f19793a;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19796d = null;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19797e = null;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19798f = null;
        languageStatsRepositoryImpl$networkLanguageProgress$1.f19801i = 2;
        if (languageStatsDao.mo598h0(languageProgress, languageStatsRepositoryImpl$networkLanguageProgress$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: e */
    public final InterfaceC7116c<UserLanguageProgress> mo6044e(String str, String str2) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "interval");
        return C0062b.m273H0(this.f19793a.mo5025l0(str, str2));
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: f */
    public final Object mo6045f(String str, String str2, String str3, double d10, double d11, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LanguageProgressUpdate languageProgressUpdate = LanguageProgressUpdate.HoursListening;
        if (C5207g.m11106a(str3, languageProgressUpdate.getKey())) {
            m9478p(str, languageProgressUpdate.getKey(), d10);
            Object objMo5034v0 = this.f19793a.mo5034v0(str, str2, d11 + d10, interfaceC9968c);
            return objMo5034v0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5034v0 : C9072e.f47360a;
        }
        LanguageProgressUpdate languageProgressUpdate2 = LanguageProgressUpdate.WordsReading;
        boolean zM11106a = C5207g.m11106a(str3, languageProgressUpdate2.getKey());
        LanguageStatsDao languageStatsDao = this.f19793a;
        if (zM11106a) {
            m9478p(str, languageProgressUpdate2.getKey(), d10);
            Object objMo5035w0 = languageStatsDao.mo5035w0(((int) d11) + ((int) d10), str, str2, interfaceC9968c);
            return objMo5035w0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5035w0 : C9072e.f47360a;
        }
        LanguageProgressUpdate languageProgressUpdate3 = LanguageProgressUpdate.WordsWriting;
        if (C5207g.m11106a(str3, languageProgressUpdate3.getKey())) {
            m9478p(str, languageProgressUpdate3.getKey(), d10);
            Object objMo5023A0 = languageStatsDao.mo5023A0(((int) d11) + ((int) d10), str, str2, interfaceC9968c);
            return objMo5023A0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5023A0 : C9072e.f47360a;
        }
        LanguageProgressUpdate languageProgressUpdate4 = LanguageProgressUpdate.HoursSpeaking;
        if (!C5207g.m11106a(str3, languageProgressUpdate4.getKey())) {
            return C9072e.f47360a;
        }
        m9478p(str, languageProgressUpdate4.getKey(), d10);
        Object objMo5036x0 = this.f19793a.mo5036x0(str, str2, d11 + d10, interfaceC9968c);
        return objMo5036x0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo5036x0 : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<List<UserLanguageProgressChartEntry>> mo6046g(String str, String str2, String str3) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "period");
        C5207g.m11111f(str3, "metric");
        return C0062b.m273H0(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(this.f19793a.mo5026m0(str, str3, str2)));
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: h */
    public final void mo6047h(String str, String str2, double d10) {
        C5207g.m11111f(str, "language");
        C5207g.m11111f(str2, "stat");
        if (C5207g.m11106a(str2, AppUsageType.Reading.getKey())) {
            m9477a(str, str2, d10);
        } else if (C5207g.m11106a(str2, AppUsageType.Listening.getKey())) {
            m9477a(str, str2, d10);
        } else {
            if (C5207g.m11106a(str2, AppUsageType.Review.getKey())) {
                m9477a(str, str2, d10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: i */
    public final Object mo6048i(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageStatsRepositoryImpl$networkLanguageStreak$1 languageStatsRepositoryImpl$networkLanguageStreak$1;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl;
        if (interfaceC9968c instanceof LanguageStatsRepositoryImpl$networkLanguageStreak$1) {
            languageStatsRepositoryImpl$networkLanguageStreak$1 = (LanguageStatsRepositoryImpl$networkLanguageStreak$1) interfaceC9968c;
            int i10 = languageStatsRepositoryImpl$networkLanguageStreak$1.f19815h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$networkLanguageStreak$1.f19815h = i10 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$networkLanguageStreak$1 = new LanguageStatsRepositoryImpl$networkLanguageStreak$1(this, interfaceC9968c);
            }
        } else {
            languageStatsRepositoryImpl$networkLanguageStreak$1 = new LanguageStatsRepositoryImpl$networkLanguageStreak$1(this, interfaceC9968c);
        }
        Object objM18453l = languageStatsRepositoryImpl$networkLanguageStreak$1.f19813f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageStatsRepositoryImpl$networkLanguageStreak$1.f19815h;
        if (i11 != 0) {
            if (i11 == 1) {
                str = languageStatsRepositoryImpl$networkLanguageStreak$1.f19812e;
                languageStatsRepositoryImpl = languageStatsRepositoryImpl$networkLanguageStreak$1.f19811d;
                C7499b.m14977z0(objM18453l);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18453l);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18453l);
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19811d = this;
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19812e = str;
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19815h = 1;
        objM18453l = this.f19794b.m18453l(str, languageStatsRepositoryImpl$networkLanguageStreak$1);
        if (objM18453l == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageStatsRepositoryImpl = this;
        String str2 = str;
        ResultStreak resultStreak = (ResultStreak) objM18453l;
        LanguageStatsDao languageStatsDao = languageStatsRepositoryImpl.f19793a;
        C5207g.m11111f(resultStreak, "<this>");
        C5207g.m11111f(str2, "language");
        Streak streak = new Streak(str2, Integer.valueOf(resultStreak.f18961a), Double.valueOf(resultStreak.f18962b), Integer.valueOf(resultStreak.f18963c), Boolean.valueOf(resultStreak.f18964d));
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19811d = null;
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19812e = null;
        languageStatsRepositoryImpl$networkLanguageStreak$1.f19815h = 2;
        if (languageStatsDao.mo5032s0(streak, languageStatsRepositoryImpl$networkLanguageStreak$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: j */
    public final Object mo6049j(String str, RequestLanguageProgress requestLanguageProgress, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18456o = this.f19794b.m18456o(str, requestLanguageProgress, interfaceC9968c);
        return objM18456o == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18456o : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: k */
    public final InterfaceC7116c<C5804b> mo6050k(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19793a.mo5027n0(str));
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: l */
    public final InterfaceC7116c<UserLanguageStudyStats> mo6051l(String str) {
        C5207g.m11111f(str, "language");
        return C0062b.m273H0(this.f19793a.mo5028o0(str));
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: m */
    public final Object mo6052m(int i10, String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        LanguageStatsRepositoryImpl$repairStreak$1 languageStatsRepositoryImpl$repairStreak$1;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl;
        LanguageStatsDao languageStatsDao;
        if (interfaceC9968c instanceof LanguageStatsRepositoryImpl$repairStreak$1) {
            languageStatsRepositoryImpl$repairStreak$1 = (LanguageStatsRepositoryImpl$repairStreak$1) interfaceC9968c;
            int i11 = languageStatsRepositoryImpl$repairStreak$1.f19826i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$repairStreak$1.f19826i = i11 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$repairStreak$1 = new LanguageStatsRepositoryImpl$repairStreak$1(this, interfaceC9968c);
            }
        } else {
            languageStatsRepositoryImpl$repairStreak$1 = new LanguageStatsRepositoryImpl$repairStreak$1(this, interfaceC9968c);
        }
        Object objM18448g = languageStatsRepositoryImpl$repairStreak$1.f19824g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = languageStatsRepositoryImpl$repairStreak$1.f19826i;
        Object obj = null;
        boolean z10 = true;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i10 = languageStatsRepositoryImpl$repairStreak$1.f19823f;
                    str = languageStatsRepositoryImpl$repairStreak$1.f19822e;
                    languageStatsRepositoryImpl = languageStatsRepositoryImpl$repairStreak$1.f19821d;
                    C7499b.m14977z0(objM18448g);
                } else if (i12 == 2) {
                    i10 = languageStatsRepositoryImpl$repairStreak$1.f19823f;
                    str = languageStatsRepositoryImpl$repairStreak$1.f19822e;
                    languageStatsRepositoryImpl = languageStatsRepositoryImpl$repairStreak$1.f19821d;
                    C7499b.m14977z0(objM18448g);
                    languageStatsRepositoryImpl$repairStreak$1.f19821d = languageStatsRepositoryImpl;
                    languageStatsRepositoryImpl$repairStreak$1.f19822e = str;
                    languageStatsRepositoryImpl$repairStreak$1.f19823f = i10;
                    languageStatsRepositoryImpl$repairStreak$1.f19826i = 3;
                    if (languageStatsRepositoryImpl.mo6048i(str, languageStatsRepositoryImpl$repairStreak$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i12 != 3) {
                        if (i12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(objM18448g);
                        return null;
                    }
                    i10 = languageStatsRepositoryImpl$repairStreak$1.f19823f;
                    str = languageStatsRepositoryImpl$repairStreak$1.f19822e;
                    languageStatsRepositoryImpl = languageStatsRepositoryImpl$repairStreak$1.f19821d;
                    C7499b.m14977z0(objM18448g);
                }
                languageStatsDao = languageStatsRepositoryImpl.f19793a;
                languageStatsRepositoryImpl$repairStreak$1.f19821d = null;
                languageStatsRepositoryImpl$repairStreak$1.f19822e = null;
                languageStatsRepositoryImpl$repairStreak$1.f19826i = 4;
                if (languageStatsDao.mo5033t0(i10, str, languageStatsRepositoryImpl$repairStreak$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return obj;
            }
            C7499b.m14977z0(objM18448g);
            InterfaceC9937e interfaceC9937e = this.f19794b;
            languageStatsRepositoryImpl$repairStreak$1.f19821d = this;
            languageStatsRepositoryImpl$repairStreak$1.f19822e = str;
            languageStatsRepositoryImpl$repairStreak$1.f19823f = i10;
            languageStatsRepositoryImpl$repairStreak$1.f19826i = 1;
            objM18448g = interfaceC9937e.m18448g(str, languageStatsRepositoryImpl$repairStreak$1);
            if (objM18448g == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageStatsRepositoryImpl = this;
            ResultStreak resultStreak = (ResultStreak) objM18448g;
            String str2 = resultStreak.f18965e;
            if (str2 != null && !C7661i.m15250P2(str2)) {
                z10 = false;
            }
            if (!z10) {
                return resultStreak.f18965e;
            }
            languageStatsRepositoryImpl$repairStreak$1.f19821d = languageStatsRepositoryImpl;
            languageStatsRepositoryImpl$repairStreak$1.f19822e = str;
            languageStatsRepositoryImpl$repairStreak$1.f19823f = i10;
            languageStatsRepositoryImpl$repairStreak$1.f19826i = 2;
            if (languageStatsRepositoryImpl.mo6054o(str, languageStatsRepositoryImpl$repairStreak$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageStatsRepositoryImpl$repairStreak$1.f19821d = languageStatsRepositoryImpl;
            languageStatsRepositoryImpl$repairStreak$1.f19822e = str;
            languageStatsRepositoryImpl$repairStreak$1.f19823f = i10;
            languageStatsRepositoryImpl$repairStreak$1.f19826i = 3;
            if (languageStatsRepositoryImpl.mo6048i(str, languageStatsRepositoryImpl$repairStreak$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageStatsDao = languageStatsRepositoryImpl.f19793a;
            languageStatsRepositoryImpl$repairStreak$1.f19821d = null;
            languageStatsRepositoryImpl$repairStreak$1.f19822e = null;
            languageStatsRepositoryImpl$repairStreak$1.f19826i = 4;
            if (languageStatsDao.mo5033t0(i10, str, languageStatsRepositoryImpl$repairStreak$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return obj;
        } catch (Exception e10) {
            e10.printStackTrace();
            obj = "Couldn't repair streak.Please try again";
        }
    }

    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: n */
    public final Object mo6053n(String str, RequestAppUsageStat requestAppUsageStat, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18445d = this.f19794b.m18445d(str, requestAppUsageStat, interfaceC9968c);
        return objM18445d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18445d : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // ci.InterfaceC2013f
    /* JADX INFO: renamed from: o */
    public final Object mo6054o(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        LanguageStatsRepositoryImpl$networkStudyStats$1 languageStatsRepositoryImpl$networkStudyStats$1;
        LanguageStatsRepositoryImpl languageStatsRepositoryImpl;
        String str2 = str;
        if (interfaceC9968c instanceof LanguageStatsRepositoryImpl$networkStudyStats$1) {
            languageStatsRepositoryImpl$networkStudyStats$1 = (LanguageStatsRepositoryImpl$networkStudyStats$1) interfaceC9968c;
            int i10 = languageStatsRepositoryImpl$networkStudyStats$1.f19820h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                languageStatsRepositoryImpl$networkStudyStats$1.f19820h = i10 - Integer.MIN_VALUE;
            } else {
                languageStatsRepositoryImpl$networkStudyStats$1 = new LanguageStatsRepositoryImpl$networkStudyStats$1(this, interfaceC9968c);
            }
        } else {
            languageStatsRepositoryImpl$networkStudyStats$1 = new LanguageStatsRepositoryImpl$networkStudyStats$1(this, interfaceC9968c);
        }
        Object objM18443b = languageStatsRepositoryImpl$networkStudyStats$1.f19818f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = languageStatsRepositoryImpl$networkStudyStats$1.f19820h;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = languageStatsRepositoryImpl$networkStudyStats$1.f19817e;
                languageStatsRepositoryImpl = languageStatsRepositoryImpl$networkStudyStats$1.f19816d;
                C7499b.m14977z0(objM18443b);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18443b);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM18443b);
        languageStatsRepositoryImpl$networkStudyStats$1.f19816d = this;
        languageStatsRepositoryImpl$networkStudyStats$1.f19817e = str2;
        languageStatsRepositoryImpl$networkStudyStats$1.f19820h = 1;
        objM18443b = this.f19794b.m18443b(str2, languageStatsRepositoryImpl$networkStudyStats$1);
        if (objM18443b == coroutineSingletons) {
            return coroutineSingletons;
        }
        languageStatsRepositoryImpl = this;
        String str3 = str2;
        ResultStudyStats resultStudyStats = (ResultStudyStats) objM18443b;
        C5207g.m11111f(resultStudyStats, "<this>");
        C5207g.m11111f(str3, "language");
        String str4 = resultStudyStats.f18972a;
        int i12 = resultStudyStats.f18973b;
        int i13 = resultStudyStats.f18974c;
        int i14 = resultStudyStats.f18975d;
        int i15 = resultStudyStats.f18976e;
        int i16 = resultStudyStats.f18977f;
        boolean z10 = resultStudyStats.f18978g;
        List<StudyStatsScores> list = resultStudyStats.f18979h;
        ActivityLevel activityLevel = resultStudyStats.f18980i;
        StudyStats studyStats = new StudyStats(str3, str3, str4, i12, i13, i14, i15, i16, z10, list, activityLevel != null ? activityLevel.f16849a : 0);
        LanguageStatsDao languageStatsDao = languageStatsRepositoryImpl.f19793a;
        languageStatsRepositoryImpl$networkStudyStats$1.f19816d = null;
        languageStatsRepositoryImpl$networkStudyStats$1.f19817e = null;
        languageStatsRepositoryImpl$networkStudyStats$1.f19820h = 2;
        if (languageStatsDao.mo5031r0(studyStats, languageStatsRepositoryImpl$networkStudyStats$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public final void m9478p(String str, String str2, double d10) {
        NetworkType networkType = NetworkType.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        NetworkType networkType2 = NetworkType.CONNECTED;
        C5207g.m11111f(networkType2, "networkType");
        C1309b c1309b = new C1309b(networkType2, false, false, false, false, -1L, -1L, C6752c.m13457y0(linkedHashSet));
        C1315h.a aVar = (C1315h.a) new C1315h.a(LanguageProgressUpdateWorker.class).m4880d(BackoffPolicy.LINEAR, TimeUnit.MILLISECONDS);
        aVar.f8071c.f37533j = c1309b;
        Pair[] pairArr = {new Pair("language", str), new Pair("stat", str2), new Pair("value", Double.valueOf(d10))};
        C1244b.a aVar2 = new C1244b.a();
        for (int i10 = 0; i10 < 3; i10++) {
            Pair pair = pairArr[i10];
            aVar2.m4709b(pair.f38013b, (String) pair.f38012a);
        }
        aVar.f8071c.f37528e = aVar2.m4708a();
        this.f19795c.m4877b(aVar.m4879a());
    }
}
