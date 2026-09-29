package androidx.compose.foundation.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.c32;
import p000.fg7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m4291f = "DragGestureDetector.kt", m4292l = {1058, 1080}, m4293m = "invokeSuspend", m4294v = 1)
final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public fg7 f1882b;

    /* JADX INFO: renamed from: c */
    public int f1883c;

    /* JADX INFO: renamed from: d */
    public int f1884d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f1885e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Ref$BooleanRef f1886f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef f1887g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Ref$ObjectRef f1888h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, Continuation continuation) {
        super(2, continuation);
        this.f1886f = ref$BooleanRef;
        this.f1887g = ref$ObjectRef;
        this.f1888h = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f1886f, this.f1887g, this.f1888h, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.f1885e = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0068 A[LOOP:2: B:16:0x0059->B:20:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x006b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x006c A[EDGE_INSN: B:74:0x006c->B:22:0x006c BREAK  A[LOOP:2: B:16:0x0059->B:20:0x0068], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b5 -> B:39:0x00b8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
