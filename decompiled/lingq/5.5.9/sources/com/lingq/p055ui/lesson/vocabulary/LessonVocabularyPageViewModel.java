package com.lingq.p055ui.lesson.vocabulary;

import ae.C0062b;
import androidx.activity.result.C0204c;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import ci.InterfaceC2008a;
import ci.InterfaceC2013f;
import ci.InterfaceC2023p;
import ci.InterfaceC2026s;
import cm.InterfaceC2056p;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.collections.C6753d;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import li.C7374a;
import li.C7378e;
import li.InterfaceC7379f;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p225kk.C6715l;
import p244lh.InterfaceC7366c;
import p260m8.C7499b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;
import tl.C9326n;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/vocabulary/LessonVocabularyPageViewModel;", "Landroidx/lifecycle/h0;", "Llh/c;", "Lak/j;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonVocabularyPageViewModel extends AbstractC1036h0 implements InterfaceC7366c, InterfaceC0113j {

    /* JADX INFO: renamed from: H */
    public final C7135p f29271H;

    /* JADX INFO: renamed from: I */
    public final StateFlowImpl f29272I;

    /* JADX INFO: renamed from: J */
    public final StateFlowImpl f29273J;

    /* JADX INFO: renamed from: K */
    public final StateFlowImpl f29274K;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2008a f29275d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2026s f29276e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2013f f29277f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC2023p f29278g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC7366c f29279h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC0113j f29280i;

    /* JADX INFO: renamed from: j */
    public final int f29281j;

    /* JADX INFO: renamed from: k */
    public final Locale f29282k;

    /* JADX INFO: renamed from: l */
    public final StateFlowImpl f29283l;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {73}, m19208m = "invokeSuspend")
    final class C44841 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29284e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/e;", "words", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$1$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7378e>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29286e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonVocabularyPageViewModel f29287f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29287f = lessonVocabularyPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29287f, interfaceC9968c);
                anonymousClass1.f29286e = obj;
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
                List list = (List) this.f29286e;
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
                    LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29287f;
                    lessonVocabularyPageViewModel.getClass();
                    C7828f.m15570d(C8573r0.m16767w0(lessonVocabularyPageViewModel), null, null, new LessonVocabularyPageViewModel$fetchTokenTranslation$1(lessonVocabularyPageViewModel, str, null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C44841(InterfaceC9968c<? super C44841> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonVocabularyPageViewModel.this.new C44841(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44841) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29284e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonVocabularyPageViewModel lessonVocabularyPageViewModel = LessonVocabularyPageViewModel.this;
                StateFlowImpl stateFlowImpl = lessonVocabularyPageViewModel.f29273J;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonVocabularyPageViewModel, null);
                this.f29284e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$2", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {82}, m19208m = "invokeSuspend")
    final class C44852 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29288e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$2$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/a;", "cards", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$2$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<List<? extends C7374a>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29290e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonVocabularyPageViewModel f29291f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29291f = lessonVocabularyPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29291f, interfaceC9968c);
                anonymousClass1.f29290e = obj;
                return anonymousClass1;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends C7374a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f29290e;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (((C7374a) next).f41146e.isEmpty()) {
                            arrayList.add(next);
                        }
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    String str = ((C7374a) it2.next()).f41142a;
                    LessonVocabularyPageViewModel lessonVocabularyPageViewModel = this.f29291f;
                    lessonVocabularyPageViewModel.getClass();
                    C7828f.m15570d(C8573r0.m16767w0(lessonVocabularyPageViewModel), null, null, new LessonVocabularyPageViewModel$fetchPopularMeanings$1(lessonVocabularyPageViewModel, str, null), 3);
                }
                return C9072e.f47360a;
            }
        }

        public C44852(InterfaceC9968c<? super C44852> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonVocabularyPageViewModel.this.new C44852(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44852) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29288e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonVocabularyPageViewModel lessonVocabularyPageViewModel = LessonVocabularyPageViewModel.this;
                StateFlowImpl stateFlowImpl = lessonVocabularyPageViewModel.f29272I;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(lessonVocabularyPageViewModel, null);
                this.f29288e = 1;
                if (C0062b.m369m0(stateFlowImpl, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {111}, m19208m = "invokeSuspend")
    final class C44863 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29292e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000(\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u008a@"}, m13365d2 = {"", "Lli/a;", "cards", "Lli/e;", "words", "", "", "Lcom/lingq/shared/uimodel/token/TokenMeaning;", "popularMeanings", "", "Lli/f;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3$1", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2058r<List<? extends C7374a>, List<? extends C7378e>, Map<String, ? extends TokenMeaning>, InterfaceC9968c<? super List<InterfaceC7379f>>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ List f29294e;

            /* JADX INFO: renamed from: f */
            public /* synthetic */ List f29295f;

            /* JADX INFO: renamed from: g */
            public /* synthetic */ Map f29296g;

            /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3$1$a */
            public static final class a<T> implements Comparator {
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return C7499b.m14951m(((InterfaceC7379f) t10).mo14774c(), ((InterfaceC7379f) t11).mo14774c());
                }
            }

            public AnonymousClass1(InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(4, interfaceC9968c);
            }

            @Override // cm.InterfaceC2058r
            /* JADX INFO: renamed from: T */
            public final Object mo1851T(List<? extends C7374a> list, List<? extends C7378e> list2, Map<String, ? extends TokenMeaning> map, InterfaceC9968c<? super List<InterfaceC7379f>> interfaceC9968c) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC9968c);
                anonymousClass1.f29294e = list;
                anonymousClass1.f29295f = list2;
                anonymousClass1.f29296g = map;
                return anonymousClass1.mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = this.f29294e;
                List<C7378e> list2 = this.f29295f;
                Map map = this.f29296g;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                    C7374a c7374a = (C7374a) it.next();
                    TokenMeaning tokenMeaning = (TokenMeaning) map.get(c7374a.f41142a);
                    if (c7374a.f41146e.isEmpty() && tokenMeaning != null) {
                        List listM17251q = C9000b.m17251q(tokenMeaning);
                        boolean z10 = c7374a.f41145d;
                        int i10 = c7374a.f41147f;
                        int i11 = c7374a.f41149h;
                        int i12 = c7374a.f41150i;
                        Integer num = c7374a.f41151j;
                        String str = c7374a.f41152k;
                        String str2 = c7374a.f41153l;
                        LessonStudyTransliteration lessonStudyTransliteration = c7374a.f41155n;
                        String str3 = c7374a.f41142a;
                        C5207g.m11111f(str3, "term");
                        List<String> list3 = c7374a.f41143b;
                        C5207g.m11111f(list3, "tags");
                        List<String> list4 = c7374a.f41144c;
                        C5207g.m11111f(list4, "gTags");
                        String str4 = c7374a.f41148g;
                        C5207g.m11111f(str4, "fragment");
                        List<String> list5 = c7374a.f41154m;
                        C5207g.m11111f(list5, "words");
                        c7374a = new C7374a(str3, list3, list4, z10, listM17251q, i10, str4, i11, i12, num, str, str2, list5, lessonStudyTransliteration);
                    }
                    arrayList.add(c7374a);
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(list2, 10));
                for (C7378e c7378eM14778g : list2) {
                    TokenMeaning tokenMeaning2 = (TokenMeaning) map.get(c7378eM14778g.f41167a);
                    if (c7378eM14778g.f41171e.isEmpty() && tokenMeaning2 != null) {
                        c7378eM14778g = C7378e.m14778g(c7378eM14778g, C9000b.m17251q(tokenMeaning2));
                    }
                    arrayList2.add(c7378eM14778g);
                }
                ArrayList arrayListM13438f0 = C6752c.m13438f0(arrayList2, arrayList);
                HashSet hashSet = new HashSet();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayListM13438f0) {
                    if (hashSet.add(((InterfaceC7379f) obj2).mo14774c())) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayListM13454v0 = C6752c.m13454v0(arrayList3);
                if (arrayListM13454v0.size() > 1) {
                    C9326n.m17682B(arrayListM13454v0, new a());
                }
                return arrayListM13454v0;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/f;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$3$2", m19206f = "LessonVocabularyPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2056p<List<InterfaceC7379f>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f29297e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonVocabularyPageViewModel f29298f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(LessonVocabularyPageViewModel lessonVocabularyPageViewModel, InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f29298f = lessonVocabularyPageViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f29298f, interfaceC9968c);
                anonymousClass2.f29297e = obj;
                return anonymousClass2;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<InterfaceC7379f> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass2) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f29298f.f29283l.setValue((List) this.f29297e);
                return C9072e.f47360a;
            }
        }

        public C44863(InterfaceC9968c<? super C44863> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonVocabularyPageViewModel.this.new C44863(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C44863) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29292e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonVocabularyPageViewModel lessonVocabularyPageViewModel = LessonVocabularyPageViewModel.this;
                FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1M377o0 = C0062b.m377o0(lessonVocabularyPageViewModel.f29272I, lessonVocabularyPageViewModel.f29273J, lessonVocabularyPageViewModel.f29274K, new AnonymousClass1(null));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(lessonVocabularyPageViewModel, null);
                this.f29292e = 1;
                if (C0062b.m369m0(flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1M377o0, anonymousClass2, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.vocabulary.LessonVocabularyPageViewModel$a */
    public /* synthetic */ class C4487a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29299a;

        static {
            int[] iArr = new int[VocabularyType.values().length];
            try {
                iArr[VocabularyType.Cards.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VocabularyType.NewWords.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VocabularyType.All.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29299a = iArr;
        }
    }

    public LessonVocabularyPageViewModel(InterfaceC2008a interfaceC2008a, InterfaceC2026s interfaceC2026s, InterfaceC2013f interfaceC2013f, InterfaceC2023p interfaceC2023p, CoroutineJobManager coroutineJobManager, CoroutineDispatcher coroutineDispatcher, ExecutorC7177a executorC7177a, InterfaceC0113j interfaceC0113j, InterfaceC7366c interfaceC7366c, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC2008a, "cardRepository");
        C5207g.m11111f(interfaceC2026s, "wordRepository");
        C5207g.m11111f(interfaceC2013f, "languageStatsRepository");
        C5207g.m11111f(interfaceC2023p, "tokenDataRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7366c, "milestonesController");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f29275d = interfaceC2008a;
        this.f29276e = interfaceC2026s;
        this.f29277f = interfaceC2013f;
        this.f29278g = interfaceC2023p;
        this.f29279h = interfaceC7366c;
        this.f29280i = interfaceC0113j;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        this.f29281j = num != null ? num.intValue() : 0;
        Object objM3929b = c1024c0.m3929b("type");
        C5207g.m11109d(objM3929b, "null cannot be cast to non-null type com.lingq.ui.lesson.vocabulary.VocabularyType");
        VocabularyType vocabularyType = (VocabularyType) objM3929b;
        this.f29282k = Locale.forLanguageTag(mo498E1());
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f29283l = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f29271H = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(emptyList);
        this.f29272I = stateFlowImplM14379a2;
        C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a3 = C7120g.m14379a(emptyList);
        this.f29273J = stateFlowImplM14379a3;
        C0062b.m353h2(stateFlowImplM14379a3, C8573r0.m16767w0(this), startedWhileSubscribed, emptyList);
        StateFlowImpl stateFlowImplM14379a4 = C7120g.m14379a(C6753d.m13459L0());
        this.f29274K = stateFlowImplM14379a4;
        C0062b.m353h2(stateFlowImplM14379a4, C8573r0.m16767w0(this), startedWhileSubscribed, C6753d.m13459L0());
        int i10 = C4487a.f29299a[vocabularyType.ordinal()];
        if (i10 == 1) {
            C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0204c.m852k("tokens ", vocabularyType.name()), new LessonVocabularyPageViewModel$fetchTokensFor$1(this, null));
        } else if (i10 == 2) {
            C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0204c.m852k("tokens ", vocabularyType.name()), new LessonVocabularyPageViewModel$fetchTokensFor$2(this, null));
        } else if (i10 == 3) {
            C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0204c.m852k("cards ", vocabularyType.name()), new LessonVocabularyPageViewModel$fetchTokensFor$3(this, null));
            C7499b.m14933c0(C8573r0.m16767w0(this), coroutineJobManager, executorC7177a, C0204c.m852k("words ", vocabularyType.name()), new LessonVocabularyPageViewModel$fetchTokensFor$4(this, null));
        }
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44841(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44852(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C44863(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f29280i.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29280i.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f29280i.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29280i.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f29280i.mo500P();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29280i.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f29280i;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29280i.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f29280i.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29280i.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f29280i.mo506l1();
    }

    /* JADX INFO: renamed from: l2 */
    public final void m10234l2(String str, int i10) {
        C5207g.m11111f(str, "term");
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new LessonVocabularyPageViewModel$updateStatus$1(i10, this, str, null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f29280i.mo507p1();
    }

    @Override // p244lh.InterfaceC7366c
    /* JADX INFO: renamed from: s */
    public final Object mo9326s(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f29279h.mo9326s(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f29280i.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f29280i.mo509w0();
    }
}
