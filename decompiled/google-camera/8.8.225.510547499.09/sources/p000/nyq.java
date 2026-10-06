package p000;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class nyq {

    /* JADX INFO: renamed from: b */
    private static final nyu f45031b = new nyo(0);

    /* JADX INFO: renamed from: a */
    public final nyu f45032a;

    public nyq() {
        nyu nyuVar;
        nyu[] nyuVarArr = new nyu[2];
        nyuVarArr[0] = nyo.f45028a;
        try {
            nyuVar = (nyu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            nyuVar = f45031b;
        }
        nyuVarArr[1] = nyuVar;
        nyp nypVar = new nyp(nyuVarArr);
        Charset charset = nxz.f44985a;
        this.f45032a = nypVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m18189a(nyt nytVar) {
        return nytVar.mo18196c() == 1;
    }
}
