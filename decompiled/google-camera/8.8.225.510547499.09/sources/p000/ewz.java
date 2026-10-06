package p000;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class ewz {

    /* JADX INFO: renamed from: a */
    protected int f20705a;

    /* JADX INFO: renamed from: b */
    protected int f20706b;

    /* JADX INFO: renamed from: c */
    protected int f20707c;

    /* JADX INFO: renamed from: d */
    protected int f20708d;

    public ewz() {
        this.f20705a = -1;
        this.f20706b = -1;
        this.f20707c = -1;
    }

    public ewz(byte[] bArr) throws ewy {
        this();
        int iM7964a = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  gl_FragColor = texture2D( sTexture, vTexCoord );  \n}                                                   \n");
        this.f20708d = iM7964a;
        this.f20705a = m7966h(iM7964a, "aPosition");
        this.f20706b = m7966h(this.f20708d, "aTextureCoord");
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
    }

    /* JADX INFO: renamed from: a */
    public static int m7964a(String str, String str2) throws ewy {
        int iM7965b = m7965b(35633, str);
        int iM7965b2 = m7965b(35632, str2);
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            throw new ewy("Unable to create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iM7965b);
        ewy.m7963a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM7965b2);
        ewy.m7963a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new ewy("Could not link program", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        }
        GLES20.glDeleteShader(iM7965b);
        GLES20.glDeleteShader(iM7965b2);
        return iGlCreateProgram;
    }

    /* JADX INFO: renamed from: b */
    protected static int m7965b(int i, String str) throws ewy {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new ewy("Unable to create shader");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new ewy("Unable to compile shader " + i, strGlGetShaderInfoLog);
    }

    /* JADX INFO: renamed from: h */
    protected static final int m7966h(int i, String str) throws ewy {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (iGlGetAttribLocation != -1) {
            ewy.m7963a("glGetAttribLocation ".concat(str));
            return iGlGetAttribLocation;
        }
        throw new ewy("Unable to find " + str + " in shader");
    }

    /* JADX INFO: renamed from: i */
    protected static final int m7967i(int i, String str) throws ewy {
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, str);
        if (iGlGetUniformLocation != -1) {
            ewy.m7963a("glGetUniformLocation ".concat(str));
            return iGlGetUniformLocation;
        }
        throw new ewy("Unable to find " + str + " in shader");
    }

    /* JADX INFO: renamed from: c */
    public final void m7968c() {
        GLES20.glUseProgram(this.f20708d);
    }

    /* JADX INFO: renamed from: d */
    public final void m7969d() {
        GLES20.glDeleteProgram(this.f20708d);
    }

    /* JADX INFO: renamed from: e */
    public final void m7970e(FloatBuffer floatBuffer) {
        int i = this.f20706b;
        if (i < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(i, 2, 5126, false, 0, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f20706b);
    }

    /* JADX INFO: renamed from: f */
    public final void m7971f(float[] fArr) {
        int i = this.f20707c;
        if (i < 0) {
            return;
        }
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
    }

    /* JADX INFO: renamed from: g */
    public final void m7972g(FloatBuffer floatBuffer) {
        int i = this.f20705a;
        if (i < 0) {
            return;
        }
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 12, (Buffer) floatBuffer);
        GLES20.glEnableVertexAttribArray(this.f20705a);
    }

    public ewz(char[] cArr) throws ewy {
        this();
        int iM7964a = m7964a("uniform mat4 uMvpMatrix;                   \nattribute vec4 aPosition;                   \nattribute vec2 aTextureCoord;               \nvarying vec2 vTexCoord;                     \nvoid main()                                 \n{                                           \n   gl_Position = uMvpMatrix * aPosition;    \n   vTexCoord = aTextureCoord;               \n}                                           \n", "precision mediump float;                            \nvarying vec2 vTexCoord;                             \nuniform sampler2D sTexture;                         \nvoid main()                                         \n{                                                   \n  vec4 texcolor;                                    \n  texcolor = texture2D( sTexture, vTexCoord );      \n  texcolor.a = 0.85;                                \n  if (texcolor.r < .0001) texcolor.a = 0.0;         \n  gl_FragColor = texcolor;                          \n}                                                   \n");
        this.f20708d = iM7964a;
        this.f20705a = m7966h(iM7964a, "aPosition");
        this.f20706b = m7966h(this.f20708d, "aTextureCoord");
        this.f20707c = m7967i(this.f20708d, "uMvpMatrix");
    }
}
