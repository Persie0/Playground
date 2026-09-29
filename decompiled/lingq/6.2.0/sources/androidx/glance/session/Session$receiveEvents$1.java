package androidx.glance.session;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ej0;
import p000.vi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.Session", m4291f = "Session.kt", m4292l = {93, 95}, m4293m = "receiveEvents", m4294v = 1)
final class Session$receiveEvents$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f6135a;

    /* JADX INFO: renamed from: b */
    public vi3 f6136b;

    /* JADX INFO: renamed from: c */
    public ej0 f6137c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f6138d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC0696d f6139e;

    /* JADX INFO: renamed from: f */
    public int f6140f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Session$receiveEvents$1(AbstractC0696d abstractC0696d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6139e = abstractC0696d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6138d = obj;
        this.f6140f |= Integer.MIN_VALUE;
        return this.f6139e.m2492a(null, null, this);
    }
}
