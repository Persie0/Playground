package com.lingq.p055ui.lesson.tutorial;

import ae.C0062b;
import android.graphics.Rect;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2023p;
import ci.InterfaceC2026s;
import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.InterfaceC4865b;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenEditData;
import com.lingq.p055ui.tooltips.InterfaceC4912b;
import com.lingq.p055ui.tooltips.TooltipStep;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import com.lingq.util.C4924a;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7131l;
import kotlinx.coroutines.flow.C7134o;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7378e;
import ni.C7793a;
import ni.C7796d;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5179a;
import p183ik.C6343f;
import p225kk.C6704a;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, m13365d2 = {"Lcom/lingq/ui/lesson/tutorial/LessonDealWithWordsViewModel;", "Landroidx/lifecycle/h0;", "Lcom/lingq/ui/tooltips/b;", "Lak/j;", "Lcom/lingq/ui/token/b;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonDealWithWordsViewModel extends AbstractC1036h0 implements InterfaceC4912b, InterfaceC0113j, InterfaceC4865b {

    /* JADX INFO: renamed from: H */
    public final Locale f29135H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f29136I;

    /* JADX INFO: renamed from: J */
    public final C7135p f29137J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f29138K;

    /* JADX INFO: renamed from: L */
    public final C7135p f29139L;

    /* JADX INFO: renamed from: M */
    public final StateFlowImpl f29140M;

    /* JADX INFO: renamed from: N */
    public final C7138s f29141N;

    /* JADX INFO: renamed from: O */
    public final C7134o f29142O;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2026s f29143d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2008a f29144e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2023p f29145f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC5179a f29146g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC4912b f29147h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0113j f29148i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC4865b f29149j;

    /* JADX INFO: renamed from: k */
    public final int f29150k;

    /* JADX INFO: renamed from: l */
    public final List<String> f29151l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {67}, m19208m = "invokeSuspend")
    public static final class C44531 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29152e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "words", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$1$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29154e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonDealWithWordsViewModel f29155f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29155f = lessonDealWithWordsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29155f, interfaceC9968c);
                anonymousClass1.f29154e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f29154e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (((C7378e) next).f41171e.isEmpty()) {
                            arrayList.add(next);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = ((C7378e) it2.next()).f41167a;
                    LessonDealWithWordsViewModel lessonDealWithWordsViewModel = this.f29155f;
                    lessonDealWithWordsViewModel.getClass();
                    C7828f.m15570d(C8573r0.m16767w0(lessonDealWithWordsViewModel), null, null, new LessonDealWithWordsViewModel$fetchTokenTranslation$1(lessonDealWithWordsViewModel, str, null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C44531(InterfaceC9968c<? super C44531> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonDealWithWordsViewModel.this.new C44531(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44531) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29152e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonDealWithWordsViewModel lessonDealWithWordsViewModel = LessonDealWithWordsViewModel.this;
                FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lessonDealWithWordsViewModel.f29136I);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonDealWithWordsViewModel, null);
                this.f29152e = 1;
                if (C0062b.m369m0(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {92}, m19208m = "invokeSuspend")
    public static final class C44542 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29156e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, m13365d2 = {"", "Lli/e;", "words", "", "", "meanings", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2$1", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2057q<List<? extends C7378e>, Map<String, ? extends String>, InterfaceC9968c<? super List<? extends C7378e>>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ List f29158e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ Map f29159f;

            /* JADX INFO: renamed from: g */
            public final /* synthetic */ LessonDealWithWordsViewModel f29160g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(3, interfaceC9968c);
                this.f29160g = lessonDealWithWordsViewModel;
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final Object mo1343M(List<? extends C7378e> list, Map<String, ? extends String> map, InterfaceC9968c<? super List<? extends C7378e>> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29160g, interfaceC9968c);
                anonymousClass1.f29158e = list;
                anonymousClass1.f29159f = map;
                return anonymousClass1.mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List<C7378e> list = this.f29158e;
                Map map = this.f29159f;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (C7378e c7378eM14778g : list) {
                    if (c7378eM14778g.f41171e.isEmpty()) {
                        Locale locale = this.f29160g.f29135H;
                        C5207g.m11110e(locale, "locale");
                        String str = (String) map.get(C7793a.m15502f(c7378eM14778g.f41167a, locale));
                        if (str == null) {
                            str = "";
                        }
                        c7378eM14778g = C7378e.m14778g(c7378eM14778g, C9000b.m17251q(new TokenMeaning(0, null, str, 0, false, null, true, 0, 187, null)));
                    }
                    arrayList.add(c7378eM14778g);
                }
                return arrayList;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "words", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.tutorial.LessonDealWithWordsViewModel$2$2", m19206f = "LessonDealWithWordsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29161e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonDealWithWordsViewModel f29162f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonDealWithWordsViewModel lessonDealWithWordsViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29162f = lessonDealWithWordsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f29162f, interfaceC9968c);
                anonymousClass2.f29161e = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7378e> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f29161e;
                StateFlowImpl stateFlowImpl = this.f29162f.f29138K;
                do {
                    value = stateFlowImpl.getValue();
                } while (!stateFlowImpl.mo14366c(value, list));
                return C9072e.f47360a;
            }
        }

        public C44542(InterfaceC9968c<? super C44542> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonDealWithWordsViewModel.this.new C44542(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44542) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29156e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonDealWithWordsViewModel lessonDealWithWordsViewModel = LessonDealWithWordsViewModel.this;
                C7131l c7131l = new C7131l(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lessonDealWithWordsViewModel.f29136I), lessonDealWithWordsViewModel.f29140M, new AnonymousClass1(lessonDealWithWordsViewModel, null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonDealWithWordsViewModel, null);
                this.f29156e = 1;
                if (C0062b.m369m0(c7131l, anonymousClass2, this) == coroutineSingletons) {
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

    public LessonDealWithWordsViewModel(InterfaceC4912b interfaceC4912b, InterfaceC2026s interfaceC2026s, InterfaceC2008a interfaceC2008a, InterfaceC2023p interfaceC2023p, C7796d c7796d, C6704a c6704a, InterfaceC5179a interfaceC5179a, InterfaceC0113j interfaceC0113j, InterfaceC4865b interfaceC4865b, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC4912b, "tooltipsController");
        C5207g.m11111f(interfaceC2026s, "wordRepository");
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2023p, "tokenDataRepository");
        C5207g.m11111f(c7796d, "analytics");
        C5207g.m11111f(c6704a, "appSettings");
        C5207g.m11111f(interfaceC5179a, "preferenceStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC4865b, "tokenControllerDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f29143d = interfaceC2026s;
        this.f29144e = interfaceC2008a;
        this.f29145f = interfaceC2023p;
        this.f29146g = interfaceC5179a;
        this.f29147h = interfaceC4912b;
        this.f29148i = interfaceC0113j;
        this.f29149j = interfaceC4865b;
        Integer num = (Integer) c1024c0.m3929b("page");
        this.f29150k = num != null ? num.intValue() : -1;
        List<String> list = (List) c1024c0.m3929b("words");
        this.f29151l = list == null ? EmptyList.f38032a : list;
        this.f29135H = Locale.forLanguageTag(mo498E1());
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(null);
        this.f29136I = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f29137J = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, null);
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f29138K = stateFlowImplM14379a2;
        this.f29139L = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(C6753d.m13459L0());
        this.f29140M = stateFlowImplM14379a3;
        C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        C7138s c7138sM10448a = C4924a.m10448a();
        this.f29141N = c7138sM10448a;
        this.f29142O = C0062b.m341d2(c7138sM10448a, C8573r0.m16767w0(this), startedWhileSubscribed);
        c7796d.m15505b(null, "Deal with blue word pop up");
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44531(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44542(null), 3);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: A1 */
    public final void mo10025A1() {
        this.f29149j.mo10025A1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f29148i.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29148i.mo497B0(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: D */
    public final InterfaceC7137r<TokenEditData> mo10026D() {
        return this.f29149j.mo10026D();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f29148i.mo498E1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: H0 */
    public final InterfaceC7137r<String> mo10027H0() {
        return this.f29149j.mo10027H0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: H1 */
    public final void mo9722H1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "tooltipStep");
        this.f29147h.mo9722H1(tooltipStep);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: I */
    public final void mo9723I(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        this.f29147h.mo9723I(tooltipStep);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: I0 */
    public final void mo10028I0(TokenRelatedPhrase tokenRelatedPhrase, int i10, int i11, int i12) {
        this.f29149j.mo10028I0(tokenRelatedPhrase, i10, i11, i12);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29148i.mo499J(profile, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: L */
    public final void mo9724L() {
        this.f29147h.mo9724L();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: L0 */
    public final InterfaceC7137r<String> mo10029L0() {
        return this.f29149j.mo10029L0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N0 */
    public final void mo10030N0(String str) {
        this.f29149j.mo10030N0(str);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: N1 */
    public final InterfaceC7137r<TokenData> mo10031N1() {
        return this.f29149j.mo10031N1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f29148i.mo500P();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: P1 */
    public final void mo10032P1(int i10) {
        this.f29149j.mo10032P1(i10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Q1 */
    public final void mo10033Q1(boolean z10, boolean z11) {
        this.f29149j.mo10033Q1(z10, z11);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: S */
    public final InterfaceC7137r<Integer> mo10034S() {
        return this.f29149j.mo10034S();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: T0 */
    public final void mo9727T0() {
        this.f29147h.mo9727T0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: U1 */
    public final InterfaceC7137r<TokenData> mo10035U1() {
        return this.f29149j.mo10035U1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V */
    public final InterfaceC7137r<TokenRelatedPhrase> mo10036V() {
        return this.f29149j.mo10036V();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: V0 */
    public final void mo10037V0(TokenMeaning tokenMeaning) {
        this.f29149j.mo10037V0(tokenMeaning);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: W1 */
    public final InterfaceC7137r<C9072e> mo10038W1() {
        return this.f29149j.mo10038W1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: Y */
    public final InterfaceC7137r<TokenData> mo10039Y() {
        return this.f29149j.mo10039Y();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: Y1 */
    public final void mo9729Y1() {
        this.f29147h.mo9729Y1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: a1 */
    public final void mo9730a1() {
        this.f29147h.mo9730a1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b */
    public final void mo10041b() {
        this.f29149j.mo10041b();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: b0 */
    public final void mo9731b0(boolean z10) {
        this.f29147h.mo9731b0(z10);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: b2 */
    public final InterfaceC7137r<C9072e> mo10042b2() {
        return this.f29149j.mo10042b2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: c1 */
    public final InterfaceC7137r<Boolean> mo10043c1() {
        return this.f29149j.mo10043c1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29148i.mo501d(str, interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: d2 */
    public final InterfaceC7137r<C9072e> mo10044d2() {
        return this.f29149j.mo10044d2();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: e0 */
    public final void mo10045e0() {
        this.f29149j.mo10045e0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f29148i;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29148i.mo503f1(interfaceC9968c);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: f2 */
    public final void mo10048f2(TokenData tokenData) {
        this.f29149j.mo10048f2(tokenData);
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: g */
    public final void mo10049g() {
        this.f29149j.mo10049g();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g0 */
    public final InterfaceC7116c<List<TooltipStep>> mo9733g0() {
        return this.f29147h.mo9733g0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: g2 */
    public final void mo9734g2(TooltipStep tooltipStep, Rect rect, Rect rect2, boolean z10, boolean z11, boolean z12, InterfaceC2041a<C9072e> interfaceC2041a) {
        C5207g.m11111f(tooltipStep, "step");
        C5207g.m11111f(rect, "viewRect");
        C5207g.m11111f(rect2, "tooltipRect");
        C5207g.m11111f(interfaceC2041a, "action");
        this.f29147h.mo9734g2(tooltipStep, rect, rect2, z10, z11, z12, interfaceC2041a);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: h */
    public final InterfaceC7142w<Boolean> mo9735h() {
        return this.f29147h.mo9735h();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: j */
    public final InterfaceC7137r<C9072e> mo10051j() {
        return this.f29149j.mo10051j();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: j0 */
    public final void mo9736j0() {
        this.f29147h.mo9736j0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f29148i.mo504j1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k0 */
    public final InterfaceC7116c<TooltipStep> mo9737k0() {
        return this.f29147h.mo9737k0();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: k1 */
    public final InterfaceC7116c<C9072e> mo9738k1() {
        return this.f29147h.mo9738k1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: l */
    public final InterfaceC7137r<C9072e> mo10053l() {
        return this.f29149j.mo10053l();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29148i.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f29148i.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10228l2(List<String> list) {
        C5207g.m11111f(list, "wordsToComplete");
        boolean z10 = !list.isEmpty();
        int i10 = this.f29150k;
        if (z10 && i10 == -1) {
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonDealWithWordsViewModel$setupWords$1(this, list, null), 3);
        } else {
            if (!(!this.f29151l.isEmpty()) || i10 == -1) {
                return;
            }
            C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonDealWithWordsViewModel$setupWords$2(this, null), 3);
        }
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: m */
    public final InterfaceC7137r<TokenMeaning> mo10054m() {
        return this.f29149j.mo10054m();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: o0 */
    public final void mo10057o0(TokenMeaning tokenMeaning, String str) {
        this.f29149j.mo10057o0(tokenMeaning, str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: p0 */
    public final boolean mo9741p0(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f29147h.mo9741p0(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f29148i.mo507p1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: q1 */
    public final InterfaceC7137r<Pair<TokenMeaning, String>> mo10060q1() {
        return this.f29149j.mo10060q1();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: r */
    public final void mo10062r(String str) {
        this.f29149j.mo10062r(str);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: r0 */
    public final InterfaceC7116c<TooltipStep> mo9743r0() {
        return this.f29147h.mo9743r0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: t0 */
    public final void mo10064t0(TokenData tokenData) {
        C5207g.m11111f(tokenData, "updateTokenData");
        this.f29149j.mo10064t0(tokenData);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f29148i.mo508t1();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u */
    public final InterfaceC7116c<C6343f> mo9744u() {
        return this.f29147h.mo9744u();
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: u0 */
    public final void mo9745u0(boolean z10) {
        this.f29147h.mo9745u0(z10);
    }

    @Override // com.lingq.p055ui.tooltips.InterfaceC4912b
    /* JADX INFO: renamed from: v1 */
    public final boolean mo9746v1(TooltipStep tooltipStep) {
        C5207g.m11111f(tooltipStep, "step");
        return this.f29147h.mo9746v1(tooltipStep);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f29148i.mo509w0();
    }

    @Override // com.lingq.p055ui.token.InterfaceC4865b
    /* JADX INFO: renamed from: z */
    public final void mo10065z() {
        this.f29149j.mo10065z();
    }
}
