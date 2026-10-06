package p000;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.libraries.oliveoil.p018gl.EGLImage;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class lbx implements Callable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lby f37898a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f37899b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f37900c;

    public lbx(lby lbyVar, SurfaceView surfaceView, int i) {
        this.f37900c = i;
        this.f37898a = lbyVar;
        this.f37899b = surfaceView;
    }

    public lbx(lby lbyVar, EGLImage eGLImage, int i) {
        this.f37900c = i;
        this.f37898a = lbyVar;
        this.f37899b = eGLImage;
    }

    public lbx(lby lbyVar, lbl lblVar, int i) {
        this.f37900c = i;
        this.f37898a = lbyVar;
        this.f37899b = lblVar;
    }

    public final String toString() {
        switch (this.f37900c) {
            case 0:
                return "createCanvasForImage(" + ((EGLImage) this.f37899b).m4707b().toString() + ")";
            case 1:
                return "createCanvasForSurfaceView(" + String.valueOf(this.f37899b) + ")";
            default:
                return "createTexture(RGBA8888)";
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() throws Exception {
        switch (this.f37900c) {
            case 0:
                lby lbyVar = this.f37898a;
                Object obj = this.f37899b;
                int iM15204a = ldp.m15204a();
                int[] iArr = new int[1];
                GLES30.glGenRenderbuffers(1, iArr, 0);
                int i = iArr[0];
                GLES30.glBindRenderbuffer(36161, i);
                EGLImage eGLImage = (EGLImage) obj;
                EGLImage.attachToRbo(eGLImage.f7948a);
                GLES30.glBindFramebuffer(36160, iM15204a);
                GLES30.glFramebufferRenderbuffer(36160, 36064, 36161, i);
                ldi ldiVar = (ldi) lbyVar.mo15157i().mo15164c();
                return new ldl(ldiVar.mo15185h(), ldiVar.mo15183f(), ldiVar.mo15184g(), ldiVar.mo15182e(), ldiVar.mo15181d(), iM15204a, new lbm(eGLImage.m4707b()), ldiVar, i, iM15204a);
            case 1:
                lby lbyVar2 = this.f37898a;
                SurfaceHolder holder = ((SurfaceView) this.f37899b).getHolder();
                ldi ldiVar2 = (ldi) lbyVar2.mo15157i().mo15164c();
                lcw lcwVar = new lcw(kua.m14875n(ldiVar2));
                ldn ldnVar = new ldn(lbyVar2, lcwVar, ldiVar2);
                holder.addCallback(ldnVar);
                return new ldo(lcwVar, ldnVar, holder);
            default:
                ldv ldvVarM15213h = ldv.m15213h(this.f37898a.mo15153e(), (lbl) this.f37899b);
                try {
                    ldvVarM15213h.m15215e();
                    if (ldvVarM15213h.f37999a.m15238b(leb.f38016a)) {
                        ldvVarM15213h.m15214d();
                    } else {
                        lku.m15613H(!ldvVarM15213h.f38002e);
                        GLES20.glTexImage2D(ldvVarM15213h.f38000c, 0, 32856, ldvVarM15213h.f38003f.f37877a.m15089b(), ldvVarM15213h.f38003f.f37877a.m15088a(), 0, 6408, 5121, null);
                        ldvVarM15213h.f38002e = true;
                    }
                    ldv.m15212g(ldd.m15199b());
                    ldvVarM15213h.f38002e = true;
                    return ldvVarM15213h;
                } catch (Exception e) {
                    ldvVarM15213h.close();
                    throw e;
                }
        }
    }
}
