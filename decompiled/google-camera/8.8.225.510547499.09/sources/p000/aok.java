package p000;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aok {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1899a = 0;

    /* JADX INFO: renamed from: b */
    private static final Class[] f1900b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c */
    private static final HashMap f1901c = new HashMap();

    /* JADX INFO: renamed from: a */
    public static final Preference m1769a(XmlPullParser xmlPullParser, PreferenceGroup preferenceGroup, Context context, Object[] objArr, aoo aooVar, String[] strArr) {
        int next;
        synchronized (objArr) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
            objArr[0] = context;
            do {
                try {
                    next = xmlPullParser.next();
                    if (next == 2) {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) m1772d(xmlPullParser.getName(), attributeSetAsAttributeSet, context, objArr, strArr);
                        if (preferenceGroup == null) {
                            preferenceGroup2.m1487E(aooVar);
                            preferenceGroup = preferenceGroup2;
                        }
                        m1770b(xmlPullParser, preferenceGroup, attributeSetAsAttributeSet, context, objArr, aooVar, strArr);
                    }
                } catch (InflateException e) {
                    throw e;
                } catch (IOException e2) {
                    InflateException inflateException = new InflateException(xmlPullParser.getPositionDescription() + ": " + e2.getMessage());
                    inflateException.initCause(e2);
                    throw inflateException;
                } catch (XmlPullParserException e3) {
                    InflateException inflateException2 = new InflateException(e3.getMessage());
                    inflateException2.initCause(e3);
                    throw inflateException2;
                }
            } while (next != 1);
            throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
        }
        return preferenceGroup;
    }

    /* JADX INFO: renamed from: b */
    private static final void m1770b(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet, Context context, Object[] objArr, aoo aooVar, String[] strArr) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    return;
                } else {
                    next = 3;
                }
            }
            if (next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.f1591s = Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    context.getResources().parseBundleExtra("extra", attributeSet, preference.m1520t());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceM1772d = m1772d(name, attributeSet, context, objArr, strArr);
                    ((PreferenceGroup) preference).m1531ak(preferenceM1772d);
                    m1770b(xmlPullParser, preferenceM1772d, attributeSet, context, objArr, aooVar, strArr);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private static final Preference m1771c(String str, String[] strArr, AttributeSet attributeSet, Context context, Object[] objArr) throws ClassNotFoundException {
        Class<?> cls;
        Constructor<?> constructor = (Constructor) f1901c.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = context.getClassLoader();
                    if (strArr != null) {
                        cls = null;
                        ClassNotFoundException e = null;
                        for (int i = 0; i < 2; i++) {
                            try {
                                cls = Class.forName(strArr[i] + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e2) {
                                e = e2;
                            }
                        }
                        if (cls == null) {
                            if (e != null) {
                                throw e;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    } else {
                        cls = Class.forName(str, false, classLoader);
                    }
                    constructor = cls.getConstructor(f1900b);
                    constructor.setAccessible(true);
                    f1901c.put(str, constructor);
                } catch (Exception e3) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e3);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e4) {
                throw e4;
            }
        }
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    /* JADX INFO: renamed from: d */
    private static final Preference m1772d(String str, AttributeSet attributeSet, Context context, Object[] objArr, String[] strArr) {
        try {
            return str.indexOf(46) == -1 ? m1771c(str, strArr, attributeSet, context, objArr) : m1771c(str, null, attributeSet, context, objArr);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }
}
