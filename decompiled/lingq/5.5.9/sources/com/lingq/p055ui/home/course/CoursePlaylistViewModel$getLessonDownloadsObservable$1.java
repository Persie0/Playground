package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import ki.C6698d;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getLessonDownloadsObservable$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {294}, m19208m = "invokeSuspend")
final class CoursePlaylistViewModel$getLessonDownloadsObservable$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23906e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistViewModel f23907f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23908g;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$getLessonDownloadsObservable$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/d;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getLessonDownloadsObservable$1$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36641 extends SuspendLambda implements InterfaceC2056p<List<? extends C6698d>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23909e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistViewModel f23910f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36641(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super C36641> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23910f = coursePlaylistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36641 c36641 = new C36641(this.f23910f, interfaceC9968c);
            c36641.f23909e = obj;
            return c36641;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6698d> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36641) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23910f.f23824M.setValue(C6752c.m13421O((List) this.f23909e));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$getLessonDownloadsObservable$1(CoursePlaylistViewModel coursePlaylistViewModel, String str, InterfaceC9968c<? super CoursePlaylistViewModel$getLessonDownloadsObservable$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23907f = coursePlaylistViewModel;
        this.f23908g = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$getLessonDownloadsObservable$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$getLessonDownloadsObservable$1(this.f23907f, this.f23908g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23906e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CoursePlaylistViewModel coursePlaylistViewModel = this.f23907f;
            InterfaceC7116c<List<C6698d>> interfaceC7116cMo6105K = coursePlaylistViewModel.f23841d.mo6105K(this.f23908g);
            C36641 c36641 = new C36641(coursePlaylistViewModel, null);
            this.f23906e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6105K, c36641, this) == coroutineSingletons) {
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
