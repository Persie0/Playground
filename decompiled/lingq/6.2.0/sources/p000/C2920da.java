package p000;

import android.os.Parcel;
import java.util.Iterator;

/* JADX INFO: renamed from: da */
/* JADX INFO: loaded from: classes.dex */
public final class C2920da implements xf9, a58 {

    /* JADX INFO: renamed from: c */
    public static final C2920da f35224c;

    /* JADX INFO: renamed from: d */
    public static final C2920da f35225d;

    /* JADX INFO: renamed from: e */
    public static final C2920da f35226e;

    /* JADX INFO: renamed from: f */
    public static final C2920da f35227f;

    /* JADX INFO: renamed from: g */
    public static final C2920da f35228g;

    /* JADX INFO: renamed from: h */
    public static final C2920da f35229h;

    /* JADX INFO: renamed from: i */
    public static final C2920da f35230i;

    /* JADX INFO: renamed from: j */
    public static final C2920da f35231j;

    /* JADX INFO: renamed from: k */
    public static final C2920da f35232k;

    /* JADX INFO: renamed from: l */
    public static final C2920da f35233l;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35234a;

    /* JADX INFO: renamed from: b */
    public String f35235b;

    static {
        int i = 0;
        f35224c = new C2920da("TINK", i);
        f35225d = new C2920da("CRUNCHY", i);
        f35226e = new C2920da("LEGACY", i);
        f35227f = new C2920da("NO_PREFIX", i);
        int i2 = 1;
        f35228g = new C2920da("NONE", i2);
        f35229h = new C2920da("FULL", i2);
        int i3 = 2;
        f35230i = new C2920da("TINK", i3);
        f35231j = new C2920da("CRUNCHY", i3);
        f35232k = new C2920da("LEGACY", i3);
        f35233l = new C2920da("NO_PREFIX", i3);
    }

    public /* synthetic */ C2920da(String str, int i) {
        this.f35234a = i;
        this.f35235b = str;
    }

    @Override // p000.xf9
    /* JADX INFO: renamed from: a */
    public Iterator mo10172a(kg0 kg0Var, CharSequence charSequence) {
        return new uf9(this, kg0Var, charSequence, 1);
    }

    @Override // p000.a58
    public void accept(Object obj, Object obj2) {
        wr9 wr9Var = (wr9) obj2;
        tkd tkdVar = (tkd) ((tvc) obj).m11611l();
        String str = this.f35235b;
        qkd qkdVar = (qkd) tkdVar;
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.mlkit.vision.docscan.ui.aidls.IDocumentScannerService");
        parcelObtain.writeString(str);
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            qkdVar.f57887f.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain.recycle();
            parcelObtain2.recycle();
            wr9Var.m24138b(null);
        } catch (Throwable th) {
            parcelObtain.recycle();
            parcelObtain2.recycle();
            throw th;
        }
    }

    public String toString() {
        switch (this.f35234a) {
            case 0:
                return this.f35235b;
            case 1:
                return this.f35235b;
            case 2:
                return this.f35235b;
            default:
                return super.toString();
        }
    }
}
