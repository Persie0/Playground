package androidx.compose.foundation.text.input.internal;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p002ui.text.style.ResolvedTextDirection;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.AbstractC3616tm;
import p000.aq4;
import p000.b64;
import p000.bna;
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
import p000.xc9;

/* JADX INFO: renamed from: androidx.compose.foundation.text.input.internal.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0189c {

    /* JADX INFO: renamed from: a */
    public final vi3 f2947a;

    /* JADX INFO: renamed from: b */
    public final b64 f2948b;

    /* JADX INFO: renamed from: d */
    public boolean f2950d;

    /* JADX INFO: renamed from: e */
    public boolean f2951e;

    /* JADX INFO: renamed from: f */
    public boolean f2952f;

    /* JADX INFO: renamed from: g */
    public boolean f2953g;

    /* JADX INFO: renamed from: h */
    public boolean f2954h;

    /* JADX INFO: renamed from: i */
    public boolean f2955i;

    /* JADX INFO: renamed from: j */
    public vv9 f2956j;

    /* JADX INFO: renamed from: k */
    public rw9 f2957k;

    /* JADX INFO: renamed from: l */
    public mq6 f2958l;

    /* JADX INFO: renamed from: m */
    public e28 f2959m;

    /* JADX INFO: renamed from: n */
    public e28 f2960n;

    /* JADX INFO: renamed from: c */
    public final Object f2949c = new Object();

    /* JADX INFO: renamed from: o */
    public final CursorAnchorInfo.Builder f2961o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p */
    public final float[] f2962p = ts5.m22286a();

    /* JADX INFO: renamed from: q */
    public final Matrix f2963q = new Matrix();

    public C0189c(vi3 vi3Var, b64 b64Var) {
        this.f2947a = vi3Var;
        this.f2948b = b64Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m1091a() {
        CursorAnchorInfo.Builder builder;
        b64 b64Var = this.f2948b;
        InputMethodManager inputMethodManagerM3362o = b64Var.m3362o();
        View view = (View) b64Var.f8006a;
        if (!inputMethodManagerM3362o.isActive(view) || this.f2956j == null || this.f2958l == null || this.f2957k == null || this.f2959m == null || this.f2960n == null) {
            return;
        }
        float[] fArr = this.f2962p;
        ts5.m22289d(fArr);
        aq4 aq4Var = (aq4) ((xc9) ((C0183x8f2ae8f3) this.f2947a).f2930i.f63009M).getValue();
        if (aq4Var != null) {
            if (!aq4Var.mo1691n()) {
                aq4Var = null;
            }
            if (aq4Var != null) {
                aq4Var.mo1682g(fArr);
            }
        }
        e28 e28Var = this.f2960n;
        e28Var.getClass();
        float f = -e28Var.f36620a;
        e28 e28Var2 = this.f2960n;
        e28Var2.getClass();
        ts5.m22293h(fArr, f, -e28Var2.f36621b);
        Matrix matrix = this.f2963q;
        AbstractC3352my.m17107Z(matrix, fArr);
        vv9 vv9Var = this.f2956j;
        vv9Var.getClass();
        long j = vv9Var.f65991b;
        mq6 mq6Var = this.f2958l;
        mq6Var.getClass();
        rw9 rw9Var = this.f2957k;
        rw9Var.getClass();
        w46 w46Var = rw9Var.f59976b;
        e28 e28Var3 = this.f2959m;
        e28Var3.getClass();
        float f2 = e28Var3.f36623d;
        float f3 = e28Var3.f36621b;
        e28 e28Var4 = this.f2960n;
        e28Var4.getClass();
        boolean z = this.f2952f;
        boolean z2 = this.f2953g;
        boolean z3 = this.f2954h;
        boolean z4 = this.f2955i;
        CursorAnchorInfo.Builder builder2 = this.f2961o;
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
            boolean zM15214h = AbstractC3184kh.m15214h(e28Var3, fM15944g, e28VarM20956c.f36621b);
            boolean zM15214h2 = AbstractC3184kh.m15214h(e28Var3, fM15944g, e28VarM20956c.f36623d);
            boolean z5 = rw9Var.m20954a(iMo13411t) == ResolvedTextDirection.Rtl;
            int i = (zM15214h || zM15214h2) ? 1 : 0;
            if (!zM15214h || !zM15214h2) {
                i |= 2;
            }
            if (z5) {
                i |= 4;
            }
            float f4 = e28VarM20956c.f36621b;
            float f5 = e28VarM20956c.f36623d;
            builder2.setInsertionMarkerLocation(fM15944g, f4, f5, f5, i);
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
                    float f6 = fArr2[i2];
                    CursorAnchorInfo.Builder builder3 = builder;
                    float f7 = fArr2[i2 + 1];
                    int i3 = iM9923e;
                    float f8 = fArr2[i2 + 2];
                    float f9 = fArr2[i2 + 3];
                    int i4 = iMo13411t2;
                    int i5 = (e28Var3.f36620a < f8 ? 1 : 0) & (f6 < e28Var3.f36622c ? 1 : 0) & (f3 < f9 ? 1 : 0) & (f7 < f2 ? 1 : 0);
                    if (!AbstractC3184kh.m15214h(e28Var3, f6, f7) || !AbstractC3184kh.m15214h(e28Var3, f8, f9)) {
                        i5 |= 2;
                    }
                    if (rw9Var.m20954a(iMo13411t4) == ResolvedTextDirection.Rtl) {
                        i5 |= 4;
                    }
                    int i6 = iM9924f2;
                    builder3.addCharacterBounds(i6, f6, f7, f8, f9, i5);
                    builder = builder3;
                    iM9924f2 = i6 + 1;
                    iM9923e = i3;
                    iMo13411t2 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z3) {
            builder.setEditorBoundsInfo(AbstractC3616tm.m22211f().setEditorBounds(bna.m3982w0(e28Var4)).setHandwritingBounds(bna.m3982w0(e28Var4)).build());
        }
        if (i7 >= 34 && z4 && !e28Var3.m10807h()) {
            int i8 = w46Var.f66381f - 1;
            if (i8 < 0) {
                i8 = 0;
            }
            int iM15945h = l70.m15945h(w46Var.m23744e(f3), 0, i8);
            int iM15945h2 = l70.m15945h(w46Var.m23744e(f2), 0, i8);
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
        b64Var.m3362o().updateCursorAnchorInfo(view, builder.build());
        this.f2951e = false;
    }
}
