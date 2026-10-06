package p021j$.util.stream;

import java.util.function.LongConsumer;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.stream.L1 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0606L1 implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33332a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f33332a) {
            case 0:
                longConsumer.getClass();
                break;
            default:
                longConsumer.getClass();
                break;
        }
        return new C0555g(this, longConsumer);
    }
}
