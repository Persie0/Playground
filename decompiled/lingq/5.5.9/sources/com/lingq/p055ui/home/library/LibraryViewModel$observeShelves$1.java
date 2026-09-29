package com.lingq.p055ui.home.library;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.LearningLevel;
import com.lingq.shared.uimodel.library.LibraryShelf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$observeShelves$1", m19206f = "LibraryViewModel.kt", m19207l = {269, 279}, m19208m = "invokeSuspend")
final class LibraryViewModel$observeShelves$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24891e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24892f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24893g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<LearningLevel> f24894h;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$2", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37952 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends LibraryShelf>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LibraryViewModel f24895e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37952(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C37952> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24895e = libraryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37952(this.f24895e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends LibraryShelf>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37952) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24895e.f24757V.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$3 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$3", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37963 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends LibraryShelf>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f24896e;

        public C37963(InterfaceC9968c<? super C37963> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super List<? extends LibraryShelf>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C37963 c37963 = new C37963(interfaceC9968c);
            c37963.f24896e = th2;
            return c37963.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24896e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$4 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$observeShelves$1$4", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37974 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryShelf>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24897e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryViewModel f24898f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37974(LibraryViewModel libraryViewModel, InterfaceC9968c<? super C37974> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24898f = libraryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37974 c37974 = new C37974(this.f24898f, interfaceC9968c);
            c37974.f24897e = obj;
            return c37974;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends LibraryShelf> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37974) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24898f.f24778j0.setValue((List) this.f24897e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LibraryViewModel$observeShelves$1(LibraryViewModel libraryViewModel, String str, List<? extends LearningLevel> list, InterfaceC9968c<? super LibraryViewModel$observeShelves$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24892f = libraryViewModel;
        this.f24893g = str;
        this.f24894h = list;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$observeShelves$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$observeShelves$1(this.f24892f, this.f24893g, this.f24894h, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24891e;
        LibraryViewModel libraryViewModel = this.f24892f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        }
        C7499b.m14977z0(obj);
        InterfaceC2014g interfaceC2014g = libraryViewModel.f24769f;
        List<LearningLevel> list = this.f24894h;
        ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((LearningLevel) it.next()).getServerName());
        }
        this.f24891e = 1;
        obj = interfaceC2014g.mo6066l(this.f24893g, arrayList);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C37952(libraryViewModel, null), (InterfaceC7116c) obj), new C37963(null));
        C37974 c37974 = new C37974(libraryViewModel, null);
        this.f24891e = 2;
        return C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c37974, this) == coroutineSingletons ? coroutineSingletons : C9072e.f47360a;
    }
}
