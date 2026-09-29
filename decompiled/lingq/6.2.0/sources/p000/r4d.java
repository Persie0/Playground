package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.media3.common.ParserException;
import com.airbnb.lottie.compose.AbstractC0871a;
import com.airbnb.lottie.compose.C0872b;
import com.airbnb.lottie.compose.C0874d;
import com.lingq.core.achievements.R$string;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$raw;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r4d {
    /* JADX INFO: renamed from: a */
    public static final void m20402a(hj9 hj9Var, e16 e16Var, ye1 ye1Var, int i) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        int i2 = hj9Var.f42500a;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1902466466);
        int i3 = i | (tj3Var.m22120g(hj9Var) ? 4 : 2);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            int i4 = hj9Var.f42502c;
            if (i4 < 1) {
                i4 = 1;
            }
            int i5 = hj9Var.f42501b;
            int i6 = i5 <= 0 ? i2 : i5;
            float fM15944g = i6 <= 0 ? 1.0f : l70.m15944g(i2 / (i6 <= 0 ? 1 : i6), 0.0f, 1.0f);
            int i7 = i6 > 0 ? i2 / i6 : 0;
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            int i8 = i4;
            e16 e16VarM21995i = te1.m21995i(1.0f, c99.m4412e(b16Var, 0.7f), false);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21995i);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            jj5 jj5Var = hl1.f42565b;
            p84 p84Var = we1.f66679a;
            if (i7 >= 1 || i6 <= 0) {
                z = true;
                tj3Var.m22111b0(-1323955687);
                C0874d c0874dM5025e = AbstractC0871a.m5025e(new nl5(R$raw.flashing_coin), tj3Var);
                C0872b c0872bM5022b = AbstractC0871a.m5022b((gl5) c0874dM5025e.getValue(), tj3Var);
                bq1.m4042R(AbstractC3423or.m18236U(ss5.m21727y(i8, true), tj3Var, 0), null, c99.m4411d(b16Var, 1.0f), null, jj5Var, 0.0f, null, tj3Var, 25016, 104);
                gl5 gl5Var = (gl5) c0874dM5025e.getValue();
                boolean zM22120g = tj3Var.m22120g(c0872bM5022b);
                Object objM22097O = tj3Var.m22097O();
                if (zM22120g || objM22097O == p84Var) {
                    objM22097O = new C3361n6(c0872bM5022b, 1);
                    tj3Var.m22131l0(objM22097O);
                }
                AbstractC0871a.m5021a(gl5Var, (ui3) objM22097O, c99.m4411d(b16Var, 1.0f), tj3Var, 384);
                if (i7 == 1 && i6 > 0) {
                    tj3Var.m22111b0(-1323120795);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, 0), null, c99.m4411d(b16Var, 0.25f), null, null, 0.0f, new qd0(5, ss5.m21677B(i8)), tj3Var, 440, 56);
                    z2 = false;
                    tj3Var.m22139q(false);
                } else if (i7 > 1) {
                    tj3Var.m22111b0(-1322723251);
                    lw9.m16554b(i7 + "x", null, ss5.m21677B(i8), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71401e, tj3Var, 0, 0, 131066);
                    tj3Var = tj3Var;
                    z2 = false;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1322481947);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, 0), null, c99.m4411d(b16Var, 0.25f), null, null, 0.0f, new qd0(5, ss5.m21677B(i8)), tj3Var, 440, 56);
                    z2 = false;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(-1325033402);
                boolean zM22114d = tj3Var.m22114d(fM15944g);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22114d || objM22097O2 == p84Var) {
                    z3 = false;
                    objM22097O2 = new gj9(0, fM15944g);
                    tj3Var.m22131l0(objM22097O2);
                } else {
                    z3 = false;
                }
                boolean z4 = z3;
                z = true;
                dn7.m10493b((ui3) objM22097O2, c99.m4411d(b16Var, 1.0f), ss5.m21678C(i8), 6.0f, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55874r, 1, 0.0f, tj3Var, 3120, 64);
                tj3Var = tj3Var;
                bq1.m4042R(AbstractC3423or.m18236U(ss5.m21727y(i8, true), tj3Var, z4 ? 1 : 0), null, c99.m4411d(b16Var, 0.5f), null, jj5Var, 0.0f, null, tj3Var, 25016, 104);
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, z4 ? 1 : 0), null, c99.m4411d(b16Var, 0.2f), null, null, 0.0f, new qd0(5, ss5.m21677B(i8)), tj3Var, 440, 56);
                tj3Var.m22139q(z4);
            }
            tj3Var.m22139q(z);
            if (i6 <= 0) {
                str = String.format(Locale.getDefault(), "%d %s", Arrays.copyOf(new Object[]{Integer.valueOf(i2), context.getString(R$string.lesson_coins)}, 2));
            } else {
                Locale locale = Locale.getDefault();
                String string = r19.getString(R$string.stats_coins_goal);
                string.getClass();
                str = String.format(locale, string, Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i6)}, 2));
            }
            tj3 tj3Var2 = tj3Var;
            lw9.m16554b(str, AbstractC3584sr.m21611X(b16Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var2, 48, 0, 130044);
            tj3Var = tj3Var2;
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(hj9Var, i, 13, e16Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Bitmap m20403b(byte[] bArr, int i, int i2) throws IOException {
        BitmapFactory.Options options;
        int i3 = 0;
        int iM12207e = 1;
        if (i2 != -1) {
            options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, i, options);
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            for (int iMax = Math.max(options.outWidth, options.outHeight); iMax > i2; iMax /= 2) {
                options.inSampleSize *= 2;
            }
        } else {
            options = null;
        }
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (options != null) {
            options.inSampleSize = 1;
        }
        if (bitmapDecodeByteArray == null) {
            throw ParserException.m2516a(new IllegalStateException(), "Could not decode image data");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            jv2 jv2Var = new jv2(byteArrayInputStream);
            byteArrayInputStream.close();
            fv2 fv2VarM14662c = jv2Var.m14662c("Orientation");
            if (fv2VarM14662c != null) {
                try {
                    iM12207e = fv2VarM14662c.m12207e(jv2Var.f46214f);
                } catch (NumberFormatException unused) {
                }
            }
            switch (iM12207e) {
                case 3:
                case 4:
                    i3 = 180;
                    break;
                case 5:
                case 8:
                    i3 = 270;
                    break;
                case 6:
                case 7:
                    i3 = 90;
                    break;
            }
            if (i3 == 0) {
                return bitmapDecodeByteArray;
            }
            Matrix matrix = new Matrix();
            matrix.postRotate(i3);
            return Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), matrix, false);
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
