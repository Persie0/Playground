package com.lingq.feature.reader.video.state;

import com.lingq.core.data.repository.C1287c;
import java.util.Locale;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.hm3;
import p000.on0;
import p000.ql3;
import p000.un0;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.state.VideoContentStateHolder$phrases$2", m4291f = "VideoContentStateHolder.kt", m4292l = {108, 110}, m4293m = "invokeSuspend", m4294v = 2)
final class VideoContentStateHolder$phrases$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f31495a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f31496b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Pair f31497c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2595a f31498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoContentStateHolder$phrases$2(C2595a c2595a, Continuation continuation) {
        super(3, continuation);
        this.f31498d = c2595a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VideoContentStateHolder$phrases$2 videoContentStateHolder$phrases$2 = new VideoContentStateHolder$phrases$2(this.f31498d, (Continuation) obj3);
        videoContentStateHolder$phrases$2.f31496b = (e83) obj;
        videoContentStateHolder$phrases$2.f31497c = (Pair) obj2;
        return videoContentStateHolder$phrases$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x008e A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f31496b;
        Pair pair = this.f31497c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31495a;
        xfa xfaVar = xfa.f68157a;
        int i2 = 2;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = (String) pair.f47623a;
            int iIntValue = ((Number) pair.f47624b).intValue();
            if (str.length() == 0 || iIntValue == 0) {
                Map mapM15360M = AbstractC3194a.m15360M();
                this.f31496b = null;
                this.f31497c = null;
                this.f31495a = 1;
                if (e83Var.emit(mapM15360M, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                ql3 ql3Var = this.f31498d.f31529f;
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                un0 un0Var = ((C1287c) ql3Var.f57897a).f16453b;
                c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity", "LessonsAndCardsJoin"}, new on0(iIntValue, un0Var, i2)));
                this.f31496b = null;
                this.f31497c = null;
                this.f31495a = 2;
                AbstractC3224d.m15539r(e83Var);
                Object objCollect = c83VarM15536o.collect(new hm3(e83Var, localeForLanguageTag, 0), this);
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objCollect = xfaVar;
                }
                if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    objCollect = xfaVar;
                }
                if (objCollect == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
