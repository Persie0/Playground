package com.lingq.p055ui.settings;

import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.LearningLevel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\nH\u008a@"}, m13365d2 = {"Lcom/lingq/shared/storage/Theme;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "", "Lcom/lingq/shared/uimodel/LearningLevel;", "<anonymous parameter 3>", "Lcom/lingq/shared/domain/Profile;", "profile", "", "Lnh/n;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.DataStoreSettingsViewModel$settings$1", m19206f = "DataStoreSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class DataStoreSettingsViewModel$settings$1 extends SuspendLambda implements InterfaceC2060t<Theme, Boolean, String, Map<String, ? extends Map<LearningLevel, Boolean>>, Profile, InterfaceC9968c<? super List<? extends AbstractC7787n>>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Profile f30996e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DataStoreSettingsViewModel f30997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreSettingsViewModel$settings$1(DataStoreSettingsViewModel dataStoreSettingsViewModel, InterfaceC9968c<? super DataStoreSettingsViewModel$settings$1> interfaceC9968c) {
        super(6, interfaceC9968c);
        this.f30997f = dataStoreSettingsViewModel;
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(Theme theme, Boolean bool, String str, Map<String, ? extends Map<LearningLevel, Boolean>> map, Profile profile, InterfaceC9968c<? super List<? extends AbstractC7787n>> interfaceC9968c) {
        bool.booleanValue();
        DataStoreSettingsViewModel$settings$1 dataStoreSettingsViewModel$settings$1 = new DataStoreSettingsViewModel$settings$1(this.f30997f, interfaceC9968c);
        dataStoreSettingsViewModel$settings$1.f30996e = profile;
        return dataStoreSettingsViewModel$settings$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        Profile profile = this.f30996e;
        DataStoreSettingsViewModel dataStoreSettingsViewModel = this.f30997f;
        dataStoreSettingsViewModel.f30964I.setValue(profile);
        return dataStoreSettingsViewModel.m10350l2();
    }
}
