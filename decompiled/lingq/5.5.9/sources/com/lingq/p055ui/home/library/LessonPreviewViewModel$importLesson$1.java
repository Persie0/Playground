package com.lingq.p055ui.home.library;

import android.os.Bundle;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1", m19206f = "LessonPreviewViewModel.kt", m19207l = {46, 60}, m19208m = "invokeSuspend")
final class LessonPreviewViewModel$importLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24580e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPreviewViewModel f24581f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24582g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f24583h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f24584i;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$1", m19206f = "LessonPreviewViewModel.kt", m19207l = {50, 49}, m19208m = "invokeSuspend")
    public static final class C37511 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super LessonStudy>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24585e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f24586f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LessonPreviewViewModel f24587g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f24588h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f24589i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37511(LessonPreviewViewModel lessonPreviewViewModel, String str, String str2, InterfaceC9968c<? super C37511> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24587g = lessonPreviewViewModel;
            this.f24588h = str;
            this.f24589i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37511 c37511 = new C37511(this.f24587g, this.f24588h, this.f24589i, interfaceC9968c);
            c37511.f24586f = obj;
            return c37511;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super LessonStudy> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37511) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24585e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f24586f;
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
            interfaceC7117d = (InterfaceC7117d) this.f24586f;
            LessonPreviewViewModel lessonPreviewViewModel = this.f24587g;
            InterfaceC3324a interfaceC3324a = lessonPreviewViewModel.f24571d;
            String strMo498E1 = lessonPreviewViewModel.mo498E1();
            this.f24586f = interfaceC7117d;
            this.f24585e = 1;
            obj = interfaceC3324a.mo9480B(strMo498E1, this.f24588h, this.f24589i, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f24586f = null;
            this.f24585e = 2;
            if (interfaceC7117d.mo1339r(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$2 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$2", m19206f = "LessonPreviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37522 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super LessonStudy>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LessonPreviewViewModel f24590e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37522(LessonPreviewViewModel lessonPreviewViewModel, InterfaceC9968c<? super C37522> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24590e = lessonPreviewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37522(this.f24590e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super LessonStudy> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37522) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24590e.f24578k.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$3", m19206f = "LessonPreviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37533 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super LessonStudy>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f24591e;

        public C37533(InterfaceC9968c<? super C37533> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super LessonStudy> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C37533 c37533 = new C37533(interfaceC9968c);
            c37533.f24591e = th2;
            return c37533.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24591e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LessonPreviewViewModel$importLesson$1$4 */
    public static final class C37544 implements InterfaceC7117d<LessonStudy> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ LessonPreviewViewModel f24592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f24593b;

        public C37544(LessonPreviewViewModel lessonPreviewViewModel, int i10) {
            this.f24592a = lessonPreviewViewModel;
            this.f24593b = i10;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x013f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:40:0x0153  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object mo1339r(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
            LessonPreviewViewModel$importLesson$1$4$emit$1 lessonPreviewViewModel$importLesson$1$4$emit$1;
            LessonPreviewViewModel lessonPreviewViewModel;
            Object obj;
            int i10;
            LessonStudy lessonStudy2;
            LessonStudy lessonStudy3;
            int i11;
            LessonStudy lessonStudy4;
            LessonPreviewViewModel lessonPreviewViewModel2;
            InterfaceC3324a interfaceC3324a;
            String strMo498E1;
            if (interfaceC9968c instanceof LessonPreviewViewModel$importLesson$1$4$emit$1) {
                lessonPreviewViewModel$importLesson$1$4$emit$1 = (LessonPreviewViewModel$importLesson$1$4$emit$1) interfaceC9968c;
                int i12 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j;
                if ((i12 & Integer.MIN_VALUE) != 0) {
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = i12 - Integer.MIN_VALUE;
                } else {
                    lessonPreviewViewModel$importLesson$1$4$emit$1 = new LessonPreviewViewModel$importLesson$1$4$emit$1(this, interfaceC9968c);
                }
            } else {
                lessonPreviewViewModel$importLesson$1$4$emit$1 = new LessonPreviewViewModel$importLesson$1$4$emit$1(this, interfaceC9968c);
            }
            Object obj2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24598h;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i13 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j;
            try {
                if (i13 == 0) {
                    C7499b.m14977z0(obj2);
                    if (lessonStudy != null) {
                        LessonPreviewViewModel lessonPreviewViewModel3 = this.f24592a;
                        lessonPreviewViewModel3.f24578k.setValue(Boolean.FALSE);
                        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = lessonPreviewViewModel3.mo508t1();
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = lessonStudy;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e = lessonPreviewViewModel3;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f = lessonStudy;
                        int i14 = this.f24593b;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g = i14;
                        lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 1;
                        Object objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, lessonPreviewViewModel$importLesson$1$4$emit$1);
                        if (objM14360a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        lessonPreviewViewModel = lessonPreviewViewModel3;
                        obj = objM14360a;
                        i10 = i14;
                        lessonStudy2 = lessonStudy;
                    }
                    return C9072e.f47360a;
                }
                if (i13 == 1) {
                    int i15 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g;
                    lessonStudy2 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f;
                    LessonPreviewViewModel lessonPreviewViewModel4 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e;
                    LessonStudy lessonStudy5 = (LessonStudy) lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d;
                    C7499b.m14977z0(obj2);
                    i10 = i15;
                    lessonStudy = lessonStudy5;
                    lessonPreviewViewModel = lessonPreviewViewModel4;
                    obj = obj2;
                } else if (i13 == 2) {
                    i11 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g;
                    LessonStudy lessonStudy6 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f;
                    LessonPreviewViewModel lessonPreviewViewModel5 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e;
                    lessonStudy3 = (LessonStudy) lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d;
                    C7499b.m14977z0(obj2);
                    lessonStudy4 = lessonStudy6;
                    lessonPreviewViewModel2 = lessonPreviewViewModel5;
                    Bundle bundle = new Bundle();
                    bundle.putString("Lesson ID", String.valueOf(lessonStudy3.f21815a));
                    bundle.putString("Lesson name", lessonStudy3.f21816b);
                    bundle.putString("Lesson language", lessonPreviewViewModel2.mo498E1());
                    bundle.putString("Lesson level", lessonStudy3.f21832r);
                    bundle.putString("Import Method", "External");
                    lessonPreviewViewModel2.f24573f.m15505b(bundle, "lesson_import");
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = lessonPreviewViewModel2;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g = i11;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 3;
                    if (lessonPreviewViewModel2.f24569H.mo16480k(lessonStudy4, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    interfaceC3324a = lessonPreviewViewModel2.f24571d;
                    strMo498E1 = lessonPreviewViewModel2.mo498E1();
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 4;
                    if (interfaceC3324a.mo9509c(i11, strMo498E1, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i13 == 3) {
                    i11 = lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g;
                    lessonPreviewViewModel2 = (LessonPreviewViewModel) lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d;
                    C7499b.m14977z0(obj2);
                    interfaceC3324a = lessonPreviewViewModel2.f24571d;
                    strMo498E1 = lessonPreviewViewModel2.mo498E1();
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = null;
                    lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 4;
                    if (interfaceC3324a.mo9509c(i11, strMo498E1, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i13 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj2);
                }
                return C9072e.f47360a;
                ProfileAccount profileAccount = (ProfileAccount) obj;
                profileAccount.f17811k++;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = lessonStudy;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e = lessonPreviewViewModel;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f = lessonStudy2;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g = i10;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 2;
                if (lessonPreviewViewModel.mo505l0(profileAccount, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonStudy3 = lessonStudy;
                i11 = i10;
                lessonStudy4 = lessonStudy2;
                lessonPreviewViewModel2 = lessonPreviewViewModel;
                Bundle bundle2 = new Bundle();
                bundle2.putString("Lesson ID", String.valueOf(lessonStudy3.f21815a));
                bundle2.putString("Lesson name", lessonStudy3.f21816b);
                bundle2.putString("Lesson language", lessonPreviewViewModel2.mo498E1());
                bundle2.putString("Lesson level", lessonStudy3.f21832r);
                bundle2.putString("Import Method", "External");
                lessonPreviewViewModel2.f24573f.m15505b(bundle2, "lesson_import");
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = lessonPreviewViewModel2;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24595e = null;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24596f = null;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24597g = i11;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 3;
                if (lessonPreviewViewModel2.f24569H.mo16480k(lessonStudy4, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                interfaceC3324a = lessonPreviewViewModel2.f24571d;
                strMo498E1 = lessonPreviewViewModel2.mo498E1();
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24594d = null;
                lessonPreviewViewModel$importLesson$1$4$emit$1.f24600j = 4;
                if (interfaceC3324a.mo9509c(i11, strMo498E1, lessonPreviewViewModel$importLesson$1$4$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPreviewViewModel$importLesson$1(LessonPreviewViewModel lessonPreviewViewModel, String str, String str2, int i10, InterfaceC9968c<? super LessonPreviewViewModel$importLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24581f = lessonPreviewViewModel;
        this.f24582g = str;
        this.f24583h = str2;
        this.f24584i = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPreviewViewModel$importLesson$1(this.f24581f, this.f24582g, this.f24583h, this.f24584i, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPreviewViewModel$importLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24580e;
        LessonPreviewViewModel lessonPreviewViewModel = this.f24581f;
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
        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = lessonPreviewViewModel.mo508t1();
        this.f24580e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        if (lessonPreviewViewModel.mo502f0() || profileAccount.f17811k < 5) {
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37522(lessonPreviewViewModel, null), new C7136q(new C37511(lessonPreviewViewModel, this.f24582g, this.f24583h, null))), new C37533(null));
            C37544 c37544 = new C37544(lessonPreviewViewModel, this.f24584i);
            this.f24580e = 2;
            if (flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.mo9539a(c37544, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            lessonPreviewViewModel.mo9771A(UpgradeReason.LIMIT_IMPORTS);
        }
        return C9072e.f47360a;
    }
}
