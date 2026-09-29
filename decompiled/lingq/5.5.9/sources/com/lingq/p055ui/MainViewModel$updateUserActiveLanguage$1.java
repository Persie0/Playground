package com.lingq.p055ui;

import ci.InterfaceC2012e;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$updateUserActiveLanguage$1", m19206f = "MainViewModel.kt", m19207l = {406, 408, 412}, m19208m = "invokeSuspend")
final class MainViewModel$updateUserActiveLanguage$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22349e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22350f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f22351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$updateUserActiveLanguage$1(MainViewModel mainViewModel, String str, InterfaceC9968c<? super MainViewModel$updateUserActiveLanguage$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22350f = mainViewModel;
        this.f22351g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MainViewModel$updateUserActiveLanguage$1(this.f22350f, this.f22351g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$updateUserActiveLanguage$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:29:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x007c  */
    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22349e;
        String str = this.f22351g;
        MainViewModel mainViewModel = this.f22350f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 == 2) {
                    C7499b.m14977z0(obj);
                    if (mainViewModel.f22291h.m15512e()) {
                        C7828f.m15570d(C8573r0.m16767w0(mainViewModel), null, null, new MainViewModel$networkUpdateActiveLanguage$1(mainViewModel, str, null), 3);
                    } else {
                        this.f22349e = 3;
                        if (mainViewModel.f22283d.mo6135d(str, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return C9072e.f47360a;
                }
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2012e interfaceC2012e = mainViewModel.f22285e;
        this.f22349e = 1;
        obj = interfaceC2012e.mo6033s(str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        LanguageToLearn languageToLearn = (LanguageToLearn) obj;
        if (languageToLearn != null) {
            InterfaceC2012e interfaceC2012e2 = mainViewModel.f22285e;
            this.f22349e = 2;
            if (interfaceC2012e2.mo6019e(str, languageToLearn, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (mainViewModel.f22291h.m15512e()) {
                C7828f.m15570d(C8573r0.m16767w0(mainViewModel), null, null, new MainViewModel$networkUpdateActiveLanguage$1(mainViewModel, str, null), 3);
            } else {
                this.f22349e = 3;
                if (mainViewModel.f22283d.mo6135d(str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
            }
        } else {
            mainViewModel.f22290g0.mo14371k(C9072e.f47360a);
        }
        return C9072e.f47360a;
    }
}
