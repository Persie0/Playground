package com.lingq.p055ui.settings;

import ae.C0062b;
import android.content.Context;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2012e;
import ci.InterfaceC2015h;
import ci.InterfaceC2020m;
import ci.InterfaceC2024q;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.download.AbstractC3312a;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$3;
import com.lingq.shared.storage.Theme;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7789p;
import p338qd.C8573r0;
import p416uh.InterfaceC9529c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/settings/SettingsSelectionViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Luh/c;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class SettingsSelectionViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC9529c {

    /* JADX INFO: renamed from: H */
    public final CoroutineDispatcher f31053H;

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ InterfaceC0113j f31054I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ InterfaceC9529c f31055J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f31056K;

    /* JADX INFO: renamed from: L */
    public final C7135p f31057L;

    /* JADX INFO: renamed from: M */
    public final C7135p f31058M;

    /* JADX INFO: renamed from: N */
    public final C7135p f31059N;

    /* JADX INFO: renamed from: O */
    public final C7135p f31060O;

    /* JADX INFO: renamed from: P */
    public final C7135p f31061P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f31062Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f31063R;

    /* JADX INFO: renamed from: S */
    public final StateFlowImpl f31064S;

    /* JADX INFO: renamed from: T */
    public final C7135p f31065T;

    /* JADX INFO: renamed from: U */
    public final StateFlowImpl f31066U;

    /* JADX INFO: renamed from: V */
    public final StateFlowImpl f31067V;

    /* JADX INFO: renamed from: W */
    public final StateFlowImpl f31068W;

    /* JADX INFO: renamed from: X */
    public final C7135p f31069X;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f31070d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2012e f31071e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2015h f31072f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2024q f31073g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC3275c f31074h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5179a f31075i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5180b f31076j;

    /* JADX INFO: renamed from: k */
    public final Context f31077k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC7882z f31078l;

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {476}, m19208m = "invokeSuspend")
    final class C47771 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31079e;

        /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "dictionaries", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$1$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f31081e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ SettingsSelectionViewModel f31082f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31082f = settingsSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31082f, interfaceC9968c);
                anonymousClass1.f31081e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends UserDictionaryLocale> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f31081e;
                if (list != null) {
                    this.f31082f.f31064S.setValue(list);
                }
                return C9072e.f47360a;
            }
        }

        public C47771(InterfaceC9968c<? super C47771> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SettingsSelectionViewModel.this.new C47771(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47771) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31079e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SettingsSelectionViewModel settingsSelectionViewModel = SettingsSelectionViewModel.this;
                C7135p c7135p = settingsSelectionViewModel.f31065T;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(settingsSelectionViewModel, null);
                this.f31079e = 1;
                if (C0062b.m369m0(c7135p, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$2", m19206f = "SettingsSelectionViewModel.kt", m19207l = {488}, m19208m = "invokeSuspend")
    final class C47782 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f31083e;

        /* JADX INFO: renamed from: com.lingq.ui.settings.SettingsSelectionViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/download/a;", "Lcom/lingq/shared/storage/LessonFont;", "state", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.settings.SettingsSelectionViewModel$2$1", m19206f = "SettingsSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<AbstractC3312a<? extends LessonFont>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f31085e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ SettingsSelectionViewModel f31086f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SettingsSelectionViewModel settingsSelectionViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f31086f = settingsSelectionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f31086f, interfaceC9968c);
                anonymousClass1.f31085e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(AbstractC3312a<? extends LessonFont> abstractC3312a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(abstractC3312a, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                AbstractC3312a abstractC3312a = (AbstractC3312a) this.f31085e;
                boolean z10 = abstractC3312a instanceof AbstractC3312a.a;
                SettingsSelectionViewModel settingsSelectionViewModel = this.f31086f;
                if (z10) {
                    settingsSelectionViewModel.f31067V.setValue(new Pair(((AbstractC3312a.a) abstractC3312a).f17996a, new Integer(100)));
                } else if (abstractC3312a instanceof AbstractC3312a.c) {
                    AbstractC3312a.c cVar = (AbstractC3312a.c) abstractC3312a;
                    settingsSelectionViewModel.f31067V.setValue(new Pair(cVar.f18000a, new Integer(cVar.f18001b)));
                } else if (abstractC3312a instanceof AbstractC3312a.b) {
                    settingsSelectionViewModel.f31067V.setValue(new Pair(((AbstractC3312a.b) abstractC3312a).f17999a, new Integer(-1)));
                }
                return C9072e.f47360a;
            }
        }

        public C47782(InterfaceC9968c<? super C47782> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return SettingsSelectionViewModel.this.new C47782(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C47782) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f31083e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                SettingsSelectionViewModel settingsSelectionViewModel = SettingsSelectionViewModel.this;
                InterfaceC7137r<AbstractC3312a<LessonFont>> interfaceC7137rMo9447C0 = settingsSelectionViewModel.mo9447C0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(settingsSelectionViewModel, null);
                this.f31083e = 1;
                if (C0062b.m369m0(interfaceC7137rMo9447C0, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:73:0x014f  */
    public SettingsSelectionViewModel(InterfaceC2020m interfaceC2020m, InterfaceC2012e interfaceC2012e, InterfaceC2015h interfaceC2015h, InterfaceC2024q interfaceC2024q, InterfaceC3275c interfaceC3275c, InterfaceC5179a interfaceC5179a, InterfaceC5180b interfaceC5180b, Context context, InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a, C1024c0 c1024c0, InterfaceC0113j interfaceC0113j, InterfaceC9529c interfaceC9529c) {
        int i10;
        C7135p c7135pM353h2;
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2012e, "languageRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC7882z, "applicationScope");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC9529c, "fontDownloadManagerDelegate");
        this.f31070d = interfaceC2020m;
        this.f31071e = interfaceC2012e;
        this.f31072f = interfaceC2015h;
        this.f31073g = interfaceC2024q;
        this.f31074h = interfaceC3275c;
        this.f31075i = interfaceC5179a;
        this.f31076j = interfaceC5180b;
        this.f31077k = context;
        this.f31078l = interfaceC7882z;
        this.f31053H = executorC7177a;
        this.f31054I = interfaceC0113j;
        this.f31055J = interfaceC9529c;
        Integer num = (Integer) c1024c0.m3929b("viewKey");
        ViewKeys viewKeys = ViewKeys.DailyGoal;
        int iOrdinal = viewKeys.ordinal();
        if (num != null && num.intValue() == iOrdinal) {
            i10 = R.string.lingq_daily_goal;
        } else {
            int iOrdinal2 = ViewKeys.InterfaceLanguage.ordinal();
            if (num != null && num.intValue() == iOrdinal2) {
                i10 = R.string.settings_interface_language;
            } else {
                int iOrdinal3 = ViewKeys.AddDictionaryLanguage.ordinal();
                if (num != null && num.intValue() == iOrdinal3) {
                    i10 = R.string.settings_dictionary_languages;
                } else {
                    int iOrdinal4 = ViewKeys.ChineseType.ordinal();
                    if (num != null && num.intValue() == iOrdinal4) {
                        i10 = R.string.settings_transliteration_style;
                    } else {
                        int iOrdinal5 = ViewKeys.ChineseTraditionType.ordinal();
                        if (num != null && num.intValue() == iOrdinal5) {
                            i10 = R.string.settings_transliteration_style;
                        } else {
                            int iOrdinal6 = ViewKeys.JapaneseType.ordinal();
                            if (num != null && num.intValue() == iOrdinal6) {
                                i10 = R.string.settings_transliteration_style;
                            } else {
                                int iOrdinal7 = ViewKeys.CantoneseType.ordinal();
                                if (num != null && num.intValue() == iOrdinal7) {
                                    i10 = R.string.settings_transliteration_style;
                                } else {
                                    int iOrdinal8 = ViewKeys.LessonFont.ordinal();
                                    if (num != null && num.intValue() == iOrdinal8) {
                                        i10 = R.string.settings_style;
                                    } else {
                                        int iOrdinal9 = ViewKeys.Theme.ordinal();
                                        if (num != null && num.intValue() == iOrdinal9) {
                                            i10 = R.string.settings_theme;
                                        } else {
                                            int iOrdinal10 = ViewKeys.TTSVoice.ordinal();
                                            if (num != null && num.intValue() == iOrdinal10) {
                                                i10 = R.string.settings_text_to_speech_settings;
                                            } else {
                                                int iOrdinal11 = ViewKeys.LessonLightHighlight.ordinal();
                                                if (num != null && num.intValue() == iOrdinal11) {
                                                    i10 = R.string.settings_highlight_style;
                                                } else {
                                                    int iOrdinal12 = ViewKeys.LessonDarkHighlight.ordinal();
                                                    if (num != null && num.intValue() == iOrdinal12) {
                                                        i10 = R.string.settings_highlight_style;
                                                    } else {
                                                        i10 = (num != null && num.intValue() == ViewKeys.Topics.ordinal()) ? R.string.settings_preferred_topics : R.string.placeholder;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f31056K = C7120g.m14379a(Integer.valueOf(i10));
        PreferenceStoreImpl$special$$inlined$map$3 preferenceStoreImpl$special$$inlined$map$3Mo9597l = interfaceC5179a.mo9597l();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        C7135p c7135pM353h3 = C0062b.m353h2(preferenceStoreImpl$special$$inlined$map$3Mo9597l, interfaceC7882zM16767w0, startedWhileSubscribed, "");
        C7135p c7135pM353h4 = C0062b.m353h2(interfaceC5179a.mo9582b(), C8573r0.m16767w0(this), startedWhileSubscribed, EmptySet.f38034a);
        this.f31057L = c7135pM353h4;
        C7135p c7135pM353h5 = C0062b.m353h2(interfaceC5180b.mo9619h(), C8573r0.m16767w0(this), startedWhileSubscribed, new Profile(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null));
        this.f31058M = c7135pM353h5;
        C7135p c7135pM353h6 = C0062b.m353h2(interfaceC5179a.mo9587d0(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f31059N = c7135pM353h6;
        C7135p c7135pM353h7 = C0062b.m353h2(interfaceC5179a.mo9565L(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f31060O = c7135pM353h7;
        C7135p c7135pM353h8 = C0062b.m353h2(interfaceC5179a.mo9586d(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f31061P = c7135pM353h8;
        C7135p c7135pM353h9 = C0062b.m353h2(interfaceC5179a.mo9591f0(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        C7135p c7135pM353h10 = C0062b.m353h2(interfaceC5179a.mo9555B(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f31062Q = c7135pM353h10;
        C7135p c7135pM353h11 = C0062b.m353h2(interfaceC5179a.mo9562I(), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7135p c7135pM353h12 = C0062b.m353h2(interfaceC5179a.mo9595j(), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        C7135p c7135pM353h13 = C0062b.m353h2(interfaceC5179a.mo9583b0(), C8573r0.m16767w0(this), startedWhileSubscribed, Boolean.TRUE);
        this.f31063R = c7135pM353h13;
        InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m = interfaceC5179a.mo9598m();
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        String strMo498E1 = mo498E1();
        LessonFont.Companion companion = LessonFont.INSTANCE;
        String strMo498E2 = mo498E1();
        companion.getClass();
        C7135p c7135pM353h14 = C0062b.m353h2(interfaceC7116cMo9598m, interfaceC7882zM16767w1, startedWhileSubscribed, C7499b.m14943h0(new Pair(strMo498E1, LessonFont.Companion.m9551a(strMo498E2))));
        PreferenceStoreImpl$special$$inlined$map$14 preferenceStoreImpl$special$$inlined$map$14Mo9596k = interfaceC5179a.mo9596k();
        InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(this);
        LessonHighlightStyle lessonHighlightStyle = LessonHighlightStyle.Default;
        C7135p c7135pM353h15 = C0062b.m353h2(preferenceStoreImpl$special$$inlined$map$14Mo9596k, interfaceC7882zM16767w2, startedWhileSubscribed, lessonHighlightStyle);
        C7135p c7135pM353h16 = C0062b.m353h2(interfaceC5179a.mo9554A(), C8573r0.m16767w0(this), startedWhileSubscribed, lessonHighlightStyle);
        C7135p c7135pM353h17 = C0062b.m353h2(interfaceC5179a.mo9585c0(), C8573r0.m16767w0(this), startedWhileSubscribed, Theme.System);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f31064S = stateFlowImplM14379a;
        this.f31065T = C0062b.m353h2(new C7131l(mo509w0(), c7135pM353h5, new SettingsSelectionViewModel$_userDictionaryLocales$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f31066U = stateFlowImplM14379a2;
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(null);
        this.f31067V = stateFlowImplM14379a3;
        this.f31068W = C7120g.m14379a(emptyList);
        int iOrdinal13 = viewKeys.ordinal();
        if (num != null && num.intValue() == iOrdinal13) {
            c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h3, new SettingsSelectionViewModel$selectionItems$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        } else {
            int iOrdinal14 = ViewKeys.InterfaceLanguage.ordinal();
            if (num != null && num.intValue() == iOrdinal14) {
                c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h6, new SettingsSelectionViewModel$selectionItems$2(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
            } else {
                int iOrdinal15 = ViewKeys.AddDictionaryLanguage.ordinal();
                if (num != null && num.intValue() == iOrdinal15) {
                    c7135pM353h2 = C0062b.m353h2(new C7131l(stateFlowImplM14379a, c7135pM353h5, new SettingsSelectionViewModel$selectionItems$3(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                } else {
                    int iOrdinal16 = ViewKeys.ChineseType.ordinal();
                    if (num != null && num.intValue() == iOrdinal16) {
                        c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h7, new SettingsSelectionViewModel$selectionItems$4(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                    } else {
                        int iOrdinal17 = ViewKeys.ChineseTraditionType.ordinal();
                        if (num != null && num.intValue() == iOrdinal17) {
                            c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h8, new SettingsSelectionViewModel$selectionItems$5(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                        } else {
                            int iOrdinal18 = ViewKeys.JapaneseType.ordinal();
                            if (num != null && num.intValue() == iOrdinal18) {
                                c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h9, new SettingsSelectionViewModel$selectionItems$6(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                            } else {
                                int iOrdinal19 = ViewKeys.CantoneseType.ordinal();
                                if (num != null && num.intValue() == iOrdinal19) {
                                    c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h10, new SettingsSelectionViewModel$selectionItems$7(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                } else {
                                    int iOrdinal20 = ViewKeys.TTSVoice.ordinal();
                                    if (num != null && num.intValue() == iOrdinal20) {
                                        c7135pM353h2 = C0062b.m353h2(C0062b.m381p0(stateFlowImplM14379a2, c7135pM353h11, c7135pM353h12, c7135pM353h13, new SettingsSelectionViewModel$selectionItems$8(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                    } else {
                                        int iOrdinal21 = ViewKeys.LessonFont.ordinal();
                                        if (num != null && num.intValue() == iOrdinal21) {
                                            c7135pM353h2 = C0062b.m353h2(new C7131l(c7135pM353h14, stateFlowImplM14379a3, new SettingsSelectionViewModel$selectionItems$9(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                        } else {
                                            int iOrdinal22 = ViewKeys.Theme.ordinal();
                                            if (num != null && num.intValue() == iOrdinal22) {
                                                c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h17, new SettingsSelectionViewModel$selectionItems$10(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                            } else {
                                                int iOrdinal23 = ViewKeys.LessonLightHighlight.ordinal();
                                                if (num != null && num.intValue() == iOrdinal23) {
                                                    c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h15, new SettingsSelectionViewModel$selectionItems$11(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                                } else {
                                                    int iOrdinal24 = ViewKeys.LessonDarkHighlight.ordinal();
                                                    if (num != null && num.intValue() == iOrdinal24) {
                                                        c7135pM353h2 = C0062b.m353h2(C0062b.m399t2(c7135pM353h16, new SettingsSelectionViewModel$selectionItems$12(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
                                                    } else {
                                                        c7135pM353h2 = (num != null && num.intValue() == ViewKeys.Topics.ordinal()) ? C0062b.m353h2(C0062b.m399t2(c7135pM353h4, new SettingsSelectionViewModel$selectionItems$13(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList) : C0062b.m306S(C7120g.m14379a(emptyList));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.f31069X = c7135pM353h2;
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C47771(null), 3);
        int iOrdinal25 = ViewKeys.TTSVoice.ordinal();
        if (num != null && num.intValue() == iOrdinal25) {
            C7828f.m15570d(C8573r0.m16767w0(this), executorC7177a, null, new SettingsSelectionViewModel$observeTTSVoices$1(this, null), 2);
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C47782(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f31054I.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31054I.mo497B0(interfaceC9968c);
    }

    @Override // p416uh.InterfaceC9529c
    /* JADX INFO: renamed from: C0 */
    public final InterfaceC7137r<AbstractC3312a<LessonFont>> mo9447C0() {
        return this.f31055J.mo9447C0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f31054I.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31054I.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f31054I.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31054I.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f31054I;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31054I.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f31054I.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31054I.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f31054I.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10358l2(Context context, AbstractC7789p abstractC7789p) {
        AbstractC7789p cVar;
        C7828f.m15570d(this.f31078l, this.f31053H, null, new SettingsSelectionViewModel$updateSetting$1(abstractC7789p, this, mo498E1(), context, null), 2);
        StateFlowImpl stateFlowImpl = this.f31068W;
        List<AbstractC7789p> list = (List) stateFlowImpl.getValue();
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        for (AbstractC7789p abstractC7789p2 : list) {
            if (abstractC7789p2 instanceof AbstractC7789p.d) {
                cVar = new AbstractC7789p.d(((AbstractC7789p.d) abstractC7789p2).f42813e);
            } else if (abstractC7789p2 instanceof AbstractC7789p.b) {
                cVar = new AbstractC7789p.b(abstractC7789p2.f42796a, abstractC7789p2.f42797b, abstractC7789p2.f42798c, abstractC7789p2.f42799d);
            } else if (abstractC7789p2 instanceof AbstractC7789p.a) {
                cVar = new AbstractC7789p.a(abstractC7789p2.f42796a, 0, abstractC7789p2.f42797b, abstractC7789p2.f42798c, abstractC7789p2.f42799d);
            } else if (abstractC7789p2 instanceof AbstractC7789p.e) {
                cVar = new AbstractC7789p.e(abstractC7789p2.f42796a, abstractC7789p2.f42798c, abstractC7789p2.f42799d, ((AbstractC7789p.e) abstractC7789p2).f42817h);
            } else {
                if (!(abstractC7789p2 instanceof AbstractC7789p.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                int i10 = abstractC7789p2.f42796a;
                AbstractC7789p.c cVar2 = (AbstractC7789p.c) abstractC7789p2;
                cVar = new AbstractC7789p.c(i10, cVar2.f42811f, cVar2.f42812g);
            }
            boolean z10 = cVar.f42799d;
            String str = abstractC7789p.f42797b;
            String str2 = cVar.f42797b;
            if (z10 && !C5207g.m11106a(str2, str)) {
                cVar.f42799d = false;
            } else if (C5207g.m11106a(str2, str)) {
                cVar.f42799d = true;
            }
            arrayList.add(cVar);
        }
        stateFlowImpl.setValue(arrayList);
    }

    @Override // p416uh.InterfaceC9529c
    /* JADX INFO: renamed from: n0 */
    public final Object mo9448n0(LessonFont lessonFont, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f31055J.mo9448n0(lessonFont, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f31054I.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f31054I.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f31054I.mo509w0();
    }
}
