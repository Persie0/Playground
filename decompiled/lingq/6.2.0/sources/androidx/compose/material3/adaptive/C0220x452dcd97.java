package androidx.compose.material3.adaptive;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3502ql;
import p000.c32;

/* JADX INFO: renamed from: androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$0$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.material3.adaptive.AndroidWindowAdaptiveInfo_androidKt$collectFoldingFeaturesAsState$lambda$0$$inlined$map$1$2", m4291f = "AndroidWindowAdaptiveInfo.android.kt", m4292l = {50}, m4293m = "emit", m4294v = 1)
public final class C0220x452dcd97 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f3370a;

    /* JADX INFO: renamed from: b */
    public int f3371b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C3502ql f3372c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220x452dcd97(C3502ql c3502ql, Continuation continuation) {
        super(continuation);
        this.f3372c = c3502ql;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3370a = obj;
        this.f3371b |= Integer.MIN_VALUE;
        return this.f3372c.emit(null, this);
    }
}
