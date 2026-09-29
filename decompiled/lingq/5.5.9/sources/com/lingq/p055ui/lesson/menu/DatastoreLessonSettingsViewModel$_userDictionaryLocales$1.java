package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguage", "Lcom/lingq/shared/domain/Profile;", "profile", "", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$_userDictionaryLocales$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {241}, m19208m = "invokeSuspend")
final class DatastoreLessonSettingsViewModel$_userDictionaryLocales$1 extends SuspendLambda implements InterfaceC2057q<UserLanguage, Profile, InterfaceC9968c<? super List<? extends UserDictionaryLocale>>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DatastoreLessonSettingsViewModel f28215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatastoreLessonSettingsViewModel$_userDictionaryLocales$1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c<? super DatastoreLessonSettingsViewModel$_userDictionaryLocales$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28215f = datastoreLessonSettingsViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(UserLanguage userLanguage, Profile profile, InterfaceC9968c<? super List<? extends UserDictionaryLocale>> interfaceC9968c) {
        return new DatastoreLessonSettingsViewModel$_userDictionaryLocales$1(this.f28215f, interfaceC9968c).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28214e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28215f;
            InterfaceC7116c interfaceC7116cM307S0 = C0062b.m307S0(datastoreLessonSettingsViewModel.f28177e.mo6077a(), datastoreLessonSettingsViewModel.f28188k);
            this.f28214e = 1;
            obj = FlowKt__ReduceKt.m14362c(interfaceC7116cM307S0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return obj;
    }
}
