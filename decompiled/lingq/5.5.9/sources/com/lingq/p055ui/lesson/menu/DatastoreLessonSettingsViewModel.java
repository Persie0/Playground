package com.lingq.p055ui.lesson.menu;

import ae.C0062b;
import android.content.Context;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2015h;
import ci.InterfaceC2020m;
import ci.InterfaceC2024q;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.commons.controllers.InterfaceC3275c;
import com.lingq.commons.p053ui.ViewKeys;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.storage.LessonFont;
import com.lingq.shared.storage.LessonHighlightStyle;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$1;
import com.lingq.shared.storage.PreferenceStoreImpl$special$$inlined$map$14;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$1;
import com.lingq.shared.uimodel.LanguageLearn;
import com.lingq.shared.uimodel.LanguageLearnBeta;
import com.lingq.shared.uimodel.LocalTextToSpeechVoice;
import com.lingq.shared.uimodel.TextToSpeechVoice;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.flow.internal.C7127c;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p076di.InterfaceC5180b;
import p096ei.C5408a;
import p225kk.C6715l;
import p260m8.C7499b;
import p278nh.AbstractC7787n;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m13365d2 = {"Lcom/lingq/ui/lesson/menu/DatastoreLessonSettingsViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class DatastoreLessonSettingsViewModel extends AbstractC1036h0 implements InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f28153H;

    /* JADX INFO: renamed from: I */
    public final C7135p f28154I;

    /* JADX INFO: renamed from: J */
    public final C7135p f28155J;

    /* JADX INFO: renamed from: K */
    public final C7135p f28156K;

    /* JADX INFO: renamed from: L */
    public final C7135p f28157L;

    /* JADX INFO: renamed from: M */
    public final C7135p f28158M;

    /* JADX INFO: renamed from: N */
    public final C7135p f28159N;

    /* JADX INFO: renamed from: O */
    public final C7135p f28160O;

    /* JADX INFO: renamed from: P */
    public final C7135p f28161P;

    /* JADX INFO: renamed from: Q */
    public final C7135p f28162Q;

    /* JADX INFO: renamed from: R */
    public final C7135p f28163R;

    /* JADX INFO: renamed from: S */
    public final C7135p f28164S;

    /* JADX INFO: renamed from: T */
    public final C7135p f28165T;

    /* JADX INFO: renamed from: U */
    public final C7135p f28166U;

    /* JADX INFO: renamed from: V */
    public final C7135p f28167V;

    /* JADX INFO: renamed from: W */
    public final C7135p f28168W;

    /* JADX INFO: renamed from: X */
    public final C7135p f28169X;

    /* JADX INFO: renamed from: Y */
    public final C7135p f28170Y;

    /* JADX INFO: renamed from: Z */
    public final C7135p f28171Z;

    /* JADX INFO: renamed from: a0 */
    public final C7135p f28172a0;

    /* JADX INFO: renamed from: b0 */
    public final C7135p f28173b0;

    /* JADX INFO: renamed from: c0 */
    public final StateFlowImpl f28174c0;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2020m f28175d;

    /* JADX INFO: renamed from: d0 */
    public final StateFlowImpl f28176d0;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2015h f28177e;

    /* JADX INFO: renamed from: e0 */
    public final StateFlowImpl f28178e0;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2024q f28179f;

    /* JADX INFO: renamed from: f0 */
    public final C7135p f28180f0;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5179a f28181g;

    /* JADX INFO: renamed from: g0 */
    public final C7135p f28182g0;

    /* JADX INFO: renamed from: h */
    public final InterfaceC5180b f28183h;

    /* JADX INFO: renamed from: h0 */
    public final C7138s f28184h0;

    /* JADX INFO: renamed from: i */
    public final InterfaceC3275c f28185i;

    /* JADX INFO: renamed from: i0 */
    public final C7134o f28186i0;

    /* JADX INFO: renamed from: j */
    public final C7796d f28187j;

    /* JADX INFO: renamed from: k */
    public final CoroutineDispatcher f28188k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC0113j f28189l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {250}, m19208m = "invokeSuspend")
    final class C43171 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28190e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/language/UserDictionaryLocale;", "dictionaries", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$1$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends UserDictionaryLocale>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28192e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ DatastoreLessonSettingsViewModel f28193f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28193f = datastoreLessonSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28193f, interfaceC9968c);
                anonymousClass1.f28192e = obj;
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
                List list = (List) this.f28192e;
                if (list != null) {
                    this.f28193f.f28174c0.setValue(list);
                }
                return C9072e.f47360a;
            }
        }

        public C43171(InterfaceC9968c<? super C43171> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DatastoreLessonSettingsViewModel.this.new C43171(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43171) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28190e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = DatastoreLessonSettingsViewModel.this;
                C7135p c7135p = datastoreLessonSettingsViewModel.f28182g0;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(datastoreLessonSettingsViewModel, null);
                this.f28190e = 1;
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$2", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {258}, m19208m = "invokeSuspend")
    final class C43182 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28194e;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ Context f28196g;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Profile;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$2$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Profile, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f28197e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ DatastoreLessonSettingsViewModel f28198f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ Context f28199g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, Context context, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28198f = datastoreLessonSettingsViewModel;
                this.f28199g = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28198f, this.f28199g, interfaceC9968c);
                anonymousClass1.f28197e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(profile, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List<String> list = ((Profile) this.f28197e).f17798r;
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28198f;
                datastoreLessonSettingsViewModel.getClass();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new AbstractC7787n.b(R.string.settings_dictionary_languages));
                for (String str : list) {
                    arrayList.add(new AbstractC7787n.l(C4924a.m10439R(this.f28199g, str), ViewKeys.DictionaryLocale.ordinal(), str));
                    arrayList.add(AbstractC7787n.d.f42747a);
                }
                arrayList.add(new AbstractC7787n.n(R.string.settings_add_dictionary_language, R.string.settings_dictionary_languages_explanation, ViewKeys.AddDictionaryLanguage.ordinal(), null, null, 56));
                datastoreLessonSettingsViewModel.f28178e0.setValue(arrayList);
                return C9072e.f47360a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43182(Context context, InterfaceC9968c<? super C43182> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28196g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DatastoreLessonSettingsViewModel.this.new C43182(this.f28196g, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43182) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28194e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = DatastoreLessonSettingsViewModel.this;
                ProfileStoreImpl$special$$inlined$map$1 profileStoreImpl$special$$inlined$map$1Mo9619h = datastoreLessonSettingsViewModel.f28183h.mo9619h();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(datastoreLessonSettingsViewModel, this.f28196g, null);
                this.f28194e = 1;
                if (C0062b.m369m0(profileStoreImpl$special$$inlined$map$1Mo9619h, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$3", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {264}, m19208m = "invokeSuspend")
    final class C43193 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28200e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/TextToSpeechVoice;", "voice", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$3$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {266, 268, 270}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends TextToSpeechVoice>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public TextToSpeechVoice f28202e;

            /* JADX INFO: renamed from: f */
            public int f28203f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Object f28204g;

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ DatastoreLessonSettingsViewModel f28205h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28205h = datastoreLessonSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28205h, interfaceC9968c);
                anonymousClass1.f28204g = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends TextToSpeechVoice> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0062  */
            /* JADX WARN: Code duplicated, block: B:23:0x0074  */
            /* JADX WARN: Code duplicated, block: B:27:0x0097 A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                TextToSpeechVoice textToSpeechVoice;
                LinkedHashMap linkedHashMapM13467T0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f28203f;
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28205h;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    if (((Map) this.f28204g).get(datastoreLessonSettingsViewModel.mo498E1()) == null) {
                        String strMo498E1 = datastoreLessonSettingsViewModel.mo498E1();
                        this.f28203f = 1;
                        obj = datastoreLessonSettingsViewModel.f28179f.mo6174e(strMo498E1, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        textToSpeechVoice = (TextToSpeechVoice) obj;
                        if (textToSpeechVoice != null) {
                            InterfaceC7116c<Map<String, TextToSpeechVoice>> interfaceC7116cMo9562I = datastoreLessonSettingsViewModel.f28181g.mo9562I();
                            this.f28204g = datastoreLessonSettingsViewModel;
                            this.f28202e = textToSpeechVoice;
                            this.f28203f = 2;
                            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9562I, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                            linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), textToSpeechVoice);
                            this.f28204g = null;
                            this.f28202e = null;
                            this.f28203f = 3;
                            if (datastoreLessonSettingsViewModel.f28181g.mo9590f(linkedHashMapM13467T0, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else if (i10 == 1) {
                    C7499b.m14977z0(obj);
                    textToSpeechVoice = (TextToSpeechVoice) obj;
                    if (textToSpeechVoice != null) {
                        InterfaceC7116c<Map<String, TextToSpeechVoice>> interfaceC7116cMo9562I2 = datastoreLessonSettingsViewModel.f28181g.mo9562I();
                        this.f28204g = datastoreLessonSettingsViewModel;
                        this.f28202e = textToSpeechVoice;
                        this.f28203f = 2;
                        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9562I2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                        linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), textToSpeechVoice);
                        this.f28204g = null;
                        this.f28202e = null;
                        this.f28203f = 3;
                        if (datastoreLessonSettingsViewModel.f28181g.mo9590f(linkedHashMapM13467T0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i10 == 2) {
                    textToSpeechVoice = this.f28202e;
                    datastoreLessonSettingsViewModel = (DatastoreLessonSettingsViewModel) this.f28204g;
                    C7499b.m14977z0(obj);
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                    linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), textToSpeechVoice);
                    this.f28204g = null;
                    this.f28202e = null;
                    this.f28203f = 3;
                    if (datastoreLessonSettingsViewModel.f28181g.mo9590f(linkedHashMapM13467T0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
        }

        public C43193(InterfaceC9968c<? super C43193> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DatastoreLessonSettingsViewModel.this.new C43193(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43193) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28200e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = DatastoreLessonSettingsViewModel.this;
                InterfaceC7116c<Map<String, TextToSpeechVoice>> interfaceC7116cMo9562I = datastoreLessonSettingsViewModel.f28181g.mo9562I();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(datastoreLessonSettingsViewModel, null);
                this.f28200e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9562I, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$4 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$4", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {277}, m19208m = "invokeSuspend")
    final class C43204 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28206e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$4$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/uimodel/LocalTextToSpeechVoice;", "voice", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$4$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {279, 281, 283, 285}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends LocalTextToSpeechVoice>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public int f28208e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Object f28209f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ DatastoreLessonSettingsViewModel f28210g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28210g = datastoreLessonSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28210g, interfaceC9968c);
                anonymousClass1.f28209f = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(Map<String, ? extends LocalTextToSpeechVoice> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0072  */
            /* JADX WARN: Code duplicated, block: B:28:0x0087 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:29:0x0088  */
            /* JADX WARN: Code duplicated, block: B:32:0x00aa A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
            /* JADX WARN: Code duplicated, block: B:35:0x00b6 A[RETURN] */
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                LocalTextToSpeechVoice localTextToSpeechVoice;
                InterfaceC5179a interfaceC5179a;
                LinkedHashMap linkedHashMapM13467T0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.f28208e;
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28210g;
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    if (((Map) this.f28209f).get(datastoreLessonSettingsViewModel.mo498E1()) == null) {
                        String strMo498E1 = datastoreLessonSettingsViewModel.mo498E1();
                        this.f28208e = 1;
                        obj = datastoreLessonSettingsViewModel.f28185i.mo9342h0(strMo498E1, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        localTextToSpeechVoice = (LocalTextToSpeechVoice) C6752c.m13425S((List) obj);
                        if (localTextToSpeechVoice != null) {
                            InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> interfaceC7116cMo9595j = datastoreLessonSettingsViewModel.f28181g.mo9595j();
                            this.f28209f = localTextToSpeechVoice;
                            this.f28208e = 2;
                            obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9595j, this);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                            linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), localTextToSpeechVoice);
                            this.f28209f = null;
                            this.f28208e = 3;
                            if (datastoreLessonSettingsViewModel.f28181g.mo9610y(linkedHashMapM13467T0, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
                            this.f28208e = 4;
                            if (interfaceC5179a.mo9557D(true, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                } else if (i10 == 1) {
                    C7499b.m14977z0(obj);
                    localTextToSpeechVoice = (LocalTextToSpeechVoice) C6752c.m13425S((List) obj);
                    if (localTextToSpeechVoice != null) {
                        InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> interfaceC7116cMo9595j2 = datastoreLessonSettingsViewModel.f28181g.mo9595j();
                        this.f28209f = localTextToSpeechVoice;
                        this.f28208e = 2;
                        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9595j2, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                        linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), localTextToSpeechVoice);
                        this.f28209f = null;
                        this.f28208e = 3;
                        if (datastoreLessonSettingsViewModel.f28181g.mo9610y(linkedHashMapM13467T0, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        interfaceC5179a = datastoreLessonSettingsViewModel.f28181g;
                        this.f28208e = 4;
                        if (interfaceC5179a.mo9557D(true, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (i10 == 2) {
                    localTextToSpeechVoice = (LocalTextToSpeechVoice) this.f28209f;
                    C7499b.m14977z0(obj);
                    linkedHashMapM13467T0 = C6753d.m13467T0((Map) obj);
                    linkedHashMapM13467T0.put(datastoreLessonSettingsViewModel.mo498E1(), localTextToSpeechVoice);
                    this.f28209f = null;
                    this.f28208e = 3;
                    if (datastoreLessonSettingsViewModel.f28181g.mo9610y(linkedHashMapM13467T0, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 3 && i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
        }

        public C43204(InterfaceC9968c<? super C43204> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DatastoreLessonSettingsViewModel.this.new C43204(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43204) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28206e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = DatastoreLessonSettingsViewModel.this;
                InterfaceC7116c<Map<String, LocalTextToSpeechVoice>> interfaceC7116cMo9595j = datastoreLessonSettingsViewModel.f28181g.mo9595j();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(datastoreLessonSettingsViewModel, null);
                this.f28206e = 1;
                if (C0062b.m369m0(interfaceC7116cMo9595j, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {300}, m19208m = "invokeSuspend")
    final class C43215 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28211e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000(\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u008a@"}, m13365d2 = {"", "", "Lcom/lingq/shared/storage/LessonFont;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "Lcom/lingq/shared/storage/LessonHighlightStyle;", "<anonymous parameter 3>", "<anonymous parameter 4>", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5$1", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2060t<Map<String, ? extends LessonFont>, Integer, Double, LessonHighlightStyle, LessonHighlightStyle, InterfaceC9968c<? super C9072e>, Object> {
            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(6, interfaceC9968c);
            }

            @Override // cm.InterfaceC2060t
            /* JADX INFO: renamed from: g0 */
            public final Object mo1858g0(Map<String, ? extends LessonFont> map, Integer num, Double d10, LessonHighlightStyle lessonHighlightStyle, LessonHighlightStyle lessonHighlightStyle2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                num.intValue();
                d10.doubleValue();
                return new AnonymousClass1(interfaceC9968c).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$5$2", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ DatastoreLessonSettingsViewModel f28213e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f28213e = datastoreLessonSettingsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass2(this.f28213e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                C7138s c7138s = this.f28213e.f28184h0;
                C9072e c9072e = C9072e.f47360a;
                c7138s.mo14371k(c9072e);
                return c9072e;
            }
        }

        public C43215(InterfaceC9968c<? super C43215> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return DatastoreLessonSettingsViewModel.this.new C43215(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43215) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28211e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = DatastoreLessonSettingsViewModel.this;
                C7135p c7135p = datastoreLessonSettingsViewModel.f28163R;
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new InterfaceC7116c[]{c7135p, datastoreLessonSettingsViewModel.f28166U, datastoreLessonSettingsViewModel.f28167V, datastoreLessonSettingsViewModel.f28164S, datastoreLessonSettingsViewModel.f28165T}, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(datastoreLessonSettingsViewModel, null);
                this.f28211e = 1;
                if (C0062b.m369m0(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3, anonymousClass2, this) == coroutineSingletons) {
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

    public DatastoreLessonSettingsViewModel(InterfaceC2020m interfaceC2020m, InterfaceC2015h interfaceC2015h, InterfaceC2024q interfaceC2024q, InterfaceC5179a interfaceC5179a, InterfaceC5180b interfaceC5180b, InterfaceC3275c interfaceC3275c, C7796d c7796d, Context context, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2020m, "profileRepository");
        C5207g.m11111f(interfaceC2015h, "localeRepository");
        C5207g.m11111f(interfaceC2024q, "ttsRepository");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC5180b, "profileStore");
        C5207g.m11111f(interfaceC3275c, "ttsController");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f28175d = interfaceC2020m;
        this.f28177e = interfaceC2015h;
        this.f28179f = interfaceC2024q;
        this.f28181g = interfaceC5179a;
        this.f28183h = interfaceC5180b;
        this.f28185i = interfaceC3275c;
        this.f28187j = c7796d;
        this.f28188k = executorC7177a;
        this.f28189l = interfaceC0113j;
        PreferenceStoreImpl$special$$inlined$map$1 preferenceStoreImpl$special$$inlined$map$1Mo9580a = interfaceC5179a.mo9580a();
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        Boolean bool = Boolean.FALSE;
        C7135p c7135pM353h2 = C0062b.m353h2(preferenceStoreImpl$special$$inlined$map$1Mo9580a, interfaceC7882zM16767w0, startedWhileSubscribed, bool);
        this.f28153H = c7135pM353h2;
        C7135p c7135pM353h3 = C0062b.m353h2(interfaceC5179a.mo9604s(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28154I = c7135pM353h3;
        C7135p c7135pM353h4 = C0062b.m353h2(interfaceC5179a.mo9579Z(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        C7135p c7135pM353h5 = C0062b.m353h2(interfaceC5179a.mo9583b0(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28155J = c7135pM353h5;
        C7135p c7135pM353h6 = C0062b.m353h2(interfaceC5179a.mo9562I(), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f28156K = c7135pM353h6;
        C7135p c7135pM353h7 = C0062b.m353h2(interfaceC5179a.mo9595j(), C8573r0.m16767w0(this), startedWhileSubscribed, null);
        this.f28157L = c7135pM353h7;
        C7135p c7135pM353h8 = C0062b.m353h2(interfaceC5179a.mo9603r(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28158M = c7135pM353h8;
        C7135p c7135pM353h9 = C0062b.m353h2(interfaceC5179a.mo9570Q(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28159N = c7135pM353h9;
        C7135p c7135pM353h10 = C0062b.m353h2(interfaceC5179a.mo9563J(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28160O = c7135pM353h10;
        C7135p c7135pM353h11 = C0062b.m353h2(interfaceC5179a.mo9606u(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28161P = c7135pM353h11;
        C7135p c7135pM353h12 = C0062b.m353h2(interfaceC5179a.mo9574U(), C8573r0.m16767w0(this), startedWhileSubscribed, Boolean.TRUE);
        this.f28162Q = c7135pM353h12;
        InterfaceC7116c<Map<String, LessonFont>> interfaceC7116cMo9598m = interfaceC5179a.mo9598m();
        InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(this);
        String strMo498E1 = mo498E1();
        LessonFont.Companion companion = LessonFont.INSTANCE;
        String strMo498E2 = mo498E1();
        companion.getClass();
        this.f28163R = C0062b.m353h2(interfaceC7116cMo9598m, interfaceC7882zM16767w1, startedWhileSubscribed, C7499b.m14943h0(new Pair(strMo498E1, LessonFont.Companion.m9551a(strMo498E2))));
        PreferenceStoreImpl$special$$inlined$map$14 preferenceStoreImpl$special$$inlined$map$14Mo9596k = interfaceC5179a.mo9596k();
        InterfaceC7882z interfaceC7882zM16767w2 = C8573r0.m16767w0(this);
        LessonHighlightStyle lessonHighlightStyle = LessonHighlightStyle.Default;
        this.f28164S = C0062b.m353h2(preferenceStoreImpl$special$$inlined$map$14Mo9596k, interfaceC7882zM16767w2, startedWhileSubscribed, lessonHighlightStyle);
        this.f28165T = C0062b.m353h2(interfaceC5179a.mo9554A(), C8573r0.m16767w0(this), startedWhileSubscribed, lessonHighlightStyle);
        this.f28166U = C0062b.m353h2(interfaceC5179a.mo9602q(), C8573r0.m16767w0(this), startedWhileSubscribed, 19);
        this.f28167V = C0062b.m353h2(interfaceC5179a.mo9581a0(), C8573r0.m16767w0(this), startedWhileSubscribed, Double.valueOf(1.0d));
        C7135p c7135pM353h13 = C0062b.m353h2(interfaceC5179a.mo9588e(), C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        this.f28168W = c7135pM353h13;
        C7135p c7135pM353h14 = C0062b.m353h2(interfaceC5180b.mo9619h(), C8573r0.m16767w0(this), startedWhileSubscribed, new Profile(0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0, 1048575, null));
        this.f28169X = c7135pM353h14;
        C7135p c7135pM353h15 = C0062b.m353h2(interfaceC5179a.mo9565L(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f28170Y = c7135pM353h15;
        C7135p c7135pM353h16 = C0062b.m353h2(interfaceC5179a.mo9591f0(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f28171Z = c7135pM353h16;
        C7135p c7135pM353h17 = C0062b.m353h2(interfaceC5179a.mo9586d(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f28172a0 = c7135pM353h17;
        C7135p c7135pM353h18 = C0062b.m353h2(interfaceC5179a.mo9555B(), C8573r0.m16767w0(this), startedWhileSubscribed, "");
        this.f28173b0 = c7135pM353h18;
        EmptyList emptyList = EmptyList.f38032a;
        this.f28174c0 = C7120g.m14379a(emptyList);
        final InterfaceC7116c[] interfaceC7116cArr = {c7135pM353h2, c7135pM353h9, c7135pM353h3, c7135pM353h4, c7135pM353h5, c7135pM353h8, c7135pM353h6, c7135pM353h7, c7135pM353h10, c7135pM353h11, c7135pM353h12};
        C7135p c7135pM353h19 = C0062b.m353h2(new InterfaceC7116c<List<? extends AbstractC7787n>>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$1

            /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$1$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$1$3", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C43233 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7787n>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f28259e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f28260f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f28261g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ DatastoreLessonSettingsViewModel f28262h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C43233(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f28262h = datastoreLessonSettingsViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C43233 c43233 = new C43233(this.f28262h, interfaceC9968c);
                    c43233.f28260f = interfaceC7117d;
                    c43233.f28261g = objArr;
                    return c43233.mo1338x(C9072e.f47360a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    String str;
                    LocalTextToSpeechVoice localTextToSpeechVoice;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f28259e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f28260f;
                        DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28262h;
                        datastoreLessonSettingsViewModel.getClass();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new AbstractC7787n.b(R.string.settings_text_to_speech));
                        arrayList.add(new AbstractC7787n.k(R.string.settings_autoplay_tts, ViewKeys.AutoPlayTextToSpeech.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28154I.getValue()).booleanValue(), false));
                        C7135p c7135p = datastoreLessonSettingsViewModel.f28156K;
                        if (c7135p.getValue() != null) {
                            arrayList.add(AbstractC7787n.d.f42747a);
                            int iOrdinal = ViewKeys.TTSVoice.ordinal();
                            String str2 = null;
                            if (((Boolean) datastoreLessonSettingsViewModel.f28155J.getValue()).booleanValue()) {
                                Map map = (Map) c7135p.getValue();
                                if (map != null) {
                                    TextToSpeechVoice textToSpeechVoice = (TextToSpeechVoice) map.get(datastoreLessonSettingsViewModel.mo498E1());
                                    str2 = textToSpeechVoice != null ? textToSpeechVoice.f21617b : null;
                                    if (str2 == null) {
                                    }
                                    arrayList.add(new AbstractC7787n.n(R.string.texts_voice, R.string.placeholder, iOrdinal, str, null, 40));
                                }
                                str = "";
                                arrayList.add(new AbstractC7787n.n(R.string.texts_voice, R.string.placeholder, iOrdinal, str, null, 40));
                            } else {
                                Map map2 = (Map) datastoreLessonSettingsViewModel.f28157L.getValue();
                                if (map2 != null && (localTextToSpeechVoice = (LocalTextToSpeechVoice) map2.get(datastoreLessonSettingsViewModel.mo498E1())) != null) {
                                    str2 = localTextToSpeechVoice.f21602b;
                                }
                            }
                            str = str2;
                            arrayList.add(new AbstractC7787n.n(R.string.texts_voice, R.string.placeholder, iOrdinal, str, null, 40));
                        }
                        AbstractC7787n.d dVar = AbstractC7787n.d.f42747a;
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.b(R.string.settings_text_general));
                        arrayList.add(new AbstractC7787n.k(R.string.settings_paging_moves_known, ViewKeys.PagesMovesToKnown.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28153H.getValue()).booleanValue(), false));
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.k(R.string.settings_autocreate_lingqs, ViewKeys.AutoCreateLingQs.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28158M.getValue()).booleanValue(), false));
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.k(R.string.popup_always_show_status, ViewKeys.StatusBar.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28159N.getValue()).booleanValue(), false));
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.k(R.string.settings_reader_tap_page, ViewKeys.TapToPage.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28160O.getValue()).booleanValue(), false));
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.k(R.string.settings_reader_streak_milestones, ViewKeys.StreakMilestonesShow.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28161P.getValue()).booleanValue(), false));
                        arrayList.add(dVar);
                        arrayList.add(new AbstractC7787n.k(R.string.lesson_show_vocabulary, ViewKeys.ShowVocabulary.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28162Q.getValue()).booleanValue(), false));
                        this.f28259e = 1;
                        if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr2 = interfaceC7116cArr;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$1.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr2.length];
                    }
                }, new C43233(this, null), interfaceC7117d, interfaceC7116cArr2);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f28176d0 = stateFlowImplM14379a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f28178e0 = stateFlowImplM14379a2;
        final InterfaceC7116c[] interfaceC7116cArr2 = {c7135pM353h14, c7135pM353h13, c7135pM353h15, c7135pM353h16, c7135pM353h17, c7135pM353h18};
        this.f28180f0 = C0062b.m353h2(C0062b.m381p0(c7135pM353h19, stateFlowImplM14379a2, stateFlowImplM14379a, C0062b.m353h2(new InterfaceC7116c<List<? extends AbstractC7787n>>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$2

            /* JADX INFO: renamed from: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$2$3 */
            @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
            @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$2$3", m19206f = "DatastoreLessonSettingsViewModel.kt", m19207l = {238}, m19208m = "invokeSuspend")
            public static final class C43253 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends AbstractC7787n>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

                /* JADX INFO: renamed from: e */
                public int f28266e;

                /* JADX INFO: renamed from: f */
                public /* synthetic */ InterfaceC7117d f28267f;

                /* JADX INFO: renamed from: g */
                public /* synthetic */ Object[] f28268g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ DatastoreLessonSettingsViewModel f28269h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C43253(DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel, InterfaceC9968c interfaceC9968c) {
                    super(3, interfaceC9968c);
                    this.f28269h = datastoreLessonSettingsViewModel;
                }

                @Override // cm.InterfaceC2057q
                /* JADX INFO: renamed from: M */
                public final Object mo1343M(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                    C43253 c43253 = new C43253(this.f28269h, interfaceC9968c);
                    c43253.f28267f = interfaceC7117d;
                    c43253.f28268g = objArr;
                    return c43253.mo1338x(C9072e.f47360a);
                }

                /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /* JADX INFO: renamed from: x */
                public final Object mo1338x(Object obj) throws Throwable {
                    Object obj2;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.f28266e;
                    if (i10 == 0) {
                        C7499b.m14977z0(obj);
                        InterfaceC7117d interfaceC7117d = this.f28267f;
                        Object obj3 = this.f28268g[0];
                        C5207g.m11109d(obj3, "null cannot be cast to non-null type com.lingq.shared.domain.Profile");
                        String str = ((Profile) obj3).f17795o;
                        DatastoreLessonSettingsViewModel datastoreLessonSettingsViewModel = this.f28269h;
                        datastoreLessonSettingsViewModel.getClass();
                        if (C5408a.m11571d(str)) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new AbstractC7787n.b(R.string.settings_text_asian_script_settings));
                            arrayList.add(new AbstractC7787n.k(R.string.settings_asian_show_spaces, ViewKeys.ShowSpacesBetweenWords.ordinal(), ((Boolean) datastoreLessonSettingsViewModel.f28168W.getValue()).booleanValue(), false));
                            arrayList.add(AbstractC7787n.d.f42747a);
                            if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Mandarin))) {
                                arrayList.add(new AbstractC7787n.n(R.string.settings_transliteration_style, R.string.placeholder, ViewKeys.ChineseType.ordinal(), (String) datastoreLessonSettingsViewModel.f28170Y.getValue(), null, 40));
                            }
                            if (C5207g.m11106a(str, C5408a.m11569b(LanguageLearn.Japanese))) {
                                arrayList.add(new AbstractC7787n.n(R.string.settings_transliteration_style, R.string.placeholder, ViewKeys.JapaneseType.ordinal(), (String) datastoreLessonSettingsViewModel.f28171Z.getValue(), null, 40));
                            }
                            if (C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.ChineseTraditional))) {
                                arrayList.add(new AbstractC7787n.n(R.string.settings_transliteration_style, R.string.placeholder, ViewKeys.ChineseTraditionType.ordinal(), (String) datastoreLessonSettingsViewModel.f28172a0.getValue(), null, 40));
                            }
                            obj2 = arrayList;
                            if (C5207g.m11106a(str, C5408a.m11570c(LanguageLearnBeta.Cantonese))) {
                                arrayList.add(new AbstractC7787n.n(R.string.settings_transliteration_style, R.string.placeholder, ViewKeys.CantoneseType.ordinal(), (String) datastoreLessonSettingsViewModel.f28173b0.getValue(), null, 40));
                                obj2 = arrayList;
                            }
                        } else {
                            obj2 = EmptyList.f38032a;
                        }
                        this.f28266e = 1;
                        if (interfaceC7117d.mo1339r(obj2, this) == coroutineSingletons) {
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

            @Override // kotlinx.coroutines.flow.InterfaceC7116c
            /* JADX INFO: renamed from: a */
            public final Object mo9539a(InterfaceC7117d<? super List<? extends AbstractC7787n>> interfaceC7117d, InterfaceC9968c interfaceC9968c) throws Throwable {
                final InterfaceC7116c[] interfaceC7116cArr3 = interfaceC7116cArr2;
                Object objM14386a = C7127c.m14386a(interfaceC9968c, new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.lesson.menu.DatastoreLessonSettingsViewModel$special$$inlined$combine$2.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // cm.InterfaceC2041a
                    /* JADX INFO: renamed from: E */
                    public final Object[] mo807E() {
                        return new Object[interfaceC7116cArr3.length];
                    }
                }, new C43253(this, null), interfaceC7117d, interfaceC7116cArr3);
                return objM14386a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14386a : C9072e.f47360a;
            }
        }, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList), new DatastoreLessonSettingsViewModel$settings$1(null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        this.f28182g0 = C0062b.m353h2(new C7131l(mo509w0(), c7135pM353h14, new DatastoreLessonSettingsViewModel$_userDictionaryLocales$1(this, null)), C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f28184h0 = c7138sM10448a;
        this.f28186i0 = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43171(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43182(context, null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43193(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43204(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C43215(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f28189l.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28189l.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f28189l.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28189l.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f28189l.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28189l.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f28189l;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28189l.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f28189l.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f28189l.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f28189l.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f28189l.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f28189l.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f28189l.mo509w0();
    }
}
