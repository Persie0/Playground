package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLessonsAudiosDownloads$1", m19206f = "CollectionsViewModel.kt", m19207l = {421, 427}, m19208m = "invokeSuspend")
final class CollectionsViewModel$getLessonsAudiosDownloads$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ CollectionsViewModel f23343H;

    /* JADX INFO: renamed from: e */
    public CollectionsViewModel f23344e;

    /* JADX INFO: renamed from: f */
    public Collection f23345f;

    /* JADX INFO: renamed from: g */
    public Iterator f23346g;

    /* JADX INFO: renamed from: h */
    public Object f23347h;

    /* JADX INFO: renamed from: i */
    public Object[] f23348i;

    /* JADX INFO: renamed from: j */
    public Collection f23349j;

    /* JADX INFO: renamed from: k */
    public int f23350k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ List<Integer> f23351l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLessonsAudiosDownloads$1(CollectionsViewModel collectionsViewModel, List list, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23351l = list;
        this.f23343H = collectionsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$getLessonsAudiosDownloads$1(this.f23343H, this.f23351l, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$getLessonsAudiosDownloads$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d0  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d0 -> B:25:0x00d3). Please report as a decompilation issue!!! */
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
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.collections.CollectionsViewModel$getLessonsAudiosDownloads$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
