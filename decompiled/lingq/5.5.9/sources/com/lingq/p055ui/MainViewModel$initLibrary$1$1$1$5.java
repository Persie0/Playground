package com.lingq.p055ui;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryContentType;
import com.lingq.shared.uimodel.library.LibraryShelf;
import com.lingq.shared.uimodel.library.LibraryTab;
import dm.C5207g;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/library/LibraryShelf;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.MainViewModel$initLibrary$1$1$1$5", m19206f = "MainViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class MainViewModel$initLibrary$1$1$1$5 extends SuspendLambda implements InterfaceC2056p<List<? extends LibraryShelf>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f22334e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MainViewModel f22335f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainViewModel$initLibrary$1$1$1$5(MainViewModel mainViewModel, InterfaceC9968c<? super MainViewModel$initLibrary$1$1$1$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22335f = mainViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        MainViewModel$initLibrary$1$1$1$5 mainViewModel$initLibrary$1$1$1$5 = new MainViewModel$initLibrary$1$1$1$5(this.f22335f, interfaceC9968c);
        mainViewModel$initLibrary$1$1$1$5.f22334e = obj;
        return mainViewModel$initLibrary$1$1$1$5;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(List<? extends LibraryShelf> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MainViewModel$initLibrary$1$1$1$5) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        for (LibraryShelf libraryShelf : C6752c.m13448p0((List) this.f22334e, 3)) {
            Iterator<T> it = libraryShelf.f22049b.iterator();
            while (it.hasNext()) {
                String str = ((LibraryTab) it.next()).f22061b;
                boolean zM11106a = C5207g.m11106a(str, LibraryContentType.Lessons.getValue());
                MainViewModel mainViewModel = this.f22335f;
                if (zM11106a) {
                    LibraryTab libraryTabM9718m2 = MainViewModel.m9718m2(mainViewModel, libraryShelf);
                    MainViewModel.m9719n2(mainViewModel, mainViewModel.mo498E1(), libraryTabM9718m2.f22065f, libraryShelf, libraryTabM9718m2);
                } else if (C5207g.m11106a(str, LibraryContentType.Courses.getValue())) {
                    LibraryTab libraryTabM9718m3 = MainViewModel.m9718m2(mainViewModel, libraryShelf);
                    C7828f.m15570d(mainViewModel.f22298l, null, null, new MainViewModel$fetchCoursesNetwork$1(mainViewModel, mainViewModel.mo498E1(), libraryShelf, libraryTabM9718m3, "", libraryTabM9718m3.f22065f, null), 3);
                } else {
                    LibraryTab libraryTabM9718m4 = MainViewModel.m9718m2(mainViewModel, libraryShelf);
                    MainViewModel.m9719n2(mainViewModel, mainViewModel.mo498E1(), libraryTabM9718m4.f22065f, libraryShelf, libraryTabM9718m4);
                }
            }
        }
        return C9072e.f47360a;
    }
}
