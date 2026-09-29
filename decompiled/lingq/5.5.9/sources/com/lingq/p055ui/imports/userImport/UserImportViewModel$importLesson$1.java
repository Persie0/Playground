package com.lingq.p055ui.imports.userImport;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.upgrade.UpgradeReason;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.storage.ProfileStoreImpl$special$$inlined$map$2;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import dm.C5207g;
import fj.C5546g;
import jp.C6553u;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1", m19206f = "UserImportViewModel.kt", m19207l = {178, 206}, m19208m = "invokeSuspend")
final class UserImportViewModel$importLesson$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26814e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportViewModel f26815f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$1 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$1", m19206f = "UserImportViewModel.kt", m19207l = {185, 184}, m19208m = "invokeSuspend")
    public static final class C41281 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super LessonStudy>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26816e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f26817f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ UserImportViewModel f26818g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ C5546g f26819h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41281(UserImportViewModel userImportViewModel, C5546g c5546g, InterfaceC9968c<? super C41281> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26818g = userImportViewModel;
            this.f26819h = c5546g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41281 c41281 = new C41281(this.f26818g, this.f26819h, interfaceC9968c);
            c41281.f26817f = obj;
            return c41281;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super LessonStudy> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41281) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            C5546g c5546g;
            LearningLevel learningLevel;
            Object objMo9529q;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26816e;
            if (i10 != 0) {
                if (i10 == 1) {
                    InterfaceC7117d interfaceC7117d2 = (InterfaceC7117d) this.f26817f;
                    C7499b.m14977z0(obj);
                    interfaceC7117d = interfaceC7117d2;
                    objMo9529q = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f26817f;
            LearningLevel[] learningLevelArrValues = LearningLevel.values();
            int length = learningLevelArrValues.length;
            int i11 = 0;
            while (true) {
                c5546g = this.f26819h;
                if (i11 >= length) {
                    learningLevel = null;
                    break;
                }
                learningLevel = learningLevelArrValues[i11];
                if (C5207g.m11106a(learningLevel.getServerName(), c5546g.f34283d)) {
                    break;
                }
                i11++;
            }
            if (learningLevel == null) {
                learningLevel = LearningLevel.Beginner1;
            }
            InterfaceC3324a interfaceC3324a = this.f26818g.f26805d;
            String str = c5546g.f34280a;
            String str2 = c5546g.f34281b;
            String str3 = c5546g.f34285f;
            String str4 = c5546g.f34282c;
            boolean zM11106a = C5207g.m11106a(c5546g.f34284e, "URL");
            int i12 = Integer.parseInt(learningLevel.getServerName());
            String str5 = c5546g.f34286g;
            this.f26817f = interfaceC7117d;
            this.f26816e = 1;
            objMo9529q = interfaceC3324a.mo9529q(str, str2, str3, str4, zM11106a, i12, str5, this);
            if (objMo9529q == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f26817f = null;
            this.f26816e = 2;
            if (interfaceC7117d.mo1339r(objMo9529q, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$2 */
    @Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$2", m19206f = "UserImportViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41292 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super LessonStudy>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ UserImportViewModel f26820e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41292(UserImportViewModel userImportViewModel, InterfaceC9968c<? super C41292> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26820e = userImportViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C41292(this.f26820e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super LessonStudy> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41292) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26820e.f26795I.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$3", m19206f = "UserImportViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41303 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super LessonStudy>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f26821e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UserImportViewModel f26822f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41303(UserImportViewModel userImportViewModel, InterfaceC9968c<? super C41303> interfaceC9968c) {
            super(3, interfaceC9968c);
            this.f26822f = userImportViewModel;
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super LessonStudy> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C41303 c41303 = new C41303(this.f26822f, interfaceC9968c);
            c41303.f26821e = th2;
            return c41303.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Throwable th2 = this.f26821e;
            UserImportViewModel userImportViewModel = this.f26822f;
            userImportViewModel.f26795I.setValue(Resource.Status.ERROR);
            if (th2 instanceof HttpException) {
                C6553u<?> c6553u = ((HttpException) th2).f46513a;
                boolean z10 = c6553u != null && c6553u.f37338a.f47566d == 400;
                C7138s c7138s = userImportViewModel.f26799M;
                if (z10) {
                    c7138s.mo14371k("This video does not have any captions. Please try with a different video.");
                } else {
                    c7138s.mo14371k("");
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$4 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportViewModel$importLesson$1$4", m19206f = "UserImportViewModel.kt", m19207l = {208, 210}, m19208m = "invokeSuspend")
    public static final class C41314 extends SuspendLambda implements InterfaceC2056p<LessonStudy, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public UserImportViewModel f26823e;

        /* JADX INFO: renamed from: f */
        public C5546g f26824f;

        /* JADX INFO: renamed from: g */
        public LessonStudy f26825g;

        /* JADX INFO: renamed from: h */
        public int f26826h;

        /* JADX INFO: renamed from: i */
        public /* synthetic */ Object f26827i;

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ UserImportViewModel f26828j;

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ C5546g f26829k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41314(UserImportViewModel userImportViewModel, C5546g c5546g, InterfaceC9968c<? super C41314> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26828j = userImportViewModel;
            this.f26829k = c5546g;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41314 c41314 = new C41314(this.f26828j, this.f26829k, interfaceC9968c);
            c41314.f26827i = obj;
            return c41314;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(LessonStudy lessonStudy, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41314) mo1336a(lessonStudy, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            LessonStudy lessonStudy;
            C5546g c5546g;
            UserImportViewModel userImportViewModel;
            LessonStudy lessonStudy2;
            LessonStudy lessonStudy3;
            C5546g c5546g2;
            UserImportViewModel userImportViewModel2;
            LessonStudy lessonStudy4;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26826h;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                LessonStudy lessonStudy5 = (LessonStudy) this.f26827i;
                if (lessonStudy5 != null) {
                    UserImportViewModel userImportViewModel3 = this.f26828j;
                    ProfileStoreImpl$special$$inlined$map$2 profileStoreImpl$special$$inlined$map$2Mo9624m = userImportViewModel3.f26806e.mo9624m();
                    this.f26827i = lessonStudy5;
                    this.f26823e = userImportViewModel3;
                    C5546g c5546g3 = this.f26829k;
                    this.f26824f = c5546g3;
                    this.f26825g = lessonStudy5;
                    this.f26826h = 1;
                    Object objM14360a = FlowKt__ReduceKt.m14360a(profileStoreImpl$special$$inlined$map$2Mo9624m, this);
                    if (objM14360a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonStudy = lessonStudy5;
                    obj = objM14360a;
                    c5546g = c5546g3;
                    userImportViewModel = userImportViewModel3;
                    lessonStudy2 = lessonStudy;
                }
                return C9072e.f47360a;
            }
            if (i10 == 1) {
                lessonStudy2 = this.f26825g;
                c5546g = this.f26824f;
                userImportViewModel = this.f26823e;
                lessonStudy = (LessonStudy) this.f26827i;
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                lessonStudy3 = this.f26825g;
                c5546g2 = this.f26824f;
                userImportViewModel2 = this.f26823e;
                lessonStudy4 = (LessonStudy) this.f26827i;
                C7499b.m14977z0(obj);
            }
            Bundle bundle = new Bundle();
            bundle.putString("Lesson ID", String.valueOf(lessonStudy4.f21815a));
            bundle.putString("Lesson name", lessonStudy4.f21816b);
            bundle.putString("Lesson language", c5546g2.f34280a);
            bundle.putString("Lesson level", lessonStudy4.f21832r);
            bundle.putString("Import Method", "Manual");
            userImportViewModel2.f26807f.m15505b(bundle, "lesson_import");
            userImportViewModel2.f26813l.setValue(lessonStudy3);
            return C9072e.f47360a;
            ProfileAccount profileAccount = (ProfileAccount) obj;
            profileAccount.f17811k++;
            this.f26827i = lessonStudy;
            this.f26823e = userImportViewModel;
            this.f26824f = c5546g;
            this.f26825g = lessonStudy2;
            this.f26826h = 2;
            if (userImportViewModel.mo505l0(profileAccount, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonStudy3 = lessonStudy2;
            c5546g2 = c5546g;
            userImportViewModel2 = userImportViewModel;
            lessonStudy4 = lessonStudy;
            Bundle bundle2 = new Bundle();
            bundle2.putString("Lesson ID", String.valueOf(lessonStudy4.f21815a));
            bundle2.putString("Lesson name", lessonStudy4.f21816b);
            bundle2.putString("Lesson language", c5546g2.f34280a);
            bundle2.putString("Lesson level", lessonStudy4.f21832r);
            bundle2.putString("Import Method", "Manual");
            userImportViewModel2.f26807f.m15505b(bundle2, "lesson_import");
            userImportViewModel2.f26813l.setValue(lessonStudy3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$importLesson$1(UserImportViewModel userImportViewModel, InterfaceC9968c<? super UserImportViewModel$importLesson$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26815f = userImportViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportViewModel$importLesson$1(this.f26815f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportViewModel$importLesson$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26814e;
        UserImportViewModel userImportViewModel = this.f26815f;
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
        InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = userImportViewModel.mo508t1();
        this.f26814e = 1;
        obj = FlowKt__ReduceKt.m14360a(interfaceC7116cMo508t1, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        ProfileAccount profileAccount = (ProfileAccount) obj;
        C5546g value = userImportViewModel.mo10080T1().getValue();
        if (userImportViewModel.mo502f0() || profileAccount.f17811k < 5) {
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C41292(userImportViewModel, null), new C7136q(new C41281(userImportViewModel, value, null))), new C41303(userImportViewModel, null));
            C41314 c41314 = new C41314(userImportViewModel, value, null);
            this.f26814e = 2;
            if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c41314, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            userImportViewModel.f26801O.mo14371k(Boolean.TRUE);
            userImportViewModel.mo9771A(UpgradeReason.LIMIT_IMPORTS);
        }
        return C9072e.f47360a;
    }
}
