package androidx.compose.p002ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.b28;
import p000.bb0;
import p000.ci8;
import p000.cs4;
import p000.cx9;
import p000.e28;
import p000.fa4;
import p000.gm5;
import p000.h97;
import p000.iw2;
import p000.mq6;
import p000.or3;
import p000.ri0;
import p000.rw9;
import p000.sm1;
import p000.ss5;
import p000.ui3;
import p000.vi3;
import p000.vv9;
import p000.w04;
import p000.x66;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0439e implements h97 {

    /* JADX INFO: renamed from: a */
    public final View f5090a;

    /* JADX INFO: renamed from: b */
    public final C0436b f5091b;

    /* JADX INFO: renamed from: c */
    public final iw2 f5092c;

    /* JADX INFO: renamed from: d */
    public boolean f5093d;

    /* JADX INFO: renamed from: e */
    public vi3 f5094e;

    /* JADX INFO: renamed from: f */
    public vi3 f5095f;

    /* JADX INFO: renamed from: g */
    public vv9 f5096g;

    /* JADX INFO: renamed from: h */
    public w04 f5097h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f5098i;

    /* JADX INFO: renamed from: j */
    public final cs4 f5099j;

    /* JADX INFO: renamed from: k */
    public Rect f5100k;

    /* JADX INFO: renamed from: l */
    public final C0435a f5101l;

    /* JADX INFO: renamed from: m */
    public final x66 f5102m;

    /* JADX INFO: renamed from: n */
    public RunnableC0437c f5103n;

    public C0439e(View view, ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        C0436b c0436b = new C0436b(view);
        iw2 iw2Var = new iw2(Choreographer.getInstance(), 1);
        this.f5090a = view;
        this.f5091b = c0436b;
        this.f5092c = iw2Var;
        this.f5094e = TextInputServiceAndroid$onEditCommand$1.f5063b;
        this.f5095f = TextInputServiceAndroid$onImeActionPerformed$1.f5064b;
        this.f5096g = new vv9("", 4, cx9.f34692b);
        this.f5097h = w04.f66163g;
        this.f5098i = new ArrayList();
        this.f5099j = AbstractC3192a.m15357b(LazyThreadSafetyMode.NONE, new ui3() { // from class: androidx.compose.ui.text.input.TextInputServiceAndroid$baseInputConnection$2
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                return new BaseInputConnection(this.f5062b.f5090a, false);
            }
        });
        this.f5101l = new C0435a(viewTreeObserverOnGlobalLayoutListenerC0391c, c0436b);
        this.f5102m = new x66(new TextInputServiceAndroid$TextInputCommand[16]);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: a */
    public final void mo1079a() {
        m1883i(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: b */
    public final void mo1080b() {
        m1883i(TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: c */
    public final void mo1081c() {
        this.f5093d = false;
        this.f5094e = TextInputServiceAndroid$stopInput$1.f5065b;
        this.f5095f = TextInputServiceAndroid$stopInput$2.f5066b;
        this.f5100k = null;
        m1883i(TextInputServiceAndroid$TextInputCommand.StopInput);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: d */
    public final void mo1082d(vv9 vv9Var, mq6 mq6Var, rw9 rw9Var, ri0 ri0Var, e28 e28Var, e28 e28Var2) {
        C0435a c0435a = this.f5101l;
        synchronized (c0435a.f5069c) {
            try {
                c0435a.f5076j = vv9Var;
                c0435a.f5078l = mq6Var;
                c0435a.f5077k = rw9Var;
                c0435a.f5079m = ri0Var;
                c0435a.f5080n = e28Var;
                c0435a.f5081o = e28Var2;
                if (c0435a.f5071e || c0435a.f5070d) {
                    c0435a.m1882a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: e */
    public final void mo1083e(vv9 vv9Var, vv9 vv9Var2) {
        boolean z = (cx9.m9920b(this.f5096g.f65991b, vv9Var2.f65991b) && fa4.m11650l(this.f5096g.f65992c, vv9Var2.f65992c)) ? false : true;
        this.f5096g = vv9Var2;
        int size = this.f5098i.size();
        for (int i = 0; i < size; i++) {
            b28 b28Var = (b28) ((WeakReference) this.f5098i.get(i)).get();
            if (b28Var != null) {
                b28Var.f7799d = vv9Var2;
            }
        }
        C0435a c0435a = this.f5101l;
        synchronized (c0435a.f5069c) {
            c0435a.f5076j = null;
            c0435a.f5078l = null;
            c0435a.f5077k = null;
            c0435a.f5079m = CursorAnchorInfoController$invalidate$1$1.f5059b;
            c0435a.f5080n = null;
            c0435a.f5081o = null;
        }
        if (fa4.m11650l(vv9Var, vv9Var2)) {
            if (z) {
                C0436b c0436b = this.f5091b;
                int iM9924f = cx9.m9924f(vv9Var2.f65991b);
                int iM9923e = cx9.m9923e(vv9Var2.f65991b);
                cx9 cx9Var = this.f5096g.f65992c;
                int iM9924f2 = cx9Var != null ? cx9.m9924f(cx9Var.f34694a) : -1;
                cx9 cx9Var2 = this.f5096g.f65992c;
                ((InputMethodManager) c0436b.f5086b.getValue()).updateSelection(c0436b.f5085a, iM9924f, iM9923e, iM9924f2, cx9Var2 != null ? cx9.m9923e(cx9Var2.f34694a) : -1);
                return;
            }
            return;
        }
        if (vv9Var != null && (!fa4.m11650l(vv9Var.f65990a.f54604b, vv9Var2.f65990a.f54604b) || (cx9.m9920b(vv9Var.f65991b, vv9Var2.f65991b) && !fa4.m11650l(vv9Var.f65992c, vv9Var2.f65992c)))) {
            C0436b c0436b2 = this.f5091b;
            ((InputMethodManager) c0436b2.f5086b.getValue()).restartInput(c0436b2.f5085a);
            return;
        }
        int size2 = this.f5098i.size();
        for (int i2 = 0; i2 < size2; i2++) {
            b28 b28Var2 = (b28) ((WeakReference) this.f5098i.get(i2)).get();
            if (b28Var2 != null) {
                vv9 vv9Var3 = this.f5096g;
                C0436b c0436b3 = this.f5091b;
                if (b28Var2.f7803h) {
                    b28Var2.f7799d = vv9Var3;
                    if (b28Var2.f7801f) {
                        ((InputMethodManager) c0436b3.f5086b.getValue()).updateExtractedText(c0436b3.f5085a, b28Var2.f7800e, ci8.m4713Z(vv9Var3));
                    }
                    cx9 cx9Var3 = vv9Var3.f65992c;
                    long j = vv9Var3.f65991b;
                    int iM9924f3 = cx9Var3 != null ? cx9.m9924f(cx9Var3.f34694a) : -1;
                    cx9 cx9Var4 = vv9Var3.f65992c;
                    ((InputMethodManager) c0436b3.f5086b.getValue()).updateSelection(c0436b3.f5085a, cx9.m9924f(j), cx9.m9923e(j), iM9924f3, cx9Var4 != null ? cx9.m9923e(cx9Var4.f34694a) : -1);
                }
            }
        }
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: f */
    public final void mo1084f() {
        m1883i(TextInputServiceAndroid$TextInputCommand.HideKeyboard);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: g */
    public final void mo1085g(vv9 vv9Var, w04 w04Var, bb0 bb0Var, sm1 sm1Var) {
        this.f5093d = true;
        this.f5096g = vv9Var;
        this.f5097h = w04Var;
        this.f5094e = bb0Var;
        this.f5095f = sm1Var;
        m1883i(TextInputServiceAndroid$TextInputCommand.StartInput);
    }

    @Override // p000.h97
    /* JADX INFO: renamed from: h */
    public final void mo1086h(e28 e28Var) {
        Rect rect;
        this.f5100k = new Rect(ss5.m21693T(e28Var.f36620a), ss5.m21693T(e28Var.f36621b), ss5.m21693T(e28Var.f36622c), ss5.m21693T(e28Var.f36623d));
        if (!this.f5098i.isEmpty() || (rect = this.f5100k) == null) {
            return;
        }
        this.f5090a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.c, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public final void m1883i(TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand) {
        this.f5102m.m24305c(textInputServiceAndroid$TextInputCommand);
        if (this.f5103n == null) {
            ?? r2 = new Runnable() { // from class: androidx.compose.ui.text.input.c
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    C0439e c0439e = this.f5088a;
                    C0436b c0436b = c0439e.f5091b;
                    c0439e.f5103n = null;
                    x66 x66Var = c0439e.f5102m;
                    View view = c0439e.f5090a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        x66Var.m24310h();
                        return;
                    }
                    Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    Object[] objArr = x66Var.f67830a;
                    int i = x66Var.f67832c;
                    for (int i2 = 0; i2 < i; i2++) {
                        TextInputServiceAndroid$TextInputCommand textInputServiceAndroid$TextInputCommand2 = (TextInputServiceAndroid$TextInputCommand) objArr[i2];
                        int i3 = AbstractC0438d.f5089a[textInputServiceAndroid$TextInputCommand2.ordinal()];
                        if (i3 == 1) {
                            Boolean bool = Boolean.TRUE;
                            ref$ObjectRef.f47718a = bool;
                            ref$ObjectRef2.f47718a = bool;
                        } else if (i3 == 2) {
                            Boolean bool2 = Boolean.FALSE;
                            ref$ObjectRef.f47718a = bool2;
                            ref$ObjectRef2.f47718a = bool2;
                        } else if (i3 != 3 && i3 != 4) {
                            gm5.m12750e();
                            return;
                        } else if (!fa4.m11650l(ref$ObjectRef.f47718a, Boolean.FALSE)) {
                            ref$ObjectRef2.f47718a = Boolean.valueOf(textInputServiceAndroid$TextInputCommand2 == TextInputServiceAndroid$TextInputCommand.ShowKeyboard);
                        }
                    }
                    x66Var.m24310h();
                    if (fa4.m11650l(ref$ObjectRef.f47718a, Boolean.TRUE)) {
                        ((InputMethodManager) c0436b.f5086b.getValue()).restartInput(c0436b.f5085a);
                    }
                    Boolean bool3 = (Boolean) ref$ObjectRef2.f47718a;
                    if (bool3 != null) {
                        if (bool3.booleanValue()) {
                            ((or3) c0436b.f5087c.f9881a).mo17934Q();
                        } else {
                            ((or3) c0436b.f5087c.f9881a).mo17933F();
                        }
                    }
                    if (fa4.m11650l(ref$ObjectRef.f47718a, Boolean.FALSE)) {
                        ((InputMethodManager) c0436b.f5086b.getValue()).restartInput(c0436b.f5085a);
                    }
                }
            };
            this.f5092c.execute(r2);
            this.f5103n = r2;
        }
    }
}
