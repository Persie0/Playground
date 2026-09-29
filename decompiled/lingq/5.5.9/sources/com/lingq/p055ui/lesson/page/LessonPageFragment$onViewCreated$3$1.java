package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p159hi.C6052c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lhi/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$3$1", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<List<? extends C6052c>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f28502e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28503f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$3$1(int i10, LessonPageFragment lessonPageFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28503f = lessonPageFragment;
        this.f28504g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        LessonPageFragment$onViewCreated$3$1 lessonPageFragment$onViewCreated$3$1 = new LessonPageFragment$onViewCreated$3$1(this.f28504g, this.f28503f, interfaceC9968c);
        lessonPageFragment$onViewCreated$3$1.f28502e = obj;
        return lessonPageFragment$onViewCreated$3$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(List<? extends C6052c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$3$1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        List<C6052c> list = (List) this.f28502e;
        LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
        this.f28503f.m10192s0().m10144q2(this.f28504g, list);
        return C9072e.f47360a;
    }
}
