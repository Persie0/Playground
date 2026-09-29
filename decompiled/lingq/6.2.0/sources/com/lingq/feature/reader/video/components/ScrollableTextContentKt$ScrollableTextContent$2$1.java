package com.lingq.feature.reader.video.components;

import androidx.compose.foundation.lazy.C0127b;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.iv4;
import p000.un1;
import p000.wz7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.components.ScrollableTextContentKt$ScrollableTextContent$2$1", m4291f = "ScrollableTextContent.kt", m4292l = {82}, m4293m = "invokeSuspend", m4294v = 2)
final class ScrollableTextContentKt$ScrollableTextContent$2$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31424a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f31425b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ wz7 f31426c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f31427d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0127b f31428e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f31429f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTextContentKt$ScrollableTextContent$2$1(wz7 wz7Var, List list, C0127b c0127b, int i, Continuation continuation) {
        super(2, continuation);
        this.f31426c = wz7Var;
        this.f31427d = list;
        this.f31428e = c0127b;
        this.f31429f = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScrollableTextContentKt$ScrollableTextContent$2$1 scrollableTextContentKt$ScrollableTextContent$2$1 = new ScrollableTextContentKt$ScrollableTextContent$2$1(this.f31426c, this.f31427d, this.f31428e, this.f31429f, continuation);
        scrollableTextContentKt$ScrollableTextContent$2$1.f31425b = obj;
        return scrollableTextContentKt$ScrollableTextContent$2$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ScrollableTextContentKt$ScrollableTextContent$2$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0085 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iIntValue;
        Object next;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31424a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Integer num = this.f31426c.f67565b;
            if (num != null && (iIntValue = num.intValue()) >= 0 && iIntValue < this.f31427d.size()) {
                C0127b c0127b = this.f31428e;
                if (c0127b.m980j().f42988n > 0) {
                    int i2 = iIntValue + 1;
                    Iterator it = c0127b.m980j().f42985k.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (((iv4) next).f44648a != i2);
                    iv4 iv4Var = (iv4) next;
                    if (iv4Var != null) {
                        int i3 = c0127b.m980j().f42986l;
                        int i4 = c0127b.m980j().f42987m;
                        int i5 = iv4Var.f44662o;
                        int i6 = iv4Var.f44663p + i5;
                        int i7 = this.f31429f;
                        if (i5 < i3 + i7 || i6 > i4 - i7) {
                            this.f31425b = null;
                            this.f31424a = 1;
                            if (c0127b.m976f(i2, -300, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        this.f31425b = null;
                        this.f31424a = 1;
                        if (c0127b.m976f(i2, -300, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
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
