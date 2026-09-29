package com.lingq.p055ui.lesson.menu;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {596}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28216e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsViewModel f28217f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f28218g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, String str, InterfaceC9968c<? super DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28217f = datastoreLessonSettingsViewModel;
        this.f28218g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1(this.f28217f, this.f28218g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DatastoreLessonSettingsViewModel$removeDictionaryLanguage$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28216e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28217f;
            ArrayList arrayListM13454v0 = C6752c.m13454v0(((Profile) datastoreLessonSettingsViewModel.f28169X.getValue()).f17798r);
            if (!arrayListM13454v0.isEmpty()) {
                arrayListM13454v0.remove(this.f28218g);
                this.f28216e = 1;
                if (datastoreLessonSettingsViewModel.f28175d.mo6140i(arrayListM13454v0, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
