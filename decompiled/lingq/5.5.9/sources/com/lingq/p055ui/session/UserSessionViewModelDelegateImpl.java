package com.lingq.p055ui.session;

import ae.C0062b;
import ci.InterfaceC2012e;
import ci.InterfaceC2020m;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2;
import com.lingq.shared.uimodel.language.LanguageToLearn;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7141v;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7140u;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5180b;
import p225kk.C6715l;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class UserSessionViewModelDelegateImpl implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f30789H;

    /* JADX INFO: renamed from: I */
    public final C7135p f30790I;

    /* JADX INFO: renamed from: a */
    public final InterfaceC2020m f30791a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC2012e f30792b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC5180b f30793c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7882z f30794d;

    /* JADX INFO: renamed from: e */
    public final CoroutineDispatcher f30795e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<Profile> f30796f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<ProfileAccount> f30797g;

    /* JADX INFO: renamed from: h */
    public final C7135p f30798h;

    /* JADX INFO: renamed from: i */
    public final C7135p f30799i;

    /* JADX INFO: renamed from: j */
    public final C7135p f30800j;

    /* JADX INFO: renamed from: k */
    public final C7135p f30801k;

    /* JADX INFO: renamed from: l */
    public final C7135p f30802l;

    public UserSessionViewModelDelegateImpl(InterfaceC2020m interfaceC2020m, InterfaceC2012e interfaceC2012e, InterfaceC5180b interfaceC5180b, InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        this.f30791a = interfaceC2020m;
        this.f30792b = interfaceC2012e;
        this.f30793c = interfaceC5180b;
        this.f30794d = interfaceC7882z;
        this.f30795e = executorC7177a;
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = interfaceC5180b.mo9619h();
        this.f30796f = profileStoreImpl$special$$inlined$map$1Mo9619h;
        ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m = interfaceC5180b.mo9624m();
        this.f30797g = profileStoreImpl$special$$inlined$map$2Mo9624m;
        ChannelFlowTransformLatest channelFlowTransformLatestM399t2 = C0062b.m399t2(profileStoreImpl$special$$inlined$map$1Mo9619h, new UserSessionViewModelDelegateImpl$_activeLanguage$1(null));
        C7141v c7141v = InterfaceC7140u.a.f40387a;
        this.f30798h = C0062b.m353h2(channelFlowTransformLatestM399t2, interfaceC7882z, c7141v, "");
        this.f30799i = C0062b.m353h2(C0062b.m399t2(profileStoreImpl$special$$inlined$map$1Mo9619h, new UserSessionViewModelDelegateImpl$_activeLocale$1(null)), interfaceC7882z, c7141v, "");
        ChannelFlowTransformLatest channelFlowTransformLatestM399t3 = C0062b.m399t2(profileStoreImpl$special$$inlined$map$2Mo9624m, new UserSessionViewModelDelegateImpl$_isUserPremium$1(null));
        Boolean bool = Boolean.FALSE;
        this.f30800j = C0062b.m353h2(channelFlowTransformLatestM399t3, interfaceC7882z, c7141v, bool);
        this.f30801k = C0062b.m353h2(C0062b.m399t2(profileStoreImpl$special$$inlined$map$2Mo9624m, new UserSessionViewModelDelegateImpl$_isUserWithinLimit$1(null)), interfaceC7882z, c7141v, bool);
        C0062b.m353h2(C0062b.m399t2(profileStoreImpl$special$$inlined$map$2Mo9624m, new UserSessionViewModelDelegateImpl$_isCardsLimitInOfferRange$1(null)), interfaceC7882z, c7141v, bool);
        ChannelFlowTransformLatest channelFlowTransformLatestM399t4 = C0062b.m399t2(profileStoreImpl$special$$inlined$map$1Mo9619h, new UserSessionViewModelDelegateImpl$userLanguages$1(this, null));
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        EmptyList emptyList = EmptyList.f38032a;
        C7135p c7135pM353h2 = C0062b.m353h2(channelFlowTransformLatestM399t4, interfaceC7882z, startedWhileSubscribed, emptyList);
        this.f30802l = c7135pM353h2;
        this.f30789H = C0062b.m353h2(new C7131l(profileStoreImpl$special$$inlined$map$1Mo9619h, c7135pM353h2, new UserSessionViewModelDelegateImpl$userActiveLanguage$1(this, null)), interfaceC7882z, startedWhileSubscribed, null);
        this.f30790I = C0062b.m353h2(C0062b.m399t2(profileStoreImpl$special$$inlined$map$1Mo9619h, new UserSessionViewModelDelegateImpl$userDictionaryLocales$1(null)), interfaceC7882z, startedWhileSubscribed, emptyList);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f30802l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        UserSessionViewModelDelegateImpl$updateLanguages$1 userSessionViewModelDelegateImpl$updateLanguages$1;
        UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl;
        if (interfaceC9968c instanceof UserSessionViewModelDelegateImpl$updateLanguages$1) {
            userSessionViewModelDelegateImpl$updateLanguages$1 = (UserSessionViewModelDelegateImpl$updateLanguages$1) interfaceC9968c;
            int i10 = userSessionViewModelDelegateImpl$updateLanguages$1.f30827g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$updateLanguages$1.f30827g = i10 - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$updateLanguages$1 = new UserSessionViewModelDelegateImpl$updateLanguages$1(this, interfaceC9968c);
            }
        } else {
            userSessionViewModelDelegateImpl$updateLanguages$1 = new UserSessionViewModelDelegateImpl$updateLanguages$1(this, interfaceC9968c);
        }
        Object obj = userSessionViewModelDelegateImpl$updateLanguages$1.f30825e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = userSessionViewModelDelegateImpl$updateLanguages$1.f30827g;
        if (i11 != 0) {
            if (i11 == 1) {
                userSessionViewModelDelegateImpl = userSessionViewModelDelegateImpl$updateLanguages$1.f30824d;
                C7499b.m14977z0(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        userSessionViewModelDelegateImpl$updateLanguages$1.f30824d = this;
        userSessionViewModelDelegateImpl$updateLanguages$1.f30827g = 1;
        if (this.f30792b.mo6018d(userSessionViewModelDelegateImpl$updateLanguages$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        userSessionViewModelDelegateImpl = this;
        InterfaceC2012e interfaceC2012e = userSessionViewModelDelegateImpl.f30792b;
        userSessionViewModelDelegateImpl$updateLanguages$1.f30824d = null;
        userSessionViewModelDelegateImpl$updateLanguages$1.f30827g = 2;
        return interfaceC2012e.mo6040z(userSessionViewModelDelegateImpl$updateLanguages$1) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return (String) this.f30798h.getValue();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo9620i = this.f30793c.mo9620i(profile, interfaceC9968c);
        return objMo9620i == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9620i : C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f30790I;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        UserSessionViewModelDelegateImpl$updateActiveLanguage$1 userSessionViewModelDelegateImpl$updateActiveLanguage$1;
        UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl;
        LanguageToLearn languageToLearn;
        InterfaceC2012e interfaceC2012e;
        if (interfaceC9968c instanceof UserSessionViewModelDelegateImpl$updateActiveLanguage$1) {
            userSessionViewModelDelegateImpl$updateActiveLanguage$1 = (UserSessionViewModelDelegateImpl$updateActiveLanguage$1) interfaceC9968c;
            int i10 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = i10 - Integer.MIN_VALUE;
            } else {
                userSessionViewModelDelegateImpl$updateActiveLanguage$1 = new UserSessionViewModelDelegateImpl$updateActiveLanguage$1(this, interfaceC9968c);
            }
        } else {
            userSessionViewModelDelegateImpl$updateActiveLanguage$1 = new UserSessionViewModelDelegateImpl$updateActiveLanguage$1(this, interfaceC9968c);
        }
        Object objMo6033s = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30821g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i;
        if (i11 != 0) {
            if (i11 == 1) {
                str = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e;
                userSessionViewModelDelegateImpl = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d;
                C7499b.m14977z0(objMo6033s);
            } else if (i11 == 2) {
                LanguageToLearn languageToLearn2 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f;
                String str2 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e;
                UserSessionViewModelDelegateImpl userSessionViewModelDelegateImpl2 = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d;
                C7499b.m14977z0(objMo6033s);
                languageToLearn = languageToLearn2;
                str = str2;
                userSessionViewModelDelegateImpl = userSessionViewModelDelegateImpl2;
                interfaceC2012e = userSessionViewModelDelegateImpl.f30792b;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = userSessionViewModelDelegateImpl;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = str;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = languageToLearn;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 3;
                if (interfaceC2012e.mo6019e(str, languageToLearn, userSessionViewModelDelegateImpl$updateActiveLanguage$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                InterfaceC2020m interfaceC2020m = userSessionViewModelDelegateImpl.f30791a;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 4;
                objMo6033s = interfaceC2020m.mo6135d(str, userSessionViewModelDelegateImpl$updateActiveLanguage$1);
                if (objMo6033s == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 3) {
                str = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e;
                userSessionViewModelDelegateImpl = userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d;
                C7499b.m14977z0(objMo6033s);
                InterfaceC2020m interfaceC2020m2 = userSessionViewModelDelegateImpl.f30791a;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = null;
                userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 4;
                objMo6033s = interfaceC2020m2.mo6135d(str, userSessionViewModelDelegateImpl$updateActiveLanguage$1);
                if (objMo6033s == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo6033s);
            }
            ((Boolean) objMo6033s).booleanValue();
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objMo6033s);
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = this;
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = str;
        userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 1;
        objMo6033s = this.f30792b.mo6033s(str, userSessionViewModelDelegateImpl$updateActiveLanguage$1);
        if (objMo6033s == coroutineSingletons) {
            return coroutineSingletons;
        }
        userSessionViewModelDelegateImpl = this;
        languageToLearn = (LanguageToLearn) objMo6033s;
        if (languageToLearn != null) {
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = userSessionViewModelDelegateImpl;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = str;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = languageToLearn;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 2;
            if (userSessionViewModelDelegateImpl.mo497B0(userSessionViewModelDelegateImpl$updateActiveLanguage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC2012e = userSessionViewModelDelegateImpl.f30792b;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = userSessionViewModelDelegateImpl;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = str;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = languageToLearn;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 3;
            if (interfaceC2012e.mo6019e(str, languageToLearn, userSessionViewModelDelegateImpl$updateActiveLanguage$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            InterfaceC2020m interfaceC2020m3 = userSessionViewModelDelegateImpl.f30791a;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30818d = null;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30819e = null;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30820f = null;
            userSessionViewModelDelegateImpl$updateActiveLanguage$1.f30823i = 4;
            objMo6033s = interfaceC2020m3.mo6135d(str, userSessionViewModelDelegateImpl$updateActiveLanguage$1);
            if (objMo6033s == coroutineSingletons) {
                return coroutineSingletons;
            }
            ((Boolean) objMo6033s).booleanValue();
        }
        return C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        return ((Boolean) this.f30800j.getValue()).booleanValue();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        UserSessionViewModelDelegateImpl$updateUserProfile$2 userSessionViewModelDelegateImpl$updateUserProfile$2 = new UserSessionViewModelDelegateImpl$updateUserProfile$2(this, null);
        InterfaceC7882z interfaceC7882z = this.f30794d;
        C7828f.m15570d(interfaceC7882z, null, null, userSessionViewModelDelegateImpl$updateUserProfile$2, 3);
        C7828f.m15570d(interfaceC7882z, null, null, new UserSessionViewModelDelegateImpl$updateUserProfile$3(this, null), 3);
        return C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f30796f;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo9615d = this.f30793c.mo9615d(profileAccount, interfaceC9968c);
        return objMo9615d == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9615d : C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return ((Boolean) this.f30801k.getValue()).booleanValue();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return (String) this.f30799i.getValue();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f30797g;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f30789H;
    }
}
