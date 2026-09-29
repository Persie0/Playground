package com.lingq.p055ui.token;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.token.TokenViewModel$showTutorials$1", m19206f = "TokenViewModel.kt", m19207l = {1448}, m19208m = "invokeSuspend")
final class TokenViewModel$showTutorials$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31651e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ TokenViewModel f31652f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenViewModel$showTutorials$1(TokenViewModel tokenViewModel, InterfaceC9968c<? super TokenViewModel$showTutorials$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31652f = tokenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new TokenViewModel$showTutorials$1(this.f31652f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((TokenViewModel$showTutorials$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31651e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f31651e = 1;
            if (C7828f.m15567a(160L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        TokenViewModel tokenViewModel = this.f31652f;
        InterfaceC7379f interfaceC7379f = (InterfaceC7379f) tokenViewModel.f31437X.getValue();
        if (interfaceC7379f != null) {
            TooltipStep tooltipStep = TooltipStep.TapTranslation;
            boolean zMo9746v1 = tokenViewModel.mo9746v1(tooltipStep);
            C7138s c7138s = tokenViewModel.f31426R0;
            if (zMo9746v1 && (interfaceC7379f instanceof C7378e)) {
                c7138s.mo14371k(tooltipStep);
            }
            TooltipStep tooltipStep2 = TooltipStep.UpdateStatusHighlight;
            if (tokenViewModel.mo9746v1(tooltipStep2) && (interfaceC7379f instanceof C7374a)) {
                c7138s.mo14371k(tooltipStep2);
            }
            TooltipStep tooltipStep3 = TooltipStep.LingQSwipeUpHighlight;
            if (tokenViewModel.mo9746v1(tooltipStep3)) {
                c7138s.mo14371k(tooltipStep3);
            }
            TooltipStep tooltipStep4 = TooltipStep.DoYouKnowThisWord;
            if (tokenViewModel.mo9746v1(tooltipStep4) && (interfaceC7379f instanceof C7378e)) {
                c7138s.mo14371k(tooltipStep4);
            }
        }
        return C9072e.f47360a;
    }
}
