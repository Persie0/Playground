package com.lingq.p055ui.lesson;

import ci.InterfaceC2016i;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$meetMilestone$1", m19206f = "LessonViewModel.kt", m19207l = {1924, 1925}, m19208m = "invokeSuspend")
final class LessonViewModel$meetMilestone$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27696e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27697f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$meetMilestone$1(LessonViewModel lessonViewModel, String str, InterfaceC9968c<? super LessonViewModel$meetMilestone$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27697f = lessonViewModel;
        this.f27698g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$meetMilestone$1(this.f27697f, this.f27698g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$meetMilestone$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27696e;
        LessonViewModel lessonViewModel = this.f27697f;
        try {
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
            InterfaceC2016i interfaceC2016i = lessonViewModel.f27489k;
            String strMo498E1 = lessonViewModel.mo498E1();
            String str = this.f27698g;
            String strM10456e = C4924a.m10456e();
            this.f27696e = 1;
            if (interfaceC2016i.mo6081b(strMo498E1, str, strM10456e, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            InterfaceC2016i interfaceC2016i2 = lessonViewModel.f27489k;
            String strMo498E2 = lessonViewModel.mo498E1();
            this.f27696e = 2;
            if (interfaceC2016i2.mo6083d(strMo498E2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
