package com.lingq.p055ui.home.course;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p181ii.C6333b;
import p260m8.C7499b;
import p385sf.C9000b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$isDownloaded$1", m19206f = "CourseViewModel.kt", m19207l = {457}, m19208m = "invokeSuspend")
final class CourseViewModel$isDownloaded$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24093e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CourseViewModel f24094f;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$isDownloaded$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/b;", "courseLessonDownloads", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$isDownloaded$1$1", m19206f = "CourseViewModel.kt", m19207l = {460}, m19208m = "invokeSuspend")
    public static final class C36801 extends SuspendLambda implements InterfaceC2056p<List<? extends C6333b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24095e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f24096f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ CourseViewModel f24097g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36801(CourseViewModel courseViewModel, InterfaceC9968c<? super C36801> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24097g = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36801 c36801 = new C36801(this.f24097g, interfaceC9968c);
            c36801.f24096f = obj;
            return c36801;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6333b> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36801) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24095e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                List list = (List) this.f24096f;
                CourseViewModel courseViewModel = this.f24097g;
                StateFlowImpl stateFlowImpl = courseViewModel.f23929L;
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Boolean.valueOf(((C6333b) it.next()).f36622b));
                }
                stateFlowImpl.setValue(Boolean.valueOf(arrayList.size() == ((List) courseViewModel.f23945b0.getValue()).size()));
                if (((Boolean) courseViewModel.f23929L.getValue()).booleanValue()) {
                    InterfaceC2014g interfaceC2014g = courseViewModel.f23951f;
                    String strMo498E1 = courseViewModel.mo498E1();
                    int i11 = courseViewModel.f23927J.f49749a;
                    String value = LibraryItemType.Collection.getValue();
                    this.f24095e = 1;
                    if (interfaceC2014g.mo6062h(strMo498E1, i11, true, value, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$isDownloaded$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$isDownloaded$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24094f = courseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$isDownloaded$1(this.f24094f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$isDownloaded$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24093e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CourseViewModel courseViewModel = this.f24094f;
            InterfaceC7116c<List<C6333b>> interfaceC7116cMo6067m = courseViewModel.f23951f.mo6067m(C9000b.m17251q(new Integer(courseViewModel.f23927J.f49749a)));
            C36801 c36801 = new C36801(courseViewModel, null);
            this.f24093e = 1;
            if (C0062b.m369m0(interfaceC7116cMo6067m, c36801, this) == coroutineSingletons) {
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
