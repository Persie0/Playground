package com.lingq.feature.chat;

import androidx.compose.animation.core.C0059a;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.C3799yk;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.jv0;
import p000.kk8;
import p000.l70;
import p000.ss5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.ChatSessionScreenKt$ChatMessageTutorItem$3$1", m4291f = "ChatSessionScreen.kt", m4292l = {719, 733, 738}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatSessionScreenKt$ChatMessageTutorItem$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f24804b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f24805c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f24806d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0059a f24807e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ jv0 f24808f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24809g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f24810h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ t66 f24811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSessionScreenKt$ChatMessageTutorItem$3$1(boolean z, boolean z2, String str, C0059a c0059a, jv0 jv0Var, int i, t66 t66Var, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f24804b = z;
        this.f24805c = z2;
        this.f24806d = str;
        this.f24807e = c0059a;
        this.f24808f = jv0Var;
        this.f24809g = i;
        this.f24810h = t66Var;
        this.f24811i = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChatSessionScreenKt$ChatMessageTutorItem$3$1(this.f24804b, this.f24805c, this.f24806d, this.f24807e, this.f24808f, this.f24809g, this.f24810h, this.f24811i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatSessionScreenKt$ChatMessageTutorItem$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004d, code lost:
    
        if (r2.collect(r3, r13) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
    
        if (androidx.compose.animation.core.C0059a.m744c(r13.f24807e, r8, r9, null, r11, 12) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r1.m747f(r13, r13) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ChatSessionScreenKt$ChatMessageTutorItem$3$1 chatSessionScreenKt$ChatMessageTutorItem$3$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24803a;
        t66 t66Var = this.f24811i;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            boolean z = this.f24804b;
            C0059a c0059a = this.f24807e;
            if (z) {
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                kk8 kk8VarM1264n = AbstractC0278f.m1264n(new C3799yk(7, this.f24810h));
                C2007k c2007k = new C2007k(c0059a, ref$IntRef);
                this.f24803a = 1;
            } else if (this.f24805c) {
                String str = this.f24806d;
                if (str.length() == 0) {
                    Float f = new Float(1.0f);
                    this.f24803a = 2;
                } else {
                    Float f2 = new Float(1.0f);
                    fda fdaVarM21703b0 = ss5.m21703b0(l70.m15945h(str.length() * 4, 350, 1100), 0, io2.f44352d, 2);
                    this.f24803a = 3;
                    chatSessionScreenKt$ChatMessageTutorItem$3$1 = this;
                }
            } else {
                Float f3 = new Float(1.0f);
                this.f24803a = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else if (i == 2) {
            AbstractC3193b.m15359b(obj);
            t66Var.setValue(Boolean.TRUE);
        } else {
            if (i != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            chatSessionScreenKt$ChatMessageTutorItem$3$1 = this;
            t66Var.setValue(Boolean.TRUE);
            chatSessionScreenKt$ChatMessageTutorItem$3$1.f24808f.mo8869C();
        }
        return xfa.f68157a;
    }
}
