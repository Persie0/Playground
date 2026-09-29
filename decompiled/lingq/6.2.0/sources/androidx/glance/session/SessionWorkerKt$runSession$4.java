package androidx.glance.session;

import android.content.Context;
import androidx.compose.runtime.C0281i;
import androidx.compose.runtime.Recomposer$State;
import androidx.glance.appwidget.C0656d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.e1a;
import p000.jq2;
import p000.mz8;
import p000.un1;
import p000.vz1;
import p000.w58;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$4", m4291f = "SessionWorker.kt", m4292l = {211}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorkerKt$runSession$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6206a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6207b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0281i f6208c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0696d f6209d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3244l f6210e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Context f6211f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ w58 f6212g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0701i f6213h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ e1a f6214i;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorkerKt$runSession$4$1 */
    @c32(m4290c = "androidx.glance.session.SessionWorkerKt$runSession$4$1", m4291f = "SessionWorker.kt", m4292l = {224, 231}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06911 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6215a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6216b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0696d f6217c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0281i f6218d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Ref$LongRef f6219e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3244l f6220f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f6221g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ w58 f6222h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ C0701i f6223i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ e1a f6224j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ un1 f6225k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06911(AbstractC0696d abstractC0696d, C0281i c0281i, Ref$LongRef ref$LongRef, C3244l c3244l, Context context, w58 w58Var, C0701i c0701i, e1a e1aVar, un1 un1Var, Continuation continuation) {
            super(2, continuation);
            this.f6217c = abstractC0696d;
            this.f6218d = c0281i;
            this.f6219e = ref$LongRef;
            this.f6220f = c3244l;
            this.f6221g = context;
            this.f6222h = w58Var;
            this.f6223i = c0701i;
            this.f6224j = e1aVar;
            this.f6225k = un1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C06911 c06911 = new C06911(this.f6217c, this.f6218d, this.f6219e, this.f6220f, this.f6221g, this.f6222h, this.f6223i, this.f6224j, this.f6225k, continuation);
            c06911.f6216b = obj;
            return c06911;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06911) create((Recomposer$State) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0086, code lost:
        
            if (r3 == r0) goto L28;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6215a;
            xfa xfaVar = xfa.f68157a;
            Ref$LongRef ref$LongRef = this.f6219e;
            C0281i c0281i = this.f6218d;
            C3244l c3244l = this.f6220f;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                } else {
                    if (i != 2) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                this.f6223i.m2500b(this.f6224j.f36578a);
                ref$LongRef.f47717a = c0281i.f3754a;
                return xfaVar;
            }
            AbstractC3193b.m15359b(obj);
            int i2 = mz8.f52086a[((Recomposer$State) this.f6216b).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    return xfaVar;
                }
                vz1.m23637j(this.f6225k, null);
                return xfaVar;
            }
            if (c0281i.f3754a > ref$LongRef.f47717a || !((Boolean) c3244l.getValue()).booleanValue()) {
                jq2 jq2Var = (jq2) this.f6222h.copy();
                this.f6215a = 1;
                C0656d c0656d = (C0656d) this.f6217c;
                c0656d.getClass();
                obj = C0656d.m2223d(c0656d, this.f6221g, jq2Var, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            ref$LongRef.f47717a = c0281i.f3754a;
            return xfaVar;
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            if (!((Boolean) c3244l.getValue()).booleanValue() && zBooleanValue) {
                Boolean bool = Boolean.TRUE;
                this.f6215a = 2;
                c3244l.emit(bool, this);
            }
            ref$LongRef.f47717a = c0281i.f3754a;
            return xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorkerKt$runSession$4(C0281i c0281i, AbstractC0696d abstractC0696d, C3244l c3244l, Context context, w58 w58Var, C0701i c0701i, e1a e1aVar, Continuation continuation) {
        super(2, continuation);
        this.f6208c = c0281i;
        this.f6209d = abstractC0696d;
        this.f6210e = c3244l;
        this.f6211f = context;
        this.f6212g = w58Var;
        this.f6213h = c0701i;
        this.f6214i = e1aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionWorkerKt$runSession$4 sessionWorkerKt$runSession$4 = new SessionWorkerKt$runSession$4(this.f6208c, this.f6209d, this.f6210e, this.f6211f, this.f6212g, this.f6213h, this.f6214i, continuation);
        sessionWorkerKt$runSession$4.f6207b = obj;
        return sessionWorkerKt$runSession$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorkerKt$runSession$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6206a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f6207b;
            Ref$LongRef ref$LongRef = new Ref$LongRef();
            C0281i c0281i = this.f6208c;
            ref$LongRef.f47717a = c0281i.f3754a;
            C3244l c3244l = c0281i.f3776w;
            C06911 c06911 = new C06911(this.f6209d, c0281i, ref$LongRef, this.f6210e, this.f6211f, this.f6212g, this.f6213h, this.f6214i, un1Var, null);
            this.f6206a = 1;
            if (AbstractC3224d.m15529h(c3244l, c06911, this) == coroutineSingletons) {
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
