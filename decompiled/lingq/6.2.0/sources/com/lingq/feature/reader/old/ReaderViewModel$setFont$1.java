package com.lingq.feature.reader.old;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$setFont$1", m4291f = "ReaderViewModel.kt", m4292l = {2851, 2853, 2855}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$setFont$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29024a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f29025b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f29026c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ReaderFont f29027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$setFont$1(boolean z, C2412n c2412n, ReaderFont readerFont, Continuation continuation) {
        super(2, continuation);
        this.f29025b = z;
        this.f29026c = c2412n;
        this.f29027d = readerFont;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$setFont$1(this.f29025b, this.f29026c, this.f29027d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$setFont$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
    
        if (((com.lingq.core.datastore.C1368a) r1).m7854M(r9, r8) == r2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r0.f29364h.mo8237v1(r4, r8) == r2) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2412n c2412n = this.f29026c;
        si7 si7Var = c2412n.f29271E;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29024a;
        ReaderFont readerFont = this.f29027d;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) obj);
                linkedHashMapM15372Y.put(c2412n.f29340b.mo4589b2(), readerFont);
                this.f29024a = 2;
            } else {
                if (i != 2 && i != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        if (this.f29025b) {
            c83 c83Var = ((C1368a) si7Var).f18466z0;
            this.f29024a = 1;
            obj = AbstractC3224d.m15541t(c83Var, this);
            if (obj != coroutineSingletons) {
                LinkedHashMap linkedHashMapM15372Y2 = AbstractC3194a.m15372Y((Map) obj);
                linkedHashMapM15372Y2.put(c2412n.f29340b.mo4589b2(), readerFont);
                this.f29024a = 2;
            }
        } else {
            this.f29024a = 3;
        }
        return coroutineSingletons;
    }
}
