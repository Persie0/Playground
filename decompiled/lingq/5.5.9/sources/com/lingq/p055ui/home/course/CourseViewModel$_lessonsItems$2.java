package com.lingq.p055ui.home.course;

import cm.InterfaceC2060t;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.home.library.CollectionsAdapter;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p181ii.C6332a;
import p181ii.C6333b;
import p181ii.C6334c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0001H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/ui/home/library/CollectionsAdapter$a$j;", "Lii/a;", "lessons", "Lcom/lingq/shared/uimodel/library/LibraryItemCounter;", "counters", "Lii/c;", "lessonsDownloads", "Lii/b;", "lessonsDataDownloads", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$_lessonsItems$2", m19206f = "CourseViewModel.kt", m19207l = {150}, m19208m = "invokeSuspend")
final class CourseViewModel$_lessonsItems$2 extends SuspendLambda implements InterfaceC2060t<InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.j>>, List<? extends C6332a>, List<? extends LibraryItemCounter>, List<? extends C6334c>, List<? extends C6333b>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23992e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f23993f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ List f23994g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ List f23995h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ List f23996i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ List f23997j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ CourseViewModel f23998k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$_lessonsItems$2(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$_lessonsItems$2> interfaceC9968c) {
        super(6, interfaceC9968c);
        this.f23998k = courseViewModel;
    }

    @Override // cm.InterfaceC2060t
    /* JADX INFO: renamed from: g0 */
    public final Object mo1858g0(InterfaceC7117d<? super List<? extends CollectionsAdapter.AbstractC3739a.j>> interfaceC7117d, List<? extends C6332a> list, List<? extends LibraryItemCounter> list2, List<? extends C6334c> list3, List<? extends C6333b> list4, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        CourseViewModel$_lessonsItems$2 courseViewModel$_lessonsItems$2 = new CourseViewModel$_lessonsItems$2(this.f23998k, interfaceC9968c);
        courseViewModel$_lessonsItems$2.f23993f = interfaceC7117d;
        courseViewModel$_lessonsItems$2.f23994g = list;
        courseViewModel$_lessonsItems$2.f23995h = list2;
        courseViewModel$_lessonsItems$2.f23996i = list3;
        courseViewModel$_lessonsItems$2.f23997j = list4;
        return courseViewModel$_lessonsItems$2.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object next;
        Object next2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23992e;
        boolean z10 = true;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f23993f;
            List list = this.f23994g;
            List list2 = this.f23995h;
            List list3 = this.f23996i;
            List list4 = this.f23997j;
            if (!list.isEmpty()) {
                CourseViewModel courseViewModel = this.f23998k;
                courseViewModel.f23946c0.setValue(Resource.Status.SUCCESS);
                courseViewModel.f23937T.setValue(Boolean.FALSE);
                ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
                Iterator it = list.iterator();
                while (true) {
                    Object obj2 = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    C6332a c6332a = (C6332a) it.next();
                    Iterator it2 = list2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                    } while (!(c6332a.f36595a == ((LibraryItemCounter) next).f22004a ? z10 : false));
                    LibraryItemCounter libraryItemCounter = (LibraryItemCounter) next;
                    Iterator it3 = list4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!(c6332a.f36595a == ((C6333b) next2).f36621a ? z10 : false));
                    C6333b c6333b = (C6333b) next2;
                    for (Object obj3 : list3) {
                        if (c6332a.f36595a == ((C6334c) obj3).f36624a) {
                            obj2 = obj3;
                            break;
                        }
                    }
                    arrayList.add(new CollectionsAdapter.AbstractC3739a.j(c6332a, libraryItemCounter, c6333b, (C6334c) obj2, false, ""));
                    z10 = true;
                }
                this.f23993f = null;
                this.f23994g = null;
                this.f23995h = null;
                this.f23996i = null;
                this.f23992e = 1;
                if (interfaceC7117d.mo1339r(arrayList, this) == coroutineSingletons) {
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
