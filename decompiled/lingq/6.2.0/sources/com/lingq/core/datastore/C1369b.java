package com.lingq.core.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.lingq.core.domain.model.user.Login;
import com.lingq.core.domain.model.user.Profile;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.model.user.SubscriptionDetails;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.df4;
import p000.nm7;
import p000.qm7;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.datastore.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1369b implements nm7 {

    /* JADX INFO: renamed from: a */
    public final df4 f18468a;

    /* JADX INFO: renamed from: b */
    public final DataStore f18469b;

    /* JADX INFO: renamed from: c */
    public final Preferences.Key f18470c = PreferencesKeys.stringKey("profile_4");

    /* JADX INFO: renamed from: d */
    public final Preferences.Key f18471d = PreferencesKeys.stringKey("profile_account");

    /* JADX INFO: renamed from: e */
    public final Preferences.Key f18472e;

    /* JADX INFO: renamed from: f */
    public final Preferences.Key f18473f;

    /* JADX INFO: renamed from: g */
    public final Preferences.Key f18474g;

    /* JADX INFO: renamed from: h */
    public final Preferences.Key f18475h;

    /* JADX INFO: renamed from: i */
    public final Preferences.Key f18476i;

    /* JADX INFO: renamed from: j */
    public final Preferences.Key f18477j;

    /* JADX INFO: renamed from: k */
    public final Preferences.Key f18478k;

    /* JADX INFO: renamed from: l */
    public final Preferences.Key f18479l;

    /* JADX INFO: renamed from: m */
    public final qm7 f18480m;

    /* JADX INFO: renamed from: n */
    public final qm7 f18481n;

    /* JADX INFO: renamed from: o */
    public final qm7 f18482o;

    /* JADX INFO: renamed from: p */
    public final qm7 f18483p;

    /* JADX INFO: renamed from: q */
    public final qm7 f18484q;

    /* JADX INFO: renamed from: r */
    public final qm7 f18485r;

    /* JADX INFO: renamed from: s */
    public final qm7 f18486s;

    /* JADX INFO: renamed from: t */
    public final qm7 f18487t;

    /* JADX INFO: renamed from: u */
    public final qm7 f18488u;

    public C1369b(df4 df4Var, DataStore dataStore) {
        this.f18468a = df4Var;
        this.f18469b = dataStore;
        PreferencesKeys.intKey("userId");
        this.f18472e = PreferencesKeys.stringKey("guid");
        this.f18473f = PreferencesKeys.stringKey("login");
        this.f18474g = PreferencesKeys.stringKey("subscription_details_1");
        this.f18475h = PreferencesKeys.stringKey("subscription_history_details_1");
        this.f18476i = PreferencesKeys.intKey("referral_signups");
        this.f18477j = PreferencesKeys.intKey("referral_points");
        this.f18478k = PreferencesKeys.stringKey("keyIgnoreTimezone");
        this.f18479l = PreferencesKeys.booleanKey("words_known_notification");
        this.f18480m = new qm7(dataStore.getData(), this, 2);
        this.f18481n = new qm7(dataStore.getData(), this, 3);
        this.f18482o = new qm7(dataStore.getData(), this, 4);
        this.f18483p = new qm7(dataStore.getData(), this, 5);
        dataStore.getData();
        this.f18484q = new qm7(dataStore.getData(), this, 6);
        dataStore.getData();
        this.f18485r = new qm7(dataStore.getData(), this, 7);
        this.f18486s = new qm7(dataStore.getData(), this, 8);
        this.f18487t = new qm7(dataStore.getData(), this, 0);
        this.f18488u = new qm7(dataStore.getData(), this, 1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: a */
    public final Object m7914a(ContinuationImpl continuationImpl) throws Throwable {
        ProfileStoreImpl$clearProfile$1 profileStoreImpl$clearProfile$1;
        Profile profile;
        ProfileAccount profileAccount;
        Object objEdit;
        SubscriptionDetails subscriptionDetails;
        if (continuationImpl instanceof ProfileStoreImpl$clearProfile$1) {
            profileStoreImpl$clearProfile$1 = (ProfileStoreImpl$clearProfile$1) continuationImpl;
            int i = profileStoreImpl$clearProfile$1.f17943c;
            if ((i & Integer.MIN_VALUE) != 0) {
                profileStoreImpl$clearProfile$1.f17943c = i - Integer.MIN_VALUE;
            } else {
                profileStoreImpl$clearProfile$1 = new ProfileStoreImpl$clearProfile$1(this, continuationImpl);
            }
        } else {
            profileStoreImpl$clearProfile$1 = new ProfileStoreImpl$clearProfile$1(this, continuationImpl);
        }
        Object obj = profileStoreImpl$clearProfile$1.f17941a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = profileStoreImpl$clearProfile$1.f17943c;
        Object obj3 = xfa.f68157a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(obj);
                Login login = new Login(null, 31, false);
                profileStoreImpl$clearProfile$1.f17943c = 1;
                if (m7919f(login, profileStoreImpl$clearProfile$1) != obj2) {
                    Boolean bool = Boolean.FALSE;
                    profile = new Profile(0, "", "", null, "", "", "", "", "", "", "", null, "", "", "", "", "", EmptyList.f47638a, null, 0, "", 0, 0, bool, bool);
                    profileStoreImpl$clearProfile$1.f17943c = 2;
                    if (m7920g(profile, profileStoreImpl$clearProfile$1) != obj2) {
                        profileAccount = new ProfileAccount();
                        profileStoreImpl$clearProfile$1.f17943c = 3;
                        if (m7921h(profileAccount, profileStoreImpl$clearProfile$1) != obj2) {
                            profileStoreImpl$clearProfile$1.f17943c = 4;
                            if (m7917d("", profileStoreImpl$clearProfile$1) != obj2) {
                                profileStoreImpl$clearProfile$1.f17943c = 5;
                                if (m7918e("", profileStoreImpl$clearProfile$1) != obj2) {
                                    profileStoreImpl$clearProfile$1.f17943c = 6;
                                    objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                                    if (objEdit != obj2) {
                                        objEdit = obj3;
                                    }
                                    if (objEdit != obj2) {
                                        subscriptionDetails = new SubscriptionDetails();
                                        profileStoreImpl$clearProfile$1.f17943c = 7;
                                        if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                                            return obj3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 1:
                AbstractC3193b.m15359b(obj);
                Boolean bool2 = Boolean.FALSE;
                profile = new Profile(0, "", "", null, "", "", "", "", "", "", "", null, "", "", "", "", "", EmptyList.f47638a, null, 0, "", 0, 0, bool2, bool2);
                profileStoreImpl$clearProfile$1.f17943c = 2;
                if (m7920g(profile, profileStoreImpl$clearProfile$1) != obj2) {
                    profileAccount = new ProfileAccount();
                    profileStoreImpl$clearProfile$1.f17943c = 3;
                    if (m7921h(profileAccount, profileStoreImpl$clearProfile$1) != obj2) {
                        profileStoreImpl$clearProfile$1.f17943c = 4;
                        if (m7917d("", profileStoreImpl$clearProfile$1) != obj2) {
                            profileStoreImpl$clearProfile$1.f17943c = 5;
                            if (m7918e("", profileStoreImpl$clearProfile$1) != obj2) {
                                profileStoreImpl$clearProfile$1.f17943c = 6;
                                objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                                if (objEdit != obj2) {
                                    objEdit = obj3;
                                }
                                if (objEdit != obj2) {
                                    subscriptionDetails = new SubscriptionDetails();
                                    profileStoreImpl$clearProfile$1.f17943c = 7;
                                    if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                                        return obj3;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                AbstractC3193b.m15359b(obj);
                profileAccount = new ProfileAccount();
                profileStoreImpl$clearProfile$1.f17943c = 3;
                if (m7921h(profileAccount, profileStoreImpl$clearProfile$1) != obj2) {
                    profileStoreImpl$clearProfile$1.f17943c = 4;
                    if (m7917d("", profileStoreImpl$clearProfile$1) != obj2) {
                        profileStoreImpl$clearProfile$1.f17943c = 5;
                        if (m7918e("", profileStoreImpl$clearProfile$1) != obj2) {
                            profileStoreImpl$clearProfile$1.f17943c = 6;
                            objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                            if (objEdit != obj2) {
                                objEdit = obj3;
                            }
                            if (objEdit != obj2) {
                                subscriptionDetails = new SubscriptionDetails();
                                profileStoreImpl$clearProfile$1.f17943c = 7;
                                if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                                    return obj3;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                AbstractC3193b.m15359b(obj);
                profileStoreImpl$clearProfile$1.f17943c = 4;
                if (m7917d("", profileStoreImpl$clearProfile$1) != obj2) {
                    profileStoreImpl$clearProfile$1.f17943c = 5;
                    if (m7918e("", profileStoreImpl$clearProfile$1) != obj2) {
                        profileStoreImpl$clearProfile$1.f17943c = 6;
                        objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                        if (objEdit != obj2) {
                            objEdit = obj3;
                        }
                        if (objEdit != obj2) {
                            subscriptionDetails = new SubscriptionDetails();
                            profileStoreImpl$clearProfile$1.f17943c = 7;
                            if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                                return obj3;
                            }
                        }
                    }
                }
                return obj2;
            case 4:
                AbstractC3193b.m15359b(obj);
                profileStoreImpl$clearProfile$1.f17943c = 5;
                if (m7918e("", profileStoreImpl$clearProfile$1) != obj2) {
                    profileStoreImpl$clearProfile$1.f17943c = 6;
                    objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                    if (objEdit != obj2) {
                        objEdit = obj3;
                    }
                    if (objEdit != obj2) {
                        subscriptionDetails = new SubscriptionDetails();
                        profileStoreImpl$clearProfile$1.f17943c = 7;
                        if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                            return obj3;
                        }
                    }
                }
                return obj2;
            case 5:
                AbstractC3193b.m15359b(obj);
                profileStoreImpl$clearProfile$1.f17943c = 6;
                objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionHistoryDetails$2(this, null), profileStoreImpl$clearProfile$1);
                if (objEdit != obj2) {
                    objEdit = obj3;
                }
                if (objEdit != obj2) {
                    subscriptionDetails = new SubscriptionDetails();
                    profileStoreImpl$clearProfile$1.f17943c = 7;
                    if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                        return obj3;
                    }
                }
                return obj2;
            case 6:
                AbstractC3193b.m15359b(obj);
                subscriptionDetails = new SubscriptionDetails();
                profileStoreImpl$clearProfile$1.f17943c = 7;
                if (m7924k(subscriptionDetails, profileStoreImpl$clearProfile$1) == obj2) {
                    return obj2;
                }
                return obj3;
            case 7:
                AbstractC3193b.m15359b(obj);
                return obj3;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final qm7 m7915b() {
        return this.f18480m;
    }

    /* JADX INFO: renamed from: c */
    public final qm7 m7916c() {
        return this.f18481n;
    }

    /* JADX INFO: renamed from: d */
    public final Object m7917d(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setGuid$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m7918e(String str, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setIgnoreTimezone$2(this, str, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m7919f(Login login, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setLogin$2(this, login, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m7920g(Profile profile, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setProfile$2(this, profile, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7921h(ProfileAccount profileAccount, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setProfileAccount$2(this, profileAccount, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m7922i(int i, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setReferralPoints$2(this, i, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7923j(int i, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setReferralSignups$2(this, i, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m7924k(SubscriptionDetails subscriptionDetails, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setSubscriptionDetails$2(this, subscriptionDetails, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m7925l(boolean z, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18469b, new ProfileStoreImpl$setWordsKnownNotificationSeen$2(this, z, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }
}
