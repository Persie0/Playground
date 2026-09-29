package com.lingq.p055ui.home.collections.filter;

import androidx.datastore.preferences.PreferencesProto$Value;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.p053ui.FilterType;
import com.lingq.shared.uimodel.library.Accent;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import dm.C5207g;
import dm.C5213m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.InterfaceC7882z;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$updateFilter$1", m19206f = "CollectionsSearchFilterSelectionViewModel.kt", m19207l = {264, 272, 285, 289, 303, 307}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterSelectionViewModel$updateFilter$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ArrayList f23612e;

    /* JADX INFO: renamed from: f */
    public int f23613f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ CollectionsSearchFilterSelectionViewModel f23614g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23615h;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.filter.CollectionsSearchFilterSelectionViewModel$updateFilter$1$a */
    public /* synthetic */ class C3613a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f23616a;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.ProviderSharedBy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.LessonTags.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.Accent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23616a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterSelectionViewModel$updateFilter$1(CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel, String str, InterfaceC9968c<? super CollectionsSearchFilterSelectionViewModel$updateFilter$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23614g = collectionsSearchFilterSelectionViewModel;
        this.f23615h = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterSelectionViewModel$updateFilter$1(this.f23614g, this.f23615h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterSelectionViewModel$updateFilter$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0133  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x018c  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x01e1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:65:0x01c8->B:83:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objM14360a;
        ArrayList arrayListM13454v0;
        Object objM14360a2;
        ArrayList arrayListM13454v1;
        Accent accent;
        Object objM14360a3;
        LinkedHashMap linkedHashMapM13467T0;
        LibrarySearchQuery librarySearchQuery;
        CollectionsFilterUser collectionsFilterUser;
        String str;
        LinkedHashMap linkedHashMapM13467T1;
        LibrarySearchQuery librarySearchQuery2;
        LinkedHashMap linkedHashMapM13467T2;
        LibrarySearchQuery librarySearchQuery3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23613f;
        CollectionsFilterUser collectionsFilterUser2 = null;
        Object obj2 = null;
        String str2 = this.f23615h;
        CollectionsSearchFilterSelectionViewModel collectionsSearchFilterSelectionViewModel = this.f23614g;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                FilterType filterType = collectionsSearchFilterSelectionViewModel.f23547i;
                int i11 = filterType == null ? -1 : C3613a.f23616a[filterType.ordinal()];
                InterfaceC5182d interfaceC5182d = collectionsSearchFilterSelectionViewModel.f23542d;
                if (i11 == 1) {
                    InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = interfaceC5182d.mo9688l();
                    this.f23613f = 1;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                    librarySearchQuery = (LibrarySearchQuery) linkedHashMapM13467T0.get(collectionsSearchFilterSelectionViewModel.f23548j);
                    if (librarySearchQuery == null) {
                        librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                    }
                    if (!C7661i.m15250P2(str2)) {
                        for (Object obj3 : (Iterable) collectionsSearchFilterSelectionViewModel.f23536O.getValue()) {
                            collectionsFilterUser = (CollectionsFilterUser) obj3;
                            if (collectionsFilterUser != null) {
                                str = collectionsFilterUser.f21933b;
                            } else {
                                str = null;
                            }
                            if (C5207g.m11106a(str, str2)) {
                                obj2 = obj3;
                                collectionsFilterUser2 = (CollectionsFilterUser) obj2;
                            }
                        }
                        collectionsFilterUser2 = (CollectionsFilterUser) obj2;
                    }
                    librarySearchQuery.f22034k = collectionsFilterUser2;
                    linkedHashMapM13467T0.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery);
                    this.f23613f = 2;
                    if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    collectionsSearchFilterSelectionViewModel.f23538Q.mo14371k(Boolean.TRUE);
                } else if (i11 == 2) {
                    StateFlowImpl stateFlowImpl = collectionsSearchFilterSelectionViewModel.f23532K;
                    arrayListM13454v0 = C6752c.m13454v0((Collection) stateFlowImpl.getValue());
                    if (arrayListM13454v0.contains(str2)) {
                        arrayListM13454v0.remove(str2);
                    } else {
                        arrayListM13454v0.add(str2);
                    }
                    stateFlowImpl.setValue(arrayListM13454v0);
                    InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l2 = interfaceC5182d.mo9688l();
                    this.f23612e = arrayListM13454v0;
                    this.f23613f = 3;
                    objM14360a2 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l2, this);
                    if (objM14360a2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a2);
                    librarySearchQuery2 = (LibrarySearchQuery) linkedHashMapM13467T1.get(collectionsSearchFilterSelectionViewModel.f23548j);
                    if (librarySearchQuery2 == null) {
                        librarySearchQuery2 = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                    }
                    C5207g.m11111f(arrayListM13454v0, "<set-?>");
                    librarySearchQuery2.f22031h = arrayListM13454v0;
                    linkedHashMapM13467T1.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery2);
                    this.f23612e = null;
                    this.f23613f = 4;
                    if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i11 == 3) {
                    StateFlowImpl stateFlowImpl2 = collectionsSearchFilterSelectionViewModel.f23540S;
                    arrayListM13454v1 = C6752c.m13454v0((Collection) stateFlowImpl2.getValue());
                    Accent[] accentArrValues = Accent.values();
                    int length = accentArrValues.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length) {
                            accent = accentArrValues[i12];
                            if (!C5207g.m11106a(accent.getValue(), str2)) {
                                i12++;
                            }
                        } else {
                            accent = null;
                        }
                    }
                    if (C6752c.m13415I(arrayListM13454v1, accent)) {
                        C5213m.m11196a(arrayListM13454v1);
                        arrayListM13454v1.remove(accent);
                    } else if (accent != null) {
                        arrayListM13454v1.add(accent);
                    }
                    stateFlowImpl2.setValue(arrayListM13454v1);
                    InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l3 = interfaceC5182d.mo9688l();
                    this.f23612e = arrayListM13454v1;
                    this.f23613f = 5;
                    objM14360a3 = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l3, this);
                    if (objM14360a3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    linkedHashMapM13467T2 = C6753d.m13467T0((Map) objM14360a3);
                    librarySearchQuery3 = (LibrarySearchQuery) linkedHashMapM13467T2.get(collectionsSearchFilterSelectionViewModel.f23548j);
                    if (librarySearchQuery3 == null) {
                        librarySearchQuery3 = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                    }
                    C5207g.m11111f(arrayListM13454v1, "<set-?>");
                    librarySearchQuery3.f22035l = arrayListM13454v1;
                    linkedHashMapM13467T2.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery3);
                    this.f23612e = null;
                    this.f23613f = 6;
                    if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return C9072e.f47360a;
            case 1:
                C7499b.m14977z0(obj);
                objM14360a = obj;
                linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
                librarySearchQuery = (LibrarySearchQuery) linkedHashMapM13467T0.get(collectionsSearchFilterSelectionViewModel.f23548j);
                if (librarySearchQuery == null) {
                    librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                }
                if (!C7661i.m15250P2(str2)) {
                    while (r8.hasNext()) {
                        collectionsFilterUser = (CollectionsFilterUser) obj3;
                        if (collectionsFilterUser != null) {
                            str = collectionsFilterUser.f21933b;
                        } else {
                            str = null;
                        }
                        if (C5207g.m11106a(str, str2)) {
                            obj2 = obj3;
                            collectionsFilterUser2 = (CollectionsFilterUser) obj2;
                        }
                    }
                    collectionsFilterUser2 = (CollectionsFilterUser) obj2;
                }
                librarySearchQuery.f22034k = collectionsFilterUser2;
                linkedHashMapM13467T0.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery);
                this.f23613f = 2;
                if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                collectionsSearchFilterSelectionViewModel.f23538Q.mo14371k(Boolean.TRUE);
                return C9072e.f47360a;
            case 2:
                C7499b.m14977z0(obj);
                collectionsSearchFilterSelectionViewModel.f23538Q.mo14371k(Boolean.TRUE);
                return C9072e.f47360a;
            case 3:
                ArrayList arrayList = this.f23612e;
                C7499b.m14977z0(obj);
                arrayListM13454v0 = arrayList;
                objM14360a2 = obj;
                linkedHashMapM13467T1 = C6753d.m13467T0((Map) objM14360a2);
                librarySearchQuery2 = (LibrarySearchQuery) linkedHashMapM13467T1.get(collectionsSearchFilterSelectionViewModel.f23548j);
                if (librarySearchQuery2 == null) {
                    librarySearchQuery2 = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                }
                C5207g.m11111f(arrayListM13454v0, "<set-?>");
                librarySearchQuery2.f22031h = arrayListM13454v0;
                linkedHashMapM13467T1.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery2);
                this.f23612e = null;
                this.f23613f = 4;
                if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            case 4:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            case 5:
                ArrayList arrayList2 = this.f23612e;
                C7499b.m14977z0(obj);
                arrayListM13454v1 = arrayList2;
                objM14360a3 = obj;
                linkedHashMapM13467T2 = C6753d.m13467T0((Map) objM14360a3);
                librarySearchQuery3 = (LibrarySearchQuery) linkedHashMapM13467T2.get(collectionsSearchFilterSelectionViewModel.f23548j);
                if (librarySearchQuery3 == null) {
                    librarySearchQuery3 = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
                }
                C5207g.m11111f(arrayListM13454v1, "<set-?>");
                librarySearchQuery3.f22035l = arrayListM13454v1;
                linkedHashMapM13467T2.put(collectionsSearchFilterSelectionViewModel.f23548j, librarySearchQuery3);
                this.f23612e = null;
                this.f23613f = 6;
                if (collectionsSearchFilterSelectionViewModel.f23542d.mo9696t(linkedHashMapM13467T2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
