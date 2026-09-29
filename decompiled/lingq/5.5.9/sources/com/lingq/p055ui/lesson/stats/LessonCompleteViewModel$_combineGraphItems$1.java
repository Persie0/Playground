package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p278nh.C7779f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$c;", "Lkotlin/Pair;", "Lnh/f;", "<name for destructuring parameter 0>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$_combineGraphItems$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {181}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$_combineGraphItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super AbstractC7791r.c>, Pair<? extends C7779f, ? extends C7779f>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29012e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f29013f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Pair f29014g;

    public LessonCompleteViewModel$_combineGraphItems$1(InterfaceC9968c<? super LessonCompleteViewModel$_combineGraphItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super AbstractC7791r.c> interfaceC7117d, Pair<? extends C7779f, ? extends C7779f> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonCompleteViewModel$_combineGraphItems$1 lessonCompleteViewModel$_combineGraphItems$1 = new LessonCompleteViewModel$_combineGraphItems$1(interfaceC9968c);
        lessonCompleteViewModel$_combineGraphItems$1.f29013f = interfaceC7117d;
        lessonCompleteViewModel$_combineGraphItems$1.f29014g = pair;
        return lessonCompleteViewModel$_combineGraphItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29012e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f29013f;
            Pair pair = this.f29014g;
            C7779f c7779f = (C7779f) pair.f38012a;
            C7779f c7779f2 = (C7779f) pair.f38013b;
            AbstractC7791r.c cVar = new AbstractC7791r.c(c7779f, c7779f2, (c7779f.f42714b == 0 && c7779f2.f42714b == 0) || (c7779f.f42715c.isEmpty() && c7779f2.f42715c.isEmpty()));
            this.f29013f = null;
            this.f29012e = 1;
            if (interfaceC7117d.mo1339r(cVar, this) == coroutineSingletons) {
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
