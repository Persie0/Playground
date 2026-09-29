package androidx.compose.foundation.gestures;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.ScrollExtensionsKt", m4291f = "ScrollExtensions.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "animateScrollBy", m4294v = 1)
final class ScrollExtensionsKt$animateScrollBy$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Ref$FloatRef f2036a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2037b;

    /* JADX INFO: renamed from: c */
    public int f2038c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2037b = obj;
        this.f2038c |= Integer.MIN_VALUE;
        return AbstractC0095c.m831f(null, 0.0f, null, this);
    }
}
