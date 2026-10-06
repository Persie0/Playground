package p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: zr */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C1183zr {

    /* JADX INFO: renamed from: a */
    public final ConstraintLayout f48460a;

    /* JADX INFO: renamed from: b */
    public int f48461b = -1;

    /* JADX INFO: renamed from: c */
    public int f48462c = -1;

    /* JADX INFO: renamed from: d */
    public final SparseArray f48463d = new SparseArray();

    /* JADX INFO: renamed from: f */
    private final SparseArray f48465f = new SparseArray();

    /* JADX INFO: renamed from: e */
    public aaa f48464e = null;

    public C1183zr(Context context, ConstraintLayout constraintLayout, int i) {
        this.f48460a = constraintLayout;
        m19804a(context, i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: switch over string: strings are not added: [[layoutDescription], [StateSet]] */
    /* JADX INFO: renamed from: a */
    private final void m19804a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            C1181zp c1181zp = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                switch (eventType) {
                    case 2:
                        int i2 = -1;
                        switch (xml.getName()) {
                            case "State":
                                C1181zp c1181zp2 = new C1181zp(context, xml);
                                this.f48463d.put(c1181zp2.f48450a, c1181zp2);
                                c1181zp = c1181zp2;
                                break;
                            case "Variant":
                                C1182zq c1182zq = new C1182zq(context, xml);
                                if (c1181zp == null) {
                                    break;
                                } else {
                                    ((ArrayList) c1181zp.f48452c).add(c1182zq);
                                    break;
                                }
                                break;
                            case "ConstraintSet":
                                C1190zy c1190zy = new C1190zy();
                                int attributeCount = xml.getAttributeCount();
                                for (int i3 = 0; i3 < attributeCount; i3++) {
                                    String attributeName = xml.getAttributeName(i3);
                                    String attributeValue = xml.getAttributeValue(i3);
                                    if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                                        int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                                        if (identifier != -1) {
                                            i2 = identifier;
                                        } else if (attributeValue.length() > 1) {
                                            i2 = Integer.parseInt(attributeValue.substring(1));
                                        } else {
                                            Log.e("ConstraintLayoutStates", "error in parsing id");
                                        }
                                        c1190zy.m19827l(context, xml);
                                        this.f48465f.put(i2, c1190zy);
                                    }
                                    break;
                                }
                                break;
                        }
                        break;
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }
}
