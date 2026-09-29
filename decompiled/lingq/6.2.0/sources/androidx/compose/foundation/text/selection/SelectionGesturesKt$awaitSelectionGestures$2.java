package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.AbstractC0102j;
import androidx.compose.p002ui.input.pointer.C0332f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.C3047gq;
import p000.C3386nv;
import p000.bv8;
import p000.c32;
import p000.fg7;
import p000.gq6;
import p000.hta;
import p000.kg7;
import p000.x44;
import p000.xfa;
import p000.xt9;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitSelectionGestures$2", m4291f = "SelectionGestures.kt", m4292l = {111, 119, 122, 124}, m4293m = "invokeSuspend", m4294v = 1)
final class SelectionGesturesKt$awaitSelectionGestures$2 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f2998b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f2999c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3047gq f3000d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x44 f3001e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xt9 f3002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$awaitSelectionGestures$2(C3047gq c3047gq, x44 x44Var, xt9 xt9Var, Continuation continuation) {
        super(2, continuation);
        this.f3000d = c3047gq;
        this.f3001e = x44Var;
        this.f3002f = xt9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$awaitSelectionGestures$2 selectionGesturesKt$awaitSelectionGestures$2 = new SelectionGesturesKt$awaitSelectionGestures$2(this.f3000d, this.f3001e, this.f3002f, continuation);
        selectionGesturesKt$awaitSelectionGestures$2.f2999c = obj;
        return selectionGesturesKt$awaitSelectionGestures$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$awaitSelectionGestures$2) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0081  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0202c.m1098d(r2, r18.f3001e, r9, r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0202c.m1099e(r2, r4, r8, r18) == r1) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (androidx.compose.foundation.text.selection.AbstractC0202c.m1096b(r2, r4, r8, r3, r18) == r1) goto L45;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0332f c0332f;
        Object objM1095a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2998b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c0332f = (C0332f) this.f2999c;
            this.f2999c = c0332f;
            this.f2998b = 1;
            objM1095a = AbstractC0202c.m1095a(c0332f, this);
            if (objM1095a != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            c0332f = (C0332f) this.f2999c;
            AbstractC3193b.m15359b(obj);
            objM1095a = obj;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        fg7 fg7Var = (fg7) objM1095a;
        C3047gq c3047gq = this.f3000d;
        hta htaVar = (hta) c3047gq.f41172c;
        kg7 kg7Var = (kg7) c3047gq.f41173d;
        kg7 kg7Var2 = (kg7) fg7Var.f39071a.get(0);
        if (kg7Var == null || kg7Var2.f47236b - kg7Var.f47236b >= htaVar.mo13455a()) {
            c3047gq.f41171b = 1;
        } else {
            if (gq6.m12822c(gq6.m12824e(kg7Var.f47237c, kg7Var2.f47237c)) < AbstractC0102j.m874i(htaVar, kg7Var.f47243i)) {
                c3047gq.f41171b++;
            } else {
                c3047gq.f41171b = 1;
            }
        }
        c3047gq.f41173d = kg7Var2;
        boolean zM4195a = bv8.m4195a(fg7Var);
        if (zM4195a && (fg7Var.f39074d & 33) != 0) {
            List list = fg7Var.f39071a;
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    this.f2999c = null;
                    this.f2998b = 2;
                } else {
                    if (((kg7) list.get(i2)).m15191c()) {
                        break;
                    }
                    i2++;
                }
            }
        }
        if (!zM4195a) {
            int i3 = c3047gq.f41171b;
            xt9 xt9Var = this.f3002f;
            if (i3 == 1) {
                this.f2999c = null;
                this.f2998b = 3;
            } else {
                this.f2999c = null;
                this.f2998b = 4;
            }
        }
        return xfa.f68157a;
    }
}
