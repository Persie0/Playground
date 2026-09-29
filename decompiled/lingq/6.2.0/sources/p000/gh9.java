package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import com.google.android.material.R$attr;
import com.google.android.material.R$styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class gh9 {

    /* JADX INFO: renamed from: a */
    public int f40827a;

    /* JADX INFO: renamed from: b */
    public fn1 f40828b;

    /* JADX INFO: renamed from: c */
    public int[][] f40829c = new int[10][];

    /* JADX INFO: renamed from: d */
    public fn1[] f40830d = new fn1[10];

    /* JADX INFO: renamed from: b */
    public static gh9 m12657b(fn1 fn1Var) {
        gh9 gh9Var = new gh9();
        gh9Var.m12658a(StateSet.WILD_CARD, fn1Var);
        return gh9Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m12658a(int[] iArr, fn1 fn1Var) {
        int i = this.f40827a;
        if (i == 0 || iArr.length == 0) {
            this.f40828b = fn1Var;
        }
        int[][] iArr2 = this.f40829c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f40829c = iArr3;
            fn1[] fn1VarArr = new fn1[i2];
            System.arraycopy(this.f40830d, 0, fn1VarArr, 0, i);
            this.f40830d = fn1VarArr;
        }
        int[][] iArr4 = this.f40829c;
        int i3 = this.f40827a;
        iArr4[i3] = iArr;
        this.f40830d[i3] = fn1Var;
        this.f40827a = i3 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final fn1 m12659c(int[] iArr) {
        int i;
        int[][] iArr2 = this.f40829c;
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 >= this.f40827a) {
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
            int[][] iArr4 = this.f40829c;
            for (int i3 = 0; i3 < this.f40827a; i3++) {
                if (StateSet.stateSetMatches(iArr4[i3], iArr3)) {
                    i = i3;
                    break;
                }
            }
            i2 = i;
        }
        return i2 < 0 ? this.f40828b : this.f40830d[i2];
    }

    /* JADX INFO: renamed from: d */
    public final fn1 m12660d() {
        return this.f40828b;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m12661e() {
        return this.f40827a > 1;
    }

    /* JADX INFO: renamed from: f */
    public final void m12662f(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R$styleable.ShapeAppearance) : theme.obtainStyledAttributes(attributeSet, R$styleable.ShapeAppearance, 0, 0);
                fn1 fn1VarM20283j = r39.m20283j(typedArrayObtainAttributes, R$styleable.ShapeAppearance_cornerSize, new C3479q(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R$attr.cornerSize) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                m12658a(StateSet.trimStateSet(iArr, i), fn1VarM20283j);
            }
        }
    }
}
