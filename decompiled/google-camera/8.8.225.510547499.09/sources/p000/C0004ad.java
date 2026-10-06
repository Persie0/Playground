package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: ad */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0004ad extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public float f110A;

    /* JADX INFO: renamed from: B */
    public float f111B;

    /* JADX INFO: renamed from: C */
    public int f112C;

    /* JADX INFO: renamed from: D */
    public int f113D;

    /* JADX INFO: renamed from: E */
    public int f114E;

    /* JADX INFO: renamed from: F */
    public int f115F;

    /* JADX INFO: renamed from: G */
    public int f116G;

    /* JADX INFO: renamed from: H */
    public int f117H;

    /* JADX INFO: renamed from: I */
    public int f118I;

    /* JADX INFO: renamed from: J */
    public int f119J;

    /* JADX INFO: renamed from: K */
    public int f120K;

    /* JADX INFO: renamed from: L */
    public int f121L;

    /* JADX INFO: renamed from: M */
    public int f122M;

    /* JADX INFO: renamed from: N */
    public boolean f123N;

    /* JADX INFO: renamed from: O */
    public boolean f124O;

    /* JADX INFO: renamed from: P */
    public boolean f125P;

    /* JADX INFO: renamed from: Q */
    public boolean f126Q;

    /* JADX INFO: renamed from: R */
    public int f127R;

    /* JADX INFO: renamed from: S */
    public int f128S;

    /* JADX INFO: renamed from: T */
    public int f129T;

    /* JADX INFO: renamed from: U */
    public int f130U;

    /* JADX INFO: renamed from: V */
    public int f131V;

    /* JADX INFO: renamed from: W */
    public int f132W;

    /* JADX INFO: renamed from: X */
    public float f133X;

    /* JADX INFO: renamed from: Y */
    public C0014an f134Y;

    /* JADX INFO: renamed from: a */
    public int f135a;

    /* JADX INFO: renamed from: b */
    public int f136b;

    /* JADX INFO: renamed from: c */
    public float f137c;

    /* JADX INFO: renamed from: d */
    public int f138d;

    /* JADX INFO: renamed from: e */
    public int f139e;

    /* JADX INFO: renamed from: f */
    public int f140f;

    /* JADX INFO: renamed from: g */
    public int f141g;

    /* JADX INFO: renamed from: h */
    public int f142h;

    /* JADX INFO: renamed from: i */
    public int f143i;

    /* JADX INFO: renamed from: j */
    public int f144j;

    /* JADX INFO: renamed from: k */
    public int f145k;

    /* JADX INFO: renamed from: l */
    public int f146l;

    /* JADX INFO: renamed from: m */
    public int f147m;

    /* JADX INFO: renamed from: n */
    public int f148n;

    /* JADX INFO: renamed from: o */
    public int f149o;

    /* JADX INFO: renamed from: p */
    public int f150p;

    /* JADX INFO: renamed from: q */
    public int f151q;

    /* JADX INFO: renamed from: r */
    public int f152r;

    /* JADX INFO: renamed from: s */
    public int f153s;

    /* JADX INFO: renamed from: t */
    public int f154t;

    /* JADX INFO: renamed from: u */
    public int f155u;

    /* JADX INFO: renamed from: v */
    public int f156v;

    /* JADX INFO: renamed from: w */
    public float f157w;

    /* JADX INFO: renamed from: x */
    public float f158x;

    /* JADX INFO: renamed from: y */
    public String f159y;

    /* JADX INFO: renamed from: z */
    int f160z;

    public C0004ad() {
        super(-2, -2);
        this.f135a = -1;
        this.f136b = -1;
        this.f137c = -1.0f;
        this.f138d = -1;
        this.f139e = -1;
        this.f140f = -1;
        this.f141g = -1;
        this.f142h = -1;
        this.f143i = -1;
        this.f144j = -1;
        this.f145k = -1;
        this.f146l = -1;
        this.f147m = -1;
        this.f148n = -1;
        this.f149o = -1;
        this.f150p = -1;
        this.f151q = -1;
        this.f152r = -1;
        this.f153s = -1;
        this.f154t = -1;
        this.f155u = -1;
        this.f156v = -1;
        this.f157w = 0.5f;
        this.f158x = 0.5f;
        this.f159y = null;
        this.f160z = 1;
        this.f110A = 0.0f;
        this.f111B = 0.0f;
        this.f112C = 0;
        this.f113D = 0;
        this.f114E = 0;
        this.f115F = 0;
        this.f116G = 0;
        this.f117H = 0;
        this.f118I = 0;
        this.f119J = 0;
        this.f120K = -1;
        this.f121L = -1;
        this.f122M = -1;
        this.f123N = true;
        this.f124O = true;
        this.f125P = false;
        this.f126Q = false;
        this.f127R = -1;
        this.f128S = -1;
        this.f129T = -1;
        this.f130U = -1;
        this.f131V = -1;
        this.f132W = -1;
        this.f133X = 0.5f;
        this.f134Y = new C0014an();
    }

    /* JADX INFO: renamed from: a */
    public final void m259a() {
        this.f126Q = false;
        this.f123N = true;
        this.f124O = true;
        if (this.width == 0 || this.width == -1) {
            this.f123N = false;
        }
        if (this.height == 0 || this.height == -1) {
            this.f124O = false;
        }
        if (this.f137c == -1.0f && this.f135a == -1 && this.f136b == -1) {
            return;
        }
        this.f126Q = true;
        this.f123N = true;
        this.f124O = true;
        if (!(this.f134Y instanceof C0043ap)) {
            this.f134Y = new C0043ap();
        }
        ((C0043ap) this.f134Y).m1785A(this.f122M);
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        super.resolveLayoutDirection(i);
        this.f129T = -1;
        this.f130U = -1;
        this.f127R = -1;
        this.f128S = -1;
        this.f131V = this.f151q;
        this.f132W = this.f153s;
        this.f133X = this.f157w;
        if (getLayoutDirection() == 1) {
            int i2 = this.f147m;
            if (i2 != -1) {
                this.f129T = i2;
            } else {
                int i3 = this.f148n;
                if (i3 != -1) {
                    this.f130U = i3;
                }
            }
            int i4 = this.f149o;
            if (i4 != -1) {
                this.f128S = i4;
            }
            int i5 = this.f150p;
            if (i5 != -1) {
                this.f127R = i5;
            }
            int i6 = this.f155u;
            if (i6 != -1) {
                this.f132W = i6;
            }
            int i7 = this.f156v;
            if (i7 != -1) {
                this.f131V = i7;
            }
            this.f133X = 1.0f - this.f157w;
        } else {
            int i8 = this.f147m;
            if (i8 != -1) {
                this.f128S = i8;
            }
            int i9 = this.f148n;
            if (i9 != -1) {
                this.f127R = i9;
            }
            int i10 = this.f149o;
            if (i10 != -1) {
                this.f129T = i10;
            }
            int i11 = this.f150p;
            if (i11 != -1) {
                this.f130U = i11;
            }
            int i12 = this.f155u;
            if (i12 != -1) {
                this.f131V = i12;
            }
            int i13 = this.f156v;
            if (i13 != -1) {
                this.f132W = i13;
            }
        }
        if (this.f149o == -1 && this.f150p == -1) {
            int i14 = this.f140f;
            if (i14 != -1) {
                this.f129T = i14;
            } else {
                int i15 = this.f141g;
                if (i15 != -1) {
                    this.f130U = i15;
                }
            }
        }
        if (this.f148n == -1 && this.f147m == -1) {
            int i16 = this.f138d;
            if (i16 != -1) {
                this.f127R = i16;
                return;
            }
            int i17 = this.f139e;
            if (i17 != -1) {
                this.f128S = i17;
            }
        }
    }

    public C0004ad(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet);
        this.f135a = -1;
        this.f136b = -1;
        this.f137c = -1.0f;
        this.f138d = -1;
        this.f139e = -1;
        this.f140f = -1;
        this.f141g = -1;
        this.f142h = -1;
        this.f143i = -1;
        this.f144j = -1;
        this.f145k = -1;
        this.f146l = -1;
        this.f147m = -1;
        this.f148n = -1;
        this.f149o = -1;
        this.f150p = -1;
        this.f151q = -1;
        this.f152r = -1;
        this.f153s = -1;
        this.f154t = -1;
        this.f155u = -1;
        this.f156v = -1;
        this.f157w = 0.5f;
        this.f158x = 0.5f;
        this.f159y = null;
        this.f160z = 1;
        this.f110A = 0.0f;
        this.f111B = 0.0f;
        this.f112C = 0;
        this.f113D = 0;
        this.f114E = 0;
        this.f115F = 0;
        this.f116G = 0;
        this.f117H = 0;
        this.f118I = 0;
        this.f119J = 0;
        this.f120K = -1;
        this.f121L = -1;
        this.f122M = -1;
        this.f123N = true;
        this.f124O = true;
        this.f125P = false;
        this.f126Q = false;
        this.f127R = -1;
        this.f128S = -1;
        this.f129T = -1;
        this.f130U = -1;
        this.f131V = -1;
        this.f132W = -1;
        this.f133X = 0.5f;
        this.f134Y = new C0014an();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0007ag.f290a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == 84) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(84, this.f138d);
                this.f138d = resourceId;
                if (resourceId == -1) {
                    this.f138d = typedArrayObtainStyledAttributes.getInt(84, -1);
                }
            } else if (index == 85) {
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(85, this.f139e);
                this.f139e = resourceId2;
                if (resourceId2 == -1) {
                    this.f139e = typedArrayObtainStyledAttributes.getInt(85, -1);
                }
            } else if (index == 87) {
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(87, this.f140f);
                this.f140f = resourceId3;
                if (resourceId3 == -1) {
                    this.f140f = typedArrayObtainStyledAttributes.getInt(87, -1);
                }
            } else if (index == 88) {
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(88, this.f141g);
                this.f141g = resourceId4;
                if (resourceId4 == -1) {
                    this.f141g = typedArrayObtainStyledAttributes.getInt(88, -1);
                }
            } else if (index == 94) {
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(94, this.f142h);
                this.f142h = resourceId5;
                if (resourceId5 == -1) {
                    this.f142h = typedArrayObtainStyledAttributes.getInt(94, -1);
                }
            } else if (index == 93) {
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(93, this.f143i);
                this.f143i = resourceId6;
                if (resourceId6 == -1) {
                    this.f143i = typedArrayObtainStyledAttributes.getInt(93, -1);
                }
            } else if (index == 65) {
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(65, this.f144j);
                this.f144j = resourceId7;
                if (resourceId7 == -1) {
                    this.f144j = typedArrayObtainStyledAttributes.getInt(65, -1);
                }
            } else if (index == 64) {
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(64, this.f145k);
                this.f145k = resourceId8;
                if (resourceId8 == -1) {
                    this.f145k = typedArrayObtainStyledAttributes.getInt(64, -1);
                }
            } else if (index == 60) {
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(60, this.f146l);
                this.f146l = resourceId9;
                if (resourceId9 == -1) {
                    this.f146l = typedArrayObtainStyledAttributes.getInt(60, -1);
                }
            } else if (index == 103) {
                this.f120K = typedArrayObtainStyledAttributes.getDimensionPixelOffset(103, this.f120K);
            } else if (index == 104) {
                this.f121L = typedArrayObtainStyledAttributes.getDimensionPixelOffset(104, this.f121L);
            } else if (index == 72) {
                this.f135a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(72, this.f135a);
            } else if (index == 73) {
                this.f136b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(73, this.f136b);
            } else if (index == 74) {
                this.f137c = typedArrayObtainStyledAttributes.getFloat(74, this.f137c);
            } else if (index == 0) {
                this.f122M = typedArrayObtainStyledAttributes.getInt(0, this.f122M);
            } else if (index == 89) {
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(89, this.f147m);
                this.f147m = resourceId10;
                if (resourceId10 == -1) {
                    this.f147m = typedArrayObtainStyledAttributes.getInt(89, -1);
                }
            } else if (index == 90) {
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(90, this.f148n);
                this.f148n = resourceId11;
                if (resourceId11 == -1) {
                    this.f148n = typedArrayObtainStyledAttributes.getInt(90, -1);
                }
            } else if (index == 71) {
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(71, this.f149o);
                this.f149o = resourceId12;
                if (resourceId12 == -1) {
                    this.f149o = typedArrayObtainStyledAttributes.getInt(71, -1);
                }
            } else if (index == 70) {
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(70, this.f150p);
                this.f150p = resourceId13;
                if (resourceId13 == -1) {
                    this.f150p = typedArrayObtainStyledAttributes.getInt(70, -1);
                }
            } else if (index == 108) {
                this.f151q = typedArrayObtainStyledAttributes.getDimensionPixelSize(108, this.f151q);
            } else if (index == 111) {
                this.f152r = typedArrayObtainStyledAttributes.getDimensionPixelSize(111, this.f152r);
            } else if (index == 109) {
                this.f153s = typedArrayObtainStyledAttributes.getDimensionPixelSize(109, this.f153s);
            } else if (index == 106) {
                this.f154t = typedArrayObtainStyledAttributes.getDimensionPixelSize(106, this.f154t);
            } else if (index == 110) {
                this.f155u = typedArrayObtainStyledAttributes.getDimensionPixelSize(110, this.f155u);
            } else if (index == 107) {
                this.f156v = typedArrayObtainStyledAttributes.getDimensionPixelSize(107, this.f156v);
            } else if (index == 80) {
                this.f157w = typedArrayObtainStyledAttributes.getFloat(80, this.f157w);
            } else if (index == 95) {
                this.f158x = typedArrayObtainStyledAttributes.getFloat(95, this.f158x);
            } else if (index == 69) {
                String string = typedArrayObtainStyledAttributes.getString(69);
                this.f159y = string;
                this.f160z = -1;
                if (string != null) {
                    int iIndexOf = string.indexOf(44);
                    int length = string.length();
                    if (iIndexOf > 0 && iIndexOf < length - 1) {
                        String strSubstring = this.f159y.substring(0, iIndexOf);
                        if (strSubstring.equalsIgnoreCase("W")) {
                            this.f160z = 0;
                        } else if (strSubstring.equalsIgnoreCase("H")) {
                            this.f160z = 1;
                        }
                        i = iIndexOf + 1;
                    } else {
                        i = 0;
                    }
                    int iIndexOf2 = this.f159y.indexOf(58);
                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                        String strSubstring2 = this.f159y.substring(i);
                        if (strSubstring2.length() > 0) {
                            Float.parseFloat(strSubstring2);
                        }
                    } else {
                        String strSubstring3 = this.f159y.substring(i, iIndexOf2);
                        String strSubstring4 = this.f159y.substring(iIndexOf2 + 1);
                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                            try {
                                float f = Float.parseFloat(strSubstring3);
                                float f2 = Float.parseFloat(strSubstring4);
                                if (f > 0.0f && f2 > 0.0f) {
                                    if (this.f160z == 1) {
                                        Math.abs(f2 / f);
                                    } else {
                                        Math.abs(f / f2);
                                    }
                                }
                            } catch (NumberFormatException e) {
                            }
                        }
                    }
                }
            } else if (index == 82) {
                this.f110A = typedArrayObtainStyledAttributes.getFloat(82, 0.0f);
            } else if (index == 97) {
                this.f111B = typedArrayObtainStyledAttributes.getFloat(97, 0.0f);
            } else if (index == 81) {
                this.f112C = typedArrayObtainStyledAttributes.getInt(81, 0);
            } else if (index == 96) {
                this.f113D = typedArrayObtainStyledAttributes.getInt(96, 0);
            } else if (index == 99) {
                this.f114E = typedArrayObtainStyledAttributes.getInt(99, 0);
            } else if (index == 76) {
                this.f115F = typedArrayObtainStyledAttributes.getInt(76, 0);
            } else if (index == 101) {
                this.f116G = typedArrayObtainStyledAttributes.getDimensionPixelSize(101, this.f116G);
            } else if (index == 100) {
                this.f118I = typedArrayObtainStyledAttributes.getDimensionPixelSize(100, this.f118I);
            } else if (index == 78) {
                this.f117H = typedArrayObtainStyledAttributes.getDimensionPixelSize(78, this.f117H);
            } else if (index == 77) {
                this.f119J = typedArrayObtainStyledAttributes.getDimensionPixelSize(77, this.f119J);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        m259a();
    }

    public C0004ad(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f135a = -1;
        this.f136b = -1;
        this.f137c = -1.0f;
        this.f138d = -1;
        this.f139e = -1;
        this.f140f = -1;
        this.f141g = -1;
        this.f142h = -1;
        this.f143i = -1;
        this.f144j = -1;
        this.f145k = -1;
        this.f146l = -1;
        this.f147m = -1;
        this.f148n = -1;
        this.f149o = -1;
        this.f150p = -1;
        this.f151q = -1;
        this.f152r = -1;
        this.f153s = -1;
        this.f154t = -1;
        this.f155u = -1;
        this.f156v = -1;
        this.f157w = 0.5f;
        this.f158x = 0.5f;
        this.f159y = null;
        this.f160z = 1;
        this.f110A = 0.0f;
        this.f111B = 0.0f;
        this.f112C = 0;
        this.f113D = 0;
        this.f114E = 0;
        this.f115F = 0;
        this.f116G = 0;
        this.f117H = 0;
        this.f118I = 0;
        this.f119J = 0;
        this.f120K = -1;
        this.f121L = -1;
        this.f122M = -1;
        this.f123N = true;
        this.f124O = true;
        this.f125P = false;
        this.f126Q = false;
        this.f127R = -1;
        this.f128S = -1;
        this.f129T = -1;
        this.f130U = -1;
        this.f131V = -1;
        this.f132W = -1;
        this.f133X = 0.5f;
        this.f134Y = new C0014an();
    }
}
