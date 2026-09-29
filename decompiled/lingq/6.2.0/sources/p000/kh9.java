package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import com.google.android.material.shape.StateListSizeChange$SizeChangeType;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class kh9 {

    /* JADX INFO: renamed from: a */
    public int f47302a;

    /* JADX INFO: renamed from: b */
    public jh9 f47303b;

    /* JADX INFO: renamed from: c */
    public int[][] f47304c;

    /* JADX INFO: renamed from: d */
    public jh9[] f47305d;

    /* JADX INFO: renamed from: a */
    public final jh9 m15241a(int[] iArr) {
        int i;
        int[][] iArr2 = this.f47304c;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.f47302a) {
                i2 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                break;
            }
            i2++;
        }
        if (i2 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f47304c;
            for (int i3 = 0; i3 < this.f47302a; i3++) {
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
            }
            i2 = i;
        }
        return i2 < 0 ? this.f47303b : this.f47305d[i2];
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX INFO: renamed from: b */
    public final void m15242b(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        l90 l90Var;
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R$styleable.StateListSizeChange) : theme.obtainStyledAttributes(attributeSet, R$styleable.StateListSizeChange, 0, 0);
                TypedValue typedValuePeekValue = typedArrayObtainAttributes.peekValue(R$styleable.StateListSizeChange_widthChange);
                if (typedValuePeekValue != null) {
                    int i = typedValuePeekValue.type;
                    if (i == 5) {
                        l90Var = new l90(StateListSizeChange$SizeChangeType.PIXELS, TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArrayObtainAttributes.getResources().getDisplayMetrics()));
                    } else if (i == 6) {
                        l90Var = new l90(StateListSizeChange$SizeChangeType.PERCENT, typedValuePeekValue.getFraction(1.0f, 1.0f));
                    } else {
                        l90Var = null;
                    }
                } else {
                    l90Var = null;
                }
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i2 = 0;
                for (int i3 = 0; i3 < attributeCount; i3++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i3);
                    if (attributeNameResource != R$attr.widthChange) {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i2] = attributeNameResource;
                        i2 = i4;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr, i2);
                jh9 jh9Var = new jh9(0);
                jh9Var.f45552b = l90Var;
                int i5 = this.f47302a;
                if (i5 == 0 || iArrTrimStateSet.length == 0) {
                    this.f47303b = jh9Var;
                }
                int[][] iArr2 = this.f47304c;
                if (i5 >= iArr2.length) {
                    int i6 = i5 + 10;
                    int[][] iArr3 = new int[i6][];
                    System.arraycopy(iArr2, 0, iArr3, 0, i5);
                    this.f47304c = iArr3;
                    jh9[] jh9VarArr = new jh9[i6];
                    System.arraycopy(this.f47305d, 0, jh9VarArr, 0, i5);
                    this.f47305d = jh9VarArr;
                }
                int[][] iArr4 = this.f47304c;
                int i7 = this.f47302a;
                iArr4[i7] = iArrTrimStateSet;
                this.f47305d[i7] = jh9Var;
                this.f47302a = i7 + 1;
            }
        }
    }
}
