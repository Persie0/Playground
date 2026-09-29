package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p060d1.C5028o;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", m19206f = "DragGestureDetector.kt", m19207l = {808}, m19208m = "awaitLongPressOrCancellation-rnUCldI")
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public C5028o f2009d;

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f2010e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f2011f;

    /* JADX INFO: renamed from: g */
    public int f2012g;

    public DragGestureDetectorKt$awaitLongPressOrCancellation$1(InterfaceC9968c<? super DragGestureDetectorKt$awaitLongPressOrCancellation$1> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2011f = obj;
        this.f2012g |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m1444b(null, 0L, this);
    }
}
