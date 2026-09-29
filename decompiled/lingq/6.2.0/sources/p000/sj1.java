package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.AbstractC0475b;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.R$id;
import androidx.constraintlayout.widget.R$styleable;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class sj1 {

    /* JADX INFO: renamed from: h */
    public static final int[] f60913h = {0, 4, 8};

    /* JADX INFO: renamed from: i */
    public static final SparseIntArray f60914i;

    /* JADX INFO: renamed from: j */
    public static final SparseIntArray f60915j;

    /* JADX INFO: renamed from: a */
    public String f60916a;

    /* JADX INFO: renamed from: b */
    public String f60917b = "";

    /* JADX INFO: renamed from: c */
    public String[] f60918c = new String[0];

    /* JADX INFO: renamed from: d */
    public int f60919d = 0;

    /* JADX INFO: renamed from: e */
    public final HashMap f60920e = new HashMap();

    /* JADX INFO: renamed from: f */
    public boolean f60921f = true;

    /* JADX INFO: renamed from: g */
    public final HashMap f60922g = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f60914i = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f60915j = sparseIntArray2;
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(R$styleable.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(R$styleable.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(R$styleable.Constraint_android_orientation, 27);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(R$styleable.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(R$styleable.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(R$styleable.Constraint_android_layout_width, 23);
        sparseIntArray.append(R$styleable.Constraint_android_layout_height, 21);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(R$styleable.Constraint_android_visibility, 22);
        sparseIntArray.append(R$styleable.Constraint_android_alpha, 43);
        sparseIntArray.append(R$styleable.Constraint_android_elevation, 44);
        sparseIntArray.append(R$styleable.Constraint_android_rotationX, 45);
        sparseIntArray.append(R$styleable.Constraint_android_rotationY, 46);
        sparseIntArray.append(R$styleable.Constraint_android_rotation, 60);
        sparseIntArray.append(R$styleable.Constraint_android_scaleX, 47);
        sparseIntArray.append(R$styleable.Constraint_android_scaleY, 48);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(R$styleable.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(R$styleable.Constraint_android_translationX, 51);
        sparseIntArray.append(R$styleable.Constraint_android_translationY, 52);
        sparseIntArray.append(R$styleable.Constraint_android_translationZ, 53);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(R$styleable.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(R$styleable.Constraint_transitionEasing, 65);
        sparseIntArray.append(R$styleable.Constraint_drawPath, 66);
        sparseIntArray.append(R$styleable.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(R$styleable.Constraint_motionStagger, 79);
        sparseIntArray.append(R$styleable.Constraint_android_id, 38);
        sparseIntArray.append(R$styleable.Constraint_motionProgress, 68);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(R$styleable.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(R$styleable.Constraint_chainUseRtl, 71);
        sparseIntArray.append(R$styleable.Constraint_barrierDirection, 72);
        sparseIntArray.append(R$styleable.Constraint_barrierMargin, 73);
        sparseIntArray.append(R$styleable.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(R$styleable.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(R$styleable.Constraint_pathMotionArc, 76);
        sparseIntArray.append(R$styleable.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(R$styleable.Constraint_visibilityMode, 78);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(R$styleable.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(R$styleable.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(R$styleable.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(R$styleable.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(R$styleable.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(R$styleable.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(R$styleable.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(R$styleable.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(R$styleable.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(R$styleable.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(R$styleable.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(R$styleable.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(R$styleable.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(R$styleable.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(R$styleable.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(R$styleable.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(R$styleable.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(R$styleable.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(R$styleable.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(R$styleable.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(R$styleable.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(R$styleable.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(R$styleable.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(R$styleable.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(R$styleable.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    /* JADX INFO: renamed from: d */
    public static nj1 m21400d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        nj1 nj1Var = new nj1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R$styleable.ConstraintOverride);
        m21406o(nj1Var, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return nj1Var;
    }

    /* JADX INFO: renamed from: f */
    public static int[] m21401f(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i = 0;
        int i2 = 0;
        while (i < strArrSplit.length) {
            String strTrim = strArrSplit[i].trim();
            Object obj = null;
            try {
                iIntValue = R$id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.f5446H;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f5446H.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i2] = iIntValue;
            i++;
            i2++;
        }
        return i2 != strArrSplit.length ? Arrays.copyOf(iArr, i2) : iArr;
    }

    /* JADX INFO: renamed from: g */
    public static nj1 m21402g(Context context, AttributeSet attributeSet, boolean z) {
        nj1 nj1Var = new nj1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R$styleable.ConstraintOverride : R$styleable.Constraint);
        if (z) {
            m21406o(nj1Var, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i = 0;
            while (true) {
                oj1 oj1Var = nj1Var.f52823e;
                if (i < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    int i2 = R$styleable.Constraint_android_id;
                    qj1 qj1Var = nj1Var.f52821c;
                    rj1 rj1Var = nj1Var.f52824f;
                    pj1 pj1Var = nj1Var.f52822d;
                    if (index != i2 && R$styleable.Constraint_android_layout_marginStart != index && R$styleable.Constraint_android_layout_marginEnd != index) {
                        pj1Var.f56297a = true;
                        oj1Var.f54418b = true;
                        qj1Var.f57843a = true;
                        rj1Var.f59387a = true;
                    }
                    SparseIntArray sparseIntArray = f60914i;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            oj1Var.f54448q = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54448q);
                            break;
                        case 2:
                            oj1Var.f54399J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54399J);
                            break;
                        case 3:
                            oj1Var.f54446p = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54446p);
                            break;
                        case 4:
                            oj1Var.f54444o = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54444o);
                            break;
                        case 5:
                            oj1Var.f54457z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            oj1Var.f54393D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oj1Var.f54393D);
                            break;
                        case 7:
                            oj1Var.f54394E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oj1Var.f54394E);
                            break;
                        case 8:
                            oj1Var.f54400K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54400K);
                            break;
                        case 9:
                            oj1Var.f54454w = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54454w);
                            break;
                        case 10:
                            oj1Var.f54453v = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54453v);
                            break;
                        case 11:
                            oj1Var.f54406Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54406Q);
                            break;
                        case 12:
                            oj1Var.f54407R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54407R);
                            break;
                        case 13:
                            oj1Var.f54403N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54403N);
                            break;
                        case 14:
                            oj1Var.f54405P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54405P);
                            break;
                        case 15:
                            oj1Var.f54408S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54408S);
                            break;
                        case 16:
                            oj1Var.f54404O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54404O);
                            break;
                        case 17:
                            oj1Var.f54424e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oj1Var.f54424e);
                            break;
                        case 18:
                            oj1Var.f54426f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, oj1Var.f54426f);
                            break;
                        case 19:
                            oj1Var.f54428g = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54428g);
                            break;
                        case 20:
                            oj1Var.f54455x = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54455x);
                            break;
                        case 21:
                            oj1Var.f54422d = typedArrayObtainStyledAttributes.getLayoutDimension(index, oj1Var.f54422d);
                            break;
                        case 22:
                            int i3 = typedArrayObtainStyledAttributes.getInt(index, qj1Var.f57844b);
                            qj1Var.f57844b = i3;
                            qj1Var.f57844b = f60913h[i3];
                            break;
                        case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                            oj1Var.f54420c = typedArrayObtainStyledAttributes.getLayoutDimension(index, oj1Var.f54420c);
                            break;
                        case 24:
                            oj1Var.f54396G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54396G);
                            break;
                        case 25:
                            oj1Var.f54432i = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54432i);
                            break;
                        case 26:
                            oj1Var.f54434j = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54434j);
                            break;
                        case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                            oj1Var.f54395F = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54395F);
                            break;
                        case 28:
                            oj1Var.f54397H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54397H);
                            break;
                        case 29:
                            oj1Var.f54436k = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54436k);
                            break;
                        case 30:
                            oj1Var.f54438l = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54438l);
                            break;
                        case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                            oj1Var.f54401L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54401L);
                            break;
                        case 32:
                            oj1Var.f54451t = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54451t);
                            break;
                        case 33:
                            oj1Var.f54452u = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54452u);
                            break;
                        case 34:
                            oj1Var.f54398I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54398I);
                            break;
                        case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                            oj1Var.f54442n = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54442n);
                            break;
                        case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                            oj1Var.f54440m = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54440m);
                            break;
                        case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                            oj1Var.f54456y = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54456y);
                            break;
                        case 38:
                            nj1Var.f52819a = typedArrayObtainStyledAttributes.getResourceId(index, nj1Var.f52819a);
                            break;
                        case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                            oj1Var.f54411V = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54411V);
                            break;
                        case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                            oj1Var.f54410U = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54410U);
                            break;
                        case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                            oj1Var.f54412W = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54412W);
                            break;
                        case 42:
                            oj1Var.f54413X = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54413X);
                            break;
                        case 43:
                            qj1Var.f57846d = typedArrayObtainStyledAttributes.getFloat(index, qj1Var.f57846d);
                            break;
                        case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                            rj1Var.f59399m = true;
                            rj1Var.f59400n = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59400n);
                            break;
                        case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                            rj1Var.f59389c = typedArrayObtainStyledAttributes.getFloat(index, rj1Var.f59389c);
                            break;
                        case 46:
                            rj1Var.f59390d = typedArrayObtainStyledAttributes.getFloat(index, rj1Var.f59390d);
                            break;
                        case 47:
                            rj1Var.f59391e = typedArrayObtainStyledAttributes.getFloat(index, rj1Var.f59391e);
                            break;
                        case eda.f37086g /* 48 */:
                            rj1Var.f59392f = typedArrayObtainStyledAttributes.getFloat(index, rj1Var.f59392f);
                            break;
                        case 49:
                            rj1Var.f59393g = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59393g);
                            break;
                        case 50:
                            rj1Var.f59394h = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59394h);
                            break;
                        case 51:
                            rj1Var.f59396j = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59396j);
                            break;
                        case 52:
                            rj1Var.f59397k = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59397k);
                            break;
                        case 53:
                            rj1Var.f59398l = typedArrayObtainStyledAttributes.getDimension(index, rj1Var.f59398l);
                            break;
                        case 54:
                            oj1Var.f54414Y = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54414Y);
                            break;
                        case 55:
                            oj1Var.f54415Z = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54415Z);
                            break;
                        case 56:
                            oj1Var.f54417a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54417a0);
                            break;
                        case 57:
                            oj1Var.f54419b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54419b0);
                            break;
                        case 58:
                            oj1Var.f54421c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54421c0);
                            break;
                        case 59:
                            oj1Var.f54423d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54423d0);
                            break;
                        case 60:
                            rj1Var.f59388b = typedArrayObtainStyledAttributes.getFloat(index, rj1Var.f59388b);
                            break;
                        case 61:
                            oj1Var.f54390A = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54390A);
                            break;
                        case 62:
                            oj1Var.f54391B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54391B);
                            break;
                        case 63:
                            oj1Var.f54392C = typedArrayObtainStyledAttributes.getFloat(index, oj1Var.f54392C);
                            break;
                        case 64:
                            pj1Var.f56298b = m21403l(typedArrayObtainStyledAttributes, index, pj1Var.f56298b);
                            break;
                        case 65:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                pj1Var.f56300d = fo2.f39362d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                pj1Var.f56300d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case 66:
                            pj1Var.f56302f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            pj1Var.f56304h = typedArrayObtainStyledAttributes.getFloat(index, pj1Var.f56304h);
                            break;
                        case 68:
                            qj1Var.f57847e = typedArrayObtainStyledAttributes.getFloat(index, qj1Var.f57847e);
                            break;
                        case 69:
                            oj1Var.f54425e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            oj1Var.f54427f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            oj1Var.f54429g0 = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54429g0);
                            break;
                        case 73:
                            oj1Var.f54431h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54431h0);
                            break;
                        case 74:
                            oj1Var.f54437k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            oj1Var.f54445o0 = typedArrayObtainStyledAttributes.getBoolean(index, oj1Var.f54445o0);
                            break;
                        case 76:
                            pj1Var.f56301e = typedArrayObtainStyledAttributes.getInt(index, pj1Var.f56301e);
                            break;
                        case 77:
                            oj1Var.f54439l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            qj1Var.f57845c = typedArrayObtainStyledAttributes.getInt(index, qj1Var.f57845c);
                            break;
                        case 79:
                            pj1Var.f56303g = typedArrayObtainStyledAttributes.getFloat(index, pj1Var.f56303g);
                            break;
                        case 80:
                            oj1Var.f54441m0 = typedArrayObtainStyledAttributes.getBoolean(index, oj1Var.f54441m0);
                            break;
                        case 81:
                            oj1Var.f54443n0 = typedArrayObtainStyledAttributes.getBoolean(index, oj1Var.f54443n0);
                            break;
                        case 82:
                            pj1Var.f56299c = typedArrayObtainStyledAttributes.getInteger(index, pj1Var.f56299c);
                            break;
                        case 83:
                            rj1Var.f59395i = m21403l(typedArrayObtainStyledAttributes, index, rj1Var.f59395i);
                            break;
                        case 84:
                            pj1Var.f56306j = typedArrayObtainStyledAttributes.getInteger(index, pj1Var.f56306j);
                            break;
                        case 85:
                            pj1Var.f56305i = typedArrayObtainStyledAttributes.getFloat(index, pj1Var.f56305i);
                            break;
                        case 86:
                            int i4 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i4 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                pj1Var.f56309m = resourceId;
                                if (resourceId != -1) {
                                    pj1Var.f56308l = -2;
                                }
                            } else if (i4 != 3) {
                                pj1Var.f56308l = typedArrayObtainStyledAttributes.getInteger(index, pj1Var.f56309m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                pj1Var.f56307k = string;
                                if (string.indexOf("/") <= 0) {
                                    pj1Var.f56308l = -1;
                                } else {
                                    pj1Var.f56309m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    pj1Var.f56308l = -2;
                                }
                            }
                            break;
                        case 87:
                            Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                            break;
                        case 91:
                            oj1Var.f54449r = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54449r);
                            break;
                        case 92:
                            oj1Var.f54450s = m21403l(typedArrayObtainStyledAttributes, index, oj1Var.f54450s);
                            break;
                        case 93:
                            oj1Var.f54402M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54402M);
                            break;
                        case 94:
                            oj1Var.f54409T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, oj1Var.f54409T);
                            break;
                        case 95:
                            m21404m(oj1Var, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            m21404m(oj1Var, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            oj1Var.f54447p0 = typedArrayObtainStyledAttributes.getInt(index, oj1Var.f54447p0);
                            break;
                    }
                    i++;
                } else if (oj1Var.f54437k0 != null) {
                    oj1Var.f54435j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return nj1Var;
    }

    /* JADX INFO: renamed from: l */
    public static int m21403l(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    /* JADX INFO: renamed from: m */
    public static void m21404m(Object obj, TypedArray typedArray, int i, int i2) {
        int dimensionPixelSize;
        mj1 mj1Var;
        oj1 oj1Var;
        hj1 hj1Var;
        if (obj == null) {
            return;
        }
        int i3 = typedArray.peekValue(i).type;
        boolean z = true;
        int i4 = 0;
        if (i3 != 3) {
            if (i3 != 5) {
                dimensionPixelSize = typedArray.getInt(i, 0);
                if (dimensionPixelSize == -4) {
                    i4 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z = false;
                }
                if (obj instanceof hj1) {
                    hj1Var = (hj1) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) hj1Var).width = i4;
                        hj1Var.f42438W = z;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) hj1Var).height = i4;
                        hj1Var.f42439X = z;
                        return;
                    }
                }
                if (obj instanceof oj1) {
                    oj1Var = (oj1) obj;
                    if (i2 == 0) {
                        oj1Var.f54420c = i4;
                        oj1Var.f54441m0 = z;
                        return;
                    } else {
                        oj1Var.f54422d = i4;
                        oj1Var.f54443n0 = z;
                        return;
                    }
                }
                if (obj instanceof mj1) {
                    mj1Var = (mj1) obj;
                    if (i2 == 0) {
                        mj1Var.m16851b(23, i4);
                        mj1Var.m16853d(80, z);
                        return;
                    } else {
                        mj1Var.m16851b(21, i4);
                        mj1Var.m16853d(81, z);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i, 0);
            z = false;
            i4 = dimensionPixelSize;
            if (obj instanceof hj1) {
                hj1Var = (hj1) obj;
                if (i2 == 0) {
                    ((ViewGroup.MarginLayoutParams) hj1Var).width = i4;
                    hj1Var.f42438W = z;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) hj1Var).height = i4;
                    hj1Var.f42439X = z;
                    return;
                }
            }
            if (obj instanceof oj1) {
                oj1Var = (oj1) obj;
                if (i2 == 0) {
                    oj1Var.f54420c = i4;
                    oj1Var.f54441m0 = z;
                    return;
                } else {
                    oj1Var.f54422d = i4;
                    oj1Var.f54443n0 = z;
                    return;
                }
            }
            if (obj instanceof mj1) {
                mj1Var = (mj1) obj;
                if (i2 == 0) {
                    mj1Var.m16851b(23, i4);
                    mj1Var.m16853d(80, z);
                    return;
                } else {
                    mj1Var.m16851b(21, i4);
                    mj1Var.m16853d(81, z);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i);
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
                if (obj instanceof hj1) {
                    hj1 hj1Var2 = (hj1) obj;
                    if (i2 == 0) {
                        ((ViewGroup.MarginLayoutParams) hj1Var2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) hj1Var2).height = 0;
                    }
                    m21405n(hj1Var2, strTrim2);
                    return;
                }
                if (obj instanceof oj1) {
                    ((oj1) obj).f54457z = strTrim2;
                    return;
                } else {
                    if (obj instanceof mj1) {
                        ((mj1) obj).m16852c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f = Float.parseFloat(strTrim2);
                    if (obj instanceof hj1) {
                        hj1 hj1Var3 = (hj1) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) hj1Var3).width = 0;
                            hj1Var3.f42423H = f;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) hj1Var3).height = 0;
                            hj1Var3.f42424I = f;
                            return;
                        }
                    }
                    if (obj instanceof oj1) {
                        oj1 oj1Var2 = (oj1) obj;
                        if (i2 == 0) {
                            oj1Var2.f54420c = 0;
                            oj1Var2.f54411V = f;
                            return;
                        } else {
                            oj1Var2.f54422d = 0;
                            oj1Var2.f54410U = f;
                            return;
                        }
                    }
                    if (obj instanceof mj1) {
                        mj1 mj1Var2 = (mj1) obj;
                        if (i2 == 0) {
                            mj1Var2.m16851b(23, 0);
                            mj1Var2.m16850a(39, f);
                            return;
                        } else {
                            mj1Var2.m16851b(21, 0);
                            mj1Var2.m16850a(40, f);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof hj1) {
                        hj1 hj1Var4 = (hj1) obj;
                        if (i2 == 0) {
                            ((ViewGroup.MarginLayoutParams) hj1Var4).width = 0;
                            hj1Var4.f42433R = fMax;
                            hj1Var4.f42427L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) hj1Var4).height = 0;
                            hj1Var4.f42434S = fMax;
                            hj1Var4.f42428M = 2;
                            return;
                        }
                    }
                    if (obj instanceof oj1) {
                        oj1 oj1Var3 = (oj1) obj;
                        if (i2 == 0) {
                            oj1Var3.f54420c = 0;
                            oj1Var3.f54425e0 = fMax;
                            oj1Var3.f54414Y = 2;
                            return;
                        } else {
                            oj1Var3.f54422d = 0;
                            oj1Var3.f54427f0 = fMax;
                            oj1Var3.f54415Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof mj1) {
                        mj1 mj1Var3 = (mj1) obj;
                        if (i2 == 0) {
                            mj1Var3.m16851b(23, 0);
                            mj1Var3.m16851b(54, 2);
                        } else {
                            mj1Var3.m16851b(21, 0);
                            mj1Var3.m16851b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m21405n(hj1 hj1Var, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i = 0;
            int i2 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i2 = i;
                i = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f = Float.parseFloat(strSubstring3);
                        float f2 = Float.parseFloat(strSubstring4);
                        if (f > 0.0f && f2 > 0.0f) {
                            if (i2 == 1) {
                                Math.abs(f2 / f);
                            } else {
                                Math.abs(f / f2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        hj1Var.f42422G = str;
    }

    /* JADX INFO: renamed from: o */
    public static void m21406o(nj1 nj1Var, TypedArray typedArray) {
        boolean z;
        int indexCount = typedArray.getIndexCount();
        mj1 mj1Var = new mj1();
        nj1Var.f52826h = mj1Var;
        pj1 pj1Var = nj1Var.f52822d;
        pj1Var.f56297a = false;
        oj1 oj1Var = nj1Var.f52823e;
        oj1Var.f54418b = false;
        qj1 qj1Var = nj1Var.f52821c;
        qj1Var.f57843a = false;
        rj1 rj1Var = nj1Var.f52824f;
        rj1Var.f59387a = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            int i2 = f60915j.get(index);
            SparseIntArray sparseIntArray = f60914i;
            switch (i2) {
                case 2:
                    z = false;
                    mj1Var.m16851b(2, typedArray.getDimensionPixelSize(index, oj1Var.f54399J));
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
                case DescriptorProtos.MethodOptions.FEATURES_FIELD_NUMBER /* 35 */:
                case DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER /* 36 */:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 5:
                    z = false;
                    mj1Var.m16852c(5, typedArray.getString(index));
                    continue;
                    break;
                case 6:
                    z = false;
                    mj1Var.m16851b(6, typedArray.getDimensionPixelOffset(index, oj1Var.f54393D));
                    continue;
                    break;
                case 7:
                    z = false;
                    mj1Var.m16851b(7, typedArray.getDimensionPixelOffset(index, oj1Var.f54394E));
                    continue;
                    break;
                case 8:
                    z = false;
                    mj1Var.m16851b(8, typedArray.getDimensionPixelSize(index, oj1Var.f54400K));
                    continue;
                    break;
                case 11:
                    z = false;
                    mj1Var.m16851b(11, typedArray.getDimensionPixelSize(index, oj1Var.f54406Q));
                    continue;
                    break;
                case 12:
                    z = false;
                    mj1Var.m16851b(12, typedArray.getDimensionPixelSize(index, oj1Var.f54407R));
                    continue;
                    break;
                case 13:
                    z = false;
                    mj1Var.m16851b(13, typedArray.getDimensionPixelSize(index, oj1Var.f54403N));
                    continue;
                    break;
                case 14:
                    z = false;
                    mj1Var.m16851b(14, typedArray.getDimensionPixelSize(index, oj1Var.f54405P));
                    continue;
                    break;
                case 15:
                    z = false;
                    mj1Var.m16851b(15, typedArray.getDimensionPixelSize(index, oj1Var.f54408S));
                    continue;
                    break;
                case 16:
                    z = false;
                    mj1Var.m16851b(16, typedArray.getDimensionPixelSize(index, oj1Var.f54404O));
                    continue;
                    break;
                case 17:
                    z = false;
                    mj1Var.m16851b(17, typedArray.getDimensionPixelOffset(index, oj1Var.f54424e));
                    continue;
                    break;
                case 18:
                    z = false;
                    mj1Var.m16851b(18, typedArray.getDimensionPixelOffset(index, oj1Var.f54426f));
                    continue;
                    break;
                case 19:
                    z = false;
                    mj1Var.m16850a(19, typedArray.getFloat(index, oj1Var.f54428g));
                    continue;
                    break;
                case 20:
                    z = false;
                    mj1Var.m16850a(20, typedArray.getFloat(index, oj1Var.f54455x));
                    continue;
                    break;
                case 21:
                    z = false;
                    mj1Var.m16851b(21, typedArray.getLayoutDimension(index, oj1Var.f54422d));
                    continue;
                    break;
                case 22:
                    z = false;
                    mj1Var.m16851b(22, f60913h[typedArray.getInt(index, qj1Var.f57844b)]);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                    z = false;
                    mj1Var.m16851b(23, typedArray.getLayoutDimension(index, oj1Var.f54420c));
                    continue;
                    break;
                case 24:
                    z = false;
                    mj1Var.m16851b(24, typedArray.getDimensionPixelSize(index, oj1Var.f54396G));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    z = false;
                    mj1Var.m16851b(27, typedArray.getInt(index, oj1Var.f54395F));
                    continue;
                    break;
                case 28:
                    z = false;
                    mj1Var.m16851b(28, typedArray.getDimensionPixelSize(index, oj1Var.f54397H));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER /* 31 */:
                    z = false;
                    mj1Var.m16851b(31, typedArray.getDimensionPixelSize(index, oj1Var.f54401L));
                    continue;
                    break;
                case 34:
                    z = false;
                    mj1Var.m16851b(34, typedArray.getDimensionPixelSize(index, oj1Var.f54398I));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER /* 37 */:
                    z = false;
                    mj1Var.m16850a(37, typedArray.getFloat(index, oj1Var.f54456y));
                    continue;
                    break;
                case 38:
                    z = false;
                    int resourceId = typedArray.getResourceId(index, nj1Var.f52819a);
                    nj1Var.f52819a = resourceId;
                    mj1Var.m16851b(38, resourceId);
                    continue;
                    break;
                case DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER /* 39 */:
                    z = false;
                    mj1Var.m16850a(39, typedArray.getFloat(index, oj1Var.f54411V));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER /* 40 */:
                    z = false;
                    mj1Var.m16850a(40, typedArray.getFloat(index, oj1Var.f54410U));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.PHP_NAMESPACE_FIELD_NUMBER /* 41 */:
                    z = false;
                    mj1Var.m16851b(41, typedArray.getInt(index, oj1Var.f54412W));
                    continue;
                    break;
                case 42:
                    z = false;
                    mj1Var.m16851b(42, typedArray.getInt(index, oj1Var.f54413X));
                    continue;
                    break;
                case 43:
                    z = false;
                    mj1Var.m16850a(43, typedArray.getFloat(index, qj1Var.f57846d));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                    z = false;
                    mj1Var.m16853d(44, true);
                    mj1Var.m16850a(44, typedArray.getDimension(index, rj1Var.f59400n));
                    continue;
                    break;
                case DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                    z = false;
                    mj1Var.m16850a(45, typedArray.getFloat(index, rj1Var.f59389c));
                    continue;
                    break;
                case 46:
                    z = false;
                    mj1Var.m16850a(46, typedArray.getFloat(index, rj1Var.f59390d));
                    continue;
                    break;
                case 47:
                    z = false;
                    mj1Var.m16850a(47, typedArray.getFloat(index, rj1Var.f59391e));
                    continue;
                    break;
                case eda.f37086g /* 48 */:
                    z = false;
                    mj1Var.m16850a(48, typedArray.getFloat(index, rj1Var.f59392f));
                    continue;
                    break;
                case 49:
                    z = false;
                    mj1Var.m16850a(49, typedArray.getDimension(index, rj1Var.f59393g));
                    continue;
                    break;
                case 50:
                    z = false;
                    mj1Var.m16850a(50, typedArray.getDimension(index, rj1Var.f59394h));
                    continue;
                    break;
                case 51:
                    z = false;
                    mj1Var.m16850a(51, typedArray.getDimension(index, rj1Var.f59396j));
                    continue;
                    break;
                case 52:
                    z = false;
                    mj1Var.m16850a(52, typedArray.getDimension(index, rj1Var.f59397k));
                    continue;
                    break;
                case 53:
                    z = false;
                    mj1Var.m16850a(53, typedArray.getDimension(index, rj1Var.f59398l));
                    continue;
                    break;
                case 54:
                    z = false;
                    mj1Var.m16851b(54, typedArray.getInt(index, oj1Var.f54414Y));
                    continue;
                    break;
                case 55:
                    z = false;
                    mj1Var.m16851b(55, typedArray.getInt(index, oj1Var.f54415Z));
                    continue;
                    break;
                case 56:
                    z = false;
                    mj1Var.m16851b(56, typedArray.getDimensionPixelSize(index, oj1Var.f54417a0));
                    continue;
                    break;
                case 57:
                    z = false;
                    mj1Var.m16851b(57, typedArray.getDimensionPixelSize(index, oj1Var.f54419b0));
                    continue;
                    break;
                case 58:
                    z = false;
                    mj1Var.m16851b(58, typedArray.getDimensionPixelSize(index, oj1Var.f54421c0));
                    continue;
                    break;
                case 59:
                    z = false;
                    mj1Var.m16851b(59, typedArray.getDimensionPixelSize(index, oj1Var.f54423d0));
                    continue;
                    break;
                case 60:
                    z = false;
                    mj1Var.m16850a(60, typedArray.getFloat(index, rj1Var.f59388b));
                    continue;
                    break;
                case 62:
                    z = false;
                    mj1Var.m16851b(62, typedArray.getDimensionPixelSize(index, oj1Var.f54391B));
                    continue;
                    break;
                case 63:
                    z = false;
                    mj1Var.m16850a(63, typedArray.getFloat(index, oj1Var.f54392C));
                    continue;
                    break;
                case 64:
                    z = false;
                    mj1Var.m16851b(64, m21403l(typedArray, index, pj1Var.f56298b));
                    continue;
                    break;
                case 65:
                    z = false;
                    if (typedArray.peekValue(index).type == 3) {
                        mj1Var.m16852c(65, typedArray.getString(index));
                        continue;
                    } else {
                        mj1Var.m16852c(65, fo2.f39362d[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    z = false;
                    mj1Var.m16851b(66, typedArray.getInt(index, 0));
                    continue;
                    break;
                case 67:
                    mj1Var.m16850a(67, typedArray.getFloat(index, pj1Var.f56304h));
                    break;
                case 68:
                    mj1Var.m16850a(68, typedArray.getFloat(index, qj1Var.f57847e));
                    break;
                case 69:
                    mj1Var.m16850a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    mj1Var.m16850a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    mj1Var.m16851b(72, typedArray.getInt(index, oj1Var.f54429g0));
                    break;
                case 73:
                    mj1Var.m16851b(73, typedArray.getDimensionPixelSize(index, oj1Var.f54431h0));
                    break;
                case 74:
                    mj1Var.m16852c(74, typedArray.getString(index));
                    break;
                case 75:
                    mj1Var.m16853d(75, typedArray.getBoolean(index, oj1Var.f54445o0));
                    break;
                case 76:
                    mj1Var.m16851b(76, typedArray.getInt(index, pj1Var.f56301e));
                    break;
                case 77:
                    mj1Var.m16852c(77, typedArray.getString(index));
                    break;
                case 78:
                    mj1Var.m16851b(78, typedArray.getInt(index, qj1Var.f57845c));
                    break;
                case 79:
                    mj1Var.m16850a(79, typedArray.getFloat(index, pj1Var.f56303g));
                    break;
                case 80:
                    mj1Var.m16853d(80, typedArray.getBoolean(index, oj1Var.f54441m0));
                    break;
                case 81:
                    mj1Var.m16853d(81, typedArray.getBoolean(index, oj1Var.f54443n0));
                    break;
                case 82:
                    mj1Var.m16851b(82, typedArray.getInteger(index, pj1Var.f56299c));
                    break;
                case 83:
                    mj1Var.m16851b(83, m21403l(typedArray, index, rj1Var.f59395i));
                    break;
                case 84:
                    mj1Var.m16851b(84, typedArray.getInteger(index, pj1Var.f56306j));
                    break;
                case 85:
                    mj1Var.m16850a(85, typedArray.getFloat(index, pj1Var.f56305i));
                    break;
                case 86:
                    int i3 = typedArray.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        pj1Var.f56309m = resourceId2;
                        mj1Var.m16851b(89, resourceId2);
                        if (pj1Var.f56309m != -1) {
                            pj1Var.f56308l = -2;
                            mj1Var.m16851b(88, -2);
                        }
                    } else if (i3 == 3) {
                        String string = typedArray.getString(index);
                        pj1Var.f56307k = string;
                        mj1Var.m16852c(90, string);
                        if (pj1Var.f56307k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            pj1Var.f56309m = resourceId3;
                            mj1Var.m16851b(89, resourceId3);
                            pj1Var.f56308l = -2;
                            mj1Var.m16851b(88, -2);
                        } else {
                            pj1Var.f56308l = -1;
                            mj1Var.m16851b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, pj1Var.f56309m);
                        pj1Var.f56308l = integer;
                        mj1Var.m16851b(88, integer);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 93:
                    mj1Var.m16851b(93, typedArray.getDimensionPixelSize(index, oj1Var.f54402M));
                    break;
                case 94:
                    mj1Var.m16851b(94, typedArray.getDimensionPixelSize(index, oj1Var.f54409T));
                    break;
                case 95:
                    m21404m(mj1Var, typedArray, index, 0);
                    z = false;
                    continue;
                    break;
                case 96:
                    m21404m(mj1Var, typedArray, index, 1);
                    break;
                case 97:
                    mj1Var.m16851b(97, typedArray.getInt(index, oj1Var.f54447p0));
                    break;
                case 98:
                    if (AbstractC0475b.f5366S0) {
                        int resourceId4 = typedArray.getResourceId(index, nj1Var.f52819a);
                        nj1Var.f52819a = resourceId4;
                        if (resourceId4 == -1) {
                            nj1Var.f52820b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        nj1Var.f52820b = typedArray.getString(index);
                    } else {
                        nj1Var.f52819a = typedArray.getResourceId(index, nj1Var.f52819a);
                    }
                    break;
                case 99:
                    mj1Var.m16853d(99, typedArray.getBoolean(index, oj1Var.f54430h));
                    break;
            }
            z = false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21407a(AbstractC0475b abstractC0475b) {
        nj1 nj1Var;
        int childCount = abstractC0475b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = abstractC0475b.getChildAt(i);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f60922g;
            if (!map.containsKey(numValueOf)) {
                Log.w("ConstraintSet", "id unknown " + qad.m19842d(childAt));
            } else if (this.f60921f && id == -1) {
                ho2.m13385e("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            } else if (map.containsKey(Integer.valueOf(id)) && (nj1Var = (nj1) map.get(Integer.valueOf(id))) != null) {
                cj1.m4764f(childAt, nj1Var.f52825g);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21408b(ConstraintLayout constraintLayout) {
        m21409c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    /* JADX INFO: renamed from: c */
    public final void m21409c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f60922g;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + qad.m19842d(childAt));
            } else {
                if (this.f60921f && id == -1) {
                    ho2.m13385e("All children of ConstraintLayout must have ids to use ConstraintSet");
                    return;
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        nj1 nj1Var = (nj1) map.get(Integer.valueOf(id));
                        if (nj1Var != null) {
                            qj1 qj1Var = nj1Var.f52821c;
                            oj1 oj1Var = nj1Var.f52823e;
                            rj1 rj1Var = nj1Var.f52824f;
                            if (childAt instanceof Barrier) {
                                oj1Var.f54433i0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(oj1Var.f54429g0);
                                barrier.setMargin(oj1Var.f54431h0);
                                barrier.setAllowsGoneWidget(oj1Var.f54445o0);
                                int[] iArr = oj1Var.f54435j0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = oj1Var.f54437k0;
                                    if (str != null) {
                                        int[] iArrM21401f = m21401f(barrier, str);
                                        oj1Var.f54435j0 = iArrM21401f;
                                        barrier.setReferencedIds(iArrM21401f);
                                    }
                                }
                            }
                            hj1 hj1Var = (hj1) childAt.getLayoutParams();
                            hj1Var.m13292a();
                            nj1Var.m17457b(hj1Var);
                            cj1.m4764f(childAt, nj1Var.f52825g);
                            childAt.setLayoutParams(hj1Var);
                            if (qj1Var.f57845c == 0) {
                                childAt.setVisibility(qj1Var.f57844b);
                            }
                            childAt.setAlpha(qj1Var.f57846d);
                            childAt.setRotation(rj1Var.f59388b);
                            childAt.setRotationX(rj1Var.f59389c);
                            childAt.setRotationY(rj1Var.f59390d);
                            childAt.setScaleX(rj1Var.f59391e);
                            childAt.setScaleY(rj1Var.f59392f);
                            if (rj1Var.f59395i != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(rj1Var.f59395i);
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
                                if (!Float.isNaN(rj1Var.f59393g)) {
                                    childAt.setPivotX(rj1Var.f59393g);
                                }
                                if (!Float.isNaN(rj1Var.f59394h)) {
                                    childAt.setPivotY(rj1Var.f59394h);
                                }
                            }
                            childAt.setTranslationX(rj1Var.f59396j);
                            childAt.setTranslationY(rj1Var.f59397k);
                            childAt.setTranslationZ(rj1Var.f59398l);
                            if (rj1Var.f59399m) {
                                childAt.setElevation(rj1Var.f59400n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            nj1 nj1Var2 = (nj1) map.get(num);
            if (nj1Var2 != null) {
                oj1 oj1Var2 = nj1Var2.f52823e;
                if (oj1Var2.f54433i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = oj1Var2.f54435j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = oj1Var2.f54437k0;
                        if (str2 != null) {
                            int[] iArrM21401f2 = m21401f(barrier2, str2);
                            oj1Var2.f54435j0 = iArrM21401f2;
                            barrier2.setReferencedIds(iArrM21401f2);
                        }
                    }
                    barrier2.setType(oj1Var2.f54429g0);
                    barrier2.setMargin(oj1Var2.f54431h0);
                    h59 h59Var = ConstraintLayout.f5445K;
                    hj1 hj1Var2 = new hj1();
                    barrier2.m11172k();
                    nj1Var2.m17457b(hj1Var2);
                    constraintLayout.addView(barrier2, hj1Var2);
                }
                if (oj1Var2.f54416a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    h59 h59Var2 = ConstraintLayout.f5445K;
                    hj1 hj1Var3 = new hj1();
                    nj1Var2.m17457b(hj1Var3);
                    constraintLayout.addView(guideline, hj1Var3);
                }
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = constraintLayout.getChildAt(i2);
            if (childAt2 instanceof ej1) {
                ((ej1) childAt2).mo10705e(constraintLayout);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m21410e(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f60922g;
        map.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            hj1 hj1Var = (hj1) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.f60921f && id == -1) {
                ho2.m13385e("All children of ConstraintLayout must have ids to use ConstraintSet");
                return;
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new nj1());
            }
            nj1 nj1Var = (nj1) map.get(Integer.valueOf(id));
            if (nj1Var != null) {
                qj1 qj1Var = nj1Var.f52821c;
                oj1 oj1Var = nj1Var.f52823e;
                rj1 rj1Var = nj1Var.f52824f;
                nj1Var.f52825g = cj1.m4762a(childAt, this.f60920e);
                nj1.m17456a(nj1Var, id, hj1Var);
                qj1Var.f57844b = childAt.getVisibility();
                qj1Var.f57846d = childAt.getAlpha();
                rj1Var.f59388b = childAt.getRotation();
                rj1Var.f59389c = childAt.getRotationX();
                rj1Var.f59390d = childAt.getRotationY();
                rj1Var.f59391e = childAt.getScaleX();
                rj1Var.f59392f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    rj1Var.f59393g = pivotX;
                    rj1Var.f59394h = pivotY;
                }
                rj1Var.f59396j = childAt.getTranslationX();
                rj1Var.f59397k = childAt.getTranslationY();
                rj1Var.f59398l = childAt.getTranslationZ();
                if (rj1Var.f59399m) {
                    rj1Var.f59400n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    oj1Var.f54445o0 = barrier.getAllowsGoneWidget();
                    oj1Var.f54435j0 = barrier.getReferencedIds();
                    oj1Var.f54429g0 = barrier.getType();
                    oj1Var.f54431h0 = barrier.getMargin();
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final nj1 m21411h(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f60922g;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i), new nj1());
        }
        return (nj1) map.get(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: i */
    public final nj1 m21412i(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f60922g;
        if (map.containsKey(numValueOf)) {
            return (nj1) map.get(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m21413j(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    nj1 nj1VarM21402g = m21402g(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        nj1VarM21402g.f52823e.f54416a = true;
                    }
                    this.f60922g.put(Integer.valueOf(nj1VarM21402g.f52819a), nj1VarM21402g);
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing resource: " + i, e2);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: k */
    public final void m21414k(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            nj1 nj1VarM21402g = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (nj1VarM21402g == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                nj1VarM21402g.f52823e.m18038b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (nj1VarM21402g == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                nj1VarM21402g.f52822d.m19194b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1962203927:
                            if (!name.equals("ConstraintOverride")) {
                                continue;
                            } else {
                                nj1VarM21402g = m21402g(context, Xml.asAttributeSet(xmlResourceParser), true);
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (nj1VarM21402g == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                nj1VarM21402g.f52821c.m20000b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (nj1VarM21402g == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                nj1VarM21402g.f52824f.m20674b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (!name.equals("Guideline")) {
                                continue;
                            } else {
                                nj1VarM21402g = m21402g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                oj1 oj1Var = nj1VarM21402g.f52823e;
                                oj1Var.f54416a = true;
                                oj1Var.f54418b = true;
                            }
                            break;
                        case 366511058:
                            if (!name.equals("CustomMethod")) {
                                continue;
                            }
                            break;
                        case 1331510167:
                            if (!name.equals("Barrier")) {
                                continue;
                            } else {
                                nj1VarM21402g = m21402g(context, Xml.asAttributeSet(xmlResourceParser), false);
                                nj1VarM21402g.f52823e.f54433i0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            }
                            break;
                        case 1803088381:
                            if (!name.equals("Constraint")) {
                                continue;
                            } else {
                                nj1VarM21402g = m21402g(context, Xml.asAttributeSet(xmlResourceParser), false);
                            }
                            break;
                        default:
                            continue;
                    }
                    if (nj1VarM21402g == null) {
                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                    }
                    cj1.m4763e(context, xmlResourceParser, nj1VarM21402g.f52825g);
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (!lowerCase.equals("guideline")) {
                                break;
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
                                continue;
                            } else {
                                return;
                            }
                            break;
                        default:
                            continue;
                    }
                    this.f60922g.put(Integer.valueOf(nj1VarM21402g.f52819a), nj1VarM21402g);
                    nj1VarM21402g = null;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintSet", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintSet", "Error parsing XML resource", e2);
        }
    }
}
