package com.lingq.p055ui.lesson;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.network.result.ResultErrorLesson;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import com.lingq.shared.uimodel.lesson.LessonStudyBookmark;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import java.util.List;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import mo.C7661i;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;
import so.AbstractC9107y;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLesson$1", m19206f = "LessonViewModel.kt", m19207l = {714, 723}, m19208m = "invokeSuspend")
final class LessonViewModel$fetchLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27654e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27655f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f27656g;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$1 */
    @Metadata(m13364d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\n\u001a\u00020\t*(\u0012$\u0012\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0007H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lkotlin/Triple;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42471 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f27657e;

        public C42471(InterfaceC9968c<? super C42471> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C42471 c42471 = new C42471(interfaceC9968c);
            c42471.f27657e = th2;
            return c42471.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f27657e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$2 */
    @Metadata(m13364d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*(\u0012$\u0012\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lkotlin/Triple;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$2", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C42482 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ boolean f27658e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonViewModel f27659f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42482(LessonViewModel lessonViewModel, InterfaceC9968c interfaceC9968c, boolean z10) {
            super(2, interfaceC9968c);
            this.f27658e = z10;
            this.f27659f = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C42482(this.f27659f, interfaceC9968c, this.f27658e);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42482) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (this.f27658e) {
                this.f27659f.f27454Z0.setValue(Resource.Status.LOADING);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$3 */
    @Metadata(m13364d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u00072&\u0010\u0006\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lkotlin/Triple;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "Lcom/lingq/shared/uimodel/lesson/LessonStudySentence;", "Lcom/lingq/shared/uimodel/lesson/LessonStudyBookmark;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$fetchLesson$1$3", m19206f = "LessonViewModel.kt", m19207l = {730}, m19208m = "invokeSuspend")
    public static final class C42493 extends SuspendLambda implements InterfaceC2056p<Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public LessonViewModel f27660e;

        /* JADX INFO: renamed from: f */
        public List f27661f;

        /* JADX INFO: renamed from: g */
        public int f27662g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f27663h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ LessonViewModel f27664i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42493(LessonViewModel lessonViewModel, InterfaceC9968c<? super C42493> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f27664i = lessonViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C42493 c42493 = new C42493(this.f27664i, interfaceC9968c);
            c42493.f27663h = obj;
            return c42493;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends Triple<? extends LessonStudy, ? extends List<? extends LessonStudySentence>, ? extends LessonStudyBookmark>> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C42493) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x008d  */
        /* JADX WARN: Code duplicated, block: B:25:0x009e  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:36:0x00cd A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:34:0x00b9, B:36:0x00cd, B:37:0x00d3, B:39:0x00de, B:41:0x00e7, B:46:0x00f6), top: B:50:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x00de A[Catch: Exception -> 0x00fe, TryCatch #0 {Exception -> 0x00fe, blocks: (B:34:0x00b9, B:36:0x00cd, B:37:0x00d3, B:39:0x00de, B:41:0x00e7, B:46:0x00f6), top: B:50:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:46:0x00f6 A[Catch: Exception -> 0x00fe, TRY_LEAVE, TryCatch #0 {Exception -> 0x00fe, blocks: (B:34:0x00b9, B:36:0x00cd, B:37:0x00d3, B:39:0x00de, B:41:0x00e7, B:46:0x00f6), top: B:50:0x00b9 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Resource resource;
            List list;
            LessonViewModel lessonViewModel;
            List list2;
            Exception exc;
            C6553u<?> c6553u;
            String strM17355r;
            ResultErrorLesson resultErrorLesson;
            C6553u<?> c6553u2;
            AbstractC9107y abstractC9107y;
            StateFlowImpl stateFlowImpl;
            Triple triple;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f27662g;
            LessonViewModel lessonViewModel2 = this.f27664i;
            boolean z10 = true;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                resource = (Resource) this.f27663h;
                Triple triple2 = (Triple) resource.f17863b;
                if (triple2 != null) {
                    LessonStudy lessonStudy = (LessonStudy) triple2.f38021a;
                    list = (List) triple2.f38022b;
                    LessonStudyBookmark lessonStudyBookmark = (LessonStudyBookmark) triple2.f38023c;
                    lessonViewModel2.f27454Z0.setValue(Resource.Status.SUCCESS);
                    lessonViewModel2.f27428Q1.mo14371k(C9072e.f47360a);
                    lessonViewModel2.f27515w0.setValue(lessonStudy);
                    if (lessonStudyBookmark != null) {
                        this.f27663h = resource;
                        this.f27660e = lessonViewModel2;
                        this.f27661f = list;
                        this.f27662g = 1;
                        if (LessonViewModel.m10132n2(lessonViewModel2, lessonStudyBookmark, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lessonViewModel = lessonViewModel2;
                        list2 = list;
                    } else {
                        lessonViewModel = lessonViewModel2;
                    }
                    lessonViewModel.f27415M0.setValue(list);
                    stateFlowImpl = lessonViewModel.f27412L0;
                    triple = (Triple) stateFlowImpl.getValue();
                    if (triple != null) {
                        lessonViewModel.f27406J0.mo14371k(triple);
                        stateFlowImpl.setValue(null);
                    }
                }
                if (C3304a.m9438a(resource)) {
                    exc = resource.f17864c;
                    if (exc instanceof HttpException) {
                        c6553u = ((HttpException) exc).f46513a;
                        if (c6553u != null || (abstractC9107y = c6553u.f37340c) == null) {
                            strM17355r = null;
                        } else {
                            strM17355r = abstractC9107y.m17355r();
                        }
                        if (strM17355r != null) {
                            try {
                                resultErrorLesson = (ResultErrorLesson) lessonViewModel2.f27417N.m10563a(ResultErrorLesson.class).m10532b(strM17355r);
                                if (resultErrorLesson == null) {
                                    resultErrorLesson = new ResultErrorLesson(null, 1, null);
                                }
                                if (!C7661i.m15250P2(resultErrorLesson.f18413a)) {
                                    c6553u2 = ((HttpException) exc).f46513a;
                                    if (c6553u2 != null || c6553u2.f37338a.f47566d != 401) {
                                        z10 = false;
                                    }
                                    if (!z10) {
                                        lessonViewModel2.f27518x1.mo14371k(resultErrorLesson.f18413a);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
                return C9072e.f47360a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = this.f27661f;
            lessonViewModel = this.f27660e;
            resource = (Resource) this.f27663h;
            C7499b.m14977z0(obj);
            list = list2;
            lessonViewModel.f27415M0.setValue(list);
            stateFlowImpl = lessonViewModel.f27412L0;
            triple = (Triple) stateFlowImpl.getValue();
            if (triple != null) {
                lessonViewModel.f27406J0.mo14371k(triple);
                stateFlowImpl.setValue(null);
            }
            if (C3304a.m9438a(resource)) {
                exc = resource.f17864c;
                if (exc instanceof HttpException) {
                    c6553u = ((HttpException) exc).f46513a;
                    if (c6553u != null) {
                        strM17355r = null;
                    } else {
                        strM17355r = null;
                    }
                    if (strM17355r != null) {
                        resultErrorLesson = (ResultErrorLesson) lessonViewModel2.f27417N.m10563a(ResultErrorLesson.class).m10532b(strM17355r);
                        if (resultErrorLesson == null) {
                            resultErrorLesson = new ResultErrorLesson(null, 1, null);
                        }
                        if (!C7661i.m15250P2(resultErrorLesson.f18413a)) {
                            c6553u2 = ((HttpException) exc).f46513a;
                            if (c6553u2 != null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                lessonViewModel2.f27518x1.mo14371k(resultErrorLesson.f18413a);
                            }
                        }
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$fetchLesson$1(LessonViewModel lessonViewModel, InterfaceC9968c interfaceC9968c, boolean z10) {
        super(2, interfaceC9968c);
        this.f27655f = lessonViewModel;
        this.f27656g = z10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$fetchLesson$1(this.f27655f, interfaceC9968c, this.f27656g);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$fetchLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27654e;
        boolean z10 = this.f27656g;
        LessonViewModel lessonViewModel = this.f27655f;
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
        int iIntValue = ((Number) lessonViewModel.f27470e0.getValue()).intValue();
        String strMo498E1 = lessonViewModel.mo498E1();
        this.f27654e = 1;
        obj = lessonViewModel.f27465d.mo9523k(strMo498E1, iIntValue, z10);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C42482(lessonViewModel, null, z10), new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new C42471(null)));
        C42493 c42493 = new C42493(lessonViewModel, null);
        this.f27654e = 2;
        if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c42493, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
