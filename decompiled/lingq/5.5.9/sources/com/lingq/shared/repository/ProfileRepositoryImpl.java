package com.lingq.shared.repository;

import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.work.ExistingWorkPolicy;
import ci.InterfaceC2020m;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.LingQsOffer;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.requests.RequestEmailLogin;
import com.lingq.shared.network.requests.RequestMoreLingQs;
import com.lingq.shared.network.requests.RequestPurchase;
import com.lingq.shared.network.requests.RequestPushNotificationRegistration;
import com.lingq.shared.network.requests.RequestUserUpdate;
import com.lingq.shared.network.result.ResultRegistrationValidation;
import com.lingq.shared.network.result.Results;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import jp.C6553u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.C7076b;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import mo.C7661i;
import ni.C7797e;
import no.C7828f;
import p026b5.AbstractC1317j;
import p026b5.C1315h;
import p076di.InterfaceC5180b;
import p260m8.C7499b;
import p460wh.InterfaceC9944l;
import p464wl.InterfaceC9968c;
import p536zh.C10490a;
import retrofit2.HttpException;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileRepositoryImpl implements InterfaceC2020m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9944l f20371a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1317j f20372b;

    /* JADX INFO: renamed from: c */
    public final C4955q f20373c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC5180b f20374d;

    /* JADX INFO: renamed from: e */
    public final C7797e f20375e;

    /* JADX INFO: renamed from: com.lingq.shared.repository.ProfileRepositoryImpl$a */
    public /* synthetic */ class C3322a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20376a;

        static {
            int[] iArr = new int[LingQsOffer.values().length];
            try {
                iArr[LingQsOffer.Day.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LingQsOffer.LimitOffer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f20376a = iArr;
        }
    }

    public ProfileRepositoryImpl(InterfaceC9944l interfaceC9944l, AbstractC1317j abstractC1317j, C4955q c4955q, InterfaceC5180b interfaceC5180b, C7797e c7797e) {
        C5207g.m11111f(interfaceC9944l, "profileService");
        C5207g.m11111f(abstractC1317j, "workManager");
        C5207g.m11111f(c4955q, "moshi");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(c7797e, "utils");
        this.f20371a = interfaceC9944l;
        this.f20372b = abstractC1317j;
        this.f20373c = c4955q;
        this.f20374d = interfaceC5180b;
        this.f20375e = c7797e;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: a */
    public final Object mo6132a(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$loginFacebook$1 profileRepositoryImpl$loginFacebook$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        Resource.C3303a c3303a;
        Object objM14360a;
        Resource.C3303a c3303a2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$loginFacebook$1) {
            profileRepositoryImpl$loginFacebook$1 = (ProfileRepositoryImpl$loginFacebook$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$loginFacebook$1.f20390g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$loginFacebook$1.f20390g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$loginFacebook$1 = new ProfileRepositoryImpl$loginFacebook$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$loginFacebook$1 = new ProfileRepositoryImpl$loginFacebook$1(this, interfaceC9968c);
        }
        Object objM18502a = profileRepositoryImpl$loginFacebook$1.f20388e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$loginFacebook$1.f20390g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginFacebook$1.f20387d;
                    C7499b.m14977z0(objM18502a);
                } else if (i11 == 2) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginFacebook$1.f20387d;
                    C7499b.m14977z0(objM18502a);
                    c3303a = Resource.f17861d;
                    ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = profileRepositoryImpl.f20374d.mo9613b();
                    profileRepositoryImpl$loginFacebook$1.f20387d = c3303a;
                    profileRepositoryImpl$loginFacebook$1.f20390g = 3;
                    objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, profileRepositoryImpl$loginFacebook$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a2 = c3303a;
                    objM18502a = objM14360a;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3303a2 = (Resource.C3303a) profileRepositoryImpl$loginFacebook$1.f20387d;
                    C7499b.m14977z0(objM18502a);
                }
                c3303a2.getClass();
                return Resource.C3303a.m9437c(objM18502a);
            }
            C7499b.m14977z0(objM18502a);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$loginFacebook$1.f20387d = this;
            profileRepositoryImpl$loginFacebook$1.f20390g = 1;
            objM18502a = interfaceC9944l.m18502a(str, profileRepositoryImpl$loginFacebook$1);
            if (objM18502a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18502a;
            if (login != null) {
                InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
                Login login2 = new Login(null, login.f17774c, null, false, login.f17776e, 13, null);
                profileRepositoryImpl$loginFacebook$1.f20387d = profileRepositoryImpl;
                profileRepositoryImpl$loginFacebook$1.f20390g = 2;
                if (interfaceC5180b.mo9621j(login2, profileRepositoryImpl$loginFacebook$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            c3303a = Resource.f17861d;
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b2 = profileRepositoryImpl.f20374d.mo9613b();
            profileRepositoryImpl$loginFacebook$1.f20387d = c3303a;
            profileRepositoryImpl$loginFacebook$1.f20390g = 3;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b2, profileRepositoryImpl$loginFacebook$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3303a2 = c3303a;
            objM18502a = objM14360a;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(objM18502a);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: b */
    public final Object mo6133b(String str, String str2, String str3, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$registerFacebook$1 profileRepositoryImpl$registerFacebook$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$registerFacebook$1) {
            profileRepositoryImpl$registerFacebook$1 = (ProfileRepositoryImpl$registerFacebook$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$registerFacebook$1.f20412g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$registerFacebook$1.f20412g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$registerFacebook$1 = new ProfileRepositoryImpl$registerFacebook$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$registerFacebook$1 = new ProfileRepositoryImpl$registerFacebook$1(this, interfaceC9968c);
        }
        Object objM18503b = profileRepositoryImpl$registerFacebook$1.f20410e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$registerFacebook$1.f20412g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = profileRepositoryImpl$registerFacebook$1.f20409d;
                    C7499b.m14977z0(objM18503b);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18503b);
                }
                Resource.C3303a c3303a = Resource.f17861d;
                Boolean bool = Boolean.TRUE;
                c3303a.getClass();
                return Resource.C3303a.m9437c(bool);
            }
            C7499b.m14977z0(objM18503b);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$registerFacebook$1.f20409d = this;
            profileRepositoryImpl$registerFacebook$1.f20412g = 1;
            objM18503b = interfaceC9944l.m18503b(str, str2, str3, profileRepositoryImpl$registerFacebook$1);
            if (objM18503b == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18503b;
            InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
            Login login2 = new Login(null, login.f17774c, null, false, login.f17776e, 13, null);
            profileRepositoryImpl$registerFacebook$1.f20409d = null;
            profileRepositoryImpl$registerFacebook$1.f20412g = 2;
            if (interfaceC5180b.mo9621j(login2, profileRepositoryImpl$registerFacebook$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            Boolean bool2 = Boolean.TRUE;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(bool2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            Resource.C3303a c3303a3 = Resource.f17861d;
            Boolean bool3 = Boolean.FALSE;
            c3303a3.getClass();
            return Resource.C3303a.m9435a(e10, bool3);
        } catch (Exception e11) {
            e11.printStackTrace();
            Resource.C3303a c3303a4 = Resource.f17861d;
            Boolean bool4 = Boolean.FALSE;
            c3303a4.getClass();
            return Resource.C3303a.m9435a(e11, bool4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: c */
    public final Object mo6134c(String str, String str2, InterfaceC9968c<? super Resource<Login>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$login$1 profileRepositoryImpl$login$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        Resource.C3303a c3303a;
        Resource.C3303a c3303a2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$login$1) {
            profileRepositoryImpl$login$1 = (ProfileRepositoryImpl$login$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$login$1.f20386g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$login$1.f20386g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$login$1 = new ProfileRepositoryImpl$login$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$login$1 = new ProfileRepositoryImpl$login$1(this, interfaceC9968c);
        }
        Object objM18504c = profileRepositoryImpl$login$1.f20384e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$login$1.f20386g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$login$1.f20383d;
                    C7499b.m14977z0(objM18504c);
                } else if (i11 == 2) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$login$1.f20383d;
                    C7499b.m14977z0(objM18504c);
                    c3303a = Resource.f17861d;
                    ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = profileRepositoryImpl.f20374d.mo9613b();
                    profileRepositoryImpl$login$1.f20383d = c3303a;
                    profileRepositoryImpl$login$1.f20386g = 3;
                    objM18504c = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, profileRepositoryImpl$login$1);
                    if (objM18504c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a2 = c3303a;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3303a2 = (Resource.C3303a) profileRepositoryImpl$login$1.f20383d;
                    C7499b.m14977z0(objM18504c);
                }
                c3303a2.getClass();
                return Resource.C3303a.m9437c(objM18504c);
            }
            C7499b.m14977z0(objM18504c);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$login$1.f20383d = this;
            profileRepositoryImpl$login$1.f20386g = 1;
            objM18504c = interfaceC9944l.m18504c(str, str2, profileRepositoryImpl$login$1);
            if (objM18504c == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18504c;
            if (login != null) {
                InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
                profileRepositoryImpl$login$1.f20383d = profileRepositoryImpl;
                profileRepositoryImpl$login$1.f20386g = 2;
                if (interfaceC5180b.mo9621j(login, profileRepositoryImpl$login$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            c3303a = Resource.f17861d;
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b2 = profileRepositoryImpl.f20374d.mo9613b();
            profileRepositoryImpl$login$1.f20383d = c3303a;
            profileRepositoryImpl$login$1.f20386g = 3;
            objM18504c = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b2, profileRepositoryImpl$login$1);
            if (objM18504c == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3303a2 = c3303a;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(objM18504c);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: d */
    public final Object mo6135d(String str, InterfaceC9968c interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$updateActiveLanguage$1 profileRepositoryImpl$updateActiveLanguage$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        String str2;
        Profile profile;
        RequestUserUpdate requestUserUpdate;
        Profile profile2;
        ProfileRepositoryImpl profileRepositoryImpl2;
        RequestUserUpdate requestUserUpdate2;
        int i10;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$updateActiveLanguage$1) {
            profileRepositoryImpl$updateActiveLanguage$1 = (ProfileRepositoryImpl$updateActiveLanguage$1) interfaceC9968c;
            int i11 = profileRepositoryImpl$updateActiveLanguage$1.f20428i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$updateActiveLanguage$1.f20428i = i11 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$updateActiveLanguage$1 = new ProfileRepositoryImpl$updateActiveLanguage$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$updateActiveLanguage$1 = new ProfileRepositoryImpl$updateActiveLanguage$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$updateActiveLanguage$1.f20426g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = profileRepositoryImpl$updateActiveLanguage$1.f20428i;
        boolean z10 = true;
        if (i12 != 0) {
            if (i12 == 1) {
                str = (String) profileRepositoryImpl$updateActiveLanguage$1.f20424e;
                profileRepositoryImpl = profileRepositoryImpl$updateActiveLanguage$1.f20423d;
                C7499b.m14977z0(objM14360a);
            } else if (i12 == 2) {
                profile = (Profile) profileRepositoryImpl$updateActiveLanguage$1.f20425f;
                String str3 = (String) profileRepositoryImpl$updateActiveLanguage$1.f20424e;
                ProfileRepositoryImpl profileRepositoryImpl3 = profileRepositoryImpl$updateActiveLanguage$1.f20423d;
                C7499b.m14977z0(objM14360a);
                str2 = str3;
                profileRepositoryImpl = profileRepositoryImpl3;
                requestUserUpdate = new RequestUserUpdate();
                requestUserUpdate.f18223b = str2;
                try {
                    i10 = profile.f17781a;
                    profileRepositoryImpl$updateActiveLanguage$1.f20423d = profileRepositoryImpl;
                    profileRepositoryImpl$updateActiveLanguage$1.f20424e = profile;
                    profileRepositoryImpl$updateActiveLanguage$1.f20425f = requestUserUpdate;
                    profileRepositoryImpl$updateActiveLanguage$1.f20428i = 3;
                    if (profileRepositoryImpl.mo6151t(i10, requestUserUpdate, profileRepositoryImpl$updateActiveLanguage$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Exception unused) {
                    profile2 = profile;
                    profileRepositoryImpl2 = profileRepositoryImpl;
                    requestUserUpdate2 = requestUserUpdate;
                    C1315h c1315hM19478a = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate2), profile2.f17781a);
                    ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
                    AbstractC1317j abstractC1317j = profileRepositoryImpl2.f20372b;
                    abstractC1317j.getClass();
                    abstractC1317j.mo4878c("languageUpdate", existingWorkPolicy, Collections.singletonList(c1315hM19478a));
                    z10 = false;
                }
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                requestUserUpdate2 = (RequestUserUpdate) profileRepositoryImpl$updateActiveLanguage$1.f20425f;
                profile2 = (Profile) profileRepositoryImpl$updateActiveLanguage$1.f20424e;
                profileRepositoryImpl2 = profileRepositoryImpl$updateActiveLanguage$1.f20423d;
                try {
                    C7499b.m14977z0(objM14360a);
                } catch (Exception unused2) {
                    C1315h c1315hM19478a2 = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate2), profile2.f17781a);
                    ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.REPLACE;
                    AbstractC1317j abstractC1317j2 = profileRepositoryImpl2.f20372b;
                    abstractC1317j2.getClass();
                    abstractC1317j2.mo4878c("languageUpdate", existingWorkPolicy2, Collections.singletonList(c1315hM19478a2));
                    z10 = false;
                }
            }
            return Boolean.valueOf(z10);
        }
        C7499b.m14977z0(objM14360a);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
        profileRepositoryImpl$updateActiveLanguage$1.f20423d = this;
        profileRepositoryImpl$updateActiveLanguage$1.f20424e = str;
        profileRepositoryImpl$updateActiveLanguage$1.f20428i = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$updateActiveLanguage$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileRepositoryImpl = this;
        Profile profile3 = (Profile) objM14360a;
        profile3.getClass();
        C5207g.m11111f(str, "<set-?>");
        profile3.f17795o = str;
        InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
        profileRepositoryImpl$updateActiveLanguage$1.f20423d = profileRepositoryImpl;
        profileRepositoryImpl$updateActiveLanguage$1.f20424e = str;
        profileRepositoryImpl$updateActiveLanguage$1.f20425f = profile3;
        profileRepositoryImpl$updateActiveLanguage$1.f20428i = 2;
        if (interfaceC5180b.mo9620i(profile3, profileRepositoryImpl$updateActiveLanguage$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        profile = profile3;
        requestUserUpdate = new RequestUserUpdate();
        requestUserUpdate.f18223b = str2;
        i10 = profile.f17781a;
        profileRepositoryImpl$updateActiveLanguage$1.f20423d = profileRepositoryImpl;
        profileRepositoryImpl$updateActiveLanguage$1.f20424e = profile;
        profileRepositoryImpl$updateActiveLanguage$1.f20425f = requestUserUpdate;
        profileRepositoryImpl$updateActiveLanguage$1.f20428i = 3;
        if (profileRepositoryImpl.mo6151t(i10, requestUserUpdate, profileRepositoryImpl$updateActiveLanguage$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return Boolean.valueOf(z10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: e */
    public final Object mo6136e(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8, String str9, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$register$1 profileRepositoryImpl$register$1;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$register$1) {
            profileRepositoryImpl$register$1 = (ProfileRepositoryImpl$register$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$register$1.f20408f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$register$1.f20408f = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$register$1 = new ProfileRepositoryImpl$register$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$register$1 = new ProfileRepositoryImpl$register$1(this, interfaceC9968c);
        }
        ProfileRepositoryImpl$register$1 profileRepositoryImpl$register$2 = profileRepositoryImpl$register$1;
        Object obj = profileRepositoryImpl$register$2.f20406d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$register$2.f20408f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC9944l interfaceC9944l = this.f20371a;
                profileRepositoryImpl$register$2.f20408f = 1;
                if (interfaceC9944l.m18506e(str, str2, str3, str4, str5, str6, num, str7, str8, str9, profileRepositoryImpl$register$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            Resource.C3303a c3303a = Resource.f17861d;
            Boolean bool = Boolean.TRUE;
            c3303a.getClass();
            return Resource.C3303a.m9437c(bool);
        } catch (HttpException e10) {
            e10.printStackTrace();
            Resource.C3303a c3303a2 = Resource.f17861d;
            Boolean bool2 = Boolean.FALSE;
            c3303a2.getClass();
            return Resource.C3303a.m9435a(e10, bool2);
        } catch (Exception e11) {
            e11.printStackTrace();
            Resource.C3303a c3303a3 = Resource.f17861d;
            Boolean bool3 = Boolean.TRUE;
            c3303a3.getClass();
            return Resource.C3303a.m9437c(bool3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: f */
    public final Object mo6137f(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$loginGoogle$1 profileRepositoryImpl$loginGoogle$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        Resource.C3303a c3303a;
        Object objM14360a;
        Resource.C3303a c3303a2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$loginGoogle$1) {
            profileRepositoryImpl$loginGoogle$1 = (ProfileRepositoryImpl$loginGoogle$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$loginGoogle$1.f20394g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$loginGoogle$1.f20394g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$loginGoogle$1 = new ProfileRepositoryImpl$loginGoogle$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$loginGoogle$1 = new ProfileRepositoryImpl$loginGoogle$1(this, interfaceC9968c);
        }
        Object objM18507f = profileRepositoryImpl$loginGoogle$1.f20392e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$loginGoogle$1.f20394g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginGoogle$1.f20391d;
                    C7499b.m14977z0(objM18507f);
                } else if (i11 == 2) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginGoogle$1.f20391d;
                    C7499b.m14977z0(objM18507f);
                    c3303a = Resource.f17861d;
                    ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = profileRepositoryImpl.f20374d.mo9613b();
                    profileRepositoryImpl$loginGoogle$1.f20391d = c3303a;
                    profileRepositoryImpl$loginGoogle$1.f20394g = 3;
                    objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, profileRepositoryImpl$loginGoogle$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    c3303a2 = c3303a;
                    objM18507f = objM14360a;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3303a2 = (Resource.C3303a) profileRepositoryImpl$loginGoogle$1.f20391d;
                    C7499b.m14977z0(objM18507f);
                }
                c3303a2.getClass();
                return Resource.C3303a.m9437c(objM18507f);
            }
            C7499b.m14977z0(objM18507f);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$loginGoogle$1.f20391d = this;
            profileRepositoryImpl$loginGoogle$1.f20394g = 1;
            objM18507f = interfaceC9944l.m18507f(str, profileRepositoryImpl$loginGoogle$1);
            if (objM18507f == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18507f;
            if (login != null) {
                InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
                Login login2 = new Login(null, login.f17774c, null, false, login.f17776e, 13, null);
                profileRepositoryImpl$loginGoogle$1.f20391d = profileRepositoryImpl;
                profileRepositoryImpl$loginGoogle$1.f20394g = 2;
                if (interfaceC5180b.mo9621j(login2, profileRepositoryImpl$loginGoogle$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            c3303a = Resource.f17861d;
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b2 = profileRepositoryImpl.f20374d.mo9613b();
            profileRepositoryImpl$loginGoogle$1.f20391d = c3303a;
            profileRepositoryImpl$loginGoogle$1.f20394g = 3;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b2, profileRepositoryImpl$loginGoogle$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            c3303a2 = c3303a;
            objM18507f = objM14360a;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(objM18507f);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: g */
    public final Object mo6138g(String str, String str2, String str3, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$registerGoogle$1 profileRepositoryImpl$registerGoogle$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$registerGoogle$1) {
            profileRepositoryImpl$registerGoogle$1 = (ProfileRepositoryImpl$registerGoogle$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$registerGoogle$1.f20416g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$registerGoogle$1.f20416g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$registerGoogle$1 = new ProfileRepositoryImpl$registerGoogle$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$registerGoogle$1 = new ProfileRepositoryImpl$registerGoogle$1(this, interfaceC9968c);
        }
        Object objM18508g = profileRepositoryImpl$registerGoogle$1.f20414e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$registerGoogle$1.f20416g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = profileRepositoryImpl$registerGoogle$1.f20413d;
                    C7499b.m14977z0(objM18508g);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(objM18508g);
                }
                Resource.C3303a c3303a = Resource.f17861d;
                Boolean bool = Boolean.TRUE;
                c3303a.getClass();
                return Resource.C3303a.m9437c(bool);
            }
            C7499b.m14977z0(objM18508g);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$registerGoogle$1.f20413d = this;
            profileRepositoryImpl$registerGoogle$1.f20416g = 1;
            objM18508g = interfaceC9944l.m18508g(str, str2, str3, profileRepositoryImpl$registerGoogle$1);
            if (objM18508g == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18508g;
            InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
            Login login2 = new Login(null, login.f17774c, null, false, login.f17776e, 13, null);
            profileRepositoryImpl$registerGoogle$1.f20413d = null;
            profileRepositoryImpl$registerGoogle$1.f20416g = 2;
            if (interfaceC5180b.mo9621j(login2, profileRepositoryImpl$registerGoogle$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            Boolean bool2 = Boolean.TRUE;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(bool2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            Resource.C3303a c3303a3 = Resource.f17861d;
            Boolean bool3 = Boolean.FALSE;
            c3303a3.getClass();
            return Resource.C3303a.m9435a(e10, bool3);
        } catch (Exception e11) {
            e11.printStackTrace();
            Resource.C3303a c3303a4 = Resource.f17861d;
            Boolean bool4 = Boolean.FALSE;
            c3303a4.getClass();
            return Resource.C3303a.m9435a(e11, bool4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: h */
    public final Object mo6139h(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$updateInterfaceLanguage$1 profileRepositoryImpl$updateInterfaceLanguage$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        String strM15254T2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$updateInterfaceLanguage$1) {
            profileRepositoryImpl$updateInterfaceLanguage$1 = (ProfileRepositoryImpl$updateInterfaceLanguage$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$updateInterfaceLanguage$1.f20445h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$updateInterfaceLanguage$1.f20445h = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$updateInterfaceLanguage$1 = new ProfileRepositoryImpl$updateInterfaceLanguage$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$updateInterfaceLanguage$1 = new ProfileRepositoryImpl$updateInterfaceLanguage$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$updateInterfaceLanguage$1.f20443f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$updateInterfaceLanguage$1.f20445h;
        if (i11 == 0) {
            C7499b.m14977z0(objM14360a);
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
            profileRepositoryImpl$updateInterfaceLanguage$1.f20441d = this;
            profileRepositoryImpl$updateInterfaceLanguage$1.f20442e = str;
            profileRepositoryImpl$updateInterfaceLanguage$1.f20445h = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$updateInterfaceLanguage$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = profileRepositoryImpl$updateInterfaceLanguage$1.f20442e;
            profileRepositoryImpl = profileRepositoryImpl$updateInterfaceLanguage$1.f20441d;
            C7499b.m14977z0(objM14360a);
        }
        Profile profile = (Profile) objM14360a;
        profile.getClass();
        C5207g.m11111f(str, "<set-?>");
        profile.f17794n = str;
        RequestUserUpdate requestUserUpdate = new RequestUserUpdate();
        if (C7076b.m14278X2(str, "pt", false)) {
            strM15254T2 = new Regex("_.*$").m14272c(str, "");
        } else {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            strM15254T2 = C7661i.m15254T2(lowerCase, "_", "-");
        }
        requestUserUpdate.f18230i = strM15254T2;
        C1315h c1315hM19478a = C10490a.m19478a(profileRepositoryImpl.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate), profile.f17781a);
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
        AbstractC1317j abstractC1317j = profileRepositoryImpl.f20372b;
        abstractC1317j.getClass();
        abstractC1317j.mo4878c("interfaceLanguageUpdate", existingWorkPolicy, Collections.singletonList(c1315hM19478a));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: i */
    public final Object mo6140i(ArrayList arrayList, InterfaceC9968c interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$updateActiveLocales$1 profileRepositoryImpl$updateActiveLocales$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        List<String> list;
        List<String> list2;
        Profile profile;
        ProfileRepositoryImpl profileRepositoryImpl2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$updateActiveLocales$1) {
            profileRepositoryImpl$updateActiveLocales$1 = (ProfileRepositoryImpl$updateActiveLocales$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$updateActiveLocales$1.f20440i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$updateActiveLocales$1.f20440i = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$updateActiveLocales$1 = new ProfileRepositoryImpl$updateActiveLocales$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$updateActiveLocales$1 = new ProfileRepositoryImpl$updateActiveLocales$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$updateActiveLocales$1.f20438g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$updateActiveLocales$1.f20440i;
        if (i11 != 0) {
            if (i11 == 1) {
                List<String> list3 = profileRepositoryImpl$updateActiveLocales$1.f20436e;
                profileRepositoryImpl = profileRepositoryImpl$updateActiveLocales$1.f20435d;
                C7499b.m14977z0(objM14360a);
                list = list3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                profile = profileRepositoryImpl$updateActiveLocales$1.f20437f;
                List<String> list4 = profileRepositoryImpl$updateActiveLocales$1.f20436e;
                profileRepositoryImpl2 = profileRepositoryImpl$updateActiveLocales$1.f20435d;
                C7499b.m14977z0(objM14360a);
                list2 = list4;
            }
            RequestUserUpdate requestUserUpdate = new RequestUserUpdate();
            requestUserUpdate.f18229h = list2;
            C1315h c1315hM19478a = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate), profile.f17781a);
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            AbstractC1317j abstractC1317j = profileRepositoryImpl2.f20372b;
            abstractC1317j.getClass();
            abstractC1317j.mo4878c("localesUpdate", existingWorkPolicy, Collections.singletonList(c1315hM19478a));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
        profileRepositoryImpl$updateActiveLocales$1.f20435d = this;
        profileRepositoryImpl$updateActiveLocales$1.f20436e = arrayList;
        profileRepositoryImpl$updateActiveLocales$1.f20440i = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$updateActiveLocales$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileRepositoryImpl = this;
        list = arrayList;
        Profile profile2 = (Profile) objM14360a;
        profile2.getClass();
        C5207g.m11111f(list, "<set-?>");
        profile2.f17798r = list;
        if (true ^ list.isEmpty()) {
            String str = (String) C6752c.m13423Q(list);
            C5207g.m11111f(str, "<set-?>");
            profile2.f17796p = str;
        }
        InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
        profileRepositoryImpl$updateActiveLocales$1.f20435d = profileRepositoryImpl;
        profileRepositoryImpl$updateActiveLocales$1.f20436e = list;
        profileRepositoryImpl$updateActiveLocales$1.f20437f = profile2;
        profileRepositoryImpl$updateActiveLocales$1.f20440i = 2;
        if (interfaceC5180b.mo9620i(profile2, profileRepositoryImpl$updateActiveLocales$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        list2 = list;
        profile = profile2;
        profileRepositoryImpl2 = profileRepositoryImpl;
        RequestUserUpdate requestUserUpdate2 = new RequestUserUpdate();
        requestUserUpdate2.f18229h = list2;
        C1315h c1315hM19478a2 = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate2), profile.f17781a);
        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.REPLACE;
        AbstractC1317j abstractC1317j2 = profileRepositoryImpl2.f20372b;
        abstractC1317j2.getClass();
        abstractC1317j2.mo4878c("localesUpdate", existingWorkPolicy2, Collections.singletonList(c1315hM19478a2));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: j */
    public final Object mo6141j(RequestPurchase requestPurchase, InterfaceC9968c<? super Resource<RequestPurchase>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$upgrade$1 profileRepositoryImpl$upgrade$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        ProfileAccount profileAccount;
        InterfaceC5180b interfaceC5180b;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$upgrade$1) {
            profileRepositoryImpl$upgrade$1 = (ProfileRepositoryImpl$upgrade$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$upgrade$1.f20450h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$upgrade$1.f20450h = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$upgrade$1 = new ProfileRepositoryImpl$upgrade$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$upgrade$1 = new ProfileRepositoryImpl$upgrade$1(this, interfaceC9968c);
        }
        Object objM18505d = profileRepositoryImpl$upgrade$1.f20448f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$upgrade$1.f20450h;
        if (i11 != 0) {
            if (i11 == 1) {
                requestPurchase = profileRepositoryImpl$upgrade$1.f20447e;
                profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$upgrade$1.f20446d;
                C7499b.m14977z0(objM18505d);
            } else if (i11 == 2) {
                requestPurchase = profileRepositoryImpl$upgrade$1.f20447e;
                profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$upgrade$1.f20446d;
                C7499b.m14977z0(objM18505d);
                profileAccount = (ProfileAccount) objM18505d;
                profileAccount.f17808h = null;
                interfaceC5180b = profileRepositoryImpl.f20374d;
                profileRepositoryImpl$upgrade$1.f20446d = requestPurchase;
                profileRepositoryImpl$upgrade$1.f20447e = null;
                profileRepositoryImpl$upgrade$1.f20450h = 3;
                if (interfaceC5180b.mo9615d(profileAccount, profileRepositoryImpl$upgrade$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                requestPurchase = (RequestPurchase) profileRepositoryImpl$upgrade$1.f20446d;
                C7499b.m14977z0(objM18505d);
            }
            Resource.f17861d.getClass();
            return Resource.C3303a.m9437c(requestPurchase);
        }
        C7499b.m14977z0(objM18505d);
        profileRepositoryImpl$upgrade$1.f20446d = this;
        profileRepositoryImpl$upgrade$1.f20447e = requestPurchase;
        profileRepositoryImpl$upgrade$1.f20450h = 1;
        objM18505d = this.f20371a.m18505d(requestPurchase, profileRepositoryImpl$upgrade$1);
        if (objM18505d == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileRepositoryImpl = this;
        if (((AbstractC9107y) objM18505d) == null) {
            return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error upgrading."));
        }
        ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m = profileRepositoryImpl.f20374d.mo9624m();
        profileRepositoryImpl$upgrade$1.f20446d = profileRepositoryImpl;
        profileRepositoryImpl$upgrade$1.f20447e = requestPurchase;
        profileRepositoryImpl$upgrade$1.f20450h = 2;
        objM18505d = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m, profileRepositoryImpl$upgrade$1);
        if (objM18505d == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileAccount = (ProfileAccount) objM18505d;
        profileAccount.f17808h = null;
        interfaceC5180b = profileRepositoryImpl.f20374d;
        profileRepositoryImpl$upgrade$1.f20446d = requestPurchase;
        profileRepositoryImpl$upgrade$1.f20447e = null;
        profileRepositoryImpl$upgrade$1.f20450h = 3;
        if (interfaceC5180b.mo9615d(profileAccount, profileRepositoryImpl$upgrade$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        Resource.f17861d.getClass();
        return Resource.C3303a.m9437c(requestPurchase);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:14:0x0039, B:71:0x019a, B:17:0x0040, B:67:0x0186, B:20:0x004f, B:62:0x0167, B:23:0x0062, B:59:0x0152, B:26:0x006f, B:55:0x0138, B:29:0x007d, B:52:0x0124, B:32:0x008e, B:39:0x00b4, B:42:0x00c4, B:47:0x00de, B:43:0x00cd, B:44:0x00d5, B:46:0x00d7, B:35:0x0098), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:14:0x0039, B:71:0x019a, B:17:0x0040, B:67:0x0186, B:20:0x004f, B:62:0x0167, B:23:0x0062, B:59:0x0152, B:26:0x006f, B:55:0x0138, B:29:0x007d, B:52:0x0124, B:32:0x008e, B:39:0x00b4, B:42:0x00c4, B:47:0x00de, B:43:0x00cd, B:44:0x00d5, B:46:0x00d7, B:35:0x0098), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d7 A[Catch: Exception -> 0x019d, TryCatch #0 {Exception -> 0x019d, blocks: (B:14:0x0039, B:71:0x019a, B:17:0x0040, B:67:0x0186, B:20:0x004f, B:62:0x0167, B:23:0x0062, B:59:0x0152, B:26:0x006f, B:55:0x0138, B:29:0x007d, B:52:0x0124, B:32:0x008e, B:39:0x00b4, B:42:0x00c4, B:47:0x00de, B:43:0x00cd, B:44:0x00d5, B:46:0x00d7, B:35:0x0098), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0120  */
    /* JADX WARN: Code duplicated, block: B:51:0x0122  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0185  */
    /* JADX WARN: Code duplicated, block: B:69:0x0198 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: k */
    public final Object mo6142k(LingQsOffer lingQsOffer, long j10, InterfaceC9968c<? super Boolean> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$getMoreLingQs$1 profileRepositoryImpl$getMoreLingQs$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        Profile profile;
        int i10;
        int iAmount;
        RequestMoreLingQs requestMoreLingQs;
        InterfaceC9944l interfaceC9944l;
        Integer num;
        Profile profile2;
        ProfileRepositoryImpl profileRepositoryImpl2;
        InterfaceC5180b interfaceC5180b;
        ProfileRepositoryImpl profileRepositoryImpl3;
        InterfaceC5180b interfaceC5180b2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$getMoreLingQs$1) {
            profileRepositoryImpl$getMoreLingQs$1 = (ProfileRepositoryImpl$getMoreLingQs$1) interfaceC9968c;
            int i11 = profileRepositoryImpl$getMoreLingQs$1.f20382i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$getMoreLingQs$1.f20382i = i11 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$getMoreLingQs$1 = new ProfileRepositoryImpl$getMoreLingQs$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$getMoreLingQs$1 = new ProfileRepositoryImpl$getMoreLingQs$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$getMoreLingQs$1.f20380g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        try {
            switch (profileRepositoryImpl$getMoreLingQs$1.f20382i) {
                case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                    C7499b.m14977z0(objM14360a);
                    ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = this;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = lingQsOffer;
                    profileRepositoryImpl$getMoreLingQs$1.f20379f = j10;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 1;
                    objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profileRepositoryImpl = this;
                    profile = (Profile) objM14360a;
                    i10 = C3322a.f20376a[lingQsOffer.ordinal()];
                    if (i10 != 1) {
                        iAmount = LingQsOffer.Day.amount();
                    } else {
                        if (i10 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iAmount = LingQsOffer.LimitOffer.amount();
                    }
                    String lowerCase = C7797e.a.m15516a("Plt9KDf1h2jFGydW" + j10).toLowerCase(Locale.ROOT);
                    C5207g.m11110e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    requestMoreLingQs = new RequestMoreLingQs(lowerCase, iAmount, j10);
                    interfaceC9944l = profileRepositoryImpl.f20371a;
                    num = new Integer(profile.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 2;
                    if (interfaceC9944l.m18510i(num, requestMoreLingQs, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profile2 = profile;
                    profileRepositoryImpl2 = profileRepositoryImpl;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 3;
                    if (C7828f.m15567a(500L, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC9944l interfaceC9944l2 = profileRepositoryImpl2.f20371a;
                    Integer num2 = new Integer(profile2.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 4;
                    objM14360a = interfaceC9944l2.m18514m(num2, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 5;
                    if (interfaceC5180b.mo9620i((Profile) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ProfileRepositoryImpl profileRepositoryImpl4 = profileRepositoryImpl2;
                    Profile profile3 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl4;
                    InterfaceC9944l interfaceC9944l3 = profileRepositoryImpl3.f20371a;
                    Integer num3 = new Integer(profile3.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l3.m18518q(num3, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case 1:
                    j10 = profileRepositoryImpl$getMoreLingQs$1.f20379f;
                    lingQsOffer = (LingQsOffer) profileRepositoryImpl$getMoreLingQs$1.f20378e;
                    profileRepositoryImpl = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    profile = (Profile) objM14360a;
                    i10 = C3322a.f20376a[lingQsOffer.ordinal()];
                    if (i10 != 1) {
                        iAmount = LingQsOffer.Day.amount();
                    } else {
                        if (i10 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iAmount = LingQsOffer.LimitOffer.amount();
                    }
                    String lowerCase2 = C7797e.a.m15516a("Plt9KDf1h2jFGydW" + j10).toLowerCase(Locale.ROOT);
                    C5207g.m11110e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    requestMoreLingQs = new RequestMoreLingQs(lowerCase2, iAmount, j10);
                    interfaceC9944l = profileRepositoryImpl.f20371a;
                    num = new Integer(profile.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 2;
                    if (interfaceC9944l.m18510i(num, requestMoreLingQs, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profile2 = profile;
                    profileRepositoryImpl2 = profileRepositoryImpl;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 3;
                    if (C7828f.m15567a(500L, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC9944l interfaceC9944l4 = profileRepositoryImpl2.f20371a;
                    Integer num4 = new Integer(profile2.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 4;
                    objM14360a = interfaceC9944l4.m18514m(num4, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 5;
                    if (interfaceC5180b.mo9620i((Profile) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ProfileRepositoryImpl profileRepositoryImpl5 = profileRepositoryImpl2;
                    Profile profile4 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl5;
                    InterfaceC9944l interfaceC9944l5 = profileRepositoryImpl3.f20371a;
                    Integer num5 = new Integer(profile4.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l5.m18518q(num5, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case 2:
                    profile2 = (Profile) profileRepositoryImpl$getMoreLingQs$1.f20378e;
                    profileRepositoryImpl2 = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 3;
                    if (C7828f.m15567a(500L, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    InterfaceC9944l interfaceC9944l6 = profileRepositoryImpl2.f20371a;
                    Integer num6 = new Integer(profile2.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 4;
                    objM14360a = interfaceC9944l6.m18514m(num6, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 5;
                    if (interfaceC5180b.mo9620i((Profile) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ProfileRepositoryImpl profileRepositoryImpl6 = profileRepositoryImpl2;
                    Profile profile5 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl6;
                    InterfaceC9944l interfaceC9944l7 = profileRepositoryImpl3.f20371a;
                    Integer num7 = new Integer(profile5.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l7.m18518q(num7, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case 3:
                    profile2 = (Profile) profileRepositoryImpl$getMoreLingQs$1.f20378e;
                    profileRepositoryImpl2 = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    InterfaceC9944l interfaceC9944l8 = profileRepositoryImpl2.f20371a;
                    Integer num8 = new Integer(profile2.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 4;
                    objM14360a = interfaceC9944l8.m18514m(num8, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 5;
                    if (interfaceC5180b.mo9620i((Profile) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ProfileRepositoryImpl profileRepositoryImpl7 = profileRepositoryImpl2;
                    Profile profile6 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl7;
                    InterfaceC9944l interfaceC9944l9 = profileRepositoryImpl3.f20371a;
                    Integer num9 = new Integer(profile6.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l9.m18518q(num9, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case 4:
                    profile2 = (Profile) profileRepositoryImpl$getMoreLingQs$1.f20378e;
                    profileRepositoryImpl2 = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl2;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = profile2;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 5;
                    if (interfaceC5180b.mo9620i((Profile) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ProfileRepositoryImpl profileRepositoryImpl8 = profileRepositoryImpl2;
                    Profile profile7 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl8;
                    InterfaceC9944l interfaceC9944l10 = profileRepositoryImpl3.f20371a;
                    Integer num10 = new Integer(profile7.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l10.m18518q(num10, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case 5:
                    profile2 = (Profile) profileRepositoryImpl$getMoreLingQs$1.f20378e;
                    profileRepositoryImpl2 = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    ProfileRepositoryImpl profileRepositoryImpl9 = profileRepositoryImpl2;
                    Profile profile8 = profile2;
                    profileRepositoryImpl3 = profileRepositoryImpl9;
                    InterfaceC9944l interfaceC9944l11 = profileRepositoryImpl3.f20371a;
                    Integer num11 = new Integer(profile8.f17781a);
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = profileRepositoryImpl3;
                    profileRepositoryImpl$getMoreLingQs$1.f20378e = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 6;
                    objM14360a = interfaceC9944l11.m18518q(num11, profileRepositoryImpl$getMoreLingQs$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    profileRepositoryImpl3 = profileRepositoryImpl$getMoreLingQs$1.f20377d;
                    C7499b.m14977z0(objM14360a);
                    interfaceC5180b2 = profileRepositoryImpl3.f20374d;
                    profileRepositoryImpl$getMoreLingQs$1.f20377d = null;
                    profileRepositoryImpl$getMoreLingQs$1.f20382i = 7;
                    if (interfaceC5180b2.mo9615d((ProfileAccount) objM14360a, profileRepositoryImpl$getMoreLingQs$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return Boolean.TRUE;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    C7499b.m14977z0(objM14360a);
                    return Boolean.TRUE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: l */
    public final Object mo6143l(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$updateActiveLocale$1 profileRepositoryImpl$updateActiveLocale$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        String str2;
        Profile profile;
        ProfileRepositoryImpl profileRepositoryImpl2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$updateActiveLocale$1) {
            profileRepositoryImpl$updateActiveLocale$1 = (ProfileRepositoryImpl$updateActiveLocale$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$updateActiveLocale$1.f20434i;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$updateActiveLocale$1.f20434i = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$updateActiveLocale$1 = new ProfileRepositoryImpl$updateActiveLocale$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$updateActiveLocale$1 = new ProfileRepositoryImpl$updateActiveLocale$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$updateActiveLocale$1.f20432g;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$updateActiveLocale$1.f20434i;
        if (i11 != 0) {
            if (i11 == 1) {
                str = profileRepositoryImpl$updateActiveLocale$1.f20430e;
                profileRepositoryImpl = profileRepositoryImpl$updateActiveLocale$1.f20429d;
                C7499b.m14977z0(objM14360a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                profile = profileRepositoryImpl$updateActiveLocale$1.f20431f;
                str2 = profileRepositoryImpl$updateActiveLocale$1.f20430e;
                profileRepositoryImpl2 = profileRepositoryImpl$updateActiveLocale$1.f20429d;
                C7499b.m14977z0(objM14360a);
            }
            RequestUserUpdate requestUserUpdate = new RequestUserUpdate();
            requestUserUpdate.f18228g = str2;
            C1315h c1315hM19478a = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate), profile.f17781a);
            ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.REPLACE;
            AbstractC1317j abstractC1317j = profileRepositoryImpl2.f20372b;
            abstractC1317j.getClass();
            abstractC1317j.mo4878c("localeUpdate", existingWorkPolicy, Collections.singletonList(c1315hM19478a));
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
        profileRepositoryImpl$updateActiveLocale$1.f20429d = this;
        profileRepositoryImpl$updateActiveLocale$1.f20430e = str;
        profileRepositoryImpl$updateActiveLocale$1.f20434i = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$updateActiveLocale$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileRepositoryImpl = this;
        Profile profile2 = (Profile) objM14360a;
        profile2.getClass();
        C5207g.m11111f(str, "<set-?>");
        profile2.f17796p = str;
        InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
        profileRepositoryImpl$updateActiveLocale$1.f20429d = profileRepositoryImpl;
        profileRepositoryImpl$updateActiveLocale$1.f20430e = str;
        profileRepositoryImpl$updateActiveLocale$1.f20431f = profile2;
        profileRepositoryImpl$updateActiveLocale$1.f20434i = 2;
        if (interfaceC5180b.mo9620i(profile2, profileRepositoryImpl$updateActiveLocale$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        str2 = str;
        profile = profile2;
        profileRepositoryImpl2 = profileRepositoryImpl;
        RequestUserUpdate requestUserUpdate2 = new RequestUserUpdate();
        requestUserUpdate2.f18228g = str2;
        C1315h c1315hM19478a2 = C10490a.m19478a(profileRepositoryImpl2.f20373c.m10563a(RequestUserUpdate.class).m10535e(requestUserUpdate2), profile.f17781a);
        ExistingWorkPolicy existingWorkPolicy2 = ExistingWorkPolicy.REPLACE;
        AbstractC1317j abstractC1317j2 = profileRepositoryImpl2.f20372b;
        abstractC1317j2.getClass();
        abstractC1317j2.mo4878c("localeUpdate", existingWorkPolicy2, Collections.singletonList(c1315hM19478a2));
        return C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d1 A[Catch: Exception -> 0x00fd, HttpException -> 0x00ff, TryCatch #2 {HttpException -> 0x00ff, Exception -> 0x00fd, blocks: (B:16:0x003b, B:54:0x00f3, B:22:0x0052, B:47:0x00c5, B:49:0x00d1, B:50:0x00e1, B:42:0x00aa), top: B:63:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: m */
    public final Object mo6144m(boolean z10, InterfaceC9968c<? super Resource<Profile>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$userProfileWithInfo$1 profileRepositoryImpl$userProfileWithInfo$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        ProfileRepositoryImpl profileRepositoryImpl2;
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        Profile profile2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$userProfileWithInfo$1) {
            profileRepositoryImpl$userProfileWithInfo$1 = (ProfileRepositoryImpl$userProfileWithInfo$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$userProfileWithInfo$1.f20465h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$userProfileWithInfo$1.f20465h = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$userProfileWithInfo$1 = new ProfileRepositoryImpl$userProfileWithInfo$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$userProfileWithInfo$1 = new ProfileRepositoryImpl$userProfileWithInfo$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$userProfileWithInfo$1.f20463f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$userProfileWithInfo$1.f20465h;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    z10 = profileRepositoryImpl$userProfileWithInfo$1.f20462e;
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileWithInfo$1.f20461d;
                    C7499b.m14977z0(objM14360a);
                } else if (i11 == 2) {
                    profileRepositoryImpl2 = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileWithInfo$1.f20461d;
                    C7499b.m14977z0(objM14360a);
                    profile = (Profile) objM14360a;
                    if (!profileRepositoryImpl2.f20375e.m15514g()) {
                        String strM15510c = profileRepositoryImpl2.f20375e.m15510c("language_code");
                        profile.getClass();
                        profile.f17795o = strM15510c;
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$userProfileWithInfo$1.f20461d = profile;
                    profileRepositoryImpl$userProfileWithInfo$1.f20465h = 3;
                    if (interfaceC5180b.mo9620i(profile, profileRepositoryImpl$userProfileWithInfo$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profile2 = profile;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    profile2 = (Profile) profileRepositoryImpl$userProfileWithInfo$1.f20461d;
                    C7499b.m14977z0(objM14360a);
                }
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(profile2);
            }
            C7499b.m14977z0(objM14360a);
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
            profileRepositoryImpl$userProfileWithInfo$1.f20461d = this;
            profileRepositoryImpl$userProfileWithInfo$1.f20462e = z10;
            profileRepositoryImpl$userProfileWithInfo$1.f20465h = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$userProfileWithInfo$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Profile profile3 = (Profile) objM14360a;
            if (profile3.f17781a != 0) {
                if (!(profile3.f17783c.length() == 0) && !z10) {
                    return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error loading profile"));
                }
            }
            InterfaceC9944l interfaceC9944l = profileRepositoryImpl.f20371a;
            Integer num = new Integer(profile3.f17781a);
            profileRepositoryImpl$userProfileWithInfo$1.f20461d = profileRepositoryImpl;
            profileRepositoryImpl$userProfileWithInfo$1.f20465h = 2;
            objM14360a = interfaceC9944l.m18514m(num, profileRepositoryImpl$userProfileWithInfo$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl2 = profileRepositoryImpl;
            profile = (Profile) objM14360a;
            if (!profileRepositoryImpl2.f20375e.m15514g()) {
                String strM15510c2 = profileRepositoryImpl2.f20375e.m15510c("language_code");
                profile.getClass();
                profile.f17795o = strM15510c2;
            }
            interfaceC5180b = profileRepositoryImpl2.f20374d;
            profileRepositoryImpl$userProfileWithInfo$1.f20461d = profile;
            profileRepositoryImpl$userProfileWithInfo$1.f20465h = 3;
            if (interfaceC5180b.mo9620i(profile, profileRepositoryImpl$userProfileWithInfo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            profile2 = profile;
            Resource.f17861d.getClass();
            return Resource.C3303a.m9437c(profile2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: n */
    public final Object mo6145n(String str, InterfaceC9968c<? super Resource<Boolean>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$requestSignInWithEmail$1 profileRepositoryImpl$requestSignInWithEmail$1;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$requestSignInWithEmail$1) {
            profileRepositoryImpl$requestSignInWithEmail$1 = (ProfileRepositoryImpl$requestSignInWithEmail$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$requestSignInWithEmail$1.f20422f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$requestSignInWithEmail$1.f20422f = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$requestSignInWithEmail$1 = new ProfileRepositoryImpl$requestSignInWithEmail$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$requestSignInWithEmail$1 = new ProfileRepositoryImpl$requestSignInWithEmail$1(this, interfaceC9968c);
        }
        Object objM18515n = profileRepositoryImpl$requestSignInWithEmail$1.f20420d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$requestSignInWithEmail$1.f20422f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(objM18515n);
                InterfaceC9944l interfaceC9944l = this.f20371a;
                RequestEmailLogin requestEmailLogin = new RequestEmailLogin(str);
                profileRepositoryImpl$requestSignInWithEmail$1.f20422f = 1;
                objM18515n = interfaceC9944l.m18515n(requestEmailLogin, profileRepositoryImpl$requestSignInWithEmail$1);
                if (objM18515n == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18515n);
            }
            if (((C6553u) objM18515n).f37338a.f47566d == 202) {
                Resource.C3303a c3303a = Resource.f17861d;
                Boolean bool = Boolean.TRUE;
                c3303a.getClass();
                return Resource.C3303a.m9437c(bool);
            }
            Resource.C3303a c3303a2 = Resource.f17861d;
            Boolean bool2 = Boolean.FALSE;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(bool2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: o */
    public final Object mo6146o(boolean z10, InterfaceC9968c<? super Resource<ProfileAccount>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$userProfileAccountWithInfo$1 profileRepositoryImpl$userProfileAccountWithInfo$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        ProfileRepositoryImpl profileRepositoryImpl2;
        ProfileAccount profileAccount;
        InterfaceC5180b interfaceC5180b;
        ProfileAccount profileAccount2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$userProfileAccountWithInfo$1) {
            profileRepositoryImpl$userProfileAccountWithInfo$1 = (ProfileRepositoryImpl$userProfileAccountWithInfo$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$userProfileAccountWithInfo$1 = new ProfileRepositoryImpl$userProfileAccountWithInfo$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$userProfileAccountWithInfo$1 = new ProfileRepositoryImpl$userProfileAccountWithInfo$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$userProfileAccountWithInfo$1.f20453f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    z10 = profileRepositoryImpl$userProfileAccountWithInfo$1.f20452e;
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d;
                    C7499b.m14977z0(objM14360a);
                } else if (i11 == 2) {
                    profileRepositoryImpl2 = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d;
                    C7499b.m14977z0(objM14360a);
                    profileAccount = (ProfileAccount) objM14360a;
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d = profileAccount;
                    profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h = 3;
                    if (interfaceC5180b.mo9615d(profileAccount, profileRepositoryImpl$userProfileAccountWithInfo$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profileAccount2 = profileAccount;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    profileAccount2 = (ProfileAccount) profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d;
                    C7499b.m14977z0(objM14360a);
                }
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(profileAccount2);
            }
            C7499b.m14977z0(objM14360a);
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d = this;
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20452e = z10;
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$userProfileAccountWithInfo$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Profile profile = (Profile) objM14360a;
            if (profile.f17781a != 0) {
                if (profile.f17783c.length() != 0) {
                    z11 = false;
                }
                if (!z11 && !z10) {
                    return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error loading profile"));
                }
            }
            InterfaceC9944l interfaceC9944l = profileRepositoryImpl.f20371a;
            Integer num = new Integer(profile.f17781a);
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d = profileRepositoryImpl;
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h = 2;
            objM14360a = interfaceC9944l.m18518q(num, profileRepositoryImpl$userProfileAccountWithInfo$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl2 = profileRepositoryImpl;
            profileAccount = (ProfileAccount) objM14360a;
            interfaceC5180b = profileRepositoryImpl2.f20374d;
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20451d = profileAccount;
            profileRepositoryImpl$userProfileAccountWithInfo$1.f20455h = 3;
            if (interfaceC5180b.mo9615d(profileAccount, profileRepositoryImpl$userProfileAccountWithInfo$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileAccount2 = profileAccount;
            Resource.f17861d.getClass();
            return Resource.C3303a.m9437c(profileAccount2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: p */
    public final Object mo6147p(String str, String str2, String str3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18511j = this.f20371a.m18511j(new RequestPushNotificationRegistration(str2, str, str3, true), interfaceC9968c);
        return objM18511j == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18511j : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00bb A[Catch: Exception -> 0x00fd, HttpException -> 0x00ff, TryCatch #2 {HttpException -> 0x00ff, Exception -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00f3, B:20:0x004a, B:44:0x00b3, B:46:0x00bb, B:49:0x00c8, B:51:0x00d2, B:52:0x00df, B:61:0x0101, B:40:0x00a4), top: B:66:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8 A[Catch: Exception -> 0x00fd, HttpException -> 0x00ff, TryCatch #2 {HttpException -> 0x00ff, Exception -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00f3, B:20:0x004a, B:44:0x00b3, B:46:0x00bb, B:49:0x00c8, B:51:0x00d2, B:52:0x00df, B:61:0x0101, B:40:0x00a4), top: B:66:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00d2 A[Catch: Exception -> 0x00fd, HttpException -> 0x00ff, TryCatch #2 {HttpException -> 0x00ff, Exception -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00f3, B:20:0x004a, B:44:0x00b3, B:46:0x00bb, B:49:0x00c8, B:51:0x00d2, B:52:0x00df, B:61:0x0101, B:40:0x00a4), top: B:66:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101 A[Catch: Exception -> 0x00fd, HttpException -> 0x00ff, TRY_LEAVE, TryCatch #2 {HttpException -> 0x00ff, Exception -> 0x00fd, blocks: (B:15:0x0036, B:56:0x00f3, B:20:0x004a, B:44:0x00b3, B:46:0x00bb, B:49:0x00c8, B:51:0x00d2, B:52:0x00df, B:61:0x0101, B:40:0x00a4), top: B:66:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: q */
    public final Object mo6148q(boolean z10, InterfaceC9968c<? super Resource<Profile>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$userProfileWhenLogin$1 profileRepositoryImpl$userProfileWhenLogin$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        ProfileRepositoryImpl profileRepositoryImpl2;
        List<? extends ResultType> list;
        Profile profile;
        InterfaceC5180b interfaceC5180b;
        Profile profile2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$userProfileWhenLogin$1) {
            profileRepositoryImpl$userProfileWhenLogin$1 = (ProfileRepositoryImpl$userProfileWhenLogin$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$userProfileWhenLogin$1.f20460h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$userProfileWhenLogin$1.f20460h = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$userProfileWhenLogin$1 = new ProfileRepositoryImpl$userProfileWhenLogin$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$userProfileWhenLogin$1 = new ProfileRepositoryImpl$userProfileWhenLogin$1(this, interfaceC9968c);
        }
        Object objM14360a = profileRepositoryImpl$userProfileWhenLogin$1.f20458f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$userProfileWhenLogin$1.f20460h;
        boolean z11 = true;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    z10 = profileRepositoryImpl$userProfileWhenLogin$1.f20457e;
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileWhenLogin$1.f20456d;
                    C7499b.m14977z0(objM14360a);
                } else if (i11 == 2) {
                    profileRepositoryImpl2 = (ProfileRepositoryImpl) profileRepositoryImpl$userProfileWhenLogin$1.f20456d;
                    C7499b.m14977z0(objM14360a);
                    list = ((Results) objM14360a).f19136d;
                    if (list != 0) {
                        profile = (Profile) C6752c.m13423Q(list);
                    } else {
                        profile = null;
                    }
                    if (profile != null) {
                        return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error with profile"));
                    }
                    if (!profileRepositoryImpl2.f20375e.m15514g()) {
                        profile.f17795o = profileRepositoryImpl2.f20375e.m15510c("language_code");
                    }
                    interfaceC5180b = profileRepositoryImpl2.f20374d;
                    profileRepositoryImpl$userProfileWhenLogin$1.f20456d = profile;
                    profileRepositoryImpl$userProfileWhenLogin$1.f20460h = 3;
                    if (interfaceC5180b.mo9620i(profile, profileRepositoryImpl$userProfileWhenLogin$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    profile2 = profile;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    profile2 = (Profile) profileRepositoryImpl$userProfileWhenLogin$1.f20456d;
                    C7499b.m14977z0(objM14360a);
                }
                Resource.f17861d.getClass();
                return Resource.C3303a.m9437c(profile2);
            }
            C7499b.m14977z0(objM14360a);
            ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = this.f20374d.mo9619h();
            profileRepositoryImpl$userProfileWhenLogin$1.f20456d = this;
            profileRepositoryImpl$userProfileWhenLogin$1.f20457e = z10;
            profileRepositoryImpl$userProfileWhenLogin$1.f20460h = 1;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$1Mo9619h, profileRepositoryImpl$userProfileWhenLogin$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Profile profile3 = (Profile) objM14360a;
            if (profile3.f17781a != 0) {
                if (profile3.f17783c.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    if (!z10) {
                        return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error loading profile"));
                    }
                }
            }
            InterfaceC9944l interfaceC9944l = profileRepositoryImpl.f20371a;
            profileRepositoryImpl$userProfileWhenLogin$1.f20456d = profileRepositoryImpl;
            profileRepositoryImpl$userProfileWhenLogin$1.f20460h = 2;
            objM14360a = interfaceC9944l.m18517p(profileRepositoryImpl$userProfileWhenLogin$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl2 = profileRepositoryImpl;
            list = ((Results) objM14360a).f19136d;
            if (list != 0) {
                profile = (Profile) C6752c.m13423Q(list);
            } else {
                profile = null;
            }
            if (profile != null) {
                return Resource.C3303a.m9436b(Resource.f17861d, new Exception("Error with profile"));
            }
            if (!profileRepositoryImpl2.f20375e.m15514g()) {
                profile.f17795o = profileRepositoryImpl2.f20375e.m15510c("language_code");
            }
            interfaceC5180b = profileRepositoryImpl2.f20374d;
            profileRepositoryImpl$userProfileWhenLogin$1.f20456d = profile;
            profileRepositoryImpl$userProfileWhenLogin$1.f20460h = 3;
            if (interfaceC5180b.mo9620i(profile, profileRepositoryImpl$userProfileWhenLogin$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            profile2 = profile;
            Resource.f17861d.getClass();
            return Resource.C3303a.m9437c(profile2);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: r */
    public final Object mo6149r(String str, String str2, InterfaceC9968c<? super ResultRegistrationValidation> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$registrationValidateFields$1 profileRepositoryImpl$registrationValidateFields$1;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$registrationValidateFields$1) {
            profileRepositoryImpl$registrationValidateFields$1 = (ProfileRepositoryImpl$registrationValidateFields$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$registrationValidateFields$1.f20419f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$registrationValidateFields$1.f20419f = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$registrationValidateFields$1 = new ProfileRepositoryImpl$registrationValidateFields$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$registrationValidateFields$1 = new ProfileRepositoryImpl$registrationValidateFields$1(this, interfaceC9968c);
        }
        Object objM18512k = profileRepositoryImpl$registrationValidateFields$1.f20417d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$registrationValidateFields$1.f20419f;
        try {
            if (i11 == 0) {
                C7499b.m14977z0(objM18512k);
                InterfaceC9944l interfaceC9944l = this.f20371a;
                profileRepositoryImpl$registrationValidateFields$1.f20419f = 1;
                objM18512k = interfaceC9944l.m18512k(str, str2, profileRepositoryImpl$registrationValidateFields$1);
                if (objM18512k == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM18512k);
            }
            return (ResultRegistrationValidation) objM18512k;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: s */
    public final Object mo6150s(String str, InterfaceC9968c<? super Resource<Login>> interfaceC9968c) throws Throwable {
        ProfileRepositoryImpl$loginWithCode$1 profileRepositoryImpl$loginWithCode$1;
        ProfileRepositoryImpl profileRepositoryImpl;
        Resource.C3303a c3303a;
        Object objM14360a;
        Resource.C3303a c3303a2;
        if (interfaceC9968c instanceof ProfileRepositoryImpl$loginWithCode$1) {
            profileRepositoryImpl$loginWithCode$1 = (ProfileRepositoryImpl$loginWithCode$1) interfaceC9968c;
            int i10 = profileRepositoryImpl$loginWithCode$1.f20398g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileRepositoryImpl$loginWithCode$1.f20398g = i10 - Integer.MIN_VALUE;
            } else {
                profileRepositoryImpl$loginWithCode$1 = new ProfileRepositoryImpl$loginWithCode$1(this, interfaceC9968c);
            }
        } else {
            profileRepositoryImpl$loginWithCode$1 = new ProfileRepositoryImpl$loginWithCode$1(this, interfaceC9968c);
        }
        Object objM18509h = profileRepositoryImpl$loginWithCode$1.f20396e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileRepositoryImpl$loginWithCode$1.f20398g;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginWithCode$1.f20395d;
                    C7499b.m14977z0(objM18509h);
                } else if (i11 == 2) {
                    profileRepositoryImpl = (ProfileRepositoryImpl) profileRepositoryImpl$loginWithCode$1.f20395d;
                    C7499b.m14977z0(objM18509h);
                    c3303a = Resource.f17861d;
                    ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b = profileRepositoryImpl.f20374d.mo9613b();
                    profileRepositoryImpl$loginWithCode$1.f20395d = c3303a;
                    profileRepositoryImpl$loginWithCode$1.f20398g = 3;
                    objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b, profileRepositoryImpl$loginWithCode$1);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    objM18509h = objM14360a;
                    c3303a2 = c3303a;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3303a2 = (Resource.C3303a) profileRepositoryImpl$loginWithCode$1.f20395d;
                    C7499b.m14977z0(objM18509h);
                }
                c3303a2.getClass();
                return Resource.C3303a.m9437c(objM18509h);
            }
            C7499b.m14977z0(objM18509h);
            InterfaceC9944l interfaceC9944l = this.f20371a;
            profileRepositoryImpl$loginWithCode$1.f20395d = this;
            profileRepositoryImpl$loginWithCode$1.f20398g = 1;
            objM18509h = interfaceC9944l.m18509h(str, profileRepositoryImpl$loginWithCode$1);
            if (objM18509h == coroutineSingletons) {
                return coroutineSingletons;
            }
            profileRepositoryImpl = this;
            Login login = (Login) objM18509h;
            if (login != null) {
                InterfaceC5180b interfaceC5180b = profileRepositoryImpl.f20374d;
                profileRepositoryImpl$loginWithCode$1.f20395d = profileRepositoryImpl;
                profileRepositoryImpl$loginWithCode$1.f20398g = 2;
                if (interfaceC5180b.mo9621j(login, profileRepositoryImpl$loginWithCode$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            c3303a = Resource.f17861d;
            ProfileStoreImpl$special$$inlined$map$3 profileStoreImpl$special$$inlined$map$3Mo9613b2 = profileRepositoryImpl.f20374d.mo9613b();
            profileRepositoryImpl$loginWithCode$1.f20395d = c3303a;
            profileRepositoryImpl$loginWithCode$1.f20398g = 3;
            objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$3Mo9613b2, profileRepositoryImpl$loginWithCode$1);
            if (objM14360a == coroutineSingletons) {
                return coroutineSingletons;
            }
            objM18509h = objM14360a;
            c3303a2 = c3303a;
            c3303a2.getClass();
            return Resource.C3303a.m9437c(objM18509h);
        } catch (HttpException e10) {
            e10.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e10);
        } catch (Exception e11) {
            e11.printStackTrace();
            return Resource.C3303a.m9436b(Resource.f17861d, e11);
        }
    }

    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: t */
    public final Object mo6151t(int i10, RequestUserUpdate requestUserUpdate, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM18513l = this.f20371a.m18513l(new Integer(i10), requestUserUpdate, interfaceC9968c);
        return objM18513l == CoroutineSingletons.COROUTINE_SUSPENDED ? objM18513l : C9072e.f47360a;
    }

    @Override // ci.InterfaceC2020m
    /* JADX INFO: renamed from: u */
    public final FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 mo6152u(String str) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new C7136q(new ProfileRepositoryImpl$recoverPassword$2(this, str, null)), new ProfileRepositoryImpl$recoverPassword$3(null));
    }
}
