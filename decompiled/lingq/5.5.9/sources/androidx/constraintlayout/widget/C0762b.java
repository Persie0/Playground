package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.linguist.R;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
import p038c2.C1660c;
import p128g2.C5663a;
import p143h2.C5880c;
import p143h2.C5881d;
import p143h2.C5882e;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0762b {

    /* JADX INFO: renamed from: g */
    public static final int[] f5374g = {0, 4, 8};

    /* JADX INFO: renamed from: h */
    public static final SparseIntArray f5375h;

    /* JADX INFO: renamed from: i */
    public static final SparseIntArray f5376i;

    /* JADX INFO: renamed from: a */
    public String f5377a;

    /* JADX INFO: renamed from: b */
    public String f5378b = "";

    /* JADX INFO: renamed from: c */
    public int f5379c = 0;

    /* JADX INFO: renamed from: d */
    public final HashMap<String, ConstraintAttribute> f5380d = new HashMap<>();

    /* JADX INFO: renamed from: e */
    public boolean f5381e = true;

    /* JADX INFO: renamed from: f */
    public final HashMap<Integer, a> f5382f = new HashMap<>();

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public int f5383a;

        /* JADX INFO: renamed from: b */
        public String f5384b;

        /* JADX INFO: renamed from: c */
        public final d f5385c = new d();

        /* JADX INFO: renamed from: d */
        public final c f5386d = new c();

        /* JADX INFO: renamed from: e */
        public final b f5387e = new b();

        /* JADX INFO: renamed from: f */
        public final e f5388f = new e();

        /* JADX INFO: renamed from: g */
        public HashMap<String, ConstraintAttribute> f5389g = new HashMap<>();

        /* JADX INFO: renamed from: h */
        public C10592a f5390h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$a$a, reason: collision with other inner class name */
        public static class C10592a {

            /* JADX INFO: renamed from: a */
            public int[] f5391a = new int[10];

            /* JADX INFO: renamed from: b */
            public int[] f5392b = new int[10];

            /* JADX INFO: renamed from: c */
            public int f5393c = 0;

            /* JADX INFO: renamed from: d */
            public int[] f5394d = new int[10];

            /* JADX INFO: renamed from: e */
            public float[] f5395e = new float[10];

            /* JADX INFO: renamed from: f */
            public int f5396f = 0;

            /* JADX INFO: renamed from: g */
            public int[] f5397g = new int[5];

            /* JADX INFO: renamed from: h */
            public String[] f5398h = new String[5];

            /* JADX INFO: renamed from: i */
            public int f5399i = 0;

            /* JADX INFO: renamed from: j */
            public int[] f5400j = new int[4];

            /* JADX INFO: renamed from: k */
            public boolean[] f5401k = new boolean[4];

            /* JADX INFO: renamed from: l */
            public int f5402l = 0;

            /* JADX INFO: renamed from: a */
            public final void m2904a(int i10, float f3) {
                int i11 = this.f5396f;
                int[] iArr = this.f5394d;
                if (i11 >= iArr.length) {
                    this.f5394d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f5395e;
                    this.f5395e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f5394d;
                int i12 = this.f5396f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f5395e;
                this.f5396f = i12 + 1;
                fArr2[i12] = f3;
            }

            /* JADX INFO: renamed from: b */
            public final void m2905b(int i10, int i11) {
                int i12 = this.f5393c;
                int[] iArr = this.f5391a;
                if (i12 >= iArr.length) {
                    this.f5391a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f5392b;
                    this.f5392b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f5391a;
                int i13 = this.f5393c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f5392b;
                this.f5393c = i13 + 1;
                iArr4[i13] = i11;
            }

            /* JADX INFO: renamed from: c */
            public final void m2906c(int i10, boolean z10) {
                int i11 = this.f5402l;
                int[] iArr = this.f5400j;
                if (i11 >= iArr.length) {
                    this.f5400j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f5401k;
                    this.f5401k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f5400j;
                int i12 = this.f5402l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f5401k;
                this.f5402l = i12 + 1;
                zArr2[i12] = z10;
            }

            /* JADX INFO: renamed from: d */
            public final void m2907d(String str, int i10) {
                int i11 = this.f5399i;
                int[] iArr = this.f5397g;
                if (i11 >= iArr.length) {
                    this.f5397g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f5398h;
                    this.f5398h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f5397g;
                int i12 = this.f5399i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f5398h;
                this.f5399i = i12 + 1;
                strArr2[i12] = str;
            }

            /* JADX INFO: renamed from: e */
            public final void m2908e(a aVar) {
                for (int i10 = 0; i10 < this.f5393c; i10++) {
                    int i11 = this.f5391a[i10];
                    int i12 = this.f5392b[i10];
                    int[] iArr = C0762b.f5374g;
                    if (i11 == 6) {
                        aVar.f5387e.f5407D = i12;
                    } else if (i11 == 7) {
                        aVar.f5387e.f5408E = i12;
                    } else if (i11 == 8) {
                        aVar.f5387e.f5414K = i12;
                    } else if (i11 == 27) {
                        aVar.f5387e.f5409F = i12;
                    } else if (i11 == 28) {
                        aVar.f5387e.f5411H = i12;
                    } else if (i11 == 41) {
                        aVar.f5387e.f5426W = i12;
                    } else if (i11 == 42) {
                        aVar.f5387e.f5427X = i12;
                    } else if (i11 == 61) {
                        aVar.f5387e.f5404A = i12;
                    } else if (i11 == 62) {
                        aVar.f5387e.f5405B = i12;
                    } else if (i11 == 72) {
                        aVar.f5387e.f5443g0 = i12;
                    } else if (i11 == 73) {
                        aVar.f5387e.f5445h0 = i12;
                    } else if (i11 == 2) {
                        aVar.f5387e.f5413J = i12;
                    } else if (i11 == 31) {
                        aVar.f5387e.f5415L = i12;
                    } else if (i11 == 34) {
                        aVar.f5387e.f5412I = i12;
                    } else if (i11 == 38) {
                        aVar.f5383a = i12;
                    } else if (i11 == 64) {
                        aVar.f5386d.f5474b = i12;
                    } else if (i11 == 66) {
                        aVar.f5386d.f5478f = i12;
                    } else if (i11 == 76) {
                        aVar.f5386d.f5477e = i12;
                    } else if (i11 == 78) {
                        aVar.f5385c.f5488c = i12;
                    } else if (i11 == 97) {
                        aVar.f5387e.f5461p0 = i12;
                    } else if (i11 == 93) {
                        aVar.f5387e.f5416M = i12;
                    } else if (i11 != 94) {
                        switch (i11) {
                            case 11:
                                aVar.f5387e.f5420Q = i12;
                                break;
                            case 12:
                                aVar.f5387e.f5421R = i12;
                                break;
                            case 13:
                                aVar.f5387e.f5417N = i12;
                                break;
                            case 14:
                                aVar.f5387e.f5419P = i12;
                                break;
                            case 15:
                                aVar.f5387e.f5422S = i12;
                                break;
                            case 16:
                                aVar.f5387e.f5418O = i12;
                                break;
                            case 17:
                                aVar.f5387e.f5438e = i12;
                                break;
                            case 18:
                                aVar.f5387e.f5440f = i12;
                                break;
                            default:
                                switch (i11) {
                                    case 21:
                                        aVar.f5387e.f5436d = i12;
                                        break;
                                    case 22:
                                        aVar.f5385c.f5487b = i12;
                                        break;
                                    case 23:
                                        aVar.f5387e.f5434c = i12;
                                        break;
                                    case 24:
                                        aVar.f5387e.f5410G = i12;
                                        break;
                                    default:
                                        switch (i11) {
                                            case 54:
                                                aVar.f5387e.f5428Y = i12;
                                                break;
                                            case 55:
                                                aVar.f5387e.f5429Z = i12;
                                                break;
                                            case 56:
                                                aVar.f5387e.f5431a0 = i12;
                                                break;
                                            case 57:
                                                aVar.f5387e.f5433b0 = i12;
                                                break;
                                            case 58:
                                                aVar.f5387e.f5435c0 = i12;
                                                break;
                                            case 59:
                                                aVar.f5387e.f5437d0 = i12;
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 82:
                                                        aVar.f5386d.f5475c = i12;
                                                        break;
                                                    case 83:
                                                        aVar.f5388f.f5500i = i12;
                                                        break;
                                                    case 84:
                                                        aVar.f5386d.f5482j = i12;
                                                        break;
                                                    default:
                                                        switch (i11) {
                                                            case 87:
                                                                break;
                                                            case ModuleDescriptor.MODULE_VERSION /* 88 */:
                                                                aVar.f5386d.f5484l = i12;
                                                                break;
                                                            case 89:
                                                                aVar.f5386d.f5485m = i12;
                                                                break;
                                                            default:
                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                break;
                                                        }
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                    } else {
                        aVar.f5387e.f5423T = i12;
                    }
                }
                for (int i13 = 0; i13 < this.f5396f; i13++) {
                    int i14 = this.f5394d[i13];
                    float f3 = this.f5395e[i13];
                    int[] iArr2 = C0762b.f5374g;
                    if (i14 != 19) {
                        if (i14 == 20) {
                            aVar.f5387e.f5469x = f3;
                        } else if (i14 == 37) {
                            aVar.f5387e.f5470y = f3;
                        } else if (i14 == 60) {
                            aVar.f5388f.f5493b = f3;
                        } else if (i14 == 63) {
                            aVar.f5387e.f5406C = f3;
                        } else if (i14 == 79) {
                            aVar.f5386d.f5479g = f3;
                        } else if (i14 == 85) {
                            aVar.f5386d.f5481i = f3;
                        } else if (i14 != 87) {
                            if (i14 == 39) {
                                aVar.f5387e.f5425V = f3;
                            } else if (i14 != 40) {
                                switch (i14) {
                                    case 43:
                                        aVar.f5385c.f5489d = f3;
                                        break;
                                    case 44:
                                        e eVar = aVar.f5388f;
                                        eVar.f5505n = f3;
                                        eVar.f5504m = true;
                                        break;
                                    case 45:
                                        aVar.f5388f.f5494c = f3;
                                        break;
                                    case 46:
                                        aVar.f5388f.f5495d = f3;
                                        break;
                                    case 47:
                                        aVar.f5388f.f5496e = f3;
                                        break;
                                    case 48:
                                        aVar.f5388f.f5497f = f3;
                                        break;
                                    case 49:
                                        aVar.f5388f.f5498g = f3;
                                        break;
                                    case 50:
                                        aVar.f5388f.f5499h = f3;
                                        break;
                                    case 51:
                                        aVar.f5388f.f5501j = f3;
                                        break;
                                    case 52:
                                        aVar.f5388f.f5502k = f3;
                                        break;
                                    case 53:
                                        aVar.f5388f.f5503l = f3;
                                        break;
                                    default:
                                        switch (i14) {
                                            case 67:
                                                aVar.f5386d.f5480h = f3;
                                                break;
                                            case 68:
                                                aVar.f5385c.f5490e = f3;
                                                break;
                                            case 69:
                                                aVar.f5387e.f5439e0 = f3;
                                                break;
                                            case 70:
                                                aVar.f5387e.f5441f0 = f3;
                                                break;
                                            default:
                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                break;
                                        }
                                        break;
                                }
                            } else {
                                aVar.f5387e.f5424U = f3;
                            }
                        }
                    } else {
                        aVar.f5387e.f5442g = f3;
                    }
                }
                for (int i15 = 0; i15 < this.f5399i; i15++) {
                    int i16 = this.f5397g[i15];
                    String str = this.f5398h[i15];
                    int[] iArr3 = C0762b.f5374g;
                    if (i16 != 5) {
                        if (i16 == 65) {
                            aVar.f5386d.f5476d = str;
                        } else if (i16 == 74) {
                            b bVar = aVar.f5387e;
                            bVar.f5451k0 = str;
                            bVar.f5449j0 = null;
                        } else if (i16 == 77) {
                            aVar.f5387e.f5453l0 = str;
                        } else if (i16 != 87) {
                            if (i16 != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                            } else {
                                aVar.f5386d.f5483k = str;
                            }
                        }
                    } else {
                        aVar.f5387e.f5471z = str;
                    }
                }
                for (int i17 = 0; i17 < this.f5402l; i17++) {
                    int i18 = this.f5400j[i17];
                    boolean z10 = this.f5401k[i17];
                    int[] iArr4 = C0762b.f5374g;
                    if (i18 == 44) {
                        aVar.f5388f.f5504m = z10;
                    } else if (i18 == 75) {
                        aVar.f5387e.f5459o0 = z10;
                    } else if (i18 != 87) {
                        if (i18 == 80) {
                            aVar.f5387e.f5455m0 = z10;
                        } else if (i18 != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        } else {
                            aVar.f5387e.f5457n0 = z10;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public final void m2900a(ConstraintLayout.C0759b c0759b) {
            b bVar = this.f5387e;
            c0759b.f5321e = bVar.f5446i;
            c0759b.f5323f = bVar.f5448j;
            c0759b.f5325g = bVar.f5450k;
            c0759b.f5327h = bVar.f5452l;
            c0759b.f5329i = bVar.f5454m;
            c0759b.f5331j = bVar.f5456n;
            c0759b.f5333k = bVar.f5458o;
            c0759b.f5335l = bVar.f5460p;
            c0759b.f5337m = bVar.f5462q;
            c0759b.f5339n = bVar.f5463r;
            c0759b.f5341o = bVar.f5464s;
            c0759b.f5348s = bVar.f5465t;
            c0759b.f5349t = bVar.f5466u;
            c0759b.f5350u = bVar.f5467v;
            c0759b.f5351v = bVar.f5468w;
            ((ViewGroup.MarginLayoutParams) c0759b).leftMargin = bVar.f5410G;
            ((ViewGroup.MarginLayoutParams) c0759b).rightMargin = bVar.f5411H;
            ((ViewGroup.MarginLayoutParams) c0759b).topMargin = bVar.f5412I;
            ((ViewGroup.MarginLayoutParams) c0759b).bottomMargin = bVar.f5413J;
            c0759b.f5287A = bVar.f5422S;
            c0759b.f5288B = bVar.f5421R;
            c0759b.f5353x = bVar.f5418O;
            c0759b.f5355z = bVar.f5420Q;
            c0759b.f5291E = bVar.f5469x;
            c0759b.f5292F = bVar.f5470y;
            c0759b.f5343p = bVar.f5404A;
            c0759b.f5345q = bVar.f5405B;
            c0759b.f5347r = bVar.f5406C;
            c0759b.f5293G = bVar.f5471z;
            c0759b.f5306T = bVar.f5407D;
            c0759b.f5307U = bVar.f5408E;
            c0759b.f5295I = bVar.f5424U;
            c0759b.f5294H = bVar.f5425V;
            c0759b.f5297K = bVar.f5427X;
            c0759b.f5296J = bVar.f5426W;
            c0759b.f5309W = bVar.f5455m0;
            c0759b.f5310X = bVar.f5457n0;
            c0759b.f5298L = bVar.f5428Y;
            c0759b.f5299M = bVar.f5429Z;
            c0759b.f5302P = bVar.f5431a0;
            c0759b.f5303Q = bVar.f5433b0;
            c0759b.f5300N = bVar.f5435c0;
            c0759b.f5301O = bVar.f5437d0;
            c0759b.f5304R = bVar.f5439e0;
            c0759b.f5305S = bVar.f5441f0;
            c0759b.f5308V = bVar.f5409F;
            c0759b.f5317c = bVar.f5442g;
            c0759b.f5313a = bVar.f5438e;
            c0759b.f5315b = bVar.f5440f;
            ((ViewGroup.MarginLayoutParams) c0759b).width = bVar.f5434c;
            ((ViewGroup.MarginLayoutParams) c0759b).height = bVar.f5436d;
            String str = bVar.f5453l0;
            if (str != null) {
                c0759b.f5311Y = str;
            }
            c0759b.f5312Z = bVar.f5461p0;
            c0759b.setMarginStart(bVar.f5415L);
            c0759b.setMarginEnd(bVar.f5414K);
            c0759b.m2871a();
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final a clone() {
            a aVar = new a();
            aVar.f5387e.m2909a(this.f5387e);
            aVar.f5386d.m2911a(this.f5386d);
            d dVar = aVar.f5385c;
            dVar.getClass();
            d dVar2 = this.f5385c;
            dVar.f5486a = dVar2.f5486a;
            dVar.f5487b = dVar2.f5487b;
            dVar.f5489d = dVar2.f5489d;
            dVar.f5490e = dVar2.f5490e;
            dVar.f5488c = dVar2.f5488c;
            aVar.f5388f.m2914a(this.f5388f);
            aVar.f5383a = this.f5383a;
            aVar.f5390h = this.f5390h;
            return aVar;
        }

        /* JADX INFO: renamed from: c */
        public final void m2902c(int i10, ConstraintLayout.C0759b c0759b) {
            this.f5383a = i10;
            int i11 = c0759b.f5321e;
            b bVar = this.f5387e;
            bVar.f5446i = i11;
            bVar.f5448j = c0759b.f5323f;
            bVar.f5450k = c0759b.f5325g;
            bVar.f5452l = c0759b.f5327h;
            bVar.f5454m = c0759b.f5329i;
            bVar.f5456n = c0759b.f5331j;
            bVar.f5458o = c0759b.f5333k;
            bVar.f5460p = c0759b.f5335l;
            bVar.f5462q = c0759b.f5337m;
            bVar.f5463r = c0759b.f5339n;
            bVar.f5464s = c0759b.f5341o;
            bVar.f5465t = c0759b.f5348s;
            bVar.f5466u = c0759b.f5349t;
            bVar.f5467v = c0759b.f5350u;
            bVar.f5468w = c0759b.f5351v;
            bVar.f5469x = c0759b.f5291E;
            bVar.f5470y = c0759b.f5292F;
            bVar.f5471z = c0759b.f5293G;
            bVar.f5404A = c0759b.f5343p;
            bVar.f5405B = c0759b.f5345q;
            bVar.f5406C = c0759b.f5347r;
            bVar.f5407D = c0759b.f5306T;
            bVar.f5408E = c0759b.f5307U;
            bVar.f5409F = c0759b.f5308V;
            bVar.f5442g = c0759b.f5317c;
            bVar.f5438e = c0759b.f5313a;
            bVar.f5440f = c0759b.f5315b;
            bVar.f5434c = ((ViewGroup.MarginLayoutParams) c0759b).width;
            bVar.f5436d = ((ViewGroup.MarginLayoutParams) c0759b).height;
            bVar.f5410G = ((ViewGroup.MarginLayoutParams) c0759b).leftMargin;
            bVar.f5411H = ((ViewGroup.MarginLayoutParams) c0759b).rightMargin;
            bVar.f5412I = ((ViewGroup.MarginLayoutParams) c0759b).topMargin;
            bVar.f5413J = ((ViewGroup.MarginLayoutParams) c0759b).bottomMargin;
            bVar.f5416M = c0759b.f5290D;
            bVar.f5424U = c0759b.f5295I;
            bVar.f5425V = c0759b.f5294H;
            bVar.f5427X = c0759b.f5297K;
            bVar.f5426W = c0759b.f5296J;
            bVar.f5455m0 = c0759b.f5309W;
            bVar.f5457n0 = c0759b.f5310X;
            bVar.f5428Y = c0759b.f5298L;
            bVar.f5429Z = c0759b.f5299M;
            bVar.f5431a0 = c0759b.f5302P;
            bVar.f5433b0 = c0759b.f5303Q;
            bVar.f5435c0 = c0759b.f5300N;
            bVar.f5437d0 = c0759b.f5301O;
            bVar.f5439e0 = c0759b.f5304R;
            bVar.f5441f0 = c0759b.f5305S;
            bVar.f5453l0 = c0759b.f5311Y;
            bVar.f5418O = c0759b.f5353x;
            bVar.f5420Q = c0759b.f5355z;
            bVar.f5417N = c0759b.f5352w;
            bVar.f5419P = c0759b.f5354y;
            bVar.f5422S = c0759b.f5287A;
            bVar.f5421R = c0759b.f5288B;
            bVar.f5423T = c0759b.f5289C;
            bVar.f5461p0 = c0759b.f5312Z;
            bVar.f5414K = c0759b.getMarginEnd();
            bVar.f5415L = c0759b.getMarginStart();
        }

        /* JADX INFO: renamed from: d */
        public final void m2903d(int i10, C0763c.a aVar) {
            m2902c(i10, aVar);
            this.f5385c.f5489d = aVar.f5511r0;
            float f3 = aVar.f5514u0;
            e eVar = this.f5388f;
            eVar.f5493b = f3;
            eVar.f5494c = aVar.f5515v0;
            eVar.f5495d = aVar.f5516w0;
            eVar.f5496e = aVar.f5517x0;
            eVar.f5497f = aVar.f5518y0;
            eVar.f5498g = aVar.f5519z0;
            eVar.f5499h = aVar.f5507A0;
            eVar.f5501j = aVar.f5508B0;
            eVar.f5502k = aVar.f5509C0;
            eVar.f5503l = aVar.f5510D0;
            eVar.f5505n = aVar.f5513t0;
            eVar.f5504m = aVar.f5512s0;
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$b */
    public static class b {

        /* JADX INFO: renamed from: q0 */
        public static final SparseIntArray f5403q0;

        /* JADX INFO: renamed from: c */
        public int f5434c;

        /* JADX INFO: renamed from: d */
        public int f5436d;

        /* JADX INFO: renamed from: j0 */
        public int[] f5449j0;

        /* JADX INFO: renamed from: k0 */
        public String f5451k0;

        /* JADX INFO: renamed from: l0 */
        public String f5453l0;

        /* JADX INFO: renamed from: a */
        public boolean f5430a = false;

        /* JADX INFO: renamed from: b */
        public boolean f5432b = false;

        /* JADX INFO: renamed from: e */
        public int f5438e = -1;

        /* JADX INFO: renamed from: f */
        public int f5440f = -1;

        /* JADX INFO: renamed from: g */
        public float f5442g = -1.0f;

        /* JADX INFO: renamed from: h */
        public boolean f5444h = true;

        /* JADX INFO: renamed from: i */
        public int f5446i = -1;

        /* JADX INFO: renamed from: j */
        public int f5448j = -1;

        /* JADX INFO: renamed from: k */
        public int f5450k = -1;

        /* JADX INFO: renamed from: l */
        public int f5452l = -1;

        /* JADX INFO: renamed from: m */
        public int f5454m = -1;

        /* JADX INFO: renamed from: n */
        public int f5456n = -1;

        /* JADX INFO: renamed from: o */
        public int f5458o = -1;

        /* JADX INFO: renamed from: p */
        public int f5460p = -1;

        /* JADX INFO: renamed from: q */
        public int f5462q = -1;

        /* JADX INFO: renamed from: r */
        public int f5463r = -1;

        /* JADX INFO: renamed from: s */
        public int f5464s = -1;

        /* JADX INFO: renamed from: t */
        public int f5465t = -1;

        /* JADX INFO: renamed from: u */
        public int f5466u = -1;

        /* JADX INFO: renamed from: v */
        public int f5467v = -1;

        /* JADX INFO: renamed from: w */
        public int f5468w = -1;

        /* JADX INFO: renamed from: x */
        public float f5469x = 0.5f;

        /* JADX INFO: renamed from: y */
        public float f5470y = 0.5f;

        /* JADX INFO: renamed from: z */
        public String f5471z = null;

        /* JADX INFO: renamed from: A */
        public int f5404A = -1;

        /* JADX INFO: renamed from: B */
        public int f5405B = 0;

        /* JADX INFO: renamed from: C */
        public float f5406C = 0.0f;

        /* JADX INFO: renamed from: D */
        public int f5407D = -1;

        /* JADX INFO: renamed from: E */
        public int f5408E = -1;

        /* JADX INFO: renamed from: F */
        public int f5409F = -1;

        /* JADX INFO: renamed from: G */
        public int f5410G = 0;

        /* JADX INFO: renamed from: H */
        public int f5411H = 0;

        /* JADX INFO: renamed from: I */
        public int f5412I = 0;

        /* JADX INFO: renamed from: J */
        public int f5413J = 0;

        /* JADX INFO: renamed from: K */
        public int f5414K = 0;

        /* JADX INFO: renamed from: L */
        public int f5415L = 0;

        /* JADX INFO: renamed from: M */
        public int f5416M = 0;

        /* JADX INFO: renamed from: N */
        public int f5417N = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: O */
        public int f5418O = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: P */
        public int f5419P = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: Q */
        public int f5420Q = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: R */
        public int f5421R = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: S */
        public int f5422S = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: T */
        public int f5423T = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: U */
        public float f5424U = -1.0f;

        /* JADX INFO: renamed from: V */
        public float f5425V = -1.0f;

        /* JADX INFO: renamed from: W */
        public int f5426W = 0;

        /* JADX INFO: renamed from: X */
        public int f5427X = 0;

        /* JADX INFO: renamed from: Y */
        public int f5428Y = 0;

        /* JADX INFO: renamed from: Z */
        public int f5429Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f5431a0 = 0;

        /* JADX INFO: renamed from: b0 */
        public int f5433b0 = 0;

        /* JADX INFO: renamed from: c0 */
        public int f5435c0 = 0;

        /* JADX INFO: renamed from: d0 */
        public int f5437d0 = 0;

        /* JADX INFO: renamed from: e0 */
        public float f5439e0 = 1.0f;

        /* JADX INFO: renamed from: f0 */
        public float f5441f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public int f5443g0 = -1;

        /* JADX INFO: renamed from: h0 */
        public int f5445h0 = 0;

        /* JADX INFO: renamed from: i0 */
        public int f5447i0 = -1;

        /* JADX INFO: renamed from: m0 */
        public boolean f5455m0 = false;

        /* JADX INFO: renamed from: n0 */
        public boolean f5457n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f5459o0 = true;

        /* JADX INFO: renamed from: p0 */
        public int f5461p0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5403q0 = sparseIntArray;
            sparseIntArray.append(43, 24);
            sparseIntArray.append(44, 25);
            sparseIntArray.append(46, 28);
            sparseIntArray.append(47, 29);
            sparseIntArray.append(52, 35);
            sparseIntArray.append(51, 34);
            sparseIntArray.append(24, 4);
            sparseIntArray.append(23, 3);
            sparseIntArray.append(19, 1);
            sparseIntArray.append(61, 6);
            sparseIntArray.append(62, 7);
            sparseIntArray.append(31, 17);
            sparseIntArray.append(32, 18);
            sparseIntArray.append(33, 19);
            sparseIntArray.append(15, 90);
            sparseIntArray.append(0, 26);
            sparseIntArray.append(48, 31);
            sparseIntArray.append(49, 32);
            sparseIntArray.append(30, 10);
            sparseIntArray.append(29, 9);
            sparseIntArray.append(66, 13);
            sparseIntArray.append(69, 16);
            sparseIntArray.append(67, 14);
            sparseIntArray.append(64, 11);
            sparseIntArray.append(68, 15);
            sparseIntArray.append(65, 12);
            sparseIntArray.append(55, 38);
            sparseIntArray.append(41, 37);
            sparseIntArray.append(40, 39);
            sparseIntArray.append(54, 40);
            sparseIntArray.append(39, 20);
            sparseIntArray.append(53, 36);
            sparseIntArray.append(28, 5);
            sparseIntArray.append(42, 91);
            sparseIntArray.append(50, 91);
            sparseIntArray.append(45, 91);
            sparseIntArray.append(22, 91);
            sparseIntArray.append(18, 91);
            sparseIntArray.append(3, 23);
            sparseIntArray.append(5, 27);
            sparseIntArray.append(7, 30);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(4, 33);
            sparseIntArray.append(6, 2);
            sparseIntArray.append(1, 22);
            sparseIntArray.append(2, 21);
            sparseIntArray.append(56, 41);
            sparseIntArray.append(34, 42);
            sparseIntArray.append(17, 41);
            sparseIntArray.append(16, 42);
            sparseIntArray.append(71, 76);
            sparseIntArray.append(25, 61);
            sparseIntArray.append(27, 62);
            sparseIntArray.append(26, 63);
            sparseIntArray.append(60, 69);
            sparseIntArray.append(38, 70);
            sparseIntArray.append(12, 71);
            sparseIntArray.append(10, 72);
            sparseIntArray.append(11, 73);
            sparseIntArray.append(13, 74);
            sparseIntArray.append(9, 75);
        }

        /* JADX INFO: renamed from: a */
        public final void m2909a(b bVar) {
            this.f5430a = bVar.f5430a;
            this.f5434c = bVar.f5434c;
            this.f5432b = bVar.f5432b;
            this.f5436d = bVar.f5436d;
            this.f5438e = bVar.f5438e;
            this.f5440f = bVar.f5440f;
            this.f5442g = bVar.f5442g;
            this.f5444h = bVar.f5444h;
            this.f5446i = bVar.f5446i;
            this.f5448j = bVar.f5448j;
            this.f5450k = bVar.f5450k;
            this.f5452l = bVar.f5452l;
            this.f5454m = bVar.f5454m;
            this.f5456n = bVar.f5456n;
            this.f5458o = bVar.f5458o;
            this.f5460p = bVar.f5460p;
            this.f5462q = bVar.f5462q;
            this.f5463r = bVar.f5463r;
            this.f5464s = bVar.f5464s;
            this.f5465t = bVar.f5465t;
            this.f5466u = bVar.f5466u;
            this.f5467v = bVar.f5467v;
            this.f5468w = bVar.f5468w;
            this.f5469x = bVar.f5469x;
            this.f5470y = bVar.f5470y;
            this.f5471z = bVar.f5471z;
            this.f5404A = bVar.f5404A;
            this.f5405B = bVar.f5405B;
            this.f5406C = bVar.f5406C;
            this.f5407D = bVar.f5407D;
            this.f5408E = bVar.f5408E;
            this.f5409F = bVar.f5409F;
            this.f5410G = bVar.f5410G;
            this.f5411H = bVar.f5411H;
            this.f5412I = bVar.f5412I;
            this.f5413J = bVar.f5413J;
            this.f5414K = bVar.f5414K;
            this.f5415L = bVar.f5415L;
            this.f5416M = bVar.f5416M;
            this.f5417N = bVar.f5417N;
            this.f5418O = bVar.f5418O;
            this.f5419P = bVar.f5419P;
            this.f5420Q = bVar.f5420Q;
            this.f5421R = bVar.f5421R;
            this.f5422S = bVar.f5422S;
            this.f5423T = bVar.f5423T;
            this.f5424U = bVar.f5424U;
            this.f5425V = bVar.f5425V;
            this.f5426W = bVar.f5426W;
            this.f5427X = bVar.f5427X;
            this.f5428Y = bVar.f5428Y;
            this.f5429Z = bVar.f5429Z;
            this.f5431a0 = bVar.f5431a0;
            this.f5433b0 = bVar.f5433b0;
            this.f5435c0 = bVar.f5435c0;
            this.f5437d0 = bVar.f5437d0;
            this.f5439e0 = bVar.f5439e0;
            this.f5441f0 = bVar.f5441f0;
            this.f5443g0 = bVar.f5443g0;
            this.f5445h0 = bVar.f5445h0;
            this.f5447i0 = bVar.f5447i0;
            this.f5453l0 = bVar.f5453l0;
            int[] iArr = bVar.f5449j0;
            if (iArr == null || bVar.f5451k0 != null) {
                this.f5449j0 = null;
            } else {
                this.f5449j0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f5451k0 = bVar.f5451k0;
            this.f5455m0 = bVar.f5455m0;
            this.f5457n0 = bVar.f5457n0;
            this.f5459o0 = bVar.f5459o0;
            this.f5461p0 = bVar.f5461p0;
        }

        /* JADX INFO: renamed from: b */
        public final void m2910b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35177k);
            this.f5432b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                SparseIntArray sparseIntArray = f5403q0;
                int i11 = sparseIntArray.get(index);
                switch (i11) {
                    case 1:
                        this.f5462q = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5462q);
                        break;
                    case 2:
                        this.f5413J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5413J);
                        break;
                    case 3:
                        this.f5460p = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5460p);
                        break;
                    case 4:
                        this.f5458o = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5458o);
                        break;
                    case 5:
                        this.f5471z = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.f5407D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5407D);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f5408E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5408E);
                        break;
                    case 8:
                        this.f5414K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5414K);
                        break;
                    case 9:
                        this.f5468w = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5468w);
                        break;
                    case 10:
                        this.f5467v = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5467v);
                        break;
                    case 11:
                        this.f5420Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5420Q);
                        break;
                    case 12:
                        this.f5421R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5421R);
                        break;
                    case 13:
                        this.f5417N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5417N);
                        break;
                    case 14:
                        this.f5419P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5419P);
                        break;
                    case 15:
                        this.f5422S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5422S);
                        break;
                    case 16:
                        this.f5418O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5418O);
                        break;
                    case 17:
                        this.f5438e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5438e);
                        break;
                    case 18:
                        this.f5440f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5440f);
                        break;
                    case 19:
                        this.f5442g = typedArrayObtainStyledAttributes.getFloat(index, this.f5442g);
                        break;
                    case 20:
                        this.f5469x = typedArrayObtainStyledAttributes.getFloat(index, this.f5469x);
                        break;
                    case 21:
                        this.f5436d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5436d);
                        break;
                    case 22:
                        this.f5434c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f5434c);
                        break;
                    case 23:
                        this.f5410G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5410G);
                        break;
                    case 24:
                        this.f5446i = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5446i);
                        break;
                    case 25:
                        this.f5448j = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5448j);
                        break;
                    case 26:
                        this.f5409F = typedArrayObtainStyledAttributes.getInt(index, this.f5409F);
                        break;
                    case 27:
                        this.f5411H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5411H);
                        break;
                    case 28:
                        this.f5450k = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5450k);
                        break;
                    case 29:
                        this.f5452l = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5452l);
                        break;
                    case 30:
                        this.f5415L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5415L);
                        break;
                    case 31:
                        this.f5465t = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5465t);
                        break;
                    case 32:
                        this.f5466u = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5466u);
                        break;
                    case 33:
                        this.f5412I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5412I);
                        break;
                    case 34:
                        this.f5456n = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5456n);
                        break;
                    case 35:
                        this.f5454m = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5454m);
                        break;
                    case 36:
                        this.f5470y = typedArrayObtainStyledAttributes.getFloat(index, this.f5470y);
                        break;
                    case 37:
                        this.f5425V = typedArrayObtainStyledAttributes.getFloat(index, this.f5425V);
                        break;
                    case 38:
                        this.f5424U = typedArrayObtainStyledAttributes.getFloat(index, this.f5424U);
                        break;
                    case 39:
                        this.f5426W = typedArrayObtainStyledAttributes.getInt(index, this.f5426W);
                        break;
                    case 40:
                        this.f5427X = typedArrayObtainStyledAttributes.getInt(index, this.f5427X);
                        break;
                    case 41:
                        C0762b.m2886n(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        C0762b.m2886n(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.f5404A = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5404A);
                                break;
                            case 62:
                                this.f5405B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5405B);
                                break;
                            case 63:
                                this.f5406C = typedArrayObtainStyledAttributes.getFloat(index, this.f5406C);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f5439e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f5441f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f5443g0 = typedArrayObtainStyledAttributes.getInt(index, this.f5443g0);
                                        break;
                                    case 73:
                                        this.f5445h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5445h0);
                                        break;
                                    case 74:
                                        this.f5451k0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f5459o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5459o0);
                                        break;
                                    case 76:
                                        this.f5461p0 = typedArrayObtainStyledAttributes.getInt(index, this.f5461p0);
                                        break;
                                    case 77:
                                        this.f5463r = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5463r);
                                        break;
                                    case 78:
                                        this.f5464s = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5464s);
                                        break;
                                    case 79:
                                        this.f5423T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5423T);
                                        break;
                                    case 80:
                                        this.f5416M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5416M);
                                        break;
                                    case 81:
                                        this.f5428Y = typedArrayObtainStyledAttributes.getInt(index, this.f5428Y);
                                        break;
                                    case 82:
                                        this.f5429Z = typedArrayObtainStyledAttributes.getInt(index, this.f5429Z);
                                        break;
                                    case 83:
                                        this.f5433b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5433b0);
                                        break;
                                    case 84:
                                        this.f5431a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5431a0);
                                        break;
                                    case 85:
                                        this.f5437d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5437d0);
                                        break;
                                    case 86:
                                        this.f5435c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5435c0);
                                        break;
                                    case 87:
                                        this.f5455m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5455m0);
                                        break;
                                    case ModuleDescriptor.MODULE_VERSION /* 88 */:
                                        this.f5457n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f5457n0);
                                        break;
                                    case 89:
                                        this.f5453l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f5444h = typedArrayObtainStyledAttributes.getBoolean(index, this.f5444h);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$c */
    public static class c {

        /* JADX INFO: renamed from: n */
        public static final SparseIntArray f5472n;

        /* JADX INFO: renamed from: a */
        public boolean f5473a = false;

        /* JADX INFO: renamed from: b */
        public int f5474b = -1;

        /* JADX INFO: renamed from: c */
        public int f5475c = 0;

        /* JADX INFO: renamed from: d */
        public String f5476d = null;

        /* JADX INFO: renamed from: e */
        public int f5477e = -1;

        /* JADX INFO: renamed from: f */
        public int f5478f = 0;

        /* JADX INFO: renamed from: g */
        public float f5479g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f5480h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public float f5481i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public int f5482j = -1;

        /* JADX INFO: renamed from: k */
        public String f5483k = null;

        /* JADX INFO: renamed from: l */
        public int f5484l = -3;

        /* JADX INFO: renamed from: m */
        public int f5485m = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5472n = sparseIntArray;
            sparseIntArray.append(3, 1);
            sparseIntArray.append(5, 2);
            sparseIntArray.append(9, 3);
            sparseIntArray.append(2, 4);
            sparseIntArray.append(1, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(4, 7);
            sparseIntArray.append(8, 8);
            sparseIntArray.append(7, 9);
            sparseIntArray.append(6, 10);
        }

        /* JADX INFO: renamed from: a */
        public final void m2911a(c cVar) {
            this.f5473a = cVar.f5473a;
            this.f5474b = cVar.f5474b;
            this.f5476d = cVar.f5476d;
            this.f5477e = cVar.f5477e;
            this.f5478f = cVar.f5478f;
            this.f5480h = cVar.f5480h;
            this.f5479g = cVar.f5479g;
        }

        /* JADX INFO: renamed from: b */
        public final void m2912b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35178l);
            this.f5473a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f5472n.get(index)) {
                    case 1:
                        this.f5480h = typedArrayObtainStyledAttributes.getFloat(index, this.f5480h);
                        break;
                    case 2:
                        this.f5477e = typedArrayObtainStyledAttributes.getInt(index, this.f5477e);
                        continue;
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f5476d = typedArrayObtainStyledAttributes.getString(index);
                            continue;
                        } else {
                            this.f5476d = C1660c.f9303c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f5478f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        continue;
                        break;
                    case 5:
                        this.f5474b = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5474b);
                        continue;
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.f5475c = typedArrayObtainStyledAttributes.getInteger(index, this.f5475c);
                        continue;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f5479g = typedArrayObtainStyledAttributes.getFloat(index, this.f5479g);
                        continue;
                        break;
                    case 8:
                        this.f5482j = typedArrayObtainStyledAttributes.getInteger(index, this.f5482j);
                        continue;
                        break;
                    case 9:
                        this.f5481i = typedArrayObtainStyledAttributes.getFloat(index, this.f5481i);
                        continue;
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f5485m = resourceId;
                            if (resourceId != -1) {
                                this.f5484l = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f5483k = string;
                            if (string.indexOf("/") > 0) {
                                this.f5485m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f5484l = -2;
                            } else {
                                this.f5484l = -1;
                            }
                        } else {
                            this.f5484l = typedArrayObtainStyledAttributes.getInteger(index, this.f5485m);
                        }
                        break;
                    default:
                        continue;
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public boolean f5486a = false;

        /* JADX INFO: renamed from: b */
        public int f5487b = 0;

        /* JADX INFO: renamed from: c */
        public int f5488c = 0;

        /* JADX INFO: renamed from: d */
        public float f5489d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f5490e = Float.NaN;

        /* JADX INFO: renamed from: a */
        public final void m2913a(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35184r);
            this.f5486a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f5489d = typedArrayObtainStyledAttributes.getFloat(index, this.f5489d);
                } else if (index == 0) {
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, this.f5487b);
                    this.f5487b = i11;
                    this.f5487b = C0762b.f5374g[i11];
                } else if (index == 4) {
                    this.f5488c = typedArrayObtainStyledAttributes.getInt(index, this.f5488c);
                } else if (index == 3) {
                    this.f5490e = typedArrayObtainStyledAttributes.getFloat(index, this.f5490e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.b$e */
    public static class e {

        /* JADX INFO: renamed from: o */
        public static final SparseIntArray f5491o;

        /* JADX INFO: renamed from: a */
        public boolean f5492a = false;

        /* JADX INFO: renamed from: b */
        public float f5493b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f5494c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f5495d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f5496e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f5497f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f5498g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f5499h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f5500i = -1;

        /* JADX INFO: renamed from: j */
        public float f5501j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f5502k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f5503l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f5504m = false;

        /* JADX INFO: renamed from: n */
        public float f5505n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f5491o = sparseIntArray;
            sparseIntArray.append(6, 1);
            sparseIntArray.append(7, 2);
            sparseIntArray.append(8, 3);
            sparseIntArray.append(4, 4);
            sparseIntArray.append(5, 5);
            sparseIntArray.append(0, 6);
            sparseIntArray.append(1, 7);
            sparseIntArray.append(2, 8);
            sparseIntArray.append(3, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(10, 11);
            sparseIntArray.append(11, 12);
        }

        /* JADX INFO: renamed from: a */
        public final void m2914a(e eVar) {
            this.f5492a = eVar.f5492a;
            this.f5493b = eVar.f5493b;
            this.f5494c = eVar.f5494c;
            this.f5495d = eVar.f5495d;
            this.f5496e = eVar.f5496e;
            this.f5497f = eVar.f5497f;
            this.f5498g = eVar.f5498g;
            this.f5499h = eVar.f5499h;
            this.f5500i = eVar.f5500i;
            this.f5501j = eVar.f5501j;
            this.f5502k = eVar.f5502k;
            this.f5503l = eVar.f5503l;
            this.f5504m = eVar.f5504m;
            this.f5505n = eVar.f5505n;
        }

        /* JADX INFO: renamed from: b */
        public final void m2915b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35187u);
            this.f5492a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f5491o.get(index)) {
                    case 1:
                        this.f5493b = typedArrayObtainStyledAttributes.getFloat(index, this.f5493b);
                        break;
                    case 2:
                        this.f5494c = typedArrayObtainStyledAttributes.getFloat(index, this.f5494c);
                        break;
                    case 3:
                        this.f5495d = typedArrayObtainStyledAttributes.getFloat(index, this.f5495d);
                        break;
                    case 4:
                        this.f5496e = typedArrayObtainStyledAttributes.getFloat(index, this.f5496e);
                        break;
                    case 5:
                        this.f5497f = typedArrayObtainStyledAttributes.getFloat(index, this.f5497f);
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.f5498g = typedArrayObtainStyledAttributes.getDimension(index, this.f5498g);
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f5499h = typedArrayObtainStyledAttributes.getDimension(index, this.f5499h);
                        break;
                    case 8:
                        this.f5501j = typedArrayObtainStyledAttributes.getDimension(index, this.f5501j);
                        break;
                    case 9:
                        this.f5502k = typedArrayObtainStyledAttributes.getDimension(index, this.f5502k);
                        break;
                    case 10:
                        this.f5503l = typedArrayObtainStyledAttributes.getDimension(index, this.f5503l);
                        break;
                    case 11:
                        this.f5504m = true;
                        this.f5505n = typedArrayObtainStyledAttributes.getDimension(index, this.f5505n);
                        break;
                    case 12:
                        this.f5500i = C0762b.m2885m(typedArrayObtainStyledAttributes, index, this.f5500i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f5375h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f5376i = sparseIntArray2;
        sparseIntArray.append(82, 25);
        sparseIntArray.append(83, 26);
        sparseIntArray.append(85, 29);
        sparseIntArray.append(86, 30);
        sparseIntArray.append(92, 36);
        sparseIntArray.append(91, 35);
        sparseIntArray.append(63, 4);
        sparseIntArray.append(62, 3);
        sparseIntArray.append(58, 1);
        sparseIntArray.append(60, 91);
        sparseIntArray.append(59, 92);
        sparseIntArray.append(101, 6);
        sparseIntArray.append(102, 7);
        sparseIntArray.append(70, 17);
        sparseIntArray.append(71, 18);
        sparseIntArray.append(72, 19);
        sparseIntArray.append(54, 99);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(87, 32);
        sparseIntArray.append(88, 33);
        sparseIntArray.append(69, 10);
        sparseIntArray.append(68, 9);
        sparseIntArray.append(106, 13);
        sparseIntArray.append(109, 16);
        sparseIntArray.append(107, 14);
        sparseIntArray.append(104, 11);
        sparseIntArray.append(108, 15);
        sparseIntArray.append(105, 12);
        sparseIntArray.append(95, 40);
        sparseIntArray.append(80, 39);
        sparseIntArray.append(79, 41);
        sparseIntArray.append(94, 42);
        sparseIntArray.append(78, 20);
        sparseIntArray.append(93, 37);
        sparseIntArray.append(67, 5);
        sparseIntArray.append(81, 87);
        sparseIntArray.append(90, 87);
        sparseIntArray.append(84, 87);
        sparseIntArray.append(61, 87);
        sparseIntArray.append(57, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(96, 95);
        sparseIntArray.append(73, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(97, 54);
        sparseIntArray.append(74, 55);
        sparseIntArray.append(98, 56);
        sparseIntArray.append(75, 57);
        sparseIntArray.append(99, 58);
        sparseIntArray.append(76, 59);
        sparseIntArray.append(64, 61);
        sparseIntArray.append(66, 62);
        sparseIntArray.append(65, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(121, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(122, 67);
        sparseIntArray.append(113, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(112, 68);
        sparseIntArray.append(100, 69);
        sparseIntArray.append(77, 70);
        sparseIntArray.append(111, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(114, 76);
        sparseIntArray.append(89, 77);
        sparseIntArray.append(123, 78);
        sparseIntArray.append(56, 80);
        sparseIntArray.append(55, 81);
        sparseIntArray.append(116, 82);
        sparseIntArray.append(120, 83);
        sparseIntArray.append(119, 84);
        sparseIntArray.append(118, 85);
        sparseIntArray.append(117, 86);
        sparseIntArray2.append(85, 6);
        sparseIntArray2.append(85, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(89, 13);
        sparseIntArray2.append(92, 16);
        sparseIntArray2.append(90, 14);
        sparseIntArray2.append(87, 11);
        sparseIntArray2.append(91, 15);
        sparseIntArray2.append(88, 12);
        sparseIntArray2.append(78, 40);
        sparseIntArray2.append(71, 39);
        sparseIntArray2.append(70, 41);
        sparseIntArray2.append(77, 42);
        sparseIntArray2.append(69, 20);
        sparseIntArray2.append(76, 37);
        sparseIntArray2.append(60, 5);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(75, 87);
        sparseIntArray2.append(73, 87);
        sparseIntArray2.append(57, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(79, 95);
        sparseIntArray2.append(64, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(80, 54);
        sparseIntArray2.append(65, 55);
        sparseIntArray2.append(81, 56);
        sparseIntArray2.append(66, 57);
        sparseIntArray2.append(82, 58);
        sparseIntArray2.append(67, 59);
        sparseIntArray2.append(59, 62);
        sparseIntArray2.append(58, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(105, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(106, 67);
        sparseIntArray2.append(96, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(97, 98);
        sparseIntArray2.append(95, 68);
        sparseIntArray2.append(83, 69);
        sparseIntArray2.append(68, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(98, 76);
        sparseIntArray2.append(74, 77);
        sparseIntArray2.append(107, 78);
        sparseIntArray2.append(55, 80);
        sparseIntArray2.append(54, 81);
        sparseIntArray2.append(100, 82);
        sparseIntArray2.append(104, 83);
        sparseIntArray2.append(103, 84);
        sparseIntArray2.append(102, 85);
        sparseIntArray2.append(101, 86);
        sparseIntArray2.append(94, 97);
    }

    /* JADX INFO: renamed from: d */
    public static a m2882d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, C5881d.f35169c);
        m2888p(aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: g */
    public static int[] m2883g(Barrier barrier, String str) {
        int iIntValue;
        HashMap<String, Integer> map;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArrCopyOf = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Integer num = null;
            try {
                iIntValue = C5880c.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                constraintLayout.getClass();
                if ((strTrim instanceof String) && (map = constraintLayout.f5271H) != null && map.containsKey(strTrim)) {
                    num = constraintLayout.f5271H.get(strTrim);
                }
                if (num != null && (num instanceof Integer)) {
                    iIntValue = num.intValue();
                }
            }
            iArrCopyOf[i11] = iIntValue;
            i10++;
            i11++;
        }
        if (i11 != strArrSplit.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
        }
        return iArrCopyOf;
    }

    /* JADX INFO: renamed from: h */
    public static a m2884h(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? C5881d.f35169c : C5881d.f35167a);
        if (z10) {
            m2888p(aVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i10 = 0;
            while (true) {
                b bVar = aVar.f5387e;
                if (i10 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i10);
                    d dVar = aVar.f5385c;
                    e eVar = aVar.f5388f;
                    c cVar = aVar.f5386d;
                    if (index != 1 && 23 != index && 24 != index) {
                        cVar.f5473a = true;
                        bVar.f5432b = true;
                        dVar.f5486a = true;
                        eVar.f5492a = true;
                    }
                    SparseIntArray sparseIntArray = f5375h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            bVar.f5462q = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5462q);
                            break;
                        case 2:
                            bVar.f5413J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5413J);
                            break;
                        case 3:
                            bVar.f5460p = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5460p);
                            break;
                        case 4:
                            bVar.f5458o = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5458o);
                            break;
                        case 5:
                            bVar.f5471z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                            bVar.f5407D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5407D);
                            break;
                        case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                            bVar.f5408E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5408E);
                            break;
                        case 8:
                            bVar.f5414K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5414K);
                            break;
                        case 9:
                            bVar.f5468w = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5468w);
                            break;
                        case 10:
                            bVar.f5467v = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5467v);
                            break;
                        case 11:
                            bVar.f5420Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5420Q);
                            break;
                        case 12:
                            bVar.f5421R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5421R);
                            break;
                        case 13:
                            bVar.f5417N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5417N);
                            break;
                        case 14:
                            bVar.f5419P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5419P);
                            break;
                        case 15:
                            bVar.f5422S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5422S);
                            break;
                        case 16:
                            bVar.f5418O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5418O);
                            break;
                        case 17:
                            bVar.f5438e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5438e);
                            break;
                        case 18:
                            bVar.f5440f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, bVar.f5440f);
                            break;
                        case 19:
                            bVar.f5442g = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5442g);
                            break;
                        case 20:
                            bVar.f5469x = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5469x);
                            break;
                        case 21:
                            bVar.f5436d = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f5436d);
                            break;
                        case 22:
                            dVar.f5487b = f5374g[typedArrayObtainStyledAttributes.getInt(index, dVar.f5487b)];
                            break;
                        case 23:
                            bVar.f5434c = typedArrayObtainStyledAttributes.getLayoutDimension(index, bVar.f5434c);
                            break;
                        case 24:
                            bVar.f5410G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5410G);
                            break;
                        case 25:
                            bVar.f5446i = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5446i);
                            break;
                        case 26:
                            bVar.f5448j = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5448j);
                            break;
                        case 27:
                            bVar.f5409F = typedArrayObtainStyledAttributes.getInt(index, bVar.f5409F);
                            break;
                        case 28:
                            bVar.f5411H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5411H);
                            break;
                        case 29:
                            bVar.f5450k = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5450k);
                            break;
                        case 30:
                            bVar.f5452l = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5452l);
                            break;
                        case 31:
                            bVar.f5415L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5415L);
                            break;
                        case 32:
                            bVar.f5465t = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5465t);
                            break;
                        case 33:
                            bVar.f5466u = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5466u);
                            break;
                        case 34:
                            bVar.f5412I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5412I);
                            break;
                        case 35:
                            bVar.f5456n = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5456n);
                            break;
                        case 36:
                            bVar.f5454m = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5454m);
                            break;
                        case 37:
                            bVar.f5470y = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5470y);
                            break;
                        case 38:
                            aVar.f5383a = typedArrayObtainStyledAttributes.getResourceId(index, aVar.f5383a);
                            break;
                        case 39:
                            bVar.f5425V = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5425V);
                            break;
                        case 40:
                            bVar.f5424U = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5424U);
                            break;
                        case 41:
                            bVar.f5426W = typedArrayObtainStyledAttributes.getInt(index, bVar.f5426W);
                            break;
                        case 42:
                            bVar.f5427X = typedArrayObtainStyledAttributes.getInt(index, bVar.f5427X);
                            break;
                        case 43:
                            dVar.f5489d = typedArrayObtainStyledAttributes.getFloat(index, dVar.f5489d);
                            break;
                        case 44:
                            eVar.f5504m = true;
                            eVar.f5505n = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5505n);
                            break;
                        case 45:
                            eVar.f5494c = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5494c);
                            break;
                        case 46:
                            eVar.f5495d = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5495d);
                            break;
                        case 47:
                            eVar.f5496e = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5496e);
                            break;
                        case 48:
                            eVar.f5497f = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5497f);
                            break;
                        case 49:
                            eVar.f5498g = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5498g);
                            break;
                        case 50:
                            eVar.f5499h = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5499h);
                            break;
                        case 51:
                            eVar.f5501j = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5501j);
                            break;
                        case 52:
                            eVar.f5502k = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5502k);
                            break;
                        case 53:
                            eVar.f5503l = typedArrayObtainStyledAttributes.getDimension(index, eVar.f5503l);
                            break;
                        case 54:
                            bVar.f5428Y = typedArrayObtainStyledAttributes.getInt(index, bVar.f5428Y);
                            break;
                        case 55:
                            bVar.f5429Z = typedArrayObtainStyledAttributes.getInt(index, bVar.f5429Z);
                            break;
                        case 56:
                            bVar.f5431a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5431a0);
                            break;
                        case 57:
                            bVar.f5433b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5433b0);
                            break;
                        case 58:
                            bVar.f5435c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5435c0);
                            break;
                        case 59:
                            bVar.f5437d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5437d0);
                            break;
                        case 60:
                            eVar.f5493b = typedArrayObtainStyledAttributes.getFloat(index, eVar.f5493b);
                            break;
                        case 61:
                            bVar.f5404A = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5404A);
                            break;
                        case 62:
                            bVar.f5405B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5405B);
                            break;
                        case 63:
                            bVar.f5406C = typedArrayObtainStyledAttributes.getFloat(index, bVar.f5406C);
                            break;
                        case 64:
                            cVar.f5474b = m2885m(typedArrayObtainStyledAttributes, index, cVar.f5474b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                cVar.f5476d = C1660c.f9303c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                cVar.f5476d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            cVar.f5478f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            cVar.f5480h = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5480h);
                            break;
                        case 68:
                            dVar.f5490e = typedArrayObtainStyledAttributes.getFloat(index, dVar.f5490e);
                            break;
                        case 69:
                            bVar.f5439e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            bVar.f5441f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            bVar.f5443g0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f5443g0);
                            break;
                        case 73:
                            bVar.f5445h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5445h0);
                            break;
                        case 74:
                            bVar.f5451k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            bVar.f5459o0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5459o0);
                            break;
                        case 76:
                            cVar.f5477e = typedArrayObtainStyledAttributes.getInt(index, cVar.f5477e);
                            break;
                        case 77:
                            bVar.f5453l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            dVar.f5488c = typedArrayObtainStyledAttributes.getInt(index, dVar.f5488c);
                            break;
                        case 79:
                            cVar.f5479g = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5479g);
                            break;
                        case 80:
                            bVar.f5455m0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5455m0);
                            break;
                        case 81:
                            bVar.f5457n0 = typedArrayObtainStyledAttributes.getBoolean(index, bVar.f5457n0);
                            break;
                        case 82:
                            cVar.f5475c = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5475c);
                            break;
                        case 83:
                            eVar.f5500i = m2885m(typedArrayObtainStyledAttributes, index, eVar.f5500i);
                            break;
                        case 84:
                            cVar.f5482j = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5482j);
                            break;
                        case 85:
                            cVar.f5481i = typedArrayObtainStyledAttributes.getFloat(index, cVar.f5481i);
                            break;
                        case 86:
                            int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i11 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                cVar.f5485m = resourceId;
                                if (resourceId != -1) {
                                    cVar.f5484l = -2;
                                }
                            } else if (i11 != 3) {
                                cVar.f5484l = typedArrayObtainStyledAttributes.getInteger(index, cVar.f5485m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                cVar.f5483k = string;
                                if (string.indexOf("/") <= 0) {
                                    cVar.f5484l = -1;
                                } else {
                                    cVar.f5485m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    cVar.f5484l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case ModuleDescriptor.MODULE_VERSION /* 88 */:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            bVar.f5463r = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5463r);
                            break;
                        case 92:
                            bVar.f5464s = m2885m(typedArrayObtainStyledAttributes, index, bVar.f5464s);
                            break;
                        case 93:
                            bVar.f5416M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5416M);
                            break;
                        case 94:
                            bVar.f5423T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, bVar.f5423T);
                            break;
                        case 95:
                            m2886n(bVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m2886n(bVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            bVar.f5461p0 = typedArrayObtainStyledAttributes.getInt(index, bVar.f5461p0);
                            break;
                    }
                    i10++;
                } else if (bVar.f5451k0 != null) {
                    bVar.f5449j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: renamed from: m */
    public static int m2885m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        if (resourceId == -1) {
            resourceId = typedArray.getInt(i10, -1);
        }
        return resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0045  */
    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052  */
    /* JADX WARN: Code duplicated, block: B:25:0x0058  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x0069  */
    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x007a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0085  */
    /* JADX INFO: renamed from: n */
    public static void m2886n(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        a.C10592a c10592a;
        b bVar;
        ConstraintLayout.C0759b c0759b;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z10 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z10 = false;
                }
                if (obj instanceof ConstraintLayout.C0759b) {
                    c0759b = (ConstraintLayout.C0759b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0759b).width = i13;
                        c0759b.f5309W = z10;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0759b).height = i13;
                        c0759b.f5310X = z10;
                        return;
                    }
                }
                if (obj instanceof b) {
                    bVar = (b) obj;
                    if (i11 == 0) {
                        bVar.f5434c = i13;
                        bVar.f5455m0 = z10;
                        return;
                    } else {
                        bVar.f5436d = i13;
                        bVar.f5457n0 = z10;
                        return;
                    }
                }
                if (obj instanceof a.C10592a) {
                    c10592a = (a.C10592a) obj;
                    if (i11 == 0) {
                        c10592a.m2905b(23, i13);
                        c10592a.m2906c(80, z10);
                        return;
                    } else {
                        c10592a.m2905b(21, i13);
                        c10592a.m2906c(81, z10);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z10 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.C0759b) {
                c0759b = (ConstraintLayout.C0759b) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) c0759b).width = i13;
                    c0759b.f5309W = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) c0759b).height = i13;
                    c0759b.f5310X = z10;
                    return;
                }
            }
            if (obj instanceof b) {
                bVar = (b) obj;
                if (i11 == 0) {
                    bVar.f5434c = i13;
                    bVar.f5455m0 = z10;
                    return;
                } else {
                    bVar.f5436d = i13;
                    bVar.f5457n0 = z10;
                    return;
                }
            }
            if (obj instanceof a.C10592a) {
                c10592a = (a.C10592a) obj;
                if (i11 == 0) {
                    c10592a.m2905b(23, i13);
                    c10592a.m2906c(80, z10);
                    return;
                } else {
                    c10592a.m2905b(21, i13);
                    c10592a.m2906c(81, z10);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.C0759b) {
                    ConstraintLayout.C0759b c0759b2 = (ConstraintLayout.C0759b) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) c0759b2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) c0759b2).height = 0;
                    }
                    m2887o(c0759b2, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).f5471z = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C10592a) {
                        ((a.C10592a) obj).m2907d(strTrim2, 5);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f3 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.C0759b) {
                        ConstraintLayout.C0759b c0759b3 = (ConstraintLayout.C0759b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0759b3).width = 0;
                            c0759b3.f5294H = f3;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0759b3).height = 0;
                            c0759b3.f5295I = f3;
                        }
                    } else if (obj instanceof b) {
                        b bVar2 = (b) obj;
                        if (i11 == 0) {
                            bVar2.f5434c = 0;
                            bVar2.f5425V = f3;
                        } else {
                            bVar2.f5436d = 0;
                            bVar2.f5424U = f3;
                        }
                    } else if (obj instanceof a.C10592a) {
                        a.C10592a c10592a2 = (a.C10592a) obj;
                        if (i11 == 0) {
                            c10592a2.m2905b(23, 0);
                            c10592a2.m2904a(39, f3);
                        } else {
                            c10592a2.m2905b(21, 0);
                            c10592a2.m2904a(40, f3);
                        }
                    }
                } else {
                    if (!"parent".equalsIgnoreCase(strTrim)) {
                        return;
                    }
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.C0759b) {
                        ConstraintLayout.C0759b c0759b4 = (ConstraintLayout.C0759b) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) c0759b4).width = 0;
                            c0759b4.f5304R = fMax;
                            c0759b4.f5298L = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) c0759b4).height = 0;
                            c0759b4.f5305S = fMax;
                            c0759b4.f5299M = 2;
                        }
                    } else if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i11 == 0) {
                            bVar3.f5434c = 0;
                            bVar3.f5439e0 = fMax;
                            bVar3.f5428Y = 2;
                        } else {
                            bVar3.f5436d = 0;
                            bVar3.f5441f0 = fMax;
                            bVar3.f5429Z = 2;
                        }
                    } else if (obj instanceof a.C10592a) {
                        a.C10592a c10592a3 = (a.C10592a) obj;
                        if (i11 == 0) {
                            c10592a3.m2905b(23, 0);
                            c10592a3.m2905b(54, 2);
                        } else {
                            c10592a3.m2905b(21, 0);
                            c10592a3.m2905b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m2887o(ConstraintLayout.C0759b c0759b, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i10 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f3 = Float.parseFloat(strSubstring3);
                        float f10 = Float.parseFloat(strSubstring4);
                        if (f3 > 0.0f && f10 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(f10 / f3);
                            } else {
                                Math.abs(f3 / f10);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        c0759b.f5293G = str;
    }

    /* JADX INFO: renamed from: p */
    public static void m2888p(a aVar, TypedArray typedArray) {
        boolean z10;
        int indexCount = typedArray.getIndexCount();
        a.C10592a c10592a = new a.C10592a();
        aVar.f5390h = c10592a;
        c cVar = aVar.f5386d;
        cVar.f5473a = false;
        b bVar = aVar.f5387e;
        bVar.f5432b = false;
        d dVar = aVar.f5385c;
        dVar.f5486a = false;
        e eVar = aVar.f5388f;
        eVar.f5492a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            int i11 = f5376i.get(index);
            SparseIntArray sparseIntArray = f5375h;
            switch (i11) {
                case 2:
                    z10 = false;
                    c10592a.m2905b(2, typedArray.getDimensionPixelSize(index, bVar.f5413J));
                    continue;
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case ModuleDescriptor.MODULE_VERSION /* 88 */:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    z10 = false;
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    continue;
                    break;
                case 5:
                    z10 = false;
                    c10592a.m2907d(typedArray.getString(index), 5);
                    continue;
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    z10 = false;
                    c10592a.m2905b(6, typedArray.getDimensionPixelOffset(index, bVar.f5407D));
                    continue;
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    z10 = false;
                    c10592a.m2905b(7, typedArray.getDimensionPixelOffset(index, bVar.f5408E));
                    continue;
                    break;
                case 8:
                    z10 = false;
                    c10592a.m2905b(8, typedArray.getDimensionPixelSize(index, bVar.f5414K));
                    continue;
                    break;
                case 11:
                    z10 = false;
                    c10592a.m2905b(11, typedArray.getDimensionPixelSize(index, bVar.f5420Q));
                    continue;
                    break;
                case 12:
                    z10 = false;
                    c10592a.m2905b(12, typedArray.getDimensionPixelSize(index, bVar.f5421R));
                    continue;
                    break;
                case 13:
                    z10 = false;
                    c10592a.m2905b(13, typedArray.getDimensionPixelSize(index, bVar.f5417N));
                    continue;
                    break;
                case 14:
                    z10 = false;
                    c10592a.m2905b(14, typedArray.getDimensionPixelSize(index, bVar.f5419P));
                    continue;
                    break;
                case 15:
                    z10 = false;
                    c10592a.m2905b(15, typedArray.getDimensionPixelSize(index, bVar.f5422S));
                    continue;
                    break;
                case 16:
                    z10 = false;
                    c10592a.m2905b(16, typedArray.getDimensionPixelSize(index, bVar.f5418O));
                    continue;
                    break;
                case 17:
                    z10 = false;
                    c10592a.m2905b(17, typedArray.getDimensionPixelOffset(index, bVar.f5438e));
                    continue;
                    break;
                case 18:
                    z10 = false;
                    c10592a.m2905b(18, typedArray.getDimensionPixelOffset(index, bVar.f5440f));
                    continue;
                    break;
                case 19:
                    z10 = false;
                    c10592a.m2904a(19, typedArray.getFloat(index, bVar.f5442g));
                    continue;
                    break;
                case 20:
                    z10 = false;
                    c10592a.m2904a(20, typedArray.getFloat(index, bVar.f5469x));
                    continue;
                    break;
                case 21:
                    z10 = false;
                    c10592a.m2905b(21, typedArray.getLayoutDimension(index, bVar.f5436d));
                    continue;
                    break;
                case 22:
                    z10 = false;
                    c10592a.m2905b(22, f5374g[typedArray.getInt(index, dVar.f5487b)]);
                    continue;
                    break;
                case 23:
                    z10 = false;
                    c10592a.m2905b(23, typedArray.getLayoutDimension(index, bVar.f5434c));
                    continue;
                    break;
                case 24:
                    z10 = false;
                    c10592a.m2905b(24, typedArray.getDimensionPixelSize(index, bVar.f5410G));
                    continue;
                    break;
                case 27:
                    z10 = false;
                    c10592a.m2905b(27, typedArray.getInt(index, bVar.f5409F));
                    continue;
                    break;
                case 28:
                    z10 = false;
                    c10592a.m2905b(28, typedArray.getDimensionPixelSize(index, bVar.f5411H));
                    continue;
                    break;
                case 31:
                    z10 = false;
                    c10592a.m2905b(31, typedArray.getDimensionPixelSize(index, bVar.f5415L));
                    continue;
                    break;
                case 34:
                    z10 = false;
                    c10592a.m2905b(34, typedArray.getDimensionPixelSize(index, bVar.f5412I));
                    continue;
                    break;
                case 37:
                    z10 = false;
                    c10592a.m2904a(37, typedArray.getFloat(index, bVar.f5470y));
                    continue;
                    break;
                case 38:
                    z10 = false;
                    int resourceId = typedArray.getResourceId(index, aVar.f5383a);
                    aVar.f5383a = resourceId;
                    c10592a.m2905b(38, resourceId);
                    continue;
                    break;
                case 39:
                    z10 = false;
                    c10592a.m2904a(39, typedArray.getFloat(index, bVar.f5425V));
                    continue;
                    break;
                case 40:
                    z10 = false;
                    c10592a.m2904a(40, typedArray.getFloat(index, bVar.f5424U));
                    continue;
                    break;
                case 41:
                    z10 = false;
                    c10592a.m2905b(41, typedArray.getInt(index, bVar.f5426W));
                    continue;
                    break;
                case 42:
                    z10 = false;
                    c10592a.m2905b(42, typedArray.getInt(index, bVar.f5427X));
                    continue;
                    break;
                case 43:
                    z10 = false;
                    c10592a.m2904a(43, typedArray.getFloat(index, dVar.f5489d));
                    continue;
                    break;
                case 44:
                    z10 = false;
                    c10592a.m2906c(44, true);
                    c10592a.m2904a(44, typedArray.getDimension(index, eVar.f5505n));
                    continue;
                    break;
                case 45:
                    z10 = false;
                    c10592a.m2904a(45, typedArray.getFloat(index, eVar.f5494c));
                    continue;
                    break;
                case 46:
                    z10 = false;
                    c10592a.m2904a(46, typedArray.getFloat(index, eVar.f5495d));
                    continue;
                    break;
                case 47:
                    z10 = false;
                    c10592a.m2904a(47, typedArray.getFloat(index, eVar.f5496e));
                    continue;
                    break;
                case 48:
                    z10 = false;
                    c10592a.m2904a(48, typedArray.getFloat(index, eVar.f5497f));
                    continue;
                    break;
                case 49:
                    z10 = false;
                    c10592a.m2904a(49, typedArray.getDimension(index, eVar.f5498g));
                    continue;
                    break;
                case 50:
                    z10 = false;
                    c10592a.m2904a(50, typedArray.getDimension(index, eVar.f5499h));
                    continue;
                    break;
                case 51:
                    z10 = false;
                    c10592a.m2904a(51, typedArray.getDimension(index, eVar.f5501j));
                    continue;
                    break;
                case 52:
                    z10 = false;
                    c10592a.m2904a(52, typedArray.getDimension(index, eVar.f5502k));
                    continue;
                    break;
                case 53:
                    z10 = false;
                    c10592a.m2904a(53, typedArray.getDimension(index, eVar.f5503l));
                    continue;
                    break;
                case 54:
                    z10 = false;
                    c10592a.m2905b(54, typedArray.getInt(index, bVar.f5428Y));
                    continue;
                    break;
                case 55:
                    z10 = false;
                    c10592a.m2905b(55, typedArray.getInt(index, bVar.f5429Z));
                    continue;
                    break;
                case 56:
                    z10 = false;
                    c10592a.m2905b(56, typedArray.getDimensionPixelSize(index, bVar.f5431a0));
                    continue;
                    break;
                case 57:
                    z10 = false;
                    c10592a.m2905b(57, typedArray.getDimensionPixelSize(index, bVar.f5433b0));
                    continue;
                    break;
                case 58:
                    z10 = false;
                    c10592a.m2905b(58, typedArray.getDimensionPixelSize(index, bVar.f5435c0));
                    continue;
                    break;
                case 59:
                    z10 = false;
                    c10592a.m2905b(59, typedArray.getDimensionPixelSize(index, bVar.f5437d0));
                    continue;
                    break;
                case 60:
                    z10 = false;
                    c10592a.m2904a(60, typedArray.getFloat(index, eVar.f5493b));
                    continue;
                    break;
                case 62:
                    z10 = false;
                    c10592a.m2905b(62, typedArray.getDimensionPixelSize(index, bVar.f5405B));
                    continue;
                    break;
                case 63:
                    z10 = false;
                    c10592a.m2904a(63, typedArray.getFloat(index, bVar.f5406C));
                    continue;
                    break;
                case 64:
                    z10 = false;
                    c10592a.m2905b(64, m2885m(typedArray, index, cVar.f5474b));
                    continue;
                    break;
                case 65:
                    z10 = false;
                    if (typedArray.peekValue(index).type == 3) {
                        c10592a.m2907d(typedArray.getString(index), 65);
                        continue;
                    } else {
                        c10592a.m2907d(C1660c.f9303c[typedArray.getInteger(index, 0)], 65);
                    }
                    break;
                case 66:
                    z10 = false;
                    c10592a.m2905b(66, typedArray.getInt(index, 0));
                    continue;
                    break;
                case 67:
                    c10592a.m2904a(67, typedArray.getFloat(index, cVar.f5480h));
                    break;
                case 68:
                    c10592a.m2904a(68, typedArray.getFloat(index, dVar.f5490e));
                    break;
                case 69:
                    c10592a.m2904a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c10592a.m2904a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c10592a.m2905b(72, typedArray.getInt(index, bVar.f5443g0));
                    break;
                case 73:
                    c10592a.m2905b(73, typedArray.getDimensionPixelSize(index, bVar.f5445h0));
                    break;
                case 74:
                    c10592a.m2907d(typedArray.getString(index), 74);
                    break;
                case 75:
                    c10592a.m2906c(75, typedArray.getBoolean(index, bVar.f5459o0));
                    break;
                case 76:
                    c10592a.m2905b(76, typedArray.getInt(index, cVar.f5477e));
                    break;
                case 77:
                    c10592a.m2907d(typedArray.getString(index), 77);
                    break;
                case 78:
                    c10592a.m2905b(78, typedArray.getInt(index, dVar.f5488c));
                    break;
                case 79:
                    c10592a.m2904a(79, typedArray.getFloat(index, cVar.f5479g));
                    break;
                case 80:
                    c10592a.m2906c(80, typedArray.getBoolean(index, bVar.f5455m0));
                    break;
                case 81:
                    c10592a.m2906c(81, typedArray.getBoolean(index, bVar.f5457n0));
                    break;
                case 82:
                    c10592a.m2905b(82, typedArray.getInteger(index, cVar.f5475c));
                    break;
                case 83:
                    c10592a.m2905b(83, m2885m(typedArray, index, eVar.f5500i));
                    break;
                case 84:
                    c10592a.m2905b(84, typedArray.getInteger(index, cVar.f5482j));
                    break;
                case 85:
                    c10592a.m2904a(85, typedArray.getFloat(index, cVar.f5481i));
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        cVar.f5485m = resourceId2;
                        c10592a.m2905b(89, resourceId2);
                        if (cVar.f5485m != -1) {
                            cVar.f5484l = -2;
                            c10592a.m2905b(88, -2);
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        cVar.f5483k = string;
                        c10592a.m2907d(string, 90);
                        if (cVar.f5483k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            cVar.f5485m = resourceId3;
                            c10592a.m2905b(89, resourceId3);
                            cVar.f5484l = -2;
                            c10592a.m2905b(88, -2);
                        } else {
                            cVar.f5484l = -1;
                            c10592a.m2905b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, cVar.f5485m);
                        cVar.f5484l = integer;
                        c10592a.m2905b(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    c10592a.m2905b(93, typedArray.getDimensionPixelSize(index, bVar.f5416M));
                    break;
                case 94:
                    c10592a.m2905b(94, typedArray.getDimensionPixelSize(index, bVar.f5423T));
                    break;
                case 95:
                    m2886n(c10592a, typedArray, index, 0);
                    z10 = false;
                    continue;
                    break;
                case 96:
                    m2886n(c10592a, typedArray, index, 1);
                    break;
                case 97:
                    c10592a.m2905b(97, typedArray.getInt(index, bVar.f5461p0));
                    break;
                case 98:
                    if (MotionLayout.f5046Z0) {
                        int resourceId4 = typedArray.getResourceId(index, aVar.f5383a);
                        aVar.f5383a = resourceId4;
                        if (resourceId4 == -1) {
                            aVar.f5384b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f5384b = typedArray.getString(index);
                    } else {
                        aVar.f5383a = typedArray.getResourceId(index, aVar.f5383a);
                    }
                    break;
                case 99:
                    c10592a.m2906c(99, typedArray.getBoolean(index, bVar.f5444h));
                    break;
            }
            z10 = false;
        }
    }

    /* JADX INFO: renamed from: r */
    public static String m2889r(int i10) {
        switch (i10) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return "start";
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final void m2890a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            HashMap<Integer, a> map = this.f5382f;
            if (!map.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + C5663a.m12021d(childAt));
            } else {
                if (this.f5381e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id2))) {
                    a aVar = map.get(Integer.valueOf(id2));
                    if (aVar != null) {
                        ConstraintAttribute.m2857e(childAt, aVar.f5389g);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2891b(ConstraintLayout constraintLayout) {
        m2892c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public final void m2892c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = this.f5382f;
        HashSet hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (map.containsKey(Integer.valueOf(id2))) {
                if (this.f5381e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = map.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                b bVar = aVar.f5387e;
                                bVar.f5447i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(bVar.f5443g0);
                                barrier.setMargin(bVar.f5445h0);
                                barrier.setAllowsGoneWidget(bVar.f5459o0);
                                int[] iArr = bVar.f5449j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f5451k0;
                                    if (str != null) {
                                        int[] iArrM2883g = m2883g(barrier, str);
                                        bVar.f5449j0 = iArrM2883g;
                                        barrier.setReferencedIds(iArrM2883g);
                                    }
                                }
                            }
                            ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) childAt.getLayoutParams();
                            c0759b.m2871a();
                            aVar.m2900a(c0759b);
                            ConstraintAttribute.m2857e(childAt, aVar.f5389g);
                            childAt.setLayoutParams(c0759b);
                            d dVar = aVar.f5385c;
                            if (dVar.f5488c == 0) {
                                childAt.setVisibility(dVar.f5487b);
                            }
                            childAt.setAlpha(dVar.f5489d);
                            e eVar = aVar.f5388f;
                            childAt.setRotation(eVar.f5493b);
                            childAt.setRotationX(eVar.f5494c);
                            childAt.setRotationY(eVar.f5495d);
                            childAt.setScaleX(eVar.f5496e);
                            childAt.setScaleY(eVar.f5497f);
                            if (eVar.f5500i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(eVar.f5500i);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f5498g)) {
                                    childAt.setPivotX(eVar.f5498g);
                                }
                                if (!Float.isNaN(eVar.f5499h)) {
                                    childAt.setPivotY(eVar.f5499h);
                                }
                            }
                            childAt.setTranslationX(eVar.f5501j);
                            childAt.setTranslationY(eVar.f5502k);
                            childAt.setTranslationZ(eVar.f5503l);
                            if (eVar.f5504m) {
                                childAt.setElevation(eVar.f5505n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            } else {
                Log.w("ConstraintSet", "id unknown " + C5663a.m12021d(childAt));
            }
        }
        Iterator it = hashSet.iterator();
        while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Integer num = (Integer) it.next();
                a aVar2 = map.get(num);
                if (aVar2 != null) {
                    b bVar2 = aVar2.f5387e;
                    if (bVar2.f5447i0 == 1) {
                        Barrier barrier2 = new Barrier(constraintLayout.getContext());
                        barrier2.setId(num.intValue());
                        int[] iArr2 = bVar2.f5449j0;
                        if (iArr2 != null) {
                            barrier2.setReferencedIds(iArr2);
                        } else {
                            String str2 = bVar2.f5451k0;
                            if (str2 != null) {
                                int[] iArrM2883g2 = m2883g(barrier2, str2);
                                bVar2.f5449j0 = iArrM2883g2;
                                barrier2.setReferencedIds(iArrM2883g2);
                            }
                        }
                        barrier2.setType(bVar2.f5443g0);
                        barrier2.setMargin(bVar2.f5445h0);
                        C5882e c5882e = ConstraintLayout.f5270K;
                        ConstraintLayout.C0759b c0759b2 = new ConstraintLayout.C0759b();
                        barrier2.m2881o();
                        aVar2.m2900a(c0759b2);
                        constraintLayout.addView(barrier2, c0759b2);
                    }
                    if (bVar2.f5430a) {
                        View guideline = new Guideline(constraintLayout.getContext());
                        guideline.setId(num.intValue());
                        C5882e c5882e2 = ConstraintLayout.f5270K;
                        ConstraintLayout.C0759b c0759b3 = new ConstraintLayout.C0759b();
                        aVar2.m2900a(c0759b3);
                        constraintLayout.addView(guideline, c0759b3);
                    }
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof AbstractC0761a) {
                ((AbstractC0761a) childAt2).mo2878i(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2893e(ConstraintLayout constraintLayout) {
        int i10;
        int i11;
        C0762b c0762b = this;
        int childCount = constraintLayout.getChildCount();
        HashMap<Integer, a> map = c0762b.f5382f;
        map.clear();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = constraintLayout.getChildAt(i12);
            ConstraintLayout.C0759b c0759b = (ConstraintLayout.C0759b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (c0762b.f5381e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new a());
            }
            a aVar = map.get(Integer.valueOf(id2));
            if (aVar == null) {
                i10 = childCount;
            } else {
                HashMap<String, ConstraintAttribute> map2 = c0762b.f5380d;
                HashMap<String, ConstraintAttribute> map3 = new HashMap<>();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    ConstraintAttribute constraintAttribute = map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new ConstraintAttribute(constraintAttribute, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            i11 = childCount;
                            try {
                                map3.put(str, new ConstraintAttribute(constraintAttribute, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                            childCount = i11;
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        i11 = childCount;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        i11 = childCount;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        i11 = childCount;
                    }
                }
                i10 = childCount;
                aVar.f5389g = map3;
                aVar.m2902c(id2, c0759b);
                int visibility = childAt.getVisibility();
                d dVar = aVar.f5385c;
                dVar.f5487b = visibility;
                dVar.f5489d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                e eVar = aVar.f5388f;
                eVar.f5493b = rotation;
                eVar.f5494c = childAt.getRotationX();
                eVar.f5495d = childAt.getRotationY();
                eVar.f5496e = childAt.getScaleX();
                eVar.f5497f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    eVar.f5498g = pivotX;
                    eVar.f5499h = pivotY;
                }
                eVar.f5501j = childAt.getTranslationX();
                eVar.f5502k = childAt.getTranslationY();
                eVar.f5503l = childAt.getTranslationZ();
                if (eVar.f5504m) {
                    eVar.f5505n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    b bVar = aVar.f5387e;
                    bVar.f5459o0 = allowsGoneWidget;
                    bVar.f5449j0 = barrier.getReferencedIds();
                    bVar.f5443g0 = barrier.getType();
                    bVar.f5445h0 = barrier.getMargin();
                }
            }
            i12++;
            c0762b = this;
            childCount = i10;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 5, instructions: 5 */
    /* JADX INFO: renamed from: f */
    public final void m2894f(int i10, int i11) {
        HashMap<Integer, a> map = this.f5382f;
        Integer numValueOf = Integer.valueOf(R.id.tvLanguage);
        if (!map.containsKey(numValueOf)) {
            map.put(numValueOf, new a());
        }
        a aVar = map.get(numValueOf);
        if (aVar == null) {
            return;
        }
        b bVar = aVar.f5387e;
        switch (i10) {
            case 1:
                if (i11 == 1) {
                    bVar.f5446i = R.id.viewFlag;
                    bVar.f5448j = -1;
                    return;
                } else if (i11 == 2) {
                    bVar.f5448j = R.id.viewFlag;
                    bVar.f5446i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m2889r(i11) + " undefined");
                }
            case 2:
                if (i11 == 1) {
                    bVar.f5450k = R.id.viewFlag;
                    bVar.f5452l = -1;
                    return;
                } else if (i11 == 2) {
                    bVar.f5452l = R.id.viewFlag;
                    bVar.f5450k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
            case 3:
                if (i11 == 3) {
                    bVar.f5454m = R.id.viewFlag;
                    bVar.f5456n = -1;
                    bVar.f5462q = -1;
                    bVar.f5463r = -1;
                    bVar.f5464s = -1;
                    return;
                }
                if (i11 != 4) {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
                bVar.f5456n = R.id.viewFlag;
                bVar.f5454m = -1;
                bVar.f5462q = -1;
                bVar.f5463r = -1;
                bVar.f5464s = -1;
                return;
            case 4:
                if (i11 == 4) {
                    bVar.f5460p = R.id.viewFlag;
                    bVar.f5458o = -1;
                    bVar.f5462q = -1;
                    bVar.f5463r = -1;
                    bVar.f5464s = -1;
                    return;
                }
                if (i11 != 3) {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
                bVar.f5458o = R.id.viewFlag;
                bVar.f5460p = -1;
                bVar.f5462q = -1;
                bVar.f5463r = -1;
                bVar.f5464s = -1;
                return;
            case 5:
                if (i11 == 5) {
                    bVar.f5462q = R.id.viewFlag;
                    bVar.f5460p = -1;
                    bVar.f5458o = -1;
                    bVar.f5454m = -1;
                    bVar.f5456n = -1;
                    return;
                }
                if (i11 == 3) {
                    bVar.f5463r = R.id.viewFlag;
                    bVar.f5460p = -1;
                    bVar.f5458o = -1;
                    bVar.f5454m = -1;
                    bVar.f5456n = -1;
                    return;
                }
                if (i11 != 4) {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
                bVar.f5464s = R.id.viewFlag;
                bVar.f5460p = -1;
                bVar.f5458o = -1;
                bVar.f5454m = -1;
                bVar.f5456n = -1;
                return;
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                if (i11 == 6) {
                    bVar.f5466u = R.id.viewFlag;
                    bVar.f5465t = -1;
                    return;
                } else if (i11 == 7) {
                    bVar.f5465t = R.id.viewFlag;
                    bVar.f5466u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                if (i11 == 7) {
                    bVar.f5468w = R.id.viewFlag;
                    bVar.f5467v = -1;
                    return;
                } else if (i11 == 6) {
                    bVar.f5467v = R.id.viewFlag;
                    bVar.f5468w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m2889r(i11) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m2889r(i10) + " to " + m2889r(i11) + " unknown");
        }
    }

    /* JADX INFO: renamed from: i */
    public final a m2895i(int i10) {
        HashMap<Integer, a> map = this.f5382f;
        if (!map.containsKey(Integer.valueOf(i10))) {
            map.put(Integer.valueOf(i10), new a());
        }
        return map.get(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: j */
    public final a m2896j(int i10) {
        HashMap<Integer, a> map = this.f5382f;
        if (map.containsKey(Integer.valueOf(i10))) {
            return map.get(Integer.valueOf(i10));
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m2897k(int i10, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarM2884h = m2884h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarM2884h.f5387e.f5430a = true;
                    }
                    this.f5382f.put(Integer.valueOf(aVarM2884h.f5383a), aVarM2884h);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0065 A[PHI: r4
      0x0065: PHI (r4v16 byte) = (r4v0 byte), (r4v13 byte), (r4v0 byte), (r4v0 byte), (r4v0 byte) binds: [B:26:0x0061, B:27:0x0063, B:23:0x0055, B:20:0x0049, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:71:0x0112 A[PHI: r4
      0x0112: PHI (r4v10 byte) = 
      (r4v0 byte)
      (r4v1 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
      (r4v0 byte)
     binds: [B:69:0x010e, B:70:0x0110, B:66:0x0101, B:63:0x00f4, B:60:0x00e6, B:57:0x00db, B:54:0x00ce, B:51:0x00be, B:48:0x00b2, B:45:0x00a3, B:42:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0031. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: l */
    public final void m2898l(Context context, XmlResourceParser xmlResourceParser) {
        a aVarM2884h;
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            aVarM2884h = m2884h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            aVarM2884h = m2884h(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            aVarM2884h = m2884h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            b bVar = aVarM2884h.f5387e;
                            bVar.f5430a = true;
                            bVar.f5432b = true;
                            break;
                        case "Barrier":
                            aVarM2884h = m2884h(context, Xml.asAttributeSet(xmlResourceParser), false);
                            aVarM2884h.f5387e.f5447i0 = 1;
                            break;
                        case "PropertySet":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVar.f5385c.m2913a(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Transform":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVar.f5388f.m2915b(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Layout":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVar.f5387e.m2910b(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "Motion":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            aVar.f5386d.m2912b(context, Xml.asAttributeSet(xmlResourceParser));
                            continue;
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (aVar == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            ConstraintAttribute.m2856d(context, xmlResourceParser, aVar.f5389g);
                            continue;
                            break;
                            break;
                        default:
                            continue;
                            break;
                    }
                    aVar = aVarM2884h;
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (!lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (!lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (!lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f5382f.put(Integer.valueOf(aVar.f5383a), aVar);
                        aVar = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2899q(int i10, int i11) {
        m2895i(i10).f5387e.f5412I = i11;
    }
}
