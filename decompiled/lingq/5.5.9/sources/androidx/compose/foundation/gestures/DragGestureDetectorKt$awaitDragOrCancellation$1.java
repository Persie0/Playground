package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$LongRef;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m19206f = "DragGestureDetector.kt", m19207l = {876}, m19208m = "awaitDragOrCancellation-rnUCldI")
public final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC5016c f2005d;

    /* JADX INFO: renamed from: e */
    public Ref$LongRef f2006e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2007f;

    /* JADX INFO: renamed from: g */
    public int f2008g;

    public DragGestureDetectorKt$awaitDragOrCancellation$1(InterfaceC9968c<? super DragGestureDetectorKt$awaitDragOrCancellation$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2007f = obj;
        this.f2008g |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m1443a(null, 0L, this);
    }
}
