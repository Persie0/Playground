package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$setLessonFilter$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {522, 526}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$setLessonFilter$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24374e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24375f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LanguageStatsViewModel f24376g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsViewModel$setLessonFilter$1(LanguageStatsViewModel languageStatsViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24375f = str;
        this.f24376g = languageStatsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsViewModel$setLessonFilter$1(this.f24376g, this.f24375f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsViewModel$setLessonFilter$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24374e;
        LanguageStatsViewModel languageStatsViewModel = this.f24376g;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            languageStatsViewModel.getClass();
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(languageStatsViewModel);
            LanguageStatsViewModel$updateGoals$1 languageStatsViewModel$updateGoals$1 = new LanguageStatsViewModel$updateGoals$1(languageStatsViewModel, null);
            CoroutineJobManager coroutineJobManager = languageStatsViewModel.f24307i;
            CoroutineDispatcher coroutineDispatcher = languageStatsViewModel.f24306h;
            C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "update goals", languageStatsViewModel$updateGoals$1);
            C7499b.m14933c0(C8573r0.m16767w0(languageStatsViewModel), coroutineJobManager, coroutineDispatcher, "goals", new LanguageStatsViewModel$getGoals$1(languageStatsViewModel, languageStatsViewModel.mo498E1(), null));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        str = this.f24375f;
        if (str.length() == 0) {
            UtilStoreImpl$special$$inlined$map$6 utilStoreImpl$special$$inlined$map$6Mo9679c = languageStatsViewModel.f24305g.mo9679c();
            this.f24374e = 1;
            obj = FlowKt__ReduceKt.m14360a(utilStoreImpl$special$$inlined$map$6Mo9679c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (!C5207g.m11106a((String) languageStatsViewModel.f24309k.getValue(), str)) {
            languageStatsViewModel.f24309k.setValue(str);
            this.f24374e = 2;
            if (languageStatsViewModel.f24305g.mo9697u(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageStatsViewModel.getClass();
            InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(languageStatsViewModel);
            LanguageStatsViewModel$updateGoals$1 languageStatsViewModel$updateGoals$2 = new LanguageStatsViewModel$updateGoals$1(languageStatsViewModel, null);
            CoroutineJobManager coroutineJobManager2 = languageStatsViewModel.f24307i;
            CoroutineDispatcher coroutineDispatcher2 = languageStatsViewModel.f24306h;
            C7499b.m14933c0(interfaceC7882zM16767w1, coroutineJobManager2, coroutineDispatcher2, "update goals", languageStatsViewModel$updateGoals$2);
            C7499b.m14933c0(C8573r0.m16767w0(languageStatsViewModel), coroutineJobManager2, coroutineDispatcher2, "goals", new LanguageStatsViewModel$getGoals$1(languageStatsViewModel, languageStatsViewModel.mo498E1(), null));
        }
        return C9072e.f47360a;
        str = (String) obj;
        if (!C5207g.m11106a((String) languageStatsViewModel.f24309k.getValue(), str)) {
            languageStatsViewModel.f24309k.setValue(str);
            this.f24374e = 2;
            if (languageStatsViewModel.f24305g.mo9697u(str, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            languageStatsViewModel.getClass();
            InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(languageStatsViewModel);
            LanguageStatsViewModel$updateGoals$1 languageStatsViewModel$updateGoals$3 = new LanguageStatsViewModel$updateGoals$1(languageStatsViewModel, null);
            CoroutineJobManager coroutineJobManager3 = languageStatsViewModel.f24307i;
            CoroutineDispatcher coroutineDispatcher3 = languageStatsViewModel.f24306h;
            C7499b.m14933c0(interfaceC7882zM16767w2, coroutineJobManager3, coroutineDispatcher3, "update goals", languageStatsViewModel$updateGoals$3);
            C7499b.m14933c0(C8573r0.m16767w0(languageStatsViewModel), coroutineJobManager3, coroutineDispatcher3, "goals", new LanguageStatsViewModel$getGoals$1(languageStatsViewModel, languageStatsViewModel.mo498E1(), null));
        }
        return C9072e.f47360a;
    }
}
