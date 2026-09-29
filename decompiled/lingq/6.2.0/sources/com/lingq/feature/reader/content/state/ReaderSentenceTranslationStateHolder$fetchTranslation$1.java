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
import p000.n23;
import p000.qx8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.content.state.ReaderSentenceTranslationStateHolder$fetchTranslation$1", m4291f = "ReaderSentenceTranslationStateHolder.kt", m4292l = {105, 106}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSentenceTranslationStateHolder$fetchTranslation$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2266c f28094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f28095c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSentenceTranslationStateHolder$fetchTranslation$1(C2266c c2266c, int i, Continuation continuation) {
        super(2, continuation);
        this.f28094b = c2266c;
        this.f28095c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSentenceTranslationStateHolder$fetchTranslation$1(this.f28094b, this.f28095c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSentenceTranslationStateHolder$fetchTranslation$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        if (r0 == r8) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Map map;
        qx8 qx8Var;
        Object objM15542u;
        Object value2;
        Map map2;
        qx8 qx8Var2;
        C2266c c2266c = this.f28094b;
        C3244l c3244l = c2266c.f28149e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28093a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f28095c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                n23 n23Var = c2266c.f28146b;
                String str = c2266c.f28151g;
                String str2 = c2266c.f28152h;
                int i3 = c2266c.f28153i;
                this.f28093a = 1;
                Object objM7306z = ((C1295k) n23Var.f52215a).m7306z(i3, i2 - 1, str, str2, this);
                if (objM7306z != coroutineSingletons) {
                    objM7306z = xfaVar;
                }
                if (objM7306z == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
                objM15542u = obj;
            }
            String str3 = (String) objM15542u;
            do {
                value2 = c3244l.getValue();
                map2 = (Map) value2;
                qx8Var2 = (qx8) map2.get(Integer.valueOf(i2));
                if (qx8Var2 == null) {
                    qx8Var2 = new qx8();
                }
            } while (!c3244l.m15570h(value2, AbstractC3194a.m15368U(map2, new Pair(Integer.valueOf(i2), qx8.m20194a(qx8Var2, false, false, str3, null, null, false, 49)))));
            return xfaVar;
            c83 c83VarM14346a = c2266c.f28145a.m14346a(c2266c.f28153i, c2266c.f28152h, i2);
            this.f28093a = 2;
            objM15542u = AbstractC3224d.m15542u(c83VarM14346a, this);
        } catch (Exception unused) {
            do {
                value = c3244l.getValue();
                map = (Map) value;
                qx8Var = (qx8) map.get(Integer.valueOf(i2));
                if (qx8Var == null) {
                    qx8Var = new qx8();
                }
            } while (!c3244l.m15570h(value, AbstractC3194a.m15368U(map, new Pair(Integer.valueOf(i2), qx8.m20194a(qx8Var, false, false, null, "Unable to load translation", null, false, 53)))));
        }
    }
}
