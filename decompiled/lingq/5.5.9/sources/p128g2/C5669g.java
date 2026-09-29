package p128g2;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: g2.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5669g {

    /* JADX INFO: renamed from: b */
    public static final HashMap<String, Constructor<? extends AbstractC5666d>> f34537b;

    /* JADX INFO: renamed from: a */
    public final HashMap<Integer, ArrayList<AbstractC5666d>> f34538a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends AbstractC5666d>> map = new HashMap<>();
        f34537b = map;
        try {
            map.put("KeyAttribute", C5667e.class.getConstructor(new Class[0]));
            map.put("KeyPosition", C5670h.class.getConstructor(new Class[0]));
            map.put("KeyCycle", C5668f.class.getConstructor(new Class[0]));
            map.put("KeyTimeCycle", C5672j.class.getConstructor(new Class[0]));
            map.put("KeyTrigger", C5673k.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException e10) {
            Log.e("KeyFrames", "unable to load", e10);
        }
    }

    public C5669g() {
    }

    public C5669g(Context context, XmlResourceParser xmlResourceParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        Exception e10;
        AbstractC5666d abstractC5666dNewInstance;
        try {
            int eventType = xmlResourceParser.getEventType();
            AbstractC5666d abstractC5666d = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    HashMap<String, Constructor<? extends AbstractC5666d>> map3 = f34537b;
                    if (map3.containsKey(name)) {
                        try {
                            Constructor<? extends AbstractC5666d> constructor = map3.get(name);
                            if (constructor == null) {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                            abstractC5666dNewInstance = constructor.newInstance(new Object[0]);
                            try {
                                abstractC5666dNewInstance.mo12028e(context, Xml.asAttributeSet(xmlResourceParser));
                                m12031b(abstractC5666dNewInstance);
                            } catch (Exception e11) {
                                e10 = e11;
                                Log.e("KeyFrames", "unable to create ", e10);
                            }
                            abstractC5666d = abstractC5666dNewInstance;
                        } catch (Exception e12) {
                            AbstractC5666d abstractC5666d2 = abstractC5666d;
                            e10 = e12;
                            abstractC5666dNewInstance = abstractC5666d2;
                        }
                        Log.e("KeyFrames", "unable to create ", e10);
                        abstractC5666d = abstractC5666dNewInstance;
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (abstractC5666d != null && (map2 = abstractC5666d.f34500d) != null) {
                            ConstraintAttribute.m2856d(context, xmlResourceParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && abstractC5666d != null && (map = abstractC5666d.f34500d) != null) {
                        ConstraintAttribute.m2856d(context, xmlResourceParser, map);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlResourceParser.getName())) {
                        return;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e13) {
            e13.printStackTrace();
        } catch (XmlPullParserException e14) {
            e14.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12030a(C5676n c5676n) {
        Integer numValueOf = Integer.valueOf(c5676n.f34617c);
        HashMap<Integer, ArrayList<AbstractC5666d>> map = this.f34538a;
        ArrayList<AbstractC5666d> arrayList = map.get(numValueOf);
        ArrayList<AbstractC5666d> arrayList2 = c5676n.f34637w;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        ArrayList<AbstractC5666d> arrayList3 = map.get(-1);
        if (arrayList3 != null) {
            while (true) {
                for (AbstractC5666d abstractC5666d : arrayList3) {
                    String str = ((ConstraintLayout.C0759b) c5676n.f34616b.getLayoutParams()).f5311Y;
                    String str2 = abstractC5666d.f34499c;
                    if ((str2 == null || str == null) ? false : str.matches(str2)) {
                        arrayList2.add(abstractC5666d);
                    }
                }
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12031b(AbstractC5666d abstractC5666d) {
        Integer numValueOf = Integer.valueOf(abstractC5666d.f34498b);
        HashMap<Integer, ArrayList<AbstractC5666d>> map = this.f34538a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(abstractC5666d.f34498b), new ArrayList<>());
        }
        ArrayList<AbstractC5666d> arrayList = map.get(Integer.valueOf(abstractC5666d.f34498b));
        if (arrayList != null) {
            arrayList.add(abstractC5666d);
        }
    }
}
