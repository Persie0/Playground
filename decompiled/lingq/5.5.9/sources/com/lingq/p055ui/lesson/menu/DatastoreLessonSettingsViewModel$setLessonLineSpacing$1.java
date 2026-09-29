package com.lingq.p055ui.lesson.menu;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$setLessonLineSpacing$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {686, 688}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$setLessonLineSpacing$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28228e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsViewModel f28229f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28230g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsViewModel$setLessonLineSpacing$1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, int i10, InterfaceC9968c<? super DatastoreLessonSettingsViewModel$setLessonLineSpacing$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28229f = datastoreLessonSettingsViewModel;
        this.f28230g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreLessonSettingsViewModel$setLessonLineSpacing$1(this.f28229f, this.f28230g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreLessonSettingsViewModel$setLessonLineSpacing$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008f  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        double dDoubleValue;
        int i11;
        InterfaceC5179a interfaceC5179a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f28228e;
        DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28229f;
        if (i12 != 0) {
            if (i12 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        List<Double> list = C6716m.f37938b;
        int iIndexOf = list.indexOf(datastoreLessonSettingsViewModel.f28167V.getValue());
        int i13 = this.f28230g;
        if (i13 < 0 && (i11 = iIndexOf - 1) >= 0) {
            dDoubleValue = list.get(i11).doubleValue();
        } else if (i13 <= 0 || (i10 = iIndexOf + 1) >= list.size()) {
            PreferenceStoreImpl$special$$inlined$map$17 preferenceStoreImpl$special$$inlined$map$17Mo9581a0 = datastoreLessonSettingsViewModel.f28181g.mo9581a0();
            this.f28228e = 1;
            obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$17Mo9581a0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            dDoubleValue = list.get(i10).doubleValue();
        }
        interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
        this.f28228e = 2;
        if (interfaceC5179a.mo9572S(dDoubleValue, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
        dDoubleValue = ((Number) obj).doubleValue();
        interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
        this.f28228e = 2;
        if (interfaceC5179a.mo9572S(dDoubleValue, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
