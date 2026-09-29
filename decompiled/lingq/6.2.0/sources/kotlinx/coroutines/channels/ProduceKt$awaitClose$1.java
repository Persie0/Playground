package kotlinx.coroutines.channels;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ui3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.channels.ProduceKt", m4291f = "Produce.kt", m4292l = {361}, m4293m = "awaitClose", m4294v = 1)
final class ProduceKt$awaitClose$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public ui3 f47778a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f47779b;

    /* JADX INFO: renamed from: c */
    public int f47780c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f47779b = obj;
        this.f47780c |= Integer.MIN_VALUE;
        return AbstractC3212b.m15484a(null, null, this);
    }
}
