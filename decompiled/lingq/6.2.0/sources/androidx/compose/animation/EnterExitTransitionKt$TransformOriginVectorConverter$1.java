package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p000.C2970en;
import p000.k9a;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 f1433b = new EnterExitTransitionKt$TransformOriginVectorConverter$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long j = ((k9a) obj).f46917a;
        return new C2970en(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
    }
}
