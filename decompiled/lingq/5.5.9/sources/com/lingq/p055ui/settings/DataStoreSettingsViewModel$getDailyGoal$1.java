package com.lingq.p055ui.settings;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.UserLanguage;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$getDailyGoal$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {348}, m19208m = "invokeSuspend")
final class DataStoreSettingsViewModel$getDailyGoal$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30989e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DataStoreSettingsViewModel f30990f;

    /* JADX INFO: renamed from: com.lingq.ui.settings.DataStoreSettingsViewModel$getDailyGoal$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "userLanguage", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$getDailyGoal$1$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {350}, m19208m = "invokeSuspend")
    public static final class C47721 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f30991e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f30992f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ DataStoreSettingsViewModel f30993g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47721(DataStoreSettingsViewModel dataStoreSettingsViewModel, InterfaceC9968c<? super C47721> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30993g = dataStoreSettingsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47721 c47721 = new C47721(this.f30993g, interfaceC9968c);
            c47721.f30992f = obj;
            return c47721;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47721) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30991e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                UserLanguage userLanguage = (UserLanguage) this.f30992f;
                DataStoreSettingsViewModel dataStoreSettingsViewModel = this.f30993g;
                dataStoreSettingsViewModel.f30965J.setValue(userLanguage != null ? userLanguage.f21737l : null);
                if (userLanguage == null || (str = userLanguage.f21737l) == null) {
                    str = "";
                }
                this.f30991e = 1;
                if (dataStoreSettingsViewModel.f30975f.mo9564K(str, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSettingsViewModel$getDailyGoal$1(DataStoreSettingsViewModel dataStoreSettingsViewModel, InterfaceC9968c<? super DataStoreSettingsViewModel$getDailyGoal$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30990f = dataStoreSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DataStoreSettingsViewModel$getDailyGoal$1(this.f30990f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DataStoreSettingsViewModel$getDailyGoal$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30989e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            DataStoreSettingsViewModel dataStoreSettingsViewModel = this.f30990f;
            InterfaceC7116c<UserLanguage> interfaceC7116cMo6036v = dataStoreSettingsViewModel.f30973d.mo6036v(dataStoreSettingsViewModel.mo498E1());
            C47721 c47721 = new C47721(dataStoreSettingsViewModel, null);
            this.f30989e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6036v, c47721, this) == coroutineSingletons) {
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
