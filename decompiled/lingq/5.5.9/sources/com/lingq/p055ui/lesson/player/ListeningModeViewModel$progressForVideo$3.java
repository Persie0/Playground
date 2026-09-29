package com.lingq.p055ui.lesson.player;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import ki.C6695a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lki/a;", "lesson", "selected", "", "canPlay", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$progressForVideo$3", m19206f = "ListeningModeViewModel.kt", m19207l = {93}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$progressForVideo$3 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super Double>, C6695a, Double, Boolean, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28847e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28848f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ double f28849g;

    public ListeningModeViewModel$progressForVideo$3(InterfaceC9968c<? super ListeningModeViewModel$progressForVideo$3> interfaceC9968c) {
        super(5, interfaceC9968c);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super Double> interfaceC7117d, C6695a c6695a, Double d10, Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        double dDoubleValue = d10.doubleValue();
        bool.booleanValue();
        ListeningModeViewModel$progressForVideo$3 listeningModeViewModel$progressForVideo$3 = new ListeningModeViewModel$progressForVideo$3(interfaceC9968c);
        listeningModeViewModel$progressForVideo$3.f28848f = interfaceC7117d;
        listeningModeViewModel$progressForVideo$3.f28849g = dDoubleValue;
        return listeningModeViewModel$progressForVideo$3.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28847e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28848f;
            Double d10 = new Double(this.f28849g);
            this.f28847e = 1;
            if (interfaceC7117d.mo1339r(d10, this) == coroutineSingletons) {
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
