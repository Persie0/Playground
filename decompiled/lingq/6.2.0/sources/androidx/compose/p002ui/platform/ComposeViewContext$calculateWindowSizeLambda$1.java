package androidx.compose.p002ui.platform;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.view.View;
import kotlin.jvm.internal.Lambda;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.dc2;
import p000.hb2;
import p000.hh0;
import p000.jb2;
import p000.kh0;
import p000.my5;
import p000.n84;
import p000.omd;
import p000.s6b;
import p000.t6b;
import p000.u6b;
import p000.ui3;
import p000.v6b;

/* JADX INFO: loaded from: classes.dex */
final class ComposeViewContext$calculateWindowSizeLambda$1 extends Lambda implements ui3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0401m f4540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$calculateWindowSizeLambda$1(C0401m c0401m) {
        super(0);
        this.f4540b = c0401m;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        v6b v6bVar;
        boolean zM17279a = n84.m17279a(0L, 0L);
        View view = this.f4540b.f4786a;
        if (!zM17279a) {
            return new dc2(0L, AbstractC3489q9.m19772b(view.getContext()).mo915v(omd.m18152h0(0L)));
        }
        Context context = view.getContext();
        Context baseContext = context;
        while (true) {
            if (baseContext instanceof ContextWrapper) {
                if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService) || (baseContext instanceof Application)) {
                    break;
                }
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                }
            }
            baseContext = null;
            break;
        }
        if (baseContext == null) {
            Configuration configuration = context.getResources().getConfiguration();
            jb2 jb2VarM19772b = AbstractC3489q9.m19772b(context);
            long jM21614a = AbstractC3584sr.m21614a(configuration.screenWidthDp, configuration.screenHeightDp);
            long jMo902D0 = jb2VarM19772b.mo902D0(jM21614a);
            return new dc2((((long) ((int) Float.intBitsToFloat((int) (jMo902D0 & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (jMo902D0 >> 32)))) << 32), jM21614a);
        }
        t6b.f61921a.getClass();
        s6b s6bVar = s6b.f60436a;
        u6b u6bVar = s6b.f60437b;
        u6bVar.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            v6bVar = hb2.f42125b;
        } else {
            v6bVar = i >= 30 ? kh0.f47285b : my5.f52034e;
        }
        hh0 hh0Var = v6bVar.mo13181d(baseContext, u6bVar.f63500b).f58809a;
        long jHeight = (4294967295L & ((long) hh0Var.m13239c().height())) | (((long) hh0Var.m13239c().width()) << 32);
        return new dc2(jHeight, AbstractC3489q9.m19772b(baseContext).mo915v(omd.m18152h0(jHeight)));
    }
}
