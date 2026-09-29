package com.lingq.p055ui.home.library;

import ci.InterfaceC2013f;
import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.LibraryViewModel$updateStreak$1", m19206f = "LibraryViewModel.kt", m19207l = {740, 743}, m19208m = "invokeSuspend")
public final class LibraryViewModel$updateStreak$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24927e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryViewModel f24928f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryViewModel$updateStreak$1(LibraryViewModel libraryViewModel, InterfaceC9968c<? super LibraryViewModel$updateStreak$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f24928f = libraryViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LibraryViewModel$updateStreak$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LibraryViewModel$updateStreak$1(this.f24928f, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24927e;
        LibraryViewModel libraryViewModel = this.f24928f;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC2013f interfaceC2013f = libraryViewModel.f24771g;
                String strMo498E1 = libraryViewModel.mo498E1();
                this.f24927e = 1;
                if (interfaceC2013f.mo6054o(strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                    libraryViewModel.m9950v2();
                    return C9072e.f47360a;
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
            this.f24927e = 2;
            if (C7828f.m15567a(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return C9072e.f47360a;
    }
}
