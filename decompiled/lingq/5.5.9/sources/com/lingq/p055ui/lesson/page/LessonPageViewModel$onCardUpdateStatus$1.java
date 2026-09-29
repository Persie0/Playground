package com.lingq.p055ui.lesson.page;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$onCardUpdateStatus$1", m19206f = "LessonPageViewModel.kt", m19207l = {1158, 1161, 1163}, m19208m = "invokeSuspend")
final class LessonPageViewModel$onCardUpdateStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28615e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28616f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f28617g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f28618h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$onCardUpdateStatus$1(int i10, LessonPageViewModel lessonPageViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28616f = lessonPageViewModel;
        this.f28617g = str;
        this.f28618h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$onCardUpdateStatus$1(this.f28618h, this.f28616f, this.f28617g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$onCardUpdateStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28615e;
        LessonPageViewModel lessonPageViewModel = this.f28616f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2008a interfaceC2008a = lessonPageViewModel.f28548d;
        String strMo498E1 = lessonPageViewModel.mo498E1();
        this.f28615e = 1;
        obj = interfaceC2008a.mo5965q(strMo498E1, this.f28617g, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C7374a c7374a = (C7374a) obj;
        if (c7374a != null) {
            int value = CardStatus.Ignored.getValue();
            int i11 = this.f28618h;
            String str = c7374a.f41142a;
            if (i11 == value) {
                InterfaceC2008a interfaceC2008a2 = lessonPageViewModel.f28548d;
                String strMo498E2 = lessonPageViewModel.mo498E1();
                this.f28615e = 2;
                if (interfaceC2008a2.mo5950b(i11, strMo498E2, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                InterfaceC2008a interfaceC2008a3 = lessonPageViewModel.f28548d;
                String strMo498E3 = lessonPageViewModel.mo498E1();
                this.f28615e = 3;
                if (interfaceC2008a3.mo5957i(i11, strMo498E3, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }
}
