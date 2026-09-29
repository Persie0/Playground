package com.lingq.p055ui.lesson.page;

import ae.C0062b;
import cm.InterfaceC2056p;
import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.LessonViewModel;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import ni.C7793a;
import no.InterfaceC7882z;
import p159hi.C6054e;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$2", m19206f = "LessonPageFragment.kt", m19207l = {364}, m19208m = "invokeSuspend")
public final class LessonPageFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28433e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonPageFragment f28434f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\u00020\u0007*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "Lhi/e;", "words", "Lmj/a;", "page", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$2$1", m19206f = "LessonPageFragment.kt", m19207l = {363}, m19208m = "invokeSuspend")
    public static final class C43541 extends SuspendLambda implements InterfaceC2058r<InterfaceC7117d<? super Map<String, ? extends C6054e>>, Map<String, ? extends C6054e>, C7567a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f28435e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f28436f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Map f28437g;

        public C43541(InterfaceC9968c<? super C43541> interfaceC9968c) {
            super(4, interfaceC9968c);
        }

        @Override // cm.InterfaceC2058r
        /* JADX INFO: renamed from: T */
        public final Object mo1851T(InterfaceC7117d<? super Map<String, ? extends C6054e>> interfaceC7117d, Map<String, ? extends C6054e> map, C7567a c7567a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C43541 c43541 = new C43541(interfaceC9968c);
            c43541.f28436f = interfaceC7117d;
            c43541.f28437g = map;
            return c43541.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f28435e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f28436f;
                Map map = this.f28437g;
                this.f28436f = null;
                this.f28435e = 1;
                if (interfaceC7117d.mo1339r(map, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$2$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u008a@"}, m13365d2 = {"", "", "Lhi/e;", "words", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageFragment$onViewCreated$2$2$2", m19206f = "LessonPageFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43552 extends SuspendLambda implements InterfaceC2056p<Map<String, ? extends C6054e>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f28438e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LessonPageFragment f28439f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43552(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super C43552> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28439f = lessonPageFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43552 c43552 = new C43552(this.f28439f, interfaceC9968c);
            c43552.f28438e = obj;
            return c43552;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Map<String, ? extends C6054e> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43552) mo1336a(map, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            Map mapM13459L0;
            List<C7570d> list;
            Locale locale;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Map map = (Map) this.f28438e;
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageViewModel lessonPageViewModelM10193t0 = this.f28439f.m10193t0();
            C5207g.m11111f(map, "words");
            C7567a c7567a = (C7567a) lessonPageViewModelM10193t0.f28531M.getValue();
            if (c7567a == null || (list = c7567a.f41703c) == null) {
                mapM13459L0 = C6753d.m13459L0();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    locale = lessonPageViewModelM10193t0.f28530L;
                    if (!zHasNext) {
                        break;
                    }
                    String str = ((C7570d) it.next()).f41725e;
                    C5207g.m11110e(locale, "locale");
                    C6054e c6054e = (C6054e) map.get(C7793a.m15502f(str, locale));
                    if (c6054e != null) {
                        arrayList.add(c6054e);
                    }
                }
                int iM14941g0 = C7499b.m14941g0(C9325m.m17681z(arrayList, 10));
                if (iM14941g0 < 16) {
                    iM14941g0 = 16;
                }
                mapM13459L0 = new LinkedHashMap(iM14941g0);
                for (Object obj2 : arrayList) {
                    String str2 = ((C6054e) obj2).f35743a;
                    C5207g.m11110e(locale, "locale");
                    mapM13459L0.put(C7793a.m15502f(str2, locale), obj2);
                }
            }
            lessonPageViewModelM10193t0.f28537S.setValue(mapM13459L0);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageFragment$onViewCreated$2$2(LessonPageFragment lessonPageFragment, InterfaceC9968c<? super LessonPageFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28434f = lessonPageFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonPageFragment$onViewCreated$2$2(this.f28434f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonPageFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28433e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LessonPageFragment.C4337a c4337a = LessonPageFragment.f28335M0;
            LessonPageFragment lessonPageFragment = this.f28434f;
            LessonViewModel lessonViewModelM10192s0 = lessonPageFragment.m10192s0();
            C7136q c7136qM304R0 = C0062b.m304R0(lessonViewModelM10192s0.f27436T0, new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(lessonPageFragment.m10193t0().f28532N), new C43541(null));
            C43552 c43552 = new C43552(lessonPageFragment, null);
            this.f28433e = 1;
            if (C0062b.m369m0(c7136qM304R0, c43552, this) == coroutineSingletons) {
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
