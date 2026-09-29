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
import p000.cr7;
import p000.d9a;
import p000.e9a;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1", m4291f = "DBUtil.android.kt", m4292l = {56, 57, 59, 60}, m4293m = "invokeSuspend")
public final class C0752xd8c50dd3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Transactor$SQLiteTransactionType f6995a;

    /* JADX INFO: renamed from: b */
    public int f6996b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f6997c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f6998d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f6999e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC0746d f7000f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ vi3 f7001g;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    @c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1$invokeSuspend$$inlined$internalPerform$1$1", m4291f = "DBUtil.android.kt", m4292l = {}, m4293m = "invokeSuspend")
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f7002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ vi3 f7003b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vi3 vi3Var, Continuation continuation) {
            super(2, continuation);
            this.f7003b = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f7003b, continuation);
            anonymousClass1.f7002a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            d9a d9aVar = (d9a) this.f7002a;
            d9aVar.getClass();
            return this.f7003b.invoke(((cr7) d9aVar).mo2816c());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0752xd8c50dd3(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation, boolean z, boolean z2) {
        super(2, continuation);
        this.f6998d = z;
        this.f6999e = z2;
        this.f7000f = abstractC0746d;
        this.f7001g = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0752xd8c50dd3 c0752xd8c50dd3 = new C0752xd8c50dd3(this.f7001g, this.f7000f, continuation, this.f6998d, this.f6999e);
        c0752xd8c50dd3.f6997c = obj;
        return c0752xd8c50dd3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0752xd8c50dd3) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[DONT_INVERT, PHI: r1 r12
      0x009c: PHI (r1v11 e9a) = (r1v8 e9a), (r1v16 e9a) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
      0x009c: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x0099, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[RETURN] */
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
        int i = this.f6996b;
        vi3 vi3Var = this.f7001g;
        AbstractC0746d abstractC0746d = this.f7000f;
        boolean z = this.f6999e;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            e9a e9aVar4 = (e9a) this.f6997c;
            if (!this.f6998d) {
                e9aVar4.getClass();
                return vi3Var.invoke(((cr7) e9aVar4).mo2816c());
            }
            transactor$SQLiteTransactionType = z ? Transactor$SQLiteTransactionType.DEFERRED : Transactor$SQLiteTransactionType.IMMEDIATE;
            if (z) {
                Transactor$SQLiteTransactionType transactor$SQLiteTransactionType3 = transactor$SQLiteTransactionType;
                e9aVar = e9aVar4;
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(vi3Var, null);
                this.f6997c = e9aVar;
                this.f6995a = null;
                this.f6996b = 3;
                obj = e9aVar.mo2815b(transactor$SQLiteTransactionType2, anonymousClass1, this);
                if (obj != coroutineSingletons) {
                    if (z) {
                        return obj;
                    }
                    this.f6997c = obj;
                    this.f6996b = 4;
                    boolMo2814a = e9aVar.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        Object obj3 = obj;
                        obj = boolMo2814a;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            C0736a c0736aM2836i = abstractC0746d.m2836i();
                            c0736aM2836i.f6818b.m2856e(c0736aM2836i.f6821e, c0736aM2836i.f6822f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f6997c = e9aVar4;
                this.f6995a = transactor$SQLiteTransactionType;
                this.f6996b = 1;
                Boolean boolMo2814a2 = e9aVar4.mo2814a(this);
                if (boolMo2814a2 != coroutineSingletons) {
                    e9aVar2 = e9aVar4;
                    obj = boolMo2814a2;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            transactor$SQLiteTransactionType = this.f6995a;
            e9aVar2 = (e9a) this.f6997c;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i == 2) {
                transactor$SQLiteTransactionType = this.f6995a;
                e9aVar3 = (e9a) this.f6997c;
                AbstractC3193b.m15359b(obj);
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar = e9aVar3;
                AnonymousClass1 anonymousClass2 = new AnonymousClass1(vi3Var, null);
                this.f6997c = e9aVar;
                this.f6995a = null;
                this.f6996b = 3;
                obj = e9aVar.mo2815b(transactor$SQLiteTransactionType2, anonymousClass2, this);
                if (obj != coroutineSingletons) {
                    if (z) {
                        return obj;
                    }
                    this.f6997c = obj;
                    this.f6996b = 4;
                    boolMo2814a = e9aVar.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        Object obj4 = obj;
                        obj = boolMo2814a;
                        obj2 = obj4;
                    }
                }
                return coroutineSingletons;
            }
            if (i == 3) {
                e9aVar = (e9a) this.f6997c;
                AbstractC3193b.m15359b(obj);
                if (z) {
                    return obj;
                }
                this.f6997c = obj;
                this.f6996b = 4;
                boolMo2814a = e9aVar.mo2814a(this);
                if (boolMo2814a != coroutineSingletons) {
                    Object obj5 = obj;
                    obj = boolMo2814a;
                    obj2 = obj5;
                }
                return coroutineSingletons;
            }
            if (i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f6997c;
            AbstractC3193b.m15359b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            C0736a c0736aM2836i2 = abstractC0746d.m2836i();
            c0736aM2836i2.f6818b.m2856e(c0736aM2836i2.f6821e, c0736aM2836i2.f6822f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
            e9aVar = e9aVar2;
            AnonymousClass1 anonymousClass3 = new AnonymousClass1(vi3Var, null);
            this.f6997c = e9aVar;
            this.f6995a = null;
            this.f6996b = 3;
            obj = e9aVar.mo2815b(transactor$SQLiteTransactionType2, anonymousClass3, this);
            if (obj != coroutineSingletons) {
                if (z) {
                    return obj;
                }
                this.f6997c = obj;
                this.f6996b = 4;
                boolMo2814a = e9aVar.mo2814a(this);
                if (boolMo2814a != coroutineSingletons) {
                    Object obj6 = obj;
                    obj = boolMo2814a;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        C0736a c0736aM2836i3 = abstractC0746d.m2836i();
                        c0736aM2836i3.f6818b.m2856e(c0736aM2836i3.f6821e, c0736aM2836i3.f6822f);
                    }
                    return obj2;
                }
            }
        } else {
            C0736a c0736aM2836i4 = abstractC0746d.m2836i();
            this.f6997c = e9aVar2;
            this.f6995a = transactor$SQLiteTransactionType;
            this.f6996b = 2;
            if (c0736aM2836i4.m2809b(this) != coroutineSingletons) {
                e9aVar3 = e9aVar2;
                transactor$SQLiteTransactionType2 = transactor$SQLiteTransactionType;
                e9aVar = e9aVar3;
                AnonymousClass1 anonymousClass4 = new AnonymousClass1(vi3Var, null);
                this.f6997c = e9aVar;
                this.f6995a = null;
                this.f6996b = 3;
                obj = e9aVar.mo2815b(transactor$SQLiteTransactionType2, anonymousClass4, this);
                if (obj != coroutineSingletons) {
                    if (z) {
                        return obj;
                    }
                    this.f6997c = obj;
                    this.f6996b = 4;
                    boolMo2814a = e9aVar.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        Object obj7 = obj;
                        obj = boolMo2814a;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            C0736a c0736aM2836i5 = abstractC0746d.m2836i();
                            c0736aM2836i5.f6818b.m2856e(c0736aM2836i5.f6821e, c0736aM2836i5.f6822f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return coroutineSingletons;
    }
}
