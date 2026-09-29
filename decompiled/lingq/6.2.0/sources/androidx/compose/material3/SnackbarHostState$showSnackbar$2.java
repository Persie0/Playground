package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.c76;
import p000.wb9;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.SnackbarHostState", m4291f = "SnackbarHost.kt", m4292l = {429, 432}, m4293m = "showSnackbar", m4294v = 1)
final class SnackbarHostState$showSnackbar$2 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public wb9 f3331a;

    /* JADX INFO: renamed from: b */
    public c76 f3332b;

    /* JADX INFO: renamed from: c */
    public Object f3333c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f3334d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0232g0 f3335e;

    /* JADX INFO: renamed from: f */
    public int f3336f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$2(C0232g0 c0232g0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3335e = c0232g0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3334d = obj;
        this.f3336f |= Integer.MIN_VALUE;
        return this.f3335e.m1156a(null, this);
    }
}
