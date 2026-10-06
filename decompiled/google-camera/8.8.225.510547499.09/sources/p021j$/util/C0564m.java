package p021j$.util;

import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p021j$.util.function.C0555g;

/* JADX INFO: renamed from: j$.util.m */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C0564m implements LongConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Consumer f33273a;

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.f33273a.accept(Long.valueOf(j));
    }

    public final LongConsumer andThen(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0555g(this, longConsumer);
    }
}
