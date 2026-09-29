package p164i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.activity.result.C0204c;
import androidx.appcompat.view.menu.C0226h;
import androidx.appcompat.widget.C0300b1;
import androidx.appcompat.widget.C0311f0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;
import p058d.C4999a;
import p185j.MenuItemC6393c;
import p353r2.InterfaceMenuC8724a;
import p353r2.InterfaceMenuItemC8725b;
import p471x2.AbstractC10028b;
import p471x2.C10046k;

/* JADX INFO: renamed from: i.f */
/* JADX INFO: loaded from: classes.dex */
public final class C6105f extends MenuInflater {

    /* JADX INFO: renamed from: e */
    public static final Class<?>[] f35870e;

    /* JADX INFO: renamed from: f */
    public static final Class<?>[] f35871f;

    /* JADX INFO: renamed from: a */
    public final Object[] f35872a;

    /* JADX INFO: renamed from: b */
    public final Object[] f35873b;

    /* JADX INFO: renamed from: c */
    public final Context f35874c;

    /* JADX INFO: renamed from: d */
    public Object f35875d;

    /* JADX INFO: renamed from: i.f$a */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: c */
        public static final Class<?>[] f35876c = {MenuItem.class};

        /* JADX INFO: renamed from: a */
        public final Object f35877a;

