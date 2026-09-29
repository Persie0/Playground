package androidx.compose.foundation.gestures;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ForEachGestureKt", m19206f = "ForEachGesture.kt", m19207l = {86}, m19208m = "awaitAllPointersUp")
public final class ForEachGestureKt$awaitAllPointersUp$3 extends ContinuationImpl {

    /* JADX INFO: renamed from: d */
    public InterfaceC5016c f2131d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2132e;

    /* JADX INFO: renamed from: f */
    public int f2133f;

    public ForEachGestureKt$awaitAllPointersUp$3(InterfaceC9968c<? super ForEachGestureKt$awaitAllPointersUp$3> interfaceC9968c) {
        super(interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) {
        this.f2132e = obj;
        this.f2133f |= Integer.MIN_VALUE;
        return ForEachGestureKt.m1457a(null, this);
    }
}
