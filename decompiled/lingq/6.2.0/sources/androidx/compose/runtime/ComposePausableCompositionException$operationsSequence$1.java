package androidx.compose.runtime;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1", m4291f = "PausableComposition.kt", m4292l = {579}, m4293m = "invokeSuspend", m4294v = 1)
final class ComposePausableCompositionException$operationsSequence$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f3658b;

    /* JADX INFO: renamed from: c */
    public int f3659c;

    /* JADX INFO: renamed from: d */
    public int f3660d;

    /* JADX INFO: renamed from: e */
    public int f3661e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f3662f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ComposePausableCompositionException f3663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposePausableCompositionException$operationsSequence$1(ComposePausableCompositionException composePausableCompositionException, Continuation continuation) {
        super(2, continuation);
        this.f3663g = composePausableCompositionException;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ComposePausableCompositionException$operationsSequence$1 composePausableCompositionException$operationsSequence$1 = new ComposePausableCompositionException$operationsSequence$1(this.f3663g, continuation);
        composePausableCompositionException$operationsSequence$1.f3662f = obj;
        return composePausableCompositionException$operationsSequence$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposePausableCompositionException$operationsSequence$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0044  */
    /* JADX WARN: Code duplicated, block: B:13:0x004f  */
    /* JADX WARN: Code duplicated, block: B:16:0x005a  */
    /* JADX WARN: Code duplicated, block: B:17:0x005d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0075  */
    /* JADX WARN: Code duplicated, block: B:19:0x0093  */
    /* JADX WARN: Code duplicated, block: B:21:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:22:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:23:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:24:0x0110  */
    /* JADX WARN: Code duplicated, block: B:25:0x0135  */
    /* JADX WARN: Code duplicated, block: B:26:0x0144  */
    /* JADX WARN: Code duplicated, block: B:29:0x016d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x016e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x016e -> B:31:0x0170). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:17:0x005d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposePausableCompositionException$operationsSequence$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
