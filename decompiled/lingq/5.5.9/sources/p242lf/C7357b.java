package p242lf;

import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.oned.Code128Writer;
import dm.C5206f;
import java.util.EnumMap;
import nf.C7771b;
import no.C7814a0;
import p340qf.C8599b;
import p340qf.C8602e;
import p340qf.C8604g;
import p340qf.C8606i;
import p340qf.C8607j;
import p340qf.C8608k;
import p340qf.C8610m;
import p340qf.C8614q;
import p365rf.C8779a;
import tf.C9280a;

/* JADX INFO: renamed from: lf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7357b implements InterfaceC7358c {

    /* JADX INFO: renamed from: lf.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f41117a;

        static {
            int[] iArr = new int[BarcodeFormat.values().length];
            f41117a = iArr;
            try {
                iArr[BarcodeFormat.EAN_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41117a[BarcodeFormat.UPC_E.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f41117a[BarcodeFormat.EAN_13.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f41117a[BarcodeFormat.UPC_A.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f41117a[BarcodeFormat.QR_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f41117a[BarcodeFormat.CODE_39.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f41117a[BarcodeFormat.CODE_93.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f41117a[BarcodeFormat.CODE_128.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f41117a[BarcodeFormat.ITF.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f41117a[BarcodeFormat.PDF_417.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f41117a[BarcodeFormat.CODABAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f41117a[BarcodeFormat.DATA_MATRIX.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f41117a[BarcodeFormat.AZTEC.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p242lf.InterfaceC7358c
    /* JADX INFO: renamed from: j0 */
    public final C7771b mo9303j0(String str, BarcodeFormat barcodeFormat, EnumMap enumMap) throws WriterException {
        InterfaceC7358c c8607j;
        switch (a.f41117a[barcodeFormat.ordinal()]) {
            case 1:
                c8607j = new C8607j();
                break;
            case 2:
                c8607j = new C8614q();
                break;
            case 3:
                c8607j = new C8606i();
                break;
            case 4:
                c8607j = new C8610m();
                break;
            case 5:
                c8607j = new C9280a();
                break;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                c8607j = new C8602e();
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                c8607j = new C8604g();
                break;
            case 8:
                c8607j = new Code128Writer();
                break;
            case 9:
                c8607j = new C8608k();
                break;
            case 10:
                c8607j = new C8779a();
                break;
            case 11:
                c8607j = new C8599b();
                break;
            case 12:
                c8607j = new C5206f();
                break;
            case 13:
                c8607j = new C7814a0();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(barcodeFormat)));
        }
        return c8607j.mo9303j0(str, barcodeFormat, enumMap);
    }
}
