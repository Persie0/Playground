package com.lingq.p055ui.lesson.page;

import ci.InterfaceC2026s;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.WordStatus;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$onKnown$1", m19206f = "LessonPageViewModel.kt", m19207l = {1171}, m19208m = "invokeSuspend")
final class LessonPageViewModel$onKnown$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28623e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageViewModel f28624f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28625g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f28626h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$onKnown$1(int i10, LessonPageViewModel lessonPageViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28624f = lessonPageViewModel;
        this.f28625g = i10;
        this.f28626h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$onKnown$1(this.f28625g, this.f28624f, this.f28626h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$onKnown$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28623e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageViewModel lessonPageViewModel = this.f28624f;
            InterfaceC2026s interfaceC2026s = lessonPageViewModel.f28550e;
            String strMo498E1 = lessonPageViewModel.mo498E1();
            int i11 = this.f28625g;
            String str = this.f28626h;
            String value = WordStatus.Known.getValue();
            this.f28623e = 1;
            if (interfaceC2026s.mo6192b(strMo498E1, i11, str, value, "Deal with blue word pop up", this) == coroutineSingletons) {
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
