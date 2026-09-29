package com.lingq.p055ui.home.library;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import com.lingq.shared.uimodel.language.UserLanguage;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$updateSave$1", m19206f = "LibraryViewModel.kt", m19207l = {903}, m19208m = "invokeSuspend")
final class LibraryViewModel$updateSave$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24923e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24924f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24925g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f24926h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$updateSave$1(LibraryViewModel libraryViewModel, int i10, boolean z10, InterfaceC9968c<? super LibraryViewModel$updateSave$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24924f = libraryViewModel;
        this.f24925g = i10;
        this.f24926h = z10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$updateSave$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$updateSave$1(this.f24924f, this.f24925g, this.f24926h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24923e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LibraryViewModel libraryViewModel = this.f24924f;
            InterfaceC3324a interfaceC3324a = libraryViewModel.f24765d;
            UserLanguage value = libraryViewModel.mo509w0().getValue();
            int i11 = value != null ? value.f21727b : 0;
            int i12 = this.f24925g;
            boolean z10 = this.f24926h;
            String strMo498E1 = libraryViewModel.mo498E1();
            this.f24923e = 1;
            if (interfaceC3324a.mo9490L(i11, i12, strMo498E1, this, z10) == coroutineSingletons) {
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
