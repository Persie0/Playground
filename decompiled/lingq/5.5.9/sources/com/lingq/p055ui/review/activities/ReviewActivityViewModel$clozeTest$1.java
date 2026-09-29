package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.support.v4.media.session.C0166e;
import ci.InterfaceC2008a;
import ci.InterfaceC2025r;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.lesson.LessonStudySentence;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import li.C7374a;
import p260m8.C7499b;
import p264mi.C7561a;
import p264mi.C7562b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$clozeTest$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {109, 114}, m19208m = "invokeSuspend")
final class ReviewActivityViewModel$clozeTest$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30171e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityViewModel f30172f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityViewModel$clozeTest$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "Lmi/b;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$clozeTest$1$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46601 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends C7562b>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f30173e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityViewModel f30174f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46601(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super C46601> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f30174f = reviewActivityViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Resource<? extends C7562b>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C46601 c46601 = new C46601(this.f30174f, interfaceC9968c);
            c46601.f30173e = th2;
            return c46601.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Throwable th2 = this.f30173e;
            StateFlowImpl stateFlowImpl = this.f30174f.f30152J;
            Resource.C3303a c3303a = Resource.f17861d;
            C5207g.m11109d(th2, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            stateFlowImpl.setValue(Resource.C3303a.m9436b(c3303a, (Exception) th2));
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityViewModel$clozeTest$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lmi/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$clozeTest$1$2", m19206f = "ReviewActivityViewModel.kt", m19207l = {121, 123}, m19208m = "invokeSuspend")
    public static final class C46612 extends SuspendLambda implements InterfaceC2056p<Resource<? extends C7562b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public C7562b f30175e;

        /* JADX INFO: renamed from: f */
        public String f30176f;

        /* JADX INFO: renamed from: g */
        public int f30177g;

        /* JADX INFO: renamed from: h */
        public /* synthetic */ Object f30178h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ ReviewActivityViewModel f30179i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46612(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super C46612> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30179i = reviewActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46612 c46612 = new C46612(this.f30179i, interfaceC9968c);
            c46612.f30178h = obj;
            return c46612;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends C7562b> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46612) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:45:0x00dc A[LOOP:0: B:43:0x00d6->B:45:0x00dc, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:48:0x0102  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            T t10;
            C7562b c7562b;
            String str;
            String str2;
            ReviewActivityViewModel reviewActivityViewModel;
            LessonStudySentence lessonStudySentence;
            String str3;
            ArrayList arrayList;
            String str4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f30177g;
            String str5 = "";
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Resource resource = (Resource) this.f30178h;
                Resource.Status status = resource.f17862a;
                Resource.Status status2 = Resource.Status.SUCCESS;
                ReviewActivityViewModel reviewActivityViewModel2 = this.f30179i;
                if (status != status2 || (t10 = resource.f17863b) == 0) {
                    reviewActivityViewModel2.f30152J.setValue(resource);
                } else {
                    c7562b = (C7562b) t10;
                    if (c7562b.f41677b.isEmpty()) {
                        C7374a c7374a = (C7374a) reviewActivityViewModel2.f30150H.getValue();
                        if (c7374a == null || (str = c7374a.f41142a) == null) {
                            str = str5;
                        }
                        InterfaceC2008a interfaceC2008a = reviewActivityViewModel2.f30158d;
                        int i11 = reviewActivityViewModel2.f30165k;
                        if (i11 == -1) {
                            this.f30178h = reviewActivityViewModel2;
                            this.f30175e = c7562b;
                            this.f30176f = str;
                            this.f30177g = 1;
                            Object objMo5952d = interfaceC2008a.mo5952d(str, this);
                            if (objMo5952d == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str2 = str;
                            obj = objMo5952d;
                            reviewActivityViewModel = reviewActivityViewModel2;
                            lessonStudySentence = (LessonStudySentence) obj;
                            if (lessonStudySentence != null) {
                                str3 = str5;
                            } else {
                                str3 = str5;
                            }
                            List<String> listM14273d = new Regex("\\s+").m14273d(str3);
                            arrayList = new ArrayList(C9325m.m17681z(listM14273d, 10));
                            for (String str6 : listM14273d) {
                                arrayList.add(new C7561a(C0166e.m765k(str6, " "), C5207g.m11106a(str6, str2)));
                            }
                            c7562b.getClass();
                            c7562b.f41677b = arrayList;
                            if (lessonStudySentence != null) {
                                str5 = str4;
                            }
                            c7562b.f41676a = str5;
                            StateFlowImpl stateFlowImpl = reviewActivityViewModel.f30152J;
                            Resource.f17861d.getClass();
                            stateFlowImpl.setValue(Resource.C3303a.m9437c(c7562b));
                        } else {
                            this.f30178h = reviewActivityViewModel2;
                            this.f30175e = c7562b;
                            this.f30176f = str;
                            this.f30177g = 2;
                            Object objMo5964p = interfaceC2008a.mo5964p(i11, str, this);
                            if (objMo5964p == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            str2 = str;
                            obj = objMo5964p;
                            reviewActivityViewModel = reviewActivityViewModel2;
                            lessonStudySentence = (LessonStudySentence) obj;
                            if (lessonStudySentence != null) {
                                str3 = str5;
                            } else {
                                str3 = str5;
                            }
                            List<String> listM14273d2 = new Regex("\\s+").m14273d(str3);
                            arrayList = new ArrayList(C9325m.m17681z(listM14273d2, 10));
                            while (r11.hasNext()) {
                                arrayList.add(new C7561a(C0166e.m765k(str6, " "), C5207g.m11106a(str6, str2)));
                            }
                            c7562b.getClass();
                            c7562b.f41677b = arrayList;
                            if (lessonStudySentence != null) {
                                str5 = str4;
                            }
                            c7562b.f41676a = str5;
                            StateFlowImpl stateFlowImpl2 = reviewActivityViewModel.f30152J;
                            Resource.f17861d.getClass();
                            stateFlowImpl2.setValue(Resource.C3303a.m9437c(c7562b));
                        }
                    } else {
                        reviewActivityViewModel2.f30152J.setValue(resource);
                    }
                }
            } else if (i10 == 1) {
                str2 = this.f30176f;
                c7562b = this.f30175e;
                reviewActivityViewModel = (ReviewActivityViewModel) this.f30178h;
                C7499b.m14977z0(obj);
                lessonStudySentence = (LessonStudySentence) obj;
                if (lessonStudySentence != null) {
                    str3 = str5;
                } else {
                    str3 = str5;
                }
                List<String> listM14273d3 = new Regex("\\s+").m14273d(str3);
                arrayList = new ArrayList(C9325m.m17681z(listM14273d3, 10));
                while (r11.hasNext()) {
                    arrayList.add(new C7561a(C0166e.m765k(str6, " "), C5207g.m11106a(str6, str2)));
                }
                c7562b.getClass();
                c7562b.f41677b = arrayList;
                if (lessonStudySentence != null) {
                    str5 = str4;
                }
                c7562b.f41676a = str5;
                StateFlowImpl stateFlowImpl3 = reviewActivityViewModel.f30152J;
                Resource.f17861d.getClass();
                stateFlowImpl3.setValue(Resource.C3303a.m9437c(c7562b));
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = this.f30176f;
                c7562b = this.f30175e;
                reviewActivityViewModel = (ReviewActivityViewModel) this.f30178h;
                C7499b.m14977z0(obj);
                lessonStudySentence = (LessonStudySentence) obj;
                if (lessonStudySentence != null || (str3 = lessonStudySentence.f21860c) == null) {
                    str3 = str5;
                }
                List<String> listM14273d4 = new Regex("\\s+").m14273d(str3);
                arrayList = new ArrayList(C9325m.m17681z(listM14273d4, 10));
                while (r11.hasNext()) {
                    arrayList.add(new C7561a(C0166e.m765k(str6, " "), C5207g.m11106a(str6, str2)));
                }
                c7562b.getClass();
                c7562b.f41677b = arrayList;
                if (lessonStudySentence != null && (str4 = lessonStudySentence.f21860c) != null) {
                    str5 = str4;
                }
                c7562b.f41676a = str5;
                StateFlowImpl stateFlowImpl4 = reviewActivityViewModel.f30152J;
                Resource.f17861d.getClass();
                stateFlowImpl4.setValue(Resource.C3303a.m9437c(c7562b));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$clozeTest$1(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super ReviewActivityViewModel$clozeTest$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f30172f = reviewActivityViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityViewModel$clozeTest$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityViewModel$clozeTest$1(this.f30172f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30171e;
        ReviewActivityViewModel reviewActivityViewModel = this.f30172f;
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
        InterfaceC2025r interfaceC2025r = reviewActivityViewModel.f30159e;
        String strMo498E1 = reviewActivityViewModel.mo498E1();
        C7374a c7374a = (C7374a) reviewActivityViewModel.f30150H.getValue();
        int i11 = c7374a != null ? c7374a.f41149h : 0;
        this.f30171e = 1;
        obj = interfaceC2025r.mo6183e(i11, strMo498E1);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1((InterfaceC7116c) obj, new C46601(reviewActivityViewModel, null));
        C46612 c46612 = new C46612(reviewActivityViewModel, null);
        this.f30171e = 2;
        if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c46612, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
