package com.lingq.p055ui.home.collections;

import cm.InterfaceC2059s;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181ii.C6332a;
import p181ii.C6333b;
import p181ii.C6334c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "items", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "counters", "Lii/b;", "downloads", "Lii/c;", "audioDownloads", "Lcom/lingq/ui/home/library/CollectionsAdapter$a;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$_libraryAdapterItems$1", m19206f = "CollectionsViewModel.kt", m19207l = {136}, m19208m = "invokeSuspend")
final class CollectionsViewModel$_libraryAdapterItems$1 extends SuspendLambda implements InterfaceC2059s<List<? extends C6332a>, List<? extends LibraryItemCounter>, List<? extends C6333b>, List<? extends C6334c>, InterfaceC9968c<? super List<? extends CollectionsAdapter.AbstractC3739a>>, Object> {

    /* JADX INFO: renamed from: H */
    public /* synthetic */ List f23292H;

    /* JADX INFO: renamed from: I */
    public /* synthetic */ List f23293I;

    /* JADX INFO: renamed from: J */
    public /* synthetic */ List f23294J;

    /* JADX INFO: renamed from: K */
    public /* synthetic */ Object f23295K;

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ CollectionsViewModel f23296L;

    /* JADX INFO: renamed from: e */
    public Collection f23297e;

    /* JADX INFO: renamed from: f */
    public Iterator f23298f;

    /* JADX INFO: renamed from: g */
    public C6332a f23299g;

    /* JADX INFO: renamed from: h */
    public LibraryItemCounter f23300h;

    /* JADX INFO: renamed from: i */
    public C6333b f23301i;

    /* JADX INFO: renamed from: j */
    public Collection f23302j;

    /* JADX INFO: renamed from: k */
    public boolean f23303k;

    /* JADX INFO: renamed from: l */
    public int f23304l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$_libraryAdapterItems$1(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super CollectionsViewModel$_libraryAdapterItems$1> interfaceC9968c) {
        super(5, interfaceC9968c);
        this.f23296L = collectionsViewModel;
    }

    @Override // cm.InterfaceC2059s
    /* JADX INFO: renamed from: o0 */
    public final Object mo1501o0(List<? extends C6332a> list, List<? extends LibraryItemCounter> list2, List<? extends C6333b> list3, List<? extends C6334c> list4, InterfaceC9968c<? super List<? extends CollectionsAdapter.AbstractC3739a>> interfaceC9968c) {
        CollectionsViewModel$_libraryAdapterItems$1 collectionsViewModel$_libraryAdapterItems$1 = new CollectionsViewModel$_libraryAdapterItems$1(this.f23296L, interfaceC9968c);
        collectionsViewModel$_libraryAdapterItems$1.f23292H = list;
        collectionsViewModel$_libraryAdapterItems$1.f23293I = list2;
        collectionsViewModel$_libraryAdapterItems$1.f23294J = list3;
        collectionsViewModel$_libraryAdapterItems$1.f23295K = list4;
        return collectionsViewModel$_libraryAdapterItems$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:? A[LOOP:2: B:34:0x00bc->B:123:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01b6 -> B:94:0x01be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.collections.CollectionsViewModel$_libraryAdapterItems$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
