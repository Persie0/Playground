package p000;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xq6 {

    /* JADX INFO: renamed from: a */
    public static final Object f68542a = new Object();

    /* JADX INFO: renamed from: a */
    public static final void m24644a(final int i, final int i2, final boolean z, final ui3 ui3Var, ye1 ye1Var, final int i3) {
        long j;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1744313031);
        int i4 = i3 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22116e(i2) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            fe9 fe9Var = (fe9) tj3Var.m22128k(ge9.f40637a);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4416i = c99.m4416i(c99.m4412e(b16Var, 1.0f), 48.0f, 0.0f, 2);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM19045o = pb1.m19045o(e16VarM4416i, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c);
            if (z) {
                tj3Var.m22111b0(20570977);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55823H;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(20665961);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F;
                tj3Var.m22139q(false);
            }
            e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c);
            boolean z2 = (i4 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new xa0(11, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15);
            float f = fe9Var.f38960i;
            float f2 = fe9Var.f38952a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM815b, f, f2);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(i, tj3Var, i4 & 14), null, AbstractC3584sr.m21607T(c99.m4422o(b16Var, 40.0f), f2), null, hl1.f42565b, 0.0f, null, tj3Var, 24632, 104);
            lw9.m16554b(vz1.m23620a0(tj3Var, i2), AbstractC3393o1.m17728c(1.0f, AbstractC3584sr.m21611X(b16Var, fe9Var.f38956e, 0.0f, 0.0f, 0.0f, 14), true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262140);
            tj3Var = tj3Var;
            if (z) {
                tj3Var.m22111b0(1401117128);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_check, tj3Var, 0), null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var, 56, 8);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1401346807);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(i, i2, i3, ui3Var, z) { // from class: pf5

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f56058a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f56059b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f56060c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ui3 f56061d;

                {
                    this.f56060c = z;
                    this.f56061d = ui3Var;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    xq6.m24644a(this.f56058a, this.f56059b, this.f56060c, this.f56061d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final PublicKey m24645b(String str) {
        byte[] bArrDecode = Base64.decode(cl9.m4839V(cl9.m4839V(cl9.m4839V(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0);
        bArrDecode.getClass();
        PublicKey publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArrDecode));
        publicKeyGeneratePublic.getClass();
        return publicKeyGeneratePublic;
    }

    /* JADX INFO: renamed from: c */
    public static final String m24646c(String str) {
        str.getClass();
        URL url = new URL("https", "www." + sy2.f61603s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        sy2.m21768c().execute(new wq6(url, ref$ObjectRef, str, reentrantLock, conditionNewCondition));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) ref$ObjectRef.f47718a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: d */
    public static void m24647d(Context context, String str) {
        synchronized (f68542a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                try {
                    try {
                        xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                        xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                        xmlSerializerNewSerializer.startTag(null, "locales");
                        xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                        xmlSerializerNewSerializer.endTag(null, "locales");
                        xmlSerializerNewSerializer.endDocument();
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales in storage ", e);
                    if (fileOutputStreamOpenFileOutput != null) {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
            } catch (FileNotFoundException unused3) {
                Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0046 A[EXC_TOP_SPLITTER, PHI: r1
      0x0046: PHI (r1v2 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:29:0x0053, B:23:0x0044] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static String m24648e(Context context) {
        String attributeValue;
        synchronized (f68542a) {
            attributeValue = "";
            try {
                try {
                    FileInputStream fileInputStreamOpenFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    try {
                        try {
                            XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                            xmlPullParserNewPullParser.setInput(fileInputStreamOpenFileInput, "UTF-8");
                            int depth = xmlPullParserNewPullParser.getDepth();
                            while (true) {
                                int next = xmlPullParserNewPullParser.next();
                                if (next != 1 && (next != 3 || xmlPullParserNewPullParser.getDepth() > depth)) {
                                    if (next != 3 && next != 4 && xmlPullParserNewPullParser.getName().equals("locales")) {
                                        attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "application_locales");
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused) {
                                }
                            }
                        } catch (Throwable th) {
                            if (fileInputStreamOpenFileInput != null) {
                                try {
                                    fileInputStreamOpenFileInput.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } catch (IOException | XmlPullParserException unused3) {
                        Log.w("AppLocalesStorageHelper", "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                        if (fileInputStreamOpenFileInput != null) {
                            fileInputStreamOpenFileInput.close();
                        }
                    }
                    if (attributeValue.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return attributeValue;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m24649f(PublicKey publicKey, String str, String str2) {
        str2.getClass();
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            byte[] bytes = str.getBytes(yu0.f70463a);
            bytes.getClass();
            signature.update(bytes);
            byte[] bArrDecode = Base64.decode(str2, 8);
            bArrDecode.getClass();
            return signature.verify(bArrDecode);
        } catch (Exception unused) {
            return false;
        }
    }
}
