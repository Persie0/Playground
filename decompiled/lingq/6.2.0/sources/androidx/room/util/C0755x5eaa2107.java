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

/* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1", m4291f = "DBUtil.android.kt", m4292l = {56, 57, 59, 60, 172}, m4293m = "invokeSuspend")
public final class C0755x5eaa2107 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Transactor$SQLiteTransactionType f7022a;

    /* JADX INFO: renamed from: b */
    public int f7023b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f7024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0746d f7025d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ vi3 f7026e;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1, reason: invalid class name */
    @c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$lambda$3$$inlined$internalPerform$1$1", m4291f = "DBUtil.android.kt", m4292l = {60}, m4293m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f7027a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f7028b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ vi3 f7029c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f7029c = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7029c, continuation);
            anonymousClass1.f7028b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f7027a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            this.f7027a = 1;
            Object objInvoke = this.f7029c.invoke(this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0755x5eaa2107(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation) {
        super(2, continuation);
        this.f7025d = abstractC0746d;
        this.f7026e = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0755x5eaa2107 c0755x5eaa2107 = new C0755x5eaa2107(this.f7026e, this.f7025d, continuation);
        c0755x5eaa2107.f7024c = obj;
        return c0755x5eaa2107;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0755x5eaa2107) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
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
        int i = this.f7023b;
        AbstractC0746d abstractC0746d = this.f7025d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e9a e9aVar4 = (e9a) this.f7024c;
            transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
            this.f7024c = e9aVar4;
            this.f7022a = transactor$SQLiteTransactionType;
            this.f7023b = 1;
            Boolean boolMo2814a2 = e9aVar4.mo2814a(this);
            if (boolMo2814a2 != coroutineSingletons) {
                e9aVar = e9aVar4;
                obj = boolMo2814a2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            transactor$SQLiteTransactionType = this.f7022a;
            e9aVar = (e9a) this.f7024c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                transactor$SQLiteTransactionType = this.f7022a;
                e9aVar3 = (e9a) this.f7024c;
                AbstractC3193b.m15359b(obj);
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar2 = e9aVar3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7026e, null);
                this.f7024c = e9aVar2;
                this.f7022a = null;
                this.f7023b = 3;
                obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    this.f7024c = obj;
                    this.f7023b = 4;
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
                e9aVar2 = (e9a) this.f7024c;
                AbstractC3193b.m15359b(obj);
                this.f7024c = obj;
                this.f7023b = 4;
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
            obj2 = this.f7024c;
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
            AnonymousClass1 anonymousClass2 = new AnonymousClass1(this.f7026e, null);
            this.f7024c = e9aVar2;
            this.f7022a = null;
            this.f7023b = 3;
            obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass2, this);
            if (obj != coroutineSingletons) {
                this.f7024c = obj;
                this.f7023b = 4;
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
            this.f7024c = e9aVar;
            this.f7022a = transactor$SQLiteTransactionType;
            this.f7023b = 2;
            if (c0736aM2836i3.m2809b(this) != coroutineSingletons) {
                e9aVar3 = e9aVar;
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar2 = e9aVar3;
                AnonymousClass1 anonymousClass3 = new AnonymousClass1(this.f7026e, null);
                this.f7024c = e9aVar2;
                this.f7022a = null;
                this.f7023b = 3;
                obj = e9aVar2.mo2815b(transactor$SQLiteTransactionType2, anonymousClass3, this);
                if (obj != coroutineSingletons) {
                    this.f7024c = obj;
                    this.f7023b = 4;
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
