package kotlinx.coroutines.selects;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.selects.SelectImplementation", m4291f = "Select.kt", m4292l = {450, 453}, m4293m = "doSelectSuspend", m4294v = 1)
final class SelectImplementation$doSelectSuspend$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f48165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3247b f48166b;

    /* JADX INFO: renamed from: c */
    public int f48167c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectImplementation$doSelectSuspend$1(C3247b c3247b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f48166b = c3247b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f48165a = obj;
        this.f48167c |= Integer.MIN_VALUE;
        return this.f48166b.m15589e(this);
    }
}
