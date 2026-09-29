package androidx.work.impl.model;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.l5a;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1$2", m4291f = "WorkSpecDao.kt", m4292l = {50}, m4293m = "emit")
public final class WorkSpecDaoKt$dedup$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f7259a;

    /* JADX INFO: renamed from: b */
    public int f7260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ l5a f7261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkSpecDaoKt$dedup$$inlined$map$1$2$1(l5a l5aVar, Continuation continuation) {
        super(continuation);
        this.f7261c = l5aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7259a = obj;
        this.f7260b |= Integer.MIN_VALUE;
        return this.f7261c.emit(null, this);
    }
}
