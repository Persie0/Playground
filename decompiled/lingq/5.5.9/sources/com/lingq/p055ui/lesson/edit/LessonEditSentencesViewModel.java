package com.lingq.p055ui.lesson.edit;

import ae.C0062b;
import androidx.view.AbstractC1036h0;
import androidx.view.C1024c0;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.InterfaceC7137r;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p204jj.InterfaceC6484e;
import p225kk.C6715l;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Lcom/lingq/ui/lesson/edit/LessonEditSentencesViewModel;", "Landroidx/lifecycle/h0;", "Lak/j;", "Ljj/e;", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LessonEditSentencesViewModel extends AbstractC1036h0 implements InterfaceC0113j, InterfaceC6484e {

    /* JADX INFO: renamed from: d */
    public final InterfaceC3324a f27949d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f27950e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC6484e f27951f;

    /* JADX INFO: renamed from: g */
    public final int f27952g;

    /* JADX INFO: renamed from: h */
    public final StateFlowImpl f27953h;

    /* JADX INFO: renamed from: i */
    public final C7135p f27954i;

    /* JADX INFO: renamed from: j */
    public final StateFlowImpl f27955j;

    /* JADX INFO: renamed from: k */
    public final C7135p f27956k;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1", m19206f = "LessonEditSentencesViewModel.kt", m19207l = {38, 43}, m19208m = "invokeSuspend")
    public static final class C42881 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27957e;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$1", m19206f = "LessonEditSentencesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ LessonEditSentencesViewModel f27959e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(LessonEditSentencesViewModel lessonEditSentencesViewModel, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27959e = lessonEditSentencesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f27959e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27959e.f27955j.setValue(Boolean.TRUE);
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$2, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$2", m19206f = "LessonEditSentencesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Throwable f27960e;

            public AnonymousClass2(InterfaceC9968c<? super AnonymousClass2> interfaceC9968c) {
                super(3, interfaceC9968c);
            }

            @Override // cm.InterfaceC2057q
            /* JADX INFO: renamed from: M */
            public final Object mo1343M(InterfaceC7117d<? super List<? extends LessonStudyTranslationSentence>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC9968c);
                anonymousClass2.f27960e = th2;
                return anonymousClass2.mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                this.f27960e.printStackTrace();
                return C9072e.f47360a;
            }
        }

        /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$3, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/lesson/LessonStudyTranslationSentence;", "sentences", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$1$3", m19206f = "LessonEditSentencesViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC2056p<List<? extends LessonStudyTranslationSentence>, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public /* synthetic */ Object f27961e;

            /* JADX INFO: renamed from: f */
            public final /* synthetic */ LessonEditSentencesViewModel f27962f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(LessonEditSentencesViewModel lessonEditSentencesViewModel, InterfaceC9968c<? super AnonymousClass3> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f27962f = lessonEditSentencesViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f27962f, interfaceC9968c);
                anonymousClass3.f27961e = obj;
                return anonymousClass3;
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(List<? extends LessonStudyTranslationSentence> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass3) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                List list = (List) this.f27961e;
                if (!list.isEmpty()) {
                    LessonEditSentencesViewModel lessonEditSentencesViewModel = this.f27962f;
                    lessonEditSentencesViewModel.f27955j.setValue(Boolean.FALSE);
                    ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C4306a.a((LessonStudyTranslationSentence) it.next()));
                    }
                    lessonEditSentencesViewModel.f27953h.setValue(arrayList);
                }
                return C9072e.f47360a;
            }
        }

        public C42881(InterfaceC9968c<? super C42881> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonEditSentencesViewModel.this.new C42881(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42881) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27957e;
            LessonEditSentencesViewModel lessonEditSentencesViewModel = LessonEditSentencesViewModel.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC3324a interfaceC3324a = lessonEditSentencesViewModel.f27949d;
            lessonEditSentencesViewModel.mo498E1();
            this.f27957e = 1;
            obj = interfaceC3324a.mo9537y(lessonEditSentencesViewModel.f27952g);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new AnonymousClass1(lessonEditSentencesViewModel, null), (InterfaceC7116c) obj), new AnonymousClass2(null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(lessonEditSentencesViewModel, null);
            this.f27957e = 2;
            if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, anonymousClass3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$2 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.edit.LessonEditSentencesViewModel$2", m19206f = "LessonEditSentencesViewModel.kt", m19207l = {55}, m19208m = "invokeSuspend")
    public static final class C42892 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f27963e;

        public C42892(InterfaceC9968c<? super C42892> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return LessonEditSentencesViewModel.this.new C42892(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42892) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LessonEditSentencesViewModel lessonEditSentencesViewModel = LessonEditSentencesViewModel.this;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27963e;
            try {
                if (i10 == 0) {
                    C7499b.m14977z0(obj);
                    InterfaceC3324a interfaceC3324a = lessonEditSentencesViewModel.f27949d;
                    String strMo498E1 = lessonEditSentencesViewModel.mo498E1();
                    int i11 = lessonEditSentencesViewModel.f27952g;
                    this.f27963e = 1;
                    if (interfaceC3324a.mo9524l(strMo498E1, i11, false, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return C9072e.f47360a;
        }
    }

    public LessonEditSentencesViewModel(InterfaceC3324a interfaceC3324a, InterfaceC0113j interfaceC0113j, InterfaceC6484e interfaceC6484e, C1024c0 c1024c0) {
        C5207g.m11111f(interfaceC3324a, "lessonRepository");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC6484e, "lessonEditDelegate");
        C5207g.m11111f(c1024c0, "savedStateHandle");
        this.f27949d = interfaceC3324a;
        this.f27950e = interfaceC0113j;
        this.f27951f = interfaceC6484e;
        Integer num = (Integer) c1024c0.m3929b("lessonId");
        int iIntValue = 0;
        int iIntValue2 = num != null ? num.intValue() : 0;
        this.f27952g = iIntValue2;
        Integer num2 = (Integer) c1024c0.m3929b("sentenceIndex");
        iIntValue = num2 != null ? num2.intValue() : iIntValue;
        EmptyList emptyList = EmptyList.f38032a;
        StateFlowImpl stateFlowImplM14379a = C7120g.m14379a(emptyList);
        this.f27953h = stateFlowImplM14379a;
        InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(this);
        StartedWhileSubscribed startedWhileSubscribed = C6715l.f37936a;
        this.f27954i = C0062b.m353h2(stateFlowImplM14379a, interfaceC7882zM16767w0, startedWhileSubscribed, emptyList);
        Boolean bool = Boolean.FALSE;
        StateFlowImpl stateFlowImplM14379a2 = C7120g.m14379a(bool);
        this.f27955j = stateFlowImplM14379a2;
        this.f27956k = C0062b.m353h2(stateFlowImplM14379a2, C8573r0.m16767w0(this), startedWhileSubscribed, bool);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42881(null), 3);
        C7828f.m15570d(C8573r0.m16767w0(this), null, null, new C42892(null), 3);
        mo10160i(iIntValue2, iIntValue);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f27950e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27950e.mo497B0(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f27950e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27950e.mo499J(profile, interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: K0 */
    public final InterfaceC7137r<Boolean> mo10155K0() {
        return this.f27951f.mo10155K0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: M0 */
    public final InterfaceC7137r<Pair<Integer, Integer>> mo10156M0() {
        return this.f27951f.mo10156M0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f27950e.mo500P();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: T */
    public final void mo10157T(int i10) {
        this.f27951f.mo10157T(i10);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: W0 */
    public final void mo10158W0() {
        this.f27951f.mo10158W0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: Z1 */
    public final List<Integer> mo10159Z1() {
        return this.f27951f.mo10159Z1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27950e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f27950e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27950e.mo503f1(interfaceC9968c);
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: i */
    public final void mo10160i(int i10, int i11) {
        this.f27951f.mo10160i(i10, i11);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f27950e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f27950e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f27950e.mo506l1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: m0 */
    public final InterfaceC7137r<Boolean> mo10161m0() {
        return this.f27951f.mo10161m0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f27950e.mo507p1();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: s0 */
    public final void mo10162s0() {
        this.f27951f.mo10162s0();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f27950e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f27950e.mo509w0();
    }

    @Override // p204jj.InterfaceC6484e
    /* JADX INFO: renamed from: x1 */
    public final void mo10163x1() {
        this.f27951f.mo10163x1();
    }
}
