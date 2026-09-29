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
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class ih9 implements p39 {

    /* JADX INFO: renamed from: a */
    public final int f44115a;

    /* JADX INFO: renamed from: b */
    public final r39 f44116b;

    /* JADX INFO: renamed from: c */
    public final int[][] f44117c;

    /* JADX INFO: renamed from: d */
    public final r39[] f44118d;

    /* JADX INFO: renamed from: e */
    public final gh9 f44119e;

    /* JADX INFO: renamed from: f */
    public final gh9 f44120f;

    /* JADX INFO: renamed from: g */
    public final gh9 f44121g;

    /* JADX INFO: renamed from: h */
    public final gh9 f44122h;

    public ih9(hh9 hh9Var) {
        this.f44115a = hh9Var.f42377a;
        this.f44116b = hh9Var.f42378b;
        this.f44117c = hh9Var.f42379c;
        this.f44118d = hh9Var.f42380d;
        this.f44119e = hh9Var.f42381e;
        this.f44120f = hh9Var.f42382f;
        this.f44121g = hh9Var.f42383g;
        this.f44122h = hh9Var.f42384h;
    }

    /* JADX INFO: renamed from: g */
    public static void m13915g(hh9 hh9Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, R$styleable.MaterialShape) : theme.obtainStyledAttributes(attributeSet, R$styleable.MaterialShape, 0, 0);
                r39 r39VarM19627a = r39.m20280g(context, typedArrayObtainAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearance, 0), typedArrayObtainAttributes.getResourceId(R$styleable.MaterialShape_shapeAppearanceOverlay, 0)).m19627a();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i = 0;
                for (int i2 = 0; i2 < attributeCount; i2++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i2);
                    if (attributeNameResource != R$attr.shapeAppearance && attributeNameResource != R$attr.shapeAppearanceOverlay) {
                        int i3 = i + 1;
                        if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i] = attributeNameResource;
                        i = i3;
                    }
                }
                hh9Var.m13252i(StateSet.trimStateSet(iArr, i), r39VarM19627a);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static ih9 m13916h(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new hh9(context, resourceId).m13253j();
        }
        return null;
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: a */
    public final r39 mo13917a(float f) {
        return m13923i().mo13917a(f);
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: b */
    public final r39 mo13918b(int[] iArr) {
        int i;
        int i2;
        int[][] iArr2;
        int i3 = 0;
        while (true) {
            i = -1;
            i2 = this.f44115a;
            iArr2 = this.f44117c;
            if (i3 >= i2) {
                i3 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            }
            i3++;
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            for (int i4 = 0; i4 < i2; i4++) {
                if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                    i = i4;
                    break;
                }
            }
            i3 = i;
        }
        r39[] r39VarArr = this.f44118d;
        gh9 gh9Var = this.f44122h;
        gh9 gh9Var2 = this.f44121g;
        gh9 gh9Var3 = this.f44120f;
        gh9 gh9Var4 = this.f44119e;
        if (gh9Var4 == null && gh9Var3 == null && gh9Var2 == null && gh9Var == null) {
            return r39VarArr[i3];
        }
        q39 q39VarM20285l = r39VarArr[i3].m20285l();
        if (gh9Var4 != null) {
            q39VarM20285l.f57200e = gh9Var4.m12659c(iArr);
        }
        if (gh9Var3 != null) {
            q39VarM20285l.f57201f = gh9Var3.m12659c(iArr);
        }
        if (gh9Var2 != null) {
            q39VarM20285l.f57203h = gh9Var2.m12659c(iArr);
        }
        if (gh9Var != null) {
            q39VarM20285l.f57202g = gh9Var.m12659c(iArr);
        }
        return q39VarM20285l.m19627a();
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: c */
    public final r39[] mo13919c() {
        return this.f44118d;
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: d */
    public final r39 mo13920d() {
        return m13923i();
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: e */
    public final r39 mo13921e(p48 p48Var) {
        return m13923i().mo13921e(p48Var);
    }

    @Override // p000.p39
    /* JADX INFO: renamed from: f */
    public final boolean mo13922f() {
        gh9 gh9Var;
        gh9 gh9Var2;
        gh9 gh9Var3;
        gh9 gh9Var4;
        return this.f44115a > 1 || ((gh9Var = this.f44119e) != null && gh9Var.m12661e()) || (((gh9Var2 = this.f44120f) != null && gh9Var2.m12661e()) || (((gh9Var3 = this.f44121g) != null && gh9Var3.m12661e()) || ((gh9Var4 = this.f44122h) != null && gh9Var4.m12661e())));
    }

    /* JADX INFO: renamed from: i */
    public final r39 m13923i() {
        r39 r39Var = this.f44116b;
        gh9 gh9Var = this.f44122h;
        gh9 gh9Var2 = this.f44121g;
        gh9 gh9Var3 = this.f44120f;
        gh9 gh9Var4 = this.f44119e;
        if (gh9Var4 == null && gh9Var3 == null && gh9Var2 == null && gh9Var == null) {
            return r39Var;
        }
        q39 q39VarM20285l = r39Var.m20285l();
        if (gh9Var4 != null) {
            q39VarM20285l.f57200e = gh9Var4.m12660d();
        }
        if (gh9Var3 != null) {
            q39VarM20285l.f57201f = gh9Var3.m12660d();
        }
        if (gh9Var2 != null) {
            q39VarM20285l.f57203h = gh9Var2.m12660d();
        }
        if (gh9Var != null) {
            q39VarM20285l.f57202g = gh9Var.m12660d();
        }
        return q39VarM20285l.m19627a();
    }
}
