package com.lingq.feature.chat.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.network.api.requests.RequestChatNew;
import com.lingq.feature.chat.ChatMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.d51;
import p000.e83;
import p000.er1;
import p000.eu0;
import p000.jr1;
import p000.sw0;
import p000.un1;
import p000.vz1;
import p000.wfb;
import p000.wi7;
import p000.xfa;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1", m4291f = "CreateChatUseCase.kt", m4292l = {38, DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 66, 83, 88, 91}, m4293m = "invokeSuspend", m4294v = 2)
final class CreateChatUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public String f25114a;

    /* JADX INFO: renamed from: b */
    public Ref$IntRef f25115b;

    /* JADX INFO: renamed from: c */
    public Ref$ObjectRef f25116c;

    /* JADX INFO: renamed from: d */
    public int f25117d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f25118e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ sw0 f25119f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f25120g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1996a f25121h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f25122i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f25123j;

    /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2 */
    @c32(m4290c = "com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2", m4291f = "CreateChatUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19932 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25124a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Ref$IntRef f25125b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C1996a f25126c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f25127d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ String f25128e;

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2$1", m4291f = "CreateChatUseCase.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25129a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25130b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25131c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f25132d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1996a c1996a, String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f25130b = c1996a;
                this.f25131c = str;
                this.f25132d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f25130b, this.f25131c, this.f25132d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25129a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25130b.f25208a;
                    this.f25129a = 1;
                    if (((C1289e) zw0Var).m7160j(this.f25131c, this.f25132d, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.CreateChatUseCase$invoke$1$2$2", m4291f = "CreateChatUseCase.kt", m4292l = {94}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25133a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25134b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25135c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ Ref$IntRef f25136d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1996a c1996a, String str, Ref$IntRef ref$IntRef, Continuation continuation) {
                super(2, continuation);
                this.f25134b = c1996a;
                this.f25135c = str;
                this.f25136d = ref$IntRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f25134b, this.f25135c, this.f25136d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25133a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25134b.f25208a;
                    int i2 = this.f25136d.f47716a;
                    this.f25133a = 1;
                    if (((C1289e) zw0Var).m7159i(i2, this.f25135c, this) == coroutineSingletons) {
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
        public C19932(Ref$IntRef ref$IntRef, C1996a c1996a, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.f25125b = ref$IntRef;
            this.f25126c = c1996a;
            this.f25127d = str;
            this.f25128e = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19932 c19932 = new C19932(this.f25125b, this.f25126c, this.f25127d, this.f25128e, continuation);
            c19932.f25124a = obj;
            return c19932;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19932 c19932 = (C19932) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19932.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f25124a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = this.f25128e;
            C1996a c1996a = this.f25126c;
            String str2 = this.f25127d;
            wfb.m23926u(un1Var, null, null, new AnonymousClass1(c1996a, str2, str, null), 3);
            Ref$IntRef ref$IntRef = this.f25125b;
            if (ref$IntRef.f47716a != -1) {
                wfb.m23926u(un1Var, null, null, new AnonymousClass2(c1996a, str2, ref$IntRef, null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateChatUseCase$invoke$1(sw0 sw0Var, String str, C1996a c1996a, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f25119f = sw0Var;
        this.f25120g = str;
        this.f25121h = c1996a;
        this.f25122i = str2;
        this.f25123j = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreateChatUseCase$invoke$1 createChatUseCase$invoke$1 = new CreateChatUseCase$invoke$1(this.f25119f, this.f25120g, this.f25121h, this.f25122i, this.f25123j, continuation);
        createChatUseCase$invoke$1.f25118e = obj;
        return createChatUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CreateChatUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0070 A[PHI: r3 r15
      0x0070: PHI (r3v7 java.lang.String) = (r3v5 java.lang.String), (r3v10 java.lang.String) binds: [B:19:0x006c, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]
      0x0070: PHI (r15v7 java.lang.Object) = (r15v6 java.lang.Object), (r15v0 java.lang.Object) binds: [B:19:0x006c, B:12:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:33:0x00da  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0115 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String serverId;
        eu0 eu0VarM7167q;
        Ref$IntRef ref$IntRef;
        Ref$ObjectRef ref$ObjectRef;
        d51 d51Var;
        Ref$IntRef ref$IntRef2;
        Ref$ObjectRef ref$ObjectRef2;
        jr1 jr1Var;
        int i;
        Ref$IntRef ref$IntRef3;
        er1 er1Var;
        Ref$IntRef ref$IntRef4;
        C19932 c19932;
        C1996a c1996a = this.f25121h;
        zw0 zw0Var = c1996a.f25208a;
        e83 e83Var = (e83) this.f25118e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f25117d;
        xfa xfaVar = xfa.f68157a;
        String str2 = this.f25123j;
        String str3 = this.f25122i;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(obj);
                String str4 = this.f25119f.f61506a;
                this.f25118e = e83Var;
                this.f25114a = str4;
                this.f25117d = 1;
                if (((C1289e) zw0Var).m7154d(str3, str2, str4, this) != coroutineSingletons) {
                    str = str4;
                    wi7 wi7Var = ((C1368a) c1996a.f25209b).f18333D1;
                    this.f25118e = e83Var;
                    this.f25114a = str;
                    this.f25117d = 2;
                    obj = AbstractC3224d.m15542u(wi7Var, this);
                    if (obj != coroutineSingletons) {
                        serverId = (String) obj;
                        if (serverId == null) {
                            serverId = ChatMode.Standard.getServerId();
                        }
                        C1289e c1289e = (C1289e) zw0Var;
                        c1289e.getClass();
                        str3.getClass();
                        str2.getClass();
                        str.getClass();
                        serverId.getClass();
                        eu0VarM7167q = c1289e.m7167q(c1289e.f16470d.m25832u(str3, new RequestChatNew(39, null, str, serverId)), str3, str2, null);
                        ref$IntRef = new Ref$IntRef();
                        ref$IntRef.f47716a = -1;
                        ref$ObjectRef = new Ref$ObjectRef();
                        d51Var = new d51(ref$IntRef, e83Var, ref$ObjectRef, 1);
                        this.f25118e = e83Var;
                        this.f25114a = null;
                        this.f25115b = ref$IntRef;
                        this.f25116c = ref$ObjectRef;
                        this.f25117d = 3;
                        if (eu0VarM7167q.collect(d51Var, this) != coroutineSingletons) {
                            ref$IntRef2 = ref$IntRef;
                            ref$ObjectRef2 = ref$ObjectRef;
                            jr1Var = (jr1) ref$ObjectRef2.f47718a;
                            if (jr1Var != null) {
                                this.f25118e = null;
                                this.f25114a = null;
                                this.f25115b = null;
                                this.f25116c = null;
                                this.f25117d = 4;
                                if (e83Var.emit(jr1Var, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            } else {
                                i = ref$IntRef2.f47716a;
                                if (i != -1) {
                                    er1Var = new er1(i);
                                    this.f25118e = null;
                                    this.f25114a = null;
                                    this.f25115b = ref$IntRef2;
                                    this.f25116c = null;
                                    this.f25117d = 5;
                                    if (e83Var.emit(er1Var, this) != coroutineSingletons) {
                                        ref$IntRef4 = ref$IntRef2;
                                        ref$IntRef3 = ref$IntRef4;
                                        c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                                        this.f25118e = null;
                                        this.f25114a = null;
                                        this.f25115b = null;
                                        this.f25116c = null;
                                        this.f25117d = 6;
                                        if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    }
                                } else {
                                    ref$IntRef3 = ref$IntRef2;
                                    c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                                    this.f25118e = null;
                                    this.f25114a = null;
                                    this.f25115b = null;
                                    this.f25116c = null;
                                    this.f25117d = 6;
                                    if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str = this.f25114a;
                AbstractC3193b.m15359b(obj);
                wi7 wi7Var2 = ((C1368a) c1996a.f25209b).f18333D1;
                this.f25118e = e83Var;
                this.f25114a = str;
                this.f25117d = 2;
                obj = AbstractC3224d.m15542u(wi7Var2, this);
                if (obj != coroutineSingletons) {
                    serverId = (String) obj;
                    if (serverId == null) {
                        serverId = ChatMode.Standard.getServerId();
                    }
                    C1289e c1289e2 = (C1289e) zw0Var;
                    c1289e2.getClass();
                    str3.getClass();
                    str2.getClass();
                    str.getClass();
                    serverId.getClass();
                    eu0VarM7167q = c1289e2.m7167q(c1289e2.f16470d.m25832u(str3, new RequestChatNew(39, null, str, serverId)), str3, str2, null);
                    ref$IntRef = new Ref$IntRef();
                    ref$IntRef.f47716a = -1;
                    ref$ObjectRef = new Ref$ObjectRef();
                    d51Var = new d51(ref$IntRef, e83Var, ref$ObjectRef, 1);
                    this.f25118e = e83Var;
                    this.f25114a = null;
                    this.f25115b = ref$IntRef;
                    this.f25116c = ref$ObjectRef;
                    this.f25117d = 3;
                    if (eu0VarM7167q.collect(d51Var, this) != coroutineSingletons) {
                        ref$IntRef2 = ref$IntRef;
                        ref$ObjectRef2 = ref$ObjectRef;
                        jr1Var = (jr1) ref$ObjectRef2.f47718a;
                        if (jr1Var != null) {
                            this.f25118e = null;
                            this.f25114a = null;
                            this.f25115b = null;
                            this.f25116c = null;
                            this.f25117d = 4;
                            if (e83Var.emit(jr1Var, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            i = ref$IntRef2.f47716a;
                            if (i != -1) {
                                er1Var = new er1(i);
                                this.f25118e = null;
                                this.f25114a = null;
                                this.f25115b = ref$IntRef2;
                                this.f25116c = null;
                                this.f25117d = 5;
                                if (e83Var.emit(er1Var, this) != coroutineSingletons) {
                                    ref$IntRef4 = ref$IntRef2;
                                    ref$IntRef3 = ref$IntRef4;
                                    c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                                    this.f25118e = null;
                                    this.f25114a = null;
                                    this.f25115b = null;
                                    this.f25116c = null;
                                    this.f25117d = 6;
                                    if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            } else {
                                ref$IntRef3 = ref$IntRef2;
                                c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                                this.f25118e = null;
                                this.f25114a = null;
                                this.f25115b = null;
                                this.f25116c = null;
                                this.f25117d = 6;
                                if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                str = this.f25114a;
                AbstractC3193b.m15359b(obj);
                serverId = (String) obj;
                if (serverId == null) {
                    serverId = ChatMode.Standard.getServerId();
                }
                C1289e c1289e3 = (C1289e) zw0Var;
                c1289e3.getClass();
                str3.getClass();
                str2.getClass();
                str.getClass();
                serverId.getClass();
                eu0VarM7167q = c1289e3.m7167q(c1289e3.f16470d.m25832u(str3, new RequestChatNew(39, null, str, serverId)), str3, str2, null);
                ref$IntRef = new Ref$IntRef();
                ref$IntRef.f47716a = -1;
                ref$ObjectRef = new Ref$ObjectRef();
                d51Var = new d51(ref$IntRef, e83Var, ref$ObjectRef, 1);
                this.f25118e = e83Var;
                this.f25114a = null;
                this.f25115b = ref$IntRef;
                this.f25116c = ref$ObjectRef;
                this.f25117d = 3;
                if (eu0VarM7167q.collect(d51Var, this) != coroutineSingletons) {
                    ref$IntRef2 = ref$IntRef;
                    ref$ObjectRef2 = ref$ObjectRef;
                    jr1Var = (jr1) ref$ObjectRef2.f47718a;
                    if (jr1Var != null) {
                        this.f25118e = null;
                        this.f25114a = null;
                        this.f25115b = null;
                        this.f25116c = null;
                        this.f25117d = 4;
                        if (e83Var.emit(jr1Var, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        i = ref$IntRef2.f47716a;
                        if (i != -1) {
                            er1Var = new er1(i);
                            this.f25118e = null;
                            this.f25114a = null;
                            this.f25115b = ref$IntRef2;
                            this.f25116c = null;
                            this.f25117d = 5;
                            if (e83Var.emit(er1Var, this) != coroutineSingletons) {
                                ref$IntRef4 = ref$IntRef2;
                                ref$IntRef3 = ref$IntRef4;
                                c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                                this.f25118e = null;
                                this.f25114a = null;
                                this.f25115b = null;
                                this.f25116c = null;
                                this.f25117d = 6;
                                if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        } else {
                            ref$IntRef3 = ref$IntRef2;
                            c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                            this.f25118e = null;
                            this.f25114a = null;
                            this.f25115b = null;
                            this.f25116c = null;
                            this.f25117d = 6;
                            if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ref$ObjectRef2 = this.f25116c;
                ref$IntRef2 = this.f25115b;
                AbstractC3193b.m15359b(obj);
                jr1Var = (jr1) ref$ObjectRef2.f47718a;
                if (jr1Var != null) {
                    this.f25118e = null;
                    this.f25114a = null;
                    this.f25115b = null;
                    this.f25116c = null;
                    this.f25117d = 4;
                    if (e83Var.emit(jr1Var, this) == coroutineSingletons) {
                        return xfaVar;
                    }
                } else {
                    i = ref$IntRef2.f47716a;
                    if (i != -1) {
                        er1Var = new er1(i);
                        this.f25118e = null;
                        this.f25114a = null;
                        this.f25115b = ref$IntRef2;
                        this.f25116c = null;
                        this.f25117d = 5;
                        if (e83Var.emit(er1Var, this) != coroutineSingletons) {
                            ref$IntRef4 = ref$IntRef2;
                            ref$IntRef3 = ref$IntRef4;
                            c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                            this.f25118e = null;
                            this.f25114a = null;
                            this.f25115b = null;
                            this.f25116c = null;
                            this.f25117d = 6;
                            if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    } else {
                        ref$IntRef3 = ref$IntRef2;
                        c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                        this.f25118e = null;
                        this.f25114a = null;
                        this.f25115b = null;
                        this.f25116c = null;
                        this.f25117d = 6;
                        if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 5:
                ref$IntRef4 = this.f25115b;
                AbstractC3193b.m15359b(obj);
                ref$IntRef3 = ref$IntRef4;
                c19932 = new C19932(ref$IntRef3, c1996a, this.f25122i, this.f25123j, null);
                this.f25118e = null;
                this.f25114a = null;
                this.f25115b = null;
                this.f25116c = null;
                this.f25117d = 6;
                if (vz1.m23649s(c19932, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
