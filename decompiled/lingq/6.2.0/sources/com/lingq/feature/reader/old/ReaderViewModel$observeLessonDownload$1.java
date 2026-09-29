package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.ij2;
import p000.ld0;
import p000.vi3;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$observeLessonDownload$1", m4291f = "ReaderViewModel.kt", m4292l = {2135}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$observeLessonDownload$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f29001a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29002b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29003c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$observeLessonDownload$1(C2412n c2412n, int i, Continuation continuation) {
        super(1, continuation);
        this.f29002b = c2412n;
        this.f29003c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderViewModel$observeLessonDownload$1(this.f29002b, this.f29003c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderViewModel$observeLessonDownload$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29001a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f29002b;
            xd7 xd7Var = c2412n.f29397q;
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            C1302r c1302r = (C1302r) xd7Var;
            c1302r.getClass();
            strMo4589b2.getClass();
            C1322j c1322j = c1302r.f16534c;
            c1322j.getClass();
            int i2 = this.f29003c;
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, false, new String[]{"LessonAudioDownloadEntity"}, new ld0(strMo4589b2, i2, 24)));
            ij2 ij2Var = new ij2(c2412n, i2, 5);
            this.f29001a = 1;
            if (c83VarM15536o.collect(ij2Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
