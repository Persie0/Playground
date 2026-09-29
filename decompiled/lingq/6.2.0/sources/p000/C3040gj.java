package p000;

import android.graphics.Bitmap;
import android.net.Network;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.amplitude.core.AbstractC0903a;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import okhttp3.TlsVersion;

/* JADX INFO: renamed from: gj */
/* JADX INFO: loaded from: classes.dex */
public final class C3040gj implements lp3 {

    /* JADX INFO: renamed from: a */
    public boolean f40865a = true;

    /* JADX INFO: renamed from: b */
    public boolean f40866b;

    /* JADX INFO: renamed from: c */
    public Object f40867c;

    /* JADX INFO: renamed from: d */
    public Object f40868d;

    /* JADX INFO: renamed from: f */
    public static void m12676f(C3040gj c3040gj, Network network, boolean z, boolean z2, int i) {
        if ((i & 2) != 0) {
            z = c3040gj.f40865a;
        }
        if ((i & 4) != 0) {
            z2 = c3040gj.f40866b;
        }
        c3040gj.getClass();
        if (((Network) c3040gj.f40867c).equals(network)) {
            boolean z3 = (c3040gj.f40865a == z && c3040gj.f40866b == z2) ? false : true;
            c3040gj.f40865a = z;
            c3040gj.f40866b = z2;
            if (z3) {
                c3040gj.m12680d();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public ki1 m12677a() {
        return new ki1(this.f40865a, this.f40866b, (String[]) this.f40867c, (String[]) this.f40868d);
    }

    @Override // p000.lp3
    /* JADX INFO: renamed from: b */
    public void mo12678b(String str, String str2) {
        str.getClass();
        str2.getClass();
        m12683h(str, null, null);
        m12686k("%s", str2);
        m12688m();
        qj5 qj5Var = (qj5) this.f40868d;
        "    ".concat(str);
        qj5Var.m20002a();
    }

    /* JADX INFO: renamed from: c */
    public void m12679c(c21... c21VarArr) {
        if (!this.f40865a) {
            C3386nv.m17626m("no cipher suites for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(c21VarArr.length);
        for (c21 c21Var : c21VarArr) {
            arrayList.add(c21Var.f9347a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f40865a) {
            C3386nv.m17626m("no cipher suites for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f40867c = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C3386nv.m17626m("At least one cipher suite is required");
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12680d() {
        AbstractC0903a abstractC0903a = (AbstractC0903a) ((m58) this.f40868d).f50618b;
        if (!this.f40865a || this.f40866b) {
            abstractC0903a.m5113g().mo16256b("AndroidNetworkListener, onNetworkUnavailable.");
            abstractC0903a.f11016a.f10804q = Boolean.TRUE;
        } else {
            abstractC0903a.m5113g().mo16256b("AndroidNetworkListener, onNetworkAvailable.");
            abstractC0903a.f11016a.f10804q = Boolean.FALSE;
            abstractC0903a.m5109c();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m12681e(TlsVersion... tlsVersionArr) {
        if (!this.f40865a) {
            C3386nv.m17626m("no TLS versions for cleartext connections");
            return;
        }
        ArrayList arrayList = new ArrayList(tlsVersionArr.length);
        for (TlsVersion tlsVersion : tlsVersionArr) {
            arrayList.add(tlsVersion.javaName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (!this.f40865a) {
            C3386nv.m17626m("no TLS versions for cleartext connections");
        } else if (strArr2.length != 0) {
            this.f40868d = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        } else {
            C3386nv.m17626m("At least one TLS version is required");
        }
    }

    /* JADX INFO: renamed from: g */
    public void m12682g(String str, Object... objArr) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
        if (this.f40866b) {
            Locale locale = Locale.US;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String strEncode = URLEncoder.encode(String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length)), "UTF-8");
            strEncode.getClass();
            byte[] bytes = strEncode.getBytes(yu0.f70463a);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        if (this.f40865a) {
            Charset charset = yu0.f70463a;
            byte[] bytes2 = "--".getBytes(charset);
            bytes2.getClass();
            filterOutputStream.write(bytes2);
            byte[] bytes3 = mp3.f51688j.getBytes(charset);
            bytes3.getClass();
            filterOutputStream.write(bytes3);
            byte[] bytes4 = "\r\n".getBytes(charset);
            bytes4.getClass();
            filterOutputStream.write(bytes4);
            this.f40865a = false;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        byte[] bytes5 = String.format(str, Arrays.copyOf(objArrCopyOf2, objArrCopyOf2.length)).getBytes(yu0.f70463a);
        bytes5.getClass();
        filterOutputStream.write(bytes5);
    }

    /* JADX INFO: renamed from: h */
    public void m12683h(String str, String str2, String str3) throws IOException {
        if (this.f40866b) {
            FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
            byte[] bytes = String.format("%s=", Arrays.copyOf(new Object[]{str}, 1)).getBytes(yu0.f70463a);
            bytes.getClass();
            filterOutputStream.write(bytes);
            return;
        }
        m12682g("Content-Disposition: form-data; name=\"%s\"", str);
        if (str2 != null) {
            m12682g("; filename=\"%s\"", str2);
        }
        m12686k("", new Object[0]);
        if (str3 != null) {
            m12686k("%s: %s", "Content-Type", str3);
        }
        m12686k("", new Object[0]);
    }

    /* JADX INFO: renamed from: i */
    public void m12684i(Uri uri, String str, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
        str.getClass();
        uri.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        m12683h(str, str, str2);
        int iM3919H = bna.m3919H(sy2.m21766a().getContentResolver().openInputStream(uri), filterOutputStream);
        m12686k("", new Object[0]);
        m12688m();
        qj5 qj5Var = (qj5) this.f40868d;
        "    ".concat(str);
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM3919H)}, 1));
        qj5Var.m20002a();
    }

    /* JADX INFO: renamed from: j */
    public void m12685j(String str, ParcelFileDescriptor parcelFileDescriptor, String str2) throws IOException {
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
        str.getClass();
        parcelFileDescriptor.getClass();
        if (str2 == null) {
            str2 = "content/unknown";
        }
        m12683h(str, str, str2);
        int iM3919H = bna.m3919H(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), filterOutputStream);
        m12686k("", new Object[0]);
        m12688m();
        qj5 qj5Var = (qj5) this.f40868d;
        "    ".concat(str);
        String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(iM3919H)}, 1));
        qj5Var.m20002a();
    }

    /* JADX INFO: renamed from: k */
    public void m12686k(String str, Object... objArr) throws IOException {
        m12682g(str, Arrays.copyOf(objArr, objArr.length));
        if (this.f40866b) {
            return;
        }
        m12682g("\r\n", new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public void m12687l(String str, Object obj, mp3 mp3Var) {
        qj5 qj5Var = (qj5) this.f40868d;
        str.getClass();
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
        String str2 = mp3.f51688j;
        if (s46.m21067o(obj)) {
            mo12678b(str, s46.m21058b(obj));
            return;
        }
        if (obj instanceof Bitmap) {
            m12683h(str, str, "image/png");
            ((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, filterOutputStream);
            m12686k("", new Object[0]);
            m12688m();
            "    ".concat(str);
            qj5Var.m20002a();
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            m12683h(str, str, "content/unknown");
            filterOutputStream.write(bArr);
            m12686k("", new Object[0]);
            m12688m();
            "    ".concat(str);
            String.format(Locale.ROOT, "<Data: %d>", Arrays.copyOf(new Object[]{Integer.valueOf(bArr.length)}, 1));
            qj5Var.m20002a();
            return;
        }
        if (obj instanceof Uri) {
            m12684i((Uri) obj, str, null);
            return;
        }
        if (obj instanceof ParcelFileDescriptor) {
            m12685j(str, (ParcelFileDescriptor) obj, null);
            return;
        }
        if (!(obj instanceof GraphRequest$ParcelableResourceWithMimeType)) {
            C3386nv.m17626m("value is not a supported type.");
            return;
        }
        GraphRequest$ParcelableResourceWithMimeType graphRequest$ParcelableResourceWithMimeType = (GraphRequest$ParcelableResourceWithMimeType) obj;
        Parcelable parcelable = graphRequest$ParcelableResourceWithMimeType.f11368b;
        String str3 = graphRequest$ParcelableResourceWithMimeType.f11367a;
        if (parcelable instanceof ParcelFileDescriptor) {
            m12685j(str, (ParcelFileDescriptor) parcelable, str3);
        } else if (parcelable instanceof Uri) {
            m12684i((Uri) parcelable, str, str3);
        } else {
            C3386nv.m17626m("value is not a supported type.");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12688m() throws IOException {
        if (!this.f40866b) {
            m12686k("--%s", mp3.f51688j);
            return;
        }
        FilterOutputStream filterOutputStream = (FilterOutputStream) this.f40867c;
        byte[] bytes = "&".getBytes(yu0.f70463a);
        bytes.getClass();
        filterOutputStream.write(bytes);
    }
}