        /* JADX INFO: renamed from: b */
        public final Method f35878b;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public a(Object obj, String str) {
            this.f35877a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f35878b = cls.getMethod(str, f35876c);
            } catch (Exception e10) {
                StringBuilder sbM854m = C0204c.m854m("Couldn't resolve menu item onClick handler ", str, " in class ");
                sbM854m.append(cls.getName());
                InflateException inflateException = new InflateException(sbM854m.toString());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.f35878b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.f35877a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: i.f$b */
    public class b {

        /* JADX INFO: renamed from: A */
        public CharSequence f35879A;

        /* JADX INFO: renamed from: B */
        public CharSequence f35880B;

        /* JADX INFO: renamed from: a */
        public final Menu f35884a;

        /* JADX INFO: renamed from: h */
        public boolean f35891h;

        /* JADX INFO: renamed from: i */
        public int f35892i;

        /* JADX INFO: renamed from: j */
        public int f35893j;

        /* JADX INFO: renamed from: k */
        public CharSequence f35894k;

        /* JADX INFO: renamed from: l */
        public CharSequence f35895l;

        /* JADX INFO: renamed from: m */
        public int f35896m;

        /* JADX INFO: renamed from: n */
        public char f35897n;

        /* JADX INFO: renamed from: o */
        public int f35898o;

        /* JADX INFO: renamed from: p */
        public char f35899p;

        /* JADX INFO: renamed from: q */
        public int f35900q;

        /* JADX INFO: renamed from: r */
        public int f35901r;

        /* JADX INFO: renamed from: s */
        public boolean f35902s;

        /* JADX INFO: renamed from: t */
        public boolean f35903t;

        /* JADX INFO: renamed from: u */
        public boolean f35904u;

        /* JADX INFO: renamed from: v */
        public int f35905v;

        /* JADX INFO: renamed from: w */
        public int f35906w;

        /* JADX INFO: renamed from: x */
        public String f35907x;

        /* JADX INFO: renamed from: y */
        public String f35908y;

        /* JADX INFO: renamed from: z */
        public AbstractC10028b f35909z;

        /* JADX INFO: renamed from: C */
        public ColorStateList f35881C = null;

        /* JADX INFO: renamed from: D */
        public PorterDuff.Mode f35882D = null;

        /* JADX INFO: renamed from: b */
        public int f35885b = 0;

        /* JADX INFO: renamed from: c */
        public int f35886c = 0;

        /* JADX INFO: renamed from: d */
        public int f35887d = 0;

        /* JADX INFO: renamed from: e */
        public int f35888e = 0;

        /* JADX INFO: renamed from: f */
        public boolean f35889f = true;

        /* JADX INFO: renamed from: g */
        public boolean f35890g = true;

        public b(Menu menu) {
            this.f35884a = menu;
        }

        /* JADX INFO: renamed from: a */
        public final <T> T m12605a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, C6105f.this.f35874c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e10) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e10);
                return null;
            }
        }

        /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public final void m12606b(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f35902s).setVisible(this.f35903t).setEnabled(this.f35904u).setCheckable(this.f35901r >= 1).setTitleCondensed(this.f35895l).setIcon(this.f35896m);
            int i10 = this.f35905v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            String str = this.f35908y;
            C6105f c6105f = C6105f.this;
            if (str != null) {
                if (c6105f.f35874c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (c6105f.f35875d == null) {
                    c6105f.f35875d = C6105f.m12603a(c6105f.f35874c);
                }
                menuItem.setOnMenuItemClickListener(new a(c6105f.f35875d, this.f35908y));
            }
            if (this.f35901r >= 2) {
                if (menuItem instanceof C0226h) {
                    C0226h c0226h = (C0226h) menuItem;
                    c0226h.f746x = (c0226h.f746x & (-5)) | 4;
                } else if (menuItem instanceof MenuItemC6393c) {
                    MenuItemC6393c menuItemC6393c = (MenuItemC6393c) menuItem;
                    try {
                        Method method = menuItemC6393c.f36840e;
                        InterfaceMenuItemC8725b interfaceMenuItemC8725b = menuItemC6393c.f36839d;
                        if (method == null) {
                            menuItemC6393c.f36840e = interfaceMenuItemC8725b.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC6393c.f36840e.invoke(interfaceMenuItemC8725b, Boolean.TRUE);
                    } catch (Exception e10) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e10);
                    }
                }
            }
            String str2 = this.f35907x;
            if (str2 != null) {
                menuItem.setActionView((View) m12605a(str2, C6105f.f35870e, c6105f.f35872a));
                z10 = true;
            }
            int i11 = this.f35906w;
            if (i11 > 0) {
                if (z10) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i11);
                }
            }
            AbstractC10028b abstractC10028b = this.f35909z;
            if (abstractC10028b != null) {
                if (menuItem instanceof InterfaceMenuItemC8725b) {
                    ((InterfaceMenuItemC8725b) menuItem).mo946b(abstractC10028b);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.f35879A;
            boolean z11 = menuItem instanceof InterfaceMenuItemC8725b;
            if (z11) {
                ((InterfaceMenuItemC8725b) menuItem).setContentDescription(charSequence);
            } else {
                C10046k.m18829h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.f35880B;
            if (z11) {
                ((InterfaceMenuItemC8725b) menuItem).setTooltipText(charSequence2);
            } else {
                C10046k.m18834m(menuItem, charSequence2);
            }
            char c10 = this.f35897n;
            int i12 = this.f35898o;
            if (z11) {
                ((InterfaceMenuItemC8725b) menuItem).setAlphabeticShortcut(c10, i12);
            } else {
                C10046k.m18828g(menuItem, c10, i12);
            }
            char c11 = this.f35899p;
            int i13 = this.f35900q;
            if (z11) {
                ((InterfaceMenuItemC8725b) menuItem).setNumericShortcut(c11, i13);
            } else {
                C10046k.m18832k(menuItem, c11, i13);
            }
            PorterDuff.Mode mode = this.f35882D;
            if (mode != null) {
                if (z11) {
                    ((InterfaceMenuItemC8725b) menuItem).setIconTintMode(mode);
                } else {
                    C10046k.m18831j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.f35881C;
            if (colorStateList != null) {
                if (z11) {
                    ((InterfaceMenuItemC8725b) menuItem).setIconTintList(colorStateList);
                } else {
                    C10046k.m18830i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f35870e = clsArr;
        f35871f = clsArr;
    }

    public C6105f(Context context) {
        super(context);
        this.f35874c = context;
        Object[] objArr = {context};
        this.f35872a = objArr;
        this.f35873b = objArr;
    }

    /* JADX INFO: renamed from: a */
    public static Object m12603a(Context context) {
        return (!(context instanceof Activity) && (context instanceof ContextWrapper)) ? m12603a(((ContextWrapper) context).getBaseContext()) : context;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00fb A[PHI: r9
      0x00fb: PHI (r9v2 boolean) = 
      (r9v6 boolean)
      (r9v7 boolean)
      (r9v8 boolean)
      (r9v9 boolean)
      (r9v4 boolean)
      (r9v10 boolean)
      (r9v11 boolean)
      (r9v12 boolean)
      (r9v13 boolean)
     binds: [B:40:0x00b9, B:44:0x00c9, B:17:0x0049, B:38:0x00b5, B:39:0x00b7, B:30:0x007d, B:36:0x009f, B:35:0x0089, B:26:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    public final void m12604b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i10;
        ColorStateList colorStateList;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            i10 = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z10 = false;
        boolean z11 = false;
        String str = null;
        while (!z10) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            Menu menu2 = bVar.f35884a;
            if (eventType != i10) {
                if (eventType != 3) {
                    z10 = z10;
                    z10 = z10;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if (z11 && name2.equals(str)) {
                        z11 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            bVar.f35885b = 0;
                            bVar.f35886c = 0;
                            bVar.f35887d = 0;
                            bVar.f35888e = 0;
                            bVar.f35889f = true;
                            bVar.f35890g = true;
                            z10 = z10;
                        } else if (name2.equals("item")) {
                            if (!bVar.f35891h) {
                                AbstractC10028b abstractC10028b = bVar.f35909z;
                                if (abstractC10028b == null || !abstractC10028b.mo13017a()) {
                                    z10 = z10;
                                    z10 = z10;
                                    bVar.f35891h = true;
                                    bVar.m12606b(menu2.add(bVar.f35885b, bVar.f35892i, bVar.f35893j, bVar.f35894k));
                                    z10 = z10;
                                } else {
                                    z10 = z10;
                                    bVar.f35891h = true;
                                    bVar.m12606b(menu2.addSubMenu(bVar.f35885b, bVar.f35892i, bVar.f35893j, bVar.f35894k).getItem());
                                    z10 = z10;
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z10 = z10;
                            z10 = true;
                        }
                        z10 = z10;
                        z10 = z10;
                    }
                }
            } else if (z11) {
                z10 = z10;
                z10 = z10;
            } else {
                String name3 = xmlResourceParser.getName();
                boolean zEquals = name3.equals("group");
                C6105f c6105f = C6105f.this;
                if (zEquals) {
                    TypedArray typedArrayObtainStyledAttributes = c6105f.f35874c.obtainStyledAttributes(attributeSet, C4999a.f32602p);
                    bVar.f35885b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                    bVar.f35886c = typedArrayObtainStyledAttributes.getInt(3, 0);
                    bVar.f35887d = typedArrayObtainStyledAttributes.getInt(4, 0);
                    bVar.f35888e = typedArrayObtainStyledAttributes.getInt(5, 0);
                    bVar.f35889f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                    bVar.f35890g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                    typedArrayObtainStyledAttributes.recycle();
                    z10 = z10;
                    z10 = z10;
                    z10 = z10;
                } else if (name3.equals("item")) {
                    Context context = c6105f.f35874c;
                    C0300b1 c0300b1 = new C0300b1(context, context.obtainStyledAttributes(attributeSet, C4999a.f32603q));
                    bVar.f35892i = c0300b1.m1120i(2, 0);
                    bVar.f35893j = (c0300b1.m1119h(5, bVar.f35886c) & (-65536)) | (c0300b1.m1119h(6, bVar.f35887d) & 65535);
                    bVar.f35894k = c0300b1.m1122k(7);
                    bVar.f35895l = c0300b1.m1122k(8);
                    bVar.f35896m = c0300b1.m1120i(0, 0);
                    String strM1121j = c0300b1.m1121j(9);
                    bVar.f35897n = strM1121j == null ? (char) 0 : strM1121j.charAt(0);
                    bVar.f35898o = c0300b1.m1119h(16, 4096);
                    String strM1121j2 = c0300b1.m1121j(10);
                    bVar.f35899p = strM1121j2 == null ? (char) 0 : strM1121j2.charAt(0);
                    bVar.f35900q = c0300b1.m1119h(20, 4096);
                    if (c0300b1.m1123l(11)) {
                        bVar.f35901r = c0300b1.m1112a(11, false) ? 1 : 0;
                    } else {
                        bVar.f35901r = bVar.f35888e;
                    }
                    bVar.f35902s = c0300b1.m1112a(3, false);
                    bVar.f35903t = c0300b1.m1112a(4, bVar.f35889f);
                    bVar.f35904u = c0300b1.m1112a(1, bVar.f35890g);
                    bVar.f35905v = c0300b1.m1119h(21, -1);
                    bVar.f35908y = c0300b1.m1121j(12);
                    bVar.f35906w = c0300b1.m1120i(13, 0);
                    bVar.f35907x = c0300b1.m1121j(15);
                    String strM1121j3 = c0300b1.m1121j(14);
                    boolean z12 = strM1121j3 != null;
                    if (z12 && bVar.f35906w == 0 && bVar.f35907x == null) {
                        bVar.f35909z = (AbstractC10028b) bVar.m12605a(strM1121j3, f35871f, c6105f.f35873b);
                    } else {
                        if (z12) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        bVar.f35909z = null;
                    }
                    bVar.f35879A = c0300b1.m1122k(17);
                    bVar.f35880B = c0300b1.m1122k(22);
                    if (c0300b1.m1123l(19)) {
                        bVar.f35882D = C0311f0.m1188c(c0300b1.m1119h(19, -1), bVar.f35882D);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        bVar.f35882D = null;
                    }
                    if (c0300b1.m1123l(18)) {
                        bVar.f35881C = c0300b1.m1113b(18);
                    } else {
                        bVar.f35881C = colorStateList;
                    }
                    c0300b1.m1124n();
                    bVar.f35891h = false;
                } else if (name3.equals("menu")) {
                    bVar.f35891h = true;
                    SubMenu subMenuAddSubMenu = menu2.addSubMenu(bVar.f35885b, bVar.f35892i, bVar.f35893j, bVar.f35894k);
                    bVar.m12606b(subMenuAddSubMenu.getItem());
                    m12604b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                } else {
                    str = name3;
                    z11 = true;
                }
            }
            eventType = xmlResourceParser.next();
            i10 = 2;
            z10 = z10;
            z11 = z11;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i10, Menu menu) {
        if (!(menu instanceof InterfaceMenuC8724a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                layout = this.f35874c.getResources().getLayout(i10);
                m12604b(layout, Xml.asAttributeSet(layout), menu);
                layout.close();
            } catch (IOException e10) {
                throw new InflateException("Error inflating menu XML", e10);
            } catch (XmlPullParserException e11) {
                throw new InflateException("Error inflating menu XML", e11);
            }
        } catch (Throwable th2) {
            if (layout != null) {
                layout.close();
            }
            throw th2;
        }
    }
}
