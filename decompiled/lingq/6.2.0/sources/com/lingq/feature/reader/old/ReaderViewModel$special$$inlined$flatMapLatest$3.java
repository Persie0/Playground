package com.lingq.feature.reader.old;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonSimplifiedOf;
import com.lingq.core.domain.model.lesson.LessonsSimplified;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.bx0;
import p000.c32;
import p000.c83;
import p000.d65;
import p000.e83;
import p000.h05;
import p000.q05;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$flatMapLatest$3", m4291f = "ReaderViewModel.kt", m4292l = {217, 218, 189}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$special$$inlined$flatMapLatest$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public e83 f29117a;

    /* JADX INFO: renamed from: b */
    public int f29118b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e83 f29119c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f29120d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C2412n f29121e;

    /* JADX INFO: renamed from: f */
    public c83 f29122f;

    /* JADX INFO: renamed from: g */
    public Integer f29123g;

    /* JADX INFO: renamed from: h */
    public int f29124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$flatMapLatest$3(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29121e = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$special$$inlined$flatMapLatest$3 readerViewModel$special$$inlined$flatMapLatest$3 = new ReaderViewModel$special$$inlined$flatMapLatest$3(this.f29121e, (Continuation) obj3);
        readerViewModel$special$$inlined$flatMapLatest$3.f29119c = (e83) obj;
        readerViewModel$special$$inlined$flatMapLatest$3.f29120d = obj2;
        return readerViewModel$special$$inlined$flatMapLatest$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00de, code lost:
    
        if (kotlinx.coroutines.flow.AbstractC3224d.m15537p(r3, r6, r17) == r5) goto L32;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM15542u;
        Integer num;
        int i;
        c83 c83Var;
        e83 e83Var;
        c83 c83Var2;
        C2412n c2412n = this.f29121e;
        d65 d65Var = c2412n.f29394p;
        e83 e83Var2 = this.f29119c;
        Object obj2 = this.f29120d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.f29118b;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            Pair pair = (Pair) obj2;
            Lesson lesson = (Lesson) pair.f47623a;
            LessonsSimplified lessonsSimplified = (LessonsSimplified) pair.f47624b;
            LessonSimplifiedOf lessonSimplifiedOf = lesson.f19137G;
            Integer num2 = lessonSimplifiedOf != null ? new Integer(lessonSimplifiedOf.f19266c) : lessonsSimplified.f19330b;
            int iIntValue = num2 != null ? num2.intValue() : -1;
            q05 q05Var = (q05) ((C1295k) d65Var).f16498b;
            c83 c83VarM15536o = AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(iIntValue, q05Var, 9)), 11));
            this.f29119c = null;
            this.f29120d = null;
            this.f29117a = e83Var2;
            this.f29122f = c83VarM15536o;
            this.f29123g = num2;
            this.f29124h = 0;
            this.f29118b = 1;
            objM15542u = AbstractC3224d.m15542u(c83VarM15536o, this);
            if (objM15542u != coroutineSingletons) {
                num = num2;
                i = 0;
                c83Var = c83VarM15536o;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            int i3 = this.f29124h;
            Integer num3 = this.f29123g;
            c83Var = this.f29122f;
            e83 e83Var3 = this.f29117a;
            AbstractC3193b.m15359b(obj);
            i = i3;
            e83Var2 = e83Var3;
            num = num3;
            objM15542u = obj;
        } else if (i2 == 2) {
            c83Var2 = this.f29122f;
            e83Var = this.f29117a;
            AbstractC3193b.m15359b(obj);
            c83Var = c83Var2;
            e83Var2 = e83Var;
            this.f29119c = null;
            this.f29120d = null;
            this.f29117a = null;
            this.f29122f = null;
            this.f29123g = null;
            this.f29118b = 3;
        } else {
            if (i2 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        if (objM15542u != null || num == null) {
            this.f29119c = null;
            this.f29120d = null;
            this.f29117a = null;
            this.f29122f = null;
            this.f29123g = null;
            this.f29118b = 3;
        } else {
            String strMo4589b2 = c2412n.f29340b.mo4589b2();
            int iIntValue2 = num.intValue();
            this.f29119c = null;
            this.f29120d = null;
            this.f29117a = e83Var2;
            this.f29122f = c83Var;
            this.f29123g = null;
            this.f29124h = i;
            this.f29118b = 2;
            if (((C1295k) d65Var).m7294p(strMo4589b2, iIntValue2, true, this) != coroutineSingletons) {
                e83Var = e83Var2;
                c83Var2 = c83Var;
                c83Var = c83Var2;
                e83Var2 = e83Var;
                this.f29119c = null;
                this.f29120d = null;
                this.f29117a = null;
                this.f29122f = null;
                this.f29123g = null;
                this.f29118b = 3;
            }
        }
        return coroutineSingletons;
    }
}
