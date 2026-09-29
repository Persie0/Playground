package androidx.compose.foundation.gestures;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p060d1.C5024k;
import p060d1.C5028o;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", m19206f = "DragGestureDetector.kt", m19207l = {811, 828}, m19208m = "invokeSuspend")
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: c */
    public C5024k f2013c;

    /* JADX INFO: renamed from: d */
    public int f2014d;

    /* JADX INFO: renamed from: e */
    public int f2015e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2016f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Ref$ObjectRef<C5028o> f2017g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Ref$ObjectRef<C5028o> f2018h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref$ObjectRef<C5028o> ref$ObjectRef, Ref$ObjectRef<C5028o> ref$ObjectRef2, InterfaceC9968c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> interfaceC9968c) {
        super(interfaceC9968c);
        this.f2017g = ref$ObjectRef;
        this.f2018h = ref$ObjectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.f2017g, this.f2018h, interfaceC9968c);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.f2016f = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x0073 A[LOOP:2: B:17:0x0062->B:21:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [T, d1.o] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00c1 -> B:44:0x00c3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
