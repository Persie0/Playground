package com.lingq.p055ui.home.library;

import ci.InterfaceC2009b;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.uimodel.notification.UserNotice;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$networkMonthlyChallenges$1", m19206f = "LibraryViewModel.kt", m19207l = {832}, m19208m = "invokeSuspend")
final class LibraryViewModel$networkMonthlyChallenges$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24887e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24888f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$networkMonthlyChallenges$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$networkMonthlyChallenges$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24888f = libraryViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$networkMonthlyChallenges$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$networkMonthlyChallenges$1(this.f24888f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str;
        UserNotice userNotice;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24887e;
        LibraryViewModel libraryViewModel = this.f24888f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2009b interfaceC2009b = libraryViewModel.f24777j;
                String strMo498E1 = libraryViewModel.mo498E1();
                UserNotice userNotice2 = (UserNotice) libraryViewModel.f24787q0.getValue();
                if (userNotice2 == null || (str = userNotice2.f22075d) == null) {
                    str = "";
                }
                this.f24887e = 1;
                obj = interfaceC2009b.mo5988o(strMo498E1, str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            String[] strArr = (String[]) obj;
            if (libraryViewModel.f24787q0.getValue() != null) {
                if ((!(strArr.length == 0)) && ((libraryViewModel.mo9741p0(TooltipStep.MoveToKnown) || libraryViewModel.mo9741p0(TooltipStep.Finished)) && (userNotice = (UserNotice) libraryViewModel.f24787q0.getValue()) != null)) {
                    libraryViewModel.f24788r0.mo14371k(new Pair(userNotice, strArr));
                }
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
