package androidx.compose.p017ui.platform;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p325po.InterfaceC8428d;
import p325po.InterfaceC8430f;
import p325po.InterfaceC8438n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", m19206f = "GlobalSnapshotManager.android.kt", m19207l = {63}, m19208m = "invokeSuspend")
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public InterfaceC8438n f4177e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8430f f4178f;

    /* JADX INFO: renamed from: g */
    public int f4179g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC8428d<C9072e> f4180h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManager$ensureStarted$1(InterfaceC8428d<C9072e> interfaceC8428d, InterfaceC9968c<? super GlobalSnapshotManager$ensureStarted$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f4180h = interfaceC8428d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new GlobalSnapshotManager$ensureStarted$1(this.f4180h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((GlobalSnapshotManager$ensureStarted$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003c  */
    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:19:0x0044, B:21:0x004e, B:22:0x0058, B:31:0x0076, B:33:0x0079, B:36:0x0084, B:37:0x0085, B:23:0x0059, B:25:0x0068), top: B:55:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #1 {, blocks: (B:23:0x0059, B:25:0x0068), top: B:51:0x0059, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0079 A[Catch: all -> 0x008e, TryCatch #3 {all -> 0x008e, blocks: (B:19:0x0044, B:21:0x004e, B:22:0x0058, B:31:0x0076, B:33:0x0079, B:36:0x0084, B:37:0x0085, B:23:0x0059, B:25:0x0068), top: B:55:0x0044, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Path cross not found for [B:25:0x0068, B:29:0x0073], limit reached: 55 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x003e -> B:55:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r9.f4179g
            r8 = 1
            r2 = 1
            if (r1 == 0) goto L23
            r8 = 6
            if (r1 != r2) goto L19
            po.f r1 = r9.f4178f
            r8 = 7
            po.n r3 = r9.f4177e
            r8 = 3
            p260m8.C7499b.m14977z0(r10)     // Catch: java.lang.Throwable -> L90
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            goto L44
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r8 = 5
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
            r8 = 2
        L23:
            p260m8.C7499b.m14977z0(r10)
            r8 = 1
            po.d<sl.e> r3 = r9.f4180h
            po.f r10 = r3.iterator()     // Catch: java.lang.Throwable -> L90
            r1 = r10
            r10 = r9
        L2f:
            r10.f4177e = r3     // Catch: java.lang.Throwable -> L90
            r10.f4178f = r1     // Catch: java.lang.Throwable -> L90
            r10.f4179g = r2     // Catch: java.lang.Throwable -> L90
            java.lang.Object r7 = r1.mo14348a(r10)     // Catch: java.lang.Throwable -> L90
            r4 = r7
            if (r4 != r0) goto L3e
            r8 = 7
            return r0
        L3e:
            r6 = r0
            r0 = r10
            r10 = r4
            r4 = r3
            r3 = r1
            r1 = r6
        L44:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L8e
            r8 = 2
            boolean r7 = r10.booleanValue()     // Catch: java.lang.Throwable -> L8e
            r10 = r7
            if (r10 == 0) goto L86
            r8 = 3
            java.lang.Object r10 = r3.next()     // Catch: java.lang.Throwable -> L8e
            sl.e r10 = (sl.C9072e) r10     // Catch: java.lang.Throwable -> L8e
            r8 = 3
            java.lang.Object r10 = androidx.compose.runtime.snapshots.SnapshotKt.f3262c     // Catch: java.lang.Throwable -> L8e
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L8e
            r8 = 1
            java.util.concurrent.atomic.AtomicReference<androidx.compose.runtime.snapshots.GlobalSnapshot> r5 = androidx.compose.runtime.snapshots.SnapshotKt.f3268i     // Catch: java.lang.Throwable -> L83
            r8 = 4
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L83
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch: java.lang.Throwable -> L83
            java.util.Set<n0.u> r5 = r5.f42153g     // Catch: java.lang.Throwable -> L83
            r8 = 1
            if (r5 == 0) goto L73
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L83
            r5 = r5 ^ r2
            r8 = 2
            if (r5 != r2) goto L73
            r8 = 2
            r5 = r2
            goto L75
        L73:
            r8 = 6
            r5 = 0
        L75:
            r8 = 7
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto L7d
            androidx.compose.runtime.snapshots.SnapshotKt.m1882a()     // Catch: java.lang.Throwable -> L8e
            r8 = 5
        L7d:
            r8 = 5
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L2f
        L83:
            r0 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L8e
            throw r0     // Catch: java.lang.Throwable -> L8e
        L86:
            r10 = 0
            ae.C0062b.m333b0(r4, r10)
            sl.e r10 = sl.C9072e.f47360a
            r8 = 1
            return r10
        L8e:
            r10 = move-exception
            goto L92
        L90:
            r10 = move-exception
            r4 = r3
        L92:
            r8 = 5
            throw r10     // Catch: java.lang.Throwable -> L94
        L94:
            r0 = move-exception
            ae.C0062b.m333b0(r4, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p017ui.platform.GlobalSnapshotManager$ensureStarted$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
