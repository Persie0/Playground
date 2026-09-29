package com.lingq.p020ui;

import android.graphics.Rect;
import androidx.room.util.AbstractC0758a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1296l;
import com.lingq.core.data.repository.C1297m;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.library.C1386a;
import com.lingq.core.domain.model.LearningLevel;
import com.lingq.core.domain.model.library.LibraryContentType;
import com.lingq.core.domain.model.library.LibrarySearchQuery;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryShelfType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.onboarding.TooltipStep;
import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.C3211a;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.dc7;
import p000.do7;
import p000.du0;
import p000.dv3;
import p000.e7a;
import p000.eh9;
import p000.g41;
import p000.h24;
import p000.hf6;
import p000.hm5;
import p000.ie6;
import p000.km7;
import p000.ld0;
import p000.lda;
import p000.lm4;
import p000.nl8;
import p000.nn1;
import p000.ob1;
import p000.qn3;
import p000.qn6;
import p000.r32;
import p000.sca;
import p000.si7;
import p000.u91;
import p000.ui3;
import p000.un1;
import p000.v91;
import p000.vma;
import p000.vz1;
import p000.wfb;
import p000.wta;
import p000.xd7;
import p000.xf2;
import p000.xfa;
import p000.xi9;
import p000.y5a;
import p000.y95;
import p000.ye6;
import p000.ys2;

