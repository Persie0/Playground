package com.lingq.p055ui.home.collections;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.util.CoroutineJobManager;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p181ii.C6332a;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;
import tl.C9325m;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryItems$1", m19206f = "CollectionsViewModel.kt", m19207l = {383}, m19208m = "invokeSuspend")
final class CollectionsViewModel$getLibraryItems$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f23380e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CollectionsViewModel f23381f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f23382g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f23383h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f23384i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f23385j;

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$getLibraryItems$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lii/a;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryItems$1$1", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35651 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super List<? extends C6332a>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CollectionsViewModel f23386e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35651(CollectionsViewModel collectionsViewModel, InterfaceC9968c<? super C35651> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23386e = collectionsViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C35651(this.f23386e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super List<? extends C6332a>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35651) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f23386e.f23246c0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.collections.CollectionsViewModel$getLibraryItems$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.collections.CollectionsViewModel$getLibraryItems$1$2", m19206f = "CollectionsViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C35662 extends SuspendLambda implements InterfaceC2056p<List<? extends C6332a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f23387e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ CollectionsViewModel f23388f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f23389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35662(CollectionsViewModel collectionsViewModel, int i10, InterfaceC9968c<? super C35662> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f23388f = collectionsViewModel;
            this.f23389g = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C35662 c35662 = new C35662(this.f23388f, this.f23389g, interfaceC9968c);
            c35662.f23387e = obj;
            return c35662;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6332a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C35662) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List<C6332a> list = (List) this.f23387e;
            boolean zIsEmpty = list.isEmpty();
            CollectionsViewModel collectionsViewModel = this.f23388f;
            if (zIsEmpty && !collectionsViewModel.f23263l.m15512e() && this.f23389g == 1) {
                collectionsViewModel.f23246c0.setValue(Resource.Status.EMPTY);
                collectionsViewModel.f23238U.setValue(Boolean.TRUE);
            } else if (!list.isEmpty()) {
                collectionsViewModel.f23246c0.setValue(Resource.Status.SUCCESS);
            }
            collectionsViewModel.f23234Q.setValue(list);
            ArrayList arrayList = new ArrayList(C9325m.m17681z(list, 10));
            for (C6332a c6332a : list) {
                arrayList.add(new Pair(new Integer(c6332a.f36595a), c6332a.f36596b));
            }
            InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(collectionsViewModel);
            CollectionsViewModel$getLibraryCounters$1 collectionsViewModel$getLibraryCounters$1 = new CollectionsViewModel$getLibraryCounters$1(collectionsViewModel, arrayList, null);
            CoroutineJobManager coroutineJobManager = collectionsViewModel.f23255h;
            CoroutineDispatcher coroutineDispatcher = collectionsViewModel.f23253g;
            C7499b.m14933c0(interfaceC7882zM16767w0, coroutineJobManager, coroutineDispatcher, "libraryCounters", collectionsViewModel$getLibraryCounters$1);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            loop1: while (true) {
                while (true) {
                    if (!it.hasNext()) {
                        break loop1;
                    }
                    Object next = it.next();
                    if (C5207g.m11106a(((Pair) next).f38013b, LibraryItemType.Content.getValue())) {
                        arrayList2.add(next);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(C9325m.m17681z(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((Number) ((Pair) it2.next()).f38012a).intValue()));
            }
            C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), coroutineDispatcher, null, new CollectionsViewModel$fetchLessonsCounters$1(collectionsViewModel, arrayList3, null), 2);
            ArrayList arrayList4 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            loop4: while (true) {
                while (true) {
                    if (!it3.hasNext()) {
                        break loop4;
                    }
                    Object next2 = it3.next();
                    if (C5207g.m11106a(((Pair) next2).f38013b, LibraryItemType.Collection.getValue())) {
                        arrayList4.add(next2);
                    }
                }
            }
            ArrayList arrayList5 = new ArrayList(C9325m.m17681z(arrayList4, 10));
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                arrayList5.add(Integer.valueOf(((Number) ((Pair) it4.next()).f38012a).intValue()));
            }
            C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), coroutineDispatcher, null, new CollectionsViewModel$fetchCoursesCounters$1(collectionsViewModel, arrayList5, null), 2);
            ArrayList arrayList6 = new ArrayList(C9325m.m17681z(list, 10));
            for (C6332a c6332a2 : list) {
                arrayList6.add(new Pair(new Integer(c6332a2.f36595a), c6332a2.f36596b));
            }
            C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), null, null, new CollectionsViewModel$getLibraryDownloads$1(collectionsViewModel, arrayList6, null), 3);
            ArrayList arrayList7 = new ArrayList();
            Iterator it5 = list.iterator();
            loop8: while (true) {
                while (true) {
                    if (!it5.hasNext()) {
                        break loop8;
                    }
                    Object next3 = it5.next();
                    if (C5207g.m11106a(((C6332a) next3).f36596b, LibraryItemType.Content.getValue())) {
                        arrayList7.add(next3);
                    }
                }
            }
            ArrayList arrayList8 = new ArrayList(C9325m.m17681z(arrayList7, 10));
            Iterator it6 = arrayList7.iterator();
            while (it6.hasNext()) {
                C0009a.m30s(((C6332a) it6.next()).f36595a, arrayList8);
            }
            C7828f.m15570d(C8573r0.m16767w0(collectionsViewModel), null, null, new CollectionsViewModel$getLessonsAudiosDownloads$1(collectionsViewModel, arrayList8, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionsViewModel$getLibraryItems$1(CollectionsViewModel collectionsViewModel, String str, String str2, String str3, int i10, InterfaceC9968c<? super CollectionsViewModel$getLibraryItems$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f23381f = collectionsViewModel;
        this.f23382g = str;
        this.f23383h = str2;
        this.f23384i = str3;
        this.f23385j = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((CollectionsViewModel$getLibraryItems$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new CollectionsViewModel$getLibraryItems$1(this.f23381f, this.f23382g, this.f23383h, this.f23384i, this.f23385j, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f23380e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            CollectionsViewModel collectionsViewModel = this.f23381f;
            InterfaceC2014g interfaceC2014g = collectionsViewModel.f23251f;
            int i11 = this.f23385j;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C35651(collectionsViewModel, null), interfaceC2014g.mo6074t(this.f23382g, i11 * 20, this.f23383h, this.f23384i));
            C35662 c35662 = new C35662(collectionsViewModel, i11, null);
            this.f23380e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c35662, this) == coroutineSingletons) {
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
