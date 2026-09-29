package com.lingq.p055ui.lesson.player;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import ki.C6695a;
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
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lkotlin/Pair;", "Lki/a;", "", "lesson", "selected", "", "canPlay", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$startProgressForVideo$3", m19206f = "ListeningModeViewModel.kt", m19207l = {85}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$startProgressForVideo$3 extends SuspendLambda implements InterfaceC2059s<InterfaceC7117d<? super Pair<? extends C6695a, ? extends Double>>, C6695a, Double, Boolean, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28873e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f28874f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ C6695a f28875g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ double f28876h;

    public ListeningModeViewModel$startProgressForVideo$3(InterfaceC9968c<? super ListeningModeViewModel$startProgressForVideo$3> interfaceC9968c) {
        super(5, interfaceC9968c);
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(InterfaceC7117d<? super Pair<? extends C6695a, ? extends Double>> interfaceC7117d, C6695a c6695a, Double d10, Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        double dDoubleValue = d10.doubleValue();
        bool.booleanValue();
        ListeningModeViewModel$startProgressForVideo$3 listeningModeViewModel$startProgressForVideo$3 = new ListeningModeViewModel$startProgressForVideo$3(interfaceC9968c);
        listeningModeViewModel$startProgressForVideo$3.f28874f = interfaceC7117d;
        listeningModeViewModel$startProgressForVideo$3.f28875g = c6695a;
        listeningModeViewModel$startProgressForVideo$3.f28876h = dDoubleValue;
        return listeningModeViewModel$startProgressForVideo$3.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28873e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f28874f;
            Pair pair = new Pair(this.f28875g, new Double(this.f28876h));
            this.f28874f = null;
            this.f28873e = 1;
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
