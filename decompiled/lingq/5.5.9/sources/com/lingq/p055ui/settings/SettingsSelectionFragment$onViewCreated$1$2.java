package com.lingq.p055ui.settings;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$2", m19206f = "SettingsSelectionFragment.kt", m19207l = {100}, m19208m = "invokeSuspend")
public final class SettingsSelectionFragment$onViewCreated$1$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31042e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettingsSelectionFragment f31043f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C4782a f31044g;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lnh/p;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionFragment$onViewCreated$1$2$1", m19206f = "SettingsSelectionFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47761 extends SuspendLambda implements InterfaceC2056p<List<? extends AbstractC7789p>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31045e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C4782a f31046f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47761(C4782a c4782a, InterfaceC9968c<? super C47761> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31046f = c4782a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47761 c47761 = new C47761(this.f31046f, interfaceC9968c);
            c47761.f31045e = obj;
            return c47761;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends AbstractC7789p> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47761) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31046f.m4529q((List) this.f31045e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionFragment$onViewCreated$1$2(C4782a c4782a, SettingsSelectionFragment settingsSelectionFragment, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31043f = settingsSelectionFragment;
        this.f31044g = c4782a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SettingsSelectionFragment$onViewCreated$1$2(this.f31044g, this.f31043f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SettingsSelectionFragment$onViewCreated$1$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31042e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            SettingsSelectionViewModel settingsSelectionViewModelM10353u0 = SettingsSelectionFragment.m10353u0(this.f31043f);
            C47761 c47761 = new C47761(this.f31044g, null);
            this.f31042e = 1;
            if (C0062b.m369m0(settingsSelectionViewModelM10353u0.f31069X, c47761, this) == coroutineSingletons) {
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
