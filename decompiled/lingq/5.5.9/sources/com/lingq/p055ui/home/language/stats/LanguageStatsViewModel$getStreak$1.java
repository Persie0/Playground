package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getStreak$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {541}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$getStreak$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24352e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24353f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$getStreak$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getStreak$1$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37211 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super UserLanguageStudyStats>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LanguageStatsViewModel f24354e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37211(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24354e = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37211(this.f24354e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super UserLanguageStudyStats> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37211) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24354e.f24286J.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$getStreak$1$2 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getStreak$1$2", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37222 extends SuspendLambda implements InterfaceC2056p<UserLanguageStudyStats, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24355e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsViewModel f24356f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37222(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37222> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24356f = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37222 c37222 = new C37222(this.f24356f, interfaceC9968c);
            c37222.f24355e = obj;
            return c37222;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguageStudyStats userLanguageStudyStats, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37222) mo1336a(userLanguageStudyStats, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            UserLanguageStudyStats userLanguageStudyStats = (UserLanguageStudyStats) this.f24355e;
            if (userLanguageStudyStats != null) {
                LanguageStatsViewModel languageStatsViewModel = this.f24356f;
                languageStatsViewModel.f24286J.setValue(Resource.Status.SUCCESS);
                languageStatsViewModel.f24291O.setValue(new Pair(userLanguageStudyStats, Boolean.FALSE));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$getStreak$1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super LanguageStatsViewModel$getStreak$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24353f = languageStatsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$getStreak$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$getStreak$1(this.f24353f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24352e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24353f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37211(languageStatsViewModel, null), languageStatsViewModel.f24302d.mo6051l(languageStatsViewModel.mo498E1()));
            C37222 c37222 = new C37222(languageStatsViewModel, null);
            this.f24352e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c37222, this) == coroutineSingletons) {
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
