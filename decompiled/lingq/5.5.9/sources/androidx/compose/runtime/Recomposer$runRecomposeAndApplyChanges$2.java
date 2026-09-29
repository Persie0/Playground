package androidx.compose.runtime;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p081e0.C5309f0;
import p081e0.InterfaceC5297b0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, m13365d2 = {"Lno/z;", "Le0/b0;", "parentFrameClock", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m19206f = "Recomposer.kt", m19207l = {492, 510}, m19208m = "invokeSuspend")
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7882z, InterfaceC5297b0, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public List f3089e;

    /* JADX INFO: renamed from: f */
    public List f3090f;

    /* JADX INFO: renamed from: g */
    public List f3091g;

    /* JADX INFO: renamed from: h */
    public Set f3092h;

    /* JADX INFO: renamed from: i */
    public Set f3093i;

    /* JADX INFO: renamed from: j */
    public int f3094j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ InterfaceC5297b0 f3095k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Recomposer f3096l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, InterfaceC9968c<? super Recomposer$runRecomposeAndApplyChanges$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f3096l = recomposer;
    }

    /* JADX INFO: renamed from: C */
    public static final void m1717C(List list, List list2, List list3, Set set, Set set2) {
        list.clear();
        list2.clear();
        list3.clear();
        set.clear();
        set2.clear();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: D */
    public static final void m1718D(List list, Recomposer recomposer) {
        list.clear();
        synchronized (recomposer.f3053b) {
            try {
                ArrayList arrayList = recomposer.f3060i;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.add((C5309f0) arrayList.get(i10));
                }
                recomposer.f3060i.clear();
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7882z interfaceC7882z, InterfaceC5297b0 interfaceC5297b0, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.f3096l, interfaceC9968c);
        recomposer$runRecomposeAndApplyChanges$2.f3095k = interfaceC5297b0;
        return recomposer$runRecomposeAndApplyChanges$2.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0075 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:16:0x008c  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a1 A[Catch: all -> 0x00b8, TryCatch #1 {, blocks: (B:18:0x009b, B:20:0x00a1, B:22:0x00a9, B:21:0x00a7), top: B:88:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7 A[Catch: all -> 0x00b8, TryCatch #1 {, blocks: (B:18:0x009b, B:20:0x00a1, B:22:0x00a9, B:21:0x00a7), top: B:88:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7 A[Catch: all -> 0x0102, TryCatch #0 {, blocks: (B:37:0x00ce, B:39:0x00d7, B:45:0x00e6, B:47:0x00f2), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6 A[Catch: all -> 0x0102, TryCatch #0 {, blocks: (B:37:0x00ce, B:39:0x00d7, B:45:0x00e6, B:47:0x00f2), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2 A[Catch: all -> 0x0102, TRY_LEAVE, TryCatch #0 {, blocks: (B:37:0x00ce, B:39:0x00d7, B:45:0x00e6, B:47:0x00f2), top: B:86:0x00ce }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0105  */
    /* JADX WARN: Code duplicated, block: B:59:0x010a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0115  */
    /* JADX WARN: Code duplicated, block: B:62:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x010a -> B:11:0x0070). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0140 -> B:64:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
