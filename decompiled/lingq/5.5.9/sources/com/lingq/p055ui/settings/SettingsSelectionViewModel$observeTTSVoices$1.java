package com.lingq.p055ui.settings;

import ae.C0062b;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$observeTTSVoices$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {658, 659}, m19208m = "invokeSuspend")
final class SettingsSelectionViewModel$observeTTSVoices$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31092e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SettingsSelectionViewModel f31093f;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$observeTTSVoices$1$1 */
    @Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$observeTTSVoices$1$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47791 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends List<? extends TextToSpeechVoice>>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f31094e;

        public C47791(InterfaceC9968c<? super C47791> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Resource<? extends List<? extends TextToSpeechVoice>>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C47791 c47791 = new C47791(interfaceC9968c);
            c47791.f31094e = th2;
            return c47791.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f31094e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$observeTTSVoices$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$observeTTSVoices$1$2", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C47802 extends SuspendLambda implements InterfaceC2056p<Resource<? extends List<? extends TextToSpeechVoice>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f31095e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ SettingsSelectionViewModel f31096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C47802(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super C47802> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31096f = settingsSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C47802 c47802 = new C47802(this.f31096f, interfaceC9968c);
            c47802.f31095e = obj;
            return c47802;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends List<? extends TextToSpeechVoice>> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47802) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) ((Resource) this.f31095e).f17863b;
            if (list != null) {
                this.f31096f.f31066U.setValue(list);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsSelectionViewModel$observeTTSVoices$1(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super SettingsSelectionViewModel$observeTTSVoices$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31093f = settingsSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new SettingsSelectionViewModel$observeTTSVoices$1(this.f31093f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((SettingsSelectionViewModel$observeTTSVoices$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31092e;
        SettingsSelectionViewModel settingsSelectionViewModel = this.f31093f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC2024q interfaceC2024q = settingsSelectionViewModel.f31073g;
        String strMo498E1 = settingsSelectionViewModel.mo498E1();
        this.f31092e = 1;
        obj = interfaceC2024q.mo6171b(strMo498E1, false);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new C47791(null));
        C47802 c47802 = new C47802(settingsSelectionViewModel, null);
        this.f31092e = 2;
        return C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c47802, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
