package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3611th;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cu0;
import p000.e83;
import p000.un1;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m4291f = "Delay.kt", m4292l = {215, 415}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public cu0 f47826a;

    /* JADX INFO: renamed from: b */
    public Ref$ObjectRef f47827b;

    /* JADX INFO: renamed from: c */
    public Ref$LongRef f47828c;

    /* JADX INFO: renamed from: d */
    public int f47829d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ un1 f47830e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ e83 f47831f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C3611th f47832g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ c83 f47833h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(C3611th c3611th, c83 c83Var, Continuation continuation) {
        super(3, continuation);
        this.f47832g = c3611th;
        this.f47833h = c83Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f47832g, this.f47833h, (Continuation) obj3);
        flowKt__DelayKt$debounceInternal$1.f47830e = (un1) obj;
        flowKt__DelayKt$debounceInternal$1.f47831f = (e83) obj2;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005c  */
    /* JADX WARN: Code duplicated, block: B:16:0x0063  */
    /* JADX WARN: Code duplicated, block: B:18:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097 A[PHI: r4 r9 r10
      0x0097: PHI (r4v3 kotlin.jvm.internal.Ref$ObjectRef) = 
      (r4v5 kotlin.jvm.internal.Ref$ObjectRef)
      (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
      (r4v6 kotlin.jvm.internal.Ref$ObjectRef)
     binds: [B:26:0x0094, B:15:0x0061, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r9v4 cu0) = (r9v13 cu0), (r9v14 cu0), (r9v14 cu0) binds: [B:26:0x0094, B:15:0x0061, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]
      0x0097: PHI (r10v1 kotlin.jvm.internal.Ref$LongRef) = 
      (r10v3 kotlin.jvm.internal.Ref$LongRef)
      (r10v5 kotlin.jvm.internal.Ref$LongRef)
      (r10v5 kotlin.jvm.internal.Ref$LongRef)
     binds: [B:26:0x0094, B:15:0x0061, B:18:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f5  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
