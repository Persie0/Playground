package com.lingq.shared.storage;

import ae.C0062b;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.core.PreferencesKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.language.LanguageProgressSort;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.library.LibrarySearchQuery;
import com.lingq.shared.uimodel.vocabulary.VocabularySearchQuery;
import com.lingq.shared.util.DailyGoalMet;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import p076di.InterfaceC5182d;
import p129g3.InterfaceC5687d;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
public final class UtilStoreImpl implements InterfaceC5182d {

    /* JADX INFO: renamed from: a */
    public final C4955q f21462a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5687d<AbstractC6579a> f21463b;

    /* JADX INFO: renamed from: c */
    public final AbstractC6579a.a<String> f21464c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6579a.a<String> f21465d;

    /* JADX INFO: renamed from: e */
    public final AbstractC6579a.a<String> f21466e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6579a.a<String> f21467f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6579a.a<String> f21468g;

    /* JADX INFO: renamed from: h */
    public final AbstractC6579a.a<String> f21469h;

    /* JADX INFO: renamed from: i */
    public final AbstractC6579a.a<String> f21470i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6579a.a<String> f21471j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6579a.a<String> f21472k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6579a.a<String> f21473l;

    /* JADX INFO: renamed from: m */
    public final AbstractC6579a.a<String> f21474m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC7116c<Map<String, VocabularySearchQuery>> f21475n;

    /* JADX INFO: renamed from: o */
    public final InterfaceC7116c<Map<Integer, Integer>> f21476o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<Map<String, String>> f21477p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC7116c<Map<Integer, LessonStudyBookmark>> f21478q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC7116c<Map<String, LibrarySearchQuery>> f21479r;

    /* JADX INFO: renamed from: s */
    public final UtilStoreImpl$special$$inlined$map$6 f21480s;

    /* JADX INFO: renamed from: t */
    public final InterfaceC7116c<Map<String, String>> f21481t;

    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<Map<String, DailyGoalMet>> f21482u;

    /* JADX INFO: renamed from: v */
    public final InterfaceC7116c<Map<String, String>> f21483v;

    /* JADX INFO: renamed from: w */
    public final InterfaceC7116c<Map<String, Integer>> f21484w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC7116c<Map<String, Integer>> f21485x;

    /* JADX WARN: Type inference failed for: r0v6, types: [com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6] */
    public UtilStoreImpl(C4955q c4955q, InterfaceC5687d interfaceC5687d, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC5687d, "dataStore");
        this.f21462a = c4955q;
        this.f21463b = interfaceC5687d;
        this.f21464c = C7499b.m14975y0("searchSettings_15");
        this.f21465d = C7499b.m14975y0("vocabularySearchQuery_2");
        this.f21466e = C7499b.m14975y0("audio_progress");
        this.f21467f = C7499b.m14975y0("selectedPlaylists");
        this.f21468g = C7499b.m14975y0("lessons_pages_2");
        this.f21469h = C7499b.m14975y0("lessonSortFilter");
        this.f21470i = C7499b.m14975y0("localePopularMeaningsForLanguage");
        this.f21471j = C7499b.m14975y0("dailyGoalMet2");
        this.f21472k = C7499b.m14975y0("streak_repair");
        this.f21473l = C7499b.m14975y0("unreadNotifications");
        this.f21474m = C7499b.m14975y0("vocabularyPagesCount");
        final InterfaceC7116c interfaceC7116cMo3005a = interfaceC5687d.mo3005a();
        this.f21475n = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends VocabularySearchQuery>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$1$2 */
            public static final class C33872<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21525a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21526b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$1$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21527d;

