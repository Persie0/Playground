package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.ok2;
import p000.pk2;
import p000.rk2;
import p000.sk2;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", m4291f = "Draggable.kt", m4292l = {514, 516, 518, 525, 527, 530}, m4293m = "invokeSuspend", m4294v = 1)
final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f1949a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f1950b;

    /* JADX INFO: renamed from: c */
    public int f1951c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f1952d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0103k f1953e;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1 */
    @c32(m4290c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", m4291f = "Draggable.kt", m4292l = {521}, m4293m = "invokeSuspend", m4294v = 1)
    final class C00861 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public Ref$ObjectRef f1954a;

        /* JADX INFO: renamed from: b */
        public int f1955b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ Object f1956c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Ref$ObjectRef f1957d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ AbstractC0103k f1958e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00861(Ref$ObjectRef ref$ObjectRef, AbstractC0103k abstractC0103k, Continuation continuation) {
            super(2, continuation);
            this.f1957d = ref$ObjectRef;
            this.f1958e = abstractC0103k;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C00861 c00861 = new C00861(this.f1957d, this.f1958e, continuation);
            c00861.f1956c = obj;
            return c00861;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C00861) create((vi3) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x002a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004b -> B:24:0x004e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0051 -> B:26:0x0052). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vi3 vi3Var;
            Ref$ObjectRef ref$ObjectRef;
            Object obj2;
            sk2 sk2Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f1955b;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vi3Var = (vi3) this.f1956c;
                ref$ObjectRef = this.f1957d;
                obj2 = ref$ObjectRef.f47718a;
                if (!(obj2 instanceof rk2) || (obj2 instanceof ok2)) {
                    return xfa.f68157a;
                }
                pk2 pk2Var = obj2 instanceof pk2 ? (pk2) obj2 : null;
                if (pk2Var != null) {
                    vi3Var.invoke(pk2Var);
                }
                C3211a c3211a = this.f1958e.f2271P;
                if (c3211a != null) {
                    this.f1956c = vi3Var;
                    this.f1954a = ref$ObjectRef;
                    this.f1955b = 1;
                    obj = C3211a.m15448I(c3211a, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    sk2Var = null;
                }
                ref$ObjectRef.f47718a = sk2Var;
                ref$ObjectRef = this.f1957d;
                obj2 = ref$ObjectRef.f47718a;
                if (obj2 instanceof rk2) {
                }
                return xfa.f68157a;
            }
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$ObjectRef = this.f1954a;
            vi3Var = (vi3) this.f1956c;
            AbstractC3193b.m15359b(obj);
            sk2Var = (sk2) obj;
            ref$ObjectRef.f47718a = sk2Var;
            ref$ObjectRef = this.f1957d;
            obj2 = ref$ObjectRef.f47718a;
            if (obj2 instanceof rk2) {
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(AbstractC0103k abstractC0103k, Continuation continuation) {
        super(2, continuation);
        this.f1953e = abstractC0103k;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.f1953e, continuation);
        dragGestureNode$startListeningForEvents$1.f1952d = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureNode$startListeningForEvents$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0030 A[PHI: r1 r4
      0x0030: PHI (r1v11 kotlin.jvm.internal.Ref$ObjectRef) = (r1v3 kotlin.jvm.internal.Ref$ObjectRef), (r1v15 kotlin.jvm.internal.Ref$ObjectRef) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]
      0x0030: PHI (r4v6 un1) = (r4v4 un1), (r4v7 un1) binds: [B:13:0x002d, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0054 A[PHI: r5
      0x0054: PHI (r5v7 un1) = (r5v0 un1), (r5v3 un1), (r5v3 un1), (r5v3 un1), (r5v5 un1), (r5v8 un1) binds: [B:18:0x004c, B:45:0x00c3, B:47:0x00d0, B:41:0x00bc, B:30:0x0080, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:26:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1 A[Catch: CancellationException -> 0x00bf, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c5 A[Catch: CancellationException -> 0x00bf, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00bf, blocks: (B:38:0x00a9, B:40:0x00af, B:44:0x00c1, B:46:0x00c5), top: B:55:0x00a9 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0080 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00bc -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00c3 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00d0 -> B:19:0x0054). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00de -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
