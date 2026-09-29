package com.lingq.p055ui.home.course;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import dm.C5207g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$special$$inlined$combineTransform$1", m19206f = "CourseViewModel.kt", m19207l = {251}, m19208m = "invokeSuspend")
public final class CourseViewModel$special$$inlined$combineTransform$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24117e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f24118f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c[] f24119g;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$special$$inlined$combineTransform$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$special$$inlined$combineTransform$1$2", m19206f = "CourseViewModel.kt", m19207l = {370}, m19208m = "invokeSuspend")
    public static final class C36852 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>>, Object[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f24121e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f24122f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object[] f24123g;

        public C36852(InterfaceC9968c interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C36852 c36852 = new C36852(interfaceC9968c);
            c36852.f24122f = interfaceC7117d;
            c36852.f24123g = objArr;
            return c36852.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f24121e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f24122f;
                Object[] objArr = this.f24123g;
                ArrayList arrayList = new ArrayList();
                CollectionsAdapter.AbstractC3739a.d dVar = (CollectionsAdapter.AbstractC3739a.d) objArr[0];
                Object obj2 = objArr[1];
                C5207g.m11109d(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.LessonLoading>");
                List list = (List) obj2;
                CollectionsAdapter.AbstractC3739a.c cVar = (CollectionsAdapter.AbstractC3739a.c) objArr[2];
                CollectionsAdapter.AbstractC3739a.e eVar = (CollectionsAdapter.AbstractC3739a.e) objArr[3];
                Object obj3 = objArr[4];
                C5207g.m11109d(obj3, "null cannot be cast to non-null type kotlin.collections.List<com.lingq.ui.home.library.CollectionsAdapter.AdapterItem.Lesson>");
                List list2 = (List) obj3;
                CollectionsAdapter.AbstractC3739a.b bVar = (CollectionsAdapter.AbstractC3739a.b) objArr[5];
                if (dVar != null) {
                    arrayList.add(dVar);
                }
                if (cVar != null) {
                    arrayList.add(cVar);
                }
                if (eVar != null) {
                    arrayList.add(eVar);
                }
                if (!list2.isEmpty()) {
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                    arrayList.addAll(list2);
                } else if (!list.isEmpty()) {
                    arrayList.addAll(list);
                }
                this.f24121e = 1;
                if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$special$$inlined$combineTransform$1(InterfaceC7116c[] interfaceC7116cArr, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24119g = interfaceC7116cArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        CourseViewModel$special$$inlined$combineTransform$1 courseViewModel$special$$inlined$combineTransform$1 = new CourseViewModel$special$$inlined$combineTransform$1(this.f24119g, interfaceC9968c);
        courseViewModel$special$$inlined$combineTransform$1.f24118f = obj;
        return courseViewModel$special$$inlined$combineTransform$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super List<CollectionsAdapter.AbstractC3739a>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$special$$inlined$combineTransform$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24117e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = (InterfaceC7117d) this.f24118f;
            final InterfaceC7116c[] interfaceC7116cArr = this.f24119g;
            InterfaceC2041a<Object[]> interfaceC2041a = new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.home.course.CourseViewModel$special$$inlined$combineTransform$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object[] mo807E() {
                    return new Object[interfaceC7116cArr.length];
                }
            };
            C36852 c36852 = new C36852(null);
            this.f24117e = 1;
            if (C7127c.m14386a(this, interfaceC2041a, c36852, interfaceC7117d, interfaceC7116cArr) == coroutineSingletons) {
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
