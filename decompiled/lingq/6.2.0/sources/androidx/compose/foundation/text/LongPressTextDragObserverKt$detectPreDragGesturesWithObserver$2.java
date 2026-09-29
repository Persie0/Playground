package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.C0332f;
import androidx.compose.p002ui.input.pointer.PointerEventPass;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fg7;
import p000.kg7;
import p000.pk9;
import p000.xfa;
import p000.xt9;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", m4291f = "LongPressTextDragObserver.kt", m4292l = {77, 81}, m4293m = "invokeSuspend", m4294v = 1)
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public kg7 f2806b;

    /* JADX INFO: renamed from: c */
    public int f2807c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2808d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ xt9 f2809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(xt9 xt9Var, Continuation continuation) {
        super(2, continuation);
        this.f2809e = xt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.f2809e, continuation);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.f2808d = obj;
        return longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r14 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r14 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004e -> B:17:0x0051). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        C0332f c0332f2;
        kg7 kg7Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2807c;
        xt9 xt9Var = this.f2809e;
        if (i != 0) {
            if (i == 1) {
                c0332f = (C0332f) this.f2808d;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kg7Var = this.f2806b;
                c0332f2 = (C0332f) this.f2808d;
                AbstractC3193b.m15359b(obj);
            }
            List list = ((fg7) obj).f39071a;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    xt9Var.mo17645b();
                    return xfa.f68157a;
                }
                kg7 kg7Var2 = (kg7) list.get(i2);
                if (pk9.m19371i(kg7Var2.f47235a, kg7Var.f47235a) && kg7Var2.f47238d) {
                    break;
                }
                i2++;
            }
            this.f2808d = c0332f2;
            this.f2806b = kg7Var;
            this.f2807c = 2;
            obj = c0332f2.m1473b(PointerEventPass.Main, this);
        } else {
            AbstractC3193b.m15359b(obj);
            c0332f = (C0332f) this.f2808d;
            this.f2808d = c0332f;
            this.f2807c = 1;
            obj = AbstractC0117w.m939b(c0332f, false, null, this, 2);
        }
        kg7 kg7Var3 = (kg7) obj;
        long j = kg7Var3.f47237c;
        xt9Var.mo17647d();
        c0332f2 = c0332f;
        kg7Var = kg7Var3;
        this.f2808d = c0332f2;
        this.f2806b = kg7Var;
        this.f2807c = 2;
        obj = c0332f2.m1473b(PointerEventPass.Main, this);
    }
}
