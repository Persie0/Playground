package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$playingVideoAndThenStop$1", m19206f = "LessonViewModel.kt", m19207l = {2047}, m19208m = "invokeSuspend")
final class LessonViewModel$playingVideoAndThenStop$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27731e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ double f27732f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ double f27733g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LessonViewModel f27734h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$playingVideoAndThenStop$1(double d10, double d11, LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$playingVideoAndThenStop$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27732f = d10;
        this.f27733g = d11;
        this.f27734h = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$playingVideoAndThenStop$1(this.f27732f, this.f27733g, this.f27734h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$playingVideoAndThenStop$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27731e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            long j10 = (long) (((this.f27732f + ((double) 0.5f)) - this.f27733g) * ((double) 1000.0f));
            this.f27731e = 1;
            if (C7828f.m15567a(j10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        this.f27734h.f27395F0.mo14371k(AbstractC4272e.b.f27869a);
        return C9072e.f47360a;
    }
}
