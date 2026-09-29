package com.lingq.feature.reader.video.state;

import com.lingq.core.datastore.C1371d;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e65;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoPlayerStateHolder$initialize$1", m4291f = "VideoPlayerStateHolder.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoPlayerStateHolder$initialize$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2597c f31522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f31523c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPlayerStateHolder$initialize$1(C2597c c2597c, int i, Continuation continuation) {
        super(2, continuation);
        this.f31522b = c2597c;
        this.f31523c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VideoPlayerStateHolder$initialize$1(this.f31522b, this.f31523c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VideoPlayerStateHolder$initialize$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31521a;
        C2597c c2597c = this.f31522b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83Var = ((C1371d) c2597c.f31551a).f18581r;
            this.f31521a = 1;
            obj = AbstractC3224d.m15541t(c83Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Integer num = (Integer) e65.m10872d(this.f31523c, (Map) obj);
        long j = 0;
        if (num != null) {
            long jIntValue = num.intValue();
            if (jIntValue >= 0) {
                j = jIntValue;
            }
        }
        c2597c.f31569s = j;
        return xfa.f68157a;
    }
}
