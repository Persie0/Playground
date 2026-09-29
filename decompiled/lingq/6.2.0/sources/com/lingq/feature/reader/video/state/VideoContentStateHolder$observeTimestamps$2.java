package com.lingq.feature.reader.video.state;

import com.lingq.core.data.repository.C1295k;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$observeTimestamps$2", m4291f = "VideoContentStateHolder.kt", m4292l = {191, 193}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$observeTimestamps$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31476a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31477b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f31478c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2595a f31479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$observeTimestamps$2(C2595a c2595a, Continuation continuation) {
        super(3, continuation);
        this.f31479d = c2595a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VideoContentStateHolder$observeTimestamps$2 videoContentStateHolder$observeTimestamps$2 = new VideoContentStateHolder$observeTimestamps$2(this.f31479d, (Continuation) obj3);
        videoContentStateHolder$observeTimestamps$2.f31477b = (e83) obj;
        videoContentStateHolder$observeTimestamps$2.f31478c = (List) obj2;
        return videoContentStateHolder$observeTimestamps$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r0, r8, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r0.emit(kotlin.collections.EmptyList.f47638a, r7) == r2) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        return r2;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31477b;
        List list = this.f31478c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31476a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (list.isEmpty()) {
                this.f31477b = null;
                this.f31478c = null;
                this.f31476a = 2;
            } else {
                C2595a c2595a = this.f31479d;
                C3139j9 c3139j9 = c2595a.f31527d;
                int iIntValue = ((Number) c2595a.f31533j.getValue()).intValue();
                list.getClass();
                c83 c83VarM7254L = ((C1295k) c3139j9.f45229a).m7254L(iIntValue, list);
                this.f31477b = null;
                this.f31478c = null;
                this.f31476a = 1;
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
