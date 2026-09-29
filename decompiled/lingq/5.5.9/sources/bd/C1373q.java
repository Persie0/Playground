package bd;

import ae.C0062b;
import android.animation.ObjectAnimator;
import android.util.Property;
import java.util.Arrays;
import p185j.AbstractC6392b;
import p378s3.C8953b;

/* JADX INFO: renamed from: bd.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1373q extends AbstractC6392b {

    /* JADX INFO: renamed from: j */
    public static final a f8266j = new a();

    /* JADX INFO: renamed from: d */
    public ObjectAnimator f8267d;

    /* JADX INFO: renamed from: e */
    public final C8953b f8268e;

    /* JADX INFO: renamed from: f */
    public final C1377u f8269f;

    /* JADX INFO: renamed from: g */
    public int f8270g;

    /* JADX INFO: renamed from: h */
    public boolean f8271h;

    /* JADX INFO: renamed from: i */
    public float f8272i;

    /* JADX INFO: renamed from: bd.q$a */
    public class a extends Property<C1373q, Float> {
        public a() {
            super(Float.class, "animationFraction");
        }

        @Override // android.util.Property
        public final Float get(C1373q c1373q) {
            return Float.valueOf(c1373q.f8272i);
        }

        @Override // android.util.Property
        public final void set(C1373q c1373q, Float f3) {
            C1373q c1373q2 = c1373q;
            float fFloatValue = f3.floatValue();
            c1373q2.f8272i = fFloatValue;
            float[] fArr = (float[]) c1373q2.f36837b;
            fArr[0] = 0.0f;
            float f10 = (((int) (fFloatValue * 333.0f)) - 0) / 667;
            C8953b c8953b = c1373q2.f8268e;
            float interpolation = c8953b.getInterpolation(f10);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = (float[]) c1373q2.f36837b;
            float interpolation2 = c8953b.getInterpolation(f10 + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = (float[]) c1373q2.f36837b;
            fArr3[5] = 1.0f;
            if (c1373q2.f8271h && fArr3[3] < 1.0f) {
                int[] iArr = (int[]) c1373q2.f36838c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = C0062b.m413x0(c1373q2.f8269f.f8212c[c1373q2.f8270g], ((C1370n) c1373q2.f36836a).f8256j);
                c1373q2.f8271h = false;
            }
            ((C1370n) c1373q2.f36836a).invalidateSelf();
        }
    }

    public C1373q(C1377u c1377u) {
        super(3);
        this.f8270g = 1;
        this.f8269f = c1377u;
        this.f8268e = new C8953b();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: c */
    public final void mo4945c() {
        ObjectAnimator objectAnimator = this.f8267d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: f */
    public final void mo4946f() {
        m4961k();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: g */
    public final void mo4947g(AbstractC1358b.c cVar) {
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: h */
    public final void mo4948h() {
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: i */
    public final void mo4949i() {
        if (this.f8267d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f8266j, 0.0f, 1.0f);
            this.f8267d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f8267d.setInterpolator(null);
            this.f8267d.setRepeatCount(-1);
            this.f8267d.addListener(new C1372p(this));
        }
        m4961k();
        this.f8267d.start();
    }

    @Override // p185j.AbstractC6392b
    /* JADX INFO: renamed from: j */
    public final void mo4950j() {
    }

    /* JADX INFO: renamed from: k */
    public final void m4961k() {
        this.f8271h = true;
        this.f8270g = 1;
        Arrays.fill((int[]) this.f36838c, C0062b.m413x0(this.f8269f.f8212c[0], ((C1370n) this.f36836a).f8256j));
    }
}
