package com.lingq.p055ui.home.language.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import dk.C5196a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "", "Ldk/a;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareViewModel$goals$1", m19206f = "StatsShareViewModel.kt", m19207l = {87}, m19208m = "invokeSuspend")
final class StatsShareViewModel$goals$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Pair<? extends List<? extends C5196a>, ? extends Boolean>>, Pair<? extends List<? extends C5196a>, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24461e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f24462f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Pair f24463g;

    public StatsShareViewModel$goals$1(InterfaceC9968c<? super StatsShareViewModel$goals$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Pair<? extends List<? extends C5196a>, ? extends Boolean>> interfaceC7117d, Pair<? extends List<? extends C5196a>, ? extends Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        StatsShareViewModel$goals$1 statsShareViewModel$goals$1 = new StatsShareViewModel$goals$1(interfaceC9968c);
        statsShareViewModel$goals$1.f24462f = interfaceC7117d;
        statsShareViewModel$goals$1.f24463g = pair;
        return statsShareViewModel$goals$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24461e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f24462f;
            Pair pair = this.f24463g;
            this.f24462f = null;
            this.f24461e = 1;
            if (interfaceC7117d.mo1339r(pair, this) == coroutineSingletons) {
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
