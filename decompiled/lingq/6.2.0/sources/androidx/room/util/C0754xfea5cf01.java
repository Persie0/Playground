package androidx.room.util;

import androidx.room.AbstractC0746d;
import androidx.room.C0736a;
import androidx.room.Transactor$SQLiteTransactionType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d9a;
import p000.e9a;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", m4291f = "DBUtil.android.kt", m4292l = {56, 57, 59, 60, 172}, m4293m = "invokeSuspend")
public final class C0754xfea5cf01 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Transactor$SQLiteTransactionType f7014a;

    /* JADX INFO: renamed from: b */
    public int f7015b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f7016c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0746d f7017d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f7018e;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    @c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", m4291f = "DBUtil.android.kt", m4292l = {60}, m4293m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f7019a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f7020b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vi3 f7021c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f7021c = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7021c, continuation);
            anonymousClass1.f7020b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f7019a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f7019a = 1;
            Object objInvoke = this.f7021c.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0754xfea5cf01(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        super(2, continuation);
        this.f7017d = abstractC0746d;
        this.f7018e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0754xfea5cf01 c0754xfea5cf01 = new C0754xfea5cf01(this.f7018e, this.f7017d, continuation);
        c0754xfea5cf01.f7016c = obj;
        return c0754xfea5cf01;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0754xfea5cf01) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0092 A[PHI: r1 r10
      0x0092: PHI (r1v7 e9a) = (r1v4 e9a), (r1v12 e9a) binds: [B:31:0x008f, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x0092: PHI (r10v13 java.lang.Object) = (r10v11 java.lang.Object), (r10v0 java.lang.Object) binds: [B:31:0x008f, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType;
        e9a e9aVar;
        Transactor$SQLiteTransactionType transactor$SQLiteTransactionType2;
        e9a e9aVar2;
        e9a e9aVar3;
        Boolean boolMo2814a;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7015b;
        AbstractC0746d abstractC0746d = this.f7017d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e9a e9aVar4 = (e9a) this.f7016c;
            transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
            this.f7016c = e9aVar4;
            this.f7014a = transactor$SQLiteTransactionType;
            this.f7015b = 1;
            Boolean boolMo2814a2 = e9aVar4.mo2814a(this);
            if (boolMo2814a2 != coroutineSingletons) {
                e9aVar = e9aVar4;
                obj = boolMo2814a2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            transactor$SQLiteTransactionType = this.f7014a;
            e9aVar = (e9a) this.f7016c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                transactor$SQLiteTransactionType = this.f7014a;
                e9aVar3 = (e9a) this.f7016c;
                AbstractC3193b.m15359b(obj);
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar2 = e9aVar3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7018e, null);
                this.f7016c = e9aVar2;
                this.f7014a = null;
                this.f7015b = 3;
                obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    this.f7016c = obj;
                    this.f7015b = 4;
                    boolMo2814a = e9aVar2.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        Object obj3 = obj;
                        obj = boolMo2814a;
                        obj2 = obj3;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                e9aVar2 = (e9a) this.f7016c;
                AbstractC3193b.m15359b(obj);
                this.f7016c = obj;
                this.f7015b = 4;
                boolMo2814a = e9aVar2.mo2814a(this);
                if (boolMo2814a != coroutineSingletons) {
                    Object obj4 = obj;
                    obj = boolMo2814a;
                    obj2 = obj4;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                if (i == 5) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f7016c;
            AbstractC3193b.m15359b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C0736a c0736aM2836i = abstractC0746d.m2836i();
            c0736aM2836i.f6818b.m2856e(c0736aM2836i.f6821e, c0736aM2836i.f6822f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
            e9aVar2 = e9aVar;
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.f7018e, null);
            this.f7016c = e9aVar2;
            this.f7014a = null;
            this.f7015b = 3;
            obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass2, this);
            if (obj != coroutineSingletons) {
                this.f7016c = obj;
                this.f7015b = 4;
                boolMo2814a = e9aVar2.mo2814a(this);
                if (boolMo2814a != coroutineSingletons) {
                    Object obj5 = obj;
                    obj = boolMo2814a;
                    obj2 = obj5;
                    if (!((Boolean) obj).booleanValue()) {
                        C0736a c0736aM2836i2 = abstractC0746d.m2836i();
                        c0736aM2836i2.f6818b.m2856e(c0736aM2836i2.f6821e, c0736aM2836i2.f6822f);
                    }
                    return obj2;
                }
            }
        } else {
            C0736a c0736aM2836i3 = abstractC0746d.m2836i();
            this.f7016c = e9aVar;
            this.f7014a = transactor$SQLiteTransactionType;
            this.f7015b = 2;
            if (c0736aM2836i3.m2809b(this) != coroutineSingletons) {
                e9aVar3 = e9aVar;
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar2 = e9aVar3;
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(this.f7018e, null);
                this.f7016c = e9aVar2;
                this.f7014a = null;
                this.f7015b = 3;
                obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass3, this);
                if (obj != coroutineSingletons) {
                    this.f7016c = obj;
                    this.f7015b = 4;
                    boolMo2814a = e9aVar2.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        Object obj6 = obj;
                        obj = boolMo2814a;
                        obj2 = obj6;
                        if (!((Boolean) obj).booleanValue()) {
                            C0736a c0736aM2836i4 = abstractC0746d.m2836i();
                            c0736aM2836i4.f6818b.m2856e(c0736aM2836i4.f6821e, c0736aM2836i4.f6822f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
