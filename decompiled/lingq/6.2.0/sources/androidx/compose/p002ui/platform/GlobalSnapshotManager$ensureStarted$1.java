package androidx.compose.p002ui.platform;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.C3211a;
import p000.c32;
import p000.cu0;
import p000.ej0;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m4291f = "GlobalSnapshotManager.android.kt", m4292l = {64}, m4293m = "invokeSuspend", m4294v = 1)
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public cu0 f4573a;

    /* JADX INFO: renamed from: b */
    public ej0 f4574b;

    /* JADX INFO: renamed from: c */
    public int f4575c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3211a f4576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(C3211a c3211a, Continuation continuation) {
        super(2, continuation);
        this.f4576d = c3211a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GlobalSnapshotManager$ensureStarted$1(this.f4576d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GlobalSnapshotManager$ensureStarted$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0032, B:19:0x003a, B:20:0x0048, B:26:0x0056, B:14:0x0025, B:28:0x0059, B:30:0x005e, B:31:0x005f, B:13:0x001f, B:21:0x0049, B:23:0x004f), top: B:38:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {, blocks: (B:21:0x0049, B:23:0x004f), top: B:42:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0032, B:19:0x003a, B:20:0x0048, B:26:0x0056, B:14:0x0025, B:28:0x0059, B:30:0x005e, B:31:0x005f, B:13:0x001f, B:21:0x0049, B:23:0x004f), top: B:38:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:17:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r7.f4575c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            ej0 r1 = r7.f4574b
            cu0 r4 = r7.f4573a
            kotlin.AbstractC3193b.m15359b(r8)     // Catch: java.lang.Throwable -> L12
            goto L32
        L12:
            r7 = move-exception
            goto L66
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r7)
            return r2
        L1a:
            kotlin.AbstractC3193b.m15359b(r8)
            kotlinx.coroutines.channels.a r4 = r7.f4576d
            ej0 r8 = new ej0     // Catch: java.lang.Throwable -> L12
            r8.<init>(r4)     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L25:
            r7.f4573a = r4     // Catch: java.lang.Throwable -> L12
            r7.f4574b = r1     // Catch: java.lang.Throwable -> L12
            r7.f4575c = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.m11164b(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L60
            java.lang.Object r8 = r1.m11165c()     // Catch: java.lang.Throwable -> L12
            xfa r8 = (p000.xfa) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = p000.zn3.f71794b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = p000.nc9.f52602c     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            yn3 r6 = p000.nc9.f52609j     // Catch: java.lang.Throwable -> L5d
            o66 r6 = r6.f60422h     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L56
            boolean r6 = r6.m725c()     // Catch: java.lang.Throwable -> L5d
            if (r6 != r3) goto L56
            r5 = r3
        L56:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L25
            p000.nc9.m17349a()     // Catch: java.lang.Throwable -> L12
            goto L25
        L5d:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r7     // Catch: java.lang.Throwable -> L12
        L60:
            r4.mo4537a(r2)
            xfa r7 = p000.xfa.f68157a
            return r7
        L66:
            throw r7     // Catch: java.lang.Throwable -> L67
        L67:
            r8 = move-exception
            kotlinx.coroutines.channels.AbstractC3212b.m15485b(r4, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.GlobalSnapshotManager$ensureStarted$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
