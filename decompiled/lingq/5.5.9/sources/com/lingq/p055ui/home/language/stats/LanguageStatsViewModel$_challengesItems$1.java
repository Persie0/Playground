package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.challenge.ChallengeDetail;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$b;", "", "Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "challenges", "Lcom/lingq/shared/domain/Resource$Status;", "loading", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsViewModel$_challengesItems$1", m19206f = "LanguageStatsViewModel.kt", m19207l = {154}, m19208m = "invokeSuspend")
final class LanguageStatsViewModel$_challengesItems$1 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super AbstractC7791r.b>, List<? extends ChallengeDetail>, Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24318e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24319f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f24320g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Resource.Status f24321h;

    public LanguageStatsViewModel$_challengesItems$1(InterfaceC9968c<? super LanguageStatsViewModel$_challengesItems$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(InterfaceC7117d<? super AbstractC7791r.b> interfaceC7117d, List<? extends ChallengeDetail> list, Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LanguageStatsViewModel$_challengesItems$1 languageStatsViewModel$_challengesItems$1 = new LanguageStatsViewModel$_challengesItems$1(interfaceC9968c);
        languageStatsViewModel$_challengesItems$1.f24319f = interfaceC7117d;
        languageStatsViewModel$_challengesItems$1.f24320g = list;
        languageStatsViewModel$_challengesItems$1.f24321h = status;
        return languageStatsViewModel$_challengesItems$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24318e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24319f;
            AbstractC7791r.b bVar = new AbstractC7791r.b(this.f24320g, this.f24321h == Resource.Status.LOADING);
            this.f24319f = null;
            this.f24320g = null;
            this.f24318e = 1;
            if (interfaceC7117d.mo1339r(bVar, this) == coroutineSingletons) {
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
