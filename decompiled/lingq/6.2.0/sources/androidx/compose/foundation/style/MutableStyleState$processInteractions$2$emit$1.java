package androidx.compose.foundation.style;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.q84;
import p000.v66;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.style.MutableStyleState$processInteractions$2", m4291f = "StyleState.kt", m4292l = {626}, m4293m = "emit", m4294v = 1)
final class MutableStyleState$processInteractions$2$emit$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public q84 f2724a;

    /* JADX INFO: renamed from: b */
    public v66 f2725b;

    /* JADX INFO: renamed from: c */
    public Iterator f2726c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2727d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0156a f2728e;

    /* JADX INFO: renamed from: f */
    public int f2729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutableStyleState$processInteractions$2$emit$1(C0156a c0156a, Continuation continuation) {
        super(continuation);
        this.f2728e = c0156a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2727d = obj;
        this.f2729f |= Integer.MIN_VALUE;
        return this.f2728e.emit(null, this);
    }
}
