package androidx.room;

import android.database.SQLException;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d9a;
import p000.e9a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1", m4291f = "InvalidationTracker.kt", m4292l = {418, 425}, m4293m = "invokeSuspend")
final class C0735xcf25c6f6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6773a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6774b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0750h f6775c;

    /* JADX INFO: renamed from: androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1, reason: invalid class name */
    @c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1$1", m4291f = "InvalidationTracker.kt", m4292l = {426}, m4293m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6776a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6777b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0750h f6778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0750h c0750h, Continuation continuation) {
            super(2, continuation);
            this.f6778c = c0750h;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6778c, continuation);
            anonymousClass1.f6777b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6776a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            d9a d9aVar = (d9a) this.f6777b;
            this.f6776a = 1;
            Object objM2852a = C0750h.m2852a(this.f6778c, d9aVar, this);
            return objM2852a == coroutineSingletons ? coroutineSingletons : objM2852a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0735xcf25c6f6(C0750h c0750h, Continuation continuation) {
        super(2, continuation);
        this.f6775c = c0750h;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0735xcf25c6f6 c0735xcf25c6f6 = new C0735xcf25c6f6(this.f6775c, continuation);
        c0735xcf25c6f6.f6774b = obj;
        return c0735xcf25c6f6;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0735xcf25c6f6) create((e9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e9a e9aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6773a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                e9aVar = (e9a) this.f6774b;
                this.f6774b = e9aVar;
                this.f6773a = 1;
                obj = e9aVar.mo2814a(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                e9aVar = (e9a) this.f6774b;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return (Set) obj;
            if (!((Boolean) obj).booleanValue()) {
                Transactor$SQLiteTransactionType transactor$SQLiteTransactionType = Transactor$SQLiteTransactionType.IMMEDIATE;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f6775c, null);
                this.f6774b = null;
                this.f6773a = 2;
                obj = e9aVar.mo2815b(transactor$SQLiteTransactionType, anonymousClass1, this);
            }
        } catch (SQLException unused) {
        }
        return EmptySet.f47640a;
    }
}
