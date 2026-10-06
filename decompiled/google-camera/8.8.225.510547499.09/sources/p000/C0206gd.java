package p000;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.wear.ambient.AmbientDelegate;
import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: gd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0206gd extends MenuInflater {

    /* JADX INFO: renamed from: a */
    static final Class[] f24254a;

    /* JADX INFO: renamed from: b */
    static final Class[] f24255b;

    /* JADX INFO: renamed from: c */
    final Object[] f24256c;

    /* JADX INFO: renamed from: d */
    final Object[] f24257d;

    /* JADX INFO: renamed from: e */
    final Context f24258e;

    /* JADX INFO: renamed from: f */
    public Object f24259f;

    static {
        Class[] clsArr = {Context.class};
        f24254a = clsArr;
        f24255b = clsArr;
    }

    public C0206gd(Context context) {
        super(context);
        this.f24258e = context;
        Object[] objArr = {context};
        this.f24256c = objArr;
        this.f24257d = objArr;
    }

    /* JADX INFO: renamed from: b */
    private final void m9067b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        C0205gc c0205gc = new C0205gc(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(String.valueOf(name)));
                }
                eventType = xmlPullParser.next();
                break;
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            switch (eventType) {
                case 1:
                    throw new RuntimeException("Unexpected end of document");
                case 2:
                    if (!z2) {
                        String name2 = xmlPullParser.getName();
                        if (name2.equals("group")) {
                            TypedArray typedArrayObtainStyledAttributes = c0205gc.f24159F.f24258e.obtainStyledAttributes(attributeSet, C0193fr.f23272p);
                            c0205gc.f24161b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                            c0205gc.f24162c = typedArrayObtainStyledAttributes.getInt(3, 0);
                            c0205gc.f24163d = typedArrayObtainStyledAttributes.getInt(4, 0);
                            c0205gc.f24164e = typedArrayObtainStyledAttributes.getInt(5, 0);
                            c0205gc.f24165f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                            c0205gc.f24166g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                            typedArrayObtainStyledAttributes.recycle();
                        } else if (name2.equals("item")) {
                            AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(c0205gc.f24159F.f24258e, attributeSet, C0193fr.f23273q);
                            c0205gc.f24168i = ambientDelegateM1567C.m1616s(2, 0);
                            c0205gc.f24169j = (ambientDelegateM1567C.m1613p(5, c0205gc.f24162c) & (-65536)) | ((char) ambientDelegateM1567C.m1613p(6, c0205gc.f24163d));
                            c0205gc.f24170k = ambientDelegateM1567C.m1620w(7);
                            c0205gc.f24171l = ambientDelegateM1567C.m1620w(8);
                            c0205gc.f24172m = ambientDelegateM1567C.m1616s(0, 0);
                            c0205gc.f24173n = C0205gc.m9044e(ambientDelegateM1567C.m1621x(9));
                            c0205gc.f24174o = ambientDelegateM1567C.m1613p(16, 4096);
                            c0205gc.f24175p = C0205gc.m9044e(ambientDelegateM1567C.m1621x(10));
                            c0205gc.f24176q = ambientDelegateM1567C.m1613p(20, 4096);
                            if (ambientDelegateM1567C.m1575A(11)) {
                                c0205gc.f24177r = ambientDelegateM1567C.m1623z(11, false) ? 1 : 0;
                            } else {
                                c0205gc.f24177r = c0205gc.f24164e;
                            }
                            c0205gc.f24178s = ambientDelegateM1567C.m1623z(3, false);
                            c0205gc.f24179t = ambientDelegateM1567C.m1623z(4, c0205gc.f24165f);
                            c0205gc.f24180u = ambientDelegateM1567C.m1623z(1, c0205gc.f24166g);
                            c0205gc.f24181v = ambientDelegateM1567C.m1613p(21, -1);
                            c0205gc.f24185z = ambientDelegateM1567C.m1621x(12);
                            c0205gc.f24182w = ambientDelegateM1567C.m1616s(13, 0);
                            c0205gc.f24183x = ambientDelegateM1567C.m1621x(15);
                            c0205gc.f24184y = ambientDelegateM1567C.m1621x(14);
                            String str2 = c0205gc.f24184y;
                            if (str2 == null) {
                                c0205gc.f24154A = null;
                            } else if (c0205gc.f24182w == 0 && c0205gc.f24183x == null) {
                                c0205gc.f24154A = (aej) c0205gc.m9046b(str2, f24255b, c0205gc.f24159F.f24257d);
                            } else {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                c0205gc.f24154A = null;
                            }
                            c0205gc.f24155B = ambientDelegateM1567C.m1620w(17);
                            c0205gc.f24156C = ambientDelegateM1567C.m1620w(22);
                            if (ambientDelegateM1567C.m1575A(19)) {
                                c0205gc.f24158E = C0768kh.m14230a(ambientDelegateM1567C.m1613p(19, -1), c0205gc.f24158E);
                            } else {
                                c0205gc.f24158E = null;
                            }
                            if (ambientDelegateM1567C.m1575A(18)) {
                                c0205gc.f24157D = ambientDelegateM1567C.m1617t(18);
                            } else {
                                c0205gc.f24157D = null;
                            }
                            ambientDelegateM1567C.m1622y();
                            c0205gc.f24167h = false;
                        } else if (!name2.equals("menu")) {
                            str = name2;
                            z2 = true;
                        } else {
                            m9067b(xmlPullParser, attributeSet, c0205gc.m9045a());
                        }
                    }
                    break;
                case 3:
                    String name3 = xmlPullParser.getName();
                    if (z2 && name3.equals(str)) {
                        z2 = false;
                        str = null;
                    } else if (name3.equals("group")) {
                        c0205gc.m9047c();
                    } else if (!name3.equals("item")) {
                        if (name3.equals("menu")) {
                            z = true;
                        }
                    } else if (!c0205gc.f24167h) {
                        aej aejVar = c0205gc.f24154A;
                        if (aejVar != null && aejVar.mo336c()) {
                            c0205gc.m9045a();
                        } else {
                            c0205gc.f24167h = true;
                            c0205gc.m9048d(c0205gc.f24160a.add(c0205gc.f24161b, c0205gc.f24168i, c0205gc.f24169j, c0205gc.f24170k));
                        }
                    }
                    break;
            }
            eventType = xmlPullParser.next();
        }
    }

    /* JADX INFO: renamed from: a */
    public final Object m9068a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m9068a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0036  */
    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) throws Throwable {
        String str = BcwGDRhrTsnlj.bEwTlJxlcGdNYSr;
        if (!(menu instanceof adc)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                XmlResourceParser layout = this.f24258e.getResources().getLayout(i);
                try {
                    m9067b(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (IOException e) {
                    e = e;
                    throw new InflateException(str, e);
                } catch (XmlPullParserException e2) {
                    e = e2;
                    throw new InflateException(str, e);
                }
            } catch (Throwable th) {
                th = th;
                if (0 != 0) {
                    xmlResourceParser.close();
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
