package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.sync.C3248a;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.eh0;
import p000.xc9;
import p000.xfa;
import p000.ys9;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", m4291f = "PlatformSelectionBehaviors.android.kt", m4292l = {437, 161}, m4293m = "invokeSuspend", m4294v = 1)
final class C0194xcb45b7e0 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C3248a f2987a;

    /* JADX INFO: renamed from: b */
    public C0200a f2988b;

    /* JADX INFO: renamed from: c */
    public long f2989c;

    /* JADX INFO: renamed from: d */
    public int f2990d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f2991e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ CharSequence f2992f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f2993g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0200a f2994h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0194xcb45b7e0(long j, C0200a c0200a, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.f2992f = charSequence;
        this.f2993g = j;
        this.f2994h = c0200a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C0194xcb45b7e0 c0194xcb45b7e0 = new C0194xcb45b7e0(this.f2993g, this.f2994h, this.f2992f, continuation);
        c0194xcb45b7e0.f2991e = obj;
        return c0194xcb45b7e0;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0194xcb45b7e0) create((TextClassifier) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        ys9 ys9Var;
        C3248a c3248a;
        C0200a c0200a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2990d;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            TextClassifier textClassifier = (TextClassifier) this.f2991e;
            long j2 = this.f2993g;
            int iM9924f = cx9.m9924f(j2);
            int iM9923e = cx9.m9923e(j2);
            CharSequence charSequence = this.f2992f;
            TextSelection.Request.Builder builder = new TextSelection.Request.Builder(charSequence, iM9924f, iM9923e);
            C0200a c0200a2 = this.f2994h;
            TextSelection.Request.Builder defaultLocales = builder.setDefaultLocales(c0200a2.m1094c());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jM11127g = eh0.m11127g(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                this.f2989c = jM11127g;
                this.f2990d = 2;
                if (C0200a.m1092a(this.f2994h, this.f2992f, jM11127g, textClassifier, this) != coroutineSingletons) {
                    j = jM11127g;
                }
            } else {
                TextClassification textClassification = textSelectionSuggestSelection.getTextClassification();
                textClassification.getClass();
                ys9 ys9VarM1093b = c0200a2.m1093b(charSequence, jM11127g, textClassification);
                C3248a c3248a2 = c0200a2.f3065e;
                this.f2991e = ys9VarM1093b;
                this.f2987a = c3248a2;
                this.f2988b = c0200a2;
                this.f2989c = jM11127g;
                this.f2990d = 1;
                if (c3248a2.mo4388c(this) != coroutineSingletons) {
                    ys9Var = ys9VarM1093b;
                    c3248a = c3248a2;
                    c0200a = c0200a2;
                    j = jM11127g;
                    ((xc9) c0200a.f3067g).setValue(ys9Var);
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            j = this.f2989c;
            c0200a = this.f2988b;
            c3248a = this.f2987a;
            ys9Var = (ys9) this.f2991e;
            AbstractC3193b.m15359b(obj);
            try {
                ((xc9) c0200a.f3067g).setValue(ys9Var);
            } finally {
                c3248a.mo4387b(null);
            }
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.f2989c;
            AbstractC3193b.m15359b(obj);
        }
        return new cx9(j);
    }
}
