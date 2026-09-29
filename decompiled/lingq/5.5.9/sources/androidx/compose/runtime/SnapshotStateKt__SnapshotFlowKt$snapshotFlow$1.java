package androidx.compose.runtime;

import cm.InterfaceC2041a;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p267n0.InterfaceC7672c;
import p325po.InterfaceC8428d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, m13365d2 = {"T", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", m19206f = "SnapshotFlow.kt", m19207l = {134, 138, 160}, m19208m = "invokeSuspend")
final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Set f3112e;

    /* JADX INFO: renamed from: f */
    public InterfaceC2052l f3113f;

    /* JADX INFO: renamed from: g */
    public InterfaceC8428d f3114g;

    /* JADX INFO: renamed from: h */
    public InterfaceC7672c f3115h;

    /* JADX INFO: renamed from: i */
    public Object f3116i;

    /* JADX INFO: renamed from: j */
    public int f3117j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f3118k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2041a<Object> f3119l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(InterfaceC2041a<Object> interfaceC2041a, InterfaceC9968c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f3119l = interfaceC2041a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.f3119l, interfaceC9968c);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.f3118k = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:2: B:50:0x00f4->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00fa A[Catch: all -> 0x0156, TryCatch #0 {all -> 0x0156, blocks: (B:11:0x002c, B:33:0x00bd, B:35:0x00c3, B:37:0x00cd, B:60:0x010d, B:64:0x0117, B:67:0x011e, B:71:0x0136, B:73:0x013f, B:85:0x0160, B:86:0x0163, B:30:0x00a8, B:40:0x00d4, B:41:0x00d8, B:43:0x00de, B:46:0x00e9, B:49:0x00f0, B:50:0x00f4, B:52:0x00fa, B:14:0x0042, B:21:0x0079, B:25:0x008e, B:95:0x0173, B:96:0x0176, B:68:0x012b, B:70:0x0133, B:83:0x015c, B:84:0x015f, B:22:0x0083, B:24:0x008b, B:93:0x016f, B:94:0x0172), top: B:102:0x000d, inners: #1, #3 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0164 -> B:30:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
