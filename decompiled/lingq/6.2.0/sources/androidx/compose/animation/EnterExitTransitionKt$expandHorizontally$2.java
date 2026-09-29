package androidx.compose.animation;

import kotlin.jvm.internal.Lambda;
import p000.n84;
import p000.vi3;

/* JADX INFO: loaded from: classes.dex */
final class EnterExitTransitionKt$expandHorizontally$2 extends Lambda implements vi3 {
    @Override // p000.vi3
    public final Object invoke(Object obj) {
        long j = ((n84) obj).f52482a;
        EnterExitTransitionKt$expandHorizontally$1.f1453b.invoke(Integer.valueOf((int) (j >> 32)));
        Integer num = 0;
        return new n84((((long) ((int) (j & 4294967295L))) & 4294967295L) | (((long) num.intValue()) << 32));
    }
}
