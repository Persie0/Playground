package com.lingq.p055ui.home.library;

import ci.InterfaceC2014g;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.library.LibraryItemType;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$networkLibraryCounters$1", m19206f = "LibraryViewModel.kt", m19207l = {493, 495}, m19208m = "invokeSuspend")
final class LibraryViewModel$networkLibraryCounters$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24883e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f24884f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LibraryViewModel f24885g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ List<Integer> f24886h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$networkLibraryCounters$1(LibraryViewModel libraryViewModel, String str, List list, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24884f = str;
        this.f24885g = libraryViewModel;
        this.f24886h = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$networkLibraryCounters$1(this.f24885g, this.f24884f, this.f24886h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$networkLibraryCounters$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        String str = this.f24884f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24883e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                boolean zM11106a = C5207g.m11106a(str, LibraryItemType.Content.getValue());
                List<Integer> list = this.f24886h;
                LibraryViewModel libraryViewModel = this.f24885g;
                if (zM11106a) {
                    InterfaceC2014g interfaceC2014g = libraryViewModel.f24769f;
                    String strMo498E1 = libraryViewModel.mo498E1();
                    this.f24883e = 1;
                    if (interfaceC2014g.mo6061g(strMo498E1, list, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (C5207g.m11106a(str, LibraryItemType.Collection.getValue())) {
                    InterfaceC2014g interfaceC2014g2 = libraryViewModel.f24769f;
                    String strMo498E2 = libraryViewModel.mo498E1();
                    this.f24883e = 2;
                    if (interfaceC2014g2.mo6059e(strMo498E2, list, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
