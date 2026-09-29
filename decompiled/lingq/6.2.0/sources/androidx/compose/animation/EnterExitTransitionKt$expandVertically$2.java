package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p000.n84;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionKt$expandVertically$2 extends Lambda implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long j = ((n84) obj).f52482a;
        int i = (int) (j >> 32);
        EnterExitTransitionKt$expandVertically$1.f1455b.invoke(Integer.valueOf((int) (j & 4294967295L)));
        Integer num = 0;
        return new n84((((long) num.intValue()) & 4294967295L) | (((long) i) << 32));
    }
}
