package com.lingq.shared.storage;

import ae.C0062b;
import androidx.datastore.preferences.core.PreferencesKt;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import com.squareup.moshi.AbstractC4949k;
import com.squareup.moshi.C4955q;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import p076di.InterfaceC5179a;
import p129g3.InterfaceC5687d;
import p212k3.AbstractC6579a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tk.C9312p;

/* JADX INFO: loaded from: classes.dex */
public final class PreferenceStoreImpl implements InterfaceC5179a {

    /* JADX INFO: renamed from: A */
    public final AbstractC6579a.a<Boolean> f20721A;

    /* JADX INFO: renamed from: B */
    public final AbstractC6579a.a<Boolean> f20722B;

    /* JADX INFO: renamed from: C */
    public final AbstractC6579a.a<Set<String>> f20723C;

    /* JADX INFO: renamed from: D */
    public final AbstractC6579a.a<Boolean> f20724D;

    /* JADX INFO: renamed from: E */
    public final AbstractC6579a.a<Float> f20725E;

    /* JADX INFO: renamed from: F */
    public final PreferenceStoreImpl$special$$inlined$map$1 f20726F;

    /* JADX INFO: renamed from: G */
    public final PreferenceStoreImpl$special$$inlined$map$2 f20727G;

    /* JADX INFO: renamed from: H */
    public final PreferenceStoreImpl$special$$inlined$map$3 f20728H;

    /* JADX INFO: renamed from: I */
    public final PreferenceStoreImpl$special$$inlined$map$4 f20729I;

    /* JADX INFO: renamed from: J */
    public final PreferenceStoreImpl$special$$inlined$map$5 f20730J;

    /* JADX INFO: renamed from: K */
    public final PreferenceStoreImpl$special$$inlined$map$6 f20731K;

    /* JADX INFO: renamed from: L */
    public final PreferenceStoreImpl$special$$inlined$map$7 f20732L;

    /* JADX INFO: renamed from: M */
    public final PreferenceStoreImpl$special$$inlined$map$8 f20733M;

    /* JADX INFO: renamed from: N */
    public final InterfaceC7116c<Map<String, TextToSpeechVoice>> f20734N;

    /* JADX INFO: renamed from: O */
    public final InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> f20735O;

    /* JADX INFO: renamed from: P */
    public final PreferenceStoreImpl$special$$inlined$map$11 f20736P;

    /* JADX INFO: renamed from: Q */
    public final PreferenceStoreImpl$special$$inlined$map$12 f20737Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC7116c<Map<String, LessonFont>> f20738R;

    /* JADX INFO: renamed from: S */
    public final PreferenceStoreImpl$special$$inlined$map$14 f20739S;

    /* JADX INFO: renamed from: T */
    public final PreferenceStoreImpl$special$$inlined$map$15 f20740T;

    /* JADX INFO: renamed from: U */
    public final PreferenceStoreImpl$special$$inlined$map$16 f20741U;

    /* JADX INFO: renamed from: V */
    public final PreferenceStoreImpl$special$$inlined$map$17 f20742V;

    /* JADX INFO: renamed from: W */
    public final PreferenceStoreImpl$special$$inlined$map$18 f20743W;

    /* JADX INFO: renamed from: X */
    public final PreferenceStoreImpl$special$$inlined$map$19 f20744X;

    /* JADX INFO: renamed from: Y */
    public final PreferenceStoreImpl$special$$inlined$map$20 f20745Y;

    /* JADX INFO: renamed from: Z */
    public final PreferenceStoreImpl$special$$inlined$map$21 f20746Z;

    /* JADX INFO: renamed from: a */
    public final C4955q f20747a;

    /* JADX INFO: renamed from: a0 */
    public final PreferenceStoreImpl$special$$inlined$map$22 f20748a0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5687d<AbstractC6579a> f20749b;

    /* JADX INFO: renamed from: b0 */
    public final PreferenceStoreImpl$special$$inlined$map$23 f20750b0;

    /* JADX INFO: renamed from: c */
    public final AbstractC6579a.a<Boolean> f20751c;

    /* JADX INFO: renamed from: c0 */
    public final InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> f20752c0;

    /* JADX INFO: renamed from: d */
    public final AbstractC6579a.a<String> f20753d;

    /* JADX INFO: renamed from: d0 */
    public final PreferenceStoreImpl$special$$inlined$map$25 f20754d0;

    /* JADX INFO: renamed from: e */
    public final AbstractC6579a.a<String> f20755e;

    /* JADX INFO: renamed from: e0 */
    public final PreferenceStoreImpl$special$$inlined$map$26 f20756e0;

    /* JADX INFO: renamed from: f */
    public final AbstractC6579a.a<String> f20757f;

    /* JADX INFO: renamed from: f0 */
    public final PreferenceStoreImpl$special$$inlined$map$27 f20758f0;

    /* JADX INFO: renamed from: g */
    public final AbstractC6579a.a<Boolean> f20759g;

    /* JADX INFO: renamed from: g0 */
    public final PreferenceStoreImpl$special$$inlined$map$28 f20760g0;

    /* JADX INFO: renamed from: h */
    public final AbstractC6579a.a<Boolean> f20761h;

