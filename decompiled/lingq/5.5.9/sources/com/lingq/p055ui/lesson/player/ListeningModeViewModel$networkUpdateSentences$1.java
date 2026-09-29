package com.lingq.p055ui.lesson.player;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeViewModel$networkUpdateSentences$1", m19206f = "ListeningModeViewModel.kt", m19207l = {116}, m19208m = "invokeSuspend")
final class ListeningModeViewModel$networkUpdateSentences$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28844e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeViewModel f28845f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28846g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeViewModel$networkUpdateSentences$1(ListeningModeViewModel listeningModeViewModel, int i10, InterfaceC9968c<? super ListeningModeViewModel$networkUpdateSentences$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28845f = listeningModeViewModel;
        this.f28846g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeViewModel$networkUpdateSentences$1(this.f28845f, this.f28846g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeViewModel$networkUpdateSentences$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28844e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                ListeningModeViewModel listeningModeViewModel = this.f28845f;
                InterfaceC3324a interfaceC3324a = listeningModeViewModel.f28807d;
                String strMo498E1 = listeningModeViewModel.mo498E1();
                int i11 = this.f28846g;
                this.f28844e = 1;
                if (interfaceC3324a.mo9524l(strMo498E1, i11, false, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
