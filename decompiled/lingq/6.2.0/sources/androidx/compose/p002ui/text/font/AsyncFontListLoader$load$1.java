package androidx.compose.p002ui.text.font;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.x78;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.text.font.AsyncFontListLoader", m4291f = "FontListFontFamilyTypefaceAdapter.kt", m4292l = {281, 295}, m4293m = "load", m4294v = 1)
final class AsyncFontListLoader$load$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public List f5043a;

    /* JADX INFO: renamed from: b */
    public x78 f5044b;

    /* JADX INFO: renamed from: c */
    public int f5045c;

    /* JADX INFO: renamed from: d */
    public int f5046d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f5047e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0433a f5048f;

    /* JADX INFO: renamed from: g */
    public int f5049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$1(C0433a c0433a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f5048f = c0433a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f5047e = obj;
        this.f5049g |= Integer.MIN_VALUE;
        return this.f5048f.m1881c(this);
    }
}
