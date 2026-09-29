package androidx.compose.p002ui.text.input;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import p000.AbstractC3352my;
import p000.AbstractC3616tm;
import p000.bna;
import p000.cs4;
import p000.cx9;
import p000.e28;
import p000.eh0;
import p000.l70;
import p000.mq6;
import p000.rw9;
import p000.ts5;
import p000.vi3;
import p000.vv9;
import p000.w46;
import p000.xwc;

/* JADX INFO: renamed from: androidx.compose.ui.text.input.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0435a {

    /* JADX INFO: renamed from: a */
    public final ViewTreeObserverOnGlobalLayoutListenerC0391c f5067a;

    /* JADX INFO: renamed from: b */
    public final C0436b f5068b;

    /* JADX INFO: renamed from: d */
    public boolean f5070d;

    /* JADX INFO: renamed from: e */
    public boolean f5071e;

    /* JADX INFO: renamed from: f */
    public boolean f5072f;

    /* JADX INFO: renamed from: g */
    public boolean f5073g;

    /* JADX INFO: renamed from: h */
    public boolean f5074h;

    /* JADX INFO: renamed from: i */
    public boolean f5075i;

    /* JADX INFO: renamed from: j */
    public vv9 f5076j;

    /* JADX INFO: renamed from: k */
    public rw9 f5077k;

    /* JADX INFO: renamed from: l */
    public mq6 f5078l;

    /* JADX INFO: renamed from: n */
    public e28 f5080n;

    /* JADX INFO: renamed from: o */
    public e28 f5081o;

    /* JADX INFO: renamed from: c */
    public final Object f5069c = new Object();

    /* JADX INFO: renamed from: m */
    public vi3 f5079m = CursorAnchorInfoController$textFieldToRootTransform$1.f5060b;

    /* JADX INFO: renamed from: p */
    public final CursorAnchorInfo.Builder f5082p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q */
    public final float[] f5083q = ts5.m22286a();

    /* JADX INFO: renamed from: r */
    public final Matrix f5084r = new Matrix();

    public C0435a(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c, C0436b c0436b) {
        this.f5067a = viewTreeObserverOnGlobalLayoutListenerC0391c;
        this.f5068b = c0436b;
    }

    /* JADX INFO: renamed from: a */
    public final void m1882a() {
        CursorAnchorInfo.Builder builder;
        C0436b c0436b = this.f5068b;
        cs4 cs4Var = c0436b.f5086b;
        InputMethodManager inputMethodManager = (InputMethodManager) cs4Var.getValue();
        View view = c0436b.f5085a;
        if (inputMethodManager.isActive(view)) {
            vi3 vi3Var = this.f5079m;
            float[] fArr = this.f5083q;
            vi3Var.invoke(new ts5(fArr));
            this.f5067a.m1752v(fArr);
            Matrix matrix = this.f5084r;
            AbstractC3352my.m17107Z(matrix, fArr);
            vv9 vv9Var = this.f5076j;
            vv9Var.getClass();
            long j = vv9Var.f65991b;
            mq6 mq6Var = this.f5078l;
            mq6Var.getClass();
            rw9 rw9Var = this.f5077k;
            rw9Var.getClass();
            w46 w46Var = rw9Var.f59976b;
            e28 e28Var = this.f5080n;
            e28Var.getClass();
            float f = e28Var.f36623d;
            float f2 = e28Var.f36621b;
            e28 e28Var2 = this.f5081o;
            e28Var2.getClass();
            boolean z = this.f5072f;
            boolean z2 = this.f5073g;
            boolean z3 = this.f5074h;
            boolean z4 = this.f5075i;
            CursorAnchorInfo.Builder builder2 = this.f5082p;
            builder2.reset();
            builder2.setMatrix(matrix);
            cx9 cx9Var = vv9Var.f65992c;
            int iM9924f = cx9.m9924f(j);
            builder2.setSelectionRange(iM9924f, cx9.m9923e(j));
            if (!z || iM9924f < 0) {
                builder = builder2;
            } else {
                int iMo13411t = mq6Var.mo13411t(iM9924f);
                e28 e28VarM20956c = rw9Var.m20956c(iMo13411t);
                float fM15944g = l70.m15944g(e28VarM20956c.f36620a, 0.0f, (int) (rw9Var.f59977c >> 32));
                boolean zM24778p = xwc.m24778p(e28Var, fM15944g, e28VarM20956c.f36621b);
                boolean zM24778p2 = xwc.m24778p(e28Var, fM15944g, e28VarM20956c.f36623d);
                boolean z5 = rw9Var.m20954a(iMo13411t) == ResolvedTextDirection.Rtl;
                int i = (zM24778p || zM24778p2) ? 1 : 0;
                if (!zM24778p || !zM24778p2) {
                    i |= 2;
                }
                if (z5) {
                    i |= 4;
                }
                float f3 = e28VarM20956c.f36621b;
                float f4 = e28VarM20956c.f36623d;
                builder2.setInsertionMarkerLocation(fM15944g, f3, f4, f4, i);
                builder = builder2;
            }
            if (z2) {
                int iM9924f2 = cx9Var != null ? cx9.m9924f(cx9Var.f34694a) : -1;
                int iM9923e = cx9Var != null ? cx9.m9923e(cx9Var.f34694a) : -1;
                if (iM9924f2 >= 0 && iM9924f2 < iM9923e) {
                    builder.setComposingText(iM9924f2, vv9Var.f65990a.f54604b.subSequence(iM9924f2, iM9923e));
                    int iMo13411t2 = mq6Var.mo13411t(iM9924f2);
                    int iMo13411t3 = mq6Var.mo13411t(iM9923e);
                    float[] fArr2 = new float[(iMo13411t3 - iMo13411t2) * 4];
                    w46Var.m23740a(fArr2, eh0.m11127g(iMo13411t2, iMo13411t3));
                    while (iM9924f2 < iM9923e) {
                        int iMo13411t4 = mq6Var.mo13411t(iM9924f2);
                        int i2 = (iMo13411t4 - iMo13411t2) * 4;
                        float f5 = fArr2[i2];
                        float f6 = fArr2[i2 + 1];
                        CursorAnchorInfo.Builder builder3 = builder;
                        float f7 = fArr2[i2 + 2];
                        float f8 = fArr2[i2 + 3];
                        int i3 = iM9923e;
                        int i4 = (e28Var.f36620a < f7 ? 1 : 0) & (f5 < e28Var.f36622c ? 1 : 0) & (f2 < f8 ? 1 : 0) & (f6 < f ? 1 : 0);
                        if (!xwc.m24778p(e28Var, f5, f6) || !xwc.m24778p(e28Var, f7, f8)) {
                            i4 |= 2;
                        }
                        if (rw9Var.m20954a(iMo13411t4) == ResolvedTextDirection.Rtl) {
                            i4 |= 4;
                        }
                        int i5 = iM9924f2;
                        builder3.addCharacterBounds(i5, f5, f6, f7, f8, i4);
                        builder = builder3;
                        iM9924f2 = i5 + 1;
                        iM9923e = i3;
                    }
                }
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 33 && z3) {
                builder.setEditorBoundsInfo(AbstractC3616tm.m22211f().setEditorBounds(bna.m3982w0(e28Var2)).setHandwritingBounds(bna.m3982w0(e28Var2)).build());
            }
            if (i6 >= 34 && z4 && !e28Var.m10807h()) {
                int i7 = w46Var.f66381f - 1;
                if (i7 < 0) {
                    i7 = 0;
                }
                int iM15945h = l70.m15945h(w46Var.m23744e(f2), 0, i7);
                int iM15945h2 = l70.m15945h(w46Var.m23744e(f), 0, i7);
                if (iM15945h <= iM15945h2) {
                    while (true) {
                        builder.addVisibleLineBounds(rw9Var.m20958e(iM15945h), w46Var.m23745f(iM15945h), rw9Var.m20959f(iM15945h), w46Var.m23741b(iM15945h));
                        if (iM15945h == iM15945h2) {
                            break;
                        } else {
                            iM15945h++;
                        }
                    }
                }
            }
            ((InputMethodManager) cs4Var.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.f5071e = false;
        }
    }
}
