package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.Guideline;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: af */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0006af {

    /* JADX INFO: renamed from: b */
    private static final int[] f269b = {0, 4, 8};

    /* JADX INFO: renamed from: c */
    private static final SparseIntArray f270c;

    /* JADX INFO: renamed from: a */
    public final HashMap f271a = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f270c = sparseIntArray;
        int[] iArr = C0007ag.f290a;
        sparseIntArray.append(85, 25);
        sparseIntArray.append(86, 26);
        sparseIntArray.append(88, 29);
        sparseIntArray.append(89, 30);
        sparseIntArray.append(95, 36);
        sparseIntArray.append(94, 35);
        sparseIntArray.append(67, 4);
        sparseIntArray.append(66, 3);
        sparseIntArray.append(62, 1);
        sparseIntArray.append(103, 6);
        sparseIntArray.append(104, 7);
        sparseIntArray.append(74, 17);
        sparseIntArray.append(75, 18);
        sparseIntArray.append(76, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(90, 32);
        sparseIntArray.append(91, 33);
        sparseIntArray.append(73, 10);
        sparseIntArray.append(72, 9);
        sparseIntArray.append(108, 13);
        sparseIntArray.append(111, 16);
        sparseIntArray.append(109, 14);
        sparseIntArray.append(106, 11);
        sparseIntArray.append(110, 15);
        sparseIntArray.append(107, 12);
        sparseIntArray.append(98, 40);
        sparseIntArray.append(83, 39);
        sparseIntArray.append(82, 41);
        sparseIntArray.append(97, 42);
        sparseIntArray.append(81, 20);
        sparseIntArray.append(96, 37);
        sparseIntArray.append(71, 5);
        sparseIntArray.append(84, 60);
        sparseIntArray.append(93, 60);
        sparseIntArray.append(87, 60);
        sparseIntArray.append(65, 60);
        sparseIntArray.append(61, 60);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(25, 31);
        sparseIntArray.append(26, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(15, 43);
        sparseIntArray.append(28, 44);
        sparseIntArray.append(23, 45);
        sparseIntArray.append(24, 46);
        sparseIntArray.append(20, 47);
        sparseIntArray.append(21, 48);
        sparseIntArray.append(16, 49);
        sparseIntArray.append(17, 50);
        sparseIntArray.append(18, 51);
        sparseIntArray.append(19, 52);
        sparseIntArray.append(27, 53);
        sparseIntArray.append(99, 54);
        sparseIntArray.append(77, 55);
        sparseIntArray.append(100, 56);
        sparseIntArray.append(78, 57);
        sparseIntArray.append(101, 58);
        sparseIntArray.append(79, 59);
        sparseIntArray.append(1, 38);
    }

    /* JADX INFO: renamed from: f */
    private static int m411f(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: renamed from: g */
    private static final String m412g(int i) {
        switch (i) {
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            default:
                return "end";
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m413a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f271a.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            HashMap map = this.f271a;
            Integer numValueOf = Integer.valueOf(id);
            if (map.containsKey(numValueOf)) {
                hashSet.remove(numValueOf);
                C0005ae c0005ae = (C0005ae) this.f271a.get(numValueOf);
                C0004ad c0004ad = (C0004ad) childAt.getLayoutParams();
                c0005ae.m316a(c0004ad);
                childAt.setLayoutParams(c0004ad);
                childAt.setVisibility(c0005ae.f192G);
                childAt.setAlpha(c0005ae.f203R);
                childAt.setRotationX(c0005ae.f206U);
                childAt.setRotationY(c0005ae.f207V);
                childAt.setScaleX(c0005ae.f208W);
                childAt.setScaleY(c0005ae.f209X);
                childAt.setPivotX(c0005ae.f210Y);
                childAt.setPivotY(c0005ae.f211Z);
                childAt.setTranslationX(c0005ae.f213aa);
                childAt.setTranslationY(c0005ae.f214ab);
                childAt.setTranslationZ(c0005ae.f215ac);
                if (c0005ae.f204S) {
                    childAt.setElevation(c0005ae.f205T);
                }
            }
        }
        for (Integer num : hashSet) {
            C0005ae c0005ae2 = (C0005ae) this.f271a.get(num);
            if (c0005ae2.f212a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                C0004ad c0004adM1016b = ConstraintLayout.m1016b();
                c0005ae2.m316a(c0004adM1016b);
                constraintLayout.addView(guideline, c0004adM1016b);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m414b(int i, int i2) {
        HashMap map = this.f271a;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            C0005ae c0005ae = (C0005ae) this.f271a.get(numValueOf);
            switch (i2) {
                case 3:
                    c0005ae.f233m = -1;
                    c0005ae.f232l = -1;
                    c0005ae.f188C = -1;
                    c0005ae.f194I = -1;
                    break;
                case 4:
                    c0005ae.f234n = -1;
                    c0005ae.f235o = -1;
                    c0005ae.f189D = -1;
                    c0005ae.f196K = -1;
                    break;
                case 5:
                    c0005ae.f236p = -1;
                    break;
                case 6:
                    c0005ae.f237q = -1;
                    c0005ae.f238r = -1;
                    c0005ae.f191F = -1;
                    c0005ae.f198M = -1;
                    break;
                default:
                    c0005ae.f239s = -1;
                    c0005ae.f240t = -1;
                    c0005ae.f190E = -1;
                    c0005ae.f197L = -1;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m415c(int i, int i2, int i3, int i4) {
        HashMap map = this.f271a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.f271a.put(numValueOf, new C0005ae());
        }
        C0005ae c0005ae = (C0005ae) this.f271a.get(numValueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    c0005ae.f232l = i3;
                    c0005ae.f233m = -1;
                    c0005ae.f236p = -1;
                    return;
                } else if (i4 == 4) {
                    c0005ae.f233m = i3;
                    c0005ae.f232l = -1;
                    c0005ae.f236p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    c0005ae.f235o = i3;
                    c0005ae.f234n = -1;
                    c0005ae.f236p = -1;
                    return;
                } else if (i4 == 3) {
                    c0005ae.f234n = i3;
                    c0005ae.f235o = -1;
                    c0005ae.f236p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
                c0005ae.f236p = i3;
                c0005ae.f235o = -1;
                c0005ae.f234n = -1;
                c0005ae.f232l = -1;
                c0005ae.f233m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    c0005ae.f238r = i3;
                    c0005ae.f237q = -1;
                    return;
                } else if (i4 == 7) {
                    c0005ae.f237q = i3;
                    c0005ae.f238r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
            default:
                if (i4 == 7) {
                    c0005ae.f240t = i3;
                    c0005ae.f239s = -1;
                    return;
                } else if (i4 == 6) {
                    c0005ae.f239s = i3;
                    c0005ae.f240t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m416d(int i, int i2, int i3, int i4, int i5) {
        HashMap map = this.f271a;
        Integer numValueOf = Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            this.f271a.put(numValueOf, new C0005ae());
        }
        C0005ae c0005ae = (C0005ae) this.f271a.get(numValueOf);
        switch (i2) {
            case 3:
                if (i4 == 3) {
                    c0005ae.f232l = i3;
                    c0005ae.f233m = -1;
                    c0005ae.f236p = -1;
                } else {
                    if (i4 != 4) {
                        throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                    }
                    c0005ae.f233m = i3;
                    c0005ae.f232l = -1;
                    c0005ae.f236p = -1;
                }
                c0005ae.f188C = i5;
                return;
            case 4:
                if (i4 == 4) {
                    c0005ae.f235o = i3;
                    c0005ae.f234n = -1;
                    c0005ae.f236p = -1;
                } else {
                    if (i4 != 3) {
                        throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                    }
                    c0005ae.f234n = i3;
                    c0005ae.f235o = -1;
                    c0005ae.f236p = -1;
                }
                c0005ae.f189D = i5;
                return;
            case 5:
                if (i4 != 5) {
                    throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                }
                c0005ae.f236p = i3;
                c0005ae.f235o = -1;
                c0005ae.f234n = -1;
                c0005ae.f232l = -1;
                c0005ae.f233m = -1;
                return;
            case 6:
                if (i4 == 6) {
                    c0005ae.f238r = i3;
                    c0005ae.f237q = -1;
                } else {
                    if (i4 != 7) {
                        throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                    }
                    c0005ae.f237q = i3;
                    c0005ae.f238r = -1;
                }
                c0005ae.f191F = i5;
                return;
            default:
                if (i4 == 7) {
                    c0005ae.f240t = i3;
                    c0005ae.f239s = -1;
                } else {
                    if (i4 != 6) {
                        throw new IllegalArgumentException("right to " + m412g(i4) + " undefined");
                    }
                    c0005ae.f239s = i3;
                    c0005ae.f240t = -1;
                }
                c0005ae.f190E = i5;
                return;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m417e(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 0:
                        xml.getName();
                        break;
                    case 2:
                        String name = xml.getName();
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        C0005ae c0005ae = new C0005ae();
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, C0007ag.f291b);
                        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                        for (int i2 = 0; i2 < indexCount; i2++) {
                            int index = typedArrayObtainStyledAttributes.getIndex(i2);
                            SparseIntArray sparseIntArray = f270c;
                            switch (sparseIntArray.get(index)) {
                                case 1:
                                    c0005ae.f236p = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f236p);
                                    break;
                                case 2:
                                    c0005ae.f189D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f189D);
                                    break;
                                case 3:
                                    c0005ae.f235o = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f235o);
                                    break;
                                case 4:
                                    c0005ae.f234n = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f234n);
                                    break;
                                case 5:
                                    c0005ae.f243w = typedArrayObtainStyledAttributes.getString(index);
                                    break;
                                case 6:
                                    c0005ae.f244x = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0005ae.f244x);
                                    break;
                                case 7:
                                    c0005ae.f245y = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0005ae.f245y);
                                    break;
                                case 8:
                                    c0005ae.f190E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f190E);
                                    break;
                                case 9:
                                    c0005ae.f234n = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f240t);
                                    break;
                                case 10:
                                    c0005ae.f239s = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f239s);
                                    break;
                                case 11:
                                    c0005ae.f196K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f196K);
                                    break;
                                case 12:
                                    c0005ae.f197L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f197L);
                                    break;
                                case 13:
                                    c0005ae.f193H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f193H);
                                    break;
                                case 14:
                                    c0005ae.f195J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f195J);
                                    break;
                                case 15:
                                    c0005ae.f198M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f198M);
                                    break;
                                case 16:
                                    c0005ae.f194I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f194I);
                                    break;
                                case 17:
                                    c0005ae.f225e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0005ae.f225e);
                                    break;
                                case 18:
                                    c0005ae.f226f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c0005ae.f226f);
                                    break;
                                case 19:
                                    c0005ae.f227g = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f227g);
                                    break;
                                case 20:
                                    c0005ae.f241u = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f241u);
                                    break;
                                case 21:
                                    c0005ae.f223c = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0005ae.f223c);
                                    break;
                                case 22:
                                    int i3 = typedArrayObtainStyledAttributes.getInt(index, c0005ae.f192G);
                                    c0005ae.f192G = i3;
                                    c0005ae.f192G = f269b[i3];
                                    break;
                                case 23:
                                    c0005ae.f222b = typedArrayObtainStyledAttributes.getLayoutDimension(index, c0005ae.f222b);
                                    break;
                                case 24:
                                    c0005ae.f186A = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f186A);
                                    break;
                                case 25:
                                    c0005ae.f228h = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f228h);
                                    break;
                                case 26:
                                    c0005ae.f229i = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f229i);
                                    break;
                                case 27:
                                    c0005ae.f246z = typedArrayObtainStyledAttributes.getInt(index, c0005ae.f246z);
                                    break;
                                case 28:
                                    c0005ae.f187B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f187B);
                                    break;
                                case 29:
                                    c0005ae.f230j = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f230j);
                                    break;
                                case 30:
                                    c0005ae.f231k = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f231k);
                                    break;
                                case 31:
                                    c0005ae.f191F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f191F);
                                    break;
                                case 32:
                                    c0005ae.f237q = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f237q);
                                    break;
                                case 33:
                                    c0005ae.f238r = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f238r);
                                    break;
                                case 34:
                                    c0005ae.f188C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c0005ae.f188C);
                                    break;
                                case 35:
                                    c0005ae.f233m = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f233m);
                                    break;
                                case 36:
                                    c0005ae.f232l = m411f(typedArrayObtainStyledAttributes, index, c0005ae.f232l);
                                    break;
                                case 37:
                                    c0005ae.f242v = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f242v);
                                    break;
                                case 38:
                                    c0005ae.f224d = typedArrayObtainStyledAttributes.getResourceId(index, c0005ae.f224d);
                                    break;
                                case 39:
                                    c0005ae.f200O = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f200O);
                                    break;
                                case 40:
                                    c0005ae.f199N = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f199N);
                                    break;
                                case 41:
                                    c0005ae.f201P = typedArrayObtainStyledAttributes.getInt(index, c0005ae.f201P);
                                    break;
                                case 42:
                                    c0005ae.f202Q = typedArrayObtainStyledAttributes.getInt(index, c0005ae.f202Q);
                                    break;
                                case 43:
                                    c0005ae.f203R = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f203R);
                                    break;
                                case 44:
                                    c0005ae.f204S = true;
                                    c0005ae.f205T = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f205T);
                                    break;
                                case 45:
                                    c0005ae.f206U = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f206U);
                                    break;
                                case 46:
                                    c0005ae.f207V = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f207V);
                                    break;
                                case 47:
                                    c0005ae.f208W = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f208W);
                                    break;
                                case 48:
                                    c0005ae.f209X = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f209X);
                                    break;
                                case 49:
                                    c0005ae.f210Y = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f210Y);
                                    break;
                                case 50:
                                    c0005ae.f211Z = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f211Z);
                                    break;
                                case 51:
                                    c0005ae.f213aa = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f213aa);
                                    break;
                                case 52:
                                    c0005ae.f214ab = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f214ab);
                                    break;
                                case 53:
                                    c0005ae.f215ac = typedArrayObtainStyledAttributes.getFloat(index, c0005ae.f215ac);
                                    break;
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                case 58:
                                case 59:
                                default:
                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                                case 60:
                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                    break;
                            }
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        if (name.equalsIgnoreCase("Guideline")) {
                            c0005ae.f212a = true;
                        }
                        this.f271a.put(Integer.valueOf(c0005ae.f224d), c0005ae);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
