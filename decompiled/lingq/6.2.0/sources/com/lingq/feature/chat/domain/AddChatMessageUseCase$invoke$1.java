package com.lingq.feature.chat.domain;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1289e;
import com.lingq.core.datastore.C1368a;
import com.lingq.feature.chat.ChatMode;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.C3602t8;
import p000.c32;
import p000.e83;
import p000.eu0;
import p000.tw0;
import p000.un1;
import p000.vw0;
import p000.vz1;
import p000.wfb;
import p000.wi7;
import p000.xfa;
import p000.yw0;
import p000.zi3;
import p000.zw0;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1", m4291f = "AddChatMessageUseCase.kt", m4292l = {34, DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, 42, 51, 63, 67, 69}, m4293m = "invokeSuspend", m4294v = 2)
final class AddChatMessageUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f25093a;

    /* JADX INFO: renamed from: b */
    public int f25094b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f25095c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1996a f25096d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f25097e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f25098f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f25099g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f25100h;

    /* JADX INFO: renamed from: com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2 */
    @c32(m4290c = "com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2", m4291f = "AddChatMessageUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C19922 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25101a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1996a f25102b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ String f25103c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f25104d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f25105e;

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2$1, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2$1", m4291f = "AddChatMessageUseCase.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25106a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25107b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25108c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ String f25109d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1996a c1996a, String str, String str2, Continuation continuation) {
                super(2, continuation);
                this.f25107b = c1996a;
                this.f25108c = str;
                this.f25109d = str2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.f25107b, this.f25108c, this.f25109d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25106a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25107b.f25208a;
                    this.f25106a = 1;
                    if (((C1289e) zw0Var).m7160j(this.f25108c, this.f25109d, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2$2, reason: invalid class name */
        @c32(m4290c = "com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1$2$2", m4291f = "AddChatMessageUseCase.kt", m4292l = {71}, m4293m = "invokeSuspend", m4294v = 2)
        final class AnonymousClass2 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public int f25110a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C1996a f25111b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ String f25112c;

            /* JADX INFO: renamed from: d */
            public final /* synthetic */ int f25113d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1996a c1996a, String str, int i, Continuation continuation) {
                super(2, continuation);
                this.f25111b = c1996a;
                this.f25112c = str;
                this.f25113d = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass2(this.f25111b, this.f25112c, this.f25113d, continuation);
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.f25110a;
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    zw0 zw0Var = this.f25111b.f25208a;
                    this.f25110a = 1;
                    if (((C1289e) zw0Var).m7159i(this.f25113d, this.f25112c, this) == coroutineSingletons) {
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
        public C19922(C1996a c1996a, String str, String str2, int i, Continuation continuation) {
            super(2, continuation);
            this.f25102b = c1996a;
            this.f25103c = str;
            this.f25104d = str2;
            this.f25105e = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C19922 c19922 = new C19922(this.f25102b, this.f25103c, this.f25104d, this.f25105e, continuation);
            c19922.f25101a = obj;
            return c19922;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C19922 c19922 = (C19922) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c19922.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f25101a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = this.f25104d;
            C1996a c1996a = this.f25102b;
            String str2 = this.f25103c;
            wfb.m23926u(un1Var, null, null, new AnonymousClass1(c1996a, str2, str, null), 3);
            wfb.m23926u(un1Var, null, null, new AnonymousClass2(c1996a, str2, this.f25105e, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddChatMessageUseCase$invoke$1(C1996a c1996a, String str, String str2, int i, String str3, Continuation continuation) {
        super(2, continuation);
        this.f25096d = c1996a;
        this.f25097e = str;
        this.f25098f = str2;
        this.f25099g = i;
        this.f25100h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AddChatMessageUseCase$invoke$1 addChatMessageUseCase$invoke$1 = new AddChatMessageUseCase$invoke$1(this.f25096d, this.f25097e, this.f25098f, this.f25099g, this.f25100h, continuation);
        addChatMessageUseCase$invoke$1.f25095c = obj;
        return addChatMessageUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AddChatMessageUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006d A[PHI: r12
      0x006d: PHI (r12v3 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1) = 
      (r5v0 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
      (r12v4 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
     binds: [B:19:0x0069, B:13:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0080 A[PHI: r0 r12
      0x0080: PHI (r0v13 java.lang.Object) = (r0v12 java.lang.Object), (r0v19 java.lang.Object) binds: [B:22:0x007c, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0080: PHI (r12v5 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1) = 
      (r12v3 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
      (r12v6 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
     binds: [B:22:0x007c, B:12:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8 A[PHI: r0 r12
      0x00b8: PHI (r0v20 kotlin.jvm.internal.Ref$ObjectRef) = (r0v16 kotlin.jvm.internal.Ref$ObjectRef), (r0v27 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:28:0x00b5, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x00b8: PHI (r12v7 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1) = 
      (r12v5 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
      (r12v8 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
     binds: [B:28:0x00b5, B:11:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00be  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dc A[PHI: r12
      0x00dc: PHI (r12v9 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1) = 
      (r12v7 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
      (r12v10 com.lingq.feature.chat.domain.AddChatMessageUseCase$invoke$1)
     binds: [B:36:0x00d9, B:8:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15542u;
        String serverId;
        Ref$ObjectRef ref$ObjectRef;
        eu0 eu0VarM7175y;
        C3602t8 c3602t8;
        yw0 yw0Var;
        C19922 c19922;
        AddChatMessageUseCase$invoke$1 addChatMessageUseCase$invoke$1 = this;
        C1996a c1996a = addChatMessageUseCase$invoke$1.f25096d;
        zw0 zw0Var = c1996a.f25208a;
        e83 e83Var = (e83) addChatMessageUseCase$invoke$1.f25095c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = addChatMessageUseCase$invoke$1.f25094b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                AbstractC3193b.m15359b(obj);
                addChatMessageUseCase$invoke$1.f25095c = e83Var;
                addChatMessageUseCase$invoke$1.f25094b = 1;
                if (((C1289e) zw0Var).m7155e(addChatMessageUseCase$invoke$1.f25099g, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25100h, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                    addChatMessageUseCase$invoke$1.f25095c = e83Var;
                    addChatMessageUseCase$invoke$1.f25094b = 2;
                    if (e83Var.emit(vw0.f66002a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                        wi7 wi7Var = ((C1368a) c1996a.f25209b).f18333D1;
                        addChatMessageUseCase$invoke$1.f25095c = e83Var;
                        addChatMessageUseCase$invoke$1.f25094b = 3;
                        objM15542u = AbstractC3224d.m15542u(wi7Var, addChatMessageUseCase$invoke$1);
                        if (objM15542u != coroutineSingletons) {
                            serverId = (String) objM15542u;
                            if (serverId == null) {
                                serverId = ChatMode.Standard.getServerId();
                            }
                            String str = serverId;
                            ref$ObjectRef = new Ref$ObjectRef();
                            eu0VarM7175y = ((C1289e) zw0Var).m7175y(addChatMessageUseCase$invoke$1.f25099g, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25100h, str);
                            c3602t8 = new C3602t8(0, e83Var, ref$ObjectRef);
                            addChatMessageUseCase$invoke$1.f25095c = e83Var;
                            addChatMessageUseCase$invoke$1.f25093a = ref$ObjectRef;
                            addChatMessageUseCase$invoke$1.f25094b = 4;
                            if (eu0VarM7175y.collect(c3602t8, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                yw0Var = (yw0) ref$ObjectRef.f47718a;
                                if (yw0Var != null) {
                                    addChatMessageUseCase$invoke$1.f25095c = null;
                                    addChatMessageUseCase$invoke$1.f25093a = null;
                                    addChatMessageUseCase$invoke$1.f25094b = 5;
                                    if (e83Var.emit(yw0Var, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                        return xfaVar;
                                    }
                                } else {
                                    addChatMessageUseCase$invoke$1.f25095c = null;
                                    addChatMessageUseCase$invoke$1.f25093a = null;
                                    addChatMessageUseCase$invoke$1.f25094b = 6;
                                    if (e83Var.emit(tw0.f62976a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                        c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                                        addChatMessageUseCase$invoke$1.f25095c = null;
                                        addChatMessageUseCase$invoke$1.f25093a = null;
                                        addChatMessageUseCase$invoke$1.f25094b = 7;
                                        if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                            return xfaVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                AbstractC3193b.m15359b(obj);
                addChatMessageUseCase$invoke$1.f25095c = e83Var;
                addChatMessageUseCase$invoke$1.f25094b = 2;
                if (e83Var.emit(vw0.f66002a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                    wi7 wi7Var2 = ((C1368a) c1996a.f25209b).f18333D1;
                    addChatMessageUseCase$invoke$1.f25095c = e83Var;
                    addChatMessageUseCase$invoke$1.f25094b = 3;
                    objM15542u = AbstractC3224d.m15542u(wi7Var2, addChatMessageUseCase$invoke$1);
                    if (objM15542u != coroutineSingletons) {
                        serverId = (String) objM15542u;
                        if (serverId == null) {
                            serverId = ChatMode.Standard.getServerId();
                        }
                        String str2 = serverId;
                        ref$ObjectRef = new Ref$ObjectRef();
                        eu0VarM7175y = ((C1289e) zw0Var).m7175y(addChatMessageUseCase$invoke$1.f25099g, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25100h, str2);
                        c3602t8 = new C3602t8(0, e83Var, ref$ObjectRef);
                        addChatMessageUseCase$invoke$1.f25095c = e83Var;
                        addChatMessageUseCase$invoke$1.f25093a = ref$ObjectRef;
                        addChatMessageUseCase$invoke$1.f25094b = 4;
                        if (eu0VarM7175y.collect(c3602t8, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                            yw0Var = (yw0) ref$ObjectRef.f47718a;
                            if (yw0Var != null) {
                                addChatMessageUseCase$invoke$1.f25095c = null;
                                addChatMessageUseCase$invoke$1.f25093a = null;
                                addChatMessageUseCase$invoke$1.f25094b = 5;
                                if (e83Var.emit(yw0Var, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                    return xfaVar;
                                }
                            } else {
                                addChatMessageUseCase$invoke$1.f25095c = null;
                                addChatMessageUseCase$invoke$1.f25093a = null;
                                addChatMessageUseCase$invoke$1.f25094b = 6;
                                if (e83Var.emit(tw0.f62976a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                    c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                                    addChatMessageUseCase$invoke$1.f25095c = null;
                                    addChatMessageUseCase$invoke$1.f25093a = null;
                                    addChatMessageUseCase$invoke$1.f25094b = 7;
                                    if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                        return xfaVar;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                AbstractC3193b.m15359b(obj);
                addChatMessageUseCase$invoke$1 = addChatMessageUseCase$invoke$1;
                wi7 wi7Var3 = ((C1368a) c1996a.f25209b).f18333D1;
                addChatMessageUseCase$invoke$1.f25095c = e83Var;
                addChatMessageUseCase$invoke$1.f25094b = 3;
                objM15542u = AbstractC3224d.m15542u(wi7Var3, addChatMessageUseCase$invoke$1);
                if (objM15542u != coroutineSingletons) {
                    serverId = (String) objM15542u;
                    if (serverId == null) {
                        serverId = ChatMode.Standard.getServerId();
                    }
                    String str3 = serverId;
                    ref$ObjectRef = new Ref$ObjectRef();
                    eu0VarM7175y = ((C1289e) zw0Var).m7175y(addChatMessageUseCase$invoke$1.f25099g, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25100h, str3);
                    c3602t8 = new C3602t8(0, e83Var, ref$ObjectRef);
                    addChatMessageUseCase$invoke$1.f25095c = e83Var;
                    addChatMessageUseCase$invoke$1.f25093a = ref$ObjectRef;
                    addChatMessageUseCase$invoke$1.f25094b = 4;
                    if (eu0VarM7175y.collect(c3602t8, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                        yw0Var = (yw0) ref$ObjectRef.f47718a;
                        if (yw0Var != null) {
                            addChatMessageUseCase$invoke$1.f25095c = null;
                            addChatMessageUseCase$invoke$1.f25093a = null;
                            addChatMessageUseCase$invoke$1.f25094b = 5;
                            if (e83Var.emit(yw0Var, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        } else {
                            addChatMessageUseCase$invoke$1.f25095c = null;
                            addChatMessageUseCase$invoke$1.f25093a = null;
                            addChatMessageUseCase$invoke$1.f25094b = 6;
                            if (e83Var.emit(tw0.f62976a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                                addChatMessageUseCase$invoke$1.f25095c = null;
                                addChatMessageUseCase$invoke$1.f25093a = null;
                                addChatMessageUseCase$invoke$1.f25094b = 7;
                                if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                    return xfaVar;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                AbstractC3193b.m15359b(obj);
                objM15542u = obj;
                addChatMessageUseCase$invoke$1 = addChatMessageUseCase$invoke$1;
                serverId = (String) objM15542u;
                if (serverId == null) {
                    serverId = ChatMode.Standard.getServerId();
                }
                String str4 = serverId;
                ref$ObjectRef = new Ref$ObjectRef();
                eu0VarM7175y = ((C1289e) zw0Var).m7175y(addChatMessageUseCase$invoke$1.f25099g, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25100h, str4);
                c3602t8 = new C3602t8(0, e83Var, ref$ObjectRef);
                addChatMessageUseCase$invoke$1.f25095c = e83Var;
                addChatMessageUseCase$invoke$1.f25093a = ref$ObjectRef;
                addChatMessageUseCase$invoke$1.f25094b = 4;
                if (eu0VarM7175y.collect(c3602t8, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                    yw0Var = (yw0) ref$ObjectRef.f47718a;
                    if (yw0Var != null) {
                        addChatMessageUseCase$invoke$1.f25095c = null;
                        addChatMessageUseCase$invoke$1.f25093a = null;
                        addChatMessageUseCase$invoke$1.f25094b = 5;
                        if (e83Var.emit(yw0Var, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                            return xfaVar;
                        }
                    } else {
                        addChatMessageUseCase$invoke$1.f25095c = null;
                        addChatMessageUseCase$invoke$1.f25093a = null;
                        addChatMessageUseCase$invoke$1.f25094b = 6;
                        if (e83Var.emit(tw0.f62976a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                            c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                            addChatMessageUseCase$invoke$1.f25095c = null;
                            addChatMessageUseCase$invoke$1.f25093a = null;
                            addChatMessageUseCase$invoke$1.f25094b = 7;
                            if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                                return xfaVar;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                ref$ObjectRef = addChatMessageUseCase$invoke$1.f25093a;
                AbstractC3193b.m15359b(obj);
                addChatMessageUseCase$invoke$1 = addChatMessageUseCase$invoke$1;
                yw0Var = (yw0) ref$ObjectRef.f47718a;
                if (yw0Var != null) {
                    addChatMessageUseCase$invoke$1.f25095c = null;
                    addChatMessageUseCase$invoke$1.f25093a = null;
                    addChatMessageUseCase$invoke$1.f25094b = 5;
                    if (e83Var.emit(yw0Var, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                        return xfaVar;
                    }
                } else {
                    addChatMessageUseCase$invoke$1.f25095c = null;
                    addChatMessageUseCase$invoke$1.f25093a = null;
                    addChatMessageUseCase$invoke$1.f25094b = 6;
                    if (e83Var.emit(tw0.f62976a, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                        c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                        addChatMessageUseCase$invoke$1.f25095c = null;
                        addChatMessageUseCase$invoke$1.f25093a = null;
                        addChatMessageUseCase$invoke$1.f25094b = 7;
                        if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                            return xfaVar;
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            case 6:
                AbstractC3193b.m15359b(obj);
                addChatMessageUseCase$invoke$1 = addChatMessageUseCase$invoke$1;
                c19922 = new C19922(c1996a, addChatMessageUseCase$invoke$1.f25097e, addChatMessageUseCase$invoke$1.f25098f, addChatMessageUseCase$invoke$1.f25099g, null);
                addChatMessageUseCase$invoke$1.f25095c = null;
                addChatMessageUseCase$invoke$1.f25093a = null;
                addChatMessageUseCase$invoke$1.f25094b = 7;
                if (vz1.m23649s(c19922, addChatMessageUseCase$invoke$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return xfaVar;
            case 7:
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
