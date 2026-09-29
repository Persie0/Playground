package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cu0;
import p000.e83;
import p000.ui3;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", m4291f = "Combine.kt", m4292l = {51, 73, 76}, m4293m = "invokeSuspend", m4294v = 1)
final class CombineKt$combineInternal$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Object[] f48100a;

    /* JADX INFO: renamed from: b */
    public cu0 f48101b;

    /* JADX INFO: renamed from: c */
    public byte[] f48102c;

    /* JADX INFO: renamed from: d */
    public int f48103d;

    /* JADX INFO: renamed from: e */
    public int f48104e;

    /* JADX INFO: renamed from: f */
    public int f48105f;

    /* JADX INFO: renamed from: g */
    public int f48106g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f48107h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ c83[] f48108i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ui3 f48109j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ aj3 f48110k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ e83 f48111l;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 */
    @c32(m4290c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", m4291f = "Combine.kt", m4292l = {28}, m4293m = "invokeSuspend", m4294v = 1)
    final class C32301 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f48112a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ c83[] f48113b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f48114c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AtomicInteger f48115d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3211a f48116e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C32301(c83[] c83VarArr, int i, AtomicInteger atomicInteger, C3211a c3211a, Continuation continuation) {
            super(2, continuation);
            this.f48113b = c83VarArr;
            this.f48114c = i;
            this.f48115d = atomicInteger;
            this.f48116e = c3211a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C32301(this.f48113b, this.f48114c, this.f48115d, this.f48116e, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C32301) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f48112a;
            AtomicInteger atomicInteger = this.f48115d;
            C3211a c3211a = this.f48116e;
            try {
                if (i == 0) {
                    AbstractC3193b.m15359b(obj);
                    c83[] c83VarArr = this.f48113b;
                    int i2 = this.f48114c;
                    c83 c83Var = c83VarArr[i2];
                    C3237g c3237g = new C3237g(c3211a, i2);
                    this.f48112a = 1;
                    if (c83Var.collect(c3237g, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    c3211a.mo15331i(null);
                }
                return xfa.f68157a;
            } catch (Throwable th) {
                if (atomicInteger.decrementAndGet() == 0) {
                    c3211a.mo15331i(null);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombineKt$combineInternal$2(e83 e83Var, ui3 ui3Var, aj3 aj3Var, Continuation continuation, c83[] c83VarArr) {
        super(2, continuation);
        this.f48108i = c83VarArr;
        this.f48109j = ui3Var;
        this.f48110k = aj3Var;
        this.f48111l = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(this.f48111l, this.f48109j, this.f48110k, continuation, this.f48108i);
        combineKt$combineInternal$2.f48107h = obj;
        return combineKt$combineInternal$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CombineKt$combineInternal$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x00be  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ce A[LOOP:0: B:29:0x00ce->B:37:0x00ef, LOOP_START, PHI: r4 r14
      0x00ce: PHI (r4v4 int) = (r4v3 int), (r4v5 int) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r14v6 r34) = (r14v5 r34), (r14v10 r34) binds: [B:26:0x00c9, B:37:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00de  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f1 A[EDGE_INSN: B:51:0x00f1->B:38:0x00f1 BREAK  A[LOOP:0: B:29:0x00ce->B:37:0x00ef], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0133 -> B:8:0x002e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0138 -> B:44:0x0118). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
