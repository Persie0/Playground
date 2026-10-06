package p000;

import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hrb {

    /* JADX INFO: renamed from: a */
    public final FloatBuffer f29238a;

    /* JADX INFO: renamed from: b */
    public final int f29239b;

    /* JADX INFO: renamed from: c */
    public final int f29240c;

    /* JADX INFO: renamed from: d */
    public final int f29241d;

    /* JADX INFO: renamed from: e */
    public final ShortBuffer f29242e;

    /* JADX INFO: renamed from: f */
    public int[] f29243f = new int[1];

    /* JADX INFO: renamed from: g */
    public int[] f29244g = new int[2];

    /* JADX INFO: renamed from: h */
    public int f29245h = 0;

    /* JADX INFO: renamed from: i */
    public final jpd f29246i;

    /* JADX INFO: renamed from: j */
    private int f29247j;

    public hrb(jpd jpdVar, int i, int i2, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29246i = jpdVar;
        this.f29240c = i;
        this.f29239b = i2;
        int iM10647b = m10647b(35633, "      attribute vec4 a_vertex;\n      varying vec2 o_texture;\n      void main() {\n        // Scale the position to [-1, 1]\n        gl_Position.xy = a_vertex.xy * 2.0 - 1.0;\n        gl_Position.z = 0.0;\n        gl_Position.w = 1.0;\n        o_texture = a_vertex.zw;\n      }");
        int iM10647b2 = m10647b(35632, "      uniform sampler2D texture;\n      varying vec2 o_texture;\n      void main() {\n        vec3 val = texture2D(texture, o_texture).rgb;\n        gl_FragColor = vec4(val, 1.0);\n      }");
        int iGlCreateProgram = GLES30.glCreateProgram();
        this.f29247j = iGlCreateProgram;
        GLES30.glAttachShader(iGlCreateProgram, iM10647b);
        GLES30.glAttachShader(this.f29247j, iM10647b2);
        GLES30.glLinkProgram(this.f29247j);
        GLES30.glUseProgram(this.f29247j);
        GLES30.glGenBuffers(2, this.f29244g, 0);
        GLES30.glBindBuffer(35051, this.f29244g[0]);
        int i3 = i * 4 * i2;
        GLES30.glBufferData(35051, i3, null, 35045);
        GLES30.glBindBuffer(35051, this.f29244g[1]);
        GLES30.glBufferData(35051, i3, null, 35045);
        GLES30.glBindBuffer(35051, 0);
        GLES30.glGenTextures(1, this.f29243f, 0);
        GLES30.glActiveTexture(33984);
        GLES30.glBindTexture(3553, this.f29243f[0]);
        GLES30.glTexParameterf(3553, 10242, 33071.0f);
        GLES30.glTexParameterf(3553, 10243, 33071.0f);
        GLES30.glTexParameterf(3553, 10241, 9729.0f);
        GLES30.glTexParameterf(3553, 10240, 9729.0f);
        this.f29241d = GLES30.glGetAttribLocation(this.f29247j, "a_vertex");
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1452);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        for (int i4 = 0; i4 < 11; i4++) {
            for (int i5 = 0; i5 < 11; i5++) {
                int i6 = (i4 * 12) + i5;
                int i7 = ((i4 + 1) * 12) + i5;
                shortBufferAsShortBuffer.put((short) i6);
                short s = (short) (i6 + 1);
                shortBufferAsShortBuffer.put(s);
                short s2 = (short) i7;
                shortBufferAsShortBuffer.put(s2);
                shortBufferAsShortBuffer.put(s);
                shortBufferAsShortBuffer.put((short) (i7 + 1));
                shortBufferAsShortBuffer.put(s2);
            }
        }
        shortBufferAsShortBuffer.position(0);
        this.f29242e = shortBufferAsShortBuffer;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(2304);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        this.f29238a = byteBufferAllocateDirect2.asFloatBuffer();
    }

    /* JADX INFO: renamed from: b */
    private static int m10647b(int i, String str) {
        int iGlCreateShader = GLES30.glCreateShader(i);
        GLES30.glShaderSource(iGlCreateShader, str);
        GLES30.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }

    /* JADX INFO: renamed from: a */
    public final int m10648a() {
        return 1 - this.f29245h;
    }
}
