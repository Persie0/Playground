package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gvb implements kba {

    /* JADX INFO: renamed from: a */
    public final Object f26482a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f26483b;

    public gvb(lby lbyVar, int i, int i2) {
        this.f26483b = i2;
        lpe lpeVar = new lpe(lbyVar);
        lpeVar.m15804b(kua.m14876o(ldx.m15219h(lbyVar, BEeWZPor.Jsj)));
        lpeVar.m15804b(kua.m14876o(ldx.m15217b(lbyVar, i == 35 ? "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nlayout (yuv) out vec3 outColor;\nvoid main() {\n    outColor = texture(uImgTex, vTexCoord).rgb;\n}" : "#version 320 es\n#extension GL_EXT_YUV_target : enable\nprecision highp float;\nuniform highp __samplerExternal2DY2YEXT uImgTex;\nin vec2 vTexCoord;\nout vec4 outColor;\nvoid main() {\n    outColor = vec4(yuv_2_rgb(texture(uImgTex, vTexCoord).rgb,\n                              itu_601_full_range), 1.0);\n}")));
        this.f26482a = lpeVar.m15806d();
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        switch (this.f26483b) {
            case 0:
                nbz nbzVar = nch.f41987a;
                break;
            default:
                ((lcf) this.f26482a).close();
                break;
        }
    }

    public gvb(kfk kfkVar, gof gofVar, int i) {
        this.f26483b = i;
        this.f26482a = gofVar;
        kmd kmdVarMo14139d = kfkVar.mo14116c().mo14139d();
        kmdVarMo14139d.mo14553f();
        kmdVarMo14139d.mo14558k();
        kmq kmqVar = kmq.f36557a;
        kfkVar.mo14116c().mo14139d().mo14558k();
        kfkVar.mo14116c().mo14139d().mo14555h();
    }
}
