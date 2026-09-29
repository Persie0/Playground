package kotlin.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p249lo.AbstractC7417j;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Llo/j;", "", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m19206f = "SlidingWindow.kt", m19207l = {34, 40, 49, 55, 58}, m19208m = "invokeSuspend")
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements InterfaceC2056p<AbstractC7417j<? super List<Object>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: c */
    public Object f38035c;

    /* JADX INFO: renamed from: d */
    public Iterator f38036d;

    /* JADX INFO: renamed from: e */
    public int f38037e;

    /* JADX INFO: renamed from: f */
    public int f38038f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f38039g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f38040h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f38041i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Iterator<Object> f38042j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f38043k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean f38044l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i10, int i11, Iterator<Object> it, boolean z10, boolean z11, InterfaceC9968c<? super SlidingWindowKt$windowedIterator$1> interfaceC9968c) {
        super(interfaceC9968c);
        this.f38040h = i10;
        this.f38041i = i11;
        this.f38042j = it;
        this.f38043k = z10;
        this.f38044l = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.f38040h, this.f38041i, this.f38042j, this.f38043k, this.f38044l, interfaceC9968c);
        slidingWindowKt$windowedIterator$1.f38039g = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(AbstractC7417j<? super List<Object>> abstractC7417j, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SlidingWindowKt$windowedIterator$1) mo1336a(abstractC7417j, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:104:0x013b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:57:0x010b  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141  */
    /* JADX WARN: Code duplicated, block: B:77:0x0154 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a0 -> B:33:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0152 -> B:78:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x0186 -> B:93:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
