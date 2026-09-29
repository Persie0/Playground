package p286o2;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import p211k2.C6578a;
import p404u2.C9386f;

/* JADX INFO: renamed from: o2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C7904d {

    /* JADX INFO: renamed from: o2.d$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static int m15673a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    /* JADX INFO: renamed from: o2.d$b */
    public interface b {
    }

    /* JADX INFO: renamed from: o2.d$c */
    public static final class c implements b {

        /* JADX INFO: renamed from: a */
        public final d[] f43043a;

        public c(d[] dVarArr) {
            this.f43043a = dVarArr;
        }
    }

    /* JADX INFO: renamed from: o2.d$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public final String f43044a;

        /* JADX INFO: renamed from: b */
        public final int f43045b;

        /* JADX INFO: renamed from: c */
        public final boolean f43046c;

        /* JADX INFO: renamed from: d */
        public final String f43047d;

        /* JADX INFO: renamed from: e */
        public final int f43048e;

        /* JADX INFO: renamed from: f */
        public final int f43049f;

        public d(int i10, int i11, int i12, String str, String str2, boolean z10) {
            this.f43044a = str;
            this.f43045b = i10;
            this.f43046c = z10;
            this.f43047d = str2;
            this.f43048e = i11;
            this.f43049f = i12;
        }
    }

    /* JADX INFO: renamed from: o2.d$e */
    public static final class e implements b {

        /* JADX INFO: renamed from: a */
        public final C9386f f43050a;

        /* JADX INFO: renamed from: b */
        public final int f43051b;

        /* JADX INFO: renamed from: c */
        public final int f43052c;

        /* JADX INFO: renamed from: d */
        public final String f43053d;

        public e(C9386f c9386f, int i10, int i11, String str) {
            this.f43050a = c9386f;
            this.f43052c = i10;
            this.f43051b = i11;
            this.f43053d = str;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m15670a(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C6578a.f37399b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    m15672c(xmlResourceParser);
                }
                return new e(new C9386f(string, string2, string3, m15671b(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), C6578a.f37400c);
                        int i10 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z10 = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i11 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i12 = typedArrayObtainAttributes2.getInt(i11, 0);
                        int i13 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i13, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i13);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            m15672c(xmlResourceParser);
                        }
                        arrayList.add(new d(i10, i12, resourceId2, string6, string5, z10));
                    } else {
                        m15672c(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new c((d[]) arrayList.toArray(new d[0]));
            }
        } else {
            m15672c(xmlResourceParser);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static List<List<byte[]>> m15671b(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                List<List<byte[]>> listEmptyList = Collections.emptyList();
                typedArrayObtainTypedArray.recycle();
                return listEmptyList;
            }
            ArrayList arrayList = new ArrayList();
            if (a.m15673a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i10);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            typedArrayObtainTypedArray.recycle();
            return arrayList;
        } catch (Throwable th2) {
            typedArrayObtainTypedArray.recycle();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m15672c(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }
}
