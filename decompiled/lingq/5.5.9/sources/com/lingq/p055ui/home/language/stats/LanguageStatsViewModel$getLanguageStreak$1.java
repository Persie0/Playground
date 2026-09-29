package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import gi.C5804b;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getLanguageStreak$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {648}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$getLanguageStreak$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24348e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsViewModel f24349f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsViewModel$getLanguageStreak$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lgi/b;", "streak", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$getLanguageStreak$1$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37201 extends SuspendLambda implements InterfaceC2056p<C5804b, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24350e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsViewModel f24351f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37201(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super C37201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24351f = languageStatsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37201 c37201 = new C37201(this.f24351f, interfaceC9968c);
            c37201.f24350e = obj;
            return c37201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C5804b c5804b, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37201) mo1336a(c5804b, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            C5804b c5804b = (C5804b) this.f24350e;
            if (c5804b != null) {
                LanguageStatsViewModel languageStatsViewModel = this.f24351f;
                languageStatsViewModel.f24292P.setValue(c5804b.f35075c ? new Pair(c5804b, languageStatsViewModel.mo498E1()) : null);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$getLanguageStreak$1(LanguageStatsViewModel languageStatsViewModel, InterfaceC9968c<? super LanguageStatsViewModel$getLanguageStreak$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24349f = languageStatsViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$getLanguageStreak$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$getLanguageStreak$1(this.f24349f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24348e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LanguageStatsViewModel languageStatsViewModel = this.f24349f;
            InterfaceC7116c<C5804b> interfaceC7116cMo6050k = languageStatsViewModel.f24302d.mo6050k(languageStatsViewModel.mo498E1());
            C37201 c37201 = new C37201(languageStatsViewModel, null);
            this.f24348e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6050k, c37201, this) == coroutineSingletons) {
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
