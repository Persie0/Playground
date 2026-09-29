package com.lingq.core.domain.library;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.library.LibraryShelf;
import com.lingq.core.domain.model.library.LibraryTab;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xfa;
import p000.y95;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetShelfContentUseCase$invoke$2", m4291f = "GetShelfContentUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetShelfContentUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f18789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1389d f18790b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18791c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18792d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LibraryTab f18793e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LibraryShelf f18794f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShelfContentUseCase$invoke$2(C1389d c1389d, String str, String str2, LibraryTab libraryTab, LibraryShelf libraryShelf, Continuation continuation) {
        super(1, continuation);
        this.f18790b = c1389d;
        this.f18791c = str;
        this.f18792d = str2;
        this.f18793e = libraryTab;
        this.f18794f = libraryShelf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetShelfContentUseCase$invoke$2(this.f18790b, this.f18791c, this.f18792d, this.f18793e, this.f18794f, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetShelfContentUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18789a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        y95 y95Var = this.f18790b.f18834a;
        String str = this.f18793e.f19506f;
        String str2 = this.f18794f.f19496d;
        this.f18789a = 1;
        Object objM24995a = y95.m24995a(y95Var, this.f18791c, this.f18792d, null, false, str, str2, null, null, 0, this, 460);
        return objM24995a == coroutineSingletons ? coroutineSingletons : objM24995a;
    }
}
