package com.lingq.feature.reader.content.state;

import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.qx8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderSentenceTranslationStateHolder$prefetchTranslation$2", m4291f = "ReaderSentenceTranslationStateHolder.kt", m4292l = {63}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSentenceTranslationStateHolder$prefetchTranslation$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28099a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2266c f28100b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28101c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSentenceTranslationStateHolder$prefetchTranslation$2(C2266c c2266c, int i, Continuation continuation) {
        super(2, continuation);
        this.f28100b = c2266c;
        this.f28101c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSentenceTranslationStateHolder$prefetchTranslation$2(this.f28100b, this.f28101c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSentenceTranslationStateHolder$prefetchTranslation$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map;
        qx8 qx8Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28099a;
        int i2 = this.f28101c;
        C2266c c2266c = this.f28100b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM14346a = c2266c.f28145a.m14346a(c2266c.f28153i, c2266c.f28152h, i2);
            this.f28099a = 1;
            obj = AbstractC3224d.m15542u(c83VarM14346a, this);
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
        String str = (String) obj;
        xfa xfaVar = xfa.f68157a;
        if (str == null || str.length() == 0) {
            c2266c.m9272a(i2);
            return xfaVar;
        }
        C3244l c3244l = c2266c.f28149e;
        do {
            value = c3244l.getValue();
            map = (Map) value;
            qx8Var = (qx8) map.get(Integer.valueOf(i2));
            if (qx8Var == null) {
                qx8Var = new qx8();
            }
        } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i2), qx8.m20194a(qx8Var, false, false, str, null, null, false, 57)))));
        return xfaVar;
    }
}
