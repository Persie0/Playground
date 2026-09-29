package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonBookmark;
import com.lingq.feature.reader.content.domain.C2262a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.j25;
import p000.pk9;
import p000.um5;
import p000.un1;
import p000.ux5;
import p000.x45;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$fetchLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {1140, 1143, 1146}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$fetchLesson$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28932a;

    /* JADX INFO: renamed from: b */
    public int f28933b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2412n f28934c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f28935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$fetchLesson$1(C2412n c2412n, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f28934c = c2412n;
        this.f28935d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$fetchLesson$1(this.f28934c, this.f28935d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$fetchLesson$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0087  */
    /* JADX WARN: Code duplicated, block: B:26:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if (com.lingq.feature.reader.old.C2412n.m9313V2(r0, r3, r11, r10) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r0.m9327g3(r11, r5, r3, r10) == r2) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        ym5 ym5Var;
        x45 x45Var;
        C2412n c2412n = this.f28934c;
        C2262a c2262a = c2412n.f29265C;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f28933b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.f28932a;
                    AbstractC3193b.m15359b(obj);
                    ym5Var = (ym5) obj;
                    x45Var = (x45) pk9.m19381x(ym5Var);
                    if (x45Var != null) {
                        Lesson lesson = x45Var.f67754a;
                        LessonBookmark lessonBookmark = x45Var.f67756c;
                        List list = x45Var.f67755b;
                        this.f28932a = i;
                        this.f28933b = 3;
                    } else if (ym5Var instanceof um5) {
                        c2412n.m9325f3((j25) pk9.m19373k(ym5Var));
                    }
                    return xfa.f68157a;
                }
                if (i2 != 3) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            AbstractC3193b.m15359b(obj);
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        int iIntValue = ((Number) c2412n.f29310R.getValue()).intValue();
        String strMo4589b2 = c2412n.f29340b.mo4589b2();
        c2262a.getClass();
        strMo4589b2.getClass();
        C3244l c3244l = c2262a.f27984e;
        c3244l.getClass();
        c3244l.m15572j(null, strMo4589b2);
        ux5.m22977D(c2412n.m9331k3(), c2262a.f27983d, null);
        if (this.f28935d) {
            C3244l c3244l2 = c2412n.f29320U0;
            Boolean bool = Boolean.TRUE;
            c3244l2.getClass();
            c3244l2.m15572j(null, bool);
            this.f28932a = iIntValue;
            this.f28933b = 1;
        } else {
            d65 d65Var = c2412n.f29394p;
            this.f28932a = iIntValue;
            this.f28933b = 2;
            Object objM7251I = ((C1295k) d65Var).m7251I(iIntValue, strMo4589b2, this);
            if (objM7251I != coroutineSingletons) {
                i = iIntValue;
                obj = objM7251I;
                ym5Var = (ym5) obj;
                x45Var = (x45) pk9.m19381x(ym5Var);
                if (x45Var != null) {
                    Lesson lesson2 = x45Var.f67754a;
                    LessonBookmark lessonBookmark2 = x45Var.f67756c;
                    List list2 = x45Var.f67755b;
                    this.f28932a = i;
                    this.f28933b = 3;
                } else if (ym5Var instanceof um5) {
                    c2412n.m9325f3((j25) pk9.m19373k(ym5Var));
                }
                return xfa.f68157a;
            }
        }
        return coroutineSingletons;
    }
}
