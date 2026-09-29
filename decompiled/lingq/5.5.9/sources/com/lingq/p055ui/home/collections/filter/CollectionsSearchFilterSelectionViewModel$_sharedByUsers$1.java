package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/CollectionsFilterUser;", "collectionsFilterUsers", "", "query", "", "isEmpty", "isLoading", "", "Lcom/lingq/ui/home/collections/filter/CollectionsSearchFilterSelectionAdapter$b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {129, 136, 156, 162}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1 extends SuspendLambda implements InterfaceC2059s<List<? extends CollectionsFilterUser>, String, Boolean, Boolean, InterfaceC9968c<? super List<CollectionsSearchFilterSelectionAdapter.AbstractC3585b>>, Object> {

    /* JADX INFO: renamed from: H */
    public int f23578H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ Object f23579I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ Object f23580J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ boolean f23581K;

    /* JADX INFO: renamed from: L */
    public /* synthetic */ boolean f23582L;

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23583M;

    /* JADX INFO: renamed from: e */
    public Object f23584e;

    /* JADX INFO: renamed from: f */
    public Object f23585f;

    /* JADX INFO: renamed from: g */
    public Object f23586g;

    /* JADX INFO: renamed from: h */
    public Object f23587h;

    /* JADX INFO: renamed from: i */
    public String f23588i;

    /* JADX INFO: renamed from: j */
    public Object f23589j;

    /* JADX INFO: renamed from: k */
    public List f23590k;

    /* JADX INFO: renamed from: l */
    public Collection f23591l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f23583M = collectionsSearchFilterSelectionViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(List<? extends CollectionsFilterUser> list, String str, Boolean bool, Boolean bool2, InterfaceC9968c<? super List<CollectionsSearchFilterSelectionAdapter.AbstractC3585b>> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1 collectionsSearchFilterSelectionViewModel$_sharedByUsers$1 = new CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1(this.f23583M, interfaceC9968c);
        collectionsSearchFilterSelectionViewModel$_sharedByUsers$1.f23579I = list;
        collectionsSearchFilterSelectionViewModel$_sharedByUsers$1.f23580J = str;
        collectionsSearchFilterSelectionViewModel$_sharedByUsers$1.f23581K = zBooleanValue;
        collectionsSearchFilterSelectionViewModel$_sharedByUsers$1.f23582L = zBooleanValue2;
        return collectionsSearchFilterSelectionViewModel$_sharedByUsers$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x01da  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:60:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:62:0x01f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01cb -> B:49:0x01ce). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x024b -> B:71:0x0256). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$_sharedByUsers$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
