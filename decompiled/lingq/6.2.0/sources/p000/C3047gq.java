package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Xml;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import okhttp3.Protocol;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: gq */
/* JADX INFO: loaded from: classes.dex */
public final class C3047gq {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41170a;

    /* JADX INFO: renamed from: b */
    public int f41171b;

    /* JADX INFO: renamed from: c */
    public Object f41172c;

    /* JADX INFO: renamed from: d */
    public Object f41173d;

    public C3047gq(int i) {
        this.f41170a = i;
        switch (i) {
            case 4:
                this.f41172c = new x66(new x94[16]);
                break;
            default:
                this.f41172c = new int[16];
                this.f41173d = new C0825bv();
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public static C3047gq m12796d(Resources resources, int i, Resources.Theme theme) {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return new C3047gq(ted.m22019a(resources, xml, attributeSetAsAttributeSet, theme), (ColorStateList) null, 0);
        }
        if (name.equals("selector")) {
            ColorStateList colorStateListM23823b = wa1.m23823b(resources, xml, attributeSetAsAttributeSet, theme);
            return new C3047gq((Shader) null, colorStateListM23823b, colorStateListM23823b.getDefaultColor());
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    /* JADX INFO: renamed from: o */
    public static int m12797o(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int i4 = ((xv4) list.get(i3)).f68843a - i;
            if (i4 < 0) {
                i2 = i3 + 1;
            } else {
                if (i4 <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: a */
    public void m12798a(int i, qt4 qt4Var) {
        if (i < 0) {
            l54.m15814a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        x94 x94Var = new x94(this.f41171b, i, qt4Var);
        this.f41171b += i;
        ((x66) this.f41172c).m24305c(x94Var);
    }

    /* JADX INFO: renamed from: b */
    public void m12799b() {
        l1a l1aVar;
        ImageView imageView = (ImageView) this.f41172c;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            wl2.m24046a(drawable);
        }
        if (drawable == null || (l1aVar = (l1a) this.f41173d) == null) {
            return;
        }
        C2893cq.m9846e(drawable, l1aVar, imageView.getDrawableState());
    }

    /* JADX INFO: renamed from: c */
    public boolean m12800c(int i, int i2) {
        int iM12806j = m12806j(i);
        return iM12806j == i2 || iM12806j == -1 || iM12806j == -2;
    }

    /* JADX INFO: renamed from: e */
    public void m12801e(int i, int i2) {
        if (i > 131072) {
            l54.m15814a("Requested item capacity " + i + " is larger than max supported: 131072!");
        }
        int[] iArr = (int[]) this.f41172c;
        if (iArr.length < i) {
            int length = iArr.length;
            while (length < i) {
                length *= 2;
            }
            int[] iArr2 = new int[length];
            AbstractC3550rv.m20829W(i2, 0, 12, (int[]) this.f41172c, iArr2);
            this.f41172c = iArr2;
        }
    }

    /* JADX INFO: renamed from: f */
    public void m12802f(int i) {
        C0825bv c0825bv = (C0825bv) this.f41173d;
        int i2 = this.f41171b;
        int i3 = i - i2;
        if (i3 < 0 || i3 >= 131072) {
            int iMax = Math.max(i - (((int[]) this.f41172c).length / 2), 0);
            this.f41171b = iMax;
            int i4 = iMax - i2;
            int[] iArr = (int[]) this.f41172c;
            if (i4 >= 0) {
                if (i4 < iArr.length) {
                    AbstractC3550rv.m20825S(0, i4, iArr.length, iArr, iArr);
                }
                int[] iArr2 = (int[]) this.f41172c;
                Arrays.fill(iArr2, Math.max(0, iArr2.length - i4), ((int[]) this.f41172c).length, 0);
            } else {
                int i5 = -i4;
                if (iArr.length + i5 < 131072) {
                    m12801e(iArr.length + i5 + 1, i5);
                } else {
                    if (i5 < iArr.length) {
                        AbstractC3550rv.m20825S(i5, 0, iArr.length - i5, iArr, iArr);
                    }
                    int[] iArr3 = (int[]) this.f41172c;
                    Arrays.fill(iArr3, 0, Math.min(iArr3.length, i5), 0);
                }
            }
        } else {
            m12801e(i3 + 1, 0);
        }
        while (!c0825bv.isEmpty() && ((xv4) c0825bv.first()).f68843a < this.f41171b) {
            c0825bv.removeFirst();
        }
        while (!c0825bv.isEmpty() && ((xv4) c0825bv.last()).f68843a > this.f41171b + ((int[]) this.f41172c).length) {
            c0825bv.removeLast();
        }
    }

    /* JADX INFO: renamed from: g */
    public int m12803g(int i, int i2) {
        do {
            i--;
            if (-1 >= i) {
                return -1;
            }
        } while (!m12800c(i, i2));
        return i;
    }

    /* JADX INFO: renamed from: h */
    public x94 m12804h(int i) {
        if (i < 0 || i >= this.f41171b) {
            StringBuilder sbM22998u = ux5.m22998u("Index ", i, ", size ");
            sbM22998u.append(this.f41171b);
            l54.m15818e(sbM22998u.toString());
        }
        x94 x94Var = (x94) this.f41173d;
        if (x94Var != null) {
            int i2 = x94Var.f67972a;
            if (i < x94Var.f67973b + i2 && i2 <= i) {
                return x94Var;
            }
        }
        x66 x66Var = (x66) this.f41172c;
        x94 x94Var2 = (x94) x66Var.f67830a[AbstractC3423or.m18254g(i, x66Var)];
        this.f41173d = x94Var2;
        return x94Var2;
    }

    /* JADX INFO: renamed from: i */
    public int[] m12805i(int i) {
        C0825bv c0825bv = (C0825bv) this.f41173d;
        xv4 xv4Var = (xv4) u91.m22592J0(m12797o(i, c0825bv), c0825bv);
        if (xv4Var != null) {
            return xv4Var.f68844b;
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public int m12806j(int i) {
        int i2 = this.f41171b;
        if (i < i2) {
            return -1;
        }
        int[] iArr = (int[]) this.f41172c;
        if (i >= iArr.length + i2) {
            return -1;
        }
        return iArr[i - i2] - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public int m12807k(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3) {
        int i8 = i & 33554431;
        long[] jArr = (long[]) this.f41172c;
        int i9 = this.f41171b;
        int i10 = i9 + 3;
        this.f41171b = i10;
        int length = jArr.length;
        if (length <= i10) {
            int iMax = Math.max(length * 2, i10);
            this.f41172c = Arrays.copyOf(jArr, iMax);
            this.f41173d = Arrays.copyOf((long[]) this.f41173d, iMax);
        }
        long[] jArr2 = (long[]) this.f41172c;
        jArr2[i9] = (((long) i2) << 32) | (((long) i3) & 4294967295L);
        jArr2[i9 + 1] = (((long) i4) << 32) | (((long) i5) & 4294967295L);
        int i11 = i6 & 33554431;
        jArr2[i9 + 2] = ((z3 ? 1L : 0L) << 63) | ((z2 ? 1L : 0L) << 62) | ((z ? 1L : 0L) << 61) | 1152921504606846976L | (((long) Math.min(0, 1023)) << 50) | (((long) i11) << 25) | ((long) (i & 33554431));
        if (i6 == -1) {
            return i9;
        }
        if ((i7 != -4) == false) {
            i54.m13663b("Inserted child " + i8 + " without valid parent index");
        }
        int i12 = i7 + 2;
        long j = jArr2[i12];
        if (!((33554431 & ((int) j)) == i11)) {
            i54.m13663b("Inserted child " + i8 + " without valid parent index or parent " + i11 + " not found");
        }
        int i13 = g28.f40082b;
        jArr2[i12] = ((-1151795604700004353L) & j) | (((long) Math.min((i9 - i7) / 3, 1023)) << 50);
        return i9;
    }

    /* JADX INFO: renamed from: l */
    public boolean m12808l() {
        ColorStateList colorStateList;
        return ((Shader) this.f41172c) == null && (colorStateList = (ColorStateList) this.f41173d) != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: m */
    public void m12809m(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = (ImageView) this.f41172c;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, imageView.getContext(), attributeSet, R$styleable.AppCompatImageView);
        TypedArray typedArray = (TypedArray) sq5VarM21551w.f61249c;
        Context context = imageView.getContext();
        int[] iArr = R$styleable.AppCompatImageView;
        TypedArray typedArray2 = (TypedArray) sq5VarM21551w.f61249c;
        WeakHashMap weakHashMap = dta.f36217a;
        ata.m3035b(imageView, context, iArr, attributeSet, typedArray2, i, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(R$styleable.AppCompatImageView_srcCompat, -1)) != -1 && (drawable = bna.m3932U(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                wl2.m24046a(drawable);
            }
            if (typedArray.hasValue(R$styleable.AppCompatImageView_tint)) {
                nfd.m17406a(imageView, sq5VarM21551w.m21567i(R$styleable.AppCompatImageView_tint));
            }
            if (typedArray.hasValue(R$styleable.AppCompatImageView_tintMode)) {
                nfd.m17407b(imageView, wl2.m24048c(typedArray.getInt(R$styleable.AppCompatImageView_tintMode, -1), null));
            }
        } finally {
            sq5VarM21551w.m21582y();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m12810n() {
        AbstractC3550rv.m20834b0(0, 0, 6, (int[]) this.f41172c);
        ((C0825bv) this.f41173d).clear();
    }

    /* JADX INFO: renamed from: p */
    public void m12811p(int i, int i2) {
        if (i < 0) {
            l54.m15814a("Negative lanes are not supported");
        }
        m12802f(i);
        ((int[]) this.f41172c)[i - this.f41171b] = i2 + 1;
    }

    /* JADX INFO: renamed from: q */
    public void m12812q(int i, int i2, int i3, long j) {
        long j2;
        char c;
        int i4;
        char c2 = '2';
        if ((((int) (j >> 50)) & 1023) > 0) {
            int i5 = g28.f40082b;
            long j3 = -1125899873288193L;
            int i6 = 33554431;
            char c3 = 25;
            long[] jArr = (long[]) this.f41172c;
            long[] jArr2 = (long[]) this.f41173d;
            int i7 = this.f41171b;
            jArr2[0] = (j & (-1125899873288193L)) | (((long) (i & 33554431)) << 25);
            int i8 = 1;
            while (i8 > 0) {
                i8--;
                long j4 = jArr2[i8];
                int i9 = ((int) j4) & i6;
                int i10 = ((int) (j4 >> c3)) & i6;
                int i11 = ((int) (j4 >> c2)) & 1023;
                int i12 = i11 == 1023 ? i7 : (i11 * 3) + i10;
                if (i10 < 0) {
                    return;
                }
                while (i10 < i7 - 2 && i10 <= i12) {
                    int i13 = i10 + 2;
                    long j5 = jArr[i13];
                    char c4 = c2;
                    int i14 = i6;
                    if ((((int) (j5 >> c3)) & i14) == i9) {
                        long j6 = jArr[i10];
                        int i15 = i10 + 1;
                        j2 = j3;
                        long j7 = jArr[i15];
                        c = c3;
                        i4 = i12;
                        jArr[i10] = (((long) (((int) j6) + i3)) & 4294967295L) | (((long) (((int) (j6 >> 32)) + i2)) << 32);
                        jArr[i15] = (((long) (((int) j7) + i3)) & 4294967295L) | (((long) (((int) (j7 >> 32)) + i2)) << 32);
                        jArr[i13] = (((j5 >> 63) & 1) << 60) | j5;
                        if ((((int) (j5 >> c4)) & 1023) > 0) {
                            int i16 = g28.f40082b;
                            jArr2[i8] = (j5 & j2) | (((long) ((i10 + 3) & i14)) << c);
                            i8++;
                        }
                    } else {
                        j2 = j3;
                        c = c3;
                        i4 = i12;
                    }
                    i10 += 3;
                    i12 = i4;
                    c3 = c;
                    i6 = i14;
                    c2 = c4;
                    j3 = j2;
                }
                c3 = c3;
                i6 = i6;
                c2 = c2;
                j3 = j3;
            }
        }
    }

    public String toString() {
        switch (this.f41170a) {
            case 7:
                StringBuilder sb = new StringBuilder();
                if (((Protocol) this.f41172c) == Protocol.HTTP_1_0) {
                    sb.append("HTTP/1.0");
                } else {
                    sb.append("HTTP/1.1");
                }
                sb.append(' ');
                sb.append(this.f41171b);
                sb.append(' ');
                sb.append((String) this.f41173d);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C3047gq(Protocol protocol, int i, String str) {
        this.f41170a = 7;
        protocol.getClass();
        this.f41172c = protocol;
        this.f41171b = i;
        this.f41173d = str;
    }

    public /* synthetic */ C3047gq(int i, boolean z) {
        this.f41170a = i;
    }

    public C3047gq(ImageView imageView) {
        this.f41170a = 0;
        this.f41171b = 0;
        this.f41172c = imageView;
    }

    public C3047gq(Shader shader, ColorStateList colorStateList, int i) {
        this.f41170a = 2;
        this.f41172c = shader;
        this.f41173d = colorStateList;
        this.f41171b = i;
    }

    public C3047gq(hta htaVar) {
        this.f41170a = 1;
        this.f41172c = htaVar;
    }
}
