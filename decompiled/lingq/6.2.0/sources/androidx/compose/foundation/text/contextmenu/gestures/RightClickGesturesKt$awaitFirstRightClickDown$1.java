package androidx.compose.foundation.text.contextmenu.gestures;

import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt", m4291f = "RightClickGestures.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m4293m = "awaitFirstRightClickDown", m4294v = 1)
final class RightClickGesturesKt$awaitFirstRightClickDown$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0332f f2851a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2852b;

    /* JADX INFO: renamed from: c */
    public int f2853c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2852b = obj;
        this.f2853c |= Integer.MIN_VALUE;
        return AbstractC0168a.m1062a(null, this);
    }
}
