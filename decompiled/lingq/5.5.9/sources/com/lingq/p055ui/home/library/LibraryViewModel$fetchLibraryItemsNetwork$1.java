package com.lingq.p055ui.home.library;

import ci.InterfaceC2014g;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$fetchLibraryItemsNetwork$1", m19206f = "LibraryViewModel.kt", m19207l = {451, 459}, m19208m = "invokeSuspend")
final class LibraryViewModel$fetchLibraryItemsNetwork$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24828e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24829f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f24830g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LibraryShelf f24831h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f24832i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f24833j;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.LibraryViewModel$fetchLibraryItemsNetwork$1$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$fetchLibraryItemsNetwork$1$1", m19206f = "LibraryViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37851 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LibraryViewModel f24834e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LibraryShelf f24835f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37851(LibraryViewModel libraryViewModel, LibraryShelf libraryShelf, InterfaceC9968c<? super C37851> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24834e = libraryViewModel;
            this.f24835f = libraryShelf;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C37851(this.f24834e, this.f24835f, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37851) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24834e;
            libraryViewModel.f24752Q.put(this.f24835f, LibraryAdapter.AbstractC3755a.b.f24607a);
            libraryViewModel.m9949u2();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$fetchLibraryItemsNetwork$1(LibraryViewModel libraryViewModel, String str, LibraryShelf libraryShelf, String str2, String str3, InterfaceC9968c<? super LibraryViewModel$fetchLibraryItemsNetwork$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24829f = libraryViewModel;
        this.f24830g = str;
        this.f24831h = libraryShelf;
        this.f24832i = str2;
        this.f24833j = str3;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$fetchLibraryItemsNetwork$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$fetchLibraryItemsNetwork$1(this.f24829f, this.f24830g, this.f24831h, this.f24832i, this.f24833j, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Object objMo6064j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24828e;
        LibraryShelf libraryShelf = this.f24831h;
        LibraryViewModel libraryViewModel = this.f24829f;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                    objMo6064j = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2014g interfaceC2014g = libraryViewModel.f24769f;
            String str = this.f24830g;
            String strM16880G = C8656b.m16880G(libraryShelf, (LibraryTab) libraryViewModel.f24753R.get(libraryShelf.f22050c));
            String str2 = this.f24832i;
            String str3 = this.f24833j;
            this.f24828e = 1;
            objMo6064j = interfaceC2014g.mo6064j(str, strM16880G, (224 & 4) != 0 ? "" : str2, (224 & 8) != 0 ? true : true, (224 & 16) != 0 ? "" : str3, (224 & 32) != 0 ? "" : null, (224 & 64) != 0 ? "" : null, (224 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 1 : 0, this);
            if (objMo6064j == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (((Number) objMo6064j).intValue() == 0) {
                CoroutineDispatcher coroutineDispatcher = libraryViewModel.f24744I;
                C37851 c37851 = new C37851(libraryViewModel, libraryShelf, null);
                this.f24828e = 2;
                if (C7828f.m15574h(this, coroutineDispatcher, c37851) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
