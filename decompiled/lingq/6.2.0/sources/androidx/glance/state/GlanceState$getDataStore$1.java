package androidx.glance.state;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.state.GlanceState", m4291f = "GlanceStateDefinition.kt", m4292l = {176, 140}, m4293m = "getDataStore", m4294v = 1)
final class GlanceState$getDataStore$1<T> extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f6291a;

    /* JADX INFO: renamed from: b */
    public Object f6292b;

    /* JADX INFO: renamed from: c */
    public String f6293c;

    /* JADX INFO: renamed from: d */
    public C3248a f6294d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f6295e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0703a f6296f;

    /* JADX INFO: renamed from: g */
    public int f6297g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$getDataStore$1(C0703a c0703a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6296f = c0703a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6295e = obj;
        this.f6297g |= Integer.MIN_VALUE;
        return this.f6296f.m2503b(null, null, null, this);
    }
}
