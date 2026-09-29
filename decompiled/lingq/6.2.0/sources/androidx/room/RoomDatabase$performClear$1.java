package androidx.room;

import com.lingq.core.database.LingQDatabase_Impl;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d9a;
import p000.e9a;
import p000.fa4;
import p000.hi1;
import p000.sb2;
import p000.un1;
import p000.xfa;
import p000.xwc;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.room.RoomDatabase$performClear$1", m4291f = "RoomDatabase.android.kt", m4292l = {531}, m4293m = "invokeSuspend")
final class RoomDatabase$performClear$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6730a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LingQDatabase_Impl f6731b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String[] f6732c;

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1 */
    @c32(m4290c = "androidx.room.RoomDatabase$performClear$1$1", m4291f = "RoomDatabase.android.kt", m4292l = {532, 533, 535, 541, 542, 543}, m4293m = "invokeSuspend")
    final class C07311 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6733a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6734b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LingQDatabase_Impl f6735c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String[] f6736d;

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name */
        @c32(m4290c = "androidx.room.RoomDatabase$performClear$1$1$1", m4291f = "RoomDatabase.android.kt", m4292l = {537, 539}, m4293m = "invokeSuspend")
        final class AnonymousClass1 extends SuspendLambda implements zi3 {

            /* JADX INFO: renamed from: a */
            public String[] f6737a;

            /* JADX INFO: renamed from: b */
            public int f6738b;

            /* JADX INFO: renamed from: c */
            public int f6739c;

            /* JADX INFO: renamed from: d */
            public int f6740d;

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f6741e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ String[] f6742f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String[] strArr, Continuation continuation) {
                super(2, continuation);
                this.f6742f = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6742f, continuation);
                anonymousClass1.f6741e = obj;
                return anonymousClass1;
            }

            @Override // p000.zi3
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x003b  */
            /* JADX WARN: Code duplicated, block: B:15:0x0055 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0053 -> B:16:0x0056). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r9.f6740d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L29
                    if (r1 == r3) goto L21
                    if (r1 != r2) goto L1a
                    int r1 = r9.f6739c
                    int r4 = r9.f6738b
                    java.lang.String[] r5 = r9.f6737a
                    java.lang.Object r6 = r9.f6741e
                    d9a r6 = (p000.d9a) r6
                    kotlin.AbstractC3193b.m15359b(r10)
                    goto L56
                L1a:
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    p000.C3386nv.m17633t(r9)
                    r9 = 0
                    return r9
                L21:
                    java.lang.Object r1 = r9.f6741e
                    d9a r1 = (p000.d9a) r1
                    kotlin.AbstractC3193b.m15359b(r10)
                    goto L31
                L29:
                    kotlin.AbstractC3193b.m15359b(r10)
                    java.lang.Object r10 = r9.f6741e
                    r1 = r10
                    d9a r1 = (p000.d9a) r1
                L31:
                    java.lang.String[] r10 = r9.f6742f
                    int r4 = r10.length
                    r5 = 0
                    r6 = r1
                    r1 = r4
                    r4 = r5
                    r5 = r10
                L39:
                    if (r4 >= r1) goto L58
                    r10 = r5[r4]
                    java.lang.String r7 = "DELETE FROM `"
                    r8 = 96
                    java.lang.String r10 = p000.ux5.m22986i(r8, r7, r10)
                    r9.f6741e = r6
                    r9.f6737a = r5
                    r9.f6738b = r4
                    r9.f6739c = r1
                    r9.f6740d = r2
                    java.lang.Object r10 = p000.xwc.m24780r(r6, r10, r9)
                    if (r10 != r0) goto L56
                    return r0
                L56:
                    int r4 = r4 + r3
                    goto L39
                L58:
                    xfa r9 = p000.xfa.f68157a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase$performClear$1.C07311.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07311(LingQDatabase_Impl lingQDatabase_Impl, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.f6735c = lingQDatabase_Impl;
            this.f6736d = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C07311 c07311 = new C07311(this.f6735c, this.f6736d, continuation);
            c07311.f6734b = obj;
            return c07311;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07311) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x005d  */
        /* JADX WARN: Code duplicated, block: B:21:0x006d A[PHI: r1
          0x006d: PHI (r1v7 e9a) = (r1v4 e9a), (r1v4 e9a), (r1v9 e9a) binds: [B:17:0x005b, B:19:0x006a, B:10:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:24:0x0082 A[PHI: r1
          0x0082: PHI (r1v10 e9a) = (r1v7 e9a), (r1v12 e9a) binds: [B:22:0x007f, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:27:0x008e A[PHI: r1 r8
          0x008e: PHI (r1v13 e9a) = (r1v10 e9a), (r1v15 e9a) binds: [B:25:0x008b, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]
          0x008e: PHI (r8v13 java.lang.Object) = (r8v12 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x008b, B:8:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x0096  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[PHI: r1
          0x00a4: PHI (r1v16 e9a) = (r1v13 e9a), (r1v18 e9a) binds: [B:30:0x00a1, B:7:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
        
            if (p000.xwc.m24780r(r1, "VACUUM", r7) == r0) goto L34;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            e9a e9aVar;
            C0736a c0736aM2836i;
            Transactor$SQLiteTransactionType transactor$SQLiteTransactionType;
            AnonymousClass1 anonymousClass1;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6733a;
            LingQDatabase_Impl lingQDatabase_Impl = this.f6735c;
            switch (i) {
                case 0:
                    AbstractC3193b.m15359b(obj);
                    e9a e9aVar2 = (e9a) this.f6734b;
                    this.f6734b = e9aVar2;
                    this.f6733a = 1;
                    Boolean boolMo2814a = e9aVar2.mo2814a(this);
                    if (boolMo2814a != coroutineSingletons) {
                        e9aVar = e9aVar2;
                        obj = boolMo2814a;
                        if (((Boolean) obj).booleanValue()) {
                            transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                            anonymousClass1 = new AnonymousClass1(this.f6736d, null);
                            this.f6734b = e9aVar;
                            this.f6733a = 3;
                            if (e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this) != coroutineSingletons) {
                                this.f6734b = e9aVar;
                                this.f6733a = 4;
                                obj = e9aVar.mo2814a(this);
                                if (obj != coroutineSingletons) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f6734b = e9aVar;
                                        this.f6733a = 5;
                                        if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                            this.f6734b = null;
                                            this.f6733a = 6;
                                        }
                                        break;
                                    }
                                    return xfa.f68157a;
                                }
                            }
                        } else {
                            c0736aM2836i = lingQDatabase_Impl.m2836i();
                            this.f6734b = e9aVar;
                            this.f6733a = 2;
                            if (c0736aM2836i.m2809b(this) != coroutineSingletons) {
                                transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                                anonymousClass1 = new AnonymousClass1(this.f6736d, null);
                                this.f6734b = e9aVar;
                                this.f6733a = 3;
                                if (e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this) != coroutineSingletons) {
                                    this.f6734b = e9aVar;
                                    this.f6733a = 4;
                                    obj = e9aVar.mo2814a(this);
                                    if (obj != coroutineSingletons) {
                                        if (!((Boolean) obj).booleanValue()) {
                                            this.f6734b = e9aVar;
                                            this.f6733a = 5;
                                            if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                                this.f6734b = null;
                                                this.f6733a = 6;
                                            }
                                            break;
                                        }
                                        return xfa.f68157a;
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    e9aVar = (e9a) this.f6734b;
                    AbstractC3193b.m15359b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        c0736aM2836i = lingQDatabase_Impl.m2836i();
                        this.f6734b = e9aVar;
                        this.f6733a = 2;
                        if (c0736aM2836i.m2809b(this) != coroutineSingletons) {
                            transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                            anonymousClass1 = new AnonymousClass1(this.f6736d, null);
                            this.f6734b = e9aVar;
                            this.f6733a = 3;
                            if (e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this) != coroutineSingletons) {
                                this.f6734b = e9aVar;
                                this.f6733a = 4;
                                obj = e9aVar.mo2814a(this);
                                if (obj != coroutineSingletons) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.f6734b = e9aVar;
                                        this.f6733a = 5;
                                        if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                            this.f6734b = null;
                                            this.f6733a = 6;
                                        }
                                        break;
                                    }
                                    return xfa.f68157a;
                                }
                            }
                        }
                    } else {
                        transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                        anonymousClass1 = new AnonymousClass1(this.f6736d, null);
                        this.f6734b = e9aVar;
                        this.f6733a = 3;
                        if (e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this) != coroutineSingletons) {
                            this.f6734b = e9aVar;
                            this.f6733a = 4;
                            obj = e9aVar.mo2814a(this);
                            if (obj != coroutineSingletons) {
                                if (!((Boolean) obj).booleanValue()) {
                                    this.f6734b = e9aVar;
                                    this.f6733a = 5;
                                    if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                        this.f6734b = null;
                                        this.f6733a = 6;
                                    }
                                    break;
                                }
                                return xfa.f68157a;
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    e9aVar = (e9a) this.f6734b;
                    AbstractC3193b.m15359b(obj);
                    transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                    anonymousClass1 = new AnonymousClass1(this.f6736d, null);
                    this.f6734b = e9aVar;
                    this.f6733a = 3;
                    if (e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this) != coroutineSingletons) {
                        this.f6734b = e9aVar;
                        this.f6733a = 4;
                        obj = e9aVar.mo2814a(this);
                        if (obj != coroutineSingletons) {
                            if (!((Boolean) obj).booleanValue()) {
                                this.f6734b = e9aVar;
                                this.f6733a = 5;
                                if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                    this.f6734b = null;
                                    this.f6733a = 6;
                                }
                                break;
                            }
                            return xfa.f68157a;
                        }
                    }
                    return coroutineSingletons;
                case 3:
                    e9aVar = (e9a) this.f6734b;
                    AbstractC3193b.m15359b(obj);
                    this.f6734b = e9aVar;
                    this.f6733a = 4;
                    obj = e9aVar.mo2814a(this);
                    if (obj != coroutineSingletons) {
                        if (!((Boolean) obj).booleanValue()) {
                            this.f6734b = e9aVar;
                            this.f6733a = 5;
                            if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                                this.f6734b = null;
                                this.f6733a = 6;
                            }
                            break;
                        }
                        return xfa.f68157a;
                    }
                    return coroutineSingletons;
                case 4:
                    e9aVar = (e9a) this.f6734b;
                    AbstractC3193b.m15359b(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        this.f6734b = e9aVar;
                        this.f6733a = 5;
                        if (xwc.m24780r(e9aVar, "PRAGMA wal_checkpoint(FULL)", this) != coroutineSingletons) {
                            this.f6734b = null;
                            this.f6733a = 6;
                            break;
                        }
                        return coroutineSingletons;
                    }
                    return xfa.f68157a;
                case 5:
                    e9aVar = (e9a) this.f6734b;
                    AbstractC3193b.m15359b(obj);
                    this.f6734b = null;
                    this.f6733a = 6;
                    break;
                case 6:
                    AbstractC3193b.m15359b(obj);
                    C0736a c0736aM2836i2 = lingQDatabase_Impl.m2836i();
                    c0736aM2836i2.f6818b.m2856e(c0736aM2836i2.f6821e, c0736aM2836i2.f6822f);
                    return xfa.f68157a;
                default:
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabase$performClear$1(LingQDatabase_Impl lingQDatabase_Impl, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f6731b = lingQDatabase_Impl;
        this.f6732c = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoomDatabase$performClear$1(this.f6731b, this.f6732c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabase$performClear$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6730a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LingQDatabase_Impl lingQDatabase_Impl = this.f6731b;
            sb2 sb2Var = lingQDatabase_Impl.f6958e;
            if (sb2Var == null) {
                fa4.m11636J("connectionManager");
                throw null;
            }
            C07311 c07311 = new C07311(lingQDatabase_Impl, this.f6732c, null);
            this.f6730a = 1;
            if (((hi1) sb2Var.f60617g).mo2813v(false, c07311, this) == coroutineSingletons) {
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
