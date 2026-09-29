package com.lingq.feature.reader.content.state;

import com.lingq.core.data.repository.C1295k;
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
import p000.dx0;
import p000.o23;
import p000.qx8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderSentenceTranslationStateHolder$prefetchNotes$1", m4291f = "ReaderSentenceTranslationStateHolder.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSentenceTranslationStateHolder$prefetchNotes$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28096a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2266c f28097b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28098c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSentenceTranslationStateHolder$prefetchNotes$1(C2266c c2266c, int i, Continuation continuation) {
        super(2, continuation);
        this.f28097b = c2266c;
        this.f28098c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSentenceTranslationStateHolder$prefetchNotes$1(this.f28097b, this.f28098c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSentenceTranslationStateHolder$prefetchNotes$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map;
        qx8 qx8Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28096a;
        int i2 = this.f28098c;
        C2266c c2266c = this.f28097b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            o23 o23Var = c2266c.f28147c;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new dx0(((C1295k) o23Var.f53649a).m7253K(c2266c.f28153i, i2 - 1), c2266c.f28152h, 1));
            this.f28096a = 1;
            obj = AbstractC3224d.m15542u(c83VarM15536o, this);
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
        if (str != null && str.length() != 0) {
            C3244l c3244l = c2266c.f28149e;
            do {
                value = c3244l.getValue();
                map = (Map) value;
                qx8Var = (qx8) map.get(Integer.valueOf(i2));
                if (qx8Var == null) {
                    qx8Var = new qx8();
                }
            } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i2), qx8.m20194a(qx8Var, false, false, null, null, str, false, 47)))));
        }
        return xfa.f68157a;
    }
}
