package androidx.compose.foundation.gestures;

import p000.C2934dn;
import p000.InterfaceC0025an;
import p000.pk9;
import p000.voa;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0119y {

    /* JADX INFO: renamed from: f */
    public static final C2934dn f2376f = new C2934dn(0.0f);

    /* JADX INFO: renamed from: a */
    public final voa f2377a;

    /* JADX INFO: renamed from: b */
    public long f2378b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C2934dn f2379c = f2376f;

    /* JADX INFO: renamed from: d */
    public boolean f2380d;

    /* JADX INFO: renamed from: e */
    public float f2381e;

    public C0119y(InterfaceC0025an interfaceC0025an) {
        this.f2377a = interfaceC0025an.mo589a(pk9.f56363h);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d A[Catch: all -> 0x003a, PHI: r0 r2 r4 r13
      0x007d: PHI (r0v16 vi3) = (r0v9 vi3), (r0v17 vi3) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r2v5 ui3) = (r2v3 ui3), (r2v6 ui3) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r4v2 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0075, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008a  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a7 A[Catch: all -> 0x003a, PHI: r0 r2 r4 r13
      0x00a7: PHI (r0v17 vi3) = (r0v16 vi3), (r0v20 vi3) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r2v6 ui3) = (r2v5 ui3), (r2v8 ui3) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r4v7 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00a7: PHI (r13v2 float) = (r13v1 float), (r13v4 float) binds: [B:34:0x00a4, B:21:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ae A[Catch: all -> 0x003a, PHI: r0 r2 r4
      0x00ae: PHI (r0v12 vi3) = (r0v16 vi3), (r0v17 vi3) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r2v4 ui3) = (r2v5 ui3), (r2v6 ui3) binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00ae: PHI (r4v3 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1) = 
      (r4v4 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
      (r4v5 androidx.compose.foundation.gestures.UpdatableAnimationState$animateToZero$1)
     binds: [B:32:0x008a, B:37:0x00ac] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b9 A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d5, B:20:0x004b, B:36:0x00a7, B:30:0x007d, B:33:0x008b, B:38:0x00ae, B:41:0x00b9), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a4 -> B:36:0x00a7). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: a */
    public final java.lang.Object m951a(p000.bb0 r17, p000.r60 r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C0119y.m951a(bb0, r60, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
