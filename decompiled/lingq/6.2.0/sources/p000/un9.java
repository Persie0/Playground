package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.R$styleable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class un9 extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class[] f64113e;

    /* JADX INFO: renamed from: f */
    public static final Class[] f64114f;

    /* JADX INFO: renamed from: a */
    public final Object[] f64115a;

    /* JADX INFO: renamed from: b */
    public final Object[] f64116b;

    /* JADX INFO: renamed from: c */
    public final Context f64117c;

    /* JADX INFO: renamed from: d */
    public Object f64118d;

    static {
        Class[] clsArr = {Context.class};
        f64113e = clsArr;
        f64114f = clsArr;
    }

    public un9(Context context) {
        super(context);
        this.f64117c = context;
        Object[] objArr = {context};
        this.f64115a = objArr;
        this.f64116b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m22839a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m22839a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    /* JADX INFO: renamed from: b */
    public final void m22840b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        int resourceId;
        tn9 tn9Var = new tn9(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    ho2.m13385e("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                ho2.m13385e("Unexpected end of document");
                return;
            }
            Menu menu2 = tn9Var.f62581a;
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            tn9Var.f62582b = 0;
                            tn9Var.f62583c = 0;
                            tn9Var.f62584d = 0;
                            tn9Var.f62585e = 0;
                            tn9Var.f62586f = true;
                            tn9Var.f62587g = true;
                        } else if (name2.equals("item")) {
                            if (!tn9Var.f62588h) {
                                nw5 nw5Var = tn9Var.f62606z;
                                if (nw5Var == null || !nw5Var.m17656a()) {
                                    tn9Var.f62588h = true;
                                    tn9Var.m22246b(menu2.add(tn9Var.f62582b, tn9Var.f62589i, tn9Var.f62590j, tn9Var.f62591k));
                                } else {
                                    tn9Var.f62588h = true;
                                    tn9Var.m22246b(menu2.addSubMenu(tn9Var.f62582b, tn9Var.f62589i, tn9Var.f62590j, tn9Var.f62591k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                    }
                }
            } else if (z2) {
                xmlPullParser2 = xmlPullParser;
            } else {
                String name3 = xmlPullParser.getName();
                boolean zEquals = name3.equals("group");
                Context context = this.f64117c;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MenuGroup);
                    tn9Var.f62582b = typedArrayObtainStyledAttributes.getResourceId(R$styleable.MenuGroup_android_id, 0);
                    tn9Var.f62583c = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_menuCategory, 0);
                    tn9Var.f62584d = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_orderInCategory, 0);
                    tn9Var.f62585e = typedArrayObtainStyledAttributes.getInt(R$styleable.MenuGroup_android_checkableBehavior, 0);
                    tn9Var.f62586f = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_visible, true);
                    tn9Var.f62587g = typedArrayObtainStyledAttributes.getBoolean(R$styleable.MenuGroup_android_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.MenuItem);
                    tn9Var.f62589i = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MenuItem_android_id, 0);
                    tn9Var.f62590j = (typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_android_menuCategory, tn9Var.f62583c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_android_orderInCategory, tn9Var.f62584d) & 65535);
                    tn9Var.f62591k = typedArrayObtainStyledAttributes2.getText(R$styleable.MenuItem_android_title);
                    tn9Var.f62592l = typedArrayObtainStyledAttributes2.getText(R$styleable.MenuItem_android_titleCondensed);
                    tn9Var.f62593m = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MenuItem_android_icon, 0);
                    String string = typedArrayObtainStyledAttributes2.getString(R$styleable.MenuItem_android_alphabeticShortcut);
                    tn9Var.f62594n = string == null ? (char) 0 : string.charAt(0);
                    tn9Var.f62595o = typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_alphabeticModifiers, 4096);
                    String string2 = typedArrayObtainStyledAttributes2.getString(R$styleable.MenuItem_android_numericShortcut);
                    tn9Var.f62596p = string2 == null ? (char) 0 : string2.charAt(0);
                    tn9Var.f62597q = typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_numericModifiers, 4096);
                    if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.MenuItem_android_checkable)) {
                        tn9Var.f62598r = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.MenuItem_android_checkable, false) ? 1 : 0;
                    } else {
                        tn9Var.f62598r = tn9Var.f62585e;
                    }
                    tn9Var.f62599s = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.MenuItem_android_checked, false);
                    tn9Var.f62600t = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.MenuItem_android_visible, tn9Var.f62586f);
                    tn9Var.f62601u = typedArrayObtainStyledAttributes2.getBoolean(R$styleable.MenuItem_android_enabled, tn9Var.f62587g);
                    tn9Var.f62602v = typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_showAsAction, -1);
                    tn9Var.f62605y = typedArrayObtainStyledAttributes2.getString(R$styleable.MenuItem_android_onClick);
                    tn9Var.f62603w = typedArrayObtainStyledAttributes2.getResourceId(R$styleable.MenuItem_actionLayout, 0);
                    tn9Var.f62604x = typedArrayObtainStyledAttributes2.getString(R$styleable.MenuItem_actionViewClass);
                    String string3 = typedArrayObtainStyledAttributes2.getString(R$styleable.MenuItem_actionProviderClass);
                    boolean z3 = string3 != null;
                    if (z3 && tn9Var.f62603w == 0 && tn9Var.f62604x == null) {
                        tn9Var.f62606z = (nw5) tn9Var.m22245a(string3, f64114f, this.f64116b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        tn9Var.f62606z = null;
                    }
                    tn9Var.f62576A = typedArrayObtainStyledAttributes2.getText(R$styleable.MenuItem_contentDescription);
                    tn9Var.f62577B = typedArrayObtainStyledAttributes2.getText(R$styleable.MenuItem_tooltipText);
                    if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.MenuItem_iconTintMode)) {
                        tn9Var.f62579D = wl2.m24048c(typedArrayObtainStyledAttributes2.getInt(R$styleable.MenuItem_iconTintMode, -1), tn9Var.f62579D);
                    } else {
                        tn9Var.f62579D = null;
                    }
                    if (typedArrayObtainStyledAttributes2.hasValue(R$styleable.MenuItem_iconTint)) {
                        int i2 = R$styleable.MenuItem_iconTint;
                        if (!typedArrayObtainStyledAttributes2.hasValue(i2) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(i2, 0)) == 0 || (colorStateList = do7.m10540p(context, resourceId)) == null) {
                            colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(i2);
                        }
                        tn9Var.f62578C = colorStateList;
                    } else {
                        tn9Var.f62578C = null;
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                    tn9Var.f62588h = false;
                } else if (name3.equals("menu")) {
                    tn9Var.f62588h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(tn9Var.f62582b, tn9Var.f62589i, tn9Var.f62590j, tn9Var.f62591k);
                    tn9Var.m22246b(subMenuAddSubMenu.getItem());
                    xmlPullParser2 = xmlPullParser;
                    m22840b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                } else {
                    xmlPullParser2 = xmlPullParser;
                    str = name3;
                    z2 = true;
                }
                xmlPullParser2 = xmlPullParser;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof hw5)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.f64117c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof hw5) {
                    hw5 hw5Var = (hw5) menu;
                    if (!hw5Var.f43052p) {
                        hw5Var.m13540w();
                        z = true;
                    }
                }
                m22840b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((hw5) menu).m13539v();
                }
                layout.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((hw5) menu).m13539v();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
