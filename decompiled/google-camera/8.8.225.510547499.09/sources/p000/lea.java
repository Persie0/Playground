package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lea implements kzf {

    /* JADX INFO: renamed from: a */
    public static final float[] f38012a = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: b */
    public final lby f38013b;

    /* JADX INFO: renamed from: c */
    private ldx f38014c = null;

    /* JADX INFO: renamed from: d */
    private ldx f38015d = null;

    private lea(lby lbyVar) {
        this.f38013b = lbyVar;
    }

    /* JADX INFO: renamed from: a */
    public static lea m15230a(lby lbyVar) {
        return new lea(lbyVar);
    }

    /* JADX INFO: renamed from: g */
    private final ldx m15231g(ldx ldxVar, ldx ldxVar2) {
        lpe lpeVarM15225o = ldx.m15225o(this.f38013b);
        lpeVarM15225o.m15804b(kua.m14876o(ldxVar));
        lpeVarM15225o.m15804b(kua.m14876o(ldxVar2));
        return lpeVarM15225o.m15806d();
    }

    /* JADX INFO: renamed from: b */
    public final void m15232b(lby lbyVar) {
        if (lbyVar == this.f38013b) {
            return;
        }
        throw new IllegalArgumentException("Input to GLTextureCopier must be on the copier's GL context. Found input on context " + String.valueOf(lbyVar) + " but expect input to be on " + String.valueOf(this.f38013b));
    }

    /* JADX INFO: renamed from: c */
    public final void m15233c() {
        ldx ldxVar = this.f38014c;
        if (ldxVar != null) {
            ldxVar.mo15079a();
            this.f38014c = null;
        }
        ldx ldxVar2 = this.f38015d;
        if (ldxVar2 != null) {
            ldxVar2.mo15079a();
            this.f38015d = null;
        }
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ldx ldxVar = this.f38014c;
        if (ldxVar != null) {
            ldxVar.close();
            this.f38014c = null;
        }
        ldx ldxVar2 = this.f38015d;
        if (ldxVar2 != null) {
            ldxVar2.close();
            this.f38015d = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m15235e(lcy lcyVar, ldx ldxVar) {
        m15236f(lcyVar, ldxVar, f38012a);
    }

    /* JADX INFO: renamed from: f */
    public final void m15236f(lcy lcyVar, ldx ldxVar, float[] fArr) {
        m15232b(lcyVar.f37915b);
        m15232b(ldxVar.f37915b);
        lct lctVarM15890c = lct.m15169i(ldg.m15200a(ldxVar.f37915b)).m15890c(m15234d(this.f38013b.mo15153e(), true));
        lctVarM15890c.m15172b(lcyVar);
        lctVarM15890c.m15177g(fArr);
        lctVarM15890c.m15171a("aPosition", 0);
        lctVarM15890c.m15171a("aTexCoord", 1);
        lctVarM15890c.m15179k(ldxVar);
    }

    public final String toString() {
        return "GLTextureCopier[" + String.valueOf(this.f38013b) + "]";
    }

    /* JADX INFO: renamed from: d */
    public final ldx m15234d(leb lebVar, boolean z) {
        ldx ldxVarM15219h;
        ldx ldxVarM15217b;
        if (z) {
            if (this.f38015d == null) {
                this.f38015d = m15231g(ldx.m15219h(this.f38013b, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}"), ldx.m15217b(this.f38013b, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n  gl_FragColor = texture2D(uImgTex, texCoord);\n}"));
            }
            return this.f38015d;
        }
        if (this.f38014c == null) {
            if (lebVar.f38017b >= 3) {
                ldxVarM15219h = ldx.m15219h(this.f38013b, "#version 300 es\nin vec2 aPosition;\nin vec2 aTexCoord;\nuniform mat4 uTransform;\nout vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}");
                ldxVarM15217b = ldx.m15217b(this.f38013b, "#version 300 es\nprecision mediump float;\nuniform sampler2D uImgTex;\nin vec2 texCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = texture(uImgTex, texCoord);\n}");
            } else {
                ldxVarM15219h = ldx.m15219h(this.f38013b, "attribute vec2 aPosition;\nattribute vec2 aTexCoord;\nuniform mat4 uTransform;\nvarying vec2 texCoord;\nvoid main() {\n  texCoord = (uTransform * vec4(aTexCoord, 0.0, 1.0)).xy;\n  gl_Position = vec4(aPosition.xy, 0.0, 1.0);\n}");
                ldxVarM15217b = ldx.m15217b(this.f38013b, "precision mediump float;\nuniform sampler2D uImgTex;\nvarying vec2 texCoord;\nvoid main() {\n    gl_FragColor = texture2D(uImgTex, texCoord);\n}");
            }
            this.f38014c = m15231g(ldxVarM15219h, ldxVarM15217b);
        }
        return this.f38014c;
    }
}
