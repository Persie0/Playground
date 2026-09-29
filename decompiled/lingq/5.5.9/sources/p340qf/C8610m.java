package p340qf;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import java.util.EnumMap;
import nf.C7771b;
import p242lf.InterfaceC7358c;

/* JADX INFO: renamed from: qf.m */
/* JADX INFO: loaded from: classes.dex */
public final class C8610m implements InterfaceC7358c {

    /* JADX INFO: renamed from: a */
    public final C8606i f46094a = new C8606i();

    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        if (barcodeFormat != BarcodeFormat.UPC_A) {
            throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(barcodeFormat)));
        }
        return this.f46094a.mo9303j0("0".concat(String.valueOf(str)), BarcodeFormat.EAN_13, enumMap);
    }
}