    /* JADX INFO: renamed from: h0 */
    public final PreferenceStoreImpl$special$$inlined$map$29 f20762h0;

    /* JADX INFO: renamed from: i */
    public final AbstractC6579a.a<Boolean> f20763i;

    /* JADX INFO: renamed from: j */
    public final AbstractC6579a.a<Boolean> f20764j;

    /* JADX INFO: renamed from: k */
    public final AbstractC6579a.a<String> f20765k;

    /* JADX INFO: renamed from: l */
    public final AbstractC6579a.a<String> f20766l;

    /* JADX INFO: renamed from: m */
    public final AbstractC6579a.a<Boolean> f20767m;

    /* JADX INFO: renamed from: n */
    public final AbstractC6579a.a<Boolean> f20768n;

    /* JADX INFO: renamed from: o */
    public final AbstractC6579a.a<String> f20769o;

    /* JADX INFO: renamed from: p */
    public final AbstractC6579a.a<String> f20770p;

    /* JADX INFO: renamed from: q */
    public final AbstractC6579a.a<String> f20771q;

    /* JADX INFO: renamed from: r */
    public final AbstractC6579a.a<Integer> f20772r;

    /* JADX INFO: renamed from: s */
    public final AbstractC6579a.a<Double> f20773s;

    /* JADX INFO: renamed from: t */
    public final AbstractC6579a.a<String> f20774t;

    /* JADX INFO: renamed from: u */
    public final AbstractC6579a.a<String> f20775u;

    /* JADX INFO: renamed from: v */
    public final AbstractC6579a.a<String> f20776v;

    /* JADX INFO: renamed from: w */
    public final AbstractC6579a.a<String> f20777w;

    /* JADX INFO: renamed from: x */
    public final AbstractC6579a.a<Boolean> f20778x;

    /* JADX INFO: renamed from: y */
    public final AbstractC6579a.a<Boolean> f20779y;

    /* JADX INFO: renamed from: z */
    public final AbstractC6579a.a<String> f20780z;

