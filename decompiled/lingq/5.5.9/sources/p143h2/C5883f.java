package p143h2;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: h2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C5883f {

    /* JADX INFO: renamed from: a */
    public int f35193a;

    /* JADX INFO: renamed from: b */
    public final SparseArray<a> f35194b = new SparseArray<>();

    /* JADX INFO: renamed from: h2.f$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f35195a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<b> f35196b = new ArrayList<>();

        /* JADX INFO: renamed from: c */
        public final int f35197c;

        public a(Context context, XmlResourceParser xmlResourceParser) {
            this.f35197c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35185s);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f35195a = typedArrayObtainStyledAttributes.getResourceId(index, this.f35195a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35197c);
                    this.f35197c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h2.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final float f35198a;

        /* JADX INFO: renamed from: b */
        public final float f35199b;

        /* JADX INFO: renamed from: c */
        public final float f35200c;

        /* JADX INFO: renamed from: d */
        public final float f35201d;

        /* JADX INFO: renamed from: e */
        public final int f35202e;

        public b(Context context, XmlResourceParser xmlResourceParser) {
            this.f35198a = Float.NaN;
            this.f35199b = Float.NaN;
            this.f35200c = Float.NaN;
            this.f35201d = Float.NaN;
            this.f35202e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35189w);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f35202e);
                    this.f35202e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.f35201d = typedArrayObtainStyledAttributes.getDimension(index, this.f35201d);
                } else if (index == 2) {
                    this.f35199b = typedArrayObtainStyledAttributes.getDimension(index, this.f35199b);
                } else if (index == 3) {
                    this.f35200c = typedArrayObtainStyledAttributes.getDimension(index, this.f35200c);
                } else if (index == 4) {
                    this.f35198a = typedArrayObtainStyledAttributes.getDimension(index, this.f35198a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: a */
        public final boolean m12312a(float f3, float f10) {
            float f11 = this.f35198a;
            if (!Float.isNaN(f11) && f3 < f11) {
                return false;
            }
            float f12 = this.f35199b;
            if (!Float.isNaN(f12) && f10 < f12) {
                return false;
            }
            float f13 = this.f35200c;
            if (!Float.isNaN(f13) && f3 > f13) {
                return false;
            }
            float f14 = this.f35201d;
            return Float.isNaN(f14) || f10 <= f14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C5883f(Context context, XmlResourceParser xmlResourceParser) {
        this.f35193a = -1;
        new SparseArray();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), C5881d.f35186t);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f35193a = typedArrayObtainStyledAttributes.getResourceId(index, this.f35193a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            a aVar = null;
            while (true) {
                byte b10 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    b10 = 0;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            case 1382829617:
                                if (!name.equals("StateSet")) {
                                    b10 = -1;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    b10 = 3;
                                } else {
                                    b10 = -1;
                                }
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 2) {
                            a aVar2 = new a(context, xmlResourceParser);
                            this.f35194b.put(aVar2.f35195a, aVar2);
                            aVar = aVar2;
                        } else if (b10 == 3) {
                            b bVar = new b(context, xmlResourceParser);
                            if (aVar != null) {
                                aVar.f35196b.add(bVar);
                            }
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else if ("StateSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                    eventType = xmlResourceParser.next();
                } else {
                    xmlResourceParser.getName();
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m12311a(int i10) {
        ArrayList<b> arrayList;
        int i11;
        ArrayList<b> arrayList2;
        float f3 = -1;
        SparseArray<a> sparseArray = this.f35194b;
        int i12 = 0;
        if (-1 == i10) {
            a aVarValueAt = i10 == -1 ? sparseArray.valueAt(0) : sparseArray.get(-1);
            if (aVarValueAt == null) {
                return -1;
            }
            while (true) {
                arrayList2 = aVarValueAt.f35196b;
                if (i12 >= arrayList2.size()) {
                    i12 = -1;
                    break;
                }
                if (arrayList2.get(i12).m12312a(f3, f3)) {
                    break;
                }
                i12++;
            }
            if (-1 == i12) {
                return -1;
            }
            i11 = i12 == -1 ? aVarValueAt.f35197c : arrayList2.get(i12).f35202e;
        } else {
            a aVar = sparseArray.get(i10);
            if (aVar == null) {
                return -1;
            }
            while (true) {
                arrayList = aVar.f35196b;
                if (i12 >= arrayList.size()) {
                    i12 = -1;
                    break;
                }
                if (arrayList.get(i12).m12312a(f3, f3)) {
                    break;
                }
                i12++;
            }
            i11 = i12 == -1 ? aVar.f35197c : arrayList.get(i12).f35202e;
        }
        return i11;
    }
}
