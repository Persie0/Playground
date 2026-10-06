package p000;

import android.view.SurfaceView;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ldx extends lcf {
    public ldx(lby lbyVar, kzx kzxVar, byte[] bArr, byte[] bArr2) {
        super(lbyVar, kzxVar);
    }

    /* JADX INFO: renamed from: b */
    public static ldx m15217b(lby lbyVar, String str) {
        return m15218g(lbyVar, 35632, str);
    }

    /* JADX INFO: renamed from: g */
    public static ldx m15218g(lby lbyVar, int i, String str) {
        return new ldx(lbyVar, lcf.m15165d(lbyVar, new ldw(i, str)));
    }

    /* JADX INFO: renamed from: h */
    public static ldx m15219h(lby lbyVar, String str) {
        return m15218g(lbyVar, 35633, str);
    }

    /* JADX INFO: renamed from: j */
    public static ldx m15220j(lby lbyVar, EGLImage eGLImage) {
        if (eGLImage.m4706a() != 35 && eGLImage.m4706a() != 34) {
            return new ldx(lbyVar, lcf.m15165d(lbyVar, new lbx(lbyVar, eGLImage, 0)), null, null);
        }
        lcy lcyVarM15192b = lcy.m15192b(lbyVar, eGLImage);
        lgb lgbVarM14876o = kua.m14876o(ldz.m15228h(lcyVarM15192b.f37915b, lcyVarM15192b.m15193g(), ((ldv) lcyVarM15192b.m15167f()).f37998b, ((ldv) lcyVarM15192b.m15167f()).f38000c));
        lby lbyVar2 = ((ldz) lgbVarM14876o.mo15294c()).f37915b;
        return new lbw(lbyVar2, lcf.m15165d(lbyVar2, new lbv(lgbVarM14876o, 2)), lcyVarM15192b);
    }

    /* JADX INFO: renamed from: k */
    public static ldx m15221k(lby lbyVar, final lgb lgbVar, final kzh kzhVar) {
        return new ldx(lbyVar, lbyVar.mo15157i().m15166e(new lbt(kzhVar, 0), new kyz() { // from class: lbu
            @Override // p000.kyz
            /* JADX INFO: renamed from: a */
            public final Object mo8768a(Object obj) {
                return ldp.m15205b((ldi) obj, lgbVar, kzhVar);
            }
        }), null, null);
    }

    /* JADX INFO: renamed from: l */
    public static ldx m15222l(lby lbyVar, SurfaceView surfaceView) {
        return new ldx(lbyVar, lcf.m15165d(lbyVar, new lbx(lbyVar, surfaceView, 1)), null, null);
    }

    /* JADX INFO: renamed from: m */
    public static ldx m15223m(lgb lgbVar) {
        lby lbyVar = ((ldz) lgbVar.mo15294c()).f37915b;
        return new ldx(lbyVar, lcf.m15165d(lbyVar, new lbv(lgbVar, 0)), null, null);
    }

    /* JADX INFO: renamed from: n */
    public static ldx m15224n(lby lbyVar, lbl lblVar) {
        return m15223m(kua.m14876o(ldz.m15227g(lbyVar, lblVar)));
    }

    /* JADX INFO: renamed from: o */
    public static lpe m15225o(lby lbyVar) {
        return new lpe(lbyVar);
    }

    /* JADX INFO: renamed from: i */
    public final void m15226i(lfw lfwVar) {
        m15166e(new fse(3), new kzc(lfwVar, 4));
    }

    public ldx(lby lbyVar, kzx kzxVar, byte[] bArr) {
        super(lbyVar, kzxVar);
    }

    private ldx(lby lbyVar, kzx kzxVar) {
        super(lbyVar, kzxVar);
    }
}
