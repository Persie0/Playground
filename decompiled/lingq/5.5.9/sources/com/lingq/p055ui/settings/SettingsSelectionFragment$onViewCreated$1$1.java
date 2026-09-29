package com.lingq.p055ui.settings;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$1", m19206f = "SettingsSelectionFragment.kt", m19207l = {94}, m19208m = "invokeSuspend")
public final class SettingsSelectionFragment$onViewCreated$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31038e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettingsSelectionFragment f31039f;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$1$1", m19206f = "SettingsSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47751 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f31040e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SettingsSelectionFragment f31041f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47751(SettingsSelectionFragment settingsSelectionFragment, InterfaceC9968c<? super C47751> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31041f = settingsSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47751 c47751 = new C47751(this.f31041f, interfaceC9968c);
            c47751.f31040e = ((Number) obj).intValue();
            return c47751;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47751) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f31040e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = SettingsSelectionFragment.f31025S0;
            SettingsSelectionFragment settingsSelectionFragment = this.f31041f;
            settingsSelectionFragment.m10354v0().f45250c.setText(settingsSelectionFragment.m3600t(i10));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionFragment$onViewCreated$1$1(SettingsSelectionFragment settingsSelectionFragment, InterfaceC9968c<? super SettingsSelectionFragment$onViewCreated$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31039f = settingsSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SettingsSelectionFragment$onViewCreated$1$1(this.f31039f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SettingsSelectionFragment$onViewCreated$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31038e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            SettingsSelectionFragment settingsSelectionFragment = this.f31039f;
            SettingsSelectionViewModel settingsSelectionViewModelM10353u0 = SettingsSelectionFragment.m10353u0(settingsSelectionFragment);
            C47751 c47751 = new C47751(settingsSelectionFragment, null);
            this.f31038e = 1;
            if (C0062b.m369m0(settingsSelectionViewModelM10353u0.f31056K, c47751, this) == coroutineSingletons) {
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
