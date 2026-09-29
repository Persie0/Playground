package com.lingq.p055ui.settings;

import ci.InterfaceC2012e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$updateFeedLevels$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {336, 338, 339}, m19208m = "invokeSuspend")
final class DataStoreSettingsViewModel$updateFeedLevels$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public DataStoreSettingsViewModel f31001e;

    /* JADX INFO: renamed from: f */
    public Map f31002f;

    /* JADX INFO: renamed from: g */
    public int f31003g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f31004h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ DataStoreSettingsViewModel f31005i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSettingsViewModel$updateFeedLevels$1(Object obj, DataStoreSettingsViewModel dataStoreSettingsViewModel, InterfaceC9968c<? super DataStoreSettingsViewModel$updateFeedLevels$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31004h = obj;
        this.f31005i = dataStoreSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DataStoreSettingsViewModel$updateFeedLevels$1(this.f31004h, this.f31005i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DataStoreSettingsViewModel$updateFeedLevels$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f3 A[LOOP:0: B:34:0x00ec->B:36:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x011c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        DataStoreSettingsViewModel dataStoreSettingsViewModel;
        Map map;
        DataStoreSettingsViewModel dataStoreSettingsViewModel2;
        InterfaceC2012e interfaceC2012e;
        String strMo498E1;
        ArrayList arrayList;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31003g;
        if (i10 != 0) {
            if (i10 == 1) {
                map = this.f31002f;
                dataStoreSettingsViewModel = this.f31001e;
                C7499b.m14977z0(obj);
            } else if (i10 == 2) {
                map = this.f31002f;
                dataStoreSettingsViewModel2 = this.f31001e;
                C7499b.m14977z0(obj);
                interfaceC2012e = dataStoreSettingsViewModel2.f30973d;
                strMo498E1 = dataStoreSettingsViewModel2.mo498E1();
                arrayList = new ArrayList(map.size());
                it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(String.valueOf(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()));
                }
                this.f31001e = null;
                this.f31002f = null;
                this.f31003g = 3;
                if (interfaceC2012e.mo6039y(strMo498E1, arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        Object obj2 = this.f31004h;
        if (obj2 != null) {
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
            DataStoreSettingsViewModel dataStoreSettingsViewModel3 = this.f31005i;
            InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> interfaceC7116cMo9594i = dataStoreSettingsViewModel3.f30975f.mo9594i();
            this.f31001e = dataStoreSettingsViewModel3;
            this.f31002f = linkedHashMap;
            this.f31003g = 1;
            Object objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9594i, this);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            dataStoreSettingsViewModel = dataStoreSettingsViewModel3;
            obj = objM14360a;
            map = linkedHashMap;
        }
        return C9072e.f47360a;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
        linkedHashMapM13467T0.put(dataStoreSettingsViewModel.mo498E1(), map);
        this.f31001e = dataStoreSettingsViewModel;
        this.f31002f = map;
        this.f31003g = 2;
        if (dataStoreSettingsViewModel.f30975f.mo9569P(linkedHashMapM13467T0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        dataStoreSettingsViewModel2 = dataStoreSettingsViewModel;
        interfaceC2012e = dataStoreSettingsViewModel2.f30973d;
        strMo498E1 = dataStoreSettingsViewModel2.mo498E1();
        arrayList = new ArrayList(map.size());
        it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()));
        }
        this.f31001e = null;
        this.f31002f = null;
        this.f31003g = 3;
        if (interfaceC2012e.mo6039y(strMo498E1, arrayList, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
