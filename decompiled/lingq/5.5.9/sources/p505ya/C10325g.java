package p505ya;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import com.google.android.exoplayer2.util.C2531b;
import com.google.android.exoplayer2.util.GlUtil;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p218k9.C6639i;

/* JADX INFO: renamed from: ya.g */
/* JADX INFO: loaded from: classes.dex */
public final class C10325g extends GLSurfaceView implements InterfaceC10326h {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f51963b = 0;

    /* JADX INFO: renamed from: a */
    public final a f51964a;

    /* JADX INFO: renamed from: ya.g$a */
    public static final class a implements GLSurfaceView.Renderer {

        /* JADX INFO: renamed from: j */
        public static final float[] f51965j = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* JADX INFO: renamed from: k */
        public static final String[] f51966k = {"y_tex", "u_tex", "v_tex"};

        /* JADX INFO: renamed from: l */
        public static final FloatBuffer f51967l = GlUtil.m7478d(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* JADX INFO: renamed from: a */
        public final GLSurfaceView f51968a;

        /* JADX INFO: renamed from: b */
        public final int[] f51969b = new int[3];

        /* JADX INFO: renamed from: c */
        public final int[] f51970c = new int[3];

        /* JADX INFO: renamed from: d */
        public final int[] f51971d = new int[3];

        /* JADX INFO: renamed from: e */
        public final int[] f51972e = new int[3];

        /* JADX INFO: renamed from: f */
        public final AtomicReference<C6639i> f51973f = new AtomicReference<>();

        /* JADX INFO: renamed from: g */
        public C2531b f51974g;

        /* JADX INFO: renamed from: h */
        public int f51975h;

        /* JADX INFO: renamed from: i */
        public C6639i f51976i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f51968a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f51971d;
                this.f51972e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            C6639i andSet = this.f51973f.getAndSet(null);
            if (andSet == null && this.f51976i == null) {
                return;
            }
            if (andSet != null) {
                C6639i c6639i = this.f51976i;
                if (c6639i != null) {
                    c6639i.getClass();
                    throw null;
                }
                this.f51976i = andSet;
            }
            this.f51976i.getClass();
            GLES20.glUniformMatrix3fv(this.f51975h, 1, false, f51965j, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int[] iArr = this.f51970c;
            try {
                C2531b c2531b = new C2531b("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f51974g = c2531b;
                GLES20.glVertexAttribPointer(c2531b.m7481b("in_pos"), 2, 5126, false, 0, (Buffer) f51967l);
                iArr[0] = this.f51974g.m7481b("in_tc_y");
                iArr[1] = this.f51974g.m7481b("in_tc_u");
                iArr[2] = this.f51974g.m7481b("in_tc_v");
                this.f51975h = GLES20.glGetUniformLocation(this.f51974g.f13749a, "mColorConversion");
                GlUtil.m7476b();
                int[] iArr2 = this.f51969b;
                try {
                    GLES20.glGenTextures(3, iArr2, 0);
                    for (int i10 = 0; i10 < 3; i10++) {
                        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f51974g.f13749a, f51966k[i10]), i10);
                        GLES20.glActiveTexture(33984 + i10);
                        GlUtil.m7475a(3553, iArr2[i10]);
                    }
                    GlUtil.m7476b();
                } catch (GlUtil.GlException e10) {
                    Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
                }
                GlUtil.m7476b();
            } catch (GlUtil.GlException e11) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e11);
            }
        }
    }

    public C10325g(Context context) {
        super(context, null);
        a aVar = new a(this);
        this.f51964a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    @Deprecated
    public InterfaceC10326h getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public void setOutputBuffer(C6639i c6639i) {
        a aVar = this.f51964a;
        if (aVar.f51973f.getAndSet(c6639i) != null) {
            throw null;
        }
        aVar.f51968a.requestRender();
    }
}
