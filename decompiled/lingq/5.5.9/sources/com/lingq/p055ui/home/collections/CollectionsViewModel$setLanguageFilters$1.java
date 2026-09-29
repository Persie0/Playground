package com.lingq.p055ui.home.collections;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p076di.InterfaceC5182d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$setLanguageFilters$1", m19206f = "CollectionsViewModel.kt", m19207l = {774, 777, 783}, m19208m = "invokeSuspend")
final class CollectionsViewModel$setLanguageFilters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public Map f23398e;

    /* JADX INFO: renamed from: f */
    public CollectionsViewModel f23399f;

    /* JADX INFO: renamed from: g */
    public LibrarySearchQuery f23400g;

    /* JADX INFO: renamed from: h */
    public int f23401h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ CollectionsViewModel f23402i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f23403j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$setLanguageFilters$1(CollectionsViewModel collectionsViewModel, boolean z10, InterfaceC9968c<? super CollectionsViewModel$setLanguageFilters$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23402i = collectionsViewModel;
        this.f23403j = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$setLanguageFilters$1(this.f23402i, this.f23403j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$setLanguageFilters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:23:0x007c, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Map<String, LibrarySearchQuery> map;
        LibrarySearchQuery librarySearchQuery;
        CollectionsViewModel collectionsViewModel;
        InterfaceC5182d interfaceC5182d;
        Map<LearningLevel, Boolean> map2;
        int iOrdinal;
        LinkedHashMap linkedHashMap;
        int i10;
        int iOrdinal2;
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = this.f23401h;
        CollectionsViewModel collectionsViewModel2 = this.f23402i;
        if (i11 != 0) {
            if (i11 == 1) {
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                librarySearchQuery = this.f23400g;
                collectionsViewModel = this.f23399f;
                map = this.f23398e;
                C7499b.m14977z0(obj);
                map2 = (Map) ((Map) obj).get(collectionsViewModel.mo498E1());
                if (map2 == null) {
                    iOrdinal = LearningLevel.Beginner1.ordinal();
                    int iOrdinal3 = LearningLevel.Advanced2.ordinal();
                    linkedHashMap = new LinkedHashMap();
                    for (LearningLevel learningLevel : LearningLevel.values()) {
                        iOrdinal2 = learningLevel.ordinal();
                        if (iOrdinal <= iOrdinal2 || iOrdinal2 > iOrdinal3) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        linkedHashMap.put(learningLevel, Boolean.valueOf(z10));
                    }
                    map2 = linkedHashMap;
                }
                librarySearchQuery.getClass();
                librarySearchQuery.f22025b = map2;
                interfaceC5182d = collectionsViewModel2.f23257i;
                this.f23398e = null;
                this.f23399f = null;
                this.f23400g = null;
                this.f23401h = 3;
                if (interfaceC5182d.mo9696t(map, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            if (this.f23403j) {
                collectionsViewModel2.m9836o2(true);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC7116c<Map<String, LibrarySearchQuery>> interfaceC7116cMo9688l = collectionsViewModel2.f23257i.mo9688l();
        this.f23401h = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9688l, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        map = (Map) obj;
        librarySearchQuery = map.get(CollectionsViewModel.m9827m2(collectionsViewModel2, collectionsViewModel2.mo498E1()));
        if (librarySearchQuery != null) {
            InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i = collectionsViewModel2.f23261k.mo9594i();
            this.f23398e = map;
            this.f23399f = collectionsViewModel2;
            this.f23400g = librarySearchQuery;
            this.f23401h = 2;
            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            collectionsViewModel = collectionsViewModel2;
            map2 = (Map) ((Map) obj).get(collectionsViewModel.mo498E1());
            if (map2 == null) {
                iOrdinal = LearningLevel.Beginner1.ordinal();
                int iOrdinal4 = LearningLevel.Advanced2.ordinal();
                linkedHashMap = new LinkedHashMap();
                while (i10 < r9) {
                    iOrdinal2 = learningLevel.ordinal();
                    if (iOrdinal <= iOrdinal2) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    linkedHashMap.put(learningLevel, Boolean.valueOf(z10));
                }
                map2 = linkedHashMap;
            }
            librarySearchQuery.getClass();
            librarySearchQuery.f22025b = map2;
        }
        interfaceC5182d = collectionsViewModel2.f23257i;
        this.f23398e = null;
        this.f23399f = null;
        this.f23400g = null;
        this.f23401h = 3;
        if (interfaceC5182d.mo9696t(map, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (this.f23403j) {
            collectionsViewModel2.m9836o2(true);
        }
        return C9072e.f47360a;
    }
}
