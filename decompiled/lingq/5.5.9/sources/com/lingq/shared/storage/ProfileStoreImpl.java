package com.lingq.shared.storage;

import androidx.datastore.preferences.core.PreferencesKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Login;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import p076di.InterfaceC5180b;
import p129g3.InterfaceC5687d;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class ProfileStoreImpl implements InterfaceC5180b {

    /* JADX INFO: renamed from: a */
    public final C4955q f21071a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5687d<AbstractC6579a> f21072b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6579a.a<String> f21073c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6579a.a<String> f21074d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6579a.a<String> f21075e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6579a.a<String> f21076f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6579a.a<Integer> f21077g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6579a.a<Integer> f21078h;

    /* JADX INFO: renamed from: i */
    public final ProfileStoreImpl$special$$inlined$map$1 f21079i;

    /* JADX INFO: renamed from: j */
    public final ProfileStoreImpl$special$$inlined$map$2 f21080j;

    /* JADX INFO: renamed from: k */
    public final ProfileStoreImpl$special$$inlined$map$3 f21081k;

    /* JADX INFO: renamed from: l */
    public final ProfileStoreImpl$special$$inlined$map$4 f21082l;

    /* JADX INFO: renamed from: m */
    public final ProfileStoreImpl$special$$inlined$map$6 f21083m;

    /* JADX INFO: renamed from: n */
    public final ProfileStoreImpl$special$$inlined$map$7 f21084n;

    /* JADX WARN: Type inference failed for: r5v1, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$7] */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4] */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$6] */
    public ProfileStoreImpl(C4955q c4955q, InterfaceC5687d interfaceC5687d, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC5687d, "dataStore");
        this.f21071a = c4955q;
        this.f21072b = interfaceC5687d;
        this.f21073c = C7499b.m14975y0("profile_3");
        this.f21074d = C7499b.m14975y0("profile_account");
        C7499b.m14922T("userId");
        this.f21075e = C7499b.m14975y0("guid");
        this.f21076f = C7499b.m14975y0("login");
        this.f21077g = C7499b.m14922T("referral_signups");
        this.f21078h = C7499b.m14922T("referral_points");
        final InterfaceC7116c interfaceC7116cMo3005a = interfaceC5687d.mo3005a();
        this.f21079i = new InterfaceC7116c<Profile>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1$2 */
            public static final class C33552<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21109a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21110b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21111d;

                    /* JADX INFO: renamed from: e */
                    public int f21112e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21111d = obj;
                        this.f21112e |= Integer.MIN_VALUE;
                        return C33552.this.mo1339r(null, this);
                    }
                }

                public C33552(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21109a = interfaceC7117d;
                    this.f21110b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21112e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21112e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21111d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21112e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        ProfileStoreImpl profileStoreImpl = this.f21110b;
                        AbstractC4949k<T> abstractC4949kM10563a = profileStoreImpl.f21071a.m10563a(Profile.class);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(profileStoreImpl.f21073c);
                        if (str == null) {
                            str = "{}";
                        }
                        Profile profile = (Profile) abstractC4949kM10563a.m10532b(str);
                        if (profile == null) {
                            profile = new Profile(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
                        }
                        anonymousClass1.f21112e = 1;
                        if (this.f21109a.mo1339r(profile, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Profile> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a.mo9539a(new C33552(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a2 = interfaceC5687d.mo3005a();
        this.f21080j = new InterfaceC7116c<ProfileAccount>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2$2 */
            public static final class C33562<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21116a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21117b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21118d;

                    /* JADX INFO: renamed from: e */
                    public int f21119e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21118d = obj;
                        this.f21119e |= Integer.MIN_VALUE;
                        return C33562.this.mo1339r(null, this);
                    }
                }

                public C33562(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21116a = interfaceC7117d;
                    this.f21117b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21119e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21119e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21118d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21119e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        ProfileStoreImpl profileStoreImpl = this.f21117b;
                        AbstractC4949k<T> abstractC4949kM10563a = profileStoreImpl.f21071a.m10563a(ProfileAccount.class);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(profileStoreImpl.f21074d);
                        if (str == null) {
                            str = "{}";
                        }
                        ProfileAccount profileAccount = (ProfileAccount) abstractC4949kM10563a.m10532b(str);
                        if (profileAccount == null) {
                            profileAccount = new ProfileAccount(0, null, null, null, 0, null, null, null, 0, null, 0, false, null, 8191, null);
                        }
                        anonymousClass1.f21119e = 1;
                        if (this.f21116a.mo1339r(profileAccount, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super ProfileAccount> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a2.mo9539a(new C33562(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a3 = interfaceC5687d.mo3005a();
        this.f21081k = new InterfaceC7116c<Login>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3$2 */
            public static final class C33572<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21123a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21124b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$3$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21125d;

                    /* JADX INFO: renamed from: e */
                    public int f21126e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21125d = obj;
                        this.f21126e |= Integer.MIN_VALUE;
                        return C33572.this.mo1339r(null, this);
                    }
                }

                public C33572(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21123a = interfaceC7117d;
                    this.f21124b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21126e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21126e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21125d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21126e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        ProfileStoreImpl profileStoreImpl = this.f21124b;
                        AbstractC4949k<T> abstractC4949kM10563a = profileStoreImpl.f21071a.m10563a(Login.class);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(profileStoreImpl.f21076f);
                        if (str == null) {
                            str = "{}";
                        }
                        Login login = (Login) abstractC4949kM10563a.m10532b(str);
                        if (login == null) {
                            login = new Login(null, null, null, false, false, 31, null);
                        }
                        anonymousClass1.f21126e = 1;
                        if (this.f21123a.mo1339r(login, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Login> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a3.mo9539a(new C33572(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a4 = interfaceC5687d.mo3005a();
        this.f21082l = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4$2 */
            public static final class C33582<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21130a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21131b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$4$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21132d;

                    /* JADX INFO: renamed from: e */
                    public int f21133e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21132d = obj;
                        this.f21133e |= Integer.MIN_VALUE;
                        return C33582.this.mo1339r(null, this);
                    }
                }

                public C33582(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21130a = interfaceC7117d;
                    this.f21131b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21133e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21133e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21132d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21133e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f21131b.f21075e);
                        if (str == null) {
                            str = "";
                        }
                        anonymousClass1.f21133e = 1;
                        if (this.f21130a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super String> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a4.mo9539a(new C33582(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        interfaceC5687d.mo3005a();
        final InterfaceC7116c interfaceC7116cMo3005a5 = interfaceC5687d.mo3005a();
        this.f21083m = new InterfaceC7116c<Integer>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$6

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$6$2 */
            public static final class C33592<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21137a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21138b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$6$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$6$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21139d;

                    /* JADX INFO: renamed from: e */
                    public int f21140e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21139d = obj;
                        this.f21140e |= Integer.MIN_VALUE;
                        return C33592.this.mo1339r(null, this);
                    }
                }

                public C33592(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21137a = interfaceC7117d;
                    this.f21138b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21140e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21140e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21139d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21140e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Integer num = (Integer) ((AbstractC6579a) obj).mo3050b(this.f21138b.f21077g);
                        Integer num2 = new Integer(num != null ? num.intValue() : 0);
                        anonymousClass1.f21140e = 1;
                        if (this.f21137a.mo1339r(num2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a5.mo9539a(new C33592(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a6 = interfaceC5687d.mo3005a();
        this.f21084n = new InterfaceC7116c<Integer>() { // from class: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$7

            /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$7$2 */
            public static final class C33602<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21144a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ProfileStoreImpl f21145b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$7$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$7$2", m19206f = "ProfileStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21146d;

                    /* JADX INFO: renamed from: e */
                    public int f21147e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21146d = obj;
                        this.f21147e |= Integer.MIN_VALUE;
                        return C33602.this.mo1339r(null, this);
                    }
                }

                public C33602(InterfaceC7117d interfaceC7117d, ProfileStoreImpl profileStoreImpl) {
                    this.f21144a = interfaceC7117d;
                    this.f21145b = profileStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21147e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21147e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21146d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21147e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Integer num = (Integer) ((AbstractC6579a) obj).mo3050b(this.f21145b.f21078h);
                        Integer num2 = new Integer(num != null ? num.intValue() : 0);
                        anonymousClass1.f21147e = 1;
                        if (this.f21144a.mo1339r(num2, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C7499b.m14977z0(obj2);
                    }
                    return C9072e.f47360a;
                }
            }

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super Integer> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a6.mo9539a(new C33602(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: a */
    public final Object mo9612a(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setReferralSignups$2(this, i10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: b */
    public final ProfileStoreImpl$special$$inlined$map$3 mo9613b() {
        return this.f21081k;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: c */
    public final ProfileStoreImpl$special$$inlined$map$7 mo9614c() {
        return this.f21084n;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: d */
    public final Object mo9615d(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setProfileAccount$2(this, profileAccount, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: e */
    public final Object mo9616e(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setGuid$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: f */
    public final Object mo9617f(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        ProfileStoreImpl$clearProfile$1 profileStoreImpl$clearProfile$1;
        ProfileStoreImpl profileStoreImpl;
        ProfileAccount profileAccount;
        if (interfaceC9968c instanceof ProfileStoreImpl$clearProfile$1) {
            profileStoreImpl$clearProfile$1 = (ProfileStoreImpl$clearProfile$1) interfaceC9968c;
            int i10 = profileStoreImpl$clearProfile$1.f21088g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                profileStoreImpl$clearProfile$1.f21088g = i10 - Integer.MIN_VALUE;
            } else {
                profileStoreImpl$clearProfile$1 = new ProfileStoreImpl$clearProfile$1(this, interfaceC9968c);
            }
        } else {
            profileStoreImpl$clearProfile$1 = new ProfileStoreImpl$clearProfile$1(this, interfaceC9968c);
        }
        Object obj = profileStoreImpl$clearProfile$1.f21086e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = profileStoreImpl$clearProfile$1.f21088g;
        if (i11 != 0) {
            if (i11 == 1) {
                profileStoreImpl = profileStoreImpl$clearProfile$1.f21085d;
                C7499b.m14977z0(obj);
            } else if (i11 == 2) {
                profileStoreImpl = profileStoreImpl$clearProfile$1.f21085d;
                C7499b.m14977z0(obj);
                profileAccount = new ProfileAccount(0, null, null, null, 0, null, null, null, 0, null, 0, false, null, 8191, null);
                profileStoreImpl$clearProfile$1.f21085d = profileStoreImpl;
                profileStoreImpl$clearProfile$1.f21088g = 3;
                if (profileStoreImpl.mo9615d(profileAccount, profileStoreImpl$clearProfile$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                profileStoreImpl$clearProfile$1.f21085d = null;
                profileStoreImpl$clearProfile$1.f21088g = 4;
                if (profileStoreImpl.mo9616e("", profileStoreImpl$clearProfile$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i11 == 3) {
                profileStoreImpl = profileStoreImpl$clearProfile$1.f21085d;
                C7499b.m14977z0(obj);
                profileStoreImpl$clearProfile$1.f21085d = null;
                profileStoreImpl$clearProfile$1.f21088g = 4;
                if (profileStoreImpl.mo9616e("", profileStoreImpl$clearProfile$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        Login login = new Login(null, null, null, false, false, 31, null);
        profileStoreImpl$clearProfile$1.f21085d = this;
        profileStoreImpl$clearProfile$1.f21088g = 1;
        if (mo9621j(login, profileStoreImpl$clearProfile$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileStoreImpl = this;
        Profile profile = new Profile(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null);
        profileStoreImpl$clearProfile$1.f21085d = profileStoreImpl;
        profileStoreImpl$clearProfile$1.f21088g = 2;
        if (profileStoreImpl.mo9620i(profile, profileStoreImpl$clearProfile$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileAccount = new ProfileAccount(0, null, null, null, 0, null, null, null, 0, null, 0, false, null, 8191, null);
        profileStoreImpl$clearProfile$1.f21085d = profileStoreImpl;
        profileStoreImpl$clearProfile$1.f21088g = 3;
        if (profileStoreImpl.mo9615d(profileAccount, profileStoreImpl$clearProfile$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        profileStoreImpl$clearProfile$1.f21085d = null;
        profileStoreImpl$clearProfile$1.f21088g = 4;
        if (profileStoreImpl.mo9616e("", profileStoreImpl$clearProfile$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: g */
    public final ProfileStoreImpl$special$$inlined$map$6 mo9618g() {
        return this.f21083m;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: h */
    public final ProfileStoreImpl$special$$inlined$map$1 mo9619h() {
        return this.f21079i;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: i */
    public final Object mo9620i(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setProfile$2(this, profile, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: j */
    public final Object mo9621j(Login login, ContinuationImpl continuationImpl) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setLogin$2(this, login, null), continuationImpl);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: k */
    public final Object mo9622k(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21072b, new ProfileStoreImpl$setReferralPoints$2(this, i10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: l */
    public final ProfileStoreImpl$special$$inlined$map$4 mo9623l() {
        return this.f21082l;
    }

    @Override // p076di.InterfaceC5180b
    /* JADX INFO: renamed from: m */
    public final ProfileStoreImpl$special$$inlined$map$2 mo9624m() {
        return this.f21080j;
    }
}
