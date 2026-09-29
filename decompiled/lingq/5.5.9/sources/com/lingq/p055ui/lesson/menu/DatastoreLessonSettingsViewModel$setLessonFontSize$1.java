package com.lingq.p055ui.lesson.menu;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$setLessonFontSize$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {672, 674}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$setLessonFontSize$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28225e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsViewModel f28226f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f28227g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsViewModel$setLessonFontSize$1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, int i10, InterfaceC9968c<? super DatastoreLessonSettingsViewModel$setLessonFontSize$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28226f = datastoreLessonSettingsViewModel;
        this.f28227g = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreLessonSettingsViewModel$setLessonFontSize$1(this.f28226f, this.f28227g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreLessonSettingsViewModel$setLessonFontSize$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008c  */
    /* JADX WARN: Code duplicated, block: B:30:0x008e  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        int i10;
        int iIntValue;
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.f28225e;
        DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28226f;
        if (i12 != 0) {
            if (i12 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        List<Integer> list = C6716m.f37937a;
        int iIndexOf = list.indexOf(datastoreLessonSettingsViewModel.f28166U.getValue());
        int i13 = this.f28227g;
        if (i13 < 0 && (i11 = iIndexOf - 1) >= 0) {
            iIntValue = list.get(i11).intValue();
        } else if (i13 <= 0 || (i10 = iIndexOf + 1) >= list.size()) {
            PreferenceStoreImpl$special$$inlined$map$16 preferenceStoreImpl$special$$inlined$map$16Mo9602q = datastoreLessonSettingsViewModel.f28181g.mo9602q();
            this.f28225e = 1;
            obj = FlowKt__ReduceKt.m14360a(preferenceStoreImpl$special$$inlined$map$16Mo9602q, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            iIntValue = list.get(i10).intValue();
        }
        InterfaceC5179a interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
        this.f28225e = 2;
        return interfaceC5179a.mo9599n(iIntValue, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        iIntValue = ((Number) obj).intValue();
        InterfaceC5179a interfaceC5179a2 = datastoreLessonSettingsViewModel.f28181g;
        this.f28225e = 2;
        if (interfaceC5179a2.mo9599n(iIntValue, this) == coroutineSingletons) {
        }
    }
}
