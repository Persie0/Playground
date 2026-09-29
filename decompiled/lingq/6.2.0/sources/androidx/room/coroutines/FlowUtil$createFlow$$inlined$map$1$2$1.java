package androidx.room.coroutines;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.e83;
import p000.h93;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", m4291f = "FlowBuilder.kt", m4292l = {220, 219}, m4293m = "emit")
public final class FlowUtil$createFlow$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6860a;

    /* JADX INFO: renamed from: b */
    public int f6861b;

    /* JADX INFO: renamed from: c */
    public e83 f6862c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ h93 f6863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowUtil$createFlow$$inlined$map$1$2$1(h93 h93Var, Continuation continuation) {
        super(continuation);
        this.f6863d = h93Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6860a = obj;
        this.f6861b |= Integer.MIN_VALUE;
        return this.f6863d.emit(null, this);
    }
}
