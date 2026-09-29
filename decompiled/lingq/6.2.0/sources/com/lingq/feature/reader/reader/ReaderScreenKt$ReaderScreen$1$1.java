package com.lingq.feature.reader.reader;

import androidx.compose.material3.C0232g0;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C2944dy;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.bz7;
import p000.c32;
import p000.gm5;
import p000.jy7;
import p000.or7;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderScreen$1$1", m4291f = "ReaderScreen.kt", m4292l = {1117}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderScreen$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30170a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jy7 f30171b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f30172c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f30173d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0232g0 f30174e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ vi3 f30175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderScreen$1$1(jy7 jy7Var, String str, String str2, C0232g0 c0232g0, vi3 vi3Var, Continuation continuation) {
        super(2, continuation);
        this.f30171b = jy7Var;
        this.f30172c = str;
        this.f30173d = str2;
        this.f30174e = c0232g0;
        this.f30175f = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderScreen$1$1(this.f30171b, this.f30172c, this.f30173d, this.f30174e, this.f30175f, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderScreenKt$ReaderScreen$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004d A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        ReaderScreenKt$ReaderScreen$1$1 readerScreenKt$ReaderScreen$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30170a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jy7 jy7Var = this.f30171b;
            if (jy7Var.f46405m) {
                InterfaceC3055gy interfaceC3055gy = jy7Var.f46404l;
                boolean z = interfaceC3055gy instanceof C2944dy;
                String str2 = this.f30173d;
                if (z) {
                    switch (bz7.f9200a[((C2944dy) interfaceC3055gy).f36412c.ordinal()]) {
                        case 1:
                            str2 = this.f30172c;
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            str = str2;
                            this.f30170a = 1;
                            readerScreenKt$ReaderScreen$1$1 = this;
                            if (C0232g0.m1155b(this.f30174e, str, null, null, readerScreenKt$ReaderScreen$1$1, 14) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            break;
                        default:
                            gm5.m12750e();
                            return null;
                    }
                }
                str = str2;
                this.f30170a = 1;
                readerScreenKt$ReaderScreen$1$1 = this;
                if (C0232g0.m1155b(this.f30174e, str, null, null, readerScreenKt$ReaderScreen$1$1, 14) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        readerScreenKt$ReaderScreen$1$1 = this;
        readerScreenKt$ReaderScreen$1$1.f30175f.invoke(or7.f54787a);
        return xfa.f68157a;
    }
}
