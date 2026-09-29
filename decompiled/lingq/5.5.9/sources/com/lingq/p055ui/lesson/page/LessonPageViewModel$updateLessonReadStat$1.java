package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$updateLessonReadStat$1", m19206f = "LessonPageViewModel.kt", m19207l = {1053}, m19208m = "invokeSuspend")
final class LessonPageViewModel$updateLessonReadStat$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28703e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f28704f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28705g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonPageViewModel f28706h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f28707i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$updateLessonReadStat$1(int i10, int i11, LessonPageViewModel lessonPageViewModel, int i12, InterfaceC9968c<? super LessonPageViewModel$updateLessonReadStat$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28704f = i10;
        this.f28705g = i11;
        this.f28706h = lessonPageViewModel;
        this.f28707i = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageViewModel$updateLessonReadStat$1(this.f28704f, this.f28705g, this.f28706h, this.f28707i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageViewModel$updateLessonReadStat$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f28703e;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            int i12 = this.f28704f;
            if (i12 > 0 && (i10 = this.f28705g) > 0) {
                double d10 = ((double) i12) / ((double) i10);
                if (!Double.isNaN(d10) && !Double.isInfinite(d10) && d10 <= 1.0d) {
                    LessonPageViewModel lessonPageViewModel = this.f28706h;
                    InterfaceC3324a interfaceC3324a = lessonPageViewModel.f28552f;
                    String strMo498E1 = lessonPageViewModel.mo498E1();
                    int i13 = this.f28707i;
                    double dM16708X0 = ((double) C8573r0.m16708X0(d10 * 100.0d)) / 100.0d;
                    this.f28703e = 1;
                    if (interfaceC3324a.mo9530r((8 & 4) != 0 ? 0.0d : 0.0d, (8 & 8) != 0 ? 0.0d : dM16708X0, i13, strMo498E1, this, true) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
