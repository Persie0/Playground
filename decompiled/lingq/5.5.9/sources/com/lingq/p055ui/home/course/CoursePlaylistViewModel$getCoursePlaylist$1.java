package com.lingq.p055ui.home.course;

import ae.C0062b;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.CoursePlaylistSort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C6697c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import p003a2.C0009a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getCoursePlaylist$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {279}, m19208m = "invokeSuspend")
public final class CoursePlaylistViewModel$getCoursePlaylist$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23887e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CoursePlaylistViewModel f23888f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$getCoursePlaylist$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lki/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getCoursePlaylist$1$1", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36601 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C6697c>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CoursePlaylistViewModel f23889e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36601(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super C36601> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23889e = coursePlaylistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C36601(this.f23889e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C6697c>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36601) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23889e.f23833V.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CoursePlaylistViewModel$getCoursePlaylist$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lki/c;", "data", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CoursePlaylistViewModel$getCoursePlaylist$1$2", m19206f = "CoursePlaylistViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36612 extends SuspendLambda implements InterfaceC2056p<List<? extends C6697c>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23890e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CoursePlaylistViewModel f23891f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36612(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super C36612> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23891f = coursePlaylistViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36612 c36612 = new C36612(this.f23891f, interfaceC9968c);
            c36612.f23890e = obj;
            return c36612;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6697c> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36612) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f23890e;
            CoursePlaylistViewModel coursePlaylistViewModel = this.f23891f;
            coursePlaylistViewModel.f23833V.setValue(Resource.Status.SUCCESS);
            coursePlaylistViewModel.f23829R.setValue(Boolean.valueOf(list.isEmpty()));
            coursePlaylistViewModel.f23827P.setValue(list);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0009a.m30s(((C6697c) it.next()).f37856a, arrayList);
            }
            C7828f.m15570d(C8573r0.m16767w0(coursePlaylistViewModel), null, null, new CoursePlaylistViewModel$getLessonCounters$1(coursePlaylistViewModel, arrayList, null), 3);
            C7828f.m15570d(C8573r0.m16767w0(coursePlaylistViewModel), coursePlaylistViewModel.f23847i, null, new CoursePlaylistViewModel$fetchLessonCounters$1(coursePlaylistViewModel, arrayList, null), 2);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoursePlaylistViewModel$getCoursePlaylist$1(CoursePlaylistViewModel coursePlaylistViewModel, InterfaceC9968c<? super CoursePlaylistViewModel$getCoursePlaylist$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23888f = coursePlaylistViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CoursePlaylistViewModel$getCoursePlaylist$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CoursePlaylistViewModel$getCoursePlaylist$1(this.f23888f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23887e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CoursePlaylistViewModel coursePlaylistViewModel = this.f23888f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C36601(coursePlaylistViewModel, null), coursePlaylistViewModel.f23841d.mo6126u((CoursePlaylistSort) coursePlaylistViewModel.f23828Q.getValue(), coursePlaylistViewModel.f23823L.f49762a));
            C36612 c36612 = new C36612(coursePlaylistViewModel, null);
            this.f23887e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c36612, this) == coroutineSingletons) {
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
