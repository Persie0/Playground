package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.C3248a;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {437, 448}, m4293m = "classifyText-M8tDOmk", m4294v = 1)
final class PlatformSelectionBehaviorsImpl$classifyText$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public Object f2966a;

    /* JADX INFO: renamed from: b */
    public Object f2967b;

    /* JADX INFO: renamed from: c */
    public C3248a f2968c;

    /* JADX INFO: renamed from: d */
    public long f2969d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2970e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0200a f2971f;

    /* JADX INFO: renamed from: g */
    public int f2972g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$classifyText$1(C0200a c0200a, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f2971f = c0200a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f2970e = obj;
        this.f2972g |= Integer.MIN_VALUE;
        return C0200a.m1092a(this.f2971f, null, 0L, null, this);
    }
}
