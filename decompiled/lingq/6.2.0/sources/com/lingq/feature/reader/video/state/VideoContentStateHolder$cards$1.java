package com.lingq.feature.reader.video.state;

import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.l83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$cards$1", m4291f = "VideoContentStateHolder.kt", m4292l = {92, 94}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$cards$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31455a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31456b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31457c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2595a f31458d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.video.state.VideoContentStateHolder$cards$1$1 */
    @c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$cards$1$1", m4291f = "VideoContentStateHolder.kt", m4292l = {98}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25931 extends SuspendLambda implements aj3 {

        /* JADX INFO: renamed from: a */
        public int f31459a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ e83 f31460b;

        @Override // p000.aj3
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            C25931 c25931 = new C25931(3, (Continuation) obj3);
            c25931.f31460b = (e83) obj;
            return c25931.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            e83 e83Var = this.f31460b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f31459a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                Map mapM15360M = AbstractC3194a.m15360M();
                this.f31460b = null;
                this.f31459a = 1;
                if (e83Var.emit(mapM15360M, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$cards$1(C2595a c2595a, Continuation continuation) {
        super(3, continuation);
        this.f31458d = c2595a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VideoContentStateHolder$cards$1 videoContentStateHolder$cards$1 = new VideoContentStateHolder$cards$1(this.f31458d, (Continuation) obj3);
        videoContentStateHolder$cards$1.f31456b = (e83) obj;
        videoContentStateHolder$cards$1.f31457c = (List) obj2;
        return videoContentStateHolder$cards$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r0, r3, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31456b;
        List list = this.f31457c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31455a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (list.isEmpty()) {
                Map mapM15360M = AbstractC3194a.m15360M();
                this.f31456b = null;
                this.f31457c = null;
                this.f31455a = 1;
            } else {
                C2595a c2595a = this.f31458d;
                l83 l83Var = new l83(c2595a.f31526c.m8210a((String) c2595a.f31532i.getValue(), list), new C25931(3, null), 1);
                this.f31456b = null;
                this.f31457c = null;
                this.f31455a = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
