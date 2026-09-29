package com.lingq.core.p012ui.dragdrop;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.lazy.C0127b;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fda;
import p000.io2;
import p000.ss5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.dragdrop.DragAndDropExtensionsKt$detectDrag$2$4$2$1", m4291f = "DragAndDropExtensions.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class DragAndDropExtensionsKt$detectDrag$2$4$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f23957a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1919b f23958b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f23959c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragAndDropExtensionsKt$detectDrag$2$4$2$1(C1919b c1919b, float f, Continuation continuation) {
        super(2, continuation);
        this.f23958b = c1919b;
        this.f23959c = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DragAndDropExtensionsKt$detectDrag$2$4$2$1(this.f23958b, this.f23959c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DragAndDropExtensionsKt$detectDrag$2$4$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f23957a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0127b c0127b = this.f23958b.f23968a;
            float f = this.f23959c * 1.3f;
            fda fdaVarM21703b0 = ss5.m21703b0(0, 0, io2.f44351c, 3);
            this.f23957a = 1;
            if (AbstractC0095c.m831f(c0127b, f, fdaVarM21703b0, this) == coroutineSingletons) {
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
