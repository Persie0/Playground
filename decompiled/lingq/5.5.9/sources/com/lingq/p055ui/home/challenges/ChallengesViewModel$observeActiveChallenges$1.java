package com.lingq.p055ui.home.challenges;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import fi.C5537a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$observeActiveChallenges$1", m19206f = "ChallengesViewModel.kt", m19207l = {160}, m19208m = "invokeSuspend")
final class ChallengesViewModel$observeActiveChallenges$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23129e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ChallengesViewModel f23130f;

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$observeActiveChallenges$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lfi/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$observeActiveChallenges$1$1", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35311 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C5537a>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ChallengesViewModel f23131e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35311(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super C35311> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23131e = challengesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C35311(this.f23131e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C5537a>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35311) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23131e.f23102i.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.challenges.ChallengesViewModel$observeActiveChallenges$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lfi/a;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.challenges.ChallengesViewModel$observeActiveChallenges$1$2", m19206f = "ChallengesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35322 extends SuspendLambda implements InterfaceC2056p<List<? extends C5537a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23132e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ChallengesViewModel f23133f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35322(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super C35322> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23133f = challengesViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35322 c35322 = new C35322(this.f23133f, interfaceC9968c);
            c35322.f23132e = obj;
            return c35322;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C5537a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35322) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23132e;
            ChallengesViewModel challengesViewModel = this.f23133f;
            challengesViewModel.f23102i.setValue(Boolean.valueOf(list.isEmpty()));
            StateFlowImpl stateFlowImpl = challengesViewModel.f23105l;
            if (((List) stateFlowImpl.getValue()).isEmpty()) {
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C0009a.m30s(((C5537a) it.next()).f34235a, arrayList);
                }
                stateFlowImpl.setValue(arrayList);
            } else {
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(list, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM14941g0);
                for (Object obj2 : list) {
                    linkedHashMap.put(new Integer(((C5537a) obj2).f34235a), obj2);
                }
                Iterable iterable = (Iterable) stateFlowImpl.getValue();
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    C5537a c5537a = (C5537a) linkedHashMap.get(new Integer(((Number) it2.next()).intValue()));
                    if (c5537a != null) {
                        arrayList2.add(c5537a);
                    }
                }
                list = arrayList2;
            }
            challengesViewModel.f23092H.setValue(list);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengesViewModel$observeActiveChallenges$1(ChallengesViewModel challengesViewModel, InterfaceC9968c<? super ChallengesViewModel$observeActiveChallenges$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23130f = challengesViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ChallengesViewModel$observeActiveChallenges$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ChallengesViewModel$observeActiveChallenges$1(this.f23130f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23129e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ChallengesViewModel challengesViewModel = this.f23130f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C35311(challengesViewModel, null), challengesViewModel.f23097d.mo5991r(challengesViewModel.mo498E1()));
            C35322 c35322 = new C35322(challengesViewModel, null);
            this.f23129e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c35322, this) == coroutineSingletons) {
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
