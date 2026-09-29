package com.lingq.p055ui.home.library;

import ae.C0062b;
import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryItemType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryShelfType;
import com.lingq.shared.uimodel.library.LibraryTab;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C7076b;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$libraryItemsForShelf$1", m19206f = "LibraryViewModel.kt", m19207l = {395}, m19208m = "invokeSuspend")
public final class LibraryViewModel$libraryItemsForShelf$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24871e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24872f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24873g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibraryShelf f24874h;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$libraryItemsForShelf$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "Lii/a;", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$libraryItemsForShelf$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37931 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super List<? extends C6332a>>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Throwable f24875e;

        public C37931(InterfaceC9968c<? super C37931> interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super List<? extends C6332a>> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C37931 c37931 = new C37931(interfaceC9968c);
            c37931.f24875e = th2;
            return c37931.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f24875e.printStackTrace();
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$libraryItemsForShelf$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lii/a;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$libraryItemsForShelf$1$2", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37942 extends SuspendLambda implements InterfaceC2056p<List<? extends C6332a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24876e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryViewModel f24877f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ LibraryShelf f24878g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f24879h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37942(LibraryShelf libraryShelf, LibraryViewModel libraryViewModel, String str, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24877f = libraryViewModel;
            this.f24878g = libraryShelf;
            this.f24879h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37942 c37942 = new C37942(this.f24878g, this.f24877f, this.f24879h, interfaceC9968c);
            c37942.f24876e = obj;
            return c37942;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C6332a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37942) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List<C6332a> list = (List) this.f24876e;
            boolean z10 = !list.isEmpty();
            LibraryViewModel libraryViewModel = this.f24877f;
            LibraryShelf libraryShelf = this.f24878g;
            if (z10) {
                libraryViewModel.f24752Q.put(libraryShelf, new LibraryAdapter.AbstractC3755a.d(libraryShelf, new LibraryAdapter.AbstractC3757c.a(list, EmptyList.f38032a)));
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                loop0: while (true) {
                    while (true) {
                        if (!it.hasNext()) {
                            break loop0;
                        }
                        Object next = it.next();
                        if (C5207g.m11106a(((C6332a) next).f36596b, LibraryItemType.Content.getValue())) {
                            arrayList.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(C9325m.m17681z(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C0009a.m30s(((C6332a) it2.next()).f36595a, arrayList2);
                }
                String value = LibraryItemType.Content.getValue();
                InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(libraryViewModel);
                LibraryViewModel$networkLibraryCounters$1 libraryViewModel$networkLibraryCounters$1 = new LibraryViewModel$networkLibraryCounters$1(libraryViewModel, value, arrayList2, null);
                CoroutineDispatcher coroutineDispatcher = libraryViewModel.f24745J;
                C7828f.m15570d(interfaceC7882zM16767w0, coroutineDispatcher, null, libraryViewModel$networkLibraryCounters$1, 2);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    if (C5207g.m11106a(((C6332a) obj2).f36596b, LibraryItemType.Collection.getValue())) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C9325m.m17681z(arrayList3, 10));
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    C0009a.m30s(((C6332a) it3.next()).f36595a, arrayList4);
                }
                C7828f.m15570d(C8573r0.m16767w0(libraryViewModel), coroutineDispatcher, null, new LibraryViewModel$networkLibraryCounters$1(libraryViewModel, LibraryItemType.Collection.getValue(), arrayList4, null), 2);
                ArrayList arrayList5 = new ArrayList(C9325m.m17681z(list, 10));
                for (C6332a c6332a : list) {
                    arrayList5.add(new Pair(new Integer(c6332a.f36595a), c6332a.f36596b));
                }
                InterfaceC7882z interfaceC7882zM16767w1 = C8573r0.m16767w0(libraryViewModel);
                StringBuilder sb2 = new StringBuilder("libraryCounters ");
                String str = this.f24879h;
                sb2.append(str);
                C7499b.m14933c0(interfaceC7882zM16767w1, libraryViewModel.f24746K, coroutineDispatcher, sb2.toString(), new LibraryViewModel$getLibraryCounters$1(libraryViewModel, str, arrayList5, null));
            } else {
                LibraryTab libraryTab = (LibraryTab) libraryViewModel.f24753R.get(libraryShelf.f22050c);
                String str2 = libraryTab != null ? libraryTab.f22061b : null;
                LibraryContentType libraryContentType = LibraryContentType.Courses;
                boolean zM11106a = C5207g.m11106a(str2, libraryContentType.getValue());
                LinkedHashMap linkedHashMap = libraryViewModel.f24752Q;
                if (zM11106a) {
                    ArrayList arrayList6 = new ArrayList(1);
                    arrayList6.add(libraryContentType);
                    linkedHashMap.put(libraryShelf, new LibraryAdapter.AbstractC3755a.e(libraryShelf, new LibraryAdapter.AbstractC3757c.b(arrayList6)));
                } else {
                    ArrayList arrayList7 = new ArrayList(1);
                    arrayList7.add(LibraryContentType.Lessons);
                    linkedHashMap.put(libraryShelf, new LibraryAdapter.AbstractC3755a.e(libraryShelf, new LibraryAdapter.AbstractC3757c.b(arrayList7)));
                }
                libraryViewModel.m9949u2();
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$libraryItemsForShelf$1(LibraryShelf libraryShelf, LibraryViewModel libraryViewModel, String str, InterfaceC9968c interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24872f = libraryViewModel;
        this.f24873g = str;
        this.f24874h = libraryShelf;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$libraryItemsForShelf$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$libraryItemsForShelf$1(this.f24874h, this.f24872f, this.f24873g, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24871e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24872f;
            InterfaceC2014g interfaceC2014g = libraryViewModel.f24769f;
            String strMo498E1 = libraryViewModel.mo498E1();
            String value = LibraryShelfType.MiniStories.getValue();
            String str = this.f24873g;
            FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(interfaceC2014g.mo6074t(strMo498E1, C7076b.m14278X2(str, value, false) ? 60 : 18, str, ""), new C37931(null));
            C37942 c37942 = new C37942(this.f24874h, libraryViewModel, str, null);
            this.f24871e = 1;
            if (C0062b.m369m0(flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1, c37942, this) == coroutineSingletons) {
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
