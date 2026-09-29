package p000;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class hh9 {

    /* JADX INFO: renamed from: a */
    public int f42377a;

    /* JADX INFO: renamed from: b */
    public r39 f42378b;

    /* JADX INFO: renamed from: c */
    public int[][] f42379c;

    /* JADX INFO: renamed from: d */
    public r39[] f42380d;

    /* JADX INFO: renamed from: e */
    public gh9 f42381e;

    /* JADX INFO: renamed from: f */
    public gh9 f42382f;

    /* JADX INFO: renamed from: g */
    public gh9 f42383g;

    /* JADX INFO: renamed from: h */
    public gh9 f42384h;

    public hh9(Context context, int i) {
        int next;
        m13254k();
        try {
            XmlResourceParser xml = context.getResources().getXml(i);
            try {
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
                if (xml.getName().equals("selector")) {
                    ih9.m13915g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
            } catch (Throwable th) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            m13254k();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m13252i(int[] iArr, r39 r39Var) {
        int i = this.f42377a;
        if (i == 0 || iArr.length == 0) {
            this.f42378b = r39Var;
        }
        int[][] iArr2 = this.f42379c;
        if (i >= iArr2.length) {
            int i2 = i + 10;
            int[][] iArr3 = new int[i2][];
            System.arraycopy(iArr2, 0, iArr3, 0, i);
            this.f42379c = iArr3;
            r39[] r39VarArr = new r39[i2];
            System.arraycopy(this.f42380d, 0, r39VarArr, 0, i);
            this.f42380d = r39VarArr;
        }
        int[][] iArr4 = this.f42379c;
        int i3 = this.f42377a;
        iArr4[i3] = iArr;
        this.f42380d[i3] = r39Var;
        this.f42377a = i3 + 1;
    }

    /* JADX INFO: renamed from: j */
    public final ih9 m13253j() {
        if (this.f42377a == 0) {
            return null;
        }
        return new ih9(this);
    }

    /* JADX INFO: renamed from: k */
    public final void m13254k() {
        this.f42378b = new r39();
        this.f42379c = new int[10][];
        this.f42380d = new r39[10];
    }

    public hh9(r39 r39Var) {
        m13254k();
        m13252i(StateSet.WILD_CARD, r39Var);
    }

    public hh9(ih9 ih9Var) {
        int i = ih9Var.f44115a;
        this.f42377a = i;
        this.f42378b = ih9Var.f44116b;
        int[][] iArr = ih9Var.f44117c;
        int[][] iArr2 = new int[iArr.length][];
        this.f42379c = iArr2;
        r39[] r39VarArr = ih9Var.f44118d;
        this.f42380d = new r39[r39VarArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, i);
        System.arraycopy(r39VarArr, 0, this.f42380d, 0, this.f42377a);
        this.f42381e = ih9Var.f44119e;
        this.f42382f = ih9Var.f44120f;
        this.f42383g = ih9Var.f44121g;
        this.f42384h = ih9Var.f44122h;
    }
}
