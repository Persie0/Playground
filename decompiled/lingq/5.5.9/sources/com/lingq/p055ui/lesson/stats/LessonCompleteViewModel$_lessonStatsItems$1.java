package com.lingq.p055ui.lesson.stats;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p278nh.AbstractC7791r;
import p278nh.C7780g;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lnh/r$i;", "Lkotlin/Pair;", "", "Lnh/g;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.stats.LessonCompleteViewModel$_lessonStatsItems$1", m19206f = "LessonCompleteViewModel.kt", m19207l = {113}, m19208m = "invokeSuspend")
final class LessonCompleteViewModel$_lessonStatsItems$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super AbstractC7791r.i>, Pair<? extends List<? extends C7780g>, ? extends Boolean>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29015e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f29016f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Pair f29017g;

    public LessonCompleteViewModel$_lessonStatsItems$1(InterfaceC9968c<? super LessonCompleteViewModel$_lessonStatsItems$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super AbstractC7791r.i> interfaceC7117d, Pair<? extends List<? extends C7780g>, ? extends Boolean> pair, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        LessonCompleteViewModel$_lessonStatsItems$1 lessonCompleteViewModel$_lessonStatsItems$1 = new LessonCompleteViewModel$_lessonStatsItems$1(interfaceC9968c);
        lessonCompleteViewModel$_lessonStatsItems$1.f29016f = interfaceC7117d;
        lessonCompleteViewModel$_lessonStatsItems$1.f29017g = pair;
        return lessonCompleteViewModel$_lessonStatsItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29015e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f29016f;
            Pair pair = this.f29017g;
            AbstractC7791r.i iVar = new AbstractC7791r.i((List) pair.f38012a, ((Boolean) pair.f38013b).booleanValue());
            this.f29016f = null;
            this.f29015e = 1;
            if (interfaceC7117d.mo1339r(iVar, this) == coroutineSingletons) {
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
