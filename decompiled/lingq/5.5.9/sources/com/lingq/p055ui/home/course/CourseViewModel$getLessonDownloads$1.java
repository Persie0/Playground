package com.lingq.p055ui.home.course;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p181ii.C6334c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getLessonDownloads$1", m19206f = "CourseViewModel.kt", m19207l = {485, 491}, m19208m = "invokeSuspend")
final class CourseViewModel$getLessonDownloads$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public CourseViewModel f24076e;

    /* JADX INFO: renamed from: f */
    public Collection f24077f;

    /* JADX INFO: renamed from: g */
    public Iterator f24078g;

    /* JADX INFO: renamed from: h */
    public Collection f24079h;

    /* JADX INFO: renamed from: i */
    public int f24080i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ CourseViewModel f24081j;

    /* JADX INFO: renamed from: com.lingq.ui.home.course.CourseViewModel$getLessonDownloads$1$4 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00000\u0000H\u008a@"}, m13365d2 = {"", "Lii/c;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.course.CourseViewModel$getLessonDownloads$1$4", m19206f = "CourseViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C36774 extends SuspendLambda implements InterfaceC2056p<List<? extends List<? extends C6334c>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24082e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CourseViewModel f24083f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C36774(CourseViewModel courseViewModel, InterfaceC9968c<? super C36774> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24083f = courseViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C36774 c36774 = new C36774(this.f24083f, interfaceC9968c);
            c36774.f24082e = obj;
            return c36774;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends List<? extends C6334c>> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C36774) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24083f.f23943Z.setValue(C6752c.m13421O(C9325m.m17680A((List) this.f24082e)));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CourseViewModel$getLessonDownloads$1(CourseViewModel courseViewModel, InterfaceC9968c<? super CourseViewModel$getLessonDownloads$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24081j = courseViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new CourseViewModel$getLessonDownloads$1(this.f24081j, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CourseViewModel$getLessonDownloads$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0092  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b1 -> B:24:0x00bb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.p055ui.home.course.CourseViewModel$getLessonDownloads$1.mo1338x(java.lang.Object):java.lang.Object");
    }
}