                    /* JADX INFO: renamed from: e */
                    public int f21528e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21527d = obj;
                        this.f21528e |= Integer.MIN_VALUE;
                        return C33872.this.mo1339r(null, this);
                    }
                }

                public C33872(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21525a = interfaceC7117d;
                    this.f21526b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21528e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21528e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21527d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21528e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21526b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, VocabularySearchQuery.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21465d);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21528e = 1;
                        if (this.f21525a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends VocabularySearchQuery>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a.mo9539a(new C33872(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a2 = interfaceC5687d.mo3005a();
        this.f21476o = C0062b.m307S0(new InterfaceC7116c<Map<Integer, ? extends Integer>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$2$2 */
            public static final class C33902<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21546a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21547b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$2$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21548d;

                    /* JADX INFO: renamed from: e */
                    public int f21549e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21548d = obj;
                        this.f21549e |= Integer.MIN_VALUE;
                        return C33902.this.mo1339r(null, this);
                    }
                }

                public C33902(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21546a = interfaceC7117d;
                    this.f21547b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21549e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21549e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21548d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21549e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21547b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, Integer.class, Integer.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21466e);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21549e = 1;
                        if (this.f21546a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<Integer, ? extends Integer>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a2.mo9539a(new C33902(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a3 = interfaceC5687d.mo3005a();
        this.f21477p = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends String>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$3

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$3$2 */
            public static final class C33912<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21553a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21554b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$3$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21555d;

                    /* JADX INFO: renamed from: e */
                    public int f21556e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21555d = obj;
                        this.f21556e |= Integer.MIN_VALUE;
                        return C33912.this.mo1339r(null, this);
                    }
                }

                public C33912(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21553a = interfaceC7117d;
                    this.f21554b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21556e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21556e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21555d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21556e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21554b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21467f);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21556e = 1;
                        if (this.f21553a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a3.mo9539a(new C33912(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a4 = interfaceC5687d.mo3005a();
        this.f21478q = C0062b.m307S0(new InterfaceC7116c<Map<Integer, ? extends LessonStudyBookmark>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$4

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$4$2 */
            public static final class C33922<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21560a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21561b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$4$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21562d;

                    /* JADX INFO: renamed from: e */
                    public int f21563e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21562d = obj;
                        this.f21563e |= Integer.MIN_VALUE;
                        return C33922.this.mo1339r(null, this);
                    }
                }

                public C33922(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21560a = interfaceC7117d;
                    this.f21561b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21563e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21563e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21562d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21563e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21561b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, Integer.class, LessonStudyBookmark.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21468g);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21563e = 1;
                        if (this.f21560a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<Integer, ? extends LessonStudyBookmark>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a4.mo9539a(new C33922(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a5 = interfaceC5687d.mo3005a();
        this.f21479r = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends LibrarySearchQuery>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$5

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$5$2 */
            public static final class C33932<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21567a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21568b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$5$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$5$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21569d;

                    /* JADX INFO: renamed from: e */
                    public int f21570e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21569d = obj;
                        this.f21570e |= Integer.MIN_VALUE;
                        return C33932.this.mo1339r(null, this);
                    }
                }

                public C33932(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21567a = interfaceC7117d;
                    this.f21568b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21570e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21570e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21569d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21570e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21568b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, LibrarySearchQuery.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21464c);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21570e = 1;
                        if (this.f21567a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends LibrarySearchQuery>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a5.mo9539a(new C33932(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a6 = interfaceC5687d.mo3005a();
        this.f21480s = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6$2 */
            public static final class C33942<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21574a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21575b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$6$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21576d;

                    /* JADX INFO: renamed from: e */
                    public int f21577e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21576d = obj;
                        this.f21577e |= Integer.MIN_VALUE;
                        return C33942.this.mo1339r(null, this);
                    }
                }

                public C33942(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21574a = interfaceC7117d;
                    this.f21575b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21577e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21577e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21576d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21577e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String key = (String) ((AbstractC6579a) obj).mo3050b(this.f21575b.f21469h);
                        if (key == null) {
                            key = LanguageProgressSort.AllTime.getKey();
                        }
                        anonymousClass1.f21577e = 1;
                        if (this.f21574a.mo1339r(key, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a6.mo9539a(new C33942(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a7 = interfaceC5687d.mo3005a();
        this.f21481t = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends String>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$7

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$7$2 */
            public static final class C33952<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21581a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21582b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$7$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$7$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21583d;

                    /* JADX INFO: renamed from: e */
                    public int f21584e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21583d = obj;
                        this.f21584e |= Integer.MIN_VALUE;
                        return C33952.this.mo1339r(null, this);
                    }
                }

                public C33952(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21581a = interfaceC7117d;
                    this.f21582b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21584e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21584e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21583d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21584e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21582b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21470i);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21584e = 1;
                        if (this.f21581a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a7.mo9539a(new C33952(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a8 = interfaceC5687d.mo3005a();
        this.f21482u = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends DailyGoalMet>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$8

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$8$2 */
            public static final class C33962<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21588a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21589b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$8$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$8$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21590d;

                    /* JADX INFO: renamed from: e */
                    public int f21591e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21590d = obj;
                        this.f21591e |= Integer.MIN_VALUE;
                        return C33962.this.mo1339r(null, this);
                    }
                }

                public C33962(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21588a = interfaceC7117d;
                    this.f21589b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21591e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21591e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21590d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21591e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21589b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, DailyGoalMet.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21471j);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21591e = 1;
                        if (this.f21588a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends DailyGoalMet>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a8.mo9539a(new C33962(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a9 = interfaceC5687d.mo3005a();
        this.f21483v = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends String>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$9

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$9$2 */
            public static final class C33972<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21595a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21596b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$9$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$9$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21597d;

                    /* JADX INFO: renamed from: e */
                    public int f21598e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21597d = obj;
                        this.f21598e |= Integer.MIN_VALUE;
                        return C33972.this.mo1339r(null, this);
                    }
                }

                public C33972(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21595a = interfaceC7117d;
                    this.f21596b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21598e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21598e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21597d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21598e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21596b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21472k);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21598e = 1;
                        if (this.f21595a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a9.mo9539a(new C33972(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a10 = interfaceC5687d.mo3005a();
        this.f21484w = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends Integer>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$10

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$10$2 */
            public static final class C33882<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21532a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21533b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$10$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$10$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21534d;

                    /* JADX INFO: renamed from: e */
                    public int f21535e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21534d = obj;
                        this.f21535e |= Integer.MIN_VALUE;
                        return C33882.this.mo1339r(null, this);
                    }
                }

                public C33882(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21532a = interfaceC7117d;
                    this.f21533b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21535e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21535e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21534d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21535e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21533b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, Integer.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21473l);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21535e = 1;
                        if (this.f21532a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends Integer>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a10.mo9539a(new C33882(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a11 = interfaceC5687d.mo3005a();
        this.f21485x = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends Integer>>() { // from class: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$11

            /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$11$2 */
            public static final class C33892<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21539a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ UtilStoreImpl f21540b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$11$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.UtilStoreImpl$special$$inlined$map$11$2", m19206f = "UtilStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21541d;

                    /* JADX INFO: renamed from: e */
                    public int f21542e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21541d = obj;
                        this.f21542e |= Integer.MIN_VALUE;
                        return C33892.this.mo1339r(null, this);
                    }
                }

                public C33892(InterfaceC7117d interfaceC7117d, UtilStoreImpl utilStoreImpl) {
                    this.f21539a = interfaceC7117d;
                    this.f21540b = utilStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21542e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21542e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21541d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21542e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        UtilStoreImpl utilStoreImpl = this.f21540b;
                        AbstractC4949k<T> abstractC4949kM10564b = utilStoreImpl.f21462a.m10564b(C9312p.m17659d(Map.class, String.class, Integer.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(utilStoreImpl.f21474m);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21542e = 1;
                        if (this.f21539a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends Integer>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a11.mo9539a(new C33892(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7116c<Map<String, String>> mo9677a() {
        return this.f21481t;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<Map<String, Integer>> mo9678b() {
        return this.f21484w;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: c */
    public final UtilStoreImpl$special$$inlined$map$6 mo9679c() {
        return this.f21480s;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: d */
    public final Object mo9680d(Map<String, String> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setPopularMeaningsLocaleForLanguage$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: e */
    public final Object mo9681e(Map<Integer, Integer> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setAudioProgress$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: f */
    public final InterfaceC7116c<Map<Integer, Integer>> mo9682f() {
        return this.f21476o;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x009f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: g */
    public final Object mo9683g(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        UtilStoreImpl$clearUtilStore$1 utilStoreImpl$clearUtilStore$1;
        UtilStoreImpl utilStoreImpl;
        Map<Integer, LessonStudyBookmark> mapM13459L0;
        Map<String, LibrarySearchQuery> mapM13459L1;
        Map<String, String> mapM13459L2;
        Object objM3054a;
        Map<String, String> mapM13459L3;
        Map mapM13459L4;
        if (interfaceC9968c instanceof UtilStoreImpl$clearUtilStore$1) {
            utilStoreImpl$clearUtilStore$1 = (UtilStoreImpl$clearUtilStore$1) interfaceC9968c;
            int i10 = utilStoreImpl$clearUtilStore$1.f21489g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                utilStoreImpl$clearUtilStore$1.f21489g = i10 - Integer.MIN_VALUE;
            } else {
                utilStoreImpl$clearUtilStore$1 = new UtilStoreImpl$clearUtilStore$1(this, interfaceC9968c);
            }
        } else {
            utilStoreImpl$clearUtilStore$1 = new UtilStoreImpl$clearUtilStore$1(this, interfaceC9968c);
        }
        Object obj = utilStoreImpl$clearUtilStore$1.f21487e;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (utilStoreImpl$clearUtilStore$1.f21489g) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C7499b.m14977z0(obj);
                Map<Integer, Integer> mapM13459L5 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = this;
                utilStoreImpl$clearUtilStore$1.f21489g = 1;
                if (mo9681e(mapM13459L5, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                utilStoreImpl = this;
                mapM13459L0 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 2;
                if (utilStoreImpl.mo9695s(mapM13459L0, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L1 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 3;
                if (utilStoreImpl.mo9696t(mapM13459L1, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L2 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 4;
                if (utilStoreImpl.mo9680d(mapM13459L2, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L6 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 5;
                utilStoreImpl.getClass();
                objM3054a = PreferencesKt.m3054a(utilStoreImpl.f21463b, new UtilStoreImpl$setDailyGoalMet$2(utilStoreImpl, mapM13459L6, null), utilStoreImpl$clearUtilStore$1);
                if (objM3054a != obj2) {
                    objM3054a = C9072e.f47360a;
                }
                if (objM3054a == obj2) {
                    return obj2;
                }
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L7 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                return utilStoreImpl.mo9684h(mapM13459L7, utilStoreImpl$clearUtilStore$1) == obj2 ? obj2 : C9072e.f47360a;
            case 1:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                mapM13459L0 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 2;
                if (utilStoreImpl.mo9695s(mapM13459L0, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L1 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 3;
                if (utilStoreImpl.mo9696t(mapM13459L1, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L2 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 4;
                if (utilStoreImpl.mo9680d(mapM13459L2, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L8 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 5;
                utilStoreImpl.getClass();
                objM3054a = PreferencesKt.m3054a(utilStoreImpl.f21463b, new UtilStoreImpl$setDailyGoalMet$2(utilStoreImpl, mapM13459L8, null), utilStoreImpl$clearUtilStore$1);
                if (objM3054a != obj2) {
                    objM3054a = C9072e.f47360a;
                }
                if (objM3054a == obj2) {
                    return obj2;
                }
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L9 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L9, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case 2:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                mapM13459L1 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 3;
                if (utilStoreImpl.mo9696t(mapM13459L1, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L2 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 4;
                if (utilStoreImpl.mo9680d(mapM13459L2, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L10 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 5;
                utilStoreImpl.getClass();
                objM3054a = PreferencesKt.m3054a(utilStoreImpl.f21463b, new UtilStoreImpl$setDailyGoalMet$2(utilStoreImpl, mapM13459L10, null), utilStoreImpl$clearUtilStore$1);
                if (objM3054a != obj2) {
                    objM3054a = C9072e.f47360a;
                }
                if (objM3054a == obj2) {
                    return obj2;
                }
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L11 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L11, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case 3:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                mapM13459L2 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 4;
                if (utilStoreImpl.mo9680d(mapM13459L2, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L12 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 5;
                utilStoreImpl.getClass();
                objM3054a = PreferencesKt.m3054a(utilStoreImpl.f21463b, new UtilStoreImpl$setDailyGoalMet$2(utilStoreImpl, mapM13459L12, null), utilStoreImpl$clearUtilStore$1);
                if (objM3054a != obj2) {
                    objM3054a = C9072e.f47360a;
                }
                if (objM3054a == obj2) {
                    return obj2;
                }
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L13 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L13, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case 4:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                Map mapM13459L14 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 5;
                utilStoreImpl.getClass();
                objM3054a = PreferencesKt.m3054a(utilStoreImpl.f21463b, new UtilStoreImpl$setDailyGoalMet$2(utilStoreImpl, mapM13459L14, null), utilStoreImpl$clearUtilStore$1);
                if (objM3054a != obj2) {
                    objM3054a = C9072e.f47360a;
                }
                if (objM3054a == obj2) {
                    return obj2;
                }
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L15 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L15, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case 5:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                mapM13459L3 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 6;
                if (utilStoreImpl.mo9693q(mapM13459L3, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L16 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L16, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                mapM13459L4 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = utilStoreImpl;
                utilStoreImpl$clearUtilStore$1.f21489g = 7;
                if (utilStoreImpl.mo9687k(mapM13459L4, utilStoreImpl$clearUtilStore$1) == obj2) {
                    return obj2;
                }
                Map mapM13459L17 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L17, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                utilStoreImpl = utilStoreImpl$clearUtilStore$1.f21486d;
                C7499b.m14977z0(obj);
                Map mapM13459L18 = C6753d.m13459L0();
                utilStoreImpl$clearUtilStore$1.f21486d = null;
                utilStoreImpl$clearUtilStore$1.f21489g = 8;
                if (utilStoreImpl.mo9684h(mapM13459L18, utilStoreImpl$clearUtilStore$1) == obj2) {
                }
            case 8:
                C7499b.m14977z0(obj);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: h */
    public final Object mo9684h(Map map, ContinuationImpl continuationImpl) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setVocabularyPagesCount$2(this, map, null), continuationImpl);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c<Map<String, VocabularySearchQuery>> mo9685i() {
        return this.f21475n;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: j */
    public final InterfaceC7116c<Map<String, Integer>> mo9686j() {
        return this.f21485x;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: k */
    public final Object mo9687k(Map map, ContinuationImpl continuationImpl) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setUnreadNotifications$2(this, map, null), continuationImpl);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: l */
    public final InterfaceC7116c<Map<String, LibrarySearchQuery>> mo9688l() {
        return this.f21479r;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: m */
    public final InterfaceC7116c<Map<Integer, LessonStudyBookmark>> mo9689m() {
        return this.f21478q;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: n */
    public final InterfaceC7116c<Map<String, String>> mo9690n() {
        return this.f21477p;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: o */
    public final Object mo9691o(LinkedHashMap linkedHashMap, ContinuationImpl continuationImpl) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setSelectedPlaylists$2(this, linkedHashMap, null), continuationImpl);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: p */
    public final InterfaceC7116c<Map<String, String>> mo9692p() {
        return this.f21483v;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: q */
    public final Object mo9693q(Map<String, String> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setStreakRepair$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: r */
    public final Object mo9694r(LinkedHashMap linkedHashMap, InterfaceC9968c interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setVocabularySearchQuery$2(this, linkedHashMap, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: s */
    public final Object mo9695s(Map<Integer, LessonStudyBookmark> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setLessonsPageBookmark$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: t */
    public final Object mo9696t(Map<String, LibrarySearchQuery> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setSearchQuery$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5182d
    /* JADX INFO: renamed from: u */
    public final Object mo9697u(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f21463b, new UtilStoreImpl$setLessonStatsSortInterval$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }
}
