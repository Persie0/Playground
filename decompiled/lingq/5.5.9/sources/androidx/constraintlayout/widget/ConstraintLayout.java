package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.widgets.C0730a;
import androidx.constraintlayout.core.widgets.C0738d;
import androidx.constraintlayout.core.widgets.C0740f;
import androidx.constraintlayout.core.widgets.C0741g;
import androidx.constraintlayout.core.widgets.C0743i;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C0734c;
import androidx.constraintlayout.core.widgets.analyzer.C0735d;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.datastore.preferences.PreferencesProto$Value;
import com.kochava.tracker.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p061d2.C5039b;
import p061d2.C5040c;
import p061d2.InterfaceC5038a;
import p083e2.C5354b;
import p083e2.C5355c;
import p083e2.C5357e;
import p083e2.C5360h;
import p143h2.AbstractC5879b;
import p143h2.AbstractC5884g;
import p143h2.C5878a;
import p143h2.C5881d;
import p143h2.C5882e;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: K */
    public static C5882e f5270K;

    /* JADX INFO: renamed from: H */
    public HashMap<String, Integer> f5271H;

    /* JADX INFO: renamed from: I */
    public final SparseArray<ConstraintWidget> f5272I;

    /* JADX INFO: renamed from: J */
    public final C0760c f5273J;

    /* JADX INFO: renamed from: a */
    public final SparseArray<View> f5274a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<AbstractC0761a> f5275b;

    /* JADX INFO: renamed from: c */
    public final C0738d f5276c;

    /* JADX INFO: renamed from: d */
    public int f5277d;

    /* JADX INFO: renamed from: e */
    public int f5278e;

    /* JADX INFO: renamed from: f */
    public int f5279f;

    /* JADX INFO: renamed from: g */
    public int f5280g;

    /* JADX INFO: renamed from: h */
    public boolean f5281h;

    /* JADX INFO: renamed from: i */
    public int f5282i;

    /* JADX INFO: renamed from: j */
    public C0762b f5283j;

    /* JADX INFO: renamed from: k */
    public C5878a f5284k;

    /* JADX INFO: renamed from: l */
    public int f5285l;

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C0758a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f5286a;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            f5286a = iArr;
            try {
                iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5286a[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5286a[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5286a[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C0759b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A */
        public int f5287A;

        /* JADX INFO: renamed from: B */
        public int f5288B;

        /* JADX INFO: renamed from: C */
        public final int f5289C;

        /* JADX INFO: renamed from: D */
        public final int f5290D;

        /* JADX INFO: renamed from: E */
        public float f5291E;

        /* JADX INFO: renamed from: F */
        public float f5292F;

        /* JADX INFO: renamed from: G */
        public String f5293G;

        /* JADX INFO: renamed from: H */
        public float f5294H;

        /* JADX INFO: renamed from: I */
        public float f5295I;

        /* JADX INFO: renamed from: J */
        public int f5296J;

        /* JADX INFO: renamed from: K */
        public int f5297K;

        /* JADX INFO: renamed from: L */
        public int f5298L;

        /* JADX INFO: renamed from: M */
        public int f5299M;

        /* JADX INFO: renamed from: N */
        public int f5300N;

        /* JADX INFO: renamed from: O */
        public int f5301O;

        /* JADX INFO: renamed from: P */
        public int f5302P;

        /* JADX INFO: renamed from: Q */
        public int f5303Q;

        /* JADX INFO: renamed from: R */
        public float f5304R;

        /* JADX INFO: renamed from: S */
        public float f5305S;

        /* JADX INFO: renamed from: T */
        public int f5306T;

        /* JADX INFO: renamed from: U */
        public int f5307U;

        /* JADX INFO: renamed from: V */
        public int f5308V;

        /* JADX INFO: renamed from: W */
        public boolean f5309W;

        /* JADX INFO: renamed from: X */
        public boolean f5310X;

        /* JADX INFO: renamed from: Y */
        public String f5311Y;

        /* JADX INFO: renamed from: Z */
        public int f5312Z;

        /* JADX INFO: renamed from: a */
        public int f5313a;

        /* JADX INFO: renamed from: a0 */
        public boolean f5314a0;

        /* JADX INFO: renamed from: b */
        public int f5315b;

        /* JADX INFO: renamed from: b0 */
        public boolean f5316b0;

        /* JADX INFO: renamed from: c */
        public float f5317c;

        /* JADX INFO: renamed from: c0 */
        public boolean f5318c0;

        /* JADX INFO: renamed from: d */
        public final boolean f5319d;

        /* JADX INFO: renamed from: d0 */
        public boolean f5320d0;

        /* JADX INFO: renamed from: e */
        public int f5321e;

        /* JADX INFO: renamed from: e0 */
        public boolean f5322e0;

        /* JADX INFO: renamed from: f */
        public int f5323f;

        /* JADX INFO: renamed from: f0 */
        public boolean f5324f0;

        /* JADX INFO: renamed from: g */
        public int f5325g;

        /* JADX INFO: renamed from: g0 */
        public int f5326g0;

        /* JADX INFO: renamed from: h */
        public int f5327h;

        /* JADX INFO: renamed from: h0 */
        public int f5328h0;

        /* JADX INFO: renamed from: i */
        public int f5329i;

        /* JADX INFO: renamed from: i0 */
        public int f5330i0;

        /* JADX INFO: renamed from: j */
        public int f5331j;

        /* JADX INFO: renamed from: j0 */
        public int f5332j0;

        /* JADX INFO: renamed from: k */
        public int f5333k;

        /* JADX INFO: renamed from: k0 */
        public int f5334k0;

        /* JADX INFO: renamed from: l */
        public int f5335l;

        /* JADX INFO: renamed from: l0 */
        public int f5336l0;

        /* JADX INFO: renamed from: m */
        public int f5337m;

        /* JADX INFO: renamed from: m0 */
        public float f5338m0;

        /* JADX INFO: renamed from: n */
        public int f5339n;

        /* JADX INFO: renamed from: n0 */
        public int f5340n0;

        /* JADX INFO: renamed from: o */
        public int f5341o;

        /* JADX INFO: renamed from: o0 */
        public int f5342o0;

        /* JADX INFO: renamed from: p */
        public int f5343p;

        /* JADX INFO: renamed from: p0 */
        public float f5344p0;

        /* JADX INFO: renamed from: q */
        public int f5345q;

        /* JADX INFO: renamed from: q0 */
        public ConstraintWidget f5346q0;

        /* JADX INFO: renamed from: r */
        public float f5347r;

        /* JADX INFO: renamed from: s */
        public int f5348s;

        /* JADX INFO: renamed from: t */
        public int f5349t;

        /* JADX INFO: renamed from: u */
        public int f5350u;

        /* JADX INFO: renamed from: v */
        public int f5351v;

        /* JADX INFO: renamed from: w */
        public final int f5352w;

        /* JADX INFO: renamed from: x */
        public int f5353x;

        /* JADX INFO: renamed from: y */
        public final int f5354y;

        /* JADX INFO: renamed from: z */
        public int f5355z;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            public static final SparseIntArray f5356a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f5356a = sparseIntArray;
                sparseIntArray.append(98, 64);
                sparseIntArray.append(75, 65);
                sparseIntArray.append(84, 8);
                sparseIntArray.append(85, 9);
                sparseIntArray.append(87, 10);
                sparseIntArray.append(88, 11);
                sparseIntArray.append(94, 12);
                sparseIntArray.append(93, 13);
                sparseIntArray.append(65, 14);
                sparseIntArray.append(64, 15);
                sparseIntArray.append(60, 16);
                sparseIntArray.append(62, 52);
                sparseIntArray.append(61, 53);
                sparseIntArray.append(66, 2);
                sparseIntArray.append(68, 3);
                sparseIntArray.append(67, 4);
                sparseIntArray.append(103, 49);
                sparseIntArray.append(104, 50);
                sparseIntArray.append(72, 5);
                sparseIntArray.append(73, 6);
                sparseIntArray.append(74, 7);
                sparseIntArray.append(55, 67);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(89, 17);
                sparseIntArray.append(90, 18);
                sparseIntArray.append(71, 19);
                sparseIntArray.append(70, 20);
                sparseIntArray.append(108, 21);
                sparseIntArray.append(111, 22);
                sparseIntArray.append(109, 23);
                sparseIntArray.append(106, 24);
                sparseIntArray.append(110, 25);
                sparseIntArray.append(107, 26);
                sparseIntArray.append(105, 55);
                sparseIntArray.append(112, 54);
                sparseIntArray.append(80, 29);
                sparseIntArray.append(95, 30);
                sparseIntArray.append(69, 44);
                sparseIntArray.append(82, 45);
                sparseIntArray.append(97, 46);
                sparseIntArray.append(81, 47);
                sparseIntArray.append(96, 48);
                sparseIntArray.append(58, 27);
                sparseIntArray.append(57, 28);
                sparseIntArray.append(99, 31);
                sparseIntArray.append(76, 32);
                sparseIntArray.append(101, 33);
                sparseIntArray.append(100, 34);
                sparseIntArray.append(102, 35);
                sparseIntArray.append(78, 36);
                sparseIntArray.append(77, 37);
                sparseIntArray.append(79, 38);
                sparseIntArray.append(83, 39);
                sparseIntArray.append(92, 40);
                sparseIntArray.append(86, 41);
                sparseIntArray.append(63, 42);
                sparseIntArray.append(59, 43);
                sparseIntArray.append(91, 51);
                sparseIntArray.append(114, 66);
            }
        }

        public C0759b() {
            super(-2, -2);
            this.f5313a = -1;
            this.f5315b = -1;
            this.f5317c = -1.0f;
            this.f5319d = true;
            this.f5321e = -1;
            this.f5323f = -1;
            this.f5325g = -1;
            this.f5327h = -1;
            this.f5329i = -1;
            this.f5331j = -1;
            this.f5333k = -1;
            this.f5335l = -1;
            this.f5337m = -1;
            this.f5339n = -1;
            this.f5341o = -1;
            this.f5343p = -1;
            this.f5345q = 0;
            this.f5347r = 0.0f;
            this.f5348s = -1;
            this.f5349t = -1;
            this.f5350u = -1;
            this.f5351v = -1;
            this.f5352w = Integer.MIN_VALUE;
            this.f5353x = Integer.MIN_VALUE;
            this.f5354y = Integer.MIN_VALUE;
            this.f5355z = Integer.MIN_VALUE;
            this.f5287A = Integer.MIN_VALUE;
            this.f5288B = Integer.MIN_VALUE;
            this.f5289C = Integer.MIN_VALUE;
            this.f5290D = 0;
            this.f5291E = 0.5f;
            this.f5292F = 0.5f;
            this.f5293G = null;
            this.f5294H = -1.0f;
            this.f5295I = -1.0f;
            this.f5296J = 0;
            this.f5297K = 0;
            this.f5298L = 0;
            this.f5299M = 0;
            this.f5300N = 0;
            this.f5301O = 0;
            this.f5302P = 0;
            this.f5303Q = 0;
            this.f5304R = 1.0f;
            this.f5305S = 1.0f;
            this.f5306T = -1;
            this.f5307U = -1;
            this.f5308V = -1;
            this.f5309W = false;
            this.f5310X = false;
            this.f5311Y = null;
            this.f5312Z = 0;
            this.f5314a0 = true;
            this.f5316b0 = true;
            this.f5318c0 = false;
            this.f5320d0 = false;
            this.f5322e0 = false;
            this.f5324f0 = false;
            this.f5326g0 = -1;
            this.f5328h0 = -1;
            this.f5330i0 = -1;
            this.f5332j0 = -1;
            this.f5334k0 = Integer.MIN_VALUE;
            this.f5336l0 = Integer.MIN_VALUE;
            this.f5338m0 = 0.5f;
            this.f5346q0 = new ConstraintWidget();
        }

        /* JADX WARN: Code duplicated, block: B:120:0x0449  */
        public C0759b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5313a = -1;
            this.f5315b = -1;
            this.f5317c = -1.0f;
            this.f5319d = true;
            this.f5321e = -1;
            this.f5323f = -1;
            this.f5325g = -1;
            this.f5327h = -1;
            this.f5329i = -1;
            this.f5331j = -1;
            this.f5333k = -1;
            this.f5335l = -1;
            this.f5337m = -1;
            this.f5339n = -1;
            this.f5341o = -1;
            this.f5343p = -1;
            this.f5345q = 0;
            this.f5347r = 0.0f;
            this.f5348s = -1;
            this.f5349t = -1;
            this.f5350u = -1;
            this.f5351v = -1;
            this.f5352w = Integer.MIN_VALUE;
            this.f5353x = Integer.MIN_VALUE;
            this.f5354y = Integer.MIN_VALUE;
            this.f5355z = Integer.MIN_VALUE;
            this.f5287A = Integer.MIN_VALUE;
            this.f5288B = Integer.MIN_VALUE;
            this.f5289C = Integer.MIN_VALUE;
            this.f5290D = 0;
            this.f5291E = 0.5f;
            this.f5292F = 0.5f;
            this.f5293G = null;
            this.f5294H = -1.0f;
            this.f5295I = -1.0f;
            this.f5296J = 0;
            this.f5297K = 0;
            this.f5298L = 0;
            this.f5299M = 0;
            this.f5300N = 0;
            this.f5301O = 0;
            this.f5302P = 0;
            this.f5303Q = 0;
            this.f5304R = 1.0f;
            this.f5305S = 1.0f;
            this.f5306T = -1;
            this.f5307U = -1;
            this.f5308V = -1;
            this.f5309W = false;
            this.f5310X = false;
            this.f5311Y = null;
            this.f5312Z = 0;
            this.f5314a0 = true;
            this.f5316b0 = true;
            this.f5318c0 = false;
            this.f5320d0 = false;
            this.f5322e0 = false;
            this.f5324f0 = false;
            this.f5326g0 = -1;
            this.f5328h0 = -1;
            this.f5330i0 = -1;
            this.f5332j0 = -1;
            this.f5334k0 = Integer.MIN_VALUE;
            this.f5336l0 = Integer.MIN_VALUE;
            this.f5338m0 = 0.5f;
            this.f5346q0 = new ConstraintWidget();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5881d.f35168b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = a.f5356a.get(index);
                switch (i11) {
                    case 1:
                        this.f5308V = typedArrayObtainStyledAttributes.getInt(index, this.f5308V);
                        continue;
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f5343p);
                        this.f5343p = resourceId;
                        if (resourceId == -1) {
                            this.f5343p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f5345q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5345q);
                        continue;
                        break;
                    case 4:
                        float f3 = typedArrayObtainStyledAttributes.getFloat(index, this.f5347r) % 360.0f;
                        this.f5347r = f3;
                        if (f3 < 0.0f) {
                            this.f5347r = (360.0f - f3) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f5313a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5313a);
                        continue;
                        break;
                    case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                        this.f5315b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5315b);
                        continue;
                        break;
                    case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                        this.f5317c = typedArrayObtainStyledAttributes.getFloat(index, this.f5317c);
                        continue;
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5321e);
                        this.f5321e = resourceId2;
                        if (resourceId2 == -1) {
                            this.f5321e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5323f);
                        this.f5323f = resourceId3;
                        if (resourceId3 == -1) {
                            this.f5323f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5325g);
                        this.f5325g = resourceId4;
                        if (resourceId4 == -1) {
                            this.f5325g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5327h);
                        this.f5327h = resourceId5;
                        if (resourceId5 == -1) {
                            this.f5327h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5329i);
                        this.f5329i = resourceId6;
                        if (resourceId6 == -1) {
                            this.f5329i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5331j);
                        this.f5331j = resourceId7;
                        if (resourceId7 == -1) {
                            this.f5331j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5333k);
                        this.f5333k = resourceId8;
                        if (resourceId8 == -1) {
                            this.f5333k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5335l);
                        this.f5335l = resourceId9;
                        if (resourceId9 == -1) {
                            this.f5335l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5337m);
                        this.f5337m = resourceId10;
                        if (resourceId10 == -1) {
                            this.f5337m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5348s);
                        this.f5348s = resourceId11;
                        if (resourceId11 == -1) {
                            this.f5348s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5349t);
                        this.f5349t = resourceId12;
                        if (resourceId12 == -1) {
                            this.f5349t = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5350u);
                        this.f5350u = resourceId13;
                        if (resourceId13 == -1) {
                            this.f5350u = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5351v);
                        this.f5351v = resourceId14;
                        if (resourceId14 == -1) {
                            this.f5351v = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f5352w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5352w);
                        continue;
                        break;
                    case 22:
                        this.f5353x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5353x);
                        continue;
                        break;
                    case 23:
                        this.f5354y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5354y);
                        continue;
                        break;
                    case 24:
                        this.f5355z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5355z);
                        continue;
                        break;
                    case 25:
                        this.f5287A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5287A);
                        continue;
                        break;
                    case 26:
                        this.f5288B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5288B);
                        continue;
                        break;
                    case 27:
                        this.f5309W = typedArrayObtainStyledAttributes.getBoolean(index, this.f5309W);
                        continue;
                        break;
                    case 28:
                        this.f5310X = typedArrayObtainStyledAttributes.getBoolean(index, this.f5310X);
                        continue;
                        break;
                    case 29:
                        this.f5291E = typedArrayObtainStyledAttributes.getFloat(index, this.f5291E);
                        continue;
                        break;
                    case 30:
                        this.f5292F = typedArrayObtainStyledAttributes.getFloat(index, this.f5292F);
                        continue;
                        break;
                    case 31:
                        int i12 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f5298L = i12;
                        if (i12 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f5299M = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f5300N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5300N);
                            continue;
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f5300N) == -2) {
                                this.f5300N = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f5302P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5302P);
                            continue;
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f5302P) == -2) {
                                this.f5302P = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f5304R = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f5304R));
                        this.f5298L = 2;
                        continue;
                        break;
                    case 36:
                        try {
                            this.f5301O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5301O);
                            continue;
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f5301O) == -2) {
                                this.f5301O = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f5303Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5303Q);
                            continue;
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f5303Q) == -2) {
                                this.f5303Q = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f5305S = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f5305S));
                        this.f5299M = 2;
                        continue;
                        break;
                    default:
                        switch (i11) {
                            case 44:
                                C0762b.m2887o(this, typedArrayObtainStyledAttributes.getString(index));
                                continue;
                                break;
                            case 45:
                                this.f5294H = typedArrayObtainStyledAttributes.getFloat(index, this.f5294H);
                                continue;
                                break;
                            case 46:
                                this.f5295I = typedArrayObtainStyledAttributes.getFloat(index, this.f5295I);
                                continue;
                                break;
                            case 47:
                                this.f5296J = typedArrayObtainStyledAttributes.getInt(index, 0);
                                continue;
                                break;
                            case 48:
                                this.f5297K = typedArrayObtainStyledAttributes.getInt(index, 0);
                                continue;
                                break;
                            case 49:
                                this.f5306T = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5306T);
                                continue;
                                break;
                            case 50:
                                this.f5307U = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5307U);
                                continue;
                                break;
                            case 51:
                                this.f5311Y = typedArrayObtainStyledAttributes.getString(index);
                                continue;
                                break;
                            case 52:
                                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5339n);
                                this.f5339n = resourceId15;
                                if (resourceId15 == -1) {
                                    this.f5339n = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 53:
                                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(index, this.f5341o);
                                this.f5341o = resourceId16;
                                if (resourceId16 == -1) {
                                    this.f5341o = typedArrayObtainStyledAttributes.getInt(index, -1);
                                }
                                break;
                            case 54:
                                this.f5290D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5290D);
                                continue;
                                break;
                            case 55:
                                this.f5289C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f5289C);
                                continue;
                                break;
                            default:
                                switch (i11) {
                                    case 64:
                                        C0762b.m2886n(this, typedArrayObtainStyledAttributes, index, 0);
                                        break;
                                    case 65:
                                        C0762b.m2886n(this, typedArrayObtainStyledAttributes, index, 1);
                                        continue;
                                        break;
                                    case 66:
                                        this.f5312Z = typedArrayObtainStyledAttributes.getInt(index, this.f5312Z);
                                        continue;
                                        break;
                                    case 67:
                                        this.f5319d = typedArrayObtainStyledAttributes.getBoolean(index, this.f5319d);
                                        continue;
                                        break;
                                    default:
                                        continue;
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            m2871a();
        }

        public C0759b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5313a = -1;
            this.f5315b = -1;
            this.f5317c = -1.0f;
            this.f5319d = true;
            this.f5321e = -1;
            this.f5323f = -1;
            this.f5325g = -1;
            this.f5327h = -1;
            this.f5329i = -1;
            this.f5331j = -1;
            this.f5333k = -1;
            this.f5335l = -1;
            this.f5337m = -1;
            this.f5339n = -1;
            this.f5341o = -1;
            this.f5343p = -1;
            this.f5345q = 0;
            this.f5347r = 0.0f;
            this.f5348s = -1;
            this.f5349t = -1;
            this.f5350u = -1;
            this.f5351v = -1;
            this.f5352w = Integer.MIN_VALUE;
            this.f5353x = Integer.MIN_VALUE;
            this.f5354y = Integer.MIN_VALUE;
            this.f5355z = Integer.MIN_VALUE;
            this.f5287A = Integer.MIN_VALUE;
            this.f5288B = Integer.MIN_VALUE;
            this.f5289C = Integer.MIN_VALUE;
            this.f5290D = 0;
            this.f5291E = 0.5f;
            this.f5292F = 0.5f;
            this.f5293G = null;
            this.f5294H = -1.0f;
            this.f5295I = -1.0f;
            this.f5296J = 0;
            this.f5297K = 0;
            this.f5298L = 0;
            this.f5299M = 0;
            this.f5300N = 0;
            this.f5301O = 0;
            this.f5302P = 0;
            this.f5303Q = 0;
            this.f5304R = 1.0f;
            this.f5305S = 1.0f;
            this.f5306T = -1;
            this.f5307U = -1;
            this.f5308V = -1;
            this.f5309W = false;
            this.f5310X = false;
            this.f5311Y = null;
            this.f5312Z = 0;
            this.f5314a0 = true;
            this.f5316b0 = true;
            this.f5318c0 = false;
            this.f5320d0 = false;
            this.f5322e0 = false;
            this.f5324f0 = false;
            this.f5326g0 = -1;
            this.f5328h0 = -1;
            this.f5330i0 = -1;
            this.f5332j0 = -1;
            this.f5334k0 = Integer.MIN_VALUE;
            this.f5336l0 = Integer.MIN_VALUE;
            this.f5338m0 = 0.5f;
            this.f5346q0 = new ConstraintWidget();
        }

        /* JADX INFO: renamed from: a */
        public final void m2871a() {
            this.f5320d0 = false;
            this.f5314a0 = true;
            this.f5316b0 = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f5309W) {
                this.f5314a0 = false;
                if (this.f5298L == 0) {
                    this.f5298L = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f5310X) {
                this.f5316b0 = false;
                if (this.f5299M == 0) {
                    this.f5299M = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f5314a0 = false;
                if (i10 == 0 && this.f5298L == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f5309W = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f5316b0 = false;
                if (i11 == 0 && this.f5299M == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f5310X = true;
                }
            }
            if (this.f5317c == -1.0f && this.f5313a == -1 && this.f5315b == -1) {
                return;
            }
            this.f5320d0 = true;
            this.f5314a0 = true;
            this.f5316b0 = true;
            if (!(this.f5346q0 instanceof C0740f)) {
                this.f5346q0 = new C0740f();
            }
            ((C0740f) this.f5346q0).m2779V(this.f5308V);
        }

        /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:17:0x005a  */
        /* JADX WARN: Code duplicated, block: B:20:0x0065  */
        /* JADX WARN: Code duplicated, block: B:23:0x006e  */
        /* JADX WARN: Code duplicated, block: B:26:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x007e  */
        /* JADX WARN: Code duplicated, block: B:38:0x009a  */
        /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
        /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
        /* JADX WARN: Code duplicated, block: B:42:0x00b4 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:87:0x0132  */
        /* JADX WARN: Code duplicated, block: B:91:0x013f  */
        /* JADX WARN: Code duplicated, block: B:93:0x0144  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        @TargetApi(17)
        public final void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i18 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f5330i0 = -1;
            this.f5332j0 = -1;
            this.f5326g0 = -1;
            this.f5328h0 = -1;
            this.f5334k0 = this.f5352w;
            this.f5336l0 = this.f5354y;
            float f3 = this.f5291E;
            this.f5338m0 = f3;
            int i19 = this.f5313a;
            this.f5340n0 = i19;
            int i20 = this.f5315b;
            this.f5342o0 = i20;
            float f10 = this.f5317c;
            this.f5344p0 = f10;
            if (z11) {
                int i21 = this.f5348s;
                if (i21 != -1) {
                    this.f5330i0 = i21;
                } else {
                    int i22 = this.f5349t;
                    if (i22 != -1) {
                        this.f5332j0 = i22;
                    } else {
                        i13 = this.f5350u;
                        if (i13 != -1) {
                            this.f5328h0 = i13;
                            z10 = true;
                        }
                        i14 = this.f5351v;
                        if (i14 != -1) {
                            this.f5326g0 = i14;
                            z10 = true;
                        }
                        i15 = this.f5287A;
                        if (i15 != Integer.MIN_VALUE) {
                            this.f5336l0 = i15;
                        }
                        i16 = this.f5288B;
                        if (i16 != Integer.MIN_VALUE) {
                            this.f5334k0 = i16;
                        }
                        if (z10) {
                            this.f5338m0 = 1.0f - f3;
                        }
                        if (this.f5320d0 && this.f5308V == 1 && this.f5319d) {
                            if (f10 != -1.0f) {
                                this.f5344p0 = 1.0f - f10;
                                this.f5340n0 = -1;
                                this.f5342o0 = -1;
                            } else if (i19 != -1) {
                                this.f5342o0 = i19;
                                this.f5340n0 = -1;
                                this.f5344p0 = -1.0f;
                            } else if (i20 != -1) {
                                this.f5340n0 = i20;
                                this.f5342o0 = -1;
                                this.f5344p0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i13 = this.f5350u;
                if (i13 != -1) {
                    this.f5328h0 = i13;
                    z10 = true;
                }
                i14 = this.f5351v;
                if (i14 != -1) {
                    this.f5326g0 = i14;
                    z10 = true;
                }
                i15 = this.f5287A;
                if (i15 != Integer.MIN_VALUE) {
                    this.f5336l0 = i15;
                }
                i16 = this.f5288B;
                if (i16 != Integer.MIN_VALUE) {
                    this.f5334k0 = i16;
                }
                if (z10) {
                    this.f5338m0 = 1.0f - f3;
                }
                if (this.f5320d0) {
                    if (f10 != -1.0f) {
                        this.f5344p0 = 1.0f - f10;
                        this.f5340n0 = -1;
                        this.f5342o0 = -1;
                    } else if (i19 != -1) {
                        this.f5342o0 = i19;
                        this.f5340n0 = -1;
                        this.f5344p0 = -1.0f;
                    } else if (i20 != -1) {
                        this.f5340n0 = i20;
                        this.f5342o0 = -1;
                        this.f5344p0 = -1.0f;
                    }
                }
            } else {
                int i23 = this.f5348s;
                if (i23 != -1) {
                    this.f5328h0 = i23;
                }
                int i24 = this.f5349t;
                if (i24 != -1) {
                    this.f5326g0 = i24;
                }
                int i25 = this.f5350u;
                if (i25 != -1) {
                    this.f5330i0 = i25;
                }
                int i26 = this.f5351v;
                if (i26 != -1) {
                    this.f5332j0 = i26;
                }
                int i27 = this.f5287A;
                if (i27 != Integer.MIN_VALUE) {
                    this.f5334k0 = i27;
                }
                int i28 = this.f5288B;
                if (i28 != Integer.MIN_VALUE) {
                    this.f5336l0 = i28;
                }
            }
            if (this.f5350u == -1 && this.f5351v == -1 && this.f5349t == -1 && this.f5348s == -1) {
                int i29 = this.f5325g;
                if (i29 != -1) {
                    this.f5330i0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i18 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i18;
                    }
                    i11 = this.f5321e;
                    if (i11 != -1) {
                        this.f5326g0 = i11;
                        if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 || i17 <= 0) {
                        }
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i17;
                        return;
                    }
                    i12 = this.f5323f;
                    if (i12 != -1) {
                        this.f5328h0 = i12;
                        if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0 || i17 <= 0) {
                        }
                        ((ViewGroup.MarginLayoutParams) this).leftMargin = i17;
                        return;
                    }
                }
                int i30 = this.f5327h;
                if (i30 != -1) {
                    this.f5332j0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i18 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i18;
                    }
                }
                i11 = this.f5321e;
                if (i11 != -1) {
                    this.f5326g0 = i11;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0) {
                    }
                } else {
                    i12 = this.f5323f;
                    if (i12 != -1) {
                        this.f5328h0 = i12;
                        if (((ViewGroup.MarginLayoutParams) this).leftMargin <= 0) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    public class C0760c implements C5354b.b {

        /* JADX INFO: renamed from: a */
        public final ConstraintLayout f5357a;

        /* JADX INFO: renamed from: b */
        public int f5358b;

        /* JADX INFO: renamed from: c */
        public int f5359c;

        /* JADX INFO: renamed from: d */
        public int f5360d;

        /* JADX INFO: renamed from: e */
        public int f5361e;

        /* JADX INFO: renamed from: f */
        public int f5362f;

        /* JADX INFO: renamed from: g */
        public int f5363g;

        public C0760c(ConstraintLayout constraintLayout) {
            this.f5357a = constraintLayout;
        }

        /* JADX INFO: renamed from: a */
        public static boolean m2872a(int i10, int i11, int i12) {
            if (i10 == i11) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i10);
            View.MeasureSpec.getSize(i10);
            return View.MeasureSpec.getMode(i11) == 1073741824 && (mode == Integer.MIN_VALUE || mode == 0) && i12 == View.MeasureSpec.getSize(i11);
        }

        @SuppressLint({"WrongCall"})
        /* JADX INFO: renamed from: b */
        public final void m2873b(ConstraintWidget constraintWidget, C5354b.a aVar) {
            int iMakeMeasureSpec;
            int iMakeMeasureSpec2;
            int iMax;
            int iMax2;
            int i10;
            boolean z10;
            int baseline;
            int i11;
            int childMeasureSpec;
            if (constraintWidget == null) {
                return;
            }
            if (constraintWidget.f4881j0 == 8 && !constraintWidget.f4842G) {
                aVar.f33665e = 0;
                aVar.f33666f = 0;
                aVar.f33667g = 0;
                return;
            }
            if (constraintWidget.f4858W == null) {
                return;
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f33661a;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar.f33662b;
            int i12 = aVar.f33663c;
            int i13 = aVar.f33664d;
            int i14 = this.f5358b + this.f5359c;
            int i15 = this.f5360d;
            View view = (View) constraintWidget.f4879i0;
            int[] iArr = C0758a.f5286a;
            int i16 = iArr[dimensionBehaviour.ordinal()];
            ConstraintAnchor constraintAnchor = constraintWidget.f4848M;
            ConstraintAnchor constraintAnchor2 = constraintWidget.f4846K;
            if (i16 != 1) {
                if (i16 == 2) {
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5362f, i15, -2);
                } else if (i16 == 3) {
                    int i17 = this.f5362f;
                    int i18 = constraintAnchor2 != null ? constraintAnchor2.f4832g + 0 : 0;
                    if (constraintAnchor != null) {
                        i18 += constraintAnchor.f4832g;
                    }
                    childMeasureSpec = ViewGroup.getChildMeasureSpec(i17, i15 + i18, -1);
                } else if (i16 != 4) {
                    iMakeMeasureSpec = 0;
                } else {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f5362f, i15, -2);
                    boolean z11 = constraintWidget.f4898s == 1;
                    int i19 = aVar.f33670j;
                    if (i19 == 1 || i19 == 2) {
                        if (aVar.f33670j == 2 || !z11 || (z11 && (view.getMeasuredHeight() == constraintWidget.m2731o())) || (view instanceof C0764d) || constraintWidget.mo2706E()) {
                            childMeasureSpec = View.MeasureSpec.makeMeasureSpec(constraintWidget.m2735u(), 1073741824);
                        }
                    }
                }
                iMakeMeasureSpec = childMeasureSpec;
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            }
            int i20 = iArr[dimensionBehaviour2.ordinal()];
            if (i20 == 1) {
                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else if (i20 == 2) {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5363g, i14, -2);
            } else if (i20 == 3) {
                int i21 = this.f5363g;
                int i22 = constraintAnchor2 != null ? constraintWidget.f4847L.f4832g + 0 : 0;
                if (constraintAnchor != null) {
                    i22 += constraintWidget.f4849N.f4832g;
                }
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i21, i14 + i22, -1);
            } else if (i20 != 4) {
                iMakeMeasureSpec2 = 0;
            } else {
                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f5363g, i14, -2);
                boolean z12 = constraintWidget.f4900t == 1;
                int i23 = aVar.f33670j;
                if (i23 == 1 || i23 == 2) {
                    if (aVar.f33670j == 2 || !z12 || (z12 && (view.getMeasuredWidth() == constraintWidget.m2735u())) || (view instanceof C0764d) || constraintWidget.mo2707F()) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.m2731o(), 1073741824);
                    }
                }
            }
            C0738d c0738d = (C0738d) constraintWidget.f4858W;
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            if (c0738d != null && C0741g.m2781b(constraintLayout.f5282i, 256) && view.getMeasuredWidth() == constraintWidget.m2735u() && view.getMeasuredWidth() < c0738d.m2735u() && view.getMeasuredHeight() == constraintWidget.m2731o() && view.getMeasuredHeight() < c0738d.m2731o() && view.getBaseline() == constraintWidget.f4869d0 && !constraintWidget.m2705D()) {
                if (m2872a(constraintWidget.f4844I, iMakeMeasureSpec, constraintWidget.m2735u()) && m2872a(constraintWidget.f4845J, iMakeMeasureSpec2, constraintWidget.m2731o())) {
                    aVar.f33665e = constraintWidget.m2735u();
                    aVar.f33666f = constraintWidget.m2731o();
                    aVar.f33667g = constraintWidget.f4869d0;
                    return;
                }
            }
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
            boolean z13 = dimensionBehaviour == dimensionBehaviour3;
            boolean z14 = dimensionBehaviour2 == dimensionBehaviour3;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
            boolean z15 = dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z16 = dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED;
            boolean z17 = z13 && constraintWidget.f4861Z > 0.0f;
            boolean z18 = z14 && constraintWidget.f4861Z > 0.0f;
            if (view == null) {
                return;
            }
            C0759b c0759b = (C0759b) view.getLayoutParams();
            int i24 = aVar.f33670j;
            if (i24 != 1 && i24 != 2 && z13 && constraintWidget.f4898s == 0 && z14 && constraintWidget.f4900t == 0) {
                i11 = -1;
                baseline = 0;
                z10 = false;
                iMax = 0;
                iMax2 = 0;
            } else {
                if ((view instanceof AbstractC5884g) && (constraintWidget instanceof C0743i)) {
                    ((AbstractC5884g) view).mo2787p((C0743i) constraintWidget, iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                constraintWidget.f4844I = iMakeMeasureSpec;
                constraintWidget.f4845J = iMakeMeasureSpec2;
                constraintWidget.f4874g = false;
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                int baseline2 = view.getBaseline();
                int i25 = constraintWidget.f4904v;
                iMax = i25 > 0 ? Math.max(i25, measuredWidth) : measuredWidth;
                int i26 = constraintWidget.f4906w;
                if (i26 > 0) {
                    iMax = Math.min(i26, iMax);
                }
                int i27 = constraintWidget.f4908y;
                iMax2 = i27 > 0 ? Math.max(i27, measuredHeight) : measuredHeight;
                int i28 = constraintWidget.f4909z;
                if (i28 > 0) {
                    iMax2 = Math.min(i28, iMax2);
                }
                if (!C0741g.m2781b(constraintLayout.f5282i, 1)) {
                    if (z17 && z15) {
                        iMax = (int) ((iMax2 * constraintWidget.f4861Z) + 0.5f);
                    } else if (z18 && z16) {
                        iMax2 = (int) ((iMax / constraintWidget.f4861Z) + 0.5f);
                    }
                }
                if (measuredWidth == iMax && measuredHeight == iMax2) {
                    baseline = baseline2;
                    z10 = false;
                } else {
                    if (measuredWidth != iMax) {
                        i10 = 1073741824;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        i10 = 1073741824;
                    }
                    int iMakeMeasureSpec3 = measuredHeight != iMax2 ? View.MeasureSpec.makeMeasureSpec(iMax2, i10) : iMakeMeasureSpec2;
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                    constraintWidget.f4844I = iMakeMeasureSpec;
                    constraintWidget.f4845J = iMakeMeasureSpec3;
                    z10 = false;
                    constraintWidget.f4874g = false;
                    int measuredWidth2 = view.getMeasuredWidth();
                    int measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    iMax = measuredWidth2;
                    iMax2 = measuredHeight2;
                }
                i11 = -1;
            }
            boolean z19 = baseline != i11 ? true : z10;
            aVar.f33669i = (iMax == aVar.f33663c && iMax2 == aVar.f33664d) ? z10 : true;
            boolean z20 = c0759b.f5318c0 ? true : z19;
            if (z20 && baseline != -1 && constraintWidget.f4869d0 != baseline) {
                aVar.f33669i = true;
            }
            aVar.f33665e = iMax;
            aVar.f33666f = iMax2;
            aVar.f33668h = z20;
            aVar.f33667g = baseline;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5274a = new SparseArray<>();
        this.f5275b = new ArrayList<>(4);
        this.f5276c = new C0738d();
        this.f5277d = 0;
        this.f5278e = 0;
        this.f5279f = Integer.MAX_VALUE;
        this.f5280g = Integer.MAX_VALUE;
        this.f5281h = true;
        this.f5282i = 257;
        this.f5283j = null;
        this.f5284k = null;
        this.f5285l = -1;
        this.f5271H = new HashMap<>();
        this.f5272I = new SparseArray<>();
        this.f5273J = new C0760c(this);
        m2865g(attributeSet, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f5274a = new SparseArray<>();
        this.f5275b = new ArrayList<>(4);
        this.f5276c = new C0738d();
        this.f5277d = 0;
        this.f5278e = 0;
        this.f5279f = Integer.MAX_VALUE;
        this.f5280g = Integer.MAX_VALUE;
        this.f5281h = true;
        this.f5282i = 257;
        this.f5283j = null;
        this.f5284k = null;
        this.f5285l = -1;
        this.f5271H = new HashMap<>();
        this.f5272I = new SparseArray<>();
        this.f5273J = new C0760c(this);
        m2865g(attributeSet, i10);
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public static C5882e getSharedValues() {
        if (f5270K == null) {
            f5270K = new C5882e();
        }
        return f5270K;
    }

    /* JADX WARN: Code duplicated, block: B:152:0x02db  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:152:0x02db -> B:153:0x02dc). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    public final void m2862c(boolean z10, View view, ConstraintWidget constraintWidget, C0759b c0759b, SparseArray<ConstraintWidget> sparseArray) {
        float f3;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        int i10;
        int i11;
        float fAbs;
        int i12;
        c0759b.m2871a();
        constraintWidget.f4881j0 = view.getVisibility();
        if (c0759b.f5324f0) {
            constraintWidget.f4842G = true;
            constraintWidget.f4881j0 = 8;
        }
        constraintWidget.f4879i0 = view;
        if (view instanceof AbstractC0761a) {
            ((AbstractC0761a) view).mo2786n(constraintWidget, this.f5276c.f4963B0);
        }
        int i13 = -1;
        if (c0759b.f5320d0) {
            C0740f c0740f = (C0740f) constraintWidget;
            int i14 = c0759b.f5340n0;
            int i15 = c0759b.f5342o0;
            float f10 = c0759b.f5344p0;
            if (f10 != -1.0f) {
                if (f10 > -1.0f) {
                    c0740f.f5028w0 = f10;
                    c0740f.f5029x0 = -1;
                    c0740f.f5030y0 = -1;
                    return;
                }
                return;
            }
            if (i14 != -1) {
                if (i14 > -1) {
                    c0740f.f5028w0 = -1.0f;
                    c0740f.f5029x0 = i14;
                    c0740f.f5030y0 = -1;
                    return;
                }
                return;
            }
            if (i15 == -1 || i15 <= -1) {
                return;
            }
            c0740f.f5028w0 = -1.0f;
            c0740f.f5029x0 = -1;
            c0740f.f5030y0 = i15;
            return;
        }
        int i16 = c0759b.f5326g0;
        int i17 = c0759b.f5328h0;
        int i18 = c0759b.f5330i0;
        int i19 = c0759b.f5332j0;
        int i20 = c0759b.f5334k0;
        int i21 = c0759b.f5336l0;
        float f11 = c0759b.f5338m0;
        int i22 = c0759b.f5343p;
        if (i22 != -1) {
            ConstraintWidget constraintWidget6 = sparseArray.get(i22);
            if (constraintWidget6 != null) {
                float f12 = c0759b.f5347r;
                int i23 = c0759b.f5345q;
                ConstraintAnchor.Type type = ConstraintAnchor.Type.CENTER;
                constraintWidget.m2740z(type, constraintWidget6, type, i23, 0);
                constraintWidget.f4840E = f12;
            }
            f3 = 0.0f;
        } else {
            if (i16 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray.get(i16);
                if (constraintWidget7 != null) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.LEFT;
                    f3 = 0.0f;
                    constraintWidget.m2740z(type2, constraintWidget7, type2, ((ViewGroup.MarginLayoutParams) c0759b).leftMargin, i20);
                } else {
                    f3 = 0.0f;
                }
            } else {
                f3 = 0.0f;
                if (i17 != -1 && (constraintWidget2 = sparseArray.get(i17)) != null) {
                    constraintWidget.m2740z(ConstraintAnchor.Type.LEFT, constraintWidget2, ConstraintAnchor.Type.RIGHT, ((ViewGroup.MarginLayoutParams) c0759b).leftMargin, i20);
                }
            }
            if (i18 != -1) {
                ConstraintWidget constraintWidget8 = sparseArray.get(i18);
                if (constraintWidget8 != null) {
                    constraintWidget.m2740z(ConstraintAnchor.Type.RIGHT, constraintWidget8, ConstraintAnchor.Type.LEFT, ((ViewGroup.MarginLayoutParams) c0759b).rightMargin, i21);
                }
            } else if (i19 != -1 && (constraintWidget3 = sparseArray.get(i19)) != null) {
                ConstraintAnchor.Type type3 = ConstraintAnchor.Type.RIGHT;
                constraintWidget.m2740z(type3, constraintWidget3, type3, ((ViewGroup.MarginLayoutParams) c0759b).rightMargin, i21);
            }
            int i24 = c0759b.f5329i;
            if (i24 != -1) {
                ConstraintWidget constraintWidget9 = sparseArray.get(i24);
                if (constraintWidget9 != null) {
                    ConstraintAnchor.Type type4 = ConstraintAnchor.Type.TOP;
                    constraintWidget.m2740z(type4, constraintWidget9, type4, ((ViewGroup.MarginLayoutParams) c0759b).topMargin, c0759b.f5353x);
                }
            } else {
                int i25 = c0759b.f5331j;
                if (i25 != -1 && (constraintWidget4 = sparseArray.get(i25)) != null) {
                    constraintWidget.m2740z(ConstraintAnchor.Type.TOP, constraintWidget4, ConstraintAnchor.Type.BOTTOM, ((ViewGroup.MarginLayoutParams) c0759b).topMargin, c0759b.f5353x);
                }
            }
            int i26 = c0759b.f5333k;
            if (i26 != -1) {
                ConstraintWidget constraintWidget10 = sparseArray.get(i26);
                if (constraintWidget10 != null) {
                    constraintWidget.m2740z(ConstraintAnchor.Type.BOTTOM, constraintWidget10, ConstraintAnchor.Type.TOP, ((ViewGroup.MarginLayoutParams) c0759b).bottomMargin, c0759b.f5355z);
                }
            } else {
                int i27 = c0759b.f5335l;
                if (i27 != -1 && (constraintWidget5 = sparseArray.get(i27)) != null) {
                    ConstraintAnchor.Type type5 = ConstraintAnchor.Type.BOTTOM;
                    constraintWidget.m2740z(type5, constraintWidget5, type5, ((ViewGroup.MarginLayoutParams) c0759b).bottomMargin, c0759b.f5355z);
                }
            }
            int i28 = c0759b.f5337m;
            if (i28 != -1) {
                m2870r(constraintWidget, c0759b, sparseArray, i28, ConstraintAnchor.Type.BASELINE);
            } else {
                int i29 = c0759b.f5339n;
                if (i29 != -1) {
                    m2870r(constraintWidget, c0759b, sparseArray, i29, ConstraintAnchor.Type.TOP);
                } else {
                    int i30 = c0759b.f5341o;
                    if (i30 != -1) {
                        m2870r(constraintWidget, c0759b, sparseArray, i30, ConstraintAnchor.Type.BOTTOM);
                    }
                }
            }
            if (f11 >= f3) {
                constraintWidget.f4875g0 = f11;
            }
            float f13 = c0759b.f5292F;
            if (f13 >= f3) {
                constraintWidget.f4877h0 = f13;
            }
        }
        if (z10 && ((i12 = c0759b.f5306T) != -1 || c0759b.f5307U != -1)) {
            int i31 = c0759b.f5307U;
            constraintWidget.f4865b0 = i12;
            constraintWidget.f4867c0 = i31;
        }
        if (c0759b.f5314a0) {
            constraintWidget.m2715P(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.m2717R(((ViewGroup.MarginLayoutParams) c0759b).width);
            if (((ViewGroup.MarginLayoutParams) c0759b).width == -2) {
                constraintWidget.m2715P(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0759b).width == -1) {
            if (c0759b.f5309W) {
                constraintWidget.m2715P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.m2715P(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.mo2729m(ConstraintAnchor.Type.LEFT).f4832g = ((ViewGroup.MarginLayoutParams) c0759b).leftMargin;
            constraintWidget.mo2729m(ConstraintAnchor.Type.RIGHT).f4832g = ((ViewGroup.MarginLayoutParams) c0759b).rightMargin;
        } else {
            constraintWidget.m2715P(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.m2717R(0);
        }
        if (c0759b.f5316b0) {
            constraintWidget.m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
            constraintWidget.m2714O(((ViewGroup.MarginLayoutParams) c0759b).height);
            if (((ViewGroup.MarginLayoutParams) c0759b).height == -2) {
                constraintWidget.m2716Q(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) c0759b).height == -1) {
            if (c0759b.f5310X) {
                constraintWidget.m2716Q(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            } else {
                constraintWidget.m2716Q(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            }
            constraintWidget.mo2729m(ConstraintAnchor.Type.TOP).f4832g = ((ViewGroup.MarginLayoutParams) c0759b).topMargin;
            constraintWidget.mo2729m(ConstraintAnchor.Type.BOTTOM).f4832g = ((ViewGroup.MarginLayoutParams) c0759b).bottomMargin;
        } else {
            constraintWidget.m2716Q(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            constraintWidget.m2714O(0);
        }
        String str = c0759b.f5293G;
        if (str == null || str.length() == 0) {
            constraintWidget.f4861Z = f3;
        } else {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i10 = 1;
                i11 = 0;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i13 = 0;
                } else {
                    if (strSubstring.equalsIgnoreCase("H")) {
                        i10 = 1;
                        i13 = 1;
                    }
                    i11 = iIndexOf + i10;
                }
                i10 = 1;
                i11 = iIndexOf + i10;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - i10) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    } else {
                        fAbs = f3;
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + i10);
                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                        fAbs = f3;
                    } else {
                        float f14 = Float.parseFloat(strSubstring3);
                        float f15 = Float.parseFloat(strSubstring4);
                        if (f14 <= f3 || f15 <= f3) {
                            fAbs = f3;
                        } else {
                            fAbs = i13 == 1 ? Math.abs(f15 / f14) : Math.abs(f14 / f15);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
            if (fAbs > f3) {
                constraintWidget.f4861Z = fAbs;
                constraintWidget.f4863a0 = i13;
            }
        }
        float f16 = c0759b.f5294H;
        float[] fArr = constraintWidget.f4893p0;
        fArr[0] = f16;
        fArr[1] = c0759b.f5295I;
        constraintWidget.f4889n0 = c0759b.f5296J;
        constraintWidget.f4891o0 = c0759b.f5297K;
        int i32 = c0759b.f5312Z;
        if (i32 >= 0 && i32 <= 3) {
            constraintWidget.f4896r = i32;
        }
        int i33 = c0759b.f5298L;
        int i34 = c0759b.f5300N;
        int i35 = c0759b.f5302P;
        float f17 = c0759b.f5304R;
        constraintWidget.f4898s = i33;
        constraintWidget.f4904v = i34;
        if (i35 == Integer.MAX_VALUE) {
            i35 = 0;
        }
        constraintWidget.f4906w = i35;
        constraintWidget.f4907x = f17;
        if (f17 > f3 && f17 < 1.0f && i33 == 0) {
            constraintWidget.f4898s = 2;
        }
        int i36 = c0759b.f5299M;
        int i37 = c0759b.f5301O;
        int i38 = c0759b.f5303Q;
        float f18 = c0759b.f5305S;
        constraintWidget.f4900t = i36;
        constraintWidget.f4908y = i37;
        constraintWidget.f4909z = i38 != Integer.MAX_VALUE ? i38 : 0;
        constraintWidget.f4836A = f18;
        if (f18 <= f3 || f18 >= 1.0f || i36 != 0) {
            return;
        }
        constraintWidget.f4900t = 2;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0759b;
    }

    /* JADX INFO: renamed from: d */
    public final View m2863d(int i10) {
        return this.f5274a.get(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<AbstractC0761a> arrayList = this.f5275b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.get(i10).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i15;
                        float f10 = i16;
                        float f11 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f3, f10, f11, f10, paint);
                        float f12 = i16 + i17;
                        canvas.drawLine(f11, f10, f11, f12, paint);
                        canvas.drawLine(f11, f12, f3, f12, paint);
                        canvas.drawLine(f3, f12, f3, f10, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f10, f11, f12, paint);
                        canvas.drawLine(f3, f12, f11, f10, paint);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final ConstraintWidget m2864f(View view) {
        if (view == this) {
            return this.f5276c;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C0759b) {
            return ((C0759b) view.getLayoutParams()).f5346q0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C0759b) {
            return ((C0759b) view.getLayoutParams()).f5346q0;
        }
        return null;
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f5281h = true;
        super.forceLayout();
    }

    /* JADX INFO: renamed from: g */
    public final void m2865g(AttributeSet attributeSet, int i10) {
        C0738d c0738d = this.f5276c;
        c0738d.f4879i0 = this;
        C0760c c0760c = this.f5273J;
        c0738d.f4962A0 = c0760c;
        c0738d.f4981y0.f33678f = c0760c;
        this.f5274a.put(getId(), this);
        this.f5283j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C5881d.f35168b, i10, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                if (index == 16) {
                    this.f5277d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5277d);
                } else if (index == 17) {
                    this.f5278e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5278e);
                } else if (index == 14) {
                    this.f5279f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5279f);
                } else if (index == 15) {
                    this.f5280g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f5280g);
                } else if (index == 113) {
                    this.f5282i = typedArrayObtainStyledAttributes.getInt(index, this.f5282i);
                } else if (index == 56) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2802i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f5284k = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0762b c0762b = new C0762b();
                        this.f5283j = c0762b;
                        c0762b.m2897k(resourceId2, getContext());
                    } catch (Resources.NotFoundException unused2) {
                        this.f5283j = null;
                    }
                    this.f5285l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        c0738d.f4971J0 = this.f5282i;
        C0726c.f4803p = c0738d.m2768Z(512);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0759b();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0759b(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0759b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f5280g;
    }

    public int getMaxWidth() {
        return this.f5279f;
    }

    public int getMinHeight() {
        return this.f5278e;
    }

    public int getMinWidth() {
        return this.f5277d;
    }

    public int getOptimizationLevel() {
        return this.f5276c.f4971J0;
    }

    public String getSceneString() {
        int id2;
        StringBuilder sb2 = new StringBuilder();
        C0738d c0738d = this.f5276c;
        if (c0738d.f4882k == null) {
            int id3 = getId();
            if (id3 != -1) {
                c0738d.f4882k = getContext().getResources().getResourceEntryName(id3);
            } else {
                c0738d.f4882k = "parent";
            }
        }
        if (c0738d.f4885l0 == null) {
            c0738d.f4885l0 = c0738d.f4882k;
            Log.v("ConstraintLayout", " setDebugName " + c0738d.f4885l0);
        }
        for (ConstraintWidget constraintWidget : c0738d.f32872w0) {
            View view = (View) constraintWidget.f4879i0;
            if (view != null) {
                if (constraintWidget.f4882k == null && (id2 = view.getId()) != -1) {
                    constraintWidget.f4882k = getContext().getResources().getResourceEntryName(id2);
                }
                if (constraintWidget.f4885l0 == null) {
                    constraintWidget.f4885l0 = constraintWidget.f4882k;
                    Log.v("ConstraintLayout", " setDebugName " + constraintWidget.f4885l0);
                }
            }
        }
        c0738d.mo2734r(sb2);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2866h() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    /* JADX INFO: renamed from: i */
    public void mo2802i(int i10) {
        this.f5284k = new C5878a(getContext(), this, i10);
    }

    /* JADX INFO: renamed from: j */
    public final void m2867j(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        C0760c c0760c = this.f5273J;
        int i14 = c0760c.f5361e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + c0760c.f5360d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f5279f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f5280g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        View content;
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            C0759b c0759b = (C0759b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = c0759b.f5346q0;
            if ((childAt.getVisibility() != 8 || c0759b.f5320d0 || c0759b.f5322e0 || zIsInEditMode) && !c0759b.f5324f0) {
                int iM2736v = constraintWidget.m2736v();
                int iM2737w = constraintWidget.m2737w();
                int iM2735u = constraintWidget.m2735u() + iM2736v;
                int iM2731o = constraintWidget.m2731o() + iM2737w;
                childAt.layout(iM2736v, iM2737w, iM2735u, iM2731o);
                if ((childAt instanceof C0764d) && (content = ((C0764d) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(iM2736v, iM2737w, iM2735u, iM2731o);
                }
            }
        }
        ArrayList<AbstractC0761a> arrayList = this.f5275b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                arrayList.get(i15).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        ConstraintWidget constraintWidget;
        int i12 = 0;
        boolean z10 = true;
        if (!this.f5281h) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).isLayoutRequested()) {
                    this.f5281h = true;
                    break;
                }
            }
        }
        boolean zM2866h = m2866h();
        C0738d c0738d = this.f5276c;
        c0738d.f4963B0 = zM2866h;
        if (this.f5281h) {
            this.f5281h = false;
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    z10 = false;
                    break;
                } else if (getChildAt(i14).isLayoutRequested()) {
                    break;
                } else {
                    i14++;
                }
            }
            if (z10) {
                boolean zIsInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i15 = 0; i15 < childCount3; i15++) {
                    ConstraintWidget constraintWidgetM2864f = m2864f(getChildAt(i15));
                    if (constraintWidgetM2864f != null) {
                        constraintWidgetM2864f.mo2708G();
                    }
                }
                if (zIsInEditMode) {
                    for (int i16 = 0; i16 < childCount3; i16++) {
                        View childAt = getChildAt(i16);
                        try {
                            String resourceName = getResources().getResourceName(childAt.getId());
                            m2869q(resourceName, Integer.valueOf(childAt.getId()));
                            int iIndexOf = resourceName.indexOf(47);
                            if (iIndexOf != -1) {
                                resourceName = resourceName.substring(iIndexOf + 1);
                            }
                            int id2 = childAt.getId();
                            if (id2 != 0) {
                                View viewFindViewById = this.f5274a.get(id2);
                                if (viewFindViewById == null && (viewFindViewById = findViewById(id2)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
                                    onViewAdded(viewFindViewById);
                                }
                                if (viewFindViewById != this) {
                                    constraintWidget = viewFindViewById == null ? null : ((C0759b) viewFindViewById.getLayoutParams()).f5346q0;
                                }
                                constraintWidget.f4885l0 = resourceName;
                            }
                            constraintWidget = c0738d;
                            constraintWidget.f4885l0 = resourceName;
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                }
                if (this.f5285l != -1) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt2 = getChildAt(i17);
                        if (childAt2.getId() == this.f5285l && (childAt2 instanceof C0763c)) {
                            this.f5283j = ((C0763c) childAt2).getConstraintSet();
                        }
                    }
                }
                C0762b c0762b = this.f5283j;
                if (c0762b != null) {
                    c0762b.m2892c(this);
                }
                c0738d.f32872w0.clear();
                ArrayList<AbstractC0761a> arrayList = this.f5275b;
                int size = arrayList.size();
                if (size > 0) {
                    int i18 = 0;
                    while (i12 < size) {
                        AbstractC0761a abstractC0761a = arrayList.get(i12);
                        if (abstractC0761a.isInEditMode()) {
                            abstractC0761a.setIds(abstractC0761a.f5370e);
                        }
                        C5039b c5039b = abstractC0761a.f5369d;
                        if (c5039b != null) {
                            c5039b.mo10719a();
                            while (i18 < abstractC0761a.f5367b) {
                                int i19 = abstractC0761a.f5366a[i18];
                                View viewM2863d = m2863d(i19);
                                if (viewM2863d == null) {
                                    Integer numValueOf = Integer.valueOf(i19);
                                    HashMap<Integer, String> map = abstractC0761a.f5373h;
                                    String str = map.get(numValueOf);
                                    int iM2879j = abstractC0761a.m2879j(this, str);
                                    if (iM2879j != 0) {
                                        abstractC0761a.f5366a[i18] = iM2879j;
                                        map.put(Integer.valueOf(iM2879j), str);
                                        viewM2863d = m2863d(iM2879j);
                                    }
                                }
                                if (viewM2863d != null) {
                                    abstractC0761a.f5369d.mo10720b(m2864f(viewM2863d));
                                }
                                i18++;
                            }
                            abstractC0761a.f5369d.mo2783c();
                        }
                        i12++;
                        i18 = 0;
                    }
                }
                for (int i20 = 0; i20 < childCount3; i20++) {
                    View childAt3 = getChildAt(i20);
                    if (childAt3 instanceof C0764d) {
                        C0764d c0764d = (C0764d) childAt3;
                        if (c0764d.f5520a == -1 && !c0764d.isInEditMode()) {
                            c0764d.setVisibility(c0764d.f5522c);
                        }
                        View viewFindViewById2 = findViewById(c0764d.f5520a);
                        c0764d.f5521b = viewFindViewById2;
                        if (viewFindViewById2 != null) {
                            ((C0759b) viewFindViewById2.getLayoutParams()).f5324f0 = true;
                            c0764d.f5521b.setVisibility(0);
                            c0764d.setVisibility(0);
                        }
                    }
                }
                SparseArray<ConstraintWidget> sparseArray = this.f5272I;
                sparseArray.clear();
                sparseArray.put(0, c0738d);
                sparseArray.put(getId(), c0738d);
                for (int i21 = 0; i21 < childCount3; i21++) {
                    View childAt4 = getChildAt(i21);
                    sparseArray.put(childAt4.getId(), m2864f(childAt4));
                }
                for (int i22 = 0; i22 < childCount3; i22++) {
                    View childAt5 = getChildAt(i22);
                    ConstraintWidget constraintWidgetM2864f2 = m2864f(childAt5);
                    if (constraintWidgetM2864f2 != null) {
                        C0759b c0759b = (C0759b) childAt5.getLayoutParams();
                        c0738d.f32872w0.add(constraintWidgetM2864f2);
                        ConstraintWidget constraintWidget2 = constraintWidgetM2864f2.f4858W;
                        if (constraintWidget2 != null) {
                            ((C5040c) constraintWidget2).f32872w0.remove(constraintWidgetM2864f2);
                            constraintWidgetM2864f2.mo2708G();
                        }
                        constraintWidgetM2864f2.f4858W = c0738d;
                        m2862c(zIsInEditMode, childAt5, constraintWidgetM2864f2, c0759b, sparseArray);
                    }
                }
            }
            if (z10) {
                c0738d.f4980x0.m11479c(c0738d);
            }
        }
        m2868p(c0738d, this.f5282i, i10, i11);
        m2867j(i10, i11, c0738d.m2735u(), c0738d.m2731o(), c0738d.f4972K0, c0738d.f4973L0);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget constraintWidgetM2864f = m2864f(view);
        if ((view instanceof Guideline) && !(constraintWidgetM2864f instanceof C0740f)) {
            C0759b c0759b = (C0759b) view.getLayoutParams();
            C0740f c0740f = new C0740f();
            c0759b.f5346q0 = c0740f;
            c0759b.f5320d0 = true;
            c0740f.m2779V(c0759b.f5308V);
        }
        if (view instanceof AbstractC0761a) {
            AbstractC0761a abstractC0761a = (AbstractC0761a) view;
            abstractC0761a.m2881o();
            ((C0759b) view.getLayoutParams()).f5322e0 = true;
            ArrayList<AbstractC0761a> arrayList = this.f5275b;
            if (!arrayList.contains(abstractC0761a)) {
                arrayList.add(abstractC0761a);
            }
        }
        this.f5274a.put(view.getId(), view);
        this.f5281h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f5274a.remove(view.getId());
        ConstraintWidget constraintWidgetM2864f = m2864f(view);
        this.f5276c.f32872w0.remove(constraintWidgetM2864f);
        constraintWidgetM2864f.mo2708G();
        this.f5275b.remove(view);
        this.f5281h = true;
    }

    /* JADX WARN: Code duplicated, block: B:279:0x04ef A[PHI: r15
      0x04ef: PHI (r15v24 boolean) = (r15v23 boolean), (r15v23 boolean), (r15v23 boolean), (r15v27 boolean) binds: [B:255:0x04b8, B:257:0x04be, B:259:0x04c2, B:275:0x04e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca A[PHI: r12
      0x00ca: PHI (r12v49 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour) = 
      (r12v48 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
      (r12v1 androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour)
     binds: [B:33:0x00be, B:29:0x00b0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: p */
    public final void m2868p(C0738d c0738d, int i10, int i11, int i12) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        int i13;
        int iMin;
        int iMax;
        int iMax2;
        int i14;
        boolean z10;
        C5354b.b bVar;
        int i15;
        boolean zM2767X;
        int i16;
        C0738d c0738d2;
        ArrayList<ConstraintWidget> arrayList;
        int i17;
        C5354b.b bVar2;
        C5354b.b bVar3;
        int i18;
        boolean z11;
        C0734c c0734c;
        C0735d c0735d;
        C5357e c5357e;
        int i19;
        int i20;
        int i21;
        boolean zM2767X2;
        int i22;
        boolean z12;
        boolean z13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax3 = Math.max(0, getPaddingTop());
        int iMax4 = Math.max(0, getPaddingBottom());
        int i23 = iMax3 + iMax4;
        int paddingWidth = getPaddingWidth();
        C0760c c0760c = this.f5273J;
        c0760c.f5358b = iMax3;
        c0760c.f5359c = iMax4;
        c0760c.f5360d = paddingWidth;
        c0760c.f5361e = i23;
        c0760c.f5362f = i11;
        c0760c.f5363g = i12;
        int iMax5 = Math.max(0, getPaddingStart());
        int iMax6 = Math.max(0, getPaddingEnd());
        if (iMax5 <= 0 && iMax6 <= 0) {
            iMax5 = Math.max(0, getPaddingLeft());
        } else if (m2866h()) {
            iMax5 = iMax6;
        }
        int i24 = size - paddingWidth;
        int i25 = size2 - i23;
        int i26 = c0760c.f5361e;
        int i27 = c0760c.f5360d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    iMax = Math.max(0, this.f5277d);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = dimensionBehaviour;
                    iMin = iMax;
                    dimensionBehaviour2 = dimensionBehaviour4;
                }
                i13 = Integer.MIN_VALUE;
            } else if (mode != 1073741824) {
                dimensionBehaviour = dimensionBehaviour3;
            } else {
                iMin = Math.min(this.f5279f - i27, i24);
                i13 = Integer.MIN_VALUE;
                dimensionBehaviour2 = dimensionBehaviour3;
            }
            dimensionBehaviour2 = dimensionBehaviour;
            iMin = 0;
            i13 = Integer.MIN_VALUE;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax = Math.max(0, this.f5277d);
                ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = dimensionBehaviour;
                iMin = iMax;
                dimensionBehaviour2 = dimensionBehaviour5;
                i13 = Integer.MIN_VALUE;
            } else {
                dimensionBehaviour2 = dimensionBehaviour;
                i13 = Integer.MIN_VALUE;
                iMin = i24;
            }
        }
        if (mode2 == i13) {
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            iMax2 = childCount == 0 ? Math.max(0, this.f5278e) : i25;
        } else if (mode2 == 0) {
            dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                iMax2 = Math.max(0, this.f5278e);
            } else {
                iMax2 = 0;
            }
        } else if (mode2 != 1073741824) {
            iMax2 = 0;
        } else {
            iMax2 = Math.min(this.f5280g - i26, i25);
        }
        int iM2735u = c0738d.m2735u();
        C5357e c5357e2 = c0738d.f4981y0;
        if (iMin != iM2735u || iMax2 != c0738d.m2731o()) {
            c5357e2.f33675c = true;
        }
        c0738d.f4865b0 = 0;
        c0738d.f4867c0 = 0;
        int i28 = this.f5279f - i27;
        int[] iArr = c0738d.f4839D;
        iArr[0] = i28;
        iArr[1] = this.f5280g - i26;
        c0738d.f4871e0 = 0;
        c0738d.f4873f0 = 0;
        c0738d.m2715P(dimensionBehaviour2);
        c0738d.m2717R(iMin);
        c0738d.m2716Q(dimensionBehaviour3);
        c0738d.m2714O(iMax2);
        int i29 = this.f5277d - i27;
        if (i29 < 0) {
            i14 = 0;
            c0738d.f4871e0 = 0;
        } else {
            i14 = 0;
            c0738d.f4871e0 = i29;
        }
        int i30 = this.f5278e - i26;
        if (i30 < 0) {
            c0738d.f4873f0 = i14;
        } else {
            c0738d.f4873f0 = i30;
        }
        c0738d.f4965D0 = iMax5;
        c0738d.f4966E0 = iMax3;
        C5354b c5354b = c0738d.f4980x0;
        c5354b.getClass();
        C5354b.b bVar4 = c0738d.f4962A0;
        int size3 = c0738d.f32872w0.size();
        int iM2735u2 = c0738d.m2735u();
        int iM2731o = c0738d.m2731o();
        boolean zM2781b = C0741g.m2781b(i10, BuildConfig.SDK_TRUNCATE_LENGTH);
        boolean z14 = zM2781b || C0741g.m2781b(i10, 64);
        if (z14) {
            for (int i31 = 0; i31 < size3; i31++) {
                ConstraintWidget constraintWidget = c0738d.f32872w0.get(i31);
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = dimensionBehaviourArr[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z15 = (dimensionBehaviour6 == dimensionBehaviour7) && (dimensionBehaviourArr[1] == dimensionBehaviour7) && constraintWidget.f4861Z > 0.0f;
                if ((constraintWidget.m2703B() && z15) || ((constraintWidget.m2704C() && z15) || (constraintWidget instanceof C0743i) || constraintWidget.m2703B() || constraintWidget.m2704C())) {
                    z14 = false;
                    break;
                }
            }
        }
        boolean z16 = z14 & ((mode == 1073741824 && mode2 == 1073741824) || zM2781b);
        if (z16) {
            int iMin2 = Math.min(c0738d.f4839D[0], i24);
            int iMin3 = Math.min(c0738d.f4839D[1], i25);
            if (mode != 1073741824 || c0738d.m2735u() == iMin2) {
                c5357e = c5357e2;
            } else {
                c0738d.m2717R(iMin2);
                c5357e = c5357e2;
                c5357e.f33674b = true;
            }
            if (mode2 == 1073741824 && c0738d.m2731o() != iMin3) {
                c0738d.m2714O(iMin3);
                c5357e.f33674b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z17 = zM2781b & true;
                boolean z18 = c5357e.f33674b;
                C0738d c0738d3 = c5357e.f33673a;
                if (z18 || c5357e.f33675c) {
                    for (ConstraintWidget constraintWidget2 : c0738d3.f32872w0) {
                        constraintWidget2.m2728l();
                        constraintWidget2.f4862a = false;
                        constraintWidget2.f4868d.m2760n();
                        constraintWidget2.f4870e.m2761m();
                    }
                    c0738d3.m2728l();
                    i22 = 0;
                    c0738d3.f4862a = false;
                    c0738d3.f4868d.m2760n();
                    c0738d3.f4870e.m2761m();
                    c5357e.f33675c = false;
                } else {
                    i22 = 0;
                }
                c5357e.m11483b(c5357e.f33676d);
                c0738d3.f4865b0 = i22;
                c0738d3.f4867c0 = i22;
                ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n = c0738d3.m2730n(i22);
                ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n2 = c0738d3.m2730n(1);
                if (c5357e.f33674b) {
                    c5357e.m11484c();
                }
                int iM2736v = c0738d3.m2736v();
                int iM2737w = c0738d3.m2737w();
                z10 = z16;
                c0738d3.f4868d.f4935h.mo2746d(iM2736v);
                c0738d3.f4870e.f4935h.mo2746d(iM2737w);
                c5357e.m11488g();
                ConstraintWidget.DimensionBehaviour dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                bVar = bVar4;
                ArrayList<WidgetRun> arrayList2 = c5357e.f33677e;
                if (dimensionBehaviourM2730n == dimensionBehaviour8 || dimensionBehaviourM2730n2 == dimensionBehaviour8) {
                    if (z17) {
                        Iterator<WidgetRun> it = arrayList2.iterator();
                        while (it.hasNext()) {
                            if (!it.next().mo2756k()) {
                                z17 = false;
                                break;
                            }
                        }
                    }
                    if (z17 && dimensionBehaviourM2730n == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        c0738d3.m2715P(ConstraintWidget.DimensionBehaviour.FIXED);
                        c0738d3.m2717R(c5357e.m11485d(c0738d3, 0));
                        c0738d3.f4868d.f4932e.mo2746d(c0738d3.m2735u());
                    }
                    if (z17 && dimensionBehaviourM2730n2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        c0738d3.m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
                        c0738d3.m2714O(c5357e.m11485d(c0738d3, 1));
                        c0738d3.f4870e.f4932e.mo2746d(c0738d3.m2731o());
                    }
                } else {
                    iM2735u2 = iM2735u2;
                }
                ConstraintWidget.DimensionBehaviour dimensionBehaviour9 = c0738d3.f4857V[0];
                ConstraintWidget.DimensionBehaviour dimensionBehaviour10 = ConstraintWidget.DimensionBehaviour.FIXED;
                if (dimensionBehaviour9 == dimensionBehaviour10 || dimensionBehaviour9 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                    int iM2735u3 = c0738d3.m2735u() + iM2736v;
                    c0738d3.f4868d.f4936i.mo2746d(iM2735u3);
                    c0738d3.f4868d.f4932e.mo2746d(iM2735u3 - iM2736v);
                    c5357e.m11488g();
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = c0738d3.f4857V[1];
                    if (dimensionBehaviour11 == dimensionBehaviour10 || dimensionBehaviour11 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                        int iM2731o2 = c0738d3.m2731o() + iM2737w;
                        c0738d3.f4870e.f4936i.mo2746d(iM2731o2);
                        c0738d3.f4870e.f4932e.mo2746d(iM2731o2 - iM2737w);
                    }
                    c5357e.m11488g();
                    z12 = true;
                } else {
                    z12 = false;
                }
                for (WidgetRun widgetRun : arrayList2) {
                    if (widgetRun.f4929b != c0738d3 || widgetRun.f4934g) {
                        widgetRun.mo2752e();
                    }
                }
                Iterator<WidgetRun> it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z13 = true;
                        break;
                    }
                    WidgetRun next = it2.next();
                    if (z12 || next.f4929b != c0738d3) {
                        if (!next.f4935h.f4925j || ((!next.f4936i.f4925j && !(next instanceof C5360h)) || (!next.f4932e.f4925j && !(next instanceof C5355c) && !(next instanceof C5360h)))) {
                            z13 = false;
                            break;
                        }
                    }
                }
                c0738d3.m2715P(dimensionBehaviourM2730n);
                c0738d3.m2716Q(dimensionBehaviourM2730n2);
                zM2767X = z13;
                i20 = 1073741824;
                i15 = 2;
            } else {
                z10 = z16;
                bVar = bVar4;
                iM2735u2 = iM2735u2;
                boolean z19 = c5357e.f33674b;
                C0738d c0738d4 = c5357e.f33673a;
                if (z19) {
                    for (ConstraintWidget constraintWidget3 : c0738d4.f32872w0) {
                        constraintWidget3.m2728l();
                        constraintWidget3.f4862a = false;
                        C0734c c0734c2 = constraintWidget3.f4868d;
                        c0734c2.f4932e.f4925j = false;
                        c0734c2.f4934g = false;
                        c0734c2.m2760n();
                        C0735d c0735d2 = constraintWidget3.f4870e;
                        c0735d2.f4932e.f4925j = false;
                        c0735d2.f4934g = false;
                        c0735d2.m2761m();
                    }
                    i19 = 0;
                    c0738d4.m2728l();
                    c0738d4.f4862a = false;
                    C0734c c0734c3 = c0738d4.f4868d;
                    c0734c3.f4932e.f4925j = false;
                    c0734c3.f4934g = false;
                    c0734c3.m2760n();
                    C0735d c0735d3 = c0738d4.f4870e;
                    c0735d3.f4932e.f4925j = false;
                    c0735d3.f4934g = false;
                    c0735d3.m2761m();
                    c5357e.m11484c();
                } else {
                    i19 = 0;
                }
                c5357e.m11483b(c5357e.f33676d);
                c0738d4.f4865b0 = i19;
                c0738d4.f4867c0 = i19;
                c0738d4.f4868d.f4935h.mo2746d(i19);
                c0738d4.f4870e.f4935h.mo2746d(i19);
                i20 = 1073741824;
                if (mode == 1073741824) {
                    i21 = 1;
                    i15 = 1;
                    zM2767X2 = c0738d.m2767X(i19, zM2781b) & true;
                } else {
                    i21 = 1;
                    zM2767X2 = true;
                    i15 = 0;
                }
                if (mode2 == 1073741824) {
                    zM2767X = c0738d.m2767X(i21, zM2781b) & zM2767X2;
                    i15++;
                } else {
                    zM2767X = zM2767X2;
                }
            }
            if (zM2767X) {
                c0738d.mo2718S(mode == i20, mode2 == i20);
            }
        } else {
            z10 = z16;
            bVar = bVar4;
            iM2735u2 = iM2735u2;
            i15 = 0;
            zM2767X = false;
        }
        if (zM2767X && i15 == 2) {
            return;
        }
        int i32 = c0738d.f4971J0;
        if (size3 > 0) {
            int size4 = c0738d.f32872w0.size();
            boolean zM2768Z = c0738d.m2768Z(64);
            C5354b.b bVar5 = c0738d.f4962A0;
            for (int i33 = 0; i33 < size4; i33++) {
                ConstraintWidget constraintWidget4 = c0738d.f32872w0.get(i33);
                if (!(constraintWidget4 instanceof C0740f) && !(constraintWidget4 instanceof C0730a) && !constraintWidget4.f4843H && (!zM2768Z || (c0734c = constraintWidget4.f4868d) == null || (c0735d = constraintWidget4.f4870e) == null || !c0734c.f4932e.f4925j || !c0735d.f4932e.f4925j)) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n3 = constraintWidget4.m2730n(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n4 = constraintWidget4.m2730n(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    boolean z20 = dimensionBehaviourM2730n3 == dimensionBehaviour12 && constraintWidget4.f4898s != 1 && dimensionBehaviourM2730n4 == dimensionBehaviour12 && constraintWidget4.f4900t != 1;
                    if (!z20 && c0738d.m2768Z(1) && !(constraintWidget4 instanceof C0743i)) {
                        if (dimensionBehaviourM2730n3 == dimensionBehaviour12 && constraintWidget4.f4898s == 0 && dimensionBehaviourM2730n4 != dimensionBehaviour12 && !constraintWidget4.m2703B()) {
                            z20 = true;
                        }
                        if (dimensionBehaviourM2730n4 == dimensionBehaviour12 && constraintWidget4.f4900t == 0 && dimensionBehaviourM2730n3 != dimensionBehaviour12 && !constraintWidget4.m2703B()) {
                            z20 = true;
                        }
                        if (dimensionBehaviourM2730n3 == dimensionBehaviour12 || dimensionBehaviourM2730n4 == dimensionBehaviour12) {
                            if (constraintWidget4.f4861Z > 0.0f) {
                                z20 = true;
                            }
                        }
                    }
                    if (!z20) {
                        c5354b.m11477a(0, constraintWidget4, bVar5);
                    }
                }
            }
            ConstraintLayout constraintLayout = ((C0760c) bVar5).f5357a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i34 = 0; i34 < childCount2; i34++) {
                View childAt = constraintLayout.getChildAt(i34);
                if (childAt instanceof C0764d) {
                    C0764d c0764d = (C0764d) childAt;
                    if (c0764d.f5521b != null) {
                        C0759b c0759b = (C0759b) c0764d.getLayoutParams();
                        C0759b c0759b2 = (C0759b) c0764d.f5521b.getLayoutParams();
                        ConstraintWidget constraintWidget5 = c0759b2.f5346q0;
                        constraintWidget5.f4881j0 = 0;
                        ConstraintWidget constraintWidget6 = c0759b.f5346q0;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = constraintWidget6.f4857V[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour13 != dimensionBehaviour14) {
                            constraintWidget6.m2717R(constraintWidget5.m2735u());
                        }
                        ConstraintWidget constraintWidget7 = c0759b.f5346q0;
                        if (constraintWidget7.f4857V[1] != dimensionBehaviour14) {
                            constraintWidget7.m2714O(c0759b2.f5346q0.m2731o());
                        }
                        c0759b2.f5346q0.f4881j0 = 8;
                    }
                }
            }
            ArrayList<AbstractC0761a> arrayList3 = constraintLayout.f5275b;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i35 = 0; i35 < size5; i35++) {
                    arrayList3.get(i35).getClass();
                }
            }
        }
        c5354b.m11479c(c0738d);
        ArrayList<ConstraintWidget> arrayList4 = c5354b.f33658a;
        int size6 = arrayList4.size();
        int i36 = iM2735u2;
        if (size3 > 0) {
            c5354b.m11478b(c0738d, 0, i36, iM2731o);
        }
        if (size6 > 0) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = c0738d.f4857V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            boolean z21 = dimensionBehaviour15 == dimensionBehaviour16;
            boolean z22 = dimensionBehaviourArr2[1] == dimensionBehaviour16;
            int iM2735u4 = c0738d.m2735u();
            C0738d c0738d5 = c5354b.f33660c;
            int iMax7 = Math.max(iM2735u4, c0738d5.f4871e0);
            int iMax8 = Math.max(c0738d.m2731o(), c0738d5.f4873f0);
            int i37 = 0;
            boolean z23 = false;
            while (i37 < size6) {
                ConstraintWidget constraintWidget8 = arrayList4.get(i37);
                if (constraintWidget8 instanceof C0743i) {
                    int iM2735u5 = constraintWidget8.m2735u();
                    int iM2731o3 = constraintWidget8.m2731o();
                    bVar3 = bVar;
                    boolean zM11477a = z23 | c5354b.m11477a(1, constraintWidget8, bVar3);
                    int iM2735u6 = constraintWidget8.m2735u();
                    int iM2731o4 = constraintWidget8.m2731o();
                    if (iM2735u6 != iM2735u5) {
                        constraintWidget8.m2717R(iM2735u6);
                        if (z21 && constraintWidget8.m2736v() + constraintWidget8.f4859X > iMax7) {
                            iMax7 = Math.max(iMax7, constraintWidget8.mo2729m(ConstraintAnchor.Type.RIGHT).m2690e() + constraintWidget8.m2736v() + constraintWidget8.f4859X);
                        }
                        i18 = iMax7;
                        z11 = true;
                    } else {
                        i18 = iMax7;
                        z11 = zM11477a;
                    }
                    if (iM2731o4 != iM2731o3) {
                        constraintWidget8.m2714O(iM2731o4);
                        if (z22 && constraintWidget8.m2737w() + constraintWidget8.f4860Y > iMax8) {
                            iMax8 = Math.max(iMax8, constraintWidget8.mo2729m(ConstraintAnchor.Type.BOTTOM).m2690e() + constraintWidget8.m2737w() + constraintWidget8.f4860Y);
                        }
                        z11 = true;
                    }
                    z23 = ((C0743i) constraintWidget8).f5038E0 | z11;
                    iMax7 = i18;
                } else {
                    bVar3 = bVar;
                }
                i37++;
                bVar = bVar3;
                i32 = i32;
            }
            i16 = i32;
            C5354b.b bVar6 = bVar;
            int i38 = 2;
            int i39 = 0;
            while (i39 < i38) {
                int i40 = 0;
                while (i40 < size6) {
                    ConstraintWidget constraintWidget9 = arrayList4.get(i40);
                    if ((!(constraintWidget9 instanceof InterfaceC5038a) || (constraintWidget9 instanceof C0743i)) && !(constraintWidget9 instanceof C0740f)) {
                        if (constraintWidget9.f4881j0 != 8 && ((!z10 || !constraintWidget9.f4868d.f4932e.f4925j || !constraintWidget9.f4870e.f4932e.f4925j) && !(constraintWidget9 instanceof C0743i))) {
                            int iM2735u7 = constraintWidget9.m2735u();
                            int iM2731o5 = constraintWidget9.m2731o();
                            arrayList = arrayList4;
                            int i41 = constraintWidget9.f4869d0;
                            i17 = size6;
                            boolean zM11477a2 = c5354b.m11477a(i39 == 1 ? 2 : 1, constraintWidget9, bVar6) | z23;
                            int iM2735u8 = constraintWidget9.m2735u();
                            bVar2 = bVar6;
                            int iM2731o6 = constraintWidget9.m2731o();
                            if (iM2735u8 != iM2735u7) {
                                constraintWidget9.m2717R(iM2735u8);
                                if (z21 && constraintWidget9.m2736v() + constraintWidget9.f4859X > iMax7) {
                                    iMax7 = Math.max(iMax7, constraintWidget9.mo2729m(ConstraintAnchor.Type.RIGHT).m2690e() + constraintWidget9.m2736v() + constraintWidget9.f4859X);
                                }
                                zM11477a2 = true;
                            }
                            if (iM2731o6 != iM2731o5) {
                                constraintWidget9.m2714O(iM2731o6);
                                if (z22 && constraintWidget9.m2737w() + constraintWidget9.f4860Y > iMax8) {
                                    iMax8 = Math.max(iMax8, constraintWidget9.mo2729m(ConstraintAnchor.Type.BOTTOM).m2690e() + constraintWidget9.m2737w() + constraintWidget9.f4860Y);
                                }
                                zM11477a2 = true;
                            }
                            z23 = (!constraintWidget9.f4841F || i41 == constraintWidget9.f4869d0) ? zM11477a2 : true;
                        }
                        i40++;
                        size6 = i17;
                        arrayList4 = arrayList;
                        bVar6 = bVar2;
                    }
                    bVar2 = bVar6;
                    arrayList = arrayList4;
                    i17 = size6;
                    i40++;
                    size6 = i17;
                    arrayList4 = arrayList;
                    bVar6 = bVar2;
                }
                C5354b.b bVar7 = bVar6;
                ArrayList<ConstraintWidget> arrayList5 = arrayList4;
                int i42 = size6;
                if (!z23) {
                    break;
                }
                i39++;
                c5354b.m11478b(c0738d, i39, i36, iM2731o);
                size6 = i42;
                arrayList4 = arrayList5;
                bVar6 = bVar7;
                i38 = 2;
                z23 = false;
            }
            c0738d2 = c0738d;
        } else {
            i16 = i32;
            c0738d2 = c0738d;
        }
        c0738d2.f4971J0 = i16;
        C0726c.f4803p = c0738d2.m2768Z(512);
    }

    /* JADX INFO: renamed from: q */
    public final void m2869q(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f5271H == null) {
                this.f5271H = new HashMap<>();
            }
            int iIndexOf = str.indexOf("/");
            if (iIndexOf != -1) {
                str = str.substring(iIndexOf + 1);
            }
            this.f5271H.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m2870r(ConstraintWidget constraintWidget, C0759b c0759b, SparseArray<ConstraintWidget> sparseArray, int i10, ConstraintAnchor.Type type) {
        View view = this.f5274a.get(i10);
        ConstraintWidget constraintWidget2 = sparseArray.get(i10);
        if (constraintWidget2 == null || view == null || !(view.getLayoutParams() instanceof C0759b)) {
            return;
        }
        c0759b.f5318c0 = true;
        ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
        if (type == type2) {
            C0759b c0759b2 = (C0759b) view.getLayoutParams();
            c0759b2.f5318c0 = true;
            c0759b2.f5346q0.f4841F = true;
        }
        constraintWidget.mo2729m(type2).m2687b(constraintWidget2.mo2729m(type), c0759b.f5290D, c0759b.f5289C, true);
        constraintWidget.f4841F = true;
        constraintWidget.mo2729m(ConstraintAnchor.Type.TOP).m2695j();
        constraintWidget.mo2729m(ConstraintAnchor.Type.BOTTOM).m2695j();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f5281h = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0762b c0762b) {
        this.f5283j = c0762b;
    }

    @Override // android.view.View
    public void setId(int i10) {
        int id2 = getId();
        SparseArray<View> sparseArray = this.f5274a;
        sparseArray.remove(id2);
        super.setId(i10);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f5280g) {
            return;
        }
        this.f5280g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f5279f) {
            return;
        }
        this.f5279f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f5278e) {
            return;
        }
        this.f5278e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f5277d) {
            return;
        }
        this.f5277d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC5879b abstractC5879b) {
        C5878a c5878a = this.f5284k;
        if (c5878a != null) {
            c5878a.getClass();
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f5282i = i10;
        C0738d c0738d = this.f5276c;
        c0738d.f4971J0 = i10;
        C0726c.f4803p = c0738d.m2768Z(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
