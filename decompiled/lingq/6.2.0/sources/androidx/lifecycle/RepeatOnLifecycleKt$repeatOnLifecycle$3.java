package androidx.lifecycle;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.C3248a;
import p000.AbstractC3572sf;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.dp5;
import p000.jb5;
import p000.ph2;
import p000.rb5;
import p000.sm0;
import p000.un1;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.xq3;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", m4291f = "RepeatOnLifecycle.kt", m4292l = {83}, m4293m = "invokeSuspend", m4294v = 1)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6319a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6320b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC3572sf f6321c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Lifecycle$State f6322d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f6323e;

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1 */
    @c32(m4290c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", m4291f = "RepeatOnLifecycle.kt", m4292l = {161}, m4293m = "invokeSuspend", m4294v = 1)
    final class C07061 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public Ref$ObjectRef f6324a;

        /* JADX INFO: renamed from: b */
        public Ref$ObjectRef f6325b;

        /* JADX INFO: renamed from: c */
        public int f6326c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC3572sf f6327d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Lifecycle$State f6328e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ un1 f6329f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ zi3 f6330g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07061(AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, un1 un1Var, zi3 zi3Var, Continuation continuation) {
            super(2, continuation);
            this.f6327d = abstractC3572sf;
            this.f6328e = lifecycle$State;
            this.f6329f = un1Var;
            this.f6330g = zi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C07061(this.f6327d, this.f6328e, this.f6329f, this.f6330g, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07061) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0078  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:38:0x0093  */
        /* JADX WARN: Code duplicated, block: B:41:0x009c  */
        /* JADX WARN: Code duplicated, block: B:49:? A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Ref$ObjectRef ref$ObjectRef;
            Throwable th;
            Ref$ObjectRef ref$ObjectRef2;
            cd4 cd4Var;
            rb5 rb5Var;
            cd4 cd4Var2;
            rb5 rb5Var2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6326c;
            xfa xfaVar = xfa.f68157a;
            AbstractC3572sf abstractC3572sf = this.f6327d;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (abstractC3572sf.mo21327q() != Lifecycle$State.DESTROYED) {
                    Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                    ref$ObjectRef = new Ref$ObjectRef();
                    try {
                        Lifecycle$State lifecycle$State = this.f6328e;
                        un1 un1Var = this.f6329f;
                        zi3 zi3Var = this.f6330g;
                        this.f6324a = ref$ObjectRef3;
                        this.f6325b = ref$ObjectRef;
                        this.f6326c = 1;
                        sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(this));
                        sm0Var.m21468u();
                        try {
                            Lifecycle$Event.Companion.getClass();
                            C0709c c0709c = new C0709c(jb5.m14373c(lifecycle$State), ref$ObjectRef3, un1Var, jb5.m14371a(lifecycle$State), sm0Var, new C3248a(), zi3Var);
                            ref$ObjectRef.f47718a = c0709c;
                            abstractC3572sf.mo21323g(c0709c);
                            if (sm0Var.m21466r() == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            ref$ObjectRef2 = ref$ObjectRef3;
                            cd4Var2 = (cd4) ref$ObjectRef2.f47718a;
                            if (cd4Var2 != null) {
                                cd4Var2.mo4537a(null);
                            }
                            rb5Var2 = (rb5) ref$ObjectRef.f47718a;
                            if (rb5Var2 != null) {
                                abstractC3572sf.mo21331x(rb5Var2);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            ref$ObjectRef2 = ref$ObjectRef3;
                            cd4Var = (cd4) ref$ObjectRef2.f47718a;
                            if (cd4Var != null) {
                                cd4Var.mo4537a(null);
                            }
                            rb5Var = (rb5) ref$ObjectRef.f47718a;
                            if (rb5Var != null) {
                                throw th;
                            }
                            abstractC3572sf.mo21331x(rb5Var);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = this.f6325b;
                ref$ObjectRef2 = this.f6324a;
                try {
                    AbstractC3193b.m15359b(obj);
                    cd4Var2 = (cd4) ref$ObjectRef2.f47718a;
                    if (cd4Var2 != null) {
                        cd4Var2.mo4537a(null);
                    }
                    rb5Var2 = (rb5) ref$ObjectRef.f47718a;
                    if (rb5Var2 != null) {
                        abstractC3572sf.mo21331x(rb5Var2);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    cd4Var = (cd4) ref$ObjectRef2.f47718a;
                    if (cd4Var != null) {
                        cd4Var.mo4537a(null);
                    }
                    rb5Var = (rb5) ref$ObjectRef.f47718a;
                    if (rb5Var != null) {
                        throw th;
                    }
                    abstractC3572sf.mo21331x(rb5Var);
                    throw th;
                }
            }
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(AbstractC3572sf abstractC3572sf, Lifecycle$State lifecycle$State, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6321c = abstractC3572sf;
        this.f6322d = lifecycle$State;
        this.f6323e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f6321c, this.f6322d, this.f6323e, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f6320b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6319a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f6320b;
            v72 v72Var = ph2.f56212a;
            xq3 xq3Var = dp5.f36000a.f68538f;
            C07061 c07061 = new C07061(this.f6321c, this.f6322d, un1Var, this.f6323e, null);
            this.f6319a = 1;
            if (wfb.m23905G(c07061, xq3Var, this) == coroutineSingletons) {
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
