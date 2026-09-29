package androidx.collection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.i66;
import p000.j66;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.collection.MutableOrderedSetWrapper$iterator$1$iterator$1", m4291f = "OrderedScatterSet.kt", m4292l = {1489}, m4293m = "invokeSuspend")
final class MutableOrderedSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public C0039b f1254b;

    /* JADX INFO: renamed from: c */
    public j66 f1255c;

    /* JADX INFO: renamed from: d */
    public long[] f1256d;

    /* JADX INFO: renamed from: e */
    public int f1257e;

    /* JADX INFO: renamed from: f */
    public int f1258f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f1259g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ j66 f1260h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0039b f1261i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableOrderedSetWrapper$iterator$1$iterator$1(j66 j66Var, C0039b c0039b, Continuation continuation) {
        super(2, continuation);
        this.f1260h = j66Var;
        this.f1261i = c0039b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MutableOrderedSetWrapper$iterator$1$iterator$1 mutableOrderedSetWrapper$iterator$1$iterator$1 = new MutableOrderedSetWrapper$iterator$1$iterator$1(this.f1260h, this.f1261i, continuation);
        mutableOrderedSetWrapper$iterator$1$iterator$1.f1259g = obj;
        return mutableOrderedSetWrapper$iterator$1$iterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MutableOrderedSetWrapper$iterator$1$iterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        j66 j66Var;
        long[] jArr;
        int i;
        C0039b c0039b;
        vx8 vx8Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f1258f;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            vx8 vx8Var2 = (vx8) this.f1259g;
            j66Var = this.f1260h;
            i66 i66Var = j66Var.f45118b;
            jArr = i66Var.f1297c;
            i = i66Var.f1299e;
            c0039b = this.f1261i;
            vx8Var = vx8Var2;
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.f1257e;
            long[] jArr2 = this.f1256d;
            j66 j66Var2 = this.f1255c;
            c0039b = this.f1254b;
            vx8Var = (vx8) this.f1259g;
            AbstractC3193b.m15359b(obj);
            i = i3;
            j66Var = j66Var2;
            jArr = jArr2;
        }
        while (i != Integer.MAX_VALUE) {
            int i4 = (int) ((jArr[i] >> 31) & 2147483647L);
            c0039b.f1290b = i;
            Object obj2 = j66Var.f45118b.f1296b[i];
            this.f1259g = vx8Var;
            this.f1254b = c0039b;
            this.f1255c = j66Var;
            this.f1256d = jArr;
            this.f1257e = i4;
            this.f1258f = 1;
            if (vx8Var.m23582b(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i = i4;
        }
        return xfa.f68157a;
    }
}