    /* JADX WARN: Type inference failed for: r0v10, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8] */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$12] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14] */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$15] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16] */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$18] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20] */
    /* JADX WARN: Type inference failed for: r0v24, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22] */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23] */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$5] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$29] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$25] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$26] */
    /* JADX WARN: Type inference failed for: r8v3, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$27] */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28] */
    public PreferenceStoreImpl(C4955q c4955q, InterfaceC5687d interfaceC5687d, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC5687d, "dataStore");
        this.f20747a = c4955q;
        this.f20749b = interfaceC5687d;
        this.f20751c = C7499b.m14938f("known_words_preference");
        this.f20753d = C7499b.m14975y0("theme");
        this.f20755e = C7499b.m14975y0("daily_goal_settings");
        this.f20757f = C7499b.m14975y0("interface_language");
        this.f20759g = C7499b.m14938f("download_mobile");
        this.f20761h = C7499b.m14938f("auto_tts_preference");
        this.f20763i = C7499b.m14938f("use_device_tts_preference");
        this.f20764j = C7499b.m14938f("use_web_voices_preference");
        this.f20765k = C7499b.m14975y0("tts_voice");
        this.f20766l = C7499b.m14975y0("local_tts_voice");
        this.f20767m = C7499b.m14938f("auto_lingq_creation");
        this.f20768n = C7499b.m14938f("status_bar_preference");
        this.f20769o = C7499b.m14975y0("lesson_font_preference_3");
        this.f20770p = C7499b.m14975y0("lesson_light_highlightstyle");
        this.f20771q = C7499b.m14975y0("lesson_dark_highlightstyle");
        this.f20772r = C7499b.m14922T("text_size_preference_2");
        this.f20773s = new AbstractC6579a.a<>("lesson_line_spacing");
        this.f20774t = C7499b.m14975y0("asian_chinese_type_preference");
        this.f20775u = C7499b.m14975y0("asian_japanese_type_preference");
        this.f20776v = C7499b.m14975y0("asian_chinese_traditional_type_preference");
        this.f20777w = C7499b.m14975y0("asian_cantonese_type_preference");
        this.f20778x = C7499b.m14938f("asian_show_spaces_preference");
        this.f20779y = C7499b.m14938f("disableDownloadsPlaylist");
        this.f20780z = C7499b.m14975y0("languageFeedLevels");
        this.f20721A = C7499b.m14938f("tapToPage_preference");
        this.f20722B = C7499b.m14938f("showStreakMilestones_preference");
        this.f20723C = new AbstractC6579a.a<>("topics_preference");
        this.f20724D = C7499b.m14938f("showVocabulary_preference");
        this.f20725E = new AbstractC6579a.a<>("playbackSpeed_preference");
        final InterfaceC7116c interfaceC7116cMo3005a = interfaceC5687d.mo3005a();
        this.f20726F = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1$2 */
            public static final class C33262<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20870a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20871b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20872d;

                    /* JADX INFO: renamed from: e */
                    public int f20873e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20872d = obj;
                        this.f20873e |= Integer.MIN_VALUE;
                        return C33262.this.mo1339r(null, this);
                    }
                }

                public C33262(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20870a = interfaceC7117d;
                    this.f20871b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20873e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20873e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20872d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20873e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20871b.f20751c);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f20873e = 1;
                        if (this.f20870a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a.mo9539a(new C33262(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a2 = interfaceC5687d.mo3005a();
        this.f20727G = new InterfaceC7116c<Theme>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$2

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$2$2 */
            public static final class C33372<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20947a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20948b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$2$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20949d;

                    /* JADX INFO: renamed from: e */
                    public int f20950e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20949d = obj;
                        this.f20950e |= Integer.MIN_VALUE;
                        return C33372.this.mo1339r(null, this);
                    }
                }

                public C33372(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20947a = interfaceC7117d;
                    this.f20948b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20950e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20950e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20949d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20950e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20948b.f20753d);
                        if (str == null) {
                            str = "System";
                        }
                        Theme themeValueOf = Theme.valueOf(str);
                        anonymousClass1.f20950e = 1;
                        if (this.f20947a.mo1339r(themeValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Theme> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a2.mo9539a(new C33372(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a3 = interfaceC5687d.mo3005a();
        this.f20728H = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3$2 */
            public static final class C33482<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21024a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21025b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21026d;

                    /* JADX INFO: renamed from: e */
                    public int f21027e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21026d = obj;
                        this.f21027e |= Integer.MIN_VALUE;
                        return C33482.this.mo1339r(null, this);
                    }
                }

                public C33482(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21024a = interfaceC7117d;
                    this.f21025b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21027e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21027e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21026d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21027e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f21025b.f20755e);
                        if (str == null) {
                            str = "";
                        }
                        anonymousClass1.f21027e = 1;
                        if (this.f21024a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a3.mo9539a(new C33482(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a4 = interfaceC5687d.mo3005a();
        this.f20729I = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4$2 */
            public static final class C33492<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21031a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21032b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$4$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21033d;

                    /* JADX INFO: renamed from: e */
                    public int f21034e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21033d = obj;
                        this.f21034e |= Integer.MIN_VALUE;
                        return C33492.this.mo1339r(null, this);
                    }
                }

                public C33492(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21031a = interfaceC7117d;
                    this.f21032b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21034e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21034e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21033d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21034e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String language = (String) ((AbstractC6579a) obj).mo3050b(this.f21032b.f20757f);
                        if (language == null) {
                            language = Locale.getDefault().getLanguage();
                        }
                        anonymousClass1.f21034e = 1;
                        if (this.f21031a.mo1339r(language, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a4.mo9539a(new C33492(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a5 = interfaceC5687d.mo3005a();
        this.f20730J = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$5

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$5$2 */
            public static final class C33502<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21038a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21039b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$5$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$5$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21040d;

                    /* JADX INFO: renamed from: e */
                    public int f21041e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21040d = obj;
                        this.f21041e |= Integer.MIN_VALUE;
                        return C33502.this.mo1339r(null, this);
                    }
                }

                public C33502(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21038a = interfaceC7117d;
                    this.f21039b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21041e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21041e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21040d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21041e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f21039b.f20759g);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.f21041e = 1;
                        if (this.f21038a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a5.mo9539a(new C33502(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a6 = interfaceC5687d.mo3005a();
        this.f20731K = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6$2 */
            public static final class C33512<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21045a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21046b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$6$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21047d;

                    /* JADX INFO: renamed from: e */
                    public int f21048e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21047d = obj;
                        this.f21048e |= Integer.MIN_VALUE;
                        return C33512.this.mo1339r(null, this);
                    }
                }

                public C33512(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21045a = interfaceC7117d;
                    this.f21046b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21048e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21048e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21047d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21048e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f21046b.f20761h);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f21048e = 1;
                        if (this.f21045a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a6.mo9539a(new C33512(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a7 = interfaceC5687d.mo3005a();
        this.f20732L = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7$2 */
            public static final class C33522<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21052a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21053b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$7$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21054d;

                    /* JADX INFO: renamed from: e */
                    public int f21055e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21054d = obj;
                        this.f21055e |= Integer.MIN_VALUE;
                        return C33522.this.mo1339r(null, this);
                    }
                }

                public C33522(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21052a = interfaceC7117d;
                    this.f21053b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21055e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21055e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21054d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21055e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f21053b.f20763i);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f21055e = 1;
                        if (this.f21052a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a7.mo9539a(new C33522(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a8 = interfaceC5687d.mo3005a();
        this.f20733M = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8$2 */
            public static final class C33532<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21059a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21060b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$8$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21061d;

                    /* JADX INFO: renamed from: e */
                    public int f21062e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21061d = obj;
                        this.f21062e |= Integer.MIN_VALUE;
                        return C33532.this.mo1339r(null, this);
                    }
                }

                public C33532(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21059a = interfaceC7117d;
                    this.f21060b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21062e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21062e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21061d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21062e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f21060b.f20764j);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f21062e = 1;
                        if (this.f21059a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a8.mo9539a(new C33532(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a9 = interfaceC5687d.mo3005a();
        this.f20734N = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends TextToSpeechVoice>>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$9

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$9$2 */
            public static final class C33542<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21066a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21067b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$9$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$9$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21068d;

                    /* JADX INFO: renamed from: e */
                    public int f21069e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21068d = obj;
                        this.f21069e |= Integer.MIN_VALUE;
                        return C33542.this.mo1339r(null, this);
                    }
                }

                public C33542(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21066a = interfaceC7117d;
                    this.f21067b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0014  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21069e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21069e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21068d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21069e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        PreferenceStoreImpl preferenceStoreImpl = this.f21067b;
                        AbstractC4949k<T> abstractC4949kM10564b = preferenceStoreImpl.f20747a.m10564b(C9312p.m17659d(Map.class, String.class, TextToSpeechVoice.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(preferenceStoreImpl.f20765k);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f21069e = 1;
                        if (this.f21066a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends TextToSpeechVoice>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a9.mo9539a(new C33542(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a10 = interfaceC5687d.mo3005a();
        this.f20735O = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends LocalTextToSpeechVoice>>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$10

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$10$2 */
            public static final class C33272<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20877a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20878b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$10$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$10$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20879d;

                    /* JADX INFO: renamed from: e */
                    public int f20880e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20879d = obj;
                        this.f20880e |= Integer.MIN_VALUE;
                        return C33272.this.mo1339r(null, this);
                    }
                }

                public C33272(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20877a = interfaceC7117d;
                    this.f20878b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0015  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20880e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20880e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20879d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20880e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        PreferenceStoreImpl preferenceStoreImpl = this.f20878b;
                        AbstractC4949k<T> abstractC4949kM10564b = preferenceStoreImpl.f20747a.m10564b(C9312p.m17659d(Map.class, String.class, LocalTextToSpeechVoice.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(preferenceStoreImpl.f20766l);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f20880e = 1;
                        if (this.f20877a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends LocalTextToSpeechVoice>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a10.mo9539a(new C33272(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a11 = interfaceC5687d.mo3005a();
        this.f20736P = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11$2 */
            public static final class C33282<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20884a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20885b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$11$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20886d;

                    /* JADX INFO: renamed from: e */
                    public int f20887e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20886d = obj;
                        this.f20887e |= Integer.MIN_VALUE;
                        return C33282.this.mo1339r(null, this);
                    }
                }

                public C33282(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20884a = interfaceC7117d;
                    this.f20885b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20887e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20887e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20886d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20887e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20885b.f20767m);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f20887e = 1;
                        if (this.f20884a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a11.mo9539a(new C33282(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a12 = interfaceC5687d.mo3005a();
        this.f20737Q = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$12

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$12$2 */
            public static final class C33292<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20891a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20892b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$12$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$12$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20893d;

                    /* JADX INFO: renamed from: e */
                    public int f20894e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20893d = obj;
                        this.f20894e |= Integer.MIN_VALUE;
                        return C33292.this.mo1339r(null, this);
                    }
                }

                public C33292(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20891a = interfaceC7117d;
                    this.f20892b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20894e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20894e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20893d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20894e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20892b.f20768n);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.f20894e = 1;
                        if (this.f20891a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a12.mo9539a(new C33292(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a13 = interfaceC5687d.mo3005a();
        this.f20738R = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends LessonFont>>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$13

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$13$2 */
            public static final class C33302<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20898a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20899b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$13$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$13$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20900d;

                    /* JADX INFO: renamed from: e */
                    public int f20901e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20900d = obj;
                        this.f20901e |= Integer.MIN_VALUE;
                        return C33302.this.mo1339r(null, this);
                    }
                }

                public C33302(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20898a = interfaceC7117d;
                    this.f20899b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20901e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20901e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20900d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20901e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        PreferenceStoreImpl preferenceStoreImpl = this.f20899b;
                        AbstractC4949k<T> abstractC4949kM10564b = preferenceStoreImpl.f20747a.m10564b(C9312p.m17659d(Map.class, String.class, String.class));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(preferenceStoreImpl.f20769o);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        ArrayList arrayList = new ArrayList(mapM13459L0.size());
                        for (Map.Entry entry : mapM13459L0.entrySet()) {
                            Object key = entry.getKey();
                            LessonFont.Companion companion = LessonFont.INSTANCE;
                            String str2 = (String) entry.getValue();
                            companion.getClass();
                            arrayList.add(new Pair(key, LessonFont.Companion.m9552b(str2)));
                        }
                        Map mapM13464Q0 = C6753d.m13464Q0(arrayList);
                        anonymousClass1.f20901e = 1;
                        if (this.f20898a.mo1339r(mapM13464Q0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends LessonFont>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a13.mo9539a(new C33302(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a14 = interfaceC5687d.mo3005a();
        this.f20739S = new InterfaceC7116c<LessonHighlightStyle>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14$2 */
            public static final class C33312<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20905a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20906b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20907d;

                    /* JADX INFO: renamed from: e */
                    public int f20908e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20907d = obj;
                        this.f20908e |= Integer.MIN_VALUE;
                        return C33312.this.mo1339r(null, this);
                    }
                }

                public C33312(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20905a = interfaceC7117d;
                    this.f20906b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20908e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20908e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20907d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20908e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20906b.f20770p);
                        if (str == null) {
                            str = "Default";
                        }
                        LessonHighlightStyle lessonHighlightStyleValueOf = LessonHighlightStyle.valueOf(str);
                        anonymousClass1.f20908e = 1;
                        if (this.f20905a.mo1339r(lessonHighlightStyleValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super LessonHighlightStyle> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a14.mo9539a(new C33312(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a15 = interfaceC5687d.mo3005a();
        this.f20740T = new InterfaceC7116c<LessonHighlightStyle>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$15

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$15$2 */
            public static final class C33322<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20912a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20913b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$15$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$15$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20914d;

                    /* JADX INFO: renamed from: e */
                    public int f20915e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20914d = obj;
                        this.f20915e |= Integer.MIN_VALUE;
                        return C33322.this.mo1339r(null, this);
                    }
                }

                public C33322(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20912a = interfaceC7117d;
                    this.f20913b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001b  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20915e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20915e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20914d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20915e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20913b.f20771q);
                        if (str == null) {
                            str = "Default";
                        }
                        LessonHighlightStyle lessonHighlightStyleValueOf = LessonHighlightStyle.valueOf(str);
                        anonymousClass1.f20915e = 1;
                        if (this.f20912a.mo1339r(lessonHighlightStyleValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super LessonHighlightStyle> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a15.mo9539a(new C33322(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a16 = interfaceC5687d.mo3005a();
        this.f20741U = new InterfaceC7116c<Integer>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16$2 */
            public static final class C33332<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20919a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20920b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$16$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20921d;

                    /* JADX INFO: renamed from: e */
                    public int f20922e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20921d = obj;
                        this.f20922e |= Integer.MIN_VALUE;
                        return C33332.this.mo1339r(null, this);
                    }
                }

                public C33332(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20919a = interfaceC7117d;
                    this.f20920b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20922e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20922e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20921d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20922e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Integer num = (Integer) ((AbstractC6579a) obj).mo3050b(this.f20920b.f20772r);
                        Integer num2 = new Integer(num != null ? num.intValue() : 20);
                        anonymousClass1.f20922e = 1;
                        if (this.f20919a.mo1339r(num2, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a16.mo9539a(new C33332(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a17 = interfaceC5687d.mo3005a();
        this.f20742V = new InterfaceC7116c<Double>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17$2 */
            public static final class C33342<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20926a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20927b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$17$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20928d;

                    /* JADX INFO: renamed from: e */
                    public int f20929e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20928d = obj;
                        this.f20929e |= Integer.MIN_VALUE;
                        return C33342.this.mo1339r(null, this);
                    }
                }

                public C33342(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20926a = interfaceC7117d;
                    this.f20927b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20929e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20929e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20928d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20929e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Double d10 = (Double) ((AbstractC6579a) obj).mo3050b(this.f20927b.f20773s);
                        Double d11 = new Double(d10 != null ? d10.doubleValue() : 1.25d);
                        anonymousClass1.f20929e = 1;
                        if (this.f20926a.mo1339r(d11, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Double> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a17.mo9539a(new C33342(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a18 = interfaceC5687d.mo3005a();
        this.f20743W = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$18

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$18$2 */
            public static final class C33352<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20933a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20934b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$18$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$18$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20935d;

                    /* JADX INFO: renamed from: e */
                    public int f20936e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20935d = obj;
                        this.f20936e |= Integer.MIN_VALUE;
                        return C33352.this.mo1339r(null, this);
                    }
                }

                public C33352(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20933a = interfaceC7117d;
                    this.f20934b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20936e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20936e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20935d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20936e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20934b.f20778x);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.f20936e = 1;
                        if (this.f20933a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a18.mo9539a(new C33352(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a19 = interfaceC5687d.mo3005a();
        this.f20744X = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19$2 */
            public static final class C33362<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20940a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20941b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$19$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20942d;

                    /* JADX INFO: renamed from: e */
                    public int f20943e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20942d = obj;
                        this.f20943e |= Integer.MIN_VALUE;
                        return C33362.this.mo1339r(null, this);
                    }
                }

                public C33362(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20940a = interfaceC7117d;
                    this.f20941b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0019  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20943e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20943e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20942d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20943e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20941b.f20774t);
                        if (str == null) {
                            str = "Pinyin";
                        }
                        anonymousClass1.f20943e = 1;
                        if (this.f20940a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a19.mo9539a(new C33362(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a20 = interfaceC5687d.mo3005a();
        this.f20745Y = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20$2 */
            public static final class C33382<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20954a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20955b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$20$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20956d;

                    /* JADX INFO: renamed from: e */
                    public int f20957e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20956d = obj;
                        this.f20957e |= Integer.MIN_VALUE;
                        return C33382.this.mo1339r(null, this);
                    }
                }

                public C33382(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20954a = interfaceC7117d;
                    this.f20955b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20957e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20957e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20956d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20957e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20955b.f20775u);
                        if (str == null) {
                            str = "Romaji";
                        }
                        anonymousClass1.f20957e = 1;
                        if (this.f20954a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a20.mo9539a(new C33382(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a21 = interfaceC5687d.mo3005a();
        this.f20746Z = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21$2 */
            public static final class C33392<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20961a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20962b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$21$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20963d;

                    /* JADX INFO: renamed from: e */
                    public int f20964e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20963d = obj;
                        this.f20964e |= Integer.MIN_VALUE;
                        return C33392.this.mo1339r(null, this);
                    }
                }

                public C33392(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20961a = interfaceC7117d;
                    this.f20962b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20964e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20964e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20963d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20964e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20962b.f20776v);
                        if (str == null) {
                            str = "Pinyin";
                        }
                        anonymousClass1.f20964e = 1;
                        if (this.f20961a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a21.mo9539a(new C33392(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a22 = interfaceC5687d.mo3005a();
        this.f20748a0 = new InterfaceC7116c<String>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22$2 */
            public static final class C33402<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20968a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20969b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$22$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20970d;

                    /* JADX INFO: renamed from: e */
                    public int f20971e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20970d = obj;
                        this.f20971e |= Integer.MIN_VALUE;
                        return C33402.this.mo1339r(null, this);
                    }
                }

                public C33402(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20968a = interfaceC7117d;
                    this.f20969b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20971e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20971e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20970d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20971e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        String str = (String) ((AbstractC6579a) obj).mo3050b(this.f20969b.f20777w);
                        if (str == null) {
                            str = "Jyutping";
                        }
                        anonymousClass1.f20971e = 1;
                        if (this.f20968a.mo1339r(str, anonymousClass1) == coroutineSingletons) {
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
                Object objMo9539a = interfaceC7116cMo3005a22.mo9539a(new C33402(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a23 = interfaceC5687d.mo3005a();
        this.f20750b0 = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23$2 */
            public static final class C33412<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20975a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20976b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$23$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20977d;

                    /* JADX INFO: renamed from: e */
                    public int f20978e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20977d = obj;
                        this.f20978e |= Integer.MIN_VALUE;
                        return C33412.this.mo1339r(null, this);
                    }
                }

                public C33412(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20975a = interfaceC7117d;
                    this.f20976b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20978e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20978e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20977d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20978e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20976b.f20779y);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.f20978e = 1;
                        if (this.f20975a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a23.mo9539a(new C33412(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a24 = interfaceC5687d.mo3005a();
        this.f20752c0 = C0062b.m307S0(new InterfaceC7116c<Map<String, ? extends Map<LearningLevel, Boolean>>>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$24

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$24$2 */
            public static final class C33422<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20982a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20983b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$24$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$24$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20984d;

                    /* JADX INFO: renamed from: e */
                    public int f20985e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20984d = obj;
                        this.f20985e |= Integer.MIN_VALUE;
                        return C33422.this.mo1339r(null, this);
                    }
                }

                public C33422(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20982a = interfaceC7117d;
                    this.f20983b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20985e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20985e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20984d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20985e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        PreferenceStoreImpl preferenceStoreImpl = this.f20983b;
                        AbstractC4949k<T> abstractC4949kM10564b = preferenceStoreImpl.f20747a.m10564b(C9312p.m17659d(Map.class, String.class, C9312p.m17659d(Map.class, LearningLevel.class, Boolean.class)));
                        String str = (String) ((AbstractC6579a) obj).mo3050b(preferenceStoreImpl.f20780z);
                        if (str == null) {
                            str = "{}";
                        }
                        Map mapM13459L0 = (Map) abstractC4949kM10564b.m10532b(str);
                        if (mapM13459L0 == null) {
                            mapM13459L0 = C6753d.m13459L0();
                        }
                        anonymousClass1.f20985e = 1;
                        if (this.f20982a.mo1339r(mapM13459L0, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Map<String, ? extends Map<LearningLevel, Boolean>>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a24.mo9539a(new C33422(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        }, executorC7177a);
        final InterfaceC7116c interfaceC7116cMo3005a25 = interfaceC5687d.mo3005a();
        this.f20754d0 = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$25

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$25$2 */
            public static final class C33432<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20989a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20990b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$25$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$25$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20991d;

                    /* JADX INFO: renamed from: e */
                    public int f20992e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20991d = obj;
                        this.f20992e |= Integer.MIN_VALUE;
                        return C33432.this.mo1339r(null, this);
                    }
                }

                public C33432(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20989a = interfaceC7117d;
                    this.f20990b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20992e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20992e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20991d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20992e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20990b.f20721A);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : false);
                        anonymousClass1.f20992e = 1;
                        if (this.f20989a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a25.mo9539a(new C33432(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a26 = interfaceC5687d.mo3005a();
        this.f20756e0 = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$26

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$26$2 */
            public static final class C33442<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f20996a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f20997b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$26$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$26$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f20998d;

                    /* JADX INFO: renamed from: e */
                    public int f20999e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f20998d = obj;
                        this.f20999e |= Integer.MIN_VALUE;
                        return C33442.this.mo1339r(null, this);
                    }
                }

                public C33442(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f20996a = interfaceC7117d;
                    this.f20997b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x001a  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f20999e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f20999e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f20998d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f20999e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f20997b.f20722B);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f20999e = 1;
                        if (this.f20996a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a26.mo9539a(new C33442(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a27 = interfaceC5687d.mo3005a();
        this.f20758f0 = new InterfaceC7116c<Set<? extends String>>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$27

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$27$2 */
            public static final class C33452<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21003a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21004b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$27$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$27$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21005d;

                    /* JADX INFO: renamed from: e */
                    public int f21006e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21005d = obj;
                        this.f21006e |= Integer.MIN_VALUE;
                        return C33452.this.mo1339r(null, this);
                    }
                }

                public C33452(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21003a = interfaceC7117d;
                    this.f21004b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21006e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21006e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21005d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21006e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Collection collection = (Set) ((AbstractC6579a) obj).mo3050b(this.f21004b.f20723C);
                        if (collection == null) {
                            collection = EmptySet.f38034a;
                        }
                        anonymousClass1.f21006e = 1;
                        if (this.f21003a.mo1339r(collection, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Set<? extends String>> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a27.mo9539a(new C33452(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a28 = interfaceC5687d.mo3005a();
        this.f20760g0 = new InterfaceC7116c<Boolean>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28$2 */
            public static final class C33462<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21010a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21011b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$28$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21012d;

                    /* JADX INFO: renamed from: e */
                    public int f21013e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21012d = obj;
                        this.f21013e |= Integer.MIN_VALUE;
                        return C33462.this.mo1339r(null, this);
                    }
                }

                public C33462(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21010a = interfaceC7117d;
                    this.f21011b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0018  */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21013e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21013e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21012d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21013e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Boolean bool = (Boolean) ((AbstractC6579a) obj).mo3050b(this.f21011b.f20724D);
                        Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                        anonymousClass1.f21013e = 1;
                        if (this.f21010a.mo1339r(boolValueOf, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Boolean> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a28.mo9539a(new C33462(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
        final InterfaceC7116c interfaceC7116cMo3005a29 = interfaceC5687d.mo3005a();
        this.f20762h0 = new InterfaceC7116c<Float>() { // from class: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$29

            /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$29$2 */
            public static final class C33472<T> implements InterfaceC7117d {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ InterfaceC7117d f21017a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ PreferenceStoreImpl f21018b;

                /* JADX INFO: renamed from: com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$29$2$1, reason: invalid class name */
                @Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
                @InterfaceC10224c(m19205c = "com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$29$2", m19206f = "PreferenceStore.kt", m19207l = {223}, m19208m = "emit")
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: d */
                    public /* synthetic */ Object f21019d;

                    /* JADX INFO: renamed from: e */
                    public int f21020e;

                    public AnonymousClass1(InterfaceC9968c interfaceC9968c) {
                        super(interfaceC9968c);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /* JADX INFO: renamed from: x */
                    public final Object mo1338x(Object obj) {
                        this.f21019d = obj;
                        this.f21020e |= Integer.MIN_VALUE;
                        return C33472.this.mo1339r(null, this);
                    }
                }

                public C33472(InterfaceC7117d interfaceC7117d, PreferenceStoreImpl preferenceStoreImpl) {
                    this.f21017a = interfaceC7117d;
                    this.f21018b = preferenceStoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0016  */
                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlinx.coroutines.flow.InterfaceC7117d
                /* JADX INFO: renamed from: r */
                public final Object mo1339r(Object obj, InterfaceC9968c interfaceC9968c) throws Throwable {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC9968c instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC9968c;
                        int i10 = anonymousClass1.f21020e;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f21020e = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                    }
                    Object obj2 = anonymousClass1.f21019d;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = anonymousClass1.f21020e;
                    if (i11 == 0) {
                        C7499b.m14977z0(obj2);
                        Float f3 = (Float) ((AbstractC6579a) obj).mo3050b(this.f21018b.f20725E);
                        Float f10 = new Float(f3 != null ? f3.floatValue() : 1.0f);
                        anonymousClass1.f21020e = 1;
                        if (this.f21017a.mo1339r(f10, anonymousClass1) == coroutineSingletons) {
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
            public final Object mo9539a(InterfaceC7117d<? super Float> interfaceC7117d, InterfaceC9968c interfaceC9968c) {
                Object objMo9539a = interfaceC7116cMo3005a29.mo9539a(new C33472(interfaceC7117d, this), interfaceC9968c);
                return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
            }
        };
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: A */
    public final PreferenceStoreImpl$special$$inlined$map$15 mo9554A() {
        return this.f20740T;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: B */
    public final PreferenceStoreImpl$special$$inlined$map$22 mo9555B() {
        return this.f20748a0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: C */
    public final Object mo9556C(Set set, ContinuationImpl continuationImpl) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setTopics$2(this, set, null), continuationImpl);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: D */
    public final Object mo9557D(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setUseWebVoices$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: E */
    public final Object mo9558E(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setMandarinScript$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: F */
    public final Object mo9559F(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setJapaneseScript$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: G */
    public final Object mo9560G(float f3, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setPlaybackSpeed$2(this, f3, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: H */
    public final Object mo9561H(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setCantoneseScript$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: I */
    public final InterfaceC7116c<Map<String, TextToSpeechVoice>> mo9562I() {
        return this.f20734N;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: J */
    public final PreferenceStoreImpl$special$$inlined$map$25 mo9563J() {
        return this.f20754d0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: K */
    public final Object mo9564K(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setDailyGoal$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: L */
    public final PreferenceStoreImpl$special$$inlined$map$19 mo9565L() {
        return this.f20744X;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: M */
    public final Object mo9566M(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setInterfaceLanguage$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: N */
    public final PreferenceStoreImpl$special$$inlined$map$5 mo9567N() {
        return this.f20730J;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: O */
    public final Object mo9568O(LinkedHashMap linkedHashMap, InterfaceC9968c interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLessonFont$2(this, linkedHashMap, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: P */
    public final Object mo9569P(Map<String, ? extends Map<LearningLevel, Boolean>> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLanguageFeedLevels$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: Q */
    public final PreferenceStoreImpl$special$$inlined$map$12 mo9570Q() {
        return this.f20737Q;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: R */
    public final Object mo9571R(LessonHighlightStyle lessonHighlightStyle, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLessonDarkHighlightStyle$2(this, lessonHighlightStyle, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: S */
    public final Object mo9572S(double d10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLessonLineSpacing$2(this, d10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: T */
    public final Object mo9573T(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setUseDeviceTts$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: U */
    public final PreferenceStoreImpl$special$$inlined$map$28 mo9574U() {
        return this.f20760g0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: V */
    public final Object mo9575V(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setTapToPage$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: W */
    public final Object mo9576W(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setMoveBlueWordsToKnown$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: X */
    public final Object mo9577X(Theme theme, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setTheme$2(this, theme, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: Y */
    public final PreferenceStoreImpl$special$$inlined$map$23 mo9578Y() {
        return this.f20750b0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: Z */
    public final PreferenceStoreImpl$special$$inlined$map$7 mo9579Z() {
        return this.f20732L;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: a */
    public final PreferenceStoreImpl$special$$inlined$map$1 mo9580a() {
        return this.f20726F;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: a0 */
    public final PreferenceStoreImpl$special$$inlined$map$17 mo9581a0() {
        return this.f20742V;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: b */
    public final PreferenceStoreImpl$special$$inlined$map$27 mo9582b() {
        return this.f20758f0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: b0 */
    public final PreferenceStoreImpl$special$$inlined$map$8 mo9583b0() {
        return this.f20733M;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: c */
    public final Object mo9584c(LessonHighlightStyle lessonHighlightStyle, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLessonLightHighlightStyle$2(this, lessonHighlightStyle, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: c0 */
    public final PreferenceStoreImpl$special$$inlined$map$2 mo9585c0() {
        return this.f20727G;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: d */
    public final PreferenceStoreImpl$special$$inlined$map$21 mo9586d() {
        return this.f20746Z;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: d0 */
    public final PreferenceStoreImpl$special$$inlined$map$4 mo9587d0() {
        return this.f20729I;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: e */
    public final PreferenceStoreImpl$special$$inlined$map$18 mo9588e() {
        return this.f20743W;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: e0 */
    public final Object mo9589e0(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setShowSpacesBetweenWords$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: f */
    public final Object mo9590f(Map<String, TextToSpeechVoice> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setTTSVoice$2(this, map, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: f0 */
    public final PreferenceStoreImpl$special$$inlined$map$20 mo9591f0() {
        return this.f20745Y;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: g */
    public final Object mo9592g(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setShowStreakMilestones$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: h */
    public final PreferenceStoreImpl$special$$inlined$map$29 mo9593h() {
        return this.f20762h0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: i */
    public final InterfaceC7116c<Map<String, Map<LearningLevel, Boolean>>> mo9594i() {
        return this.f20752c0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: j */
    public final InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> mo9595j() {
        return this.f20735O;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: k */
    public final PreferenceStoreImpl$special$$inlined$map$14 mo9596k() {
        return this.f20739S;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: l */
    public final PreferenceStoreImpl$special$$inlined$map$3 mo9597l() {
        return this.f20728H;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: m */
    public final InterfaceC7116c<Map<String, LessonFont>> mo9598m() {
        return this.f20738R;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: n */
    public final Object mo9599n(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLessonFontSize$2(this, i10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: o */
    public final Object mo9600o(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setStatusBar$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: p */
    public final Object mo9601p(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setShowVocabulary$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: q */
    public final PreferenceStoreImpl$special$$inlined$map$16 mo9602q() {
        return this.f20741U;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: r */
    public final PreferenceStoreImpl$special$$inlined$map$11 mo9603r() {
        return this.f20736P;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: s */
    public final PreferenceStoreImpl$special$$inlined$map$6 mo9604s() {
        return this.f20731K;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: t */
    public final Object mo9605t(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setAutoTTS$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: u */
    public final PreferenceStoreImpl$special$$inlined$map$26 mo9606u() {
        return this.f20756e0;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: v */
    public final Object mo9607v(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setAutoLingQCreation$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: w */
    public final Object mo9608w(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setDisableDownloadsPlaylist$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: x */
    public final Object mo9609x(boolean z10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setDownloadOnMobile$2(this, z10, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: y */
    public final Object mo9610y(LinkedHashMap linkedHashMap, InterfaceC9968c interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setLocalTTSVoice$2(this, linkedHashMap, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }

    @Override // p076di.InterfaceC5179a
    /* JADX INFO: renamed from: z */
    public final Object mo9611z(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objM3054a = PreferencesKt.m3054a(this.f20749b, new PreferenceStoreImpl$setChineseTraditionalScript$2(this, str, null), interfaceC9968c);
        return objM3054a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM3054a : C9072e.f47360a;
    }
}
