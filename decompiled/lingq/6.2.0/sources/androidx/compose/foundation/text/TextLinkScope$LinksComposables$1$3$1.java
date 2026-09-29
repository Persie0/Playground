package androidx.compose.foundation.text;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3386nv;
import p000.c32;
import p000.h66;
import p000.he5;
import p000.r83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", m4291f = "TextLinkScope.kt", m4292l = {247}, m4293m = "invokeSuspend", m4294v = 1)
final class TextLinkScope$LinksComposables$1$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2828a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ he5 f2829b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(he5 he5Var, Continuation continuation) {
        super(2, continuation);
        this.f2829b = he5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextLinkScope$LinksComposables$1$3$1(this.f2829b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextLinkScope$LinksComposables$1$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2828a;
        Object obj3 = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj3;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        this.f2828a = 1;
        he5 he5Var = this.f2829b;
        he5Var.getClass();
        h66 h66Var = new h66();
        C3229i c3229i = he5Var.f42257a.f64886a;
        r83 r83Var = new r83(2, h66Var, he5Var);
        c3229i.getClass();
        Object objM15548j = C3229i.m15548j(c3229i, r83Var, this);
        if (objM15548j != obj2) {
            objM15548j = obj3;
        }
        return objM15548j == obj2 ? obj2 : obj3;
    }
}
