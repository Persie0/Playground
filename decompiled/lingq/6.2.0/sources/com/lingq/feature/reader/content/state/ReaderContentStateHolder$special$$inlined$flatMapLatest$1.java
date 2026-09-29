package com.lingq.feature.reader.content.state;

import com.lingq.core.data.repository.C1287c;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.Pair;
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
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderContentStateHolder$special$$inlined$flatMapLatest$1", m4291f = "ReaderContentStateHolder.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderContentStateHolder$special$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28028a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28029b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f28030c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2264a f28031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderContentStateHolder$special$$inlined$flatMapLatest$1(C2264a c2264a, Continuation continuation) {
        super(3, continuation);
        this.f28031d = c2264a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderContentStateHolder$special$$inlined$flatMapLatest$1 readerContentStateHolder$special$$inlined$flatMapLatest$1 = new ReaderContentStateHolder$special$$inlined$flatMapLatest$1(this.f28031d, (Continuation) obj3);
        readerContentStateHolder$special$$inlined$flatMapLatest$1.f28029b = (e83) obj;
        readerContentStateHolder$special$$inlined$flatMapLatest$1.f28030c = obj2;
        return readerContentStateHolder$special$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f28029b;
        Object obj2 = this.f28030c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28028a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Pair pair = (Pair) obj2;
            String str = (String) pair.f47623a;
            int iIntValue = ((Number) pair.f47624b).intValue();
            ql3 ql3Var = this.f28031d.f28115d;
            str.getClass();
            Locale localeForLanguageTag = Locale.forLanguageTag(str);
            un0 un0Var = ((C1287c) ql3Var.f57897a).f16453b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(un0Var.f64101K, true, new String[]{"CardEntity", "LessonsAndCardsJoin"}, new on0(iIntValue, un0Var, 2)));
            this.f28029b = null;
            this.f28030c = null;
            this.f28028a = 1;
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
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
