package com.lingq.feature.reader.reader;

import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.material3.SnackbarResult;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.c89;
import p000.dh9;
import p000.e89;
import p000.f89;
import p000.gm5;
import p000.h89;
import p000.i89;
import p000.ja6;
import p000.k89;
import p000.t66;
import p000.un1;
import p000.w41;
import p000.xfa;
import p000.yz4;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.reader.ReaderScreenKt$ReaderRoute$3$1", m4291f = "ReaderScreen.kt", m4292l = {213, 214, 215, 216, 218}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderScreenKt$ReaderRoute$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ dh9 f30149H;

    /* JADX INFO: renamed from: a */
    public k89 f30150a;

    /* JADX INFO: renamed from: b */
    public int f30151b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0232g0 f30152c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f30153d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f30154e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f30155f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f30156g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f30157h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f30158i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ w41 f30159j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2493a f30160k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ t66 f30161l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderScreenKt$ReaderRoute$3$1(C0232g0 c0232g0, String str, String str2, String str3, String str4, String str5, String str6, w41 w41Var, C2493a c2493a, t66 t66Var, dh9 dh9Var, Continuation continuation) {
        super(2, continuation);
        this.f30152c = c0232g0;
        this.f30153d = str;
        this.f30154e = str2;
        this.f30155f = str3;
        this.f30156g = str4;
        this.f30157h = str5;
        this.f30158i = str6;
        this.f30159j = w41Var;
        this.f30160k = c2493a;
        this.f30161l = t66Var;
        this.f30149H = dh9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderScreenKt$ReaderRoute$3$1(this.f30152c, this.f30153d, this.f30154e, this.f30155f, this.f30156g, this.f30157h, this.f30158i, this.f30159j, this.f30160k, this.f30161l, this.f30149H, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderScreenKt$ReaderRoute$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (androidx.compose.material3.C0232g0.m1155b(r11.f30152c, r11.f30153d, null, null, r11, 14) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        if (androidx.compose.material3.C0232g0.m1155b(r11.f30152c, r11.f30154e, null, null, r11, 14) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if (androidx.compose.material3.C0232g0.m1155b(r11.f30152c, r11.f30155f, null, null, r11, 14) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        if (androidx.compose.material3.C0232g0.m1155b(r11.f30152c, r11.f30156g, null, null, r11, 14) == r6) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c2, code lost:
    
        if (r0 == r6) goto L40;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        k89 k89Var;
        Object objM1155b;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30151b;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            k89Var = (k89) this.f30161l.getValue();
            if (k89Var == null) {
                return xfaVar;
            }
            if (k89Var.equals(i89.f43692a)) {
                this.f30150a = null;
                this.f30151b = 1;
            } else if (k89Var.equals(f89.f38633a)) {
                this.f30150a = null;
                this.f30151b = 2;
            } else {
                if (!k89Var.equals(c89.f9719a)) {
                    if (k89Var.equals(e89.f36846a)) {
                        this.f30150a = null;
                        this.f30151b = 4;
                    } else {
                        if (!(k89Var instanceof h89)) {
                            gm5.m12750e();
                            return null;
                        }
                        SnackbarDuration snackbarDuration = SnackbarDuration.Long;
                        this.f30150a = k89Var;
                        this.f30151b = 5;
                        objM1155b = C0232g0.m1155b(this.f30152c, this.f30157h, this.f30158i, snackbarDuration, this, 4);
                    }
                    return coroutineSingletons;
                }
                this.f30150a = null;
                this.f30151b = 3;
            }
        } else if (i == 1 || i == 2 || i == 3 || i == 4) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 5) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k89 k89Var2 = this.f30150a;
            AbstractC3193b.m15359b(obj);
            k89Var = k89Var2;
            objM1155b = obj;
            if (((SnackbarResult) objM1155b) == SnackbarResult.ActionPerformed) {
                int i2 = ((h89) k89Var).f41994a;
                dh9 dh9Var = this.f30149H;
                Lesson lesson = ((yz4) dh9Var.getValue()).f70667a;
                int i3 = lesson != null ? lesson.f19149h : -1;
                Lesson lesson2 = ((yz4) dh9Var.getValue()).f70667a;
                if (lesson2 == null || (str = lesson2.f19150i) == null) {
                    str = "";
                }
                this.f30159j.m23737z(new ja6(i2, i3, str, LqAnalyticsValues$LessonPath.Unknown.f14315a));
            }
        }
        this.f30160k.f30230t.f30502k.m15571i(null);
        return xfaVar;
    }
}
