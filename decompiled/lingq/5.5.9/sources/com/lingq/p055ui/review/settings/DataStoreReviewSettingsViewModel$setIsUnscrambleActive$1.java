package com.lingq.p055ui.review.settings;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p076di.InterfaceC5181c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.settings.DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1", m19206f = "DataStoreReviewSettingsViewModel.kt", m19207l = {714, 715, 717}, m19208m = "invokeSuspend")
final class DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30310e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ DataStoreReviewSettingsViewModel f30311f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f30312g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1(DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel, boolean z10, InterfaceC9968c<? super DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30311f = dataStoreReviewSettingsViewModel;
        this.f30312g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1(this.f30311f, this.f30312g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((DataStoreReviewSettingsViewModel$setIsUnscrambleActive$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30310e;
        boolean z10 = this.f30312g;
        DataStoreReviewSettingsViewModel dataStoreReviewSettingsViewModel = this.f30311f;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            } else {
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        this.f30310e = 1;
        obj = DataStoreReviewSettingsViewModel.m10299m2(dataStoreReviewSettingsViewModel, z10, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Boolean) obj).booleanValue()) {
            InterfaceC5181c interfaceC5181c = dataStoreReviewSettingsViewModel.f30212e;
            this.f30310e = 2;
            if (interfaceC5181c.mo9674x(z10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            C7138s c7138s = dataStoreReviewSettingsViewModel.f30213e0;
            C9072e c9072e = C9072e.f47360a;
            this.f30310e = 3;
            if (c7138s.mo1339r(c9072e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
