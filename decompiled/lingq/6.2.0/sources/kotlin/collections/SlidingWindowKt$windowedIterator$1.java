package kotlin.collections;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.vx8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m4291f = "SlidingWindow.kt", m4292l = {34, DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER, 49, 55, 58}, m4293m = "invokeSuspend", m4294v = 2)
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public Object f47641b;

    /* JADX INFO: renamed from: c */
    public Iterator f47642c;

    /* JADX INFO: renamed from: d */
    public int f47643d;

    /* JADX INFO: renamed from: e */
    public int f47644e;

    /* JADX INFO: renamed from: f */
    public int f47645f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f47646g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f47647h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f47648i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator f47649j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.f47647h = i;
        this.f47648i = i2;
        this.f47649j = it;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f47647h, this.f47648i, this.f47649j, continuation);
        slidingWindowKt$windowedIterator$1.f47646g = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SlidingWindowKt$windowedIterator$1) create((vx8) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x0108  */
    /* JADX WARN: Code duplicated, block: B:55:0x010d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:59:0x0124  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a2 -> B:17:0x0061). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x00fb -> B:58:0x0120). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0139 -> B:62:0x013c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x0161 -> B:71:0x0164). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
