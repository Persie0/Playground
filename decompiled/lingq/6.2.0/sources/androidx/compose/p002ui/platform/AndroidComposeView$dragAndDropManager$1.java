package androidx.compose.p002ui.platform;

import android.content.res.Resources;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.C2964eh;
import p000.aj3;
import p000.ho2;
import p000.ib2;
import p000.me1;
import p000.vi3;
import p000.x89;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements aj3 {
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            ho2.m13383c();
            return null;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = (ViewTreeObserverOnGlobalLayoutListenerC0391c) this.f47704b;
        Resources resources = viewTreeObserverOnGlobalLayoutListenerC0391c.getContext().getResources();
        return Boolean.valueOf(C2964eh.f37227a.m11103a(viewTreeObserverOnGlobalLayoutListenerC0391c, null, new me1(new ib2(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((x89) obj2).f67935a, (vi3) obj3)));
    }
}
