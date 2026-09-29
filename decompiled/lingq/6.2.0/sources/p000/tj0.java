package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tj0 implements gj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62363a;

    /* JADX WARN: Code duplicated, block: B:100:0x031b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0328  */
    /* JADX WARN: Code duplicated, block: B:104:0x0334  */
    /* JADX WARN: Code duplicated, block: B:105:0x033b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0345  */
    /* JADX WARN: Code duplicated, block: B:111:0x0353  */
    /* JADX WARN: Code duplicated, block: B:113:0x035a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0366  */
    /* JADX WARN: Code duplicated, block: B:117:0x0369  */
    /* JADX WARN: Code duplicated, block: B:120:0x0373  */
    /* JADX WARN: Code duplicated, block: B:123:0x0381  */
    /* JADX WARN: Code duplicated, block: B:125:0x0388  */
    /* JADX WARN: Code duplicated, block: B:128:0x0392  */
    /* JADX WARN: Code duplicated, block: B:80:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:82:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:86:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:90:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:94:0x0302  */
    /* JADX WARN: Code duplicated, block: B:95:0x0309  */
    /* JADX WARN: Code duplicated, block: B:98:0x0313  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v31, types: [android.text.Spannable, android.text.SpannableString] */
    @Override // p000.gj3
    public final Object apply(Object obj) {
        ?? r13;
        Bitmap bitmapDecodeByteArray;
        String str;
        float f;
        int i;
        String str2;
        int i2;
        String str3;
        float f2;
        String str4;
        int i3;
        String str5;
        float f3;
        int i4;
        String str6;
        float f4;
        String str7;
        int i5;
        boolean z;
        String str8;
        float f5;
        String str9;
        String str10;
        int i6 = 3;
        boolean z2 = true;
        switch (this.f62363a) {
            case 0:
                hy2 hy2Var = (hy2) obj;
                hy2Var.getClass();
                return hy2Var.getClass().getSimpleName();
            case 1:
                Bundle bundle = (Bundle) obj;
                ?? charSequence = bundle.getCharSequence(cs1.f34456s);
                if (charSequence != 0) {
                    ArrayList<Bundle> parcelableArrayList = bundle.getParcelableArrayList(cs1.f34457t);
                    if (parcelableArrayList != null) {
                        charSequence = SpannableString.valueOf(charSequence);
                        for (Bundle bundle2 : parcelableArrayList) {
                            int i7 = bundle2.getInt(kx1.f48535a);
                            int i8 = bundle2.getInt(kx1.f48536b);
                            int i9 = bundle2.getInt(kx1.f48537c);
                            int i10 = bundle2.getInt(kx1.f48538d, -1);
                            Bundle bundle3 = bundle2.getBundle(kx1.f48539e);
                            if (i10 == 1) {
                                bundle3.getClass();
                                String string = bundle3.getString(yj8.f69912c);
                                string.getClass();
                                charSequence.setSpan(new yj8(string, bundle3.getInt(yj8.f69913d)), i7, i8, i9);
                            } else if (i10 == 2) {
                                bundle3.getClass();
                                charSequence.setSpan(new cu9(bundle3.getInt(cu9.f34554d), bundle3.getInt(cu9.f34555e), bundle3.getInt(cu9.f34556f)), i7, i8, i9);
                            } else if (i10 == i6) {
                                charSequence.setSpan(new ov3(), i7, i8, i9);
                            } else if (i10 == 4) {
                                bundle3.getClass();
                                String string2 = bundle3.getString(w1b.f66232b);
                                string2.getClass();
                                charSequence.setSpan(new w1b(string2), i7, i8, i9);
                            }
                            i6 = 3;
                        }
                    }
                } else {
                    charSequence = 0;
                }
                Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(cs1.f34458u);
                Layout.Alignment alignment2 = alignment != null ? alignment : null;
                Layout.Alignment alignment3 = (Layout.Alignment) bundle.getSerializable(cs1.f34459v);
                Layout.Alignment alignment4 = alignment3 != null ? alignment3 : null;
                Bitmap bitmap = (Bitmap) bundle.getParcelable(cs1.f34460w);
                if (bitmap == null) {
                    byte[] byteArray = bundle.getByteArray(cs1.f34461x);
                    if (byteArray != null) {
                        bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                    } else {
                        r13 = charSequence;
                        bitmapDecodeByteArray = null;
                    }
                    str = cs1.f34462y;
                    if (bundle.containsKey(str)) {
                        str10 = cs1.f34463z;
                        if (bundle.containsKey(str10)) {
                            f = bundle.getFloat(str);
                            i = bundle.getInt(str10);
                        } else {
                            f = -3.4028235E38f;
                            i = Integer.MIN_VALUE;
                        }
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                    str2 = cs1.f34444A;
                    if (bundle.containsKey(str2)) {
                        i2 = bundle.getInt(str2);
                    } else {
                        i2 = Integer.MIN_VALUE;
                    }
                    str3 = cs1.f34445B;
                    if (bundle.containsKey(str3)) {
                        f2 = bundle.getFloat(str3);
                    } else {
                        f2 = -3.4028235E38f;
                    }
                    str4 = cs1.f34446C;
                    if (bundle.containsKey(str4)) {
                        i3 = bundle.getInt(str4);
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    str5 = cs1.f34448E;
                    if (bundle.containsKey(str5)) {
                        str9 = cs1.f34447D;
                        if (bundle.containsKey(str9)) {
                            f3 = bundle.getFloat(str5);
                            i4 = bundle.getInt(str9);
                        } else {
                            f3 = -3.4028235E38f;
                            i4 = Integer.MIN_VALUE;
                        }
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                    str6 = cs1.f34449F;
                    if (bundle.containsKey(str6)) {
                        f4 = bundle.getFloat(str6);
                    } else {
                        f4 = -3.4028235E38f;
                    }
                    String str11 = cs1.f34450G;
                    float f6 = bundle.containsKey(str11) ? bundle.getFloat(str11) : -3.4028235E38f;
                    str7 = cs1.f34451H;
                    if (bundle.containsKey(str7)) {
                        i5 = bundle.getInt(str7);
                    } else {
                        i5 = -16777216;
                        z2 = false;
                    }
                    int i11 = i5;
                    if (bundle.getBoolean(cs1.f34452I, false)) {
                        z = z2;
                    } else {
                        z = false;
                    }
                    String str12 = cs1.f34453J;
                    int i12 = bundle.containsKey(str12) ? bundle.getInt(str12) : Integer.MIN_VALUE;
                    str8 = cs1.f34454K;
                    if (bundle.containsKey(str8)) {
                        f5 = bundle.getFloat(str8);
                    } else {
                        f5 = 0.0f;
                    }
                    float f7 = f5;
                    String str13 = cs1.f34455L;
                    return new cs1(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f6, z, i11, i12, f7, bundle.containsKey(str13) ? bundle.getInt(str13) : 0);
                }
                bitmapDecodeByteArray = bitmap;
                r13 = 0;
                str = cs1.f34462y;
                if (bundle.containsKey(str)) {
                    str10 = cs1.f34463z;
                    if (bundle.containsKey(str10)) {
                        f = bundle.getFloat(str);
                        i = bundle.getInt(str10);
                    } else {
                        f = -3.4028235E38f;
                        i = Integer.MIN_VALUE;
                    }
                } else {
                    f = -3.4028235E38f;
                    i = Integer.MIN_VALUE;
                }
                str2 = cs1.f34444A;
                if (bundle.containsKey(str2)) {
                    i2 = bundle.getInt(str2);
                } else {
                    i2 = Integer.MIN_VALUE;
                }
                str3 = cs1.f34445B;
                if (bundle.containsKey(str3)) {
                    f2 = bundle.getFloat(str3);
                } else {
                    f2 = -3.4028235E38f;
                }
                str4 = cs1.f34446C;
                if (bundle.containsKey(str4)) {
                    i3 = bundle.getInt(str4);
                } else {
                    i3 = Integer.MIN_VALUE;
                }
                str5 = cs1.f34448E;
                if (bundle.containsKey(str5)) {
                    str9 = cs1.f34447D;
                    if (bundle.containsKey(str9)) {
                        f3 = bundle.getFloat(str5);
                        i4 = bundle.getInt(str9);
                    } else {
                        f3 = -3.4028235E38f;
                        i4 = Integer.MIN_VALUE;
                    }
                } else {
                    f3 = -3.4028235E38f;
                    i4 = Integer.MIN_VALUE;
                }
                str6 = cs1.f34449F;
                if (bundle.containsKey(str6)) {
                    f4 = bundle.getFloat(str6);
                } else {
                    f4 = -3.4028235E38f;
                }
                String str14 = cs1.f34450G;
                float f8 = bundle.containsKey(str14) ? bundle.getFloat(str14) : -3.4028235E38f;
                str7 = cs1.f34451H;
                if (bundle.containsKey(str7)) {
                    i5 = bundle.getInt(str7);
                } else {
                    i5 = -16777216;
                    z2 = false;
                }
                int i13 = i5;
                if (bundle.getBoolean(cs1.f34452I, false)) {
                    z = false;
                } else {
                    z = z2;
                }
                String str15 = cs1.f34453J;
                int i14 = bundle.containsKey(str15) ? bundle.getInt(str15) : Integer.MIN_VALUE;
                str8 = cs1.f34454K;
                if (bundle.containsKey(str8)) {
                    f5 = bundle.getFloat(str8);
                } else {
                    f5 = 0.0f;
                }
                float f9 = f5;
                String str16 = cs1.f34455L;
                return new cs1(r13, alignment2, alignment4, bitmapDecodeByteArray, f, i, i2, f2, i3, i4, f3, f4, f8, z, i13, i14, f9, bundle.containsKey(str16) ? bundle.getInt(str16) : 0);
            case 2:
                cs1 cs1Var = (cs1) obj;
                Bitmap bitmap2 = cs1Var.f34467d;
                Bundle bundle4 = new Bundle();
                CharSequence charSequence2 = cs1Var.f34464a;
                if (charSequence2 != null) {
                    bundle4.putCharSequence(cs1.f34456s, charSequence2);
                    if (charSequence2 instanceof Spanned) {
                        Spanned spanned = (Spanned) charSequence2;
                        String str17 = kx1.f48535a;
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (yj8 yj8Var : (yj8[]) spanned.getSpans(0, spanned.length(), yj8.class)) {
                            yj8Var.getClass();
                            Bundle bundle5 = new Bundle();
                            bundle5.putString(yj8.f69912c, yj8Var.f69914a);
                            bundle5.putInt(yj8.f69913d, yj8Var.f69915b);
                            arrayList.add(kx1.m15710a(spanned, yj8Var, 1, bundle5));
                        }
                        for (cu9 cu9Var : (cu9[]) spanned.getSpans(0, spanned.length(), cu9.class)) {
                            cu9Var.getClass();
                            Bundle bundle6 = new Bundle();
                            bundle6.putInt(cu9.f34554d, cu9Var.f34557a);
                            bundle6.putInt(cu9.f34555e, cu9Var.f34558b);
                            bundle6.putInt(cu9.f34556f, cu9Var.f34559c);
                            arrayList.add(kx1.m15710a(spanned, cu9Var, 2, bundle6));
                        }
                        for (ov3 ov3Var : (ov3[]) spanned.getSpans(0, spanned.length(), ov3.class)) {
                            arrayList.add(kx1.m15710a(spanned, ov3Var, 3, null));
                        }
                        for (w1b w1bVar : (w1b[]) spanned.getSpans(0, spanned.length(), w1b.class)) {
                            w1bVar.getClass();
                            Bundle bundle7 = new Bundle();
                            bundle7.putString(w1b.f66232b, w1bVar.f66233a);
                            arrayList.add(kx1.m15710a(spanned, w1bVar, 4, bundle7));
                        }
                        if (!arrayList.isEmpty()) {
                            bundle4.putParcelableArrayList(cs1.f34457t, arrayList);
                        }
                    }
                }
                bundle4.putSerializable(cs1.f34458u, cs1Var.f34465b);
                bundle4.putSerializable(cs1.f34459v, cs1Var.f34466c);
                bundle4.putFloat(cs1.f34462y, cs1Var.f34468e);
                bundle4.putInt(cs1.f34463z, cs1Var.f34469f);
                bundle4.putInt(cs1.f34444A, cs1Var.f34470g);
                bundle4.putFloat(cs1.f34445B, cs1Var.f34471h);
                bundle4.putInt(cs1.f34446C, cs1Var.f34472i);
                bundle4.putInt(cs1.f34447D, cs1Var.f34477n);
                bundle4.putFloat(cs1.f34448E, cs1Var.f34478o);
                bundle4.putFloat(cs1.f34449F, cs1Var.f34473j);
                bundle4.putFloat(cs1.f34450G, cs1Var.f34474k);
                bundle4.putBoolean(cs1.f34452I, cs1Var.f34475l);
                bundle4.putInt(cs1.f34451H, cs1Var.f34476m);
                bundle4.putInt(cs1.f34453J, cs1Var.f34479p);
                bundle4.putFloat(cs1.f34454K, cs1Var.f34480q);
                bundle4.putInt(cs1.f34455L, cs1Var.f34481r);
                if (bitmap2 != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bna.m3987z(bitmap2.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
                    bundle4.putByteArray(cs1.f34461x, byteArrayOutputStream.toByteArray());
                }
                return bundle4;
            case 3:
                long j = ((gs1) obj).f41258b;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 4:
                al4 al4Var = (al4) obj;
                return al4Var.f801a + ": " + al4Var.f802b;
            case 5:
                return (g8a) obj;
            case 6:
                return Long.valueOf(((gs1) obj).f41258b);
            case 7:
                return Long.valueOf(((gs1) obj).f41259c);
            default:
                return (g8a) obj;
        }
    }

    public /* synthetic */ tj0(int i) {
        this.f62363a = i;
    }
}
