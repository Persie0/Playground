package com.lingq.p055ui.session;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2011d;
import ci.InterfaceC2012e;
import ci.InterfaceC2015h;
import ci.InterfaceC2020m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultRegistrationError;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.squareup.moshi.C4955q;
import com.squareup.moshi.JsonEncodingException;
import dm.C5207g;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import jp.C6553u;
import jp.C6554v;
import jp.InterfaceC6538f;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import mo.C7661i;
import ni.C7797e;
import no.C7828f;
import no.C7848l1;
import no.InterfaceC7882z;
import p015ak.C0108e;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p225kk.C6704a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import retrofit2.HttpException;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/session/AuthenticationViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class AuthenticationViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ InterfaceC0113j f30530H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f30531I;

    /* JADX INFO: renamed from: J */
    public final C7135p f30532J;

    /* JADX INFO: renamed from: K */
    public final C7138s f30533K;

    /* JADX INFO: renamed from: L */
    public final C7134o f30534L;

    /* JADX INFO: renamed from: M */
    public final C7138s f30535M;

    /* JADX INFO: renamed from: N */
    public final C7134o f30536N;

    /* JADX INFO: renamed from: O */
    public final C7138s f30537O;

    /* JADX INFO: renamed from: P */
    public final C7134o f30538P;

    /* JADX INFO: renamed from: Q */
    public final StateFlowImpl f30539Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f30540R;

    /* JADX INFO: renamed from: S */
    public final C7138s f30541S;

    /* JADX INFO: renamed from: T */
    public final C7134o f30542T;

    /* JADX INFO: renamed from: U */
    public final C7138s f30543U;

    /* JADX INFO: renamed from: V */
    public final C7134o f30544V;

    /* JADX INFO: renamed from: W */
    public final C7138s f30545W;

    /* JADX INFO: renamed from: X */
    public final C7134o f30546X;

    /* JADX INFO: renamed from: Y */
    public final C7138s f30547Y;

    /* JADX INFO: renamed from: Z */
    public final C7134o f30548Z;

    /* JADX INFO: renamed from: a0 */
    public C7848l1 f30549a0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f30550d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2012e f30551e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2015h f30552f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2011d f30553g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7882z f30554h;

    /* JADX INFO: renamed from: i */
    public final C6554v f30555i;

    /* JADX INFO: renamed from: j */
    public final C4955q f30556j;

    /* JADX INFO: renamed from: k */
    public final InterfaceC5180b f30557k;

    /* JADX INFO: renamed from: l */
    public final C7797e f30558l;

    public AuthenticationViewModel(InterfaceC2020m interfaceC2020m, InterfaceC2012e interfaceC2012e, InterfaceC2015h interfaceC2015h, InterfaceC2011d interfaceC2011d, ExecutorC7177a executorC7177a, InterfaceC7882z interfaceC7882z, C6554v c6554v, C4955q c4955q, C6704a c6704a, InterfaceC5180b interfaceC5180b, C7797e c7797e, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        String str;
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2011d, "dictionaryRepository");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(c6554v, "retrofit");
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(c7797e, "utils");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f30550d = interfaceC2020m;
        this.f30551e = interfaceC2012e;
        this.f30552f = interfaceC2015h;
        this.f30553g = interfaceC2011d;
        this.f30554h = interfaceC7882z;
        this.f30555i = c6554v;
        this.f30556j = c4955q;
        this.f30557k = interfaceC5180b;
        this.f30558l = c7797e;
        this.f30530H = interfaceC0113j;
        if (c1024c0.f6616a.containsKey("authCode")) {
            str = (String) c1024c0.m3929b("authCode");
            if (str == null) {
                throw new IllegalArgumentException("Argument \"authCode\" is marked as non-null but was passed a null value");
            }
        } else {
            str = "";
        }
        C0108e c0108e = new C0108e(str);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f30531I = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f30532J = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f30533K = c7138sM10448a;
        this.f30534L = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a2 = C4924a.m10448a();
        this.f30535M = c7138sM10448a2;
        this.f30536N = C0062b.m341d2(c7138sM10448a2, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a3 = C4924a.m10448a();
        this.f30537O = c7138sM10448a3;
        this.f30538P = C0062b.m341d2(c7138sM10448a3, C8573r0.m16767w0(this), startedWhileSubscribed);
        Resource.Status status = Resource.Status.EMPTY;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(status);
        this.f30539Q = stateFlowImplM14379a2;
        this.f30540R = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, status);
        C7138s c7138sM10448a4 = C4924a.m10448a();
        this.f30541S = c7138sM10448a4;
        this.f30542T = C0062b.m341d2(c7138sM10448a4, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a5 = C4924a.m10448a();
        this.f30543U = c7138sM10448a5;
        this.f30544V = C0062b.m341d2(c7138sM10448a5, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a6 = C4924a.m10448a();
        this.f30545W = c7138sM10448a6;
        this.f30546X = C0062b.m341d2(c7138sM10448a6, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7138s c7138sM10448a7 = C4924a.m10448a();
        this.f30547Y = c7138sM10448a7;
        this.f30548Z = C0062b.m341d2(c7138sM10448a7, C8573r0.m16767w0(this), startedWhileSubscribed);
        String str2 = c0108e.f275a;
        if (!C7661i.m15250P2(str2)) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new AuthenticationViewModel$loginWithCode$1(this, str2, null), 3);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public static final void m10326l2(AuthenticationViewModel authenticationViewModel, HttpException httpException) {
        C6553u<?> c6553u;
        C7138s c7138s = authenticationViewModel.f30541S;
        if (httpException != null && (c6553u = httpException.f46513a) != null) {
            InterfaceC6538f interfaceC6538fM13154d = authenticationViewModel.f30555i.m13154d(null, ResultRegistrationError.class, ResultRegistrationError.class.getAnnotations());
            AbstractC9107y abstractC9107y = c6553u.f37340c;
            if (abstractC9107y != null) {
                try {
                    ResultRegistrationError resultRegistrationError = (ResultRegistrationError) interfaceC6538fM13154d.mo13122a(abstractC9107y);
                    if (resultRegistrationError != null) {
                        c7138s.mo14371k(resultRegistrationError);
                    }
                } catch (JsonEncodingException unused) {
                    c7138s.mo14371k(new ResultRegistrationError(null, null, 3, null));
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX INFO: renamed from: m2 */
    public static final Object m10327m2(AuthenticationViewModel authenticationViewModel, InterfaceC9968c interfaceC9968c) throws Throwable {
        AuthenticationViewModel$userDataExists$1 authenticationViewModel$userDataExists$1;
        AuthenticationViewModel authenticationViewModel2 = authenticationViewModel;
        authenticationViewModel2.getClass();
        if (interfaceC9968c instanceof AuthenticationViewModel$userDataExists$1) {
            authenticationViewModel$userDataExists$1 = (AuthenticationViewModel$userDataExists$1) interfaceC9968c;
            int i10 = authenticationViewModel$userDataExists$1.f30680g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                authenticationViewModel$userDataExists$1.f30680g = i10 - Integer.MIN_VALUE;
            } else {
                authenticationViewModel$userDataExists$1 = new AuthenticationViewModel$userDataExists$1(authenticationViewModel2, interfaceC9968c);
            }
        } else {
            authenticationViewModel$userDataExists$1 = new AuthenticationViewModel$userDataExists$1(authenticationViewModel2, interfaceC9968c);
        }
        Object objM14360a = authenticationViewModel$userDataExists$1.f30678e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = authenticationViewModel$userDataExists$1.f30680g;
        boolean z10 = true;
        if (i11 != 0) {
            if (i11 == 1) {
                authenticationViewModel2 = authenticationViewModel$userDataExists$1.f30677d;
                C7499b.m14977z0(objM14360a);
            } else {
                if (i11 == 2) {
                    authenticationViewModel2 = authenticationViewModel$userDataExists$1.f30677d;
                    C7499b.m14977z0(objM14360a);
                    if (((ProfileAccount) objM14360a).f17801a != 0) {
                        InterfaceC7116c<List<UserLanguage>> interfaceC7116cMo6016b = authenticationViewModel2.f30551e.mo6016b();
                        authenticationViewModel$userDataExists$1.f30677d = authenticationViewModel2;
                        authenticationViewModel$userDataExists$1.f30680g = 3;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo6016b, authenticationViewModel$userDataExists$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        if (!((Collection) objM14360a).isEmpty()) {
                            InterfaceC7116c<List<LanguageToLearn>> interfaceC7116cMo6029o = authenticationViewModel2.f30551e.mo6029o();
                            authenticationViewModel$userDataExists$1.f30677d = null;
                            authenticationViewModel$userDataExists$1.f30680g = 4;
                            objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo6029o, authenticationViewModel$userDataExists$1);
                            if (objM14360a == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (i11 == 3) {
                    authenticationViewModel2 = authenticationViewModel$userDataExists$1.f30677d;
                    C7499b.m14977z0(objM14360a);
                    if (!((Collection) objM14360a).isEmpty()) {
                        InterfaceC7116c<List<LanguageToLearn>> interfaceC7116cMo6029o2 = authenticationViewModel2.f30551e.mo6029o();
                        authenticationViewModel$userDataExists$1.f30677d = null;
                        authenticationViewModel$userDataExists$1.f30680g = 4;
                        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo6029o2, authenticationViewModel$userDataExists$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        z10 = false;
                    }
                    return Boolean.valueOf(z10);
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
            if (!(!((Collection) objM14360a).isEmpty())) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        C7499b.m14977z0(objM14360a);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = authenticationViewModel2.f30557k.mo9619h();
        authenticationViewModel$userDataExists$1.f30677d = authenticationViewModel2;
        authenticationViewModel$userDataExists$1.f30680g = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, authenticationViewModel$userDataExists$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        if (((Profile) objM14360a).f17781a != 0) {
            ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m = authenticationViewModel2.f30557k.mo9624m();
            authenticationViewModel$userDataExists$1.f30677d = authenticationViewModel2;
            authenticationViewModel$userDataExists$1.f30680g = 2;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m, authenticationViewModel$userDataExists$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (((ProfileAccount) objM14360a).f17801a != 0) {
                InterfaceC7116c<List<UserLanguage>> interfaceC7116cMo6016b2 = authenticationViewModel2.f30551e.mo6016b();
                authenticationViewModel$userDataExists$1.f30677d = authenticationViewModel2;
                authenticationViewModel$userDataExists$1.f30680g = 3;
                objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo6016b2, authenticationViewModel$userDataExists$1);
                if (objM14360a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!((Collection) objM14360a).isEmpty()) {
                    InterfaceC7116c<List<LanguageToLearn>> interfaceC7116cMo6029o3 = authenticationViewModel2.f30551e.mo6029o();
                    authenticationViewModel$userDataExists$1.f30677d = null;
                    authenticationViewModel$userDataExists$1.f30680g = 4;
                    objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo6029o3, authenticationViewModel$userDataExists$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    if (!(!((Collection) objM14360a).isEmpty())) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX INFO: renamed from: s2 */
    public static void m10328s2(AuthenticationViewModel authenticationViewModel, String str, String str2, int i10) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        C4924a.m10450b(authenticationViewModel.f30549a0);
        authenticationViewModel.f30549a0 = C7828f.m15570d(C8573r0.m16767w0(authenticationViewModel), null, null, new AuthenticationViewModel$validateFields$1(authenticationViewModel, str, str2, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30530H.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30530H.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f30530H.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30530H.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30530H.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30530H.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f30530H;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30530H.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30530H.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f30530H.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f30530H.mo506l1();
    }

    /* JADX INFO: renamed from: n2 */
    public final void m10329n2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new AuthenticationViewModel$fetchUserData$1(this, null), 3);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m10330o2(String str, String str2) {
        C5207g.m11111f(str, "credential");
        C5207g.m11111f(str2, "password");
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new AuthenticationViewModel$login$1(this, str, str2, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f30530H.mo507p1();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m10331p2() {
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new AuthenticationViewModel$registeredViaSocial$1(this, null), 3);
    }

    /* JADX INFO: renamed from: q2 */
    public final void m10332q2(String str, String str2) {
        C5207g.m11111f(str2, "dailyGoal");
        C7828f.m15570d(this.f30554h, null, null, new AuthenticationViewModel$updateLanguageIntensity$1(this, str, str2, null), 3);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m10333r2(String str, Set<String> set) {
        C5207g.m11111f(set, "topics");
        C7828f.m15570d(this.f30554h, null, null, new AuthenticationViewModel$updateTopics$1(this, str, set, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30530H.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30530H.mo509w0();
    }
}
