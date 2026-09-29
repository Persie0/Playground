package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class zwb {

    /* JADX INFO: renamed from: b */
    public static final ssb f72324b = new ssb(1);

    /* JADX INFO: renamed from: a */
    public final hxb f72325a;

    public zwb() {
        jyb jybVar;
        try {
            jybVar = (jyb) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            jybVar = f72324b;
        }
        jyb[] jybVarArr = {ssb.f61373b, jybVar};
        hxb hxbVar = new hxb();
        hxbVar.f43135a = jybVarArr;
        Charset charset = btb.f8994a;
        this.f72325a = hxbVar;
    }
}
