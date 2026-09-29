package com.lingq.p055ui.home.collections.filter;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.filter.CollectionsSearchFilterViewModel$storeLevelsSelected$1", m19206f = "CollectionsSearchFilterViewModel.kt", m19207l = {138}, m19208m = "invokeSuspend")
final class CollectionsSearchFilterViewModel$storeLevelsSelected$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23631e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsSearchFilterViewModel f23632f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f23633g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsSearchFilterViewModel$storeLevelsSelected$1(CollectionsSearchFilterViewModel collectionsSearchFilterViewModel, Object obj, InterfaceC9968c<? super CollectionsSearchFilterViewModel$storeLevelsSelected$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f23632f = collectionsSearchFilterViewModel;
        this.f23633g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsSearchFilterViewModel$storeLevelsSelected$1(this.f23632f, this.f23633g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsSearchFilterViewModel$storeLevelsSelected$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23631e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsSearchFilterViewModel collectionsSearchFilterViewModel = this.f23632f;
            LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) collectionsSearchFilterViewModel.f23623j.getValue());
            Map map = (Map) collectionsSearchFilterViewModel.f23623j.getValue();
            String str = collectionsSearchFilterViewModel.f23621h;
            LibrarySearchQuery librarySearchQuery = (LibrarySearchQuery) map.get(str);
            if (librarySearchQuery == null) {
                librarySearchQuery = new LibrarySearchQuery(null, null, 0, null, false, false, false, null, null, null, null, null, 4095, null);
            }
            Object obj2 = this.f23633g;
            C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.Pair<*, *>");
            Pair pair = (Pair) obj2;
            A a10 = pair.f38012a;
            C5207g.m11109d(a10, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) a10).intValue();
            B b10 = pair.f38013b;
            C5207g.m11109d(b10, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) b10).intValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (LearningLevel learningLevel : LearningLevel.values()) {
                int iOrdinal = learningLevel.ordinal();
                linkedHashMap.put(learningLevel, Boolean.valueOf(iIntValue <= iOrdinal && iOrdinal <= iIntValue2));
            }
            librarySearchQuery.f22025b = linkedHashMap;
            linkedHashMapM13467T0.put(str, librarySearchQuery);
            this.f23631e = 1;
            if (collectionsSearchFilterViewModel.f23617d.mo9696t(linkedHashMapM13467T0, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
