package p000;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class di4 {

    /* JADX INFO: renamed from: b */
    public static final HashMap f35684b;

    /* JADX INFO: renamed from: a */
    public HashMap f35685a = new HashMap();

    static {
        HashMap map = new HashMap();
        f35684b = map;
        try {
            map.put("KeyAttribute", th4.class.getConstructor(null));
            map.put("KeyPosition", qi4.class.getConstructor(null));
            map.put("KeyCycle", vh4.class.getConstructor(null));
            map.put("KeyTimeCycle", zi4.class.getConstructor(null));
            map.put("KeyTrigger", bj4.class.getConstructor(null));
        } catch (NoSuchMethodException e) {
            Log.e("KeyFrames", "unable to load", e);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public di4(Context context, XmlResourceParser xmlResourceParser) {
        HashMap map;
        HashMap map2;
        qh4 zi4Var;
        try {
            int eventType = xmlResourceParser.getEventType();
            qh4 qh4Var = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    if (f35684b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                zi4Var = new zi4();
                                zi4Var.mo3773e(context, Xml.asAttributeSet(xmlResourceParser));
                                m10404b(zi4Var);
                                qh4Var = zi4Var;
                                break;
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                zi4Var = new th4();
                                zi4Var.mo3773e(context, Xml.asAttributeSet(xmlResourceParser));
                                m10404b(zi4Var);
                                qh4Var = zi4Var;
                                break;
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                zi4Var = new vh4();
                                zi4Var.mo3773e(context, Xml.asAttributeSet(xmlResourceParser));
                                m10404b(zi4Var);
                                qh4Var = zi4Var;
                                break;
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                zi4Var = new qi4();
                                zi4Var.mo3773e(context, Xml.asAttributeSet(xmlResourceParser));
                                m10404b(zi4Var);
                                qh4Var = zi4Var;
                                break;
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                zi4Var = new bj4();
                                zi4Var.mo3773e(context, Xml.asAttributeSet(xmlResourceParser));
                                m10404b(zi4Var);
                                qh4Var = zi4Var;
                                break;
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (qh4Var != null && (map2 = qh4Var.f57782d) != null) {
                            cj1.m4763e(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && qh4Var != null && (map = qh4Var.f57782d) != null) {
                        cj1.m4763e(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("KeyFrames", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("KeyFrames", "Error parsing XML resource", e2);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m10403a(y26 y26Var) {
        ArrayList arrayList = y26Var.f69163w;
        HashMap map = this.f35685a;
        ArrayList arrayList2 = (ArrayList) map.get(Integer.valueOf(y26Var.f69143c));
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<qh4> arrayList3 = (ArrayList) map.get(-1);
        if (arrayList3 != null) {
            for (qh4 qh4Var : arrayList3) {
                String str = ((hj1) y26Var.f69142b.getLayoutParams()).f42440Y;
                String str2 = qh4Var.f57781c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(qh4Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m10404b(qh4 qh4Var) {
        HashMap map = this.f35685a;
        if (!map.containsKey(Integer.valueOf(qh4Var.f57780b))) {
            map.put(Integer.valueOf(qh4Var.f57780b), new ArrayList());
        }
        ArrayList arrayList = (ArrayList) map.get(Integer.valueOf(qh4Var.f57780b));
        if (arrayList != null) {
            arrayList.add(qh4Var);
        }
    }
}
