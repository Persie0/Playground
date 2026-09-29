package androidx.glance.state;

import android.content.Context;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.c32;
import p000.zi7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.state.GlanceState", m4291f = "GlanceStateDefinition.kt", m4292l = {176}, m4293m = "deleteStore", m4294v = 1)
final class GlanceState$deleteStore$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Context f6284a;

    /* JADX INFO: renamed from: b */
    public zi7 f6285b;

    /* JADX INFO: renamed from: c */
    public String f6286c;

    /* JADX INFO: renamed from: d */
    public C3248a f6287d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f6288e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0703a f6289f;

    /* JADX INFO: renamed from: g */
    public int f6290g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceState$deleteStore$1(C0703a c0703a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f6289f = c0703a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6288e = obj;
        this.f6290g |= Integer.MIN_VALUE;
        return this.f6289f.m2502a(null, null, null, this);
    }
}
