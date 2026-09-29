package com.lingq.core.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import com.lingq.core.domain.model.onboarding.RatingController;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.df4;
import p000.nn1;
import p000.vma;
import p000.xfa;
import p000.yma;

/* JADX INFO: renamed from: com.lingq.core.datastore.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1371d implements vma {

    /* JADX INFO: renamed from: A */
    public final c83 f18561A;

    /* JADX INFO: renamed from: B */
    public final c83 f18562B;

    /* JADX INFO: renamed from: C */
    public final yma f18563C;

    /* JADX INFO: renamed from: a */
    public final df4 f18564a;

    /* JADX INFO: renamed from: b */
    public final DataStore f18565b;

    /* JADX INFO: renamed from: c */
    public final Preferences.Key f18566c = PreferencesKeys.stringKey("searchSettings_17");

    /* JADX INFO: renamed from: d */
    public final Preferences.Key f18567d = PreferencesKeys.stringKey("vocabularySearchQuery_2");

    /* JADX INFO: renamed from: e */
    public final Preferences.Key f18568e = PreferencesKeys.stringKey("audio_progress");

    /* JADX INFO: renamed from: f */
    public final Preferences.Key f18569f = PreferencesKeys.stringKey("selectedPlaylists");

    /* JADX INFO: renamed from: g */
    public final Preferences.Key f18570g = PreferencesKeys.stringKey("lessons_pages_2");

    /* JADX INFO: renamed from: h */
    public final Preferences.Key f18571h = PreferencesKeys.stringKey("lessons_bookmark_reader_mode");

    /* JADX INFO: renamed from: i */
    public final Preferences.Key f18572i;

    /* JADX INFO: renamed from: j */
    public final Preferences.Key f18573j;

    /* JADX INFO: renamed from: k */
    public final Preferences.Key f18574k;

    /* JADX INFO: renamed from: l */
    public final Preferences.Key f18575l;

    /* JADX INFO: renamed from: m */
    public final Preferences.Key f18576m;

    /* JADX INFO: renamed from: n */
    public final Preferences.Key f18577n;

    /* JADX INFO: renamed from: o */
    public final Preferences.Key f18578o;

    /* JADX INFO: renamed from: p */
    public final Preferences.Key f18579p;

    /* JADX INFO: renamed from: q */
    public final c83 f18580q;

    /* JADX INFO: renamed from: r */
    public final c83 f18581r;

    /* JADX INFO: renamed from: s */
    public final c83 f18582s;

    /* JADX INFO: renamed from: t */
    public final c83 f18583t;

    /* JADX INFO: renamed from: u */
    public final c83 f18584u;

    /* JADX INFO: renamed from: v */
    public final c83 f18585v;

    /* JADX INFO: renamed from: w */
    public final yma f18586w;

    /* JADX INFO: renamed from: x */
    public final c83 f18587x;

    /* JADX INFO: renamed from: y */
    public final c83 f18588y;

    /* JADX INFO: renamed from: z */
    public final c83 f18589z;

    public C1371d(df4 df4Var, DataStore dataStore, nn1 nn1Var) {
        this.f18564a = df4Var;
        this.f18565b = dataStore;
        PreferencesKeys.stringKey("lessonSortFilter");
        this.f18572i = PreferencesKeys.stringKey("dismissedCupBanner");
        this.f18573j = PreferencesKeys.stringKey("localePopularMeaningsForLanguage");
        this.f18574k = PreferencesKeys.stringKey("dailyGoalMet2");
        this.f18575l = PreferencesKeys.stringKey("streak_repair");
        this.f18576m = PreferencesKeys.stringKey("unreadNotifications");
        this.f18577n = PreferencesKeys.stringKey("vocabularyPagesCount");
        this.f18578o = PreferencesKeys.stringKey("promoBanners_upgrade");
        this.f18579p = PreferencesKeys.stringKey("ratings_controller");
        PreferencesKeys.stringKey("shareData");
        this.f18580q = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 6), nn1Var);
        this.f18581r = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 7), nn1Var);
        this.f18582s = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 8), nn1Var);
        this.f18583t = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 9), nn1Var);
        this.f18584u = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 10), nn1Var);
        this.f18585v = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 11), nn1Var);
        dataStore.getData();
        this.f18586w = new yma(dataStore.getData(), this, 12);
        this.f18587x = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 13), nn1Var);
        AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 0), nn1Var);
        this.f18588y = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 1), nn1Var);
        this.f18589z = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 2), nn1Var);
        this.f18561A = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 3), nn1Var);
        this.f18562B = AbstractC3224d.m15544w(new yma(dataStore.getData(), this, 4), nn1Var);
        this.f18563C = new yma(dataStore.getData(), this, 5);
        dataStore.getData();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009c  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m7961a(ContinuationImpl continuationImpl) throws Throwable {
        UtilStoreImpl$clearUtilStore$1 utilStoreImpl$clearUtilStore$1;
        Map mapM15360M;
        Map mapM15360M2;
        Map mapM15360M3;
        Map mapM15360M4;
        Object objEdit;
        Map mapM15360M5;
        Map mapM15360M6;
        Map mapM15360M7;
        if (continuationImpl instanceof UtilStoreImpl$clearUtilStore$1) {
            utilStoreImpl$clearUtilStore$1 = (UtilStoreImpl$clearUtilStore$1) continuationImpl;
            int i = utilStoreImpl$clearUtilStore$1.f18212c;
            if ((i & Integer.MIN_VALUE) != 0) {
                utilStoreImpl$clearUtilStore$1.f18212c = i - Integer.MIN_VALUE;
            } else {
                utilStoreImpl$clearUtilStore$1 = new UtilStoreImpl$clearUtilStore$1(this, continuationImpl);
            }
        } else {
            utilStoreImpl$clearUtilStore$1 = new UtilStoreImpl$clearUtilStore$1(this, continuationImpl);
        }
        Object obj = utilStoreImpl$clearUtilStore$1.f18210a;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = utilStoreImpl$clearUtilStore$1.f18212c;
        Object obj3 = xfa.f68157a;
        switch (i2) {
            case 0:
                AbstractC3193b.m15359b(obj);
                Map mapM15360M8 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 1;
                if (m7962b(mapM15360M8, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 2;
                    if (m7965e(mapM15360M, utilStoreImpl$clearUtilStore$1) != obj2) {
                        mapM15360M2 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 3;
                        if (m7964d(mapM15360M2, utilStoreImpl$clearUtilStore$1) != obj2) {
                            mapM15360M3 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 4;
                            if (m7969i(mapM15360M3, utilStoreImpl$clearUtilStore$1) != obj2) {
                                mapM15360M4 = AbstractC3194a.m15360M();
                                utilStoreImpl$clearUtilStore$1.f18212c = 5;
                                if (m7966f(mapM15360M4, utilStoreImpl$clearUtilStore$1) != obj2) {
                                    Map mapM15360M9 = AbstractC3194a.m15360M();
                                    utilStoreImpl$clearUtilStore$1.f18212c = 6;
                                    objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M9, null), utilStoreImpl$clearUtilStore$1);
                                    if (objEdit != obj2) {
                                        objEdit = obj3;
                                    }
                                    if (objEdit != obj2) {
                                        mapM15360M5 = AbstractC3194a.m15360M();
                                        utilStoreImpl$clearUtilStore$1.f18212c = 7;
                                        if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                                            mapM15360M6 = AbstractC3194a.m15360M();
                                            utilStoreImpl$clearUtilStore$1.f18212c = 8;
                                            if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                                                mapM15360M7 = AbstractC3194a.m15360M();
                                                utilStoreImpl$clearUtilStore$1.f18212c = 9;
                                                if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                                    return obj3;
                                                }
                                            }
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
                mapM15360M = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 2;
                if (m7965e(mapM15360M, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M2 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 3;
                    if (m7964d(mapM15360M2, utilStoreImpl$clearUtilStore$1) != obj2) {
                        mapM15360M3 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 4;
                        if (m7969i(mapM15360M3, utilStoreImpl$clearUtilStore$1) != obj2) {
                            mapM15360M4 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 5;
                            if (m7966f(mapM15360M4, utilStoreImpl$clearUtilStore$1) != obj2) {
                                Map mapM15360M10 = AbstractC3194a.m15360M();
                                utilStoreImpl$clearUtilStore$1.f18212c = 6;
                                objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M10, null), utilStoreImpl$clearUtilStore$1);
                                if (objEdit != obj2) {
                                    objEdit = obj3;
                                }
                                if (objEdit != obj2) {
                                    mapM15360M5 = AbstractC3194a.m15360M();
                                    utilStoreImpl$clearUtilStore$1.f18212c = 7;
                                    if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                                        mapM15360M6 = AbstractC3194a.m15360M();
                                        utilStoreImpl$clearUtilStore$1.f18212c = 8;
                                        if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                                            mapM15360M7 = AbstractC3194a.m15360M();
                                            utilStoreImpl$clearUtilStore$1.f18212c = 9;
                                            if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                                return obj3;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 2:
                AbstractC3193b.m15359b(obj);
                mapM15360M2 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 3;
                if (m7964d(mapM15360M2, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M3 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 4;
                    if (m7969i(mapM15360M3, utilStoreImpl$clearUtilStore$1) != obj2) {
                        mapM15360M4 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 5;
                        if (m7966f(mapM15360M4, utilStoreImpl$clearUtilStore$1) != obj2) {
                            Map mapM15360M11 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 6;
                            objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M11, null), utilStoreImpl$clearUtilStore$1);
                            if (objEdit != obj2) {
                                objEdit = obj3;
                            }
                            if (objEdit != obj2) {
                                mapM15360M5 = AbstractC3194a.m15360M();
                                utilStoreImpl$clearUtilStore$1.f18212c = 7;
                                if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                                    mapM15360M6 = AbstractC3194a.m15360M();
                                    utilStoreImpl$clearUtilStore$1.f18212c = 8;
                                    if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                                        mapM15360M7 = AbstractC3194a.m15360M();
                                        utilStoreImpl$clearUtilStore$1.f18212c = 9;
                                        if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                            return obj3;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 3:
                AbstractC3193b.m15359b(obj);
                mapM15360M3 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 4;
                if (m7969i(mapM15360M3, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M4 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 5;
                    if (m7966f(mapM15360M4, utilStoreImpl$clearUtilStore$1) != obj2) {
                        Map mapM15360M12 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 6;
                        objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M12, null), utilStoreImpl$clearUtilStore$1);
                        if (objEdit != obj2) {
                            objEdit = obj3;
                        }
                        if (objEdit != obj2) {
                            mapM15360M5 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 7;
                            if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                                mapM15360M6 = AbstractC3194a.m15360M();
                                utilStoreImpl$clearUtilStore$1.f18212c = 8;
                                if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                                    mapM15360M7 = AbstractC3194a.m15360M();
                                    utilStoreImpl$clearUtilStore$1.f18212c = 9;
                                    if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                        return obj3;
                                    }
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 4:
                AbstractC3193b.m15359b(obj);
                mapM15360M4 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 5;
                if (m7966f(mapM15360M4, utilStoreImpl$clearUtilStore$1) != obj2) {
                    Map mapM15360M13 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 6;
                    objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M13, null), utilStoreImpl$clearUtilStore$1);
                    if (objEdit != obj2) {
                        objEdit = obj3;
                    }
                    if (objEdit != obj2) {
                        mapM15360M5 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 7;
                        if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                            mapM15360M6 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 8;
                            if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                                mapM15360M7 = AbstractC3194a.m15360M();
                                utilStoreImpl$clearUtilStore$1.f18212c = 9;
                                if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                    return obj3;
                                }
                            }
                        }
                    }
                }
                return obj2;
            case 5:
                AbstractC3193b.m15359b(obj);
                Map mapM15360M14 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 6;
                objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDailyGoalMet$2(this, mapM15360M14, null), utilStoreImpl$clearUtilStore$1);
                if (objEdit != obj2) {
                    objEdit = obj3;
                }
                if (objEdit != obj2) {
                    mapM15360M5 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 7;
                    if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                        mapM15360M6 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 8;
                        if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                            mapM15360M7 = AbstractC3194a.m15360M();
                            utilStoreImpl$clearUtilStore$1.f18212c = 9;
                            if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                                return obj3;
                            }
                        }
                    }
                }
                return obj2;
            case 6:
                AbstractC3193b.m15359b(obj);
                mapM15360M5 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 7;
                if (m7971k(mapM15360M5, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M6 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 8;
                    if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                        mapM15360M7 = AbstractC3194a.m15360M();
                        utilStoreImpl$clearUtilStore$1.f18212c = 9;
                        if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                            return obj3;
                        }
                    }
                }
                return obj2;
            case 7:
                AbstractC3193b.m15359b(obj);
                mapM15360M6 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 8;
                if (m7972l(mapM15360M6, utilStoreImpl$clearUtilStore$1) != obj2) {
                    mapM15360M7 = AbstractC3194a.m15360M();
                    utilStoreImpl$clearUtilStore$1.f18212c = 9;
                    if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                        return obj3;
                    }
                }
                return obj2;
            case 8:
                AbstractC3193b.m15359b(obj);
                mapM15360M7 = AbstractC3194a.m15360M();
                utilStoreImpl$clearUtilStore$1.f18212c = 9;
                if (m7973m(mapM15360M7, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                return obj3;
            case 9:
                AbstractC3193b.m15359b(obj);
                return obj3;
            default:
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final Object m7962b(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setAudioProgress$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7963c(String str, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setDismissedCupBanner$2(this, str, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: d */
    public final Object m7964d(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setLessonsBookmarkReaderMode$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m7965e(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setLessonsPageBookmark$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: f */
    public final Object m7966f(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m7967g(LinkedHashMap linkedHashMap, Continuation continuation) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setPromoBanners$2(this, linkedHashMap, null), continuation);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public final Object m7968h(RatingController ratingController, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setRatingController$2(this, ratingController, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: i */
    public final Object m7969i(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setSearchQuery$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: j */
    public final Object m7970j(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setSelectedPlaylists$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: k */
    public final Object m7971k(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setStreakRepair$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: l */
    public final Object m7972l(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setUnreadNotifications$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: m */
    public final Object m7973m(Map map, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setVocabularyPagesCount$2(this, map, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }

    /* JADX INFO: renamed from: n */
    public final Object m7974n(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objEdit = PreferencesKt.edit(this.f18565b, new UtilStoreImpl$setVocabularySearchQuery$2(this, linkedHashMap, null), continuationImpl);
        return objEdit == CoroutineSingletons.COROUTINE_SUSPENDED ? objEdit : xfa.f68157a;
    }
}
