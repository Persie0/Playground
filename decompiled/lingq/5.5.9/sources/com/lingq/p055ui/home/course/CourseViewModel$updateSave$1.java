package com.lingq.p055ui.home.course;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6332a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$updateSave$1", m19206f = "CourseViewModel.kt", m19207l = {536}, m19208m = "invokeSuspend")
final class CourseViewModel$updateSave$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24137e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24138f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$updateSave$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$updateSave$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24138f = courseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$updateSave$1(this.f24138f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$updateSave$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24137e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CourseViewModel courseViewModel = this.f24138f;
            C6332a c6332a = (C6332a) C6752c.m13425S((List) courseViewModel.f23945b0.getValue());
            if (c6332a != null) {
                int i11 = c6332a.f36595a;
                InterfaceC3324a interfaceC3324a = courseViewModel.f23949e;
                UserLanguage value = courseViewModel.mo509w0().getValue();
                int i12 = value != null ? value.f21727b : 0;
                String strMo498E1 = courseViewModel.mo498E1();
                this.f24137e = 1;
                if (interfaceC3324a.mo9490L(i12, i11, strMo498E1, this, true) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
