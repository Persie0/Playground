package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$observeActiveChallenges$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {573}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$observeActiveChallenges$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24369e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24370f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$observeActiveChallenges$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$observeActiveChallenges$1$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37241 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends ChallengeDetail>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LanguageStatsViewModel f24371e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37241(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37241> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24371e = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37241(this.f24371e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends ChallengeDetail>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37241) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24371e.f24287K.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$observeActiveChallenges$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$observeActiveChallenges$1$2", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37252 extends SuspendLambda implements InterfaceC2056p<List<? extends ChallengeDetail>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24372e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsViewModel f24373f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37252(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37252> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24373f = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37252 c37252 = new C37252(this.f24373f, interfaceC9968c);
            c37252.f24372e = obj;
            return c37252;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends ChallengeDetail> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37252) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List listM13449q0 = (List) this.f24372e;
            boolean zIsEmpty = listM13449q0.isEmpty();
            LanguageStatsViewModel languageStatsViewModel = this.f24373f;
            if (zIsEmpty) {
                languageStatsViewModel.f24287K.setValue(Resource.Status.EMPTY);
            } else {
                languageStatsViewModel.f24287K.setValue(Resource.Status.SUCCESS);
            }
            StateFlowImpl stateFlowImpl = languageStatsViewModel.f24296T;
            StateFlowImpl stateFlowImpl2 = languageStatsViewModel.f24295S;
            if (((List) stateFlowImpl2.getValue()).isEmpty()) {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(listM13449q0, 10));
                Iterator it = listM13449q0.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((ChallengeDetail) it.next()).f21633a, arrayList);
                }
                stateFlowImpl2.setValue(arrayList);
            } else {
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(listM13449q0, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                for (Object obj2 : listM13449q0) {
                    linkedHashMap.put(new Integer(((ChallengeDetail) obj2).f21633a), obj2);
                }
                Iterable iterable = (Iterable) stateFlowImpl2.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                loop2: while (true) {
                    while (true) {
                        if (!it2.hasNext()) {
                            break loop2;
                        }
                        ChallengeDetail challengeDetail = (ChallengeDetail) linkedHashMap.get(new Integer(((Number) it2.next()).intValue()));
                        if (challengeDetail != null) {
                            arrayList2.add(challengeDetail);
                        }
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listM13449q0) {
                    if (!((List) stateFlowImpl2.getValue()).contains(new Integer(((ChallengeDetail) obj3).f21633a))) {
                        arrayList3.add(obj3);
                    }
                }
                listM13449q0 = C6752c.m13449q0(4, C6752c.m13438f0(arrayList2, arrayList3));
            }
            stateFlowImpl.setValue(listM13449q0);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$observeActiveChallenges$1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super LanguageStatsViewModel$observeActiveChallenges$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24370f = languageStatsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$observeActiveChallenges$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$observeActiveChallenges$1(this.f24370f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24369e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24370f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37241(languageStatsViewModel, null), languageStatsViewModel.f24303e.mo5990q(languageStatsViewModel.mo498E1()));
            C37252 c37252 = new C37252(languageStatsViewModel, null);
            this.f24369e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c37252, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