/* JADX INFO: renamed from: com.lingq.ui.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2888d extends wta implements cma, dc7, qn6, e7a, r32 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f34167b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dc7 f34168c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ r32 f34169d;

    /* JADX INFO: renamed from: e */
    public final km7 f34170e;

    /* JADX INFO: renamed from: f */
    public final lm4 f34171f;

    /* JADX INFO: renamed from: g */
    public final C1297m f34172g;

    /* JADX INFO: renamed from: h */
    public final y95 f34173h;

    /* JADX INFO: renamed from: i */
    public final xd7 f34174i;

    /* JADX INFO: renamed from: j */
    public final C1386a f34175j;

    /* JADX INFO: renamed from: k */
    public final hm5 f34176k;

    /* JADX INFO: renamed from: l */
    public final vma f34177l;

    /* JADX INFO: renamed from: m */
    public final si7 f34178m;

    /* JADX INFO: renamed from: n */
    public final sca f34179n;

    /* JADX INFO: renamed from: o */
    public final qn3 f34180o;

    /* JADX INFO: renamed from: p */
    public final nn1 f34181p;

    /* JADX INFO: renamed from: q */
    public final C1808b f34182q;

    /* JADX INFO: renamed from: r */
    public final qn6 f34183r;

    /* JADX INFO: renamed from: s */
    public final e7a f34184s;

    /* JADX INFO: renamed from: t */
    public final ob1 f34185t;

    /* JADX INFO: renamed from: u */
    public final c18 f34186u;

    /* JADX INFO: renamed from: v */
    public final C3211a f34187v;

    /* JADX INFO: renamed from: w */
    public final du0 f34188w;

    /* JADX INFO: renamed from: x */
    public final C3244l f34189x;

    /* JADX INFO: renamed from: y */
    public final c18 f34190y;

    public C2888d(km7 km7Var, lm4 lm4Var, C1297m c1297m, xf2 xf2Var, y95 y95Var, xd7 xd7Var, C1386a c1386a, hm5 hm5Var, vma vmaVar, si7 si7Var, sca scaVar, qn3 qn3Var, r32 r32Var, nn1 nn1Var, un1 un1Var, cma cmaVar, dc7 dc7Var, C1808b c1808b, qn6 qn6Var, e7a e7aVar, ob1 ob1Var, nl8 nl8Var) {
        km7Var.getClass();
        lm4Var.getClass();
        c1297m.getClass();
        xf2Var.getClass();
        y95Var.getClass();
        xd7Var.getClass();
        hm5Var.getClass();
        vmaVar.getClass();
        si7Var.getClass();
        scaVar.getClass();
        r32Var.getClass();
        un1Var.getClass();
        cmaVar.getClass();
        dc7Var.getClass();
        c1808b.getClass();
        qn6Var.getClass();
        e7aVar.getClass();
        ob1Var.getClass();
        nl8Var.getClass();
        this.f34167b = cmaVar;
        this.f34168c = dc7Var;
        this.f34169d = r32Var;
        this.f34170e = km7Var;
        this.f34171f = lm4Var;
        this.f34172g = c1297m;
        this.f34173h = y95Var;
        this.f34174i = xd7Var;
        this.f34175j = c1386a;
        this.f34176k = hm5Var;
        this.f34177l = vmaVar;
        this.f34178m = si7Var;
        this.f34179n = scaVar;
        this.f34180o = qn3Var;
        this.f34181p = nn1Var;
        this.f34182q = c1808b;
        this.f34183r = qn6Var;
        this.f34184s = e7aVar;
        this.f34185t = ob1Var;
        C3235e c3235eM15521C = AbstractC3224d.m15521C(cmaVar.mo4574C1(), new HomeViewModel$_allLanguages$1(this, null));
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        EmptyList emptyList = EmptyList.f47638a;
        c18 c18VarM15520B = AbstractC3224d.m15520B(c3235eM15521C, g41VarM16103C, c3243k, emptyList);
        this.f34186u = AbstractC3224d.m15520B(AbstractC3224d.m15521C(cmaVar.mo4572B0(), new HomeViewModel$locales$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        C3211a c3211aM10525a = do7.m10525a(-1, 6, null);
        this.f34187v = c3211aM10525a;
        this.f34188w = AbstractC3224d.m15519A(c3211aM10525a);
        AbstractC3224d.m15519A(AbstractC1261a.m7042a());
        AbstractC3224d.m15520B(new C3228h(c18VarM15520B, AbstractC3224d.m15519A(do7.m10525a(-1, 6, null)), new HomeViewModel$updateUserLanguage$1(3, null)), lda.m16103C(this), c3243k, null);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(bool);
        this.f34189x = c3244lM17114d;
        this.f34190y = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), c3243k, bool);
        wfb.m23926u(lda.m16103C(this), null, null, new HomeViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new HomeViewModel$2(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new HomeViewModel$3(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f34167b.mo4571A();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: A0 */
    public final void mo8733A0(boolean z) {
        this.f34184s.mo8733A0(z);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: A1 */
    public final void mo7001A1(InAppNotificationAction inAppNotificationAction) {
        inAppNotificationAction.getClass();
        this.f34183r.mo7001A1(inAppNotificationAction);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f34167b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f34167b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f34167b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f34167b.mo4575D0(continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: D1 */
    public final c83 mo8736D1() {
        return this.f34184s.mo8736D1();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: E2 */
    public final void mo8240E2() {
        this.f34169d.mo8240E2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f34167b.mo4576F1(str, continuation);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: G */
    public final void mo8740G(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f34184s.mo8740G(tooltipStep);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: G0 */
    public final void mo8241G0() {
        this.f34169d.mo8241G0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f34167b.mo4577H();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: H0 */
    public final Object mo7002H0(int i, Continuation continuation) {
        return this.f34183r.mo7002H0(i, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f34167b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f34167b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f34167b.mo4580K1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: L */
    public final void mo8742L(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        this.f34184s.mo8742L(tooltipStep);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f34167b.mo4581L0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: M0 */
    public final eh9 mo9201M0() {
        return this.f34168c.mo9201M0();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: M2 */
    public final Object mo8242M2(hf6 hf6Var, long j, Continuation continuation) {
        return this.f34169d.mo8242M2(hf6Var, 500L, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f34167b.mo4582N();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O */
    public final Object mo7003O(Continuation continuation) {
        return this.f34183r.mo7003O(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: O0 */
    public final c83 mo7004O0() {
        return this.f34183r.mo7004O0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f34167b.mo4583O1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: P0 */
    public final boolean mo8744P0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f34184s.mo8744P0(tooltipStep);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: P1 */
    public final void mo7005P1(h24 h24Var) {
        h24Var.getClass();
        this.f34183r.mo7005P1(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Q */
    public final void mo8745Q() {
        this.f34184s.mo8745Q();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f34167b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f34167b.mo4585R();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: R1 */
    public final void mo8243R1(hf6 hf6Var) {
        hf6Var.getClass();
        this.f34169d.mo8243R1(hf6Var);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: S1 */
    public final eh9 mo8244S1() {
        return this.f34169d.mo8244S1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f34167b.mo4586T0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: T1 */
    public final void mo9202T1(int i, long j, boolean z) {
        this.f34168c.mo9202T1(i, j, z);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: W2 */
    public final Object m9808W2(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        HomeViewModel$getLibraryShelf$1 homeViewModel$getLibraryShelf$1;
        LibraryShelf libraryShelf;
        String str3;
        String str4;
        String str5;
        String str6;
        LibraryShelf libraryShelf2;
        LibrarySearchQuery librarySearchQuery;
        LibrarySearchQuery librarySearchQuery2;
        LinkedHashMap linkedHashMapM15372Y;
        String str7 = str;
        String str8 = str2;
        if (continuationImpl instanceof HomeViewModel$getLibraryShelf$1) {
            homeViewModel$getLibraryShelf$1 = (HomeViewModel$getLibraryShelf$1) continuationImpl;
            int i = homeViewModel$getLibraryShelf$1.f33959g;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeViewModel$getLibraryShelf$1.f33959g = i - Integer.MIN_VALUE;
            } else {
                homeViewModel$getLibraryShelf$1 = new HomeViewModel$getLibraryShelf$1(this, continuationImpl);
            }
        } else {
            homeViewModel$getLibraryShelf$1 = new HomeViewModel$getLibraryShelf$1(this, continuationImpl);
        }
        Object objM7507E0 = homeViewModel$getLibraryShelf$1.f33957e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeViewModel$getLibraryShelf$1.f33959g;
        vma vmaVar = this.f34177l;
        y95 y95Var = this.f34173h;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7507E0);
            homeViewModel$getLibraryShelf$1.f33953a = str7;
            homeViewModel$getLibraryShelf$1.f33954b = str8;
            homeViewModel$getLibraryShelf$1.f33959g = 1;
            objM7507E0 = ((C1296l) y95Var).f16514d.m7507E0(str7, str8, homeViewModel$getLibraryShelf$1);
            if (objM7507E0 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str9 = homeViewModel$getLibraryShelf$1.f33954b;
            String str10 = homeViewModel$getLibraryShelf$1.f33953a;
            AbstractC3193b.m15359b(objM7507E0);
            str8 = str9;
            str7 = str10;
        } else {
            if (i2 == 2) {
                str4 = homeViewModel$getLibraryShelf$1.f33954b;
                str3 = homeViewModel$getLibraryShelf$1.f33953a;
                AbstractC3193b.m15359b(objM7507E0);
                homeViewModel$getLibraryShelf$1.f33953a = str3;
                homeViewModel$getLibraryShelf$1.f33954b = str4;
                homeViewModel$getLibraryShelf$1.f33955c = null;
                homeViewModel$getLibraryShelf$1.f33959g = 3;
                objM7507E0 = ((C1296l) y95Var).f16514d.m7507E0(str3, str4, homeViewModel$getLibraryShelf$1);
                if (objM7507E0 != coroutineSingletons) {
                    str5 = str3;
                    str6 = str4;
                    libraryShelf = (LibraryShelf) objM7507E0;
                    if (libraryShelf == null) {
                        libraryShelf2 = new LibraryShelf(vz1.m23605K(new LibraryTab("Lessons", LibraryContentType.Lessons.getValue(), -1, true, 0, "/search/lessons"), new LibraryTab("Courses", LibraryContentType.Courses.getValue(), -1, false, 1, "/search/courses")), str6);
                        librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, 8191);
                        c83 c83Var = ((C1371d) vmaVar).f18585v;
                        homeViewModel$getLibraryShelf$1.f33953a = str5;
                        homeViewModel$getLibraryShelf$1.f33954b = str6;
                        homeViewModel$getLibraryShelf$1.f33955c = libraryShelf2;
                        homeViewModel$getLibraryShelf$1.f33956d = librarySearchQuery;
                        homeViewModel$getLibraryShelf$1.f33959g = 4;
                        objM7507E0 = AbstractC3224d.m15541t(c83Var, homeViewModel$getLibraryShelf$1);
                        if (objM7507E0 != coroutineSingletons) {
                            librarySearchQuery2 = librarySearchQuery;
                        }
                    }
                    return libraryShelf;
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                String str11 = homeViewModel$getLibraryShelf$1.f33954b;
                String str12 = homeViewModel$getLibraryShelf$1.f33953a;
                AbstractC3193b.m15359b(objM7507E0);
                str6 = str11;
                str5 = str12;
                libraryShelf = (LibraryShelf) objM7507E0;
                if (libraryShelf == null) {
                    libraryShelf2 = new LibraryShelf(vz1.m23605K(new LibraryTab("Lessons", LibraryContentType.Lessons.getValue(), -1, true, 0, "/search/lessons"), new LibraryTab("Courses", LibraryContentType.Courses.getValue(), -1, false, 1, "/search/courses")), str6);
                    librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, 8191);
                    c83 c83Var2 = ((C1371d) vmaVar).f18585v;
                    homeViewModel$getLibraryShelf$1.f33953a = str5;
                    homeViewModel$getLibraryShelf$1.f33954b = str6;
                    homeViewModel$getLibraryShelf$1.f33955c = libraryShelf2;
                    homeViewModel$getLibraryShelf$1.f33956d = librarySearchQuery;
                    homeViewModel$getLibraryShelf$1.f33959g = 4;
                    objM7507E0 = AbstractC3224d.m15541t(c83Var2, homeViewModel$getLibraryShelf$1);
                    if (objM7507E0 != coroutineSingletons) {
                        librarySearchQuery2 = librarySearchQuery;
                    }
                    return coroutineSingletons;
                }
                return libraryShelf;
            }
            if (i2 != 4) {
                if (i2 != 5) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                LibraryShelf libraryShelf3 = homeViewModel$getLibraryShelf$1.f33955c;
                AbstractC3193b.m15359b(objM7507E0);
                return libraryShelf3;
            }
            librarySearchQuery2 = homeViewModel$getLibraryShelf$1.f33956d;
            libraryShelf2 = homeViewModel$getLibraryShelf$1.f33955c;
            str6 = homeViewModel$getLibraryShelf$1.f33954b;
            str5 = homeViewModel$getLibraryShelf$1.f33953a;
            AbstractC3193b.m15359b(objM7507E0);
        }
        linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM7507E0);
        linkedHashMapM15372Y.put(vz1.m23629f(str5, str6), librarySearchQuery2);
        homeViewModel$getLibraryShelf$1.f33953a = null;
        homeViewModel$getLibraryShelf$1.f33954b = null;
        homeViewModel$getLibraryShelf$1.f33955c = libraryShelf2;
        homeViewModel$getLibraryShelf$1.f33956d = null;
        homeViewModel$getLibraryShelf$1.f33959g = 5;
        if (((C1371d) vmaVar).m7969i(linkedHashMapM15372Y, homeViewModel$getLibraryShelf$1) != coroutineSingletons) {
            return coroutineSingletons;
        }
        return libraryShelf2;
        libraryShelf = (LibraryShelf) objM7507E0;
        if (libraryShelf == null) {
            ys2 entries = LearningLevel.getEntries();
            ArrayList arrayList = new ArrayList(v91.m23189q0(entries, 10));
            Iterator<E> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(((LearningLevel) it.next()).getServerName());
            }
            if (arrayList.size() == LearningLevel.getEntries().size()) {
                arrayList = null;
            }
            homeViewModel$getLibraryShelf$1.f33953a = str7;
            homeViewModel$getLibraryShelf$1.f33954b = str8;
            homeViewModel$getLibraryShelf$1.f33955c = null;
            homeViewModel$getLibraryShelf$1.f33959g = 2;
            if (((C1296l) y95Var).m7325t(str7, arrayList, homeViewModel$getLibraryShelf$1) != coroutineSingletons) {
                String str13 = str8;
                str3 = str7;
                str4 = str13;
                homeViewModel$getLibraryShelf$1.f33953a = str3;
                homeViewModel$getLibraryShelf$1.f33954b = str4;
                homeViewModel$getLibraryShelf$1.f33955c = null;
                homeViewModel$getLibraryShelf$1.f33959g = 3;
                objM7507E0 = ((C1296l) y95Var).f16514d.m7507E0(str3, str4, homeViewModel$getLibraryShelf$1);
                if (objM7507E0 != coroutineSingletons) {
                    str5 = str3;
                    str6 = str4;
                    libraryShelf = (LibraryShelf) objM7507E0;
                    if (libraryShelf == null) {
                        libraryShelf2 = new LibraryShelf(vz1.m23605K(new LibraryTab("Lessons", LibraryContentType.Lessons.getValue(), -1, true, 0, "/search/lessons"), new LibraryTab("Courses", LibraryContentType.Courses.getValue(), -1, false, 1, "/search/courses")), str6);
                        librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, 8191);
                        c83 c83Var3 = ((C1371d) vmaVar).f18585v;
                        homeViewModel$getLibraryShelf$1.f33953a = str5;
                        homeViewModel$getLibraryShelf$1.f33954b = str6;
                        homeViewModel$getLibraryShelf$1.f33955c = libraryShelf2;
                        homeViewModel$getLibraryShelf$1.f33956d = librarySearchQuery;
                        homeViewModel$getLibraryShelf$1.f33959g = 4;
                        objM7507E0 = AbstractC3224d.m15541t(c83Var3, homeViewModel$getLibraryShelf$1);
                        if (objM7507E0 != coroutineSingletons) {
                            librarySearchQuery2 = librarySearchQuery;
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM7507E0);
                            linkedHashMapM15372Y.put(vz1.m23629f(str5, str6), librarySearchQuery2);
                            homeViewModel$getLibraryShelf$1.f33953a = null;
                            homeViewModel$getLibraryShelf$1.f33954b = null;
                            homeViewModel$getLibraryShelf$1.f33955c = libraryShelf2;
                            homeViewModel$getLibraryShelf$1.f33956d = null;
                            homeViewModel$getLibraryShelf$1.f33959g = 5;
                            if (((C1371d) vmaVar).m7969i(linkedHashMapM15372Y, homeViewModel$getLibraryShelf$1) != coroutineSingletons) {
                                return libraryShelf2;
                            }
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return libraryShelf;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f34167b.mo4587X();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X0 */
    public final Object mo7007X0(Continuation continuation) {
        return this.f34183r.mo7007X0(continuation);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: X1 */
    public final eh9 mo7008X1() {
        return this.f34183r.mo7008X1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: X2 */
    public final Object m9809X2(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        HomeViewModel$navigateGuidedCourse$1 homeViewModel$navigateGuidedCourse$1;
        if (continuationImpl instanceof HomeViewModel$navigateGuidedCourse$1) {
            homeViewModel$navigateGuidedCourse$1 = (HomeViewModel$navigateGuidedCourse$1) continuationImpl;
            int i2 = homeViewModel$navigateGuidedCourse$1.f33968d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                homeViewModel$navigateGuidedCourse$1.f33968d = i2 - Integer.MIN_VALUE;
            } else {
                homeViewModel$navigateGuidedCourse$1 = new HomeViewModel$navigateGuidedCourse$1(this, continuationImpl);
            }
        } else {
            homeViewModel$navigateGuidedCourse$1 = new HomeViewModel$navigateGuidedCourse$1(this, continuationImpl);
        }
        Object objM9808W2 = homeViewModel$navigateGuidedCourse$1.f33966b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = homeViewModel$navigateGuidedCourse$1.f33968d;
        Object obj2 = null;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM9808W2);
            String value = LibraryShelfType.Guided.getValue();
            homeViewModel$navigateGuidedCourse$1.f33965a = i;
            homeViewModel$navigateGuidedCourse$1.f33968d = 1;
            objM9808W2 = m9808W2(str, value, homeViewModel$navigateGuidedCourse$1);
            if (objM9808W2 == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = homeViewModel$navigateGuidedCourse$1.f33965a;
            AbstractC3193b.m15359b(objM9808W2);
        }
        LibraryShelf libraryShelf = (LibraryShelf) objM9808W2;
        for (Object obj3 : libraryShelf.f19495c) {
            if (((LibraryTab) obj3).f19503c == i) {
                obj2 = obj3;
                break;
            }
        }
        LibraryTab libraryTab = (LibraryTab) obj2;
        if (libraryTab == null) {
            libraryTab = (LibraryTab) u91.m22589G0(libraryShelf.f19495c);
        }
        this.f34169d.mo8243R1(new ie6(libraryShelf, libraryTab));
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9810Y2(int i, LqAnalyticsValues$LessonPath lqAnalyticsValues$LessonPath) {
        this.f34187v.mo4677k(new dv3(i, lqAnalyticsValues$LessonPath));
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: Z0 */
    public final boolean mo8753Z0(TooltipStep tooltipStep) {
        tooltipStep.getClass();
        return this.f34184s.mo8753Z0(tooltipStep);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: Z1 */
    public final void mo8245Z1(hf6 hf6Var) {
        this.f34169d.mo8245Z1(hf6Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (((com.lingq.core.data.repository.C1302r) r4).m7354n(r10, r0) == r1) goto L23;
     */
    /* JADX INFO: renamed from: Z2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m9811Z2(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        HomeViewModel$navigateToPlaylist$1 homeViewModel$navigateToPlaylist$1;
        if (continuationImpl instanceof HomeViewModel$navigateToPlaylist$1) {
            homeViewModel$navigateToPlaylist$1 = (HomeViewModel$navigateToPlaylist$1) continuationImpl;
            int i2 = homeViewModel$navigateToPlaylist$1.f33973e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                homeViewModel$navigateToPlaylist$1.f33973e = i2 - Integer.MIN_VALUE;
            } else {
                homeViewModel$navigateToPlaylist$1 = new HomeViewModel$navigateToPlaylist$1(this, continuationImpl);
            }
        } else {
            homeViewModel$navigateToPlaylist$1 = new HomeViewModel$navigateToPlaylist$1(this, continuationImpl);
        }
        Object objM2861d = homeViewModel$navigateToPlaylist$1.f33971c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = homeViewModel$navigateToPlaylist$1.f33973e;
        xd7 xd7Var = this.f34174i;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d);
            homeViewModel$navigateToPlaylist$1.f33969a = str;
            homeViewModel$navigateToPlaylist$1.f33970b = i;
            homeViewModel$navigateToPlaylist$1.f33973e = 1;
            objM2861d = AbstractC0758a.m2861d(new ld0(str, i, 17), ((C1302r) xd7Var).f16534c.f17045K, homeViewModel$navigateToPlaylist$1, true, false);
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = homeViewModel$navigateToPlaylist$1.f33970b;
            str = homeViewModel$navigateToPlaylist$1.f33969a;
            AbstractC3193b.m15359b(objM2861d);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = homeViewModel$navigateToPlaylist$1.f33970b;
            AbstractC3193b.m15359b(objM2861d);
        }
        this.f34169d.mo8243R1(new ye6(i));
        return xfa.f68157a;
        if (((Playlist) objM2861d) == null) {
            homeViewModel$navigateToPlaylist$1.f33969a = null;
            homeViewModel$navigateToPlaylist$1.f33970b = i;
            homeViewModel$navigateToPlaylist$1.f33973e = 2;
        }
        this.f34169d.mo8243R1(new ye6(i));
        return xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f34167b.mo4588a0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a3 */
    public final Object m9812a3(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        HomeViewModel$navigateToShelf$1 homeViewModel$navigateToShelf$1;
        if (continuationImpl instanceof HomeViewModel$navigateToShelf$1) {
            homeViewModel$navigateToShelf$1 = (HomeViewModel$navigateToShelf$1) continuationImpl;
            int i = homeViewModel$navigateToShelf$1.f33976c;
            if ((i & Integer.MIN_VALUE) != 0) {
                homeViewModel$navigateToShelf$1.f33976c = i - Integer.MIN_VALUE;
            } else {
                homeViewModel$navigateToShelf$1 = new HomeViewModel$navigateToShelf$1(this, continuationImpl);
            }
        } else {
            homeViewModel$navigateToShelf$1 = new HomeViewModel$navigateToShelf$1(this, continuationImpl);
        }
        Object objM9808W2 = homeViewModel$navigateToShelf$1.f33974a;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = homeViewModel$navigateToShelf$1.f33976c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM9808W2);
            homeViewModel$navigateToShelf$1.f33976c = 1;
            objM9808W2 = m9808W2(str, str2, homeViewModel$navigateToShelf$1);
            if (objM9808W2 == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM9808W2);
        }
        this.f34169d.mo8243R1(new ie6((LibraryShelf) objM9808W2));
        return xfa.f68157a;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f34167b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9813b3(String str, boolean z) {
        C3244l c3244l;
        Object value;
        str.getClass();
        do {
            c3244l = this.f34189x;
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.valueOf(z)));
        if (z) {
            return;
        }
        wfb.m23926u(lda.m16103C(this), this.f34181p, null, new HomeViewModel$shouldShowBetaLanguageDialog$2(this, str, null), 2);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f34167b.mo4590d0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: d1 */
    public final void mo8759d1() {
        this.f34184s.mo8759d1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: d2 */
    public final c83 mo7012d2() {
        return this.f34183r.mo7012d2();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: e0 */
    public final void mo8247e0(String str, long j) {
        str.getClass();
        this.f34169d.mo8247e0(str, j);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: g */
    public final eh9 mo8763g() {
        return this.f34184s.mo8763g();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: g0 */
    public final void mo9211g0(PlayingFrom playingFrom) {
        playingFrom.getClass();
        this.f34168c.mo9211g0(playingFrom);
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: g1 */
    public final void mo7013g1(h24 h24Var) {
        this.f34183r.mo7013g1(h24Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f34167b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: h1 */
    public final eh9 mo8248h1() {
        return this.f34169d.mo8248h1();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: i0 */
    public final void mo7014i0(h24 h24Var) {
        h24Var.getClass();
        this.f34183r.mo7014i0(h24Var);
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: i1 */
    public final void mo8766i1() {
        this.f34184s.mo8766i1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: j0 */
    public final void mo8768j0(boolean z) {
        this.f34184s.mo8768j0(z);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: j1 */
    public final void mo9212j1() {
        this.f34168c.mo9212j1();
    }

    @Override // p000.r32
    /* JADX INFO: renamed from: k */
    public final eh9 mo8249k() {
        return this.f34169d.mo8249k();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f34167b.mo4592m0();
    }

    @Override // p000.qn6
    /* JADX INFO: renamed from: o2 */
    public final c83 mo7015o2() {
        return this.f34183r.mo7015o2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f34167b.mo4593p0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: q */
    public final c83 mo9213q() {
        return this.f34168c.mo9213q();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: q0 */
    public final c83 mo8771q0() {
        return this.f34184s.mo8771q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f34167b.mo4594r1();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: s */
    public final void mo8775s(y5a y5aVar, Rect rect, Rect rect2, boolean z, boolean z2, boolean z3, ui3 ui3Var) {
        y5aVar.getClass();
        rect.getClass();
        rect2.getClass();
        ui3Var.getClass();
        this.f34184s.mo8775s(y5aVar, rect, rect2, z, z2, z3, ui3Var);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f34167b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f34167b.mo4596t();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: t0 */
    public final void mo8777t0() {
        this.f34184s.mo8777t0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: t2 */
    public final eh9 mo9214t2() {
        return this.f34168c.mo9214t2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: u0 */
    public final c83 mo8778u0() {
        return this.f34184s.mo8778u0();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: w */
    public final c83 mo8780w() {
        return this.f34184s.mo8780w();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f34167b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f34167b.mo4598w2();
    }

    @Override // p000.e7a
    /* JADX INFO: renamed from: y0 */
    public final c83 mo8781y0() {
        return this.f34184s.mo8781y0();
    }
}
