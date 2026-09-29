package com.lingq.core.data.repository;

import com.lingq.core.network.api.result.ResultChatStreamEvent;
import java.io.BufferedReader;
import java.io.Closeable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.ll7;
import p000.ph2;
import p000.t62;
import p000.ul0;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl$processStreamResponse$1", m4291f = "ChatRepositoryImpl.kt", m4292l = {867}, m4293m = "invokeSuspend", m4294v = 2)
final class ChatRepositoryImpl$processStreamResponse$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f14962a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f14963b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Integer f14964c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ul0 f14965d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C1289e f14966e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f14967f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f14968g;

    /* JADX INFO: renamed from: com.lingq.core.data.repository.ChatRepositoryImpl$processStreamResponse$1$1 */
    @c32(m4290c = "com.lingq.core.data.repository.ChatRepositoryImpl$processStreamResponse$1$1", m4291f = "ChatRepositoryImpl.kt", m4292l = {876, 878, 897, 902, 907, 909, 914, 923, 928}, m4293m = "invokeSuspend", m4294v = 2)
    final class C12681 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ Integer f14969H;

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ ul0 f14970I;

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ ll7 f14971J;

        /* JADX INFO: renamed from: K */
        public final /* synthetic */ C1289e f14972K;

        /* JADX INFO: renamed from: L */
        public final /* synthetic */ String f14973L;

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ String f14974M;

        /* JADX INFO: renamed from: a */
        public Ref$ObjectRef f14975a;

        /* JADX INFO: renamed from: b */
        public Ref$IntRef f14976b;

        /* JADX INFO: renamed from: c */
        public Closeable f14977c;

        /* JADX INFO: renamed from: d */
        public C1289e f14978d;

        /* JADX INFO: renamed from: e */
        public Integer f14979e;

        /* JADX INFO: renamed from: f */
        public ll7 f14980f;

        /* JADX INFO: renamed from: g */
        public String f14981g;

        /* JADX INFO: renamed from: h */
        public String f14982h;

        /* JADX INFO: renamed from: i */
        public BufferedReader f14983i;

        /* JADX INFO: renamed from: j */
        public ResultChatStreamEvent f14984j;

        /* JADX INFO: renamed from: k */
        public int f14985k;

        /* JADX INFO: renamed from: l */
        public int f14986l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12681(Integer num, ul0 ul0Var, ll7 ll7Var, C1289e c1289e, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f14969H = num;
            this.f14970I = ul0Var;
            this.f14971J = ll7Var;
            this.f14972K = c1289e;
            this.f14973L = str;
            this.f14974M = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C12681(this.f14969H, this.f14970I, this.f14971J, this.f14972K, this.f14973L, this.f14974M, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C12681) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:169:0x0457 -> B:213:0x046f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0288 -> B:213:0x046f). Please report as a decompilation issue!!! */
        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 12381. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 1238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.ChatRepositoryImpl$processStreamResponse$1.C12681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatRepositoryImpl$processStreamResponse$1(Integer num, ul0 ul0Var, C1289e c1289e, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.f14964c = num;
        this.f14965d = ul0Var;
        this.f14966e = c1289e;
        this.f14967f = str;
        this.f14968g = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChatRepositoryImpl$processStreamResponse$1 chatRepositoryImpl$processStreamResponse$1 = new ChatRepositoryImpl$processStreamResponse$1(this.f14964c, this.f14965d, this.f14966e, this.f14967f, this.f14968g, continuation);
        chatRepositoryImpl$processStreamResponse$1.f14963b = obj;
        return chatRepositoryImpl$processStreamResponse$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ChatRepositoryImpl$processStreamResponse$1) create((ll7) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ll7 ll7Var = (ll7) this.f14963b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f14962a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            v72 v72Var = ph2.f56212a;
            t62 t62Var = t62.f61909c;
            C12681 c12681 = new C12681(this.f14964c, this.f14965d, ll7Var, this.f14966e, this.f14967f, this.f14968g, null);
            this.f14963b = null;
            this.f14962a = 1;
            if (wfb.m23905G(c12681, t62Var, this) == coroutineSingletons) {
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
