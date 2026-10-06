package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.text.AttributedCharacterIterator;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: zp */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1181zp {

    /* JADX INFO: renamed from: a */
    public int f48450a;

    /* JADX INFO: renamed from: b */
    public int f48451b;

    /* JADX INFO: renamed from: c */
    public Object f48452c;

    /* JADX INFO: renamed from: d */
    public Object f48453d;

    public C1181zp(Object obj, int i, int i2) {
        m19802b(C0202g.f24010a, obj, i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final int m19801a(float f, float f2) {
        for (int i = 0; i < ((ArrayList) this.f48452c).size(); i++) {
            if (((C1182zq) ((ArrayList) this.f48452c).get(i)).m19803a(f, f2)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final void m19802b(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        this.f48452c = attribute;
        this.f48453d = obj;
        this.f48450a = i;
        this.f48451b = i2;
    }

    public C1181zp(AttributedCharacterIterator.Attribute attribute, Object obj, int i, int i2) {
        m19802b(attribute, obj, i, i2);
    }

    public C1181zp(Context context, XmlPullParser xmlPullParser) {
        this.f48452c = new ArrayList();
        this.f48451b = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aad.f8h);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f48450a = typedArrayObtainStyledAttributes.getResourceId(0, this.f48450a);
            } else if (index == 1) {
                this.f48451b = typedArrayObtainStyledAttributes.getResourceId(1, this.f48451b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f48451b);
                context.getResources().getResourceName(this.f48451b);
                if ("layout".equals(resourceTypeName)) {
                    C1190zy c1190zy = new C1190zy();
                    this.f48453d = c1190zy;
                    c1190zy.m19821f(context, this.f48451b);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
