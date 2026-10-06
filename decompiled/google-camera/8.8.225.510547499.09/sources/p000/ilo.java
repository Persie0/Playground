package p000;

import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.Window;
import android.view.WindowManager;
import java.util.Collections;
import java.util.IdentityHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ilo {

    /* JADX INFO: renamed from: a */
    public int f31455a;

    /* JADX INFO: renamed from: b */
    public final Object f31456b;

    /* JADX INFO: renamed from: c */
    public final Object f31457c;

    public ilo() {
        this.f31457c = new SparseArray();
        this.f31455a = 0;
        this.f31456b = Collections.newSetFromMap(new IdentityHashMap());
    }

    public ilo(Shader shader, ColorStateList colorStateList, int i) {
        this.f31456b = shader;
        this.f31457c = colorStateList;
        this.f31455a = i;
    }

    public ilo(Window window, imv imvVar, byte[] bArr) {
        this.f31455a = 0;
        this.f31456b = window;
        this.f31457c = imvVar;
    }

    public ilo(bsm bsmVar) {
        this.f31456b = cbp.m3396b(150, new bsl(this, 1, null));
        this.f31457c = bsmVar;
    }

    /* JADX INFO: renamed from: j */
    public static final long m11436j(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    /* JADX INFO: renamed from: k */
    public static ilo m11437k(int i) {
        return new ilo((Shader) null, (ColorStateList) null, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m11438a() {
        lku.m15657k(this.f31455a > 0);
        int i = this.f31455a - 1;
        this.f31455a = i;
        if (i == 0) {
            m11441d(-1.0f);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m11439b(int i) {
        float fMin = (Math.min(0.6693f / Math.max(0.667f, Math.min((i / ((imv) this.f31457c).f31555a) / 2.73949f, 1.0f)), 1.0f) - 0.6693f) * 3.0238888f;
        m11441d(((1.0f - fMin) * 0.48f) + (fMin * 0.65f));
        this.f31455a++;
    }

    /* JADX INFO: renamed from: c */
    public final void m11440c() {
        m11441d(1.0f);
        this.f31455a++;
    }

    /* JADX INFO: renamed from: d */
    public final void m11441d(float f) {
        WindowManager.LayoutParams attributes = ((Window) this.f31456b).getAttributes();
        attributes.screenBrightness = f;
        ((Window) this.f31456b).setAttributes(attributes);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m11442e() {
        return this.f31456b != null;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m11443f() {
        Object obj;
        return this.f31456b == null && (obj = this.f31457c) != null && ((ColorStateList) obj).isStateful();
    }

    /* JADX INFO: renamed from: g */
    public final boolean m11444g(int[] iArr) {
        if (!m11443f()) {
            return false;
        }
        ColorStateList colorStateList = (ColorStateList) this.f31457c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f31455a) {
            return false;
        }
        this.f31455a = colorForState;
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m11445h() {
        return m11442e() || this.f31455a != 0;
    }

    /* JADX INFO: renamed from: i */
    public final C0817mc m11446i(int i) {
        C0817mc c0817mc = (C0817mc) ((SparseArray) this.f31457c).get(i);
        if (c0817mc != null) {
            return c0817mc;
        }
        C0817mc c0817mc2 = new C0817mc();
        ((SparseArray) this.f31457c).put(i, c0817mc2);
        return c0817mc2;
    }
}
