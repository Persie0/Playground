package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.platform.PlatformTextInputModifierNodeKt", m4291f = "PlatformTextInputModifierNode.kt", m4292l = {184, 186}, m4293m = "interceptedTextInputSession", m4294v = 1)
final class PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4589a;

    /* JADX INFO: renamed from: b */
    public int f4590b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4589a = obj;
        this.f4590b |= Integer.MIN_VALUE;
        return AbstractC0410v.m1821b(null, null, this);
    }
}
