package kotlinx.coroutines.flow;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2052l;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@"}, m13365d2 = {"T", "Lno/z;", "Lkotlinx/coroutines/flow/d;", "downstream", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", m19206f = "Delay.kt", m19207l = {222, 355}, m19208m = "invokeSuspend")
final class FlowKt__DelayKt$debounceInternal$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7882z, InterfaceC7117d<Object>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Ref$ObjectRef f40061e;

    /* JADX INFO: renamed from: f */
    public Ref$LongRef f40062f;

    /* JADX INFO: renamed from: g */
    public int f40063g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f40064h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f40065i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC2052l<Object, Long> f40066j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC7116c<Object> f40067k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1(InterfaceC2052l<Object, Long> interfaceC2052l, InterfaceC7116c<Object> interfaceC7116c, InterfaceC9968c<? super FlowKt__DelayKt$debounceInternal$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f40066j = interfaceC2052l;
        this.f40067k = interfaceC7116c;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7882z interfaceC7882z, InterfaceC7117d<Object> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.f40066j, this.f40067k, interfaceC9968c);
        flowKt__DelayKt$debounceInternal$1.f40064h = interfaceC7882z;
        flowKt__DelayKt$debounceInternal$1.f40065i = interfaceC7117d;
        return flowKt__DelayKt$debounceInternal$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0087  */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0094  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc A[Catch: all -> 0x0113, TryCatch #0 {all -> 0x0113, blocks: (B:42:0x00f8, B:44:0x00fc, B:45:0x0106), top: B:64:0x00f8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0143 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0144 -> B:17:0x0081). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
