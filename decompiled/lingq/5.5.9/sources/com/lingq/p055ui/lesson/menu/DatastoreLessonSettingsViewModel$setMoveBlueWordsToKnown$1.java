package com.lingq.p055ui.lesson.menu;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ni.C7796d;
import no.InterfaceC7882z;
import p076di.InterfaceC5179a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {603}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28231e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsViewModel f28232f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f28233g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, boolean z10, InterfaceC9968c<? super DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28232f = datastoreLessonSettingsViewModel;
        this.f28233g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1(this.f28232f, this.f28233g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreLessonSettingsViewModel$setMoveBlueWordsToKnown$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28231e;
        boolean z10 = this.f28233g;
        DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28232f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC5179a interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
            this.f28231e = 1;
            if (interfaceC5179a.mo9576W(z10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        C7796d c7796d = datastoreLessonSettingsViewModel.f28187j;
        String[] strArr = new String[2];
        strArr[0] = "paging_moves_to_known";
        strArr[1] = z10 ? "yes" : "no";
        c7796d.getClass();
        c7796d.m15505b(C7796d.m15504a(strArr), "change_setting");
        return C9072e.f47360a;
    }
}
