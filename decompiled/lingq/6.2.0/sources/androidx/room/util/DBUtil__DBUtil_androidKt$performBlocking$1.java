package androidx.room.util;

import androidx.room.AbstractC0746d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.kn1;
import p000.un1;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", m4291f = "DBUtil.android.kt", m4292l = {72}, m4293m = "invokeSuspend")
final class DBUtil__DBUtil_androidKt$performBlocking$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6984a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ kn1 f6985b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0746d f6986c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f6987d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f6988e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f6989f;

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1 */
    @c32(m4290c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$1", m4291f = "DBUtil.android.kt", m4292l = {260}, m4293m = "invokeSuspend")
    final class C07511 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6990a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AbstractC0746d f6991b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f6992c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ boolean f6993d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ vi3 f6994e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07511(vi3 vi3Var, AbstractC0746d abstractC0746d, Continuation continuation, boolean z, boolean z2) {
            super(2, continuation);
            this.f6991b = abstractC0746d;
            this.f6992c = z;
            this.f6993d = z2;
            this.f6994e = vi3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C07511(this.f6994e, this.f6991b, continuation, this.f6992c, this.f6993d);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C07511) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6990a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            AbstractC0746d abstractC0746d = this.f6991b;
            boolean z = !(abstractC0746d.m2840m() && abstractC0746d.m2841n()) && this.f6992c;
            vi3 vi3Var = this.f6994e;
            AbstractC0746d abstractC0746d2 = this.f6991b;
            boolean z2 = this.f6993d;
            C0752xd8c50dd3 c0752xd8c50dd3 = new C0752xd8c50dd3(vi3Var, abstractC0746d2, null, z, z2);
            this.f6990a = 1;
            Object objM2847t = abstractC0746d2.m2847t(z2, c0752xd8c50dd3, this);
            return objM2847t == coroutineSingletons ? coroutineSingletons : objM2847t;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1(kn1 kn1Var, AbstractC0746d abstractC0746d, boolean z, boolean z2, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6985b = kn1Var;
        this.f6986c = abstractC0746d;
        this.f6987d = z;
        this.f6988e = z2;
        this.f6989f = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DBUtil__DBUtil_androidKt$performBlocking$1(this.f6985b, this.f6986c, this.f6987d, this.f6988e, this.f6989f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6984a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C07511 c07511 = new C07511(this.f6989f, this.f6986c, null, this.f6987d, this.f6988e);
        this.f6984a = 1;
        Object objM23905G = wfb.m23905G(c07511, this.f6985b, this);
        return objM23905G == coroutineSingletons ? coroutineSingletons : objM23905G;
    }
}
