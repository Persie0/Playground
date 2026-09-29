package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import dm.C5207g;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$updateLessonStat$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {495, 505}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$updateLessonStat$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29076e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f29077f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonCompleteViewModel f29078g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ double f29079h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$updateLessonStat$1(String str, LessonCompleteViewModel lessonCompleteViewModel, double d10, InterfaceC9968c<? super LessonCompleteViewModel$updateLessonStat$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29077f = str;
        this.f29078g = lessonCompleteViewModel;
        this.f29079h = d10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonCompleteViewModel$updateLessonStat$1(this.f29077f, this.f29078g, this.f29079h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonCompleteViewModel$updateLessonStat$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29076e;
        String str = this.f29077f;
        LessonCompleteViewModel lessonCompleteViewModel = this.f29078g;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        if (C5207g.m11106a(str, "Read")) {
            InterfaceC3324a interfaceC3324a = lessonCompleteViewModel.f28995d;
            String strMo498E1 = lessonCompleteViewModel.mo498E1();
            int i11 = lessonCompleteViewModel.f28973H;
            double d10 = this.f29079h;
            this.f29076e = 1;
            if (interfaceC3324a.mo9530r(0.0d, d10, i11, strMo498E1, this, false) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (C5207g.m11106a(str, "Listen")) {
            InterfaceC3324a interfaceC3324a2 = lessonCompleteViewModel.f28995d;
            String strMo498E2 = lessonCompleteViewModel.mo498E1();
            int i12 = lessonCompleteViewModel.f28973H;
            double d11 = this.f29079h;
            this.f29076e = 2;
            if (interfaceC3324a2.mo9530r(d11, 0.0d, i12, strMo498E2, this, false) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
