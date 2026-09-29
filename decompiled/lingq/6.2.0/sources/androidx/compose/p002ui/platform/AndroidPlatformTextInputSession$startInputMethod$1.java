package androidx.compose.p002ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession", m4291f = "AndroidPlatformTextInputSession.android.kt", m4292l = {71}, m4293m = "startInputMethod", m4294v = 1)
final class AndroidPlatformTextInputSession$startInputMethod$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f4512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0395g f4513b;

    /* JADX INFO: renamed from: c */
    public int f4514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$1(C0395g c0395g, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f4513b = c0395g;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f4512a = obj;
        this.f4514c |= Integer.MIN_VALUE;
        return this.f4513b.m1797a(null, this);
    }
}
