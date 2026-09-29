package com.amplitude.core.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.cu0;
import p000.ej0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.EventPipeline$upload$1", m4291f = "EventPipeline.kt", m4292l = {219, 118, 133, 141, 151}, m4293m = "invokeSuspend")
final class EventPipeline$upload$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C0907a f11081a;

    /* JADX INFO: renamed from: b */
    public cu0 f11082b;

    /* JADX INFO: renamed from: c */
    public ej0 f11083c;

    /* JADX INFO: renamed from: d */
    public Object f11084d;

    /* JADX INFO: renamed from: e */
    public Object f11085e;

    /* JADX INFO: renamed from: f */
    public int f11086f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0907a f11087g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventPipeline$upload$1(C0907a c0907a, Continuation continuation) {
        super(2, continuation);
        this.f11087g = c0907a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EventPipeline$upload$1(this.f11087g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EventPipeline$upload$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0141 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #2 {all -> 0x0029, blocks: (B:10:0x0024, B:34:0x007f, B:37:0x0093, B:39:0x009b, B:43:0x00c0, B:45:0x00c8, B:49:0x0105, B:53:0x011a, B:54:0x012e, B:55:0x013b, B:57:0x0141, B:58:0x0145, B:61:0x0162, B:64:0x016b, B:67:0x018f, B:71:0x01aa, B:73:0x01b0, B:74:0x01bd, B:76:0x01c3, B:21:0x0045, B:24:0x0052, B:27:0x0061, B:30:0x006b, B:33:0x0078), top: B:85:0x000d, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0161  */
    /* JADX WARN: Code duplicated, block: B:61:0x0162 A[Catch: all -> 0x0029, Exception -> 0x002d, FileNotFoundException -> 0x0030, PHI: r0 r7 r10 r11 r12 r13
      0x0162: PHI (r0v7 java.lang.Object) = (r0v14 java.lang.Object), (r0v41 java.lang.Object) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r7v5 java.lang.Object) = (r7v11 java.lang.Object), (r7v26 java.lang.Object) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r10v2 java.util.Iterator) = (r10v3 java.util.Iterator), (r10v20 java.util.Iterator) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r11v2 ej0) = (r11v3 ej0), (r11v18 ej0) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r12v3 cu0) = (r12v4 cu0), (r12v15 cu0) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x0162: PHI (r13v2 com.amplitude.core.platform.a) = (r13v3 com.amplitude.core.platform.a), (r13v13 com.amplitude.core.platform.a) binds: [B:59:0x015f, B:22:0x0048] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {FileNotFoundException -> 0x0030, Exception -> 0x002d, blocks: (B:10:0x0024, B:58:0x0145, B:61:0x0162, B:64:0x016b, B:67:0x018f, B:71:0x01aa, B:21:0x0045), top: B:85:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x016a  */
    /* JADX WARN: Code duplicated, block: B:64:0x016b A[Catch: all -> 0x0029, Exception -> 0x002d, FileNotFoundException -> 0x0030, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0030, Exception -> 0x002d, blocks: (B:10:0x0024, B:58:0x0145, B:61:0x0162, B:64:0x016b, B:67:0x018f, B:71:0x01aa, B:21:0x0045), top: B:85:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x018f A[Catch: all -> 0x0029, Exception -> 0x002d, FileNotFoundException -> 0x0030, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0030, Exception -> 0x002d, blocks: (B:10:0x0024, B:58:0x0145, B:61:0x0162, B:64:0x016b, B:67:0x018f, B:71:0x01aa, B:21:0x0045), top: B:85:0x000d, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01aa A[Catch: all -> 0x0029, Exception -> 0x002d, FileNotFoundException -> 0x0030, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0030, Exception -> 0x002d, blocks: (B:10:0x0024, B:58:0x0145, B:61:0x0162, B:64:0x016b, B:67:0x018f, B:71:0x01aa, B:21:0x0045), top: B:85:0x000d, outer: #2 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x013f -> B:70:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x016a -> B:55:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01a4 -> B:70:0x01a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x01aa -> B:55:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x01b0 -> B:55:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01c1 -> B:55:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x01c3 -> B:55:0x013b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.core.platform.EventPipeline$upload$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
