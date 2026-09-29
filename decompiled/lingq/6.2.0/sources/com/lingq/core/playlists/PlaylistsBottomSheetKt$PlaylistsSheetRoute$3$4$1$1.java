package com.lingq.core.playlists;

import androidx.compose.material3.C0269z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.uf7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1", m4291f = "PlaylistsBottomSheet.kt", m4292l = {142}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22222a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f22223b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uf7 f22224c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(C0269z c0269z, uf7 uf7Var, Continuation continuation) {
        super(2, continuation);
        this.f22223b = c0269z;
        this.f22224c = uf7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1(this.f22223b, this.f22224c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsBottomSheetKt$PlaylistsSheetRoute$3$4$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22222a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f22222a = 1;
            if (this.f22223b.m1216d(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        uf7 uf7Var = this.f22224c;
        uf7Var.onDismiss();
        uf7Var.mo3849e();
        return xfa.f68157a;
    }
}
