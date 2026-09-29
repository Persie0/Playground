package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$cardsForPage$1$1$3", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LessonViewModel$cardsForPage$1$1$3 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ int f27632e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27633f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$cardsForPage$1$1$3(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$cardsForPage$1$1$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27633f = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LessonViewModel$cardsForPage$1$1$3 lessonViewModel$cardsForPage$1$1$3 = new LessonViewModel$cardsForPage$1$1$3(this.f27633f, interfaceC9968c);
        lessonViewModel$cardsForPage$1$1$3.f27632e = ((Number) obj).intValue();
        return lessonViewModel$cardsForPage$1$1$3;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$cardsForPage$1$1$3) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        this.f27633f.f27479g1.setValue(new Integer(this.f27632e));
        return C9072e.f47360a;
    }
}
