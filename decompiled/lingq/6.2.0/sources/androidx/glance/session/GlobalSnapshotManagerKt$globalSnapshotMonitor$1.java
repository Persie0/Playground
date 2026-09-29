package androidx.glance.session;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.cu0;
import p000.ej0;
import p000.pp6;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.GlobalSnapshotManagerKt", m4291f = "GlobalSnapshotManager.kt", m4292l = {87}, m4293m = "globalSnapshotMonitor", m4294v = 1)
final class GlobalSnapshotManagerKt$globalSnapshotMonitor$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public AtomicBoolean f6115a;

    /* JADX INFO: renamed from: b */
    public pp6 f6116b;

    /* JADX INFO: renamed from: c */
    public cu0 f6117c;

    /* JADX INFO: renamed from: d */
    public ej0 f6118d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f6119e;

    /* JADX INFO: renamed from: f */
    public int f6120f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f6119e = obj;
        this.f6120f |= Integer.MIN_VALUE;
        return AbstractC0693a.m2490b(this);
    }
}
