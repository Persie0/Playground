package com.lingq.feature.chat.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.chat.LynxChatModel;
import com.lingq.core.domain.model.chat.LynxReasoningEffort;
import com.lingq.core.network.api.requests.RequestChatNew;
import com.lingq.feature.chat.ChatMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.er1;
import p000.eu0;
import p000.hr1;
import p000.jr1;
import p000.kr1;
import p000.sw0;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.wi7;
import p000.xfa;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1", m4291f = "CreateConfiguredChatUseCase.kt", m4292l = {DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER, 43, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 53, 54, 56, 60, 73, 77, 79}, m4293m = "invokeSuspend", m4294v = 2)
final class CreateConfiguredChatUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ LynxReasoningEffort f25137H;

    /* JADX INFO: renamed from: a */
    public String f25138a;

    /* JADX INFO: renamed from: b */
    public String f25139b;

    /* JADX INFO: renamed from: c */
    public Ref$ObjectRef f25140c;

    /* JADX INFO: renamed from: d */
    public int f25141d;

    /* JADX INFO: renamed from: e */
    public int f25142e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f25143f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ sw0 f25144g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25145h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1996a f25146i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f25147j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f25148k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ LynxChatModel f25149l;

    /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2 */
    @c32(m4290c = "com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2", m4291f = "CreateConfiguredChatUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19942 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25150a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1996a f25151b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f25152c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f25153d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f25154e;

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2$1", m4291f = "CreateConfiguredChatUseCase.kt", m4292l = {80}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25155a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25156b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25157c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f25158d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1996a c1996a, String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f25156b = c1996a;
                this.f25157c = str;
                this.f25158d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f25156b, this.f25157c, this.f25158d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25155a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25156b.f25208a;
                    this.f25155a = 1;
                    if (((C1289e) zw0Var).m7160j(this.f25157c, this.f25158d, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1$2$2", m4291f = "CreateConfiguredChatUseCase.kt", m4292l = {81}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25159a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25160b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25161c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f25162d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1996a c1996a, String str, int i, Continuation continuation) {
                super(2, continuation);
                this.f25160b = c1996a;
                this.f25161c = str;
                this.f25162d = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f25160b, this.f25161c, this.f25162d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25159a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25160b.f25208a;
                    this.f25159a = 1;
                    if (((C1289e) zw0Var).m7159i(this.f25162d, this.f25161c, this) == coroutineSingletons) {
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
        public C19942(C1996a c1996a, String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.f25151b = c1996a;
            this.f25152c = str;
            this.f25153d = str2;
            this.f25154e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19942 c19942 = new C19942(this.f25151b, this.f25152c, this.f25153d, this.f25154e, continuation);
            c19942.f25150a = obj;
            return c19942;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19942 c19942 = (C19942) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19942.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f25150a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = this.f25153d;
            C1996a c1996a = this.f25151b;
            String str2 = this.f25152c;
            wfb.m23926u(un1Var, null, null, new AnonymousClass1(c1996a, str2, str, null), 3);
            wfb.m23926u(un1Var, null, null, new AnonymousClass2(c1996a, str2, this.f25154e, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateConfiguredChatUseCase$invoke$1(sw0 sw0Var, String str, C1996a c1996a, String str2, String str3, LynxChatModel lynxChatModel, LynxReasoningEffort lynxReasoningEffort, Continuation continuation) {
        super(2, continuation);
        this.f25144g = sw0Var;
        this.f25145h = str;
        this.f25146i = c1996a;
        this.f25147j = str2;
        this.f25148k = str3;
        this.f25149l = lynxChatModel;
        this.f25137H = lynxReasoningEffort;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateConfiguredChatUseCase$invoke$1 createConfiguredChatUseCase$invoke$1 = new CreateConfiguredChatUseCase$invoke$1(this.f25144g, this.f25145h, this.f25146i, this.f25147j, this.f25148k, this.f25149l, this.f25137H, continuation);
        createConfiguredChatUseCase$invoke$1.f25143f = obj;
        return createConfiguredChatUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateConfiguredChatUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0044 A[PHI: r0 r1 r2 r14
      0x0044: PHI (r0v22 int) = (r0v20 int), (r0v27 int) binds: [B:45:0x0133, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r1v12 java.lang.String) = (r1v10 java.lang.String), (r1v14 java.lang.String) binds: [B:45:0x0133, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r2v9 java.lang.String) = (r2v7 java.lang.String), (r2v12 java.lang.String) binds: [B:45:0x0133, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r14v3 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1) = 
      (r5v0 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1)
      (r14v4 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1)
     binds: [B:45:0x0133, B:13:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae A[PHI: r0 r3
      0x00ae: PHI (r0v6 java.lang.String) = (r0v4 java.lang.String), (r0v7 java.lang.String) binds: [B:24:0x00aa, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r3v8 java.lang.Object) = (r3v7 java.lang.Object), (r3v13 java.lang.Object) binds: [B:24:0x00aa, B:18:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:43:0x011c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0167  */
    /* JADX WARN: Code duplicated, block: B:53:0x016e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0183  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:9:0x0029 A[PHI: r0 r14
      0x0029: PHI (r0v32 int) = (r0v28 int), (r0v35 int) binds: [B:57:0x019a, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x0029: PHI (r14v7 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1) = 
      (r14v5 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1)
      (r14v8 com.lingq.feature.chat.domain.CreateConfiguredChatUseCase$invoke$1)
     binds: [B:57:0x019a, B:8:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        Object objM15542u;
        String serverId;
        Object objM7173w;
        String str2;
        String str3;
        int iIntValue;
        int i;
        String str4;
        int i2;
        String str5;
        String str6;
        hr1 hr1Var;
        int i3;
        Ref$ObjectRef ref$ObjectRef;
        eu0 eu0VarM7175y;
        kr1 kr1Var;
        int i4;
        jr1 jr1Var;
        er1 er1Var;
        C19942 c19942;
        CreateConfiguredChatUseCase$invoke$1 createConfiguredChatUseCase$invoke$1 = this;
        C1996a c1996a = createConfiguredChatUseCase$invoke$1.f25146i;
        zw0 zw0Var = c1996a.f25208a;
        e83 e83Var = (e83) createConfiguredChatUseCase$invoke$1.f25143f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = createConfiguredChatUseCase$invoke$1.f25142e;
        String str7 = createConfiguredChatUseCase$invoke$1.f25148k;
        String str8 = createConfiguredChatUseCase$invoke$1.f25147j;
        xfa xfaVar = xfa.f68157a;
        switch (i5) {
            case 0:
                AbstractC3193b.m15359b(obj);
                str = createConfiguredChatUseCase$invoke$1.f25144g.f61506a;
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = str;
                createConfiguredChatUseCase$invoke$1.f25142e = 1;
                if (((C1289e) zw0Var).m7154d(str8, str7, str, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                    wi7 wi7Var = ((C1368a) c1996a.f25209b).f18333D1;
                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                    createConfiguredChatUseCase$invoke$1.f25138a = str;
                    createConfiguredChatUseCase$invoke$1.f25142e = 2;
                    objM15542u = AbstractC3224d.m15542u(wi7Var, createConfiguredChatUseCase$invoke$1);
                    if (objM15542u != coroutineSingletons) {
                        serverId = (String) objM15542u;
                        if (serverId == null) {
                            serverId = ChatMode.Standard.getServerId();
                        }
                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                        createConfiguredChatUseCase$invoke$1.f25138a = str;
                        createConfiguredChatUseCase$invoke$1.f25139b = serverId;
                        createConfiguredChatUseCase$invoke$1.f25142e = 3;
                        C1289e c1289e = (C1289e) zw0Var;
                        c1289e.getClass();
                        objM7173w = c1289e.m7173w(str8, str7, new RequestChatNew(45, null, null, serverId), createConfiguredChatUseCase$invoke$1);
                        if (objM7173w != coroutineSingletons) {
                            str2 = str;
                            str3 = serverId;
                            iIntValue = ((Number) objM7173w).intValue();
                            if (iIntValue != -1) {
                                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                createConfiguredChatUseCase$invoke$1.f25138a = str2;
                                createConfiguredChatUseCase$invoke$1.f25139b = str3;
                                createConfiguredChatUseCase$invoke$1.f25141d = iIntValue;
                                createConfiguredChatUseCase$invoke$1.f25142e = 4;
                                if (((C1289e) zw0Var).m7155e(iIntValue, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str2, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                    i = iIntValue;
                                    str4 = str2;
                                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                    createConfiguredChatUseCase$invoke$1.f25138a = str4;
                                    createConfiguredChatUseCase$invoke$1.f25139b = str3;
                                    createConfiguredChatUseCase$invoke$1.f25141d = i;
                                    createConfiguredChatUseCase$invoke$1.f25142e = 5;
                                    if (((C1289e) zw0Var).m7150A(createConfiguredChatUseCase$invoke$1.f25147j, i, createConfiguredChatUseCase$invoke$1.f25149l, createConfiguredChatUseCase$invoke$1.f25137H, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                        i2 = i;
                                        str5 = str3;
                                        str6 = str4;
                                        hr1Var = new hr1(i2);
                                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                        createConfiguredChatUseCase$invoke$1.f25138a = str6;
                                        createConfiguredChatUseCase$invoke$1.f25139b = str5;
                                        createConfiguredChatUseCase$invoke$1.f25141d = i2;
                                        createConfiguredChatUseCase$invoke$1.f25142e = 6;
                                        if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                            i3 = i2;
                                            String str9 = str5;
                                            String str10 = str6;
                                            ref$ObjectRef = new Ref$ObjectRef();
                                            eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str10, str9);
                                            kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                                            createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                                            createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                                            createConfiguredChatUseCase$invoke$1.f25141d = i3;
                                            createConfiguredChatUseCase$invoke$1.f25142e = 7;
                                            if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                                i4 = i3;
                                                jr1Var = (jr1) ref$ObjectRef.f47718a;
                                                if (jr1Var != null) {
                                                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                    createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                                    createConfiguredChatUseCase$invoke$1.f25142e = 8;
                                                    if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                                    }
                                                } else {
                                                    er1Var = new er1(i4);
                                                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                    createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                                    createConfiguredChatUseCase$invoke$1.f25142e = 9;
                                                    if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                                        int i6 = i4;
                                                        c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i6, null);
                                                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                        createConfiguredChatUseCase$invoke$1.f25141d = i6;
                                                        createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                                        if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                wi7 wi7Var2 = ((C1368a) c1996a.f25209b).f18333D1;
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = str;
                createConfiguredChatUseCase$invoke$1.f25142e = 2;
                objM15542u = AbstractC3224d.m15542u(wi7Var2, createConfiguredChatUseCase$invoke$1);
                if (objM15542u != coroutineSingletons) {
                    serverId = (String) objM15542u;
                    if (serverId == null) {
                        serverId = ChatMode.Standard.getServerId();
                    }
                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                    createConfiguredChatUseCase$invoke$1.f25138a = str;
                    createConfiguredChatUseCase$invoke$1.f25139b = serverId;
                    createConfiguredChatUseCase$invoke$1.f25142e = 3;
                    C1289e c1289e2 = (C1289e) zw0Var;
                    c1289e2.getClass();
                    objM7173w = c1289e2.m7173w(str8, str7, new RequestChatNew(45, null, null, serverId), createConfiguredChatUseCase$invoke$1);
                    if (objM7173w != coroutineSingletons) {
                        str2 = str;
                        str3 = serverId;
                        iIntValue = ((Number) objM7173w).intValue();
                        if (iIntValue != -1) {
                            createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                            createConfiguredChatUseCase$invoke$1.f25138a = str2;
                            createConfiguredChatUseCase$invoke$1.f25139b = str3;
                            createConfiguredChatUseCase$invoke$1.f25141d = iIntValue;
                            createConfiguredChatUseCase$invoke$1.f25142e = 4;
                            if (((C1289e) zw0Var).m7155e(iIntValue, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str2, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                i = iIntValue;
                                str4 = str2;
                                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                createConfiguredChatUseCase$invoke$1.f25138a = str4;
                                createConfiguredChatUseCase$invoke$1.f25139b = str3;
                                createConfiguredChatUseCase$invoke$1.f25141d = i;
                                createConfiguredChatUseCase$invoke$1.f25142e = 5;
                                if (((C1289e) zw0Var).m7150A(createConfiguredChatUseCase$invoke$1.f25147j, i, createConfiguredChatUseCase$invoke$1.f25149l, createConfiguredChatUseCase$invoke$1.f25137H, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                    i2 = i;
                                    str5 = str3;
                                    str6 = str4;
                                    hr1Var = new hr1(i2);
                                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                    createConfiguredChatUseCase$invoke$1.f25138a = str6;
                                    createConfiguredChatUseCase$invoke$1.f25139b = str5;
                                    createConfiguredChatUseCase$invoke$1.f25141d = i2;
                                    createConfiguredChatUseCase$invoke$1.f25142e = 6;
                                    if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                        i3 = i2;
                                        String str11 = str5;
                                        String str12 = str6;
                                        ref$ObjectRef = new Ref$ObjectRef();
                                        eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str12, str11);
                                        kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                                        createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                                        createConfiguredChatUseCase$invoke$1.f25141d = i3;
                                        createConfiguredChatUseCase$invoke$1.f25142e = 7;
                                        if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                            i4 = i3;
                                            jr1Var = (jr1) ref$ObjectRef.f47718a;
                                            if (jr1Var != null) {
                                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                                createConfiguredChatUseCase$invoke$1.f25142e = 8;
                                                if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                                }
                                            } else {
                                                er1Var = new er1(i4);
                                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                                createConfiguredChatUseCase$invoke$1.f25142e = 9;
                                                if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                                    int i7 = i4;
                                                    c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i7, null);
                                                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                    createConfiguredChatUseCase$invoke$1.f25141d = i7;
                                                    createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                                    if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return xfaVar;
                    }
                }
                return coroutineSingletons;
            case 2:
                str = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                objM15542u = obj;
                serverId = (String) objM15542u;
                if (serverId == null) {
                    serverId = ChatMode.Standard.getServerId();
                }
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = str;
                createConfiguredChatUseCase$invoke$1.f25139b = serverId;
                createConfiguredChatUseCase$invoke$1.f25142e = 3;
                C1289e c1289e3 = (C1289e) zw0Var;
                c1289e3.getClass();
                objM7173w = c1289e3.m7173w(str8, str7, new RequestChatNew(45, null, null, serverId), createConfiguredChatUseCase$invoke$1);
                if (objM7173w != coroutineSingletons) {
                    str2 = str;
                    str3 = serverId;
                    iIntValue = ((Number) objM7173w).intValue();
                    if (iIntValue != -1) {
                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                        createConfiguredChatUseCase$invoke$1.f25138a = str2;
                        createConfiguredChatUseCase$invoke$1.f25139b = str3;
                        createConfiguredChatUseCase$invoke$1.f25141d = iIntValue;
                        createConfiguredChatUseCase$invoke$1.f25142e = 4;
                        if (((C1289e) zw0Var).m7155e(iIntValue, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str2, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                            i = iIntValue;
                            str4 = str2;
                            createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                            createConfiguredChatUseCase$invoke$1.f25138a = str4;
                            createConfiguredChatUseCase$invoke$1.f25139b = str3;
                            createConfiguredChatUseCase$invoke$1.f25141d = i;
                            createConfiguredChatUseCase$invoke$1.f25142e = 5;
                            if (((C1289e) zw0Var).m7150A(createConfiguredChatUseCase$invoke$1.f25147j, i, createConfiguredChatUseCase$invoke$1.f25149l, createConfiguredChatUseCase$invoke$1.f25137H, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                i2 = i;
                                str5 = str3;
                                str6 = str4;
                                hr1Var = new hr1(i2);
                                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                createConfiguredChatUseCase$invoke$1.f25138a = str6;
                                createConfiguredChatUseCase$invoke$1.f25139b = str5;
                                createConfiguredChatUseCase$invoke$1.f25141d = i2;
                                createConfiguredChatUseCase$invoke$1.f25142e = 6;
                                if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                    i3 = i2;
                                    String str13 = str5;
                                    String str14 = str6;
                                    ref$ObjectRef = new Ref$ObjectRef();
                                    eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str14, str13);
                                    kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                                    createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                                    createConfiguredChatUseCase$invoke$1.f25141d = i3;
                                    createConfiguredChatUseCase$invoke$1.f25142e = 7;
                                    if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                        i4 = i3;
                                        jr1Var = (jr1) ref$ObjectRef.f47718a;
                                        if (jr1Var != null) {
                                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                                            createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                            createConfiguredChatUseCase$invoke$1.f25142e = 8;
                                            if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                            }
                                        } else {
                                            er1Var = new er1(i4);
                                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                                            createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                            createConfiguredChatUseCase$invoke$1.f25142e = 9;
                                            if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                                int i8 = i4;
                                                c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i8, null);
                                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                                createConfiguredChatUseCase$invoke$1.f25141d = i8;
                                                createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                                if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return xfaVar;
                }
                return coroutineSingletons;
            case 3:
                String str15 = createConfiguredChatUseCase$invoke$1.f25139b;
                String str16 = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                str3 = str15;
                str2 = str16;
                objM7173w = obj;
                iIntValue = ((Number) objM7173w).intValue();
                if (iIntValue != -1) {
                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                    createConfiguredChatUseCase$invoke$1.f25138a = str2;
                    createConfiguredChatUseCase$invoke$1.f25139b = str3;
                    createConfiguredChatUseCase$invoke$1.f25141d = iIntValue;
                    createConfiguredChatUseCase$invoke$1.f25142e = 4;
                    if (((C1289e) zw0Var).m7155e(iIntValue, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str2, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                        i = iIntValue;
                        str4 = str2;
                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                        createConfiguredChatUseCase$invoke$1.f25138a = str4;
                        createConfiguredChatUseCase$invoke$1.f25139b = str3;
                        createConfiguredChatUseCase$invoke$1.f25141d = i;
                        createConfiguredChatUseCase$invoke$1.f25142e = 5;
                        if (((C1289e) zw0Var).m7150A(createConfiguredChatUseCase$invoke$1.f25147j, i, createConfiguredChatUseCase$invoke$1.f25149l, createConfiguredChatUseCase$invoke$1.f25137H, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                            i2 = i;
                            str5 = str3;
                            str6 = str4;
                            hr1Var = new hr1(i2);
                            createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                            createConfiguredChatUseCase$invoke$1.f25138a = str6;
                            createConfiguredChatUseCase$invoke$1.f25139b = str5;
                            createConfiguredChatUseCase$invoke$1.f25141d = i2;
                            createConfiguredChatUseCase$invoke$1.f25142e = 6;
                            if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                i3 = i2;
                                String str17 = str5;
                                String str18 = str6;
                                ref$ObjectRef = new Ref$ObjectRef();
                                eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str18, str17);
                                kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                                createConfiguredChatUseCase$invoke$1.f25141d = i3;
                                createConfiguredChatUseCase$invoke$1.f25142e = 7;
                                if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                    i4 = i3;
                                    jr1Var = (jr1) ref$ObjectRef.f47718a;
                                    if (jr1Var != null) {
                                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                                        createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                        createConfiguredChatUseCase$invoke$1.f25142e = 8;
                                        if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                        }
                                    } else {
                                        er1Var = new er1(i4);
                                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                                        createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                        createConfiguredChatUseCase$invoke$1.f25142e = 9;
                                        if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                            int i9 = i4;
                                            c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i9, null);
                                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                                            createConfiguredChatUseCase$invoke$1.f25141d = i9;
                                            createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                            if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                return xfaVar;
            case 4:
                int i10 = createConfiguredChatUseCase$invoke$1.f25141d;
                String str19 = createConfiguredChatUseCase$invoke$1.f25139b;
                String str20 = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                str3 = str19;
                str4 = str20;
                i = i10;
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = str4;
                createConfiguredChatUseCase$invoke$1.f25139b = str3;
                createConfiguredChatUseCase$invoke$1.f25141d = i;
                createConfiguredChatUseCase$invoke$1.f25142e = 5;
                if (((C1289e) zw0Var).m7150A(createConfiguredChatUseCase$invoke$1.f25147j, i, createConfiguredChatUseCase$invoke$1.f25149l, createConfiguredChatUseCase$invoke$1.f25137H, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                    i2 = i;
                    str5 = str3;
                    str6 = str4;
                    hr1Var = new hr1(i2);
                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                    createConfiguredChatUseCase$invoke$1.f25138a = str6;
                    createConfiguredChatUseCase$invoke$1.f25139b = str5;
                    createConfiguredChatUseCase$invoke$1.f25141d = i2;
                    createConfiguredChatUseCase$invoke$1.f25142e = 6;
                    if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                        i3 = i2;
                        String str110 = str5;
                        String str111 = str6;
                        ref$ObjectRef = new Ref$ObjectRef();
                        eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str111, str110);
                        kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                        createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                        createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                        createConfiguredChatUseCase$invoke$1.f25141d = i3;
                        createConfiguredChatUseCase$invoke$1.f25142e = 7;
                        if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                            i4 = i3;
                            jr1Var = (jr1) ref$ObjectRef.f47718a;
                            if (jr1Var != null) {
                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                createConfiguredChatUseCase$invoke$1.f25142e = 8;
                                if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            } else {
                                er1Var = new er1(i4);
                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                createConfiguredChatUseCase$invoke$1.f25141d = i4;
                                createConfiguredChatUseCase$invoke$1.f25142e = 9;
                                if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                    int i11 = i4;
                                    c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i11, null);
                                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                                    createConfiguredChatUseCase$invoke$1.f25141d = i11;
                                    createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                    if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                i2 = createConfiguredChatUseCase$invoke$1.f25141d;
                str5 = createConfiguredChatUseCase$invoke$1.f25139b;
                str6 = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                hr1Var = new hr1(i2);
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = str6;
                createConfiguredChatUseCase$invoke$1.f25139b = str5;
                createConfiguredChatUseCase$invoke$1.f25141d = i2;
                createConfiguredChatUseCase$invoke$1.f25142e = 6;
                if (e83Var.emit(hr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                    i3 = i2;
                    String str112 = str5;
                    String str113 = str6;
                    ref$ObjectRef = new Ref$ObjectRef();
                    eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str113, str112);
                    kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                    createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                    createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                    createConfiguredChatUseCase$invoke$1.f25141d = i3;
                    createConfiguredChatUseCase$invoke$1.f25142e = 7;
                    if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                        i4 = i3;
                        jr1Var = (jr1) ref$ObjectRef.f47718a;
                        if (jr1Var != null) {
                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                            createConfiguredChatUseCase$invoke$1.f25141d = i4;
                            createConfiguredChatUseCase$invoke$1.f25142e = 8;
                            if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            er1Var = new er1(i4);
                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                            createConfiguredChatUseCase$invoke$1.f25141d = i4;
                            createConfiguredChatUseCase$invoke$1.f25142e = 9;
                            if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                                int i12 = i4;
                                c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i12, null);
                                createConfiguredChatUseCase$invoke$1.f25143f = null;
                                createConfiguredChatUseCase$invoke$1.f25138a = null;
                                createConfiguredChatUseCase$invoke$1.f25139b = null;
                                createConfiguredChatUseCase$invoke$1.f25140c = null;
                                createConfiguredChatUseCase$invoke$1.f25141d = i12;
                                createConfiguredChatUseCase$invoke$1.f25142e = 10;
                                if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                i2 = createConfiguredChatUseCase$invoke$1.f25141d;
                str5 = createConfiguredChatUseCase$invoke$1.f25139b;
                str6 = createConfiguredChatUseCase$invoke$1.f25138a;
                AbstractC3193b.m15359b(obj);
                createConfiguredChatUseCase$invoke$1 = createConfiguredChatUseCase$invoke$1;
                i3 = i2;
                String str114 = str5;
                String str115 = str6;
                ref$ObjectRef = new Ref$ObjectRef();
                eu0VarM7175y = ((C1289e) zw0Var).m7175y(i3, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, str115, str114);
                kr1Var = new kr1(e83Var, i3, ref$ObjectRef, 0);
                createConfiguredChatUseCase$invoke$1.f25143f = e83Var;
                createConfiguredChatUseCase$invoke$1.f25138a = null;
                createConfiguredChatUseCase$invoke$1.f25139b = null;
                createConfiguredChatUseCase$invoke$1.f25140c = ref$ObjectRef;
                createConfiguredChatUseCase$invoke$1.f25141d = i3;
                createConfiguredChatUseCase$invoke$1.f25142e = 7;
                if (eu0VarM7175y.collect(kr1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                    i4 = i3;
                    jr1Var = (jr1) ref$ObjectRef.f47718a;
                    if (jr1Var != null) {
                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                        createConfiguredChatUseCase$invoke$1.f25141d = i4;
                        createConfiguredChatUseCase$invoke$1.f25142e = 8;
                        if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        er1Var = new er1(i4);
                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                        createConfiguredChatUseCase$invoke$1.f25141d = i4;
                        createConfiguredChatUseCase$invoke$1.f25142e = 9;
                        if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                            int i13 = i4;
                            c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i13, null);
                            createConfiguredChatUseCase$invoke$1.f25143f = null;
                            createConfiguredChatUseCase$invoke$1.f25138a = null;
                            createConfiguredChatUseCase$invoke$1.f25139b = null;
                            createConfiguredChatUseCase$invoke$1.f25140c = null;
                            createConfiguredChatUseCase$invoke$1.f25141d = i13;
                            createConfiguredChatUseCase$invoke$1.f25142e = 10;
                            if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                i4 = createConfiguredChatUseCase$invoke$1.f25141d;
                ref$ObjectRef = createConfiguredChatUseCase$invoke$1.f25140c;
                AbstractC3193b.m15359b(obj);
                createConfiguredChatUseCase$invoke$1 = createConfiguredChatUseCase$invoke$1;
                jr1Var = (jr1) ref$ObjectRef.f47718a;
                if (jr1Var != null) {
                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                    createConfiguredChatUseCase$invoke$1.f25141d = i4;
                    createConfiguredChatUseCase$invoke$1.f25142e = 8;
                    if (e83Var.emit(jr1Var, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                        return xfaVar;
                    }
                } else {
                    er1Var = new er1(i4);
                    createConfiguredChatUseCase$invoke$1.f25143f = null;
                    createConfiguredChatUseCase$invoke$1.f25138a = null;
                    createConfiguredChatUseCase$invoke$1.f25139b = null;
                    createConfiguredChatUseCase$invoke$1.f25140c = null;
                    createConfiguredChatUseCase$invoke$1.f25141d = i4;
                    createConfiguredChatUseCase$invoke$1.f25142e = 9;
                    if (e83Var.emit(er1Var, createConfiguredChatUseCase$invoke$1) != coroutineSingletons) {
                        int i14 = i4;
                        c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i14, null);
                        createConfiguredChatUseCase$invoke$1.f25143f = null;
                        createConfiguredChatUseCase$invoke$1.f25138a = null;
                        createConfiguredChatUseCase$invoke$1.f25139b = null;
                        createConfiguredChatUseCase$invoke$1.f25140c = null;
                        createConfiguredChatUseCase$invoke$1.f25141d = i14;
                        createConfiguredChatUseCase$invoke$1.f25142e = 10;
                        if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 9:
                i4 = createConfiguredChatUseCase$invoke$1.f25141d;
                AbstractC3193b.m15359b(obj);
                createConfiguredChatUseCase$invoke$1 = createConfiguredChatUseCase$invoke$1;
                int i15 = i4;
                c19942 = new C19942(c1996a, createConfiguredChatUseCase$invoke$1.f25147j, createConfiguredChatUseCase$invoke$1.f25148k, i15, null);
                createConfiguredChatUseCase$invoke$1.f25143f = null;
                createConfiguredChatUseCase$invoke$1.f25138a = null;
                createConfiguredChatUseCase$invoke$1.f25139b = null;
                createConfiguredChatUseCase$invoke$1.f25140c = null;
                createConfiguredChatUseCase$invoke$1.f25141d = i15;
                createConfiguredChatUseCase$invoke$1.f25142e = 10;
                if (vz1.m23649s(c19942, createConfiguredChatUseCase$invoke$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 10:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
