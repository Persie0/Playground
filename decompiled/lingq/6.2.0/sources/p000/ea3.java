package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ea3 extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a */
    public Drawable.ConstantState f36899a;

    /* JADX INFO: renamed from: b */
    public int f36900b;

    /* JADX INFO: renamed from: c */
    public boolean f36901c;

    /* JADX INFO: renamed from: d */
    public int f36902d;

    /* JADX INFO: renamed from: e */
    public boolean f36903e;

    /* JADX INFO: renamed from: f */
    public int f36904f;

    /* JADX INFO: renamed from: g */
    public int f36905g;

    /* JADX INFO: renamed from: h */
    public int f36906h;

    /* JADX INFO: renamed from: i */
    public int f36907i;

    /* JADX INFO: renamed from: j */
    public float f36908j;

    /* JADX INFO: renamed from: k */
    public int f36909k;

    /* JADX INFO: renamed from: l */
    public float f36910l;

    /* JADX INFO: renamed from: m */
    public int f36911m;

    /* JADX INFO: renamed from: n */
    public float f36912n;

    /* JADX INFO: renamed from: o */
    public int f36913o;

    /* JADX INFO: renamed from: p */
    public float f36914p;

    /* JADX INFO: renamed from: q */
    public int f36915q;

    /* JADX INFO: renamed from: r */
    public float f36916r;

    /* JADX INFO: renamed from: s */
    public int f36917s;

    /* JADX INFO: renamed from: t */
    public p39 f36918t;

    /* JADX INFO: renamed from: u */
    public int f36919u;

    /* JADX INFO: renamed from: v */
    public int f36920v;

    /* JADX INFO: renamed from: w */
    public Rect f36921w;

    /* JADX INFO: renamed from: x */
    public int[] f36922x;

    public ea3(ea3 ea3Var) {
        this.f36900b = 0;
        this.f36901c = false;
        this.f36902d = Integer.MIN_VALUE;
        this.f36903e = false;
        this.f36904f = Integer.MIN_VALUE;
        this.f36905g = Integer.MIN_VALUE;
        this.f36906h = Integer.MIN_VALUE;
        this.f36907i = Integer.MIN_VALUE;
        this.f36908j = Float.NaN;
        this.f36909k = Integer.MIN_VALUE;
        this.f36910l = Float.NaN;
        this.f36911m = Integer.MIN_VALUE;
        this.f36912n = Float.NaN;
        this.f36913o = Integer.MIN_VALUE;
        this.f36914p = Float.NaN;
        this.f36915q = Integer.MIN_VALUE;
        this.f36916r = Float.NaN;
        this.f36917s = Integer.MIN_VALUE;
        this.f36918t = null;
        this.f36919u = Integer.MIN_VALUE;
        this.f36920v = Integer.MIN_VALUE;
        this.f36921w = null;
        this.f36922x = FocusRingDrawable.f12978L;
        if (ea3Var != null) {
            this.f36899a = ea3Var.f36899a;
            this.f36900b = ea3Var.f36900b;
            this.f36901c = ea3Var.f36901c;
            this.f36902d = ea3Var.f36902d;
            this.f36903e = ea3Var.f36903e;
            this.f36904f = ea3Var.f36904f;
            this.f36905g = ea3Var.f36905g;
            this.f36906h = ea3Var.f36906h;
            this.f36907i = ea3Var.f36907i;
            this.f36908j = ea3Var.f36908j;
            this.f36909k = ea3Var.f36909k;
            this.f36910l = ea3Var.f36910l;
            this.f36911m = ea3Var.f36911m;
            this.f36912n = ea3Var.f36912n;
            this.f36913o = ea3Var.f36913o;
            this.f36914p = ea3Var.f36914p;
            this.f36915q = ea3Var.f36915q;
            this.f36916r = ea3Var.f36916r;
            this.f36917s = ea3Var.f36917s;
            this.f36919u = ea3Var.f36919u;
            this.f36920v = ea3Var.f36920v;
            p39 p39Var = ea3Var.f36918t;
            if (p39Var instanceof r39) {
                this.f36918t = ((r39) p39Var).m20285l().m19627a();
            } else if (p39Var instanceof ih9) {
                ih9 ih9Var = (ih9) p39Var;
                ih9Var.getClass();
                this.f36918t = new hh9(ih9Var).m13253j();
            } else {
                this.f36918t = p39Var;
            }
            if (ea3Var.f36921w != null) {
                this.f36921w = new Rect(ea3Var.f36921w);
            }
            int[] iArr = ea3Var.f36922x;
            this.f36922x = Arrays.copyOf(iArr, iArr.length);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m10994Q() {
        return this.f36899a != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        Drawable.ConstantState constantState = this.f36899a;
        return this.f36900b | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new FocusRingDrawable(this, null, 0 == true ? 1 : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new FocusRingDrawable(this, resources, null);
    }
}
