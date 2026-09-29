package p143h2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0762b;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: h2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5878a {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f35152a;

    /* JADX INFO: renamed from: b */
    public int f35153b = -1;

    /* JADX INFO: renamed from: c */
    public int f35154c = -1;

    /* JADX INFO: renamed from: d */
    public final SparseArray<a> f35155d = new SparseArray<>();

    /* JADX INFO: renamed from: e */
    public final SparseArray<C0762b> f35156e = new SparseArray<>();

    /* JADX INFO: renamed from: h2.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f35157a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<b> f35158b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public final int f35159c;

        /* JADX INFO: renamed from: d */
        public final C0762b f35160d;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f35159c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35185s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f35157a = typedArrayObtainStyledAttributes.getResourceId(index, this.f35157a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35159c);
                    this.f35159c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        C0762b c0762b = new C0762b();
                        this.f35160d = c0762b;
                        c0762b.m2893e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h2.a$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final float f35161a;

        /* JADX INFO: renamed from: b */
        public final float f35162b;

        /* JADX INFO: renamed from: c */
        public final float f35163c;

        /* JADX INFO: renamed from: d */
        public final float f35164d;

        /* JADX INFO: renamed from: e */
        public final int f35165e;

        /* JADX INFO: renamed from: f */
        public final C0762b f35166f;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f35161a = Float.NaN;
            this.f35162b = Float.NaN;
            this.f35163c = Float.NaN;
            this.f35164d = Float.NaN;
            this.f35165e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35189w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35165e);
                    this.f35165e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        C0762b c0762b = new C0762b();
                        this.f35166f = c0762b;
                        c0762b.m2893e((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.f35164d = typedArrayObtainStyledAttributes.getDimension(index, this.f35164d);
                } else if (index == 2) {
                    this.f35162b = typedArrayObtainStyledAttributes.getDimension(index, this.f35162b);
                } else if (index == 3) {
                    this.f35163c = typedArrayObtainStyledAttributes.getDimension(index, this.f35163c);
                } else if (index == 4) {
                    this.f35161a = typedArrayObtainStyledAttributes.getDimension(index, this.f35161a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12310a(float f3, float f10) {
            float f11 = this.f35161a;
            if (!Float.isNaN(f11) && f3 < f11) {
                return false;
            }
            float f12 = this.f35162b;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f35163c;
            if (!Float.isNaN(f13) && f3 > f13) {
                return false;
            }
            float f14 = this.f35164d;
            return Float.isNaN(f14) || f10 <= f14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C5878a(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f35152a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            int eventType = xml.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            b10 = !name.equals("ConstraintSet") ? (byte) -1 : (byte) 4;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                b10 = 2;
                            }
                            break;
                        case 1382829617:
                            if (!name.equals("StateSet")) {
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                b10 = 0;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b10 = 3;
                            }
                            break;
                        default:
                            break;
                    }
                    if (b10 == 2) {
                        a aVar2 = new a(context, xml);
                        this.f35155d.put(aVar2.f35157a, aVar2);
                        aVar = aVar2;
                    } else if (b10 == 3) {
                        b bVar = new b(context, xml);
                        if (aVar != null) {
                            aVar.f35158b.add(bVar);
                        }
                    } else if (b10 == 4) {
                        m12309a(context, xml);
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12309a(Context context, XmlResourceParser xmlResourceParser) {
        C0762b c0762b = new C0762b();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlResourceParser.getAttributeName(i10);
            String attributeValue = xmlResourceParser.getAttributeValue(i10);
            if (attributeName != null) {
                if (attributeValue == null) {
                    continue;
                } else if ("id".equals(attributeName)) {
                    int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                    if (identifier == -1) {
                        if (attributeValue.length() > 1) {
                            identifier = Integer.parseInt(attributeValue.substring(1));
                        } else {
                            Log.e("ConstraintLayoutStates", "error in parsing id");
                        }
                    }
                    c0762b.m2898l(context, xmlResourceParser);
                    this.f35156e.put(identifier, c0762b);
                    return;
                }
            }
        }
    }
}
