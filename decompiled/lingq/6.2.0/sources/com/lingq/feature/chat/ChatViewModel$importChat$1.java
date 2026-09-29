package com.lingq.feature.chat;

import com.lingq.core.data.repository.C1289e;
import com.lingq.core.domain.lesson.C1380b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.a23;
import p000.c32;
import p000.cma;
import p000.u14;
import p000.un1;
import p000.v94;
import p000.w14;
import p000.x14;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatViewModel$importChat$1", m4291f = "ChatViewModel.kt", m4292l = {1673, 1676}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatViewModel$importChat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2009m f24949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f24950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatViewModel$importChat$1(C2009m c2009m, int i, Continuation continuation) {
        super(2, continuation);
        this.f24949b = c2009m;
        this.f24950c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatViewModel$importChat$1(this.f24949b, this.f24950c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatViewModel$importChat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0119, code lost:
    
        if (r1.m7989c(r5, r2, r52) == r4) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object objM7165o;
        Object value2;
        Object value3;
        C2009m c2009m = this.f24949b;
        cma cmaVar = c2009m.f25273M;
        C3244l c3244l = c2009m.f25281U;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24948a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                objM7165o = obj;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, v94.m23191a((v94) value, null, null, false, false, null, null, 0, null, w14.f66218a, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -257, 1023)));
        a23 a23Var = c2009m.f25298k;
        String strMo4589b2 = cmaVar.mo4589b2();
        this.f24948a = 1;
        objM7165o = ((C1289e) a23Var.f90a).m7165o(this.f24950c, strMo4589b2, this);
        if (objM7165o != coroutineSingletons) {
        }
        return coroutineSingletons;
        int iIntValue = ((Number) objM7165o).intValue();
        if (iIntValue != -1) {
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, v94.m23191a((v94) value3, null, null, false, false, null, null, 0, null, new x14(iIntValue), false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -257, 1023)));
            C1380b c1380b = c2009m.f25308u;
            String strMo4589b3 = cmaVar.mo4589b2();
            this.f24948a = 2;
        } else {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, v94.m23191a((v94) value2, null, null, false, false, null, null, 0, null, u14.f63242a, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, false, null, false, null, null, null, -257, 1023)));
        }
        return xfa.f68157a;
    }
}
