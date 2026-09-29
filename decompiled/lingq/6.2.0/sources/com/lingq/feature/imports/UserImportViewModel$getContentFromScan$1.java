package com.lingq.feature.imports;

import android.content.ContentResolver;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.bt2;
import p000.c32;
import p000.ex9;
import p000.ika;
import p000.kk8;
import p000.pk9;
import p000.um5;
import p000.un1;
import p000.vk9;
import p000.vm5;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$getContentFromScan$1", m4291f = "UserImportViewModel.kt", m4292l = {327}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportViewModel$getContentFromScan$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26093a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2109f f26094b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ContentResolver f26095c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f26096d;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportViewModel$getContentFromScan$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportViewModel$getContentFromScan$1$1", m4291f = "UserImportViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20991 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26097a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2109f f26098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20991(C2109f c2109f, Continuation continuation) {
            super(2, continuation);
            this.f26098b = c2109f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20991 c20991 = new C20991(this.f26098b, continuation);
            c20991.f26097a = obj;
            return c20991;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20991 c20991 = (C20991) create((ym5) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20991.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            String str;
            Object value6;
            C2109f c2109f = this.f26098b;
            C3244l c3244l = c2109f.f26185q;
            C3244l c3244l2 = c2109f.f26184p;
            ym5 ym5Var = (ym5) this.f26097a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ym5Var.getClass();
            if (ym5Var instanceof xm5) {
                do {
                    value6 = c3244l2.getValue();
                    ((Boolean) value6).getClass();
                } while (!c3244l2.m15570h(value6, Boolean.FALSE));
                Object obj2 = ((xm5) ym5Var).f68348a;
                c2109f.m9018Y2((String) (obj2 != null ? obj2 : ""));
            } else if (ym5Var instanceof um5) {
                ex9 ex9Var = (ex9) pk9.m19372j(ym5Var, new ex9(""));
                do {
                    value3 = c3244l2.getValue();
                    ((Boolean) value3).getClass();
                } while (!c3244l2.m15570h(value3, Boolean.FALSE));
                if (ex9Var instanceof ex9) {
                    do {
                        value5 = c3244l.getValue();
                        str = ex9Var.f38055a;
                        if (vk9.m23391n0(str)) {
                            str = "There was an error extracting text from document";
                        }
                    } while (!c3244l.m15570h(value5, new bt2(str)));
                } else {
                    do {
                        value4 = c3244l.getValue();
                    } while (!c3244l.m15570h(value4, new bt2("Error")));
                }
            } else if (ym5Var instanceof vm5) {
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, null));
                do {
                    value2 = c3244l2.getValue();
                    ((Boolean) value2).getClass();
                } while (!c3244l2.m15570h(value2, Boolean.TRUE));
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportViewModel$getContentFromScan$1(C2109f c2109f, ContentResolver contentResolver, List list, Continuation continuation) {
        super(2, continuation);
        this.f26094b = c2109f;
        this.f26095c = contentResolver;
        this.f26096d = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserImportViewModel$getContentFromScan$1(this.f26094b, this.f26095c, this.f26096d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((UserImportViewModel$getContentFromScan$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26093a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2109f c2109f = this.f26094b;
            C2104a c2104a = c2109f.f26179k;
            String str = ((ika) c2109f.f26170b.mo9014u2().getValue()).f44237a;
            c2104a.getClass();
            str.getClass();
            kk8 kk8Var = new kk8(new TextRecognitionManager$startRecognition$1(c2104a, str, this.f26096d, this.f26095c, null));
            C20991 c20991 = new C20991(c2109f, null);
            this.f26093a = 1;
            if (AbstractC3224d.m15529h(kk8Var, c20991, this) == coroutineSingletons) {
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
