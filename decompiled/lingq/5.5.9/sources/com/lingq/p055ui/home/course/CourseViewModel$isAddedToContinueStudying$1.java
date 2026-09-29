package com.lingq.p055ui.home.course;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$isAddedToContinueStudying$1", m19206f = "CourseViewModel.kt", m19207l = {446, 447}, m19208m = "invokeSuspend")
final class CourseViewModel$isAddedToContinueStudying$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24089e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24090f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$isAddedToContinueStudying$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$isAddedToContinueStudying$1$1", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36791 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f24091e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseViewModel f24092f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36791(CourseViewModel courseViewModel, InterfaceC9968c<? super C36791> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24092f = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36791 c36791 = new C36791(this.f24092f, interfaceC9968c);
            c36791.f24091e = ((Boolean) obj).booleanValue();
            return c36791;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36791) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24092f.f23928K.setValue(Boolean.valueOf(this.f24091e));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$isAddedToContinueStudying$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$isAddedToContinueStudying$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24090f = courseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$isAddedToContinueStudying$1(this.f24090f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$isAddedToContinueStudying$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24089e;
        CourseViewModel courseViewModel = this.f24090f;
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
        InterfaceC2014g interfaceC2014g = courseViewModel.f23951f;
        int i11 = courseViewModel.f23927J.f49749a;
        this.f24089e = 1;
        obj = interfaceC2014g.mo6063i(i11);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C36791 c36791 = new C36791(courseViewModel, null);
        this.f24089e = 2;
        if (C0062b.m369m0((InterfaceC7116c) obj, c36791, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }
}
