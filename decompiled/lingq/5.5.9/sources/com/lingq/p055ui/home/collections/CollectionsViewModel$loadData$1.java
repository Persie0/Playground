package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p349qo.C8656b;
import p400ti.C9288c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$loadData$1", m19206f = "CollectionsViewModel.kt", m19207l = {514}, m19208m = "invokeSuspend")
public final class CollectionsViewModel$loadData$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public String f23392e;

    /* JADX INFO: renamed from: f */
    public String f23393f;

    /* JADX INFO: renamed from: g */
    public String f23394g;

    /* JADX INFO: renamed from: h */
    public int f23395h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CollectionsViewModel f23396i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23397j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$loadData$1(CollectionsViewModel collectionsViewModel, boolean z10, InterfaceC9968c<? super CollectionsViewModel$loadData$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23396i = collectionsViewModel;
        this.f23397j = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$loadData$1(this.f23396i, this.f23397j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$loadData$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String strMo498E1;
        String string;
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23395h;
        CollectionsViewModel collectionsViewModel = this.f23396i;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            strMo498E1 = collectionsViewModel.mo498E1();
            String str5 = (String) collectionsViewModel.f23232O.getValue();
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) collectionsViewModel.f23245b0.getValue());
            String strM9827m2 = CollectionsViewModel.m9827m2(collectionsViewModel, collectionsViewModel.mo498E1());
            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) linkedHashMapM13467T0.get(strM9827m2);
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                linkedHashMapM13467T0.put(strM9827m2, librarySearchQuery);
            }
            boolean z10 = str5.length() > 0;
            C9288c c9288c = collectionsViewModel.f23230M;
            if (z10 || !C5207g.m11106a(c9288c.f47985a.f22050c, LibraryShelfType.Search.getValue()) || !C5207g.m11106a(c9288c.f47985a.f22050c, LibraryShelfType.SourceSearch.getValue())) {
                StateFlowImpl stateFlowImpl = collectionsViewModel.f23231N;
                LibraryTab libraryTab = (LibraryTab) stateFlowImpl.getValue();
                if (libraryTab != null) {
                    String str6 = c9288c.f47985a.f22050c;
                    C5207g.m11111f(str6, "code");
                    String strM16898f = C8656b.m16898f(libraryTab);
                    String strM16876C = C8656b.m16876C(libraryTab);
                    StringBuilder sbM26o = C0009a.m26o(str6, "_type=");
                    sbM26o.append(libraryTab.f22061b);
                    sbM26o.append("_level=");
                    sbM26o.append(libraryTab.f22064e);
                    sbM26o.append("accent=");
                    sbM26o.append(strM16898f);
                    sbM26o.append("isPersonal=");
                    sbM26o.append(strM16876C);
                    string = sbM26o.toString();
                    if (string == null) {
                        string = "";
                    }
                } else {
                    string = "";
                }
                StateFlowImpl stateFlowImpl2 = collectionsViewModel.f23234Q;
                if (((List) stateFlowImpl2.getValue()).isEmpty() || this.f23397j) {
                    collectionsViewModel.f23246c0.setValue(Resource.Status.LOADING);
                    EmptyList emptyList = EmptyList.f38032a;
                    stateFlowImpl2.setValue(emptyList);
                    collectionsViewModel.f23236S.setValue(emptyList);
                    collectionsViewModel.f23237T.setValue(emptyList);
                    collectionsViewModel.f23235R.setValue(emptyList);
                    collectionsViewModel.f23238U.setValue(Boolean.FALSE);
                    collectionsViewModel.f23239V.setValue(new Integer(1));
                }
                LibraryTab libraryTab2 = (LibraryTab) stateFlowImpl.getValue();
                String str7 = string + "searchlevel=" + (libraryTab2 != null ? libraryTab2.f22064e : null);
                LibraryTab libraryTab3 = (LibraryTab) stateFlowImpl.getValue();
                if (C5207g.m11106a(libraryTab3 != null ? libraryTab3.f22061b : null, "courses")) {
                    C7661i.m15254T2(str7, "_type=lessons_", "_type=courses_");
                } else {
                    LibraryTab libraryTab4 = (LibraryTab) stateFlowImpl.getValue();
                    if (C5207g.m11106a(libraryTab4 != null ? libraryTab4.f22061b : null, "lessons")) {
                        C7661i.m15254T2(str7, "_type=courses_", "_type=lessons_");
                    }
                }
                if (C5207g.m11106a(c9288c.f47985a.f22050c, LibraryShelfType.Guided.getValue())) {
                    LibraryTab libraryTab5 = (LibraryTab) stateFlowImpl.getValue();
                    int iOrdinal = (libraryTab5 == null || (num = libraryTab5.f22064e) == null) ? LearningLevel.Beginner1.ordinal() : num.intValue() - 1;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (LearningLevel learningLevel : LearningLevel.values()) {
                        int iOrdinal2 = learningLevel.ordinal();
                        linkedHashMap.put(learningLevel, Boolean.valueOf(iOrdinal <= iOrdinal2 && iOrdinal2 <= iOrdinal));
                    }
                    librarySearchQuery.f22025b = linkedHashMap;
                    linkedHashMapM13467T0.put(strM9827m2, librarySearchQuery);
                    this.f23392e = strMo498E1;
                    this.f23393f = str5;
                    this.f23394g = str7;
                    this.f23395h = 1;
                    if (collectionsViewModel.f23257i.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = strMo498E1;
                    str4 = str5;
                    str2 = str7;
                } else {
                    str = str5;
                    str2 = str7;
                }
                int iIntValue = ((Number) collectionsViewModel.f23239V.getValue()).intValue();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(collectionsViewModel);
                String str8 = strMo498E1;
                String str9 = str2;
                String str10 = str;
                CollectionsViewModel$getLibraryItems$1 collectionsViewModel$getLibraryItems$1 = new CollectionsViewModel$getLibraryItems$1(collectionsViewModel, str8, str9, str10, iIntValue, null);
                CoroutineJobManager coroutineJobManager = collectionsViewModel.f23255h;
                CoroutineDispatcher coroutineDispatcher = collectionsViewModel.f23253g;
                C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "libraryItems", collectionsViewModel$getLibraryItems$1);
                C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), coroutineDispatcher, null, new CollectionsViewModel$fetchLibraryItemsNetwork$1(collectionsViewModel, str8, str9, str10, collectionsViewModel.f23230M.f47985a.f22050c, CollectionsViewModel.m9827m2(collectionsViewModel, strMo498E1), ((Number) collectionsViewModel.f23239V.getValue()).intValue(), null), 2);
            }
            return C9072e.f47360a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = this.f23394g;
        str4 = this.f23393f;
        str3 = this.f23392e;
        C7499b.m14977z0(obj);
        String str11 = str3;
        str = str4;
        strMo498E1 = str11;
        int iIntValue2 = ((Number) collectionsViewModel.f23239V.getValue()).intValue();
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(collectionsViewModel);
        String str12 = strMo498E1;
        String str13 = str2;
        String str14 = str;
        CollectionsViewModel$getLibraryItems$1 collectionsViewModel$getLibraryItems$2 = new CollectionsViewModel$getLibraryItems$1(collectionsViewModel, str12, str13, str14, iIntValue2, null);
        CoroutineJobManager coroutineJobManager2 = collectionsViewModel.f23255h;
        CoroutineDispatcher coroutineDispatcher2 = collectionsViewModel.f23253g;
        C7499b.m14933c0(interfaceC7882zM16767w1, coroutineJobManager2, coroutineDispatcher2, "libraryItems", collectionsViewModel$getLibraryItems$2);
        C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), coroutineDispatcher2, null, new CollectionsViewModel$fetchLibraryItemsNetwork$1(collectionsViewModel, str12, str13, str14, collectionsViewModel.f23230M.f47985a.f22050c, CollectionsViewModel.m9827m2(collectionsViewModel, strMo498E1), ((Number) collectionsViewModel.f23239V.getValue()).intValue(), null), 2);
        return C9072e.f47360a;
    }
}
