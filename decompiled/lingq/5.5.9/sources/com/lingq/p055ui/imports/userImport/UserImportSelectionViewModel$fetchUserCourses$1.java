package com.lingq.p055ui.imports.userImport;

import ci.InterfaceC2010c;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.C3304a;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.language.UserCourseForImport;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.sequences.C7073a;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p249lo.C7421n;
import p260m8.C7499b;
import p278nh.C7785l;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import retrofit2.HttpException;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1", m19206f = "UserImportSelectionViewModel.kt", m19207l = {141}, m19208m = "invokeSuspend")
final class UserImportSelectionViewModel$fetchUserCourses$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26744e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UserImportSelectionViewModel f26745f;

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/language/UserCourseForImport;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$1", m19206f = "UserImportSelectionViewModel.kt", m19207l = {136, 136}, m19208m = "invokeSuspend")
    public static final class C41191 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f26746e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f26747f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ UserImportSelectionViewModel f26748g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41191(UserImportSelectionViewModel userImportSelectionViewModel, InterfaceC9968c<? super C41191> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26748g = userImportSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C41191 c41191 = new C41191(this.f26748g, interfaceC9968c);
            c41191.f26747f = obj;
            return c41191;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41191) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f26746e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f26747f;
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
            }
            C7499b.m14977z0(obj);
            interfaceC7117d = (InterfaceC7117d) this.f26747f;
            UserImportSelectionViewModel userImportSelectionViewModel = this.f26748g;
            InterfaceC2010c interfaceC2010c = userImportSelectionViewModel.f26728d;
            String str = userImportSelectionViewModel.mo10080T1().getValue().f34280a;
            this.f26747f = interfaceC7117d;
            this.f26746e = 1;
            obj = interfaceC2010c.mo5996e(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f26747f = null;
            this.f26746e = 2;
            return interfaceC7117d.mo1339r(obj, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$2 */
    @Metadata(m13364d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/language/UserCourseForImport;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$2", m19206f = "UserImportSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41202 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f26749e;

        public C41202(InterfaceC9968c<? super C41202> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C41202 c41202 = new C41202(interfaceC9968c);
            c41202.f26749e = th2;
            return c41202.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26749e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0016\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lcom/lingq/shared/uimodel/language/UserCourseForImport;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$3", m19206f = "UserImportSelectionViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C41213 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ UserImportSelectionViewModel f26750e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41213(UserImportSelectionViewModel userImportSelectionViewModel, InterfaceC9968c<? super C41213> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f26750e = userImportSelectionViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C41213(this.f26750e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends List<? extends UserCourseForImport>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C41213) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f26750e.f26732h.setValue(Boolean.TRUE);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$a */
    public static final class C4122a implements InterfaceC7117d<Resource<? extends List<? extends UserCourseForImport>>> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ UserImportSelectionViewModel f26753a;

        public C4122a(UserImportSelectionViewModel userImportSelectionViewModel) {
            this.f26753a = userImportSelectionViewModel;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(Resource<? extends List<? extends UserCourseForImport>> resource, InterfaceC9968c interfaceC9968c) {
            Resource<? extends List<? extends UserCourseForImport>> resource2 = resource;
            UserImportSelectionViewModel userImportSelectionViewModel = this.f26753a;
            userImportSelectionViewModel.f26732h.setValue(Boolean.valueOf(resource2.f17862a == Resource.Status.LOADING));
            List list = (List) resource2.f17863b;
            List<String> listM14267b3 = list != null ? C7073a.m14267b3(new C7421n(C7073a.m14261V2(C7073a.m14255P2(C7073a.m14257R2(C6752c.m13413G(list)), new InterfaceC2052l<UserCourseForImport, Boolean>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$4$emit$courses$1
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final Boolean mo528n(UserCourseForImport userCourseForImport) {
                    UserCourseForImport userCourseForImport2 = userCourseForImport;
                    C5207g.m11111f(userCourseForImport2, "it");
                    return Boolean.valueOf(userCourseForImport2.f21698b != 0);
                }
            }), new InterfaceC2052l<UserCourseForImport, String>() { // from class: com.lingq.ui.imports.userImport.UserImportSelectionViewModel$fetchUserCourses$1$4$emit$courses$2
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final String mo528n(UserCourseForImport userCourseForImport) {
                    UserCourseForImport userCourseForImport2 = userCourseForImport;
                    C5207g.m11111f(userCourseForImport2, "it");
                    return userCourseForImport2.f21699c;
                }
            }))) : new ArrayList();
            if (!listM14267b3.contains("Quick Imports")) {
                listM14267b3.add(0, "Quick Imports");
            }
            ArrayList arrayList = new ArrayList(C9325m.m17681z(listM14267b3, 10));
            for (String str : listM14267b3) {
                arrayList.add(new C7785l(null, str, C5207g.m11106a(str, userImportSelectionViewModel.mo10080T1().getValue().f34282c), str, 1));
            }
            userImportSelectionViewModel.f26736l.setValue(arrayList);
            if (C3304a.m9438a(resource2)) {
                Exception exc = resource2.f17864c;
                if (exc instanceof HttpException) {
                    userImportSelectionViewModel.f26734j.mo14371k(exc);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$fetchUserCourses$1(UserImportSelectionViewModel userImportSelectionViewModel, InterfaceC9968c<? super UserImportSelectionViewModel$fetchUserCourses$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f26745f = userImportSelectionViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UserImportSelectionViewModel$fetchUserCourses$1(this.f26745f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UserImportSelectionViewModel$fetchUserCourses$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26744e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            UserImportSelectionViewModel userImportSelectionViewModel = this.f26745f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C41213(userImportSelectionViewModel, null), new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new C7136q(new C41191(userImportSelectionViewModel, null)), new C41202(null)));
            C4122a c4122a = new C4122a(userImportSelectionViewModel);
            this.f26744e = 1;
            if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.mo9539a(c4122a, this) == coroutineSingletons) {
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
