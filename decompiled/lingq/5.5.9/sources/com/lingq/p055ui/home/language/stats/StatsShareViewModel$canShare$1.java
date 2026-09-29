package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguageStudyStats;
import dk.C5196a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageStudyStats;", "streak", "Lkotlin/Pair;", "", "Ldk/a;", "", "goals", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareViewModel$canShare$1", m19206f = "StatsShareViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class StatsShareViewModel$canShare$1 extends SuspendLambda implements InterfaceC2057q<UserLanguageStudyStats, Pair<? extends List<? extends C5196a>, ? extends Boolean>, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ UserLanguageStudyStats f24448e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Pair f24449f;

    public StatsShareViewModel$canShare$1(InterfaceC9968c<? super StatsShareViewModel$canShare$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(UserLanguageStudyStats userLanguageStudyStats, Pair<? extends List<? extends C5196a>, ? extends Boolean> pair, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        StatsShareViewModel$canShare$1 statsShareViewModel$canShare$1 = new StatsShareViewModel$canShare$1(interfaceC9968c);
        statsShareViewModel$canShare$1.f24448e = userLanguageStudyStats;
        statsShareViewModel$canShare$1.f24449f = pair;
        return statsShareViewModel$canShare$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        return Boolean.valueOf((this.f24448e == null || ((Boolean) this.f24449f.f38013b).booleanValue()) ? false : true);
    }
}
